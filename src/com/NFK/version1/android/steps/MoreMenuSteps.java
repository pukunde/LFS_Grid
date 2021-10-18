package com.NFK.version1.android.steps;

import com.NFK.version1.android.pages.MoreMenuPageAndroid;
import com.NFK.version1.android.pages.SettingPageAndroid;
import com.NFK.version1.iOS.pages.SettingsPageIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class MoreMenuSteps {
	MoreMenuPageAndroid moreMenu = new MoreMenuPageAndroid();
	@QAFTestStep(description="user select Contact Us")
	public void selectContactUs(){
		moreMenu.clickContactUs();
	}

	
	@QAFTestStep(description="user verify available options in More menu")
	public void veriyMoreMenu(){
		moreMenu.verifyMenu();
	}
	@QAFTestStep(description="user verify list of reminders displayed in reminders screen")
    public void userVerifyListOfRemindersDisplayedInRemindersScreen(){
		moreMenu.verifyListofremainders();
    }
	
	 @QAFTestStep(description="user verifies Maximum Reminders reached Pop-up")
	    public void userClicOnReminderInRemindersScreen(){
		 moreMenu.verifyMaximumReminderPopup();
	    }
	 
	@QAFTestStep(description="user clicks on Terms Of Use link and verify")
	public void verifyTermsOfUse(){
		moreMenu.verifyTermsOfUsePage();
	}
	
	@QAFTestStep(description="user clicks Privacy Policy link and verify")
	public void verifyPrivacyPolicy(){
		moreMenu.verifyPrivacyPolicyPage();
	}

	@QAFTestStep(description = "user clicks on My Devices")
	public void clickMyDevices() {
		moreMenu.clickMyDevices();
	}

        @QAFTestStep(description = "user clicks on Settings")
	public void clickMySettings() {
		moreMenu.clickMySetting();	
	}
	
	@QAFTestStep(description = "user clicks Connections")
	public void clickConnections() {
		moreMenu.clickConnections();
	}
	
	@QAFTestStep(description = "user verifies the request connected details")
	public void userVerifiesTheRequestSubmittedDetails() {
		moreMenu.verifyConnectedStatus();
	}
	@QAFTestStep(description = "user verifies the request declined details")
	public void userVerifiesRequestDeclined() {
		moreMenu.verifydeclinedStatus();
	}
	@QAFTestStep(description = "user verifies the {0} popup")
	public void userverifiesPopup(String option) {
		moreMenu.verifyPopup(option); 
	}
	
	
//	@QAFTestStep(description = "user takes screenshots of Connections page")
//	public void screenShotsConnectionsPage() {
//		moreMenu.takeScreenshotsConnetionsPage();
//	}
	
	@QAFTestStep(description = "user verifies Connections page")
	public void verifiesConnectionPage() {
		moreMenu.takeScreenshotsConnetionsPage();
	}
	
	
	@QAFTestStep(description="user enter and verify invalid clinic code")
	public void clickAddOfficeInvalidCode(){
		moreMenu.enterAndVerifyInvalidOfficeCode();
	}
	
	@QAFTestStep(description="user verify invalid clinic code format")
	public void VerifyInvalidOfficeCodeFormats() {
		moreMenu.incorrectClinicCodeFormat();
	} 
	@QAFTestStep(description="user clicks on Help option")
	public void userClicksOnHelp(){
		moreMenu.clickHelpOption(); 
	}
	@QAFTestStep(description = "user clicks on logout button")
	public void clickOnLogoutBtn() {
		moreMenu.clickOnLogoutBtn();
	}
	
	@QAFTestStep(description="user set up a new reminder using {0}")
	public void setupReminder(String option){
		moreMenu.setReminder(option);
	}
	@QAFTestStep(description="user add new {0} reminders {1} futuredate {2} and flag as {3}")
    public void userAddNewReminderFuturedateAndFlagAs(int times,String reminderName,String date, String flag){
        moreMenu.addmultipleRemainders(times, reminderName, date, flag);
    }
	
	@QAFTestStep(description = "user create a new reminder type")
	public void setNewReminderType() {
		moreMenu.addNewReminderType();
	}
	@QAFTestStep(description = "user verify reminder screens")
	public void verifyiesReminderScreens() {
		moreMenu.verifyReminderScreens();
	}
	@QAFTestStep(description = "user add office using {0}")
	public void addOfficeForHCP(Object clinicDetail) {
		moreMenu.enterAndVerifyValidOfficeCode(clinicDetail);
	}
	
	@QAFTestStep(description = "user clicks on Account")
	public void clickOnMyAccount() {
		moreMenu.clickMyAccount();	
	}
	
	@QAFTestStep(description="user clicks on Alerts")
	public void userClicksOnMyAlerts(){
		moreMenu.clickMyAlerts();
		
	}
	
	@QAFTestStep(description = "user clicks on Reminder")
	public void clickOnMyReminder() {
		moreMenu.clickOnReminderFromMoreMenu();
	}
	
	@QAFTestStep(description = "user verify reminder type name allowed length")
	public void veriyfyReminderTypeNameLength() {
		moreMenu.verifyReminderTypeFieldMaxLength();
	}
	
	@QAFTestStep(description = "walgreen user verify default status of walgreen switch is on")
	public void verifywalgreenSwitchDefaultOn() {
		moreMenu.verifyWalgreenUserSwitch();
	}
	
	@QAFTestStep(description = "user verify description length past time not allowed for reminder picker")
	public void descLengthAndReminderPastTime() {
		moreMenu.verifydescriptionLengthAndReminderTimePast();
	}
	
	@QAFTestStep(description = "user go through reminder screen")
	public void reminderScreenss() {
		moreMenu.reminderscreens();
	}
	
	@QAFTestStep(description = "user go through setting screen")
	public void settingScreenss() {
		moreMenu.mySettingScreen();
	}
	
	@QAFTestStep(description = "user enter and verify other country clinic code")
	public void ohterCountryClinicCodes() {
		moreMenu.otherCountryClinicCode();
	}
	@QAFTestStep(description = "walgreen user try to switch off walgreen switch")
	public void switchingOffWalgreenSwitch() {
		moreMenu.verifyWalgreenUserSwitchOff();
	}
		
	@QAFTestStep(description = "Non-Walgreen user connect Walgreen using {0}")
	public void addNonwalgreenUserToWalgreen(Object userDetail) {
		moreMenu.addNonwalgreenUserToWalgreen(userDetail);
	}
	
	@QAFTestStep(description="user verifies toggle button to sync my readings")
	public void verifySyncReadingToggleButton() {
		moreMenu.verifyToggleButton();
	}
	@QAFTestStep(description="user verifies toggle button to be disabled")
	public void verifyToggleButtonToBeDisabled(){
		moreMenu.verifyToggleButtonDisabled();
	}
	@QAFTestStep(description="user verifies toggle button is ON")
	public void verifySyncReadingToggleButtonON() {
		moreMenu.verifyToggleButtonON();
	}
	@QAFTestStep(description="user verify walgreen connect pop up")
	public void verifyWlgreenConnectionPopUpAnd(){
		moreMenu.verifyWlagreenEnablePopUp();
	}
	
	@QAFTestStep(description="user verify added clinic")
	public void verifyClinic(){
		moreMenu.verifyAddedClinic();
	}
	
	@QAFTestStep(description = "user verifies add plus button on Reminders page") 
	public void verifyAddPlusBtnOnMyRemindersPage() {
		moreMenu.verifyAddPlusBtnOnMyRemindersPage();
	}

	@QAFTestStep(description = "user verifies add plus button related information present on My Reminders page") 
	public void verifyAddPlusBtnInformation() {
		moreMenu.verifyAddPlusBtnInformation();
	}
	
	@QAFTestStep(description = "user click on add reminder button")
	public void clickOnAddReminderBtn(){
		moreMenu.clickOnAddicon();
	}
	
	@QAFTestStep(description = "user verifies navigation to choose reminder page")
	public void verifyNavigationToChooseReminder(){
		moreMenu.verifyNavigationToChooseReminder();
	}
	
	@QAFTestStep(description = "user verify list of reminder for {0}")
	public void verifyListOfReminder(Object reminderName){
		moreMenu.verifyListOfReminder(reminderName);
	}
	
	@QAFTestStep(description = "user verifies navigation to Set Reminder page")
	public void verifyNavigationToSetReminder(){
		moreMenu.verifyNavigationToSetReminder();
	}
	
	@QAFTestStep(description = "user verifies details on Set Reminder page with selected {0}")
	public void verifySetReminderPageDetails(String reminderName){
		moreMenu.verifySetReminderPageDetails(reminderName);
	}
	
	@QAFTestStep(description = "user create a new reminder for {0}")
	public void createNewReminder(String reminderName){
		moreMenu.createNewReminder(reminderName);
	}
	
	@QAFTestStep(description = "user click date value on set reminder page")
	public void clickDateOfSetReminder(){
		moreMenu.clickDateOfSetReminder();
	}
	
	@QAFTestStep(description = "user verify reminder details as {0} on Reminders page")
	public void verifySetReminderByUser(String reminderName){
		moreMenu.verifySetReminderByUser(reminderName);
	}				
	
	@QAFTestStep(description = "user verify {0} reminder details not present on Reminders page")
	public void verifyReminderPopUp(String reminderName){
		moreMenu.verifyReminderPopUp(reminderName);
	}
	
	@QAFTestStep(description = "user verify {0} reminder details present on Reminders page")
	public void verifyReminderPopUpPresent(String reminderName){
		moreMenu.verifyReminderPopUpPresent(reminderName);
	}
	
	@QAFTestStep(description = "user verify added office details using {0}")
	public void verifyAddedOfficeAndroid(Object userDetails) {
		moreMenu.verifyAddedOfficeName(userDetails);
	}
	
	@QAFTestStep(description = "user clicks on share")
	public void clickOnShare() {
		moreMenu.clickOnShareMenu();
	}
	
	@QAFTestStep(description = "user redirects to My Devices screen and clicks on Start sensor session")
	public void StartSensorSession() {
	         	moreMenu.VerifyMyDevices();
	          moreMenu.startsensorsession();
	        // moreMenu.verifypairsensor();
	}

	@QAFTestStep(description="user clicks on Order Supplies which opens a browser page")
	public void userClicksOnOrderSupplies(){
		moreMenu.clickOnOrderSupplies();
	}

	
}
