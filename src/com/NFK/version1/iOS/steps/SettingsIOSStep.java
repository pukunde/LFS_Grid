package com.NFK.version1.iOS.steps;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.SettingsPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.util.Reporter;

public class SettingsIOSStep {

	SettingsPageIOS settingsPage = new SettingsPageIOS();

	@QAFTestStep(description = "user gets redirected to setting Page")
	public void verifySettingsPageUI() {
		settingsPage.verifySettingUI();
	}
	
	@QAFTestStep(description = "user clicks on User settings button")
	public void verifyUserSettingsscreen() {
		settingsPage.verifyUserSetting();
	}	

	@QAFTestStep(description="user analyzes the target glucose range {0}")
	public void userAnalyzeTheTargetGlucoseRange(String settingdetail){
	settingsPage.analyzesensorValue(settingdetail);
	}
	
	@QAFTestStep(description = "user verifies range and clicks on Cancel button")
	public void clickOnCancle() {
		settingsPage.clickOnCancle();
	}
	
	@QAFTestStep(description = "user verifies User setting screen")
	public void verifySetting() {
		settingsPage.verifyUserSettingsScreen(); 
	}
	

//	@QAFTestStep(description="user analyze the target glucose range")
//	public void userAnalyzeTheTargetGlucoseRange(){
//		settingsPage.verifyTargetRange();
//	}
	
	
	@QAFTestStep(description="user verifies Log Insulin and Overlay Event is displayed and {0}")
	public void userVerifyLogInsulinAndOverlayEventIsDisplayedAnd(String option){
	settingsPage.verifyEventsVisibility(option);
	}
	
	@QAFTestStep(description = "user clicks setting screen back button")
	public void clicksBackButton() {
		settingsPage.clicksBackButton(); 
	}
	@QAFTestStep(description="user {0} the Events")
	public void userTheEvents(String option){
		settingsPage.clickOnEvents(option);
	}
   @QAFTestStep(description="user changes target glucose range {0}")
	public void userChangeTargetGlucoseRange(String bgvalue){
		settingsPage.verifyMinMaxTargetGlucoseRange(bgvalue); 
	}
	
	
	@QAFTestStep(description="user verifies the edited {0} target ranges")
	public void userVerifyTheEditedTargetRanges(String updatedrange){
		settingsPage.verifyEditedTargetRanges(updatedrange);
	}
	
	@QAFTestStep(description = "user clicks on Male button")
	public void clickOnMale() {
		settingsPage.clickOnMaleButton();
	}

	@QAFTestStep(description = "user verifies Male button selected")
	public void verifyMaleButtonSelected() {
		settingsPage.verifySelectedMaleButton();
	}

	@QAFTestStep(description = "user clicks on Female button")
	public void clickOnFeMale() {
		settingsPage.clickOnFemaleButton();
	}

	@QAFTestStep(description = "user verifies Female button seleced")
	public void verifyFeMaleButtonSelected() {
		settingsPage.verifySelectedFemaleButton();
	}

	@QAFTestStep(description = "user make meal tagging switch {0}")
	public void verifyMealTagging(String option) {
		settingsPage.checkMealTaggingandClick(option);
		Reporter.logWithScreenShot("meal tagging switch clicked", MessageTypes.Pass);
	}

	// Updated by Gaurav Bhamare
	@QAFTestStep(description = "user verifies selected checkboxes")
	public void verifyDiabeticQuestionsOnSettingsPage() {
		settingsPage.verifyDiabeticQuestions();
	}

	// Code is remaining
	@QAFTestStep(description = "user take Before & After BG value on setting page")
	public void VerifyBGValueBEforeAfter() {
		// settingsPage.verifyBGValueBEforeAfter();
	}

	@QAFTestStep(description = "user set the low BG range equal to high BG Range value")
	public void SetLowBGValue() {
		settingsPage.setLowBGValue();
	}

	@QAFTestStep(description = "user verify BG value")
	public void VerifyBGValue() {
		settingsPage.VerifyBGValue();
	}

