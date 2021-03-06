package com.NFK.version1.listener;

import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.NFK.support.ConsoleUtils;
import com.perfecto.reportium.WebDriverProvider;
import com.perfecto.reportium.client.ReportiumClient;
import com.perfecto.reportium.client.ReportiumClientFactory;
import com.perfecto.reportium.model.Job;
import com.perfecto.reportium.model.PerfectoExecutionContext;
import com.perfecto.reportium.model.Project;
import com.perfecto.reportium.test.TestContext;
import com.perfecto.reportium.test.result.TestResultFactory;
import com.perfecto.reportium.testng.ReportiumTestNgListener;
import com.qmetry.qaf.automation.core.CheckpointResultBean;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.core.TestBaseProvider;
import com.qmetry.qaf.automation.keys.ApplicationProperties;
import com.qmetry.qaf.automation.step.QAFTestStepListener;
import com.qmetry.qaf.automation.step.StepExecutionTracker;
import com.qmetry.qaf.automation.step.client.TestNGScenario;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

import cucumber.runtime.RuntimeOptions;
import cucumber.runtime.RuntimeOptionsFactory;

/**
 * Created by mitchellw on 9/27/2016.
 */
public class ReportiumListener extends ReportiumTestNgListener implements QAFTestStepListener, ITestListener {

	public static final String PERFECTO_REPORT_CLIENT = "perfecto.report.client";

