package com.NFK.version1.android.steps;

import java.time.Duration;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.pages.CountrySelectionPageAndroid;
import com.NFK.version1.android.pages.SignupPageAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;

public class SignupSteps {

	SignupPageAndroid signupPageAndroid = new SignupPageAndroid();
	CountrySelectionPageAndroid countryselectionpage = new CountrySelectionPageAndroid();
	RegistrationSteps registration = new RegistrationSteps();
	LFSUtilsAndroid baseReference = new LFSUtilsAndroid();
	CountrySelectionPageAndroid homePage = new CountrySelectionPageAndroid();

	@QAFTestStep(description = "user clicks on signup button")
	public void clickSignUp() {
		signupPageAndroid.clickSignUpButton();
	}

	@QAFTestStep(description = "user requests the cgmreading")
	public void userrequestCGMreadings() {
		signupPageAndroid.fillCGMReadings();
	}

	@QAFTestStep(description = "user requests the cgmreading for AGP report")
	public void userRequestsTheCgmreadingForAGPReport() {
		signupPageAndroid.fillCGMReadings();
	}

	@QAFTestStep(description = "user clicks on {0} link on Create Account page to verify")
	public void clickTerms(String option) {
		signupPageAndroid.clickTerms(option);
	}

	@QAFTestStep(description = "user click on skip button")
	public void clickOnSkipBtn() {
		signupPageAndroid.clickSkipBtn();
		Reporter.logWithScreenShot("skip button clicked", MessageTypes.Pass);
	}

	// to complete Safety Onboarding screen
	@QAFTestStep(description = "user completes Safety Onboarding and skips Sensor pair")
	public void userCompletesSafetyOnboardingAndSkipsSensorPair() {
		signupPageAndroid.safetyOnboardingScreen();
		// signupPageAndroid.clickonAllowbtnforpermission();
		signupPageAndroid.skipTheSensorScreen();
	}

	@QAFTestStep(description = "user enters signup details using {0}")
	public void fillDetails(Object userDetails) {
		signupPageAndroid.fillSignUpDetails(userDetails);
	}

	@QAFTestStep(description = "user enters signup details without first name using {0}")
	public void fillDeatilsWithoutFirstName(Object userDetail) {
		signupPageAndroid.doSignUpWithoutFirstName(userDetail);
	}

	@QAFTestStep(description = "user enters signup details without last name using {0}")
	public void fillDeatilsWithoutLastName(Object userDetail) {
		signupPageAndroid.doSignUpWithoutLastName(userDetail);
	}

