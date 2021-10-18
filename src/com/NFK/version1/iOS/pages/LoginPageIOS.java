package com.NFK.version1.iOS.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.Point;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class LoginPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFKios.loginPage.emailAdress.tBox")
	private QAFWebElement NFKiosLoginpageEmailadressTbox;
	@FindBy(locator = "NFKios.loginPage.password.tBox")
	private QAFWebElement NFKiosLoginpagePasswordTbox;
	@FindBy(locator = "NFKios.loginPage.enableTouchID.switch")
	private QAFWebElement NFKiosLoginpageEnabletouchidSwitch;
	@FindBy(locator = "NFKios.loginPage.title.lbl")
	private QAFWebElement NFKiosLoginpageTitleLbl;
	@FindBy(locator = "NFKios.loginPage.touchID.img")
	private QAFWebElement NFKiosLoginpageTouchidImg;
	@FindBy(locator = "NFKios.loginPage.forgotpwd.emailfield.txt")
	private QAFWebElement NFKiosLoginpageForgotpwdEmailfieldTxt;
	@FindBy(locator = "NFKios.loginPage.forgotpwd.send.btn")
	private QAFWebElement NFKiosLoginpageForgotpwdSendBtn;
	@FindBy(locator = "NFKios.loginPage.forgotpwd.close.btn")
	private QAFWebElement NFKiosLoginpageForgotpwdCloseBtn;
	@FindBy(locator = "NFKios.loginpage.updatepage.agree.chkbx")
	private List<QAFWebElement> NFKiosLoginpageUpdatepageAgreeChkbx;
	@FindBy(locator = "NFKios.loginPage.meterskip.btn")
	private QAFWebElement NFKiosLoginpageMeterskipBtn;
	@FindBy(locator = "NFKios.loginPage.cancelErrorMsg.img")
	private QAFWebElement NFKiosLoginPageCancelErrorMsgImg;
	@FindBy(locator = "NFKios.loginPage.forgotPassword.NFKLogo.img")
	private QAFWebElement NFKiosLoginPageForgotPasswordNFKLogoImg;
	@FindBy(locator = "NFKios.loginPage.meter.verioflex.img")
	private QAFWebElement NFKiosLoginPageMeterVerioflexImg;
	@FindBy(locator = "NFKios.loginPage.meter.veriosync.img")
	private QAFWebElement NFKiosLoginPageMeterVeriosyncImg;
	@FindBy(locator = "NFKios.loginPage.meter.continue.btn")
	private QAFWebElement NFKiosLoginPageMeterContinueBtn;
	@FindBy(locator = "NFKios.loginPage.password.lbl")
	private QAFWebElement NFKiosloginPagepasswordlbl;
	@FindBy(locator = "NFKios.loginpage.back.btn")
	private QAFWebElement NFKiosloginpagebackbtn;
	@FindBy(locator = "NFKios.loginPage.forgotpassword.link")
	private QAFWebElement NFKiosLoginPageForgotpasswordLink;
	@FindBy(locator = "NFKios.loginPage.signup.adult.link")
	private QAFWebElement NFKiosLoginPageSignupAdultLink;
	@FindBy(locator = "NFKios.loginPage.signup.dependent.link")
	private QAFWebElement NFKiosLoginPageSignupDependentLink;
	@FindBy(locator = "NFKios.dependent.createguardian.cancelBtn")
	private QAFWebElement NFKiosDependentCreateguardianCancelBtn;
	@FindBy(locator = "NFKios.dependent.createguardian.signupBtn")
	private QAFWebElement NFKiosDependentCreateguardianSignupBtn;

	// gest user
	@FindBy(locator = "NFKios.gestational.title")
	private QAFWebElement NFKiosGestationalTitle;
	@FindBy(locator = "NFKios.gestational.profile.info")
	private QAFWebElement NFKiosGestationalProfileInfo;
	@FindBy(locator = "NFKios.gestational.profile.warning")
	private QAFWebElement NFKiosGestationalProfileWarning;
	@FindBy(locator = "NFKios.gestational.typeOne.radio.btn")
	private QAFWebElement NFKiosGestationalTypeOneRadioBtn;
	@FindBy(locator = "NFKios.gestational.typeTwo.radio.btn")
	private QAFWebElement NFKiosGestationalTypeTwoRadioBtn;
	@FindBy(locator = "NFKios.gestational.cancel.btn")
	private QAFWebElement NFKiosGestationalCancelBtn;
	@FindBy(locator = "NFKios.gestational.fotter.part")
	private QAFWebElement NFKiosGestationalFotterPart;
	@FindBy(locator = "NFKios.gestational.continue.btn")
	private QAFWebElement NFKiosGestationalContinueBtn;
	@FindBy(locator = "NFKios.gestational.ResetPassword.firstName")
	private QAFWebElement NFKiosGestationalResetPasswordFirstName;
	@FindBy(locator = "NFKios.gestational.ResetPassword.lastName")
	private QAFWebElement NFKiosGestationalResetPasswordLastName;
	@FindBy(locator = "NFKios.gestational.ResetPassword.emailAddress")
	private QAFWebElement NFKiosGestationalResetPasswordEmailAddress;
	@FindBy(locator = "NFKios.gestational.ResetPassword.confirmEmailAddress")
	private QAFWebElement NFKiosGestationalResetPasswordConfirmEmailAddress;
	@FindBy(locator = "NFKios.gestational.ResetPassword.password")
	private QAFWebElement NFKiosGestationalResetPasswordPassword;
	@FindBy(locator = "NFKios.gestational.ResetPassword.confirmPassword")
	private QAFWebElement NFKiosGestationalResetPasswordConfirmPassword;
	@FindBy(locator = "NFKios.gestational.ResetPassword.birthDayField")
	private QAFWebElement NFKiosGestationalResetPasswordBirthDayField;
	@FindBy(locator = "NFKios.gestational.ResetPassword.termsAndPrivacyButton")
	private QAFWebElement NFKiosGestationalResetPasswordTermsAndPrivacyButton;
	@FindBy(locator = "NFKios.gestational.ResetPassword.continueButton")
	private QAFWebElement NFKiosGestationalResetPasswordContinueButton;
	@FindBy(locator="NFKios.gestational.ResetPassword.checkMarkImage")
    private List<QAFWebElement> NFKiosGestationalResetPasswordCheckMarkImage;
	
	public List<QAFWebElement> getNFKiosGestationalResetPasswordCheckMarkImage() {
		return NFKiosGestationalResetPasswordCheckMarkImage;
	}
	public QAFWebElement getNFKiosGestationalResetPasswordContinueButton() {
		return NFKiosGestationalResetPasswordContinueButton;
	}
	public QAFWebElement getNFKiosGestationalResetPasswordTermsAndPrivacyButton() {
		return NFKiosGestationalResetPasswordTermsAndPrivacyButton;
	}
	public QAFWebElement getNFKiosGestationalResetPasswordBirthDayField() {
		return NFKiosGestationalResetPasswordBirthDayField;
	}
	public QAFWebElement getNFKiosGestationalResetPasswordConfirmPassword() {
		return NFKiosGestationalResetPasswordConfirmPassword;
	}
	public QAFWebElement getNFKiosGestationalResetPasswordPassword() {
		return NFKiosGestationalResetPasswordPassword;
	}
	
	public QAFWebElement getNFKiosGestationalResetPasswordConfirmEmailAddress() {
		return NFKiosGestationalResetPasswordConfirmEmailAddress;
	}
	public QAFWebElement getNFKiosGestationalResetPasswordEmailAddress() {
		return NFKiosGestationalResetPasswordEmailAddress;
	}
	public QAFWebElement getNFKiosGestationalResetPasswordLastName() {
		return NFKiosGestationalResetPasswordLastName;
	}
	public QAFWebElement getNFKiosGestationalResetPasswordFirstName() {
		return NFKiosGestationalResetPasswordFirstName;
	}
	public QAFWebElement getNFKiosGestationalContinueBtn() {
		return NFKiosGestationalContinueBtn;
	}

	public QAFWebElement getNFKiosGestationalTitle() {
		return NFKiosGestationalTitle;
	}

	public QAFWebElement getNFKiosGestationalCancelBtn() {
		return NFKiosGestationalCancelBtn;
	}

	public QAFWebElement getNFKiosGestationalProfileInfo() {
		return NFKiosGestationalProfileInfo;
	}

	public QAFWebElement getNFKiosGestationalProfileWarning() {
		return NFKiosGestationalProfileWarning;
	}

	public QAFWebElement getNFKiosGestationalTypeOneRadioBtn() {
		return NFKiosGestationalTypeOneRadioBtn;
	}

	public QAFWebElement getNFKiosGestationalTypeTwoRadioBtn() {
		return NFKiosGestationalTypeTwoRadioBtn;
	}

	public QAFWebElement getNFKiosGestationalFotterPart() {
		return NFKiosGestationalFotterPart;
	}

	public QAFWebElement getNFKiosDependentCreateguardianSignupBtn() {
		return NFKiosDependentCreateguardianSignupBtn;
	}

	public QAFWebElement getNFKiosDependentCreateguardianCancelBtn() {
		return NFKiosDependentCreateguardianCancelBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKiosLoginPageForgotpasswordLink() {
		return NFKiosLoginPageForgotpasswordLink;
	}

	public QAFWebElement getNFKiosLoginPageSignupAdultLink() {
		return NFKiosLoginPageSignupAdultLink;
	}

	public QAFWebElement getNFKiosLoginPageSignupDependentLink() {
		return NFKiosLoginPageSignupDependentLink;
	}

	public QAFWebElement getNFKiosLoginpageMeterskipBtn() {
		return NFKiosLoginpageMeterskipBtn;
	}

	// Manjushri
	public List<QAFWebElement> getNFKiosLoginpageUpdatepageAgreeChkbx() {
		return NFKiosLoginpageUpdatepageAgreeChkbx;
	}

	public QAFWebElement getNFKiosLoginpageEmailadressTbox() {
		return NFKiosLoginpageEmailadressTbox;
	}

	public QAFWebElement getNFKiosLoginpagePasswordTbox() {
		return NFKiosLoginpagePasswordTbox;
	}

	public QAFWebElement getNFKiosLoginpagePasswordlbl() {
		return NFKiosloginPagepasswordlbl;
	}

	public QAFWebElement getNFKiosLoginpageBackBtn() {
		return NFKiosloginpagebackbtn;
	}

	public QAFWebElement getNFKiosLoginpageEnabletouchidSwitch() {
		return NFKiosLoginpageEnabletouchidSwitch;
	}

	public QAFWebElement getNFKiosLoginpageTitleLbl() {
		return NFKiosLoginpageTitleLbl;
	}

	public QAFWebElement getNFKiosLoginpageTouchidImg() {
		return NFKiosLoginpageTouchidImg;
	}

	public QAFWebElement getNFKiosLoginpageForgotpwdEmailfieldTxt() {
		return NFKiosLoginpageForgotpwdEmailfieldTxt;
	}

	public QAFWebElement getNFKiosLoginpageForgotpwdSendBtn() {
		return NFKiosLoginpageForgotpwdSendBtn;
	}

	public QAFWebElement getNFKiosLoginpageForgotpwdCloseBtn() {
		return NFKiosLoginpageForgotpwdCloseBtn;
	}

	public QAFWebElement getNFKiosLoginpageStaticlabel(String text) {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl", text);
	}

	public QAFWebElement getNFKiosLoginpageKeepmeloginSwitch() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.keepMeLogin.switch",
				LFSUtilsIOS.getPropString("common.logintype.persistent"));
	}

	public QAFWebElement getNFKiosLoginpageLoginBtn() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("login.action.login"));
	}

	public QAFWebElement getNFKiosLoginpageForgotpasswordLbl() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("login.action.forgotPassword").substring(0, 8));
	}

	public QAFWebElement getNFKiosLoginpageSignupLnk() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("createaccount.action.signup"));
	}

	public QAFWebElement getNFKiosLoginpageForgotpwdResetmsgLbl() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("auth.forgotInfo.enterYourEmailLabel"));
	}

	public QAFWebElement getNFKLoginpageUpdatepageContinueBtn() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("alerts.meterTargetRangeDifferenceConfirmation.continue"));
	}

	public QAFWebElement getNFKLoginpageUpdatepageUpdateNoticeLbl() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.updateNotice.lbl",
				LFSUtilsIOS.getPropString("updateNotice.title"));
	}

	public QAFWebElement getNFKiosLoginpageEnabletouchidLbl() {
		return LFSUtilsIOS.getElement("NFKios.loginPage.statictext.lbl",
				LFSUtilsIOS.getPropString("common.logintype.fingerprint"));
	}

	public QAFWebElement getNFKiosLoginPageCancelErrorMsgImg() {
		return NFKiosLoginPageCancelErrorMsgImg;
	}

	public QAFWebElement getNFKiosLoginPageForgotPasswordNFKLogoImg() {
		return NFKiosLoginPageForgotPasswordNFKLogoImg;
	}

	public QAFWebElement getNFKiosLoginPageMeterVerioflexImg() {
		return NFKiosLoginPageMeterVerioflexImg;
	}

	public QAFWebElement getNFKiosLoginPageMeterVeriosyncImg() {
		return NFKiosLoginPageMeterVeriosyncImg;
	}

	public QAFWebElement getNFKiosLoginPageMeterContinueBtn() {
		return NFKiosLoginPageMeterContinueBtn;
	}

	// To verify login page element
	// milan
	public void verifyLoginPage() {
		getNFKiosLoginpageEmailadressTbox().verifyPresent("Username text field is present");
		getNFKiosLoginpagePasswordTbox().verifyPresent("password text field is present");
		getNFKiosLoginpageLoginBtn().verifyPresent("Login button is present");
		// getNFKiosLoginpageForgotpasswordLbl().verifyPresent("Forgot password text is
		// present");
		// getNFKiosLoginpageKeepmeloginSwitch().verifyPresent("Keep me login switch is
		// present");
		Reporter.logWithScreenShot("User is on Log-in Screen", MessageTypes.Pass);
	}

	public void redirectToDecisionScreenFromloginScreen() {
		getNFKiosLoginpageBackBtn().click();
	}

	// updated the method for re-login scenario
	public void fillLoginDetail(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getNFKiosLoginpagePasswordTbox().click();
		if (getNFKiosLoginpageEmailadressTbox().getAttribute("name").equals("LoginViewController.emailLabel")) {
			Reporter.log("The username is already filled", MessageTypes.Pass);

		} else {
			getNFKiosLoginpageEmailadressTbox().sendKeys(userBean.getUsername());
		}
		// getNFKiosLoginpagePasswordTbox().clear();
		getNFKiosLoginpagePasswordTbox().sendKeys(userBean.getPassword());
		// LFSUtilsIOS.clickWithText("ONETOUCH Reveal");
	}

	// Method to click on sign up button when enabled
	public void clickOnLogin_Btn() {
		SignupPageIOS sign = new SignupPageIOS();
		try {
			getNFKiosLoginpageLoginBtn().getAttribute("enabled");
			if (getNFKiosLoginpageLoginBtn().isEnabled()) {
				getNFKiosLoginpageLoginBtn().waitForEnabled();
				Reporter.log("The Login button got enabled ", MessageTypes.Pass);
				getNFKiosLoginpageLoginBtn().click();
			}
			Reporter.logWithScreenShot("The user clicked on Login button", MessageTypes.Pass);
			LFSUtilsIOS.waitforLoad();
		} catch (Exception e) {
			Reporter.logWithScreenShot("The Login button not enabled", MessageTypes.Pass);
		}
		sign.getNFKiosSignuppageUpdateNoticeCheckbox().click();
		sign.getNFKiosSignuppageStaticlabel("Continue").click();
	}

	public void clickOnLogin_Btn1() {
		try {
			getNFKiosLoginpageLoginBtn().getAttribute("enabled");
			if (getNFKiosLoginpageLoginBtn().isEnabled()) {
				getNFKiosLoginpageLoginBtn().waitForEnabled();
				Reporter.log("The Login button got enabled ", MessageTypes.Pass);
				getNFKiosLoginpageLoginBtn().click();
			}
			Reporter.logWithScreenShot("The user clicked on Login button", MessageTypes.Pass);
			LFSUtilsIOS.waitforLoad();
		} catch (Exception e) {
			Reporter.logWithScreenShot("The Login button not enabled", MessageTypes.Pass);
		}
	}

	// Method to clicking authentication type
	// Milan
	public void clickOnAuthenticationType(String option) {

		option = option.toUpperCase();
		switch (option) {
		case "KEEP ME LOGIN":
			if (getNFKiosLoginpageKeepmeloginSwitch().getAttribute("value").contains("0"))
				getNFKiosLoginpageKeepmeloginSwitch().click();
			else {
				Reporter.logWithScreenShot("Keep me login switch is On", MessageTypes.Pass);
			}
			break;
		case "TOUCH ID":
			getNFKiosLoginpageEnabletouchidSwitch().click();
			break;

		case "REQUIRE LOGIN":
			Reporter.logWithScreenShot("Keep me login and Touch ID both are off", MessageTypes.Pass);
			break;
		}
		Reporter.logWithScreenShot("After selecting Authentication Type", MessageTypes.Pass);
	}

	// Method to click forgot password btn
	public void clickOnforgotpass() {
		getNFKiosLoginPageForgotpasswordLink().waitForPresent();
		getNFKiosLoginPageForgotpasswordLink().click();
		Reporter.logWithScreenShot("User has clicked on Forgot Password Link", MessageTypes.Pass);
	}

	// Method to verify forgot password page
	// milan
	public void verifyForgotpwdPage() {
		getNFKiosLoginpageForgotpwdEmailfieldTxt().assertPresent("Email field");
		getNFKiosLoginpageForgotpwdSendBtn().assertPresent("Send button");
		getNFKiosLoginpageForgotpwdResetmsgLbl().assertPresent("Reset message");
		getNFKiosLoginpageForgotpwdCloseBtn().assertPresent("Close button");
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("User has verified the Forgot password screen", MessageTypes.Pass);
		getNFKiosLoginpageForgotpwdCloseBtn().click();
		LFSUtilsIOS.waitforLoad();

	}

	// Method to verify special characters in email field on forgot password page
	public void verifyEmailWithSplChars() {
		getNFKiosLoginpageForgotpwdResetmsgLbl().waitForPresent();
		getNFKiosLoginpageForgotpwdEmailfieldTxt().clear();
		getNFKiosLoginpageForgotpwdEmailfieldTxt().sendKeys("taslim .+{}~^*-_1@gma.com");
		getNFKiosLoginPageForgotPasswordNFKLogoImg().click();
		if (LFSUtilsIOS.tryMethod(
				getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat")))) {
			Reporter.logWithScreenShot("Error message should not present", MessageTypes.Fail);
			getNFKiosLoginPageCancelErrorMsgImg().waitForPresent();
			getNFKiosLoginPageCancelErrorMsgImg().click();
		} else {
			Reporter.logWithScreenShot("Special characters are allowed", MessageTypes.Pass);
		}

	}

	// Method to verify reset password with valid emailID
	public void verifyFGPWDValidEmailID() {
		getNFKiosLoginpageForgotpwdResetmsgLbl().waitForPresent();
		getNFKiosLoginpageForgotpwdEmailfieldTxt().clear();
		getNFKiosLoginpageForgotpwdEmailfieldTxt().sendKeys("Test123@gmail.com");
		getNFKiosLoginpageForgotpwdSendBtn().waitForEnabled();
		getNFKiosLoginpageForgotpwdSendBtn().click();
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("auth.confirmation.checkYourEmail"))
				.verifyVisible("Reset message");
		Reporter.logWithScreenShot("Sent the Mail", MessageTypes.Pass);

	}

	// Method to reset password with invalid emailID
	// Milan
	public void verifyFGPWDInvalidEmailID() {
		getNFKiosLoginpageForgotpwdResetmsgLbl().waitForPresent();
		getNFKiosLoginpageForgotpwdEmailfieldTxt().clear();
		getNFKiosLoginpageForgotpwdSendBtn().click();
		getNFKiosLoginpageForgotpwdSendBtn().verifyDisabled("Send button is disable for blank email field");
		getNFKiosLoginpageForgotpwdEmailfieldTxt().clear();
		getNFKiosLoginpageForgotpwdEmailfieldTxt().sendKeys("Test123");
		getNFKiosLoginpageForgotpwdSendBtn().click();
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.verifyVisible("Error popup for invalid email format");
		getNFKiosLoginpageForgotpwdEmailfieldTxt().clear();
		getNFKiosLoginpageForgotpwdEmailfieldTxt().sendKeys("Test123@");
		getNFKiosLoginpageForgotpwdSendBtn().click();
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.verifyVisible("Error popup for invalid email format");

	}

	public void loginWithoutPasswordField() {
		try {
			getNFKiosLoginpageEmailadressTbox().sendKeys("doshaheentt+q1and@gmail.com.com");
		} catch (Exception e) {
			Reporter.log("Email field is disable");
		}

		getNFKiosLoginpageLoginBtn().click();
		getNFKiosLoginpageLoginBtn().verifyPresent();

		getNFKiosLoginpagePasswordTbox().sendKeys("1111aaaa");
		getNFKiosLoginpageLoginBtn().click();
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("alerts.error.title")).waitForPresent();

		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("network.error.loginAuthentication"))
				.verifyVisible("Error popup Username or password was incorrect");

	}

	public void loginUnregisteredUser() {
		try {
			getNFKiosLoginpageEmailadressTbox().clear();
			getNFKiosLoginpageEmailadressTbox().sendKeys("aera@a.com");
		} catch (Exception e) {
			Reporter.log("Email field is disable");
		}
		getNFKiosLoginpagePasswordTbox().clear();
		getNFKiosLoginpagePasswordTbox().sendKeys("1111aaaa");
		if (getNFKiosLoginpageTitleLbl().isPresent())
			getNFKiosLoginpageTitleLbl().click();
		getNFKiosLoginpageLoginBtn().click();
		if (getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("network.error.loginAuthentication"))
				.verifyVisible("Invalid Credential Popup is displayed")) {
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok"))
					.assertPresent("Ok button on error popup");
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
			Reporter.logWithScreenShot("User is not a registered user", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is a registered user", MessageTypes.Pass);
	}

	public void loginWithInvalidUsername() {
		String typeName = RandomStringUtils.randomAlphanumeric(7) + "@gmail.com";
		try {
			getNFKiosLoginpageEmailadressTbox().clear();
			getNFKiosLoginpageEmailadressTbox().click();
			getNFKiosLoginpageEmailadressTbox().sendKeys(typeName);
		} catch (Exception e) {
			e.printStackTrace();
		}

		getNFKiosLoginpagePasswordTbox().clear();
		getNFKiosLoginpagePasswordTbox().sendKeys("1234abc@@");
		getNFKiosLoginpageLoginBtn().click();
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("network.error.loginAuthentication"))
				.assertPresent("Text of Error pop-up");
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok"))
				.assertPresent("Ok button on error popup");

		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
	}

	public void verifyLengthLoginFields() {
		getNFKiosLoginpageEmailadressTbox().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "@gmail.com";

		getNFKiosLoginpageEmailadressTbox().clear();
		getNFKiosLoginpageEmailadressTbox().sendKeys(typeName);

		getNFKiosLoginpagePasswordTbox().clear();
		getNFKiosLoginpagePasswordTbox().sendKeys(RandomStringUtils.randomAlphanumeric(76));

		getNFKiosLoginpageTitleLbl().click();
		Validator.verifyThat(" length", getNFKiosLoginpageEmailadressTbox().getAttribute("value").length(),
				Matchers.lessThanOrEqualTo(75));
	}

	public void verifyFingerPrint(String successFail) {
		clickOnAuthenticationType("TOUCH ID");

		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).click();
		SignupPageIOS sign = new SignupPageIOS();
		sign.redirectToPage("LOG-IN");
		getNFKiosLoginpageTouchidImg().click();
		Reporter.logWithScreenShot("after clicking", MessageTypes.Pass);

		String command = "mobile:fingerprint:set";
		LFSUtilsIOS lfsUtil = new LFSUtilsIOS();
		Map<String, Object> params = new HashMap<>();
		params.put("identifier", ConfigurationManager.getBundle().getString("appName"));
		params.put("resultAuth", successFail);
		lfsUtil.getDriver().executeScript("mobile:fingerprint:set", params);
		if (successFail.equalsIgnoreCase("success")) {
			params.put("resultAuth", "success");
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).waitForPresent();
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("FingerPrint is enabled successfully", MessageTypes.Pass);
		} else if (successFail.equalsIgnoreCase("fail")) {
			params.put("resultAuth", "fail");
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("FingerPrint authtentication fail", MessageTypes.Pass);
			getNFKiosLoginpageTouchidImg().verifyVisible("Login screen visible");

		}

	}

	// Method to verify email field is non editable once user login in to
	// application
	public void verifyDisableEmailField() {
		getNFKiosLoginpageEmailadressTbox().waitForPresent();
		getNFKiosLoginpageEmailadressTbox().verifyDisabled("Email field after login once");
	}

	// Method to verify keep me login switch disable
	public void verifyKeepMeLoginSwtchDisable() {
		getNFKiosLoginpageKeepmeloginSwitch().waitForPresent();

		WebDriverTestCase.verifyTrue(getNFKiosLoginpageKeepmeloginSwitch().getAttribute("value").contains("0"),
				"Keep me login btn is on", "Keep me login btn is off");
	}

	// method to click on login button only
	public void clickOnLoginBtnOnly() {
//		getNFKiosLoginpageLoginBtn().waitForEnabled();
		Reporter.logWithScreenShot("Login button is present", MessageTypes.Pass);
		getNFKiosLoginpageLoginBtn().click();
	}

	// Method to select update notice page check box and contineu
	public void selectUpdateNotice() {
		try {
			SignupPageIOS signup = new SignupPageIOS();
			signup.getNFKiosSignuppageSingupOkBtn().waitForPresent();
			signup.getNFKiosSignuppageSingupOkBtn().click();
			getNFKLoginpageUpdatepageUpdateNoticeLbl().waitForPresent(5000);
			for (int i = 0; i < getNFKiosLoginpageUpdatepageAgreeChkbx().size(); i++) {
				if (getNFKiosLoginpageUpdatepageAgreeChkbx().get(i).isPresent()) {
					getNFKiosLoginpageUpdatepageAgreeChkbx().get(i).click();
					getNFKLoginpageUpdatepageContinueBtn().click();
					break;
				}
			}

		} catch (Exception e) {
		}
	}

	// Select meter skip button
	public void clickOnSkipSelectMeterScreen() {
		getNFKiosLoginpageMeterskipBtn().waitForPresent();
		Reporter.logWithScreenShot("Select your screen", MessageTypes.Pass);
		getNFKiosLoginpageMeterskipBtn().click();
		Reporter.logWithScreenShot("After clicking skip btn on Turn on your meter screen", MessageTypes.Pass);
	}

	// Mehtod to skip on turn on your meter screen
	public void clickOnSkipTurnOnMeterScreen() {
		getNFKiosLoginpageMeterskipBtn().waitForPresent();
		getNFKiosLoginPageMeterVerioflexImg().click();
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("pairing.turn.on.meter")).waitForPresent();
		Reporter.logWithScreenShot("Turn Meter On screen", MessageTypes.Pass);
		getNFKiosLoginpageMeterskipBtn().click();
		Reporter.logWithScreenShot("After clicking skip btn on Turn on your meter screen", MessageTypes.Pass);
	}

	// method to skip on turn on blooth screen
	public void clickOnSkipTurnOnBluetoothScreen() {
		getNFKiosLoginpageMeterskipBtn().waitForPresent();
		getNFKiosLoginPageMeterVerioflexImg().click();
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("pairing.turn.on.meter")).waitForPresent();
		Reporter.logWithScreenShot("Turn Meter On screen", MessageTypes.Pass);
		getNFKiosLoginPageMeterContinueBtn().click();
		Reporter.logWithScreenShot("After clicking continue btn on Turn on your meter screen", MessageTypes.Pass);
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("pairing.turn.on.bluetooth").substring(0, 10))
				.waitForPresent();
		Reporter.logWithScreenShot("Turn Bluetooth On screen", MessageTypes.Pass);
		getNFKiosLoginpageMeterskipBtn().click();
		Reporter.logWithScreenShot("After clicking skip btn on Turn on Bluetooth screen", MessageTypes.Pass);
	}

	// method to skip on turn on blooth screen
	public void clickOnSkipSearchScreen() {
		getNFKiosLoginpageMeterskipBtn().waitForPresent();
		getNFKiosLoginPageMeterVerioflexImg().click();
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("pairing.turn.on.meter")).waitForPresent();
		Reporter.logWithScreenShot("Turn Meter On screen", MessageTypes.Pass);
		getNFKiosLoginPageMeterContinueBtn().click();
		Reporter.logWithScreenShot("After clicking continue btn on Turn on your meter screen", MessageTypes.Pass);
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("pairing.turn.on.bluetooth").substring(0, 10))
				.waitForPresent();
		Reporter.logWithScreenShot("Turn Bluetooth On screen", MessageTypes.Pass);
		getNFKiosLoginPageMeterContinueBtn().click();
		Reporter.logWithScreenShot("After clicking Continue btn on Turn on Bluetooth screen", MessageTypes.Pass);
		getNFKiosLoginpageMeterskipBtn().click();
		Reporter.logWithScreenShot("After clicking skip btn on search device screen", MessageTypes.Pass);
	}

	// Method to click skip turn meter screen VerioSync
	public void clickOnSkipTurnOnMeterVerioSyncScreen() {
		Point p = getNFKiosLoginpageMeterskipBtn().getLocation();
		LFSUtilsIOS.swipeWithCoordinates(p.getX(), p.getY() + 300, p.getX() - 200, p.getY() + 300, 50);
		getNFKiosLoginpageMeterskipBtn().waitForPresent();
		getNFKiosLoginPageMeterVeriosyncImg().click();
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("pairing.turn.on.meter")).waitForPresent();
		Reporter.logWithScreenShot("Turn Meter On screen", MessageTypes.Pass);
		getNFKiosLoginpageMeterskipBtn().click();
		Reporter.logWithScreenShot("After clicking skip btn on Turn on your meter screen", MessageTypes.Pass);
	}

	// method to skip on turn on blooth screen VerioSync
	public void clickOnSkipTurnOnBluetoothVerioSyncScreen() {
		getNFKiosLoginpageMeterskipBtn().waitForPresent();
		getNFKiosLoginPageMeterVerioflexImg().click();
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("pairing.turn.on.meter")).waitForPresent();
		Reporter.logWithScreenShot("Turn Meter On screen", MessageTypes.Pass);
		getNFKiosLoginPageMeterContinueBtn().click();
		Reporter.logWithScreenShot("After clicking continue btn on Turn on your meter screen", MessageTypes.Pass);
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("pairing.turn.on.bluetooth").substring(0, 10))
				.waitForPresent();
		Reporter.logWithScreenShot("Turn Bluetooth On screen", MessageTypes.Pass);
		getNFKiosLoginpageMeterskipBtn().click();
		Reporter.logWithScreenShot("After clicking skip btn on Turn on Bluetooth screen", MessageTypes.Pass);
	}

	// Method to verify no touch ID present when sensor is off
	public void noTouchIDPresent() {
		getNFKiosLoginpageEnabletouchidLbl().verifyNotPresent("TouchID Switch");
	}

	// method to verify Enable touch id option on sign up page
	// Varsha
	public void verifyTouchIdImageOnLogin() {
		getNFKiosLoginpageTouchidImg().waitForPresent();
		getNFKiosLoginpageTouchidImg().verifyPresent("Enable touch ID image is present");
		Reporter.logWithScreenShot("Perfecto pop up for fingure print activation");
	}

	/*
	 * Get the Os Version of the Device Develop BY:- Biswa Senapati
	 */

	public void getOS_Version() {

		Map<String, Object> params = new HashMap<>();
		params.put("property", "osVersion");
		String osVersion = (String) driver.executeScript("mobile:device:info", params);
		Reporter.log(osVersion);
		ConfigurationManager.getBundle().setProperty("Os.Version", osVersion);

	}
	/*
	 * Verify latest os Support NFK Develop BY:- Biswa Senapati
	 */

	public void verifyLatestOs() {
		String latestOs = "11.1.1";
		String previousLatestOs = "10.3.3";
		String osVersion = (String) ConfigurationManager.getBundle().getProperty("Os.Version");
		Reporter.log(osVersion);
		if (osVersion.equals(latestOs)) {
			Reporter.logWithScreenShot("NFK support latest OS" + osVersion, MessageTypes.Pass);
		}

		else if (osVersion.equals(previousLatestOs)) {
			Reporter.logWithScreenShot("NFK support latest OS" + previousLatestOs, MessageTypes.Pass);
		}

		else {
			Reporter.log("NFK does not support Latest OS", MessageTypes.Fail);
		}
	}

	public void clickLoginButtonToVerifyDelete() {
		getNFKiosLoginpageLoginBtn().click();

	}

	public void verifyAccountDeletePermanent() {
		getNFKiosLoginpageStaticlabel(ConfigurationManager.getBundle().getString("network.error.loginAuthentication"))
				.waitForPresent();

		if (getNFKiosLoginpageStaticlabel(
				ConfigurationManager.getBundle().getString("network.error.loginAuthentication")).isDisplayed()) {
			Reporter.logWithScreenShot("User account is permanently deleted from LFS system", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User account is not deleted permanently from LFS system", MessageTypes.Pass);

	}

	public void clickOnLoginNotAgreedTerms() {
		getNFKiosLoginpageLoginBtn().waitForEnabled();
		Reporter.logWithScreenShot("Login button is present", MessageTypes.Pass);
		getNFKiosLoginpageLoginBtn().click();
		LFSUtilsIOS.waitforLoad();
		try {
			SignupPageIOS signup = new SignupPageIOS();
			signup.getNFKiosSignuppageSingupOkBtn().waitForPresent();
			signup.getNFKiosSignuppageSingupOkBtn().click();
			getNFKLoginpageUpdatepageUpdateNoticeLbl().waitForPresent(5000);

		} catch (Exception e) {
		}

	}

	public void selectAndVerifySensitiveDataScreen() {
		if (getNFKiosLoginpageStaticlabel(ConfigurationManager.getBundle().getString("more.emeaConsent")).isPresent()) {
			Reporter.logWithScreenShot("Consent to Process Personal/Sensitive Data link is present", MessageTypes.Pass);
			getNFKiosLoginpageStaticlabel(ConfigurationManager.getBundle().getString("more.emeaConsent")).click();
		} else
			Reporter.logWithScreenShot("Consent to Process Personal/Sensitive Data link is not present",
					MessageTypes.Fail);
		if (getNFKiosLoginpageStaticlabel(ConfigurationManager.getBundle().getString("more.emeaConsent")).isPresent()) {
			Reporter.logWithScreenShot("Consent to Process Personal/Sensitive Data screen is present",
					MessageTypes.Pass);
			getNFKiosLoginpageStaticlabel("Cancel").waitForPresent();
			getNFKiosLoginpageStaticlabel("Cancel").click();
		} else
			Reporter.logWithScreenShot("Consent to Process Personal/Sensitive Data screen is not present",
					MessageTypes.Fail);
	}

	public void sendDetailsForForgotPasswordLink(String email) {
		getNFKiosLoginpageForgotpwdEmailfieldTxt().clear();
		getNFKiosLoginpageForgotpwdEmailfieldTxt().sendKeys(email);
		getNFKiosLoginpageForgotpwdSendBtn().verifyPresent("Send button");
		getNFKiosLoginpageForgotpwdSendBtn().click();
		if (getNFKiosLoginpageForgotpwdSendBtn().isPresent())
			getNFKiosLoginpageForgotpwdSendBtn().click();

	}

	public void loginAndVerifyLoginWithResetPwd(String email) {
		int i = 0;
		SignupPageIOS signupPageIOS = new SignupPageIOS();
		if (getNFKiosLoginpageEmailadressTbox().getAttribute("enabled").equals("false")) {
			Reporter.logWithScreenShot("Username is already filled", MessageTypes.Pass);
		} else {
			getNFKiosLoginpageEmailadressTbox().sendKeys(email);
		}
		getNFKiosLoginpagePasswordTbox().clear();
		getNFKiosLoginpagePasswordTbox().sendKeys((String) ConfigurationManager.getBundle().getProperty("newPassword"));
		String str = (String) ConfigurationManager.getBundle().getProperty("newPassword");
		Reporter.logWithScreenShot("Login details are filled" + str, MessageTypes.Pass);
		getNFKiosLoginpageLoginBtn().waitForEnabled();
		Reporter.logWithScreenShot("Login button is present", MessageTypes.Pass);
		getNFKiosLoginpageLoginBtn().click();
		try {
			LFSUtilsIOS.pause(10000);
			if (signupPageIOS.getNFKiosSignuppageHcpPassTxt().isPresent()) {
				Reporter.logWithScreenShot("Login button clicked", MessageTypes.Pass);
				signupPageIOS.getNFKiosSignuppageHcpPassTxt().waitForPresent();
				signupPageIOS.getNFKiosSignuppageHcpPassTxt().clear();
				signupPageIOS.getNFKiosSignuppageHcpPassTxt()
						.sendKeys((String) ConfigurationManager.getBundle().getProperty("newPassword"));
				signupPageIOS.getNFKiosSignuppageHcpConfirmpassTxt()
						.sendKeys((String) ConfigurationManager.getBundle().getProperty("newPassword"));
				signupPageIOS.getNFKiosSignuppageOnetouchIcon().click();
				signupPageIOS.getNFKiosSignuppageHcpTermChk().click();
				LFSUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
				signupPageIOS.getNFKiosSignuppageHcpDoneBtn().waitForEnabled();
				signupPageIOS.getNFKiosSignuppageHcpDoneBtn().click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			signupPageIOS.getNFKiosSignuppageSingupOkBtn().waitForPresent();
			signupPageIOS.getNFKiosSignuppageSingupOkBtn().click();
			Reporter.logWithScreenShot("Intended pop up", MessageTypes.Pass);
			LFSUtilsIOS.pause(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (getNFKLoginpageUpdatepageContinueBtn().isPresent())
			Reporter.logWithScreenShot("sucessfully login", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Not sucessfully login", MessageTypes.Fail);
	}

	public void doDependentLogin(Object userdata) {
		UserDetailBeans userbean = new UserDetailBeans();
		if (userdata instanceof String) {
			userbean.fillFromConfig((String) userdata);
		} else {
			userbean.fillData(userdata);
		}
		getNFKiosLoginpageEmailadressTbox().click();
		getNFKiosLoginpageEmailadressTbox().sendKeys(userbean.getDependentemail());
		getNFKiosLoginpagePasswordTbox().click();
		getNFKiosLoginpagePasswordTbox().sendKeys(userbean.getDependentpassword());
		Reporter.logWithScreenShot("User has entered the Login dependent details", MessageTypes.Pass);
	}

	public void verifyLoginDependentscreen() {
		LFSUtilsIOS.waitforLoad();
		getNFKiosLoginpageEmailadressTbox().assertPresent("Email field");
		getNFKiosLoginpagePasswordTbox().assertPresent("Password field");
		getNFKiosLoginPageForgotpasswordLink().assertPresent("Forgot password link");
		getNFKiosLoginPageSignupAdultLink().assertPresent("Signup Adult link");
		getNFKiosLoginPageSignupDependentLink().assertPresent("Signup dependent link");
		Reporter.logWithScreenShot("User has verified the Login page", MessageTypes.Pass);

	}

	public void handleErrorPopup() {
		if (getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("alerts.error.title")).isPresent()) {
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("alerts.error.title"))
					.assertPresent("Error pop-up title");
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("network.error.loginAuthentication"))
					.assertPresent("Text of Error pop-up");
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok"))
					.assertPresent("Ok button on error popup");
			Reporter.logWithScreenShot("Error Pop-up displayed", MessageTypes.Pass);
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
		} else {
			Reporter.logWithScreenShot("Incorrect Error Pop-up is displayed", MessageTypes.Fail);
		}

	}

	public void doLogin1() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.password");
		getNFKiosLoginpagePasswordTbox().click();
		if (getNFKiosLoginpageEmailadressTbox().getAttribute("name").equals("LoginViewController.emailLabel")) {
			Reporter.log("The username is already filled", MessageTypes.Pass);
		} else {
			getNFKiosLoginpageEmailadressTbox().sendKeys(email);
		}
		getNFKiosLoginpagePasswordTbox().sendKeys(password);

	}

	public void verifyCreateGuardianAccountPopup() {
		if (getNFKiosDependentCreateguardianCancelBtn().isPresent()
				&& getNFKiosDependentCreateguardianSignupBtn().isPresent()) {
			Reporter.logWithScreenShot("Create Guardian Account popup Available", MessageTypes.Pass);
		}
	}

	public void ClickonCancelButton() {
		getNFKiosDependentCreateguardianCancelBtn().isPresent();
		getNFKiosDependentCreateguardianCancelBtn().click();
	}

	public void ClickonSignup() {
		getNFKiosDependentCreateguardianSignupBtn().isPresent();
		getNFKiosDependentCreateguardianSignupBtn().click();
	}

	public void clickOnLogin_BtnforMinor() {
		try {
			getNFKiosLoginpageLoginBtn().getAttribute("enabled");
			if (getNFKiosLoginpageLoginBtn().isEnabled()) {
				getNFKiosLoginpageLoginBtn().waitForEnabled();
				Reporter.log("The Login button got enabled ", MessageTypes.Pass);
				getNFKiosLoginpageLoginBtn().click();
			}
			Reporter.logWithScreenShot("The user clicked on Login button", MessageTypes.Pass);
			LFSUtilsIOS.waitforLoad();
		} catch (Exception e) {
			Reporter.logWithScreenShot("The Login button not enabled", MessageTypes.Pass);
		}
	}

	public void validatesInvalidEmailForgotPass() {
		String email = "doshaheentt+" + RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		SignupPageIOS signupPageIOS = new SignupPageIOS();
		getNFKiosLoginpageForgotpwdEmailfieldTxt().clear();
		getNFKiosLoginpageForgotpwdSendBtn().click();
		getNFKiosLoginpageForgotpwdSendBtn().verifyDisabled("Send button is disable for blank email field");
		getNFKiosLoginpageForgotpwdEmailfieldTxt().sendKeys("Test123");
		getNFKiosLoginpageForgotpwdSendBtn().click();
		if (getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Invalid Email Error Msg Displayed", MessageTypes.Pass);
			System.out.println("PASS error msg");
		} else {
			Reporter.logWithScreenShot("Invalid Email Error Msg Not Displayed", MessageTypes.Fail);
		}

		getNFKiosLoginpageForgotpwdEmailfieldTxt().sendKeys(email);
		getNFKiosLoginpageForgotpwdSendBtn().click();
		getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("auth.confirmation.checkYourEmail"))
				.assertPresent("Text of Email send");
		signupPageIOS.getNFKiosSignuppageSingupOkBtn().waitForPresent();
		signupPageIOS.getNFKiosSignuppageSingupOkBtn().click();

	}

	public void ClickBackandMydepedentData() {
		SignupPageIOS signuppage = new SignupPageIOS();
		getNFKiosLoginpageBackBtn().click();
		signuppage.getNFKiosDecisionPageLoginDependentBtn().click();
	}

	public void LoginIncorrectPassword() {
		getNFKiosLoginpageEmailadressTbox().clear();
		getNFKiosLoginpageEmailadressTbox().sendKeys("testaccvm@mailinator.com");
		getNFKiosLoginpagePasswordTbox().clear();
		getNFKiosLoginpageLoginBtn().verifyDisabled("Login Button  after blank  password");
		getNFKiosLoginpagePasswordTbox().sendKeys("1111aaaa");
		getNFKiosLoginpageLoginBtn().click();
		if (getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("network.error.loginAuthentication"))
				.verifyVisible("Invalid Credential Popup is displayed")) {
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok"))
					.assertPresent("Ok button on error popup");
			getNFKiosLoginpageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
			Reporter.logWithScreenShot("User is not a registered user", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is a registered user", MessageTypes.Fail);
	}

	public void verifyGestationalScreen() {
		getNFKiosGestationalTitle().assertPresent("Title of Gestational");
		getNFKiosGestationalProfileInfo().assertPresent("Profile information");
		getNFKiosGestationalProfileWarning().assertPresent("Profile warning");
		getNFKiosGestationalTypeOneRadioBtn().assertPresent("Type 1 radio button");
		getNFKiosGestationalTypeTwoRadioBtn().assertPresent("Tyep 2 Radio button");
		if (!getNFKiosGestationalContinueBtn().isEnabled())
			Reporter.log("Continue button is disabled", MessageTypes.Pass);
		else
			Reporter.log("Continue button is Enabled", MessageTypes.Fail);
		getNFKiosGestationalCancelBtn().isPresent();
		getNFKiosGestationalFotterPart().isPresent();
	}

	public void clickCancelNavLogin() {
		getNFKiosGestationalCancelBtn().isPresent();
		getNFKiosGestationalCancelBtn().click();
		Reporter.logWithScreenShot("User has clicked on Cancel button", MessageTypes.Pass);
	}

	public void VerifyResetPwd() {
		getNFKiosGestationalResetPasswordFirstName().verifyPresent("First Name is present");
		getNFKiosGestationalResetPasswordLastName().verifyPresent("Last Name is present");
		getNFKiosGestationalResetPasswordEmailAddress().verifyPresent("Email Address is present");
		getNFKiosGestationalResetPasswordConfirmEmailAddress().verifyPresent("Confirm Email Address is present");
		getNFKiosGestationalResetPasswordPassword().verifyPresent("Password is present");
		getNFKiosGestationalResetPasswordConfirmPassword().verifyPresent("Confirm Password is present");
		getNFKiosGestationalResetPasswordBirthDayField().verifyPresent("Birth day field is present");
		getNFKiosGestationalResetPasswordTermsAndPrivacyButton().verifyPresent("Term and Privacy Button is present");
		
		for (int i=0;i<4;i++) {
			getNFKiosGestationalResetPasswordCheckMarkImage().get(i).isPresent();
		}
		LFSUtilsIOS.hideKeyboard();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKiosGestationalResetPasswordPassword().sendKeys("test1234");
		getNFKiosGestationalResetPasswordConfirmPassword().sendKeys("test1234");
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKiosGestationalResetPasswordTermsAndPrivacyButton().click();
		getNFKiosGestationalResetPasswordContinueButton().verifyPresent("Continue button is present");
	}
}
