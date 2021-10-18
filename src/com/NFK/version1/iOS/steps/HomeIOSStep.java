package com.NFK.version1.iOS.steps;

import com.NFK.version1.iOS.pages.HomePageIOS;
import com.NFK.version1.iOS.pages.ProgressPageIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class HomeIOSStep {

	HomePageIOS homePage = new HomePageIOS();
	ProgressPageIOS progresspage=new ProgressPageIOS();

	@QAFTestStep(description = "user clicks on more menu")
	public void clicksOnMoreMenu() {
		homePage.clickOnMoreMenuIcon();
	}
	@QAFTestStep(description = "user verify navigation bar on homescreen")
	public void verifynav() {
		homePage.verifynavigationBar();
	}

	@QAFTestStep(description = "user click on share button")
	public void clicksOnShareIcon() {
		homePage.clickOnShareIcon();
	}

	@QAFTestStep(description = "user clicks on logbook tab")
	public void clicksOnLogbookIcon() {
		homePage.clickOnLogbookIcon();
	}
	
	@QAFTestStep(description = "user clicks on added event {0} on Event Log")
	public void clicksOnAddedEventLogScreen(String data){
		homePage.clickOnaddEvent(data);
	}
	
	@QAFTestStep(description = "user verify added event {0} on home screen")
	public void verifyAddedEventHomeScreen(Object eventDetail){
		homePage.verifyAddedEventHomeScreen(eventDetail);
		Reporter.logWithScreenShot("Event displayed", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verifies event {0} is deleted on Event Log")
	public void verifyDeleteEventHomeScreen(Object eventDetail){
		homePage.verifyEventDeleted(eventDetail);
	}
	
	@QAFTestStep(description = "user verifies note event {0} is deleted on Event Log")
	public void verifyDeleteNoteEventHomeScreen(Object eventDetail1){
		homePage.verifyNoteEventDeleted(eventDetail1);
		Reporter.logWithScreenShot("Note Event is deleted", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user clicks on Home tab")
	public void clickHomePage(){
		homePage.clickOnHome();
	}
	@QAFTestStep(description = "user redirects to logbook page")
	public void verifyLogbookPage() {
		homePage.verifyLogbook();
	}
	@QAFTestStep(description = "user clicks on connections tab")
	public void clicksOnConnectionTab(){
		homePage.clickConnectionIcon();
	}
	 @QAFTestStep(description="user clicks on My Progress")
	    public void userClicksOnMyProgress(){
		 progresspage.clickProgressBar();	
	    }
	 
	@QAFTestStep(description = "user redirects to connections page")
	public void verifyConnectionPage(){
		homePage.verifyConnection();
	}
	@QAFTestStep(description = "user gets redirected to Home page")
	public void verifyHomePage(){
		homePage.verifyHome();
	}
	

	
   @QAFTestStep(description = "user clicks Add an Event")
	public void homepageAddEvent() {
		homePage.homepageAddEvent();
	}
	
   //Added Step def to click on X icon from Add an event menu
   @QAFTestStep(description = "user clicks on X icon from add an event screen")
	public void ClickonXiconAddEvent() {
		homePage.clickonIconAddEvent();
	}
	
   @QAFTestStep(description = "user verifies the events are not displayed")
  	public void VerifyEvents() {
	   homePage.eventsVerify();  
  	}
  	
    @QAFTestStep(description = "user verifies the homepage with no events")
	public void homepageNoEvents() {
		homePage.homePageNoEvents();
	}
	
	@QAFTestStep(description = "user verify tab bar when redirects to homepage")
	public void verifyTabBars() {

		homePage.verifyTabs();
	}
	
	@QAFTestStep(description = "user clicks on Last Reading tab")
	public void clickLastReading() {
		homePage.clickLastReadingDetail();
	}

	@QAFTestStep(description = "user clicks on Patterns tab")
	public void clickPatterns() {
		homePage.clickPatterns();
	}
	
	@QAFTestStep(description = "user redirects to Patterns page")
	public void verifyPatternsPage() {
		homePage.verifyPatternsPage();
	}
	@QAFTestStep(description = "user clicks on Last Readings Summary tab")
	public void clickLastReadingsSummary() {
		homePage.clickLastReadingSummaryButton();
	}
	
	@QAFTestStep(description = "user redirects to Last Readings Summary page")
	public void verifyLastReadingsSummaryPage() {
		homePage.verifyAverageAndComparator();
	}
	
	@QAFTestStep(description = "user verifies Last Readings Summary page")
	public void verifyUILastReadingsSummaryPage() {
		homePage.verifyLastReadingsSummaryPageUI();
	}
	
	@QAFTestStep(description = "user clicks and verify 14, 30, and 90 Day views")
		public void clickAndVerifyDayRangeViews() {
		homePage.verifyPeriodDayViews();	
	}
	
	@QAFTestStep(description = "user verifies last meter sync screen")
	public void verifyLastMeterSync() {
		homePage.verifyLastSyncScreen();
	}
	
	@QAFTestStep(description = "user verifies no of count after adding manual BG")
	public void verifyNoOfReading() {
		homePage.verifyNoOFMeterReadingSame();
	}
	
	@QAFTestStep(description = "user clicks on last sync reading tab")
	public void clickOnRecentEvent() {
		homePage.clickOnRecentEventBtn();
	}
	
	@QAFTestStep(description = "user clicks on All events link")
	public void clickOnAllEventLink() {
		homePage.clickAllEventLink();
	}
	
	@QAFTestStep(description = "user verify 14, 30, and 90 Day views for no event data")
	public void verifyLastReadingWithNoReadingData() {
		homePage.verifyAllLastReadignWithNoRreading();
	}
	
	@QAFTestStep(description = "user verify recent added BG on last sync tab using {0}")
	public void verifyRecentEventTab(Object eventDetails) {
		homePage.verifyRecentEventDetails(eventDetails);
	}
	
	@QAFTestStep(description = "user check total BG count on last sync screen")
	public void checkBGCountLastSyncScreen() {
		homePage.CheckBGCountLastSync();
	}
	
	@QAFTestStep(description = "user click on {0} over view tab")
	public void clickOnOverviewScreen(String tab) {
		homePage.click14_30_90Day(tab);
	}
	
	@QAFTestStep(description = "user verify BG period result popup")
	public void verifyPeriodResultPopUp() {
		homePage.verifyPeriodRusultPage();
	}
	
	@QAFTestStep(description = "user verify welcome article on home screen for new user")
	public void verifyWelcomeArticle() {
		homePage.verifyWelcomeArticle();
	}
	
	@QAFTestStep(description = "user click on reading button on lastreading screen")
	public void clicksReadingButtonLastreadingPage() {
		homePage.clickReadingButtonLastreadingPage();
	}
	
	@QAFTestStep(description = "user verify manually added glucose last reading screen using {0}")
	public void verifiesReccentAddedGlucoseLastReading(Object event) {
		homePage.verifyReccentAddedGlucoseLastReading(event);
	}
	
	@QAFTestStep(description = "user click on added glucose last reading screen using {0}")
	public void clicksReccentAddedGlucoseLastReading(Object event) {
		homePage.clickReccentAddedGlucoseLastReading(event);
	}
	
	@QAFTestStep(description="user verify added BG get deleted using {0}")
	public void verifyAddedBGDeleted(Object event) {
		homePage.verifyDeletedBGAfterDeletion(event);
	}
	
	@QAFTestStep(description = "user verify period result popup value")
	public void verifyPeriodResultPopUpValue() {
		homePage.verifyPeriodBgResultPopUpValue();
	}
	
	@QAFTestStep(description="user clears homepage events")
	public void clearHomeEvents(){
		homePage.deleteAllEvents();
	}
	
	@QAFTestStep(description="user verify over all range on donut pop up")
	public void overallRangeOnDonutPopUp(){
		homePage.verifyOverallRangeonDonutPopUp();
	}
	
	@QAFTestStep(description="user verify before and after meal range on donut pop up")
	public void bmamRangeOnDonutPopUp(){
		homePage.verifyAMBMDonutRange();
	}
	
	@QAFTestStep(description="take screenshot of the page")
	public void screenShotOFPage(){
		homePage.screenShotTake();
	}
	
	@QAFTestStep(description="user verify BG count for no tag before and after meal")
	public void beforeAfterMealCount(){
		homePage.countForBeforeAfterMeal();
	}
	
	@QAFTestStep(description="user verify BG present in correct period")
	public void verifiesBGDisplayedCorrectPeriod(){
		homePage.verifyBGDisplayedCorrectPeriod();
	}
	
	@QAFTestStep(description="user verify out of range BG not present on readings page")
	public void outOfRangeBGNotPresent(){
		homePage.verifyBGNotDisplayedNintyRange();
	}
	
	@QAFTestStep(description="user deleted BG {0} not present on readings page")
	public void verifydeletedBG(Object option){
		homePage.verifyDeletedBGReading(option);
	}
	
	//Sangram
	@QAFTestStep(description="user verify deleted glucose on home screen")
	public void verifyDeletedBGOnHomepage(){
		homePage.verifyDeletedBGOnHomepage();
	}
	
	@QAFTestStep(description="user verify average reading units")
	public void verifyReadingsPerDayOn90DayView() {
		homePage.verifyReadingsPerDay();
	}
	
	@QAFTestStep(description="user verify added event {0} on last sync with meter page")
	public void lastSyncAddedEventVerification(Object option){
		homePage.lastSyncAddedEvent(option);
	}
	
	@QAFTestStep(description="user verify deleted event {0} on last sync with meter page")
	public void lastSyncDeletedEventVerification(Object option){
		homePage.lastSyncDeletedEvent(option);
	}
	
	@QAFTestStep(description="user click on new added event {0} on home screen")
	public void clicksOnHiddenAddedEventHomeScreen(String data){
		homePage.clickNewBGHomeScreen(data);
	}
	
	@QAFTestStep(description="user verify today and yesterday added eventcon home screen")
	public void verifyTodayAndLastdayEvent(){
		homePage.verifyTodayLastdayLebel();
	}
	
	@QAFTestStep(description="user delete the article from homepage")
	public void verifiesCloseArticle(){
		homePage.verifyCloseArticle();
	}
	
	@QAFTestStep(description = "user verify Yesterday text for yesterday added event")
	public void verifyYesterdayTextios() {
		homePage.verifyEventDateAsYesterDay();
	}
	
	@QAFTestStep(description="user Syncing with account")
	public void Syncing_account(){
		homePage.syncingAccount();
	}
	
	@QAFTestStep(description="Verify app displays the message Syncing with account")
	public void Verify_Syncing_with_account(){
		homePage.verifySyncingAccount();
	}
	
	@QAFTestStep(description="user clicks Set Goals")
	public void clickSetGoals() {
		homePage.clickSetGoals();
		Reporter.logWithScreenShot("Set Goals click", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user clicks BG Goal")
	public void clickBGGoal() {
		homePage.clickBGGoal();
		Reporter.logWithScreenShot("BG goal clicked", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user opens BG Goal details")
	public void clickBGGoalDetails() {
		homePage.clickBGGoalDetails();
		Reporter.logWithScreenShot("BG details clicked", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify Averages and Comparator button")
	public void verifyAveragesComparator() {
		homePage.verifyAverageAndComparator();
	}
	
	@QAFTestStep(description = "user click and verify reading for {0} days")
	public void verifyAverage(int range) {
		homePage.verifyMyProgress(range);
	}
	
	@QAFTestStep(description = "user verify A1C Page")
	public void verifyA1C() {
		homePage.verifyA1CPage();
	}
	
	@QAFTestStep(description="user clicks settings link")
	public void clickSettingsLink() {
		homePage.clickSettingLinkOnPopUp();
		Reporter.logWithScreenShot("Settings link clicked", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="verify added goal on homepage")
	public void verifyGoals() {
		homePage.verifyAddedGoals();
	}
	
	@QAFTestStep(description = "user verify Article question on home screen")
	public void verifyArticleQuestion() {
		homePage.verifyArticleQuestions();
	}
	
	@QAFTestStep(description = "user click on Article logo")
	public void clickOnArticle() {
		homePage.clickOnArticleLogo();
	}
	
	@QAFTestStep(description = "user verify delete confirmation message")
	public void verifyDeleteConfirm() {
		homePage.verifyDeletePopupConfirm();
	}
	
	@QAFTestStep(description = "user delete the Article")
	public void deletea1cArticle() {
		homePage.hardDeletea1cArticle();
	} 
	
	@QAFTestStep(description = "user verify count as {0} on Pattern tab")
	public void verifyCountofPatternOnPatternTab(String count) {
		homePage.verifyCountPatternTab(count);
	}
	
	@QAFTestStep(description = "user verify no pattern on home screen")
	public void verifyNoPatternHomeScreen() {
		homePage.verifyNoPatternHomeScreen();
	}
	
	@QAFTestStep(description = "user verify no event on last sync tab for envent {0}")
	public void noEventLastSyncTab(Object option) {
		homePage.lastSyncDeletedEvent(option);
	}
	
	@QAFTestStep(description = "user verify A1C Comparator information icon")
	public void clickA1CInfoButton() {
		homePage.clickAndVerifyA1CInfoButton();
		Reporter.logWithScreenShot("A1C Info");
	}

	@QAFTestStep(description = "user clicks on added A1C")
	public void clickA1CEvent() {
		homePage.clickA1CAddedEvent();
		Reporter.logWithScreenShot("A1C clicked");
	}

	@QAFTestStep(description = "user verify A1C history")
	public void verifyA1CHistory() {
		homePage.viewHistoryA1C();
		Reporter.logWithScreenShot("A1C histroy");
	}
	
	@QAFTestStep(description = "user verifies Pair a Meters page UI")
	public void verifyPairMeterUI() {
		homePage.verifyPairMeter();
	}
	
	@QAFTestStep(description = "user verify Added BG value on home page")
	public void verifyAddedBG() {
		homePage.verifyAddedBG();
		Reporter.logWithScreenShot("BG value added", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify Added Steps value on home page")
	public void verifyAddedSteps() {
		homePage.verifyAddedSteps();
		Reporter.logWithScreenShot("Steps value added", MessageTypes.Pass);
	}
	@QAFTestStep(description = "user verify Added Carbs value on home page")
	public void verifyAddedCarbs() {
		homePage.verifyAddedCarbs();
		Reporter.logWithScreenShot("Carbs value added", MessageTypes.Pass);
	}
	@QAFTestStep(description = "user verify Added Activity value on home page")
	public void verifyAddedActivity() {
		homePage.verifyAddedActivity();
		Reporter.logWithScreenShot("Activity value added", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verifies goals enabled on homepage")
	public void verifyHomepageGoalsOn() {
		homePage.verifyHomepageGoalsOn();
		Reporter.logWithScreenShot("Goals turned on from My Settings", MessageTypes.Pass);
		
	}
	
	@QAFTestStep(description="user clicks on Pair sensor Button")
	public void userClicksOnPairSensorButton(){
		homePage.clickPairbtn();
	}

	@QAFTestStep(description="user verifies all events are displayed")
	public void userVerifiesAllEventsAreDisplayed() {
		homePage.verifyAddEvents();
	}
	@QAFTestStep(description="user verifies empty Home screen")
	public void userVerifiesEmptyHomeScreen() {
		homePage.verifyEmptyHomeScreen(); 
	}
}

