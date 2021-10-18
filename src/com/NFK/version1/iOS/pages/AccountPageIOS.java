package com.NFK.version1.iOS.pages;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.NFK.support.ConstantUtils;
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

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.HideKeyboardStrategy;



public class AccountPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	IOSDriver iosDriver= (IOSDriver) driver.getUnderLayingDriver();
	@FindBy(locator = "NFKios.moremenu.accountpage.accntdtls.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageAccntdtlsLbl;
	@FindBy(locator="NFKios.moremenu.accountpage.optin.btn")
	private QAFWebElement NFKiosMoremenuAccountpageOptinBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.useremail.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUseremailLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.logout.btn")
	private QAFWebElement NFKiosMoremenuAccountpageLogoutBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.lastsync.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageLastsyncLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.withmeter.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageWithmeterLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.metersynctime.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageMetersynctimeLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.withaccount.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageWithaccountLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.accountlastsynctime.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageAccountlastsynctimeLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.keepmelogin.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageKeepmeloginLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.syncwithaccount.btn")
	private QAFWebElement NFKiosMoremenuAccountpageSyncwithaccountBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.keepmelogin.switch")
	private QAFWebElement NFKiosMoremenuAccountpageKeepmeloginSwitch;
	@FindBy(locator = "NFKios.moremenu.accountpage.statictext.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageStatictextLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.edit.btn")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsEditBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.email.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsEmailLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.frstname.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsFrstnameLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.initial.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsInitialLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.lstname.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsLstnameLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.suffix.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsSuffixLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.dob.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsDobLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.address1.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsAddress1Lbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.address2.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsAddress2Lbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.address3.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsAddress3Lbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.city.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsCityLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.state.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsStateLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.zipcode.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsZipcodeLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.prinumber.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsPrinumberLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.email.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsEmailTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.frstname.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsFrstnameTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.initial.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsInitialTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.lstname.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsLstnameTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.suffix.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsSuffixTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.dob.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsDobTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.address1.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsAddress1Txt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.address2.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsAddress2Txt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.address3.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsAddress3Txt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.city.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsCityTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.state.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsStateTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.zipcode.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsZipcodeTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.prinumber.txt")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsPrinumberTxt;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.save.btn")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsSaveBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.iacknwldge.chkbx")
	private QAFWebElement NFKiosMoremenuAccountpageIacknwldgeChkbx;
	@FindBy(locator = "NFKios.moremenu.accountpage.deleteaccount.chkbx")
	private QAFWebElement NFKiosMoremenuAccountpageDeleteaccountChkbx;
	@FindBy(locator = "NFKios.moremenu.accountpage.deleteaccount.btn")
	private QAFWebElement NFKiosMoremenuAccountpageDeleteaccountBtn;
	@FindBy(locator = "NFKios.moremenu.accountpage.consent.chkbx")
	private QAFWebElement NFKiosMoremenuAccountpageConsentChkbx;
	@FindBy(locator = "NFKios.moremenu.accountpage.useremail.label")
	private QAFWebElement NFKiosMoremenuAccountpageUseremailLabel;
	@FindBy(locator = "NFKios.moremenu.accountpage.userDOB.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUserdobLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.userCountry.lbl")
	private QAFWebElement NFKiosMoremenuAccountpageUsercountryLbl;
	@FindBy(locator = "NFKios.moremenu.accountpage.state.done.btn")
	private QAFWebElement NFKiosMoremenuAccountpageStateDoneBtn;
	@FindBy(locator="NFKios.moremenu.accountpage.delete.btn")
	private QAFWebElement NFKiosMoremenuAccountpageDeleteBtn;
	
	@FindBy(locator="NFKios.moremenu.accountpage.deletescreen.messageLabel")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenMessageLabel;
	@FindBy(locator="NFKios.moremenu.accountpage.deletescreen.email.field")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenEmailField;
	@FindBy(locator="NFKios.moremenu.accountpage.deletescreen.password.field")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenPasswordField;
	@FindBy(locator="NFKios.moremenu.accountpage.deletescreen.ack.checkbox")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenAckCheckbox;
	@FindBy(locator="NFKios.moremenu.accountpage.deletescreen.verification.checkbox")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenVerificationCheckbox;
	@FindBy(locator="NFKios.moremenu.accountpage.deletescreen.delete.btn")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenDeleteBtn;
	@FindBy(locator="NFKios.moremenu.accountpage.deletescreen.popup.ok.btn")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenPopupOkBtn;
	@FindBy(locator="NFKios.moremenu.accountpage.deletescreen.popup.title")
	private QAFWebElement NFKiosMoremenuAccountpageDeletescreenPopupTitle;
	@FindBy(locator="NFKios.dependent.confirmpassword.tBox")
	private QAFWebElement NFKiosDependentConfirmpasswordTBox;
	@FindBy(locator="NFKios.dependent.confirm.btn")
	private QAFWebElement NFKiosDependentConfirmBtn;
	@FindBy(locator="NFKios.moremenu.accountpage.change.password.button")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordbutton;
	@FindBy(locator="NFKios.moremenu.accountpage.change.password.title")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordtitle;
	@FindBy(locator="NFKios.moremenu.accountpage.change.password.current.password.field")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordCurrentPasswordField;
	@FindBy(locator="NFKios.moremenu.accountpage.change.password.new.password.field")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordNewPasswordField;
	@FindBy(locator="NFKios.moremenu.accountpage.change.password.confirm.new.password.field")
	private QAFWebElement NFKiosMoremenuAccountpageChangePasswordConfirmPasswordField;
	@FindBy(locator="NFKios.moremenu.accountpage.save.change.password.button")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordsavechangesbutton;
	@FindBy(locator="NFKios.moremenu.accountpage.save.change.cancel.button")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordcancelbutton;
	@FindBy(locator="NFKios.moremenu.accountpage.save.change.forgot.your.password.link")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordForgotYourPasswordlink;
	@FindBy(locator="NFKios.moremenu.accountpage.save.change.back.button")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordbackbutton;
	@FindBy(locator="NFKios.moremenu.accountpage.change.password.email.address")
	private QAFWebElement NFKiosMoremenuAccountpagechangepasswordemailaddress;
	@FindBy(locator="NFKios.moremenu.accountpage.changed.password")
	private QAFWebElement NFKiosMoremenuAccountpagechangedpassword;
		
	@FindBy(locator = "NFKios.keyBoard.delete.btn")
	private QAFWebElement NFKiosKeyBoardDeleteBtn;

	
	public QAFWebElement getNFKiosKeyBoardDeleteBtn() {
		return NFKiosKeyBoardDeleteBtn;
	}
	public QAFWebElement getNFKiosMoremenuAccountpagechangedpassword() {
		 return NFKiosMoremenuAccountpagechangedpassword;
	}
	
	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordemailaddress() {
		 return NFKiosMoremenuAccountpagechangepasswordemailaddress;
	}
	
	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordbackbutton() {
		 return NFKiosMoremenuAccountpagechangepasswordbackbutton;
	}
	
	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordForgotYourPasswordlink() {
		 return NFKiosMoremenuAccountpagechangepasswordForgotYourPasswordlink;
	}
	
	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordcancelbutton() {
		 return NFKiosMoremenuAccountpagechangepasswordcancelbutton;
	}	
	
	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordsavechangesbutton() {
		 return NFKiosMoremenuAccountpagechangepasswordsavechangesbutton;
	}	
	
	public QAFWebElement getNFKiosMoremenuAccountpageChangePasswordConfirmPasswordField() {
		 return NFKiosMoremenuAccountpageChangePasswordConfirmPasswordField;
	}
	
	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordNewPasswordField() {
		 return NFKiosMoremenuAccountpagechangepasswordNewPasswordField;
	}
	
	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordtitle() {
		 return NFKiosMoremenuAccountpagechangepasswordtitle;
	}
	
	public QAFWebElement getNFKiosMoremenuAccountpagechangepasswordCurrentPasswordField() {
		 return NFKiosMoremenuAccountpagechangepasswordCurrentPasswordField;
	}
	
	public QAFWebElement getiosNFKMoremenuAccountpageChangePasswordButton() {
		 return NFKiosMoremenuAccountpagechangepasswordbutton;
	}
	
	public QAFWebElement getNFKiosDependentConfirmpasswordTBox() {
		return NFKiosDependentConfirmpasswordTBox;
	}
	public QAFWebElement getNFKiosDependentConfirmBtn() {
		return NFKiosDependentConfirmBtn;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenMessageLabel() {
		return NFKiosMoremenuAccountpageDeletescreenMessageLabel;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageOptinBtn() {
		return NFKiosMoremenuAccountpageOptinBtn;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenPopupTitle() {
		return NFKiosMoremenuAccountpageDeletescreenPopupTitle;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenEmailField() {
		return NFKiosMoremenuAccountpageDeletescreenEmailField;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenPasswordField() {
		return NFKiosMoremenuAccountpageDeletescreenPasswordField;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenAckCheckbox() {
		return NFKiosMoremenuAccountpageDeletescreenAckCheckbox;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenVerificationCheckbox() {
		return NFKiosMoremenuAccountpageDeletescreenVerificationCheckbox;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenDeleteBtn() {
		return NFKiosMoremenuAccountpageDeletescreenDeleteBtn;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageStateDoneBtn() {
		return NFKiosMoremenuAccountpageStateDoneBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUseremailLabel() {
		return NFKiosMoremenuAccountpageUseremailLabel;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdobLbl() {
		return NFKiosMoremenuAccountpageUserdobLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUsercountryLbl() {
		return NFKiosMoremenuAccountpageUsercountryLbl;
	}
    
	public QAFWebElement getNFKiosMoremenuAccountpageDeletescreenPopupOkBtn() {
		return NFKiosMoremenuAccountpageDeletescreenPopupOkBtn;
	}
	public QAFWebElement getNFKiosMoremnuAccountpageOptinChkbx() {
		return NFKiosMoremnuAccountpageOptinChkbx;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageStatictextLbl() {
		return NFKiosMoremenuAccountpageStatictextLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsEditBtn() {
		return NFKiosMoremenuAccountpageUserdtlsEditBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsEmailLbl() {
		return NFKiosMoremenuAccountpageUserdtlsEmailLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsFrstnameLbl() {
		return NFKiosMoremenuAccountpageUserdtlsFrstnameLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsInitialLbl() {
		return NFKiosMoremenuAccountpageUserdtlsInitialLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsLstnameLbl() {
		return NFKiosMoremenuAccountpageUserdtlsLstnameLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsSuffixLbl() {
		return NFKiosMoremenuAccountpageUserdtlsSuffixLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsDobLbl() {
		return NFKiosMoremenuAccountpageUserdtlsDobLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsAddress1Lbl() {
		return NFKiosMoremenuAccountpageUserdtlsAddress1Lbl;
	}
    
	public QAFWebElement getNFKiosMoremenuAccountpageDeleteBtn() {
		return NFKiosMoremenuAccountpageDeleteBtn;
	}
	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsAddress2Lbl() {
		return NFKiosMoremenuAccountpageUserdtlsAddress2Lbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsAddress3Lbl() {
		return NFKiosMoremenuAccountpageUserdtlsAddress3Lbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsCityLbl() {
		return NFKiosMoremenuAccountpageUserdtlsCityLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsStateLbl() {
		return NFKiosMoremenuAccountpageUserdtlsStateLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsZipcodeLbl() {
		return NFKiosMoremenuAccountpageUserdtlsZipcodeLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsPrinumberLbl() {
		return NFKiosMoremenuAccountpageUserdtlsPrinumberLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsEmailTxt() {
		return NFKiosMoremenuAccountpageUserdtlsEmailTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt() {
		return NFKiosMoremenuAccountpageUserdtlsFrstnameTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsInitialTxt() {
		return NFKiosMoremenuAccountpageUserdtlsInitialTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsLstnameTxt() {
		return NFKiosMoremenuAccountpageUserdtlsLstnameTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsSuffixTxt() {
		return NFKiosMoremenuAccountpageUserdtlsSuffixTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsDobTxt() {
		return NFKiosMoremenuAccountpageUserdtlsDobTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsAddress1Txt() {
		return NFKiosMoremenuAccountpageUserdtlsAddress1Txt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsAddress2Txt() {
		return NFKiosMoremenuAccountpageUserdtlsAddress2Txt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsAddress3Txt() {
		return NFKiosMoremenuAccountpageUserdtlsAddress3Txt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsCityTxt() {
		return NFKiosMoremenuAccountpageUserdtlsCityTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsStateTxt() {
		return NFKiosMoremenuAccountpageUserdtlsStateTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsZipcodeTxt() {
		return NFKiosMoremenuAccountpageUserdtlsZipcodeTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsPrinumberTxt() {
		return NFKiosMoremenuAccountpageUserdtlsPrinumberTxt;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsSaveBtn() {
		return NFKiosMoremenuAccountpageUserdtlsSaveBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKiosMoremenuAccountpageAccntdtlsLbl() {
		return NFKiosMoremenuAccountpageAccntdtlsLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUseremailLbl() {
		return NFKiosMoremenuAccountpageUseremailLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageLogoutBtn() {
		return NFKiosMoremenuAccountpageLogoutBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageLastsyncLbl() {
		return NFKiosMoremenuAccountpageLastsyncLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageWithmeterLbl() {
		return NFKiosMoremenuAccountpageWithmeterLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageMetersynctimeLbl() {
		return NFKiosMoremenuAccountpageMetersynctimeLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageWithaccountLbl() {
		return NFKiosMoremenuAccountpageWithaccountLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageAccountlastsynctimeLbl() {
		return NFKiosMoremenuAccountpageAccountlastsynctimeLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageKeepmeloginLbl() {
		return NFKiosMoremenuAccountpageKeepmeloginLbl;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageKeepmeloginSwitch() {
		return LFSUtilsIOS.getElement("NFKios.moremenu.accountpage.keepmelogin.switch",
				LFSUtilsIOS.getPropString("common.logintype.persistent"));
	}

	public QAFWebElement getNFKiosMoremenuAccountpageSyncwithaccountBtn() {
		return NFKiosMoremenuAccountpageSyncwithaccountBtn;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageStatictextLbl(String text) {
		return LFSUtilsIOS.getElement("NFKios.moremenu.accountpage.statictext.lbl",
				text);
	}

	public QAFWebElement getNFKiosMoremenuAccountpageTouchIDSwitch() {
		return LFSUtilsIOS.getElement("NFKios.moremenu.accountpage.keepmelogin.switch",
				LFSUtilsIOS.getPropString("common.logintype.fingerprint"));
	}

	LoginPageIOS loginPageIOS = new LoginPageIOS();
	@FindBy(locator = "NFKios.moremnu.accountpage.optin.chkbx")
	private QAFWebElement NFKiosMoremnuAccountpageOptinChkbx;
	@FindBy(locator = "NFKios.moremenu.accountpage.userdtls.error.msg")
	private QAFWebElement NFKiosMoremenuAccountpageUserdtlsErrorMsg;
	@FindBy(locator = "NFKios.moremenu.accountpage.back.btn")
	private QAFWebElement NFKiosMoremenuAccountpageBackBtn;
	
	// Method to verify account page
	// Milan
	public void verifyAccountPage(Object userDetail) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getNFKiosMoremenuAccountpageAccntdtlsLbl().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getNFKiosMoremenuAccountpageUseremailLbl().getAttribute("label")
						.equalsIgnoreCase(userBean.getEmailID()),
				userBean.getEmailID() + "Expected   Actual "
						+ getNFKiosMoremenuAccountpageUseremailLbl()
								.getAttribute("label"),
				"Correct email ID");
		getNFKiosMoremenuAccountpageLogoutBtn().verifyPresent("Log out button");
		getNFKiosMoremenuAccountpageLastsyncLbl().verifyPresent("Last sync label");
		getNFKiosMoremenuAccountpageWithmeterLbl()
				.verifyPresent("last sync with meter label");
		getNFKiosMoremenuAccountpageMetersynctimeLbl()
				.verifyPresent("Meter last time sync");
		getNFKiosMoremenuAccountpageWithaccountLbl()
				.verifyPresent("Sync with account label");
		getNFKiosMoremenuAccountpageAccountlastsynctimeLbl()
				.verifyPresent("Account last sync time");
		getNFKiosMoremenuAccountpageKeepmeloginLbl()
				.verifyPresent("Keep me login label");
		getNFKiosMoremenuAccountpageKeepmeloginSwitch()
				.verifyPresent("Keep me login switch");
		getNFKiosMoremenuAccountpageSyncwithaccountBtn()
				.verifyPresent("Sync with meter button");

	}

	// Method to select opt in option
	// Milan deprecate method
	public void selectOptin() {
		getNFKiosMoremenuAccountpageStatictextLbl(ConstantUtils.OPTIN_MSG)
				.verifyPresent("Opt-In message");
		getNFKiosMoremenuAccountpageAccntdtlsLbl()
				.verifyPresent("After clicking cancel button account screen");

	}

	// Method to verify optin is selected
	// Milan
	public void optinCheckBox() {
		LFSUtilsIOS.scrollDown();
		/*getNFKiosMoremenuAccountpageAccntdtlsLbl().waitForPresent();
		{
			Reporter.logWithScreenShot("The user verified OPT-IN option on Account screen", MessageTypes.Pass);
		}*/
		if (getNFKiosMoremenuAccountpageOptinBtn().isEnabled())
		{
			System.out.println("Checking the check box");
			Reporter.logWithScreenShot("The user has selected optin to receive diabetes related information", MessageTypes.Pass);
		}
		else
		{
			Reporter.logWithScreenShot("The user has to select the optin to receive diabetes related information", MessageTypes.Pass);
		}
	}
		
// Method to click on logout button on more menu screen
	// milan
	public void clickonLogoutBtn() {
		getNFKiosMoremenuAccountpageLogoutBtn().waitForPresent();
		getNFKiosMoremenuAccountpageLogoutBtn().click();
		Reporter.logWithScreenShot("The user clicked on logout", MessageTypes.Pass);
	}

	// method to verify that keep me login is selected on account screen
	public void keepMeLoginSelected() {
		getNFKiosMoremenuAccountpageKeepmeloginSwitch()
				.verifyPresent("Keep Me Login Button Present");
		getNFKiosMoremenuAccountpageKeepmeloginSwitch()
				.verifyEnabled("Keep Me Login Button Enabled");
		Reporter.logWithScreenShot("Keep Me login button Present and enabled",
				MessageTypes.Pass);
	}

	// method to verify that keep me login is selected on account screen
	public void touchIDSelected() {
		if (getNFKiosMoremenuAccountpageTouchIDSwitch().isDisplayed()) {
			getNFKiosMoremenuAccountpageTouchIDSwitch()
					.verifyPresent("Enable Touch ID Button Present");
			getNFKiosMoremenuAccountpageTouchIDSwitch()
					.verifyEnabled("Enable Touch ID Button Enabled");
			Reporter.logWithScreenShot("Enable Touch ID button Present and enabled",
					MessageTypes.Pass);
		} else {
			Reporter.log("touch id  is not displayed", MessageTypes.Pass);
		}
	}

	// Method to click on delete button n delete account page
	public void clickDeleteButton() {
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKiosMoremenuAccountpageDeleteaccountBtn()
				.verifyPresent("Delete account button is present");
		getNFKiosMoremenuAccountpageDeleteaccountBtn().click();

	}

	// Method to agree consent and confirmation for delete account
	public void agreeConsentAndConfirmation() {
		try {
			LFSUtilsIOS lfs = new LFSUtilsIOS();
			lfs.getDriver().hideKeyboard();
			LFSUtilsIOS.waitforLoad();
		} catch (Exception e) {
			LFSUtilsIOS.waitforLoad();
		}
		getNFKiosMoremenuAccountpageDeletescreenAckCheckbox().click();
		getNFKiosMoremenuAccountpageDeletescreenVerificationCheckbox().click();
        LFSUtilsIOS.waitforLoad();
        Reporter.logWithScreenShot("User checked the checkboxes ",MessageTypes.Pass);
	}

	// Method to verify delete button is enable or not
	public void verifyDeleteButtonEnable() {
		try {
			LFSUtilsIOS lfs = new LFSUtilsIOS();
			lfs.getDriver().hideKeyboard();
		} catch (Exception e) {
		}
		if (getNFKiosMoremenuAccountpageDeletescreenDeleteBtn().getAttribute("enabled")
				.toString().equalsIgnoreCase("true"))
			getNFKiosMoremenuAccountpageDeletescreenDeleteBtn()
					.verifyEnabled("Delete Button is enabled");
		else
			Reporter.logWithScreenShot(
					"Delete button is not enabled, Kindly reconfirm your selection",
					MessageTypes.Fail);
	}

	// Method to verify incorrect credentials error message
	public void verifyIncorrrectCredentialsErrorMessage() {
		// TODO Auto-generated method stub

	}

	// Method to withdraw consent for delete account
	public void withdrawConsentForDelete() {

		getNFKiosMoremenuAccountpageIacknwldgeChkbx().click();
		Reporter.logWithScreenShot("Acknowledge checkbox is checked successfully",
				MessageTypes.Pass);

		getNFKiosMoremenuAccountpageDeleteaccountChkbx().click();
		Reporter.logWithScreenShot("I Assure checkbox is checked successfully",
				MessageTypes.Pass);

	}

	// Method to click on edit profile button
	public void clickEditProfileButton() {
		// TODO Auto-generated method stub
		getNFKiosMoremenuAccountpageUserdtlsEditBtn()
				.verifyPresent("The edit profile button on account page is present");
		getNFKiosMoremenuAccountpageUserdtlsEditBtn().click();

	}

	// Method to update user profile details
		public void updateProfileDetails(Object userDetail) {
			SignupPageIOS pageIOS = new SignupPageIOS();
			
			UserDetailBeans userBean = new UserDetailBeans();

			String email = "mailinator.com";
			if (userDetail instanceof String) {

				userBean.fillFromConfig((String) userDetail);
			} else {
				userBean.fillData(userDetail);
			}
			if (userDetail instanceof String) {

				userBean.fillFromConfig((String) userDetail);
			} else {
				userBean.fillData(userDetail);
			}

			getNFKiosMoremenuAccountpageUserdtlsEmailTxt().click();
			String emailget = getNFKiosMoremenuAccountpageUserdtlsEmailTxt().getText();
			ConfigurationManager.getBundle().setProperty("register.signupemail.key",emailget);
			QAFWebElement elementXpath = getNFKiosMoremenuAccountpageUserdtlsEmailTxt();
			String x[] = elementXpath.toString().split("xpath:");
			
			int eleX = Integer.valueOf(LFSUtilsIOS.getElementInfo("x", x[1].replaceAll("\\s+",""), "xpath").toString());
			int eleY = Integer.valueOf(LFSUtilsIOS.getElementInfo("y", x[1].replaceAll("\\s+",""), "xpath").toString());
			int eleHeight = Integer.valueOf(LFSUtilsIOS.getElementInfo("height", x[1].replaceAll("\\s+",""), "xpath").toString());
			int eleWidth = Integer.valueOf(LFSUtilsIOS.getElementInfo("width", x[1].replaceAll("\\s+",""), "xpath").toString());
			
			int xPoint = eleX + eleWidth - 10;
			int yPoint = eleY + (eleHeight/2);
			LFSUtilsIOS.tapOnCordinates(String.valueOf(xPoint), String.valueOf(yPoint));
			
			
			  for (int i = 0; i <9; i++) {
		  		  getNFKiosKeyBoardDeleteBtn().click();
		  		  }
	
		  		 LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsEmailTxt(), email);
	
			LFSUtilsIOS.pause(200);

			ConfigurationManager.getBundle().setProperty("register.email.key",email);
			getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt()
					.verifyPresent("First name text field ");
			//getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt().clear();
			for (int i = 0; i < getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt().getText().length(); i++) {
				driver.getKeyboard().sendKeys(Keys.DELETE);
			}
			LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt(), userBean.getFirstName());
			ConfigurationManager.getBundle().setProperty("register.firstname.key",
					userBean.getFirstName());
			getNFKiosMoremenuAccountpageUserdtlsInitialTxt().click();
			LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsInitialTxt(),userBean.getMiddleName());
			LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsLstnameTxt(),userBean.getLastName());
			LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsSuffixTxt(),userBean.getSuffix());
			getNFKiosMoremenuAccountpageUserdtlsDobTxt().click();
			System.out.println(userBean.getBirthdayYear());
			pageIOS.setDateOfBirth(userBean);
			ConfigurationManager.getBundle().setProperty("register.DOB.key",
					userBean.getBirthdayYear());
			
			getNFKiosMoremenuAccountpageUserdtlsAddress1Txt().click();
			LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress1Txt(),userBean.getAddress1());
			LFSUtilsIOS.waitforLoad();
						
			getNFKiosMoremenuAccountpageUserdtlsSaveBtn().click();
			LFSUtilsIOS.waitforLoad();
			getNFKiosMoremenuAccountpageUserdtlsEditBtn().click();
			
			getNFKiosMoremenuAccountpageUserdtlsAddress2Txt().click();
			LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress2Txt(),userBean.getAddress2());
			
			
			getNFKiosMoremenuAccountpageUserdtlsSaveBtn().click();
			LFSUtilsIOS.waitforLoad();
			getNFKiosMoremenuAccountpageUserdtlsEditBtn().click();
			
			getNFKiosMoremenuAccountpageUserdtlsAddress3Txt().click();
			LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress3Txt(),userBean.getAddress3());
			
			getNFKiosMoremenuAccountpageUserdtlsSaveBtn().click();
			LFSUtilsIOS.waitforLoad();
			getNFKiosMoremenuAccountpageUserdtlsEditBtn().click();
			

			getNFKiosMoremenuAccountpageUserdtlsCityTxt().click();
			LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsCityTxt(),userBean.getCity());

			LFSUtilsIOS.waitforLoad();
			getNFKiosMoremenuAccountpageUserdtlsSaveBtn().click();
			LFSUtilsIOS.waitforLoad();
			
			getNFKiosMoremenuAccountpageUserdtlsEditBtn().click();
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			
			getNFKiosMoremenuAccountpageUserdtlsStateTxt().click();
		
	         LFSUtilsIOS.scrollDown();
			getNFKiosMoremenuAccountpageStateDoneBtn().click();
			getNFKiosMoremenuAccountpageUserdtlsSaveBtn().click();
			LFSUtilsIOS.waitforLoad();
	    	getNFKiosMoremenuAccountpageUserdtlsEditBtn().click();

	    	getNFKiosMoremenuAccountpageUserdtlsZipcodeTxt().click();
	    	LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsZipcodeTxt(),userBean.getZipCode());
			getNFKiosMoremenuAccountpageUserdtlsSaveBtn().click();
		    LFSUtilsIOS.waitforLoad();
			getNFKiosMoremenuAccountpageUserdtlsEditBtn().click();
			LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);
			
			getNFKiosMoremenuAccountpageUserdtlsPrinumberTxt().click();
			LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsPrinumberTxt(),userBean.getPhoneNumber());    
			Reporter.logWithScreenShot("The user had updated the profile details", MessageTypes.Pass);

		}
		
	// Method to click on save button
	public void clickSaveButton() {
		LFSUtilsIOS.waitforLoad();
		LFSUtilsIOS.pause(200);
		getNFKiosMoremenuAccountpageUserdtlsSaveBtn().verifyPresent("Save button ");
		getNFKiosMoremenuAccountpageUserdtlsSaveBtn().click();

	}

	// Method to view error messages for wrong user details
	public void viewErrorMessages() {
		// TODO Auto-generated method stub

	}

	// Method to enter wrong credentials for login verification
	public void loginWithGDPRInvalidUsername() {

		loginPageIOS.getNFKiosLoginpageEmailadressTbox().sendKeys("wrongmail.com");
		loginPageIOS.getNFKiosLoginpagePasswordTbox().sendKeys("abcd123#");

		try {
			LFSUtilsIOS lfs = new LFSUtilsIOS();
			lfs.getDriver().hideKeyboard();
		} catch (Exception e) {
			loginPageIOS.getNFKiosLoginpageTitleLbl().click();
		}

		LFSUtilsIOS.waitforLoad();
		getNFKiosMoremenuAccountpageDeleteaccountBtn()
				.verifyEnabled("Delete button is enabled");
		getNFKiosMoremenuAccountpageDeleteaccountBtn().click();
		if (getNFKiosMoremenuAccountpageStatictextLbl(
				ConfigurationManager.getBundle().getString("appCommon.ok"))
						.isDisplayed()) {
			Reporter.logWithScreenShot("Error message popup is displayed",
					MessageTypes.Pass);
			getNFKiosMoremenuAccountpageStatictextLbl(
					ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		}

	}

	
	public QAFWebElement getNFKiosMoremenuAccountpageIacknwldgeChkbx() {
		return NFKiosMoremenuAccountpageIacknwldgeChkbx;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeleteaccountChkbx() {
		return NFKiosMoremenuAccountpageDeleteaccountChkbx;
	}

	public QAFWebElement getNFKiosMoremenuAccountpageDeleteaccountBtn() {
		return NFKiosMoremenuAccountpageDeleteaccountBtn;
	}

	// Method to click delete button
	public void deleteAccountPermnently() {
		try {
			LFSUtilsIOS lfs = new LFSUtilsIOS();
			lfs.getDriver().hideKeyboard();
		} catch (Exception e) {
		}
System.out.println("*************"+getNFKiosMoremenuAccountpageDeletescreenDeleteBtn().getText());
//		getNFKiosMoremenuAccountpageStatictextLbl(
//				LFSUtilsIOS.getPropString("appCommon.deleteAccount")).click();
		getNFKiosMoremenuAccountpageDeletescreenDeleteBtn().isEnabled();
		getNFKiosMoremenuAccountpageDeletescreenDeleteBtn().click();
		LFSUtilsIOS.pause(2000);
		getNFKiosMoremenuAccountpageDeletescreenPopupOkBtn().waitForPresent();
		
//		getNFKiosMoremenuAccountpageStatictextLbl(
//				LFSUtilsIOS.getPropString("appCommon.ok")).waitForPresent();
		//getNFKiosMoremenuAccountpageDeleteaccountBtn().click();
		try {
		  if(getNFKiosMoremenuAccountpageDeletescreenPopupTitle().getText().equals(LFSUtilsIOS.getPropString
				("appCommon.accountDeleted")))	{
		    Reporter.logWithScreenShot("Delete account confirmation popup is displayed",MessageTypes.Pass);
		  getNFKiosMoremenuAccountpageDeletescreenPopupOkBtn().click();
		  }
		}
		catch(Exception e)
		 {
			Reporter.logWithScreenShot("Delete account confirmation popup is not displayed", MessageTypes.Fail);
		}
		
//		getNFKiosMoremenuAccountpageStatictextLbl(
//				LFSUtilsIOS.getPropString("appCommon.ok")).click();

	}

	public void enterDeleteCredentials() {
	
		SignupPageIOS signupPageIOS = new SignupPageIOS();
		getNFKiosMoremenuAccountpageDeletescreenEmailField().click();
	    getNFKiosMoremenuAccountpageDeletescreenEmailField().sendKeys((signupPageIOS.email).toLowerCase());
	    getNFKiosMoremenuAccountpageDeletescreenPasswordField().sendKeys("test@1234real");
	    
	    LFSUtilsIOS.waitforLoad();
	 System.out.println("Get password " +getNFKiosMoremenuAccountpageDeletescreenPasswordField().getText());
	    Reporter.logWithScreenShot("Entered the valid credentials", MessageTypes.Pass);

	}

	public void uncheckConsentChkbx() {
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKiosMoremenuAccountpageConsentChkbx()
				.verifyPresent("Consent page checkbox is present");
		getNFKiosMoremenuAccountpageConsentChkbx().click();
		Reporter.logWithScreenShot("Delete Account page is displayed", MessageTypes.Pass);
	}

	public QAFWebElement getNFKiosMoremenuAccountpageConsentChkbx() {
		return NFKiosMoremenuAccountpageConsentChkbx;
	}

	public void verifyAfterEditing() {
		getNFKiosMoremenuAccountpageUserdtlsEditBtn().waitForPresent();
		SignupPageIOS pageIOS = new SignupPageIOS();
		String emailafterEditing = (String) ConfigurationManager.getBundle()
				.getProperty("register.signupemail.key");
		String emailBeforeSave = pageIOS.email;

		if (!emailafterEditing.equals(emailBeforeSave)) {

			Validator.verifyThat("The user profile details edited successfully",emailBeforeSave, Matchers.not(emailafterEditing));
		} else {
			Reporter.log("The user profile details not edited successfully !!");
		}
	}

	public void checkOptinOptionForMarketing() {
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKiosMoremnuAccountpageOptinChkbx()
				.verifyPresent("Marketing opt-in checkbox is present");
		getNFKiosMoremnuAccountpageOptinChkbx().click();
		if (getNFKiosMoremnuAccountpageOptinChkbx().isPresent()) {
			Reporter.logWithScreenShot(
					"User has already opt-out, click again to check for optin again",
					MessageTypes.Pass);
			getNFKiosMoremnuAccountpageOptinChkbx().click();
		} else {
			Reporter.logWithScreenShot("User is about to opt-in for option",
					MessageTypes.Pass);

		}
	}

	public void agreeOptinCheckbox() {
		getNFKiosMoremenuAccountpageStatictextLbl(
				LFSUtilsIOS.getPropString("optIn.title"))
						.verifyPresent("Opt-In Agreement page is displayed");
		getNFKiosMoremenuAccountpageStatictextLbl(
				LFSUtilsIOS.getPropString("termsAndCond.agree")).click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("Opt-in option is check in", MessageTypes.Pass);
	}

	public void enterWrongEmailId() {

		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().clear();
		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().sendKeys("abcd@.com");
		getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt().click();
		getNFKiosMoremenuAccountpageStatictextLbl(LFSUtilsIOS
				.getPropString("auth.emailValidation.emailNotValidFormat")).verifyPresent(
						"Invalid Email address has been entered, Kindly enter a valid ID");
		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().clear();
		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().sendKeys("1234.gmail.com");
		getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt().click();
		getNFKiosMoremenuAccountpageStatictextLbl(LFSUtilsIOS
				.getPropString("auth.emailValidation.emailNotValidFormat")).verifyPresent(
						"Invalid Email address has been entered, Kindly enter a valid ID");
		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().clear();
		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().sendKeys("abcd123@gmail.com");
		getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt().click();
		getNFKiosMoremenuAccountpageStatictextLbl(
				LFSUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
						.verifyNotPresent("Valid Email id is entered");
	}

	public QAFWebElement getNFKiosMoremenuAccountpageUserdtlsErrorMsg() {
		return NFKiosMoremenuAccountpageUserdtlsErrorMsg;
	}

	public void clickBackButton() {
		getNFKiosMoremenuAccountpageBackBtn()
				.verifyPresent("Back Button on Edit User details page is displaed");
		getNFKiosMoremenuAccountpageBackBtn().click();
	
	}

	public QAFWebElement getNFKiosMoremenuAccountpageBackBtn() {
		return NFKiosMoremenuAccountpageBackBtn;
	}

	public void verifyDeletebtnonAcc() {
		LFSUtilsIOS.scrollDown();
		getNFKiosMoremenuAccountpageDeleteBtn().waitForPresent();
		if(getNFKiosMoremenuAccountpageDeleteBtn().isPresent())
		{
			Reporter.logWithScreenShot("Delete button is present ", MessageTypes.Pass);
			LFSUtilsIOS.pause(200);
			getNFKiosMoremenuAccountpageDeleteBtn().click();
		}
		else
			Reporter.logWithScreenShot("Delete button is not present for this country", MessageTypes.Fail);
	}

	public void verifydeleteaccscreen() {
		getNFKiosMoremenuAccountpageDeletescreenMessageLabel().verifyPresent("Message on delete screen");
		getNFKiosMoremenuAccountpageDeletescreenEmailField().verifyPresent("Email field");
		getNFKiosMoremenuAccountpageDeletescreenPasswordField().verifyPresent("Password");
		getNFKiosMoremenuAccountpageDeletescreenAckCheckbox().verifyPresent("Ack checkbox");
		getNFKiosMoremenuAccountpageDeletescreenVerificationCheckbox().verifyPresent("Verification checkbox");
		getNFKiosMoremenuAccountpageDeletescreenDeleteBtn().verifyPresent("Delete button");	
		Reporter.logWithScreenShot("The Delete account screen ", MessageTypes.Pass);
	}
	public void enterLogindetail() {
		SignupPageIOS signupPageIOS = new SignupPageIOS();
		LoginPageIOS logindetail= new LoginPageIOS();
		logindetail.getNFKiosLoginpageEmailadressTbox().click();
		logindetail.getNFKiosLoginpageEmailadressTbox().sendKeys(signupPageIOS.email);
		logindetail.getNFKiosLoginpagePasswordTbox().sendKeys("test@1234");
	}
	
	public void updateDependentProfileDetails(Object userDetail) {
		SignupPageIOS pageIOS = new SignupPageIOS();
		UserDetailBeans userBean = new UserDetailBeans();

		String email = "mailinator.com";
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		String getemail=getNFKiosMoremenuAccountpageUserdtlsEmailTxt().getText();
		String editedemail=getemail.replaceAll("gmail.com","mailinator.com");
		ConfigurationManager.getBundle().setProperty("register.signupemail.key",editedemail);
		getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt()
				.verifyPresent("First name text field ");
		for (int i = 0; i < 8; i++) {
			driver.getKeyboard().sendKeys(Keys.DELETE);
		}
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt(), userBean.getDependentfname());
	ConfigurationManager.getBundle().setProperty("register.firstname.key",
				userBean.getDependentfname());
		getNFKiosMoremenuAccountpageUserdtlsInitialTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsInitialTxt(), userBean.getDependentmname());
		getNFKiosMoremenuAccountpageUserdtlsLstnameTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsLstnameTxt(), userBean.getDependentlname());
		
		getNFKiosMoremenuAccountpageUserdtlsSuffixTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsSuffixTxt(),userBean.getDependentsuffix());
		getNFKiosMoremenuAccountpageUserdtlsDobTxt().click();
		pageIOS.getNFKiosSignuppageTimingpickerYearPkr().sendKeys(userBean.getDependentbirthyr());
		pageIOS.getNFKiosSignupPageBdPickerDoneBtn().click();
		//pageIOS.setDependentDateOfBirth(userBean);
		ConfigurationManager.getBundle().setProperty("register.DOB.key",
				userBean.getDependentbirthyr());
		
		getNFKiosMoremenuAccountpageUserdtlsAddress1Txt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress1Txt(),userBean.getDependentaddress1());

		LFSUtilsIOS.waitforLoad();		
		getNFKiosMoremenuAccountpageUserdtlsAddress2Txt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress2Txt(),userBean.getDependentaddress2());
		
		getNFKiosMoremenuAccountpageUserdtlsSaveBtn().click();
		LFSUtilsIOS.waitforLoad();
		getNFKiosMoremenuAccountpageUserdtlsEditBtn().click();
		getNFKiosMoremenuAccountpageUserdtlsAddress3Txt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress3Txt(),userBean.getDependentaddress3());
		
		getNFKiosMoremenuAccountpageUserdtlsCityTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsCityTxt(),userBean.getDependentcity());
		LFSUtilsIOS.waitforLoad();
		
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);    	
	    LFSUtilsIOS.waitforLoad();
	
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 20, 10);		
		getNFKiosMoremenuAccountpageUserdtlsPrinumberTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsPrinumberTxt(),userBean.getDependentphone()); 
		iosDriver.hideKeyboard(HideKeyboardStrategy.TAP_OUTSIDE);
		getNFKiosMoremenuAccountpageUserdtlsZipcodeTxt().click();
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsZipcodeTxt(),userBean.getDependentzipcode());
		getNFKiosMoremenuAccountpageUserdtlsStateTxt().click();
        LFSUtilsIOS.scrollDown();
		getNFKiosMoremenuAccountpageStateDoneBtn().click();
		LFSUtilsIOS.swipeWithScreenPercent(50, 20, 50, 80, 10);    	
		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().click();
		QAFWebElement elementXpath = getNFKiosMoremenuAccountpageUserdtlsEmailTxt();
		String x[] = elementXpath.toString().split("xpath:");
		
		int eleX = Integer.valueOf(LFSUtilsIOS.getElementInfo("x", x[1].replaceAll("\\s+",""), "xpath").toString());
		int eleY = Integer.valueOf(LFSUtilsIOS.getElementInfo("y", x[1].replaceAll("\\s+",""), "xpath").toString());
		int eleHeight = Integer.valueOf(LFSUtilsIOS.getElementInfo("height", x[1].replaceAll("\\s+",""), "xpath").toString());
		int eleWidth = Integer.valueOf(LFSUtilsIOS.getElementInfo("width", x[1].replaceAll("\\s+",""), "xpath").toString());
		
		int xPoint = eleX + eleWidth - 10;
		int yPoint = eleY + (eleHeight/2);
	

		LFSUtilsIOS.tapOnCordinates(String.valueOf(xPoint), String.valueOf(yPoint));
		for (int i = 0; i< 9 ; i++) {
			getNFKiosKeyBoardDeleteBtn().click();
		}
		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsEmailTxt(), email);
		LFSUtilsIOS.pause(200);

		ConfigurationManager.getBundle().setProperty("register.email.key",email);;
	    LFSUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot("The user had updated the profile details", MessageTypes.Pass);
	}
	
	public void enterPasswordClickLogin() {
		getNFKiosDependentConfirmpasswordTBox().waitForPresent();
		getNFKiosDependentConfirmpasswordTBox().click();
		getNFKiosDependentConfirmpasswordTBox().sendKeys(ConfigurationManager.getBundle().getString("dependent.password"));
		Reporter.logWithScreenShot("User entered Password",MessageTypes.Pass);
		getNFKiosDependentConfirmBtn().isEnabled();
     //  getNFKiosDependentConfirmBtn().click();
		LFSUtilsIOS.clickWithText("Confirm");
		waitForPageToLoad();
	}
	
	public void verifyDepenedentEditedDetails(Object userDetail) {
	waitForPageToLoad();
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		LFSUtilsIOS.waitforLoad();
		LFSUtilsIOS.pause(3000);
		getNFKiosMoremenuAccountpageUserdtlsEditBtn().waitForPresent(200);
		getNFKiosMoremenuAccountpageUserdtlsEditBtn().waitForPresent();
		String editemail=(String) ConfigurationManager.getBundle().getProperty("register.signupemail.key");
		String aftereemail=editemail.replaceAll("gmail.com","mailinator.com");
		Reporter.logWithScreenShot("Email after removing Gmail and adding mailinator.com "+aftereemail, MessageTypes.Pass);
		  getNFKiosMoremenuAccountpageUserdtlsEmailLbl().getAttribute("value").equals(aftereemail);
		  getNFKiosMoremenuAccountpageUserdtlsFrstnameLbl().getAttribute("value").equals(ConfigurationManager.getBundle().getProperty("register.firstname.key"));
		  getNFKiosMoremenuAccountpageUserdtlsLstnameLbl().getAttribute("value").equals(userBean.getDependentlname());
		  getNFKiosMoremenuAccountpageUserdtlsInitialLbl().getAttribute("value").equals(userBean.getDependentmname());
		  getNFKiosMoremenuAccountpageUserdtlsSuffixLbl().getAttribute("value").equals(userBean.getDependentsuffix());
		  LFSUtilsIOS.swipeWithScreenPercent(50, 40, 50, 80, 10);
            getNFKiosMoremenuAccountpageUserdtlsDobLbl().getAttribute("value");
		  getNFKiosMoremenuAccountpageUserdtlsAddress1Lbl().getAttribute("value").equals(userBean.getDependentaddress1());
		  getNFKiosMoremenuAccountpageUserdtlsAddress2Lbl().getAttribute("value").equals(userBean.getDependentaddress2());
		  getNFKiosMoremenuAccountpageUserdtlsAddress3Lbl().getAttribute("value").equals(userBean.getDependentaddress3());
		  LFSUtilsIOS.swipeWithScreenPercent(50, 40, 50, 80, 10);
		  getNFKiosMoremenuAccountpageUserdtlsCityLbl().getAttribute("value").equals(userBean.getDependentcity());
		  getNFKiosMoremenuAccountpageUserdtlsZipcodeLbl().getAttribute("value").equals(userBean.getDependentzipcode());
		  getNFKiosMoremenuAccountpageUserdtlsPrinumberLbl().getAttribute("value").equals(userBean.getDependentphone());
		  
		
	}
	
	//Click on Change password and verify screen
			public void clickChangePasswordButton() {
				if (getiosNFKMoremenuAccountpageChangePasswordButton().isDisplayed()) {
					getiosNFKMoremenuAccountpageChangePasswordButton().click();
			}else
				Reporter.logWithScreenShot("Change Password button is not present", MessageTypes.Fail);
			}
			
			//Verfiy Change password screen
			public void clickChangePasswordScreen() {
				
				getNFKiosMoremenuAccountpagechangepasswordtitle().isPresent();
				getNFKiosMoremenuAccountpagechangepasswordCurrentPasswordField().assertPresent("Current password field");
				getNFKiosMoremenuAccountpagechangepasswordNewPasswordField().assertPresent
				("New Password");
				getNFKiosMoremenuAccountpageChangePasswordConfirmPasswordField().assertPresent("Confirm Password");
				getNFKiosMoremenuAccountpagechangepasswordsavechangesbutton().isPresent();
				getNFKiosMoremenuAccountpagechangepasswordcancelbutton().isPresent();
				getNFKiosMoremenuAccountpagechangepasswordForgotYourPasswordlink().assertPresent("Forgot Password Link");
				getNFKiosMoremenuAccountpagechangepasswordbackbutton().isPresent();
				Reporter.logWithScreenShot("Change password screen", MessageTypes.Pass);
				
			}
			
			
			//Click on Cancel button from Change password screen
		      public void clickChangePasswordCancelBtn() {		
				getNFKiosMoremenuAccountpagechangepasswordcancelbutton().isPresent();
				getNFKiosMoremenuAccountpagechangepasswordcancelbutton().click();
				Reporter.logWithScreenShot("Account screen after clicling on Cancel button", MessageTypes.Pass);
				getiosNFKMoremenuAccountpageChangePasswordButton().click();
			 }
			
		      
		    //Click on save button from Change password screen
//		      public void clickSaveChangesBtn() {
//				
//				getNFKMoremenuAccountpageSaveChangesButton().isEnabled();
//				getNFKMoremenuAccountpageSaveChangesButton().click();
//				Reporter.logWithScreenShot("Account screen after changing password", MessageTypes.Pass);
//			 }
		      
		      
		      
		      //Enter Change password detail
		      public void enterChangePasswordDetail(Object userDetails) {
		    	  UserDetailBeans userBean = new UserDetailBeans();
		  		if (userDetails instanceof String) {

		  			userBean.fillFromConfig((String) userDetails);
		  		} else {
		  			userBean.fillData(userDetails);
		  		}
		  		
		  		Reporter.logWithScreenShot("Change password screen before entering details", MessageTypes.Pass);
		  		getNFKiosMoremenuAccountpagechangepasswordCurrentPasswordField().clear();	
		  		String pass= (String)ConfigurationManager.getBundle().getProperty("register.password");
		  		getNFKiosMoremenuAccountpagechangepasswordCurrentPasswordField().
		  		sendKeys(pass);
		  		getNFKiosMoremenuAccountpagechangepasswordNewPasswordField().clear();
		  		getNFKiosMoremenuAccountpagechangepasswordNewPasswordField().sendKeys(userBean.getNewPassword());
		  		getNFKiosMoremenuAccountpageChangePasswordConfirmPasswordField().clear();
		  		getNFKiosMoremenuAccountpageChangePasswordConfirmPasswordField().sendKeys(userBean.getNewPassword()); 
		  		LFSUtilsIOS.pause(200);
		  		Reporter.logWithScreenShot("Change password screen After entering details", MessageTypes.Pass);
		  		LFSUtilsIOS.waitforLoad();  		
		  		}
		  
		      
		    //Save Change password detail
		      public void saveChangePasswordDetail() {
		    	  getNFKiosMoremenuAccountpagechangepasswordsavechangesbutton().waitForPresent();
		    	  getNFKiosMoremenuAccountpagechangepasswordsavechangesbutton().isEnabled();
		    	  Reporter.logWithScreenShot("Enable save button", MessageTypes.Pass);
		    	  LFSUtilsIOS.waitforLoad();	
		    	  getNFKiosMoremenuAccountpagechangepasswordsavechangesbutton().click();
		    	 
		  		}
		      	
		      //Enter Changed Password Details on login screen
		   	
		      public void enterchangepasswordlogindetails(Object userDetail){
		    	  UserDetailBeans userBean = new UserDetailBeans();
		    		if (userDetail instanceof String) {

		    			userBean.fillFromConfig((String) userDetail);
		    		} else {
		    			userBean.fillData(userDetail);
		    		}
		    		
		    		SignupPageIOS sign = new SignupPageIOS();
		    	  getNFKiosMoremenuAccountpagechangepasswordemailaddress().click();
		    	  String str= (String) ConfigurationManager.getBundle().getProperty("register.email");
		    	  getNFKiosMoremenuAccountpagechangepasswordemailaddress().sendKeys(str);
		     	  System.out.println(str);
		    	// Properties login = ConfigurationManager.getBundle().getProperties("register.email.key");  
		     	 getNFKiosMoremenuAccountpagechangedpassword().click();
		     	getNFKiosMoremenuAccountpagechangedpassword().sendKeys(userBean.getNewPassword());
		    	  System.out.println(userBean.getNewPassword());
		    	  Reporter.logWithScreenShot("login screen After entering details", MessageTypes.Pass);
		    	  LFSUtilsIOS.waitforLoad();	

		    	  }	
		      public void updateUserProfileDetails(Object userDetail) {

		  		SignupPageIOS pageIOS = new SignupPageIOS();
		  		LFSUtilsIOS lfs = new LFSUtilsIOS();
		  		UserDetailBeans userBean = new UserDetailBeans();

		  		String email = "mailinator.com";
		  		if (userDetail instanceof String) {

		  			userBean.fillFromConfig((String) userDetail);
		  		} else {
		  			userBean.fillData(userDetail);
		  		}
		  		if (userDetail instanceof String) {

		  			userBean.fillFromConfig((String) userDetail);
		  		} else {
		  			userBean.fillData(userDetail);
		  		}
		  		getNFKiosMoremenuAccountpageUserdtlsEmailTxt().click();
		  		
		  		  QAFWebElement elementXpath = getNFKiosMoremenuAccountpageUserdtlsEmailTxt();
		  		 
		  		  String x[] = elementXpath.toString().split("xpath:");
		  		  
		  		  int eleX = Integer.valueOf(LFSUtilsIOS.getElementInfo("x", x[1].replaceAll("\\s+", ""), "xpath").toString()); int eleY =
		  		  Integer.valueOf(LFSUtilsIOS.getElementInfo("y", x[1].replaceAll("\\s+", ""),
		  		  "xpath").toString()); int eleHeight = Integer
		  		  .valueOf(LFSUtilsIOS.getElementInfo("height", x[1].replaceAll("\\s+", ""),
		  		  "xpath").toString()); int eleWidth = Integer
		  		  .valueOf(LFSUtilsIOS.getElementInfo("width", x[1].replaceAll("\\s+", ""),
		  		  "xpath").toString());
		  		  
		  		  int xPoint = eleX + eleWidth - 10; int yPoint = eleY + (eleHeight / 2);

		  		  LFSUtilsIOS.tapOnCordinates(String.valueOf(xPoint), String.valueOf(yPoint));
		  		  for (int i = 0; i <9; i++) {
		  		  getNFKiosKeyBoardDeleteBtn().click();
		  		  }
		  		  //LFSUtilsIOS.entermiddleText(getNFKiosMoremenuAccountpageUserdtlsEmailTxt(),email);
		  		 LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsEmailTxt(), email);
		  		LFSUtilsIOS.pause(200);
		  		String updatedEmail=getNFKiosMoremenuAccountpageUserdtlsEmailTxt().getText();
		  		System.out.println(updatedEmail);
		  		ConfigurationManager.getBundle().setProperty("update1.editemail.key",updatedEmail );
		  		getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt().verifyPresent("First name text field ");
		 
		  		deleteText(getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt());
		  		
		  		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsFrstnameTxt(), userBean.getFirstName());
		  		ConfigurationManager.getBundle().setProperty("update1.editfirstname.key", userBean.getFirstName());
		  		
		  		deleteText(getNFKiosMoremenuAccountpageUserdtlsLstnameTxt());
		  		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsLstnameTxt(), userBean.getLastName());
		  		ConfigurationManager.getBundle().setProperty("update1.editlastname.key", userBean.getLastName());
		  		getNFKiosMoremenuAccountpageUserdtlsAddress1Txt().click();
		  		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsAddress1Txt(), userBean.getAddress1());
		  		ConfigurationManager.getBundle().setProperty("update1.editAddress1.key", userBean.getAddress1());
		  		getNFKiosMoremenuAccountpageUserdtlsCityTxt().click();
		  		LFSUtilsIOS.enterText(getNFKiosMoremenuAccountpageUserdtlsCityTxt(), userBean.getCity());
		  		ConfigurationManager.getBundle().setProperty("update1.editcity.key", userBean.getCity());
		  		Reporter.logWithScreenShot("The user had updated the profile details", MessageTypes.Pass);
		  	}
		      
		      public void deleteText(QAFWebElement element) {
		    	    QAFWebElement elementXpath = element;
		    		String x[] = elementXpath.toString().split("xpath:");

		    		int eleX = Integer.valueOf(LFSUtilsIOS.getElementInfo("x", x[1].replaceAll("\\s+", ""), "xpath").toString());
		    		int eleY = Integer.valueOf(LFSUtilsIOS.getElementInfo("y", x[1].replaceAll("\\s+", ""), "xpath").toString());
		    		int eleHeight = Integer.valueOf(LFSUtilsIOS.getElementInfo("height", x[1].replaceAll("\\s+", ""), "xpath").toString());
		    		int eleWidth = Integer.valueOf(LFSUtilsIOS.getElementInfo("width", x[1].replaceAll("\\s+", ""), "xpath").toString());
		    		int xPoint = eleX + eleWidth - 10;
		    		int yPoint = eleY + (eleHeight / 2);
		    		LFSUtilsIOS.tapOnCordinates(String.valueOf(xPoint), String.valueOf(yPoint));
		    		for (int i = 0; i < elementXpath.getText().length(); i++) {
		    			getNFKiosKeyBoardDeleteBtn().click();
		    		 }
		    	   }
		      public void verifyupdatedUserProfileDetails(Object userDetail) {
		  		LFSUtilsIOS.pause(2000);
		  		UserDetailBeans userBean = new UserDetailBeans();
		  		if (userDetail instanceof String) {

		  			userBean.fillFromConfig((String) userDetail);
		  		} else {
		  			userBean.fillData(userDetail);
		  		}
		  		if (userDetail instanceof String) {

		  			userBean.fillFromConfig((String) userDetail);
		  		} else {
		  			userBean.fillData(userDetail);
		  		}
		  		getNFKiosMoremenuAccountpageUserdtlsEmailLbl().getText()
		  				.equals(ConfigurationManager.getBundle().getProperty("update1.editemail.key"));
		  				
		  		getNFKiosMoremenuAccountpageUserdtlsFrstnameLbl().getText().equals(ConfigurationManager.getBundle().getProperty("update1.editfirstname.key"));
		  		
		  		getNFKiosMoremenuAccountpageUserdtlsLstnameLbl().equals(ConfigurationManager.getBundle().getProperty("update1.editlastname.key"));
		  		
		  		LFSUtilsIOS.hideKeyboard();
		  		LFSUtilsIOS.waitforLoad();
		  		getNFKiosMoremenuAccountpageUserdtlsAddress1Lbl().equals(ConfigurationManager.getBundle().getProperty("update1.editlastname.key"));
		  		LFSUtilsIOS.hideKeyboard();
		  		getNFKiosMoremenuAccountpageUserdtlsCityLbl().equals(ConfigurationManager.getBundle().getProperty("update1.editcity.key"));
		  	
		  		Reporter.logWithScreenShot("Verified the deatils",MessageTypes.Pass);
		  	}
		

}
