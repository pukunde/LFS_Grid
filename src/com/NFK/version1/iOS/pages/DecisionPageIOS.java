package com.NFK.version1.iOS.pages;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import org.openqa.selenium.JavascriptExecutor;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.UserDetailBeans;
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
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

public class DecisionPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	@FindBy(locator="NFKios.decisionpage.signup.button")
    private QAFWebElement NFKiosDecisionPageSignupButton;
    @FindBy(locator="NFKios.decisionpage.yes.login.button")
    private QAFWebElement NFKiosDecisionPageYesLoginButton;
    @FindBy(locator = "NFKios.decisionpage.back.btn")
  	private QAFWebElement NFKiosDecisionPageBackBtn;
    @FindBy(locator = "NFKios.signuppage.back.btn")
	private QAFWebElement NFKiosSignUpPageBackBtn;
    @FindBy(locator = "NFKios.loginpage.back.btn")
	private QAFWebElement NFKiosLoginPageBackBtn;
    @FindBy(locator = "NFKios.decisionpage.login.own.btn")
	private QAFWebElement NFKiosDecisionPageLoginOwnBtn;
    @FindBy(locator = "NFKios.decisionpage.mydependentsdata.btn")
	private QAFWebElement NFKiosDecisionpageMydependentsDataButton;
   
    @FindBy(locator = "NFKios.decisionpage.signup.myself.btn")
   	private QAFWebElement NFKiosDecisionpageSignupMyselfButton;
    
    @FindBy(locator = "NFKios.decisionpage.signup.dependent.btn")
   	private QAFWebElement NFKiosDecisionpageSignupDependentButton;
    
    @FindBy(locator = "NFKios.decisionpage.signup.dependent.fname.txt")
	private QAFWebElement NFKiosCountryselectionDecisionSignupDependentFnameTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.dependent.lname.txt")
	private QAFWebElement NFKiosDecisionPageSignupDependentLnameTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.dependent.password.txt")
	private QAFWebElement NFKiosDecisionPageSignupDependentPasswordTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.dependent.confpassword.txt")
	private QAFWebElement NFKiosDecisionPageSignupDependentConfpasswordTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.dependent.emailAddress.txt")
	private QAFWebElement NFKiosDecisionPageSignupDependentEmailAddressTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.dependent.confemailaddress.txt")
	private QAFWebElement NFKiosDecisionPageSignupDependentConfEmailAddressTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.dependent.CheckAgreementTerm.btn")
	private QAFWebElement NFKiosDecisionPageSignupDependentCheckAgreementTermBtn;
	@FindBy(locator = "NFKios.decisionpage.signup.dependent.checkPromotionalOffers.btn")
	private QAFWebElement NFKiosDecisionPageSignupDependentCheckPromotionalOffersBtn;
	
	@FindBy(locator = "NFKios.decisionpage.signup.myself.birthdate.txt")
	private QAFWebElement NFKiosCountryselectionDecisionSignupMyselfBirthdateTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.myself.confemailAdrs.txt")
	private QAFWebElement NFKiosDecisionPageSignupMyselfConfemailAdrsTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.myself.password.txt")
	private QAFWebElement NFKiosDecisionPageSignupMyselfPasswordTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.myself.confpassword.txt")
	private QAFWebElement NFKiosDecisionPageSignupMyselfConfpasswordTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.myself.emailAddress.txt")
	private QAFWebElement NFKiosDecisionPageSignupMyselfEmailAddressTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.myself.clinicCodeInfo.txt")
	private QAFWebElement NFKiosDecisionPageSignupMyselfClinicCodeInfoTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.myself.checkAgreementTerm.btn")
	private QAFWebElement NFKiosDecisionPageSignupMyselfCheckAgreementTermBtn;
	@FindBy(locator = "NFKios.decisionpage.signup.myself.checkPromotionalOffers.btn")
	private QAFWebElement NFKiosDecisionPageSignupMyselfCheckPromotionalOffersBtn;
	
	@FindBy(locator = "NFKios.decisionpage.login.dependent.password.txt")
	private QAFWebElement NFKiosDesicionpageLoginDependentspasswordTxt;
	@FindBy(locator = "NFKios.decisionpage.login.dependent.username.txt")
	private QAFWebElement NFKiosDesicionpageLoginDependentsUsernameTxt;
	@FindBy(locator = "NFKios.decisionpage.login.myself.password.txt")
	private QAFWebElement NFKiosDesicionpageLoginMyselfpasswordTxt;
	@FindBy(locator = "NFKios.decisionpage.login.myself.username.txt")
	private QAFWebElement NFKiosDesicionpageLoginMyselfUsernameTxt;
	  
 @Override   
