 	package com.NFK.version1.android.steps;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.pages.HomePageAndroid;
import com.NFK.version1.android.pages.EventLogPageAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.util.Reporter;

public class EventLogSteps {
	EventLogPageAndroid eventlogPage = new EventLogPageAndroid();
	HomePageAndroid homePageAndroid = new HomePageAndroid();

	@QAFTestStep(description = "user clicks on Add Event")
	public void clickAddEvent() {
		eventlogPage.clickOnAddEventButton();
	}

	@QAFTestStep(description = "user select log event type as {0}")
	public void selectEventToAdd(String option) {
		// eventlogPage.userSelectFromLogEventList(option);
		homePageAndroid.Addevent(option);
		Reporter.logWithScreenShot("Event type selected", MessageTypes.Pass);
	}

	
	
	@QAFTestStep(description = "user add glucose for last day using {0}")
	public void addPreviousDateGlucose(Object details) {
		eventlogPage.addPreviousDateGlucose(details);
	}

	@QAFTestStep(description = "user edits blood glucose details using {0}")
	public void editBGdetails(Object details) {
		eventlogPage.editGlucoseDetail(details);
	}

	@QAFTestStep(description = "user adds blood glucose details using {0}")
	public void addBGdetails(Object details) {
		eventlogPage.addBGDetail(details);
	}

	// @QAFTestStep(description = "user add glucose details using {0} on Add Event
	// screen")
	// public void addBGDetailOnEvent(Object details) {
	// eventlogPage.addBGDetailOnEvent(details);
	// }

	@QAFTestStep(description = "user add blood glucose details using {0} to verify")
	public void addBGdetails1(Object details) {
		eventlogPage.addBGDetailToVerify(details);
	}

	@QAFTestStep(description = "user adds carbs details using {0}")
	public void addcarbsDetails(Object details) {
		eventlogPage.addCarbManualDetail(details);
	}

	@QAFTestStep(description = "user add carbs details using {0} on Add Event screen")
	public void addcarbsDetailOnEvent(Object details) {
		eventlogPage.addcarbsDetailOnEvent(details);
	}

	@QAFTestStep(description = "user add Multiple Event details using {0} on Add Event screen")
	public void addMultipleDetailOnEvent(Object details) {
		eventlogPage.addMultipleDetailOnEvent(details);
	}

	@QAFTestStep(description = "user edits carbs details using {0}")
	public void editcarbsDetails(Object details) {
		eventlogPage.editCarbsDetail(details);
	}

	@QAFTestStep(description = "user adds insulin details using {0}")
	public void addInsulinDetails(Object details) {
		eventlogPage.addInsulinDetail(details);
	}
	@QAFTestStep(description="user adds insulin value using {0}")
	public void userAddInsulinValueUsing(String details){
		eventlogPage.enterInsulinvalue(details);
		   
	}
	
	@QAFTestStep(description = "user verifies glucose event {0} on Event Log")
	public void verifyrandomBGdetails() {
		eventlogPage.verifyRandomGlucose();
	}
	@QAFTestStep(description="user adds activity value using {0}")
	public void userAddActivityValueUsing(String details){
		eventlogPage.enterActivityvalue(details); 
		   
	}
	@QAFTestStep(description="user selects type of insulin as {0} and save")
	public void userSelectTypeOfInsulinAsAndSave(String insulin){
		eventlogPage.selecttypeofInsulin(insulin);
	}
	
	@QAFTestStep(description="user selects type of activity as {0} and save")
	public void userSelectTypeOfActivityAsAndSave(String activitytype){
		eventlogPage.selecttypeofActivity(activitytype); 
	}
	
	@QAFTestStep(description="user verifies the default insulin type is {0}")
	public void userVerifyTheDefaultInsulinTypeIs(String typeinsulin){
		eventlogPage.verifytypeofInsulin(typeinsulin);
	}
	
	@QAFTestStep(description="user verifies the default activity type is {0}")
	public void userVerifyTheDefaultActivityTypeIs(String typeActivity){
		eventlogPage.verifytypeofActivity(typeActivity);
	}
	
	
	@QAFTestStep(description = "user edits insulin details using {0}")
	public void editInsulinDetails(Object details) {
		eventlogPage.editInsulinDetail(details);
	}
	
	@QAFTestStep(description = "user edits activity details using {0}")
	public void editActivityDetails(Object details) {
		eventlogPage.editActivityDetail(details);
	}

