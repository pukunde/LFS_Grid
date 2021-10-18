package com.NFK.version1.iOS.steps;

import com.NFK.version1.iOS.pages.HelpPageIOS;
import com.NFK.version1.iOS.pages.SignupPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class HelpIOSStep {
	
	HelpPageIOS helpPage =new HelpPageIOS();
    SignupPageIOS signupPage= new SignupPageIOS();
	@QAFTestStep(description = "user verify help page options")
	public void userVerifiesHomePage() {
		helpPage.verifyHelpPage();
	}
	
	@QAFTestStep(description="user verifies help introduction page")
	public void userVerifiesHelpIntroductionPage() {
		helpPage.verifyHelpIntroductionPage();
	}
	

	@QAFTestStep(description = "user verifies About page")
	public void verifiesAboutMePage() {
		helpPage.verifiesAboutHelpPage(); 
	}

	@QAFTestStep(description="user verifies NFK Mobile App Page")
	public void userVerifiesNFKMobileAppPage() {
		helpPage.verifyNFKMobilePage();
	}
	
	@QAFTestStep(description="user verifies Supported Devices Page")
	public void userVerifiesSupportedDevicesPage() {
		helpPage.verifySupportedDevicePage();
	}
	
	@QAFTestStep(description="user verifies Apple Legal Page")
	public void userVerifiesAppleLegalPage() {
		helpPage.verifyAppleLegalNoticePage();
	}
	
	@QAFTestStep(description="user verifies Android Legal Page")
	public void userVerifiesAndroidLegalPage() {
		helpPage.verifyAndroidLegalNoticePage();
	}
	
	@QAFTestStep(description="user verifies Google Legal Page")
	public void userVerifiesGoogleLegalPage() {
		helpPage.verifyGoogleLegalNoticePage();
	}
	
	@QAFTestStep(description="user verifies Bluetooth Trademark Page")
	public void userVerifiesBluetoothTrademarkPage() {
		helpPage.verifyBluetoothTrademarkPage();
	}
	
	@QAFTestStep(description="user verifies Intended Use Page")
	public void userVerifiesIntendedUsePage() {
		helpPage.verifyIntendedage();
	}
	@QAFTestStep(description="user verifies Getting Started Page")
	public void userVerifiesGettingStartedPage() {
		helpPage.verifyGettingStartedPage();
	}
	@QAFTestStep(description="user verifies Getting Started Subpage")
	public void userVerifiesGettingStartedSubPage() {
		helpPage.verifyGettingStartedGettingStartedPage();
	}
	@QAFTestStep(description="user verifies Create Account Page")
	public void userVerifiesGettingStartedCreateAccountPage() {
		helpPage.verifyGettingStartedCreateAccountPage();
	}
	@QAFTestStep(description="user verifies Pairing Page")
	public void userVerifiesGettingStartedPairing() {
		helpPage.verifyGettingStartedPairingPage();
	}
	@QAFTestStep(description="user verifies Pairing Flex Meter Page")
	public void userVerifiesGettingStartedPairingFlexMeter() {
		helpPage.verifyGettingStartedPairingFlexMeterPage();
	}
	@QAFTestStep(description="user verifies Unpairing Page")
	public void userVerifiesGettingStartedUnpairingPage() {
		helpPage.verifyGettingStartedUnpairingPage();
	}
	@QAFTestStep(description="user verifies App Overview Page")
	public void verifyAppOverviewPage() {
		helpPage.clickOnAppOverView();
	}
	@QAFTestStep(description="user verifies Symbol and icon Page")
	public void verifiesSymbolPage() {
		helpPage.verifySymbolPage();
	}
	@QAFTestStep(description="user verifies overview more Page")
	public void verifiesOverviewMorePage() {
		helpPage.verifyOverviewMorePage();
	}
	@QAFTestStep(description="user verifies Syncing Meter page")
	public void verifiesHelpMeterSyncPage() {
		helpPage.verifyHelpMeterSyncPage();
	}
	@QAFTestStep(description="user verifies Special Message page")
	public void verifiesHelpSpecilaMessagePage() {
		helpPage.verifyHelpSpecilaMessagePage();
	}
	@QAFTestStep(description="user verifies Synchronizing data page")
	public void verifiesHelpSynchronizingDataPage() {
		helpPage.verifyHelpSynchronizingDataPage();
	}
	@QAFTestStep(description="user verifies app navigation page")
	public void verifyAppNavigation() {
		helpPage.clickOnAppNavigation();
	}
	@QAFTestStep(description="user verifies help navigation home page")
	public void verifyHelpNavigationHomePage() {
		helpPage.verifyHelpNavigationHomePage();
	}
	@QAFTestStep(description="user verifies help navigation Logbook page")
	public void verifyHelpNavigationLogbookPage() {
		helpPage.verifyHelpNavigationLogbookPage();
	}
	@QAFTestStep(description="user verifies help navigation last reading page")
	public void verifyHelpNavigationLastreadingPage() {
		helpPage.verifyHelpNavigationLastreadingPage();
	}
	@QAFTestStep(description="user verifies help navigation pattern page")
	public void verifyHelpNavigationPatternPage() {
		helpPage.verifyHelpNavigationPatternPage();
	}
	@QAFTestStep(description="user verifies help navigation avarage page")
	public void verifyHelpNavigationAvaragePage() {
		helpPage.verifyHelpNavigationAvaragePage();
	}
	@QAFTestStep(description="user verifies help logbook page")
	public void verifyAppLogbookHelp() {
		helpPage.clickOnAppLogbookHelp();
	}
	@QAFTestStep(description="user verifies help logbook sub logbook page")
	public void verifyHelpLogbokLogbookpage() {
		helpPage.verifyHelpLogbokLogbookViewdatepage();
	}
	@QAFTestStep(description="user verifies help logbook view date page")
	public void verifyHelpLogbokViewdatepage() {
		helpPage.verifyHelpLogbokLogbookViewdatepage();
	}
	@QAFTestStep(description="user verifies help logbook add meal page")
	public void verifyHelpLogbokveiewAddmealPage() {
		helpPage.verifyHelpLogbokveiewAddmealPage();
	}
	@QAFTestStep(description="user verifies help logbook adding note page")
	public void verifyHelpLogbokveiewReadingNotePage() {
		helpPage.verifyHelpLogbokveiewReadingNotePage();
	}
	@QAFTestStep(description="user verifies help logbook add carb page")
	public void verifyHelpLogbokveiewAddCarbPage() {
		helpPage.verifyHelpLogbokveiewAddCarbPage();
	}
	@QAFTestStep(description="user verifies help logbook add insulin page")
	public void verifyHelpLogbookAddInsulinPage() {
		helpPage.verifyHelpLogbookAddInsulinPage();
	}
	@QAFTestStep(description="user verifies help logbook add activity page")
	public void verifyHelpLogbookAddActivityPage() {
		helpPage.verifyHelpLogbookAddActivityPage();
	}
	@QAFTestStep(description="user verifies help logbook add reading page")
	public void verifyHelpLogbookAddManualBGPage() {
		helpPage.verifyHelpLogbookAddManualBGPage();
	}
	@QAFTestStep(description="user verifies help logbook each day page")
	public void verifyHelpLogbookAddingEachdayBGPage() {
		helpPage.verifyHelpLogbookAddingEachdayBGPage();
	}
	@QAFTestStep(description="user verifies help logbook view pattern page")
	public void verifyHelpLogbookViewingPetternPage() {
		helpPage.verifyHelpLogbookViewingPetternPage();
	}
	
	@QAFTestStep(description="user verifies help patterns page")
	public void verifyHelpPetternsPage() {
		helpPage.clickOnAppPatternsHelp();
	}
	
	@QAFTestStep(description="user verifies help patterns detecting patterns page")
	public void verifyHelpPetternsDetectingPatternsPage() {
		helpPage.verifyHelpPatternsDetctingPatterns();
	}
	
	@QAFTestStep(description="user verifies help patterns viewing pattern details page")
	public void verifyHelpPetternsViewingPatternDetailsPage() {
		helpPage.verifyHelpPatternsViewingPatterns();
	}
	
	@QAFTestStep(description="user verifies help patterns receiving pattern messages page")
	public void verifyHelpPetternsReceivingPatternMessagesPage() {
		helpPage.verifyHelpPatternsReceivingPatternMessages();
	}
	@QAFTestStep(description="user verifies help more menu page")
	public void verifyHelpMoreMenuPage() {
		helpPage.clickOnMoreMenuHelp();
	}
	@QAFTestStep(description="user verifies help more menu more menu page")
	public void verifyHelpMoreMenuMoreMenuPage() {
		helpPage.clickOnAppMoreMenuMoreMenu();
	}
	@QAFTestStep(description="user verifies help more menu my settings page")
	public void verifyHelpMoreMenuMoreMySettings() {
		helpPage.clickOnAppMoreMenuMySettings();
	}
	@QAFTestStep(description="user verifies help more menu my range page")
	public void verifyHelpMoreMenuMoreMyRange() {
		helpPage.clickOnAppMoreMenuMyRange();
	}
	@QAFTestStep(description="user verifies help more menu high and low limits page")
	public void verifyHelpMoreMenuMoreHighLowRange() {
		helpPage.clickOnAppMoreMenuYourHighLowLimits();
	}
	@QAFTestStep(description="user verifies help more menu my meters page")
	public void verifyHelpMoreMenuMyMeters() {
		helpPage.clickOnAppMoreMenuMyMeters();
	}
	@QAFTestStep(description="user verifies help more menu auto update time page")
	public void verifyHelpMoreMenuAutoUpdateTime() {
		helpPage.clickOnAppMoreMenuAutoUpdateTime();
	}
	@QAFTestStep(description="user verifies help more menu my reminders page")
	public void verifyHelpMoreMenuMyReminders() {
		helpPage.clickOnAppMoreMenuMyReminders();
	}
	@QAFTestStep(description="user verifies help more menu my account page")
	public void verifyHelpMoreMenuMyAccount() {
		helpPage.clickOnAppMoreMenuMyAccount();
	}
	@QAFTestStep(description="user verifies help more menu login preferences page")
	public void verifyHelpMoreMenuLoginPreferences() {
		helpPage.clickOnAppMoreMenuLogInPreferences();
	}
	@QAFTestStep(description="user verifies help more menu optin preferences page")
	public void verifyHelpMoreMenuOptinPreferences() {
		helpPage.clickOnAppMoreMenuOptInPreferences();
	}
	@QAFTestStep(description="user verifies help more menu connections page")
	public void verifyHelpMoreMenuConnections() {
		helpPage.clickOnAppMoreMenuConnections();
	}
	@QAFTestStep(description="user verifies help more menu apps page")
	public void verifyHelpMoreMenuApps() {
		helpPage.clickOnAppMoreMenuApps();
	}
	@QAFTestStep(description="user verifies help more menu help page")
	public void verifyHelpMoreMenuHelp() {
		helpPage.clickOnAppMoreMenuHelp();
	}
	@QAFTestStep(description="user verifies help more menu terms of service page")
	public void verifyHelpMoreMenuTermsOfService() {
		helpPage.clickOnAppMoreTermsOfService();
	}
	@QAFTestStep(description="user verifies help more menu privacy policy page")
	public void verifyHelpMoreMenuPrivacyPolicy() {
		helpPage.clickOnAppMorePrivacyPolicy();
	}
	@QAFTestStep(description="user verifies help more menu log out page")
	public void verifyHelpMoreMenuLogOut() {
		helpPage.clickOnAppMoreLogOut();
	}
	@QAFTestStep(description="user verifies help reminders page")
	public void verifyHelpReminders() {
		helpPage.clickOnMoreMenuReminders();
	}
	@QAFTestStep(description="user verifies help reminders reminders page")
	public void verifyHelpRemindersReminders() {
		helpPage.clickOnRemindersReminders();
	}
	@QAFTestStep(description="user verifies help reminders adding a reminder page")
	public void verifyHelpRemindersAddingAReminder() {
		helpPage.clickOnRemindersAddingAReminder();
	}
	@QAFTestStep(description="user verifies help reminders deleting a reminder page")
	public void verifyHelpRemindersDeletingAReminder() {
		helpPage.clickOnRemindersDeletingAReminder();
	}
	@QAFTestStep(description="user verifies help reminders receiving reminders page")
	public void verifyHelpRemindersReceivingReminders() {
		helpPage.clickOnRemindersReceivingReminders();
	}
	@QAFTestStep(description="user verifies help troubleshooting page")
	public void verifyHelpTroubleshooting() {
		helpPage.clickOnMoreMenuTroubleshooting();
	}
	@QAFTestStep(description="user verifies help troubleshooting frequently asked questions page")
	public void verifyHelpTroubleshootingFAQ() {
		helpPage.clickOnTroubleshootingFAQ();
	}
	@QAFTestStep(description="user verifies help troubleshooting app error and other messages page")
	public void verifyHelpTroubleshootingAppError() {
		helpPage.clickOnTroubleshootingAppErrorAndOtherMessages();
	}
	@QAFTestStep(description="user verifies help troubleshooting data access error page")
	public void verifyHelpTroubleshootingDataAccessError() {
		helpPage.clickOnTroubleshootingDataAccessError();
	}
	@QAFTestStep(description="user verifies help troubleshooting app will not launch page")
	public void verifyHelpTroubleshootingAppWillNotLaunch() {
		helpPage.clickOnTroubleshootingAppWillNotLaunch();
	}
	@QAFTestStep(description="user verifies help troubleshooting app and and Meter Use Differnt Units of Measure page")
	public void verifyHelpTroubleshootingAppAndMeterUse() {
		helpPage.clickOnTroubleshootingAppAndMeterUseDifferntUnitsOfMeasure();
	}
	@QAFTestStep(description="user verifies help troubleshooting different range page")
	public void verifyHelpTroubleshootingDifferentRange() {
		helpPage.clickOnTroubleshootingDifferentRange();
	}
	@QAFTestStep(description="user verifies help troubleshooting improper blood sugar value page")
	public void verifyHelpTroubleshootingImproperBloodSugarValue() {
		helpPage.clickOnTroubleshootingImproperBloodSugarValue();
	}
	@QAFTestStep(description="user verifies help troubleshooting improper carbohydrate value page")
	public void verifyHelpTroubleshootingImproperCarbohydrateValue() {
		helpPage.clickOnTroubleshootingImproperCarbohydrateValue();
	}
	@QAFTestStep(description="user verifies help troubleshooting improper insulin value page")
	public void verifyHelpTroubleshootingImproperInsulinValue() {
		helpPage.clickOnTroubleshootingImproperInsulinValue();
	}
	@QAFTestStep(description="user verifies help troubleshooting improper manual blood sugar value page")
	public void verifyHelpTroubleshootingImproperManualBloodSugarValue() {
		helpPage.clickOnTroubleshootingImproperManualBloodSugarValue();
	}
	
	@QAFTestStep(description="user verify the Saftey Onboarding screens")
	public void userVerifyTheSafteyOnboardingScreens(){
		helpPage.clickSafteyOnboarding();
		signupPage.swipeToSafteyOnboardingsScreen();
	}
	
	@QAFTestStep(description="user verify the License screens")
	public void userVerifyTheLicenseScreens(){
		helpPage.clickLicense();
		helpPage.verifyLicensePage(); 
	}
	
	@QAFTestStep(description="user verifies the App tour screens")
	public void userVerifyTheAppTourScreens(){
		helpPage.clickAppTour();
		helpPage.verifyAppTourScreen(); 
	}
	@QAFTestStep(description="user verifies the Sensor Application screen")
	public void userVerifiesTheSensorApplicationScreen(){
		helpPage.clickSensorApp();
	  helpPage.verifySensorAppScreen();
	}
	
	@QAFTestStep(description="user validate the various options of Sensor application")
	public void userValidateTheVariousOptionsOfSensorApplication(){
	  helpPage.validateOptions();
	}
	@QAFTestStep(description="user verifies the About screen")
	public void userVerifiesTheAboutScreen(){
		helpPage.clickAbout(); 
		helpPage.verifiesAboutHelpPage(); 
	}	
	@QAFTestStep(description="user verifies the App User Guide")
	public void userVerifiesTheAppUserGuide(){
		helpPage.clickAppUserGuide();
		helpPage.verifyUserGuide();
		}

}