	@QAFTestStep(description = "user set the High BG range equal to Low BG Range value")
	public void SetHighBGValue() {
		settingsPage.setHighBGValue();
	}

	@QAFTestStep(description = "user change Bg value")
	public void changeBgValu() {
		settingsPage.changeBgValue();
	}

	@QAFTestStep(description = "user click on Begin time in Time of Day of Breakfast")
	public void clickBeginTime() {
		settingsPage.clickBeginTime();
	}

	@QAFTestStep(description = "user change Begin time")
	public void changeBeginTime() {
		settingsPage.changeBeginTime();
	}

	@QAFTestStep(description = "user verify default ranges for Time of Day")
	public void verifyDefaultRangeTOD() {
		settingsPage.verifyDefaultRangeTOD();
	}

	@QAFTestStep(description = "user clicks on insulin switch")
	public void clickOnInsulinSwitch() {
		settingsPage.clickInsuliSwitch();
	}
	@QAFTestStep(description = "user set bg low and high overall value")
	public void setLowHighOverallValue() {
		settingsPage.setLowHighOverallBG();
	}
	@QAFTestStep(description = "user change bg low and high overall value")
	public void changeLowHighOverallValue() {
		settingsPage.chsngeLowHighOverallBG();
	}
	@QAFTestStep(description = "user edit before after bg range")
	public void editBeforeAfterBGRange() {
		settingsPage.setBGBeforeAndAfter();
	}
	
	@QAFTestStep(description = "user set over all bg range low {0} high {1}")
	public void editBeforeAfterBGRangeALl(String low,String high) {
		int i = Integer.parseInt(low);
		low = LFSUtilsIOS.mmolMGDL(i);
		int j = Integer.parseInt(high);
		high = LFSUtilsIOS.mmolMGDL(j);
		settingsPage.chsngeLowHighOverallBGs(low ,high);
	}
	
	@QAFTestStep(description = "user verify canada unit as mmol/L setting screen")
	public void canadaUnitSettingPage() {
		settingsPage.verifyCandammol();
	}
	
	@QAFTestStep(description = "user selects the checkboxes for Diabetes Management questions") 
	public void selectCheckboxesForDiabetisQstn() {
		settingsPage.clickOnAllCheckboxes();
	}
	
	@QAFTestStep(description = "user unchecks the checkboxes") 
	public void checkAllSelectedCheckboxes() {
		settingsPage.uncheckAllCheckboxes();
	}
	
	@QAFTestStep(description = "user navigates to page settings menu opened from")
	public void navigateBackFromSettings() {
		settingsPage.navigateBackFromSettings();
	}
	
	@QAFTestStep(description = "user gets BG values")
	public void getBGValues() {
		settingsPage.getBGValues();
	}
	

	@QAFTestStep(description = "user verifies selected gender and diabetes type on settings page")
	public void userVerifySelectedGenderAndDiabetesTypeOnSettingsPage() {
		settingsPage.verifySelectedGenderAndDiabetesTypeOnSettingsPage();
		
	}

	/// Varsha
	@QAFTestStep(description = "user verify gestational type for male on settings page")
	public void userVerifyGestationalTypeForMaleOnSettings() {
		settingsPage.verifyGestationalTypeForMaleOnSettings();
	}
	
	//Gaurav
	@QAFTestStep(description = "user selects {0}")
	public void userRedirectsToSettings(String obj) {
		settingsPage.userRedirectsToRequiredSettings(obj);
	}
	
	@QAFTestStep(description = "user verify awards module")
	public void verifyAwardModule() {
		settingsPage.verifyAwardsModule();
	}
	
	@QAFTestStep(description = "user verify to change the Awards Setting")
	public void verifyChangeAwardSetting() {
		settingsPage.verifyChangesForAwardSetting();
	}
	
	@QAFTestStep(description = "user verify to access information about awards")
	public void verifyAwardInfo() {
		settingsPage.verifyAwardInformation();
	}
	