protected void openPage(PageLocator pageLocator, Object... args) {
}

public QAFWebElement getNFKiosDecisionPageYesLoginButton() {
	return NFKiosDecisionPageYesLoginButton;
}

public QAFWebElement getNFKiosDecisionPageSignupButton() {
	return NFKiosDecisionPageSignupButton;
}

public QAFWebElement getNFKiosDecisionPageLoginOwnBtn() {
	return NFKiosDecisionPageLoginOwnBtn;
}

public QAFWebElement getNFKiosDecisionpageMydependentsDataButton() {
	return NFKiosDecisionpageMydependentsDataButton;
}

public QAFWebElement getNFKiosDecisionpageSignupDependentButton() {
	return NFKiosDecisionpageSignupDependentButton;
}

public QAFWebElement getNFKiosDecisionpageSignupMyselfButton() {
	return NFKiosDecisionpageSignupMyselfButton;
}

public QAFWebElement getNFKiosDecisionpageBackBtn() {
	return  NFKiosDecisionPageBackBtn;
}
public QAFWebElement getNFKiosSignUppageBackBtn() {
	return  NFKiosSignUpPageBackBtn;
}
public QAFWebElement getNFKiosLoginpageBackBtn() {
	return  NFKiosLoginPageBackBtn;
}

public QAFWebElement getNFKiosCountryselectionDecisionSignupDependentFnameTxt() {
	return NFKiosCountryselectionDecisionSignupDependentFnameTxt;
}
public QAFWebElement getNFKiosDecisionPageSignupDependentLnameTxt() {
	return NFKiosDecisionPageSignupDependentLnameTxt;
}
public QAFWebElement getNFKiosDecisionPageSignupDependentPasswordTxt() {
	return NFKiosDecisionPageSignupDependentPasswordTxt;
}
public QAFWebElement getNFKiosDecisionPageSignupDependentConfpasswordTxt() {
	return NFKiosDecisionPageSignupDependentConfpasswordTxt;
}
public QAFWebElement getNFKiosDecisionPageSignupDependentEmailAddressTxt() {
	return NFKiosDecisionPageSignupDependentEmailAddressTxt;
}
public QAFWebElement getNFKiosDecisionPageSignupDependentConfEmailAddressTxt() {
	return NFKiosDecisionPageSignupDependentConfEmailAddressTxt;
}
public QAFWebElement getNFKiosDecisionPageSignupDependentCheckAgreementTermBtn() {
	return NFKiosDecisionPageSignupDependentCheckAgreementTermBtn;
}
public QAFWebElement getNFKiosDecisionPageSignupDependentCheckPromotionalOffersBtn() {
	return NFKiosDecisionPageSignupDependentCheckPromotionalOffersBtn;
}

