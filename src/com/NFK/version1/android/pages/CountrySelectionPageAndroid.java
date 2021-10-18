
package com.NFK.version1.android.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.AppDetailPathBeans;
import com.NFK.version1.iOS.pages.CountryselectionPageIOS;
import com.google.common.collect.ImmutableMap;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class CountrySelectionPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	private static final String RUN_APP_IN_BACKGROUND = null;
	@FindBy(locator = "NFK.countryselectionpage.next.btn")
	private QAFWebElement NFKCountrySelectionpageNextBtn;
	@FindBy(locator = "NFK.countryselect.wheredoyoulive.txt")
	private QAFWebElement NFKCountryselectWheredoyouliveTxt;
	@FindBy(locator = "NFK.countryselectionpage.heading.lbl")
	private QAFWebElement NFKCountrySelectionpageHeadingLbl;
	@FindBy(locator = "NFK.countryselectionpage.countryselection.lst")
	private List<QAFWebElement> NFKCountrySelectionpageCountryselectionLst;
	@FindBy(locator = "NFK.countryselect.unitedstates.btn")
	private QAFWebElement NFKCountryselectUnitedstatesBtn;
	@FindBy(locator = "NFK.countryselectionpage.back.btn")
	private QAFWebElement NFKCountrySelectionpageBackBtn;
	@FindBy(locator = "NFK.countryselect.spain.btn")
	private QAFWebElement NFKCountrySelectSpainBtn;
	@FindBy(locator = "NFK.countryselectukireland.btn")
	private QAFWebElement NFKCountrySelectUkIrelandBtn;
	@FindBy(locator = "NFK.countryselectionpage.selectcountry.txt")
	private QAFWebElement NFKCountrySelectionpageSelectcountryTxt;
	@FindBy(locator = "NFK.countryselectionpage.countryselected.correct.img")
	private QAFWebElement NFKCountrySelectionpageCountryselectedCorrectImg;
	@FindBy(locator = "NFK.loginpage.frenchwelcome.lbl")
	private QAFWebElement NFKLoginpageFrenchwelcomeLbl;
	@FindBy(locator = "NFK.countryselectionpage.countryselected.iagree.btn")
	private QAFWebElement NFKCountrySelectionpageCountryselectedIagreeBtn;
	@FindBy(locator = "NFK.countryselectionpage.next.olderversion.btn")
	private QAFWebElement NFKCountrySelectionpageOlderNextBtn;
	@FindBy(locator = "NFK.countryselectionpage.countryselection.oldversion.lst")
	private List<QAFWebElement> NFKCountrySelectionpageOlderCountryselectionLst;
	@FindBy(locator = "NFK.countryselectionpage.heading.oldversion.lbl")
	private QAFWebElement NFKCountrySelectionpageHeadingOlderLbl;
	@FindBy(locator = "NFK.countryselect.wheredoyoulive.older.txt")
	private QAFWebElement NFKCountryselectWheredoyouliveOlderTxt;
	@FindBy(locator = "NFK.decisionpage.signup.btn")
	private QAFWebElement NFKDecisionPageSignupBtn;
	
	@FindBy(locator = "NFK.decisionpage.Yes.btn")	
	private QAFWebElement NFKDecisionPageYesBtn;
    @FindBy(locator="NFK.decisionpage.signup.myself.btn")
    private QAFWebElement NFKDecisionPageSignupMyselfBtn;
	@FindBy(locator="NFK.decisionpage.signup.dependent.btn")
	private QAFWebElement NFKDecisionPageSignupDependentBtn;
	@FindBy(locator="NFK.decisionpage.login.myself.btn")
	private QAFWebElement NFKDecisionPageLoginMyselfBtn;
	@FindBy(locator="NFK.decisionpage.login.dependent.btn")
	private QAFWebElement NFKDecisionPageLoginDependentBtn;

	
	
	
	
	public QAFWebElement getNFKCountrySelectionpageHeadingOlderLbl() {
		return NFKCountrySelectionpageHeadingOlderLbl;
	}

	public QAFWebElement getNFKDecisionPageSignupBtn() {
		return NFKDecisionPageSignupBtn;
	}
    public QAFWebElement getNFKDecisionPageSignupMyselfBtn() {
    	return NFKDecisionPageSignupMyselfBtn;
    }
	 
    public QAFWebElement getNFKDecisionPageLoginMyselfBtn() {
    	return NFKDecisionPageLoginMyselfBtn;
    }
    
    public QAFWebElement getNFKDecisionPageLoginDependentBtn() {
    	return NFKDecisionPageLoginDependentBtn;
    }
    public QAFWebElement getNFKDecisionPageSignupDependentBtn() {
    	return NFKDecisionPageSignupDependentBtn;
    }
	public QAFWebElement getNFKDecisionPageYesBtn() {
		return NFKDecisionPageYesBtn;
	}

	public void setNFKCountrySelectionpageHeadingOlderLbl(QAFWebElement NFKCountrySelectionpageHeadingOlderLbl) {
		this.NFKCountrySelectionpageHeadingOlderLbl = NFKCountrySelectionpageHeadingOlderLbl;
	}

	public QAFWebElement getNFKCountryselectWheredoyouliveOlderTxt() {
		return NFKCountryselectWheredoyouliveOlderTxt;
	}

	public void setNFKCountryselectWheredoyouliveOlderTxt(QAFWebElement NFKCountryselectWheredoyouliveOlderTxt) {
		this.NFKCountryselectWheredoyouliveOlderTxt = NFKCountryselectWheredoyouliveOlderTxt;
	}

	public QAFWebElement getNFKCountrySelectionpageOlderNextBtn() {
		return NFKCountrySelectionpageOlderNextBtn;
	}

	public void setNFKCountrySelectionpageOlderNextBtn(QAFWebElement NFKCountrySelectionpageOlderNextBtn) {
		this.NFKCountrySelectionpageOlderNextBtn = NFKCountrySelectionpageOlderNextBtn;
	}

	public List<QAFWebElement> getNFKCountrySelectionpageOlderCountryselectionLst() {
		return NFKCountrySelectionpageOlderCountryselectionLst;
	}

	public void setNFKCountrySelectionpageOlderCountryselectionLst(
			List<QAFWebElement> NFKCountrySelectionpageOlderCountryselectionLst) {
		this.NFKCountrySelectionpageOlderCountryselectionLst = NFKCountrySelectionpageOlderCountryselectionLst;
	}

	public QAFWebElement getNFKCountrySelectionpageCountryselectedIagreeBtn() {
		return NFKCountrySelectionpageCountryselectedIagreeBtn;
	}

	public void setNFKCountrySelectionpageCountryselectedIagreeBtn(
			QAFWebElement NFKCountrySelectionpageCountryselectedIagreeBtn) {
		this.NFKCountrySelectionpageCountryselectedIagreeBtn = NFKCountrySelectionpageCountryselectedIagreeBtn;
	}

	public QAFWebElement getNFKCountrySelectionpageCountryselectedCorrectImg() {
		return NFKCountrySelectionpageCountryselectedCorrectImg;
	}

	public QAFWebElement getNFKCountrySelectionpageSelectcountryTxt() {
		return NFKCountrySelectionpageSelectcountryTxt;
	}

	public QAFWebElement getNFKCountrySelectSpainBtn() {
		return NFKCountrySelectSpainBtn;
	}

	public QAFWebElement getNFKCountrySelectUkIrelandBtn() {
		return NFKCountrySelectUkIrelandBtn;
	}

	public QAFWebElement getNFKcountrtyselectionpageBackBtn() {
		return NFKCountrySelectionpageBackBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKcountrtyselectionpageNextBtn() {
		return NFKCountrySelectionpageNextBtn;
	}

	public QAFWebElement getNFKCountryselectWheredoyouliveTxt() {
		return NFKCountryselectWheredoyouliveTxt;
	}

	public QAFWebElement getNFKcountrtyselectionpageHeadingLbl() {
		return NFKCountrySelectionpageHeadingLbl;
	}

	public List<QAFWebElement> getNFKcountrtyselectionpageCountryselectionLst() {
		return NFKCountrySelectionpageCountryselectionLst;
	}

	public QAFWebElement getNFKCountryselectUnitedstatesBtn() {
		return NFKCountryselectUnitedstatesBtn;
	}

	public QAFWebElement getNFKcountrtyselectionpageStaticText(String text) {
		return LFSUtilsAndroid.getElement("NFK.countryselectionpage.statictext.lbl", text);
	}

	public QAFWebElement getNFKCountrySelectionpageStatictextLbl(String text) {
		return LFSUtilsAndroid.getElement("NFK.countryselectionpage.statictext.lbl", text);
	}

	private AndroidDriver androidDriver = (AndroidDriver) driver.getUnderLayingDriver();
	@FindBy(locator = "NFK.countryselectionpage.statictext.lbl")
	private QAFWebElement NFKCountrySelectionpageStatictextLbl;

	public AndroidDriver getDriver() {
		return androidDriver;
	}

	// method to open NFK app
	public void openNFKApp() {
		launchPage(null);
		AndroidDriver driver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		try {
			driver.closeApp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			driver.launchApp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("App is launched", MessageTypes.Pass);
	}
		
	public void runAppInBackground(int seconds) {
		        execute(RUN_APP_IN_BACKGROUND, ImmutableMap.of("seconds", seconds));
	}

	private void execute(String runAppInBackground, ImmutableMap<String, Integer> of) {
		// TODO Auto-generated method stub
		
	}

	// method to open NFK app
	public void lunchApp() {
		AndroidDriver driver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		try {
			driver.launchApp();

		} catch (Exception e) {
			e.printStackTrace();
		}
		Reporter.logWithScreenShot("App is launched", MessageTypes.Pass);
	}

	// code added by Ashish Biradar
	public void launchAnotherApp(Object appName) {
		AppDetailPathBeans appBean = new AppDetailPathBeans();

		if (appName instanceof String) {

			appBean.fillFromConfig((String) appName);
		} else {
			appBean.fillData(appName);
		}

		AndroidDriver driver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
 driver.pressKeyCode(AndroidKeyCode.HOME);
		try {
			driver.closeApp();

			System.out.println("*** Application path ***" + appBean.getAppPath());
			driver.installApp(appBean.getAppPath());
			LFSUtilsAndroid.waitforLoad();

			driver.launchApp();
			LFSUtilsAndroid.waitforLoad();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Reporter.logWithScreenShot("App is launched", MessageTypes.Pass);
	}

	// method to select countries and verify selected country
	public void selectCountry() {
		LFSUtilsIOS.pause(5000);
		if (getNFKcountrtyselectionpageCountryselectionLst().get(0).isPresent()) {
			for (QAFWebElement select : getNFKcountrtyselectionpageCountryselectionLst()) {
				String getValue = select.getAttribute("text");
				select.click();
				getNFKcountrtyselectionpageNextBtn().waitForPresent();
				getNFKcountrtyselectionpageNextBtn().click();
				getNFKcountrtyselectionpageBackBtn().waitForPresent();
				Reporter.logWithScreenShot("Signout page for " + getValue, MessageTypes.Pass);
				getNFKcountrtyselectionpageBackBtn().click();
			}
			for (int j = 2; j > 0; j--) {
				LFSUtilsAndroid.scrollToEleAndriod("United Kingdom and Ireland");
				for (int i = getNFKcountrtyselectionpageCountryselectionLst().size()
						- j; i < getNFKcountrtyselectionpageCountryselectionLst().size(); i++) {

					String getValue = getNFKcountrtyselectionpageCountryselectionLst().get(i).getText().toString();
					getNFKcountrtyselectionpageCountryselectionLst().get(i).click();
					LFSUtilsAndroid.swipeWithCoordinates(607, 1531, 596, 1890, 100);
					LFSUtilsAndroid.swipeWithCoordinates(607, 1531, 596, 1890, 100);
					getNFKcountrtyselectionpageNextBtn().isPresent();
					getNFKcountrtyselectionpageNextBtn().click();
					getNFKcountrtyselectionpageBackBtn().waitForPresent();
					Reporter.logWithScreenShot("Signout page for " + getValue, MessageTypes.Pass);
					getNFKcountrtyselectionpageBackBtn().click();
					getNFKCountryselectUnitedstatesBtn().click();
				}
			}
		} else {
			Reporter.logWithScreenShot("Country is already selected", MessageTypes.Pass);
		}

	}

	// Method to verify country selection screen
	// milan
	public void verifyCountrySelectionPage() {
		getNFKcountrtyselectionpageHeadingLbl().waitForPresent();
		getNFKcountrtyselectionpageHeadingLbl().verifyPresent("One touch logo country selection screen");
		getNFKCountrySelectionpageSelectcountryTxt().verifyPresent("Select country text");
		getNFKCountryselectWheredoyouliveTxt().verifyPresent("Where do you live question");
		scrllToCountry(ConfigurationManager.getBundle().getProperty("country.cName.unitedState").toString());
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.unitedState").toString())
						.verifyPresent("United State");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.unitedState").toString()).click();
		getNFKCountrySelectionpageCountryselectedCorrectImg().verifyPresent("Country selected correct icon");
		scrllToCountry(ConfigurationManager.getBundle().getProperty("country.cName.canada").toString());
		LFSUtilsAndroid.swipeWithScreenPercent(50, 50, 50, 80, 50);
		getNFKcountrtyselectionpageNextBtn().verifyPresent("Next button");
		getNFKcountrtyselectionpageNextBtn().click();
		getNFKcountrtyselectionpageBackBtn().waitForPresent();
		Reporter.logWithScreenShot("Signup page", MessageTypes.Pass);
		getNFKcountrtyselectionpageBackBtn().click();
		getNFKCountrySelectionpageSelectcountryTxt().verifyPresent("Country selection page");

		// NFKANDROID-5749 Remove Algeria from Android
		// getNFKcountrtyselectionpageStaticText(ConfigurationManager.getBundle()
		// .getProperty("country.cName.algeria").toString())
		// .verifyPresent("Algeria");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.argentina").toString())
						.verifyPresent("Argentina");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.belgie").toString())
						.verifyPresent("Belgie");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.brasil").toString())
						.verifyPresent("Brasil");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.canada").toString())
						.verifyPresent("Canada");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.czech").toString())
						.verifyPresent("Česká republika");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.chile").toString()).verifyPresent("Chile");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.colombia").toString())
						.verifyPresent("Colombia");
		scrllToCountry(ConfigurationManager.getBundle().getProperty("country.cName.france").toString());
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.deutschland").toString())
						.verifyPresent("Deutschland");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.spain").toString())
						.verifyPresent("España");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.france").toString())
						.verifyPresent("France");
		scrllToCountry(ConfigurationManager.getBundle().getProperty("country.cName.osterreich").toString());
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.croatia").toString())
						.verifyPresent("Hrvatska");
		// SG removing Netherlands per updated user story
		// getNFKcountrtyselectionpageStaticText(
		// ConfigurationManager.getBundle().getProperty("country.cName.netherland").toString())
		// .verifyPresent("Netherland");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.india").toString()).verifyPresent("India");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.italy").toString()).verifyPresent("Italia");
		// getNFKcountrtyselectionpageStaticText(ConfigurationManager.getBundle()
		// .getProperty("country.cName.hungary").toString())
		// .verifyPresent("Magyarország");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.mexico").toString())
						.verifyPresent("Mexico");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.osterreich").toString())
						.verifyPresent("Osterreich");
		scrllToCountry(ConfigurationManager.getBundle().getProperty("country.cName.uk").toString());
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.poland").toString())
						.verifyPresent("Polska");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.portugal").toString())
						.verifyPresent("Portugal");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.qatar").toString()).verifyPresent("Qatar");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.slovania").toString())
						.verifyPresent("Slovenija");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.uae").toString())
						.verifyPresent("United Arab Emirates");
		getNFKcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.cName.uk").toString())
						.verifyPresent("Uk and ireland");
		scrllToCountry(ConfigurationManager.getBundle().getProperty("country.cName.unitedState").toString());
	}

	// method to click on next button
	public void clickOnNextButton() {
		getNFKcountrtyselectionpageNextBtn().waitForPresent();
		Reporter.logWithScreenShot("Next Button is Present", MessageTypes.Pass);
		getNFKcountrtyselectionpageNextBtn().click();
	}

	// To select one specific country
	public void selectCountryFromList(String countryName) {
		 try {
		getNFKCountryselectWheredoyouliveTxt().waitForPresent(100000);
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
		if (getNFKCountryselectWheredoyouliveTxt().isPresent()) {
//			scrllToCountry(countryName);
			if(getNFKcountrtyselectionpageStaticText(countryName).isPresent()) {
				getNFKcountrtyselectionpageStaticText(countryName).click();
			}
			else {
				scrllToCountry(countryName);
				getNFKcountrtyselectionpageStaticText(countryName).click();
			}
			
			Reporter.logWithScreenShot(countryName+ " is selected", MessageTypes.Pass);
//			LFSUtilsAndroid.swipeWithCoordinates(443, 831, 443, 1132, 5);
//			LFSUtilsAndroid.waitforLoad();
			getNFKcountrtyselectionpageNextBtn().click();
			LFSUtilsAndroid.waitforLoad();
			if (getNFKCountrySelectionpageCountryselectedIagreeBtn().isPresent()) {
				Reporter.logWithScreenShot(countryName+ " Country terms page", MessageTypes.Pass);
				getNFKCountrySelectionpageCountryselectedIagreeBtn().click();
			}
		} else {
			Reporter.logWithScreenShot("The country is already selected", MessageTypes.Pass);

		}

	}

	public void selectOlderCountryFromList(String countryName) {

		try {
			getNFKCountrySelectionpageHeadingOlderLbl().waitForPresent(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (getNFKCountryselectWheredoyouliveOlderTxt().isPresent()) {
			scrllToCountry(countryName);
			getNFKcountrtyselectionpageStaticText(countryName).click();
			Reporter.logWithScreenShot(countryName + " is selected", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithCoordinates(443, 831, 443, 1132, 5);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Country is already selected", MessageTypes.Pass);

		}

	}

	// Method to redirect the flow from SignUp screen to Login screen and Vice
	// versa
	public void selectScreen(String page) {
		SignupPageAndroid signupPageAndroid = new SignupPageAndroid();
		LoginPageAndroid loginPageAndroid = new LoginPageAndroid();
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		TouchAction tch = new TouchAction(appiumDriver);
		page = page.toUpperCase();
		switch (page) {
		case "LOG-IN OWN":
			try {
				if (getNFKDecisionPageYesBtn().isPresent()) {
					getNFKDecisionPageYesBtn().click();
					getNFKDecisionPageLoginMyselfBtn().waitForPresent();
					getNFKDecisionPageLoginMyselfBtn().click();
                    LFSUtilsAndroid.waitforLoad();
				}				
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (!(loginPageAndroid.getNFKloginpageforgotpasswordlnk().isPresent())) {
				Point p1 = signupPageAndroid.getNFKsignuppageloginlnk().getLocation();
				Dimension d1 = signupPageAndroid.getNFKsignuppageloginlnk().getSize();
				int startX = p1.getX();
				int startY = p1.getY();
				int endX = startX + d1.getWidth();
				int endY = startY + d1.getHeight();
				int pintloginY = startY + (endY - startY) / 2;
				int pintloginX = endX - 100;
				tch.tap(pintloginX, pintloginY).perform();
				loginPageAndroid.getNFKloginpageforgotpasswordlnk().waitForPresent();
				Reporter.logWithScreenShot("The user is on Login Page");
			} else
			{	
				Reporter.logWithScreenShot("The user is already on Login Page",MessageTypes.Pass);			
			}
			break;
			
			
		case "SIGN-UP MYSELF":
			try {
				if (getNFKDecisionPageSignupBtn().isPresent()) {
					getNFKDecisionPageSignupBtn().click();
					Reporter.logWithScreenShot("User cliked on Signup to create an Account ", MessageTypes.Pass);
					getNFKDecisionPageSignupMyselfBtn().verifyPresent("Sign up for myself");
					getNFKDecisionPageSignupMyselfBtn().click();
					LFSUtilsAndroid.waitforLoad();
					Reporter.logWithScreenShot("User cliked on Signup for Myself button", MessageTypes.Pass);
				}
				else {
					Reporter.logWithScreenShot("Signup button not present on Decision screen",MessageTypes.Fail);
				}
				
			}
			catch (Exception e) {	
				e.printStackTrace();
			}
			break;
		
		case "SIGN-UP DEPENDENT":
			try {
				if (getNFKDecisionPageSignupBtn().isPresent()) {
					getNFKDecisionPageSignupBtn().click();
				
					Reporter.logWithScreenShot("User clicked on signup to create an Account",MessageTypes.Pass);
					getNFKDecisionPageSignupDependentBtn().verifyPresent("Sign up for Dependent");
					getNFKDecisionPageSignupDependentBtn().click();
					LFSUtilsAndroid.waitforLoad();
					Reporter.logWithScreenShot("User cliked on Signup Dependent button", MessageTypes.Pass);
			       }
				else
					Reporter.logWithScreenShot("Signup button is not present on Decision screen",MessageTypes.Pass);
				
			}catch (Exception e) {
				e.printStackTrace();
			}	
			break;
		case "LOG-IN DEPENDENT":
			try {
				if (getNFKDecisionPageYesBtn().isPresent()) {
					getNFKDecisionPageYesBtn().click();
					getNFKDecisionPageLoginDependentBtn().assertPresent("Login Dependent button");
					getNFKDecisionPageLoginDependentBtn().click();
					loginPageAndroid.verifyDepenedentLoginScreen(); 
				    LFSUtilsAndroid.waitforLoad();
				    Reporter.logWithScreenShot("User has clicked on Login Dependent", MessageTypes.Pass);
				}
				else
				{
					Reporter.logWithScreenShot("User was unable to Login",MessageTypes.Fail);
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// method to scroll for specific country
	public void scrllToCountry(String countryName) {
		int count = 0;
		if (!getNFKcountrtyselectionpageStaticText(countryName).isPresent()) {
			while (!getNFKcountrtyselectionpageStaticText(countryName).isPresent()) {
				LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 60, 50);
				LFSUtilsAndroid.waitforLoad();
				count++;
				if (count == 10)
					break;
			}
		}
		if (!getNFKcountrtyselectionpageStaticText(countryName).isPresent()) {
			count = 0;
			if (!getNFKcountrtyselectionpageStaticText(countryName).isPresent()) {
				while (!getNFKcountrtyselectionpageStaticText(countryName).isPresent()) {
					LFSUtilsAndroid.swipeWithScreenPercent(50, 50, 50, 80, 50);
					LFSUtilsAndroid.waitforLoad();
					count++;
					if (count == 10)
						break;
				}
			}
		}

	}

	// Method to click next button on country selection page
	public void clickNext() {
		getNFKcountrtyselectionpageNextBtn().click();
	}

	// Method to click login button
	public void clickLogin() {
		SignupPageAndroid signupPageAndroid = new SignupPageAndroid();
		LoginPageAndroid loginPageAndroid = new LoginPageAndroid();
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		TouchAction tch = new TouchAction(appiumDriver);

		int fingers = 1;
		int duration = 1;
		Point p1 = signupPageAndroid.getNFKsignuppageloginlnk().getLocation();
		Dimension d1 = signupPageAndroid.getNFKsignuppageloginlnk().getSize();

		int startX = p1.getX();
		int startY = p1.getY();
		int endX = startX + d1.getWidth();
		int endY = startY + d1.getHeight();
		int pintloginY = startY + (endY - startY) / 2;
		int pintloginX = endX - 100;
		tch.tap(pintloginX, pintloginY).perform();
		loginPageAndroid.getNFKloginpageforgotpasswordlnk().waitForPresent();
	}
	
	

	// Method to click back button on Android device
	public void clickBackButton() {
		EventLogPageAndroid eventlogPageAndroid = new EventLogPageAndroid();
		try {
			AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
			
			androidDriver.navigate().back();
			if (eventlogPageAndroid
					.getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.isPresent()) {
				Reporter.logWithScreenShot("Are you sure, you want to discard Changes Popup is displayed",
						MessageTypes.Pass);
				eventlogPageAndroid
						.getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok"))
						.click();
				LFSUtilsAndroid.waitforLoad();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void startSettingActivity() {
		AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();

		params.put("identifier", "com.android.settings/.DateTimeSettingsSetupWizard");
		androidDriver.executeScript("mobile:application:open", params);
		LFSUtilsAndroid.waitforLoad();

	}

	// Method to verify one element of the country selection screen
	public void verifyOnCountrySelectionScreen() {
		getNFKCountryselectWheredoyouliveTxt().verifyPresent("On country Selection Screen");
	}

}
