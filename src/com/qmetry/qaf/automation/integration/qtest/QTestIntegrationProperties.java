package com.qmetry.qaf.automation.integration.qtest;

public interface QTestIntegrationProperties {

	//Common Properties
	String QTEST_STR = "Qtest";
	String QTEST_CREDENTIAL = "qTestCredentials.properties";
	String TESTCASEID = "testCaseId";
	String EXECUTION_MODE_UPLOAD = "upload";
	String EXECUTION_MODE_CREATE = "create";
	String PROJECT_WEB = "web";
	String PROJECT_MOBILE = "mobile";
	String PROJECT_API = "api";
	String PROJECT_NAME_STR = "qtest.project.name";
	String PROJECT_EXE_MODE_STR = "qtest.execution.mode";
	String QTEST_PROJECT_STR = "qtest.project";
	String QTEST_END_POINT_URL_STR = "qtest.end.point.url";
	String QTEST_TEST_MANAGEMENT_STR = "test.management.tool.enable";
	String QTEST_RELEASE_STR = "qtest.release.name";
	String QTEST_CYCLE_STR = "qtest.cycle.name";
	String QTEST_TESTSUITE_STR = "qtest.testsuite.name";
	String RESPONSE_ID = "id";
	String RESPONSE_NAME = "name";
	
	//Result Upload Properties
	String QTEST_FAILURE_ATTACH_SS_STR = "qtest.attach.failure.screenshots";
	String QTEST_SUCCESS_ATTACH_SS_STR = "qtest.attach.success.screenshots";
	String RESULT_PASSED = "Passed";
	String RESULT_FAILED = "Failed";
	String STEP_CHECKPOINT = "CheckpointStep";
	String STEP_TEST = "TestStep";
	String STEP_NA = "NA";
	String CLASS_STR = "class";
	String CLASS_PASS = "pass";
	String CLASS_FAIL = "fail";
	String SCREENSHOT_STR = "Screenshot";
	String AUTOMATION_CONTENT_STR = "Automation Content: ";
	String CONTENT_TYPE_STR = "Content-Type";
	String DESCRIPTION_STR = "description";
	String TESTSTEP_GIVEN = "Given";
	String TESTSTEP_WHEN = "When";
	String TESTSTEP_THEN = "Then";
	String TESTSTEP_AND = "And";
	String SS_DIR_PATH = "selenium.screenshots.dir";
	String SCENARIO_NAME_FILE = "Scenario Name::";
	String SCENARIO_ID_FILE = ",Test case id::";
	String CONTENT_IMG = "image/png";
	String CONTENT_TEXT = "text/txt";
	String CONTENT_JSON = "application/json";
	String ATTACH_IMG_PATH = "img";
	String ACTUAL_RESULT_PASS = "Actual is meeting with the expected result";
	String ACTUAL_RESULT_FAIL = "Actual is not meeting with the expected result";
	String ACTUAL_RESULT_NA = "Step is not executed";
	String ACTUAL_RESULT_DEFAULT = "no result found";
	String ACTUAL_RESULT_BLANK = "No action has been done";	
	String VIEW_SCREENSHOT_STR ="[View Screenshot]";
	String SYSTEM_NAME_TESTNG = "TestNG";
	String REPORT_NODE_HREF = "href";
	String REPORT_DESCRIPTION = "description";
	String REPORT_TESTCASEID = "testCaseId";
	String TESTCASE_ID="id";

