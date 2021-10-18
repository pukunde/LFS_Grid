package com.NFK.version1.android.steps;

import com.NFK.version1.android.pages.CountrySelectionPageAndroid;
import com.NFK.version1.android.pages.AccountPageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class AccountSteps {

	AccountPageAndroid account = new AccountPageAndroid();

	@QAFTestStep(description = "user verify account screen using {0}")
	public void verifyaccountScreen(Object userDetail) {
		account.verifyAccountPage(userDetail);  
	}

	@QAFTestStep(description = "user verifies Opt-in selection account page")
	public void verifyCheckBoxselection() {
		account.OptinCheckBox();
	}

	@QAFTestStep(description = "user select opt-in in account screen")
	public void selectOptIn() {
		account.selectOptin();
	}
    
	@QAFTestStep(description="user verifies Delete Account button and clicks on Delete")
	public void userVerifyDeleteAccountButtonOnaccountScreen(){
		account.verifyDeletebtnonAccount();
	}
	
	@QAFTestStep(description="user verifies Delete Account screen")
	public void userVerifyDeleteAccscreen(){
		account.verifydeleteaccscreenAndroid();
	}
	@QAFTestStep(description = "user enable keep me login button")
	public void enableKeepMeLoginSwtch() {
		account.enableKeepMeLoginSwitch();
	}

	// Varsha
	@QAFTestStep(description = "user verify keep me login is selected on account screen")
	public void userVerifyKeepMeLoginSelected() {
		account.keepMeLoginSelected();
	}

	// Varsha
	@QAFTestStep(description = "user verify Touch ID is selected on account screen")
	public void userVerifyTouchIDSelected() {
		account.touchIDSelected();
	}
	
	@QAFTestStep(description = "user clicks edit profile button")
	public void clickEditProfile() {
		account.clickEditProfileButton();
		
	}
	
	@QAFTestStep(description = "user edits the profile details using {0}")
	public void enterDetails(Object userDetail) {
		account.editDetails(userDetail);

	}
	@QAFTestStep(description = "user edits the dependents profile details using {0}")
	public void enterDependentDetails(Object userDetail) {
		account.editDependentDetails(userDetail);

	}
	@QAFTestStep(description = "user clicks on save button")
	public void clickSave() {
		account.clickSaveButton();
	}
	@QAFTestStep(description = "user enters password and clicks on login")
	public void entersPassword() {
		account.enterPasswordClickLogin();
	}
	@QAFTestStep(description = "user verifies profile details after editing")
	public void verifyAfterEdit() {
		account.verifyAfterEditing();
	}
	@QAFTestStep(description = "user verifies dependents edited {0} details")
	public void verifyDependentAfterEdit(Object editeddetail) {
		account.verifyDependentDetailsAfterEdit(editeddetail);
	}
	
	@QAFTestStep(description = "user clicks on back button")
	public void clickBack() {
		account.clickBackButton();
	}
	
	// GDPR Test Cases
		@QAFTestStep(description = "user clicks delete account button")
		public void clickDelete() {
			account.clickDeleteButton();
		}
		
		@QAFTestStep(description="user enters invalid user details and verify")
		public void verifyingInvalidUserDtls() {
			account.verifyInvalidDetails();
		}
		
		@QAFTestStep(description="user verifies and clicks on marketing optin checkbox")
		public void clicksMarketingOptin() {
			account.checkOptinOptionForMarketing();
		}
		
		@QAFTestStep(description="user agrees for opt-in option")
		public void agreeOptIn() {
			account.agreeOptinCheckbox();
		}
		
		@QAFTestStep(description="user again clicks to opt-out")
		public void clickToOptOut() {
			account.checkOptinOptionForMarketing();
		}
		
		@QAFTestStep(description="user verifies marketing optin checkbox is unchecked")
		public void verifyMarketingOptinchkbx() {
			account.verifyOptionForMarketing();
		}
		
		@QAFTestStep(description = "user withdraws the consent and confirmation for delete")
		public void withdrawConsent() {
			account.withdrawConsentForDelete();
		}
		@QAFTestStep(description = "user verifies delete button is enabled or not")
		public void verifyDeleteButton() {
			account.verifyDeleteButtonEnable();
		}
		
		@QAFTestStep(description = "user unchecks consent to process sensitive data checkbox")
		public void unchecksConsent() {
			account.uncheckConsentChkbx();
		}
		
		@QAFTestStep(description = "user agrees the consent and confirmation for delete")
		public void agreesConsent() {
			account.agreeConsentAndConfirmation();
		}
		
		@QAFTestStep(description = "user deletes account permanently")
		public void deleteAccount() {
			account.deleteAccountPermnently();
		}		
		
		@QAFTestStep(description = "user verifies that account is deleted permanently")
		public void verifyDeleteAccount() {
			account.verifyPatientPermanentDelete();
		}
		@QAFTestStep(description = "user gets redirected to Change Password screen")
		public void clickChangePasswordBtn() {
		account.clickChangePasswordButton();
		account.clickChangePasswordScreen();
		}

		@QAFTestStep(description = "user clicks Cancel button verifies App displays Account screen")
		public void clickChangePasswordCancelButton() {
		account.clickChangePasswordCancelBtn();
		}

		@QAFTestStep(description = "user enters details using {0} on Change Password screen")
		public void enterChangePasswordDetails(Object userDetails) {
		account.enterChangePasswordDetail(userDetails);
		}

		@QAFTestStep(description = "user clicks on Save Changes button")
		public void saveChangePasswordDetails() {
		account.saveChangePasswordDetail();
		}

		@QAFTestStep(description = "user enters login detail using {0}")
		public void saveChangePasswordDetail(Object userDetail) {
		account.enterchangepasswordlogindetails(userDetail);
		}

		@QAFTestStep(description = "user edits the user profile details using {0}")
		public void enterUserDetails(Object userDetail) {
			account.editUserDetails(userDetail);
		}
		
		@QAFTestStep(description = "user verifies edited {0} details")
		public void verifyuserAfterEdit(Object editeddetail) {
			account.verifyUserDetailsAfterEdit(editeddetail);
			
		}
}
