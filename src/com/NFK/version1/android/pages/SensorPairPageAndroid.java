package com.NFK.version1.android.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.steps.winium_stepDef;
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
import io.appium.java_client.android.AndroidDriver;

public class SensorPairPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	private static AndroidDriver androidDriver = ((AndroidDriver) new WebDriverTestCase().getDriver()
			.getUnderLayingDriver());

	@Override
	protected void openPage(PageLocator locator, Object... args) {

	}

	@FindBy(locator = "NFK.sensorpairpage.title")
	private QAFWebElement NFKsensorpairpagetitle;
	@FindBy(locator = "NFK.sensorpairpage.sensorpairpage.sensor.skip.btn")
	private QAFWebElement NFKSensorpairpageSensorpairpageSensorSkipBtn;
	@FindBy(locator = "NFK.sensorpairpage.code.field")
	private QAFWebElement NFKSensorpairpageCodeField;
	@FindBy(locator = "NFK.sensorpairpage.next.button")
	private QAFWebElement NFKSensorpairpageNextButton;
	@FindBy(locator = "NFK.sensorpairpage.applysensor.title")
	private QAFWebElement NFKSensorpairpageApplysensorTitle;
	@FindBy(locator = "NFK.sensorpairpage.applysensor.next.button")
	private QAFWebElement NFKSensorpairpageApplysensorNextButton;
	@FindBy(locator = "NFK.sensorpairpage.applysensor.rightabdomen.btn")
	private QAFWebElement NFKSensorpairpageApplysensorRightabdomenBtn;
	@FindBy(locator = "NFK.sensorpairpage.applysensor.leftabdomen.btn")
	private QAFWebElement NFKSensorpairpageApplysensorLeftabdomenBtn;
	@FindBy(locator = "NFK.sensorpairpage.applysensor.leftarm.btn")
	private QAFWebElement NFKSensorpairpageApplysensorLeftarmBtn;
	@FindBy(locator = "NFK.sensorpairpage.applysensor.rightarm.btn")
	private QAFWebElement NFKSensorpairpageApplysensorRightarmBtn;
	@FindBy(locator = "NFK.sensorpairpage.applysensor.howtoapply.btn")
	private QAFWebElement NFKSensorpairpageApplysensorHowtoapplyBtn;
	@FindBy(locator = "NFK.sensorpairpage.applysensor.footer.lbl")
	private QAFWebElement NFKSensorpairpageApplysensorFooterLbl;
	@FindBy(locator = "NFK.sensorpairpage.start.session.btn")
	private QAFWebElement NFKSensorpairpageStartSessionBtn;
	@FindBy(locator = "NFK.apply.sensor.scrn.back.btn")
	private QAFWebElement NFKApplysensorbackbtn;
	@FindBy(locator = "NFK.apply.sensor.title")
	private QAFWebElement NFKApplysensorTitle;
	@FindBy(locator = "NFK.apply.sensor.text1")
	private QAFWebElement NFKApplysensorText1;
	@FindBy(locator = "NFK.apply.sensor.how.to.apply.sensor.link")
	private QAFWebElement NFKApplysensorHowtoapplysensorlink;
	@FindBy(locator = "NFK.apply.sensor.text2")
	private QAFWebElement NFKApplysensorText2;
	@FindBy(locator = "NFK.how.to.apply.sensor.scrn.back.btn")
	private QAFWebElement NFKhowtoapplysenorbackbtn;
	@FindBy(locator = "NFK.how.to.apply.sensor.title")
	private QAFWebElement NFKhowtoapplysensorTitle;
	@FindBy(locator = "NFK.how.to.apply.sensor.pair.btn")
	private QAFWebElement NFKhowtoapplysensorpairbtn;
	@FindBy(locator = "NFK.how.to.apply.sensor.helpful.tips.link")
	private QAFWebElement NFKhowtoapplysensorhelpfultiplink;
	@FindBy(locator = "NFK.how.to.apply.sensor.helpful.tips.scrn.title")
	private QAFWebElement NFKhowtoapplysensorhelpfultiplinktitle;
	@FindBy(locator = "NFK.how.to.apply.sensor.helpful.tips.scrn.X.btn")
	private QAFWebElement NFKhowtoapplysensorhelpfultiplinkXbtn;
	@FindBy(locator = "NFK.sensorpairpage.applysensor.leftbuttock.btn")
	private QAFWebElement NFKSensorpairpageApplysensorleftbuttockBtn;
	@FindBy(locator = "NFK.sensorpairpage.applysensor.rightbuttock.btn")
	private QAFWebElement getNFKSensorpairpageApplysensorRightbuttockBtn;
	@FindBy(locator = "NFK.location.deny.btn")
	private QAFWebElement NFKLocationDenyBtn;
	@FindBy(locator = "NFK.location.allow.btn")
	private QAFWebElement NFKLocationAllowBtn;
	@FindBy(locator = "NFK.location.message.txt")
	private QAFWebElement NFKLocationMessageTxt;
	@FindBy(locator = "NFK.location.permission.icon")
	private QAFWebElement NFKLocationPermissionIcon;

	public QAFWebElement getNFKLocationDenyBtn() {
		return NFKLocationDenyBtn;
	}

	public QAFWebElement getNFKLocationAllowBtn() {
		return NFKLocationAllowBtn;
	}

	public QAFWebElement getNFKLocationMessageTxt() {
		return NFKLocationMessageTxt;
	}

	public QAFWebElement getNFKLocationPermissionIcon() {
		return NFKLocationPermissionIcon;
	}

	public QAFWebElement getNFKSensorpairpageApplysensorRightbuttockBtn() {
		return getNFKSensorpairpageApplysensorRightbuttockBtn;
	}

	public QAFWebElement getNFKsensorpairpagetitle() {
		return NFKsensorpairpagetitle;
	}

	public QAFWebElement getNFKSensorpairpageSensorpairpageSensorSkipBtn() {
		return NFKSensorpairpageSensorpairpageSensorSkipBtn;
	}

	public QAFWebElement getNFKSensorpairpageCodeField() {
		return NFKSensorpairpageCodeField;
	}

	public QAFWebElement getNFKSensorpairpageStartSessionBtn() {
		return NFKSensorpairpageStartSessionBtn;
	}

	public QAFWebElement getNFKSensorpairpageNextButton() {
		return NFKSensorpairpageNextButton;
	}

	public QAFWebElement getNFKSensorpairpageApplysensorRightabdomenBtn() {
		return NFKSensorpairpageApplysensorRightabdomenBtn;
	}

	public QAFWebElement getNFKSensorpairpageApplysensorLeftabdomenBtn() {
		return NFKSensorpairpageApplysensorLeftabdomenBtn;
	}

	public QAFWebElement getNFKSensorpairpageApplysensorLeftarmBtn() {
		return NFKSensorpairpageApplysensorLeftarmBtn;
	}

	public QAFWebElement getNFKSensorpairpageApplysensorRightarmBtn() {
		return NFKSensorpairpageApplysensorRightarmBtn;
	}

	public QAFWebElement getNFKSensorpairpageApplysensorHowtoapplyBtn() {
		return NFKSensorpairpageApplysensorHowtoapplyBtn;
	}

	public QAFWebElement getNFKSensorpairpageApplysensorFooterLbl() {
		return NFKSensorpairpageApplysensorFooterLbl;
	}

	public QAFWebElement getNFKSensorpairpageApplysensorTitle() {
		return NFKSensorpairpageApplysensorTitle;
	}

	public QAFWebElement getNFKSensorpairpageApplysensorNextButton() {
		return NFKSensorpairpageApplysensorNextButton;
	}

	public QAFWebElement getNFKSensorpairpageApplysensorleftbuttockBtn() {
		return NFKSensorpairpageApplysensorleftbuttockBtn;
	}

	public QAFWebElement getNFKhowtoapplysensorhelpfultiplinkXbtn() {
		return NFKhowtoapplysensorhelpfultiplinkXbtn;
	}

	public QAFWebElement getNFKhowtoapplysensorhelpfultiplinktitle() {
		return NFKhowtoapplysensorhelpfultiplinktitle;
	}

	public QAFWebElement getNFKhowtoapplysensorhelpfultiplink() {
		return NFKhowtoapplysensorhelpfultiplink;
	}

	public QAFWebElement getNFKhowtoapplysensorpairbtn() {
		return NFKhowtoapplysensorpairbtn;
	}

	public QAFWebElement getNFKhowtoapplysensorTitle() {
		return NFKhowtoapplysensorTitle;
	}

	public QAFWebElement getNFKhowtoapplysenorbackbtn() {
		return NFKhowtoapplysenorbackbtn;
	}

	public QAFWebElement getNFKApplysensorText2() {
		return NFKApplysensorText2;
	}

	public QAFWebElement getNFKApplysensorHowtoapplysensorlink() {
		return NFKApplysensorHowtoapplysensorlink;
	}

	public QAFWebElement getNFKApplysensorText1() {
		return NFKApplysensorText1;
	}

	public QAFWebElement getNFKApplysensorTitle() {
		return NFKApplysensorTitle;
	}

	public QAFWebElement getNFKApplysensorbackbtn() {
		return NFKApplysensorbackbtn;
	}

	HomePageAndroid homebtn = new HomePageAndroid();

	public void entersensorCode() {
		LFSUtilsAndroid.waitforLoad();
		getNFKsensorpairpagetitle().isDisplayed();
		getNFKSensorpairpageCodeField().assertPresent("Code field");
		LFSUtilsAndroid.waitforLoad();
		getNFKSensorpairpageCodeField().click();
		getNFKSensorpairpageCodeField().sendKeys("123456789");

		if (getNFKSensorpairpageNextButton().isEnabled())
			getNFKSensorpairpageNextButton().click();
		else {
			getNFKSensorpairpageNextButton().waitForEnabled(200);
			getNFKSensorpairpageNextButton().click();
		}
		Reporter.logWithScreenShot("Sensor code is entered ", MessageTypes.Pass);

	}

	public void selectbodyLocation(String location) {
		getNFKSensorpairpageApplysensorTitle().waitForPresent();
		getNFKSensorpairpageApplysensorTitle().isPresent();
		switch (location) {
		case "LEFTABDOMEN":
			getNFKSensorpairpageApplysensorLeftabdomenBtn().waitForPresent();
			getNFKSensorpairpageApplysensorLeftabdomenBtn().click();
			break;

		case "RIGHTABDOMEN":
			getNFKSensorpairpageApplysensorRightabdomenBtn().waitForPresent();
			getNFKSensorpairpageApplysensorRightabdomenBtn().click();
			break;

		case "LEFTARM":
			getNFKSensorpairpageApplysensorLeftarmBtn().waitForPresent();
			getNFKSensorpairpageApplysensorLeftarmBtn().click();
			break;

		case "RIGHTARM":
			getNFKSensorpairpageApplysensorRightarmBtn().waitForPresent();
			getNFKSensorpairpageApplysensorRightarmBtn().click();
			break;

		case "LEFTBUTTOCK":
			getNFKSensorpairpageApplysensorleftbuttockBtn().waitForPresent();
			getNFKSensorpairpageApplysensorleftbuttockBtn().click();
			break;

		case "RIGHTBUTTOCK":
			getNFKSensorpairpageApplysensorRightbuttockBtn().waitForPresent();
			getNFKSensorpairpageApplysensorRightbuttockBtn().click();
			break;
		}
		Reporter.logWithScreenShot("The user selected the body location ", MessageTypes.Pass);
		getNFKSensorpairpageApplysensorNextButton().waitForEnabled();
		getNFKSensorpairpageApplysensorNextButton().click();
	}

	public void connectingtoSensor() {

		try {
			// wait until sensor connects
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homebtn.getNFKHomepageHomeBtn().waitForVisible(1000);

	}

	public void selectSensorSession() {
		getNFKSensorpairpageStartSessionBtn().isPresent();
		getNFKSensorpairpageStartSessionBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("User has selected the Start Session", MessageTypes.Pass);
	}

	public void clickEditText() {

		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		// getNFKSensorpairpageCodeField().assertPresent("Code field");
		// System.out.println("Getting the elemnts-"+appium.getPageSource());
		getNFKsensorpairpagetitle().isPresent();
		getNFKSensorpairpageCodeField().click();
		System.out.println("Code field");
	}

	// Verfiy apply sesnsor screen

	public void verifyapplysensor() {
		getNFKApplysensorbackbtn().isPresent();
		getNFKApplysensorTitle().isDisplayed();
		getNFKApplysensorText1().isPresent();
		getNFKSensorpairpageApplysensorRightabdomenBtn().assertPresent("RightAbdomen");
		getNFKSensorpairpageApplysensorLeftabdomenBtn().assertPresent("leftAbdomen");
		getNFKSensorpairpageApplysensorRightarmBtn().assertPresent("rightarm");
		getNFKSensorpairpageApplysensorLeftarmBtn().assertPresent("Leftarm");
		;
		getNFKApplysensorHowtoapplysensorlink().assertPresent("How to Apply Sensor Link");
		getNFKApplysensorText2().assertPresent();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Apply Sensor screen", MessageTypes.Pass);
	}

	// Verfiy how to apply sensor link screen

	public void verifyhowtoapplysensorlink() {
		System.out.println("Verifying How to apply sensor screen");
		getNFKApplysensorHowtoapplysensorlink().click();
		getNFKhowtoapplysenorbackbtn().isPresent();
		getNFKhowtoapplysensorTitle().isDisplayed();
		getNFKhowtoapplysensorpairbtn().isPresent();
		Reporter.logWithScreenShot("How to apply senor screen with images1", MessageTypes.Pass);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("How to apply senor screen with images2", MessageTypes.Pass);
		getNFKhowtoapplysensorhelpfultiplink().isPresent();
		LFSUtilsAndroid.waitforLoad();
	}

	public void verifyhelpfultipslink() {
		System.out.println("Verify Helpfultips screen");
		getNFKhowtoapplysensorhelpfultiplink().click();
		Reporter.logWithScreenShot("HelpFul tips screen", MessageTypes.Pass);
		getNFKhowtoapplysensorhelpfultiplinktitle().isPresent();
		getNFKhowtoapplysensorhelpfultiplinkXbtn().isPresent();
		getNFKhowtoapplysensorhelpfultiplinkXbtn().isEnabled();
		getNFKhowtoapplysensorhelpfultiplinkXbtn().click();
		LFSUtilsAndroid.waitforLoad();
		getNFKhowtoapplysenorbackbtn().click();
		Reporter.logWithScreenShot("User is on apply sensor screen", MessageTypes.Pass);
		LFSUtilsAndroid.waitforLoad();
	}

	public void verifyapplysensor2to6yrold() {
		getNFKApplysensorbackbtn().isPresent();
		getNFKApplysensorTitle().isDisplayed();
		getNFKApplysensorText1().isPresent();
		getNFKSensorpairpageApplysensorleftbuttockBtn().assertPresent("Rightbuttock");
		getNFKSensorpairpageApplysensorRightbuttockBtn().assertPresent("leftbuttock");
		getNFKApplysensorHowtoapplysensorlink().assertPresent("");
		getNFKApplysensorText2().assertPresent();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Sensor code is entered ", MessageTypes.Pass);
	}

	public void checkLocationAccessPOpup() {
		getNFKSensorpairpageApplysensorNextButton().click();
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.findText("Deny");
		LFSUtilsAndroid.findText("Allow");
		LFSUtilsAndroid.clickWithText("Allow only while using the app");
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("After click on Allow Popup", MessageTypes.Pass);

	}


	// Emulator automation

	@FindBy(locator = "NFK.signuppage.safety.next.btn")
	private QAFWebElement NFKSignuppageSafetyNextBtn;

	@FindBy(locator = "NFK.sensorpairpage.passkey")
	private QAFWebElement NFKSensorpairPagePasskey;

	@FindBy(locator = "NFK.sensorpairpage.OK.btn")
	private QAFWebElement NFKSensorpairpageOKBtn;

	@FindBy(locator = "NFK.sensorpairpage.allow")
	private QAFWebElement NFKSensorpairPageAllow;

	@FindBy(locator = "NFK.sensorpairpage.notNow")
	private QAFWebElement NFKSensorpairpageNotNow;

	@FindBy(locator = "NFK.sensorpairpage.reading")
	private QAFWebElement NFKSensorpairpageReading;

	public QAFWebElement getNFKsignuppagesafetynextbtn() {
		return NFKSignuppageSafetyNextBtn;
	}

	public QAFWebElement getNFKSensorpairPagePasskey() {
		return NFKSensorpairPagePasskey;
	}

	public QAFWebElement getNFKSensorpairpageOKBtn() {
		return NFKSensorpairpageOKBtn;
	}

	public QAFWebElement getNFKSensorpairPageAllow() {
		return NFKSensorpairPageAllow;
	}

	public QAFWebElement getNFKSensorpairpageNotNow() {
		return NFKSensorpairpageNotNow;
	}

	public QAFWebElement getNFKSensorpairpageReading() {
		return NFKSensorpairpageReading;
	}

	public void selectsNextButtonStartPairing() {
		getNFKsignuppagesafetynextbtn().waitForPresent();
		getNFKsignuppagesafetynextbtn().click();
		LFSUtilsAndroid.pause(12000);
	}

	public void enterPasskeyAndVerifyRedingDisplayedOnHomeScreen() {
		getNFKSensorpairPagePasskey().sendKeys(winium_stepDef.passkey);
		LFSUtilsAndroid.pause(3000);
		getNFKSensorpairpageOKBtn().click();
		getNFKSensorpairpageOKBtn().click();

		LFSUtilsAndroid.pause(3000);
		try {
			if (getNFKSensorpairpageOKBtn().isDisplayed()) {
				getNFKSensorpairpageOKBtn().click();
			}
		} catch (Exception e) {

		}
		verifySensorReadingOnHomeScreen();
		Reporter.log("Successfully paired sensor", MessageTypes.Pass);
	}

	public void clickOnAllowButton() {
		getNFKSensorpairPageAllow().click();
		LFSUtilsAndroid.pause(5000);

	}

	public void clickOnNotNowButton() {
		getNFKSensorpairpageNotNow().click();
		LFSUtilsAndroid.pause(18000);

	}
	
	public void verifySensorReadingOnHomeScreen() {
		getNFKSensorpairpageReading().verifyPresent();
		Reporter.logWithScreenShot("Reading displayed successfully on homescreen", MessageTypes.Pass);
	}
	
	public QAFWebElement getNFKSignuppageTimeStaticText(String text) {
		return LFSUtilsAndroid.getElement("NFK.signuppage.dynamic.txt", text);
	}
	

	public void eneterPasskey() {
		getNFKSensorpairPagePasskey().sendKeys(winium_stepDef.passkey);
		getNFKSensorpairpageOKBtn().click();
		LFSUtilsAndroid.pause(3000);
	}
	
	public void closeSensorExpirePopup() {
		try{
			if(getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("sensor.expires.popup.title")).isDisplayed()) {
			getNFKSensorpairpageOKBtn().click();
			LFSUtilsAndroid.pause(3000);
			}
		}catch (Exception e) {
			Reporter.logWithScreenShot("Sensor expires alert not displayed", MessageTypes.Pass);
		}
	}
	
	public void verifySensorWarmupAlertAndClose() {
	try {	getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("sensor.warmup.alert"))
		.verifyPresent("Sensor warmup alert title");
//		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("sensor.warmup.alert.content"))
//		.verifyPresent("Sensor warmup alert content");
		getNFKSensorpairpageOKBtn().verifyPresent("Sensor warmup alert OK Button");
		getNFKSensorpairpageOKBtn().click();	
		Reporter.logWithScreenShot("Successfully verified sensor warmup alert and closed it", MessageTypes.Pass);
	}catch (Exception e) {
		Reporter.logWithScreenShot("Sensor warmup alert not displayed", MessageTypes.Pass);
	}

	}


}