public QAFWebElement getNFKiosCountryselectionDecisionSignupMyselfBirthdateTxt() {
	return NFKiosCountryselectionDecisionSignupMyselfBirthdateTxt;
}
public QAFWebElement getNFKiosDecisionPageSignupMyselfConfemailAdrsTxt() {
	return NFKiosDecisionPageSignupMyselfConfemailAdrsTxt;
}
public QAFWebElement getNFKiosDecisionPageSignupMyselfPasswordTxt() {
	return NFKiosDecisionPageSignupMyselfPasswordTxt;
}
public QAFWebElement getNFKiosDecisionPageSignupMyselfConfpasswordTxt() {
	return NFKiosDecisionPageSignupMyselfConfpasswordTxt;
}
public QAFWebElement getNFKiosDecisionPageSignupMyselfEmailAddressTxt() {
	return NFKiosDecisionPageSignupMyselfEmailAddressTxt;
}
public QAFWebElement getNFKiosDecisionPageSignupMyselfClinicCodeInfoTxt() {
	return NFKiosDecisionPageSignupMyselfClinicCodeInfoTxt;
}
public QAFWebElement getNFKiosDecisionPageSignupMyselfCheckAgreementTermBtn() {
	return NFKiosDecisionPageSignupMyselfCheckAgreementTermBtn;
}
public QAFWebElement getNFKiosDecisionPageSignupMyselfCheckPromotionalOffersBtn() {
	return NFKiosDecisionPageSignupMyselfCheckPromotionalOffersBtn;
}

public QAFWebElement getNFKiosDesicionpageLoginDependentspasswordTxt() {
	return NFKiosDesicionpageLoginDependentspasswordTxt;
}
public QAFWebElement getNFKiosDesicionpageLoginDependentsUsernameTxt() {
	return NFKiosDesicionpageLoginDependentsUsernameTxt;
}
public QAFWebElement getNFKiosDesicionpageLoginMyselfpasswordTxt() {
	return NFKiosDesicionpageLoginMyselfpasswordTxt;
}
public QAFWebElement getNFKiosDesicionpageLoginMyselfUsernameTxt() {
	return NFKiosDesicionpageLoginMyselfUsernameTxt;
}

public void redirectToDecisionPage(String option1)
{
	switch (option1) {
	case "Yes, log me in" :
		
		getNFKiosDecisionPageYesLoginButton().waitForPresent();
		getNFKiosDecisionPageYesLoginButton().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("The user clicked on Yes button", MessageTypes.Pass);
		
	break;
	case "Sign Up" :
		
		getNFKiosDecisionPageSignupButton().waitForPresent();
		getNFKiosDecisionPageSignupButton().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("The user clicked on No button", MessageTypes.Pass);
	break;
	}
}

public void selectDecisionOptions(String option1) {
	switch (option1) {
	case "My own data":
		selectLogInMyOwnData();
		verifyLogInMyOwnData();
		break;
	case "My dependents data":
		selectLogInMyDependentsData();
		verifyLogInMyDependentsData();
		break;
	case "Sign up for myself":
		selectSignupForMyself();
		verifySignupForMyself();
		break;
	case "Sign up for a dependent":
		selectSignupForDependent();
		verifySignupForDependent();
		break;
		
	}
}

public void verifySignupForDependent() {
	getNFKiosCountryselectionDecisionSignupDependentFnameTxt().verifyPresent("Guardian First Name");
	getNFKiosDecisionPageSignupDependentLnameTxt().verifyPresent("Guardian Last Name");
	getNFKiosDecisionPageSignupDependentPasswordTxt().verifyPresent("Guardian Password");
	getNFKiosDecisionPageSignupDependentConfpasswordTxt().verifyPresent("Guardian Confirm Password");
	getNFKiosDecisionPageSignupDependentEmailAddressTxt().verifyPresent("Guardian Email Address");
	getNFKiosDecisionPageSignupDependentConfEmailAddressTxt().verifyPresent("Guardian Confirm Email Address");
	getNFKiosDecisionPageSignupDependentCheckAgreementTermBtn().verifyPresent("Check Agreement Term checkbox");
	getNFKiosDecisionPageSignupDependentCheckPromotionalOffersBtn().verifyPresent("Check Promotional Offers Checkbox");
}

