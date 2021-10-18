package com.NFK.version1.android.pages;

import org.testng.Assert;

import com.NFK.support.LFSUtilsAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.android.AndroidDriver;

public class ContactusPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.homepage.moremenu.contactus.contactus.lbl")
	private QAFWebElement NFKHomepageMoremenuContactusContactusLbl;
	@FindBy(locator = "NFK.homepage.moremenu.contactus.email.lnk")
	private QAFWebElement NFKHomepageMoremenuContactusEmailLnk;
	@FindBy(locator = "NFK.homepage.moremenu.contactus.phno.lnk")
	private QAFWebElement NFKHomepageMoremenuContactusPhnoLnk;
	@FindBy(locator = "NFK.homepage.moremenu.contactus.website.lnk")
	private QAFWebElement NFKHomepageMoremenuContactusWebsiteLnk;
	@FindBy(locator = "NFK.homepage.moremenu.contactus.appversion.lbl")
	private QAFWebElement NFKHomepageMoremenuContactusAppversionLbl;
	@FindBy(locator = "NFK.homepage.moremenu.contactus.appversionnnumber.lbl")
	private QAFWebElement NFKHomepageMoremenuContactusAppversionnnumberLbl;
	@FindBy(locator = "NFK.homepage.moremenu.contactus.mobileos.lbl")
	private QAFWebElement NFKHomepageMoremenuContactusMobileosLbl;
	@FindBy(locator = "NFK.homepage.moremenu.contactus.mobileosnumber.lbl")
	private QAFWebElement NFKHomepageMoremenuContactusMobileosnumberLbl;
	@FindBy(locator = "NFK.homepage.moremenu.contactus.rateapp.lnk")
	private QAFWebElement NFKHomepageMoremenuContactusRateAppLnk;

	public QAFWebElement getNFKHomepageMoremenuContactusRateAppLnk() {
		return NFKHomepageMoremenuContactusRateAppLnk;
	}

	public QAFWebElement getNFKhomepagemoremenucontactuscontactuslbl() {
		return NFKHomepageMoremenuContactusContactusLbl;
	}

	public QAFWebElement getNFKhomepagemoremenucontactusemaillnk() {
		return NFKHomepageMoremenuContactusEmailLnk;
	}

	public QAFWebElement getNFKhomepagemoremenucontactusphnolnk() {
		return NFKHomepageMoremenuContactusPhnoLnk;
	}

	public QAFWebElement getNFKhomepagemoremenucontactuswebsitelnk() {
		return NFKHomepageMoremenuContactusWebsiteLnk;
	}

	public QAFWebElement getNFKhomepagemoremenucontactusappversionlbl() {
		return NFKHomepageMoremenuContactusAppversionLbl;
	}

	public QAFWebElement getNFKhomepagemoremenucontactusappversionnnumberlbl() {
		return NFKHomepageMoremenuContactusAppversionnnumberLbl;
	}

	public QAFWebElement getNFKhomepagemoremenucontactusmobileoslbl() {
		return NFKHomepageMoremenuContactusMobileosLbl;
	}

	public QAFWebElement getNFKhomepagemoremenucontactusmobileosnumberlbl() {
		return NFKHomepageMoremenuContactusMobileosnumberLbl;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	// Method to Verify Contact Us page from more menu
	public void verifyContactUsPage() {
		
		getNFKhomepagemoremenucontactuscontactuslbl().waitForPresent();
		getNFKhomepagemoremenucontactusemaillnk().verifyPresent("Email Link to Contact Customer helpdesk");
		getNFKhomepagemoremenucontactusphnolnk().verifyPresent("Phone Number to Contact Customer helpdesk");
		getNFKhomepagemoremenucontactuswebsitelnk().verifyPresent("Website to visit for Customer Support");
		Reporter.logWithScreenShot("Contact Us Page", MessageTypes.Pass);
	}

	// Method to verify available email id for customer service
	public void verifyEmail() {
		LFSUtilsAndroid.waitforLoad();
		String getMail = getNFKhomepagemoremenucontactusemaillnk().getText().toString();
		/*getNFKhomepagemoremenucontactusemaillnk().click();
		Reporter.logWithScreenShot("Mail Options in Android", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsAndroid.clickBackButton();*/
	   Assert.assertEquals(getMail, LFSUtilsAndroid.getPropString("contact.email"));
	   Reporter.logWithScreenShot("Email for Contact",MessageTypes.Pass);
	}

	// Method to call available customer care number
	public void callNumber() {
		getNFKhomepagemoremenucontactusphnolnk().waitForPresent();
	Assert.assertEquals(getNFKhomepagemoremenucontactusphnolnk().getText(),LFSUtilsAndroid.getPropString("contact.service.phoneno"));
	Reporter.log("User verified the Phone no.");
	}

	// Method to visit application portal
	public void visitSite() {
		if (!(getNFKhomepagemoremenucontactuswebsitelnk().isPresent())){
			LFSUtilsAndroid.clickBackButton();
			System.out.println("Back button clicked two times");
		}
		getNFKhomepagemoremenucontactuswebsitelnk().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Application Website", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	// Method to rate the app in playstore
	public void clickRateApp() {
		EventLogPageAndroid eventlogPageAndroid = new EventLogPageAndroid();
		if (getNFKHomepageMoremenuContactusRateAppLnk().isPresent()) {
			getNFKHomepageMoremenuContactusRateAppLnk().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Application is redirected to Google PlayStore", MessageTypes.Pass);
			LFSUtilsAndroid.clickBackButton();
		}
	}

	public void verifylabel() {
		EventLogPageAndroid eventlogPageAndroid = new EventLogPageAndroid();
		if (getNFKHomepageMoremenuContactusRateAppLnk().isPresent()) {
			eventlogPageAndroid.getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("rateUs.message"))
					.verifyPresent("Rate US label is present");
		}
	}
	
}
