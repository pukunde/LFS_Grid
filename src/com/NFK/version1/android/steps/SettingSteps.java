package com.NFK.version1.android.steps;

import com.NFK.version1.android.pages.SettingPageAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class SettingSteps {

	SettingPageAndroid settingsPage = new SettingPageAndroid();

	@QAFTestStep(description = "user verifies My Settings page UI")
	public void verifySettingssPageUI() {
		settingsPage.verifySettingsUI();
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

	@QAFTestStep(description = "user verifies Female button selected")
	public void verifyFeMaleButtonSelected() {
		settingsPage.verifySelectedFemaleButton();
	}

	/*
	 * @QAFTestStep(description =
	 * "user select the checkboxes for Diabetes Management questions") public void
	 * selectCheckboxesForDiabetisQstn() { settingsPage.clickOnAllCheckboxes(); }
	 */

	@QAFTestStep(description = "user verifies selected checkboxes")
	public void verifySelectedCheckboxes() {
		settingsPage.verifySelectedCheckboxes();
	}

	@QAFTestStep(description = "user selects the checkboxes for Diabetes Management questions")
	public void checkAllSelectedCheckboxes() {
		settingsPage.checkAllCheckboxes();
	}

	@QAFTestStep(description = "user unchecks the checkboxes")
	public void uncheckAllSelectedCheckboxes() {
		settingsPage.uncheckAllCheckboxes();
	}

	@QAFTestStep(description = "user make meal tagging switch {0}")
	public void verifyMealTagging(String option) {
		settingsPage.checkMealTaggingandClick(option);
		Reporter.logWithScreenShot("meal tagging switch clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user set the High BG range equal to Low BG Range value")
	public void SetHighBGValue() {
		settingsPage.setHighBGValueToLow();
	}

	@QAFTestStep(description = "user set the low BG range equal to high BG Range value")
	public void SetLowBGValue() {
		settingsPage.setLowBGValueTOHigh();
	}

	@QAFTestStep(description = "user verify BG value")
	public void VerifyBGValue(Object settingdetail) {
		settingsPage.verifysensorValue(settingdetail);
	}

	@QAFTestStep(description = "user change Bg value")
	public void changeBgValue(Object bgvalue) {
		settingsPage.changesensorValue(bgvalue);
	}

	@QAFTestStep(description = "user gets redirected to setting Page")
	public void verifySettingssPage() {
		settingsPage.verifySettingsUI();
	}
	@QAFTestStep(description = "user clicks on User settings button")
	public void verifyUsersettingsPageUI() {
		settingsPage.clickOnUserSetting();
	}
	


	@QAFTestStep(description = "user click on Begin time in Time of Day of Breakfast")
	public void clickBeginTime() {
		settingsPage.clickBeginTime();
	}

	@QAFTestStep(description = "user verify default ranges for Time of Day")
	public void verifyDefaultRangeTOD() {
		settingsPage.verifyDefaultRangeTOD();
	}
	@QAFTestStep(description="user verifies Log Insulin and Overlay Event is displayed and {0}")
	public void userVerifyLogInsulinAndOverlayEventIsDisplayedAnd(String option){
	  settingsPage.verifyEventsofSystemsetting(option);
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

	@QAFTestStep(description = "user set over all bg range low {0} high {1}")
	public void editBeforeAfterBGRangeALl(String low, String high) {
		settingsPage.chsngeLowHighOverallBGs(low, high);
	}

	@QAFTestStep(description = "user verify canada unit as mmol/L setting screen")
	public void canadaUnitSettingPage() {
		settingsPage.verifyCandammol();
	}

	@QAFTestStep(description = "user navigates to page settings menu opened from")
	public void navigateBackFromSettings() {
		settingsPage.navigateBackFromSettings();
	}

	@QAFTestStep(description = "user edit before after bg range")
	public void editBeforeAfterBGRange() {
		settingsPage.setBGBeforeAndAfter();
	}

	@QAFTestStep(description = "user change Begin time")
	public void changeBeginTime() {
		settingsPage.changeBeginTime();
	}

	@QAFTestStep(description = "user verifies selected gender and diabetes type on settings page")
	public void userVerifySelectedGenderAndDiabetesTypeOnSettingsPage() {
		settingsPage.verifySelectedGenderAndDiabetesTypeOnSettingsPage();
	}

	@QAFTestStep(description = "user verify gestational type for male on settings page")
	public void userVerifyGestationalTypeForMaleOnSettings() {
		settingsPage.verifyGestationalTypeForMaleOnSettings();
	}

	@QAFTestStep(description = "user selects {0}")
	public void userRedirectsToSettings(String obj) {
		settingsPage.userRedirectsToRequiredSettings(obj);
	}

	@QAFTestStep(description = "user verify awards module")
	public void verifyAwardModule() {
		settingsPage.verifyAwardsModule();
	}

	@QAFTestStep(description = "user verify to access information about awards")
	public void verifyAwardInfo() {
		settingsPage.verifyAwardInformation();
	}

	@QAFTestStep(description = "user verify to change the Awards Setting")
	public void verifyChangeAwardSetting() {
		settingsPage.verifyChangesForAwardSetting();
	}

	@QAFTestStep(description = "user verify selection of the Awards Setting")
	public void verifyAwardSettingSelection() {
		settingsPage.verifyAwardSelection();
	}

	@QAFTestStep(description = "user verify My System Setting has option App and User Setting")
	public void verifyAppUserSetting() {
		settingsPage.verifyAppAndUserSetting();
	}

	@QAFTestStep(description = "user verify App setting Screen")
	public void verifyAppScreen() {
		settingsPage.verifyAppSettingScreen();
	}

	@QAFTestStep(description = "user verify mentor tips module")
	public void verifyMentorModule() {
		settingsPage.verifyMentorModule();
	}

	@QAFTestStep(description = "user verify to change the Mentor Tip Setting")
	public void verifyChangeMentor() {
		settingsPage.verifyChangeMentorTip();
	}

	@QAFTestStep(description = "user click back button on setting screen")
	public void clickSettingBack() {
		settingsPage.clickSettingBack();
	}

	@QAFTestStep(description = "user verify and click on System Setting")
	public void clickSystemSetting() {
		settingsPage.clickSystemSetting();
	}

	@QAFTestStep(description = "user verify invalid BG Goal")
	public void verifyInvalidBg() {
		settingsPage.verifyInvalidBg();
	}

	@QAFTestStep(description = "user verify invalid Step Goal")
	public void verifyInvalidSteps() {
		settingsPage.verifyInvalidSteps();
	}

	@QAFTestStep(description = "user verify invalid carbs Goal")
	public void verifyInvalidCarbs() {
		settingsPage.verifyInvalidCarbs();
	}

	@QAFTestStep(description = "user verify invalid Activity Goal")
	public void verifyInvalidActivity() {
		settingsPage.verifyInvalidActivity();
	}

	@QAFTestStep(description = "user is able to select activity goal for week")
	public void clickOnWeek() {
		settingsPage.clickOnWeek();
	}

	@QAFTestStep(description = "user is able to select activity goal for day")
	public void clickOnDay() {
		settingsPage.clickOnDay();
	}

	@QAFTestStep(description = "user clicks goals info button")
	public void clickGoalInfo() {
		settingsPage.clickGoalInfo();
		Reporter.logWithScreenShot("goal info clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verifies goals are not set")
	public void clearGoals() {
		settingsPage.clearGoals();
		Reporter.logWithScreenShot("goal info clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verify and turn on Insulin calculator toggle button")
	public void verifyInsulincalToggle() {
		settingsPage.verifyAndClickToggle();
		Reporter.logWithScreenShot("Insulin calculator toggle button is verified and clicked", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user enter valid code {0} to activate insulin calculator for patient")
	public void enterValidPatientCode(Object details) {
		settingsPage.enterValidPatientCode(details);
		Reporter.logWithScreenShot("Valid code for patient entered successfully", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user enter invalid code to activate insulin calculator for patient")
	public void enterInvalidPatientCode() {
		settingsPage.enterInvalidPatientCode();
		Reporter.logWithScreenShot("Invalid code for patient entered successfully", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verify invalid code error message")
	public void verifyInvalidErrorMsg() {
		settingsPage.verifyInvalidErrorMsg();
		Reporter.logWithScreenShot("Invalid code for patient entered successfully", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user verify Insulin calculator toggle button after disabling")
	public void verifyIcToggle() {
		settingsPage.verifyIcToggle();
	}

	@QAFTestStep(description = "user click on Settings link")
	public void clickSettingssLink() {
		settingsPage.clickSettingsLink();
	}

	@QAFTestStep(description = "user clicks setting screen back button")
	public void clickOnBack() {
		settingsPage.clickOnBack();
	}

	@QAFTestStep(description = "user clicks back button after adding insulin")
	public void clickBackInsulin() {
		settingsPage.clickBackInsulin();
	}

	@QAFTestStep(description = "user analyzes the target glucose range {0}")
	public void VerifyBGValue1(Object settingdetail) {
		settingsPage.verifysensorValue(settingdetail);
	}

	@QAFTestStep(description = "user changes target glucose range {0}")
	public void EditBGValue(Object bgvalue) {
		settingsPage.changesensorValue(bgvalue);
	}

	@QAFTestStep(description="user verifies the edited {0} target ranges")
	public void userVerifyTheEditedTargetRanges(String updatedrange){
		settingsPage.verifyEditedTargetRanges(updatedrange);
	}
	@QAFTestStep(description="user {0} the Events")
	public void userTheEvents(String option){
		settingsPage.clickTheEvents(option);
	}
	
	@QAFTestStep(description = "user verify the edited target ranges")
	public void VerifyeditedBGValue1() {
		settingsPage.verifyBGValueafteredit();
	}

	@QAFTestStep(description="user verifies range and clicks on Cancel button")
	public void userVerifiesRangeAndClicksOnCancelButton(){
		settingsPage.clickOnCancle();
	}
	
	
	@QAFTestStep(description = "user verifies User setting screen")
	public void verifyuserSetting() {
		settingsPage.verifyUserSetting();
	}
	
	
	@QAFTestStep(description = "user verifies Bubble animations toggle with text")
	public void verifyBubbleAnimationsToggleWithText() {
		settingsPage.verifyBubbleAnimations();
	}
	
	@QAFTestStep(description = "user verify My settings screen")
	public void verifySettings() {
		settingsPage.verifySettings();
	}
	
	@QAFTestStep(description="verify the unit of measure for Range of glucose should be {0}")
	public void verifyTheUnitOfMeasureForRangeOfGlucoseShouldBe(String uom){
		settingsPage.clickOnUserSetting();
		settingsPage.verifyUOMonUserSetting(uom);
	}
	@QAFTestStep(description="user verifies system setting screen")
	public void userVerifiesSystemSettings(){
		settingsPage.verifiesSystemSettings();
	}
	@QAFTestStep(description="user verifies selected gender and change the gender on settings page")
	public void userVerifiesSelectedGenderAndChangeTheGenderOnSettingsPage(){
		settingsPage.changeGender();
	}

	@QAFTestStep(description="user verifies selected gender")
		public void userVerifiesSelectedGender() {
		settingsPage.VerifyGender();
	}
	@QAFTestStep(description="user verifies selected diabetes type and chnage diabetes type on settings page")
	public void userVerifiesSelectedDiabetesTypeAndChangeTheDiabetesTypeOnSettingsPage(){
		settingsPage.changediabetesType();
	}

	@QAFTestStep(description="user verifies diabetes type")
		public void userVerifiesSelectedDiabetesType() {
		settingsPage.VerifyDiabetesType();
	}
	

}