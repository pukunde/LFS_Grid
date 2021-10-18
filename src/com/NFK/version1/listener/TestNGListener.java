package com.NFK.version1.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class TestNGListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		/*// TODO Auto-generated method stub
		// Install Application Code
				AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestBase().getDriver().getUnderLayingDriver();
				String appId = ConfigurationManager.getBundle().getString("app.package");
				System.out.println("Install status: " + androidDriver.isAppInstalled(appId));

				if (ConfigurationManager.getBundle().getBoolean("isUninstalled") == false) {
					System.out.println("Uninstalling App");

					try {
						androidDriver.removeApp(appId);
					} catch (Exception e) {
						e.printStackTrace();
					}
					ConfigurationManager.getBundle().setProperty("isUninstalled", true);
				}

				// Install application code
				if (androidDriver.isAppInstalled(appId) == false
						&& ConfigurationManager.getBundle().getBoolean("isUninstalled") == true) {
					System.out.println("Installing app");

					if (ConfigurationManager.getBundle().getString("selenium.server").contains("perfecto")) {

						// Install Application Code
						androidDriver.installApp("PUBLIC:Automation_Team_Lemonade_Android/app-adhoctest-debug.apk");
						ConfigurationManager.getBundle().setProperty("autoInstrument", true);
					} else {
						// For local device
						androidDriver.installApp(ConfigurationManager.getBundle().getString("application.path"));
					}
				}*/
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		closeApp();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		closeApp();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		closeApp();
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void closeApp() {
		System.out.println("Closing the Driver");
		String channel = ConfigurationManager.getBundle().getString("channel");
		try {
			if (!channel.contains("android")) {
			//	((IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver()).closeApp();
			} else {
				((AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver()).closeApp();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