	@QAFTestStep(description = "user verify selection of the Awards Setting")
	public void verifyAwardSettingSelection() {
		settingsPage.verifyAwardSelection();
	}
	
	@QAFTestStep(description = "user verify System Setting has option App and User Setting")
	public void verifyAppUserSetting() {
		settingsPage.verifyAppAndUserSetting();
	} 
	
	@QAFTestStep(description = "user verify mentor tips module")
	public void verifyMentorModule() {
		settingsPage.verifyMentorModule();
	}
	
	@QAFTestStep(description = "user verify to change the Mentor Tip Setting")
	public void verifyChangeMentor() {
		settingsPage.verifyChangeMentorTip();
	}
	
	@QAFTestStep(description = "user verify App setting Screen")
	public void verifyAppScreen() {
		settingsPage.verifyAppSettingScreen();
	}
	
	@QAFTestStep(description = "user verify and click Comparator button")
	public void clickTrends() {
		settingsPage.clickTrendsButton();
	}
	
	@QAFTestStep(description = "user click on add new A1C")
	public void clickNewA1C() {
		settingsPage.clickAddNewA1C();
	}
	
	@QAFTestStep(description = "user enter A1C details")
	public void enterA1C() {
		settingsPage.enterA1CDetails();
	}
	
	@QAFTestStep(description = "user enter A1C value {0}")
	public void enterA1CValue(Object details) {
		settingsPage.enterA1CValue(details);
	}
	
	@QAFTestStep(description = "user click on save A1C result")
	public void saveA1C() {
		settingsPage.saveA1CRecord();
	}
	
	@QAFTestStep(description = "user verifies saved A1C details")
	public void verifyA1C() {
		settingsPage.verifyA1CRecord();
	}
	
	@QAFTestStep(description = "user clicks on goal info icon")
	public void clickGoalIcon() {
		settingsPage.clickGoalInfo();
	}
	
	@QAFTestStep(description = "user verify goal info")
	public void verifyInfo() {
		settingsPage.verifyGoalInfo();
	}
	
	@QAFTestStep(description = "user redirects to add goals page")
	public void addGoalsPage() {
		settingsPage.redirectAddGoalsPage();
	}
	
	@QAFTestStep(description = "user adds BG goal")
	public void addBGGoal() {
		settingsPage.toAddBGGoal();
	}
	
	@QAFTestStep(description = "user verify A1C does not exceeds min and max values")
	public void valueLimitVerification() {
		settingsPage.verifyValueLimit();
	}
	
	@QAFTestStep(description = "user enter 3 A1C details")
	public void enter3A1CValues() {
		settingsPage.enterA1CDetails();
		settingsPage.saveA1CRecord();
		settingsPage.clickAddNewA1C();
		settingsPage.enterA1CDetails();
		settingsPage.saveA1CRecord();
		settingsPage.clickAddNewA1C();
		settingsPage.enterA1CDetails();
		settingsPage.saveA1CRecord();
		
	}
	
	@QAFTestStep(description = "user verify 3 A1C added values")
	public void verify3A1CEvents() {
		settingsPage.verifyAdded3Events();
	}
	
	@QAFTestStep(description = "user verify Why do I not see anything on my graph popup")
	public void verifyNotSeePopup() {
		settingsPage.verifyNotSeeAnythingPopup();
	}
	
	@QAFTestStep(description = "user click on Pair a meter to download reading button")
	public void clickMeterPairing() {
		settingsPage.clickMeterPairingButton();
	}
	
	@QAFTestStep(description = "user is not able to add A1C for more than 120 days")
	public void verifyNotAdding180DayData() {
		settingsPage.verifyUnableToAdd180Data();
	}
	
	@QAFTestStep(description="user verify and click on System Setting")
	public void clickSystemSetting() {
		settingsPage.clickSystemSetting();
	}
	
