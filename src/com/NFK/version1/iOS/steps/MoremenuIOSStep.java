package com.NFK.version1.iOS.steps;

import com.NFK.version1.iOS.pages.MoremenuPageIOS;
import com.NFK.version1.iOS.pages.SettingsPageIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class MoremenuIOSStep {
	
	MoremenuPageIOS moreMenuPage= new MoremenuPageIOS();
	
	@QAFTestStep(description = "user verify available options in More menu")
	public void verifyMoreMenuElements() {
		moreMenuPage.verifyMoreMenu();
	}
	
	@QAFTestStep(description = "user clicks on Settings") 
	 public void clickMySettings() {
		moreMenuPage.clickSetting();
	}
	 
	@QAFTestStep(description = "user clicks on Terms Of Use link and verify")
	public void clickOnTermsOfUse() {
		moreMenuPage.clickAndVerifyTermsOfUseScreen();
	}
	@QAFTestStep(description = "user verify added office details using {0}")
	public void verifyAddedOfficeIos(Object userDetails) {
		moreMenuPage.verifyAddedOfficeName(userDetails);
	}
	@QAFTestStep(description = "user clicks Privacy Policy link and verify")
	public void clickOnPrivacyPolicy() {
		moreMenuPage.clickAndVerifyPrivecyPilicyScreen();
	}
	@QAFTestStep(description = "user verify Contact Us page")
	public void clickOnContactusScreen() {
		moreMenuPage.verifyContactUsScreen();
	}
	
	@QAFTestStep(description="user clicks and verify Email customer service")
	public void clickEmail(){
		moreMenuPage.clickEmailToVerify();
	}
	@QAFTestStep(description="user add new {0} reminders {1} futuredate {2} and flag as {3}")
    public void userAddNewReminderFuturedateAndFlagAs(int times,String reminderName,String date, String flag){
		moreMenuPage.addmultipleRemainders(times, reminderName, date, flag);
    }
	@QAFTestStep(description="user verify list of reminders displayed in reminders screen")
    public void userVerifyListOfRemindersDisplayedInRemindersScreen(){
		moreMenuPage.verifyListofremainders();
    }
	
	@QAFTestStep(description="user verifies Maximum Reminders reached Pop-up")
    public void userClicOnReminderInRemindersScreen(){
		moreMenuPage.verifyMaximumReminderPopup(); 
    }
	
	@QAFTestStep(description="user select Contact Us")
	public void clickContactUs(){
		moreMenuPage.clickContactUsPage();
	}

	@QAFTestStep(description = "user verify my meter screen in more menu")
	public void verifyMyMeterScreen() {
		moreMenuPage.verifyMyMeterScreen();
	}
	@QAFTestStep(description = "user set up a new reminder")
	public void setupNewReminder(String option) {
		moreMenuPage.setSnackReminder(option);
	}
	@QAFTestStep(description = "user create a new reminder type")
	public void setNewReminderType() {
		moreMenuPage.addNewReminderType();
	}
	@QAFTestStep(description = "user verify reminder screens")
	public void verifyiesReminderScreens() {
		moreMenuPage.verifyReminderScreens();
	}

	@QAFTestStep(description="user calls customer service center")
	public void callCustomer(){
		moreMenuPage.callCustomerCare();
	}
	@QAFTestStep(description="user visits application website")
	public void visitSite(){
	moreMenuPage.visitApplicationSite();
	}

	@QAFTestStep(description="user clicks Rate app link")
	public void rateApp(){
	moreMenuPage.rateApplication();
	}
	
	@QAFTestStep(description = "user clicks on My Meters")
	public void clickMyMeters() {
		moreMenuPage.clickMyMeters();
	}
	@QAFTestStep(description = "user verifies My Meters page UI") 
	public void verifyMyMetersPageUI() {
		moreMenuPage.verifyMyMeterScreen();
	}
	
	@QAFTestStep(description = "user taps time update switch")
	public void tapTimeUpdate() {
		moreMenuPage.timeUpdate();
}
	@QAFTestStep(description = "user clicks Connections")
	public void clickConnections() {
		moreMenuPage.clickConnections();
	}
	@QAFTestStep(description = "user verifies Connections page")
	public void verifyConnectionsPage() {
		moreMenuPage.verifyConnetionsPage();
	}
	@QAFTestStep(description = "user verifies the request connected details")
	public void userVerifiesTheRequestSubmittedDetails() {
		moreMenuPage.verifyConnectedStatus();
	}
	@QAFTestStep(description = "user verifies the request declined details")
	public void userVerifiesRequestDeclined() {
		moreMenuPage.verifydeclinedStatus(); 
	}
	@QAFTestStep(description = "user verifies the {0} popup")
	public void userverifiesPopup(String option) {
		moreMenuPage.verifyPopup(option); 
	}
	@QAFTestStep(description = "user verifies returning to more menu")
	public void verifyMoreMenuHeader() {
		moreMenuPage.verifyMoreMenuHeader();
	}
	@QAFTestStep(description = "user clicks back button")
	public void clickBackButton() {
		moreMenuPage.toClickBackBtn();
	}
	@QAFTestStep(description = "user toggle apple health switch")
	public void ToggleAppleHealthSwitch() {
		moreMenuPage.ToogleAppleHealthSwtch();
	}
	@QAFTestStep(description = "user enter and verify invalid clinic code")
	public void VerifyInvalidOfficeCode() {
		moreMenuPage.incorrectClinicCode();
	}
	@QAFTestStep(description = "user verify invalid clinic code format")
	public void VerifyInvalidOfficeCodeFormats() {
		moreMenuPage.incorrectClinicCodeFormat();
	}
	@QAFTestStep(description = "user clicks help option")
	public void clicksHelpOption() {
		moreMenuPage.clickHelpOption();
	}
	
	@QAFTestStep(description="user set up a new reminder using {0}")
	public void setupReminder(String option){
		moreMenuPage.setSnackReminder(option);
	}
	@QAFTestStep(description = "walgreen user verify default status of walgreen switch is on")
	public void verifywalgreenSwitchDefaultOn() {
		moreMenuPage.verifyWalgreenUserSwitch();
	}
	@QAFTestStep(description = "walgreen user try to switch off walgreen switch")
	public void switchingOffWalgreenSwitch() {
		moreMenuPage.verifyWalgreenUserSwitchOff();
	}
	@QAFTestStep(description = "user add office using {0}")
	public void addOfficeNew(Object clinicDetail) {
		moreMenuPage.validClinicCode(clinicDetail);
	}
	@QAFTestStep(description = "user clicks on Account")
	public void clickOnMyAccount() {
		moreMenuPage.clickAccount();
	}
	
	@QAFTestStep(description = "user clicks on Reminder")
	public void clickOnMyReminder() {
		moreMenuPage.clickOnReminderFromMoreMenu();
	}
	
	
	@QAFTestStep(description = "user verify reminder type name allowed length")
	public void veriyfyReminderTypeNameLength() {
		moreMenuPage.verifyReminderTypeFieldMaxLength();
	}
	@QAFTestStep(description = "user verify description length past time not allowed for reminder picker")
	public void descLengthAndReminderPastTime() {
		moreMenuPage.verifydescriptionLengthAndReminderTimePast();
	}
	@QAFTestStep(description = "user clicks on more menu back button")
	public void clickMoremunuBack() {
		moreMenuPage.ToClickBackBtn2();
	}
	@QAFTestStep(description = "user go through reminder screen")
	public void reminderScreenss() {
		moreMenuPage.reminderscreens();
	}
	@QAFTestStep(description = "user go through setting screen")
	public void settingScreenss() {
		moreMenuPage.mySettingScreen();
	}
	@QAFTestStep(description = "user click clinic code button")
	public void clickCliniCode() {
		moreMenuPage.clickAndVerifyClinicCodeScreen();
	}
	
	@QAFTestStep(description = "Non-Walgreen user connect Walgreen using {0}")
	public void addNonwalgreenUserToWalgreen(Object userDetails) {
		moreMenuPage.addNonwalgreenUserToWalgreen(userDetails);
	}
	@QAFTestStep(description = "user enter and verify other country clinic code")
	public void ohterCountryClinicCodes() {
		moreMenuPage.ohterCountryClinicCode();
	}
	@QAFTestStep(description="user verifies toggle button to sync my readings")
	public void verifySyncReadingToggleButton() {
		moreMenuPage.verifyToggleButton();
	}
	@QAFTestStep(description="user verifies toggle button to be disabled")
	public void verifyToggleButtonToBeDisabled(){
		moreMenuPage.verifyToggleButtonDisabled();
	}
	@QAFTestStep(description="user verifies toggle button is ON")
	public void verifySyncReadingToggleButtonON() {
		moreMenuPage.verifyToggleButtonON();
	}
	@QAFTestStep(description="user verify Rate us label")
	public void verifyRateUslabel() {
		moreMenuPage.verifyRateUsLabel();
	}
	@QAFTestStep(description = "user clicks cancle button on meter not found pop up")
	public void pairMeter(){
		moreMenuPage.clickToPairMeter();
	}
	@QAFTestStep(description="user navigates to homepage")
	public void navigateHomepage(){
		moreMenuPage.navigateToHomepage();
	}
	@QAFTestStep(description="user verify walgreen connect pop up")
	public void verifyWlgreenConnectionPopUpIos(){
		moreMenuPage.verifyWlagreenEnablePopUp();
	}
	
	@QAFTestStep(description = "user verifies add plus button on My Reminders page") 
	public void verifyAddPlusBtnOnMyRemindersPage() {
		moreMenuPage.verifyAddPlusBtnOnMyRemindersPage();
	}
	
	@QAFTestStep(description = "user click on add reminder button")
	public void clickOnAddReminderBtn(){
		moreMenuPage.clickOnAddicon();
	}
	
	@QAFTestStep(description = "user verifies navigation to choose reminder page")
	public void verifyNavigationToChooseReminder(){
		moreMenuPage.verifyNavigationToChooseReminder();
	}
	
	@QAFTestStep(description = "user verify list of reminder for {0}")
	public void verifyListOfReminder(Object reminderName){
		moreMenuPage.verifyListOfReminder(reminderName);
	}
	
	@QAFTestStep(description = "user create a new reminder for {0}")
	public void createNewReminder(String reminderName){
		moreMenuPage.createNewReminder(reminderName);
	}
	
	@QAFTestStep(description = "user verifies navigation to Set Reminder page")
	public void verifyNavigationToSetReminder(){
		moreMenuPage.verifyNavigationToSetReminder();
	}
	
	@QAFTestStep(description = "user verifies details on Set Reminder page with selected {0}")
	public void verifySetReminderPageDetails(String reminderName){
		moreMenuPage.verifySetReminderPageDetails(reminderName);
	}
	
	@QAFTestStep(description = "user click date value on set reminder page")
	public void clickDateOfSetReminder(){
		moreMenuPage.clickDateOfSetReminder();
	}
	
	@QAFTestStep(description = "user verify reminder details as {0} on My Reminders page")
	public void verifySetReminderByUser(String reminderName){
		moreMenuPage.verifySetReminderByUser(reminderName);
	}
	
	@QAFTestStep(description = "user clicks on Alerts")
	public void clickMyAlerts(){
		moreMenuPage.clickMyAlerts();	
	}
	
	@QAFTestStep(description = "user clicks on Share")
	public void clicksOnShare(){
		moreMenuPage.clicksOnShare();	
	}
	@QAFTestStep(description = "user clicks on Help option")
	public void clicksOnHelp(){
		moreMenuPage.clickHelpOption();	
	}
	
	@QAFTestStep(description = "user redirects to My Devices screen and clicks on Start sensor session")
	public void StartSensorSession() {
		moreMenuPage.VerifyMyDevices();
	moreMenuPage.startsensorsession();
//		moreMenuPage.verifypairsensor();
	}
	@QAFTestStep(description="user clicks on My Devices")
	public void userClicksOnMyDevices(){
		moreMenuPage.clickOnMyDevices();
	}
	
	@QAFTestStep(description="user clicks on Order Supplies which opens a browser page")
	public void userClicksOnOrderSupplies(){
		moreMenuPage.clickOnOrderSupplies();
	}
	
	
	
}
