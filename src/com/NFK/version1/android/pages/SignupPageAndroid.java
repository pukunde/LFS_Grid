package com.NFK.version1.android.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import com.NFK.support.ApiMethods;
import com.NFK.support.ConstantUtils;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.testng.report.Report;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;
import com.thoughtworks.selenium.webdriven.commands.Click;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class SignupPageAndroid<UserDetailsBean> extends WebDriverBaseTestPage<WebDriverTestPage> {
	// LFSUtilsAndroid a = new LFSUtilsAndroid();
	CountrySelectionPageAndroid country = new CountrySelectionPageAndroid();

	LFSUtilsAndroid baseReference = new LFSUtilsAndroid();
	@FindBy(locator = "NFK.signuppage.email.txt")
	private QAFWebElement NFKSignuppageEmailTxt;
	@FindBy(locator = "NFK.signuppage.confirmemail.txt")
	private QAFWebElement NFKSignuppageConfirmemailTxt;
	@FindBy(locator = "NFK.signuppage.password.txt")
	private QAFWebElement NFKSignuppagePasswordTxt;
	@FindBy(locator = "NFK.signuppage.signup.btn")
	private QAFWebElement NFKSignuppageSignupBtn;
	@FindBy(locator = "NFK.signuppage.termofservice.check.box")
	private QAFWebElement NFKSignuppageTermofserviceCheckBox;
	@FindBy(locator = "NFK.signuppage.onetouch.logo")
	private QAFWebElement NFKSignuppageOnetouchLogo;
	@FindBy(locator = "NFK.signuppage.back.btn")
	private QAFWebElement NFKSignuppageBackBtn;
	@FindBy(locator = "NFK.signuppage.login.lnk")
	private QAFWebElement NFKSignuppageLoginLnk;
	@FindBy(locator = "NFK.signuppage.termofservice.lnk")
	private QAFWebElement NFKSignuppageTermofserviceLnk;
	@FindBy(locator = "NFK.signuppage.skip.btn")
	private QAFWebElement NFKSignuppageSkipBtn;
	// NextBtn on safety onboarding screen
	@FindBy(locator = "NFK.signuppage.safety.next.btn")
	private QAFWebElement NFKSignuppageSafetyNextBtn;
	@FindBy(locator = "NFK.signuppage.safety.iunstd.check.box")
	private QAFWebElement NFKSignuppageSafetyIunstdCheckBox;
	@FindBy(locator = "NFK.signuppage.safety.done.btn")
	private QAFWebElement NFKSignuppageSafetyDoneBtn;
	@FindBy(locator = "NFK.signuppage.safety.allow.btn")
	private QAFWebElement NFKSignuppageSafetyAllowBtn;
	@FindBy(locator = "NFK.signuppage.importantMessage.txt")
	private QAFWebElement NFKSignuppageImportantmessageTxt;
	@FindBy(locator = "NFK.signuppage.safety.skip.btn")
	private QAFWebElement NFKSignuppageSensorSkipBtn;
	@FindBy(locator = "NFK.signuppage.importantMessageOk.btn")
	private QAFWebElement NFKSignuppageImportantmessageokBtn;
	@FindBy(locator = "NFK.signuppage.continueButton.btn")
	private QAFWebElement NFKSignuppageContinuebuttonBtn;
	@FindBy(locator = "NFK.signuppage.termsOfUse.txt")
	private QAFWebElement NFKSignuppageTermsofuseTxt;
	@FindBy(locator = "NFK.signuppage.termsAndPrivecy.txt")
	private QAFWebElement NFKSignuppageTermsandprivecyTxt;
	@FindBy(locator = "NFK.signuppage.firstname.txt")
	private QAFWebElement NFKSignuppageFirstnameTxt;
	@FindBy(locator = "NFK.signuppage.lastname.txt")
	private QAFWebElement NFKSignuppageLastnameTxt;
	@FindBy(locator = "NFK.signuppage.dob.txt")
	private QAFWebElement NFKSignuppageDobTxt;
	@FindBy(locator = "NFK.signuppage.confirmpassword.txt")
	private QAFWebElement NFKSignuppageConfirmpasswordTxt;
	@FindBy(locator = "NFK.signuppage.cliniccode.txt")
	private QAFWebElement NFKSignuppageCliniccodeTxt;
	@FindBy(locator = "NFK.signuppage.promotionalcode.chkbox")
	private QAFWebElement NFKSignuppagePromotionalcodeChkbox;
	@FindBy(locator = "NFK.signuppage.keepmeloggedin.chkbox")
	private QAFWebElement NFKSignuppageKeepmeloggedinChkbox;
	@FindBy(locator = "NFK.signuppage.calendar.year.btn")
	private QAFWebElement NFKSignupPageCalendarYearBtn;
	@FindBy(locator = "NFK.signuppage.calendar.next.btn")
	private QAFWebElement NFKSignupPageCalendarNextBtn;
	@FindBy(locator = "NFK.signuppage.calendar.previous.btn")
	private QAFWebElement NFKSignupPageCalendarPreviousBtn;
	@FindBy(locator = "NFK.email.validation.error.msg")
	private QAFWebElement NFKEmailValidationErrorMsg;
	@FindBy(locator = "NFK.confirm.email.validation.error.msg")
	private QAFWebElement NFKConfirmEmailValidationErrorMsg;
	@FindBy(locator = "NFK.password.validation.error.msg")
	private QAFWebElement NFKPasswordValidationErrorMsg;
	@FindBy(locator = "NFK.signuppage.clinic.code.txt")
	private QAFWebElement NFKSignuppageClinicCodeTxt;
	@FindBy(locator = "NFK.signuppage.firstNameError.txt")
	private QAFWebElement NFKSignuppageFirstNameErrorTxt;
	@FindBy(locator = "NFK.signuppage.lastNameError.txt")
	private QAFWebElement NFKSignuppageLastNameErrorTxt;

	@FindBy(locator = "NFK.signuppage.touchID.btn")
	private QAFWebElement NFKSignuppageTouchIDBtn;
	@FindBy(locator = "NFK.signuppage.optin.privecy.NFK.lbl")
	private QAFWebElement NFKSignuppageOptinPrivecyNFKLbl;
	@FindBy(locator = "NFK.signuppage.updatenotice.chck.btn")
	private QAFWebElement NFKSignuppageUpdatenoticeChckBtn;
	@FindBy(locator = "NFK.signuppage.updatenotice.continue.btn")
	private QAFWebElement NFKSignuppageUpdatenoticeContinueBtn;
	@FindBy(locator = "NFK.signupPage.optin.title.lbl")
	private QAFWebElement NFKSignuppageOptinTitleLbl;
	@FindBy(locator = "NFK.signuppage.dob.list.year")
	private QAFWebElement NFKSignuppageDobListYear;
	@FindBy(locator = "NFK.signupPage.optin.customer.service.link")
	private QAFWebElement NFKSignuppageOptinCustomerServiceLink;
	@FindBy(locator = "NFK.signupPage.optin.customer.service.link.redirects.newmail.txt")
	private QAFWebElement NFKSignuppageOptinCustomerServiceLinkNewEmailText;
	@FindBy(locator = "NFK.signupPage.gender.male.radio.btn")
	private QAFWebElement NFKSignupPageGenderMaleRadioBtn;
	@FindBy(locator = "NFK.signupPage.gender.female.radio.btn")
	private QAFWebElement NFKSignupPageGenderFemaleRadioBtn;
	@FindBy(locator = "NFK.signupPage.diabetes.type1.radio.btn")
	private QAFWebElement NFKSignupPageDiabetesType1RadioBtn;
	@FindBy(locator = "NFK.signupPage.diabetes.type2.radio.btn")
	private QAFWebElement NFKSignupPageDiabetesType2RadioBtn;
	@FindBy(locator = "NFK.signupPage.diabetes.gestational.radio.btn")
	private QAFWebElement NFKSignupPageDiabetesGestationalRadioBtn;
	@FindBy(locator = "NFK.signupPage.picker.date.pkr")
	private QAFWebElement NFKSignupPagePickerDateLbl;
	@FindBy(locator = "NFK.signupPage.picker.month.pkr")
	private QAFWebElement NFKSignupPagePickerMonthLbl;
	@FindBy(locator = "NFK.signupPage.picker.year.pkr")
	private QAFWebElement NFKSignupPagePickerYearLbl;
	@FindBy(locator = "NFK.signupPage.clinic.title.lbl")
	private QAFWebElement NFKSignupPageClinicTitleLbl;
	@FindBy(locator = "NFK.signupPage.clinic.consent.chkbox")
	private QAFWebElement NFKSignupPageClinicConsentChkbox;
	@FindBy(locator = "NFK.signupPage.clinicname.lbl")
	private QAFWebElement NFKSignupPageClinicNameLbl;
	@FindBy(locator = "NFK.signupPage.clinicphonenumber.lbl")
	private QAFWebElement NFKSignupPageClinicPhonenumberLbl;
	@FindBy(locator = "NFK.homepage.home.btn")
	private QAFWebElement NFKHomepageHomeBtn;
	@FindBy(locator = "NFK.signupPage.clinic.send.btn")
	private QAFWebElement NFKSignupPageClinicSendBtn;
	@FindBy(locator = "NFK.signuppage.clinic.info.btn")
	private QAFWebElement NFKSignuppageClinicInfoBtn;
	@FindBy(locator = "NFK.signuppage.dob.ok.btn")
	private QAFWebElement NFKSignuppageDobOkBtn;
	@FindBy(locator = "NFK.signuppage.clinic.close.info.btn")
	private QAFWebElement NFKSignuppageClinicCloseInfoBtn;
	@FindBy(locator = "NFK.applysensor.skip.btn")
	private QAFWebElement NFKApplysensorSkipBtn;
	@FindBy(locator = "NFK.signuppage.removeapp.txt")
	private QAFWebElement NFKrunAppInBackground;
	@FindBy(locator = "NFK.applysensor.title")
	private QAFWebElement NFKApplysensorTitle;

	@FindBy(locator = "NFK.signup.dependentpage.txt")
	private QAFWebElement NFKSignupDependentpageTxt;
	@FindBy(locator = "NFK.signup.dependent.guardian.fname")
	private QAFWebElement NFKSignupDependentGuardianFname;
	@FindBy(locator = "NFK.signup.dependent.guardian.lname")
	private QAFWebElement NFKSignupDependentGuardianLname;
	@FindBy(locator = "NFK.signup.dependent.emailAddress.txt")
	private QAFWebElement NFKSignupDependentEmailAddressTxt;
	@FindBy(locator = "NFK.signup.dependent.confemailaddress.txt")
	private QAFWebElement NFKSignupDependentConfemailaddressTxt;
	@FindBy(locator = "NFK.signup.dependent.password.txt")
	private QAFWebElement NFKSignupDependentPasswordTxt;
	@FindBy(locator = "NFK.signup.dependent.confpassword.txt")
	private QAFWebElement NFKSignupDependentConfpasswordTxt;
	@FindBy(locator = "NFK.signup.dependent.CheckAgreementTerm.btn")
	private QAFWebElement NFKSignupDependentCheckAgreementTermBtn;
	@FindBy(locator = "NFK.signup.dependent.checkPromotionalOffers.btn")
	private QAFWebElement NFKSignupDependentCheckPromotionalOffersBtn;
	@FindBy(locator = "NFK.signup.dependent.clinic.txt")
	private QAFWebElement NFKSignupDependentClinicTxt;

	@FindBy(locator = "NFK.signuppage.safety.settings.btn")
	private QAFWebElement NFKSignuppageSafetySettingsBtn;
	@FindBy(locator = "NFK.device.setting.onetouch.txt")
	private QAFWebElement NFKDeviceSettingOnetouchTxt;
	@FindBy(locator = "NFK.device.setting.switch.btn")
	private QAFWebElement NFKDeviceSettingSwitchBtn;
	@FindBy(locator = "NFK.device.setting.allow.btn")
	private QAFWebElement NFKDeviceSettingAllowBtn;

	@FindBy(locator = "NFK.signuppage.clinic.name")
	private QAFWebElement NFKSignuppageClinicName;
	@FindBy(locator = "NFK.signuppage.clinic.phone")
	private QAFWebElement NFKSignuppageClinicPhone;
	@FindBy(locator = "NFK.signuppage.clinic.info.name")
	private QAFWebElement NFKSignuppageClinicInfoName;
	@FindBy(locator = "NFK.signuppage.clinic.info.phone")
	private QAFWebElement NFKSignuppageClinicInfoPhone;
	@FindBy(locator = "NFK.signuppage.clinic.info.msgrequest")
	private QAFWebElement NFKSignuppageClinicInfoMsgrequest;
	@FindBy(locator = "NFK.signuppage.clinic.info.tikmark")
	private QAFWebElement NFKSignuppageClinicInfoTikmark;
	@FindBy(locator = "NFK.signuppage.clinic.info.close.btn")
	private QAFWebElement NFKSignuppageClinicInfoCloseBtn;
	// Validation X button
	@FindBy(locator = "NFK.validation.error.icon")
	private QAFWebElement NFKValidationErrorIcon;
	// Age Restriction Pop up
	@FindBy(locator = "NFK.signuppage.age.restriction.popup")
	private QAFWebElement NFKSignuppageAgeRestrictionPopup;
	@FindBy(locator = "NFK.signuppage.age.restriction.popup.cancel.btn")
	private QAFWebElement NFKSignuppageAgeRestrictionPopupCancelButton;
	@FindBy(locator = "NFK.signuppage.age.restriction.popup.signupdependent.btn")
	private QAFWebElement NFKSignuppageAgeRestrictionPopupSignupdependentButton;
	@FindBy(locator = "NFK.signuppage.emailexist.popup")
	private QAFWebElement NFKSignuppageEmailexistPpopup;

	// Emancipation
	@FindBy(locator = "NFK.signup.emancipation.title")
	private QAFWebElement NFKSignupEmancipationTitle;

	public QAFWebElement getNFKSignupEmancipationTitle() {
		return NFKSignupEmancipationTitle;
	}

	public QAFWebElement getNFKSignuppageEmailexistPpopup() {
		return NFKSignuppageEmailexistPpopup;
	}

	public QAFWebElement getNFKSignuppageClinicInfoName() {
		return NFKSignuppageClinicInfoName;
	}

	public QAFWebElement getNFKSignuppageClinicInfoPhone() {
		return NFKSignuppageClinicInfoPhone;
	}

	public QAFWebElement getNFKSignuppageClinicInfoMsgrequest() {
		return NFKSignuppageClinicInfoMsgrequest;
	}

	public QAFWebElement getNFKSignuppageClinicInfoTikmark() {
		return NFKSignuppageClinicInfoTikmark;
	}

	public QAFWebElement getNFKSignuppageClinicInfoCloseBtn() {
		return NFKSignuppageClinicInfoCloseBtn;
	}

	public QAFWebElement getNFKSignupDependentpageTxt() {
		return NFKSignupDependentpageTxt;
	}

	public QAFWebElement getNFKSignuppageClinicName() {
		return NFKSignuppageClinicName;
	}

	public QAFWebElement getNFKSignuppageClinicPhone() {
		return NFKSignuppageClinicPhone;
	}

	public QAFWebElement getNFKSignuppageSafetySettingsBtn() {
		return NFKSignuppageSafetySettingsBtn;
	}

	public QAFWebElement getNFKDeviceSettingOnetouchTxt() {
		return NFKDeviceSettingOnetouchTxt;
	}

	public QAFWebElement getNFKDeviceSettingSwitchBtn() {
		return NFKDeviceSettingSwitchBtn;
	}

	public QAFWebElement getNFKDeviceSettingAllowBtn() {
		return NFKDeviceSettingAllowBtn;
	}

	public QAFWebElement getNFKSignupDependentClinicTxt() {
		return NFKSignupDependentClinicTxt;
	}

	public QAFWebElement getNFKSignupDependentGuardianFname() {
		return NFKSignupDependentGuardianFname;
	}

	public QAFWebElement getNFKSignupDependentGuardianLname() {

		return NFKSignupDependentGuardianLname;
	}

	public QAFWebElement getNFKSignupDependentEmailAddressTxt() {
		return NFKSignupDependentEmailAddressTxt;
	}

	public QAFWebElement getNFKSignupDependentConfemailaddressTxt() {
		return NFKSignupDependentConfemailaddressTxt;
	}

	public QAFWebElement getNFKSignupDependentPasswordTxt() {
		return NFKSignupDependentPasswordTxt;
	}

	public QAFWebElement getNFKSignupDependentConfpasswordTxt() {
		return NFKSignupDependentConfpasswordTxt;
	}

	public QAFWebElement getNFKSignupDependentCheckAgreementTermBtn() {
		return NFKSignupDependentCheckAgreementTermBtn;
	}

	public QAFWebElement getNFKSignupDependentCheckPromotionalOffersBtn() {
		return NFKSignupDependentCheckPromotionalOffersBtn;
	}

	public QAFWebElement getNFKrunAppInBackground() {
		return NFKrunAppInBackground;
	}

	public QAFWebElement getNFKSignuppageClinicInfoBtn() {
		return NFKSignuppageClinicInfoBtn;
	}

	public QAFWebElement getNFKSignuppageClinicCloseInfoBtn() {
		return NFKSignuppageClinicCloseInfoBtn;
	}

	public QAFWebElement getNFKSignupPageClinicSendBtn() {
		return NFKSignupPageClinicSendBtn;
	}

	public QAFWebElement getNFKSignupPageClinicPhonenumberLbl() {
		return NFKSignupPageClinicPhonenumberLbl;
	}

	public QAFWebElement getNFKHomepageHomeBtn() {
		return NFKHomepageHomeBtn;
	}

	public QAFWebElement getNFKSignupPageClinicNameLbl() {
		return NFKSignupPageClinicNameLbl;
	}

	public QAFWebElement getNFKApplysensorTitle() {
		return NFKApplysensorTitle;
	}

	public QAFWebElement getNFKSignupPageClinicConsentChkbox() {
		return NFKSignupPageClinicConsentChkbox;
	}

	public QAFWebElement getNFKSignupPageClinicTitleLbl() {
		return NFKSignupPageClinicTitleLbl;
	}

	public QAFWebElement getNFKSignupPagePickerDateLbl() {
		return NFKSignupPagePickerDateLbl;
	}

	public QAFWebElement getNFKSignuppageDobOkBtn() {
		return NFKSignuppageDobOkBtn;
	}

	public QAFWebElement getNFKSignupPagePickerMonthLbl() {
		return NFKSignupPagePickerMonthLbl;
	}

	public QAFWebElement getNFKSignuppageDobListYear() {
		return NFKSignuppageDobListYear;
	}

	public QAFWebElement getNFKSignupPagePickerYearLbl() {
		return NFKSignupPagePickerYearLbl;
	}

	public QAFWebElement getNFKSignupPageGenderMaleRadioBtn() {
		return NFKSignupPageGenderMaleRadioBtn;
	}

	public QAFWebElement getNFKSignupPageGenderFemaleRadioBtn() {
		return NFKSignupPageGenderFemaleRadioBtn;
	}

	public QAFWebElement getNFKSignupPageDiabetesType1RadioBtn() {
		return NFKSignupPageDiabetesType1RadioBtn;
	}

	public QAFWebElement getNFKSignupPageDiabetesType2RadioBtn() {
		return NFKSignupPageDiabetesType2RadioBtn;
	}

	public QAFWebElement getNFKSignupPageDiabetesGestationalRadioBtn() {
		return NFKSignupPageDiabetesGestationalRadioBtn;
	}

	public QAFWebElement getNFKSignuppageOptinCustomerServiceLink() {
		return NFKSignuppageOptinCustomerServiceLink;
	}

	public QAFWebElement getNFKSignuppageOptinCustomerServiceLinkNewEmailText() {
		return NFKSignuppageOptinCustomerServiceLinkNewEmailText;
	}

	public QAFWebElement getNFKSignuppageOptinTitleLbl() {
		return NFKSignuppageOptinTitleLbl;
	}

	public QAFWebElement getNFKSignuppageUpdatenoticeContinueBtn() {
		return NFKSignuppageUpdatenoticeContinueBtn;
	}

	public QAFWebElement getNFKSignuppageUpdatenoticeChckBtn() {
		return NFKSignuppageUpdatenoticeChckBtn;
	}

	public QAFWebElement getNFKSignuppageOptinPrivecyNFKLbl() {
		return NFKSignuppageOptinPrivecyNFKLbl;
	}

	public QAFWebElement getNFKSignuppageTouchIDBtn() {
		return NFKSignuppageTouchIDBtn;
	}

	public QAFWebElement getNFKApplysensorSkipBtn() {
		return NFKApplysensorSkipBtn;
	}

	public QAFWebElement getNFKHcpsignuppageResetpasswordLbl() {
		return NFKHcpsignuppageResetpasswordLbl;
	}

	public QAFWebElement getNFKSignupPageCalendarYearBtn() {
		return NFKSignupPageCalendarYearBtn;
	}

	public QAFWebElement getNFKSignupPageCalendarNextBtn() {
		return NFKSignupPageCalendarNextBtn;
	}

	public QAFWebElement getNFKSignupPageCalendarPreviousBtn() {
		return NFKSignupPageCalendarPreviousBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKsignuppageemailtxt() {
		return NFKSignuppageEmailTxt;
	}

	public QAFWebElement getNFKsignuppageconfirmemailtxt() {
		return NFKSignuppageConfirmemailTxt;
	}

	public QAFWebElement getNFKsignuppagepasswordtxt() {
		return NFKSignuppagePasswordTxt;
	}

	public QAFWebElement getNFKsignuppagesignupbtn() {
		return NFKSignuppageSignupBtn;
	}

	public QAFWebElement getNFKsignuppagetermofservicecheckbox() {
		return NFKSignuppageTermofserviceCheckBox;
	}

	public QAFWebElement getNFKsignuppageonetouchlogo() {
		return NFKSignuppageOnetouchLogo;
	}

	public QAFWebElement getNFKsignuppagebackbtn() {
		return NFKSignuppageBackBtn;
	}

	public QAFWebElement getNFKsignuppageloginlnk() {
		return NFKSignuppageLoginLnk;
	}

	public QAFWebElement getNFKsignuppagetermofservicelnk() {
		return NFKSignuppageTermofserviceLnk;
	}

	public QAFWebElement getNFKsignuppageskipbtn() {
		return NFKSignuppageSkipBtn;
	}

	// next button safety onboarding
	public QAFWebElement getNFKsignuppagesafetynextbtn() {
		return NFKSignuppageSafetyNextBtn;
	}

	public QAFWebElement getNFKSignuppageSafetyIunstdCheckBox() {
		return NFKSignuppageSafetyIunstdCheckBox;
	}

	public QAFWebElement getNFKsignuppagesafetydonebtn() {
		return NFKSignuppageSafetyDoneBtn;
	}

	public QAFWebElement getNFKSignuppageSafetyAllowBtn() {
		return NFKSignuppageSafetyAllowBtn;
	}

	public QAFWebElement getNFKSignuppageSensorSkipBtn() {
		return NFKSignuppageSensorSkipBtn;
	}

	public QAFWebElement getNFKsignuppageimportantmessagetxt() {
		return NFKSignuppageImportantmessageTxt;
	}

	public QAFWebElement getNFKsignuppageimportantmessageokbtn() {
		return NFKSignuppageImportantmessageokBtn;
	}

	public QAFWebElement getNFKsignuppagecontinuebuttonbtn() {
		return NFKSignuppageContinuebuttonBtn;
	}

	public QAFWebElement getNFKsignuppagetermsofusetxt() {
		return NFKSignuppageTermsofuseTxt;
	}

	public QAFWebElement getNFKsignuppagetermsandprivecytxt() {
		return NFKSignuppageTermsandprivecyTxt;
	}

	public QAFWebElement getNFKsignuppagefirstnametxt() {
		return NFKSignuppageFirstnameTxt;
	}

	public QAFWebElement getNFKsignuppagelastnametxt() {
		return NFKSignuppageLastnameTxt;
	}

	public QAFWebElement getNFKsignuppagedobtxt() {
		return NFKSignuppageDobTxt;
	}

	public QAFWebElement getNFKsignuppageconfirmpasswordtxt() {
		return NFKSignuppageConfirmpasswordTxt;
	}

	public QAFWebElement getNFKSignuppageCliniccodeTxt() {
		return NFKSignuppageCliniccodeTxt;
	}

	public QAFWebElement getNFKsignuppagepromotionalcodechkbox() {
		return NFKSignuppagePromotionalcodeChkbox;
	}

	public QAFWebElement getNFKsignuppagekeepmeloggedinchkbox() {
		return NFKSignuppageKeepmeloggedinChkbox;
	}

	public QAFWebElement getNFKSignuppageTimeStaticText(String text) {
		return LFSUtilsAndroid.getElement("NFK.signuppage.dynamic.txt", text);
	}

	public QAFWebElement getNFKSignuppageDynamicTxt() {
		return NFKSignuppageDynamicTxt;
	}

	public QAFWebElement getNFKSignuppageIagreeBtn() {
		return NFKSignuppageIagreeBtn;
	}

	public QAFWebElement getNFKSignuppageCancelBtn() {
		return NFKSignuppageCancelBtn;
	}

	public QAFWebElement getNFKEmailValidationErrorMsg() {
		return NFKEmailValidationErrorMsg;
	}

	public QAFWebElement getNFKConfirmEmailValidationErrorMsg() {
		return NFKConfirmEmailValidationErrorMsg;
	}

	public QAFWebElement getNFKPasswordValidationErrorMsg() {
		return NFKPasswordValidationErrorMsg;
	}

	public QAFWebElement getNFKSignuppageClinicCodeTxt() {
		return NFKSignuppageClinicCodeTxt;
	}

	public QAFWebElement getNFKSignuppageFirstNameErrorTxt() {
		return NFKSignuppageFirstNameErrorTxt;
	}

	public QAFWebElement getNFKSignuppageLastNameErrorTxt() {
		return NFKSignuppageLastNameErrorTxt;
	}

	public List<QAFWebElement> getNFKSignuppageWelcomepageNavigationTitleTxt() {
		return NFKSignuppageWelcomepageNavigationTitleTxt;
	}

	public List<QAFWebElement> getNFKSignuppageWelcomepageNavigationBtn() {
		return NFKSignuppageWelcomepageNavigationBtn;
	}

	public QAFWebElement getNFKValidationErrorIcon() {
		return NFKValidationErrorIcon;
	}

	private AndroidDriver androidDriver = (AndroidDriver) driver.getUnderLayingDriver();
	@FindBy(locator = "NFK.signuppage.dynamic.txt")
	private QAFWebElement NFKSignuppageDynamicTxt;
	@FindBy(locator = "NFK.signuppage.iagree.btn")
	private QAFWebElement NFKSignuppageIagreeBtn;
	@FindBy(locator = "NFK.signuppage.cancel.btn")
	private QAFWebElement NFKSignuppageCancelBtn;
	@FindBy(locator = "NFK.hcpsignuppage.resetpassword.lbl")
	private QAFWebElement NFKHcpsignuppageResetpasswordLbl;
	@FindBy(locator = "NFK.germansignuppage.uomselect.mgdl.btn")
	private QAFWebElement NFKGermansignuppageUomselectMgdlBtn;
	@FindBy(locator = "NFK.germansignuppage.uomselect.mmol.btn")
	private QAFWebElement NFKGermansignuppageUomselectMmolBtn;
	@FindBy(locator = "NFK.signuppage.welcomepage.navigation.btn")
	private List<QAFWebElement> NFKSignuppageWelcomepageNavigationBtn;
	@FindBy(locator = "NFK.signuppage.welcomepage.navigation.title.txt")
	private List<QAFWebElement> NFKSignuppageWelcomepageNavigationTitleTxt;
	@FindBy(locator = "NFK.signup.page.UOM.select.title")
	private QAFWebElement NFKsignuppageUomselecttitle;
	@FindBy(locator = "NFK.signup.page.UOM.select.text")
	private QAFWebElement NFKsignuppageUomselecttext;
	@FindBy(locator = "NFK.signup.page.UOM.select.mgdl.button.text")
	private QAFWebElement NFKsignuppageUomselectMgdlbuttontext;
	@FindBy(locator = "NFK.signup.page.UOM.select.mgdl.button")
	private QAFWebElement NFKsignuppageUomselectMgdlbutton;
	@FindBy(locator = "NFK.signup.page.UOM.select.mmol.button.text")
	private QAFWebElement NFKsignuppageUomselectMmolbuttontext;
	@FindBy(locator = "NFK.signup.page.UOM.select.mmol.button")
	private QAFWebElement NFKsignuppageUomselectMmolbutton;

	public QAFWebElement getNFKsignuppageUomselectMmolbutton() {
		return NFKsignuppageUomselectMmolbutton;
	}

	public QAFWebElement getNFKSignuppageBackBtn() {
		return NFKSignuppageBackBtn;
	}

	public QAFWebElement getNFKSignuppageAgeRestrictionPopupCancelButton() {
		return NFKSignuppageAgeRestrictionPopupCancelButton;
	}

	public QAFWebElement getNFKSignuppageAgeRestrictionPopupSignupdependentButton() {
		return NFKSignuppageAgeRestrictionPopupSignupdependentButton;
	}

	public QAFWebElement getNFKSignuppageAgeRestrictionPopup() {
		return NFKSignuppageAgeRestrictionPopup;
	}

	public QAFWebElement getNFKsignuppageUomselectMmolbuttontext() {
		return NFKsignuppageUomselectMmolbuttontext;
	}

	public QAFWebElement getNFKsignuppageUomselectMgdlbutton() {
		return NFKsignuppageUomselectMgdlbutton;
	}

	public QAFWebElement getNFKsignuppageUomselectMgdlbuttontext() {
		return NFKsignuppageUomselectMgdlbuttontext;
	}

	public QAFWebElement getNFKsignuppageUomselecttext() {
		return NFKsignuppageUomselecttext;
	}

	public QAFWebElement getNFKsignuppageUomselecttitle() {
		return NFKsignuppageUomselecttitle;
	}

	public QAFWebElement getNFKGermansignuppageUomselectMgdlBtn() {
		return NFKGermansignuppageUomselectMgdlBtn;
	}

	public QAFWebElement getNFKGermansignuppageUomselectMmolBtn() {
		return NFKGermansignuppageUomselectMmolBtn;
	}

	HomePageAndroid homePage = new HomePageAndroid();
	LoginPageAndroid android = new LoginPageAndroid();
	@FindBy(locator = "NFK.signupPage.optin.customer.service.link.redirects.compose.txt")
	private QAFWebElement NFKSignuppageOptinCustomerServiceLinkRedirectsComposeTxt;
	@FindBy(locator = "NFK.signuppage.welcomepage.skip.btn")
	private QAFWebElement NFKSignuppageWelcomepageSkipBtn;
	@FindBy(locator = "NFK.signuppage.welcomepage.yes.btn")
	private QAFWebElement NFKSignuppageWelcomepageYesBtn;

	public static String email;

	public AndroidDriver getDriver() {
		return androidDriver;
	}

	// Method to click Sign Up button
	public void clickSignUpButton() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKsignuppagesignupbtn().waitForPresent();
		getNFKsignuppagesignupbtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("The user clicked on signup button", MessageTypes.Pass);
	}

	// Method to click on skip button
	public void clickSkipBtn() {
		getNFKsignuppageskipbtn().waitForPresent();
		getNFKsignuppageskipbtn().click();
		try {

			if (getNFKSignuppageTimeStaticText(ConfigurationManager.getBundle().getString("alerts.uomDifference.title"))
					.isDisplayed()) {
				Reporter.logWithScreenShot("Unit of measurement selection page is displayed", MessageTypes.Pass);
				getNFKGermansignuppageUomselectMgdlBtn().waitForPresent();
				getNFKGermansignuppageUomselectMgdlBtn().click();
			} else {
				Reporter.logWithScreenShot("Unit of measurement selection page is not displayed", MessageTypes.Pass);
			}
		} catch (Exception e) {

		}
		LFSUtilsAndroid.waitforLoad();
		getNFKSignuppageWelcomepageSkipBtn().verifyPresent("Welcome Page is displayed");
		getNFKSignuppageWelcomepageSkipBtn().click();
		getNFKSignuppageWelcomepageYesBtn().verifyPresent("Ready to See OneTouchReveal Page is displayed");
		getNFKSignuppageWelcomepageYesBtn().click();
		selectUOM("mmol/L");
		homePage.getNFKHomepageShareBtn().waitForPresent();
	}



	// Method to select UOM for German user
	public void selectUOM(String option) {
		LFSUtilsAndroid.waitforLoad();
		try {
			if (getNFKSignuppageTimeStaticText(ConfigurationManager.getBundle().getString("alerts.uomDifference.title"))
					.isDisplayed()) {
				Reporter.logWithScreenShot("Unit of measurement selection page for Users", MessageTypes.Pass);
				String uom = option.toLowerCase();
				System.out.println("Unit of measure is " + uom);
				switch (uom) {
				case "mg/dl":
					getNFKsignuppageUomselectMgdlbutton().waitForPresent();
					getNFKsignuppageUomselectMgdlbutton().click();
					break;

				case "mmol/l":
					System.out.println("in mmol");
					getNFKsignuppageUomselectMmolbutton().waitForPresent();
					getNFKsignuppageUomselectMmolbutton().click();
					break;
				}
			} else
				Reporter.logWithScreenShot("UOM is already selected", MessageTypes.Pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//Verify UOM screen 

	public void verifyUOMscreen() {

		getNFKsignuppageUomselecttitle().isPresent();
		LFSUtilsAndroid.waitforLoad();
		// getNFKsignuppageUomselecttext().isPresent();
		LFSUtilsAndroid.waitforLoad();
		getNFKsignuppageUomselectMgdlbuttontext().isPresent();
		getNFKsignuppageUomselectMgdlbutton().isPresent();
		getNFKsignuppageUomselectMmolbuttontext().isPresent();
		getNFKsignuppageUomselectMmolbutton().isPresent();
	}

	// Method to click TOU and PP link from SignUp page
	public void clickTerms(String option) {
		int fingers = 1;
		int duration = 1;
		LFSUtilsAndroid.swipeWithScreenPercent(50, 75, 50, 30, 1);
		getNFKsignuppagetermofservicecheckbox().waitForPresent();

		Point p1 = getNFKsignuppagetermsandprivecytxt().getLocation();
		Dimension d1 = getNFKsignuppagetermsandprivecytxt().getSize();

		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		TouchAction tch = new TouchAction(appiumDriver);

		int startX = p1.getX();
		int startY = p1.getY();
		int endX = startX + d1.getWidth();
		int endy = startY + d1.getHeight();
		int perline = d1.getHeight() / 2;
		int middleX = startX + (d1.getWidth()) / 2;
		int middley = startY + (d1.getHeight()) / 2;

		option = option.toLowerCase();
		switch (option) {
		case "terms of use":
			System.out.println("............" + (endX - 50) + (startY + 10));
			tch.tap(middleX + 100, middley).perform();
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.createAccount.privacyPolicy.terms"))
					.verifyPresent("Term of use title");
			getNFKsignuppagetermsofusetxt().waitForPresent();
			Reporter.logWithScreenShot("Terms of use Page 1 is Displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Terms of use Page 2 is Displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Terms of use Page 3 is Displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Terms of use Page 4 is Displayed", MessageTypes.Pass);

			break;
		case "privacy policy":
			tch.tap(startX + 200, startY + 5 + perline).perform();
			System.out.println(startX + 200);
			System.out.println(startY + 50);
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.createAccount.privacyPolicy.privacy"))
					.verifyPresent("Term of use title");
			getNFKsignuppagetermsofusetxt().waitForPresent();
			Reporter.logWithScreenShot("Privacy Policy Page 1 is Displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Privacy Policy Page 2 is Displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Privacy Policy Page 3 is Displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Privacy Policy Page 4 is Displayed", MessageTypes.Pass);
			System.out.println("..............Privacy Policy.............");
			break;
		}

		LFSUtilsAndroid.clickBackButton();
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		getNFKsignuppagetermofservicecheckbox().verifyPresent("After clicking back button,Signup screen is displayed");

	}

	// Method to select Birthdate of User
	public void selectBirthDate(UserDetailBeans userDetails) {
		if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayDate()));
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerMonthLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			Reporter.log("valid date");
			getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("hr-hr")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerMonthLbl(),
					Integer.parseInt(userDetails.getBirthdayDate()));
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("sl-sl")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerMonthLbl(),
					Integer.parseInt(userDetails.getBirthdayDate()));
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("pl-pl")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("cz-cz")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("fr-fr")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("en-ph")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("vi-vi")) {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			getNFKsignuppageimportantmessageokbtn().click();
		} else {
			getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			getNFKsignuppageimportantmessageokbtn().click();
		}
	}

	// Method to select Birthdate of User
	public void selectBirthDateBelowAge(UserDetailBeans userDetails) {
		if (getNFKSignupPageCalendarYearBtn().isDisplayed())
			getNFKSignupPageCalendarYearBtn().click();
		getNFKSignuppageTimeStaticText("2016").waitForPresent();

		Point p1 = getNFKSignuppageTimeStaticText("2016").getLocation();
		int startX = p1.getX();
		int startY = p1.getY();

		while (!getNFKSignuppageTimeStaticText(userDetails.getBirthdayYear()).isPresent()) {
			LFSUtilsAndroid.swipeWithCoordinates(startX + 10, startY - 300, startX + 10, startY, 500);
		}

		getNFKSignuppageTimeStaticText(userDetails.getBirthdayYear()).click();

		HashMap<String, String> monthmap = new HashMap<String, String>();
		monthmap.put("Jan", "01");
		monthmap.put("Feb", "02");
		monthmap.put("Mar", "03");
		monthmap.put("Apr", "04");
		monthmap.put("May", "05");
		monthmap.put("Jun", "06");
		monthmap.put("Jul", "07");
		monthmap.put("Aug", "08");
		monthmap.put("Sep", "09");
		monthmap.put("Oct", "10");
		monthmap.put("Nov", "11");
		monthmap.put("Dec", "12");

		DateFormat df = new SimpleDateFormat("MM");
		Date dateobj = new Date();

		int curMonth = Integer.parseInt(df.format(dateobj));
		System.out.println("Cur month " + curMonth);
		System.out.println(userDetails.getBirthdayMonth().substring(0, 2));
		int birthMonth = Integer.parseInt(monthmap.get("Feb"));
		System.out.println("BirthMonth " + birthMonth);
		try {
			if (birthMonth > curMonth) {
				int count = birthMonth - curMonth;
				System.out.println(count);
				while (count != 0) {
					getNFKSignupPageCalendarNextBtn().click();
					count--;
				}
			} else if (curMonth > birthMonth) {
				int count = curMonth - birthMonth;

				while (count != 0) {
					getNFKSignupPageCalendarPreviousBtn().click();
					count--;
				}
			} else {
				System.out.println("continue next codes");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// click on date
		getNFKSignuppageTimeStaticText(userDetails.getBirthdayDate()).click();
		getNFKsignuppageimportantmessageokbtn().click();
		getNFKsignuppageonetouchlogo().click();
		Reporter.logWithScreenShot("Error message for date less than 18 years", MessageTypes.Pass);
		getNFKsignuppageimportantmessageokbtn().click();
		LFSUtilsAndroid.waitforLoad();
	}

	// Method to fill registration details for New User
	public void fillSignUpDetails(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		String email = "doshaheentt+" + RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		if (userDetails instanceof String) {
			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKsignuppagedobtxt().click();
		selectBirthDate(userBean);
		
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(email);
		ConfigurationManager.getBundle().setProperty("register.email.key", email);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(email);

		getNFKsignuppagepasswordtxt().waitForVisible();

		// androidDriver.pressKeyCode(AndroidKeyCode.KEYCODE_ESCAPE);

		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		ConfigurationManager.getBundle().setProperty("register.pass", userBean.getPassword());
		/*
		 * if(getNFKsignuppagetermofservicecheckbox().isDisplayed()) {
		 * LFSUtilsAndroid.scrollToEleAndriod("Continue"); }
		 */
		// LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		androidDriver.pressKeyCode(4);
		getNFKsignuppageconfirmpasswordtxt().verifyPresent("The confirm password field is present");
		getNFKsignuppageconfirmpasswordtxt().clear();
		getNFKsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		// androidDriver.pressKeyCode(AndroidKeyCode.KEYCODE_ESCAPE);
		ConfigurationManager.getBundle().setProperty("register.password.key", userBean.getPassword());
		Reporter.logWithScreenShot("The user filled sign up details", MessageTypes.Pass);
		androidDriver.pressKeyCode(4);
//		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		getNFKsignuppagetermofservicecheckbox().click();
	}

	// Method to fill Signup details with First name field as blank

	public void selectDOB(UserDetailBeans userBean) {
		getNFKSignupPagePickerDateLbl().waitForPresent();
		getNFKSignupPagePickerYearLbl().isPresent();
		getNFKSignupPagePickerYearLbl().click();
		LFSUtilsAndroid.scrollToEleAndriodDOB(userBean.getBirthdayYear());
		LFSUtilsAndroid.clickWithText(userBean.getBirthdayYear());
		getNFKsignuppageimportantmessageokbtn().click();
		getNFKSignuppageDobOkBtn().click();
	}

	// Gunther 0/6 update
	public void doSignUpWithoutFirstName(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("The signup screen before filling details", MessageTypes.Pass);
		getNFKsignuppagefirstnametxt().clear();
		getNFKsignuppagelastnametxt().clear();
		getNFKsignuppagelastnametxt().sendKeys(userBean.getLastName());
		Reporter.logWithScreenShot("Signup screen after filling last name", MessageTypes.Pass);
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignupPageDiabetesType1RadioBtn().waitForPresent();
		getNFKSignupPageGenderMaleRadioBtn().click();
		getNFKSignupPageDiabetesType1RadioBtn().waitForPresent();
		getNFKSignupPageDiabetesType1RadioBtn().click();
		if (getNFKsignuppagesignupbtn().isEnabled()) {
			Reporter.logWithScreenShot("The first name field is not blank", MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("The first name field is blank", MessageTypes.Pass);
		}

	}

	// Method to fill Signup details with Last name field as blank
	public void doSignUpWithoutLastName(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);
		getNFKsignuppagefirstnametxt().clear();
		getNFKsignuppagefirstnametxt().sendKeys(userBean.getFirstName());
		Reporter.logWithScreenShot("After Filling first name", MessageTypes.Pass);
		getNFKsignuppagelastnametxt().clear();
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignupPageDiabetesType1RadioBtn().waitForPresent();
		getNFKSignupPageGenderMaleRadioBtn().click();
		getNFKSignupPageDiabetesType1RadioBtn().waitForPresent();
		getNFKSignupPageDiabetesType1RadioBtn().click();
		if (getNFKsignuppagesignupbtn().isEnabled()) {
			Reporter.logWithScreenShot("Last Name field is not blank", MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Last Name field is blank", MessageTypes.Pass);
		}

	}

	// Method to fill Signup details with Birthdate below age
	public void doSignUpWithDateBelowAge(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Before Filling last name", MessageTypes.Pass);
		getNFKsignuppagedobtxt().click();
		Reporter.logWithScreenShot("Calendar is displayed", MessageTypes.Pass);
		getNFKsignuppageimportantmessageokbtn().click();
		getNFKsignuppageimportantmessageokbtn().waitForPresent();
		Reporter.logWithScreenShot("Error message with Birthdate field below age", MessageTypes.Pass);
		getNFKsignuppageimportantmessageokbtn().click();
	}

	// Method to fill Signup details without Birthdate
	public void fillDetailsWithoutBirthday(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		getNFKsignuppageconfirmpasswordtxt().clear();
		getNFKsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Complete form", MessageTypes.Pass);
		getNFKsignuppageonetouchlogo().click();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		getNFKsignuppagetermofservicecheckbox().click();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		androidDriver.pressKeyCode(4);
		getNFKsignuppagesignupbtn().click();
		getNFKsignuppagetermofservicecheckbox().isDisplayed();

	}

	// Method to fill registration details for New User without checkbox checked
	public void fillSignUpDetailsWithoutChckbox(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKsignuppagedobtxt().click();
		selectBirthDate(userBean);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		getNFKsignuppageconfirmpasswordtxt().clear();
		getNFKsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Complete form", MessageTypes.Pass);
		androidDriver.pressKeyCode(4);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKsignuppagesignupbtn().click();
		getNFKsignuppagetermofservicecheckbox().isDisplayed();
		Reporter.logWithScreenShot("Cannot create account", MessageTypes.Pass);
	}

	// Method to fill first page details
	public void fillFirstPageDetails(Object userDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}

		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);
		getNFKsignuppagedobtxt().click();
		LFSUtilsAndroid.waitforLoad();
		selectBirthDate(userBean);
		Reporter.logWithScreenShot("After Selecting Birth date", MessageTypes.Pass);
		getNFKsignuppageimportantmessageokbtn().click();
		Reporter.logWithScreenShot("Before checking service check box", MessageTypes.Pass);
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		getNFKsignuppagetermofservicecheckbox().click();
		Reporter.logWithScreenShot("After checking service check box", MessageTypes.Pass);
		getNFKsignuppagecontinuebuttonbtn().waitForEnabled();
		Reporter.logWithScreenShot("After Continue button is enabled", MessageTypes.Pass);
		getNFKsignuppagecontinuebuttonbtn().click();
	}

	// Method to fill details without email id
	public void fillRandomSignUpDetailsWithoutEmail(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKsignuppagedobtxt().click();
		selectBirthDate(userBean);
		getNFKsignuppageemailtxt().clear();
		Reporter.logWithScreenShot("Error message with blank email id", MessageTypes.Pass);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Password", MessageTypes.Pass);
		getNFKsignuppageconfirmpasswordtxt().clear();
		getNFKsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 30, 1);
		Reporter.logWithScreenShot("After Filling Confirm password", MessageTypes.Pass);
		androidDriver.pressKeyCode(4);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 30, 1);
		if (getNFKsignuppagesignupbtn().isEnabled()) {
			getNFKsignuppagesignupbtn().click();
			Reporter.logWithScreenShot("Error message for empty email text field", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Email text field is blank and thus signup button is disabled",
					MessageTypes.Pass);
	}

	// Method to verify invalid email ids entered
	public void fillDetailsWithInvalidEmails(Object userDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys("abcd.gmail.com");
		getNFKsignuppageconfirmemailtxt().click();

		if (getNFKEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot("@ is not present", MessageTypes.Pass);
		}

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys("abcdgmailcom");
		getNFKsignuppageconfirmemailtxt().click();

		if (getNFKEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot("Mail domain name is not entered", MessageTypes.Pass);
		}

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys("abcd@gmail");
		getNFKsignuppageconfirmemailtxt().click();

		if (getNFKEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot(".com/.co.in is not entered", MessageTypes.Pass);
		}

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys("@.gmail.com");
		getNFKsignuppageconfirmemailtxt().click();

		if (getNFKEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot("Prefix name is not entered", MessageTypes.Pass);
		}

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(RandomStringUtils.randomAlphanumeric(70) + "@gmail.com");
		getNFKsignuppageconfirmemailtxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot("Email length exceeds the limit", MessageTypes.Pass);
		}
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(RandomStringUtils.randomAlphanumeric(65) + "@gmail.com");
		getNFKsignuppageconfirmemailtxt().click();
		if (!(getNFKEmailValidationErrorMsg().isPresent())) {
			Reporter.logWithScreenShot("Email length is within the limit", MessageTypes.Pass);
		}

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppageconfirmemailtxt().click();
		if (!(getNFKEmailValidationErrorMsg().isPresent())) {
			Reporter.logWithScreenShot("Email id is valid", MessageTypes.Pass);
		}

	}

	// Method to verify email validations
	public void emailValidations(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys("abcd@gmail.com");
		getNFKsignuppagepasswordtxt().click();

		if (getNFKConfirmEmailValidationErrorMsg().isPresent()
				&& getNFKConfirmEmailValidationErrorMsg().getText().contains("match")) {
			Reporter.logWithScreenShot("Email and confirm email fields do not match", MessageTypes.Pass);
		}
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppagepasswordtxt().click();

		if (!(getNFKConfirmEmailValidationErrorMsg().isPresent())) {
			Reporter.logWithScreenShot("Email and Confirm email fields matched", MessageTypes.Pass);
		}

	}

	// Method to enter signup details without password
	public void noPasswordToFill(String userDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKsignuppagedobtxt().click();
		selectBirthDate(userBean);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Email Id", MessageTypes.Pass);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getNFKsignuppagepasswordtxt().clear();
		LFSUtilsAndroid.hideKeyboard();
		getNFKsignuppageconfirmpasswordtxt().clear();
		getNFKsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());

		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 30, 1);
		if (getNFKsignuppagesignupbtn().isEnabled())
			Reporter.logWithScreenShot("All details are filled", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Error message with blank password field", MessageTypes.Pass);
	}

	// Method to enter signup details with invalid password
	public void invalidPasswordEntry(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("After Filling Email Id", MessageTypes.Pass);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys("abcd1");
		LFSUtilsAndroid.hideKeyboard();
		getNFKsignuppageconfirmpasswordtxt().click();

		if (getNFKPasswordValidationErrorMsg().isPresent()
				&& getNFKPasswordValidationErrorMsg().getText().contains("Passwords")) {
			Reporter.logWithScreenShot("Password field should contains min 6 alphanumeric values", MessageTypes.Pass);
		}

		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys("abcdefg@123456789");
		LFSUtilsAndroid.hideKeyboard();
		getNFKsignuppageconfirmpasswordtxt().click();

		if (getNFKPasswordValidationErrorMsg().isPresent()
				&& getNFKPasswordValidationErrorMsg().getText().contains("Passwords")) {
			Reporter.logWithScreenShot("Password field should contains max 16 aplhanumeric values", MessageTypes.Pass);
		}

		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys("abcd@1234");
		LFSUtilsAndroid.hideKeyboard();
		getNFKsignuppageconfirmpasswordtxt().click();

		if (!(getNFKPasswordValidationErrorMsg().isPresent())) {
			Reporter.logWithScreenShot("Valid password field is entered", MessageTypes.Pass);
		}
	}

	// Method to verify already exist mail id flow
	public void repeatedMailIdSignupFlow(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppagedobtxt().click();
		selectBirthDate(userBean);
		Reporter.logWithScreenShot("After Selecting Birth date", MessageTypes.Pass);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Email Id", MessageTypes.Pass);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Password field", MessageTypes.Pass);
		getNFKsignuppageconfirmpasswordtxt().clear();
		getNFKsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Confirm Password", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 75, 50, 30, 1);
		getNFKsignuppagetermofservicecheckbox().click();
		getNFKsignuppagesignupbtn().waitForEnabled();
		getNFKsignuppagesignupbtn().click();
		Reporter.logWithScreenShot("after clicking sign up", MessageTypes.Pass);
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("network.error.registrationEmailNotUnique"))
				.verifyVisible("Email Exist");
	}

	// Sign up method with invalid clinic code
	public void signUpDetailsWithInvalidClinicCode(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}

		fillFirstPageDetails(userDetails);
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Email Id", MessageTypes.Pass);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Password", MessageTypes.Pass);
		getNFKsignuppageconfirmpasswordtxt().clear();
		getNFKsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Confirm password", MessageTypes.Pass);
		getNFKSignuppageClinicCodeTxt().sendKeys("");// Send here invalid clinic
														// code. Currently not
														// clear on invalid
														// clinic code so left
														// blank
		Reporter.logWithScreenShot("After Filling Invalid clinic code", MessageTypes.Pass);
		getNFKsignuppageonetouchlogo().click();

	}

	// Method to select optIn option
	public void selectionOfOptin(String option) {
		getNFKsignuppagepromotionalcodechkbox().waitForPresent();
		getNFKsignuppagepromotionalcodechkbox().isPresent();
		getNFKsignuppagepromotionalcodechkbox().click();
		Reporter.logWithScreenShot("After checking promotional check box", MessageTypes.Pass);
		getNFKSignuppageIagreeBtn().waitForPresent();
		if (option.equalsIgnoreCase("I Agree")) {
			getNFKSignuppageIagreeBtn().click();
			Reporter.logWithScreenShot("User is agree to receive diabetes related information", MessageTypes.Pass);
		} else if (option.equalsIgnoreCase("Cancel")) {
			getNFKSignuppageCancelBtn().click();
			Reporter.logWithScreenShot("User is not agree to receive diabetes related information", MessageTypes.Pass);
		}
	}

	public void signupsecondPageScreen(Object signupDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		fillFirstPageDetails(signupDetails);

		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys("tes1123@gmail");
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys("tes@gmail.com");
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys("abcd");
		getNFKsignuppageconfirmpasswordtxt().clear();
		getNFKsignuppageconfirmpasswordtxt().sendKeys("abcd1234");

		getNFKsignuppageonetouchlogo().click();
		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);

		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(email);
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(email);
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys("Sangram@55");
		getNFKsignuppageconfirmpasswordtxt().clear();
		getNFKsignuppageconfirmpasswordtxt().clear();
		getNFKsignuppageconfirmpasswordtxt().sendKeys("Sangram@55");

		getNFKsignuppageonetouchlogo().click();

		getNFKsignuppagesignupbtn().waitForEnabled();
		LFSUtilsAndroid.swipeWithCoordinates(476, 932, 443, 831, 10);
		Reporter.logWithScreenShot("Signup button is present", MessageTypes.Pass);

	}

	public void fillHCPDetails(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		if (getNFKHcpsignuppageResetpasswordLbl().isPresent()) {
			Reporter.logWithScreenShot("Reset Password page for new HCP user", MessageTypes.Pass);
			if (getNFKsignuppageemailtxt().isEnabled()) {
				getNFKsignuppageemailtxt().clear();
				getNFKsignuppageemailtxt().sendKeys("aaaa.com");
				getNFKHcpsignuppageResetpasswordLbl().click();
				Reporter.logWithScreenShot("Email id is invalid", MessageTypes.Pass);
				getNFKsignuppageemailtxt().clear();
				String typeName = RandomStringUtils.randomAlphanumeric(76);
				getNFKsignuppageemailtxt().sendKeys(typeName);
				Validator.verifyThat("Hcp reset page email field charcter length",
						getNFKsignuppageemailtxt().getAttribute("value").length(), Matchers.lessThanOrEqualTo(75));
				getNFKsignuppageemailtxt().clear();
				getNFKsignuppageemailtxt().clear();
				getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
			} else
				Reporter.logWithScreenShot("Email id already entered", MessageTypes.Pass);

			getNFKsignuppagepasswordtxt().clear();
			getNFKsignuppagepasswordtxt().sendKeys("aaaa");
			getNFKHcpsignuppageResetpasswordLbl().click();
			Reporter.logWithScreenShot("invalid Password", MessageTypes.Pass);
			getNFKsignuppagepasswordtxt().clear();
			String typeName = RandomStringUtils.randomAlphanumeric(17);
			getNFKsignuppagepasswordtxt().sendKeys(typeName);
			Validator.verifyThat("Hcp reset page password field charcter length",
					getNFKsignuppagepasswordtxt().getAttribute("value").length(), Matchers.lessThanOrEqualTo(16));
			getNFKsignuppagepasswordtxt().clear();
			getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
			getNFKsignuppageconfirmpasswordtxt().clear();
			getNFKsignuppageconfirmpasswordtxt().sendKeys("abcd!1234");
			getNFKsignuppagedobtxt().click();
			Reporter.logWithScreenShot("Password and Confirm password field does not match error", MessageTypes.Pass);
			getNFKsignuppageconfirmpasswordtxt().clear();
			getNFKsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
			if (getNFKsignuppagesignupbtn().isEnabled()) {
				Reporter.logWithScreenShot("All details are filled", MessageTypes.Pass);
				getNFKsignuppagesignupbtn().click();
			} else
				Reporter.logWithScreenShot("I agree checkbox is not checked", MessageTypes.Pass);
		}
		getNFKsignuppagetermofservicecheckbox().click();
		if (getNFKsignuppagesignupbtn().isEnabled()) {
			Reporter.logWithScreenShot("Done button is enabled", MessageTypes.Pass);
		}
		LFSUtilsAndroid.hideKeyboard();
		getNFKsignuppagedobtxt().click();
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("alerts.hcp.dob.information.message"))
				.verifyVisible("Message for update DOB");

	}

	// Method to verify blank email field for HCP user
	public void verifyBlankMail(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);

		}
		if (getNFKHcpsignuppageResetpasswordLbl().isPresent()) {
			Reporter.logWithScreenShot("Reset Password page for new HCp user", MessageTypes.Pass);
			if (getNFKsignuppageemailtxt().isEnabled()) {
				getNFKsignuppageemailtxt().clear();

			} else
				Reporter.logWithScreenShot("Email id already entered", MessageTypes.Pass);

			getNFKsignuppagepasswordtxt().clear();
			getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
			getNFKsignuppageconfirmpasswordtxt().clear();
			getNFKsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());

			getNFKsignuppagetermofservicecheckbox().click();
			if (getNFKsignuppagesignupbtn().isEnabled()) {
				Reporter.logWithScreenShot("Done button is enabled", MessageTypes.Pass);
			} else
				Reporter.logWithScreenShot("Email field is blank", MessageTypes.Pass);
		}

	}

	// Method to add password reset details for HCP user
	public void addresetPasswordDetailHCP(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		userBean.fillData(userDetails);
		getNFKHcpsignuppageResetpasswordLbl().waitForPresent();
		Reporter.logWithScreenShot("Reset password field is displayed", MessageTypes.Pass);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppagepasswordtxt().sendKeys("abcd1234");
		getNFKsignuppageconfirmpasswordtxt().sendKeys("abcd1234");
		LFSUtilsAndroid.hideKeyboard();
		getNFKsignuppagetermofservicecheckbox().click();
		if (getNFKsignuppagetermofservicecheckbox().getAttribute("checked").equalsIgnoreCase("false"))
			getNFKsignuppagetermofservicecheckbox().click();
		Reporter.logWithScreenShot("Page displayed with all valid details", MessageTypes.Pass);
		clickSignUpButton();
		getNFKSignuppageUpdatenoticeChckBtn().waitForPresent();
		Reporter.logWithScreenShot("update notice screen", MessageTypes.Pass);
		getNFKSignuppageUpdatenoticeChckBtn().click();
		getNFKSignuppageUpdatenoticeContinueBtn().click();
		getNFKsignuppageskipbtn().waitForPresent();
		Reporter.logWithScreenShot("Skip page", MessageTypes.Pass);
		getNFKsignuppageskipbtn().click();

		homePage.getNFKHomepageShareBtn().waitForPresent();
		Reporter.logWithScreenShot("Home Page is Displayed", MessageTypes.Pass);
	}

	// Method to verify invalid clinic code entered
	public void verifyInvalidClinicCode(Object signupDetails) {
		fillSignUpDetails(signupDetails);
		// entering invalid clinic code
		getNFKSignuppageCliniccodeTxt().click();
		getNFKSignuppageCliniccodeTxt().sendKeys("ttccxx");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.waitforLoad();
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("office.code.not.found"))
				.verifyPresent("Incorrect clinic code message");
		Reporter.logWithScreenShot("Incorrect Clinic Message", MessageTypes.Pass);
		getNFKSignuppageCliniccodeTxt().waitForPresent();
		getNFKSignuppageCliniccodeTxt().click();
		getNFKSignuppageCliniccodeTxt().clear();
		String clinicCode = ConfigurationManager.getBundle().getProperty("clinic.clinicCode.cn.code1").toString();
		getNFKSignuppageCliniccodeTxt().sendKeys(clinicCode);
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("office.code.not.found"));
		Reporter.logWithScreenShot("Incorrect Clinic Message", MessageTypes.Pass);
	}

	public void veriyFirstAndLastName() {
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "first Name";
		String typeName1 = RandomStringUtils.randomAlphanumeric(76) + "last Name";
		getNFKsignuppagefirstnametxt().waitForPresent();
		getNFKsignuppagefirstnametxt().sendKeys("=<");
		getNFKsignuppagefirstnametxt().sendKeys(typeName);
		getNFKsignuppagelastnametxt().click();
		getNFKSignuppageFirstNameErrorTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for more than 75 characters present in First name field",
				MessageTypes.Pass);
		getNFKsignuppagefirstnametxt().clear();
		getNFKsignuppagefirstnametxt().sendKeys(typeName);
		getNFKsignuppagelastnametxt().click();
		getNFKSignuppageFirstNameErrorTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for more than 75 characters present in First name field",
				MessageTypes.Pass);
		getNFKsignuppagelastnametxt().sendKeys("=<");
		getNFKSignuppageLastNameErrorTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for invalid Last name is displayed", MessageTypes.Pass);
		getNFKsignuppagelastnametxt().clear();
		getNFKsignuppagelastnametxt().sendKeys(typeName1);
		getNFKsignuppagefirstnametxt().click();
		getNFKSignuppageLastNameErrorTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for more than 75 characters present in First name field",
				MessageTypes.Pass);
	}

	// Method to set year
	public void setYear() {
		int currentYear = Integer.parseInt(ConstantUtils.CURRENT_YEAR);
		int requiredYear = currentYear - 18;
		getNFKsignuppagedobtxt().click();

		if (getNFKSignupPageCalendarYearBtn().isDisplayed())
			getNFKSignupPageCalendarYearBtn().click();
		getNFKSignuppageTimeStaticText("2016").waitForPresent();

		Point p1 = getNFKSignuppageTimeStaticText("2016").getLocation();
		int startX = p1.getX();
		int startY = p1.getY();

		while (!getNFKSignuppageTimeStaticText("" + requiredYear).isPresent()) {
			LFSUtilsAndroid.swipeWithCoordinates(startX + 10, startY - 300, startX + 10, startY, 500);
		}
		getNFKSignuppageTimeStaticText("" + requiredYear).click();
		Reporter.logWithScreenShot("Selected Year", MessageTypes.Pass);
		getNFKsignuppageimportantmessageokbtn().click();

		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("onboarding.ageRestriction.title"))
				.verifyNotVisible("Age restriction pop up");
	}

	// Method to clicking authentication type
	// Milan
	public void clickOnAuthenticationTypeSignup(String option) {

		option = option.toUpperCase();
		switch (option) {
		case "KEEP ME LOGIN":
			if (getNFKsignuppagekeepmeloggedinchkbox().getAttribute("checked").contains("false"))
				getNFKsignuppagekeepmeloggedinchkbox().click();
			else {
				Reporter.logWithScreenShot("Keep me login switch is on", MessageTypes.Pass);
			}
			break;
		case "TOUCH ID":
			getNFKSignuppageTouchIDBtn().click();
			break;
		}
		Reporter.logWithScreenShot("After selecting Authentication Type", MessageTypes.Pass);
	}

	// Create account button on sign up first page
	public void clicksOnCreateAccountButton() {
		getNFKsignuppagecontinuebuttonbtn().waitForEnabled();
		getNFKsignuppagecontinuebuttonbtn().click();
		Reporter.logWithScreenShot("The user clicks on continue button", MessageTypes.Pass);
	}

	// method to verify touch ID option is available on the screen
	public void verifiesTouchIDOption() {
		getNFKSignuppageTouchIDBtn().waitForPresent();
		getNFKSignuppageTouchIDBtn().verifyPresent("Enable touch ID");
	}

	// Method to select optIn option
	public void verificationOfOptin() {

		// getNFKsignuppagepromotionalcodechkbox().waitForPresent();
		// System.out.println("Waited for checbox");
		// Point p1 = getNFKsignuppagepromotionalcodechkbox().getLocation();
		// Dimension d1 = getNFKsignuppagepromotionalcodechkbox().getSize();
		// AppiumDriver appiumDriver = (AppiumDriver) (new
		// WebDriverTestBase().getDriver()
		// .getUnderLayingDriver());
		// TouchAction tch = new TouchAction(appiumDriver);
		// System.out.println("Getting the co-ordinates...");
		// int startX = p1.getX();
		// int startY = p1.getY();
		// int pointX = startX + d1.getWidth() / 2;
		// int pointY = startY + d1.getHeight() / 2;
		// tch.tap(pointX, pointY).perform();
		// Reporter.logWithScreenShot("After checking promotional check box",
		// MessageTypes.Pass);
		getNFKsignuppagepromotionalcodechkbox().isPresent();
		getNFKsignuppagepromotionalcodechkbox().click();
		System.out.println("checked the checkbox");
		getNFKSignuppageOptinTitleLbl().waitForPresent();
		getNFKSignuppageOptinTitleLbl().verifyPresent("Opt-In Title is present");
		getNFKSignuppageIagreeBtn().waitForPresent();
		////// getNFKSignuppageTimeStaticText(
		////// LFSUtilsAndroid.getPropString("auth.createAccount.privacyPolicy.privacy"))
		////// .click();
		// getNFKSignuppageOptinPrivecyNFKLbl().verifyPresent("Opt-in privecy screen");
		// LFSUtilsAndroid.clickBackButton();
		getNFKSignuppageIagreeBtn().click();

	}

	// method to verify signup first screen
	public void veriySignUpFirstPage() {
		getNFKsignuppageonetouchlogo().waitForPresent();
		getNFKsignuppageonetouchlogo().verifyPresent("One Touch Logo");
		getNFKsignuppagefirstnametxt().verifyPresent("First Name");
		getNFKsignuppagelastnametxt().verifyPresent("Last Name");
		getNFKsignuppagedobtxt().verifyPresent("Date of Birth");
		getNFKsignuppagecontinuebuttonbtn().verifyPresent("Create Account button");
		getNFKsignuppagetermofservicecheckbox().verifyPresent("Terms of Service checkBox");

	}

	// Installation of app without sensor instrumentation
	public void installWithoutSensor() {
		String a = ConfigurationManager.getBundle().getProperty("appium.additional.capabilities").toString();

		String filePath = splitCapabilityString(a, "app':'");
		String appPackage = splitCapabilityString(a, "appPackage':'");
		LFSUtilsAndroid jnj = new LFSUtilsAndroid();
		jnj.getDriver().removeApp(appPackage);
		Map<String, Object> params = new HashMap<>();

		params.put("file", filePath);
		params.put("instrument", "noinstrument");
		driver.executeScript("mobile:application:install", params);
	}

	public String splitCapabilityString(String value, String splitValue) {
		String str1[] = value.split(splitValue);
		String str2[] = str1[1].split("'");
		return str2[0];
	}

	// method to verify that Touch ID option is not present on sign up second
	// screen
	public void touchIDNotPresent() {
		getNFKSignuppageTouchIDBtn().verifyNotPresent();
		Reporter.logWithScreenShot("Touch ID is not Present", MessageTypes.Pass);
	}

	// method to verify that Keepme login option is not present on sign up
	// second
	// screen
	public void keepMeLoginNotPresent() {
		getNFKsignuppagekeepmeloggedinchkbox().verifyNotPresent();
		Reporter.logWithScreenShot("Keep Me Login  is not Present", MessageTypes.Pass);
	}

	// method to verify customer service link on opt in screen redirects to new
	// mail dialouge
	public void verifyCustomerServiceLink() {
		getNFKsignuppagepromotionalcodechkbox().waitForPresent();

		Point p1 = getNFKsignuppagepromotionalcodechkbox().getLocation();
		Dimension d1 = getNFKsignuppagepromotionalcodechkbox().getSize();
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		TouchAction tch = new TouchAction(appiumDriver);

		int startX = p1.getX();
		int startY = p1.getY();
		int pointX = startX + d1.getWidth() / 2;
		int pointY = startY + d1.getHeight() / 2;
		tch.tap(pointX, pointY).perform();

		getNFKSignuppageOptinTitleLbl().waitForPresent();
		if (getNFKSignuppageOptinCustomerServiceLink().isPresent()
				&& getNFKSignuppageOptinCustomerServiceLink().isDisplayed()) {
			getNFKSignuppageOptinCustomerServiceLink().waitForPresent();
			getNFKSignuppageOptinCustomerServiceLink().click();
			getNFKSignuppageOptinCustomerServiceLinkNewEmailText().waitForPresent();
			Reporter.logWithScreenShot("Clicked on customer service link", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Customer service link is not present", MessageTypes.Fail);
		}
	}

	public void verifyPrivacyPolicyOnUpdate() {

		getNFKsignuppagepromotionalcodechkbox().waitForPresent();

		Point p1 = getNFKsignuppagepromotionalcodechkbox().getLocation();
		Dimension d1 = getNFKsignuppagepromotionalcodechkbox().getSize();

		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		TouchAction tch = new TouchAction(appiumDriver);

		int startX = p1.getX();
		int startY = p1.getY();
		int pointX = startX + d1.getWidth() / 2;
		int pointY = startY + d1.getHeight() / 2;
		tch.tap(pointX, pointY).perform();

		getNFKSignuppageOptinTitleLbl().waitForPresent();
		if (getNFKSignuppageOptinCustomerServiceLink().isPresent()
				&& getNFKSignuppageOptinCustomerServiceLink().isDisplayed()) {
			getNFKSignuppageOptinCustomerServiceLink().waitForPresent();
			getNFKSignuppageOptinCustomerServiceLink().click();
			getNFKSignuppageOptinCustomerServiceLinkNewEmailText().waitForPresent();
			Reporter.logWithScreenShot("Clicked on customer service link", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Customer service link is not present", MessageTypes.Fail);
		}

	}

	// steveGunther
	public void enterFirstLastName() {
		String fname = "jon" + RandomStringUtils.randomAlphabetic(5);
		String lname = "Snow" + RandomStringUtils.randomAlphabetic(5);
		getNFKsignuppagefirstnametxt().waitForPresent();
		getNFKsignuppagefirstnametxt().sendKeys(fname);
		ConfigurationManager.getBundle().setProperty("register.firstname.key", fname);
		ConfigurationManager.getBundle().setProperty("register.lastname.key", lname);
		getNFKsignuppagelastnametxt().sendKeys(lname);
		// LFSUtilsAndroid.hideKeyboard();
		androidDriver.pressKeyCode(4);
	}

	// Method to select gender and diabetes type
	public void selectGenderAndDiabetesType(String gender, String diabetesType) {
		getNFKsignuppagefirstnametxt().waitForPresent();
		enterFirstLastName();
		selectGender(gender);
		ConfigurationManager.getBundle().setProperty("singupScreen.selected.gender", gender);
		selectDiabetesType(diabetesType);
		ConfigurationManager.getBundle().setProperty("singupScreen.selected.diabetes type", diabetesType);
		Reporter.logWithScreenShot("The user selected the Gender and Diabetes type", MessageTypes.Pass);
	}

	public void selectGender(String option) {
		getNFKsignuppagefirstnametxt().isPresent();
		switch (option) {
		case "MALE":
			getNFKSignupPageGenderMaleRadioBtn().waitForPresent();
			getNFKSignupPageGenderMaleRadioBtn().click();
			break;
		case "FEMALE":
			getNFKSignupPageGenderFemaleRadioBtn().waitForPresent();
			getNFKSignupPageGenderFemaleRadioBtn().click();
			break;

		}
	}

	public void selectDiabetesType(String option) {
		switch (option) {
		case "TYPE 1":
			getNFKSignupPageDiabetesType1RadioBtn().waitForPresent();
			getNFKSignupPageDiabetesType1RadioBtn().click();
			break;
		case "TYPE 2":
			getNFKSignupPageDiabetesType2RadioBtn().waitForPresent();
			getNFKSignupPageDiabetesType2RadioBtn().click();
			break;
		case "GESTATIONAL":
			getNFKSignupPageDiabetesGestationalRadioBtn().waitForPresent();
			getNFKSignupPageDiabetesGestationalRadioBtn().click();
			break;
		}
	}

	public void verifyDiabetesType() {
		getNFKSignupPageDiabetesType1RadioBtn().isEnabled();
		getNFKSignupPageDiabetesType2RadioBtn().isEnabled();
		getNFKSignupPageDiabetesGestationalRadioBtn().isEnabled();
		Reporter.logWithScreenShot(" Diabetes type is enabled", MessageTypes.Pass);

	}

	// Method to verify gender and diabetes selection page
	public void verifyGenderAndDiabetesSelectionPage() {
		String genderDiabetesTypePageTitle = LFSUtilsAndroid.getPropString("onboarding.aboutme.title");
		getNFKSignuppageTimeStaticText(genderDiabetesTypePageTitle).waitForPresent();
		getNFKSignuppageTimeStaticText(genderDiabetesTypePageTitle).verifyPresent("Tell us about yourself");
		String genderDiabetesTypePageHeader = LFSUtilsAndroid.getPropString("onboarding.aboutme.message");
		getNFKSignuppageTimeStaticText(genderDiabetesTypePageHeader)
				.verifyPresent("To complete Sign Up, please tell us your gender and diabetes type.");
		String genderLabel = LFSUtilsAndroid.getPropString("more.aboutme.genderText");
		getNFKSignupPageGenderMaleRadioBtn().verifyPresent("Male");
		getNFKSignupPageGenderFemaleRadioBtn().verifyPresent("Female");
		getNFKSignupPageDiabetesType1RadioBtn().verifyPresent("Type 1");
		getNFKSignupPageDiabetesType2RadioBtn().verifyPresent("Type 2");
		getNFKSignupPageDiabetesGestationalRadioBtn().verifyPresent("Gestational");
		getNFKsignuppagesignupbtn().verifyPresent("Sign Up button");
	}

	// method to click on continue button on sign up second screen
	public void clickOnContinueBtn() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKsignuppagesignupbtn().waitForPresent();
		// JNJUtilsAndroid.swipeWithCoordinates(476, 932, 443, 831, 10);
		getNFKsignuppagesignupbtn().click();
		try {
			getNFKsignuppageimportantmessagetxt().waitForPresent(5000);
			getNFKsignuppageimportantmessageokbtn().click();
		} catch (Exception e) {
		}
		Reporter.logWithScreenShot("Clicked on Continue button", MessageTypes.Pass);
	}

	public void verifyGestationalTypeForMale() {
		getNFKSignupPageDiabetesGestationalRadioBtn().waitForPresent();
		getNFKSignupPageDiabetesGestationalRadioBtn().verifyDisabled("Gestational type is disabled for Male Gender");
		Reporter.logWithScreenShot("Gestational type is disabled for Male gender", MessageTypes.Pass);

	}

	public void verifyUpdateNoticeCheckBox() {
		String checkBoxFlag = getNFKSignuppageUpdatenoticeChckBtn().getAttribute("checked");

		if (checkBoxFlag.equals("false")) {
			Reporter.logWithScreenShot("Update notice check box unchecked", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Update notice check box checked", MessageTypes.Fail);
		}
	}

	public void clickUpdateNoticeCheckBox() {
		String checkBoxFlag = getNFKSignuppageUpdatenoticeChckBtn().getAttribute("checked");

		if (checkBoxFlag.equals("false")) {
			getNFKSignuppageUpdatenoticeChckBtn().click();
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Update Notice check box already checked", MessageTypes.Pass);
		}

	}

	public void clickUpdateNoticeContinueBtn() {
		getNFKSignuppageUpdatenoticeContinueBtn().click();
		LFSUtilsAndroid.waitforLoad();
	}

	// Created by Biswa
	public void setTouchID() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		Boolean sensor = Boolean.valueOf(androidDriver.getCapabilities().getCapability("sensorInstrument").toString());
		Reporter.log("Sensor Instrument capability: " + sensor);
		if (Boolean.TRUE) {
			capabilities.setCapability("sensorInstrument", false);
		} else {
			Reporter.log("Sensor instrumentation is false");
		}

		androidDriver.launchApp();
	}

	public void clinicInfo() {
		getNFKSignuppageClinicInfoBtn().click();
		getNFKSignuppageClinicCloseInfoBtn().verifyPresent();
		Reporter.logWithScreenShot("Clinic Info", MessageTypes.Pass);
		getNFKSignuppageClinicCloseInfoBtn().click();
		getNFKSignuppageClinicInfoBtn().verifyPresent();
	}

	// Method to add office from home screen
	public void addOffice(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();

		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKSignuppageCliniccodeTxt().sendKeys(userBean.getClinicCode());
		androidDriver.pressKeyCode(66); // press done button on keyboard
	}

	public void verifyClinicTermsClinicInfo() {

		MoreMenuPageAndroid moremenu = new MoreMenuPageAndroid();
		LFSUtilsAndroid.waitforLoad();
		Assert.assertEquals(getNFKSignuppageClinicName().getText(), LFSUtilsAndroid.getPropString("office.name"));
		Assert.assertEquals(getNFKSignuppageClinicPhone().getText(), LFSUtilsAndroid.getPropString("office.phone"));
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 1);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 1);
		Reporter.logWithScreenShot("Clinic consent checkbox", MessageTypes.Pass);
		moremenu.getNFKHomepageMoremenuConnectionsOfficeacceptChkbox().click();
		moremenu.getNFKHomepageMoreMenuConnectionsSearchBtn().click();
		LFSUtilsAndroid.pause(100);
		// info of clinic on Signup
		verifyClinicInfoOnSignup();
	}

	public void verifyClinicInfoOnSignup() {
		Assert.assertEquals(getNFKSignuppageClinicInfoName().getText(), LFSUtilsAndroid.getPropString("office.name"));
		Assert.assertEquals(getNFKSignuppageClinicInfoPhone().getText(), LFSUtilsAndroid.getPropString("office.phone"));
		Assert.assertEquals(getNFKSignuppageClinicInfoMsgrequest().getText(),
				LFSUtilsAndroid.getPropString("office.code.request.pending"));
		getNFKSignuppageClinicInfoTikmark().assertPresent("Tik option");
		getNFKSignuppageClinicInfoCloseBtn().assertPresent("Close button");
		Reporter.logWithScreenShot("Verified the Information of Clinic on Signup page", MessageTypes.Pass);

	}

	// verify send button for unfilled first and last and term check box
	public void verifySendButtonEnable(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKSignuppageCliniccodeTxt().sendKeys(userBean.getClinicCode());
		getNFKSignupPageClinicTitleLbl().waitForPresent();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 1);
		if (!getNFKsignuppagelastnametxt().isPresent()) {
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 1);
		}
		getNFKsignuppagefirstnametxt().sendKeys("NFK");
		LFSUtilsAndroid.hideKeyboard();
		getNFKsignuppagelastnametxt().sendKeys("NFK");
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignupPageClinicSendBtn().verifyDisabled("term checkbox not selected, send btn");
		getNFKsignuppagefirstnametxt().clear();
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignupPageClinicConsentChkbox().click();
		getNFKSignupPageClinicSendBtn().verifyDisabled("For emptry first name, send btn");
		getNFKsignuppagefirstnametxt().sendKeys("NFK");
		LFSUtilsAndroid.hideKeyboard();
		getNFKsignuppagelastnametxt().clear();
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignupPageClinicSendBtn().verifyDisabled("For empty Last name, send button");

	}

	public void addOfficeCode(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKSignuppageCliniccodeTxt().sendKeys(userBean.getClinicCode());
		getNFKSignupPageClinicTitleLbl().waitForPresent();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 1);
		if (!getNFKsignuppagelastnametxt().isPresent()) {
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 1);
		}
	}

	public void clickTerm() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 75, 50, 30, 1);
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		Map<String, Object> params1 = new HashMap<>();
		params1.put("label", "Terms of Use");
		Object result1 = driver.executeScript("mobile:button-text:click", params1);
		WebDriverTestCase.verifyTrue(
				getNFKsignuppagetermsofusetxt().getAttribute("text")
						.contains(LFSUtilsAndroid.getPropString("auth.createAccount.privacyPolicy.terms")),
				"Incorrecct terms title", "Correcct Terms title");
		getNFKsignuppagetermsofusetxt().waitForPresent();
		Reporter.logWithScreenShot("Terms of use Page 1 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms of use Page 2 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms of use Page 3 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms of use Page 4 is Displayed", MessageTypes.Pass);
	}

	public void clickprivacy() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 1);
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		Map<String, Object> params1 = new HashMap<>();
		params1.put("label", "Policy");
		Object result1 = driver.executeScript("mobile:button-text:click", params1);
		WebDriverTestCase.verifyTrue(
				getNFKsignuppagetermsofusetxt().getAttribute("text")
						.contains(LFSUtilsAndroid.getPropString("auth.createAccount.privacyPolicy.privacy")),
				"Incorrecct Privecy title", "Correcct Privecy title");
		getNFKsignuppagetermsofusetxt().waitForPresent();
		Reporter.logWithScreenShot("Privacy Policy Page 1 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Privacy Policy Page 2 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Privacy Policy Page 3 is Displayed", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Privacy Policy Page 4 is Displayed", MessageTypes.Pass);
		System.out.println("..............Privacy Policy.............");

	}

	public void verifyNoInternetPopup() {
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("network.error.noNetworkConnection"))
				.verifyPresent("No internet connection popup is displayed");
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("appCommon.ok")).click();
	}

	public QAFWebElement getNFKSignuppageOptinCustomerServiceLinkRedirectsComposeTxt() {
		return NFKSignuppageOptinCustomerServiceLinkRedirectsComposeTxt;
	}

	public QAFWebElement getNFKSignuppageWelcomepageSkipBtn() {
		return NFKSignuppageWelcomepageSkipBtn;
	}

	public QAFWebElement getNFKSignuppageWelcomepageYesBtn() {
		return NFKSignuppageWelcomepageYesBtn;
	}

	public void verifyAppOverview() {
		getNFKsignuppageskipbtn().waitForPresent();
		Reporter.logWithScreenShot("User Successfully Logged in", MessageTypes.Pass);
		getNFKsignuppageskipbtn().click();
		LFSUtilsAndroid.waitforLoad();
		QAFWebElement buttonEle = new QAFExtendedWebElement(String
				.format(ConfigurationManager.getBundle().getString("NFK.signuppage.welcomepage.navigation.btn"), 1));
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("welcome page is displayed", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("welcome page is not displayed", MessageTypes.Fail);
		}
	}

	public void verifyAppOverviewOverlay() {
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("welcome page is  displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.navigation.title")).isPresent()) {
			Reporter.logWithScreenShot("Navigation page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.timeline.title")).isPresent()) {
			Reporter.logWithScreenShot("Timeline page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.logbook.title")).isPresent()) {
			Reporter.logWithScreenShot("Logbook page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.sharing.title")).isPresent()) {
			Reporter.logWithScreenShot("Sharing page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.settings.title")).isPresent()) {
			Reporter.logWithScreenShot("Setting page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.addEvent.title")).isPresent()) {
			Reporter.logWithScreenShot("Add event page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.done.title")).isPresent()) {
			Reporter.logWithScreenShot("Ready to See OneTouch Reveal in Action page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageWelcomepageYesBtn().isPresent()) {
			getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.done.description"))
					.verifyPresent("Access the app overview from help is displayed");
		} else {
			Reporter.logWithScreenShot("Access the app overview from help is not displayed", MessageTypes.Fail);
		}
	}

	public void verifyToAndFroOverview() {
		getNFKsignuppageskipbtn().waitForPresent();
		Reporter.logWithScreenShot("User Successfully Logged in", MessageTypes.Pass);
		getNFKsignuppageskipbtn().click();
		LFSUtilsAndroid.waitforLoad();
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("welcome page is  displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.navigation.title")).isPresent()) {
			Reporter.logWithScreenShot("Navigation page is displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.timeline.title")).isPresent()) {
			Reporter.logWithScreenShot("Timeline page is displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.logbook.title")).isPresent()) {
			Reporter.logWithScreenShot("Logbook page is displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.sharing.title")).isPresent()) {
			Reporter.logWithScreenShot("Sharing page is displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.settings.title")).isPresent()) {
			Reporter.logWithScreenShot("Setting page is displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.addEvent.title")).isPresent()) {
			Reporter.logWithScreenShot("Add event page is displayed with forward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.done.title")).isPresent()) {
			Reporter.logWithScreenShot("Ready to See OneTouch Reveal in Action page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			LFSUtilsAndroid.waitforLoad();
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);

		}
		navigateBackOverviewOverlay();
		getNFKSignuppageWelcomepageSkipBtn().verifyPresent("Welcome Page for a new User is displayed");
		getNFKSignuppageWelcomepageSkipBtn().click();
		getNFKSignuppageWelcomepageYesBtn().verifyPresent("Welcome page Yes button is present");
		getNFKSignuppageWelcomepageYesBtn().click();
	}

	public void navigateBackOverviewOverlay() {
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.addEvent.title")).isPresent()) {
			Reporter.logWithScreenShot("Add event page is displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.settings.title")).isPresent()) {
			Reporter.logWithScreenShot("Setting page is displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.sharing.title")).isPresent()) {
			Reporter.logWithScreenShot("Sharing page is displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.logbook.title")).isPresent()) {
			Reporter.logWithScreenShot("Logbook page is displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.timeline.title")).isPresent()) {
			Reporter.logWithScreenShot("Timeline page is displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.navigation.title")).isPresent()) {
			Reporter.logWithScreenShot("Navigation page is displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("firstUse.welcome.title")).isPresent()) {
			Reporter.logWithScreenShot("welcome page is  displayed with backward navigation", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		}
	}

	public void enterMaxAgeForDOB() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 126;
		int actualYear = currentYear - 125;
		getNFKsignuppagedobtxt().click();
		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear));
		if (getNFKSignupPagePickerYearLbl().getAttribute("text").toString()
				.equalsIgnoreCase(Integer.toString(actualYear))) {
			Reporter.logWithScreenShot("User is not able to enter year beyond" + actualYear, MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is able to enter year beyond " + actualYear, MessageTypes.Fail);

	}

	public void clickonAllowbtnforpermission() {
		System.out.println("Chceking for permission");
		String str = "Allow";
		if (getNFKSignuppageSafetyAllowBtn().isPresent() && str.contains("Allow")) {

			getNFKSignuppageSafetyAllowBtn().click();
		} else {
			Reporter.log("Allow button is not present");
		}

	}

	public void skipTheSensorScreen() {

		// Skip the Pair Sensor screen
		getNFKApplysensorTitle().waitForPresent();
		if (getNFKApplysensorTitle().isPresent()) {
			getNFKApplysensorSkipBtn().click();
			Reporter.logWithScreenShot("The user skips the Sensor Pairing", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Sensor pair screen is not displayed ", MessageTypes.Fail);
		}
	}

	public void fillDependentDetails(String userDetails) {
		System.out.println("The user is on signup deendent screen ");
		getNFKSignupDependentpageTxt().isPresent();
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		String email = "doshaheentt+" + RandomStringUtils.randomAlphabetic(6) + "@gmail.com";

		getNFKSignupDependentpageTxt().assertPresent("Guardian account screen");
		getNFKSignupDependentGuardianFname().assertPresent("Guardian first name");
		getNFKSignupDependentGuardianFname().click();
		getNFKSignupDependentGuardianFname().sendKeys(userBean.getGuardianfname());

		getNFKSignupDependentGuardianLname().assertPresent("Guardian last name");
		getNFKSignupDependentGuardianLname().click();
		getNFKSignupDependentGuardianLname().sendKeys(userBean.getGuardianlname());

		androidDriver.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 2);
//System.out.println(driver.getPageSource());
		getNFKSignupDependentEmailAddressTxt().assertPresent("Email field on Dependent signup screen");
		getNFKSignupDependentEmailAddressTxt().click();
		getNFKSignupDependentEmailAddressTxt().clear();
		getNFKSignupDependentEmailAddressTxt().sendKeys(email);
		getNFKSignupDependentConfemailaddressTxt().assertPresent("Confirm email adress on dependent screen");
		getNFKSignupDependentConfemailaddressTxt().sendKeys(email);

		getNFKSignupDependentPasswordTxt().assertPresent("Password field");
		getNFKSignupDependentPasswordTxt().sendKeys(userBean.getGuardianpassword());
		ConfigurationManager.getBundle().setProperty("password", userBean.getGuardianpassword());
		getNFKSignupDependentConfpasswordTxt().assertPresent("Confirm password field");
		getNFKSignupDependentConfpasswordTxt().sendKeys(userBean.getGuardianconfirmpassword());
		androidDriver.hideKeyboard();
		getNFKSignupDependentCheckAgreementTermBtn().verifyPresent("Terms and privacy policy check box");
		getNFKSignupDependentCheckAgreementTermBtn().click();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 2);
		getNFKSignupDependentCheckPromotionalOffersBtn().verifyPresent("opt in check box");
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Guardian has entered the details on signup page", MessageTypes.Pass);

	}

	public void enterDobFirstAndLastName(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKsignuppagedobtxt().click();
		String dob = userBean.getDependentDOByear();
		String curentyr = getNFKSignupPagePickerYearLbl().getText();

		int yr = Integer.parseInt(curentyr) - Integer.parseInt(dob);
		if (yr < 18 && yr > 2) {
			getNFKSignupPagePickerYearLbl().sendKeys(userBean.getDependentDOByear());
			getNFKSignupPagePickerDateLbl().sendKeys(userBean.getDependentBirthdate());
			getNFKSignuppageDobOkBtn().click();
			Reporter.logWithScreenShot("Guardian selected the DOB for Dependent", MessageTypes.Pass);
		} else {
			Reporter.log("The Dependent age should be in between 2 to 17");
		}
		enterFirstLastName();
		getNFKSignupDependentClinicTxt().verifyPresent("Clinic code field");
		Reporter.logWithScreenShot("Guardian has enetered depedent's details", MessageTypes.Pass);

	}

	public void fillCGMReadings() {
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		String password = (String) ConfigurationManager.getBundle().getProperty("register.password.key");
		ApiMethods apiObj = new ApiMethods();

		int noOfData = 10;
		int noofdays = 90;
		int[] cgmval = new int[] { 66, 68, 100, 102, 108, 202, 204, 206, 208, 210 };
		apiObj.addLoginDetails(email, password, noOfData, noofdays, cgmval);

	}

	// enter name and select DOB for 2-5 yr old child
	public void setchilddob() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 4;
		getNFKsignuppagedobtxt().click();
		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear));
		getNFKSignuppageDobOkBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("User has selected age", MessageTypes.Pass);
		enterFirstLastName();
	}

	// enter name and select DOB for 7-18 yr old kid
	public void setteenagedob() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 8;
		getNFKsignuppagedobtxt().click();
		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear));
		getNFKSignuppageDobOkBtn().click();
		enterFirstLastName();
	}

	public void enterLowDataAPI() {
		ApiMethods apiObj = new ApiMethods();
		int noOfLowData = 31;
		int noofLowdays = 8;
		// 9 days 16 days
		Reporter.logWithScreenShot("No. of data in signup pagee----" + (noOfLowData * noofLowdays), MessageTypes.Pass);
		int[] cgmlowval = new int[] { 75, 76, 79, 80, 82, 83, 85, 88, 89, 105, 110, 111, 125, 126, 128, 64, 63, 62, 61,
				60, 63, 62, 61, 56, 58, 59, 60, 65, 57, 65, 63 };
		apiObj.addLoginDetailsLow("mrch315@mailinator.com", "test1234", noOfLowData, noofLowdays, cgmlowval);

	}

	public void verifyGuardianSignupPage() {
		getNFKSignupDependentpageTxt().assertPresent("Create guardian Account Title");
		getNFKSignupDependentGuardianFname().assertPresent("Guardian First Name");
		getNFKSignupDependentGuardianLname().assertPresent("Guardian Last Name");
		getNFKSignupDependentEmailAddressTxt().isPresent();
		getNFKSignupDependentConfemailaddressTxt().isPresent();
		getNFKSignupDependentPasswordTxt().assertPresent("Password");
		getNFKSignupDependentConfpasswordTxt().assertPresent("Confirm Password");
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 2);
		getNFKSignupDependentCheckAgreementTermBtn().assertPresent("Aggrement Check box");
		getNFKSignupDependentCheckPromotionalOffersBtn().assertPresent("promotional offers checkbox");
		Reporter.logWithScreenShot("Guardian Signup Page verified", MessageTypes.Pass);

	}

	public void clickOnLoginLink() {
		CountrySelectionPageAndroid country = new CountrySelectionPageAndroid();
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsAndroid.clickBackButton();
		if (country.getNFKDecisionPageYesBtn().isPresent())
			Reporter.logWithScreenShot("User has naviagted to Decision screen", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("User has not naviagted to Decision screen", MessageTypes.Fail);
	}

	public void verifySignupMyselfPage() {
		getNFKsignuppageemailtxt().sendKeys("stet.com");
		getNFKsignuppageconfirmemailtxt().click();
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Email error field verified", MessageTypes.Pass);
			// System.out.println("Pass Email 1");
			getNFKValidationErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppageconfirmemailtxt().sendKeys("stet.com");
		getNFKsignuppagepasswordtxt().click();
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Email error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();
			// System.out.println("Pass Email 2");
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppageconfirmemailtxt().sendKeys("acb@gmail.com");
		getNFKsignuppagepasswordtxt().click();
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.emailValidation.emailsMustMatch"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Email error field verified", MessageTypes.Pass);
			getNFKsignuppageemailtxt().clear();
			getNFKValidationErrorIcon().click();
			// System.out.println("Compare Email ");
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagepasswordtxt().sendKeys(".<+=");
		getNFKsignuppageconfirmpasswordtxt().click();
		LFSUtilsAndroid.pause(500);
		System.out.println(getNFKEmailValidationErrorMsg().getText());
		if (getNFKEmailValidationErrorMsg().getText().contains("Passwords must be between")) {
			Reporter.logWithScreenShot("Password error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();
			// System.out.println("Pass password 1");
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}

		getNFKsignuppageconfirmpasswordtxt().sendKeys(".<+=>");
		LFSUtilsAndroid.hideKeyboard();
		getNFKSignuppageCliniccodeTxt().click();
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.passwordValidation.passwordsMustMatch"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Confirm password error field verified", MessageTypes.Pass);
			// System.out.println("Pass Password 2");
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKSignuppageCliniccodeTxt().click();
		getNFKSignuppageCliniccodeTxt().sendKeys("ttccxx");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.waitforLoad();
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("office.code.not.found"))
				.verifyPresent("Incorrect clinic code message");
		Reporter.logWithScreenShot("Incorrect Clinic Message", MessageTypes.Pass);

		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 18;
		int requiredYear1 = currentYear - 17;
		int requiredYear2 = currentYear - 2;
		getNFKsignuppagedobtxt().click();
		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear1));
		getNFKSignuppageDobOkBtn().click();
		if (getNFKSignuppageAgeRestrictionPopup().isDisplayed()
				&& getNFKSignuppageAgeRestrictionPopupCancelButton().isDisplayed()) {
			Reporter.logWithScreenShot("Dob verified", MessageTypes.Pass);
			getNFKSignuppageAgeRestrictionPopupCancelButton().click();
			getNFKValidationErrorIcon().click();
			// System.out.println("Pass DOB 1");
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}

		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear2));
		getNFKSignuppageDobOkBtn().click();
		if (getNFKSignuppageAgeRestrictionPopup().isDisplayed()
				&& getNFKSignuppageAgeRestrictionPopupCancelButton().isDisplayed()) {
			Reporter.logWithScreenShot("Dob verified", MessageTypes.Pass);
			getNFKSignuppageAgeRestrictionPopupCancelButton().click();
			getNFKValidationErrorIcon().click();
			// System.out.println("Pass DOB 2");
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}

		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear));
		getNFKSignuppageDobOkBtn().click();
	}

	public void clickonBackbutton() {
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageBackBtn().isPresent()) {
			getNFKSignuppageBackBtn().click();
			Reporter.logWithScreenShot("Clicked on back button", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Failed Clicked on back button", MessageTypes.Fail);
		}

	}

	public void verifySignupMyselfSecondPage() {
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "first Name";
		String typeName1 = RandomStringUtils.randomAlphanumeric(76) + "last Name";
		getNFKsignuppagefirstnametxt().sendKeys(".>+:");
		getNFKsignuppagelastnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}

		getNFKsignuppagelastnametxt().sendKeys(".>+:");
		getNFKsignuppagefirstnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagefirstnametxt().sendKeys(typeName);
		getNFKsignuppagelastnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagelastnametxt().sendKeys(typeName1);
		getNFKsignuppagefirstnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		clickonBackbutton();
		clickonBackbutton();
	}

	public void verifySignupDependentPage() {
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "first Name";
		String typeName1 = RandomStringUtils.randomAlphanumeric(76) + "last Name";
		getNFKsignuppagefirstnametxt().sendKeys("< > \" = +");
		getNFKsignuppagelastnametxt().click();
		LFSUtilsAndroid.pause(500);
		if (getNFKEmailValidationErrorMsg().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagelastnametxt().sendKeys("< > \" = +");
		getNFKsignuppageemailtxt().click();
		LFSUtilsAndroid.pause(500);
		if (getNFKEmailValidationErrorMsg().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("LastName error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagefirstnametxt().sendKeys(typeName);
		getNFKsignuppagelastnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagelastnametxt().sendKeys(typeName1);
		getNFKsignuppagefirstnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		LFSUtilsAndroid.hideKeyboard();

		getNFKsignuppageemailtxt().sendKeys("stet.com");
		getNFKsignuppageconfirmemailtxt().click();
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Email error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppageconfirmemailtxt().sendKeys("stet.com");
		LFSUtilsAndroid.hideKeyboard();
		getNFKsignuppagepasswordtxt().click();
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Email error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagepasswordtxt().sendKeys(".<+=");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKsignuppageconfirmpasswordtxt().click();
		LFSUtilsAndroid.pause(500);
		if (getNFKEmailValidationErrorMsg().getText().contains("Passwords must be between")) {
			Reporter.logWithScreenShot("Password error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppageconfirmpasswordtxt().sendKeys(".<+=>");
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.pause(500);
		if (getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.passwordValidation.passwordsMustMatch"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Confirm password error field verified", MessageTypes.Pass);
			// System.out.println("Pass password 2");
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
	}

	public void verifySignupDependentSecondPage() {
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "first Name";
		String typeName1 = RandomStringUtils.randomAlphanumeric(76) + "last Name";
		getNFKsignuppagefirstnametxt().sendKeys(".>+:");
		getNFKsignuppagelastnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();
		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagelastnametxt().sendKeys(".>+:");
		getNFKsignuppagefirstnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagefirstnametxt().sendKeys(typeName);
		getNFKsignuppagelastnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("First name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		getNFKsignuppagelastnametxt().sendKeys(typeName1);
		getNFKsignuppagefirstnametxt().click();
		if (getNFKEmailValidationErrorMsg().getText().contains("Last name must be between")) {
			Reporter.logWithScreenShot("Firstname error field verified", MessageTypes.Pass);
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int requiredYear = currentYear - 2;
		int requiredYear1 = currentYear - 18;
		getNFKsignuppagedobtxt().click();
		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear1));
		getNFKSignuppageDobOkBtn().click();
		if (getNFKSignuppageAgeRestrictionPopup().isDisplayed()
				&& getNFKsignuppageimportantmessageokbtn().isDisplayed()) {
			Reporter.logWithScreenShot("Dob verified", MessageTypes.Pass);
			getNFKsignuppageimportantmessageokbtn().click();
			getNFKValidationErrorIcon().click();

		} else {
			Reporter.logWithScreenShot("Validation Failed", MessageTypes.Fail);
		}
		LFSUtilsAndroid.selectPicker(getNFKSignupPagePickerYearLbl(), (requiredYear));
		getNFKSignuppageDobOkBtn().click();
	}

	public void fillexisitingUser(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {
			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		getNFKsignuppagedobtxt().click();
		selectBirthDate(userBean);
		getNFKsignuppageemailtxt().clear();
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppageconfirmemailtxt().clear();
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		getNFKsignuppagepasswordtxt().waitForVisible();
		getNFKsignuppagepasswordtxt().clear();
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		androidDriver.pressKeyCode(4);
		getNFKsignuppageconfirmpasswordtxt().verifyPresent("The confirm password field is present");
		getNFKsignuppageconfirmpasswordtxt().clear();
		getNFKsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("The user filled sign up details", MessageTypes.Pass);
		androidDriver.pressKeyCode(4);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKsignuppagetermofservicecheckbox().waitForPresent();
		getNFKsignuppagetermofservicecheckbox().click();
	}

	public void verifyEmailExitPopup() {
		getNFKSignuppageEmailexistPpopup().isDisplayed();
		getNFKSignuppageEmailexistPpopup().assertPresent("Email already exist popup displayed");
		getNFKsignuppageimportantmessageokbtn().isDisplayed();
		Reporter.logWithScreenShot("Email Already Exist popup is displayed");
		getNFKsignuppageimportantmessageokbtn().click();
		LFSUtilsAndroid.clickBackButton();
	}

	public void fillexisitingGuardianUser(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}

		getNFKSignupDependentpageTxt().assertPresent("Guardian account screen");
		getNFKSignupDependentGuardianFname().assertPresent("Guardian first name");
		getNFKSignupDependentGuardianFname().click();
		getNFKSignupDependentGuardianFname().sendKeys(userBean.getGuardianfname());
		getNFKSignupDependentGuardianLname().assertPresent("Guardian last name");
		getNFKSignupDependentGuardianLname().click();
		getNFKSignupDependentGuardianLname().sendKeys(userBean.getGuardianlname());
		androidDriver.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 2);
//		getNFKSignupDependentEmailAddressTxt().assertPresent("Email field on Dependent signup screen");
//		getNFKSignupDependentEmailAddressTxt().clear();
//		getNFKSignupDependentEmailAddressTxt().click();
//		getNFKSignupDependentEmailAddressTxt().sendKeys(email);
		getNFKsignuppageemailtxt().assertPresent("Email field on Dependent signup screen");
		getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getNFKSignupDependentConfemailaddressTxt().assertPresent("Confirm email adress on dependent screen");
		getNFKSignupDependentConfemailaddressTxt().sendKeys(userBean.getEmailID());
		getNFKSignupDependentPasswordTxt().assertPresent("Password field");
		getNFKSignupDependentPasswordTxt().sendKeys(userBean.getGuardianpassword());
		getNFKSignupDependentConfpasswordTxt().assertPresent("Confirm password field");
		getNFKSignupDependentConfpasswordTxt().sendKeys(userBean.getGuardianconfirmpassword());
		androidDriver.hideKeyboard();
		getNFKSignupDependentCheckAgreementTermBtn().verifyPresent("Terms and privacy policy check box");
		getNFKSignupDependentCheckAgreementTermBtn().click();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 2);
		getNFKSignupDependentCheckPromotionalOffersBtn().verifyPresent("opt in check box");
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Guardian has entered the details on signup page", MessageTypes.Pass);
	}

	public void skipEmancipationScreen() {
		getNFKSignuppageSensorSkipBtn().click();
	}

	public void verifyEmancipationScreen() {
		getNFKSignupEmancipationTitle().waitForPresent();
		getNFKSignupEmancipationTitle().verifyPresent("Emancipation Title is present");
		getNFKsignuppageemailtxt().verifyPresent("Email-id Field Present");
		getNFKsignuppageconfirmemailtxt().verifyPresent("Confirm Email-id Field Present");
		getNFKsignuppagepasswordtxt().verifyPresent("Password Field is Present");
		getNFKsignuppageconfirmpasswordtxt().verifyPresent("confirm Password Field is Present");
		getNFKsignuppagetermofservicecheckbox().verifyPresent("Terms and Agreement checkbox present");
		getNFKsignuppagepromotionalcodechkbox().verifyPresent("promotional Offers Checkbox is present");
		Reporter.logWithScreenShot("Emancipation Screen verified");
	}

	public void verifyInvalidPasswordError() {
		try {
			if (getNFKEmailValidationErrorMsg().getText()
					.equals(LFSUtilsAndroid.getPropString("auth.passwordValidation.forbiddenChar"))) {
				Reporter.logWithScreenShot("Sucessfully verified password field error message. ", MessageTypes.Pass);
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Fail to verify invalid password error message " + MessageTypes.Fail);
		}
	}

	public void validateEmancipationField(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		userBean.fillFromConfig((String) userDetails);
		switch (userDetails) {
		case "fieldValidations.emancipationEmail":
			try {
				String charArray[] = userBean.getInvalidFormat().split(",");
				for (int i = 0; i < charArray.length; i++) {
					getNFKsignuppageemailtxt().sendKeys(charArray[i]);
					Reporter.logWithScreenShot("Successfully entered the invalid email format:   " + charArray[i],
							MessageTypes.Pass);
					getNFKsignuppageconfirmemailtxt().click();
					getNFKSignuppageTimeStaticText(
							LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
									.verifyPresent("Invalid Email Error displayed");
					getNFKValidationErrorIcon().click();
					getNFKsignuppageemailtxt().click();
					getNFKsignuppageconfirmemailtxt().clear();
					getNFKsignuppageemailtxt().clear();
				}
				Reporter.logWithScreenShot("Successfully verified email field with inavlid email format",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify email field", MessageTypes.Fail);
			}
			try {
				getNFKsignuppageemailtxt().sendKeys(userBean.getMinLengthValidation());
				Reporter.logWithScreenShot("Successfully entered email with minimum characters", MessageTypes.Pass);
				getNFKsignuppageconfirmemailtxt().click();
				getNFKSignuppageTimeStaticText(
						LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
								.verifyPresent("Invalid Email Error displayed");
				getNFKValidationErrorIcon().click();
				getNFKsignuppageemailtxt().click();
				getNFKsignuppageemailtxt().clear();

				getNFKsignuppageemailtxt().sendKeys(RandomStringUtils.randomAlphanumeric(125) + "@gmail.com");
				Reporter.logWithScreenShot("Successfully entered email with maximum characters ", MessageTypes.Pass);
				getNFKsignuppageconfirmemailtxt().click();
				getNFKSignuppageTimeStaticText(
						LFSUtilsAndroid.getPropString("auth.emailValidation.emailNotValidFormat"))
								.verifyPresent("Invalid Email Error displayed");
				getNFKValidationErrorIcon().click();
				getNFKsignuppageemailtxt().clear();
				Reporter.logWithScreenShot("Successfully verified email field with minimum and maximum characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify email field", MessageTypes.Fail);
			}

			try {
				getNFKsignuppageemailtxt().sendKeys(userBean.getEmailID());
				getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getConfirmEmail());
				getNFKsignuppagepasswordtxt().click();
				getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("auth.emailValidation.emailsMustMatch"))
						.verifyPresent("Email NOt Match Error displayed");

			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify email field", MessageTypes.Fail);
			}
			clickonBackbutton();
			break;

		case "fieldValidations.emancipationPWD":
			try {
				String charArray[] = userBean.getNotAllowedCharacters().split(",");
				for (int i = 0; i < charArray.length; i++) {
					getNFKsignuppagepasswordtxt().sendKeys(charArray[i]);
					Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
					getNFKsignuppageconfirmpasswordtxt().click();
					verifyInvalidPasswordError();
					getNFKValidationErrorIcon().click();
				}
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			try {
				String charArray[] = userBean.getInvalidFormat().split(",");
				for (int i = 0; i < charArray.length; i++) {
					getNFKsignuppagepasswordtxt().sendKeys(charArray[i]);
					Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
					getNFKsignuppageconfirmpasswordtxt().click();
					verifyInvalidPasswordError();
					getNFKValidationErrorIcon().click();
				}
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			try {
				getNFKsignuppagepasswordtxt().sendKeys(userBean.getMinLengthValidation());
				Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
				getNFKsignuppageconfirmpasswordtxt().click();
				verifyInvalidPasswordError();
				getNFKValidationErrorIcon().click();
				Reporter.logWithScreenShot("Successfully verified password field with not allowed characters",
						MessageTypes.Pass);
			} catch (Exception e) {
				Reporter.logWithScreenShot("Fail to verify password field", MessageTypes.Fail);
			}
			try {
				getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
				getNFKsignuppageconfirmpasswordtxt().sendKeys(userBean.getConfirmPassword());
				Reporter.logWithScreenShot("Successfully Entered the invalid character:", MessageTypes.Pass);
				getNFKsignuppageemailtxt().click();
				getNFKSignuppageTimeStaticText(
						LFSUtilsAndroid.getPropString("auth.passwordValidation.passwordsMustMatch"))
								.verifyPresent("Password NOt Match Error displayed");
				getNFKValidationErrorIcon().click();
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
		getNFKsignuppageemailtxt().verifyPresent("Email id is present");
		getNFKsignuppageemailtxt().sendKeys(userBean.getExistingEmail());
		getNFKsignuppageconfirmemailtxt().sendKeys(userBean.getExistingEmail());
		getNFKsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		getNFKsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		androidDriver.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 20, 2);
		getNFKsignuppagetermofservicecheckbox().click();
		// getNFKiosSignupPageEmancipationMarketingAgreement().click();
		getNFKsignuppagecontinuebuttonbtn().waitForEnabled();
		getNFKsignuppagecontinuebuttonbtn().click();
		Reporter.logWithScreenShot("Emancipation screen is Verified");
		getNFKSignuppageEmailexistPpopup().isDisplayed();
		getNFKSignuppageEmailexistPpopup().assertPresent("Email already exist popup displayed");
		getNFKsignuppageimportantmessageokbtn().isDisplayed();
		Reporter.logWithScreenShot("Email Already Exist popup is displayed");
		getNFKsignuppageimportantmessageokbtn().click();
	}

	// Emulator automation

	public void safetyOnboardingScreen() {
		getNFKSignuppageTimeStaticText(LFSUtilsAndroid.getPropString("safetyOnboarding.tutorial.first"))
				.waitForPresent();
		try {
			if (getNFKSignuppageTimeStaticText(
					ConfigurationManager.getBundle().getString("safetyOnboarding.tutorial.first")).isDisplayed()) {

				for (int i = 1; i <= 10; i++) {
					Reporter.logWithScreenShot("Safety Onboarding screen " + i, MessageTypes.Pass);
					if (getNFKSignuppageSafetyIunstdCheckBox().isPresent()) {
						getNFKSignuppageSafetyIunstdCheckBox().click();
					} else  {
						getNFKsignuppagesafetydonebtn().click();
					}
				}
			}
			setSettingsDND();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FindBy(locator = "NFK.sensorpairpage.DND.Cancel")
	private QAFWebElement NFKSensorpairPageDNDCancel;

	public QAFWebElement getNFKSensorpairPageDNDCancel() {
		return NFKSensorpairPageDNDCancel;
	}


	@FindBy(locator = "NFK.sensorpairpage.allow")
	private QAFWebElement NFKSensorpairPageAllow;

	public QAFWebElement getNFKSensorpairPageAllow() {
		return NFKSensorpairPageAllow;
	}
	
	private void setSettingsDND() {
		getNFKSignuppageSafetySettingsBtn().isPresent();
		getNFKSignuppageSafetySettingsBtn().click();
		try {
			LFSUtilsAndroid.waitforLoad();
		if(driver.findElement(By.xpath("//*[@text='OneTouch® 24/7 CGM']")).isPresent()) {
			driver.findElement(By.xpath("//*[@text='OneTouch® 24/7 CGM']")).click();
			getNFKSensorpairPageAllow().click();
			LFSUtilsAndroid.waitforLoad();	
		}
		else {
			findAppname("OneTouch® 24/7 CGM");
			LFSUtilsAndroid.clickWithText("OneTouch® 24/7 CGM");
			LFSUtilsAndroid.waitforLoad();	
		}
		//for devices in which toggle button available in next screen
//			if (getNFKDeviceSettingSwitchBtn().isPresent()) {
//				LFSUtilsAndroid.waitforLoad();
//				getNFKDeviceSettingSwitchBtn().click();
//				getNFKDeviceSettingAllowBtn().click();
//				LFSUtilsAndroid.clickBackButton();
//			} else {
//				LFSUtilsAndroid.waitforLoad();
//				getNFKDeviceSettingAllowBtn().click();
//			}
		LFSUtilsAndroid.clickBackButton();

		} catch (Exception e) {
			getNFKDeviceSettingSwitchBtn().isPresent();
			getNFKDeviceSettingSwitchBtn().click();
			getNFKDeviceSettingAllowBtn().isPresent();
			getNFKDeviceSettingAllowBtn().click();
			LFSUtilsAndroid.clickBackButton();
			LFSUtilsAndroid.clickBackButton();

		}
		
	}
	
	public void findAppname(String text) {
	    boolean flag=true;
		    int count=1;
		    while(flag){
		        try {
		        	 Map<String, Object> params = new HashMap<>();
		        	 params.put("content",text);
		        	 String res= (String)driver.executeScript("mobile:touch:swipe",params);
		        	 if(res.equals("true")) {
		        		 flag=false;
		        		 break;
		        	 }
		        	 else throw new Exception();
		        }
		        catch(Exception NoSuchElementException) {
		            count=count+1;
		            Map<String, Object> params = new HashMap<>();
		            params.put("start","40%,90%");
		            params.put("end","40%,20%");
		            params.put("duration","2");
		            Object res= driver.executeScript("mobile:touch:swipe",params);
		        if(count==5)
		        {
		            break;
		        }
		        }
		    }
		}

}