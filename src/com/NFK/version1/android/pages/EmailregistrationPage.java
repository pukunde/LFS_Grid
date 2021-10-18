package com.NFK.version1.android.pages;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;

import com.NFK.support.LFSUtilsAndroid;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.android.AndroidDriver;

public class EmailregistrationPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	private AndroidDriver andDriver=(AndroidDriver) driver.getUnderLayingDriver();
	@FindBy(locator = "NFK.malinator.email.txt")
	private QAFWebElement NFKMalinatorEmailTxt;
	@FindBy(locator = "NFK.malinator.go.btn")
	private QAFWebElement NFKMalinatorGoBtn;
	@FindBy(locator = "NFK.malinator.passwordrecovery.mail.txt")
	private QAFWebElement NFKMalinatorPasswordrecoveryMailTxt;
	@FindBy(locator = "NFK.malinator.passwordRecoveryLink.lnk")
	private QAFWebElement NFKMalinatorPasswordRecoveryLinkLnk;
	@FindBy(locator = "NFK.agreeterms.chk")
	private QAFWebElement NFKAgreetermsChk;
	@FindBy(locator = "NFK.reset.password.txt")
	private QAFWebElement NFKResetPasswordTxt;
	@FindBy(locator = "NFK.reset.confpassword.txt")
	private QAFWebElement NFKResetConfpasswordTxt;
	@FindBy(locator = "NFK.reset.password.submit.btn")
	private QAFWebElement NFKResetPasswordSubmitBtn;
	@FindBy(locator = "NFK.mailnator.openinbox.btn")
	private QAFWebElement NFKMailnatorOpeninboxBtn;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKMalinatorEmailTxt() {
		return NFKMalinatorEmailTxt;
	}

	public QAFWebElement getNFKMalinatorGoBtn() {
		return NFKMalinatorGoBtn;
	}

	public QAFWebElement getNFKMalinatorPasswordrecoveryMailTxt() {
		return NFKMalinatorPasswordrecoveryMailTxt;
	}

	public QAFWebElement getNFKMalinatorPasswordRecoveryLinkLnk() {
		return NFKMalinatorPasswordRecoveryLinkLnk;
	}

	public QAFWebElement getNFKAgreetermsChk() {
		return NFKAgreetermsChk;
	}

	public QAFWebElement getNFKResetPasswordTxt() {
		return NFKResetPasswordTxt;
	}

	public QAFWebElement getNFKResetConfpasswordTxt() {
		return NFKResetConfpasswordTxt;
	}

	public QAFWebElement getNFKResetPasswordSubmitBtn() {
		return NFKResetPasswordSubmitBtn;
	}

	public QAFWebElement getNFKMailnatorOpeninboxBtn() {
		return NFKMailnatorOpeninboxBtn;
	}
	
	public void openmMobileBrowser() {
		Map<String, Object> appName = new HashMap<>();
		appName.put("automation", "os");
	
		String command="mobile:browser:clean";

		String res = (String) driver.executeScript("mobile:browser:open", appName);
		
		Reporter.logWithScreenShot("script responce"+res);
		
		LFSUtilsAndroid.switchToContext(andDriver, "WEBVIEW");
		try {
			appName.put("timeout", "85");
            driver.executeScript(command, appName);
        } catch (Exception e) {
            System.err.println("Unable to clean app: " + appName);
        }
		andDriver.manage().deleteAllCookies();
		
	}


	public void openMailinator() {
		driver.get("http://www.mailinator.com");
		Reporter.logWithScreenShot("browser open with Mailinator site");
		
	}
	
	public void enterMailId(String email) {
	
		openMailinator();
		getNFKMalinatorEmailTxt().waitForPresent();
		getNFKMalinatorEmailTxt().clear();
		getNFKMalinatorEmailTxt().sendKeys(email);
		getNFKMalinatorGoBtn().waitForPresent();
		getNFKMalinatorGoBtn().click();
		
		Reporter.logWithScreenShot("After click on go button");
		
	}
	
	public void changePassword() {
		LFSUtilsAndroid.pause(10000);
		String pwd=RandomStringUtils.randomAlphanumeric(8)+"1#";
		ConfigurationManager.getBundle().setProperty("newPassword", pwd);
		getNFKMalinatorPasswordrecoveryMailTxt().waitForPresent(90);
		getNFKMalinatorPasswordrecoveryMailTxt().click();
		Reporter.logWithScreenShot("Email for password recovery", MessageTypes.Pass);
		LFSUtilsAndroid.pause(10000);
		getNFKMalinatorPasswordRecoveryLinkLnk().waitForPresent();
		
		LFSUtilsAndroid.clickWithText("https://register.diabetes-dev.com");
		LFSUtilsAndroid.pause(10000);
		Reporter.logWithScreenShot("Reset password screen", MessageTypes.Pass);
		if(getNFKAgreetermsChk().isPresent())
			getNFKAgreetermsChk().click();
		getNFKResetPasswordTxt().waitForPresent();
		getNFKResetPasswordTxt().clear();
		getNFKResetPasswordTxt().sendKeys((String)ConfigurationManager.getBundle().getProperty("newPassword"));
		getNFKResetConfpasswordTxt().sendKeys((String)ConfigurationManager.getBundle().getProperty("newPassword"));
		getNFKResetPasswordSubmitBtn().click();
		Reporter.logWithScreenShot("after password reset to new password: " +pwd);
		
	}
}
