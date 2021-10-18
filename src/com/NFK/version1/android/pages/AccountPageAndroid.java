package com.NFK.version1.android.pages;


import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.UserDetailBeans;
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



public class AccountPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	SignupPageAndroid sign = new SignupPageAndroid();
	
	@FindBy(locator = "NFK.moremenu.accountpage.heading.lbl")
	private QAFWebElement NFKMoremenuAccountpageHeadingLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.accntdtls.lbl")
	private QAFWebElement NFKMoremenuAccountpageAccntdtlsLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.useremail.lbl")
	private QAFWebElement NFKMoremenuAccountpageUseremailLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.logout.btn")
	private QAFWebElement NFKMoremenuAccountpageLogoutBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.accountsync.lnk")
	private QAFWebElement NFKMoremenuAccountpageAccountsyncLnk;
	@FindBy(locator = "NFK.moremenu.accountpage.diabetes.optin.chkbx")
	private QAFWebElement NFKMoreMenuAccountpageDiabetesOptinChkbx;
	@FindBy(locator = "NFK.moremenu.accountpage.lastsync.lbl")
	private QAFWebElement NFKMoremenuAccountpageLastsyncLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.withmeter.lbl")
	private QAFWebElement NFKMoremenuAccountpageWithmeterLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.withaccount.lbl")
	private QAFWebElement NFKMoremenuAccountpageWithaccountLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.accountsync.datetime.lbl")
	private QAFWebElement NFKMoremenuAccountpageAccountsyncDatetimeLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.statictext.lbl")
	private QAFWebElement NFKMoremenuAccountpageStatictextLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.keepmeloggedin.lbl")
	private QAFWebElement NFKMoremenuAccountpageKeepmeloggedinLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.keepmeloggedin.switch")
	private QAFWebElement NFKMoremenuAccountpageKeepmeloggedinSwitch;
	@FindBy(locator = "NFK.moremenu.accountpage.touchid.switch")
	private QAFWebElement NFKMoremenuAccountpageTouchIDSwitch;
	@FindBy(locator = "NFK.moremenu.accountpage.edit.btn")
	private QAFWebElement NFKMoremenuAccountpageEditBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.suffix.txt")
	private QAFWebElement NFKMoremenuAccountpageSuffixTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.address1.txt")
	private QAFWebElement NFKMoremenuAccountpageAddress1Txt;
	@FindBy(locator = "NFK.moremenu.accountpage.address2.txt")
	private QAFWebElement NFKMoremenuAccountpageAddress2Txt;
	@FindBy(locator = "NFK.moremenu.accountpage.address3.txt")
	private QAFWebElement NFKMoremenuAccountpageAddress3Txt;
	@FindBy(locator = "NFK.moremenu.accountpage.city.txt")
	private QAFWebElement NFKMoremenuAccountpageCityTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.state.txt")
	private QAFWebElement NFKMoremenuAccountpageStateTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.select.state.radiobtn")
	private QAFWebElement NFKMoremenuAccountpageSelectStateRadiobtn;
	@FindBy(locator = "NFK.moremenu.accountpage.state.done.btn")
	private QAFWebElement NFKMoremenuAccountpageStateDoneBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.zipcode.txt")
	private QAFWebElement NFKMoremenuAccountpageZipcodeTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.phonenumber.txt")
	private QAFWebElement NFKMoremenuAccountpagePhonenumberTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.email.txt")
	private QAFWebElement NFKMoremenuAccountpageEmailTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.firstname.txt")
	private QAFWebElement NFKMoremenuAccountpageFirstnameTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.lastname.txt")
	private QAFWebElement NFKMoremenuAccountpageLastnameTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.middlename.txt")
	private QAFWebElement NFKMoremenuAccountpageMiddlenameTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.dateofbirth.txt")
	private QAFWebElement NFKMoremenuAccountpageDateofbirthTxt;
	@FindBy(locator = "NFK.moremenu.accountpage.save.btn")
	private QAFWebElement NFKMoremenuAccountpageSaveBtn;
	@FindBy(locator = "NFK.moremenu.accountpage.picker.year.pkr")
	private QAFWebElement NFKMoremenuAccountpagePickerYearPkr;
	@FindBy(locator = "NFK.moremenu.accountpage.picker.date.lbl")
	private QAFWebElement NFKMoremenuAccountpagePickerDateLbl;
	@FindBy(locator = "NFK.moremenu.accountpage.dob.ok.btn")
	private QAFWebElement NFKMoremenuAccountpageDobOkBtn;
    @FindBy(locator = "NFK.moremenu.accountpage.delete1.btn")
	private List<QAFWebElement> NFKMoremenuAccountpageDelete1Btn;
    @FindBy(locator="NFK.moremenu.accountpage.delete.btn")
    private QAFWebElement NFKMoremenuAccountpageDeleteBtn;
    @FindBy (locator="NFK.moremenu.accountpage.delete.message.lbl")
    private QAFWebElement NFKMoremenuAccountpageDeleteMessageLbl;
    @FindBy(locator="NFK.moremenu.accountpage.delete.email.txt")
    private QAFWebElement NFKMoremenuAccountpageDeleteEmailTxt;
    @FindBy(locator="NFK.moremenu.accountpage.delete.password.txt")
    private QAFWebElement NFKMoremenuAccountpageDeletePasswordTxt;
    @FindBy(locator="NFK.moremenu.accountpage.delete.ack.checkbox")
    private QAFWebElement NFKMoremenuAccountpageDeleteAckCheckbox;
    @FindBy(locator="NFK.moremenu.accountpage.delete.confirmdelete.checkbox")
    private QAFWebElement NFKMoremenuAccountpageDeleteConfirmdeleteCheckbox;
    @FindBy(locator="NFK.moremenu.accountpage.delete.deleteaccount.btn")
    private QAFWebElement NFKMoremenuAccountpageDeleteDeleteaccountBtn;
    @FindBy(locator = "NFK.moremenu.accountpage.back.btn")
	private QAFWebElement NFKMoremenuAccountpageBackBtn;
    @FindBy(locator = "NFK.moremenu.accountpage.optin.chkbx")
	private QAFWebElement NFKMoremenuAccountpageOptinChkbx;
    @FindBy(locator = "NFK.moremenu.accountpage.deleteaccount.btn")
	private QAFWebElement NFKMoremenuAccountpageDeleteaccountBtn;
    @FindBy(locator = "NFK.moremenu.accountpage.iagree.btn")
	private QAFWebElement NFKMoremenuAccountpageIagreeBtn;
    @FindBy(locator = "NFK.moremenu.accountpage.acknowledge.chkbx")
	private QAFWebElement NFKMoremenuAccountpageAcknowledgeChkbx;
    @FindBy(locator = "NFK.moremenu.accountpage.iassuredelete.chkbx")
	private QAFWebElement NFKMoremenuAccountpageIassuredeleteChkbx;
    @FindBy(locator = "NFK.moremenu.accountpage.revokeconsent.chkbx")
	private QAFWebElement NFKMoremenuAccountpageRevokeconsentChkbx;
    //Change password
    @FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Title")
    private QAFWebElement NFKMoremenuAccountpageChangePasswordTitle;
    @FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Current.Password.Field")
    private QAFWebElement NFKMoremenuAccountpageChangePasswordCurrentPasswordField;
    @FindBy(locator = "NFK.moremenu.accountpage.Change.Password.New.Password.Field")
    private QAFWebElement NFKMoremenuAccountpageChangePasswordNewPasswordField;
    @FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Confirm.Password.Field")
    private QAFWebElement NFKMoremenuAccountpageChangePasswordConfirmPasswordField;
    @FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Save.Changes.Button")
    private QAFWebElement NFKMoremenuAccountpageChangePasswordSaveChangesButton;
    @FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Cancel.Button")
    private QAFWebElement NFKMoremenuAccountpageChangePasswordCancelButton;
    @FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Forgot.Your.Password.link")
    private QAFWebElement NFKMoremenuAccountpageChangePasswordForgotYourPasswordLink;
    @FindBy(locator = "NFK.moremenu.accountpage.Change.Password.Back.Button")
    private QAFWebElement NFKMoremenuAccountpageChangePasswordBackButton;
    @FindBy(locator = "NFK.moremenu.accountpage.Change.password.btn")
    private QAFWebElement NFKMoremenuAccountpageChangePasswordBtn;
    @FindBy(locator = "NFK.moremenu.accountpage.Save.Changes.btn")
    private QAFWebElement NFKMoremenuAccountpageSaveChangesButton;
    @FindBy(locator = "NFK.moremenu.accountpage.Change.password.email.address")
    private QAFWebElement NFKMoremenuAccountpageChangePasswordemailaddress;
    @FindBy(locator = "NFK.moremenu.accountpage.Changed.password")
    private QAFWebElement NFKMoremenuAccountpageChangedPassword;
 
    
    public QAFWebElement getNFKMoremenuAccountpageChangedPassword() {
    return NFKMoremenuAccountpageChangedPassword;
    }
    public QAFWebElement getNFKMoremenuAccountpageChangePasswordButton() {
    	return NFKMoremenuAccountpageChangePasswordBtn;
    }

    public QAFWebElement getNFKMoremenuAccountpageChangePasswordemailaddress() {
    return NFKMoremenuAccountpageChangePasswordemailaddress;
    }


    public QAFWebElement getNFKMoremenuAccountpageSaveChangesButton() {
    return NFKMoremenuAccountpageSaveChangesButton;
    }

    public QAFWebElement getNFKMoremenuAccountpageChangePasswordBackButton() {
    return NFKMoremenuAccountpageChangePasswordBackButton;
    }

    public QAFWebElement getNFKMoremenuAccountpageChangePasswordForgotYourPasswordLink() {
    return NFKMoremenuAccountpageChangePasswordForgotYourPasswordLink;
    }

    public QAFWebElement getNFKMoremenuAccountpageChangePasswordCancelButton() {
    return NFKMoremenuAccountpageChangePasswordCancelButton;
    }

    public QAFWebElement getNFKMoremenuAccountpageChangePasswordSaveChangesButton() {
    return NFKMoremenuAccountpageChangePasswordSaveChangesButton;
    }

    public QAFWebElement getNFKMoremenuAccountpageChangePasswordConfirmPasswordField() {
    return NFKMoremenuAccountpageChangePasswordConfirmPasswordField;
    }

    public QAFWebElement getNFKMoremenuAccountpageChangePasswordNewPasswordField() {
    return NFKMoremenuAccountpageChangePasswordNewPasswordField;
    }

    public QAFWebElement getNFKMoremenuAccountpageChangePasswordCurrentPasswordField() {
    return NFKMoremenuAccountpageChangePasswordCurrentPasswordField;
    }

    public QAFWebElement getNFKMoremenuAccountpageChangePasswordTitle() {
    return NFKMoremenuAccountpageChangePasswordTitle;
    }
    public QAFWebElement getNFKMoremenuAccountpageDeleteBtn() {
    	return NFKMoremenuAccountpageDeleteBtn;
    }
    public QAFWebElement getNFKMoremenuAccountpageDeleteMessageLbl() {
    	return NFKMoremenuAccountpageDeleteMessageLbl;
    }
    public QAFWebElement getNFKMoremenuAccountpageDeleteEmailTxt() {
    	return NFKMoremenuAccountpageDeleteEmailTxt;
    }
    public QAFWebElement getNFKMoremenuAccountpageDeletePasswordTxt() {
    	return NFKMoremenuAccountpageDeletePasswordTxt;
    }
    public QAFWebElement getNFKMoremenuAccountpageDeleteAckCheckbox() {
    	return NFKMoremenuAccountpageDeleteAckCheckbox;
    }
	public QAFWebElement getNFKMoremenuAccountpageEditBtn() {
		return NFKMoremenuAccountpageEditBtn;
	}
    public QAFWebElement getNFKMoremenuAccountpageDeleteConfirmdeleteCheckbox() {
    	return NFKMoremenuAccountpageDeleteConfirmdeleteCheckbox;
    }
	public QAFWebElement getNFKMoremenuAccountpageSelectStateRadiobtn() {
		return NFKMoremenuAccountpageSelectStateRadiobtn;

	}
	public QAFWebElement getNFKMoremenuAccountpageDeleteDeleteaccountBtn() {
		return NFKMoremenuAccountpageDeleteDeleteaccountBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpagePickerDateLbl() {
		return NFKMoremenuAccountpagePickerDateLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageStateDoneBtn() {
		return NFKMoremenuAccountpageStateDoneBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpageEmailTxt() {
		return NFKMoremenuAccountpageEmailTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageFirstnameTxt() {
		return NFKMoremenuAccountpageFirstnameTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageLastnameTxt() {
		return NFKMoremenuAccountpageLastnameTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageMiddlenameTxt() {
		return NFKMoremenuAccountpageMiddlenameTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageSuffixTxt() {
		return NFKMoremenuAccountpageSuffixTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageAddress1Txt() {
		return NFKMoremenuAccountpageAddress1Txt;
	}

	public QAFWebElement getNFKMoremenuAccountpageAddress2Txt() {
		return NFKMoremenuAccountpageAddress2Txt;
	}

	public QAFWebElement getNFKMoremenuAccountpageCityTxt() {
		return NFKMoremenuAccountpageCityTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageStateTxt() {
		return NFKMoremenuAccountpageStateTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageZipcodeTxt() {
		return NFKMoremenuAccountpageZipcodeTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpagePhonenumberTxt() {
		return NFKMoremenuAccountpagePhonenumberTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageAddress3Txt() {
		return NFKMoremenuAccountpageAddress3Txt;
	}

	public QAFWebElement getNFKMoremenuAccountpageDateofbirthTxt() {
		return NFKMoremenuAccountpageDateofbirthTxt;
	}

	public QAFWebElement getNFKMoremenuAccountpageSaveBtn() {
		return NFKMoremenuAccountpageSaveBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpagePickerYearPkr() {
		return NFKMoremenuAccountpagePickerYearPkr;
	}

	public QAFWebElement getNFKMoremenuAccountpageTouchIDSwitch() {
		return NFKMoremenuAccountpageTouchIDSwitch;
	}

	public QAFWebElement getNFKMoreMenuAccountpageDiabetesOptinChkbx() {
		return NFKMoreMenuAccountpageDiabetesOptinChkbx;
	}

	public QAFWebElement getNFKMoremenuAccountpageAccountsyncLnk() {
		return NFKMoremenuAccountpageAccountsyncLnk;
	}

	public QAFWebElement getNFKMoremenuAccountpageLastsyncLbl() {
		return NFKMoremenuAccountpageLastsyncLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageWithmeterLbl() {
		return NFKMoremenuAccountpageWithmeterLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageWithaccountLbl() {
		return NFKMoremenuAccountpageWithaccountLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageAccountsyncDatetimeLbl() {
		return NFKMoremenuAccountpageAccountsyncDatetimeLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageStatictextLbl(String Text) {
		return LFSUtilsAndroid.getElement("NFK.moremenu.accountpage.statictext.lbl", Text);
	}

	public QAFWebElement getNFKMoremenuAccountpageKeepmeloggedinLbl() {
		return NFKMoremenuAccountpageKeepmeloggedinLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageKeepmeloggedinSwitch() {
		return NFKMoremenuAccountpageKeepmeloggedinSwitch;
	}

	public QAFWebElement getNFKSignuppageDobOkBtn() {
		return NFKMoremenuAccountpageDobOkBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKMoremenuAccountpageHeadingLbl() {
		return NFKMoremenuAccountpageHeadingLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageAccntdtlsLbl() {
		return NFKMoremenuAccountpageAccntdtlsLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageUseremailLbl() {
		return NFKMoremenuAccountpageUseremailLbl;
	}

	public QAFWebElement getNFKMoremenuAccountpageLogoutBtn() {
		return NFKMoremenuAccountpageLogoutBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpageBackBtn() {
		return NFKMoremenuAccountpageBackBtn;
	}

	public QAFWebElement getNFKMoremenuAccountpageDeleteaccountBtn() {
		return NFKMoremenuAccountpageDeleteaccountBtn;
	}


	public QAFWebElement getNFKMoremenuAccountpageOptinChkbx() {
		return NFKMoremenuAccountpageOptinChkbx;
	}
    	

	public QAFWebElement getNFKMoremenuAccountpageIagreeBtn() {
		return NFKMoremenuAccountpageIagreeBtn;
	}
     
	
	public List<QAFWebElement> getNFKMoremenuAccountpageDelete1Btn() {
		return NFKMoremenuAccountpageDelete1Btn;
	}
	
	
	public QAFWebElement getNFKMoremenuAccountpageAcknowledgeChkbx() {
		return NFKMoremenuAccountpageAcknowledgeChkbx;
	}


	public QAFWebElement getNFKMoremenuAccountpageIassuredeleteChkbx() {
		return NFKMoremenuAccountpageIassuredeleteChkbx;
	}


	public QAFWebElement getNFKMoremenuAccountpageRevokeconsentChkbx() {
		return NFKMoremenuAccountpageRevokeconsentChkbx;
	}


	// Method to verify opt-in checkbox
	public void OptinCheckBox() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		if (getNFKMoreMenuAccountpageDiabetesOptinChkbx().isSelected())
		{
			Reporter.logWithScreenShot("User has optin to receive diabetes related information", MessageTypes.Pass);
		}
		else
		{
			Reporter.logWithScreenShot("User has optout to receive diabetes related information", MessageTypes.Pass);
		}
	}

	// Method to verify Account Page
	public void verifyAccountPage(Object userDetail) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		WebDriverTestCase.verifyTrue(
				getNFKMoremenuAccountpageUseremailLbl().getAttribute("text").equalsIgnoreCase(userBean.getEmailID()),
				userBean.getEmailID() + "Expected   Actual "
						+ getNFKMoremenuAccountpageUseremailLbl().getAttribute("text"),
				"Correct email ID");
		getNFKMoremenuAccountpageLogoutBtn().verifyPresent("Sign out button");
		getNFKMoremenuAccountpageAccountsyncDatetimeLbl().verifyPresent("Account last sync time");
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		getNFKMoremenuAccountpageKeepmeloggedinSwitch().verifyPresent("Keep me logged in switch");

	}

	public void selectOptin() {
		SignupPageAndroid android = new SignupPageAndroid();
		getNFKMoreMenuAccountpageDiabetesOptinChkbx().waitForPresent();
		if (getNFKMoreMenuAccountpageDiabetesOptinChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("false")) {
			getNFKMoreMenuAccountpageDiabetesOptinChkbx().click();
			android.getNFKSignuppageIagreeBtn().waitForPresent(2000);
			android.getNFKSignuppageIagreeBtn().click();

			Reporter.logWithScreenShot("Option is checked successfully", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Option is already checked", MessageTypes.Pass);
	}

	// method to enable keep me login btn on account screen
	public void enableKeepMeLoginSwitch() {
		if (!(getNFKMoremenuAccountpageKeepmeloggedinSwitch().getAttribute("checkble").contains("true"))) {
			getNFKMoremenuAccountpageKeepmeloggedinSwitch().click();
		}
	}

	// method to verify that keep me login is selected on account screen
	public void keepMeLoginSelected() {
		getNFKMoremenuAccountpageKeepmeloggedinSwitch().verifyPresent("Keep Me Login Button Present");
		getNFKMoremenuAccountpageKeepmeloggedinSwitch().verifyEnabled("Keep Me Login Button Enabled");
		Reporter.logWithScreenShot("Keep Me login button Present and enabled", MessageTypes.Pass);
	}

	// method to verify that Touch ID is selected on account screen
	public void touchIDSelected() {
		if (getNFKMoremenuAccountpageTouchIDSwitch().isDisplayed()) {
			getNFKMoremenuAccountpageTouchIDSwitch().verifyPresent("Keep Me Login Button Present");
			getNFKMoremenuAccountpageTouchIDSwitch().verifyEnabled("Keep Me Login Button Enabled");
			Reporter.logWithScreenShot("Keep Me login button Present and enabled", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("touch id is not ptresent ", MessageTypes.Pass);
		}
	}

	// Method to click on edit profile button on delete account page
	public void clickEditProfileButton() {
		getNFKMoremenuAccountpageEditBtn().waitForPresent();
		getNFKMoremenuAccountpageEditBtn().click();
		Reporter.logWithScreenShot("edit clicked", MessageTypes.Pass);
		LFSUtilsIOS.pause(4000);

	}

	public void selectBirthDate(UserDetailBeans userDetails) {
		SignupPageAndroid sign = new SignupPageAndroid();
		if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayDate()));
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerMonthLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			Reporter.log("valid date");
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("hr-hr")) {
			System.out.println("In Dob method... hr hr");
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerMonthLbl(),
					Integer.parseInt(userDetails.getBirthdayDate()));
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("sl-sl")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerMonthLbl(),
					Integer.parseInt(userDetails.getBirthdayDate()));
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("pl-pl")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("cz-cz")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("fr-fr")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("en-ph")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else if (pageProps.getString("language.name").equalsIgnoreCase("vi-vi")) {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		} else {
			sign.getNFKSignupPagePickerDateLbl().waitForPresent();
			// LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
			// Integer.parseInt(userDetails.getBirthdayYear1()));
			LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
					Integer.parseInt(userDetails.getBirthdayYear()));
			sign.getNFKsignuppageimportantmessageokbtn().click();
		}

	}

	public QAFWebElement getNFKMoremenuaccountpageImportantmessageokBtn() {
		return NFKMoremenuaccountpageImportantmessageokBtn;
	}

	@FindBy(locator = "NFK.moremenu.accountpage.importantMessageOk.btn")
	private QAFWebElement NFKMoremenuaccountpageImportantmessageokBtn;

	public void editDetails(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		SignupPageAndroid signup = null;
		String email = RandomStringUtils.randomAlphabetic(12) + RandomStringUtils.randomNumeric(4) + "@gmail.com";
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Account details screen before entering details", MessageTypes.Pass);
		getNFKMoremenuAccountpageEmailTxt().click();
		LFSUtilsIOS.pause(5000);
		getNFKMoremenuAccountpageEmailTxt().clear();
		getNFKMoremenuAccountpageEmailTxt().sendKeys(email);

		// email stored in key
		ConfigurationManager.getBundle().setProperty("register.editemail.key", email);
		
		getNFKMoremenuAccountpageFirstnameTxt().click();
		getNFKMoremenuAccountpageFirstnameTxt().clear();
		getNFKMoremenuAccountpageFirstnameTxt().sendKeys(userBean.getFirstName());
		// FirstName stored in FirstName
		ConfigurationManager.getBundle().setProperty("register.editfirstname.key", userBean.getFirstName());
		getNFKMoremenuAccountpageMiddlenameTxt().click();
		getNFKMoremenuAccountpageMiddlenameTxt().clear();
		getNFKMoremenuAccountpageMiddlenameTxt().sendKeys(userBean.getMiddleName());
		getNFKMoremenuAccountpageLastnameTxt().click();
		getNFKMoremenuAccountpageLastnameTxt().clear();
		getNFKMoremenuAccountpageLastnameTxt().sendKeys(userBean.getLastName());
		// LastName stored in LastName
		ConfigurationManager.getBundle().setProperty("register.editlastname.key", userBean.getLastName());
		getNFKMoremenuAccountpageSuffixTxt().click();
		getNFKMoremenuAccountpageSuffixTxt().clear();
		getNFKMoremenuAccountpageSuffixTxt().sendKeys(userBean.getSuffix());
		LFSUtilsAndroid.waitforLoad();
		getNFKMoremenuAccountpageDateofbirthTxt().click();
		LFSUtilsAndroid.waitforLoad();
		selectBirthDate(userBean);
		// selectDOB(userBean);
		getNFKMoremenuAccountpageAddress1Txt().click();
		getNFKMoremenuAccountpageAddress1Txt().clear();
		getNFKMoremenuAccountpageAddress1Txt().sendKeys(userBean.getAddress1());
		LFSUtilsAndroid.hideKeyboard();
		getNFKMoremenuAccountpageAddress2Txt().click();
		getNFKMoremenuAccountpageAddress2Txt().clear();
		getNFKMoremenuAccountpageAddress2Txt().sendKeys(userBean.getAddress2());
		LFSUtilsAndroid.hideKeyboard();
		getNFKMoremenuAccountpageAddress3Txt().click();
		getNFKMoremenuAccountpageAddress3Txt().clear();
		getNFKMoremenuAccountpageAddress3Txt().sendKeys(userBean.getAddress3());
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKMoremenuAccountpageCityTxt().click();
		getNFKMoremenuAccountpageCityTxt().clear();
		getNFKMoremenuAccountpageCityTxt().sendKeys(userBean.getCity());
		selectState(userBean.getState());
		LFSUtilsIOS.pause(5000);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 50, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 50, 50, 10, 10);
		getNFKMoremenuAccountpageZipcodeTxt().click();
		getNFKMoremenuAccountpageZipcodeTxt().clear();
		getNFKMoremenuAccountpageZipcodeTxt().sendKeys(userBean.getZipCode());
		LFSUtilsAndroid.hideKeyboard();
		getNFKMoremenuAccountpagePhonenumberTxt().click();
		getNFKMoremenuAccountpagePhonenumberTxt().clear();
		getNFKMoremenuAccountpagePhonenumberTxt().sendKeys(userBean.getPhoneNumber());
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("The user had updated the profile details", MessageTypes.Pass);
	}

	public void selectDOB(UserDetailBeans userBean) {
		// TODO Auto-generated method stub
		// getNFKMoremenuaccountpagePickerDateLbl().waitForPresent();
		getNFKMoremenuAccountpagePickerYearPkr().isPresent();
		getNFKMoremenuAccountpagePickerYearPkr().click();
		System.out.println("Birth year is" + userBean.getBirthdayYear());
		LFSUtilsAndroid.scrollToEleAndriodDOB(userBean.getBirthdayYear());
		LFSUtilsAndroid.clickWithText(userBean.getBirthdayYear());
		// getNFKsignuppageimportantmessageokbtn().click();
		getNFKSignuppageDobOkBtn().click();
	}

	public void selectState(String string) {

		getNFKMoremenuAccountpageStateTxt().isPresent();
		getNFKMoremenuAccountpageStateTxt().click();
		LFSUtilsAndroid.scrollToEleAndriodDOB(string);
		LFSUtilsAndroid.clickWithText(string);
		getNFKMoremenuAccountpageStateDoneBtn().click();

	}

	// Method to click on save button on delete account page to save the edited
	// profile
	public void clickSaveButton() {
		if (getNFKMoremenuAccountpageSaveBtn().isDisplayed()) {
			getNFKMoremenuAccountpageSaveBtn().click();

		}

	}

	// Verify the profile after editing
	public void verifyAfterEditing() {

		getNFKMoremenuAccountpageEditBtn().waitForPresent();
	

		String emailbeforeEditing = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		 String emailafterEditing = (String) ConfigurationManager.getBundle().getProperty("register.editemail.key");

		if (!emailbeforeEditing.equals(emailafterEditing)) {
			Validator.verifyThat("The user profile details edited successfully", emailbeforeEditing,
					Matchers.not(emailafterEditing));
		} else {
			Reporter.log("The user profile details not edited successfully !!");
		}

		String FnamebeforeEditing = (String) ConfigurationManager.getBundle().getProperty("register.firstname.key");
		String FnameafterEditing = (String) ConfigurationManager.getBundle().getProperty("register.editfirstname.key");
		if (!FnamebeforeEditing.equals(FnameafterEditing)) {

			Validator.verifyThat("The user profile details edited successfully", FnamebeforeEditing,
					Matchers.not(FnameafterEditing));
		} else {
			Reporter.log("The user profile details not edited successfully !!");
		}
		
		String LnamebeforeEditing = (String) ConfigurationManager.getBundle().getProperty("register.lastname.key");
		String LnameafterEditing = (String) ConfigurationManager.getBundle().getProperty("register.editlastname.key");
		if (!LnamebeforeEditing.equals(LnameafterEditing)) {

			Validator.verifyThat("The user profile details edited successfully", LnamebeforeEditing,
					Matchers.not(LnameafterEditing));
		} else {
			Reporter.log("The user profile details not edited successfully !!");
		}
	}

	public void clickBackButton() {
		if (getNFKMoremenuAccountpageBackBtn().isDisplayed()) {
			getNFKMoremenuAccountpageBackBtn().click();
		}
	}

	// GDPR methodds
	// TO DO: method to click on delete account button

	public void clickDeleteButton() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKMoremenuAccountpageDeleteaccountBtn()
				.verifyPresent("Delete account button is present on account page");
		getNFKMoremenuAccountpageDeleteaccountBtn().click();
	}

	public void verifyInvalidDetails() {

		getNFKMoremenuAccountpageEmailTxt().clear();
		getNFKMoremenuAccountpageEmailTxt().sendKeys("###@.com");
		getNFKMoremenuAccountpageSaveBtn().click();
		System.out.println(ConfigurationManager.getBundle().getFileName()
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		getNFKMoremenuAccountpageEmailTxt().clear();
		getNFKMoremenuAccountpageEmailTxt().sendKeys("abcd@.com");
		getNFKMoremenuAccountpageSaveBtn().click();
		getNFKMoremenuAccountpageEmailTxt().clear();
		getNFKMoremenuAccountpageEmailTxt().sendKeys("doshaheentt+72@gmail.com");
		getNFKMoremenuAccountpageSaveBtn().click();

		if (getNFKMoremenuAccountpageStatictextLbl(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("email id already exist popup is displayed", MessageTypes.Pass);
			getNFKMoremenuAccountpageStatictextLbl(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.click();
		} else
			Reporter.logWithScreenShot("email id already exist popup is not displayed", MessageTypes.Pass);
		getNFKMoremenuAccountpageFirstnameTxt().clear();
		getNFKMoremenuAccountpageFirstnameTxt().sendKeys("###$$%%%%^^^^(((++");
		getNFKMoremenuAccountpageSaveBtn().click();
		getNFKMoremenuAccountpageFirstnameTxt().clear();
		getNFKMoremenuAccountpageSaveBtn().click();
		getNFKMoremenuAccountpageStatictextLbl(LFSUtilsAndroid.getPropString("account.fillFields"))
				.verifyPresent("First Name text field is blank. Kindly enter your first name");
		getNFKMoremenuAccountpageFirstnameTxt().sendKeys("firstName");
		Reporter.logWithScreenShot("First name is valid", MessageTypes.Pass);

		getNFKMoremenuAccountpageLastnameTxt().clear();
		getNFKMoremenuAccountpageLastnameTxt().sendKeys("###$$%%%%^^^^(((++");
		getNFKMoremenuAccountpageSaveBtn().click();
		getNFKMoremenuAccountpageLastnameTxt().clear();
		getNFKMoremenuAccountpageSaveBtn().click();
		getNFKMoremenuAccountpageStatictextLbl(LFSUtilsAndroid.getPropString("account.fillFields"))
				.verifyPresent("Last Name text field is blank. Kindly enter your Last name");
		getNFKMoremenuAccountpageFirstnameTxt().sendKeys("lastName");
		Reporter.logWithScreenShot("Last name is valid", MessageTypes.Pass);
		getNFKMoremenuAccountpageSaveBtn().click();

	}

	public void checkOptinOptionForMarketing() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKMoremenuAccountpageOptinChkbx().verifyPresent("Marketing opt-in checkbox is present");
		getNFKMoremenuAccountpageOptinChkbx().click();
	}

	public void verifyOptionForMarketing() {
		if (getNFKMoremenuAccountpageOptinChkbx().getAttribute("checked").equals("false")) {
			Reporter.logWithScreenShot("Marketing opt-in checkbox is not selected", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Marketing opt-in checkbox is not selected", MessageTypes.Pass);
	}

	public void agreeOptinCheckbox() {
		if (getNFKMoremenuAccountpageIagreeBtn().isDisplayed()) {
			getNFKMoremenuAccountpageIagreeBtn().verifyPresent("I agree Button is Present");
			getNFKMoremenuAccountpageIagreeBtn().click();
		}
	}

	public void withdrawConsentForDelete() {
		if (getNFKMoremenuAccountpageAcknowledgeChkbx().getAttribute("checked").equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("Checkbox is already checked", MessageTypes.Pass);
		} else {

			getNFKMoremenuAccountpageAcknowledgeChkbx().click();
			Reporter.logWithScreenShot("Acknowledge checkbox is checked successfully", MessageTypes.Pass);
		}

		if (getNFKMoremenuAccountpageIassuredeleteChkbx().getAttribute("checked").equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("Checkbox is already checked", MessageTypes.Pass);
		} else {

			getNFKMoremenuAccountpageIassuredeleteChkbx().click();
			Reporter.logWithScreenShot("I Assure checkbox is checked successfully", MessageTypes.Pass);
		}

	}

	// Method to verify delete button is enabled or not
	public void verifyDeleteButtonEnable() {
		if (getNFKMoremenuAccountpageDeleteDeleteaccountBtn().isEnabled()) {
			Reporter.logWithScreenShot("Delete button is enabled", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Delete button is not enabled", MessageTypes.Fail);

	}

	public void uncheckConsentChkbx() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKMoremenuAccountpageRevokeconsentChkbx().verifyPresent("Consent page checkbox is present");
		getNFKMoremenuAccountpageRevokeconsentChkbx().click();
		Reporter.logWithScreenShot("Delete Account page is displayed", MessageTypes.Pass);
	}

	// Method to agree consent and confirmation screen
	public void agreeConsentAndConfirmation() {
		getNFKMoremenuAccountpageDeleteAckCheckbox().verifyPresent("I Acknowledge checkbox is present");
		getNFKMoremenuAccountpageDeleteAckCheckbox().click();
		getNFKMoremenuAccountpageDeleteConfirmdeleteCheckbox().verifyPresent("I assure permanent delete checkbox is present");
		getNFKMoremenuAccountpageDeleteConfirmdeleteCheckbox().click();
	}

	// Method to delete user account permanently
	public void deleteAccountPermnently() {
		getNFKMoremenuAccountpageDeleteDeleteaccountBtn().click();
		LFSUtilsAndroid.pause(2000);
		Reporter.logWithScreenShot("Delete account confirmation popup is displayed", MessageTypes.Pass);
		LFSUtilsAndroid.pause(2000);
		SignupPageAndroid sign = new SignupPageAndroid();
		sign.getNFKsignuppageimportantmessageokbtn().click();

	}

	public void verifyPatientPermanentDelete() {
		SignupPageAndroid sign = new SignupPageAndroid();

		if (sign.getNFKsignuppageimportantmessageokbtn().isDisplayed()) {
			Reporter.logWithScreenShot("Invalid username or password message popup is displayed", MessageTypes.Pass);
			sign.getNFKsignuppageimportantmessageokbtn().click();

		} else {
			Reporter.logWithScreenShot("Ok button is not clicked", MessageTypes.Pass);
		}
	
	}

	public void verifyDeletebtnonAccount() {
		LFSUtilsAndroid.swipeWithScreenPercent(40, 70, 40, 0, 200);
		LFSUtilsAndroid.swipeWithScreenPercent(40, 70, 40, 0, 200);
		LFSUtilsAndroid.waitforLoad();
		getNFKMoremenuAccountpageDeleteBtn().isPresent();
		getNFKMoremenuAccountpageDeleteBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("User has clicked on Delete button", MessageTypes.Pass);
	}

	public void verifydeleteaccscreenAndroid() {
		getNFKMoremenuAccountpageDeleteMessageLbl().verifyPresent("Message on delete screen");
		getNFKMoremenuAccountpageDeleteEmailTxt().getAttribute("Email").isEmpty();
		getNFKMoremenuAccountpageDeletePasswordTxt().getAttribute("Password").isEmpty();
		getNFKMoremenuAccountpageDeleteAckCheckbox().verifyPresent("Acknowledgment checkbox");
		getNFKMoremenuAccountpageDeleteConfirmdeleteCheckbox().verifyPresent("confirm delete pop-up");
		getNFKMoremenuAccountpageDeleteDeleteaccountBtn().verifyPresent("Delete Account button is present");		
	}
	public void editDependentDetails(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		
		String email = RandomStringUtils.randomAlphabetic(12) + RandomStringUtils.randomNumeric(4) + "@gmail.com";
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Account details screen before entering details", MessageTypes.Pass);
		getNFKMoremenuAccountpageEmailTxt().click();
		LFSUtilsIOS.pause(5000);
		getNFKMoremenuAccountpageEmailTxt().clear();
		getNFKMoremenuAccountpageEmailTxt().sendKeys(email);

		// email stored in key
		ConfigurationManager.getBundle().setProperty("register.editemail.key", email);
		
		getNFKMoremenuAccountpageFirstnameTxt().click();
		getNFKMoremenuAccountpageFirstnameTxt().clear();
	    getNFKMoremenuAccountpageFirstnameTxt().sendKeys(userBean.getDependentfname());
		// FirstName stored in FirstName
		ConfigurationManager.getBundle().setProperty("register.editfirstname.key", userBean.getDependentfname());
		getNFKMoremenuAccountpageMiddlenameTxt().click();
		getNFKMoremenuAccountpageMiddlenameTxt().clear();
		getNFKMoremenuAccountpageMiddlenameTxt().sendKeys(userBean.getDependentmname());
		getNFKMoremenuAccountpageLastnameTxt().click();
		getNFKMoremenuAccountpageLastnameTxt().clear();
		getNFKMoremenuAccountpageLastnameTxt().sendKeys(userBean.getDependentlname());
		// LastName stored in LastName
		ConfigurationManager.getBundle().setProperty("register.editlastname.key", userBean.getDependentlname());
		getNFKMoremenuAccountpageSuffixTxt().click();
		getNFKMoremenuAccountpageSuffixTxt().clear();
		getNFKMoremenuAccountpageSuffixTxt().sendKeys(userBean.getDependentsuffix());
		LFSUtilsAndroid.waitforLoad();
		getNFKMoremenuAccountpageDateofbirthTxt().click();
		sign.getNFKSignupPagePickerYearLbl().sendKeys(userBean.getDependentbirthyr());
		LFSUtilsAndroid.waitforLoad();
		getNFKSignuppageDobOkBtn().click();
		//selectDependentBirthDate(userBean);
		getNFKMoremenuAccountpageAddress1Txt().click();
		getNFKMoremenuAccountpageAddress1Txt().clear();
		getNFKMoremenuAccountpageAddress1Txt().sendKeys(userBean.getDependentaddress1());
		LFSUtilsAndroid.hideKeyboard();
		getNFKMoremenuAccountpageAddress2Txt().click();
		getNFKMoremenuAccountpageAddress2Txt().clear();
		getNFKMoremenuAccountpageAddress2Txt().sendKeys(userBean.getDependentaddress2());
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKMoremenuAccountpageAddress3Txt().click();
		getNFKMoremenuAccountpageAddress3Txt().clear();
		getNFKMoremenuAccountpageAddress3Txt().sendKeys(userBean.getDependentaddress3());
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKMoremenuAccountpageCityTxt().click();
		getNFKMoremenuAccountpageCityTxt().clear();
		getNFKMoremenuAccountpageCityTxt().sendKeys(userBean.getDependentcity());
		String state=userBean.getDependentstate();
		selectState(userBean.getDependentstate());
		LFSUtilsAndroid.pause(5000);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 50, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 50, 50, 10, 10);
		getNFKMoremenuAccountpageZipcodeTxt().click();
		getNFKMoremenuAccountpageZipcodeTxt().clear();
		getNFKMoremenuAccountpageZipcodeTxt().sendKeys(userBean.getDependentzipcode());
		getNFKMoremenuAccountpagePhonenumberTxt().click();
		getNFKMoremenuAccountpagePhonenumberTxt().clear();
		getNFKMoremenuAccountpagePhonenumberTxt().sendKeys(userBean.getDependentphone());
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("The user had updated the profile details", MessageTypes.Pass);
		
	}
	private void selectDependentBirthDate(UserDetailBeans userDetails) {
		SignupPageAndroid sign = new SignupPageAndroid();
		sign.getNFKSignupPagePickerDateLbl().waitForPresent();
		// LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
		// Integer.parseInt(userDetails.getBirthdayYear1()));
             sign.getNFKSignupPagePickerYearLbl().click();
             sign.getNFKSignupPagePickerYearLbl().sendKeys(userDetails.getDependentDOByear());
		//LFSUtilsAndroid.selectPicker(sign.getNFKSignupPagePickerYearLbl(),
			//	Integer.parseInt(userDetails.getDependentDOByear()));
		sign.getNFKsignuppageimportantmessageokbtn().click();
		
	}
	public void enterPasswordClickLogin() {
		LFSUtilsAndroid.waitforLoad();
		LoginPageAndroid login=new LoginPageAndroid();
		login.getNFKloginpagepasswordtxt().sendKeys(ConfigurationManager.getBundle().getPropertyValue("password"));
		Reporter.logWithScreenShot("password entered",MessageTypes.Pass);
		login.getNFKForgotPasswordSenEmailBtn().click();
	}
	public void verifyDependentDetailsAfterEdit(Object userDetails) {
          
    UserDetailBeans userBean = new UserDetailBeans();
		
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		
		getNFKMoremenuAccountpageEmailTxt().getText().equals(ConfigurationManager.getBundle()
				.getString("register.editemail.key"));
		getNFKMoremenuAccountpageFirstnameTxt().getText().equals(ConfigurationManager.getBundle().
				getString("register.editfirstname.key"));
		getNFKMoremenuAccountpageLastnameTxt().getText().equals(ConfigurationManager.getBundle().
				getProperty("register.editlastname.key"));
		getNFKMoremenuAccountpageSuffixTxt().getText().equals(userBean.getDependentmname());
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.waitforLoad();
		getNFKMoremenuAccountpageAddress1Txt().getText().equals(userBean.getDependentaddress1());
		getNFKMoremenuAccountpageAddress2Txt().getText().equals(userBean.getDependentaddress2());
		getNFKMoremenuAccountpageAddress3Txt().getText().equals(userBean.getDependentaddress3());
		Reporter.logWithScreenShot("Verified the deatils",MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKMoremenuAccountpageCityTxt().getText().equals(userBean.getDependentcity());
		getNFKMoremenuAccountpageZipcodeTxt().getText().equals(userBean.getDependentzipcode());
		getNFKMoremenuAccountpagePhonenumberTxt().getText().equals(userBean.getPhoneNumber());
	}
	
	//Click on Change password and verify screen
	public void clickChangePasswordButton() {
	if (getNFKMoremenuAccountpageChangePasswordButton().isDisplayed()) {
	getNFKMoremenuAccountpageChangePasswordButton().click();
	}
	}

	//Verfiy Change password screen
	public void clickChangePasswordScreen() {

	getNFKMoremenuAccountpageChangePasswordTitle().isPresent();
	getNFKMoremenuAccountpageChangePasswordCurrentPasswordField().isPresent();
	getNFKMoremenuAccountpageChangePasswordNewPasswordField().isPresent();
	getNFKMoremenuAccountpageChangePasswordConfirmPasswordField().isPresent();
	getNFKMoremenuAccountpageChangePasswordSaveChangesButton().isPresent();
	getNFKMoremenuAccountpageChangePasswordCancelButton().isPresent();
	getNFKMoremenuAccountpageChangePasswordForgotYourPasswordLink().isPresent();
	getNFKMoremenuAccountpageChangePasswordBackButton().isPresent();
	Reporter.logWithScreenShot("Change password screen", MessageTypes.Pass);

	}


	//Click on Cancel button from Change password screen
	public void clickChangePasswordCancelBtn() {

	getNFKMoremenuAccountpageChangePasswordCancelButton().isEnabled();
	getNFKMoremenuAccountpageChangePasswordCancelButton().click();
	Reporter.logWithScreenShot("Account screen after clicling on Cancel button", MessageTypes.Pass);
	getNFKMoremenuAccountpageChangePasswordButton().click();
	}


	//Click on save button from Change password screen
	public void clickSaveChangesBtn() {

	getNFKMoremenuAccountpageSaveChangesButton().isEnabled();
	getNFKMoremenuAccountpageSaveChangesButton().click();
	Reporter.logWithScreenShot("Account screen after changing password", MessageTypes.Pass);
	}



	//Enter Change password detail
	public void enterChangePasswordDetail(Object userDetails) {
	UserDetailBeans userBean = new UserDetailBeans();
	if (userDetails instanceof String) {

	userBean.fillFromConfig((String) userDetails);
	} else {
	userBean.fillData(userDetails);
	}

	Reporter.logWithScreenShot("Change password screen before entering details", MessageTypes.Pass);
	getNFKMoremenuAccountpageChangePasswordCurrentPasswordField().clear();
	String pass=	(String) ConfigurationManager.getBundle().getProperty("register.pass");
	System.out.println("Get Password---------"+pass);
	getNFKMoremenuAccountpageChangePasswordCurrentPasswordField().sendKeys(pass);
	getNFKMoremenuAccountpageChangePasswordNewPasswordField().clear();
	getNFKMoremenuAccountpageChangePasswordNewPasswordField().sendKeys(userBean.getNewPassword());
	getNFKMoremenuAccountpageChangePasswordConfirmPasswordField().clear();
	getNFKMoremenuAccountpageChangePasswordConfirmPasswordField().sendKeys(userBean.getNewPassword());
	Reporter.logWithScreenShot("Change password screen After entering details", MessageTypes.Pass);

	}


	//Save Change password detail
	public void saveChangePasswordDetail() {
	LFSUtilsAndroid.hideKeyboard();
	getNFKMoremenuAccountpageSaveChangesButton().waitForPresent();
	getNFKMoremenuAccountpageSaveChangesButton().click();
	}

	//Enter Changed Password Details on login screen

	public void enterchangepasswordlogindetails(Object userDetail){
	UserDetailBeans userBean = new UserDetailBeans();
	if (userDetail instanceof String) {

	userBean.fillFromConfig((String) userDetail);
	} else {
	userBean.fillData(userDetail);
	}

	SignupPageAndroid sign = new SignupPageAndroid();
	getNFKMoremenuAccountpageChangePasswordemailaddress().click();
	String str= (String) ConfigurationManager.getBundle().getProperty("register.email.key");
	getNFKMoremenuAccountpageChangePasswordemailaddress().sendKeys(str);
	System.out.println(str);
	// Properties login = ConfigurationManager.getBundle().getProperties("register.email.key");
	getNFKMoremenuAccountpageChangedPassword().click();
	getNFKMoremenuAccountpageChangedPassword().sendKeys(userBean.getNewPassword());
	Reporter.logWithScreenShot("login screen After entering details", MessageTypes.Pass);
	LFSUtilsAndroid.waitforLoad();

	}
	
	public void editUserDetails(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		String email = RandomStringUtils.randomAlphabetic(12) + RandomStringUtils.randomNumeric(4) + "@gmail.com";
		if (userDetails instanceof String) {
			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Account details screen before entering details", MessageTypes.Pass);
		getNFKMoremenuAccountpageEmailTxt().click();
		LFSUtilsIOS.pause(5000);
		getNFKMoremenuAccountpageEmailTxt().clear();
		getNFKMoremenuAccountpageEmailTxt().sendKeys(email);

		// email stored in key
		ConfigurationManager.getBundle().setProperty("update.editemail.key", email);
		
		getNFKMoremenuAccountpageFirstnameTxt().click();
		getNFKMoremenuAccountpageFirstnameTxt().clear();
	    getNFKMoremenuAccountpageFirstnameTxt().sendKeys(userBean.getFirstName());
		// FirstName stored in FirstName
		ConfigurationManager.getBundle().setProperty("update.editfirstname.key", userBean.getFirstName());
		getNFKMoremenuAccountpageLastnameTxt().click();
		getNFKMoremenuAccountpageLastnameTxt().clear();
		getNFKMoremenuAccountpageLastnameTxt().sendKeys(userBean.getLastName());
		// LastName stored in LastName
		ConfigurationManager.getBundle().setProperty("update.editlastname.key", userBean.getLastName());
		getNFKMoremenuAccountpageAddress1Txt().click();
		getNFKMoremenuAccountpageAddress1Txt().clear();
		getNFKMoremenuAccountpageAddress1Txt().sendKeys(userBean.getAddress1());
        ConfigurationManager.getBundle().setProperty("update.editAddress1.key", userBean.getAddress1());
        LFSUtilsAndroid.hideKeyboard();
        LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
     	LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
     	getNFKMoremenuAccountpageCityTxt().click();
     	getNFKMoremenuAccountpageCityTxt().clear();
     	getNFKMoremenuAccountpageCityTxt().sendKeys(userBean.getCity());
        ConfigurationManager.getBundle().setProperty("update.editCity.key", userBean.getCity());
     	LFSUtilsAndroid.hideKeyboard();
	
		Reporter.logWithScreenShot("The user had updated the profile details", MessageTypes.Pass);
		
	}
	
public void verifyUserDetailsAfterEdit(Object userDetails) {
        
	    UserDetailBeans userBean = new UserDetailBeans();
			
			if (userDetails instanceof String) {

				userBean.fillFromConfig((String) userDetails);
			} else {
				userBean.fillData(userDetails);
			}
			
			getNFKMoremenuAccountpageEmailTxt().getText().equals(ConfigurationManager.getBundle()
					.getString("update.editemail.key"));
			//System.out.println("Email Verifed");
			getNFKMoremenuAccountpageFirstnameTxt().getText().equals(ConfigurationManager.getBundle().
					getString("update.editfirstname.key"));
			//System.out.println("First Name Verifed");
			getNFKMoremenuAccountpageLastnameTxt().getText().equals(ConfigurationManager.getBundle().
					getProperty("update.editlastname.key"));
			//System.out.println("Last Name Verifed");
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.waitforLoad();
			getNFKMoremenuAccountpageAddress1Txt().getText().equals(ConfigurationManager.getBundle().getString("update.editAddress1.key"));
			//LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
			//System.out.println("City Verifed");
			getNFKMoremenuAccountpageCityTxt().getText().equals(ConfigurationManager.getBundle().getString("update.editCity.key"));
	        Reporter.logWithScreenShot("Verified the deatils",MessageTypes.Pass);

		}

}
