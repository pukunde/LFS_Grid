package com.NFK.version1.listener;

import java.util.Map;

import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.Response;

import com.NFK.support.LFSUtilsIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.CommandTracker;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;
import com.qmetry.qaf.automation.util.StringUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class WebDriverCommandListener extends QAFWebDriverCommandAdapter {

	@Override
	public void beforeCommand(QAFExtendedWebDriver driver, CommandTracker commandTracker) {
		super.beforeCommand(driver, commandTracker);
		String command = commandTracker.getCommand();
		if (command.equalsIgnoreCase(DriverCommand.GET_CURRENT_URL)) {
			System.out.println("Firing GET_CURRENT_URL");
		}
		String channel = ConfigurationManager.getBundle().getString("channel");
		if (channel.contains("android") || channel.contains("ios")) {
			if (command.equalsIgnoreCase(DriverCommand.GET_CURRENT_WINDOW_HANDLE)) {
				commandTracker.setResponce(new Response());
			}

		}

	}

	@Override
	public void afterCommand(QAFExtendedWebDriver driver, CommandTracker commandTracker) {
		// TODO Auto-generated method stub
		super.afterCommand(driver, commandTracker);
		String command = commandTracker.getCommand();
		Map<String, Object> params = commandTracker.getParameters();

		if (command.equalsIgnoreCase(DriverCommand.SEND_KEYS_TO_ELEMENT)
				&& StringUtil.isBlank((String) params.get("id"))) {
			((IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver()).hideKeyboard();
			// skip original command execution
			commandTracker.setResponce(new Response());
		}
	}

}