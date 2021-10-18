package com.NFK.version1.android.steps;

import com.NFK.support.ApiMethods;
import com.NFK.version1.android.pages.CountrySelectionPageAndroid;
import com.NFK.version1.android.pages.DecisionPageAndroid;
import com.NFK.version1.android.pages.LoginPageAndroid;
import com.NFK.version1.android.pages.SignoutPageAndroid;
import com.NFK.version1.android.pages.SignupPageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class LoginSteps {
	LoginPageAndroid loginPageAndroid = new LoginPageAndroid();
	ApiMethods ap = new ApiMethods();
	CountrySelectionPageAndroid countryselectionpage = new CountrySelectionPageAndroid();
	DecisionPageAndroid decisionpage = new DecisionPageAndroid();

	@QAFTestStep(description = "user enters login details using {0}")
	public void userEnterSigninDetails(Object userDetail) {
		loginPageAndroid.doLogin(userDetail);
	}

	@QAFTestStep(description = "user enters newly created details to Login")
	public void userRequest() {
		loginPageAndroid.doLogin1();
	}

	@QAFTestStep(description = "test the application")
	public void userEnninDetails() {
		// ap.addLoginDetails("usdec12@mailinator.com","test1234");
	}

	@QAFTestStep(description = "user enters login details into older app using {0}")
	public void userEnterSigninDetailsOlderApp(Object userDetail) {
		loginPageAndroid.doLoginOlderApp(userDetail);
	}

	@QAFTestStep(description = "user gets redirected to {0} Page")
	public void selectRedirectPage(String page) {
		countryselectionpage.selectScreen(page);
	}

	@QAFTestStep(description = "user enters valid login dependent details using {0}")
	public void userEntersValidLoginDependentDetailsUsing(Object userdata) {
		loginPageAndroid.doDependentLogin(userdata);
	}

	@QAFTestStep(description = "user clicks on sign in page of older app")
	public void clickOnSignInBtn() {
		loginPageAndroid.signINToOlderApp();
	}

	@QAFTestStep(description = "user clicks on login button")
	public void clickOnLoginBtn() {
		loginPageAndroid.clickOnLogin_Btn();
	}

	@QAFTestStep(description = "HCP user verify age restriction message")
	public void clickLoginHCP() {
		loginPageAndroid.clickHCPLogin();
	}

	@QAFTestStep(description = "user select authentication type as {0}")
	public void selectAuthanticationType(String option) {
		loginPageAndroid.clickOnAuthenticationType(option);
	}

	@QAFTestStep(description = "user verify login page")
	public void userVerifyLoginPage() {
		loginPageAndroid.verifyLoginPage();
	}

	@QAFTestStep(description = "user click on forgot password link")
	public void clickOnForgotPasswordLnk() {
		loginPageAndroid.clickOnforgotpass();
	}

	@QAFTestStep(description = "user verify forgot password page")
	public void verifyForgotpassPage() {
		loginPageAndroid.verifyForgotpwdPage();
	}

	@QAFTestStep(description = "user verify reset password with registered mail ID")
	public void verifyForgotpassvalidEmail() {
		loginPageAndroid.verifyresetPasswordValidMail();
	}

	@QAFTestStep(description = "user verify reset password with invalid mail ID")
	public void verifyForgotpassInvalidEmail() {
		loginPageAndroid.verifyFGPWDInvalidEmailID();
	}

	@QAFTestStep(description = "user enters login details without password or incorrect password")
	public void loginWithoutPswrd() {
		loginPageAndroid.loginWithoutPasswordField();
	}

	@QAFTestStep(description = "user enters login details with unregistered user")
	public void loginWithUnregisteredUser() {
		loginPageAndroid.loginUnregisteredUser();
	}

	@QAFTestStep(description = "user enters login details with invalid username and password")
	public void loginInvalidUser() {
		loginPageAndroid.loginWithInvalidUsername();
	}

	@QAFTestStep(description = "user validate email with special characters")
	public void validateEmail() {
		loginPageAndroid.validateSpecialCharacterEmailField();
	}

	@QAFTestStep(description = "user verify email field is non editable login screen")
	public void verifyemilFieldDisable() {
		loginPageAndroid.verifyDisableEmailField();
	}

	@QAFTestStep(description = "user verify keep me login switch disable")
	public void verifyKeepMeLoginSwitchDisable() {
		loginPageAndroid.verifyKeepMeLoginSwtchDisable();
	}

	@QAFTestStep(description = "user verify navigating back from update page")
	public void updateNoticeLoginNavigation() {
		loginPageAndroid.clickOnLoginButtonAndBack();
	}

	@QAFTestStep(description = "user clicks on login button only")
	public void clicksOnLoginBtnOnly() {
		loginPageAndroid.clickOnLoginBtnOnly();
	}

	@QAFTestStep(description = "user select update notice")
	public void selectsUpdateNotice() {
		loginPageAndroid.selectUpdateNotice();
	}

	@QAFTestStep(description = "user click skip button on turn on meter screen")
	public void clicskOnSkipTurnOnMeterScreen() {
		loginPageAndroid.clickOnSkipTurnOnMeterScreen();
	}

	@QAFTestStep(description = "user click skip button on turn on bluetooth screen")
	public void clicskOnSkipTurnOnMeteBluetoothScreen() {
		loginPageAndroid.clickOnSkipTurnOnMeteBluetoothScreen();
	}

	@QAFTestStep(description = "user click skip button on search meter screen")
	public void clicskOnSkipSearchScreen() {
		loginPageAndroid.clickOnSkipSearchScreen();
	}

	@QAFTestStep(description = "user enter {0} fingerprint details")
	public void fingerprintEnter(String msg) {
		loginPageAndroid.verifyFingerPrint(msg);
	}

	@QAFTestStep(description = "user verify Touch ID image")
	public void verifyLoginTouchIdOption() {
		loginPageAndroid.verifyTouchIdImageOnLogin();
	}

	@QAFTestStep(description = "user verify no Touch Id button login screen")
	public void noTouchIDBtn() {
		loginPageAndroid.noTouchIDPresent();
	}

	@QAFTestStep(description = "user click app common ok button")
	public void clickAppCommonOkBtn() {
		loginPageAndroid.clickAppCommonOkBtn();
	}

	@QAFTestStep(description = "user verify login id prepopullated as {0}")
	public void verifyLoginIDPopullated(Object userDetail) {
		loginPageAndroid.verifyLoginIDPopullated(userDetail);
	}

	@QAFTestStep(description = "user enters password as {0}")
	public void userEnterPasswordDetails(Object userDetail) {
		loginPageAndroid.userEnterPasswordDetails(userDetail);
	}

	@QAFTestStep(description = "user clicks on skip pair button")
	public void clickOnSkipPairBtn() {
		loginPageAndroid.clickSkipBtn();
	}

	@QAFTestStep(description = "user clicks on login button of older app")
	public void clickOnLoginBtnOlderApp() {
		loginPageAndroid.clickOnLogin_Btn_olderApp();
	}

	@QAFTestStep(description = "user retrive the OS version of the currently used device")
	public void OS_version_of_device() {

		loginPageAndroid.getOS_Version();
	}

	@QAFTestStep(description = "verify NFK support latest OS along with previous OS version")
	public void verify_latest_OS() {
		loginPageAndroid.verifyLatestOs();
	}

	@QAFTestStep(description = "user enters wrong login details and verify error message")
	public void userEnterWrongLoginDetails() {
		loginPageAndroid.loginWithGDPRInvalidUsername();
	}

	@QAFTestStep(description = "user enters login credentials")
	public void doLoginAfterAccountDeletion() {
		loginPageAndroid.doLoginAfterAccountDeletion();
	}

	@QAFTestStep(description = "user enters login details")
	public void enterlogindetails() {
		loginPageAndroid.enterLogindetailafterdelete();
	}

	@QAFTestStep(description = "user clicks on login button to verify account")
	public void clicksLoginToDelete() {
		loginPageAndroid.clickLoginButtonToVerifyDelete();
	}

	@QAFTestStep(description = "user clicks on login button and not agreed terms and conditions")
	public void clickOnLoginNotAgreedTerms() {
		loginPageAndroid.clickOnLoginNotAgreedTerms();
	}

	@QAFTestStep(description = "user select and verify Personal Sensitive Data Screen")
	public void selectAndVerifySensitiveDataScreen() {
		loginPageAndroid.selectAndVerifySensitiveDataScreen();
	}

	@QAFTestStep(description = "user enter required details {0} and click on send button")
	public void userEnterRequiredDetailsAndClickOnSendButton(String email) {
		loginPageAndroid.sendDetailsForForgotPasswordLink(email);
	}

	@QAFTestStep(description = "user login with {0} and verify newly reset password")
	public void loginAndVerifyLoginWithResetPwd(String email) {
		loginPageAndroid.loginAndVerifyLoginWithResetPwd(email);
	}

	@QAFTestStep(description = "user handles error pop-up")
	public void userHandlesErrorPopUp() {
		loginPageAndroid.clickOnLogin_Btn1();
		loginPageAndroid.handleErrorPopUp();
		decisionpage.clickBackBtn();
	}

	@QAFTestStep(description = "user verifies app should displays Create a Guardian Account pop-up")
	public void userVerifiesGuardianAccountPopup() {
		loginPageAndroid.verifyGuardianAccountPopup();
	}

	@QAFTestStep(description = "user clicks Cancel button verifies App displays redirected to login page")
	public void userclickoncancelbtn() {
		loginPageAndroid.ClickonCancelButton();
		loginPageAndroid.verifyfilledLoginPage();
	}

	@QAFTestStep(description = "user clicks on signup button for guardian account")
	public void userclickonsignupbtn() {
		loginPageAndroid.ClickonSignupButton();
	}

	@QAFTestStep(description = "user click on login button")
	public void clickOnLoginBtnforminor() {
		loginPageAndroid.clickOnLogin_BtnforMinor();
	}

	
	@QAFTestStep(description="user clicks back and navigate LOGIN DEPENDENT Page")
	public void userClicksBackAndNavigateLOGINDEPENDENTPage(){
		loginPageAndroid.clickOnLoginLink();
	}
	@QAFTestStep(description = "user enters invalid details in email-id field")
	public void ValidateInvalidEmailid() {
		loginPageAndroid.ValidateInvalidEmailid();
	}

	@QAFTestStep(description = "user click on back button and click on My Dependent data")
	public void ClickBackandMydepedentData() {
		loginPageAndroid.ClickBackAndMydepedentData();
	}
	
	@QAFTestStep(description = "user enters invalid login details with incorrect password")
	public void LoginInvalidPassword() {
		loginPageAndroid.LoginInvalidPassword();
	}

	
	@QAFTestStep(description="user verifies gestational screen")
	public void userVerifiesGestScreen(){
		loginPageAndroid.verifyGestationalScreen(); 
		
	}
	@QAFTestStep(description="user verifies continue button gets enabled when selects diabetes type as {0}")
	public void userSelectDiabtestType(String diabetesType){
		SignupPageAndroid sign= new SignupPageAndroid();
		sign.selectDiabetesType(diabetesType);
		loginPageAndroid.verifyContinuebtnEnable();
	}
	
	@QAFTestStep(description="user clicks on cancel button and navigates to Notice screen")
	public void userClicksCancelAndNaviLoginScreen(){
		loginPageAndroid.clickCancelNavLogin(); 
		
	}
	@QAFTestStep(description="user clicks on login button for gestationaluser")
	public void userClicksOnLoginButtonForGestationaluser(){
		loginPageAndroid.clickOnLogin_Btn1();
	}
	@QAFTestStep(description="user verifies reset password screen with prepopulated data")
	public void userVerifiesResetPasswordScreenWithPrepopulatedData() {
		loginPageAndroid.VerifyResetPwd();
	}
}
