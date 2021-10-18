package com.NFK.version1.android.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class GoogleFitPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.connection.google.fit.lbl")
	private QAFWebElement NFKConnectionGoogleFitLbl;
	@FindBy(locator = "NFK.connection.google.fit.toggle.btn")
	private QAFWebElement NFKConnectionGoogleFitToggleBtn;
	@FindBy(locator = "NFK.connection.google.sync.message.txt")
	private QAFWebElement NFKConnectionGoogleSyncMessageTxt;
	@FindBy(locator = "NFK.connection.google.fit.enablenow.btn")
	private QAFWebElement NFKConnectionGoogleFitEnablenowBtn;
	@FindBy(locator = "NFK.connection.google.fit.cancel.btn")
	private QAFWebElement NFKConnectionGoogleFitCancelBtn;
	@FindBy(locator = "NFK.connection.google.fit.account.sync.text")
	private QAFWebElement NFKConnectionGoogleFitAccountSyncText;
	@FindBy(locator = "NFK.connection.google.fit.datatosynce.lbl")
	private QAFWebElement NFKConnectionGoogleFitDatatosynceLbl;
	@FindBy(locator = "NFK.connection.google.fit.notsyncedwithfit.lbl")
	private QAFWebElement NFKConnectionGoogleFitNotsyncedwithfitLbl;

	public QAFWebElement getNFKConnectionGoogleFitLbl() {
		return NFKConnectionGoogleFitLbl;
	}

	public QAFWebElement getNFKConnectionGoogleFitToggleBtn() {
		return NFKConnectionGoogleFitToggleBtn;
	}

	public QAFWebElement getNFKConnectionGoogleSyncMessageTxt() {
		return NFKConnectionGoogleSyncMessageTxt;
	}

	public QAFWebElement getNFKConnectionGoogleFitEnablenowBtn() {
		return NFKConnectionGoogleFitEnablenowBtn;
	}

	public QAFWebElement getNFKConnectionGoogleFitCancelBtn() {
		return NFKConnectionGoogleFitCancelBtn;
	}

	public QAFWebElement getNFKConnectionGoogleFitAccountSyncText() {
		return NFKConnectionGoogleFitAccountSyncText;
	}

	public QAFWebElement getNFKConnectionGoogleFitDatatosynceLbl() {
		return NFKConnectionGoogleFitDatatosynceLbl;
	}

	public QAFWebElement getNFKConnectionGoogleFitNotsyncedwithfitLbl() {
		return NFKConnectionGoogleFitNotsyncedwithfitLbl;
	}

	public void verifyPreConnectionAndConnect() {
		String geta = getNFKConnectionGoogleFitToggleBtn().getAttribute("text").toString();
		Reporter.logWithScreenShot(geta);
		if (getNFKConnectionGoogleFitToggleBtn().getText().toString()
				.equalsIgnoreCase("ON")) {
			Reporter.logWithScreenShot("User is already connected with Google Fit");
			getNFKConnectionGoogleFitToggleBtn().click();
			getNFKConnectionGoogleFitNotsyncedwithfitLbl().verifyPresent(
					"User is no more connected to Google Fit. You can reconnect to sync Google Fit data");
		} else if (getNFKConnectionGoogleFitToggleBtn().getText().toString()
				.equalsIgnoreCase("OFF")) {
			getNFKConnectionGoogleFitToggleBtn().click();
			getNFKConnectionGoogleSyncMessageTxt().verifyPresent(
					"Permission to sync information with Google fit popup is displayed");
			getNFKConnectionGoogleFitEnablenowBtn().click();
			getNFKConnectionGoogleFitAccountSyncText()
					.verifyPresent("Choose account to sync popup is displayed");
			getNFKConnectionGoogleFitAccountSyncText().click();
		}
	}

	public void verifySuccessfullConnectionWithGoogleFit() {
		if (getNFKConnectionGoogleFitToggleBtn().getAttribute("checked").toString()
				.equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("User is connected with Google Fit successfully");

		}
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
}
