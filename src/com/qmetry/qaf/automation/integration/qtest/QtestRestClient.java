/*************************************************************************
 * InfoStretch Corporation ("InfoStretch") CONFIDENTIAL
 * � 2012-2015 InfoStretch, All Rights Reserved. All Rights Reserved.
 * NOTICE: All information contained herein is, and remains the property of
 * InfoStretch.
 * The intellectual and technical concepts contained herein are proprietary to
 * InfoStretch and may be covered by U.S. and Foreign Patents, patents in
 * process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material is
 * strictly forbidden unless prior written permission is obtained from
 * InfoStretch.
 * Access to the source code contained herein is hereby forbidden to anyone
 * except current InfoStretch employees, managers, or contractors who have
 * executed Confidentiality and Non-disclosure agreements explicitly covering
 * such access.
 * The copyright notice above does not evidence any actual or intended
 * publication or disclosure of this source code, which includes information
 * that is confidential and/or proprietary, and is a trade secret, of
 * InfoStretch.
 * ANY REPRODUCTION, MODIFICATION, DISTRIBUTION, PUBLIC PERFORMANCE,
 * OR PUBLIC DISPLAY OF OR THROUGH USE OF THIS SOURCE CODE WITHOUT THE EXPRESS
 * WRITTEN CONSENT OF InfoStretch IS STRICTLY PROHIBITED, AND IN VIOLATION OF
 * APPLICABLE LAWS AND INTERNATIONAL TREATIES.
 * THE RECEIPT OR POSSESSION OF THIS SOURCE CODE AND/OR RELATED INFORMATION DOES
 * NOT CONVEY OR IMPLY ANY RIGHTS TO REPRODUCE, DISCLOSE, OR DISTRIBUTE ITS
 * CONTENTS, OR TO MANUFACTURE, USE, OR SELL ANYTHING THAT IT MAY DESCRIBE, IN
 * WHOLE OR IN PART.
 **********************************************************/

package com.qmetry.qaf.automation.integration.qtest;

import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xpath.domapi.XPathEvaluatorImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.qas.api.internal.util.google.io.BaseEncoding;
import org.qas.qtest.api.auth.PropertiesQTestCredentials;
import org.qas.qtest.api.auth.QTestCredentials;
import org.qas.qtest.api.services.attachment.model.Attachment;
import org.qas.qtest.api.services.design.TestDesignServiceClient;
import org.qas.qtest.api.services.design.model.AutomationTestCase;
import org.qas.qtest.api.services.design.model.CreateAutomationTestCaseRequest;
import org.qas.qtest.api.services.design.model.CreateTestStepRequest;
import org.qas.qtest.api.services.design.model.TestStep;
import org.qas.qtest.api.services.execution.TestExecutionServiceClient;
import org.qas.qtest.api.services.execution.model.AutomationTestLog;
import org.qas.qtest.api.services.execution.model.AutomationTestLogRequest;
import org.qas.qtest.api.services.execution.model.AutomationTestStepLog;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.xpath.XPathEvaluator;
import org.w3c.dom.xpath.XPathResult;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.util.StringUtil;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

/**
 * @author bhumi.panchal
 */
public class QtestRestClient implements QTestIntegrationProperties {

	private Client client;

	private static class SingletonHolder {

		public static final QtestRestClient INSTANCE = new QtestRestClient();
	}

	private QtestRestClient() {
		client = Client.create();
	}

	public static QtestRestClient getInstance() {
		return SingletonHolder.INSTANCE;
	}

