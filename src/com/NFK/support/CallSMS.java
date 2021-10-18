package com.NFK.support;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class CallSMS extends WebDriverBaseTestPage<WebDriverTestPage>{
	
	@FindBy(locator = "otr.popupcall.answer")
	private QAFWebElement otriosPopupcallAnswer;
	@FindBy(locator = "otr.popupcall.end")
	private QAFWebElement otriosPopupcallEnd;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	
	
	public QAFWebElement getOtriosPopupcallEnd() {
		return otriosPopupcallEnd;
	}
	public QAFWebElement getOtriosPopupcallAnswer() {
		return otriosPopupcallAnswer;
	}
	
	
	AppiumDriver driver =
			(AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
	public void callDevice(String deviceID)
	{
		switchToContext(driver, "NATIVE_APP");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("to.number", deviceID);
		Object result4 = driver.executeScript("mobile:gateway:call", params);
		LFSUtilsAndroid.pause(4000);
		Reporter.log("got call", MessageTypes.Pass);
	}
	public void SMSDevice(String deviceID,String mobNumber,String messageBody)
	{
		Map<String, Object> pars = new HashMap<>();
		pars.put("to.number", mobNumber);
		pars.put("body", messageBody);
		String reStr = (String) driver.executeScript("mobile:gateway:sms", pars);
		Reporter.log("on call", MessageTypes.Pass);
	}
	
	public void acceptCall()
	{
		
		GUIMethods gs=new GUIMethods();
		gs.waitforImageText(driver,"ANSWER",4);
		QAFWebElement answer = (QAFWebElement) driver.findElement(By.id("com.android.incallui:id/popup_call_answer"));
		answer.waitForPresent();
		driver.findElement(By.id("com.android.incallui:id/popup_call_answer")).click();
		Reporter.log("accept call", MessageTypes.Pass);
		LFSUtilsAndroid.pause(500);
		Reporter.log("accept call1", MessageTypes.Pass);
	}
	
	public void rejectCall()
	{
		GUIMethods gs=new GUIMethods();
		gs.waitforImageText(driver,"DECLINE",4);
		Map<String, Object> params = new HashMap<>();
		params.put("label", "DECLINE");
		params.put("threshold", 80);
		Reporter.log("before rejecting call", MessageTypes.Pass);
		driver.executeScript("mobile:button-text:click", params);
	}
	
	public void endCall()
	{
		getOtriosPopupcallEnd().waitForPresent();
		getOtriosPopupcallEnd().click();
		Reporter.log("ending call", MessageTypes.Pass);
	}
	public static void switchToContext(RemoteWebDriver driver, String context) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(driver);
        Map<String,String> params = new HashMap<String,String>();
        params.put("name", context);
        executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
    }
	public void openCall() {
		AndroidDriver androidDriver = ((AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver());
		androidDriver.startActivity(new Activity("com.samsung.android.contacts","com.android.dialer.DialtactsActivity"));
	}
}