	public static ReportiumClient getReportiumClient() {
		return (ReportiumClient) getBundle().getObject(PERFECTO_REPORT_CLIENT);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void onStart(ITestContext context) {
		if (getBundle().getString("remote.server", "").contains("perfecto")) {

			List<String> stepListeners = getBundle().getList(ApplicationProperties.TESTSTEP_LISTENERS.key);
			if (!stepListeners.contains(this.getClass().getName())) {
				stepListeners.add(this.getClass().getName());
				getBundle().setProperty(ApplicationProperties.TESTSTEP_LISTENERS.key, stepListeners);
			}

			if (getBundle().getBoolean("perfecto.default.driver.listener", true)) {
				List<String> driverListeners = getBundle()
						.getList(ApplicationProperties.WEBDRIVER_COMMAND_LISTENERS.key);
				if (!driverListeners.contains(PerfectoDriverListener.class.getName())) {
					driverListeners.add(PerfectoDriverListener.class.getName());
					getBundle().setProperty(ApplicationProperties.WEBDRIVER_COMMAND_LISTENERS.key, driverListeners);
				}
			}
		}
	}

	@Override
	public void onTestStart(ITestResult testResult) {
		if (getBundle().getString("remote.server", "").contains("perfecto")) {
			createReportiumClient(testResult).testStart(testResult.getMethod().getMethodName(),
					new TestContext(testResult.getMethod().getGroups()));
		}
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		if (method.isTestMethod()) {
			// Before execution of test method
			ConsoleUtils.surroundWithSquare("TEST STARTED: " + getTestName(testResult)
					+ (testResult.getParameters().length > 0 ? " [" + testResult.getParameters()[0] + "]" : ""));
		}
	}

	@Override
	public void beforExecute(StepExecutionTracker stepExecutionTracker) {
		String msg = "BEGIN STEP: " + stepExecutionTracker.getStep().getDescription();
		ConsoleUtils.logInfoBlocks(msg, ConsoleUtils.lower_block + " ", 10);
		logTestStep(stepExecutionTracker.getStep().getDescription());
	}

	@Override
	public void afterExecute(StepExecutionTracker stepExecutionTracker) {
		String msg = "END STEP: " + stepExecutionTracker.getStep().getDescription();
		ConsoleUtils.logInfoBlocks(msg, ConsoleUtils.upper_block + " ", 10);
	}

	@Override
	public void onFailure(StepExecutionTracker stepExecutionTracker) {

	}

	@Override
	public void onTestSuccess(ITestResult testResult) {
		ReportiumClient client = getReportiumClient();
		if (null != client) {
			client.testStop(TestResultFactory.createSuccess());
			logTestEnd(testResult);
		}

	}

	@Override
	public void onTestFailure(ITestResult testResult) {
		ReportiumClient client = getReportiumClient();
		if (null != client) {

			String failMsg = "";
			List<CheckpointResultBean> checkpointsList = TestBaseProvider.instance().get().getCheckPointResults();
			for (CheckpointResultBean result : checkpointsList) {
				if (result.getType().equals(MessageTypes.TestStepFail.toString())) {
					failMsg += "Step:" + result.getMessage() + " failed" + "\n";
					// List<CheckpointResultBean> subList =
					// result.getSubCheckPoints();
					// for (CheckpointResultBean sub : subList) {
					// if (sub.getType().equals(MessageTypes.Fail.toString())){
					// failMsg += sub.getMessage() + "\n";
					// }
					// }
				}

			}
			client.testStop(TestResultFactory.createFailure(failMsg.isEmpty() ? "An error occurred" : failMsg,
					testResult.getThrowable()));

			logTestEnd(testResult);

		}
	}

	@Override
	public void onTestSkipped(ITestResult testResult) {
		ReportiumClient client = getReportiumClient();
		if (null != client) {

			String skipMsg = "";
			List<CheckpointResultBean> checkpointsList = TestBaseProvider.instance().get().getCheckPointResults();
			for (CheckpointResultBean result1 : checkpointsList) {
				if (result1.getType().equals(MessageTypes.TestStep.toString())) {
					skipMsg += "Step:" + result1.getMessage() + " skipped" + "\n";
				}
			}	
				client.testStop(TestResultFactory.createFailure(skipMsg.isEmpty() ? "Test Skipped" : skipMsg,
						testResult.getThrowable()));

				logTestEnd(testResult);	
		}

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

	public static void logTestStep(String message) {
		try {
			getReportiumClient().stepStart(message);
		} catch (Exception e) {
			// ignore...
		}
	}

	private void logTestEnd(ITestResult testResult) {
		String endText = "TEST " + (testResult.isSuccess() ? "PASSED" : "FAILED") + ": ";
		addReportLink(testResult, getReportiumClient().getReportUrl());
		ConsoleUtils.logWarningBlocks(
				"REPORTIUM URL: " + getReportiumClient().getReportUrl().replace("[", "%5B").replace("]", "%5D"));
		ConsoleUtils.surroundWithSquare(endText + getTestName(testResult)
				+ (testResult.getParameters().length > 0 ? " [" + testResult.getParameters()[0] + "]" : ""));
	}

	@Override
	protected String getTestName(ITestResult result) {

		return result.getTestName() == null ? result.getMethod().getMethodName() : result.getTestName();
	}

	/**
	 * Creates client and set into configuration for later use during test
	 * execution using {@link #getReportiumClient()}.
	 *
	 * param testResult
	 * 
	 * @return newly created {@link ReportiumClient} object
	 */
	@Override
	protected ReportiumClient createReportiumClient(ITestResult testResult) {
		ReportiumClient reportiumClient = new ReportiumClientFactory().createLoggerClient();

		String suiteName = testResult.getTestContext().getSuite().getName();
		String prjName = getBundle().getString("project.name", suiteName);
		String prjVer = getBundle().getString("project.ver", "1.0");
		String xmlTestName = testResult.getTestContext().getName();

		Object testInstance = testResult.getInstance();
		WebDriver driver = null;
		if (testInstance instanceof WebDriverTestCase)
			driver = ((WebDriverTestCase) testInstance).getDriver();
		else if (testInstance instanceof WebDriverProvider)
			driver = ((WebDriverProvider) testInstance).getWebDriver();
		if (driver != null) {
			PerfectoExecutionContext perfectoExecutionContext = new PerfectoExecutionContext.PerfectoExecutionContextBuilder()
					.withProject(new Project(prjName, prjVer)).withContextTags(suiteName, xmlTestName)
					.withJob(new Job(getBundle().getString("JOB_NAME"), getBundle().getInt("BUILD_NUMBER", 0)))
					.withWebDriver(driver).build();

			reportiumClient = new ReportiumClientFactory().createPerfectoReportiumClient(perfectoExecutionContext);
		}
		getBundle().setProperty(PERFECTO_REPORT_CLIENT, reportiumClient);

		return reportiumClient;
	}

	@Override
	protected String[] getTags(ITestResult testResult) {

		RuntimeOptions cucumberOptions = getCucumberOptions(testResult);
		List<String> optionsList = cucumberOptions.getFilters().stream().map(object -> Objects.toString(object, null))
				.collect(Collectors.toList());
		optionsList.addAll(cucumberOptions.getFeaturePaths());
		optionsList.addAll(cucumberOptions.getGlue());

		return ArrayUtils.addAll(super.getTags(testResult), optionsList.toArray(new String[optionsList.size()]));
	}

	private RuntimeOptions getCucumberOptions(ITestResult testResult) {
		try {
			return new RuntimeOptionsFactory(Class.forName(testResult.getTestClass().getName())).create();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void addReportLink(ITestResult result, String url) {
		((TestNGScenario) result.getMethod()).getMetaData().put("Perfecto-report",
				"<a href=\"" + url + "\" target=\"_blank\">view</a>");
	}

}
