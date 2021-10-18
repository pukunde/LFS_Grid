package com.NFK.version1.iOS.steps;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.beans.EventDetailBeans;
import com.NFK.version1.iOS.pages.EventLogPageIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class EventLogIOSStep {

	EventLogPageIOS eventlog = new EventLogPageIOS();

	@QAFTestStep(description = "user enters blood glucose amount as {0}")
	public void enterBGamount(String value) {
		// Changes done by Manjushri
		// int i=Integer.parseInt(value);
		// value=LFSUtilsIOS.mmolMGDL(i);
		// eventlog.getNFKioseventlogpageGlucoseAmountTxt().click();
		eventlog.enterManualBGvalue(value);
		// eventlog.getNFKioseventlogpageGlucoseDropImg().click();

	}

	@QAFTestStep(description = "user clicks on Add Event")
	public void clicksOnLogevent() {
		eventlog.clickLogevent();
	}

	@QAFTestStep(description = "user verifies HI/LO event {0} on Event Log")
	public void verifyHILOValuesLogScreen(String value) {
		eventlog.verifyHILOvalue(value);
	}

	@QAFTestStep(description = "user selects event type as {0}")
	public void SelectEventType(String option) {
		eventlog.userSelectFromLogEventList(option);
	}

	@QAFTestStep(description = "user verify Last insulin logged message")
	public void userverifyloggedinsulin() {
		Reporter.logWithScreenShot("Last Logged insulin displayed", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user clicks save button on eventlog")
	public void clicksOnSaveBtn() {
		eventlog.clickSaveBtnEventLog();
	}

	@QAFTestStep(description = "user select log event type as {0}")
	public void selectsLogeventType(String option) {
		eventlog.userSelectFromLogEventList(option);
		Reporter.logWithScreenShot("Event type selected", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user adds blood glucose details using {0}")
	public void addBGdetailsIOS(Object details) {
		eventlog.addManualGlucose(details);
	}

	@QAFTestStep(description = "user verifies added event {0} on Event Log")
	public void verifyAddedEventOnEventLogScreen(Object values) {
		eventlog.verifyAddedEventOnEventLogScreen(values);
	}

	@QAFTestStep(description = "user verifies added and edited events on Event Log screen")
	public void userVerifiesEditedAddedEvents() {
		eventlog.verifyEditedAdded();
	}

	@QAFTestStep(description = "user edits Note details using {0}")
	public void editNoteDetails(Object details1) {
		eventlog.editNotesDetails(details1);
	}

	@QAFTestStep(description = "user verifies glucose event {0} on Event Log")
	public void verifyBGEventOnLogScreen(Object values) {
		eventlog.verifyBGEventLogScreen(values);
	}

	@QAFTestStep(description = "user clicks on classic view tab and select current date")
	public void clicksClassicView() {
		eventlog.clickClassic();
	}

	@QAFTestStep(description = "user edits blood glucose details using {0}")
	public void editBGdetailsIOS(Object details) {
		eventlog.editManualGlucose(details);
	}

	@QAFTestStep(description = "user adds carbs details using {0}")
	public void addcarbsDetails(Object details) {
		eventlog.addCarbDetail(details);
	}

	@QAFTestStep(description = "user edits carbs details using {0}")
	public void editcarbsDetails(Object details) {
		eventlog.editCarbDetail(details);
	}

	@QAFTestStep(description = "user adds insulin details using {0}")
	public void addInsulinDetails(Object details) {
		eventlog.addInsulinDetail(details);
	}

	@QAFTestStep(description = "user edits insulin details using {0}")
	public void editInsulinDetails(Object details) {
		eventlog.editInsulinDetail(details);
	}

	@QAFTestStep(description = "user edits activity details using {0}")
	public void editactivityDetails(Object details) {
		eventlog.editActivityDetail(details);
	}

	@QAFTestStep(description = "user adds insulin value using {0}")
	public void userAddInsulinValueUsing(String details) {
		eventlog.enterOnlyInsulinvalue(details);
	}

	@QAFTestStep(description = "user adds activity value using {0}")
	public void userAddActivityValueUsing(String details) {
		eventlog.enterOnlyActivityvalue(details);
	}

	@QAFTestStep(description = "user selects type of insulin as {0} and save")
	public void userSelectTypeOfInsulinAsAndSave(String insulin) {
		eventlog.typeOfInsulinSelection(insulin);
	}

	@QAFTestStep(description = "user selects type of activity as {0} and save")
	public void userSelectTypeOfActivityAsAndSave(String activitytype) {
		eventlog.typeOfActivitySelection(activitytype);
	}

	@QAFTestStep(description = "user verifies the default insulin type is {0}")
	public void userVerifyTheDefaultInsulinTypeIs(String type) {
		eventlog.verifytypeofInsulindefault(type);
	}

	@QAFTestStep(description = "user verifies the default activity type is {0}")
	public void userVerifyTheDefaultActivityTypeIs(String type) {
		eventlog.verifytypeofActivityefault(type);
	}

	@QAFTestStep(description = "user adds activity details using {0}")
	public void addActivityDetails(Object details) {
		eventlog.addActivityDetail(details);
	}

	@QAFTestStep(description = "user verify unit of measurement as {0}")
	public void verifyMOU(String details) {
		eventlog.verifyUnitOfMeasurement(details);
	}

	@QAFTestStep(description = "user verify blood glucose event flow")
	public void verifyEventBGFlow() {
		eventlog.verifyAddBGEventScreen();
	}

	@QAFTestStep(description = "user adds note details using {0}")
	public void addNoteDetails(Object details1) {
		eventlog.addNoteDetails(details1);
	}

	@QAFTestStep(description = "user verifies added note event {0} on Event Log")
	public void verifyAddedNotesEventOnEventLogScreen(Object values) {
		eventlog.verifyAddedNoteOnEventLogScreen(values);
	}

	@QAFTestStep(description = "user clicks on added note event {0} on Event Log")
	public void clicksOnAddedNoteEventLogScreen() {
		eventlog.clickOnAddedEventScreen();
	}

	@QAFTestStep(description = "user verifies Add an Event screen for {0}")
	public void verifyAddEventBGScreen(String option1) {
		eventlog.verifyAddedEvent(option1);
	}

	@QAFTestStep(description = "user verify carbs event flow")
	public void verifyEventCarbsFlow() {
		eventlog.verifyAddCarbEventScreen();
	}

	@QAFTestStep(description = "user verify insulin event flow")
	public void verifyEventInsulinFlow() {
		eventlog.verifyAddInsulinEventScreen();
	}

	@QAFTestStep(description = "user verify activity event flow")
	public void verifyEventActivityFlow() {
		eventlog.verifyAddActivityEventScreen();
	}

	@QAFTestStep(description = "user add multiple event and verify")
	public void addMultipleEventAndVerify() {
		eventlog.addMultipleEvent();
	}

	@QAFTestStep(description = "user verify glucose range for {0}")
	public void verifyBGRange(Object unit) {
		eventlog.verifyAllowedBGRange(unit);
	}

	@QAFTestStep(description = "user verifies Add Event Screen")
	public void verifyAddEventScreen() {
		eventlog.verifyAddEventScreen();
	}

	@QAFTestStep(description = "user taps back arrow")
	public void tapAppBackArrow() {
		eventlog.tapAppBackArrow();
	}

	@QAFTestStep(description = "user verifies the delete event button")
	public void verifyAndDeleteEvent() {
		eventlog.verifyDeleteEventButton();
	}

	@QAFTestStep(description = "user deletes selected event")
	public void clickDeleteEventButton() {
		eventlog.clickSelectedEventDeleteButton();
	}

	@QAFTestStep(description = "user verify all events")
	public void verifyAlleventScreens() {
		eventlog.verifyAlleventScreen();
	}

	@QAFTestStep(description = "user verify added BG on classic view using {0}")
	public void clicksClassicCurrentDate(Object eventDetails) {
		eventlog.clickClassicCurrentDate(eventDetails);
	}

	@QAFTestStep(description = "user verify carb max allowed range time and note field")
	public void verifyCarbAllowedRange() {
		eventlog.carValuebAllowedRange();
	}

	@QAFTestStep(description = "user verify Add note field allowed charcter length")
	public void verifyAddNoteField() {
		eventlog.maxAllowedNoteFieldCharacter();
	}

	@QAFTestStep(description = "user verify time picker future value not allowed")
	public void verifyTimePickerFuturevalue() {
		eventlog.verifyTimePickerFutureNotAllowed();
	}

	@QAFTestStep(description = "user verify insulin range time and type")
	public void verifyInsulinRangeTimeAndType() {
		eventlog.insulinAllowedRangeTimeType();
	}

	@QAFTestStep(description = "user verify time activity range time note field and duration")
	public void verifyActivityRangeTimeAndDuration() {
		eventlog.activityAllowedRangeTimeDuration();
	}

	@QAFTestStep(description = "user verifies note field and future timing")
	public void verifyGlucoseNoteFieldTiming() {
		eventlog.allowedNoteRangeTime();
	}

	@QAFTestStep(description = "user click on eventlog classic view added glucose")
	public void clickOnAddedGlucoseClassicView() {
		eventlog.clickClassicTableToday();
		Reporter.logWithScreenShot("glucose value clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user edit glucose carb activity from classic view")
	public void editGlucoseCarbActvity() {
		eventlog.editGlucoseCarbActivity();
	}

	@QAFTestStep(description = "user delete glucose carb activity from classic view")
	public void deleteGlucoseCarbActvity() {
		eventlog.deleteGlucoseCarbActivity();
		LFSUtilsIOS.pause(3000);
		Reporter.logWithScreenShot("Events deleted", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user add glucose insulin")
	public void addGlucoseInsulin() {
		eventlog.addGlucoseAndInsulin();
	}

	@QAFTestStep(description = "user edit glucose insulin from classic view")
	public void editGlucoseInsulin() {
		eventlog.editGlucoseInsulin();
	}

	@QAFTestStep(description = "user delete glucose insulin from classic view")
	public void deleteGlucoseInsulin() {
		eventlog.deleteGlucoseInsulin();
	}

	@QAFTestStep(description = "user verify 365 days in eventlog classic view")
	public void verify365DayeventlogClassicView() {
		eventlog.verify365DayClassicView();
	}

	@QAFTestStep(description = "user add random glucose")
	public void addRandomGlucose() {
		eventlog.addRandomGlucose();
	}

	@QAFTestStep(description = "user edit random glucose week view")
	public void editRandomGlucose() {
		eventlog.editRandomGlucose();
	}

	@QAFTestStep(description = "user delete random glucose week view")
	public void deleteRandomGlucose() {
		eventlog.deleteRandomGlucose();
		Reporter.logWithScreenShot("event deleted", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user click on today from week view")
	public void clickOntodayWeekView() {
		eventlog.clickOnTodayWeekView();
	}

	@QAFTestStep(description = "user clicks on week view")
	public void clickOnWeekView() {
		eventlog.clickWeekViewBtn();
	}

	@QAFTestStep(description = "user add random carb")
	public void addRandomCarb() {
		eventlog.addRandomCarb();
	}

	@QAFTestStep(description = "user edit random carb week view")
	public void editRandomCarbs() {
		eventlog.editRandomCarb();
	}

	@QAFTestStep(description = "user delete random carb week view")
	public void deleteRandomcarbs() {
		eventlog.deleteRandomCarb();
	}

	@QAFTestStep(description = "user add random insulin")
	public void addRandominsulin() {
		eventlog.addRandomInsulin();
	}

	@QAFTestStep(description = "user edit random insulin week view")
	public void editRandominsulin() {
		eventlog.editRandomInsulin();
	}

	@QAFTestStep(description = "user delete random insulin week view")
	public void deleteRandominsulin() {
		eventlog.deleteRandomInsulin();
	}

	@QAFTestStep(description = "user add random activity")
	public void addRandomactivitys() {
		eventlog.addRandomActivity();
	}

	@QAFTestStep(description = "user edit random activity week view")
	public void editRandomactivitys() {
		eventlog.editRandomActivity();
	}

	@QAFTestStep(description = "user delete random activity week view")
	public void deleteRandomactivitys() {
		eventlog.deleteRandomActivity();
	}

	@QAFTestStep(description = "user click and verify eventlog info screen")
	public void clicVerifyeventlogInfoScreen() {
		eventlog.clickAndVerifyInfoScreenEventLog();
	}

	@QAFTestStep(description = "user verify insulin section not displaying week view")
	public void verifyNoInsulinSectionWeekViews() {
		eventlog.verifyNoInsulinSectionWeekView();
	}

	@QAFTestStep(description = "user click on day view on eventlog")
	public void clickOnDayVieweventlog() {
		eventlog.clickOnDayView();
		Reporter.logWithScreenShot("Day view clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user click on {0} arrow in eventlog")
	public void clickOnArroweventlog(String arrow) {
		eventlog.clickArrow(arrow);
	}

	@QAFTestStep(description = "user take screen shot view screen")
	public void lastDayScreen() {
		eventlog.lastDayScreen();
	}

	@QAFTestStep(description = "user add glucose for last day using {0}")
	public void addPreviousDateGlucose(Object details) {
		eventlog.addPreviousDateGlucose(details);
	}

	@QAFTestStep(description = "user add high low and in range glucose")
	public void setHighLowInrange() {
		eventlog.addMultipleGlucose();
	}

	@QAFTestStep(description = "user add BG with before and after meal tag")
	public void BGForBeforeAfterMealTag() {
		eventlog.setBGForBeforeAfterMeal();
	}

	@QAFTestStep(description = "user add random BG before {0} day")
	public void addBGBeforeDays(String range) {
		eventlog.setDateRandomBG(range);
	}

	@QAFTestStep(description = "user add random BG for today and yesterday")
	public void addBGTodayAndYesterday() {
		eventlog.addTodayYesterDayEvent();
	}

	@QAFTestStep(description = "user verify default insulin type")
	public void defaultInsulin() {
		eventlog.verifyDefaultInsulinType();
	}

	@QAFTestStep(description = "user verify last added insulin type as default")
	public void lastAddedInsulinDefault() {
		eventlog.verifyLastInsulinAsDefault();
	}

	@QAFTestStep(description = "user verify default date for yesterday from day view")
	public void defaultDateSameAsDayView() {
		eventlog.verifyDefaultDateForYesterday();
	}

	@QAFTestStep(description = "user click on event screen on day view")
	public void clickOnEventScreen() {
		eventlog.clickOnDayViewEvent();
	}

	@QAFTestStep(description = "user verify next arrow is invisible for current day")
	public void rightArrowInvisible() {
		eventlog.verifyRightArrowInvisible();
	}

	@QAFTestStep(description = "user verify the add event title")
	public void addEventTitleVerification() {
		eventlog.verifyaAddEventTitle();
	}

	@QAFTestStep(description = "user add a carb for yesterday using {0}")
	public void addCarbForYesterday(Object eventDetails) {
		eventlog.addCarbForYesterday(eventDetails);
	}

	@QAFTestStep(description = "user verifies HI LO key on keyboard for BG")
	public void verifyBGHILOBtn() {
		eventlog.HILOBtnKeyBoard();
	}

	@QAFTestStep(description = "verify horizental swipe day view")
	public void horizentalSwipeDayview() {
		eventlog.swipeHorizenDay();
	}

	@QAFTestStep(description = "verify horizental swipe week view")
	public void horizentalSwipeWeekview() {
		eventlog.swipeHorizenWeek();
	}

	@QAFTestStep(description = "user clicks on classic view on eventlog")
	public void clickOnClassicVieweventlog() {
		eventlog.clickOnClassicView();
		Reporter.logWithScreenShot("classic view button clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user add blood glucose using {0} from event detail screen")
	public void addBGdetailsEventDetailScreenIOS(Object details) {
		eventlog.addManualGlucoseEventDetailScreen(details);
	}

	@QAFTestStep(description = "user selects last element of overnight field")
	public void selects_last_element() {

		eventlog.selectLastElement();
	}

	@QAFTestStep(description = "user enter BloodGlucose value for last element of overnight field")
	public void enter_BloodGlucose_value_for_last_element() {

		eventlog.addBGValueLastRecord();
	}

	@QAFTestStep(description = "user verifies that value is displayed for last element of overnight field")
	public void verifies_last_element() {

		eventlog.verifylastRecordData();
	}

	@QAFTestStep(description = "user set up future time of {0} as a reminder")
	public void addFutureMinuteTime(String minuteTime) {
		eventlog.addFutureMinuteTime(minuteTime);

	}

	@QAFTestStep(description = "user click classic view table")
	public void clickClassicViewTable() {
		eventlog.clickClassicTableToday();
		Reporter.logWithScreenShot("classic view table clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verify pattern details from opened list")
	public void verifyPtDetailsList() {
		eventlog.verifyPatterenDetailsExplorer();

	}

	@QAFTestStep(description = "user closes add event overlay")
	public void userClosesAddEventOverlay() {
		eventlog.clickCrossIcon();
	}

	@QAFTestStep(description = "user verify Insulin Calculator link is not displayed on add event screen")
	public void verifyIcLinkOnEventScreen() {
		eventlog.verifyIcLinkOnEventScreen();
	}

	@QAFTestStep(description = "user add glucose and then add carb activity insulin")
	public void addGlucoseCarbActvityInsulin() {
		eventlog.addGlucoseEditCarbActivityInsulin();
	}

	@QAFTestStep(description = "edit glucose and then add carb activity insulin")
	public void editGlucoseAddCarbActvityInsulin() {
		eventlog.editGlucoseAddCarbActivityInsulin();
	}

	@QAFTestStep(description = "user verifies added event on Event Log")
	public void verifyAllEvents() {
		eventlog.verifyGlucoseCarbActivityInsulin();
	}

	@QAFTestStep(description = "user adds {0} and {1} {2} event")
	public void addMultipleEvents(String option1, String option2, String option3) {

		eventlog.addMultiEvents(option1, 0);
		eventlog.addMultiEvents(option2, 1);
		eventlog.addMultiEvents(option3, 2);
	}

	@QAFTestStep(description = "user saves multiple events")
	public void saveMultipleEvents() {
		eventlog.saveMultiEvents();

	}

	@QAFTestStep(description = "user clicks on Event Log")
	public void eventLog() {
		eventlog.clickEventLog();
	}

	@QAFTestStep(description = "user edits {0} details")
	public void usereditMulitiEvent(String option) {
		eventlog.editMultiEvent(option);
	}

	@QAFTestStep(description = "user adds {0} {1} details")
	public void userAddMulitiEvent(String option1, String option2) {
		eventlog.addMultiEvents(option1, 1);
		eventlog.addMultiEvents(option2, 2);
	}

	@QAFTestStep(description = "user adds {0} and {1} details")
	public void userAddMulitiEvents(String option1, String option2) {
		eventlog.addMultiEvents(option1, 1);
		eventlog.addMultiEvents(option2, 2);
	}

	@QAFTestStep(description = "user adds {0} {1} manual event details")
	public void userAddMulitiEventForSyncEvent(String option1, String option2) {
		eventlog.addMultiEvents(option1, 0);
		eventlog.addMultiEvents(option2, 1);
	}

	@QAFTestStep(description = "user verifies the {0} page")
	public void userVerifiesTheScreen(String str0) {
		eventlog.verifyEventLog();
	}

	@QAFTestStep(description = "user scrolls the chart upto {0}")
	public void userScrollsTheChartUpto(String str0) {
		eventlog.scrollChart();
	}

	@QAFTestStep(description = "user verify activity allowed range time and note field")
	public void userVerifyActivityAllowedRangeTimeAndNoteField() {
		eventlog.verifyActivityAllowedRangeandTime();
	}
}