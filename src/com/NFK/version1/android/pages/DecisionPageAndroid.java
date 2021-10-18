package com.NFK.version1.android.pages;

import com.NFK.support.LFSUtilsAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.qmetry.qaf.automation.ui.api.PageLocator;



public class DecisionPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	SignupPageAndroid signupPageAndroid = new SignupPageAndroid();
	LoginPageAndroid loginPageAndroid = new LoginPageAndroid();
	CountrySelectionPageAndroid countrySelectionPageAndroid = new CountrySelectionPageAndroid();

	@FindBy(locator = "NFK.decisionpage.No.btn")
	private QAFWebElement NFKDecisionPageNoBtn;
	@FindBy(locator = "NFK.decisionpage.Yes.btn")
	private QAFWebElement NFKDecisionPageYesBtn;
	@FindBy(locator = "NFK.decisionpage.back.btn")
	private QAFWebElement NFKDecisionPageBackBtn;
	@FindBy(locator = "NFK.decisionpage.login.myself.btn")
	private QAFWebElement NFKCountryselectionLoginMyOwnDataBtn;
	@FindBy(locator = "NFK.decisionpage.login.dependent.btn")
	private QAFWebElement NFKCountryselectionLoginMyDependentDataBtn;
	@FindBy(locator = "NFK.decisionpage.signup.myself.btn")
	private QAFWebElement NFKDecisionPageSignupForMyselfBtn;
	@FindBy(locator = "NFK.decisionpage.signup.dependent.btn")
	private QAFWebElement NFKDecisionPageSignupForDependentBtn;
	@FindBy(locator = "NFK.decisionpage.login.myself.username.txt")
	private QAFWebElement NFKDecisionPageLoginMyselfUsernametxt;
	@FindBy(locator = "NFK.decisionpage.login.myself.password.txt")
	private QAFWebElement NFKDecisionPageLoginMyselfpasswordtxt;
	@FindBy(locator = "NFK.decisionpage.login.dependent.username.txt")
	private QAFWebElement NFKDecisionPageLoginDependentsUsernameTxt;
	@FindBy(locator = "NFK.decisionpage.login.dependent.password.txt")
	private QAFWebElement NFKDecisionPageLoginDependentspasswordTxt;

	
	@FindBy(locator = "NFK.decisionpage.signup.myself.birthdate.txt")
	private QAFWebElement NFKCountryselectionDecisionSignupMyselfBirthdateTxt;
	@FindBy(locator = "NFK.decisionpage.signup.myself.confemailAdrs.txt")
	private QAFWebElement NFKDecisionPageSignupMyselfConfemailAdrsTxt;
	@FindBy(locator = "NFK.decisionpage.signup.myself.password.txt")
	private QAFWebElement NFKDecisionPageSignupMyselfPasswordTxt;
	@FindBy(locator = "NFK.decisionpage.signup.myself.confpassword.txt")
	private QAFWebElement NFKDecisionPageSignupMyselfConfpasswordTxt;
	@FindBy(locator = "NFK.decisionpage.signup.myself.emailAddress.txt")
	private QAFWebElement NFKDecisionPageSignupMyselfEmailAddressTxt;
	@FindBy(locator = "NFK.decisionpage.signup.myself.clinicCodeInfo.txt")
	private QAFWebElement NFKDecisionPageSignupMyselfClinicCodeInfoTxt;
	@FindBy(locator = "NFK.decisionpage.signup.myself.checkAgreementTerm.btn")
	private QAFWebElement NFKDecisionPageSignupMyselfCheckAgreementTermBtn;
	@FindBy(locator = "NFK.decisionpage.signup.myself.checkPromotionalOffers.btn")
	private QAFWebElement NFKDecisionPageSignupMyselfCheckPromotionalOffersBtn;
	
	@FindBy(locator = "NFK.decisionpage.signup.dependent.fname.txt")
	private QAFWebElement NFKCountryselectionDecisionSignupDependentFnameTxt;
	@FindBy(locator = "NFK.decisionpage.signup.dependent.lname.txt")
	private QAFWebElement NFKDecisionPageSignupDependentLnameTxt;
	@FindBy(locator = "NFK.decisionpage.signup.dependent.password.txt")
	private QAFWebElement NFKDecisionPageSignupDependentPasswordTxt;
	@FindBy(locator = "NFK.decisionpage.signup.dependent.confpassword.txt")
	private QAFWebElement NFKDecisionPageSignupDependentConfpasswordTxt;
	@FindBy(locator = "NFK.decisionpage.signup.dependent.emailAddress.txt")
	private QAFWebElement NFKDecisionPageSignupDependentEmailAddressTxt;
	@FindBy(locator = "NFK.decisionpage.signup.dependent.confemailaddress.txt")
	private QAFWebElement NFKDecisionPageSignupDependentConfEmailAddressTxt;
	@FindBy(locator = "NFK.decisionpage.signup.dependent.CheckAgreementTerm.btn")
	private QAFWebElement NFKDecisionPageSignupDependentCheckAgreementTermBtn;
	@FindBy(locator = "NFK.decisionpage.signup.dependent.checkPromotionalOffers.btn")
	private QAFWebElement NFKDecisionPageSignupDependentCheckPromotionalOffersBtn;
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKDecisionPageNoBtn() {
		return NFKDecisionPageNoBtn;
	}

	public QAFWebElement getNFKDecisionPageYesBtn() {
		return NFKDecisionPageYesBtn;
	}

	public QAFWebElement getNFKDecisionPageBackBtn() {
		return NFKDecisionPageBackBtn;
	}
	
	public QAFWebElement getNFKDecisionPageLoginMyOwnDataBtn() {
		return NFKCountryselectionLoginMyOwnDataBtn;
	}
	
	public QAFWebElement getNFKDecisionPageLoginMyDependentDataBtn() {
		return NFKCountryselectionLoginMyDependentDataBtn;
	}
	
	public QAFWebElement getNFKDecisionPageSignupForMyselfBtn() {
		return NFKDecisionPageSignupForMyselfBtn;
	}
	
	public QAFWebElement getNFKDecisionPageSignupForDependentBtn() {
		return NFKDecisionPageSignupForDependentBtn;
	}
	
	public QAFWebElement getNFKDecisionPageLoginDependentsUsernameTxt() {
		return NFKDecisionPageLoginDependentsUsernameTxt;
	}
	
	public QAFWebElement getNFKDecisionPageLoginDependentspasswordTxt() {
		return NFKDecisionPageLoginDependentspasswordTxt;
	}
	
	public QAFWebElement getNFKDecisionPageLoginMyselfUsernameTxt() {
		return NFKDecisionPageLoginMyselfUsernametxt;
	}
	
	public QAFWebElement getNFKDecisionPageLoginMyselfpasswordTxt() {
		return NFKDecisionPageLoginMyselfpasswordtxt;
	}	
	public QAFWebElement getNFKCountryselectionDecisionSignupMyselfBirthdateTxt() {
		return NFKCountryselectionDecisionSignupMyselfBirthdateTxt;
	}
	public QAFWebElement getNFKDecisionPageSignupMyselfConfemailAdrsTxt() {
		return NFKDecisionPageSignupMyselfConfemailAdrsTxt;
	}
	public QAFWebElement getNFKDecisionPageSignupMyselfPasswordTxt() {
		return NFKDecisionPageSignupMyselfPasswordTxt;
	}
	public QAFWebElement getNFKDecisionPageSignupMyselfConfpasswordTxt() {
		return NFKDecisionPageSignupMyselfConfpasswordTxt;
	}
	public QAFWebElement getNFKDecisionPageSignupMyselfEmailAddressTxt() {
		return NFKDecisionPageSignupMyselfEmailAddressTxt;
	}
	public QAFWebElement getNFKDecisionPageSignupMyselfClinicCodeInfoTxt() {
		return NFKDecisionPageSignupMyselfClinicCodeInfoTxt;
	}
	public QAFWebElement getNFKDecisionPageSignupMyselfCheckAgreementTermBtn() {
		return NFKDecisionPageSignupMyselfCheckAgreementTermBtn;
	}
	public QAFWebElement getNFKDecisionPageSignupMyselfCheckPromotionalOffersBtn() {
		return NFKDecisionPageSignupMyselfCheckPromotionalOffersBtn;
	}
	
	public QAFWebElement getNFKCountryselectionDecisionSignupDependentFnameTxt() {
		return NFKCountryselectionDecisionSignupDependentFnameTxt;
	}
	public QAFWebElement getNFKDecisionPageSignupDependentLnameTxt() {
		return NFKDecisionPageSignupDependentLnameTxt;
	}
	public QAFWebElement getNFKDecisionPageSignupDependentPasswordTxt() {
		return NFKDecisionPageSignupDependentPasswordTxt;
	}
	public QAFWebElement getNFKDecisionPageSignupDependentConfpasswordTxt() {
		return NFKDecisionPageSignupDependentConfpasswordTxt;
	}
	public QAFWebElement getNFKDecisionPageSignupDependentEmailAddressTxt() {
		return NFKDecisionPageSignupDependentEmailAddressTxt;
	}
	public QAFWebElement getNFKDecisionPageSignupDependentConfEmailAddressTxt() {
		return NFKDecisionPageSignupDependentConfEmailAddressTxt;
	}
	public QAFWebElement getNFKDecisionPageSignupDependentCheckAgreementTermBtn() {
		return NFKDecisionPageSignupDependentCheckAgreementTermBtn;
	}
	public QAFWebElement getNFKDecisionPageSignupDependentCheckPromotionalOffersBtn() {
		return NFKDecisionPageSignupDependentCheckPromotionalOffersBtn;
	}
	
	public void verifyDecisionScreen() {
		if(getNFKDecisionPageYesBtn().isPresent())
			{
			Reporter.logWithScreenShot("Yes, log me in option is present on Decision screen", MessageTypes.Pass);
			}
		else {
			Reporter.logWithScreenShot("Yes, log me in option is not present on Decision screen", MessageTypes.Pass);
		}
		
		if(getNFKDecisionPageNoBtn().isPresent()) {
			Reporter.logWithScreenShot("Sign Up option is present on Decision screen", MessageTypes.Pass);
		}
		else {
			Reporter.logWithScreenShot("Sign Up option is present on Decision screen", MessageTypes.Pass);
		}
		getNFKDecisionPageBackBtn().verifyPresent("Back Button");
	}

	public void clickBackBtn() {
		getNFKDecisionPageBackBtn().waitForPresent();
			getNFKDecisionPageBackBtn().click();
		Reporter.logWithScreenShot("User clicked on Back button",MessageTypes.Pass);
	}

	public void verifyLogin() {

		loginPageAndroid.getNFKloginpageforgotpasswordlnk().isPresent();

		Reporter.logWithScreenShot("User is onLogin Page", MessageTypes.Pass);
	}

	public void verifySignup() {
		signupPageAndroid.getNFKsignuppageloginlnk().isPresent();
		Reporter.logWithScreenShot("User is on SignUp Page", MessageTypes.Pass);
	}

	public void verifyCountrySelectionPage() {
		clickBackBtn();
		LFSUtilsAndroid.waitforLoad();
		if(countrySelectionPageAndroid.getNFKCountryselectWheredoyouliveTxt().verifyPresent("Where do you live question"))
		{
		Reporter.logWithScreenShot("Country selection page displays", MessageTypes.Pass);
		}
		else {
			Reporter.logWithScreenShot("Country selection page is not displayed", MessageTypes.Pass);
		}
	}

	public void selectDecisionScreen(String option) {
	
		switch (option) {
		case "Yes, log me in":
			selectLogIn();
			break;
		case "Sign Up":
			selectSignup();
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
		getNFKCountryselectionDecisionSignupDependentFnameTxt().verifyPresent("Guardian First Name");
		getNFKDecisionPageSignupDependentLnameTxt().verifyPresent("Guardian Last Name");
		getNFKDecisionPageSignupDependentPasswordTxt().verifyPresent("Guardian Password");
		getNFKDecisionPageSignupDependentConfpasswordTxt().verifyPresent("Guardian Confirm Password");
		getNFKDecisionPageSignupDependentEmailAddressTxt().verifyPresent("Guardian Email Address");
		getNFKDecisionPageSignupDependentConfEmailAddressTxt().verifyPresent("Guardian Confirm Email Address");
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKDecisionPageSignupDependentCheckAgreementTermBtn().verifyPresent("Check Agreement Term checkbox");
		getNFKDecisionPageSignupDependentCheckPromotionalOffersBtn().verifyPresent("Check Promotional Offers Checkbox");
	}

	public void verifySignupForMyself() {
		getNFKCountryselectionDecisionSignupMyselfBirthdateTxt().verifyPresent("Birthdate field ");
		getNFKDecisionPageSignupMyselfConfemailAdrsTxt().verifyPresent("Confirm Email Address field");
		getNFKDecisionPageSignupMyselfPasswordTxt().verifyPresent("Password field");
		getNFKDecisionPageSignupMyselfConfpasswordTxt().verifyPresent("Confirm Password field");
		getNFKDecisionPageSignupMyselfEmailAddressTxt().verifyPresent("Email Address field");
		getNFKDecisionPageSignupMyselfClinicCodeInfoTxt().verifyPresent("Clinic code field");
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKDecisionPageSignupMyselfCheckAgreementTermBtn().verifyPresent("Check Agreement Term checkbox");
		getNFKDecisionPageSignupMyselfCheckPromotionalOffersBtn().verifyPresent("Check Promotional Offers Checkbox");
	}

	public void verifyLogInMyDependentsData() {
		getNFKDecisionPageLoginDependentsUsernameTxt().verifyPresent("Username field");
		getNFKDecisionPageLoginDependentspasswordTxt().verifyPresent("Password field");
	}

	public void verifyLogInMyOwnData() {
		getNFKDecisionPageLoginMyselfUsernameTxt().verifyPresent("Username field");
		getNFKDecisionPageLoginMyselfpasswordTxt().verifyPresent("Password field");

	}

	public void selectSignupForDependent() {
		getNFKDecisionPageSignupForDependentBtn().waitForPresent();
		getNFKDecisionPageSignupForDependentBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("After selecting Signup My Dependent Data option", MessageTypes.Pass);
	}

	public void selectSignupForMyself() {
		getNFKDecisionPageSignupForMyselfBtn().waitForPresent();
		getNFKDecisionPageSignupForMyselfBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("After selecting Signup My Own Data option", MessageTypes.Pass);
	}

	public void selectLogInMyDependentsData() {
		getNFKDecisionPageLoginMyDependentDataBtn().waitForPresent();
		getNFKDecisionPageLoginMyDependentDataBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("After selecting Login My Dependent Data option", MessageTypes.Pass);
	}

	public void selectLogInMyOwnData() {
		getNFKDecisionPageLoginMyOwnDataBtn().waitForPresent();
		getNFKDecisionPageLoginMyOwnDataBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("After selecting Login My Own Data option", MessageTypes.Pass);
	}
	

	public void selectLogIn() {

		getNFKDecisionPageYesBtn().isPresent();
		getNFKDecisionPageYesBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("After selecting Yes, log me in option", MessageTypes.Pass);

	}

	public void selectSignup() {

		getNFKDecisionPageNoBtn().isPresent();
		getNFKDecisionPageNoBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("After selecting Sign Up option", MessageTypes.Pass);
	}

}