	public static ArrayList<StepsInfo> getSteps(String details) {
		details = details.replaceAll("&", "&amp;");
		ArrayList<StepsInfo> steps = new ArrayList<StepsInfo>();
		int fail =
				ConfigurationManager.getBundle().getInt(QTEST_FAILURE_ATTACH_SS_STR, 1);
		int pass =
				ConfigurationManager.getBundle().getInt(QTEST_SUCCESS_ATTACH_SS_STR, 0);

		String expression = "//div//a[text()[contains(.,'Screenshot')]]";
		if (pass == 0 && fail == 0) {
			expression = "";
		}
		if (pass == 1 && fail == 0) {
			expression =
					"//div[contains(@class,'pass') or contains(@class,'info')]//a[text()[contains(.,'Screenshot')]]";
		} else if (pass == 0 && fail == 1) {
			expression =
					"//div[contains(@class,'fail')]//a[text()[contains(.,'Screenshot')]]";
		}

		if (StringUtil.isNotBlank(expression))
			expression = expression
					+ "|//div[@class='fail']|//div[@class='pass']|//div[contains(@class,'teststep')]";
		else {
			expression =
					"//div[@class='fail']|//div[@class='pass']|//div[contains(@class,'teststep')]";
		}
		String str = "<root>" + details + "</root>";
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document xmlDocument =
					builder.parse(new ByteArrayInputStream(str.getBytes()));

			XPathEvaluator evaluator = new XPathEvaluatorImpl(xmlDocument);
			Object o = evaluator.evaluate(expression, xmlDocument,
					evaluator.createNSResolver(xmlDocument),
					XPathResult.ORDERED_NODE_ITERATOR_TYPE, null);
			if (o != null) {
				if (o instanceof XPathResult) {
					XPathResult xpResult = (XPathResult) o;
					Node node = xpResult.iterateNext();
					while (node != null) {
						StepsInfo stepObj = QtestRestClient.getInstance().new StepsInfo();
						stepObj.setStepName(
								node.getTextContent().split(" ", 2)[1].trim());

						if (node.getTextContent().split(" ", 2)[0].contains("P")) {
							stepObj.setStepResult(RESULT_PASSED);
							stepObj.setStepType(STEP_CHECKPOINT);
						} else if (node.getTextContent().split(" ", 2)[0].contains("F")) {
							stepObj.setStepResult(RESULT_FAILED);
							stepObj.setStepType(STEP_CHECKPOINT);
						} else if (node.getTextContent().split(" ", 2)[0].contains("T")) {
							stepObj.setStepResult(STEP_NA);
							stepObj.setStepType(STEP_TEST);
						}
						if (node.getAttributes().getNamedItem(CLASS_STR) != null) {
							if (node.getAttributes().getNamedItem(CLASS_STR)
									.getNodeValue().contains(CLASS_PASS)) {
								stepObj.setStepResult(RESULT_PASSED);
							} else if (node.getAttributes().getNamedItem(CLASS_STR)
									.getNodeValue().contains(CLASS_FAIL)) {
								stepObj.setStepResult(RESULT_FAILED);
							}
						}

						if (node.getTextContent().contains(SCREENSHOT_STR)) {
							if (StringUtil.isNotBlank(stepObj.getStepResult())
									&& ((stepObj.getStepResult().contains("F")
											&& fail == 1)
											|| (stepObj.getStepResult().contains("P")
													&& pass == 1)))
								try {
									String attachmentPath =
											xpResult.iterateNext().getAttributes()
													.getNamedItem(REPORT_NODE_HREF)
													.getNodeValue();
									stepObj.setAttachment(attachmentPath);
								} catch (Exception e) {
									e.printStackTrace();
								}

						}
						if (StringUtil.isNotBlank(stepObj.getStepResult()))
							steps.add(stepObj);
						node = xpResult.iterateNext();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return steps;
	}

	public Long createTestCaseAndTestStep(Long projectId,
			Map<String, ? extends Object> params, String details, String endPointURL)
			throws IOException {

		QTestCredentials credentials = new PropertiesQTestCredentials(
				QtestRestClient.class.getResourceAsStream(QTEST_CREDENTIAL));

		TestDesignServiceClient testDesignService =
				new TestDesignServiceClient(credentials);
		testDesignService.setEndpoint(endPointURL);

		String scenarioName = params.get(RESPONSE_NAME).toString();
		String tcName = AUTOMATION_CONTENT_STR + System.currentTimeMillis();

		AutomationTestCase autoTestCase =
				(AutomationTestCase) new AutomationTestCase().withName(scenarioName)
						.withDescription(params.get(REPORT_DESCRIPTION).toString());
		autoTestCase.setAutomationContent(tcName);

		CreateAutomationTestCaseRequest automationTestCaseRequest =
				new CreateAutomationTestCaseRequest().withProjectId(projectId)
						.withAutomationTestCase(autoTestCase);

		AutomationTestCase automationTestCase =
				testDesignService.createAutomationTestCase(automationTestCaseRequest);

		ArrayList<StepsInfo> detailsSet = getSteps(details);
		Iterator<StepsInfo> iter = detailsSet.iterator();
		String stepdsr = "";
		String stepType = "";

		while (iter.hasNext()) {
			StepsInfo stepsInfo = iter.next();
			stepType = stepsInfo.getStepType().toString();
			String[] expectedResult = null;
			if (stepType.equalsIgnoreCase(STEP_TEST)) {
				stepdsr = stepsInfo.getStepName().toString();
				if (stepdsr.startsWith(TESTSTEP_GIVEN)
						|| stepdsr.startsWith(TESTSTEP_WHEN)
						|| stepdsr.startsWith(TESTSTEP_THEN)
						|| stepdsr.startsWith(TESTSTEP_AND)) {
					expectedResult = stepdsr.split(" ", 2);
				}

				TestStep testStep = new TestStep().withDescription(expectedResult[1])
						.setExpected(expectedResult[1]);

				CreateTestStepRequest createTestStepRequest =
						new CreateTestStepRequest().withProjectId(projectId)
								.withTestCaseId(automationTestCase.getId())
								.withTestStep(testStep);

				testDesignService.createTestStep(createTestStepRequest);
			}
		}

		// TODO: Create file to add Test Case Name and Test Case Id
		Long testCaseId = automationTestCase.getId();
		String storeData =
				SCENARIO_NAME_FILE + scenarioName + SCENARIO_ID_FILE + testCaseId;
		File resultDir = new File(getBundle().getString(SS_DIR_PATH, ATTACH_IMG_PATH));
		String testCaseIdFileName = "TestCaseId_" + resultDir.toString().split("\\\\")[1];
		String absoluteFilename =
				new File(testCaseIdFileName).getAbsolutePath().split("\\.")[0];
		storeDataInTextFile(storeData, absoluteFilename);
		return testCaseId;
	}

	@SuppressWarnings("unchecked")
	public boolean createTestCaseAndTestStepFromBDD(Long projectId,
			Map<String, ? extends Object> params, String endPointURL) throws IOException {

		try {
			QTestCredentials credentials = new PropertiesQTestCredentials(
					QtestRestClient.class.getResourceAsStream(QTEST_CREDENTIAL));

			TestDesignServiceClient testDesignService =
					new TestDesignServiceClient(credentials);
			testDesignService.setEndpoint(endPointURL);

			Map<String, Long> scenarioNameId = new HashMap<String, Long>();
			Map<String, List<String>> scenarioListMap =
					(HashMap<String, List<String>>) params;
			Set<String> scenarioNameKeySet = scenarioListMap.keySet();
			Iterator<String> iter = scenarioNameKeySet.iterator();

			while (iter.hasNext()) {

				String scenarioName = iter.next();
				String tcName = AUTOMATION_CONTENT_STR + System.currentTimeMillis();

				AutomationTestCase autoTestCase =
						(AutomationTestCase) new AutomationTestCase()
								.withName(scenarioName);
				autoTestCase.setAutomationContent(tcName);
				autoTestCase.withDescription(scenarioName);

				CreateAutomationTestCaseRequest automationTestCaseRequest =
						new CreateAutomationTestCaseRequest().withProjectId(projectId)
								.withAutomationTestCase(autoTestCase);

				AutomationTestCase automationTestCase = testDesignService
						.createAutomationTestCase(automationTestCaseRequest);

				List<String> scenarioSteps = scenarioListMap.get(scenarioName);
				String expectedResult[] = null;

				for (int i = 0; i < scenarioSteps.size(); i++) {
					String stepsDesc = scenarioSteps.get(i);
					if (stepsDesc.startsWith(TESTSTEP_GIVEN)
							|| stepsDesc.startsWith(TESTSTEP_WHEN)
							|| stepsDesc.startsWith(TESTSTEP_THEN)
							|| stepsDesc.startsWith(TESTSTEP_AND)) {
						expectedResult = stepsDesc.split(" ", 2);
					}

					TestStep testStep = new TestStep().withDescription(expectedResult[1])
							.setExpected(expectedResult[1]);

					CreateTestStepRequest createTestStepRequest =
							new CreateTestStepRequest().withProjectId(projectId)
									.withTestCaseId(automationTestCase.getId())
									.withTestStep(testStep);

					testDesignService.createTestStep(createTestStepRequest);
				}
				Long testCaseId = automationTestCase.getId();
				scenarioNameId.put(scenarioName, testCaseId);
			}

			// TODO: Create file to add Test Case Name and Test Case Id
			File qTestDir = new File(System.getProperty("user.dir") + "//qTestIds//");
			if (!qTestDir.exists()) {
				try {
					qTestDir.mkdir();
				} catch (SecurityException se) {
					se.printStackTrace();
				}
			}
			if (scenarioNameId != null && !scenarioNameId.isEmpty()) {
				Set<String> scenarioNameSet = scenarioNameId.keySet();
				Iterator<String> iter1 = scenarioNameSet.iterator();
				while (iter1.hasNext()) {
					String sName = iter1.next();
					String storeData = SCENARIO_NAME_FILE + sName + SCENARIO_ID_FILE
							+ scenarioNameId.get(sName);

					Calendar calendar = Calendar.getInstance();
					calendar.setTimeInMillis(System.currentTimeMillis());
					String fileNameTime = calendar.get(Calendar.YEAR) + "_"
							+ calendar.get(Calendar.MONTH) + "_"
							+ calendar.get(Calendar.DATE) + "_"
							+ calendar.get(Calendar.HOUR) + "_"
							+ calendar.get(Calendar.MINUTE) + "_"
							+ calendar.get(Calendar.SECOND);

					String testCaseIdFileName = "TestCaseId_" + fileNameTime;
					String absoluteFilename =
							new File(qTestDir + "//" + testCaseIdFileName)
									.getAbsolutePath().split("\\.")[0];
					storeDataInTextFile(storeData, absoluteFilename);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public void storeDataInTextFile(String data, String absoluteFilename) {
		try (FileWriter fw = new FileWriter(absoluteFilename + ".txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<List<Attachment>> getAttachmentsNew(
			ArrayList<StepsInfo> detailsSet) throws IOException {
		Iterator<StepsInfo> iter = detailsSet.iterator();
		int count = 0;
		ArrayList<List<Attachment>> listsOfListAttachments =
				new ArrayList<List<Attachment>>();
		List<Attachment> stepAttachmentList = new ArrayList<Attachment>();
		Attachment failedScreenshot = new Attachment();
		boolean isFailedTestStep = false;
		int stepCount = 0;
		int failedStepNumber = 0;
		while (iter.hasNext()) {
			StepsInfo stepsInfo = iter.next();
			String stepType = stepsInfo.getStepType().toString();
			if (stepType.equalsIgnoreCase(STEP_TEST)) {
				if (StringUtil.isNotEmpty(stepsInfo.getAttachment())
						&& !stepsInfo.getStepResult().equalsIgnoreCase(RESULT_FAILED)) {
					File file = new File(stepsInfo.getAttachment());
					File resultDir =
							new File(getBundle().getString(SS_DIR_PATH, ATTACH_IMG_PATH));
					file = new File(resultDir, file.getName());
					Attachment attachment =
							new Attachment().withData(new FileInputStream(file))
									.withName(file.getName()).withContentType(CONTENT_IMG)
									.withId(new Random(99999999).nextLong());
					stepAttachmentList.add(attachment);
				}
				if (stepsInfo.getStepResult().equalsIgnoreCase(RESULT_FAILED)) {
					if (StringUtil.isNotEmpty(stepsInfo.getAttachment())) {
						File file = new File(stepsInfo.getAttachment());
						File resultDir = new File(
								getBundle().getString(SS_DIR_PATH, ATTACH_IMG_PATH));
						file = new File(resultDir, file.getName());
						failedScreenshot = new Attachment()
								.withData(new FileInputStream(file))
								.withName(file.getName()).withContentType(CONTENT_IMG);
						isFailedTestStep = true;
						failedStepNumber = stepCount;
					}
				}
				if (count > 0) {
					listsOfListAttachments
							.add(new ArrayList<Attachment>(stepAttachmentList));
					count = 0;
				}
				if (!stepsInfo.getStepResult().equalsIgnoreCase(STEP_NA)) {
					stepCount++;
				}
				stepAttachmentList.clear();
			} else {
				if (StringUtil.isNotEmpty(stepsInfo.getAttachment())) {
					File file = new File(stepsInfo.getAttachment());
					File resultDir =
							new File(getBundle().getString(SS_DIR_PATH, ATTACH_IMG_PATH));
					file = new File(resultDir, file.getName());
					Attachment attachment = new Attachment()
							.withData(new FileInputStream(file)).withName(file.getName())
							.withContentType(CONTENT_IMG);
					stepAttachmentList.add(attachment);
				}
			}
			count++;
		}
		listsOfListAttachments.add(stepAttachmentList);
		if (isFailedTestStep) {
			listsOfListAttachments.get(failedStepNumber).add(failedScreenshot);
			isFailedTestStep = false;
		}
		return listsOfListAttachments;
	}

	public HashMap<Integer, Attachment> getTextFiles(ArrayList<StepsInfo> detailsSet,
			Map<String, ? extends Object> params) throws IOException {

		String scenarioName = params.get(RESPONSE_NAME).toString();
		HashMap<Integer, Attachment> textFilesMap = new HashMap<Integer, Attachment>();
		Iterator<StepsInfo> iter = detailsSet.iterator();
		int count = 0;
		while (iter.hasNext()) {
			StepsInfo stepsInfo = iter.next();
			String stepType = stepsInfo.getStepType().toString();
			if (stepType.equalsIgnoreCase(STEP_TEST)) {
				String currentTestStepDesc = stepsInfo.getStepName();
				currentTestStepDesc =
						currentTestStepDesc.replaceAll("[*:,/\\?\"<>|]", "");
				String url = "\\" + scenarioName + "\\" + currentTestStepDesc + "_"
						+ (count) + ".txt";
				File file = new File(
						getBundle().getString(SS_DIR_PATH, ATTACH_IMG_PATH) + url);
				if (file.exists()) {
					Attachment attachment = new Attachment()
							.withData(new FileInputStream(file)).withName(file.getName())
							.withContentType(CONTENT_TEXT)
							.withId(new Random(99999999).nextLong());
					textFilesMap.put(count + 1, attachment);
				}
				count++;
			}
		}
		return textFilesMap;
	}

	public static ArrayList<List<String>> getActualResultNew(
			ArrayList<StepsInfo> detailsSet) throws IOException {
		Iterator<StepsInfo> iter = detailsSet.iterator();
		ArrayList<List<String>> listsOfListActualResult = new ArrayList<List<String>>();
		List<String> actualResult = new ArrayList<String>();
		int count = 0;
		while (iter.hasNext()) {
			StepsInfo stepsInfo = iter.next();
			String stepType = stepsInfo.getStepType().toString();

			if (stepType.equalsIgnoreCase(STEP_TEST)) {
				if (count > 0) {
					listsOfListActualResult.add(new ArrayList<String>(actualResult));
					count = 0;
				}
				actualResult.clear();
			} else {
				String stepdsr = stepsInfo.getStepName().toString();
				if (stepdsr.startsWith(TESTSTEP_GIVEN)
						|| stepdsr.startsWith(TESTSTEP_WHEN)
						|| stepdsr.startsWith(TESTSTEP_THEN)
						|| stepdsr.startsWith(TESTSTEP_AND)) {
					stepdsr = stepdsr.split(" ", 2)[1];
				}
				stepdsr = stepdsr.replace(VIEW_SCREENSHOT_STR, "").trim();
				stepdsr = stepdsr.replace("]", "").trim();
				stepdsr = stepdsr.replace("[", "").trim();
				actualResult.add(stepdsr + "\n");
			}
			count++;
		}
		listsOfListActualResult.add(actualResult);
		return listsOfListActualResult;
	}

	@SuppressWarnings("unchecked")
	public void uploadResult(Map<String, ? extends Object> params, String details,
			Long projectId, String endPointURL, String result) throws IOException {

		List<AutomationTestStepLog> automationTestStepLogList =
				new ArrayList<AutomationTestStepLog>();
		QTestCredentials credentials = new PropertiesQTestCredentials(
				QtestRestClient.class.getResourceAsStream(QTEST_CREDENTIAL));

		TestExecutionServiceClient testExecutionService =
				new TestExecutionServiceClient(credentials);
		testExecutionService.setEndpoint(endPointURL);

		String testCaseId = (String) params.get(REPORT_TESTCASEID);
		String testCaseName = (String) params.get(RESPONSE_NAME);

		ArrayList<StepsInfo> detailsSet = getSteps(details);
		ArrayList<List<Attachment>> attachmentsLists = getAttachmentsNew(detailsSet);
		ArrayList<List<String>> actualResultLists = getActualResultNew(detailsSet);
		Iterator<StepsInfo> iter = detailsSet.iterator();
		String stepdsr = "";
		String stepType = "";
		String[] expectedResult = null;
		String actualResult = "";
		int count = 1;
		while (iter.hasNext()) {
			StepsInfo stepsInfo = iter.next();
			stepType = stepsInfo.getStepType().toString();
			if (stepType.equalsIgnoreCase(STEP_TEST)) {
				stepdsr = stepsInfo.getStepName().toString();
				String stepResult = stepsInfo.getStepResult().toString().trim();
				if (stepdsr.startsWith(TESTSTEP_GIVEN)
						|| stepdsr.startsWith(TESTSTEP_WHEN)
						|| stepdsr.startsWith(TESTSTEP_THEN)
						|| stepdsr.startsWith(TESTSTEP_AND)) {
					expectedResult = stepdsr.split(" ", 2);
				}

				switch (stepResult) {
					case RESULT_PASSED :
						actualResult = ACTUAL_RESULT_PASS;
						break;
					case RESULT_FAILED :
						actualResult = ACTUAL_RESULT_FAIL;
						break;
					case STEP_NA :
						actualResult = ACTUAL_RESULT_NA;
						break;
					default :
						actualResult = ACTUAL_RESULT_DEFAULT;
						break;
				}
				
				AutomationTestStepLog autoTestStepLog = null;
				if (stepResult.equals(STEP_NA)) {
					autoTestStepLog = new AutomationTestStepLog().withStatus(stepResult)
							.withExpected(
									expectedResult[1].replace(VIEW_SCREENSHOT_STR, ""))
							.withActualResult(actualResult)
							.withDescription(stepdsr.replace(VIEW_SCREENSHOT_STR, ""))
							.withOrder(count);
				} else {
					String actualResultStr = "";
					if (actualResultLists.get(count - 1) != null
							&& actualResultLists.get(count - 1).size() > 0) {
						actualResultStr = actualResultLists.get(count - 1).toString()
								.replace("]", "").trim().replace("[", "").trim();
					} else {
						actualResultStr = expectedResult[1].replace(VIEW_SCREENSHOT_STR, "");
					}

					autoTestStepLog = new AutomationTestStepLog().withStatus(stepResult)
							.withExpected(
									expectedResult[1].replace(VIEW_SCREENSHOT_STR, ""))
							.withActualResult(actualResultStr)
							.withDescription(stepdsr.replace(VIEW_SCREENSHOT_STR, ""))
							.withOrder(count);
				}
				automationTestStepLogList.add(autoTestStepLog);
				count++;
			}
		}

		AutomationTestLog automationTestLog = new AutomationTestLog()
				.withExecutionStartDate(new Date()).withExecutionEndDate(new Date())
				.withName(params.get(RESPONSE_NAME).toString()).withStatus(result)
				.withSystemName(SYSTEM_NAME_TESTNG).withAutomationContent(testCaseId)
				.withTestCaseId(Long.parseLong(testCaseId))
				.withTestStepLogs(automationTestStepLogList);

		AutomationTestLogRequest automationTestLogRequest = null;
		Long testRunId = null;
		Map<String, Long> testRunInfoMap =
				(HashMap<String, Long>) getBundle().getObject(PROPERTY_TESTRUNINFOMAP);
		if (null == testRunInfoMap || testRunInfoMap.isEmpty()) {
			automationTestLogRequest = new AutomationTestLogRequest()
					.withProjectId(projectId).withAutomationTestLog(automationTestLog);
		} else {
			testRunId = testRunInfoMap.get(testCaseName);
			if (null != testRunId) {
				automationTestLogRequest = new AutomationTestLogRequest()
						.withProjectId(projectId).withAutomationTestLog(automationTestLog)
						.withTestRunId(testRunId);
			} else {
				automationTestLogRequest =
						new AutomationTestLogRequest().withProjectId(projectId)
								.withAutomationTestLog(automationTestLog);
			}
		}
		testExecutionService.submitAutomationTestLog(automationTestLogRequest);

		if (null != testRunId)
			uploadAttachment(projectId, testRunId, attachmentsLists, detailsSet);
	}

	@SuppressWarnings("unchecked")
	public void uploadResultAPI(Map<String, ? extends Object> params, String details,
			Long projectId, String endPointURL, String result) throws IOException {

		List<AutomationTestStepLog> automationTestStepLogList =
				new ArrayList<AutomationTestStepLog>();
		QTestCredentials credentials = new PropertiesQTestCredentials(
				QtestRestClient.class.getResourceAsStream(QTEST_CREDENTIAL));

		TestExecutionServiceClient testExecutionService =
				new TestExecutionServiceClient(credentials);
		testExecutionService.setEndpoint(endPointURL);

		String testCaseId = (String) params.get(REPORT_TESTCASEID);
		String testCaseName = (String) params.get(RESPONSE_NAME);

		ArrayList<StepsInfo> detailsSet = getSteps(details);
		HashMap<Integer, Attachment> attachmentsLists = getTextFiles(detailsSet, params);
		ArrayList<List<String>> actualResultLists = getActualResultNew(detailsSet);
		Iterator<StepsInfo> iter = detailsSet.iterator();
		String stepdsr = "";
		String stepType = "";
		String[] expectedResult = null;
		String actualResult = "";
		int count = 1;
		while (iter.hasNext()) {
			StepsInfo stepsInfo = iter.next();
			stepType = stepsInfo.getStepType().toString();
			if (stepType.equalsIgnoreCase(STEP_TEST)) {
				stepdsr = stepsInfo.getStepName().toString();
				String stepResult = stepsInfo.getStepResult().toString().trim();
				if (stepdsr.startsWith(TESTSTEP_GIVEN)
						|| stepdsr.startsWith(TESTSTEP_WHEN)
						|| stepdsr.startsWith(TESTSTEP_THEN)
						|| stepdsr.startsWith(TESTSTEP_AND)) {
					expectedResult = stepdsr.split(" ", 2);
				}

				switch (stepResult) {
					case RESULT_PASSED :
						actualResult = ACTUAL_RESULT_PASS;
						break;
					case RESULT_FAILED :
						actualResult = ACTUAL_RESULT_FAIL;
						break;
					case STEP_NA :
						actualResult = ACTUAL_RESULT_NA;
						break;
					default :
						actualResult = ACTUAL_RESULT_DEFAULT;
						break;
				}

				AutomationTestStepLog autoTestStepLog = null;
				if (stepResult.equals(STEP_NA)) {
					autoTestStepLog = new AutomationTestStepLog().withStatus(stepResult)
							.withExpected(
									expectedResult[1].replace(VIEW_SCREENSHOT_STR, ""))
							.withActualResult(actualResult).withDescription(stepdsr)
							.withOrder(count);
				} else if (attachmentsLists.containsKey(count)) {
					autoTestStepLog = new AutomationTestStepLog()
							// .addAttachment(attachmentsLists.get(count))
							.withStatus(stepResult)
							.withExpected(
									expectedResult[1].replace(VIEW_SCREENSHOT_STR, ""))
							.withActualResult(actualResultLists.get(count - 1).toString()
									.replace("]", "").trim().replace("[", "").trim())
							.withDescription(stepdsr).withOrder(count);
				} else {
					autoTestStepLog = new AutomationTestStepLog().withStatus(stepResult)
							.withExpected(
									expectedResult[1].replace(VIEW_SCREENSHOT_STR, ""))
							.withActualResult(actualResultLists.get(count - 1).toString()
									.replace("]", "").trim().replace("[", "").trim())
							.withDescription(stepdsr).withOrder(count);
				}
				automationTestStepLogList.add(autoTestStepLog);
				count++;
			}
		}

		AutomationTestLog automationTestLog = new AutomationTestLog()
				.withExecutionStartDate(new Date()).withExecutionEndDate(new Date())
				.withName(params.get(RESPONSE_NAME).toString()).withStatus(result)
				.withSystemName(SYSTEM_NAME_TESTNG).withAutomationContent(testCaseId)
				.withTestCaseId(Long.parseLong(testCaseId))
				.withTestStepLogs(automationTestStepLogList);

		AutomationTestLogRequest automationTestLogRequest = null;
		Long testRunId = null;
		Map<String, Long> testRunInfoMap =
				(HashMap<String, Long>) getBundle().getObject(PROPERTY_TESTRUNINFOMAP);
		if (null == testRunInfoMap || testRunInfoMap.isEmpty()) {
			automationTestLogRequest = new AutomationTestLogRequest()
					.withProjectId(projectId).withAutomationTestLog(automationTestLog);
		} else {
			testRunId = testRunInfoMap.get(testCaseName);
			if (null != testRunId) {
				automationTestLogRequest = new AutomationTestLogRequest()
						.withProjectId(projectId).withAutomationTestLog(automationTestLog)
						.withTestRunId(testRunId);
			} else {
				automationTestLogRequest =
						new AutomationTestLogRequest().withProjectId(projectId)
								.withAutomationTestLog(automationTestLog);
			}
		}

		testExecutionService.submitAutomationTestLog(automationTestLogRequest);

		if (null != testRunId) {
			uploadAttachmentForAPI(projectId, testRunId, attachmentsLists, detailsSet);
		}
	}

	private String getUserName() {
		return getBundle().getString(QTEST_ENDPOINT_USERNAME);
	}

	private String getPassword() {
		return getBundle().getString(QTEST_ENDPOINT_PASSWORD);
	}

	private String getEndPoint() {
		return getBundle().getString(QTEST_END_POINT_URL_STR);
	}

	public Long getAuthToken(String qTestEndPointURL) {
		try {
			String endPoint = getEndPoint().trim();
			String basicAuth =
					Base64.getEncoder().encodeToString((endPoint + ":").getBytes());

			ClientResponse response;
			response = client.resource(qTestEndPointURL).path(QTEST_ENDPOINT_OAUTH)
					.queryParam(QTEST_ENDPOINT_HEADER_GRANTTYPE_STR,
							QTEST_ENDPOINT_HEADER_PASSWORD_STR)
					.queryParam(QTEST_ENDPOINT_HEADER_USERNAME_STR, getUserName())
					.queryParam(QTEST_ENDPOINT_HEADER_PASSWORD_STR, getPassword())
					.header(QTEST_ENDPOINT_HEADER_AUTHORIZATION_STR,
							QTEST_ENDPOINT_HEADER_BASIC_STR + basicAuth)
					.post(ClientResponse.class);
			String responseStr = response.getEntity(String.class);
			JSONObject jsonObject = new JSONObject(responseStr);
			String accessToken =
					jsonObject.getString(QTEST_ENDPOINT_RESPONSE_ACCESS_TOKEN_STR);
			getBundle().setProperty(PROPERTY_ACCESSTOKEN, accessToken);
		} catch (Exception e) {
			String authToken = getBundle().getString(QTEST_ENDPOINT_AUTH_TOKEN);
			getBundle().setProperty(PROPERTY_ACCESSTOKEN, authToken);
		}
		return null;
	}

	public Long getReleaseInfo(Long projectId, String releaseName,
			String qTestEndPointURL) {
		getAuthToken(qTestEndPointURL);
		ClientResponse response;
		response = client.resource(qTestEndPointURL)
				.path(QTEST_ENDPOINT_BASE + projectId + QTEST_ENDPOINT_RELEASE)
				.header(QTEST_ENDPOINT_HEADER_AUTHORIZATION_STR,
						QTEST_ENDPOINT_HEADER_BEARER_STR
								+ getBundle().getString(PROPERTY_ACCESSTOKEN))
				.get(ClientResponse.class);
		String responseStr = response.getEntity(String.class);
		JSONArray jsonArray = new JSONArray(responseStr);
		for (int i = 0; i < jsonArray.length(); i++) {
			String _releaseName = jsonArray.getJSONObject(i).getString(RESPONSE_NAME);
			if (_releaseName.equalsIgnoreCase(releaseName)) {
				getBundle().setProperty(PROPERTY_TESTRELEASEID,
						jsonArray.getJSONObject(i).getLong(RESPONSE_ID));
				return jsonArray.getJSONObject(i).getLong(RESPONSE_ID);
			}
		}
		return null;
	}

	public Long getCycleInfo(Long projectId, Long releaseId, String cycleName) {
		String endPoint = getEndPoint();
		ClientResponse response;
		response = client.resource(endPoint)
				.path(QTEST_ENDPOINT_BASE + projectId + QTEST_ENDPOINT_TESTCYCLE)
				.queryParam(QTEST_ENDPOINT_HEADER_PARENTID_STR, releaseId.toString())
				.queryParam(QTEST_ENDPOINT_HEADER_PARENTTYPE_STR,
						QTEST_ENDPOINT_RELEASE_STR)
				.header(QTEST_ENDPOINT_HEADER_AUTHORIZATION_STR,
						QTEST_ENDPOINT_HEADER_BEARER_STR
								+ getBundle().getString(PROPERTY_ACCESSTOKEN))
				.get(ClientResponse.class);
		String responseStr = response.getEntity(String.class);
		JSONArray jsonArray = new JSONArray(responseStr);
		for (int i = 0; i < jsonArray.length(); i++) {
			String _cycleName = jsonArray.getJSONObject(i).getString(RESPONSE_NAME);
			if (_cycleName.equalsIgnoreCase(cycleName)) {
				getBundle().setProperty(PROPERTY_TESTCYCLEID,
						jsonArray.getJSONObject(i).getLong(RESPONSE_ID));
				return jsonArray.getJSONObject(i).getLong(RESPONSE_ID);
			}
		}
		return null;
	}

	public Long getTestSuiteInfo(Long projectId, Long cycleId, String testSuiteName) {
		String endPoint = getEndPoint();
		ClientResponse response;
		response = client.resource(endPoint)
				.path(QTEST_ENDPOINT_BASE + projectId + QTEST_ENDPOINT_TESTSUITE)
				.queryParam(QTEST_ENDPOINT_HEADER_PARENTID_STR, cycleId.toString())
				.queryParam(QTEST_ENDPOINT_HEADER_PARENTTYPE_STR,
						QTEST_ENDPOINT_TESTCYCLE_STR)
				.header(QTEST_ENDPOINT_HEADER_AUTHORIZATION_STR,
						QTEST_ENDPOINT_HEADER_BEARER_STR
								+ getBundle().getString(PROPERTY_ACCESSTOKEN))
				.get(ClientResponse.class);
		String responseStr = response.getEntity(String.class);
		JSONArray jsonArray = new JSONArray(responseStr);
		for (int i = 0; i < jsonArray.length(); i++) {
			String _testSuiteName = jsonArray.getJSONObject(i).getString(RESPONSE_NAME);
			if (_testSuiteName.equalsIgnoreCase(testSuiteName)) {
				getBundle().setProperty(PROPERTY_TESTSUITEID,
						jsonArray.getJSONObject(i).getLong(RESPONSE_ID));
				return jsonArray.getJSONObject(i).getLong(RESPONSE_ID);
			}
		}
		return null;
	}

	public Map<String, Long> getTestRunInfo(Long projectId, Long testSuiteId) {
		String endPoint = getEndPoint();
		Map<String, Long> testRunInfoMap = new HashMap<String, Long>();
		ClientResponse response;
		response = client.resource(endPoint)
				.path(QTEST_ENDPOINT_BASE + projectId + QTEST_ENDPOINT_TESTRUN)
				.queryParam(QTEST_ENDPOINT_HEADER_PARENTID_STR, testSuiteId.toString())
				.queryParam(QTEST_ENDPOINT_HEADER_PARENTTYPE_STR,
						QTEST_ENDPOINT_TESTSUITE_STR)
				.header(QTEST_ENDPOINT_HEADER_AUTHORIZATION_STR,
						QTEST_ENDPOINT_HEADER_BEARER_STR
								+ getBundle().getString(PROPERTY_ACCESSTOKEN))
				.get(ClientResponse.class);
		String responseStr = response.getEntity(String.class);
		JSONArray jsonArray = new JSONArray(responseStr);
		for (int i = 0; i < jsonArray.length(); i++) {
			Long _testRunId = jsonArray.getJSONObject(i).getLong(RESPONSE_ID);
			String _testRunName = jsonArray.getJSONObject(i).getString(RESPONSE_NAME);
			testRunInfoMap.put(_testRunName, _testRunId);
		}
		getBundle().setProperty(PROPERTY_TESTRUNINFOMAP, testRunInfoMap);
		return null;
	}
	
	public Long getModuleInfo(Long projectId, String moduleName, String endPointURL,
			String authToken) {
		ClientResponse response;
		Client client = Client.create();
		response = client.resource(endPointURL)
				.path(QTEST_ENDPOINT_BASE + projectId + QTEST_ENDPOINT_MODULE)
				.header(QTEST_ENDPOINT_HEADER_AUTHORIZATION_STR,
						QTEST_ENDPOINT_HEADER_BEARER_STR + authToken)
				.get(ClientResponse.class);
		String responseStr = response.getEntity(String.class);
		JSONArray jsonArray = new JSONArray(responseStr);
		for (int i = 0; i < jsonArray.length(); i++) {
			if (moduleName.trim().equalsIgnoreCase(
					jsonArray.getJSONObject(i).getString(RESPONSE_NAME).trim())) {
				return jsonArray.getJSONObject(i).getLong(PROPERTY_MODULEID);
			}
		}
		return null;
	}

	public Long getTestCaseInfo(Long projectId, String testCaseName, Long moduleId, String endPointURL,
			String authToken) {
		ClientResponse response;
		Client client = Client.create();
		response = client.resource(endPointURL)
				.path(QTEST_ENDPOINT_BASE + projectId + QTEST_ENDPOINT_TEST_CASES)
				.queryParam(QTEST_QUERY_PARAM_PAGE_STR, "1")
				.queryParam(QTEST_QUERY_PARAM_SIZE_STR, "400")
				.queryParam(QTEST_ENDPOINT_HEADER_PARENTID_STR, moduleId.toString())
				.header(QTEST_ENDPOINT_HEADER_AUTHORIZATION_STR,
						QTEST_ENDPOINT_HEADER_BEARER_STR + authToken)
				.get(ClientResponse.class);
		String responseStr = response.getEntity(String.class);
		JSONArray jsonArray = new JSONArray(responseStr);
		for (int i = 0; i < jsonArray.length(); i++) {
			if (testCaseName.trim().equalsIgnoreCase(
					jsonArray.getJSONObject(i).getString(RESPONSE_NAME).trim())) {
				return jsonArray.getJSONObject(i).getLong(TESTCASE_ID);
			}
		}
		return null;
	}

	public Map<String, Long> uploadAttachment(Long projectId, Long testRunId,
			ArrayList<List<Attachment>> attachmentList, ArrayList<StepsInfo> detailsSet) {
		String endPoint = getEndPoint();
		Iterator<StepsInfo> iter = detailsSet.iterator();
		String stepType = "";
		ClientResponse responseForGetObjectId;

		responseForGetObjectId = client.resource(endPoint)
				.path(QTEST_ENDPOINT_BASE + projectId + QTEST_ENDPOINT_TESTRUN + "/"
						+ testRunId + QTEST_ENDPOINT_TESTLOG_LASTRUN)
				.header(QTEST_ENDPOINT_HEADER_AUTHORIZATION_STR,
						QTEST_ENDPOINT_HEADER_BEARER_STR
								+ getBundle().getString(PROPERTY_ACCESSTOKEN))
				.get(ClientResponse.class);
		String responseStrForGetObject = responseForGetObjectId.getEntity(String.class);

		Map<Long, Long> testStepIdOrderMap = new HashMap<Long, Long>();
		int count = 1;
		JSONObject jsonArrayForGetObject = new JSONObject(responseStrForGetObject);
		for (int i = 0; i < jsonArrayForGetObject.length(); i++) {

			JSONArray testStepLogArray =
					jsonArrayForGetObject.getJSONArray(QTEST_ENDPOINT_TESTSTEPLOG_STR);

			for (int j = 0; j < testStepLogArray.length(); j++) {
				Long testStepLogId = testStepLogArray.getJSONObject(j)
						.getLong(QTEST_ENDPOINT_TESTSTEPLOGID_STR);
				Long testStepOrder = testStepLogArray.getJSONObject(j)
						.getLong(QTEST_ENDPOINT_TESTSTEPORDER_STR);
				testStepIdOrderMap.put(testStepLogId, testStepOrder);
			}

			TestStepOrderComparator comp =
					new TestStepOrderComparator(testStepIdOrderMap);
			Map<Long, Long> orderedMap = new TreeMap<Long, Long>(comp);
			orderedMap.putAll(testStepIdOrderMap);

			Set<Long> testSteIdKeys = orderedMap.keySet();
			Iterator<Long> idItr = testSteIdKeys.iterator();

			while (idItr.hasNext()) {
				Long testStepId = idItr.next();

				while (iter.hasNext()) {
					StepsInfo stepsInfo = iter.next();
					stepType = stepsInfo.getStepType().toString();
					if (stepType.equalsIgnoreCase(STEP_TEST)) {
						String stepResult = stepsInfo.getStepResult().toString().trim();

						if (!stepResult.equals(STEP_NA)) {
							List<Attachment> attachmentForTestSteps =
									attachmentList.get(count - 1);
							for (int k = 0; k < attachmentForTestSteps.size(); k++) {

								client.resource(endPoint)
										.path(QTEST_ENDPOINT_BASE + projectId
												+ QTEST_ENDPOINT_TESTSTEPLOG + testStepId
												+ "/" + QTEST_ENDPOINT_UPLOADATTACHMENT)
										.queryParam(QTEST_ENDPOINT_HEADER_PARENTTYPE_STR,
												QTEST_ENDPOINT_TESTSUITE_STR)
										.header(QTEST_ENDPOINT_HEADER_AUTHORIZATION_STR,
												QTEST_ENDPOINT_HEADER_BEARER_STR
														+ getBundle().getString(
																PROPERTY_ACCESSTOKEN))
										.header(QTEST_ENDPOINT_HEADER_FILENAME,
												QTEST_ENDPOINT_HEADER_FILENAME_PREFIX
														+ System.currentTimeMillis()
														+ ".png")
										.header(CONTENT_TYPE_STR, CONTENT_IMG)
										.post(ClientResponse.class,
												BaseEncoding.base64()
														.decode(attachmentForTestSteps
																.get(k).getContent()));
							}
							break;
						}
					}
				}
				count++;
			}
		}

		return null;
	}

	public Map<String, Long> uploadAttachmentForAPI(Long projectId, Long testRunId,
			HashMap<Integer, Attachment> attachmentList,
			ArrayList<StepsInfo> detailsSet) {

		String endPoint = getEndPoint();
		String stepType = "";
		ClientResponse responseForGetObjectId;

		responseForGetObjectId = client.resource(endPoint)
				.path(QTEST_ENDPOINT_BASE + projectId + QTEST_ENDPOINT_TESTRUN + "/"
						+ testRunId + QTEST_ENDPOINT_TESTLOG_LASTRUN)
				.header(QTEST_ENDPOINT_HEADER_AUTHORIZATION_STR,
						QTEST_ENDPOINT_HEADER_BEARER_STR
								+ getBundle().getString(PROPERTY_ACCESSTOKEN))
				.get(ClientResponse.class);
		String responseStrForGetObject = responseForGetObjectId.getEntity(String.class);

		Map<Long, Long> testStepIdOrderMap = new HashMap<Long, Long>();
		int count = 1;
		JSONObject jsonArrayForGetObject = new JSONObject(responseStrForGetObject);
		for (int i = 0; i < jsonArrayForGetObject.length(); i++) {

			JSONArray testStepLogArray =
					jsonArrayForGetObject.getJSONArray(QTEST_ENDPOINT_TESTSTEPLOG_STR);

			for (int j = 0; j < testStepLogArray.length(); j++) {
				Long testStepLogId = testStepLogArray.getJSONObject(j)
						.getLong(QTEST_ENDPOINT_TESTSTEPLOGID_STR);
				Long testStepOrder = testStepLogArray.getJSONObject(j)
						.getLong(QTEST_ENDPOINT_TESTSTEPORDER_STR);
				testStepIdOrderMap.put(testStepLogId, testStepOrder);
			}

			TestStepOrderComparator comp =
					new TestStepOrderComparator(testStepIdOrderMap);
			Map<Long, Long> orderedMap = new TreeMap<Long, Long>(comp);
			orderedMap.putAll(testStepIdOrderMap);
			Set<Long> testSteIdKeys = orderedMap.keySet();
			Iterator<Long> idItr = testSteIdKeys.iterator();

			Iterator<StepsInfo> iter = detailsSet.iterator();
			while (idItr.hasNext()) {
				Long testStepId = idItr.next();
				while (iter.hasNext()) {
					StepsInfo stepsInfo = iter.next();
					stepType = stepsInfo.getStepType().toString();
					if (stepType.equalsIgnoreCase(STEP_TEST)) {
						String stepResult = stepsInfo.getStepResult().toString().trim();

						if (!stepResult.equals(STEP_NA)) {
							Attachment attachmentForTestSteps = attachmentList.get(count);
							if (attachmentForTestSteps != null) {

								client.resource(endPoint)
										.path(QTEST_ENDPOINT_BASE + projectId
												+ QTEST_ENDPOINT_TESTSTEPLOG + testStepId
												+ "/" + QTEST_ENDPOINT_UPLOADATTACHMENT)
										.queryParam(QTEST_ENDPOINT_HEADER_PARENTTYPE_STR,
												QTEST_ENDPOINT_TESTSUITE_STR)
										.header(QTEST_ENDPOINT_HEADER_AUTHORIZATION_STR,
												QTEST_ENDPOINT_HEADER_BEARER_STR
														+ getBundle().getString(
																PROPERTY_ACCESSTOKEN))
										.header(QTEST_ENDPOINT_HEADER_FILENAME,
												QTEST_ENDPOINT_HEADER_FILENAME_PREFIX
														+ System.currentTimeMillis()
														+ ".txt")
										.header(CONTENT_TYPE_STR, CONTENT_TEXT)
										.post(ClientResponse.class,
												BaseEncoding.base64()
														.decode(attachmentForTestSteps
																.getContent()));
							}
							break;
						}
					}
				}
				count++;
			}
		}

		return null;
	}

	class TestStepOrderComparator implements Comparator<Long> {

		Map<Long, Long> map;

		public TestStepOrderComparator(Map<Long, Long> map) {
			this.map = map;
		}

		public int compare(Long o1, Long o2) {

			return ((Long) map.get(o1)).compareTo((Long) map.get(o2));

		}
	}

	public class StepsInfo {
		String stepName;
		String stepResult;
		String attachment;
		String stepType;
		String stepDescription;

		public String getStepName() {
			return stepName;
		}

		public void setStepName(String stepName) {
			this.stepName = stepName;
		}

		public String getStepResult() {
			return stepResult;
		}

		public void setStepResult(String stepResult) {
			this.stepResult = stepResult;
		}

		public String getAttachment() {
			return attachment;
		}

		public void setAttachment(String attachment) {
			this.attachment = attachment;
		}

		public String getStepType() {
			return stepType;
		}

		public void setStepType(String stepType) {
			this.stepType = stepType;
		}

		public String getstepDescription() {
			return stepDescription;
		}

		public void setstepDescription(String stepDescription) {
			this.stepDescription = stepDescription;
		}

		@Override
		public String toString() {
			return "| " + StringUtil.rightPad(stepType, 20) + "| "
					+ StringUtil.rightPad(stepName, 120) + "| "
					+ StringUtil.rightPad(stepResult, 10) + "|\n";
		}
	}
}