	@QAFTestStep(description = "user verify and add BG Goal")
	public void VerifyAddBGGoal() {
		settingsPage.VerifyAddBGGoal();
		Reporter.logWithScreenShot("BG goal added and verified", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify and add Step Goal")
	public void VerifyAddStepGoal() {
		settingsPage.VerifyAddStepGoal();
		Reporter.logWithScreenShot("Step goal added and verified", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify and add carbs Goal")
	public void VerifyAddCarbsGoal() {
		settingsPage.VerifyAddCarbsGoal();
		Reporter.logWithScreenShot("Carb goal added and verified", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify and add Activity Goal")
	public void VerifyAddActivityGoal() {
		settingsPage.VerifyAddActivityGoal();
		Reporter.logWithScreenShot("Activity goal added and verified", MessageTypes.Pass);
	}
	
	@QAFTestStep(description = "user verify invalid BG Goal")
	public void userVerifyInvalidBGGoal() {
		settingsPage.VerifyInvalidBGGoal();
		// Reporter.logWithScreenShot("Carb goal added and verified",
		// MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verify invalid Step Goal")
	public void userVerifyInvalidStepGoal() {
		settingsPage.VerifyInvalidStepGoal();
		// Reporter.logWithScreenShot("Carb goal added and verified",
		// MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verify invalid Activity Goal")
	public void userVerifyInvalidActivityGoal() {
		settingsPage.VerifyInvalidActivityGoal();
		// Reporter.logWithScreenShot("Carb goal added and verified",
		// MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verify invalid carbs Goal")
	public void userVerifyInvalidCarbsGoal() {
		settingsPage.VerifyInvalidCarbsGoal();
		// Reporter.logWithScreenShot("Carb goal added and verified",
		// MessageTypes.Pass);
	}

	@QAFTestStep(description = "user is able to select activity goal for week")
	public void userIsAbleToSelectActivityGoalForWeek() {
		settingsPage.selectActivityGoalForWeek();
	}

	
	@QAFTestStep(description = "user verifies activity goals weekwise on homepage")
	public void userVerifiesActivityGoalsWeekwiseOnHomepage() {
		settingsPage.verifyActivityGoalsWeekwiseOnHomepage();	
	}

	@QAFTestStep(description = "user verifies activity goals daywise on homepage")
	public void userVerifiesActivityGoalsDaywiseOnHomepage() {
		settingsPage.verifyActivityGoalsDaywiseOnHomepage();
	}

	
	@QAFTestStep(description = "user is able to select activity goal for day")
	public void userIsAbleToSelectActivityGoalForDay() {
		settingsPage.selectActivityGoalForDay();
		
	}
	
	@QAFTestStep(description = "user verify saved A1C details")
	public void userVerifySavedACDetails() {
		settingsPage.verifyA1CRecord();
	}
	
	@QAFTestStep(description = "user verifies Bubble animations toggle with text")
	public void verifyBubbleAnimationsToggleWithText() {
		settingsPage.verifyBubbleAnimation();
	}

	@QAFTestStep(description="verify the unit of measure for Range of glucose should be {0}")
	public void verifyTheUnitOfMeasureForRangeOfGlucoseShouldBe(String uom){
		settingsPage.verifyUserSetting();
		settingsPage.verifyUOMonUserSetting(uom);
	}
	@QAFTestStep(description="user verifies system setting screen")
	public void userVerifiesSystemSettings(){
		settingsPage.verifiesSystemSettings();
	}
@QAFTestStep(description = "user verifies selected gender and change the gender on settings page")
	public void userVerifiesSelectedGenderAndChangeTheGenderOnSettingsPage() {
		settingsPage.changeGender();
	}

	@QAFTestStep(description = "user verifies selected gender")
	public void userVerifiesSelectedGender() {
		settingsPage.VerifyGender();
	}

	@QAFTestStep(description = "user verifies selected diabetes type and chnage diabetes type on settings page")
	public void userVerifiesSelectedDiabetesTypeAndChangeTheDiabetesTypeOnSettingsPage() {
		settingsPage.changediabetesType();
	}

	@QAFTestStep(description = "user verifies diabetes type")
	public void userVerifiesSelectedDiabetesType() {
		settingsPage.VerifyDiabetesType();
	}
}
