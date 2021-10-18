
package com.NFK.version1.listener;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.Response;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.CommandTracker;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.StringUtil;

import io.appium.java_client.ios.IOSDriver;

/**
 * com.basis.listener.ErrorOverrideListener.java
 * 
 * @author
 */

public class ErrorOverrideListener extends QAFWebDriverCommandAdapter {
	Log logger = LogFactory.getLog(getClass());

	@Override
	public void beforeCommand(QAFExtendedWebDriver driver, CommandTracker commandTracker) {

		super.beforeCommand(driver, commandTracker);
		String command = commandTracker.getCommand();
		if (command.equalsIgnoreCase(DriverCommand.CLICK_ELEMENT) || command.equalsIgnoreCase(DriverCommand.CLICK)) {
			Reporter.logWithScreenShot("Screen Shot At Click");

		}

		if (command.equalsIgnoreCase(DriverCommand.GET_CURRENT_WINDOW_HANDLE)) {
			Response res = new Response();
			commandTracker.setResponce(res);
			System.out.println("Inside Before command");
		}

	}

//	@Override
//	public void onFailure(QAFExtendedWebDriver driver, CommandTracker commandTracker) {
//		super.onFailure(driver, commandTracker);
//		Reporter.logWithScreenShot("Screen Shot At Failure");
//			
//	}

	@Override
	public void onInitialize(QAFExtendedWebDriver driver) {
		super.onInitialize(driver);
		//System.out.println("Inside OnInitialise");
	}

}