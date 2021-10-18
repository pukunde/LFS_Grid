package com.NFK.version1.iOS.pages;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.NFK.support.ConstantUtils;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

public class EmailRegistrationIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	
	@FindBy(locator = "NFKios.malinator.email.txt")
	private QAFWebElement NFKiosMalinatorEmailTxt;
	@FindBy(locator = "NFKios.malinator.go.btn")
	private QAFWebElement NFKiosMalinatorGoBtn;
	@FindBy(locator = "NFKios.malinator.passwordrecovery.mail.txt")
	private QAFWebElement NFKiosMalinatorPasswordrecoveryMailTxt;
	@FindBy(locator = "NFKios.malinator.passwordRecoveryLink.lnk")
	private QAFWebElement NFKiosMalinatorPasswordRecoveryLinkLnk;
	@FindBy(locator = "NFKios.agreeterms.chk")
	private QAFWebElement NFKiosAgreetermsChk;
	@FindBy(locator = "NFKios.reset.password.txt")
	private QAFWebElement NFKiosResetPasswordTxt;
	@FindBy(locator = "NFKios.reset.confpassword.txt")
	private QAFWebElement NFKiosResetConfpasswordTxt;
	@FindBy(locator = "NFKios.reset.password.submit.btn")
	private QAFWebElement NFKiosResetPasswordSubmitBtn;
	@FindBy(locator = "NFKios.mailnator.openinbox.btn")
	private QAFWebElement NFKiosOpenInboxBtn;
	@FindBy(locator = "NFKios.mailnator.openinbox.btn")
	private QAFWebElement NFKiosMailnatorOpeninboxBtn;
	@FindBy(locator = "NFKios.safari.allTabs.btn")
	private QAFWebElement NFKiosSafariAllTabsBtn;
	@FindBy(locator = "NFKios.safari.tabs.private.btn")
	private QAFWebElement NFKiosSafariTabsPrivateBtn;
	@FindBy(locator = "NFKios.safari.tabs.done.btn")
	private QAFWebElement NFKiosSafariTabsDoneBtn;
	@FindBy(locator = "NFKios.safari.tabs.open.google.img")
	private QAFWebElement NFKiosSafariTabsOpenGoogleImg;

	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	public QAFWebElement getNFKiosMalinatorEmailTxt() {
		return NFKiosMalinatorEmailTxt;
	}

	public QAFWebElement getNFKiosMalinatorGoBtn() {
		return NFKiosMalinatorGoBtn;
	}

	public QAFWebElement getNFKiosMalinatorPasswordrecoveryMailTxt() {
		return NFKiosMalinatorPasswordrecoveryMailTxt;
	}

	public QAFWebElement getNFKiosMalinatorPasswordRecoveryLinkLnk() {
		return NFKiosMalinatorPasswordRecoveryLinkLnk;
	}

	public QAFWebElement getNFKiosAgreetermsChk() {
		return NFKiosAgreetermsChk;
	}

	public QAFWebElement getNFKiosResetPasswordTxt() {
		return NFKiosResetPasswordTxt;
	}

	public QAFWebElement getNFKiosResetConfpasswordTxt() {
		return NFKiosResetConfpasswordTxt;
	}

	public QAFWebElement getNFKiosResetPasswordSubmitBtn() {
		return NFKiosResetPasswordSubmitBtn;
	}
	
	public QAFWebElement getNFKiosOpenInboxBtn() {
		return NFKiosOpenInboxBtn;
	}

	public QAFWebElement getNFKiosSafariAllTabsBtn() {
		return NFKiosSafariAllTabsBtn;
	}

	public QAFWebElement getNFKiosSafariTabsPrivateBtn() {
		return NFKiosSafariTabsPrivateBtn;
	}

	public QAFWebElement getNFKiosSafariTabsDoneBtn() {
		return NFKiosSafariTabsDoneBtn;
	}

	public QAFWebElement getNFKiosSafariTabsOpenGoogleImg() {
		return NFKiosSafariTabsOpenGoogleImg;
	}

	
	private IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();

	public void openmMobileBrowser() {
		Map<String, Object> appName = new HashMap<>();
		appName.put("automation", "os");
		
		String command="mobile:browser:clean";
		String res = (String) driver.executeScript("mobile:browser:open", appName);
		
		Reporter.logWithScreenShot("script responce"+res);
		
		LFSUtilsIOS.switchToContext(iosDriver, "WEBVIEW");
		try {
			appName.put("timeout", "85");
            driver.executeScript(command, appName);
        } catch (Exception e) {
            System.err.println("Unable to clean app: " + appName);
        }
		iosDriver.manage().deleteAllCookies();
	
	}


	public void openMailinator() {
		driver.get("http://www.mailinator.com");
		Reporter.logWithScreenShot("browser open mailinator site");
		
	}
	
	public void enterMailId(String email) {
		openSafariInPrivetemode();
		openMailinator();
		getNFKiosMalinatorEmailTxt().waitForPresent();
		getNFKiosMalinatorEmailTxt().clear();
		getNFKiosMalinatorEmailTxt().sendKeys(email);
		getNFKiosMalinatorGoBtn().waitForPresent();
		getNFKiosMalinatorGoBtn().click();
		
		Reporter.logWithScreenShot("Malinaotor inbox open");
		
	}
	
public void changePassword() {
	LFSUtilsIOS.pause(10000);
	String pwd=RandomStringUtils.randomAlphanumeric(8)+"1#";
	ConfigurationManager.getBundle().setProperty("newPassword", pwd);
	getNFKiosMalinatorPasswordrecoveryMailTxt().waitForPresent(90);
	getNFKiosMalinatorPasswordrecoveryMailTxt().click();
	getNFKiosMalinatorPasswordRecoveryLinkLnk().waitForPresent();

	LFSUtilsIOS.clickWithText("https://register.diabetes-dev.com");
	LFSUtilsIOS.pause(10000);
	if(getNFKiosAgreetermsChk().isPresent())
		getNFKiosAgreetermsChk().click();
	Reporter.logWithScreenShot("Reset password screen", MessageTypes.Pass);
	
	getNFKiosResetPasswordTxt().waitForPresent();
	getNFKiosResetPasswordTxt().clear();
	getNFKiosResetPasswordTxt().sendKeys((String)ConfigurationManager.getBundle().getProperty("newPassword"));
	getNFKiosResetConfpasswordTxt().sendKeys((String)ConfigurationManager.getBundle().getProperty("newPassword"));
	
	getNFKiosResetPasswordSubmitBtn().click();
	Reporter.logWithScreenShot("after password reset" +pwd);
	
}

public void openSafariInPrivetemode() {
	LFSUtilsIOS.switchToContext(iosDriver, "NATIVE");
	getNFKiosSafariAllTabsBtn().waitForPresent();
	getNFKiosSafariAllTabsBtn().click();
	getNFKiosSafariTabsPrivateBtn().waitForPresent();
	getNFKiosSafariTabsPrivateBtn().click();
	getNFKiosSafariTabsPrivateBtn().waitForPresent();
	getNFKiosSafariTabsPrivateBtn().click();
	getNFKiosSafariTabsDoneBtn().waitForPresent();
	getNFKiosSafariTabsDoneBtn().click();
	if(getNFKiosSafariTabsOpenGoogleImg().isPresent())
	getNFKiosSafariTabsOpenGoogleImg().click();
	LFSUtilsIOS.switchToContext(iosDriver, "WEBVIEW");
}

	}
