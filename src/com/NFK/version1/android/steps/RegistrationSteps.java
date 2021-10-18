package com.NFK.version1.android.steps;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.pages.CountrySelectionPageAndroid;
//import com.lemonade.version3.iOS.steps.HCP;
//import com.lemonade.version3.iOS.steps.from;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class RegistrationSteps {
    
	@QAFTestStep(description = "user opens app")
	public void user_opens_app_android() {
		CountrySelectionPageAndroid homePage = new CountrySelectionPageAndroid();
		homePage.openNFKApp();
	}
	@QAFTestStep(description="user lunch app")
	public void lunchAppAnd() {
		CountrySelectionPageAndroid homePage = new CountrySelectionPageAndroid();
		homePage.lunchApp();
	}

	@QAFTestStep(description = "user verify country selection Page")
	public void user_selects_country() {
		CountrySelectionPageAndroid countrySelectionPageAndroid = new CountrySelectionPageAndroid();
		countrySelectionPageAndroid.verifyCountrySelectionPage();
		
	}

	@QAFTestStep(description = "user clicks on Next button")
	public void user_clicks_on_Next_button() {
		CountrySelectionPageAndroid homePage = new CountrySelectionPageAndroid();
		homePage.clickOnNextButton();
		// takes a screenshot
		Reporter.logWithScreenShot("User clicks on Next button",MessageTypes.Pass);

	}
	@QAFTestStep(description = "user clicks on Next button of older app")
	public void user_clicks_on_Next_button_older_app() {
		CountrySelectionPageAndroid homePage = new CountrySelectionPageAndroid();
		if(homePage.getNFKCountrySelectionpageOlderNextBtn().isEnabled()){
			homePage.getNFKCountrySelectionpageOlderNextBtn().click();
			LFSUtilsAndroid.waitforLoad();
		}else{
			Reporter.logWithScreenShot("Next button not enabled", MessageTypes.Pass);
		}
				
		// takes a screenshot
		Reporter.logWithScreenShot("User clicks on Next button",MessageTypes.Pass);

	}																  		   

	@QAFTestStep(description = "user will see Signin and Create an account button")
	public void verify_Signin_CreateAnAccount_buttons() {
		CountrySelectionPageAndroid CountrySelectionPageAndroid = new CountrySelectionPageAndroid();
		
		// takes a screenshot
		Reporter.logWithScreenShot("Create Account and Signin buttons are present",MessageTypes.Pass);
	}

	@QAFTestStep(description = "user clicks on Create an account button")
	public void user_clicks_on_Create_an_account_button() {
		CountrySelectionPageAndroid CountrySelectionPageAndroid = new CountrySelectionPageAndroid();
		// takes a screenshot
		Reporter.logWithScreenShot("User clicks on Create an account button", MessageTypes.Pass);
	}

	// @QAFDataProvider(key = "User.Registration")
	@QAFTestStep(description = "user fills registration form")
	public void user_fills_registration_info() {

		CountrySelectionPageAndroid CountrySelectionPageAndroid = new CountrySelectionPageAndroid();
		// takes a screenshot
		Reporter.logWithScreenShot("User fills registration form",MessageTypes.Pass);
	}

	@QAFTestStep(description = "user should get register successfully")
	public void user_register_successfully() {

		CountrySelectionPageAndroid CountrySelectionPageAndroid = new CountrySelectionPageAndroid();
	}
		
	@QAFTestStep(description = "user closes the app")
	public void userCloseTheAndroidApp() {
		try {
			((AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver()).closeApp();
			LFSUtilsAndroid.waitforLoad();
		} catch (Exception e) {
			System.out.println(e);
		}
		Reporter.logWithScreenShot("The App got closed", MessageTypes.Pass);
		
	}
	
	@QAFTestStep(description="user selects country {0} from country list")
	public void selectCountry(String country){
		CountrySelectionPageAndroid homePageAndroid = new CountrySelectionPageAndroid();
		homePageAndroid.selectCountryFromList(country);
	}
	
	//code added by Ashish Biradar	
	@QAFTestStep(description="user launch {0} app")
	public void launchAnotherApp(Object appName) {
		CountrySelectionPageAndroid homePage = new CountrySelectionPageAndroid();
		homePage.launchAnotherApp(appName);
	}
	
	@QAFTestStep(description="user select country {0} from country list for older version")
	public void selectOldAppCountry(String country){
		CountrySelectionPageAndroid homePageAndroid = new CountrySelectionPageAndroid();
		homePageAndroid.selectOlderCountryFromList(country);
    }
	@QAFTestStep(description="user resets app")
	public void resetApp() {
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		appiumDriver.resetApp();
	}
	
	@QAFTestStep(description = "user start setting activity for date change")
	public void startSettingActivity() {
		CountrySelectionPageAndroid homePageAndroid = new CountrySelectionPageAndroid();
		homePageAndroid.startSettingActivity();
	}				
	
	@QAFTestStep(description = "user on country selection Page")
	public void user_On_selects_country_Screen() {
		CountrySelectionPageAndroid countrySelectionPageAndroid = new CountrySelectionPageAndroid();
		countrySelectionPageAndroid.verifyOnCountrySelectionScreen();
		
	}
	
}
