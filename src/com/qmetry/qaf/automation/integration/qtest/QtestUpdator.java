
package com.qmetry.qaf.automation.integration.qtest;

import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.qas.qtest.api.auth.PropertiesQTestCredentials;
import org.qas.qtest.api.auth.QTestCredentials;
import org.qas.qtest.api.services.project.ProjectServiceClient;
import org.qas.qtest.api.services.project.model.ListProjectRequest;
import org.qas.qtest.api.services.project.model.Project;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.qmetry.qaf.automation.integration.TestCaseResultUpdator;
import com.qmetry.qaf.automation.integration.TestCaseRunResult;
import com.qmetry.qaf.automation.util.StringUtil;

public class QtestUpdator implements TestCaseResultUpdator, QTestIntegrationProperties {
	private static final Logger log = Logger.getLogger(QtestUpdator.class);
	private static Long id = null;

	public enum QTestWSParameters {
		endPointURL,
		projectName;
	}

	public static Long getProjectId(String projectName, String endPointURL)
			throws IOException {

		if (null == projectName || projectName.isEmpty()) {
			throw new NullPointerException(PROJECT_BLANK_ERROR);
		}

		if (id == null) {
			QTestCredentials credentials = new PropertiesQTestCredentials(
					QtestRestClient.class.getResourceAsStream(QTEST_CREDENTIAL));

			ProjectServiceClient projectService = new ProjectServiceClient(credentials);
			projectService.setEndpoint(endPointURL);
			ListProjectRequest listProjectRequest = new ListProjectRequest();
			List<Project> projects = projectService.listProject(listProjectRequest);
			JsonArray projectResponseJsonObj =
					(JsonArray) new JsonParser().parse(projects.toString());
			for (int i = 0; i < projectResponseJsonObj.size(); i++) {
				String name = projectResponseJsonObj.get(i).getAsJsonObject()
						.get(RESPONSE_NAME).getAsString();
				if (name.equalsIgnoreCase(projectName)) {
					id = projectResponseJsonObj.get(i).getAsJsonObject().get(RESPONSE_ID)
							.getAsLong();
				}
			}
		}
		return id;
	}

	@Override
	public boolean updateResult(Map<String, ? extends Object> params,
			TestCaseRunResult result, String details) {

		String endPointURL =
				getEndPointURL(QTEST_END_POINT_URL_STR);
		String projectName =
				getProjectName((String) params.get(QTestWSParameters.projectName.name()));
		String testCaseId = (String) params.get(TESTCASEID);

		try {

			if (isTestToolEnable() != 1) {
				throw new LifescanQTestIntegrationException(QTEST_TEST_MANAGEMENT_ERROR);
			}

			QtestRestClient client = QtestRestClient.getInstance();
			Long projectId = getProjectId(projectName, endPointURL);
			Long releaseId = null;
			Long cycleId = null;
			Long testSuiteId = null;

			if (getMode().equalsIgnoreCase(EXECUTION_MODE_UPLOAD)) {

				if (null == getReleaseName() || getReleaseName().isEmpty()) {
					throw new LifescanQTestIntegrationException(RELEASE_BLANK_ERROR);
				} else {
					releaseId = client.getReleaseInfo(projectId, getReleaseName(),
							getEndPoint());
					if (null == releaseId) {
						throw new LifescanQTestIntegrationException(
								RELEASE_NOT_FOUND_ERROR);
					}
				}

				if (null == getCycleName() || getCycleName().isEmpty()) {
					throw new LifescanQTestIntegrationException(TESTCYCLE_BLANK_ERROR);
				} else {
					cycleId = client.getCycleInfo(projectId, releaseId, getCycleName());
					if (null == cycleId) {
						throw new LifescanQTestIntegrationException(
								CYCLE_NOT_FOUND_ERROR);
					}
				}

				if (null == getTestSuiteName() || getTestSuiteName().isEmpty()) {
					throw new LifescanQTestIntegrationException(TESTSUITE_BLANK_ERROR);
				} else {
					testSuiteId = client.getTestSuiteInfo(projectId, cycleId,
							getTestSuiteName());
					if (null == testSuiteId) {
						throw new LifescanQTestIntegrationException(
								TESTSUITE_NOT_FOUND_ERROR);
					}
				}

				client.getTestRunInfo(projectId, testSuiteId);
				if (null != testCaseId && !testCaseId.isEmpty()) {
					if (getProjectType().equalsIgnoreCase(PROJECT_WEB)
							|| getProjectType().equalsIgnoreCase(PROJECT_MOBILE)) {
						client.uploadResult(params, details, projectId, endPointURL,
								result.toQC());
					} else if (getProjectType().equalsIgnoreCase(PROJECT_API)) {
						client.uploadResultAPI(params, details, projectId, endPointURL,
								result.toQC());
					} else {
						throw new LifescanQTestIntegrationException(QTEST_INVALID_PROJECT_TYPE);
					}
				} else {
					throw new LifescanQTestIntegrationException(TESTCASEID_BLANK_ERROR);
				}

			} else {
				throw new LifescanQTestIntegrationException(EXECUTION_MODE_INVALID_ERROR);
			}

		} catch (Exception e) {
			e.printStackTrace();
			log.error(String.format(QTEST_RESULT_UPLOAD_ERROR, projectName), e);
		}
		return false;
	}