	@QAFTestStep(description = "user verify insulin calculator link with blank value")
	public void verifyBlankInsulin() {
		eventlogPage.verifyBlankInsulin();
	}

	@QAFTestStep(description = "user edit insulin details")
	public void editInsulin() {
		eventlogPage.editInsulin();
	}

	@QAFTestStep(description = "user adds activity details using {0}")
	public void addActivityDetails(Object details) {
		eventlogPage.addActivityDetail(details);
	}
	
	@QAFTestStep(description = "user adds note details using {0}")
	public void addNoteDetails(Object details) {
		eventlogPage.addNoteDetails(details);
	}

	@QAFTestStep(description = "user verifies the delete event button")
	public void verifyAndDeleteEvent() {
		eventlogPage.verifyDeleteEvent();
	}

	@QAFTestStep(description = "user deletes selected event")
	public void selectedDeleteButton() {
		eventlogPage.confirmDeleteSelectedEvent();
	}

	/*
	 * @QAFTestStep(description = "user verify blood glucose event flow") public
	 * void verifyEventBGFlow() { eventlogPage.verifyAddBGEventScreen(); }
	 */

	/*
	 * @QAFTestStep(description = "user verify blood glucose page") public void
	 * bgPageScreenshot() { eventlogPage.takeScreenshotsOfBGPage(); }
	 */

	@QAFTestStep(description = "user verify blood glucose range")
	public void verifyBGRange() {
		eventlogPage.verifyAllowedBGRange();
	}

	@QAFTestStep(description = "user verify carbs event flow")
	public void verifyEventCarbsFlow() {
		eventlogPage.verifyAddCarbEventScreen();
	}

	@QAFTestStep(description = "user verify insulin event flow")
	public void verifyEventInsulinFlow() {
		eventlogPage.verifyAddInsulinEventScreen();
	}

	@QAFTestStep(description = "user verify activity event flow")
	public void verifyEventActivityFlow() {
		eventlogPage.verifyAddActivityEventScreen();
	}

	@QAFTestStep(description = "user clicks on save button event screen")
	public void clickOnSaveBtnEventScreen() {
		eventlogPage.clickOnSaveBtnAddEventScreen();
	}

	@QAFTestStep(description = "user add multiple event and verify")
	public void addMultipleEventAndVerify() {
		eventlogPage.addMultipleEvent();
	}

	@QAFTestStep(description = "user verifies Add Event Screen")
	public void verifyAddEventScreen() {
		eventlogPage.verifyAddEventScreen();
	}

	@QAFTestStep(description = "user taps back arrow")
	public void tapAppBackArrow() {
		eventlogPage.tapAppBackArrow();
	}

	// Test step for tapping Android back button
	@QAFTestStep(description = "user taps device back button")
	public void userTapsDeviceBackButton() {
		LFSUtilsAndroid.clickBackButton();
	}

	@QAFTestStep(description = "user enters blood glucose amount as {0}")
	public void enterBGamount(String value) {
		eventlogPage.enterManualBGvalue(value);
	}
	
	@QAFTestStep(description = "user verifies HI/LO event {0} on Event Log")
	public void verifyHILOValuesLogScreen(String value) {
		eventlogPage.VerifyHILOvalue(value);
	}

	@QAFTestStep(description = "user clicks save button on eventlog")
	public void clicksOnSaveBtn() {
		eventlogPage.clickSaveBtneventlog();
	}

	@QAFTestStep(description = "user verify unit of measurement as {0}")
	public void verifyMOU(String details) {
		eventlogPage.verifyUnitOfMeasurement(details);
	}

	@QAFTestStep(description = "user clicks on classic view tab and select current date")
	public void clickClassicANdSelectDate() {
		eventlogPage.clickClassicSelectCurrentDate();
	}

	@QAFTestStep(description = "user verify added BG on classic view using {0}")
	public void clicksClassicCurrentDate(Object eventDetails) {
		eventlogPage.clickClassicCurrentDate(eventDetails);
	}

	@QAFTestStep(description = "user verify carb max allowed range time and note field")
	public void verifyCarbAllowedRange() {
		eventlogPage.carValuebAllowedRange();
	}

	@QAFTestStep(description = "user verify insulin range time and type")
	public void verifyInsulinRangeTimeAndType() {
		eventlogPage.insulinAllowedRangeTimeType();
	}

	@QAFTestStep(description = "user verifies note field and future timing")
	public void verifyGlucoseNoteFieldTiming() {
		eventlogPage.allowedNoteRangeTime();
	}

