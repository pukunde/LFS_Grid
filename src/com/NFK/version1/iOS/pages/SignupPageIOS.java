package com.NFK.version1.iOS.pages;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.NFK.support.ApiMethods;
import com.NFK.support.ConstantUtils;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.beans.UserDetailBeans;
import com.google.common.collect.ImmutableMap;
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
import com.qmetry.qaf.automation.util.Validator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

public class SignupPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFKios.signupPage.oneTouch.icon")
	private QAFWebElement NFKiosSignuppageOnetouchIcon;
	@FindBy(locator = "NFKios.signupPage.termOfService.lbl")
	private QAFWebElement NFKiosSignuppageTermofserviceLbl;
	@FindBy(locator = "NFKios.signupPage.termOfService.cBox")
	private QAFWebElement NFKiosSignuppageTermofserviceCbox;
	@FindBy(locator = "NFKios.signupPage.countryTerms.lbl")
	private QAFWebElement NFKiosSignuppageCountrytermsLbl;
	@FindBy(locator = "NFKios.signupPage.countryTerms.cBox")
	private QAFWebElement NFKiosSignuppageCountrytermsCbox;
	@FindBy(locator = "NFKios.signupPage.emailAdress.tBox")
	private QAFWebElement NFKiosSignuppageEmailadressTbox;
	@FindBy(locator = "NFKios.signupPage.confirmEmailAdress.tBox")
	private QAFWebElement NFKiosSignuppageConfirmemailadressTbox;
	@FindBy(locator = "NFKios.signupPage.password.tBox")
	private QAFWebElement NFKiosSignuppagePasswordTbox;
	@FindBy(locator = "NFKios.signupPage.dateOfBirth.tBox")
	private QAFWebElement NFKiosSignuppageDateofbirthTbox;
	@FindBy(locator = "NFKios.signupPage.signUp.btn")
	private QAFWebElement NFKiosSignuppageSignupBtn;
	@FindBy(locator = "NFKios.signupPage.login.lnk")
	private QAFWebElement NFKiosSignuppageLoginLnk;
	@FindBy(locator = "NFKios.signupPage.enableTouchID.btn")
	private QAFWebElement NFKiosSignuppageEnabletouchidBtn;
	@FindBy(locator = "NFKios.signupPage.keepMeLogIn.btn")
	private QAFWebElement NFKiosSignuppageKeepmeloginBtn;
	@FindBy(locator = "NFKios.signupPage.requirLogin.btn")
	private QAFWebElement NFKiosSignuppageRequirloginBtn;
	@FindBy(locator = "NFKios.signuppage.firstname.txt")
	private QAFWebElement NFKiosSignuppageFirstNameTxt;
	@FindBy(locator = "NFKios.signuppage.lastname.txt")
	private QAFWebElement NFKiosSignuppageLastNameTxt;
	@FindBy(locator = "NFKios.signuppage.confirmpassword.txt")
	private QAFWebElement NFKiosSignuppageConfirmPasswordTxt;
	@FindBy(locator = "NFKios.signuppage.officecode.txt")
	private QAFWebElement NFKiosSignuppageOfficeCodeTxt;
	@FindBy(locator = "NFKios.signuppage.clinicinfo.txt")
	private QAFWebElement NFKiosSignuppageClinicinfoTxt;
	@FindBy(locator = "NFKios.signuppage.birthday.month.pkr")
	private QAFWebElement NFKiosSignuppageBirthdayMonthPkr;
	@FindBy(locator = "NFKios.signuppage.birthday.date.pkr")
	private QAFWebElement NFKiosSignuppageBirthdayDatePkr;
	@FindBy(locator = "NFKios.signuppage.timingPicker.year.pkr")
	private QAFWebElement NFKiosSignuppageTimingpickerYearPkr;
	@FindBy(locator = "NFKios.signuppage.signup.ok.btn")
	private QAFWebElement NFKiosSignuppageSingupOkBtn;
	@FindBy(locator = "NFKios.signuppage.optin.iagree.lbl")
	private QAFWebElement NFKiosSignuppageOptinIagreeLbl;
	@FindBy(locator = "NFKios.signuppage.optin.cancel.lbl")
	private QAFWebElement NFKiosSignuppageOptinCancelLbl;
	@FindBy(locator = "NFKios.signuppage.optin.title.lbl")
	private QAFWebElement NFKiosSignuppageOptinTitleLbl;
	@FindBy(locator = "NFKios.signuppage.greeCheck.img")
	private QAFWebElement NFKiosSignuppagegreenCheckImg;
	@FindBy(locator = "NFKios.signuppage.checkebox")
	private QAFWebElement NFKiosSignuppageCheckebox;
	@FindBy(locator = "NFKios.signuppage.Agree.lbl")
	private QAFWebElement NFKiosSignuppageAgreeLbl;
	@FindBy(locator = "NFKios.signuppage.hcp.email.txt")
	private QAFWebElement NFKiosSignuppageHcpEmailTxt;
	@FindBy(locator = "NFKios.signuppage.hcp.pass.txt")
	private QAFWebElement NFKiosSignuppageHcpPassTxt;
	@FindBy(locator = "NFKios.signuppage.hcp.confirmpass.txt")
	private QAFWebElement NFKiosSignuppageHcpConfirmpassTxt;
	@FindBy(locator = "NFKios.signuppage.hcp.datofbirth.txt")
	private QAFWebElement NFKiosSignuppageHcpDatofbirthTxt;
	@FindBy(locator = "NFKios.signuppage.hcp.term.chk")
	private QAFWebElement NFKiosSignuppageHcpTermChk;
	// SG Locators for German Unit of Measure Page

	@FindBy(locator = "NFKios.signuppage.term.lnk")
	private QAFWebElement NFKiosSignupPageTermLnk;
	@FindBy(locator = "NFKios.signuppage.privecy.lnk")
	private QAFWebElement NFKiosSignupPagePrivecyLnk;
	@FindBy(locator = "NFKios.signupPage.meterskip.btn")
	private QAFWebElement NFKiosSignupPageMeterskipBtn;
	@FindBy(locator = "NFKios.signupPage.errorMessage.txt")
	private QAFWebElement NFKiosSignupPageErrorMessageTxt;
	@FindBy(locator = "NFKios.signupPage.errorCancel.img")
	private QAFWebElement NFKiosSignupPageErrorCancelImg;
	@FindBy(locator = "NFKios.signupPage.optin.customer.service.link")
	private QAFWebElement NFKiosSignupPageOptinCustomerServiceLink;
	@FindBy(locator = "NFKios.signupPage.notification.allow.popup")
	private QAFWebElement NFKiosSignupPageNotificationAllowPopup;
	@FindBy(locator = "NFKios.signupPage.notification.dontallow.popup")
	private QAFWebElement NFKiosSignupPageNotificationDontallowPopup;
	@FindBy(locator = "NFKios.signupPage.optin.privecy.lnk")
	private QAFWebElement NFKiosSignupPageOptinPrivecylnk;
	@FindBy(locator = "NFKios.signupPage.updateNotice.check.img")
	private QAFWebElement NFKiosSignupPageUpdateNoticeCheckBoxImg;
	@FindBy(locator = "NFKios.signupPage.updateNotice.continue.btn")
	private QAFWebElement NFKiosSignupPageUpdateNoticeContinueBtn;
	@FindBy(locator = "NFKios.signupPage.invalidClinicCode.close.btn")
	private QAFWebElement NFKiosSignupPageInvalidClinicCodeClosebtn;
	@FindBy(locator = "NFKios.signup.gender.selection.male.btn")
	private QAFWebElement NFKiosSignupGenderSelectionMaleBtn;
	@FindBy(locator = "NFKios.signup.gender.selection.female.btn")
	private QAFWebElement NFKiosSignupGenderSelectionFemaleBtn;
	@FindBy(locator = "NFKios.signup.diabetestype.type1.btn")
	private QAFWebElement NFKiosSignupDiabetesTypeType1btn;
	@FindBy(locator = "NFKios.signup.diabetestype.type2.btn")
	private QAFWebElement NFKiosSignupDiabetesTypeType2btn;
	@FindBy(locator = "NFKios.signup.diabetestype.gestational.btn")
	private QAFWebElement NFKiosSignupDiabetesTypeGestationalbtn;
	@FindBy(locator = "NFKios.signuppage.secondscreen.continue.btn")
	private QAFWebElement NFKiosSignupPageSecondScreenContinueBtn;
	@FindBy(locator = "NFKios.signuppage.back.button")
	private QAFWebElement NFKiosSignupPageBackButton;
	@FindBy(locator = "NFKios.signuppage.addclinic.send.btn")
	private QAFWebElement NFKiosSignuppageAddclinicSendBtn;
	@FindBy(locator = "NFKios.signuppage.addclinic.cancel.btn")
	private QAFWebElement NFKiosSignuppageAddclinicCancelBtn;
	@FindBy(locator = "NFKios.signuppage.addclinic.termchk.btn")
	private QAFWebElement NFKiosSignuppageAddclinicTermchkBtn;
	@FindBy(locator = "NFKios.signuppage.addedclinic.no.txt")
	private QAFWebElement NFKiosSignuppageAddedclinicNoTxt;
	@FindBy(locator = "NFKios.decisionpage.signup.button")
	private QAFWebElement NFKiosDecisionPageSignupButton;
	@FindBy(locator = "NFKios.decisionpage.yes.login.button")
	private QAFWebElement NFKiosDecisionPageYesLoginButton;
	@FindBy(locator = "NFKios.signuppage.back.btn")
	private QAFWebElement NFKiosSignUpPageBackBtn;
	@FindBy(locator = "NFKios.signupPage.safetynext.btn")
	private QAFWebElement NFKiosSignUpPageSafetyNextBtn;
	@FindBy(locator = "NFKios.signupPage.safetyboard.TrustHowYouFeel.cBox")
	private QAFWebElement NFKiosSignupPageSafetyboardTrustHowYouFeelCBox;
	@FindBy(locator = "NFKios.signupPage.safetyonboarding.alertok.btn")
	private QAFWebElement NFKiosSignupPageSafetyonboardingAlertokBtn;
	@FindBy(locator = "NFKios.signupPage.safetyboard.NoMR.cBox")
	private QAFWebElement NFKiosSignupPageSafetyboardNoMRCBox;
	@FindBy(locator = "NFKios.signupPage.safetyboard.TreatmentDecisions.cBox")
	private QAFWebElement NFKiosSignupPageSafetyboardTreatmentDecisionsCBox;
	@FindBy(locator = "NFKios.signupPage.safetyboard.AlertNotifications.cBox")
	private QAFWebElement NFKiosSignupPageSafetyboardAlertNotificationsCBox;
	@FindBy(locator = "NFKios.signupPage.safetyboard.Notifications.popup")
	private QAFWebElement NFKiosSignupPageSafetyboardNotificationsPopup;
	@FindBy(locator = "NFKios.signupPage.safetyboard.Notifications.allow.popup")
	private QAFWebElement NFKiosSignupPageSafetyboardNotificationsAllowPopup;
	@FindBy(locator = "NFKios.safteyonboarding.settings.btn")
	private QAFWebElement NFKiosSafteyonboardingSettingsBtn;
	@FindBy(locator = "NFKios.settings.notification.btn")
	private QAFWebElement NFKiosSettingsNotificationBtn;
	@FindBy(locator = "NFKios.signupPage.pair.sensor.title")
	private QAFWebElement NFKiosSignupPagePairSensorTitle;
	@FindBy(locator = "NFKios.settings.back.btn")
	private QAFWebElement NFKiosSettingsBackBtn;
	@FindBy(locator = "NFKios.signupPage.pair.sensor.skip.btn")
	private QAFWebElement NFKiosSignupPagePairSensorSkipBtn;
	@FindBy(locator = "NFKios.signupPage.safetydone.btn")
	private QAFWebElement NFKiosSignUpPageSafetyDoneBtn;
	@FindBy(locator = "NFKios.signupPage.start.sensor.title")
	private QAFWebElement NFKiosSignupPageStartSensorTitle;
	@FindBy(locator = "NFKios.decisionpage.signup.myself.btn")
	private QAFWebElement NFKiosDecisionPageSignupMyselfBtn;
	@FindBy(locator = "NFKios.decisionpage.signup.dependent.btn")
	private QAFWebElement NFKiosDecisionPageSignupDependentBtn;
	@FindBy(locator = "NFKios.decisionpage.login.own.btn")
	private QAFWebElement NFKiosDecisionPageLoginOwnBtn;
	@FindBy(locator = "NFKios.decisionpage.login.dependent.btn")
	private QAFWebElement NFKiosDecisionPageLoginDependentBtn;

	@FindBy(locator = "NFKios.signuppage.dependent.guardian.fname")
	private QAFWebElement NFKiosSignuppageDependentGuardianFname;
	@FindBy(locator = "NFKios.signuppage.dependent.guardian.lname")
	private QAFWebElement NFKiosSignuppageDependentGuardianLname;
	@FindBy(locator = "NFKios.signuppage.dependent.email")
	private QAFWebElement NFKiosSignuppageDependentEmail;
	@FindBy(locator = "NFKios.signuppage.dependent.confirm.email")
	private QAFWebElement NFKiosSignuppageDependentConfirmEmail;
	@FindBy(locator = "NFKios.signuppage.dependent.continue")
	private QAFWebElement NFKiosSignuppageDependentContinue;
	@FindBy(locator = "NFKios.signuppage.dependent.terms.checkbox")
	private QAFWebElement NFKiosSignuppageDependentTermsCheckbox;
	@FindBy(locator = "NFKios.signuppage.dependent.marketing.checkbox")
	private QAFWebElement NFKiosSignuppageDependentMarketingCheckbox;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.fname")
	private QAFWebElement NFKiosSignuppageDependentFname;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.lname")
	private QAFWebElement NFKiosSignuppageDependentLname;
	@FindBy(locator = "NFKios.signuppage.dependent.Clinic")
	private QAFWebElement NFKiosSignuppageDependentClinic;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.radioButtonMale")
	private QAFWebElement NFKiosSignuppageDependentRadioButtonMale;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.radioButtonFemale")
	private QAFWebElement NFKiosSignuppageDependentRadioButtonFemale;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.radioButtonTypeOne")
	private QAFWebElement NFKiosSignuppageDependentRadioButtonTypeOne;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.radioButtonTypeTwo")
	private QAFWebElement NFKiosSignuppageDependentRadioButtonTypeTwo;
	@FindBy(locator = "NFKios.decisionpage.signuppage.dependent.signUpButton")
	private QAFWebElement NFKiosSignuppageDependentSignUpButton;
	@FindBy(locator = "NFKios.signuppage.dependent.guardianaccount.text")
	private QAFWebElement NFKiosSignuppageDependentGuardianaccountText;
	@FindBy(locator = "NFKios.signuppage.dependent.password")
	private QAFWebElement NFKiosSignuppageDependentPassword;
	@FindBy(locator = "NFKios.signuppage.dependent.confirm.password")
	private QAFWebElement NFKiosSignuppageDependentConfirmPassword;

	// Germany and Veitnam
	@FindBy(locator = "NFKios.signup.page.UOM.select.title")
	private QAFWebElement NFKsignuppageUomselecttitle;
	@FindBy(locator = "NFKios.signup.page.UOM.select.text")
	private QAFWebElement NFKsignuppageUomselecttext;
	@FindBy(locator = "NFKios.signup.page.UOM.select.mgdl.button.text")
	private QAFWebElement NFKsignuppageUomselectMgdlbuttontext;
	@FindBy(locator = "NFKios.signup.page.UOM.select.mgdl.button")
	private QAFWebElement NFKsignuppageUomselectMgdlbutton;
	@FindBy(locator = "NFKios.signup.page.UOM.select.mmol.button.text")
	private QAFWebElement NFKsignuppageUomselectMmolbuttontext;
	@FindBy(locator = "NFKios.signup.page.UOM.select.mmol.button")
	private QAFWebElement NFKsignuppageUomselectMmolbutton;
	@FindBy(locator = "NFKios.signup.page.UOM.select.text1")
	private QAFWebElement NFKsignuppageUomselecttext1;

	@FindBy(locator = "NFKios.signuppage.clinic.name")
	private QAFWebElement NFKiosSignuppageClinicName;
	@FindBy(locator = "NFKios.signuppage.clinic.phone")
	private QAFWebElement NFKiosSignuppageClinicPhone;
	@FindBy(locator = "NFKios.signuppage.clinic.msg.txt")
	private QAFWebElement NFKiosSignuppageClinicMsgTxt;
	@FindBy(locator = "NFKios.signuppage.clinic.cancel.btn")
	private QAFWebElement NFKiosSignuppageClinicCancelBtn;
	@FindBy(locator = "NFKios.signuppage.update.notice.checkbox")
	private QAFWebElement NFKiosSignuppageUpdateNoticeCheckbox;

	@FindBy(locator = "NFKios.settings.backToApp.btn")
	private QAFWebElement NFKiosSettingsBackToAppBtn;

	@FindBy(locator = "NFKios.signupPage.safetyboard.UrgentLowNotification.txt")
	private QAFWebElement NFKiosSignupPageSafetyboardUrgentLowNotificationtxt;
	@FindBy(locator = "NFKios.safteyonboarding.back.btn")
	private QAFWebElement NFKiosSafteyboardingBackBtn;
	@FindBy(locator = "NFKios.signupPage.safetyboard.PairSensorScreen.txt")
	private QAFWebElement NFKiosSignupPageSafetyboardPairSensorScreentxt;

	// new screen after saftey onboarding
	@FindBy(locator = "NFKios.applysensor.title")
	private QAFWebElement NFKiosApplysensorTitle;
	@FindBy(locator = "NFKios.applysensor.skip.btn")
	private QAFWebElement NFKiosApplysensorSkipBtn;
	// Invalid Email Message
	@FindBy(locator = "NFKios.signupPage.error.msg.email")
	private QAFWebElement NFKiosSignupPageErrorMsgEmail;

	@FindBy(locator = "NFKios.signupPage.error.icon")
	private QAFWebElement NFKiosSignupPageErrorIcon;

	@FindBy(locator = "NFKios.signupPage.error.msg.password")
	private QAFWebElement NFKiosSignupPageErrorMsgPassword;

	@FindBy(locator = "NFKios.signupPage.error.msg.comfirm.password")
	private QAFWebElement NFKiosSignupPageErrorMsgComfirmPassword;

	@FindBy(locator = "NFKios.signupPage.errorLabel")
	private QAFWebElement NFKiosSignupPageErrorLabel;

	@FindBy(locator = "NFKios.signupPage.age.restriction.popup.title")
	private QAFWebElement NFKiosSignupPageAgeRestrictionPopupTitle;

	@FindBy(locator = "NFKios.signupPage.age.restriction.popup.close")
	private QAFWebElement NFKiosSignupPageAgeRestrictionPopupClose;

	@FindBy(locator = "NFKios.signupPage.age.restriction.popup.ok")
	private QAFWebElement NFKiosSignupPageAgeRestrictionPopupOK;
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
	@FindBy(locator = "NFKios.signupPage.emancipation.email")
	private QAFWebElement NFKiosSignupPageEmancipationEmail;

	@FindBy(locator = "NFKios.signupPage.emancipation.confirmEmail")
	private QAFWebElement NFKiosSignupPageEmancipationConfirmEmail;

	@FindBy(locator = "NFKios.signupPage.emancipation.password")
	private QAFWebElement NFKiosSignupPageEmancipationPassword;

	@FindBy(locator = "NFKios.signupPage.emancipation.confirmPassword")
	private QAFWebElement NFKiosSignupPageEmancipationConfirmPassword;

	@FindBy(locator = "NFKios.signupPage.emancipation.termsAndPrivacy")
	private QAFWebElement NFKiosSignupPageEmancipationTermsAndPrivacy;

	@FindBy(locator = "NFKios.signupPage.emancipation.marketingAgreement")
	private QAFWebElement NFKiosSignupPageEmancipationMarketingAgreement;

	@FindBy(locator = "NFKios.signupPage.emancipation.continue")
	private QAFWebElement NFKiosSignupPageEmancipationContinueBtn;

	@FindBy(locator = "NFKios.signupPage.dependentprofile.title")
	private QAFWebElement NFKiosSignupPageDependentprofileTitle;