	public boolean createTestCase(Map<String, List<String>> scenarioListMap) {
		boolean isTestCaseCreated = false;
		try {

			if (isTestToolEnable() != 1) {
				throw new LifescanQTestIntegrationException(QTEST_TEST_MANAGEMENT_ERROR);
			}

			QtestRestClient client = QtestRestClient.getInstance();
			Long projectId = getProjectId(getProjectName(), getEndPoint());

			if (projectId == null) {
				throw new LifescanQTestIntegrationException(PROJECT_NOT_FOUND_ERROR);
			}

			if (getMode().equalsIgnoreCase(EXECUTION_MODE_CREATE)) {
				isTestCaseCreated = client.createTestCaseAndTestStepFromBDD(projectId,
						scenarioListMap, getEndPoint());
			} else {
				throw new LifescanQTestIntegrationException(EXECUTION_MODE_INVALID_ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isTestCaseCreated;
	}

	@Override
	public String getToolName() {
		return QTEST_STR;
	}

	private String getEndPointURL(String name) {
		if (StringUtil.isNotBlank(name)) {
			return getBundle().getString(name, name);
		}
		return getBundle().getString(QTEST_END_POINT_URL_STR);
	}

	private String getProjectName() {
		return getBundle().getString(PROJECT_NAME_STR);
	}

	private String getProjectName(String name) {
		if (StringUtil.isNotBlank(name)) {
			return getBundle().getString(name, name);
		}
		return getBundle().getString(PROJECT_NAME_STR);
	}

	private String getMode() {
		return getBundle().getString(PROJECT_EXE_MODE_STR);
	}

	private String getProjectType() {
		return getBundle().getString(QTEST_PROJECT_STR);
	}

	private String getEndPoint() {
		return getBundle().getString(QTEST_END_POINT_URL_STR);
	}

	private int isTestToolEnable() {
		return getBundle().getInt(QTEST_TEST_MANAGEMENT_STR);
	}

	private String getReleaseName() {
		return getBundle().getString(QTEST_RELEASE_STR);
	}

	private String getCycleName() {
		return getBundle().getString(QTEST_CYCLE_STR);
	}

	private String getTestSuiteName() {
		return getBundle().getString(QTEST_TESTSUITE_STR);
	}

	class LifescanQTestIntegrationException extends Exception {
		private static final long serialVersionUID = 1L;

		public LifescanQTestIntegrationException() {
		}

		public LifescanQTestIntegrationException(String message) {
			super(message);
		}
	}
}
