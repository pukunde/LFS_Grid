package com.NFK.support;

import java.util.List;
import java.util.Map;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.integration.qtest.LifescanBDDParser;
import com.qmetry.qaf.automation.integration.qtest.QtestUpdator;

public class CreateTestCaseInQTest {

	public static void main(String[] args) {
		String scenariosPath =
			ConfigurationManager.getBundle().getString("qtest.sceanriofile.path");
		if (scenariosPath != null && !scenariosPath.isEmpty()) {
			LifescanBDDParser lifescanBDDParser = new LifescanBDDParser();
			Map<String, List<String>> scenarioListMap =
					lifescanBDDParser.parseScenarioFileOrDir(scenariosPath);
			QtestUpdator qtestUpdator = new QtestUpdator();
			qtestUpdator.createTestCase(scenarioListMap);
		} else {
			System.err.append("Scenario File Path is not defined..... \n");
		}
	}
}