@FindBy(locator = "NFKios.signupPage.logo")
	private QAFWebElement NFKiosSignupPageLogo;

	@FindBy(locator = "NFKios.signuppage.dependent.emailLabel")
	private QAFWebElement NFKiosSignuppageDependentEmailLabel;
	
	public QAFWebElement getNFKiosSignuppageDependentEmailLabel() {
		return NFKiosSignuppageDependentEmailLabel;
	}
	
	public QAFWebElement getNFKiosSignupPageLogo() {
		return NFKiosSignupPageLogo;
	}

	public QAFWebElement getNFKiosSignupPageDependentprofileTitle() {
		return NFKiosSignupPageDependentprofileTitle;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationContinueBtn() {
		return NFKiosSignupPageEmancipationContinueBtn;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationEmail() {
		return NFKiosSignupPageEmancipationEmail;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationConfirmEmail() {
		return NFKiosSignupPageEmancipationConfirmEmail;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationPassword() {
		return NFKiosSignupPageEmancipationPassword;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationConfirmPassword() {
		return NFKiosSignupPageEmancipationConfirmPassword;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationTermsAndPrivacy() {
		return NFKiosSignupPageEmancipationTermsAndPrivacy;
	}

	public QAFWebElement getNFKiosSignupPageEmancipationMarketingAgreement() {
		return NFKiosSignupPageEmancipationMarketingAgreement;
	}

	public QAFWebElement getNFKiosGestationalTitle() {
		return NFKiosGestationalTitle;
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

	public QAFWebElement getNFKiosGestationalCancelBtn() {
		return NFKiosGestationalCancelBtn;
	}

	public QAFWebElement getNFKiosGestationalFotterPart() {
		return NFKiosGestationalFotterPart;
	}

	public QAFWebElement getNFKiosSignupPageAgeRestrictionPopupTitle() {
		return NFKiosSignupPageAgeRestrictionPopupTitle;
	}

	public QAFWebElement getNFKiosSignupPageAgeRestrictionPopupOK() {
		return NFKiosSignupPageAgeRestrictionPopupOK;
	}

	public QAFWebElement getNFKiosSignupPageAgeRestrictionPopupClose() {
		return NFKiosSignupPageAgeRestrictionPopupClose;
	}

	public QAFWebElement getNFKiosSignupPageErrorLabel() {
		return NFKiosSignupPageErrorLabel;
	}

	public QAFWebElement getNFKiosSignupPageErrorMsgComfirmPassword() {
		return NFKiosSignupPageErrorMsgComfirmPassword;
	}

	public QAFWebElement getNFKiosSignupPageErrorMsgPassword() {
		return NFKiosSignupPageErrorMsgPassword;
	}

	public QAFWebElement getNFKiosSignupPageErrorIcon() {
		return NFKiosSignupPageErrorIcon;
	}

	public QAFWebElement getNFKiosSignupPageErrorMsgEmail() {
		return NFKiosSignupPageErrorMsgEmail;
	}

	public QAFWebElement getNFKiosApplysensorTitle() {
		return NFKiosApplysensorTitle;
	}

	public QAFWebElement getNFKiosApplysensorSkipBtn() {
		return NFKiosApplysensorSkipBtn;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardPairSensorScreentxt() {
		return NFKiosSignupPageSafetyboardPairSensorScreentxt;
	}

	public QAFWebElement getNFKiosSettingsBackToAppBtn() {
		return NFKiosSettingsBackToAppBtn;
	}

	public QAFWebElement getNFKiosSafteyboardingBackBtn() {
		return NFKiosSafteyboardingBackBtn;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardUrgentLowNotificationtxt() {
		return NFKiosSignupPageSafetyboardUrgentLowNotificationtxt;
	}

	public QAFWebElement getNFKiosSignuppageUpdateNoticeCheckbox() {
		return NFKiosSignuppageUpdateNoticeCheckbox;
	}

	public QAFWebElement getNFKiosSettingsBackBtn() {
		return NFKiosSettingsBackBtn;
	}

	public QAFWebElement getNFKiosSafteyonboardingSettingsBtn() {
		return NFKiosSafteyonboardingSettingsBtn;
	}

	public QAFWebElement getNFKiosSettingsNotificationBtn() {
		return NFKiosSettingsNotificationBtn;
	}

	public QAFWebElement getNFKiosSignuppageClinicName() {
		return NFKiosSignuppageClinicName;
	}

	public QAFWebElement getNFKiosSignuppageClinicPhone() {
		return NFKiosSignuppageClinicPhone;
	}

	public QAFWebElement getNFKiosSignuppageClinicMsgTxt() {
		return NFKiosSignuppageClinicMsgTxt;
	}

	public QAFWebElement getNFKiosSignuppageClinicCancelBtn() {
		return NFKiosSignuppageClinicCancelBtn;
	}

	public QAFWebElement getNFKiossignuppageUomselecttext1() {
		return NFKsignuppageUomselecttext1;
	}

	public QAFWebElement getNFKiossignuppageUomselectMmolbutton() {
		return NFKsignuppageUomselectMmolbutton;
	}

	public QAFWebElement getNFKiossignuppageUomselectMmolbuttontext() {
		return NFKsignuppageUomselectMmolbuttontext;
	}

	public QAFWebElement getNFKiossignuppageUomselectMgdlbutton() {
		return NFKsignuppageUomselectMgdlbutton;
	}

	public QAFWebElement getNFKiossignuppageUomselectMgdlbuttontext() {
		return NFKsignuppageUomselectMgdlbuttontext;
	}

	public QAFWebElement getNFKiossignuppageUomselecttext() {
		return NFKsignuppageUomselecttext;
	}

	public QAFWebElement getNFKiossignuppageUomselecttitle() {
		return NFKsignuppageUomselecttitle;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKiosSignuppageDependentGuardianFname() {
		return NFKiosSignuppageDependentGuardianFname;
	}

	public QAFWebElement getNFKiosSignuppageDependentGuardianLname() {
		return NFKiosSignuppageDependentGuardianLname;
	}

	public QAFWebElement getNFKiosSignuppageDependentEmail() {
		return NFKiosSignuppageDependentEmail;
	}

	public QAFWebElement getNFKiosSignuppageClinicinfoTxt() {
		return NFKiosSignuppageClinicinfoTxt;
	}

	public QAFWebElement getNFKiosSignuppageDependentPassword() {
		return NFKiosSignuppageDependentPassword;
	}

	public QAFWebElement getNFKiosSignuppageDependentConfirmPassword() {
		return NFKiosSignuppageDependentConfirmPassword;
	}

	public QAFWebElement getNFKiosSignuppageDependentConfirmEmail() {
		return NFKiosSignuppageDependentConfirmEmail;
	}

	public QAFWebElement getNFKiosSignuppageDependentContinue() {
		return NFKiosSignuppageDependentContinue;
	}

	public QAFWebElement getNFKiosSignuppageDependentTermsCheckbox() {
		return NFKiosSignuppageDependentTermsCheckbox;
	}

	public QAFWebElement getNFKiosSignuppageAddedclinicNoTxt() {
		return NFKiosSignuppageAddedclinicNoTxt;
	}

	public QAFWebElement getNFKiosSignuppageAddclinicSendBtn() {
		return NFKiosSignuppageAddclinicSendBtn;
	}

	public QAFWebElement getNFKiosSignuppageAddclinicCancelBtn() {
		return NFKiosSignuppageAddclinicCancelBtn;
	}

	public QAFWebElement getNFKiosSignuppageAddclinicTermchkBtn() {
		return NFKiosSignuppageAddclinicTermchkBtn;
	}

	public QAFWebElement getNFKiosSignuppageDependentMarketingCheckbox() {
		return NFKiosSignuppageDependentMarketingCheckbox;
	}

	public QAFWebElement getNFKiosSignuppageDependentFname() {
		return NFKiosSignuppageDependentFname;
	}

	public QAFWebElement getNFKiosSignuppageDependentLname() {
		return NFKiosSignuppageDependentLname;
	}

	public QAFWebElement getNFKiosSignuppageDependentClinic() {
		return NFKiosSignuppageDependentClinic;
	}

	public QAFWebElement getNFKiosSignuppageDependentRadioButtonMale() {
		return NFKiosSignuppageDependentRadioButtonMale;
	}

	public QAFWebElement getNFKiosSignuppageDependentRadioButtonFemale() {
		return NFKiosSignuppageDependentRadioButtonFemale;
	}

	public QAFWebElement getNFKiosSignuppageDependentRadioButtonTypeOne() {
		return NFKiosSignuppageDependentRadioButtonTypeOne;
	}

	public QAFWebElement getNFKiosSignuppageDependentRadioButtonTypeTwo() {
		return NFKiosSignuppageDependentRadioButtonTypeTwo;
	}

	public QAFWebElement getNFKiosSignuppageDependentSignUpButton() {
		return NFKiosSignuppageDependentSignUpButton;
	}

	public QAFWebElement getNFKiosSignuppageDependentGuardianaccountText() {
		return NFKiosSignuppageDependentGuardianaccountText;
	}

	public QAFWebElement getNFKiosSignupPageOptinCustomerServiceLink() {
		return NFKiosSignupPageOptinCustomerServiceLink;
	}

	// SG Elements for German Unit of Measure Page
	public QAFWebElement getNFKiosSignupPageBackButton() {
		return NFKiosSignupPageBackButton;
	}

	public QAFWebElement getNFKiosDecisionPageSignupMyselfBtn() {
		return NFKiosDecisionPageSignupMyselfBtn;
	}

	public QAFWebElement getNFKiosDecisionPageLoginOwnBtn() {
		return NFKiosDecisionPageLoginOwnBtn;
	}

	public QAFWebElement getNFKiosDecisionPageSignupDependentBtn() {
		return NFKiosDecisionPageSignupDependentBtn;
	}

	public QAFWebElement getNFKiosSignupPageInvalidClinicCodeClosebtn() {
		return NFKiosSignupPageInvalidClinicCodeClosebtn;
	}

	public QAFWebElement getNFKiosSignupPageUpdateNoticeContinueBtn() {
		return NFKiosSignupPageUpdateNoticeContinueBtn;
	}

	public QAFWebElement getNFKiosSignUppageBackBtn() {
		return NFKiosSignUpPageBackBtn;
	}

	public QAFWebElement getNFKiosSignupPageUpdateNoticeCheckBoxImg() {
		return NFKiosSignupPageUpdateNoticeCheckBoxImg;
	}

	public QAFWebElement getNFKiosSignupPageOptinPrivecylnk() {
		return NFKiosSignupPageOptinPrivecylnk;
	}

	public QAFWebElement getNFKiosSignuppageSkipBtn() {
		return NFKiosSignupPageMeterskipBtn;
	}

	public QAFWebElement getNFKiosDecisionPageLoginDependentBtn() {
		return NFKiosDecisionPageLoginDependentBtn;
	}

	public QAFWebElement getNFKiosSignupPagePrivecyLnk() {
		return NFKiosSignupPagePrivecyLnk;
	}

	public QAFWebElement getNFKiosSignupPageTermLnk() {
		return NFKiosSignupPageTermLnk;
	}

	public QAFWebElement getNFKiosSignuppageHcpEmailTxt() {
		return NFKiosSignuppageHcpEmailTxt;
	}

	public QAFWebElement getNFKiosSignuppageHcpPassTxt() {
		return NFKiosSignuppageHcpPassTxt;
	}

	public QAFWebElement getNFKiosSignuppageHcpConfirmpassTxt() {
		return NFKiosSignuppageHcpConfirmpassTxt;
	}

	public QAFWebElement getNFKiosSignuppageHcpDatofbirthTxt() {
		return NFKiosSignuppageHcpDatofbirthTxt;
	}

	public QAFWebElement getNFKiosSignuppageHcpTermChk() {
		return NFKiosSignuppageHcpTermChk;
	}

	public QAFWebElement getNFKiosSignuppagegreenCheckImg() {
		return NFKiosSignuppagegreenCheckImg;
	}

	public QAFWebElement getNFKiosSignuppageOptinTitleLbl() {
		return NFKiosSignuppageOptinTitleLbl;
	}

	public QAFWebElement getNFKiosSignupPageSafetyonboardingAlertokBtn() {
		return NFKiosSignupPageSafetyonboardingAlertokBtn;
	}

	public QAFWebElement getNFKiosSignuppageBirthdayMonthPkr() {
		return NFKiosSignuppageBirthdayMonthPkr;
	}

	public QAFWebElement getNFKiosSignuppageBirthdayDatePkr() {
		return NFKiosSignuppageBirthdayDatePkr;
	}

	public QAFWebElement getNFKiosSignuppageTimingpickerYearPkr() {
		return NFKiosSignuppageTimingpickerYearPkr;
	}

	public QAFWebElement getNFKiosSignuppageFirstNameTxt() {
		return NFKiosSignuppageFirstNameTxt;
	}

	public QAFWebElement getNFKiosSignuppageLastNameTxt() {
		return NFKiosSignuppageLastNameTxt;
	}

	public QAFWebElement getNFKiosSignuppageConfirmPasswordTxt() {
		return NFKiosSignuppageConfirmPasswordTxt;
	}

	public QAFWebElement getNFKiosSignuppageOfficeCodeTxt() {
		return NFKiosSignuppageOfficeCodeTxt;
	}

	public QAFWebElement getNFKiosSignuppageOnetouchIcon() {
		return NFKiosSignuppageOnetouchIcon;
	}

	public QAFWebElement getNFKiosSignuppageTermofserviceLbl() {
		return NFKiosSignuppageTermofserviceLbl;
	}

	public QAFWebElement getNFKiosSignuppageTermofserviceCbox() {
		return NFKiosSignuppageTermofserviceCbox;
	}

	public QAFWebElement getNFKiosSignuppageCountrytermsCbox() {
		return NFKiosSignuppageCountrytermsCbox;
	}

	public QAFWebElement getNFKiosSignuppageEmailadressTbox() {
		return NFKiosSignuppageEmailadressTbox;
	}

	public QAFWebElement getNFKiosSignuppageConfirmemailadressTbox() {
		return NFKiosSignuppageConfirmemailadressTbox;
	}

	public QAFWebElement getNFKiosSignuppagePasswordTbox() {
		return NFKiosSignuppagePasswordTbox;
	}

	public QAFWebElement getNFKiosSignuppageDateofbirthTbox() {
		return NFKiosSignuppageDateofbirthTbox;
	}

	public QAFWebElement getNFKiosSignuppageSignupBtn() {
		return NFKiosSignuppageSignupBtn;
	}

	public QAFWebElement getNFKiosSignuppageLoginLnk() {
		return NFKiosSignuppageLoginLnk;
	}

	public QAFWebElement getNFKiosSignuppageEnabletouchidBtn() {
		return NFKiosSignuppageEnabletouchidBtn;
	}

	public QAFWebElement getNFKiosSignuppageKeepmeloginBtn() {
		return NFKiosSignuppageKeepmeloginBtn;
	}

	public QAFWebElement getNFKiosSignuppageRequirloginBtn() {
		return NFKiosSignuppageRequirloginBtn;
	}

	public QAFWebElement getNFKiosSignuppageCheckebox() {
		return NFKiosSignuppageCheckebox;
	}

	public QAFWebElement getNFKiosSignuppageAgreeLbl() {
		return NFKiosSignuppageAgreeLbl;
	}

	public QAFWebElement getNFKiosDecisionPageSignupButton() {
		return NFKiosDecisionPageSignupButton;
	}

	public QAFWebElement getNFKiosDecisionPageYesLoginButton() {
		return NFKiosDecisionPageYesLoginButton;
	}

	public QAFWebElement getNFKiosSignuppageStaticlabel(String text) {
		return LFSUtilsIOS.getElement("NFKios.signupPage.static.lbl", text);
	}

	public QAFWebElement getNFKiosSignuppagesafetynextbtn() {
		return NFKiosSignUpPageSafetyNextBtn;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardTrustHowYouFeelCBox() {
		return NFKiosSignupPageSafetyboardTrustHowYouFeelCBox;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardNoMRCBox() {
		return NFKiosSignupPageSafetyboardNoMRCBox;
	}

	public QAFWebElement getNFKiosSignupPagePairSensorSkipBtn() {
		return NFKiosSignupPagePairSensorSkipBtn;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardTreatmentDecisionsCBox() {
		return NFKiosSignupPageSafetyboardTreatmentDecisionsCBox;
	}

	public QAFWebElement getNFKiosSignupPagePairSensorTitle() {
		return NFKiosSignupPagePairSensorTitle;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardAlertNotificationsCBox() {
		return NFKiosSignupPageSafetyboardAlertNotificationsCBox;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardNotificationsPopup() {
		return NFKiosSignupPageSafetyboardNotificationsPopup;
	}

	public QAFWebElement getNFKiosSignupPageSafetyboardNotificationsAllowPopup() {
		return NFKiosSignupPageSafetyboardNotificationsAllowPopup;
	}

//	public QAFWebElement getNFKiosSignupPageSafetyboardTrustHowYouFeelCBox() {
//		return NFKiosSignupPageSafetyboardTrustHowYouFeelCBox;
//	}

	public QAFWebElement getNFKiosSignuppagesafetydonebtn() {
		return NFKiosSignUpPageSafetyDoneBtn;
	}

//	public QAFWebElement getNFKiosGermansignuppageUomselectMgdlBtn() {
//		return NFKiosGermansignuppageUomselectMgdlBtn;
//	}
//
//	public QAFWebElement getNFKiosGermansignuppageUomselectMmolBtn() {
//		return NFKiosGermansignuppageUomselectMmolBtn;
//	}

	public QAFWebElement getNFKiosSignuppageOptinIagreeLbl() {
		return LFSUtilsIOS.getElement("NFKios.signupPage.static.lbl", LFSUtilsIOS.getPropString("termsAndCond.agree"));
	}

	public QAFWebElement getNFKiosSignupPageStartSensorTitle() {
		return NFKiosSignupPageStartSensorTitle;
	}

	public QAFWebElement getNFKiosSignuppageOptinCancelLbl() {
		return LFSUtilsIOS.getElement("NFKios.signupPage.static.lbl",
				LFSUtilsIOS.getPropString("common.actions.cancel"));
	}

	public QAFWebElement getNFKiosSignuppageSingupOkBtn() {
		return LFSUtilsIOS.getElement("NFKios.signupPage.static.lbl", LFSUtilsIOS.getPropString("appCommon.ok"));
	}

	public QAFWebElement getNFKiosSignuppageHcpDoneBtn() {
		return LFSUtilsIOS.getElement("NFKios.signupPage.static.lbl", LFSUtilsIOS.getPropString("appCommon.done"));
	}

	public QAFWebElement getNFKiosSignupPageNotificationAllowPopup() {
		return NFKiosSignupPageNotificationAllowPopup;
	}

	public QAFWebElement getNFKiosSignupPageNotificationDontallowPopup() {
		return NFKiosSignupPageNotificationDontallowPopup;
	}

	public QAFWebElement getNFKiosSignupPageErrorMessageTxt() {
		return NFKiosSignupPageErrorMessageTxt;
	}

	public QAFWebElement getNFKiosSignupPageErrorCancelImg() {
		return NFKiosSignupPageErrorCancelImg;
	}

	public QAFWebElement getNFKiosSignupGenderSelectionMaleBtn() {
		return NFKiosSignupGenderSelectionMaleBtn;
	}

	public QAFWebElement getNFKiosSignupGenderSelectionFemaleBtn() {
		return NFKiosSignupGenderSelectionFemaleBtn;
	}

	public QAFWebElement getNFKiosSignupDiabetesTypeType1btn() {
		return NFKiosSignupDiabetesTypeType1btn;
	}

	public QAFWebElement getNFKiosSignupDiabetesTypeType2btn() {
		return NFKiosSignupDiabetesTypeType2btn;
	}

	public QAFWebElement getNFKiosSignupDiabetesTypeGestationalbtn() {
		return NFKiosSignupDiabetesTypeGestationalbtn;
	}

	public QAFWebElement getNFKiosSignupPageSecondScreenContinueBtn() {
		return NFKiosSignupPageSecondScreenContinueBtn;
	}

	// @FindBy(locator = "NFKios.germansignuppage.uomselect.mgdl.btn")
	// private QAFWebElement NFKiosGermansignuppageUomselectMgdlBtn;
	// @FindBy(locator = "NFKios.germansignuppage.uomselect.mmol.btn")
	// private QAFWebElement NFKiosGermansignuppageUomselectMmolBtn;

	@FindBy(locator = "NFKios.signupPage.static.lbl")
	private QAFWebElement NFKiosSignuppageStaticLbl;

	private IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();

	public static String email;

	public void openNFKiosApp1() {
		launchPage(null);
		iosDriver.closeApp();
		iosDriver.launchApp();
		Reporter.logWithScreenShot("Application opened", MessageTypes.Pass);
	}

	// method to open NFKios app
	public void openNFKiosApp() {
		launchPage(null);
		try {
			if (getNFKiosSignupPageNotificationAllowPopup().isPresent()) {
				Reporter.logWithScreenShot("Notification pop up", MessageTypes.Pass);
				getNFKiosSignupPageNotificationAllowPopup().click();
				getNFKiosSignupPageNotificationAllowPopup().click();
			}

		} catch (Exception e) {
			Reporter.logWithScreenShot("Notification pop up was not displayed", MessageTypes.Pass);
		}
		try {
			iosDriver.closeApp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			iosDriver.launchApp();
			LFSUtilsIOS.pause(3000);
			if (getNFKiosSignupPageNotificationAllowPopup().isPresent()) {
				Reporter.logWithScreenShot("App is launched", MessageTypes.Pass);
				getNFKiosSignupPageNotificationAllowPopup().click();
				getNFKiosSignupPageNotificationAllowPopup().click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// method to open NFK app
	public void lunchApp() {
		try {
			iosDriver.launchApp();

			if (getNFKiosSignupPageNotificationAllowPopup().isPresent()) {
				Reporter.logWithScreenShot("Notification pop up", MessageTypes.Pass);
				driver.switchTo().alert().accept();
			}

			Reporter.logWithScreenShot("App is launched", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("NFKios app is launched");
	}

	public void openAppWithoutNotification() {
		launchPage(null);

		try {
			iosDriver.closeApp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			iosDriver.launchApp();

			getNFKiosSignupPageNotificationDontallowPopup().waitForPresent();
			getNFKiosSignupPageNotificationDontallowPopup().click();
			getNFKiosSignupPageNotificationAllowPopup().click();
			Reporter.logWithScreenShot("App is launched and Dont allow pop up selected", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("NFKios app is launched");
	}

	// method to verify sign up page elements
	// Milan
	public void veriySignUpPage() {
		getNFKiosSignuppageTermofserviceLbl().waitForPresent();
		getNFKiosSignuppageTermofserviceLbl().verifyPresent("Sign up page terms of service label");
		getNFKiosSignuppageEmailadressTbox().verifyPresent("Email text box");
		getNFKiosSignuppageConfirmemailadressTbox().verifyPresent("Confirm email text box");
		getNFKiosSignuppagePasswordTbox().verifyPresent("Password text box");
		getNFKiosSignupPageSecondScreenContinueBtn().verifyPresent("Continue button");
		getNFKiosSignuppageLoginLnk().verifyPresent("Login link on sign up page");
	}

	// method to verify sign up first page elements
	// Varsha
	public void veriySignUpFirstPage() {
		getNFKiosSignuppageOnetouchIcon().waitForPresent();
		getNFKiosSignuppageOnetouchIcon().verifyPresent("One Touch Logo");
		getNFKiosSignuppageDateofbirthTbox().verifyPresent("Date of Birth");
		getNFKiosSignupPageSecondScreenContinueBtn().verifyPresent("Create Account button");
		getNFKiosSignuppageCheckebox().verifyPresent("Terms of Service checkBox");

	}

	// Method to select diabetes check box
	// Milan
	public void selectionOfOptin(String option) {
//		Point p1 = getNFKiosSignuppageEmailadressTbox().getLocation();
//		LFSUtilsIOS.swipeWithCoordinates(p1.getX(), p1.getY(), p1.getX(), p1.getY() - 100,50);
		// getNFKiosSignuppageCountrytermsCbox().click();
		getNFKiosSignuppageOptinTitleLbl().waitForPresent();
		getNFKiosSignuppageOptinTitleLbl().click();

		if (option.equalsIgnoreCase("I Agree")) {
			getNFKiosSignuppageOptinIagreeLbl().click();
			Reporter.logWithScreenShot("The user selected I Agree", MessageTypes.Pass);
		} else if (option.equalsIgnoreCase("Cancel")) {
			getNFKiosSignuppageOptinCancelLbl().click();
			Reporter.logWithScreenShot("The user selected Cancel button", MessageTypes.Pass);
		}
	}

	// Method to fill sign up details
	public void fillRandomSignUpDetails(Object signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		email = "doshaheentt+" + RandomStringUtils.randomAlphabetic(5) + "@gmail.com";
		ConfigurationManager.getBundle().setProperty("register.email", email);
		getNFKiosSignuppageEmailadressTbox().click();
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().click();

		getNFKiosSignuppagePasswordTbox().sendKeys("test@1234");
		String pass = "test@1234";
		ConfigurationManager.getBundle().setProperty("register.password", pass);

		getNFKiosSignuppageConfirmPasswordTxt().verifyPresent("The confirm password field ");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("test@1234");
		getNFKiosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		// getNFKiosSignupPageBdPickerDoneBtn().click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		getNFKiosSignuppageCountrytermsCbox().click();
		Reporter.logWithScreenShot("The user filled sign up details", MessageTypes.Pass);
	}

	// Method to verify invalid email ids entered
	public void fillDetailsWithInvalidEmails(Object signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		getNFKiosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		String email = "@gmail.com";

		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("Prefix name is not entered", MessageTypes.Pass);
		getNFKiosSignuppageEmailadressTbox().clear();
		email = "abc.gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("@ is not entered", MessageTypes.Pass);
		getNFKiosSignuppageEmailadressTbox().clear();
		email = "abc@.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("Mail domain name is not entered", MessageTypes.Pass);
		getNFKiosSignuppageEmailadressTbox().clear();
		email = RandomStringUtils.randomAlphanumeric(70) + "@gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().click();
		// Added by Sangram NFKIOS-2603
		getNFKiosSignuppageEmailadressTbox().clear();
		email = RandomStringUtils.randomAlphanumeric(125) + "@gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("Large amount of text is entered", MessageTypes.Pass);

		if (getNFKiosSignuppageEmailadressTbox().getText().toString().length() > 75) {
			Reporter.logWithScreenShot("Email Length exceeds the limit", MessageTypes.Pass);
			getNFKiosSignuppageEmailadressTbox().clear();
			email = RandomStringUtils.randomAlphanumeric(65) + "@gmail.com";
			getNFKiosSignuppageEmailadressTbox().sendKeys(email);
			getNFKiosSignuppageConfirmemailadressTbox().click();
			Reporter.logWithScreenShot("Email Length is within given limit", MessageTypes.Pass);
		}
		email = "july2019+" + RandomStringUtils.randomAlphabetic(5) + "@gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		Reporter.logWithScreenShot("Valid Email is entered", MessageTypes.Pass);
	}

	// Method to fill details without email id
	public void fillRandomSignUpDetailsWithoutEmail(Object signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		getNFKiosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		String email = "july2019" + RandomStringUtils.randomNumeric(3) + "@mailinator.com";
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().sendKeys("test1234");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("test1234");
		getNFKiosSignuppageStaticlabel(
				ConfigurationManager.getBundle().getString(("auth.emailValidation.emailsMustMatch")))
						.verifyPresent("Both email address fields must match error message");
		LFSUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
		getNFKiosSignupPageSecondScreenContinueBtn().verifyDisabled("Sign up button");
	}

	// Method to click on sign up button when enabled
	public void clickOnSignUpBtn() {
		try {
			getNFKiosSignuppageSignupBtn().waitForEnabled();
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 10);
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 10);
			getNFKiosSignuppageSignupBtn().click();
			LFSUtilsIOS.waitforLoad();
//			getNFKiosSignuppageSingupOkBtn().waitForPresent();
//			getNFKiosSignuppageSingupOkBtn().click();
			Reporter.logWithScreenShot("The user cliked on signup button ", MessageTypes.Pass);

		} catch (Exception e) {
			Reporter.logWithScreenShot("Signup button not enabled", MessageTypes.Pass);
		}
		LFSUtilsIOS.waitforLoad();

	}

	public void RedirectToDecisionScreenFromSignUpScreen() {
		getNFKiosSignUppageBackBtn().click();
	}

//modify the code for decision screen
	public void redirectToPage(String pageName) {
		LoginPageIOS loginPage = new LoginPageIOS();
		pageName = pageName.toUpperCase();
		switch (pageName) {
		case "SIGN-UP MYSELF":
			try {

				if (getNFKiosDecisionPageSignupButton().isPresent()) {
					getNFKiosDecisionPageSignupButton().click();
					Reporter.logWithScreenShot("User cliked on Signup to create an Account ", MessageTypes.Pass);
					getNFKiosDecisionPageSignupMyselfBtn().verifyPresent("Sign up for myself");
					getNFKiosDecisionPageSignupMyselfBtn().click();
					LFSUtilsIOS.waitforLoad();
					Reporter.logWithScreenShot("User cliked on Signup for Myself button", MessageTypes.Pass);
				} else {
					Reporter.logWithScreenShot("Signup button not present on Decision screen", MessageTypes.Fail);
				}
				getNFKiosSignuppageCountrytermsCbox().waitForPresent();

			} catch (Exception e) {
				e.printStackTrace();
			}

			if (!getNFKiosSignuppageCountrytermsCbox().isPresent()) {
				loginPage.getNFKiosLoginpageSignupLnk().waitForPresent();
				loginPage.getNFKiosLoginpageSignupLnk().click();
				getNFKiosSignuppageCountrytermsCbox().waitForPresent();
			}
			Reporter.logWithScreenShot("The user is on Sign Up Page", MessageTypes.Pass);
			break;

		case "LOG-IN OWN":

			if (getNFKiosDecisionPageYesLoginButton().isPresent()) {
				getNFKiosDecisionPageYesLoginButton().waitForPresent();
				getNFKiosDecisionPageYesLoginButton().click();
				getNFKiosDecisionPageLoginOwnBtn().verifyPresent("My Own Data");
				getNFKiosDecisionPageLoginOwnBtn().waitForPresent();
				LFSUtilsIOS.waitforLoad();
				getNFKiosDecisionPageLoginOwnBtn().click();
				System.out.println("Checking for Login own button");
				Reporter.logWithScreenShot("The user is on Login Page for My Own data ", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("User was unable to find the My own data button", MessageTypes.Pass);
			}

			/*
			 * if (!loginPage.getNFKiosLoginpageForgotpasswordLbl().isPresent()) {
			 * LFSUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
			 * getNFKiosSignuppageLoginLnk().waitForPresent();
			 * getNFKiosSignuppageLoginLnk().click();
			 * loginPage.getNFKiosLoginpageForgotpasswordLbl().waitForPresent(); }
			 */

			break;

		case "SIGN-UP DEPENDENT":
			try {
				if (getNFKiosDecisionPageSignupButton().isPresent()) {
					getNFKiosDecisionPageSignupButton().click();
					getNFKiosDecisionPageSignupDependentBtn().waitForPresent();
					getNFKiosDecisionPageSignupDependentBtn().verifyPresent("Sign up for a dependent");
					getNFKiosDecisionPageSignupDependentBtn().click();
					LFSUtilsIOS.waitforLoad();
					Reporter.logWithScreenShot("User cliked on Signup for a dependent button", MessageTypes.Pass);

				} else {
					Reporter.logWithScreenShot("User was not able to click on signup dependent button",
							MessageTypes.Fail);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			if (getNFKiosSignuppageDependentGuardianaccountText().isPresent()) {
				getNFKiosSignuppageDependentGuardianaccountText().verifyPresent("Create your guardian account");
				getNFKiosSignuppageDependentMarketingCheckbox().assertPresent("Marketing check box is present");
				Reporter.logWithScreenShot("User is on Create account screen for guardian", MessageTypes.Pass);
			} else
				Reporter.logWithScreenShot("User is not on Signup page of Guardian ", MessageTypes.Fail);
			break;

		case "LOG-IN DEPENDENT":
			try {
				if (getNFKiosDecisionPageYesLoginButton().isPresent()) {
					getNFKiosDecisionPageYesLoginButton().waitForPresent();
					getNFKiosDecisionPageYesLoginButton().click();
					getNFKiosDecisionPageLoginDependentBtn().assertPresent("Login Dependent button");
					getNFKiosDecisionPageLoginDependentBtn().click();
					loginPage.verifyLoginDependentscreen();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

// Method to click on skip button
	// milan
	public void clickSkipBtn() {
		SignupPageIOS signup = new SignupPageIOS();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.actions.skip")).waitForPresent();
		Reporter.logWithScreenShot("Skip meter Page");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.actions.skip")).click();
//		if (signup.getNFKiosGermansignuppageUomselectMgdlBtn().isPresent()) {
//			signup.getNFKiosGermansignuppageUomselectMgdlBtn().click();
//		} else {
//			Reporter.logWithScreenShot("UOM is already selected for selected country",
//					MessageTypes.Pass);
//		}
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.actions.skip"))
				.verifyPresent("Welcome Page is displayed");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.actions.skip")).click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.yes"))
				.verifyPresent("Ready to See OneTouchReveal Page is displayed");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.yes")).click();
	}

	/*
	 * Method to select access type milan
	 */
	public void selectAccessType(String option) {
		option = option.toUpperCase();
		switch (option) {
		case "KEEP ME LOGIN":
			getNFKiosSignuppageKeepmeloginBtn().click();
			break;
		case "TOUCH ID":
			getNFKiosSignuppageEnabletouchidBtn().click();
			break;

		case "REQUIR LOGIN":
			getNFKiosSignuppageRequirloginBtn().click();
			break;
		}
	}

	/*
	 * Method fill sign up first screen details milan
	 */

	@FindBy(locator = "NFKios.signuppage.bdpicker.done.btn")
	private QAFWebElement NFKiosSignupPageBdPickerDoneBtn;

	public QAFWebElement getNFKiosSignupPageBdPickerDoneBtn() {
		return NFKiosSignupPageBdPickerDoneBtn;
	}

	public void enterSignupFirstScreenDetails(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageConfirmPasswordTxt().verifyPresent("confirm password is present");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		getNFKiosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		getNFKiosSignupPageBdPickerDoneBtn().click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		getNFKiosSignuppageCountrytermsCbox().click();
		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);
	}

	// gunther2
	// Method to fill data without firstname for registration
	public void enterSignupFirstScreenDetailsWithoutFirstName(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getNFKiosSignuppageLastNameTxt().waitForPresent();
		getNFKiosSignuppageLastNameTxt().clear();
		getNFKiosSignuppageLastNameTxt().sendKeys(userBean.getLastName());
		iosDriver.hideKeyboard();
		LFSUtilsIOS.pause(2000);
		getNFKiosSignupGenderSelectionMaleBtn().click();
		getNFKiosSignupDiabetesTypeType1btn().click();
		getNFKiosSignuppageSignupBtn().click();
		if (getNFKiosSignupGenderSelectionMaleBtn().verifyPresent()) {
			Reporter.logWithScreenShot("Account not created", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Account created", MessageTypes.Fail);
		}

	}

	// gunther3
	// Method to fill data without lastname for registration
	public void enterSignupFirstScreenDetailsWithoutLastName(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		getNFKiosSignuppageFirstNameTxt().waitForPresent();
		getNFKiosSignuppageFirstNameTxt().clear();
		getNFKiosSignuppageFirstNameTxt().sendKeys(userBean.getFirstName());
		iosDriver.hideKeyboard();
		iosDriver.hideKeyboard();
		LFSUtilsIOS.pause(2000);
		getNFKiosSignupGenderSelectionMaleBtn().click();
		getNFKiosSignupDiabetesTypeType1btn().click();
		getNFKiosSignuppageSignupBtn().click();
		if (getNFKiosSignupGenderSelectionMaleBtn().verifyPresent()) {
			Reporter.logWithScreenShot("Account not created", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Account created", MessageTypes.Fail);
		}
	}

	public void enterSignupDetailsWithoutBirthdate(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		LFSUtilsIOS lfs = new LFSUtilsIOS();

		getNFKiosSignupPageSecondScreenContinueBtn().verifyDisabled("Sign up button");

		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageCountrytermsCbox().click();

		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);
	}

	public void doSignUpWithoutCheckBox(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {
			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getNFKiosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		String email = "testNFK@gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignupPageSecondScreenContinueBtn().verifyDisabled("Sign up button");
	}

	public void enterSignupFirstScreenBelowAgeBirthdate(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}

		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		getNFKiosSignuppageEmailadressTbox().click();
		String ageRestrictionString = LFSUtilsIOS.getPropString("onboarding.ageRestriction.title");
		getNFKiosSignuppageStaticlabel(ageRestrictionString).waitForPresent();
		getNFKiosSignuppageStaticlabel(ageRestrictionString).verifyPresent("Age restriction pop up");
		ClickOKBtn();

	}

	// Method to set date of birth from picker
	// milan
	// removed commented code for Month selection > Sangram 3.1 Maintainance
	public void setDateOfBirth(UserDetailBeans userBean) {
		if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")) {
			try {
				getNFKiosSignuppageBirthdayMonthPkr().sendKeys(userBean.getBirthdayYear());
			} catch (Exception e) {
				LFSUtilsIOS.selectTimePicker(getNFKiosSignuppageBirthdayMonthPkr(),
						Integer.parseInt(userBean.getBirthdayYear()));
			}
		} else {
			getNFKiosSignuppageBirthdayMonthPkr().waitForPresent();

			try {
				getNFKiosSignuppageTimingpickerYearPkr().sendKeys(userBean.getBirthdayYear());
				getNFKiosSignupPageBdPickerDoneBtn().click();

			} catch (Exception e) {
				LFSUtilsIOS.selectTimePicker(getNFKiosSignuppageTimingpickerYearPkr(),
						Integer.parseInt(userBean.getBirthdayYear()));

			}
		}

	}

	public void emailValidations(String signupDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}

		getNFKiosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys("abc@gmail.com");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.accountInfoPage.haveAccountTitle")).click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailsMustMatch"))
				.verifyPresent("Both email address fields must match error message");
		getNFKiosSignuppageEmailadressTbox().clear();
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().clear();
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppagegreenCheckImg().verifyPresent("Green correct icon ,Email field matched");
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.accountInfoPage.haveAccountTitle")).click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		getNFKiosSignuppageCountrytermsCbox().click();
		getNFKiosSignupPageSecondScreenContinueBtn().waitForEnabled();
		getNFKiosSignupPageSecondScreenContinueBtn().click();

		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);

	}

	// Method to fill details without password field
	public void noPasswordToFill(String signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd@123");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.accountInfoPage.haveAccountTitle")).click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		getNFKiosSignuppageCountrytermsCbox().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.passwordValidation.passwordsMustMatch"))
				.verifyPresent("Passwords do not match error message");
	}

	// Method to enter invalid password and verify
	public void invalidPasswordEntry(String signupDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		getNFKiosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcdssas");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		WebDriverTestCase.verifyTrue(passworErrorMsg(),
				"expected " + LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar") + "  Actual "
						+ getNFKiosSignuppageStaticlabel(
								LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
										.getAttribute("label"),
				" Correct password error message for non numeric");

		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd1");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		WebDriverTestCase.verifyTrue(passworErrorMsg(),
				"expected " + LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar") + "  Actual "
						+ getNFKiosSignuppageStaticlabel(
								LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
										.getAttribute("label"),
				" Correct password error message for less length");
		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcdefg@123456789");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		Validator.verifyThat("Password field charcter length",
				getNFKiosSignuppagePasswordTbox().getAttribute("value").length(), Matchers.lessThanOrEqualTo(16));
		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd@1234");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		Reporter.logWithScreenShot("Valid password field is entered", MessageTypes.Pass);

	}

	// method to verify error message
	public boolean passworErrorMsg() {
		boolean flag = false;
		if (LFSUtilsIOS.getPropString("Country.name").equalsIgnoreCase("United States")) {
			flag = getNFKiosSignuppageStaticlabel(
					LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
							.getAttribute("label")
							.contains(LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar"));
		} else {
			flag = getNFKiosSignuppageStaticlabel(
					LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
							.getAttribute("label").contains(LFSUtilsIOS
									.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40));
		}
		return flag;
	}

	public void repeatedMailIdSignupFlow(String userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getNFKiosSignuppageEmailadressTbox().sendKeys("sagunther+neo1@gmail.com");
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys("sagunther+neo1@gmail.com");
		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageConfirmPasswordTxt().clear();
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		getNFKiosSignupPageBdPickerDoneBtn().click();
		getNFKiosSignuppageOnetouchIcon().click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		getNFKiosSignuppageCountrytermsCbox().click();
		getNFKiosSignupPageSecondScreenContinueBtn().waitForEnabled();
		getNFKiosSignupPageSecondScreenContinueBtn().click();
		Reporter.logWithScreenShot("Error Message for using already registered mail id", MessageTypes.Pass);

	}

	// method to uninstall app
	public void uninstallApp() {
		String a = ConfigurationManager.getBundle().getProperty("appium.additional.capabilities").toString();

		String filePath = splitCapabilityString(a, "app':'");

		Map<String, Object> params = new HashMap<>();

		params.put("file", filePath);
		/*
		 * params.put("instrument", "instrument"); params.put("sensorInstrument",
		 * "sensor");
		 */
		driver.executeScript("mobile:application:install", params);
		try {
			LFSUtilsIOS.waitforLoad();// sleep
			LFSUtilsIOS lfs = new LFSUtilsIOS();
			lfs.trustiOSAppCertificate("LifeScan, Inc.");// trust certificate from settings
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String splitCapabilityString(String value, String splitValue) {
		String str1[] = value.split(splitValue);
		String str2[] = str1[1].split("'");
		return str2[0];
	}

	// Method to verify clinic code
	// Milan
	public void verifyInvalidClinicCode(Object signupDetails) {
		fillRandomSignUpDetails(signupDetails);
		// entering invalid clinic code
		getNFKiosSignuppageOfficeCodeTxt().click();
		getNFKiosSignuppageOfficeCodeTxt().sendKeys("ttccxx");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("office.code.not.found"))
				.verifyPresent("Incorrect clinic code message");
		Reporter.logWithScreenShot("Incorrect Clinic Message");
		getNFKiosSignupPageInvalidClinicCodeClosebtn().waitForPresent();
		getNFKiosSignupPageInvalidClinicCodeClosebtn().click();
		if (getNFKiosSignuppageOfficeCodeTxt().getAttribute("value")
				.contains(LFSUtilsIOS.getPropString("office.code.hint")))
			Reporter.logWithScreenShot("Clinic code field is cleared", MessageTypes.Pass);
		String clinicCode = ConfigurationManager.getBundle().getProperty("clinic.clinicCode.cn.code1").toString();
		getNFKiosSignuppageOfficeCodeTxt().sendKeys(clinicCode);
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("office.code.not.found")).verifyPresent();
		Reporter.logWithScreenShot("Incorrect Clinic Message", MessageTypes.Pass);
	}

	// Method to take screen shot for negetive sceen
	// Milan
	public void signupsecondPageScreen(Object signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		getNFKiosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		getNFKiosSignuppageEmailadressTbox().sendKeys("tes1123@gmail");
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys("tes1223@gmail.com");
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd1234");

		getNFKiosSignuppageOnetouchIcon().click();
		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);

		String email1 = userBean.getEmailID();
		getNFKiosSignuppageEmailadressTbox().clear();
		getNFKiosSignuppageEmailadressTbox().sendKeys(email1);
		getNFKiosSignuppageConfirmemailadressTbox().clear();
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email1);
		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageConfirmPasswordTxt().clear();
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");

		getNFKiosSignuppageOnetouchIcon().click();

		getNFKiosSignupPageSecondScreenContinueBtn().waitForEnabled();
		LFSUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
		Reporter.logWithScreenShot("Signup button is present", MessageTypes.Pass);

		getNFKiosSignupPageSecondScreenContinueBtn().click();
		Reporter.logWithScreenShot("Exist user", MessageTypes.Pass);
		ClickOKBtn();

		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getNFKiosSignuppageEmailadressTbox().clear();
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().clear();
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(email);
		getNFKiosSignuppagePasswordTbox().clear();
		getNFKiosSignuppagePasswordTbox().sendKeys("abcd123#");
		getNFKiosSignuppageConfirmPasswordTxt().clear();
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");

		getNFKiosSignuppageOnetouchIcon().click();
		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);
	}

	// Method to clickOnOkButton
	// Milan
	public void ClickOKBtn() {
		String ok = LFSUtilsIOS.getPropString("appCommon.ok");
		try {
			getNFKiosSignuppageStaticlabel(ok).waitForPresent();
			getNFKiosSignuppageStaticlabel(ok).click();
		} catch (Exception e) {

		}
	}

	// Method to verify emailField for hcp user
	// milan
	public void verifyEmailHCPscreen(Object userDetails) {
		getNFKiosSignuppageHcpEmailTxt().clear();
		getNFKiosSignuppageHcpEmailTxt().sendKeys("123@eee");
		getNFKiosSignuppageHcpPassTxt().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.verifyVisible("Error popup for invalid email format");
		getNFKiosSignuppageHcpEmailTxt().clear();
		getNFKiosSignuppageHcpEmailTxt().sendKeys("123.com");
		getNFKiosSignuppageHcpPassTxt().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.verifyVisible("Error popup for invalid email format");
		verifyPasswordFieldHCPScreen();
		verifyLength();
		verifyHCPWithoutTermsChecked(userDetails);
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageHcpDatofbirthTxt().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.hcp.dob.information.message"))
				.verifyVisible("Message for update DOB");

	}

	// Method to verify password field for hcp
	// milan
	public void verifyPasswordFieldHCPScreen() {
		getNFKiosSignuppageHcpPassTxt().clear();
		getNFKiosSignuppageHcpPassTxt().sendKeys("abcdssas");
		getNFKiosSignuppageHcpConfirmpassTxt().click();
		WebDriverTestCase.verifyTrue(
				getNFKiosSignuppageStaticlabel(
						LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
								.getAttribute("label")
								.contains(LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar")
										.substring(0, 40)),
				"expected " + LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar") + "  Actual "
						+ getNFKiosSignuppageStaticlabel(
								LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
										.getAttribute("label"),
				" Correct password error message for non numeric");

		getNFKiosSignuppageHcpPassTxt().clear();
		getNFKiosSignuppageHcpPassTxt().sendKeys("abcd1");
		getNFKiosSignuppageHcpConfirmpassTxt().click();
		WebDriverTestCase.verifyTrue(
				getNFKiosSignuppageStaticlabel(
						LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
								.getAttribute("label")
								.contains(LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar")
										.substring(0, 40)),
				"expected " + LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar") + "  Actual "
						+ getNFKiosSignuppageStaticlabel(
								LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
										.getAttribute("label"),
				" Correct password error message for less length");
		getNFKiosSignuppageHcpPassTxt().clear();
		getNFKiosSignuppageHcpPassTxt().sendKeys("abcdefg@123456789");
		getNFKiosSignuppageHcpConfirmpassTxt().click();
		WebDriverTestCase.verifyTrue(
				getNFKiosSignuppageStaticlabel(
						LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
								.getAttribute("label")
								.contains(LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar")
										.substring(0, 40)),
				"expected " + LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar") + "  Actual "
						+ getNFKiosSignuppageStaticlabel(
								LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
										.getAttribute("label"),
				" Correct password error message more than length");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageHcpPassTxt().clear();
		getNFKiosSignuppageHcpPassTxt().sendKeys("abcd1234");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageHcpConfirmpassTxt().sendKeys("abcd1235");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.passwordValidation.passwordsMustMatch"))
				.verifyPresent("Passwords do not match error message");

	}

	// Method to verify terms privecy check box not selected flow
	// Milan
	public void verifyHCPWithoutTermsChecked(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();

		userBean.fillData(userDetails);

		getNFKiosSignuppageHcpEmailTxt().clear();
		getNFKiosSignuppageHcpEmailTxt().sendKeys(userBean.getEmailID());
		getNFKiosSignuppageHcpPassTxt().sendKeys("abcd1234");
		getNFKiosSignuppageHcpConfirmpassTxt().sendKeys("abcd1234");
		getNFKiosSignuppageHcpDoneBtn().verifyDisabled("Done button is disable when term check box not selected");

	}

	// Method to verify email field charcter length for hcp email on reset
	// password screen
	// Milan
	public void verifyLength() {
		getNFKiosSignuppageHcpEmailTxt().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "@gmail.com";

		getNFKiosSignuppageHcpEmailTxt().clear();
		getNFKiosSignuppageHcpEmailTxt().sendKeys(typeName);
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.verifyVisible("Error popup for invalid email format");
	}

	// Method to verify less then 18 hcp user
	public void verifyLessAgeHCPUser() {
		String msg = LFSUtilsIOS.getPropString("auth.ageValidation.ageRestriction").substring(0, 54);
		getNFKiosSignuppageStaticlabel(msg).verifyPresent("Age restriction pop up");
	}

	// Method to verify Hcp reset password screen when keeping email field blank
	// Milan
	public void noEmailResetPassword() {
		getNFKiosSignuppageHcpPassTxt().waitForPresent();
		getNFKiosSignuppageHcpPassTxt().sendKeys("abcd1234");
		getNFKiosSignuppageHcpConfirmpassTxt().sendKeys("abcd1234");
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageHcpTermChk().click();
		LFSUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
		getNFKiosSignuppageHcpDoneBtn().verifyDisabled("Done button is disable when term check box not selected");
	}

	// method to enter detail for reset password screen for login user
	// Milan
	public void addresetPasswordDetailHCP(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		userBean.fillData(userDetails);
		getNFKiosSignuppageHcpPassTxt().waitForPresent();
		getNFKiosSignuppageHcpEmailTxt().clear();
		getNFKiosSignuppageHcpEmailTxt().sendKeys(userBean.getEmailID());
		getNFKiosSignuppageHcpPassTxt().sendKeys("abcd1234");
		getNFKiosSignuppageHcpConfirmpassTxt().sendKeys("abcd1234");
		getNFKiosSignuppageOnetouchIcon().click();
		Reporter.logWithScreenShot("After entering reset password details", MessageTypes.Pass);
		getNFKiosSignuppageHcpTermChk().click();
		LFSUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
		getNFKiosSignuppageHcpDoneBtn().waitForEnabled();
		getNFKiosSignuppageHcpDoneBtn().click();
		// getNFKiosSignuppageSingupOkBtn().waitForPresent();

		Reporter.logWithScreenShot("Intended pop up", MessageTypes.Pass);
		// getNFKiosSignuppageSingupOkBtn().click();

		getNFKiosSignupPageUpdateNoticeCheckBoxImg().click();
		getNFKiosSignupPageUpdateNoticeContinueBtn().waitForEnabled();
		getNFKiosSignupPageUpdateNoticeContinueBtn().click();
		clickSkipBtn();
		HomePageIOS home = new HomePageIOS();
		home.getNFKiosHomepageMoreBtn().waitForPresent();
		Reporter.logWithScreenShot("Redirected to home page", MessageTypes.Pass);
	}

	// Method to click and verify terms and Privacy policy screen
	// milan
	public void clickAndVerifyTermAndPrivecy(String option) {
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		option = option.toLowerCase();
		switch (option) {
		case "terms of use":
			getNFKiosSignupPageTermLnk().waitForPresent();
			getNFKiosSignupPageTermLnk().click();
			try {
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.done")).waitForPresent(8000);
			} catch (Exception e) {

			}
			getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.createAccount.privacyPolicy.terms"))
					.verifyPresent("Term of use title");
			Reporter.logWithScreenShot("Terms of use Page 1 is Displayed", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Terms of use Page 2 is Displayed", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Terms of use Page 3 is Displayed", MessageTypes.Pass);
			break;
		case "privacy policy":

			getNFKiosSignupPagePrivecyLnk().waitForPresent();
			getNFKiosSignupPagePrivecyLnk().click();
			try {
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.done")).waitForPresent(8000);
			} catch (Exception e) {

			}
			getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.createAccount.privacyPolicy.privacy"))
					.verifyPresent("Privacy Policy title");
			Reporter.logWithScreenShot("Privacy Policy Page 1 is Displayed", MessageTypes.Pass);

			LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Privacy Policy Page 2 is Displayed", MessageTypes.Pass);
			LFSUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Privacy Policy Page 3 is Displayed", MessageTypes.Pass);
			break;
		}
	}

	// Method to select UOM for German/vietnam user

	public void selectUOM(String option) {

		if (getNFKiosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("alerts.uomDifference.title"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Unit of measurement selection page for German Users", MessageTypes.Pass);
			option = option.toLowerCase();
			switch (option) {
			case "mg/dl":
				getNFKiossignuppageUomselectMgdlbutton().waitForPresent();
				getNFKiossignuppageUomselectMgdlbutton().click();
				break;

			case "mmol/l":
				getNFKiossignuppageUomselectMmolbutton().waitForPresent();
				getNFKiossignuppageUomselectMmolbutton().click();
				break;
			}
		} else
			Reporter.logWithScreenShot("UOM is already selected", MessageTypes.Pass);
	}

	// gunther1
	public void verifyInvalidCharactersInFirstsNameandLastName() {
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "first Name";
		String typeName1 = RandomStringUtils.randomAlphanumeric(76) + "last Name";
		getNFKiosSignuppageFirstNameTxt().waitForPresent();
		getNFKiosSignuppageFirstNameTxt().sendKeys("=<");
		getNFKiosSignuppageLastNameTxt().click();
		getNFKiosSignupPageErrorMessageTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
		getNFKiosSignuppageFirstNameTxt().clear();
		getNFKiosSignuppageFirstNameTxt().sendKeys(typeName);
		getNFKiosSignuppageLastNameTxt().click();
		getNFKiosSignupPageErrorMessageTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for more than 75 characters present in First name field",
				MessageTypes.Pass);
		getNFKiosSignupPageErrorCancelImg().waitForPresent();
		getNFKiosSignupPageErrorCancelImg().click();
		getNFKiosSignuppageLastNameTxt().waitForPresent();
		getNFKiosSignuppageLastNameTxt().sendKeys("=<");
		getNFKiosSignuppageFirstNameTxt().click();
		getNFKiosSignupPageErrorMessageTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for invalid Last name is displayed", MessageTypes.Pass);
		getNFKiosSignuppageLastNameTxt().clear();
		getNFKiosSignuppageLastNameTxt().sendKeys(typeName1);
		getNFKiosSignuppageFirstNameTxt().click();
		getNFKiosSignupPageErrorMessageTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for more than 75 characters present in last name field",
				MessageTypes.Pass);
		getNFKiosSignupPageErrorCancelImg().waitForPresent();
		getNFKiosSignupPageErrorCancelImg().click();
	}

	// Method to set year
	public void setYear() {
		int currentYear = Integer.parseInt(ConstantUtils.CURRENT_YEAR);
		int requiredYear = currentYear - 18;
		getNFKiosSignuppageDateofbirthTbox().click();
		LFSUtilsIOS.selectTimePicker(getNFKiosSignuppageTimingpickerYearPkr(), requiredYear);
		getNFKiosSignuppageOnetouchIcon().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("onboarding.ageRestriction.title"))
				.verifyNotVisible("Age restriction pop up");
	}

	// Create account button on sign up first page
	public void clicksOnCreateAccountButton() {
		getNFKiosSignupPageSecondScreenContinueBtn().waitForEnabled();
		getNFKiosSignupPageSecondScreenContinueBtn().click();

	}

	// method to verify touch ID option is available on the screen
	public void verifiesTouchIDOption() {
		getNFKiosSignuppageEnabletouchidBtn().waitForPresent();
		getNFKiosSignuppageEnabletouchidBtn().verifyPresent("Enable touch ID");
	}

	// Method to clicking authentication type
	// Milan
	public void clickOnAuthenticationTypeSignup(String option) {

		option = option.toUpperCase();
		switch (option) {
		case "KEEP ME LOGIN":
			if (getNFKiosSignuppageKeepmeloginBtn().getAttribute("value").contains("0"))
				getNFKiosSignuppageKeepmeloginBtn().click();
			else {
				Reporter.logWithScreenShot("Keep me login switch is on", MessageTypes.Pass);
			}
			break;
		case "TOUCH ID":
			getNFKiosSignuppageEnabletouchidBtn().click();
			break;

		case "REQUIRE LOGIN":
			Reporter.logWithScreenShot("Keep me login and Touch ID both are off", MessageTypes.Pass);
			break;
		}
		Reporter.logWithScreenShot("After selecting Authentication Type", MessageTypes.Pass);
	}

	public QAFWebElement getNFKiosSignuppageStaticLbl() {
		return NFKiosSignuppageStaticLbl;
	}

	// Method to verify opt-in screen on create account second screen
	// Milan
	public void verificationOfOptin() {
//		Point p1 = getNFKiosSignuppageEmailadressTbox().getLocation();
//		LFSUtilsIOS.swipeWithCoordinates(p1.getX(), p1.getY(), p1.getX(), p1.getY() - 100,
//				50);
//		getNFKiosSignuppageCountrytermsCbox().click();

		getNFKiosSignuppageOptinTitleLbl().waitForPresent();

		// to click on Optin button
		getNFKiosSignuppageOptinTitleLbl().click();
		getNFKiosSignuppageOptinTitleLbl().verifyPresent("Opt-In Page Header Label Present");
		getNFKiosSignuppageOptinIagreeLbl().verifyPresent("I agree Label on Opt-In screen");
		getNFKiosSignuppageOptinCancelLbl().verifyPresent("Cancel button on Opt-In SCreen");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.createAccount.privacyPolicy.privacy"))
				.waitForPresent();
		if (getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.createAccount.privacyPolicy.privacy"))
				.isDisplayed() && getNFKiosSignupPageOptinPrivecylnk().isPresent()) {
			getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.createAccount.privacyPolicy.privacy"))
					.click();
			Reporter.logWithScreenShot("Clicked on Privacy Policy link From Opt-In screen", MessageTypes.Pass);
		}
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext"))
				.verifyPresent("privecy screen");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).click();
		if (getNFKiosSignuppageOptinTitleLbl().isDisplayed() && getNFKiosSignuppageOptinTitleLbl().isPresent()) {
			Reporter.logWithScreenShot("Clicked back button and user is on Opt-In SCreen", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Not Clicked back button and user is on Privacy Policy Screen",
					MessageTypes.Fail);
		}

	}

	// Installation of app without sensor instrumentation
	public void installWithoutSensor() {
		String a = ConfigurationManager.getBundle().getProperty("appium.additional.capabilities").toString();

		String filePath = splitCapabilityString(a, "app':'");
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		// lfs.getDriver().removeApp("com.lifescan.reveal.enterprise");
		Map<String, Object> params = new HashMap<>();

		params.put("file", filePath);
		params.put("instrument", "noinstrument");
		driver.executeScript("mobile:application:install", params);
	}

	// method to verify that Touch ID option is not present on sign up second
	// screen when keep me login is selected
	public void touchIDNotPresent() {
		getNFKiosSignuppageEnabletouchidBtn().verifyNotVisible("Touch ID is not present");
		Reporter.logWithScreenShot("Touch ID is not Present", MessageTypes.Pass);
	}

	// method to verify that Keep me login option is not present on sign up
	// second screen when touch id is selected
	public void keepMeLoginNotPresent() {
		getNFKiosSignuppageKeepmeloginBtn().verifyNotVisible("Keep me login is not present");
		Reporter.logWithScreenShot("Keep me Login is not Present", MessageTypes.Pass);
	}

	// method to verify customer service link on opt in screen redirects to new
	// mail dialouge
	public void verifyCustomerServiceLink() {
		Point p1 = getNFKiosSignuppageEmailadressTbox().getLocation();
		LFSUtilsIOS.swipeWithCoordinates(p1.getX(), p1.getY(), p1.getX(), p1.getY() - 100, 50);
		getNFKiosSignuppageOptinTitleLbl().click();
		if (getNFKiosSignuppageStaticlabel(ConstantUtils.SERVICE_LINK).isPresent()) {
			getNFKiosSignuppageStaticlabel(ConstantUtils.SERVICE_LINK).click();
			LFSUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot("Clicked on customer service link", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Cutomer service link is not present");
		}
	}

	// *[@label="Tell us about yourself"]
	@FindBy(locator = "NFKios.signuppage.tellUsAbout.txt")
	private QAFWebElement NFKiosSignuppageTellUsAboutTxt;

	public QAFWebElement getNFKiosSignuppageTellUsAboutTxt() {
		return NFKiosSignuppageTellUsAboutTxt;
	}

	public QAFWebElement getNFKiosSignuppageAboutmeTitleTxt(String string) {
		return LFSUtilsIOS.getElement("onboarding.aboutme.title", string);
	}

	// Add first and last name on tell us about yourself screen Neo update
	public void enterFirstAndLastName() {

		String fname = "jon" + RandomStringUtils.randomAlphabetic(3);
		String lname = "Snow" + RandomStringUtils.randomAlphabetic(3);
		getNFKiosSignuppageFirstNameTxt().click();
		getNFKiosSignuppageFirstNameTxt().waitForPresent();
		getNFKiosSignuppageFirstNameTxt().click();
		getNFKiosSignuppageFirstNameTxt().sendKeys(fname);
		getNFKiosSignuppageLastNameTxt().sendKeys(lname);
		LFSUtilsIOS.swipeWithScreenPercent(50, 60, 50, 20, 10);
		iosDriver.hideKeyboard();
		LFSUtilsIOS.clickWithText(LFSUtilsIOS.getPropString("more.aboutme.genderText"));
		
	}

	// Method to select gender and diabetes type
	public void selectGenderAndDiabetesType(String gender, String diabetesType) {
		MoremenuPageIOS morePageObj = new MoremenuPageIOS();
		switch (gender) {
		case "MALE":
			LFSUtilsIOS.pause(3000);
			/*
			 * morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString(
			 * "more.aboutme.gender.male")).waitForPresent();
			 * morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString(
			 * "more.aboutme.gender.male")).click();
			 */

			getNFKiosSignupGenderSelectionMaleBtn().waitForPresent();
			getNFKiosSignupGenderSelectionMaleBtn().click();
			break;
		case "FEMALE":
			/*
			 * morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString(
			 * "more.aboutme.gender.female")).waitForPresent();
			 * morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString(
			 * "more.aboutme.gender.female")).click();
			 */

			getNFKiosSignupGenderSelectionFemaleBtn().waitForPresent();
			getNFKiosSignupGenderSelectionFemaleBtn().click();
			break;

		}
		ConfigurationManager.getBundle().setProperty("singupScreen.selected.gender", gender);
		switch (diabetesType) {
		case "TYPE 1":
			/*
			 * morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString(
			 * "more.aboutme.diabetesType.type1")).waitForPresent();
			 * morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString(
			 * "more.aboutme.diabetesType.type1")).click();
			 */

			getNFKiosSignupDiabetesTypeType1btn().waitForPresent();
			getNFKiosSignupDiabetesTypeType1btn().click();
			break;
		case "TYPE 2":
			/*
			 * morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString(
			 * "more.aboutme.diabetesType.type2")).waitForPresent();
			 * morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString(
			 * "more.aboutme.diabetesType.type2")).click();
			 */
			getNFKiosSignupDiabetesTypeType2btn().waitForPresent();
			getNFKiosSignupDiabetesTypeType2btn().click();
			break;
		case "GESTATIONAL":
			morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("more.aboutme.diabetesType.gestational"))
					.waitForPresent();
			morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString("more.aboutme.diabetesType.gestational"))
					.click();
			break;
		}
		ConfigurationManager.getBundle().setProperty("singupScreen.selected.diabetes type", diabetesType);
		Reporter.logWithScreenShot("The user selected the Gender and Diabetes type", MessageTypes.Pass);
	}

	// Method to verify gender and diabetes selection page
	public void verifyGenderAndDiabetesSelectionPage() {
		String genderDiabetesTypePageTitle = LFSUtilsIOS.getPropString("onboarding.aboutme.title");
		getNFKiosSignuppageStaticlabel(genderDiabetesTypePageTitle).waitForPresent();
		getNFKiosSignuppageStaticlabel(genderDiabetesTypePageTitle).verifyPresent("Tell us about yourself");
		String genderDiabetesTypePageHeader = LFSUtilsIOS.getPropString("onboarding.aboutme.message");
		getNFKiosSignuppageStaticlabel(genderDiabetesTypePageHeader)
				.verifyPresent("To complete Sign Up, please tell us your gender and diabetes type.");
		String genderLabel = LFSUtilsIOS.getPropString("more.aboutme.genderText");
		getNFKiosSignuppageStaticlabel(genderLabel).verifyPresent("Gender");
		String MaleLabel = LFSUtilsIOS.getPropString("more.aboutme.gender.male");
		getNFKiosSignuppageStaticlabel(MaleLabel).verifyPresent("Male");
		String FemaleLabel = LFSUtilsIOS.getPropString("more.aboutme.gender.female");
		getNFKiosSignuppageStaticlabel(FemaleLabel).verifyPresent("Female");
		String diabetesTypeLabel = LFSUtilsIOS.getPropString("more.aboutme.diabetesTypeText");
		getNFKiosSignuppageStaticlabel(diabetesTypeLabel).verifyPresent("Diabetes Type");
		String Type1Label = LFSUtilsIOS.getPropString("more.aboutme.diabetesType.type1");
		getNFKiosSignuppageStaticlabel(Type1Label).verifyPresent("Type 1");
		String Type2Label = LFSUtilsIOS.getPropString("more.aboutme.diabetesType.type2");
		getNFKiosSignuppageStaticlabel(Type2Label).verifyPresent("Type 2");
		String gestationalLabel = LFSUtilsIOS.getPropString("more.aboutme.diabetesType.gestational");
		getNFKiosSignuppageStaticlabel(gestationalLabel).verifyPresent("Gestational");
		getNFKiosSignuppageSignupBtn().verifyPresent("Sign Up button");
	}

	// method to click on continue button on sign up second screen
	public void clickOnContinueBtn() {
		if (getNFKiosSignuppageDependentGuardianaccountText().isPresent()) {
			getNFKiosSignuppageDependentContinue().waitForPresent();
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 10);
			getNFKiosSignuppageDependentContinue().click();
			Reporter.logWithScreenShot("The user clicked on continue button of Dependent screen", MessageTypes.Pass);
		} else {
			getNFKiosSignupPageSecondScreenContinueBtn().waitForPresent();
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 10);
			getNFKiosSignupPageSecondScreenContinueBtn().click();
			Reporter.logWithScreenShot("The user clicked on continue button", MessageTypes.Pass);
		}
	}

	// method to verify gestational type when male gender is selected
	public void verifyGestationalTypeForMale() {
		getNFKiosSignupDiabetesTypeGestationalbtn().waitForPresent();
		getNFKiosSignupDiabetesTypeGestationalbtn().verifyDisabled("Gestational type is disabled for Male Gender");
		Reporter.logWithScreenShot("Gestational type is disabled for Male gender", MessageTypes.Pass);

	}

	public void clinicInfo() {
		HomePageIOS home = new HomePageIOS();
		SettingsPageIOS mysetting = new SettingsPageIOS();
		home.getNFKiosHomepageA1cInfoIconBtn().click();
		mysetting.getNFKiosSettingspageA1cArticleDeleteBtn().waitForPresent();
		Reporter.logWithScreenShot("Clinic info", MessageTypes.Pass);
		mysetting.getNFKiosSettingspageA1cArticleDeleteBtn().click();
		home.getNFKiosHomepageA1cInfoIconBtn().verifyPresent();

	}

	// Method to add office from home screen
	public void addOffice(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsIOS.hideKeyboard();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKiosSignuppageOfficeCodeTxt().sendKeys(userBean.getClinicCode());
		Reporter.logWithScreenShot("Clinic code added", MessageTypes.Pass);

		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("Clinic consent", MessageTypes.Pass);

	}

	public void verifyClinicTermsClinicInfo() {
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("office.name")).assertPresent("Clinic name");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("office.phone")).assertPresent("Clinic Phone No.");
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 1);
		if (!getNFKiosSignuppageLastNameTxt().isPresent()) {
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 1);
		}
		Reporter.logWithScreenShot("Clinic consent checkbox", MessageTypes.Pass);
		getNFKiosSignuppageAddclinicTermchkBtn().click();
		getNFKiosSignuppageAddclinicSendBtn().click();
		getNFKiosSignuppageOfficeCodeTxt().assertPresent("Clinic Info field");
		verifyClinicInfo();
	}

	public void verifyClinicInfo() {
		Assert.assertEquals(getNFKiosSignuppageClinicName().getText(), LFSUtilsIOS.getPropString("office.name"));
		Assert.assertEquals(getNFKiosSignuppageClinicPhone().getText(), LFSUtilsIOS.getPropString("office.phone"));
		Assert.assertEquals(getNFKiosSignuppageClinicMsgTxt().getText(),
				LFSUtilsIOS.getPropString("office.code.request.pending"));
		getNFKiosSignuppageClinicCancelBtn().assertPresent("Cancel button");

	}

	public void setMaxAgeForDOB() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 126;
		int actualYear = currentYear - 125;
		getNFKiosSignuppageDateofbirthTbox().click();
		try {
			getNFKiosSignuppageTimingpickerYearPkr().sendKeys(Integer.toString(requiredYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignuppageTimingpickerYearPkr(), requiredYear);
		}
		if (getNFKiosSignuppageTimingpickerYearPkr().getAttribute("value").toString()
				.equalsIgnoreCase(Integer.toString(actualYear))) {
			Reporter.logWithScreenShot("User is not able to enter year beyond" + actualYear, MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is able to enter year beyond " + actualYear, MessageTypes.Fail);
	}

	public void SafetyOnboardingScreen() {
		HomePageIOS home = new HomePageIOS();
		try {
			swipeToSafteyOnboardingsScreen();
			if (getNFKiosSignupPageSafetyboardNotificationsAllowPopup().isPresent()) {
				getNFKiosSignupPageSafetyboardNotificationsAllowPopup().click();
				Reporter.log("Critical Alert Pop-up");
			} else
				Reporter.log("Critical Alert pop-up not displayed");
		} catch (Exception e) {
			e.printStackTrace();
		}

		getNFKiosApplysensorTitle().waitForPresent();
		if (getNFKiosApplysensorTitle().isPresent()) {
			getNFKiosApplysensorSkipBtn().click();
			Reporter.logWithScreenShot("The user skips the Sensor Pair screen", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Sensor pair screen is not displayed", MessageTypes.Fail);

		try {
			if (home.getNFKiosHomepageTipContainer().isPresent()) {
				home.getNFKiosHomepageTipContainer().isPresent();
				LFSUtilsIOS.clickWithText(LFSUtilsIOS.getPropString("startsensor.title"));
				LFSUtilsIOS.pause(3000);
			} else {
				System.out.println("No tip is present");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// verify send button for unfilled first and last and term check box
	public void verifySendButtonEnable(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsIOS.hideKeyboard();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKiosSignuppageOfficeCodeTxt().sendKeys(userBean.getClinicCode());
		getNFKiosSignuppageAddclinicSendBtn().waitForPresent();
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 1);
		if (getNFKiosSignuppageAddclinicTermchkBtn().getAttribute("visible").equals("false")) {
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 1);
		}
		getNFKiosSignuppageFirstNameTxt().sendKeys("NFK");
		LFSUtilsIOS.hideKeyboard();
		getNFKiosSignuppageLastNameTxt().sendKeys("NFK");
		LFSUtilsIOS.hideKeyboard();
		getNFKiosSignuppageAddclinicSendBtn().verifyDisabled("term checkbox not selected, send btn");
		getNFKiosSignuppageFirstNameTxt().clear();
		LFSUtilsIOS.hideKeyboard();
		getNFKiosSignuppageAddclinicTermchkBtn().click();
		getNFKiosSignuppageAddclinicSendBtn().verifyDisabled("For emptry first name, send btn");
		getNFKiosSignuppageFirstNameTxt().sendKeys("NFK");
		LFSUtilsIOS.hideKeyboard();
		getNFKiosSignuppageLastNameTxt().clear();
		LFSUtilsIOS.hideKeyboard();
		getNFKiosSignuppageAddclinicSendBtn().verifyDisabled("For empty Last name, send button");

	}

	public void swipeToSafteyOnboardingsScreen() {
		if (getNFKiosSignuppageStaticlabel(
				ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.first")).isDisplayed()) {
			Reporter.logWithScreenShot("Safety Onboarding screen 1", MessageTypes.Pass);
			for (int i = 1; i < 11; i++) {
				if (getNFKiosSignupPageSafetyboardTrustHowYouFeelCBox().isPresent()) {
					getNFKiosSignupPageSafetyboardTrustHowYouFeelCBox().click();
				} else if (getNFKiosSignupPageSafetyboardNoMRCBox().isPresent()) {
					getNFKiosSignupPageSafetyboardNoMRCBox().click();
				} else if (getNFKiosSignupPageSafetyboardTreatmentDecisionsCBox().isPresent()) {
					getNFKiosSignupPageSafetyboardTreatmentDecisionsCBox().click();
				} else if (getNFKiosSignupPageSafetyboardAlertNotificationsCBox().isPresent()) {
					getNFKiosSignupPageSafetyboardAlertNotificationsCBox().click();
				} else if (getNFKiosSignupPageSafetyboardNotificationsAllowPopup().isPresent()) {
					getNFKiosSignupPageSafetyboardNotificationsAllowPopup().click();
				} else {
					LFSUtilsIOS.swipeWithScreenPercent(95, 80, 5, 80, 7);
				}
				Reporter.logWithScreenShot("Safety Onboarding screen " + (i + 1), MessageTypes.Pass);
			}
			getNFKiosSignuppagesafetydonebtn().waitForPresent();
			getNFKiosSignuppagesafetydonebtn().click();
			LFSUtilsIOS.waitforLoad();

		}
	}

	public void verifyAppOverviewWelcome() {
		if (getNFKiosSignuppageSkipBtn().isPresent())
			Reporter.logWithScreenShot("Skip button is present", MessageTypes.Pass);
		getNFKiosSignuppageSkipBtn().click();

		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("Welcome page is displayed with forward navigation", MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);

		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.navigation.title"))
				.waitForPresent();

	}

	public void verifyAppOverviewOverlayAllInfo() {
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.navigation.title"))
				.isPresent()) {
			Reporter.logWithScreenShot("Navigate your app page is displayed with forward navigation",
					MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.timeline.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.timeline.title")).isPresent()) {
			Reporter.logWithScreenShot("Review your Timeline page is displayed with forward navigation",
					MessageTypes.Pass);
		}

		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.logbook.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.logbook.title")).isPresent()) {
			Reporter.logWithScreenShot("Review your Logbook page is displayed with forward navigation",
					MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.sharing.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.sharing.title")).isPresent()) {
			Reporter.logWithScreenShot("Share your Data page is displayed with forward navigation", MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.settings.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.settings.title")).isPresent()) {
			Reporter.logWithScreenShot("Adjust your settings page is displayed with forward navigation",
					MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.addEvent.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.addEvent.title")).isPresent()) {
			Reporter.logWithScreenShot("Add event page is displayed with forward navigation", MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(90, 50, 10, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.done.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.done.title")).isPresent()) {
			Reporter.logWithScreenShot(
					"Ready to See OneTouch Reveal in Action page is displayed with forward navigation",
					MessageTypes.Pass);
		}
	}

	EventLogPageIOS logbook = new EventLogPageIOS();

	public void userVerifyToAndFroNavigation() {
		if (getNFKiosSignuppageSkipBtn().isPresent())
			Reporter.logWithScreenShot("Skip button is present", MessageTypes.Pass);
		getNFKiosSignuppageSkipBtn().click();

		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("Welcome Title", MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(80, 50, 30, 50, 2);
		LFSUtilsIOS.swipeWithScreenPercent(80, 50, 30, 50, 2);
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.navigation.title"))
				.isPresent()) {
			Reporter.logWithScreenShot("Navigate your app", MessageTypes.Pass);
		}

		LFSUtilsIOS.swipeWithScreenPercent(20, 50, 70, 50, 2);
		LFSUtilsIOS.swipeWithScreenPercent(20, 50, 70, 50, 2);
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("Welcome Title", MessageTypes.Pass);
		}

		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("common.actions.skip")).isPresent()) {
			logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("common.actions.skip")).click();
		}

		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.done.title")).isPresent()) {
			Reporter.logWithScreenShot("Ready to See OneTouch Reveal in Action page is present", MessageTypes.Pass);
		}

		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.done.description"))
				.isPresent()) {
			Reporter.logWithScreenShot("Access this App Overview at any time in More > Help text is present",
					MessageTypes.Pass);
		}
	}

	public void verifyForwardNavigation() {
		verifyAppOverviewWelcome();
		verifyAppOverviewOverlayAllInfo();
	}

	public void verifyBackwardNavigation() {

		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.addEvent.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.addEvent.title")).isPresent()) {
			Reporter.logWithScreenShot("Add event page is displayed with backward navigation", MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.settings.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.settings.title")).isPresent()) {
			Reporter.logWithScreenShot("Adjust your settings page is displayed with backward navigation",
					MessageTypes.Pass);
		}

		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.sharing.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.sharing.title")).isPresent()) {
			Reporter.logWithScreenShot("Share your Data page is displayed with backward navigation", MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.logbook.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.logbook.title")).isPresent()) {
			Reporter.logWithScreenShot("Review your Logbook page is displayed with backward navigation",
					MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.timeline.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.timeline.title")).isPresent()) {
			Reporter.logWithScreenShot("Review your Timeline page is displayed with backward navigation",
					MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);
		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.navigation.title"))
				.waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.navigation.title"))
				.isPresent()) {
			Reporter.logWithScreenShot("Navigate your app page is displayed with backward navigation",
					MessageTypes.Pass);
		}
		LFSUtilsIOS.swipeWithScreenPercent(10, 50, 90, 50, 7);

		logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.welcome.title")).waitForPresent();
		if (logbook.getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("Welcome Title is displayed with backward navigation", MessageTypes.Pass);
		}
	}

	public void sensoronboardpages() {
		try {

			if (getNFKiosSignuppageStaticlabel(
					ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.first")).isDisplayed()) {
				for (int i = 1; i <= 11; i++) {
					if (getNFKiosSignupPageSafetyboardTrustHowYouFeelCBox().isPresent()) {
						getNFKiosSignupPageSafetyboardTrustHowYouFeelCBox().click();
					} else if (getNFKiosSignupPageSafetyboardNoMRCBox().isPresent()) {
						getNFKiosSignupPageSafetyboardNoMRCBox().click();
					} else if (getNFKiosSignupPageSafetyboardTreatmentDecisionsCBox().isPresent()) {
						getNFKiosSignupPageSafetyboardTreatmentDecisionsCBox().click();
					} else if (getNFKiosSignupPageSafetyboardAlertNotificationsCBox().isPresent()) {
						getNFKiosSignupPageSafetyboardAlertNotificationsCBox().click();
					} else if (getNFKiosSignupPageSafetyboardNotificationsAllowPopup().isPresent()) {
						getNFKiosSignupPageSafetyboardNotificationsAllowPopup().click();
					} else {
						LFSUtilsIOS.swipeWithScreenPercent(95, 80, 5, 80, 7);
					}
					Reporter.logWithScreenShot("Safety Onboarding screen " + i, MessageTypes.Pass);
				}

				getNFKiosSignuppagesafetydonebtn().waitForPresent();
				getNFKiosSignuppagesafetydonebtn().click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fillDependentDetails(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}

		// getNFKiosSignuppageDependentGuardianFname().assertPresent("Guardian First
		// name field");
		System.out.println("Checking the lement is enabled " + getNFKiosSignuppageDependentGuardianFname());
		getNFKiosSignuppageDependentGuardianFname().click();
		getNFKiosSignuppageDependentGuardianFname()
				.sendKeys(userBean.getGuardianfname() + RandomStringUtils.randomAlphabetic(4));
		LFSUtilsIOS.waitforLoad();
		getNFKiosSignuppageDependentGuardianLname().assertPresent("Guardian Last name field");
		getNFKiosSignuppageDependentGuardianLname()
				.sendKeys(userBean.getGuardianlname() + RandomStringUtils.randomAlphabetic(4));
		String email1 = "doshaheentt+" + RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		iosDriver.hideKeyboard();
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		System.out.println("Scrolled..........");
		getNFKiosSignuppageDependentEmail().assertPresent("Email field of Dependent");
		getNFKiosSignuppageDependentEmail().click();
		getNFKiosSignuppageDependentEmail().sendKeys(email1);
		Reporter.logWithScreenShot("Entered the email", MessageTypes.Pass);

		iosDriver.hideKeyboard();
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		LFSUtilsIOS.waitforLoad();
		getNFKiosSignuppageDependentConfirmEmail().click();
		// LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
		getNFKiosSignuppageDependentConfirmEmail().assertPresent("Confirm Email field of Dependent");
		getNFKiosSignuppageDependentConfirmEmail().click();
		getNFKiosSignuppageDependentConfirmEmail().sendKeys(email1);

		getNFKiosSignuppageDependentGuardianaccountText().click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 10, 10);
		getNFKiosSignuppageDependentPassword().click();
		getNFKiosSignuppageDependentPassword().assertPresent("Password field on Guardian screen");
		LFSUtilsIOS.waitforLoad();
		getNFKiosSignuppageDependentPassword().sendKeys(userBean.getGuardianpassword());
		ConfigurationManager.getBundle().setProperty("dependent.password", userBean.getGuardianconfirmpassword());
		getNFKiosSignuppageDependentConfirmPassword().assertPresent("Confirm password field");
		getNFKiosSignuppageDependentConfirmPassword().sendKeys(userBean.getGuardianconfirmpassword());
		iosDriver.hideKeyboard();
		getNFKiosSignuppageDependentTermsCheckbox().assertPresent("Terms and condition check box");
		getNFKiosSignuppageDependentTermsCheckbox().click();
		getNFKiosSignuppageDependentMarketingCheckbox().assertPresent("Marketing check box");
		Reporter.logWithScreenShot("User has entered the Guardian details", MessageTypes.Pass);

	}

	public void enterDobFirstAndLastName(Object signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		getNFKiosSignuppageDateofbirthTbox().click();
		getNFKiosSignuppageTimingpickerYearPkr().sendKeys(userBean.getDependentDOByear());
		getNFKiosSignupPageBdPickerDoneBtn().click();
		enterFirstAndLastName();
		iosDriver.hideKeyboard();
		Reporter.logWithScreenShot("Guardian has enetered depedent's details", MessageTypes.Pass);
	}

	public void setDependentDateOfBirth(UserDetailBeans userBean) {
		try {
			getNFKiosSignuppageTimingpickerYearPkr().sendKeys(userBean.getBirthdayYear());
			getNFKiosSignupPageBdPickerDoneBtn().click();

		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignuppageTimingpickerYearPkr(),
					Integer.parseInt(userBean.getBirthdayYear()));

		}

	}

	// Verify UOM screen
	public void verifyUOMscreen() {

		getNFKiossignuppageUomselecttitle().isPresent();
		LFSUtilsIOS.pause(2000);
		getNFKiossignuppageUomselecttext().isPresent();
		LFSUtilsIOS.pause(2000);
		getNFKiossignuppageUomselecttext1().isPresent();
		LFSUtilsIOS.pause(2000);
		getNFKiossignuppageUomselectMgdlbuttontext().isPresent();
		getNFKiossignuppageUomselectMgdlbutton().isPresent();
		getNFKiossignuppageUomselectMmolbuttontext().isPresent();
		getNFKiossignuppageUomselectMmolbutton().isPresent();
	}

	// data set to check the Avergae of 90 days and compare
	public void fillCGMReadings() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.password");
		ApiMethods apiObj = new ApiMethods();

		int noOfData = 10;
		int noofdays = 90;
		int[] cgmval = new int[] { 66, 68, 100, 102, 108, 202, 204, 206, 208, 210 };
		apiObj.addLoginDetails(email, password, noOfData, noofdays, cgmval);
	}

	public void fillLowCGMReadings() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.password");
		ApiMethods apiObj = new ApiMethods();

		int noOfLowData = 31;
		int noofLowdays = 7;
		Reporter.logWithScreenShot("No. of data in signup pagee----" + (noOfLowData * noofLowdays), MessageTypes.Pass);
		int[] cgmlowval = new int[] { 75, 76, 79, 80, 82, 83, 85, 88, 89, 105, 110, 111, 125, 126, 128, 64, 63, 62, 61,
				60, 63, 62, 61, 56, 58, 59, 60, 65, 57, 65, 63 };
		apiObj.addLoginDetailsLow(email, password, noOfLowData, noofLowdays, cgmlowval);
	}

	// enter name and select DOB for 2-5 yr old child
	public void setchilddob() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 4;
		int actualYear = currentYear - 125;
		getNFKiosSignuppageDateofbirthTbox().click();
		try {
			getNFKiosSignuppageTimingpickerYearPkr().sendKeys(Integer.toString(requiredYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignuppageTimingpickerYearPkr(), requiredYear);
		}
		if (getNFKiosSignuppageTimingpickerYearPkr().getAttribute("value").toString()
				.equalsIgnoreCase(Integer.toString(actualYear))) {
			Reporter.logWithScreenShot("User is not able to enter year beyond", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is able to enter age between 2-5 year", MessageTypes.Pass);
		getNFKiosSignupPageBdPickerDoneBtn().click();
		enterFirstAndLastName();
	}

	// enter name and select DOB for 7-18 yr old kid
	public void setteenagedob() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 8;
		int actualYear = currentYear - 125;
		getNFKiosSignuppageDateofbirthTbox().click();
		try {
			getNFKiosSignuppageTimingpickerYearPkr().sendKeys(Integer.toString(requiredYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignuppageTimingpickerYearPkr(), requiredYear);
		}
		if (getNFKiosSignuppageTimingpickerYearPkr().getAttribute("value").toString()
				.equalsIgnoreCase(Integer.toString(actualYear))) {
			Reporter.logWithScreenShot("User is not able to enter year beyond", MessageTypes.Fail);
		} else
			Reporter.logWithScreenShot("User is able to enter age between 6-17 year", MessageTypes.Pass);
		getNFKiosSignupPageBdPickerDoneBtn().click();
		enterFirstAndLastName();
	}

	public void enterLowDataAPI() {
		ApiMethods apiObj = new ApiMethods();

		int noOfLowData = 30;
		int noofLowdays = 90;
		// 9 days 16 days
		Reporter.logWithScreenShot("No. of data in signup pagee----" + (noOfLowData * noofLowdays), MessageTypes.Pass);
		/*
		 * int[] cgmlowval=new int[]{ 70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,
		 * 69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69};
		 */
		int[] cgmlowval = new int[] { 85, 95, 102, 110, 115, 117, 120, 120, 121, 152, 144, 125, 132, 128, 145, 134, 95,
				83, 111, 157, 138, 122, 119, 135, 140, 121, 111, 56, 78, 155 };
		apiObj.addLoginDetailsLow("augex25@mailinator.com", "test1234", noOfLowData, noofLowdays, cgmlowval);

	}

	public void completeSafetyOnboardingScreen() {
		HomePageIOS home = new HomePageIOS();
		try {
			swipeToSafteyOnboardingsScreen();
			LFSUtilsIOS.clickWithText("Skip");

			LFSUtilsIOS.waitforLoad();
		} catch (Exception e) {
			e.printStackTrace();
		}

		getNFKiosSignupPagePairSensorSkipBtn().click();
		Reporter.logWithScreenShot("The user skips the Sensor Pair screen", MessageTypes.Pass);

		try {
			if (home.getNFKiosHomepageTipContainer().isPresent()) {
				home.getNFKiosHomepageTipContainer().isPresent();
				LFSUtilsIOS.clickWithText(LFSUtilsIOS.getPropString("startsensor.title"));
				LFSUtilsIOS.pause(3000);
			} else {
				System.out.println("No tip is present");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickDontAllowpopupbutton() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		LFSUtilsIOS.clickWithText("Don�t Allow");
	}

	public void clickonBackbutton() {
		if (getNFKiosSafteyboardingBackBtn().isPresent()) {
			getNFKiosSafteyboardingBackBtn().click();
			Reporter.logWithScreenShot("Navigated Back ", MessageTypes.Pass);
		}
	}

	public void ClickNotificationSettingButton() {
		if (getNFKiosSettingsNotificationBtn().isPresent()) {
			getNFKiosSettingsNotificationBtn().click();
			Reporter.logWithScreenShot("Notification Setting Button is present", MessageTypes.Pass);
		}
	}

	public void clickonDoneButton() {
		if (getNFKiosSignuppagesafetydonebtn().isPresent()) {
			getNFKiosSignuppagesafetydonebtn().click();
			LFSUtilsIOS.waitforLoad();
		}
	}

	public void VerifyCriticalAlertScreen() {
		if (getNFKiosSafteyonboardingSettingsBtn().isPresent()) {
			Reporter.logWithScreenShot("Setting Button is present", MessageTypes.Pass);
		}

	}

	public void verifyUrgentLowNotificationScreen() {
		getNFKiosSignupPageSafetyboardUrgentLowNotificationtxt().waitForPresent(10);
		getNFKiosSignupPageSafetyboardUrgentLowNotificationtxt().verifyPresent("Urgent Low Notifications");

	}

	public void ClickSettingButton() {
		if (getNFKiosSafteyonboardingSettingsBtn().isPresent()) {
			getNFKiosSafteyonboardingSettingsBtn().click();
			Reporter.logWithScreenShot("Clicked on Setting Button", MessageTypes.Pass);
		}

	}

	public void ClickBackBtn() {
		if (getNFKiosSettingsBackToAppBtn().isPresent()) {
			getNFKiosSettingsBackToAppBtn().click();
			Reporter.logWithScreenShot("Redirected Back to app", MessageTypes.Pass);
		}
	}

	public void verifyPairSensorScreen() {
		getNFKiosSignupPageSafetyboardPairSensorScreentxt().verifyPresent("Start Sensor Session");
	}

	public void verifyGuardianSignupPage() {
		getNFKiosSignuppageDependentGuardianFname().assertPresent("Guardian First Name Field");
		getNFKiosSignuppageDependentGuardianLname().assertPresent("Guardian Last Name Field");
		getNFKiosSignuppageDependentEmail().assertPresent("Email field ");
		getNFKiosSignuppageDependentConfirmPassword().assertPresent("Confirm Email Field");
		getNFKiosSignuppageDependentPassword().assertPresent("Password Field");
		getNFKiosSignuppageDependentConfirmPassword().assertPresent("Confirm Password Field");
		getNFKiosSignuppageDependentTermsCheckbox().assertPresent("Term and agreement checkbox");
		getNFKiosSignuppageDependentMarketingCheckbox().assertPresent("Marketing CheckBox");
		LFSUtilsIOS.scrollDown();
		;
		getNFKiosSignuppageDependentContinue().assertPresent("Continue button");
		Reporter.logWithScreenShot(" Verified Guardian Signup page ", MessageTypes.Pass);
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).click();
	}

	public void clickOnLoginLink() {
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).click();

		if (getNFKiosDecisionPageLoginDependentBtn().isPresent()) {
			Reporter.logWithScreenShot("Select Login Dependent", MessageTypes.Pass);
			getNFKiosDecisionPageLoginDependentBtn().assertPresent("Login Dependent button");
			getNFKiosDecisionPageLoginDependentBtn().click();
		} else
			Reporter.logWithScreenShot("User has not navigated to Login to see page", MessageTypes.Fail);

	}

	public void ValidatesSignupMyselfPage() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 8;
		int actualYear = currentYear - 2;

		getNFKiosSignuppageEmailadressTbox().sendKeys(".<+");
		getNFKiosSignuppageConfirmemailadressTbox().click();
		if (getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Invalid Email Error Message id displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(".<+");
		getNFKiosSignuppagePasswordTbox().click();
		if (getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Invalid Email Error Message id displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageEmailadressTbox().clear();
		email = RandomStringUtils.randomAlphanumeric(125) + "@gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("Large amount of text is entered", MessageTypes.Pass);

		if (getNFKiosSignuppageEmailadressTbox().getText().toString().length() > 75) {
			Reporter.logWithScreenShot("Email Length exceeds the limit", MessageTypes.Pass);
			getNFKiosSignuppageEmailadressTbox().clear();
			email = RandomStringUtils.randomAlphanumeric(65) + "@gmail.com";
			getNFKiosSignuppageEmailadressTbox().sendKeys(email);
			getNFKiosSignuppageConfirmemailadressTbox().click();
			Reporter.logWithScreenShot("Email Length is within given limit", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		}
		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getNFKiosSignuppageEmailadressTbox().sendKeys(email);
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys("abc@gmail.com");
		getNFKiosSignuppagePasswordTbox().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailsMustMatch"))
				.verifyPresent("Both email address fields must match error message");
		getNFKiosSignupPageErrorIcon().click();
		getNFKiosSignupPageErrorIcon().click();
		getNFKiosSignuppagePasswordTbox().sendKeys(".<+");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		// if
		// (getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar")).isDisplayed()){
		// Reporter.logWithScreenShot("Invalid Email Error Message id displayed",
		// MessageTypes.Pass);
		// getNFKiosSignupPageErrorIcon().click();
		// }
		// else {
		// Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		// }
		getNFKiosSignupPageErrorIcon().click();
		LFSUtilsIOS.scrollDown();
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys(".<+");
		getNFKiosSignuppageDependentClinic().click();
		if (getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.passwordValidation.passwordsMustMatch"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Invalid Confrim Password Error Message id displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageOfficeCodeTxt().click();
		getNFKiosSignuppageOfficeCodeTxt().sendKeys("ttccxx");
		getNFKiosSignuppageConfirmPasswordTxt().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("office.code.not.found"))
				.verifyPresent("Incorrect clinic code message");
		Reporter.logWithScreenShot("Incorrect Clinic Message");
		getNFKiosSignuppageDateofbirthTbox().click();
		try {
			getNFKiosSignuppageTimingpickerYearPkr().sendKeys(Integer.toString(requiredYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignuppageTimingpickerYearPkr(), requiredYear);
		}
		getNFKiosSignupPageBdPickerDoneBtn().click();
		if (getNFKiosSignupPageAgeRestrictionPopupTitle().isDisplayed()
				&& getNFKiosSignupPageAgeRestrictionPopupClose().isDisplayed()) {
			Reporter.logWithScreenShot("Age restriction popup displayed", MessageTypes.Pass);
			getNFKiosSignupPageAgeRestrictionPopupClose().click();
		}
		getNFKiosSignuppageDateofbirthTbox().click();
		try {
			getNFKiosSignuppageTimingpickerYearPkr().sendKeys(Integer.toString(actualYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignuppageTimingpickerYearPkr(), requiredYear);
		}
		getNFKiosSignupPageBdPickerDoneBtn().click();
		if (getNFKiosSignupPageAgeRestrictionPopupTitle().isDisplayed()
				&& getNFKiosSignupPageAgeRestrictionPopupClose().isDisplayed()) {
			Reporter.logWithScreenShot("Age restriction popup displayed", MessageTypes.Pass);
			getNFKiosSignupPageAgeRestrictionPopupClose().click();
		}
	}

	public void validatesignupDepedentPage() {
		
		getNFKiosSignuppageDependentGuardianFname().waitForPresent();
		getNFKiosSignuppageDependentGuardianFname().sendKeys("=<");
		getNFKiosSignuppageDependentGuardianLname().click();
		System.out.println(getNFKiosSignupPageErrorLabel().getText());
		if (getNFKiosSignupPageErrorLabel().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageDependentGuardianLname().sendKeys("=<");
		getNFKiosSignuppageDependentEmail().click();
		System.out.println(getNFKiosSignupPageErrorLabel().getText());
		if (getNFKiosSignupPageErrorLabel().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageDependentEmailLabel().click();
		LFSUtilsIOS.scrollDown();
		System.out.println("Scrolled..........");
		getNFKiosSignuppageDependentEmail().sendKeys("<>+.com");
		getNFKiosSignuppageDependentConfirmEmail().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Invalid email address format")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageDependentConfirmEmail().sendKeys("<>+.com");
		getNFKiosSignuppageDependentPassword().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Invalid email address format")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageDependentPassword().sendKeys("<>+:");
		getNFKiosSignuppageDependentConfirmPassword().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Passwords must be between")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageDependentConfirmPassword().waitForPresent();
		getNFKiosSignuppageDependentConfirmPassword().sendKeys(".<+=");
		getNFKiosSignuppageDependentPassword().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Passwords do not match")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}

	}

	public void validatessignupmyselfsecondpage() {
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "first Name";
		String typeName1 = RandomStringUtils.randomAlphanumeric(76) + "last Name";
		getNFKiosSignuppageFirstNameTxt().waitForPresent();
		getNFKiosSignuppageFirstNameTxt().sendKeys("=<");
		getNFKiosSignuppageLastNameTxt().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Invalid Confrim Password Error Message id displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageLastNameTxt().sendKeys("=<");
		getNFKiosSignuppageFirstNameTxt().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Invalid Confrim Password Error Message id displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		}
		clickonBackbutton();
		clickonBackbutton();
		// getNFKiosSignuppageFirstNameTxt().sendKeys(typeName);
		// getNFKiosSignuppageLastNameTxt().click();
		// if (getNFKiosSignupPageErrorLabel().getText().contains("First name must be
		// between")) {
		// Reporter.logWithScreenShot("Invalid Confrim Password Error Message id
		// displayed", MessageTypes.Pass);
		// getNFKiosSignupPageErrorIcon().click();
		// } else {
		// Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		// }
		// getNFKiosSignuppageLastNameTxt().sendKeys("=<");
		// getNFKiosSignuppageFirstNameTxt().click();
		// if (getNFKiosSignupPageErrorLabel().getText().contains("Last name must be
		// between")) {
		// Reporter.logWithScreenShot("Invalid Confrim Password Error Message id
		// displayed", MessageTypes.Pass);
		// getNFKiosSignupPageErrorIcon().click();
		// } else {
		// Reporter.logWithScreenShot("Not displayed displayed", MessageTypes.Fail);
		// }
	}

	public void validatesSignupDepedentSecondPage() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 18;
		int actualYear = currentYear - 1;
		getNFKiosSignuppageFirstNameTxt().waitForPresent();
		getNFKiosSignuppageFirstNameTxt().sendKeys("<+=.");
		getNFKiosSignuppageLastNameTxt().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
			// System.out.println("Pass fname");
		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageLastNameTxt().sendKeys("<+=.");
		getNFKiosSignuppageFirstNameTxt().click();
		if (getNFKiosSignupPageErrorLabel().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
			getNFKiosSignupPageErrorIcon().click();
			System.out.println("Pass Lname");
		} else {
			Reporter.logWithScreenShot("Error message not displayed", MessageTypes.Fail);
		}
		getNFKiosSignuppageDependentClinic().click();
		getNFKiosSignuppageDependentClinic().sendKeys("ttccxx");
		getNFKiosSignuppageLastNameTxt().click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("office.code.not.found"))
				.verifyPresent("Incorrect clinic code message");
		// System.out.println("Pass Clinic");
		Reporter.logWithScreenShot("Incorrect Clinic Message");
		getNFKiosSignuppageDateofbirthTbox().click();
		try {
			getNFKiosSignuppageTimingpickerYearPkr().sendKeys(Integer.toString(requiredYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignuppageTimingpickerYearPkr(), requiredYear);
		}
		getNFKiosSignupPageBdPickerDoneBtn().click();
		getNFKiosSignupPageAgeRestrictionPopupTitle().isDisplayed();
		getNFKiosSignupPageAgeRestrictionPopupOK().isDisplayed();
		Reporter.logWithScreenShot("Age restriction popup displayed", MessageTypes.Pass);
		getNFKiosSignupPageAgeRestrictionPopupOK().click();
		// System.out.println("Pass DOB");
		getNFKiosSignuppageDateofbirthTbox().click();
		try {
			getNFKiosSignuppageTimingpickerYearPkr().sendKeys(Integer.toString(actualYear));
		} catch (Exception e) {
			LFSUtilsIOS.selectTimePicker(getNFKiosSignuppageTimingpickerYearPkr(), actualYear);
		}
		getNFKiosSignupPageBdPickerDoneBtn().click();
		getNFKiosSignupPageAgeRestrictionPopupTitle().isDisplayed();
		getNFKiosSignupPageAgeRestrictionPopupOK().isDisplayed();
		Reporter.logWithScreenShot("Age restriction popup displayed", MessageTypes.Pass);
		getNFKiosSignupPageAgeRestrictionPopupOK().click();
		// System.out.println("Pass DOB");

	}

	public void clickonSignupDepedent(String page) {
		switch (page) {
		case "SIGN-UP MYSELF":
			try {
				if (getNFKiosDecisionPageSignupMyselfBtn().isPresent()) {
					getNFKiosDecisionPageSignupMyselfBtn().click();
					LFSUtilsIOS.waitforLoad();
					Reporter.logWithScreenShot("User cliked on Signup for Myself button", MessageTypes.Pass);
				} else {
					Reporter.logWithScreenShot("Signup button not present on Decision screen", MessageTypes.Fail);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case "SIGN-UP DEPENDENT":
			try {
				if (getNFKiosDecisionPageSignupDependentBtn().isPresent()) {
					getNFKiosDecisionPageSignupDependentBtn().waitForPresent();
					getNFKiosDecisionPageSignupDependentBtn().click();
					LFSUtilsIOS.waitforLoad();
					Reporter.logWithScreenShot("User cliked on Signup for a dependent button", MessageTypes.Pass);

				} else {
					Reporter.logWithScreenShot("User was not able to click on signup dependent button",
							MessageTypes.Fail);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void selectDiabetesType(String diabetesType) {
		LoginPageIOS login = new LoginPageIOS();
		switch (diabetesType) {
		case "TYPE 1":
			/*
			 * morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString(
			 * "more.aboutme.diabetesType.type1")).waitForPresent();
			 * morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString(
			 * "more.aboutme.diabetesType.type1")).click();
			 */
			System.out.println("In type 1");
			login.getNFKiosGestationalTypeOneRadioBtn().waitForPresent();
			login.getNFKiosGestationalTypeOneRadioBtn().click();
			break;
		case "TYPE 2":
			/*
			 * morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString(
			 * "more.aboutme.diabetesType.type2")).waitForPresent();
			 * morePageObj.getNFKiosMorepageStaticText(LFSUtilsIOS.getPropString(
			 * "more.aboutme.diabetesType.type2")).click();
			 */
			System.out.println("In type 2");
			login.getNFKiosGestationalTypeTwoRadioBtn().waitForPresent();
			login.getNFKiosGestationalTypeTwoRadioBtn().click();
			break;
		}
		continueEnabled();
	}

	private void continueEnabled() {
		LoginPageIOS login = new LoginPageIOS();
		login.getNFKiosGestationalContinueBtn().isPresent();
		login.getNFKiosGestationalContinueBtn().isEnabled();
	}

	public void fillexisitingUser(Object signupDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		getNFKiosSignuppageEmailadressTbox().click();
		getNFKiosSignuppageEmailadressTbox().sendKeys(userBean.getEmailID());
		getNFKiosSignuppageConfirmemailadressTbox().sendKeys(userBean.getEmailID());
		getNFKiosSignuppagePasswordTbox().click();

		getNFKiosSignuppagePasswordTbox().sendKeys("test@1234");
		getNFKiosSignuppageConfirmPasswordTxt().verifyPresent("The confirm password field ");
		getNFKiosSignuppageConfirmPasswordTxt().sendKeys("test@1234");
		getNFKiosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		// getNFKiosSignupPageBdPickerDoneBtn().click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
		getNFKiosSignuppageCountrytermsCbox().waitForPresent();
		getNFKiosSignuppageCountrytermsCbox().click();
		Reporter.logWithScreenShot("The user filled sign up details", MessageTypes.Pass);
	}

	public void verifyEmailExitPopup() {
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok"))
				.assertPresent("Ok button on error popup");
		Reporter.logWithScreenShot("User is not a registered user", MessageTypes.Pass);
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).isDisplayed();
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext")).click();
	}

	public void fillexisitingGuardianUser(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKiosSignuppageDependentGuardianFname().sendKeys(userBean.getGuardianfname());
		getNFKiosSignuppageDependentGuardianLname().sendKeys(userBean.getGuardianlname());
		getNFKiosSignuppageDependentEmail().sendKeys(userBean.getEmailID());
		getNFKiosSignuppageDependentConfirmEmail().sendKeys(userBean.getEmailID());
		getNFKiosSignuppageDependentPassword().sendKeys(userBean.getGuardianpassword());
		getNFKiosSignuppageDependentConfirmPassword().sendKeys(userBean.getGuardianconfirmpassword());
		getNFKiosSignuppageDependentTermsCheckbox().click();
		// getNFKiosSignuppageDependentMarketingCheckbox().click();
	}

	public void SafetyOnboardingScreenSkipEmancipation() {
		swipeToSafteyOnboardingsScreen();
		if (getNFKiosSignupPageSafetyboardNotificationsAllowPopup().isPresent()) {
			getNFKiosSignupPageSafetyboardNotificationsAllowPopup().click();
			Reporter.log("Critical Alert Pop-up");
		} else {
			Reporter.log("Critical Alert pop-up not displayed");
		}
		LFSUtilsIOS.clickWithText("Skip");
	}

	public void verifyEmancipationscreen() {
		getNFKiosSignuppageStaticlabel("Happy 18th birthday!").isPresent();
		getNFKiosSignupPageEmancipationEmail().verifyPresent("Email id is present");
		getNFKiosSignupPageEmancipationConfirmEmail().verifyPresent("Confirm Email id is present");
		getNFKiosSignupPageEmancipationPassword().verifyPresent("Password is present");
		getNFKiosSignupPageEmancipationConfirmPassword().verifyPresent("Confirm Password is present");
		getNFKiosSignupPageEmancipationTermsAndPrivacy().verifyPresent("Terms and Privacy is present");
		getNFKiosSignupPageEmancipationMarketingAgreement().verifyPresent("Marketing Agreementis present");
		Reporter.logWithScreenShot("Emancipation screen is Verified");
	}

	public void verifyInvalidPasswordError() {
		try {
			if (getNFKiosSignupPageErrorLabel().getText()
					.contains(LFSUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar"))) {
				Reporter.logWithScreenShot("Sucessfully verified password field error message. ", MessageTypes.Pass);
				getNFKiosSignupPageErrorIcon().click();
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify invalid password error message " + MessageTypes.Fail);
		}
	}

	public void validateEmancipationfield(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		String userData = userDetails.toString();
		switch (userData) {
		case "fieldValidations.emancipationEmail":
			try {
				String charArray[] = userBean.getInvalidFormat().split(",");
				for (int i = 0; i < charArray.length; i++) {
					getNFKiosSignupPageEmancipationEmail().sendKeys(charArray[i]);
					Reporter.logWithScreenShot("Successfully entered the invalid email format", MessageTypes.Pass);
					getNFKiosSignupPageEmancipationConfirmEmail().click();
					getNFKiosSignuppageStaticlabel(
							LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
									.verifyPresent("Invalid Email Error displayed");
					getNFKiosSignupPageErrorIcon().click();
					getNFKiosSignupPageEmancipationEmail().click();
					getNFKiosSignupPageEmancipationConfirmEmail().clear();
					getNFKiosSignupPageEmancipationEmail().clear();
				}
				Reporter.logWithScreenShot("Successfully verified email field with inavlid email format",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify email field", MessageTypes.Fail);
			}
			try {
				getNFKiosSignupPageEmancipationEmail().sendKeys(userBean.getMinLengthValidation());
				Reporter.logWithScreenShot(
						"Successfully entered email with minimum characters " + userBean.getMinCharacters(),
						MessageTypes.Pass);
				getNFKiosSignupPageEmancipationConfirmEmail().click();
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
						.verifyPresent("Invalid Email Error displayed");
				getNFKiosSignupPageErrorIcon().click();
				getNFKiosSignupPageEmancipationEmail()
						.sendKeys(RandomStringUtils.randomAlphanumeric(125) + "@gmail.com");
				getNFKiosSignupPageEmancipationConfirmEmail().click();
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
						.verifyPresent("Invalid Email Error displayed");
				Reporter.logWithScreenShot("Successfully entered email with maximum characters "
						+ RandomStringUtils.randomAlphanumeric(125) + "@gmail.com", MessageTypes.Pass);
				getNFKiosSignupPageEmancipationConfirmEmail().click();
				getNFKiosSignupPageErrorIcon().click();
				getNFKiosSignupPageEmancipationEmail().clear();
				Reporter.logWithScreenShot("Successfully verified email field with minimum and maximum characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify email field", MessageTypes.Fail);
			}
			try {
				getNFKiosSignupPageEmancipationEmail().sendKeys(userBean.getEmailID());
				getNFKiosSignupPageEmancipationConfirmEmail().sendKeys(userBean.getConfirmEmail());
				getNFKiosSignupPageEmancipationPassword().click();
				getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("auth.emailValidation.emailsMustMatch"))
						.verifyPresent("Email NOt Match Error displayed");

			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify email field", MessageTypes.Fail);
			}
			getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.cancel")).click();
			break;
		case "fieldValidations.emancipationPWD":
			try {
				String charArray[] = userBean.getNotAllowedCharacters().split(",");
				for (int i = 0; i < charArray.length; i++) {
					getNFKiosSignupPageEmancipationPassword().sendKeys(charArray[i]);
					Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
					getNFKiosSignupPageEmancipationConfirmPassword().click();
					verifyInvalidPasswordError();
					getNFKiosSignupPageEmancipationPassword().clear();
				}
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			try {
				String charArray[] = userBean.getInvalidFormat().split(",");
				for (int i = 0; i < charArray.length; i++) {
					getNFKiosSignupPageEmancipationPassword().sendKeys(charArray[i]);
					Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
					getNFKiosSignupPageEmancipationConfirmPassword().click();
					verifyInvalidPasswordError();
					getNFKiosSignupPageEmancipationPassword().clear();
				}
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			try {
				getNFKiosSignupPageEmancipationPassword().sendKeys(userBean.getMinLengthValidation());
				Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
				getNFKiosSignupPageEmancipationConfirmPassword().click();
				verifyInvalidPasswordError();
				getNFKiosSignupPageEmancipationPassword().clear();
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			try {
				getNFKiosSignupPageEmancipationPassword().sendKeys(userBean.getPassword());
				getNFKiosSignupPageEmancipationConfirmPassword().sendKeys(userBean.getConfirmPassword());
				Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
				getNFKiosSignupPageEmancipationEmail().click();
				verifyInvalidPasswordError();
				getNFKiosSignupPageEmancipationPassword().clear();
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			break;
		}
	}

	public void VerifyExistEmacipationEmail(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKiosSignupPageEmancipationEmail().verifyPresent("Email id is present");
		getNFKiosSignupPageEmancipationEmail().sendKeys(userBean.getExistingEmail());
		getNFKiosSignupPageEmancipationConfirmEmail().sendKeys(userBean.getExistingEmail());
		getNFKiosSignupPageEmancipationPassword().sendKeys(userBean.getPassword());
		getNFKiosSignupPageEmancipationConfirmPassword().sendKeys(userBean.getPassword());
		getNFKiosSignupPageEmancipationTermsAndPrivacy().click();
		// getNFKiosSignupPageEmancipationMarketingAgreement().click();
		getNFKiosSignupPageEmancipationContinueBtn().verifyEnabled();
		getNFKiosSignupPageEmancipationContinueBtn().click();
		Reporter.logWithScreenShot("Emancipation screen is Verified");
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok"))
				.assertPresent("Ok button on error popup");
		Reporter.logWithScreenShot("User is not a registered user", MessageTypes.Pass);
		getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
		getNFKiosSignuppageStaticlabel("Happy 18th birthday!").isPresent();
	}
}
