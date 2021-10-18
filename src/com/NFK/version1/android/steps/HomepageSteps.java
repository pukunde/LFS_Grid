package com.NFK.version1.android.steps;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.pages.HomePageAndroid;
import com.NFK.version1.android.pages.ProgressPageAndroid;
import com.NFK.version1.android.pages.EventLogPageAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class HomepageSteps {
	HomePageAndroid homePageAndroid = new HomePageAndroid();
	EventLogPageAndroid eventlogPageAndroid = new EventLogPageAndroid();
	ProgressPageAndroid progresspage = new ProgressPageAndroid();
	
	@QAFTestStep(description = "user verify tab bar when redirects to homepage")
	public void verifyTabBars() {
		homePageAndroid.verifyTabs();
	}

	@QAFTestStep(description = "user clicks on eventlog tab")
	public void clickeventlog() {
		homePageAndroid.clickOneventlog();
	}

	@QAFTestStep(description = "user redirects to eventlog page")
	public void verifyeventlogPage() {
		homePageAndroid.verifyeventlog();
	}

	@QAFTestStep(description = "user clicks on connections tab")
	public void clickConnection() {
		homePageAndroid.clickOnConnections();
	}

	@QAFTestStep(description = "user redirects to connections page")
	public void verifyConnectionsPage() {
		homePageAndroid.verifyConnections();
	}

	@QAFTestStep(description = "user clicks on Home tab")
	public void clickHomePage() {
		homePageAndroid.clickOnHome();
	}

	@QAFTestStep(description = "user gets redirected to Home page")
	public void verifyHomePage() {
		homePageAndroid.verifyHome();
	}
	
	@QAFTestStep(description="user clicks on Pair sensor Button")
	public void userClicksOnPairSensorButton(){
		homePageAndroid.clickPairBtn();
	}

	@QAFTestStep(description = "user clicks on more menu")
	public void clickMore() {
		homePageAndroid.clickMoreMenu();
	}

	@QAFTestStep(description = "user click back button")
	public void clickBack() {
		LFSUtilsAndroid.clickBackButton();
	}

	@QAFTestStep(description = "user verify navigation bar on homescreen")
	public void verifynav() {
		homePageAndroid.verifyNavigationBar();
	}

	@QAFTestStep(description = "user click on share button")
	public void clickShare() {
		homePageAndroid.clickOnShareBtn();
	}
	
	@QAFTestStep(description = "user clicks on added event {0} on Event Log")
	public void clicksOnAddedEventHomeScreen(String data) {
		homePageAndroid.clickOnaddEvent(data);
	}

	@QAFTestStep(description = "user verify added event {0} on home screen")
	public void verifyAddedEventHomeScreen(Object eventDetail) {
		homePageAndroid.verifyAddedEventHomeScreen(eventDetail);
		Reporter.logWithScreenShot("Event displayed", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify Multiple added event {0} on home screen")
	public void verifyMultipleAdded_Event(Object eventDetail) {
		homePageAndroid.verifyMultipleAdded_Event(eventDetail);
		
	}
	
	@QAFTestStep(description = "user verify added event {0} on timeline screen")
	public void verifyAddedEventtimelineScreen(Object eventDetail) {
		homePageAndroid.verifyAddedEventtimelineScreen(eventDetail);
	}

	@QAFTestStep(description = "user verifies event {0} is deleted on Event Log")
	public void verifyDeleteEventHomeScreen(Object eventDetail) {
		homePageAndroid.verifyEventDeleted(eventDetail);
		Reporter.logWithScreenShot("Event deleted", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verifies note event {0} is deleted on Event Log")
	public void verifyDeleteNoteEventHomeScreen(Object eventDetail1){
		homePageAndroid.verifyNoteEventDeleted(eventDetail1);
		Reporter.logWithScreenShot("Note Event is deleted", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verifies the homepage with no events")
	public void homepageNoEvents() {
		homePageAndroid.homePageNoEvents();
	}

	@QAFTestStep(description = "user clicks Add an Event")
	public void homepageAddEvent() {
		homePageAndroid.homepageAddEvent();		
	}
	
	@QAFTestStep(description = "user selects event type as {0}")
	public void selectEvent(String option){
		homePageAndroid.Addevent(option);
	}
	
	
	@QAFTestStep(description = "user clicks on Last Readings Summary tab")
	public void clickLastReading() {
		homePageAndroid.clickLastReading();
	}
	
	@QAFTestStep(description = "user verify A1C Page")
	public void verifyA1C() {
		homePageAndroid.verifyA1CPage();
	}
	@QAFTestStep(description = "user verify Averages button")
	public void verifyAverages() {
		homePageAndroid.verifyAverageButton();
	}
	@QAFTestStep(description = "user click on average button")
	public void clickOnAverages() {
		homePageAndroid.clickOnAverages();
	}
	
	@QAFTestStep(description = "user verify and click Comparator button")
	public void verifyTrends() {
		homePageAndroid.verifyTrendsButton();
	}

	@QAFTestStep(description = "user click and verify reading for {0} days")
	public void verifyAverage(int date) {
		homePageAndroid.verifyAverageReading(date);
		Reporter.log("reading present", MessageTypes.Pass);
		
	}
		
	@QAFTestStep(description = "user redirects to Last Readings Summary page")
	public void verifyLastReadingPage() {
		homePageAndroid.verifyLastreading();
	}

	@QAFTestStep(description = "user verifies Last Readings Summary page")
	public void verifyLastreadingSummaryPage() {
		homePageAndroid.verifyLastReadingSummary();
	}

	@QAFTestStep(description = "user clicks and verify 14, 30, and 90 Day views")
	public void verifyViews() {
		homePageAndroid.verifyDayViewsOfeventlog();
	}

	@QAFTestStep(description = "user clears homepage events")
	public void clearHomeEvents() {
		homePageAndroid.deleteEvents();
	}

	@QAFTestStep(description = "user clicks on last sync reading tab")
	public void clickLastSync() {
		homePageAndroid.clickLastSyncButton();
	}

	@QAFTestStep(description = "user clicks on All events link")
	public void clickAllEvents() {
		homePageAndroid.clickAllEventsLinkn();
	}

	@QAFTestStep(description = "user verify all events")
	public void verifyAllEvent() {
		homePageAndroid.verifyAllEventScreen();
	}

	@QAFTestStep(description = "user verify recent added BG on last sync tab using {0}")
	public void verifyRecentEventTab(Object eventDetails) {
		homePageAndroid.verifyRecentEventDetails(eventDetails);
	}

	@QAFTestStep(description = "user verifies last meter sync screen")
	public void verifyLastMeterSync() {
		homePageAndroid.verifyLastSyncScreen();
	}

	@QAFTestStep(description = "user verifies no of count after adding manual BG")
	public void verifyNoOfReading() {
		homePageAndroid.verifyNoOFMeterReadingSame();
	}

	@QAFTestStep(description = "user check total BG count on last sync screen")
	public void CheckBGCountLastSyncScreen() {
		homePageAndroid.CheckBGCountLastSync();
	}

	@QAFTestStep(description = "user click on {0} over view tab")
	public void clickOnOverviewScreen(String tab) {
		homePageAndroid.click14_30_90Day(tab);
	}

	@QAFTestStep(description = "user verify BG period result popup")
	public void verifyPeriodResultPopUp() {
		homePageAndroid.verifyPeriodRusultPage();
	}

	@QAFTestStep(description = "user verify welcome article on home screen for new user")
	public void verifyWelcomePage() {
		homePageAndroid.verifyNewUserWelcomePage();
	}

	@QAFTestStep(description = "user click back button")
	public void clickBackBtn() {
		LFSUtilsAndroid.clickBackButton();
	}

	@QAFTestStep(description = "user clicks on Patterns tab")
	public void clickPatterns() {
		homePageAndroid.clickPatterns();
	}

	@QAFTestStep(description = "user verify 14, 30, and 90 Day views for no event data")
	public void verifyLastReadingWithNoReadingData() {
		homePageAndroid.verifyAllLastReadignWithNoRreading();

	}

	@QAFTestStep(description = "user click on reading button on lastreading screen")
	public void clicksReadingButtonLastreadingPage() {
		homePageAndroid.clickReadingButtonLastreadingPage();
	}

	@QAFTestStep(description = "user verify manually added glucose last reading screen using {0}")
	public void verifiesReccentAddedGlucoseLastReading(Object event) {
		homePageAndroid.verifyReccentAddedGlucoseLastReading(event);
	}

	@QAFTestStep(description = "user verify period result popup value")
	public void verifyPeriodResultPopUpValue() {
		homePageAndroid.verifyPeriodBgResultPopUpValue();
	}

	@QAFTestStep(description = "user click on added glucose last reading screen using {0}")
	public void clicksReccentAddedGlucoseLastReading(Object event) {
		homePageAndroid.clickReccentAddedGlucoseLastReading(event);
	}

	@QAFTestStep(description = "user verify before and after meal range on donut pop up")
	public void bmamRangeOnDonutPopUp() {
		homePageAndroid.verifyAMBMDonutRange();
	}

	@QAFTestStep(description = "take screenshot of the page")
	public void screenShotOFPage() {
		homePageAndroid.screenShotTake();
	}

	@QAFTestStep(description = "user verify over all range on donut pop up")
	public void overallRangeOnDonutPopUp() {
		homePageAndroid.verifyOverallRangeonDonutPopUp();
	}

	@QAFTestStep(description = "user verify BG count for no tag before and after meal")
	public void beforeAfterMealCount() {
		homePageAndroid.countForBeforeAfterMeal();
	}

	@QAFTestStep(description = "user verify BG present in correct period")
	public void verifiesBGDisplayedCorrectPeriod() {
		homePageAndroid.verifyBGDisplayedCorrectPeriod();
	}

	@QAFTestStep(description = "user verify out of range BG not present on readings page")
	public void outOfRangeBGNotPresent() {
		homePageAndroid.verifyBGNotDisplayedNintyRange();
	}

	@QAFTestStep(description = "user verify deleted glucose on home screen")
	public void verifyDeletedBGOnHomepage() {
		homePageAndroid.verifyDeletedBGOnHomepage();
	}

	@QAFTestStep(description = "user verify average reading units")
	public void verifyUnitsOfAverageReading() {
		homePageAndroid.verifyAverageUnits();
	}

	@QAFTestStep(description = "user verify added event {0} on last sync with meter page")
	public void lastSyncAddedEventVerification(Object option) {
		homePageAndroid.lastSyncAddedEvent(option);
	}

	@QAFTestStep(description = "user verify deleted event {0} on last sync with meter page")
	public void lastSyncDeletedEventVerification(Object option) {
		homePageAndroid.lastSyncDeletedEvent(option);
		Reporter.logWithScreenShot("Event Deleted", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user click on new added event {0} on home screen")
	public void clicksOnHiddenAddedEventHomeScreen(String data) {
		homePageAndroid.clickNewBGHomeScreen(data);
	}

	@QAFTestStep(description = "user verify welcome article on homepage")
	public void verifyArticle() {
		homePageAndroid.verifyWelcomeArticle();
	}

	@QAFTestStep(description = "user delete the article from homepage")
	public void deleteArticle() {
		homePageAndroid.deleteWelcomeArticle();
	}

	@QAFTestStep(description = "user verify today and yesterday added event icon home screen")
	public void verifyEventDay() {
		homePageAndroid.verifyTodayYesterdayEvent();
	}
	@QAFTestStep(description = "user verify Yesterday text for yesterday added event")
	public void verifyYesterdayText() {
		homePageAndroid.verifyEventDateAsYesterDay();
	}
	
	@QAFTestStep(description="user verify added BG get deleted using {0}")
	public void verifyAddedBGDeleted(Object event) {
		homePageAndroid.verifyDeletedBGAfterDeletion(event);
	}
	
	
	@QAFTestStep(description="user Syncing with account")
	public void Syncing_account(){
		homePageAndroid.syncingAccount();
	}
	
	
	@QAFTestStep(description="Verify app displays the message Syncing with account")
	public void Verify_Syncing_with_account(){
		homePageAndroid.verifySyncingAccount();
	}

	
//NEO Goal Steps	
	
	@QAFTestStep(description="user clicks Set Goals")
	public void clickSetGoals() {
		homePageAndroid.clickSetGoals();
		Reporter.logWithScreenShot("Set Goals click", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user clicks Settings link")
	public void clickSetGoalsSettingsLink() {
		homePageAndroid.clickSetGoalsSettingsLink();
		Reporter.logWithScreenShot("Settings link clicked", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user clicks BG Goal")
	public void clickBGGoal() {
		homePageAndroid.clickBGGoal();
		Reporter.logWithScreenShot("BG goal clicked", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user verify and add BG Goal")
	public void VerifyAddBGGoal() {
		homePageAndroid.VerifyAddBGGoal();
		Reporter.logWithScreenShot("BG goal added and verified", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user verify and add Step Goal")
	public void VerifyAddStepGoal() {
		homePageAndroid.VerifyAddStepGoal();
		Reporter.logWithScreenShot("Step goal added and verified", MessageTypes.Pass);
	}
	@QAFTestStep(description="user verify and add carbs Goal")
	public void VerifyAddCarbsGoal() {
		homePageAndroid.VerifyAddCarbsGoal();
		Reporter.logWithScreenShot("Carb goal added and verified", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user verify and add Activity Goal")
	public void VerifyAddActivityGoal() {
		homePageAndroid.VerifyAddActivityGoal();
		Reporter.logWithScreenShot("Activity goal added and verified", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user clicks Steps Goal")
	public void clickStepsGoal() {
		homePageAndroid.clickStepsGoal();
		Reporter.logWithScreenShot("Steps goal clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description="user clicks Carbs Goal")
	public void clickCarbsGoal() {
		homePageAndroid.clickCarbsGoal();
		Reporter.logWithScreenShot("Carbs goal clicked", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user clicks Activity Goal")
	public void clickActivityGoal() {
		homePageAndroid.clickActivityGoal();
		Reporter.logWithScreenShot("Activity goal clicked", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user opens BG Goal details")
	public void clickBGGoalDetails() {
		homePageAndroid.clickBGGoalDetails();
		Reporter.logWithScreenShot("BG details clicked", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user click on add new A1C")
	public void clickAddA1c() {
		homePageAndroid.clickOnAddA1c();
	}
	
	@QAFTestStep(description = "user enter A1C details")
	public void enterA1cDetail() {
		homePageAndroid.enterA1cDetails();
	}
	
	@QAFTestStep(description = "user click on save A1C result")
	public void clickSaveA1c() {
		homePageAndroid.clickOnSaveA1c();
		Reporter.logWithScreenShot("Save button clicked", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify saved A1C details")
	public void verifyA1cDetail() {
		homePageAndroid.verifyA1cDetails();
	}
	
	@QAFTestStep(description = "user verify Article question on home screen")
	public void verifyArticleQuestion() {
		homePageAndroid.verifyArticleQuestion();
		Reporter.logWithScreenShot("A1C Article displayed", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user is not able to add A1C for more than 120 days")
	public void verifyNotAdding180DayData() {
		homePageAndroid.verifyUnableToAdd180Data();
	}
	
	@QAFTestStep(description = "user click on Article logo")
	public void clickOnArticle() {
		homePageAndroid.clickOnArticle();
		Reporter.logWithScreenShot("Article clicked", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify delete confirmation message")
	public void verifyDeleteConfirm() {
		homePageAndroid.verifyDeleteConfirm();
		Reporter.logWithScreenShot("Delete confirmation displayed", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user delete the Article")
	public void deleteWelArticle() {
		homePageAndroid.deleteWelArticle();
		LFSUtilsIOS.pause(7000);
		Reporter.logWithScreenShot("Article deleted", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify Averages and Comparator button")
	public void verifyAveragesComparator() {
		homePageAndroid.verifyAverageAndComparator();
	}
	
	@QAFTestStep(description = "user verify count as {0} on Pattern tab")
	public void verifyCountofPatternOnPatternTab(String count) {
		homePageAndroid.verifyCountPatternTab(count);
	}
	
	@QAFTestStep(description = "user verify no pattern on home screen")
	public void verifyNoPatternHomeScreen() {
		homePageAndroid.verifyNoPatternHomeScreen();
	}
	
	@QAFTestStep(description = "user verify no event on last sync tab for envent {0}")
	public void noEventLastSyncTab(Object option) {
		homePageAndroid.lastSyncDeletedEvent(option);
	}
	
	@QAFTestStep(description = "user verify A1C Comparator information icon")
	public void verifyA1CInfo() {
		homePageAndroid.verifyA1CInformation();
		Reporter.logWithScreenShot("Information icon clicked", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user clicks on added A1C")
	public void clickAddedA1c() {
		homePageAndroid.clickAddedA1c();
	}
	
	@QAFTestStep(description = "user verify A1C history")
	public void verifyA1CHistory() {
		homePageAndroid.verifyA1CHistory();
	}
	
	@QAFTestStep(description = "user verify A1C does not exceeds min and max values")
	public void verifyA1cMinMaxValue() {
		homePageAndroid.verifyA1cMinMaxValue();
	}
	
	@QAFTestStep(description="user enter 3 A1C details")
	public void enter3A1CValues() {
		homePageAndroid.add3A1CValues();
	}
	
	@QAFTestStep(description="user verify 3 A1C added values")
	public void verify3A1CEvents() {
		homePageAndroid.verifyAdded3Events();
	}
	
	@QAFTestStep(description = "user verify Why do I not see anything on my graph popup")
	public void verifyWhyDoINotSeeAnythingPopup() {
		homePageAndroid.verifyWhyDoINotSeeAnythingPopup();
	}
	
	@QAFTestStep(description = "user click on Pair a meter to download reading button")
	public void clickMeterDownloadReading() {
		homePageAndroid.clickMeterDownloadReading();
	}
	
	@QAFTestStep(description = "user verifies Pair a Meters page UI")
	public void verifyPairMeterUI() {
		homePageAndroid.verifyPairMeter();
	}
	
	@QAFTestStep(description = "user verify Added BG value on home page")
	public void verifyAddedBG() {
		homePageAndroid.verifyAddedBG();
		Reporter.logWithScreenShot("BG added", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify Added Steps value on home page")
	public void verifyAddedSteps() {
		homePageAndroid.verifyAddedSteps();
		Reporter.logWithScreenShot("Steps added", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify Added Carbs value on home page")
	public void verifyAddedCarbs() {
		homePageAndroid.verifyAddedCarbs();
		Reporter.logWithScreenShot("Carbs added", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify Added Activity value on home page")
	public void verifyAddedActivity() {
		homePageAndroid.verifyAddedActivity();
		Reporter.logWithScreenShot("Activity added", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verifies activity goals weekwise on homepage")	
	public void verifyWeekWise() {
		homePageAndroid.verifyWeekWise();
		Reporter.logWithScreenShot("Activity added", MessageTypes.Pass);
	}
	@QAFTestStep(description = "user verifies activity goals daywise on homepage")
	public void verifyDayWise() {
		homePageAndroid.verifyDayWise();
		Reporter.logWithScreenShot("Activity added", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verifies goals enabled on homepage")
	public void verifyHomepageGoalsOn() {
		homePageAndroid.verifyHomepageGoalsOn();
		Reporter.logWithScreenShot("Goals turned on from Settings", MessageTypes.Pass);	
	}
	
	@QAFTestStep(description = "user clicks on the accordian to expand the recommendation")
	public void clicksAccordianToExpandRec() {
		homePageAndroid.clicksAccordianToExpand();
	}
	
	@QAFTestStep(description = "user clicks on the accordian to close the recommendation")
	public void clicksAccordianToCloseRec() {
		homePageAndroid.clicksAccordianToClose();
	}
	
	@QAFTestStep(description = "user verify IOB is not visible in the expanded view of the recomendation")
	public void IOBNotVisible() {
		homePageAndroid.IOBNotVisibleInRec();
	}
	
	@QAFTestStep(description = "user verify added events on timeline view")
	public void VerifyTimeline_value() {
		homePageAndroid.VerifyTimeline_value();
	}
	
	@QAFTestStep(description = "user verify carb and bolus on Timeline screen")
	public void verify_CarbBolus() {
		homePageAndroid.verify_CarbBolus();
	}
	
	@QAFTestStep(description = "user verify recommended insulin dose and Blood Glucose Data on home screen")
	public void verify_BgBolus() {
		homePageAndroid.verify_BgBolus();
	}
	
	@QAFTestStep(description="user click on Help")
	public void userClickOnHelp(){
		homePageAndroid.selectFromMenu();
		Reporter.logWithScreenShot("Help button click", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user selects QuickTouchReveal Tutorial")
	public void userSelectQuickTouchReveal(){
		
		homePageAndroid.SelectQuickTouchReveal();
		Reporter.logWithScreenShot("Help button click", MessageTypes.Pass);
	}
	
	@QAFTestStep(description="user verify Bg range {0} and value {1} displayed for average button")
	public void userVerifyRangeDisplayedForAverageButton(String range, String value) {
		homePageAndroid.verifyBgRange(range, value);
	}
	
	
	@QAFTestStep(description="user verify time insulin range note field and type")
	public void userVerifyInsulinRangeNoteandType() {
         eventlogPageAndroid.verifyAddInsulinEventScreen();
         //eventlogPageAndroid.verifyInsulinTypePopUp();
		
	}
	
	@QAFTestStep(description="user clicks on X icon from add an event screen")
	public void userClickOnCloseIcon() {
         homePageAndroid.userClickOnCloseIcon();
		
	}
	
	@QAFTestStep(description="user verifies the events are not displayed")
	public void verifyEvents() {
		homePageAndroid.verifyEvents();
		
	}
	@QAFTestStep(description="user clicks on My Progress")
	public void userClicksOnMyProgress(){
		progresspage.clickProgressBar();
	}

	
	@QAFTestStep(description="user verifies all events are displayed")
	public void userVerifiesAllEventsAreDisplayed() {
		homePageAndroid.verifyAddEvents();
	}
	
	@QAFTestStep(description="user verifies empty Home screen")
	public void userVerifiesEmptyHomeScreen() {
		homePageAndroid.verifyEmptyHomeScreen();
	}
	
	
}
