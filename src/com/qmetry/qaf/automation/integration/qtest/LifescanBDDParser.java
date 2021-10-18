package com.qmetry.qaf.automation.integration.qtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;
import com.qmetry.qaf.automation.core.AutomationError;
import com.qmetry.qaf.automation.step.TestStep;
import com.qmetry.qaf.automation.step.client.AbstractScenarioFileParser;
import com.qmetry.qaf.automation.step.client.DataDrivenScenario;
import com.qmetry.qaf.automation.step.client.Scenario;
import com.qmetry.qaf.automation.step.client.text.BehaviorScanner;
import com.qmetry.qaf.automation.util.FileUtil;
import com.qmetry.qaf.automation.util.StringUtil;

public class LifescanBDDParser extends AbstractScenarioFileParser {

	private final static Log logger = LogFactory.getLog(BehaviorScanner.class);
	private static final String LINE_BREAK = "_&";
	private static final String COMMENT_CHARS = "#!";
	private static final String BACKGROUND = "Background";
	
	private List<String> includeGroups = new ArrayList<String>();
	private List<String> excludeGroups = new ArrayList<String>();
	private Gson gson = new Gson();
	static Map<String, List<String>> scenarioMap = new HashMap<String, List<String>>();

	@Override
	protected Collection<Object[]> parseFile(String strFile) {
		ArrayList<Object[]> rows = new ArrayList<Object[]>();
		ArrayList<Object[]> background = new ArrayList<Object[]>();

		File textFile;
		int lineNo = 0;
		int lastScenarioIndex = -1;

		BufferedReader br = null;
		try {

			logger.info("loading BDD file: " + strFile);
			textFile = new File(strFile);
			br = new BufferedReader(new FileReader(textFile));
			String strLine = "";
			boolean bIsBackground = false;
			// file line by line
			// exclude blank lines and comments
			StringBuffer currLineBuffer = new StringBuffer();
			while ((strLine = br.readLine()) != null) {
				// record line number
				lineNo++;
				/**
				 * ignore if line is empty or comment line
				 */
				if (!("".equalsIgnoreCase(strLine.trim())
						|| COMMENT_CHARS.contains("" + strLine.trim().charAt(0)))) {
					currLineBuffer.append((strLine.trim()));

					if (strLine.endsWith(LINE_BREAK)) {
						/*
						 * Statement not completed. Remove line break character
						 * and continue statement reading from next line
						 */
						currLineBuffer.delete(
								currLineBuffer.length() - LINE_BREAK.length(),
								currLineBuffer.length());

					} else {
						// process single statement
						Object[] cols = new Object[]{"", "", "", lineNo};
						String currLine = currLineBuffer.toString();
						if ((StringUtil.indexOfIgnoreCase(currLine, SCENARIO) == 0)
								|| (StringUtil.indexOfIgnoreCase(currLine,
										BACKGROUND) == 0)
								|| (StringUtil.indexOfIgnoreCase(currLine, STEP_DEF) == 0)
								|| (StringUtil.indexOfIgnoreCase(currLine,
										"META") == 0)) {

							System.arraycopy(currLine.split(":", 2), 0, cols, 0, 2);

							// append meta-data in last/scenario statement
							if (StringUtil.indexOfIgnoreCase(((String) cols[0]).trim(),
									"META") == 0) {
								Object[] prevRow = rows.get(lastScenarioIndex);
								prevRow[2] = ((String) cols[1]).trim();
								currLineBuffer = new StringBuffer();
								continue;
							} else if (StringUtil.indexOfIgnoreCase(currLine,
									BACKGROUND) == 0) {
								bIsBackground = true;
								currLineBuffer = new StringBuffer();
								continue;
							} else {
								lastScenarioIndex = rows.size();// step or scenario
								bIsBackground = false;
							}
						} else {
							// this is a statement
							cols[0] = currLine;
						}
						if (bIsBackground) {
							background.add(cols);
						} else {
							if (lastScenarioIndex >= 0)
								rows.add(cols);
							if (StringUtil.indexOfIgnoreCase((String) cols[0],
									SCENARIO) == 0) {
								rows.addAll(background);
							}
						}
						currLineBuffer = new StringBuffer();
					}
				}
			}
		} catch (Exception e) {
			String strMsg = "Exception while reading BDD file: " + strFile + "#" + lineNo;
			logger.error(strMsg + e);
			throw new AutomationError(strMsg, e);

		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		return rows;
	}

	protected void processStatements(Object[][] statements, String referece,
			List<Scenario> scenarios) {

		for (int statementIndex =
				0; statementIndex < statements.length; statementIndex++) {

			String type = ((String) statements[statementIndex][0]).trim();
			String scenarioName = ((String) statements[statementIndex][1]).trim();

			// ignore blanks and statements outside scenario or step-def
			if (StringUtil.isBlank(type) || type.equalsIgnoreCase(TEST_DATA)
					|| !(type.equalsIgnoreCase(STEP_DEF)
							|| type.equalsIgnoreCase(SCENARIO)
							|| type.equalsIgnoreCase(END))) {
				String nextSteptype = "";
				do {
					statementIndex++;
					if (statements.length > (statementIndex + 2)) {
						nextSteptype =
								((String) statements[statementIndex + 1][0]).trim();
					} else {
						nextSteptype = END; //
					}
				} while (!(nextSteptype.equalsIgnoreCase(STEP_DEF)
						|| nextSteptype.equalsIgnoreCase(SCENARIO)
						|| nextSteptype.equalsIgnoreCase(END)));
			}

			// Custom step definition
			if (type.equalsIgnoreCase(STEP_DEF)) {
				statementIndex = parseStepDef(statements, statementIndex, referece);
			} else if (type.equalsIgnoreCase(SCENARIO)) {
				List<String> scenarioStatements = parseScenarioForQTest(statements,
						statementIndex, referece, scenarios);
				if (scenarioStatements != null && !scenarioStatements.isEmpty()) {
					scenarioMap.put(scenarioName, scenarioStatements);
				}
			}
		}

	}

	@SuppressWarnings("unchecked")
	protected List<String> parseScenarioForQTest(Object[][] statements,
			int statementIndex, String referece, List<Scenario> scenarios) {
		List<String> scenarioStatements = new ArrayList<String>();
		String description = statements[statementIndex].length > 2
				? (String) statements[statementIndex][2] : "";
		String stepName = statements[statementIndex].length > 1
				? ((String) statements[statementIndex][1]).trim() : "";
		int lineNo = getLineNum(statements, statementIndex);
		boolean isScenarioToAdd = false;
		// collect all steps of scenario
		Collection<TestStep> steps = new ArrayList<TestStep>();

		Map<String, Object> metadata =
				new TreeMap<String, Object>(String.CASE_INSENSITIVE_ORDER);
		if (StringUtil.isNotBlank(description)) {
			metadata.putAll(gson.fromJson(description, Map.class));
		}
		metadata.put("referece", referece);
		metadata.put("lineNo", lineNo);

		if (!metadata.containsKey("testCaseId") || metadata.get("testCaseId") == null
				|| metadata.get("testCaseId").toString().isEmpty()) {
			isScenarioToAdd = true;
		}

		/**
		 * check enabled flag in meta-data and apply groups filter if configured
		 * in xml configuration file. the custom meta-data filter will covered
		 * in method filter where it will not include groups from xml
		 * configuration file.
		 */
		if (include(includeGroups, excludeGroups, metadata)) {
			String dataProvider = getDP(metadata);
			Scenario scenario = StringUtil.isBlank(dataProvider)
					? new Scenario(stepName, steps, metadata)
					: new DataDrivenScenario(stepName, steps, dataProvider, metadata);

			scenarios.add(scenario);
		} else {
			logger.debug(
					"Excluded SCENARIO - " + stepName + ":" + metadata.get(DESCRIPTION));
		}
		String nextSteptype = "";
		if (isScenarioToAdd) {
			do {
				statementIndex++;
				lineNo = getLineNum(statements, statementIndex);
				String currStepName = (String) statements[statementIndex][0];

				if (!currStepName.equalsIgnoreCase(END)) {
					TestStep step =
							parseStepCall(statements[statementIndex], referece, lineNo);
					steps.add(step);
				}
				scenarioStatements.add(currStepName);

				if (statements.length > (statementIndex + 2)) {
					nextSteptype = ((String) statements[statementIndex + 1][0]).trim();
				} else {
					nextSteptype = END; // EOF
				}
			} while (!(nextSteptype.equalsIgnoreCase(STEP_DEF)
					|| nextSteptype.equalsIgnoreCase(SCENARIO)
					|| nextSteptype.equalsIgnoreCase(END)
					|| nextSteptype.equalsIgnoreCase(TEST_DATA)));
		} else {
			logger.info("Scenario is already created in qTest. Scenario Id is ::: "
					+ metadata.get("testCaseId"));
		}
		return scenarioStatements;

	}

	private int getLineNum(Object[][] statements, int statementIndex) {
		try {
			return (statements[statementIndex].length > 3
					&& null != statements[statementIndex][3]
							? (Integer) statements[statementIndex][3] : statementIndex);
		} catch (Exception e) {// not a number???...
			return statementIndex;
		}
	}

	public static void main(String[] args) {
		LifescanBDDParser bddParser = new LifescanBDDParser();
		String scenarioFile = "scenarios";
		bddParser.parseScenarioFileOrDir(scenarioFile);
	}

	public Map<String, List<String>> parseScenarioFileOrDir(String scenarioFileOrDir) {
		File fileOrDir = new File(scenarioFileOrDir);
		if (fileOrDir.exists()) {
			if (fileOrDir.isDirectory()) {
				File[] listOfFiles = fileOrDir.listFiles();
				for (int i = 0; i < listOfFiles.length; i++) {
					if (listOfFiles[i].isFile()) {
						String scenarioFileName = listOfFiles[i].getAbsolutePath();
						parseScenarioFile(scenarioFileName);
					} else if (listOfFiles[i].isDirectory()) {
						parseScenarioFileOrDir(listOfFiles[i].getAbsolutePath());
					}
				}
			} else {
				String scenarioFileName = fileOrDir.getAbsolutePath();
				parseScenarioFile(scenarioFileName);
			}
		} else {
			logger.error("File or Dir path does not exist");
		}
		
		return scenarioMap;
	}

	public void parseScenarioFile(String scenarioFileName) {
		LifescanBDDParser bddParser = new LifescanBDDParser();
		Collection<Object[]> statements1 =
				(ArrayList<Object[]>) bddParser.parseFile(scenarioFileName);
		String reference = FileUtil.getRelativePath(scenarioFileName, "./");
		bddParser.processStatements(statements1.toArray(new Object[0][0]), reference,
				new ArrayList<Scenario>());
	}
}