public void verifySignupForMyself() {
	getNFKiosCountryselectionDecisionSignupMyselfBirthdateTxt().verifyPresent("Birthdate field ");
	getNFKiosDecisionPageSignupMyselfConfemailAdrsTxt().verifyPresent("Confirm Email Address field");
	getNFKiosDecisionPageSignupMyselfPasswordTxt().verifyPresent("Password field");
	getNFKiosDecisionPageSignupMyselfConfpasswordTxt().verifyPresent("Confirm Password field");
	getNFKiosDecisionPageSignupMyselfEmailAddressTxt().verifyPresent("Email Address field");
	getNFKiosDecisionPageSignupMyselfClinicCodeInfoTxt().verifyPresent("Clinic code field");
	getNFKiosDecisionPageSignupMyselfCheckAgreementTermBtn().verifyPresent("Check Agreement Term checkbox");
	getNFKiosDecisionPageSignupMyselfCheckPromotionalOffersBtn().verifyPresent("Check Promotional Offers Checkbox");
	
}

public void verifyLogInMyDependentsData() {
	getNFKiosDesicionpageLoginDependentsUsernameTxt().verifyPresent("Username field");
	getNFKiosDesicionpageLoginDependentspasswordTxt().verifyPresent("Password field");
	
}

public void verifyLogInMyOwnData() {
	getNFKiosDesicionpageLoginMyselfUsernameTxt().verifyPresent("Username field");
	getNFKiosDesicionpageLoginMyselfpasswordTxt().verifyPresent("Password field");
}

public void selectSignupForDependent() {
	
	getNFKiosDecisionpageSignupDependentButton().waitForPresent();
	getNFKiosDecisionpageSignupDependentButton().click();
	LFSUtilsIOS.waitforLoad();
	Reporter.logWithScreenShot("The user clicked on My dependents data button", MessageTypes.Pass);
	
}

public void selectSignupForMyself() {
	getNFKiosDecisionpageSignupMyselfButton().waitForPresent();
	getNFKiosDecisionpageSignupMyselfButton().click();
	LFSUtilsIOS.waitforLoad();
	Reporter.logWithScreenShot("The user clicked on My dependents data button", MessageTypes.Pass);
	
}

public void selectLogInMyDependentsData() {
	
	getNFKiosDecisionpageMydependentsDataButton().waitForPresent();
	getNFKiosDecisionpageMydependentsDataButton().click();
	LFSUtilsIOS.waitforLoad();
	Reporter.logWithScreenShot("The user clicked on My dependents data button", MessageTypes.Pass);
}

public void selectLogInMyOwnData() {
	getNFKiosDecisionPageLoginOwnBtn().waitForPresent();
	getNFKiosDecisionPageLoginOwnBtn().click();
	LFSUtilsIOS.waitforLoad();
	Reporter.logWithScreenShot("The user clicked on My Own Data button", MessageTypes.Pass);	
}

public void CountrySelectionScreen()
{
	getNFKiosDecisionpageBackBtn().waitForPresent();
	getNFKiosDecisionpageBackBtn().click();
	CountryselectionPageIOS country= new CountryselectionPageIOS();
	if(country.getNFKiosCountryselectionpageSelectcountryLbl().isPresent())
	    Reporter.logWithScreenShot("The user is on country selection screen", MessageTypes.Pass);
	else
		Reporter.logWithScreenShot("User is not on Country selection page",MessageTypes.Pass);
}

public void RedirectToDecisionScreenFromSignUpScreen()
{
	if ((LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("login.action.login")) != null)){
		getNFKiosLoginpageBackBtn().click();
	}
	else{
		getNFKiosSignUppageBackBtn().click();
	}	
	 Reporter.logWithScreenShot("The user taps on Back button and redirected to Decision Screen", MessageTypes.Pass);
		
}

public void redirectToPreviousPage() {
	getNFKiosLoginpageBackBtn().waitForPresent();
	getNFKiosLoginpageBackBtn().click();
	Reporter.logWithScreenShot("The user taps on Back button and redirected to previous Screen", MessageTypes.Pass);
}

  public void verifyDecisionscreen() {
	  
	  getNFKiosDecisionPageYesLoginButton().isPresent();
	  getNFKiosDecisionPageSignupButton().isPresent();
	  Reporter.logWithScreenShot("The user is on Decision Screen", MessageTypes.Pass);
	
  }
}