	//Rest Service Properties
	String QTEST_ENDPOINT_USERNAME = "qtest.username";
	String QTEST_ENDPOINT_PASSWORD = "qtest.password";
	String QTEST_ENDPOINT_OAUTH = "/oauth/token/";
	String QTEST_ENDPOINT_HEADER_GRANTTYPE_STR = "grant_type";
	String QTEST_ENDPOINT_HEADER_USERNAME_STR = "username";
	String QTEST_ENDPOINT_HEADER_PASSWORD_STR = "password";
	String QTEST_ENDPOINT_HEADER_AUTHORIZATION_STR = "Authorization";
	String QTEST_ENDPOINT_HEADER_BASIC_STR = "Basic ";
	String QTEST_ENDPOINT_RESPONSE_ACCESS_TOKEN_STR = "access_token";
	String QTEST_ENDPOINT_AUTH_TOKEN = "qtest.authtoken";
	String QTEST_ENDPOINT_BASE = "/api/v3/projects/";
	String QTEST_ENDPOINT_RELEASE = "/releases";
	String QTEST_ENDPOINT_HEADER_BEARER_STR = "Bearer ";
	String QTEST_ENDPOINT_TESTCYCLE = "/test-cycles";
	String QTEST_ENDPOINT_HEADER_PARENTID_STR = "parentId";
	String QTEST_ENDPOINT_HEADER_PARENTTYPE_STR = "parentType";
	String QTEST_ENDPOINT_HEADER_FILENAME = "File-Name";
	String QTEST_ENDPOINT_HEADER_FILENAME_PREFIX = "attachment_";
	String QTEST_ENDPOINT_RELEASE_STR = "release";
	String QTEST_ENDPOINT_TESTSUITE = "/test-suites";
	String QTEST_ENDPOINT_TESTCYCLE_STR = "test-cycle";
	String QTEST_ENDPOINT_TESTRUN = "/test-runs";
	String QTEST_ENDPOINT_TESTSUITE_STR = "test-suite";
	String QTEST_ENDPOINT_GETTESTSTEPLOGOBJECTID = "/api/v3/projects/{projectId}/test-runs/{testRunId}/test-logs/last-run";
	String QTEST_ENDPOINT_TESTLOG_LASTRUN = "/test-logs/last-run";
	String QTEST_ENDPOINT_TESTSTEPLOG = "/test-step-logs/";
	String QTEST_ENDPOINT_UPLOADATTACHMENT = "/blob-handles";
	String QTEST_ENDPOINT_TESTSTEPLOG_STR = "test_step_logs";
	String QTEST_ENDPOINT_TESTSTEPLOGID_STR = "test_step_log_id";
	String QTEST_ENDPOINT_TESTSTEPORDER_STR = "order";
	String QTEST_ENDPOINT_TEST_CASES="/test-cases";
	String PROPERTY_TESTCASEID="testCaseId";
	String QTEST_ENDPOINT_MODULE="/modules";
	String PROPERTY_MODULEID="id";
	String QTEST_QUERY_PARAM_PAGE_STR = "page";
	String QTEST_QUERY_PARAM_SIZE_STR = "size";
	String PROPERTY_ACCESSTOKEN = "accessToken";
	String PROPERTY_TESTRELEASEID = "testReleaseId";
	String PROPERTY_TESTCYCLEID = "testCycleId";
	String PROPERTY_TESTSUITEID = "testSuiteId";
	String PROPERTY_TESTRUNINFOMAP = "testRunInfoMap";

	
	//Erro Messages
	String QTEST_RESULT_UPLOAD_ERROR = "Unable to update result on Qtest for [project: %s ]";
	String QTEST_INVALID_PROJECT_TYPE = "Project type is invalid";
	String PROJECT_BLANK_ERROR = "Project name is null or blank";
	String QTEST_TEST_MANAGEMENT_ERROR = "QTest test case creation and result upload is disabled";
	String RELEASE_BLANK_ERROR = "Release name is null or blank";
	String RELEASE_NOT_FOUND_ERROR = "Release not found";
	String TESTCYCLE_BLANK_ERROR = "Test Cycle name is null or blank";
	String CYCLE_NOT_FOUND_ERROR = "Cycle not found";
	String TESTSUITE_BLANK_ERROR = "Test Suite name is null or blank";
	String TESTSUITE_NOT_FOUND_ERROR = "Test Suite not found";
	String TESTCASEID_BLANK_ERROR = "Testcase Id is null or blank";
	String EXECUTION_MODE_INVALID_ERROR = "Execution mode is invalid";
	String PROJECT_NOT_FOUND_ERROR = "Project not found";
}
