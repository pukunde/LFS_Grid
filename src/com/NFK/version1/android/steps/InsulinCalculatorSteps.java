package com.NFK.version1.android.steps;

import com.NFK.version1.android.pages.InsulinCalculatorPageAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class InsulinCalculatorSteps {

	InsulinCalculatorPageAndroid insulinCalculatorPage =
			new InsulinCalculatorPageAndroid();

	@QAFTestStep(description = "user verify activate button on Insulin calculator setting screen")
	public void verifyActivateBtn() {
		insulinCalculatorPage.verifyActivateBtn();
	}

	@QAFTestStep(description = "user turn on allow editing toggle button on Insulin calculator setting screen")
	public void clickAllowEditingTogglebtn() {
		insulinCalculatorPage.clickAllowEditingTogglebtn();
	}

	@QAFTestStep(description = "user enter event details using {0}")
	public void enterEventDetail(Object details) {
		insulinCalculatorPage.enterEventDetail(details);
	}

	@QAFTestStep(description = "user click activate button on Insulin calculator setting screen")
	public void clickActivitybtn() {
		insulinCalculatorPage.clickActivitybtn();
	}

	@QAFTestStep(description = "user delete blood glucose from Insulin calculator screen")
	public void deleteBgFromIcScreen() {
		insulinCalculatorPage.deleteBgFromIc();
	}


	@QAFTestStep(description = "user delete carbs from Insulin calculator screen")
	public void deletecarbFromIc() {
		insulinCalculatorPage.deletecarbFromIc();
	}

	@QAFTestStep(description = "user verify the Insulin Calculator with all information")
	public void verifyIcInfo() {
		insulinCalculatorPage.verifyIcInfo();
	}

	@QAFTestStep(description = "user verify to and fro navigation on Insulin Calculator")
	public void verifyToFroOnIc() {
		insulinCalculatorPage.verifyToFroOnIc();
	}
	@QAFTestStep(description = "user verify Insulin Calculator screen with blank event details")
	public void enterBlankEventDetail() {
		insulinCalculatorPage.enterBlankEventDetail();
	}

	@QAFTestStep(description = "user verify Invalid error message")
	public void verifyErrorMsg() {
		insulinCalculatorPage.verifyErrorMsg();
	}

	@QAFTestStep(description = "user enter Invalid Maximum Single Dose Limit")
	public void enterInvalidMsDose() {
		insulinCalculatorPage.enterInvalidMsDose();
	}
	@QAFTestStep(description = "user enter Invalid Target BG")
	public void enterInvalidTargetBg() {
		insulinCalculatorPage.enterInvalidTargetBg();
	}
	@QAFTestStep(description = "user enter Invalid Correction Factor")
	public void enterInvalidCF() {
		insulinCalculatorPage.enterInvalidCF();
	}
	@QAFTestStep(description = "user enter Invalid Insulin to Carb Ratio")
	public void enterInvalidIToCRatio() {
		insulinCalculatorPage.enterInvalidIToCRatio();
	}

	@QAFTestStep(description = "user verify added event {0} on Bc screen")
	public void verifyAddedEventBc(Object eventDetail) {
		// insulinCalculatorPage.verifyAddedEventBc(eventDetail);
		insulinCalculatorPage.verifyAddedEventIc(eventDetail);
		Reporter.logWithScreenShot("event added on BC screen", MessageTypes.Pass);
	}
	@QAFTestStep(description = "user verify event {0} is deleted on Bc screen")
	public void verifyDeleteEventBc(Object eventDetail) {
		insulinCalculatorPage.verifyDeleteEventBc(eventDetail);

	}
	@QAFTestStep(description = "user verify insulin calculator setting page")
	public void verifyIcSettingScreen() {
		insulinCalculatorPage.verifyIcSettingScreen();
	}

	@QAFTestStep(description = "user verify added carb on Insulin Calculator Screen")
	public void verifyAddedCarbOnIc() {
		insulinCalculatorPage.verifyAddedCarbOnIc();
	}

	@QAFTestStep(description = "user edit one of the carb value")
	public void editCarbValue() {
		insulinCalculatorPage.editCarbValue();
		Reporter.logWithScreenShot("carb edit", MessageTypes.Pass);
	}

	@QAFTestStep(description = "user delete one of the carb")
	public void deleteCarbValue() {
		insulinCalculatorPage.deleteCarbValue();
	}

	@QAFTestStep(description = "user verify added Bg on Insulin Calculator Screen")
	public void verifyAddedBgOnIc() {
		insulinCalculatorPage.verifyAddedBgOnIc();
	}
	@QAFTestStep(description = "user verify Insulin Calculator screen with blank Active Insulin")
	public void blankActiveInsulin() {
		insulinCalculatorPage.blankActiveInsulin();
	}

	@QAFTestStep(description = "user verify Insulin Calculator screen with blank Dosage Increment")
	public void blankDosageIncrement() {
		insulinCalculatorPage.blankDosageIncrement();
	}

	@QAFTestStep(description = "user verify Insulin Calculator screen with blank Insulin Concentration")
	public void blankInsulinconcentration() {
		insulinCalculatorPage.blankInsulinconcentration();
	}

	@QAFTestStep(description = "user verify Insulin Calculator screen with blank Target Bg")
	public void blankTargetBg() {
		insulinCalculatorPage.blankTargetBg();
	}
	@QAFTestStep(description = "user verify Insulin Calculator screen with blank Correction Factor")
	public void blankcorrectionFactor() {
		insulinCalculatorPage.blankcorrectionFactor();
	}
	@QAFTestStep(description = "user verify Insulin Calculator screen with blank Insulin To Carb Ratio")
	public void blankInsulinToCarbRatio() {
		insulinCalculatorPage.blankInsulinToCarbRatio();
	}

	@QAFTestStep(description = "user enter multiple event details")
	public void multipleEventDetails() {
		insulinCalculatorPage.multipleEventDetails();
	}
	@QAFTestStep(description = "user verify low bg message")
	public void verifyInRangePopUp() {
		insulinCalculatorPage.verifyInRangePopUp();
	}
	@QAFTestStep(description = "user verify infographic view for blood glucose")
	public void verifyBgIcGraph() {
		insulinCalculatorPage.verifyBgIcGraph();
	}

	@QAFTestStep(description = "user verify list view for blood glucose")
	public void verifyBgIcCalculation() {
		insulinCalculatorPage.verifyBgIcCalculation();
	}

	@QAFTestStep(description = "user verify infographic view for carb")
	public void verifyCarbIcGraph() {
		insulinCalculatorPage.verifyCarbIcGraph();
	}

	@QAFTestStep(description = "user verify list view for carb")
	public void verifyCarbIcCalculation() {
		insulinCalculatorPage.verifyCarbIcCalculation();
	}

	@QAFTestStep(description = "user verify infographic view for Insulin")
	public void verifyInsulinIcGraph() {
		insulinCalculatorPage.verifyInsulinIcGraph();
	}

	@QAFTestStep(description = "user verify list view for Insulin")
	public void verifyInsulinIcCalculation() {
		insulinCalculatorPage.verifyInsulinIcCalculation();
	}
	@QAFTestStep(description = "user add blood glucose details using {0} on Ic screen")
	public void addBGDetailOnIc(Object details) {
		insulinCalculatorPage.addBGDetailOnIc(details);
	}

	@QAFTestStep(description = "user verify Insulin Calculator Screen")
	public void verifyInsulinCalScreen() {
		insulinCalculatorPage.verifyInsulinCalScreen();
	}
	@QAFTestStep(description = "user verify added event {0} on Ic screen")
	public void verifyAddedEventOnIc(Object eventDetail) {
		insulinCalculatorPage.verifyAddedEventOnIc(eventDetail);

	}
	@QAFTestStep(description = "user add carbs details using {0} on Ic screen")
	public void addcarbsDetailOnIc(Object details) {
		insulinCalculatorPage.addcarbsDetailOnIc(details);
	}

	@QAFTestStep(description = "user verify infographic after deleting blood glucose on Ic screen")
	public void verifyGraphForBg() {
		insulinCalculatorPage.verifyGraphForBg();
	}

	@QAFTestStep(description = "user verify list view after deleting blood glucose on Ic screen")
	public void verifyListForBg() {
		insulinCalculatorPage.verifyListForBg();
	}

	@QAFTestStep(description = "user verify infographic after deleting carbs on Ic screen")
	public void verifyGraphForCarb() {
		insulinCalculatorPage.verifyGraphForCarb();
	}

	@QAFTestStep(description = "user verify list view after deleting carbs on Ic screen")
	public void verifyListForCarb() {
		insulinCalculatorPage.verifyListForCarb();
	}

	@QAFTestStep(description = "user verify infographic view for blood glucose and carbs")
	public void verifyGraphForBgCarb() {
		insulinCalculatorPage.verifyGraphForBgCarb();
	}
	@QAFTestStep(description = "user verify list view for blood glucose and carbs")
	public void verifyListForBgCarb() {
		insulinCalculatorPage.verifyListForBgCarb();
	}

	@QAFTestStep(description = "user add multiple carbs details on Ic screen using {0}")
	public void addMultipleCarbOnIc(Object eventDetail) {
		insulinCalculatorPage.addMultipleCarbOnIc(eventDetail);
	}

	@QAFTestStep(description = "user verify infographic view after deleting events")
	public void verifyGraphAfterDeleting() {
		insulinCalculatorPage.verifyGraphAfterDeleting();
	}

	@QAFTestStep(description = "user verify list view after deleting events")
	public void verifyListAfterDeleting() {
		insulinCalculatorPage.verifyListAfterDeleting();
	}
	@QAFTestStep(description = "user verify infographic view for Insulin and Bg")
	public void verifyInsulinBgGraph() {
		insulinCalculatorPage.verifyInsulinBgGraph();
	}
	@QAFTestStep(description = "user verify list view for Insulin and Bg")
	public void verifyInsulinBgList() {
		insulinCalculatorPage.verifyInsulinBgList();
	}

	@QAFTestStep(description = "user verify infographic view for Insulin and Carb")
	public void verifyInsuliCarbGraph() {
		insulinCalculatorPage.verifyInsuliCarbGraph();
	}
	@QAFTestStep(description = "user verify list view for Insulin and Carb")
	public void verifyInsuliCarbList() {
		insulinCalculatorPage.verifyInsuliCarbList();
	}

	@QAFTestStep(description = "user click up arrow in the footer")
	public void clickFooterUpArrow() {
		insulinCalculatorPage.clickFooterUpArrow();
	}
	@QAFTestStep(description = "user verify infographic view after clicking up arrow")
	public void verifyGraphViewUpArrow() {
		insulinCalculatorPage.verifyGraphViewUpArrow();
	}
	@QAFTestStep(description = "user click down arrow in the footer")
	public void clickFooterDownArrow() {
		insulinCalculatorPage.clickFooterDownArrow();
	}
	@QAFTestStep(description = "user verify infographic view after clicking down arrow")
	public void verifyGraphViewDownArrow() {
		insulinCalculatorPage.verifyGraphViewDownArrow();
	}
	@QAFTestStep(description = "user verify infographic view")
	public void verifyGraphView() {
		insulinCalculatorPage.verifyGraphView();
	}

	@QAFTestStep(description = "user verify Insulin Dose and Manual adjustment on list view after increasing")
	public void verifyIdoseandMadjIncList() {
		insulinCalculatorPage.verifyIdoseandMadjIncList();
	}
	@QAFTestStep(description = "user verify Insulin Dose and Manual adjustment on list view after decreasing")
	public void verifyIdoseandMadjDecList() {
		insulinCalculatorPage.verifyIdoseandMadjDecList();
	}
	@QAFTestStep(description = "user edit carbs details on Ic screen")
	public void editCarbOnIc() {
		insulinCalculatorPage.editCarbOnIc();
	}

	@QAFTestStep(description = "user verify carb value after editing")
	public void verifyCarbEditIc() {
		insulinCalculatorPage.verifyCarbEditIc();
	}
	@QAFTestStep(description = "user verify infographic view after editing carb")
	public void verifyEditCarbGraph() {
		insulinCalculatorPage.verifyEditCarbGraph();
	}
	@QAFTestStep(description = "user verify List view after editing carb")
	public void verifyEditCarbList() {
		insulinCalculatorPage.verifyEditCarbList();
	}
	@QAFTestStep(description = "user delete blood glucose and carb from Insulin calculator screen")
	public void deleteBGCarb() {
		insulinCalculatorPage.deleteBGCarb();
	}

	@QAFTestStep(description = "user delete  Multiple bg and Single carb from Insulin calculator screen")
	public void deleteMBgSCarb() {
		insulinCalculatorPage.deleteMBgSCarb();
	}

	@QAFTestStep(description = "user delete Single bg and Multiple carb from Insulin calculator screen")
	public void deleteSBgMCarb() {
		insulinCalculatorPage.deleteSBgMCarb();
	}
	@QAFTestStep(description = "user verify have you recorded your recent insulin text")
	public void verifyInsulinTxt() {
		insulinCalculatorPage.verifyInsulinTxt();
	}
	@QAFTestStep(description = "user click on plus sign icon")
	public void clickPlusIcon() {
		insulinCalculatorPage.clickPlusIcon();
	}
	@QAFTestStep(description = "user verify Add an Insulin Event screen")
	public void verifyAddInsulinEventScreen() {
		insulinCalculatorPage.verifyAddInsulinEventScreen();
	}

	@QAFTestStep(description = "user clicks on search icon")
	public void clickSearchIcon() {
		insulinCalculatorPage.clickSearchIcon();
	}

	@QAFTestStep(description = "user verify carb value after adding food on Ic screen")
	public void verifyCarbs() {
		insulinCalculatorPage.verifyCarbs();
	}

	@QAFTestStep(description = "user verify search icon and the plus icon in last carb entry")
	public void verifySearchPlusIcon() {
		insulinCalculatorPage.verifySearchPlusIcon();
	}

	@QAFTestStep(description = "user select a food with calories greater than 999 gms")
	public void selectHighCalFood() {
		insulinCalculatorPage.selectFoodHighCal();
	}

	@QAFTestStep(description = "user verify the required error message")
	public void verifyReqErrorMsg() {
		insulinCalculatorPage.verifyReqErrorMsg();
	}

	@QAFTestStep(description = "user verify Quick Use tutorial with all information")
	public void verifyQuickInfo() {
		insulinCalculatorPage.verifyQuickInfo();
	}

	@QAFTestStep(description = "user verify there is no message after finishing Quick Use tutorial")
	public void verifyNoMessage() {
		insulinCalculatorPage.verifyNoMessage();
	}

	@QAFTestStep(description = "user verify to and fro navigation on Quick Use tutorial")
	public void verifyQuickToFro() {
		insulinCalculatorPage.verifyQuickToFro();
	}

	@QAFTestStep(description = "user verify pop-up on first screen of First Use Tutorial")
	public void verifyFirstUsePopUp() {
		insulinCalculatorPage.verifyFirstUsePopUp();
	}

	@QAFTestStep(description = "user verify pop-up dismiss on scrolling the screen")
	public void verifyPopUpDismiss() {
		insulinCalculatorPage.verifyPopUpDismiss();
	}

	@QAFTestStep(description = "user verify Yield icon is present in infographic view")
	public void verifyYieldIconPresent() {
		insulinCalculatorPage.verifyYieldIcon_Graph();
	}

	@QAFTestStep(description = "user verify Yield icon is present in list view")
	public void verifyYieldIcon_List() {
		insulinCalculatorPage.verifyYieldIcon_List();
	}
	@QAFTestStep(description = "user verify Yield icon is displaying when Maximum single dose Limit reached")
	public void verifyYield_Icon() {
		insulinCalculatorPage.verifyYield_Icon();
	}

	@QAFTestStep(description = "user verify Yield icon is not present in infographic view")
	public void verifyYieldIconGraph() {
		insulinCalculatorPage.verifyYieldIconGraph();
	}
	@QAFTestStep(description = "user verify Yield icon is not present in list view")
	public void verifyYieldIconInList() {
		insulinCalculatorPage.verifyYieldIconInList();
	}

	@QAFTestStep(description = "user verify Pop up message when Maximum single dose Limit reached")
	public void verifyMaxPopUpMsg() {
		insulinCalculatorPage.verifyMaxPopUpMsg();
	}

	@QAFTestStep(description = "user verify Maximum single dose Limit reached Pop up message dismiss on swiping")
	public void verifyMaxPopUpDismiss() {
		insulinCalculatorPage.verifyMaxPopUpDismiss();
	}
	@QAFTestStep(description = "user verify Maximum single dose Limit reached Pop up message on tapping plus icon")
	public void VerifyPlusIconPopUpMsg() {
		insulinCalculatorPage.VerifyPlusIconPopUpMsg();
	}

	@QAFTestStep(description = "user verify the Insulin Calculator with all information and clicks Start Over button")
	public void clickStartOver() {
		insulinCalculatorPage.clickStartOver();
	}

	@QAFTestStep(description = "user verify FUT starting again")
	public void VerifyFUT() {
		insulinCalculatorPage.VerifyFUT();
	}

	@QAFTestStep(description = "user verify the Insulin Calculator with all information and clicks Yes button")
	public void clickFUTYes() {
		insulinCalculatorPage.clickFUTYes();
	}

	@QAFTestStep(description = "user clicks on info icon on Bc screen")
	public void clickInfoIconBc() {
		insulinCalculatorPage.clickInfoIconBc();
	}
	@QAFTestStep(description = "user verify Quick Use tutorial link")
	public void verifyQuickUseLink() {
		insulinCalculatorPage.VerifyQuickUseLink();
	}

	@QAFTestStep(description = "user verify entire longer tutorial by swiping")
	public void verifyLongerTutorail() {
		insulinCalculatorPage.verifyLongerTutorail();
	}

	@QAFTestStep(description = "user verify detail view of longer tutorial")
	public void verifyLT_Details() {
		insulinCalculatorPage.verifyLT_Details();
	}
	
	
	

	@QAFTestStep(description = "user verify Forward Backward Navigation for entire longer tutorial")
	public void verifyLTForwardBackNavigation() {
		insulinCalculatorPage.verifyLTForwardBackNavigation();
	}

	@QAFTestStep(description = "user can exit Quick Use tutorial at any time")
	public void VerifyQuickUseExit() {
		insulinCalculatorPage.VerifyQuickUseExit();
	}
	@QAFTestStep(description = "user verify recommended insulin dose and BC Data on home screen")
	public void verifyDoseAndBcData() {
		insulinCalculatorPage.verifyDoseAndBcData();
	}
	@QAFTestStep(description = "user clicks recommended insulin dose on home screen")
	public void clickRecommendedDose() {
		insulinCalculatorPage.clickRecommendedDose();
	}
	@QAFTestStep(description = "user verify to and fro navigation between first two screens")
	public void toFroNavigation() {
		insulinCalculatorPage.toFroNavigation();
	}
	@QAFTestStep(description = "user verify FUT without popup on first screen")
	public void VerifyFUTPopUp() {
		insulinCalculatorPage.VerifyFUTPopUp();
	}
	@QAFTestStep(description = "user verify search icon for adding food is {0}")
	public void verifySearch_Icon(String option) {
		insulinCalculatorPage.verifySearch_Icon(option);
	}
	@QAFTestStep(description = "user verify recommended dose on timeline view")
	public void verifyRecommendedDose() {
		insulinCalculatorPage.verifyRecommendedDose();
	}

	@QAFTestStep(description = "user mark an item as favorite")
	public void markAsFavorite() {
		insulinCalculatorPage.markAsFav();
	}

	@QAFTestStep(description = "user mark an item as unfavorite")
	public void markAsUnFavorite() {
		insulinCalculatorPage.markAsUnFav();
	}

	@QAFTestStep(description = "user searches a food item")
	public void searchFood() {
		insulinCalculatorPage.searchFoodItem();
	}

	@QAFTestStep(description = "user add {0} from food menu")
	public void add_Food(Object eventDetail) {
		insulinCalculatorPage.add_Food(eventDetail);
	}

	@QAFTestStep(description = "user add two food items")
	public void addTwoFoods() {
		insulinCalculatorPage.addTwoItems();
	}

	@QAFTestStep(description = "user click Just Added Food Items")
	public void clickJustAddedFoods() {
		insulinCalculatorPage.clickJstAdded();
	}

	@QAFTestStep(description = "user remove the added item")
	public void click_deselectFood() {
		insulinCalculatorPage.click_deselectFood();
	}
	
	@QAFTestStep(description = "user verify {0} in Recent tab list")
	public void verify_ResentList(Object eventDetail) {
		insulinCalculatorPage.verify_ResentList(eventDetail);
	}
	
	@QAFTestStep(description = "user verify {0} in Just Added list")
	public void verify_JustAddedList(Object eventDetail) {
		insulinCalculatorPage.verify_JustAddedList(eventDetail);
	}
	@QAFTestStep(description = "user verify Active insulin overlay")
	public void verifyActiveInsulin_Overlay() {
		insulinCalculatorPage.verifyActiveInsulin_Overlay();
	}

	@QAFTestStep(description = "user verify allow patient editing toggle button on Insulin calculator setting screen")
	public void verifyAllowPatientEdit() {
		insulinCalculatorPage.verifyAllowPatientEdit();
	}
	@QAFTestStep(description = "user verify added carb on Ic screen")
	public void verifyCarb_OnIC() {
		insulinCalculatorPage.verifyCarb_OnIC();
	}
	@QAFTestStep(description = "user edit carbs details using {0} on Ic screen")
	public void editCarbOnICScreen(Object details) {
		insulinCalculatorPage.editCarbOnICScreen(details);
	}
	@QAFTestStep(description = "user edit Bg details using {0} on Ic screen")
	public void editBgOnICScreen(Object details) {
		insulinCalculatorPage.editBgOnICScreen(details);
	}
	
	@QAFTestStep(description = "user click on plus sign icon for carbs")
	public void clicks_plus() {
		insulinCalculatorPage.clicks_plus();
	}
	@QAFTestStep(description = "user verify the added items")
	public void verifyAddedItemsinJstAddedItems() {
		insulinCalculatorPage.verifyAddedItemsinJustAddedItems();
	}
	
	@QAFTestStep(description = "user verify Check Your Blood Sugar popup screen")
	public void verifyBgPopUp() {
		insulinCalculatorPage.verifyBgPopUp();
	}
	@QAFTestStep(description = "user verify splash screen is {0}")
	public void verifySpash_Screen(String option) {
		insulinCalculatorPage.verifySpash_Screen(option);
	}
	
	@QAFTestStep(description = "user verify Insulin Mentor link is {0}")
	public void verifyInsulinMentor_link(String option) {
		insulinCalculatorPage.verifyInsulinMentor_link(option);
	}
	
	@QAFTestStep(description = "user clears the search bar")
	public void clear_Searchbar() {
		insulinCalculatorPage.clear_Searchbar();
	}
	
	@QAFTestStep(description = "user verify recommended dose with active insulin bg and carb")
	public void recommendedForBCI() {
		insulinCalculatorPage.recommendedForBCI();
	}
	
	@QAFTestStep(description = "user verify I will deliver message")
	public void Verify_Deliver() {
		insulinCalculatorPage.Verify_Deliver();
	}
	
	@QAFTestStep(description = "user verify I delivered message")
	public void Verify_Delivered() {
		insulinCalculatorPage.Verify_Delivered();
	}
	
	@QAFTestStep(description = "user should be able to Re-use carb on IC screen")
	public void Verify_ReusedCarb() {
		insulinCalculatorPage.Verify_ReusedCarb();
	}
	
}