	@QAFTestStep(description = "user enters signup details with birthdate under age using {0}")
	public void fillDetailsWithBirthdateBelowAge(Object userDetail) {
		signupPageAndroid.doSignUpWithDateBelowAge(userDetail);
		Reporter.logWithScreenShot("cannot create account", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user enters signup details without birthdate using {0}")
	public void fillDetailsWithoutBirthdate(Object userDetail) {
		signupPageAndroid.fillDetailsWithoutBirthday(userDetail);
		Reporter.logWithScreenShot("cannot create account", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user enters signup details without TOU using {0}")
	public void verifySignupWithoutTOUCheckbox(Object userDetail) {
		signupPageAndroid.fillSignUpDetailsWithoutChckbox(userDetail);

	}

	@QAFTestStep(description = "user enters signup details without emailId using {0}")
	public void signUpFlowWithoutEmail(Object userDetail) {
		signupPageAndroid.fillRandomSignUpDetailsWithoutEmail(userDetail);
	}

	@QAFTestStep(description = "Signup details with invalid user id and email length more than 75 chars using {0}")
	public void signUpFlowWithInvalidEmail(Object userDetail) {
		signupPageAndroid.fillDetailsWithInvalidEmails(userDetail);
	}

	@QAFTestStep(description = "Signup details with email and confirm email validation using {0}")
	public void emailConfirmEmailValidation(String option) {
		signupPageAndroid.emailValidations(option);
	}

	@QAFTestStep(description = "Signup details without password using {0}")
	public void signupDetailsWithoutPassword(String option) {
		signupPageAndroid.noPasswordToFill(option);
	}

	@QAFTestStep(description = "Signup details with invalid password and less than 16 chars using {0}")
	public void signupDetailsWithInvalidPasword(String option) {
		signupPageAndroid.invalidPasswordEntry(option);
	}

	@QAFTestStep(description = "Signup details with already registered email id using {0}")
	public void signupDetailsWithSamemailId(String option) {
		signupPageAndroid.repeatedMailIdSignupFlow(option);
	}

	@QAFTestStep(description = "user enters signup details with invalid clinic code using {0}")
	public void signupDetailsWithInvalidClinicCode(String option) {
		signupPageAndroid.signUpDetailsWithInvalidClinicCode(option);
	}

	@QAFTestStep(description = "user selects opt-in as {0} in sign up page")
	public void selectOptInSignup(String option) {
		signupPageAndroid.selectionOfOptin(option);
	}

	@QAFTestStep(description = "user clicks login link")
	public void clickLoginLink() {
		countryselectionpage.clickLogin();
	}

	@QAFTestStep(description = "user clicks back button")
	public void clickDeviceBackButton() {
		countryselectionpage.clickBackButton();
		Reporter.logWithScreenShot("back button clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "Sign up negetive positive screenshot using {0}")
	public void signupScreenShot(Object userDetails) {
		signupPageAndroid.signupsecondPageScreen(userDetails);
	}

	@QAFTestStep(description = "user enters hcp details for validations using {0}")
	public void hcpUserTOUUnchecked(Object userDetails) {
		signupPageAndroid.fillHCPDetails(userDetails);
	}

	@QAFTestStep(description = "user verify blank email field using {0}")
	public void hcpBlankMail(Object userDetails) {
		signupPageAndroid.verifyBlankMail(userDetails);
	}

	@QAFTestStep(description = "HCP user set reset password using {0}")
	public void fillResetPasswordDetails(Object userDetails) {
		signupPageAndroid.addresetPasswordDetailHCP(userDetails);
	}

	@QAFTestStep(description = "user verify invalid and other country clinic code using {0}")
	public void verifyInvalidClinicCode(Object option) {
		signupPageAndroid.verifyInvalidClinicCode(option);
	}

	@QAFTestStep(description = "user select UOM as {0}")
	public void selectUOMASMGDL(String option) {
		signupPageAndroid.selectUOM(option);
	}

	@QAFTestStep(description = "user verify invalid First and Last Name")
	public void verifyInvalidCharactersForFirstsNameandLastName() {
		signupPageAndroid.veriyFirstAndLastName();
	}

	@QAFTestStep(description = "user verify exact 18 date of birth is allowed")
	public void exactDateOfBirthAllowed() {
		signupPageAndroid.setYear();
	}

	@QAFTestStep(description = "user select authentication type as {0} on sign up")
	public void selectAuthanticationTypeAndroid(String option) {
		signupPageAndroid.clickOnAuthenticationTypeSignup(option);
	}

	@QAFTestStep(description = "user click on create account button")
	public void clickOnCreateAccountButtonAndroid() {
		// signupPageAndroid.enterFirstLastName();
		// signupPageAndroid.selectGenderAndDiabetesType("MALE", "TYPE 2");;
		signupPageAndroid.clicksOnCreateAccountButton();
	}

	@QAFTestStep(description = "user clicks on continue button")
	public void clickOnContinueAccountButtonAndroid() {
		signupPageAndroid.clicksOnCreateAccountButton();
	}

	@QAFTestStep(description = "user verifies touch id option present")
	public void verifyTouchIDOptionAndroid() {
		signupPageAndroid.verifiesTouchIDOption();
	}

	@QAFTestStep(description = "user verify optin on sign up screen")
	public void verifyOptinScreenAndroid() {
		signupPageAndroid.verificationOfOptin();
	}

	@QAFTestStep(description = "user verify signup first screen")
	public void userVerifySignUpFirstPage() {
		signupPageAndroid.veriySignUpFirstPage();
	}

	@QAFTestStep(description = "user select access type as {0}")
	public void selectAccessType(String option) {
		signupPageAndroid.clickOnAuthenticationTypeSignup(option);
	}

	@QAFTestStep(description = "user install app without sensor")
	public void userInstallWithoutSensorsIos() {
		signupPageAndroid.installWithoutSensor();
	}

	/// Varsha
	@QAFTestStep(description = "user verify Touch ID option is not present")
	public void userVerifyTouchidNotPresent() {
		signupPageAndroid.touchIDNotPresent();
	}

	/// Varsha
	@QAFTestStep(description = "user verify keep me login option is not present")
	public void userVerifyKeepMeLoginNotPresent() {
		signupPageAndroid.keepMeLoginNotPresent();
	}

	@QAFTestStep(description = "Turn off internet")
	public void turnOffInternet() {
		LFSUtilsAndroid.turnWifiOff();
		Reporter.logWithScreenShot("wi-fi off", MessageTypes.Pass);
	}

	@QAFTestStep(description = "Turn on internet")
	public void turnOnInternet() {
		LFSUtilsAndroid.turnWifiOn();
		Reporter.logWithScreenShot("wi-fi on", MessageTypes.Pass);
	}

	@QAFTestStep(description = "put app in the background")
	public void putAppBackground() {
		LFSUtilsAndroid.appBackground();
		Reporter.logWithScreenShot("App is in background", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verify customer service link on opt in screen")
	public void userVerifyCustomerServiceLink() {
		signupPageAndroid.verifyCustomerServiceLink();
	}

	@QAFTestStep(description = "user selects gender as {0} and diabetes type as {1}")
	public void userSelectsGenderAndDiabetesTypeAndroid(String gender, String diabetesType) {
		signupPageAndroid.selectGenderAndDiabetesType(gender, diabetesType);
	}

	@QAFTestStep(description = "user verify gender and diabetes type selection page")
	public void userVerifyGenderAndDiabetesSelectionPageAndroid() {
		signupPageAndroid.verifyGenderAndDiabetesSelectionPage();
	}

	@QAFTestStep(description = "user clicks on continue button on sign up second screen")
	public void userClicksOnContinueBtnAndroid() {
		signupPageAndroid.clickOnContinueBtn();
	}

	@QAFTestStep(description = "user verify gestational type when male is selected")
	public void userVerifyGestationalTypeForMale() {
		signupPageAndroid.verifyGestationalTypeForMale();
	}

	@QAFTestStep(description = "user verify Privacy policy link on update notice screen")
	public void userVerifyPrivacyPolicyLink() {
		signupPageAndroid.verifyPrivacyPolicyOnUpdate();
	}

	@QAFTestStep(description = "user verify Update Notice Check box unchecked")
	public void userVerifyUpdateNoticeChkBox() {
		signupPageAndroid.verifyUpdateNoticeCheckBox();
	}

	@QAFTestStep(description = "user click Update notice check box")
	public void userClickUpdateNoticeCheckBox() {
		signupPageAndroid.clickUpdateNoticeCheckBox();
	}

	@QAFTestStep(description = "user click Update notice continue button")
	public void clickUpdateNoticeContinueBtn() {
		signupPageAndroid.clickUpdateNoticeContinueBtn();
	}

	@QAFTestStep(description = "user set the touch id option")
	public void set_the_touch_id() {
		signupPageAndroid.setTouchID();
	}

	@QAFTestStep(description = "user add office on signup page using {0}")
	public void addOfficeSignupPageAndroid(Object userDetails) {
		signupPageAndroid.addOffice(userDetails);
	}

	@QAFTestStep(description = "user verify clinic term page and clinicInfo")
	public void userVerifyClinicTermPageAndInfo() {
		signupPageAndroid.verifyClinicTermsClinicInfo();
	}

	@QAFTestStep(description = "user verify blank field function on clinic term page using {0}")
	public void blankFieldAddClinicSendKey(Object userDetails) {
		signupPageAndroid.clinicInfo();
		signupPageAndroid.addOffice(userDetails);
		Reporter.logWithScreenShot("Clinic after clicking send", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user add office code using {0}")
	public void addOfficeSignupPage(Object userDetails) {
		signupPageAndroid.addOfficeCode(userDetails);
	}

	@QAFTestStep(description = "user clicks on terms of use link on Create Account page to verify")
	public void clickTermsOfUse() {
		signupPageAndroid.clickTerm();
	}

	@QAFTestStep(description = "user clicks on Privacy Policy link on Create Account page to verify")
	public void clickPrivacyPolicy() {
		signupPageAndroid.clickprivacy();
	}

	@QAFTestStep(description = "user verifies no internet popup")
	public void noInternEtPopup() {
		signupPageAndroid.verifyNoInternetPopup();
	}

	@QAFTestStep(description = "user verify that mobile app had incorporated a App Overview Overlay")
	public void verifyAppOverview() {
		signupPageAndroid.verifyAppOverview();
	}

	@QAFTestStep(description = "user verify the App Overview Overlay with all information")
	public void verifyAppOverviewOverlay() {
		signupPageAndroid.verifyAppOverviewOverlay();
	}

	@QAFTestStep(description = "user verify to and fro navigation on App Overview Overlay")
	public void verifyToAndFroOverview() {
		signupPageAndroid.verifyToAndFroOverview();
	}

	@QAFTestStep(description = "user tries to set maximum age more than 125")
	public void enterMaxAgeLimit() {
		signupPageAndroid.enterMaxAgeForDOB();
	}

	@QAFTestStep(description = "user selects gender as {0}")
	public void selectGender(String gender) {
		signupPageAndroid.selectGender(gender);
	}

	@QAFTestStep(description = "user verify the Types of Diabetes and select the type as {0}")
	public void verifyDiabetes(String diabetesType) {

		signupPageAndroid.verifyDiabetesType();
		signupPageAndroid.selectDiabetesType(diabetesType);
	}

	@QAFTestStep(description = "user removes the app from background")
	public void removeAppFromBackground1() {
		// Remove the app
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());

		// appiumDriver.removeApp("com.lifescan.norfolk.adhoctest");

		// Run App in background
		// appiumDriver.runAppInBackground(Duration.ofSeconds(10));
		countryselectionpage.runAppInBackground(5);

	}

	@QAFTestStep(description = "user opens the application")
	public void openapp() {
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		appiumDriver.launchApp();

	}

	@QAFTestStep(description = "Guardian enters signup details using {0}")
	public void guardianEntersSignupDetailsUsing(String details) {
		signupPageAndroid.fillDependentDetails(details);

	}

	@QAFTestStep(description = "Guardian selects dependent gender as {0} and diabetes type as {1}")
	public void guardianSelectsDependentGenderAsAndDiabetesTypeAs(String dependentgender,
			String dependentdiabetesType) {
		signupPageAndroid.selectGender(dependentgender);
		signupPageAndroid.selectDiabetesType(dependentdiabetesType);
		Reporter.logWithScreenShot("Guardian has entered the Gender and Type of Diabetes of dependent ",
				MessageTypes.Pass);
	}

	@QAFTestStep(description = "Guardian enters dependent details and {0}")
	public void guardianEntersDependentDetailsAnd(String userDetails) {
		signupPageAndroid.enterDobFirstAndLastName(userDetails);

	}

	@QAFTestStep(description = "user redirected UOM screen and select {0} UOM")
	public void UOMscreen(String option) {
		signupPageAndroid.verifyUOMscreen();
		signupPageAndroid.selectUOM(option);
	}

	@QAFTestStep(description = "Guardian enters dependent detail for two to five year old")
	public void Selectchilddob() {
		signupPageAndroid.setchilddob();
//	signupPage.enterFirstAndLastName();
	}

	@QAFTestStep(description = "Guardian enters dependent detail for six to seventeen year old")
	public void Selectteendob() {
		signupPageAndroid.setteenagedob();
		// signupPage.enterFirstAndLastName();
	}

//	@QAFTestStep(description="enter the Low Data")
//	public void enterTheLowData(){
//		signupPageAndroid.enterLowDataAPI();
//	}

	@QAFTestStep(description = "user verifies guardian signup page")
	public void userverifiesguardiansignup() {
		signupPageAndroid.verifyGuardianSignupPage();

	}

	@QAFTestStep(description = "user clicks back and navigate to Decision screen")
	public void userClickOnLoginLink() {
		signupPageAndroid.clickOnLoginLink();

	}

	@QAFTestStep(description = "user validates signup myself page using data")
	public void validateSignupMyselfPage() {
		signupPageAndroid.verifySignupMyselfPage();
	}

	@QAFTestStep(description = "user validates signup myself second page and click on back button")
	public void validateSignupMyselfSecondPage() {
		signupPageAndroid.verifySignupMyselfSecondPage();
	}

	@QAFTestStep(description = "user click on back button")
	public void clickonbackbutton() {
		signupPageAndroid.clickonBackbutton();
	}

	@QAFTestStep(description = "user validates signup dependent page")
	public void validateSignupDependentPage() {
		signupPageAndroid.verifySignupDependentPage();
	}

	@QAFTestStep(description = "user validates signup dependent second page")
	public void validateSignupDependentSecondPage() {
		signupPageAndroid.verifySignupDependentSecondPage();
	}
	@QAFTestStep(description = "user enters signup details of existing user using {0}")
	public void userEntersSignupDetailsOfExistingUserUsing(String userDetails) {
		signupPageAndroid.fillexisitingUser(userDetails);
	}
	
	@QAFTestStep(description="user verifies email exist popup and click on back button")
	public void userVerifiesEmailExistPopupAndClickOnBackButton(){
	signupPageAndroid.verifyEmailExitPopup();
	}
	@QAFTestStep(description="user enters signup details of existing guardian using {0}")
	public void userEntersSignupDetailsOfExistingGuardianUsing(String userDetails) {
		signupPageAndroid.fillexisitingGuardianUser(userDetails);
	}
	
	@QAFTestStep(description="user completes Safety Onboarding and skips emancipation")
	public void userCompletesSafetyOnboardingAndSkipsEmancipation(){
		signupPageAndroid.safetyOnboardingScreen();
		signupPageAndroid.skipEmancipationScreen();
		
	}
	@QAFTestStep(description="user verifies emancipation screen")
	public void userVerifiesEmancipationScreen(){
		signupPageAndroid.verifyEmancipationScreen();
	}
	@QAFTestStep(description="user verifies emancipation screen with data {0}")
	public void userVerifiesEmancipationEmailFieldWithInvalidData(String userDetails){
		signupPageAndroid.validateEmancipationField(userDetails);
	}
	@QAFTestStep(description="user verifies emancipation screen with exising user {0}")
	public void userVerifiesEmancipationScreenWithExisingUser(String userDetails){
		signupPageAndroid.VerifyExistEmacipationEmail(userDetails);
	}

	//Emulator Automation
	
	@QAFTestStep(description = "user completes Safety Onboarding")
	public void userCompletesSafetyOnboarding() {
		signupPageAndroid.safetyOnboardingScreen();
	}
}
