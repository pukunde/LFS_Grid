package com.NFK.version1.android.steps;

import com.NFK.version1.android.pages.HelpPageAndroid;
import com.NFK.version1.android.pages.SignupPageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class HelpSteps {
	HelpPageAndroid helpPageAndroid = new HelpPageAndroid();
    SignupPageAndroid signupPageAndroid= new SignupPageAndroid();
	
	@QAFTestStep(description = "user verify help page options")
	public void verifyHelpPage() {
		helpPageAndroid.verifyHelpPageOptions();
	}

	@QAFTestStep(description = "user verifies help introduction page")
	public void userVerifiesHelpIntroductionPage() {
		helpPageAndroid.verifyHelpIntroductionPage();
	}

	@QAFTestStep(description = "user verifies Supported Devices Page")
	public void userVerifiesSupportedDevicesPage() {
		helpPageAndroid.verifySupportedDevicePage();
	}

	@QAFTestStep(description = "user verifies Apple Legal Page")
	public void userVerifiesAppleLegalPage() {
		helpPageAndroid.verifyAppleLegalNoticePage();
	}

	@QAFTestStep(description = "user verifies Bluetooth Trademark Page")
	public void userVerifiesBluetoothTrademarkPage() {
		helpPageAndroid.verifyBluetoothTrademarkPage();
	}

	@QAFTestStep(description = "user verifies Intended Use Page")
	public void userVerifiesIntendedUsePage() {
		helpPageAndroid.verifyIntendedage();
	}

	@QAFTestStep(description = "user verifies Getting Started Page")
	public void userVerifiesGettingStartedPage() {
		helpPageAndroid.verifyGettingStartedPage();
	}

	@QAFTestStep(description = "user verifies Getting Started Subpage")
	public void userVerifiesGettingStartedSubPage() {
		helpPageAndroid.verifyGettingStartedGettingStartedPage();
	}

	@QAFTestStep(description="user verify the License screens")
	public void userVerifyTheLicenseScreens(){
		helpPageAndroid.clickLicense();
		helpPageAndroid.verifyLicensePage(); 
	}
	
	@QAFTestStep(description = "user verifies Create Account Page")
	public void userVerifiesGettingStartedCreateAccountPage() {
		helpPageAndroid.verifyGettingStartedCreateAccountPage();
	}

	@QAFTestStep(description = "user verifies Pairing Page")
	public void userVerifiesGettingStartedPairing() {
		helpPageAndroid.verifyGettingStartedPairingPage();
	}

	@QAFTestStep(description = "user verifies General Instructions for meter pairing page")
	public void userVerifyGeneralInstructionPage() {
		helpPageAndroid.verifyGeneralPage();
	}

	@QAFTestStep(description = "user verifies App Overview Page")
	public void verifyAppOverviewMenu() {
		helpPageAndroid.appOverviewMenuPage();
	}

	@QAFTestStep(description = "user verifies Symbol and icon Page")
	public void verifySymbolIconPage() {
		helpPageAndroid.verifySymbolIconHelpPage();
	}

	@QAFTestStep(description = "user verifies Navigation page")
	public void verifyNavigationMenu() {
		helpPageAndroid.verifyNavigationHelpMenu();
	}

	@QAFTestStep(description = "user verifies Syncing Meter page")
	public void verifySyncingMeterPage() {
		helpPageAndroid.verifyMeterSyncingHelpPage();
	}

	@QAFTestStep(description = "user verifies Special Message page")
	public void verifySpecialMessage() {
		helpPageAndroid.verifySpecialMessagePage();
	}

	@QAFTestStep(description = "user verifies Synchronizing data page")
	public void verifySynchronizingData() {
		helpPageAndroid.verifySynchronizingDataPage();
	}

	// @QAFTestStep(description="user verifies Home Page")
	// public void verifiesHomePage(){
	// helpPageAndroid.verifyHomeHelpPage();
	// }

	@QAFTestStep(description = "user verifies help logbook page")
	public void verifyAppLogbookHelp() {
		helpPageAndroid.clickOnAppLogbookHelp();
	}

	@QAFTestStep(description = "user verifies help logbook sub logbook page")
	public void verifyHelpLogbokLogbookpage() {
		helpPageAndroid.verifyHelpLogbokLogbookViewdatepage();
	}

	@QAFTestStep(description = "user verifies help logbook view and add data page")
	public void verifyLogbookViewAddData() {
		helpPageAndroid.verifyLogbookViewAddDataPage();
	}

	@QAFTestStep(description = "user verifies help logbook each day page")
	public void verifyHelpLogbookAddingEachdayBGPage() {
		helpPageAndroid.verifyHelpLogbookAddingEachdayBGPage();
	}

	@QAFTestStep(description = "user verifies help logbook view pattern page")
	public void verifyHelpLogbookViewingPetternPage() {
		helpPageAndroid.verifyHelpLogbookViewingPetternPage();
	}

	@QAFTestStep(description = "user verifies help patterns page")
	public void verifyHelpPetternsPage() {
		helpPageAndroid.clickOnAppPatternsHelp();
	}

	@QAFTestStep(description = "user verifies help patterns detecting patterns page")
	public void verifyHelpPetternsDetectingPatternsPage() {
		helpPageAndroid.verifyHelpPatternsDetctingPatterns();
	}

	@QAFTestStep(description = "user verifies help patterns viewing pattern details page")
	public void verifyHelpPetternsViewingPatternDetailsPage() {
		helpPageAndroid.verifyHelpPatternsViewingPatterns();
	}

	@QAFTestStep(description = "user verifies help patterns receiving pattern messages page")
	public void verifyHelpPetternsReceivingPatternMessagesPage() {
		helpPageAndroid.verifyHelpPatternsReceivingPatternMessages();
	}

	@QAFTestStep(description = "user verifies help reminders page")
	public void verifyHelpReminders() {
		helpPageAndroid.clickOnMoreMenuReminders();
	}

	@QAFTestStep(description = "user verifies help reminders reminders page")
	public void verifyHelpRemindersReminders() {
		helpPageAndroid.clickOnRemindersReminders();
	}

	@QAFTestStep(description = "user verifies help reminders adding a reminder page")
	public void verifyHelpRemindersAddingAReminder() {
		helpPageAndroid.clickOnRemindersAddingAReminder();
	}

	@QAFTestStep(description = "user verifies help reminders deleting a reminder page")
	public void verifyHelpRemindersDeletingAReminder() {
		helpPageAndroid.clickOnRemindersDeletingAReminder();
	}

	@QAFTestStep(description = "user verifies help reminders receiving reminders page")
	public void verifyHelpRemindersReceivingReminders() {
		helpPageAndroid.clickOnRemindersReceivingReminders();
	}

	@QAFTestStep(description = "user verifies help troubleshooting page")
	public void verifyHelpTroubleshooting() {
		helpPageAndroid.clickOnMoreMenuTroubleshooting();
	}

	@QAFTestStep(description = "user verifies help troubleshooting frequently asked questions page")
	public void verifyHelpTroubleshootingFAQ() {
		helpPageAndroid.clickOnTroubleshootingFAQ();
	}

	@QAFTestStep(description = "user verifies help troubleshooting app error and other messages page")
	public void verifyHelpTroubleshootingAppError() {
		helpPageAndroid.clickOnTroubleshootingAppErrorAndOtherMessages();
	}

	@QAFTestStep(description = "user verifies help troubleshooting data access error page")
	public void verifyHelpTroubleshootingDataAccessError() {
		helpPageAndroid.clickOnTroubleshootingDataAccessError();
	}

	@QAFTestStep(description = "user verifies help troubleshooting app will not launch page")
	public void verifyHelpTroubleshootingAppWillNotLaunch() {
		helpPageAndroid.clickOnTroubleshootingAppWillNotLaunch();
	}

	@QAFTestStep(description = "user verifies help troubleshooting app and and Meter Use Differnt Units of Measure page")
	public void verifyHelpTroubleshootingAppAndMeterUse() {
		helpPageAndroid.clickOnTroubleshootingAppAndMeterUseDifferntUnitsOfMeasure();
	}

	@QAFTestStep(description = "user verifies help troubleshooting different range page")
	public void verifyHelpTroubleshootingDifferentRange() {
		helpPageAndroid.clickOnTroubleshootingDifferentRange();
	}

	@QAFTestStep(description = "user verifies help troubleshooting improper blood sugar value page")
	public void verifyHelpTroubleshootingImproperBloodSugarValue() {
		helpPageAndroid.clickOnTroubleshootingImproperBloodSugarValue();
	}

	@QAFTestStep(description = "user verifies help troubleshooting improper carbohydrate value page")
	public void verifyHelpTroubleshootingImproperCarbohydrateValue() {
		helpPageAndroid.clickOnTroubleshootingImproperCarbohydrateValue();
	}

	@QAFTestStep(description = "user verifies help troubleshooting improper insulin value page")
	public void verifyHelpTroubleshootingImproperInsulinValue() {
		helpPageAndroid.clickOnTroubleshootingImproperInsulinValue();
	}

	@QAFTestStep(description = "user verifies help troubleshooting improper manual blood sugar value page")
	public void verifyHelpTroubleshootingImproperManualBloodSugarValue() {
		helpPageAndroid.clickOnTroubleshootingImproperManualBloodSugarValue();
	}

	@QAFTestStep(description = "user verifies help Home page")
	public void verifyHelpHome() {
		helpPageAndroid.verifyHelHomePage();
	}

	@QAFTestStep(description = "user verifies home subpage")
	public void verifiesHomeSubPage() {
		helpPageAndroid.verifiesHomeHelp();
	}

	@QAFTestStep(description = "user verifies Data sharing page")
	public void verifyDataSaringPage() {
		helpPageAndroid.verifiesDataSharingHelp();
	}

	@QAFTestStep(description = "user verifies readings page")
	public void verifyReadingPage() {
		helpPageAndroid.verifiesReadingsHelp();
	}

	@QAFTestStep(description = "user verifies adding meal tag page")
	public void verifiesAddingMealTagPage() {
		helpPageAndroid.verifiesAddingMealTagHelp();
	}

	@QAFTestStep(description = "user verifies adding notes page")
	public void verifiesAddingNotesPage() {
		helpPageAndroid.verifiesAddingNotesHelp();
	}

	@QAFTestStep(description = "user verifies averages page")
	public void verifiesAveragePage() {
		helpPageAndroid.verifiesAveragesHelp();
	}

	@QAFTestStep(description = "user verifies patterns page")
	public void verifiesPatternsPage() {
		helpPageAndroid.verifiesPatternsHelp();
	}

	@QAFTestStep(description = "user verifies recent events page")
	public void verifiesRecentEventPage() {
		helpPageAndroid.verifiesRecentEventHelp();
	}

	@QAFTestStep(description = "user verifies adding events page")
	public void verifiesAddingEventsPage() {
		helpPageAndroid.verifiesAddingEventsHelp();
	}

	@QAFTestStep(description = "user verifies add carbs page")
	public void verifiesAddCArbsPage() {
		helpPageAndroid.verifiesAddCarbsHelp();
	}

	@QAFTestStep(description = "user verifies add insulin page")
	public void verifiesAddInsulinPage() {
		helpPageAndroid.verifiesAddInsulinHelp();
	}

	@QAFTestStep(description = "user verifies add activity page")
	public void verifiesAddActivityPage() {
		helpPageAndroid.verifiesAddActivityHelp();
	}

	@QAFTestStep(description = "user verifies add reading page")
	public void verifiesAddReadingsPage() {
		helpPageAndroid.verifiesAddReadingHelp();
	}

	@QAFTestStep(description = "user verifies graphs help page")
	public void verifiesGraphPage() {
		helpPageAndroid.verifiesGraphHelp();
	}

	@QAFTestStep(description = "user verifies graphs sub help page")
	public void verifiesGraphSubPage() {
		helpPageAndroid.verifiesGraphsSubHelp();
	}

	@QAFTestStep(description = "user verifies overall graphs help page")
	public void verifiesOverallGraphPage() {
		helpPageAndroid.verifiesOverallGraphHelp();
	}

	@QAFTestStep(description = "user verifies Time-of day graphs help page")
	public void verifiesTimeOFDayGraphsPage() {
		helpPageAndroid.verifiesTimeOFGraphHelp();
	}

	@QAFTestStep(description = "user verifies viewing patterns on graphs help page")
	public void verifiesViewingPatternsOnGraphsPage() {
		helpPageAndroid.verifiesViewingPatternsOnGraphsHelp();
	}

	@QAFTestStep(description = "user verifies About page")
	public void verifiesAboutMePage() {
		helpPageAndroid.verifiesAboutHelpPage();
	}

	@QAFTestStep(description = "user verifies setting limits page")
	public void verifiesSettingHighLowLimitsPage() {
		helpPageAndroid.verifiesSettingHighLowHelp();
	}
	
	@QAFTestStep(description="user clicks on Your Insulin Mentor")
	 public void clicksInsulinMentor() {
		helpPageAndroid.clicksInsulinMentor();
	 }
	
	@QAFTestStep(description="user clicks on Quick Touch Tutorial")
	 public void clicksQuickUse() {
	 helpPageAndroid.clicksQuickUse();
	 }
	
	@QAFTestStep(description = "user clicks Your Insulin Mentor on help screen")
	public void clickYourInsulin_Mentor() {
		helpPageAndroid.clickYourInsulin_Mentor();
	}
	
	@QAFTestStep(description = "user clicks NFK Quick use tutorial on Insulin Mentor screen")
	public void clickNFKQuick_Tutorial() {
		helpPageAndroid.clickNFKQuick_Tutorial();
	}
	
	@QAFTestStep(description="user verify the Saftey Onboarding screens")
	public void userVerifyTheSafteyOnboardingScreens(){
		helpPageAndroid.clickSafteyOnboarding();
		signupPageAndroid.safetyOnboardingScreen();
	}
	@QAFTestStep(description="user verifies the App tour screens")
	public void userVerifyTheAppTourScreens(){
		helpPageAndroid.clickAppTour();
		helpPageAndroid.verifyAppTourScreen(); 
	}
	
	@QAFTestStep(description="user verifies the App User Guide")
	public void userVerifiesTheAppUserGuide(){
		helpPageAndroid.clickUserGuide();
		helpPageAndroid.verifyUserGuideScreen(); 
	}
	@QAFTestStep(description="user verifies the About screen")
	public void userVerifiesTheAboutScreen(){
		helpPageAndroid.clickAbout();
		helpPageAndroid.verifyAboutScreen(); 
	}	
	@QAFTestStep(description="user verifies the Sensor Application screen")
	public void userVerifiesTheSensorApplicationScreen(){
		helpPageAndroid.clickOnSensorApp();
		helpPageAndroid.verifySensorAppScreen(); 
	}
	
	@QAFTestStep(description="user validate the various options of Sensor application")
	public void userVerifiesTheSensorOptions(){
		helpPageAndroid.validateOptions(); 
	}
	
	
	@QAFTestStep(description = "user verify Your Insulin Mentor screen")
	public void verifyInsulin_MentorScreen() {
		helpPageAndroid.verifyInsulin_MentorScreen();
	}
	/*
	 * @QAFTestStep(description="user verifies Pairing Flex Meter Page") public
	 * void userVerifiesGettingStartedPairingFlexMeter() {
	 * helpPageAndroid.verifyGettingStartedPairingFlexMeterPage(); }
	 * 
	 * @QAFTestStep(description="user verifies Unpairing Page") public void
	 * userVerifiesGettingStartedUnpairingPage() {
	 * helpPageAndroid.verifyGettingStartedUnpairingPage(); }
	 */
	
//	@QAFTestStep(description="user verifies Android Legal Page")
//	public void userVerifiesAndroidLegalPage() {
//		helpPageAndroid.verifyAndroidLegalNoticePage();
//	}
//	
//	@QAFTestStep(description="user verifies Google Legal Page")
//	public void userVerifiesGoogleLegalPage() {
//		helpPageAndroid.verifyGoogleLegalNoticePage();
//	}
//	
}
