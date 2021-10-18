package com.NFK.version1.android.pages;

import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class MyMeters extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.mymeterspage.title.lbl")
	private QAFWebElement NFKMymeterspageTitleLbl;

	@FindBy(locator = "NFK.mymeterspage.backgroundChange.lbl")
	private QAFWebElement NFKMymeterspageBackgroundChangeLbl;

	@FindBy(locator = "NFK.mymeterspage.timechangemessage.txt")
	private QAFWebElement NFKMymeterspageTimechangemessageTxt;

	@FindBy(locator = "NFK.mymeterspage.backgroundSync.switch")
	private QAFWebElement NFKMymeterspageBackgroundSyncSwitch;

	@FindBy(locator = "NFK.mymeterspage.pairanotherdevice.txt")
	private QAFWebElement NFKMymeterspagePairanotherdeviceTxt;

	@FindBy(locator = "NFK.mymeterspage.pairanotherdeviceadd.btn")
	private QAFWebElement NFKMymeterspagePairanotherdeviceaddBtn;
	
	@FindBy(locator = "NFK.mymeterspage.pairmeterback.btn")
	private QAFWebElement NFKMymeterspagePairmeterbackBtn;

	@FindBy(locator = "NFK.mymeterspage.pairmeter.cancel.btn")
	private QAFWebElement NFKMymeterspagePairmeterCancelBtn;

	@FindBy(locator = "NFK.mymeterspage.pairmeter.verioflex.img")
	private QAFWebElement NFKMymeterspagePairmeterVerioflexImg;

	@FindBy(locator = "NFK.mymeterpage.pairmeter.next.btn")
	private QAFWebElement NFKMymeterpagePairmeterNextBtn;

	@FindBy(locator = "NFK.mymeterpage.pairmeter.continue.btn")
	private QAFWebElement NFKMymeterpagePairmeterContinueBtn;

	@FindBy(locator = "NFK.mymeterpage.pairmeter.popup.cancel.btn")
	private QAFWebElement NFKMymeterpagePairmeterPopupCancelBtn;

	public QAFWebElement getNFKMymeterspagePairanotherdeviceaddBtn() {
		return NFKMymeterspagePairanotherdeviceaddBtn;
	}

	public QAFWebElement getNFKMymeterspageTitleLbl() {
		return NFKMymeterspageTitleLbl;
	}

	public QAFWebElement getNFKMymeterspageBackgroundChangeLbl() {
		return NFKMymeterspageBackgroundChangeLbl;
	}

	public QAFWebElement getNFKMymeterspageTimechangemessageTxt() {
		return NFKMymeterspageTimechangemessageTxt;
	}

	public QAFWebElement getNFKMymeterspageBackgroundSyncSwitch() {
		return NFKMymeterspageBackgroundSyncSwitch;
	}

	public QAFWebElement getNFKMymeterspagePairanotherdeviceTxt() {
		return NFKMymeterspagePairanotherdeviceTxt;
	}

	public QAFWebElement getNFKMymeterspagePairmeterbackBtn() {
		return NFKMymeterspagePairmeterbackBtn;
	}

	public QAFWebElement getNFKMymeterspagePairmeterCancelBtn() {
		return NFKMymeterspagePairmeterCancelBtn;
	}

	public QAFWebElement getNFKMymeterspagePairmeterVerioflexImg() {
		return NFKMymeterspagePairmeterVerioflexImg;
	}

	public QAFWebElement getNFKMymeterpagePairmeterNextBtn() {
		return NFKMymeterpagePairmeterNextBtn;
	}

	public QAFWebElement getNFKMymeterpagePairmeterContinueBtn() {
		return NFKMymeterpagePairmeterContinueBtn;
	}

	public QAFWebElement getNFKMymeterpagePairmeterPopupCancelBtn() {
		return NFKMymeterpagePairmeterPopupCancelBtn;
	}
	
	HomePageAndroid homePageAndroid = new HomePageAndroid();
	// Method to verify My Meters UI
	public void myMetersUI() {
		getNFKMymeterspagePairanotherdeviceaddBtn().verifyPresent("Pair Another Device Button Present");
		getNFKMymeterspageBackgroundChangeLbl().verifyPresent("Background sync label");
		getNFKMymeterspageBackgroundSyncSwitch().verifyPresent("Background sync switch");
		getNFKMymeterspageTitleLbl().verifyPresent("My Meters page Header Present");
	}

	

	public void timeUpdate() {
		Boolean timeChangeSwitch = getNFKMymeterspageBackgroundSyncSwitch().isSelected();
		if (timeChangeSwitch == true) {
			Reporter.logWithScreenShot("Background Switch On by Default");
		} else {
			getNFKMymeterspageBackgroundSyncSwitch().click();
			getNFKMymeterspageBackgroundSyncSwitch().isSelected();
		}
		timeChangeSwitch.compareTo(timeChangeSwitch);
		Reporter.logWithScreenShot("Background Switch Turned on by User");
	}

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub

	}

	@FindBy(locator = "NFK.mymeterspage.meter1.img")
	private QAFWebElement NFKMymeterspageMeter1Img;
	
	public QAFWebElement getNFKMymeterspageMeter1Img() {
		return NFKMymeterspageMeter1Img;
	}
	
	public void clickToPairMeter() {
		getNFKMymeterspagePairanotherdeviceaddBtn().waitForPresent();
		getNFKMymeterspagePairanotherdeviceaddBtn().click();
		Reporter.logWithScreenShot("My Meter Connect page", MessageTypes.Pass);
		getNFKMymeterpagePairmeterContinueBtn().verifyPresent("Next Button to proceed further is present");
		getNFKMymeterspagePairmeterCancelBtn().verifyPresent("Cancel button on select your meter screen");
		getNFKMymeterpagePairmeterContinueBtn().click();
		getNFKMymeterspagePairmeterCancelBtn().verifyPresent("Cancel button on turn on Bluetooth screen");
		getNFKMymeterpagePairmeterContinueBtn().verifyPresent("Continue button to turn on Bluetooth is present");
		getNFKMymeterpagePairmeterContinueBtn().click();
		getNFKMymeterpagePairmeterPopupCancelBtn().waitForPresent();
		Reporter.logWithScreenShot("Meter not found popup is displayed", MessageTypes.Pass);
		getNFKMymeterpagePairmeterPopupCancelBtn().click();

	}

	public void navigateToHomepage() {
		homePageAndroid.getNFKHomepageeventlogBtn().verifyPresent("Redirects to homepage");
	}
	
	//Method to initiate meter pairing
	public void initiateMeterPairing() {
		getNFKMymeterspagePairanotherdeviceaddBtn().waitForPresent();
		getNFKMymeterspagePairanotherdeviceaddBtn().click();
		Reporter.logWithScreenShot("My Meter Connect page", MessageTypes.Pass);
		getNFKMymeterpagePairmeterNextBtn().verifyPresent("Next Button to proceed further is present");
		getNFKMymeterspagePairmeterCancelBtn().verifyPresent("Cancel button on select your meter screen");
		getNFKMymeterpagePairmeterNextBtn().click();
		getNFKMymeterspagePairmeterCancelBtn().verifyPresent("Cancel button on turn on Bluetooth screen");
	}
		
	public void cancelOnMeterNotFoundPopUp() {
		getNFKMymeterpagePairmeterPopupCancelBtn().waitForPresent();
		Reporter.logWithScreenShot("Meter not found popup is displayed", MessageTypes.Pass);
		getNFKMymeterpagePairmeterPopupCancelBtn().click();
	}
		
	public void meterSyncStart() {
		getNFKMymeterpagePairmeterContinueBtn().click();
	}

}