	@QAFTestStep(description = "user verify time activity range time note field and duration")
	public void verifyActivityRangeTimeAndDuration() {
		eventlogPage.activityAllowedRangeTimeDuration();
	}

	@QAFTestStep(description="user verify Add note field allowed charcter length")
	public void verifyAddNoteField( ){
		eventlogPage.maxAllowedNoteFieldCharacter();
	}
	@QAFTestStep(description = "user click ok button")
	public void clickOKbtn() {
		eventlogPage.clickOK();
	}

	@QAFTestStep(description = "user verify activity page")
	public void screenshotsForActivityPage() {
		eventlogPage.clickScreenshotsActivityPage();
	}

	@QAFTestStep(description = "user verify carbs page")
	public void screenshotsForCarbsPage() {
		eventlogPage.clickScreenshotsCarbsPage();
	}

	@QAFTestStep(description = "user verify insulin page")
	public void screenshotsForInsulinPage() {
		eventlogPage.clickScreenshotsInsulinPage();
	}

	@QAFTestStep(description = "user click on eventlog classic view added glucose")
	public void clickOnAddedGlucoseClassicView() {
		eventlogPage.clickOnGlucoseEventClassicView();
		Reporter.logWithScreenShot("glucose value clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user add glucose and then add carb activity insulin")
	public void addGlucoseCarbActvityInsulin() {
		eventlogPage.AddGlucoseCarbActivityInsulin();
	}

	@QAFTestStep(description = "user verifies added event on Event Log")
	public void verifyAddedeventonMyEventLog() {
		eventlogPage.verifyGlucoseCarbActivityInsulin();
	}
	
	@QAFTestStep(description = "user edit glucose carb activity from classic view")
	public void editGlucoseCarbActvity() {
		eventlogPage.editGlucoseCarbActivity();
	}

	@QAFTestStep(description = "user delete glucose carb activity from classic view")
	public void deleteGlucoseCarbActvity() {
		eventlogPage.deleteGlucoseCarbActivity();
		Reporter.logWithScreenShot("Events deleted", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user add glucose insulin")
	public void addGlucoseInsulin() {
		eventlogPage.addGlucoseAndInsulin();
	}

	@QAFTestStep(description = "user edit glucose insulin from classic view")
	public void editGlucoseInsulin() {
		eventlogPage.editGlucoseInsulin();
	}

	@QAFTestStep(description = "user delete glucose insulin from classic view")
	public void deleteGlucoseInsulin() {
		eventlogPage.deleteGlucoseInsulin();
	}

	@QAFTestStep(description = "user verify 365 days in eventlog classic view")
	public void verify365DayeventlogClassicView() {
		eventlogPage.verify365DayClassicView();
	}

	@QAFTestStep(description = "user verify glucose range for {0}")
	public void verifyBGRange(Object unit) {
		eventlogPage.verifyAllowedBGRange(unit);
	}

	@QAFTestStep(description = "user clicks on week view")
	public void clickOnWeekView() {
		eventlogPage.clickWeekViewBtn();
	}

	@QAFTestStep(description = "user click and verify eventlog info screen")
	public void clicVerifyeventlogInfoScreen() {
		eventlogPage.clickAndVerifyInfoScreeneventlog();
	}

	@QAFTestStep(description = "user verify insulin section not displaying week view")
	public void verifyNoInsulinSectionWeekViews() {
		eventlogPage.verifyNoInsulinSectionWeekView();
	}

	@QAFTestStep(description = "user add random glucose")
	public void addRandomGlucose() {
		eventlogPage.addRandomGlucose();
	}

	@QAFTestStep(description = "user edit random glucose week view")
	public void editRandomGlucose() {
		eventlogPage.editRandomGlucose();
	}

	@QAFTestStep(description = "user delete random glucose week view")
	public void deleteRandomGlucose() {
		eventlogPage.deleteRandomGlucose();
		Reporter.logWithScreenShot("event deleted", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user click on today from week view")
	public void clickOntodayWeekView() {
		eventlogPage.clickOnTodayWeekView();
	}

	@QAFTestStep(description = "user add random carb")
	public void addRandomCarb() {
		eventlogPage.addRandomCarb();
	}

	@QAFTestStep(description = "user edit random carb week view")
	public void editRandomCarbs() {
		eventlogPage.editRandomCarb();
	}

	@QAFTestStep(description = "user delete random carb week view")
	public void deleteRandomcarbs() {
		eventlogPage.deleteRandomCarb();
	}

	@QAFTestStep(description = "user add random insulin")
	public void addRandominsulin() {
		eventlogPage.addRandomInsulin();
	}

	@QAFTestStep(description = "user edit random insulin week view")
	public void editRandominsulin() {
		eventlogPage.editRandomInsulin();
	}

	@QAFTestStep(description = "user delete random insulin week view")
	public void deleteRandominsulin() {
		eventlogPage.deleteRandomInsulin();
	}

	@QAFTestStep(description = "user add random activity")
	public void addRandomactivitys() {
		eventlogPage.addRandomActivity();
	}

	@QAFTestStep(description = "user edit random activity week view")
	public void editRandomactivitys() {
		eventlogPage.editRandomActivity();
	}

	@QAFTestStep(description = "user delete random activity week view")
	public void deleteRandomactivitys() {
		eventlogPage.deleteRandomActivity();
	}

	@QAFTestStep(description = "user click on day view on eventlog")
	public void clickOnDayVieweventlog() {
		eventlogPage.clickOnDayView();
		Reporter.logWithScreenShot("Day view clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user click on {0} arrow in eventlog")
	public void clickOnArroweventlog(String arrow) {
		eventlogPage.clickArrow(arrow);
	}

	@QAFTestStep(description = "user take screen shot view screen")
	public void lastDayScreen() {
		eventlogPage.lastDayScreen();
	}

	@QAFTestStep(description = "user add BG with before and after meal tag")
	public void BGForBeforeAfterMealTag() {
		eventlogPage.setBGForBeforeAfterMeal();
	}

	@QAFTestStep(description = "user add high low and in range glucose")
	public void setHighLowInrange() {
		eventlogPage.addMultipleGlucose();
	}

	@QAFTestStep(description = "user add random BG before {0} day")
	public void addBGBeforeDays(String range) {
		eventlogPage.setDateRandomBG(range);
	}

	@QAFTestStep(description = "user add random BG for today and yesterday")
	public void addRandomTodayAndYesterday() {
		eventlogPage.addRandomBGTodayANdYesterday();
	}

	@QAFTestStep(description = "user verify default insulin type")
	public void defaultInsulin() {
		eventlogPage.verifyDefaultInsulinType();
	}

	@QAFTestStep(description = "user verify last added insulin type as default")
	public void lastAddedInsulinDefault() {
		eventlogPage.verifyLastInsulinAsDefault();
	}

	@QAFTestStep(description = "user verify next arrow is invisible for current day")
	public void rightArrowInvisible() {
		eventlogPage.verifyRightArrowInvisible();
	}

	@QAFTestStep(description = "user click on event screen on day view")
	public void clickOnEventScreen() {
		eventlogPage.clickOnDayViewEvent();
	}

	@QAFTestStep(description = "user verify default date for yesterday from day view")
	public void defaultDateSameAsDayView() {
		eventlogPage.verifyDefaultDateForYesterday();
	}

	@QAFTestStep(description = "user verify the add event title")
	public void addEventTitleVerification() {
		eventlogPage.verifyaAddEventTitle();
	}

	@QAFTestStep(description = "user add a carb for yesterday using {0}")
	public void addCarbForYesterday(Object eventDetails) {
		eventlogPage.addCarbForYesterday(eventDetails);
	}

	@QAFTestStep(description = "user verifies HI LO key on keyboard for BG")
	public void verifyBGHILOBtnAndroid() {
		eventlogPage.HILOBtnKeyBoard();
	}

	@QAFTestStep(description = "verify horizental swipe day view")
	public void horizentalSwipeDayviewAndroid() {
		eventlogPage.swipeHorizenDay();
	}

	@QAFTestStep(description = "verify horizental swipe week view")
	public void horizentalSwipeWeekview() {
		eventlogPage.swipeHorizenWeek();
	}

	@QAFTestStep(description = "user clicks on classic view on eventlog")
	public void clickOnClassicVieweventlog() {
		eventlogPage.clickOnClassicView();
		Reporter.logWithScreenShot("classic view button clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user add blood glucose using {0} from event detail screen")
	public void addBGdetailsEventDetailScreenAndroid(Object details) {
		eventlogPage.addManualGlucoseEventDetailScreen(details);
	}

	@QAFTestStep(description = "user selects last element of overnight field")
	public void select_overnight_last_element() throws InterruptedException {

		eventlogPage.selectOvernightLastElement();
	}

	@QAFTestStep(description = "user enter BloodGlucose value for last element of overnight field")
	public void enter_value_overnight_LastElement() {
		eventlogPage.userEntersBGValue();

	}

	@QAFTestStep(description = "user verifies that value is displayed for last element of overnight field")
	public void verify_lastelement_of_overnight_field() {

		eventlogPage.verifyBGforlastRecordofOverNight();

	}

	@QAFTestStep(description = "user set up future time of {0} as a reminder")
	public void addFutureMinuteTime(String minuteTime) {
		eventlogPage.addFutureMinuteTime(minuteTime);

	}

	@QAFTestStep(description = "user set future date {0} and time with repeat flag as {1}")
	public void addReminderDetails(String date, String flag) {
		eventlogPage.addReminderDetails(date, flag);

	}

	@QAFTestStep(description = "user edit meal tag as {0} for bg Reading")
	public void editMealTags(String mealTag) {
		eventlogPage.editMealTag(mealTag);
	}

	@QAFTestStep(description = "user verify pattern details from opened list")
	public void verifyPtDetailsList() {
		eventlogPage.verifyPatterenDetailsExplorer();

	}

	@QAFTestStep(description = "user click classic view table")
	public void clickCell() {
		eventlogPage.clickCell();
		Reporter.logWithScreenShot("classic view table clicked", MessageTypes.Pass);

	}

	@QAFTestStep(description = "user verify Insulin Calculator link is displayed and {0}")
	public void verifyInsulinCalLink(String option) {
		eventlogPage.verifyInsulinCalculator(option);
	}

	@QAFTestStep(description = "user add blood glucose details")
	public void addBgDetail() {
		eventlogPage.addBgDetails();
	}

	@QAFTestStep(description = "user add Insulin details")
	public void addInsulinDetail() {
		eventlogPage.addInsulinDetail();
	}

	@QAFTestStep(description = "user verify Added insulin on home screen")
	public void verifyInsulinTime() {
		eventlogPage.verifyInsulinTime();
	}

	@QAFTestStep(description = "user click on Insulin calculator link")
	public void clickInsulinCalLink() {
		eventlogPage.clickInsulinCalculator();
		Reporter.logWithScreenShot("clicked insulin calculator link", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verify Save event popup")
	public void verifySaveEventPopUp() {
		eventlogPage.verifySaveEventPopUp();
	}

	@QAFTestStep(description = "user verify Blood glucose screen")
	public void verifyBgScreen() {
		eventlogPage.verifyBgScreen();
	}

	@QAFTestStep(description = "user verify add event screen")
	public void verifyAddEventPage() {
		eventlogPage.verifyAddEventPage();
	}

	@QAFTestStep(description = "user verify Carb screen")
	public void verifyCarbScreen() {
		eventlogPage.verifyCarbScreen();
	}

	@QAFTestStep(description = "user add Multiple blood glucose details using {0}")
	public void addMultipleBg(Object eventDetail) {
		// eventlogPage.addMultipleBg();
		eventlogPage.enterMultipleBg(eventDetail);
	}

	@QAFTestStep(description = "user verify invalid BG Event")
	public void invalidBgEvent() {
		eventlogPage.invalidBgEvent();
	}

	@QAFTestStep(description = "user verify event 'editGlucose' is deleted on Insulin calculator screen")
	public void verifyEditBgOnIcScreen() {
		eventlogPage.verifyEditBgOnIcScreen();
	}

	@QAFTestStep(description = "user clicks save button on add event screen")
	public void clickAddEventSavebtn() {
		eventlogPage.clickAddEventSavebtn();
	}

	@QAFTestStep(description = "user add Multiple carb details")
	public void addMultipleCarbs() {
		eventlogPage.addMultipleCarbs();
	}

	@QAFTestStep(description = "user verify Insulin Calculator link is not displayed on add event screen")
	public void verifyIcLinkOnEventScreen() {
		eventlogPage.verifyIcLinkOnEventScreen();
	}

	@QAFTestStep(description = "user add Bg before 25 min")
	public void enterBgBefore25Min() {
		eventlogPage.enterBgBefore25Min();
	}

	@QAFTestStep(description = "user add low blood glucose details")
	public void addLowRangeBg() {
		eventlogPage.addLowRangeBg();
	}

	@QAFTestStep(description = "user enter Invalid blood glucose details")
	public void enterInvalidBloodGlucose() {
		eventlogPage.enterInvalidBloodGlucose();
	}

	@QAFTestStep(description = "user verify insulin calculator screen for invalid Bg")
	public void verifyIcForInvalidBg() {
		eventlogPage.verifyIcForInvalidBg();
	}

	@QAFTestStep(description = "user add carbs details")
	public void enterCarbsDetails() {
		eventlogPage.enterCarbsDetails();
	}

	@QAFTestStep(description = "user verify search bar for adding food is {0}")
	public void verifySearchBar(String option) {
		eventlogPage.verifySearchBar(option);
	}

	@QAFTestStep(description = "user clicks on search bar")
	public void clickSearchBar() {
		eventlogPage.clickSearchBar();
	}

	@QAFTestStep(description = "user verify Select a Food screen")
	public void verifySearchFoodScreen() {
		eventlogPage.verifySearchFoodScreen();
	}

	@QAFTestStep(description = "user verify the list of food menu")
	public void verifySearchFoodMenu() {
		eventlogPage.verifySearchFoodMenu();
	}

	@QAFTestStep(description = "user verify cross icon on search bar")
	public void verifySearchCrossIcon() {
		eventlogPage.verifySearchCrossIcon();
	}

	@QAFTestStep(description = "user adds carbs details using {0} on Add Event page")
	public void addcarbs_Detail(Object details) {
		eventlogPage.addcarbs_Detail(details);
	}

	@QAFTestStep(description = "user verifies Add an Event screen for {0}")
	public void userVerifyAddAnEventScreenFor(String screenname){
		eventlogPage.verifyScreens(screenname);
	}

	@QAFTestStep(description = "user verify error message and save button")
	public void verifyErrorMsgandSaveBtn() {

	}
//
//	@QAFTestStep(description = "user clicks on Cancel option")
//	public void clickOnCancle() {
//		eventlogPage.userClickOnCancel();
//	}

	@QAFTestStep(description = "user clicks on Cancel option")
	public void clickOnCancle() {
		eventlogPage.userClickOnCancel();
	}
	
	
	@QAFTestStep(description = "user remains on 'Add an Event' screen")
	public void addAneventScreen() {

	}
	
	@QAFTestStep(description = "user verifies added event {0} on Event Log")
	public void verifyEvent() {
		eventlogPage.verifysavedEvent();	
	}
	
	@QAFTestStep(description = "user clicks on added note event {0} on Event Log")
	public void clickOnAddedNoteEventScreen() {
		eventlogPage.clickOnAddedNoteEvent();
		
	}
	
	@QAFTestStep(description="user edits Note details using {0}")
	public void userEditsNoteDetailsUsing(String eventDetail){
		eventlogPage.editNoteDetails(eventDetail);		
	}
	
	@QAFTestStep(description = "user verifies added note event {0} on Event Log")
	public void userVerifyAddedNoteEventOnMyEventLog(Object eventDetails1) {
		eventlogPage.verifyAddedNoteEventOnEventLogScreen(eventDetails1);	
	}
	
	@QAFTestStep(description = "user edits {0} details")
	public void usereditMulitiEvent(String option) {
		eventlogPage.editMultiEvent(option);
	}
	
	@QAFTestStep(description = "user adds {0} {1} details")
	public void userAddMulitiEvent (String option1, String option2) {
		eventlogPage.addMultiEvents(option1,1);
		eventlogPage.addMultiEvents(option2,2);
	}
	
	
	@QAFTestStep(description = "user adds {0} and {1} {2} event")
	public void addMultipleEvents(String option1, String option2, String option3) {
		
		eventlogPage.addMultiEvents(option1, 0);
		eventlogPage.addMultiEvents(option2, 1);
		eventlogPage.addMultiEvents(option3, 2);	
	}
	
	@QAFTestStep(description = "user saves multiple events")
	public void saveMultipleEvents() {
		eventlogPage.saveMultiEvents();	
	}	
	
	@QAFTestStep(description = "user clicks on Event Log")
	public void eventLog() {
		eventlogPage.clickEventLog();	
	}
	 
	@QAFTestStep(description = "user clicks on the back button")
	public void clickBackBtn() {
		eventlogPage.clickBackBtn();	
	}
	
	@QAFTestStep(description="user verifies the {0} page")
	public void userVerifiesThePage(String str0){
		eventlogPage.verifyEventLog();
	}
	
	@QAFTestStep(description="user scrolls the chart upto {0}")
	public void userScrollsTheChartUpto(String str0){
		eventlogPage.scrollChart();
	}
	@QAFTestStep(description="user verifies added and edited events on Event Log screen")
	public void userVerifiesEditedAddedEvents(){
		eventlogPage.verifyEditedAdded();
	}	
}