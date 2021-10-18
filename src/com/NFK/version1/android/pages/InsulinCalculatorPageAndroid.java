package com.NFK.version1.android.pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.EventDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.ElementFactory;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.TouchAction;

public class InsulinCalculatorPageAndroid
		extends
			WebDriverBaseTestPage<WebDriverTestPage> {
	
	public static String totalBg, dose;
	public static String totalAmtforCarb,secondCarbValue;
	public static int carbValue, carbValue1 = 0;

	@FindBy(locator = "NFK.InsulinCalculatorSetting.Title.lbl")
	private QAFWebElement NFKInsulincalculatorsettingTitleLbl;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.Activate.btn")
	private QAFWebElement NFKInsulincalculatorsettingActivateBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.Allowediting.txt")
	private QAFWebElement NFKInsulincalculatorsettingAlloweditingTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.Allowediting.toggle.btn")
	private QAFWebElement NFKInsulincalculatorsettingAlloweditingToggleBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.ActiveInsulinDuration.value.btn")
	private QAFWebElement NFKInsulincalculatorsettingActiveinsulindurationValueBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.ActiveInsulinDuration.Title.lbl")
	private QAFWebElement NFKInsulincalculatorsettingActiveinsulindurationTitleLbl;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.ActiveInsulinDuration.hour.txt")
	private QAFWebElement NFKInsulincalculatorsettingActiveinsulindurationHourTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.DosageIncrement.value.btn")
	private QAFWebElement NFKInsulincalculatorsettingDosageincrementValueBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.DosageIncrement.Title.lbl")
	private QAFWebElement NFKInsulincalculatorsettingDosageincrementTitleLbl;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.MaximumSingleDoseLimit.value.btn")
	private QAFWebElement NFKInsulincalculatorsettingMaximumsingledoselimitValueBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.InsulinConcentration.value.btn")
	private QAFWebElement NFKInsulincalculatorsettingInsulinconcentrationValueBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.InsulinConcentration.Title.lbl")
	private QAFWebElement NFKInsulincalculatorsettingInsulinconcentrationTitleLbl;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.TargetBG.mgdl.txt")
	private QAFWebElement NFKInsulincalculatorsettingTargetbgMgdlTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.TargetBG.mgdl.value.btn")
	private QAFWebElement NFKInsulincalculatorsettingTargetbgMgdlValueBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.TargetBG.addsub.value.btn")
	private QAFWebElement NFKInsulincalculatorsettingTargetbgAddsubValueBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.TargetBG.add.btn")
	private QAFWebElement NFKInsulincalculatorsettingTargetbgAddBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.CorrectionFactor.mgdl.txt")
	private QAFWebElement NFKInsulincalculatorsettingCorrectionfactorMgdlTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.CorrectionFactor.mgdl.value.btn")
	private QAFWebElement NFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.CorrectionFactor.add.btn")
	private QAFWebElement NFKInsulincalculatorsettingCorrectionfactorAddBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.InsulintoCarbRatio.unit.txt")
	private QAFWebElement NFKInsulincalculatorsettingInsulintocarbratioUnitTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.InsulintoCarbRatio.measurement.value.btn")
	private QAFWebElement NFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.InsulintoCarbRatio.add.btn")
	private QAFWebElement NFKInsulincalculatorsettingInsulintocarbratioAddBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.ActiveInsulinDuration.txt")
	private QAFWebElement NFKInsulincalculatorsettingActiveinsulindurationTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.DosageIncrement.txt")
	private QAFWebElement NFKInsulincalculatorsettingDosageincrementTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.MaximumSingleDoseLimit.txt")
	private QAFWebElement NFKInsulincalculatorsettingMaximumsingledoselimitTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.InsulinConcentration.txt")
	private QAFWebElement NFKInsulincalculatorsettingInsulinconcentrationTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.TargetBG.txt")
	private QAFWebElement NFKInsulincalculatorsettingTargetbgTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.TargetBG.addsub.txt")
	private QAFWebElement NFKInsulincalculatorsettingTargetbgAddsubTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.CorrectionFactor.txt")
	private QAFWebElement NFKInsulincalculatorsettingCorrectionfactorTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.CorrectionFactor.unit.txt")
	private QAFWebElement NFKInsulincalculatorsettingCorrectionfactorUnitTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.InsulintoCarbRatio.txt")
	private QAFWebElement NFKInsulincalculatorsettingInsulintocarbratioTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.InsulintoCarbRatio.measurement.txt")
	private QAFWebElement NFKInsulincalculatorsettingInsulintocarbratioMeasurementTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.static.dropdown.txt")
	private QAFWebElement NFKInsulincalculatorsettingStaticDropdownTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.dropdown.txt")
	private List<QAFWebElement> NFKInsulincalculatorsettingDropdownTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.InvalidErrorMsg.txt")
	private QAFWebElement NFKInsulincalculatorsettingInvaliderrormsgTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.eventvalue.txt")
	private List<QAFWebElement> NFKInsulincalculatorsettingEventvalueTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.BgRemove.btn")
	private QAFWebElement NFKInsulincalculatorsettingBgremoveBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.carbRemove.btn")
	private QAFWebElement NFKInsulincalculatorsettingCarbremoveBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.dynamic.txt")
	private QAFWebElement NFKInsulincalculatorsettingDynamicTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.InrangePopup.message.txt")
	private QAFWebElement NFKInsulincalculatorsettingInrangepopupMessageTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.IcGraph.value.txt")
	private QAFWebElement NFKInsulincalculatorsettingIcgraphValueTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.IcBg.value.txt")
	private QAFWebElement NFKInsulincalculatorsettingIcbgValueTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.IcCarb.value.txt")
	private QAFWebElement NFKInsulincalculatorsettingIccarbValueTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.IcInsulin.value.txt")
	private QAFWebElement NFKInsulincalculatorsettingIcinsulinValueTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.IcManualAdjustment.value.txt")
	private QAFWebElement NFKInsulincalculatorsettingIcmanualadjustmentValueTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.IcInsulinDose.value.txt")
	private QAFWebElement NFKInsulincalculatorsettingIcinsulindoseValueTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.addcarb.addvalue.txt")
	private QAFWebElement NFKInsulincalculatorsettingAddcarbAddvalueTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.addbg.addvalue.txt")
	private QAFWebElement NFKInsulincalculatorsettingAddbgAddvalueTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.title.Ic.lbl")
	private QAFWebElement NFKInsulincalculatorsettingTitleIcLbl;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.add.carb.btn")
	private QAFWebElement NFKInsulincalculatorsettingAddCarbBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.ManualAdj.increase.btn")
	private QAFWebElement NFKInsulincalculatorsettingManualadjIncreaseBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.ManualAdj.decrease.btn")
	private QAFWebElement NFKInsulincalculatorsettingManualadjDecreaseBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.editIconForMultipleCarbs")
	private QAFWebElement NFKBolusCalPageInsulinCaleditIconForMultipleCarb;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.TargetBgValue.txt")
	private QAFWebElement NFKInsulincalculatorsettingTargetbgvalueTxt;

	@FindBy(locator = "NFK.InsulinCalculatorSetting.TargetBgValue1.txt")
	private QAFWebElement NFKInsulincalculatorsettingTargetbgvalue1Txt;

	@FindBy(locator = "NFK.InsulinCalculatorSetting.TargetBgValue.close.btn")
	private QAFWebElement NFKInsulincalculatorsettingTargetbgvalueCloseBtn;

	@FindBy(locator = "NFK.InsulinCalculatorSetting.TargetBgValue.add.btnn")
	private QAFWebElement NFKInsulincalculatorsettingTargetbgvalueAddBtnn;

	@FindBy(locator = "NFK.InsulinCalculatorSetting.TargetBgAddSubValue.txt")
	private QAFWebElement NFKInsulincalculatorsettingTargetbgaddsubvalueTxt;

	@FindBy(locator = "NFK.InsulinCalculatorSetting.TargetBgAddSubValue1.txt")
	private QAFWebElement NFKInsulincalculatorsettingTargetbgaddsubvalue1Txt;

	@FindBy(locator = "NFK.InsulinCalculatorSetting.cfactorValue.txt")
	private QAFWebElement NFKInsulincalculatorsettingCfactorvalueTxt;

	@FindBy(locator = "NFK.InsulinCalculatorSetting.cfactorValue.close.btn")
	private QAFWebElement NFKInsulincalculatorsettingCfactorvalueCloseBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.cfactorValue.add.btn")
	private QAFWebElement NFKInsulincalculatorsettingCfactorvalueAddBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.cfactorValue1.txt")
	private QAFWebElement NFKInsulincalculatorsettingCfactorvalue1Txt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.carbRatioValue.txt")
	private QAFWebElement NFKInsulincalculatorsettingCarbratiovalueTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.carbRatioValue1.txt")
	private QAFWebElement NFKInsulincalculatorsettingCarbratiovalue1Txt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.carbRatioValue1.add.btn")
	private QAFWebElement NFKInsulincalculatorsettingCarbratiovalue1AddBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.carbRatioValue1.close.btn")
	private QAFWebElement NFKInsulincalculatorsettingCarbratiovalue1CloseBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.plus.txt")
	private QAFWebElement NFKInsulincalculatorsettingPlusTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.plus.btn")
	private QAFWebElement NFKInsulincalculatorsettingPlusBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.remove.yes.btn")
	private QAFWebElement NFKInsulincalculatorsettingRemoveYesBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.removebg.btn")
	private QAFWebElement NFKInsulincalculatorsettingRemovebgBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.removecarb.btn")
	private QAFWebElement NFKInsulincalculatorsettingRemovecarbBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.search.btn")
	private QAFWebElement NFKInsulincalculatorsettingSearchBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.swipetooltips.txt")
	private QAFWebElement NFKInsulincalculatorsettingSwipetooltipsTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.navigateforward.btn")
	private QAFWebElement NFKInsulincalculatorsettingNavigateforwardBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.navigateback.btn")
	private QAFWebElement NFKInsulincalculatorsettingNavigatebackBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.firstuse.startover.btn")
	private QAFWebElement NFKInsulincalculatorsettingFirstuseStartoverBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.popUp.close.btn")
	private QAFWebElement NFKInsulinCalculatorSettingPopUpCloseBtn;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	public QAFWebElement getNFKInsulinCalculatorSettingPopUpCloseBtn() {
		return NFKInsulinCalculatorSettingPopUpCloseBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingStaticText(String text) {
		return LFSUtilsAndroid.getElement("NFK.InsulinCalculatorSetting.dynamic.txt",
				text);
	}

	public QAFWebElement getNFKInsulincalculatorsettingDynamicTxt() {
		return NFKInsulincalculatorsettingDynamicTxt;
	}
	public QAFWebElement getNFKInsulincalculatorsettingTitleLbl() {
		return NFKInsulincalculatorsettingTitleLbl;
	}

	public QAFWebElement getNFKInsulincalculatorsettingActivateBtn() {
		return NFKInsulincalculatorsettingActivateBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingAlloweditingTxt() {
		return NFKInsulincalculatorsettingAlloweditingTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingAlloweditingToggleBtn() {
		return NFKInsulincalculatorsettingAlloweditingToggleBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingActiveinsulindurationValueBtn() {
		return NFKInsulincalculatorsettingActiveinsulindurationValueBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingActiveinsulindurationTitleLbl() {
		return NFKInsulincalculatorsettingActiveinsulindurationTitleLbl;
	}

	public QAFWebElement getNFKInsulincalculatorsettingActiveinsulindurationHourTxt() {
		return NFKInsulincalculatorsettingActiveinsulindurationHourTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingDosageincrementValueBtn() {
		return NFKInsulincalculatorsettingDosageincrementValueBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingDosageincrementTitleLbl() {
		return NFKInsulincalculatorsettingDosageincrementTitleLbl;
	}

	public QAFWebElement getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn() {
		return NFKInsulincalculatorsettingMaximumsingledoselimitValueBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingInsulinconcentrationValueBtn() {
		return NFKInsulincalculatorsettingInsulinconcentrationValueBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingInsulinconcentrationTitleLbl() {
		return NFKInsulincalculatorsettingInsulinconcentrationTitleLbl;
	}

	public QAFWebElement getNFKInsulincalculatorsettingTargetbgMgdlTxt() {
		return NFKInsulincalculatorsettingTargetbgMgdlTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingTargetbgMgdlValueBtn() {
		return NFKInsulincalculatorsettingTargetbgMgdlValueBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingTargetbgAddsubValueBtn() {
		return NFKInsulincalculatorsettingTargetbgAddsubValueBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingTargetbgAddBtn() {
		return NFKInsulincalculatorsettingTargetbgAddBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingCorrectionfactorMgdlTxt() {
		return NFKInsulincalculatorsettingCorrectionfactorMgdlTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn() {
		return NFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingCorrectionfactorAddBtn() {
		return NFKInsulincalculatorsettingCorrectionfactorAddBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingInsulintocarbratioUnitTxt() {
		return NFKInsulincalculatorsettingInsulintocarbratioUnitTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn() {
		return NFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingInsulintocarbratioAddBtn() {
		return NFKInsulincalculatorsettingInsulintocarbratioAddBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingActiveinsulindurationTxt() {
		return NFKInsulincalculatorsettingActiveinsulindurationTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingDosageincrementTxt() {
		return NFKInsulincalculatorsettingDosageincrementTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingMaximumsingledoselimitTxt() {
		return NFKInsulincalculatorsettingMaximumsingledoselimitTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingInsulinconcentrationTxt() {
		return NFKInsulincalculatorsettingInsulinconcentrationTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingTargetbgTxt() {
		return NFKInsulincalculatorsettingTargetbgTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingTargetbgAddsubTxt() {
		return NFKInsulincalculatorsettingTargetbgAddsubTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingCorrectionfactorTxt() {
		return NFKInsulincalculatorsettingCorrectionfactorTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingCorrectionfactorUnitTxt() {
		return NFKInsulincalculatorsettingCorrectionfactorUnitTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingInsulintocarbratioTxt() {
		return NFKInsulincalculatorsettingInsulintocarbratioTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingInsulintocarbratioMeasurementTxt() {
		return NFKInsulincalculatorsettingInsulintocarbratioMeasurementTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingStaticDropdownTxt(String text) {
		return LFSUtilsAndroid
				.getElement("NFK.InsulinCalculatorSetting.static.dropdown.txt", text);
	}
	public List<QAFWebElement> getNFKInsulincalculatorsettingDropdownTxt() {
		return NFKInsulincalculatorsettingDropdownTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingInvaliderrormsgTxt() {
		return NFKInsulincalculatorsettingInvaliderrormsgTxt;
	}
	
	public List<QAFWebElement> getNFKInsulincalculatorsettingEventvalueTxt() {
		return NFKInsulincalculatorsettingEventvalueTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingBgremoveBtn() {
		return NFKInsulincalculatorsettingBgremoveBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingCarbremoveBtn() {
		return NFKInsulincalculatorsettingCarbremoveBtn;
	}

	public QAFWebElement getNFKInsulincalculatorsettingInrangepopupMessageTxt() {
		return NFKInsulincalculatorsettingInrangepopupMessageTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingIcgraphValueTxt() {
		return NFKInsulincalculatorsettingIcgraphValueTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingIcbgValueTxt() {
		return NFKInsulincalculatorsettingIcbgValueTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingIccarbValueTxt() {
		return NFKInsulincalculatorsettingIccarbValueTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingIcinsulinValueTxt() {
		return NFKInsulincalculatorsettingIcinsulinValueTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingIcmanualadjustmentValueTxt() {
		return NFKInsulincalculatorsettingIcmanualadjustmentValueTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingIcinsulindoseValueTxt() {
		return NFKInsulincalculatorsettingIcinsulindoseValueTxt;
	}

	public QAFWebElement getNFKInsulincalculatorsettingAddbgAddvalueTxt() {
		return NFKInsulincalculatorsettingAddbgAddvalueTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingAddcarbAddvalueTxt() {
		return NFKInsulincalculatorsettingAddcarbAddvalueTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingManualadjIncreaseBtn() {
		return NFKInsulincalculatorsettingManualadjIncreaseBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingManualadjDecreaseBtn() {
		return NFKInsulincalculatorsettingManualadjDecreaseBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingTitleIcLbl() {
		return NFKInsulincalculatorsettingTitleIcLbl;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingSearchBtn() {
		return NFKInsulincalculatorsettingSearchBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingSwipetooltipsTxt() {
		return NFKInsulincalculatorsettingSwipetooltipsTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingNavigateforwardBtn() {
		return NFKInsulincalculatorsettingNavigateforwardBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingNavigatebackBtn() {
		return NFKInsulincalculatorsettingNavigatebackBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingFirstuseStartoverBtn() {
		return NFKInsulincalculatorsettingFirstuseStartoverBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingTargetbgvalueTxt() {
		return NFKInsulincalculatorsettingTargetbgvalueTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingTargetbgvalue1Txt() {
		return NFKInsulincalculatorsettingTargetbgvalue1Txt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingTargetbgvalueCloseBtn() {
		return NFKInsulincalculatorsettingTargetbgvalueCloseBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingTargetbgvalueAddBtnn() {
		return NFKInsulincalculatorsettingTargetbgvalueAddBtnn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingTargetbgaddsubvalueTxt() {
		return NFKInsulincalculatorsettingTargetbgaddsubvalueTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingTargetbgaddsubvalue1Txt() {
		return NFKInsulincalculatorsettingTargetbgaddsubvalue1Txt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingCfactorvalueTxt() {
		return NFKInsulincalculatorsettingCfactorvalueTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingCfactorvalueCloseBtn() {
		return NFKInsulincalculatorsettingCfactorvalueCloseBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingCfactorvalueAddBtn() {
		return NFKInsulincalculatorsettingCfactorvalueAddBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingCfactorvalue1Txt() {
		return NFKInsulincalculatorsettingCfactorvalue1Txt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingCarbratiovalueTxt() {
		return NFKInsulincalculatorsettingCarbratiovalueTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingCarbratiovalue1Txt() {
		return NFKInsulincalculatorsettingCarbratiovalue1Txt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingCarbratiovalue1AddBtn() {
		return NFKInsulincalculatorsettingCarbratiovalue1AddBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingCarbratiovalue1CloseBtn() {
		return NFKInsulincalculatorsettingCarbratiovalue1CloseBtn;
	}

	public void verifyActivateBtn() {
		getNFKInsulincalculatorsettingTitleLbl()
				.verifyPresent("Insulin Calculator setting title is displayed");
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Activate button is disabled", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}
	}

	public void clickAllowEditingTogglebtn() {
		getNFKInsulincalculatorsettingAlloweditingTxt()
				.verifyPresent("Allow editing text is displayed");
		if (getNFKInsulincalculatorsettingAlloweditingToggleBtn().getAttribute("text")
				.equalsIgnoreCase("ON"))
			Reporter.logWithScreenShot("Allow editing toggle button switch is ON",
					MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Allow editing toggle button switch is OFF",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingAlloweditingToggleBtn().click();
			Reporter.logWithScreenShot("Allow editing toggle button switch is ON",
					MessageTypes.Pass);
		}
	}
	
	public static String TargetValue, CfValue, CarbRatio;
	
	public void enterEventDetail(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		if (getNFKInsulincalculatorsettingUnitofmeasurementLbl().getText().equalsIgnoreCase("mmol/l")) {
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().clear();
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
					.sendKeys(eventBean.getInsulinToCarbRatioMmol());
			CarbRatio = eventBean.getInsulinToCarbRatioMmol();
			LFSUtilsAndroid.hideKeyboard();
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().clear();
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
					.sendKeys(eventBean.getCorrectionFactorMmol());
			CfValue = eventBean.getCorrectionFactorMmol();
			LFSUtilsAndroid.hideKeyboard();
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().clear();
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
					.sendKeys(eventBean.getTargetBgMmol());
			TargetValue = eventBean.getTargetBgMmol();
			LFSUtilsAndroid.hideKeyboard();
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().clear();
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
					.sendKeys(eventBean.getAddSubTargetBgMmol());
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
					.sendKeys(eventBean.getMaxSingleDoseMmol());
			LFSUtilsAndroid.hideKeyboard();
			if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn()
					.isPresent()) {
				getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
				String insulinConcentration =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot(
						"Insulin concentration is" + insulinConcentration);
				LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			}

			if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
				String dosageIncrement =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement);
			}

			if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn()
					.isPresent()) {
				getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
				String insulinDuration =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot(
						"Active insulin duration is" + insulinDuration);
			}
		} else {

			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().clear();
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
					.sendKeys(eventBean.getInsulinToCarbRatio());
			CarbRatio = eventBean.getInsulinToCarbRatio();
			LFSUtilsAndroid.hideKeyboard();
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().clear();
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
					.sendKeys(eventBean.getCorrectionFactor());
			CfValue = eventBean.getCorrectionFactor();
			LFSUtilsAndroid.hideKeyboard();
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().clear();
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
					.sendKeys(eventBean.getTargetBg());
			TargetValue = eventBean.getTargetBg();
			LFSUtilsAndroid.hideKeyboard();
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().clear();
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
					.sendKeys(eventBean.getAddSubTargetBg());
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
					.sendKeys(eventBean.getMaxSingleDose());
			LFSUtilsAndroid.hideKeyboard();
			if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn()
					.isPresent()) {
				getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
				String insulinConcentration =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot(
						"Insulin concentration is" + insulinConcentration);
				LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			}

			if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
				String dosageIncrement =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement);
			}

			if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn()
					.isPresent()) {
				getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
				String insulinDuration =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot(
						"Active insulin duration is" + insulinDuration);
			}
		}
	}

	public void clickActivitybtn() {
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Activate button is disabled", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Pass);
			getNFKInsulincalculatorsettingActivateBtn().click();
			LFSUtilsIOS.waitforLoad();
		}
	}

	public void deleteBgFromIc() {
		
		for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(EventLogPageAndroid.getBGValue)) {
				Reporter.logWithScreenShot("Added event is displayed", MessageTypes.Pass);
				WebElement Image = getNFKInsulincalculatorsettingEventvalueTxt().get(i);
				Reporter.logWithScreenShot("value id ::" + Image, MessageTypes.Pass);
				Point classname = Image.getLocation();
				int xcordi = classname.getX();
				int ycordi = classname.getY();
				int startx = xcordi + 200;
				LFSUtilsAndroid.swipeWithCoordinates(startx, ycordi, xcordi, ycordi, 100);
				if (getNFKInsulincalculatorsettingStaticText(
						LFSUtilsAndroid.getPropString("office.code.delete"))
								.isPresent()) {
					Reporter.logWithScreenShot("Remove button is present",
							MessageTypes.Pass);
					try {
						getNFKInsulincalculatorsettingStaticText(
								LFSUtilsAndroid.getPropString("office.code.delete")).click();
					} catch (Exception e) {
						getNFKInsulincalculatorsettingRemovecarbBtn().click();
					}
					LFSUtilsAndroid.waitforLoad();
					if (getNFKInsulincalculatorsettingRemoveYesBtn().isPresent()) {
						Reporter.logWithScreenShot("Alert displayed", MessageTypes.Pass);
						try {
							getNFKInsulincalculatorsettingRemoveYesBtn().click();
						} catch (Exception e) {
							getNFKInsulincalculatorsettingStaticText(
									LFSUtilsAndroid.getPropString("appCommon.yes")).click();
						}
						LFSUtilsAndroid.waitforLoad();
						Reporter.logWithScreenShot("Yes button clicked", MessageTypes.Pass);
					}
				} else {
					Reporter.logWithScreenShot("Remove button is not present",
							MessageTypes.Pass);
				}

			}
		}
	}

	public void deletecarbFromIc() {
		for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(EventLogPageAndroid.getCarbValue)) {
				WebElement Image = getNFKInsulincalculatorsettingEventvalueTxt().get(i);
				Point classname = Image.getLocation();
				int xcordi = classname.getX();
				int ycordi = classname.getY();
				int startx = xcordi + 200;
				LFSUtilsAndroid.swipeWithCoordinates(startx, ycordi, xcordi, ycordi, 100);
				if (getNFKInsulincalculatorsettingStaticText(
						LFSUtilsAndroid.getPropString("office.code.delete"))
								.isDisplayed()) {
					Reporter.logWithScreenShot("Remove button is present",
							MessageTypes.Pass);
					
					try {
						int tapX = NFKInsulincalculatorsettingAddCarbBtn.getLocation().getX();
						int tapY = NFKInsulincalculatorsettingAddCarbBtn.getLocation().getY();
						LFSUtilsAndroid jnj = new LFSUtilsAndroid();
						TouchAction tch = new TouchAction(jnj.getDriver());
						tch.tap(tapX+250, tapY).perform();
						
					} catch (Exception e) {
						getNFKInsulincalculatorsettingStaticText(
								LFSUtilsAndroid.getPropString("office.code.delete")).click();
						
					}
					if (getNFKInsulincalculatorsettingRemoveYesBtn().isPresent()) {
						Reporter.logWithScreenShot("Alert displayed", MessageTypes.Pass);
						try {
							getNFKInsulincalculatorsettingRemoveYesBtn().click();
						} catch (Exception e) {
							getNFKInsulincalculatorsettingStaticText(
									LFSUtilsAndroid.getPropString("appCommon.yes")).click();
						}
					}
				} else {
					Reporter.logWithScreenShot("Remove button is not present",
							MessageTypes.Pass);
				}

			}
		}
	}

	public void enterBlankEventDetail() {
		blankActiveInsulin();
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Active Insulin is blank", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}
		blankDosageIncrement();
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Dosage Increment is blank", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}
		blankInsulinconcentration();
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Insulin Concentration is blank",
					MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}
		blankMaxSingleDose();
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Maximum Single Dose is blank", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}
		blankTargetBg();
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Target Bg is blank", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}
		blankcorrectionFactor();
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Correction Factor is blank", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}
		blankInsulinToCarbRatio();
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Insulin To Carb Ratio is blank",
					MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}

	}

	public void verifyErrorMsg() {
		SettingPageAndroid setting = new SettingPageAndroid();
		LFSUtilsAndroid.waitforLoad();
		if (getNFKInsulincalculatorsettingInvaliderrormsgTxt().isPresent()) {
			Reporter.logWithScreenShot("Value entered is invalid", MessageTypes.Pass);
			setting.getNFKSettingspageStaticTextTxt(
					ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		} else {
			Reporter.logWithScreenShot("Value entered is valid", MessageTypes.Fail);

		}
	}

	public void enterInvalidMsDose() {
		getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);		
		if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
			String insulinDuration =
					getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration);
		}
		if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
			String dosageIncrement =
					getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement);
		}
		if (getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().isPresent()) {
			int maxSingleDose = ThreadLocalRandom.current().nextInt(150, 200);
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
					.sendKeys(Integer.toString(maxSingleDose));
			LFSUtilsAndroid.hideKeyboard();
			Reporter.logWithScreenShot("After entering Maximum single dose",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
			LFSUtilsAndroid.waitforLoad();
		}
	}

	public void enterInvalidTargetBg() {
		getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
		if (getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().isPresent()) {
			int targetBg = ThreadLocalRandom.current().nextInt(300, 350);
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
					.sendKeys(Integer.toString(targetBg));
			LFSUtilsAndroid.hideKeyboard();
			Reporter.logWithScreenShot("After entering Maximum single dose",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
			LFSUtilsAndroid.waitforLoad();
		}
	}

	public void enterInvalidCF() {
		getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
		if (getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().isPresent()) {
			int correctionFactor = ThreadLocalRandom.current().nextInt(300, 350);
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
					.sendKeys(Integer.toString(correctionFactor));
			LFSUtilsAndroid.hideKeyboard();
			Reporter.logWithScreenShot("After entering Maximum single dose",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
			LFSUtilsAndroid.waitforLoad();
		}
	}

	public void enterInvalidIToCRatio() {
		getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
		if (getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().isPresent()) {
			int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(300, 350);
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
					.sendKeys(Integer.toString(insulinToCarbRatio));
			LFSUtilsAndroid.hideKeyboard();
			Reporter.logWithScreenShot("After entering Maximum single dose",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
			LFSUtilsAndroid.waitforLoad();
		}

	}

	public void verifyDeleteEventBc(Object eventDetail) {
		HomePageAndroid home = new HomePageAndroid();
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		int count = 0;
		int cons = home.getNFKHomepageEventValueTxt().size();
		for (int i = 0; i < home.getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(eventBean.getAmount())
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(eventBean.getUnit())) {
				getNFKInsulincalculatorsettingEventvalueTxt().get(i).click();
				EventLogPageAndroid eventlog = new EventLogPageAndroid();
				eventlog.deleteEvent();
				count++;
			}
			if (count == cons)
				break;
		}
		for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(eventBean.getAmount())
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(eventBean.getUnit())) {
				break;
			} else {
				Reporter.logWithScreenShot("Event deleted successfully",
						MessageTypes.Pass);
			}
		}
	}
	
	public void verifyAddedEventIc(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {
			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(eventBean.getAmount())) {
				Reporter.logWithScreenShot("Added event is displayed", MessageTypes.Pass);
				break;
			}
		}
	}

	public void verifyAddedEventBc(Object eventDetail) {
		String getAmountFromAddedEvent = EventLogPageAndroid.getAMount;
		ConfigurationManager.getBundle().setProperty("addGlucose1.amount",
				getAmountFromAddedEvent);
		ConfigurationManager.getBundle().setProperty("editGlucose1.amount",
				getAmountFromAddedEvent);
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		if (eventBean.getEventType().equalsIgnoreCase("glucose")) {
			for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt()
					.size(); i++) {
				if (LFSUtilsAndroid.tryDisplayMethod(
						getNFKInsulincalculatorsettingEventvalueTxt().get(i))
						&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
								.contains(getAmountFromAddedEvent)) {
					Reporter.logWithScreenShot("Added event is displayed",
							MessageTypes.Pass);
					break;
				}
			}
		}

		else {
			for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt()
					.size(); i++) {
				if (LFSUtilsAndroid.tryDisplayMethod(
						getNFKInsulincalculatorsettingEventvalueTxt().get(i))
						&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
								.contains(eventBean.getAmount())) {
					Reporter.logWithScreenShot("Added event is displayed",
							MessageTypes.Pass);
					break;
				}
			}
		}

	}

	public void verifyIcSettingScreen() {
		if (getNFKInsulincalculatorsettingTitleLbl().isPresent()) {
			Reporter.logWithScreenShot("Insulin calculator setting screen is displayed",
					MessageTypes.Pass);

		}
	}

	public void verifyAddedCarbOnIc() {
		
		LFSUtilsAndroid.waitforLoad();
		for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(Integer.toString(EventLogPageAndroid.totalAmount))) {
				Reporter.logWithScreenShot("Added carb is displayed", MessageTypes.Pass);
				break;
			}
		}

	}

	public void verifyAddedBgOnIc() {
		String bgValue = EventLogPageAndroid.BgValue;
		for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(bgValue)) {
				Reporter.logWithScreenShot("Added bg is displayed", MessageTypes.Pass);
			}

		}
	}

	public void blankActiveInsulin() {
		if(getNFKInsulincalculatorsettingUnitofmeasurementLbl().getText().equalsIgnoreCase("mmol/l")) {
			getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
			int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
					.sendKeys(Integer.toString(insulinToCarbRatio));
			LFSUtilsAndroid.hideKeyboard();
			int correctionFactor = ThreadLocalRandom.current().nextInt(2, 11);
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
					.sendKeys(Integer.toString(correctionFactor));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int targetBg = ThreadLocalRandom.current().nextInt(4, 11);
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
					.sendKeys(Integer.toString(targetBg));
			int addSubTargetBg = ThreadLocalRandom.current().nextInt(1, 2);
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
					.sendKeys(Integer.toString(addSubTargetBg));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int maxSingleDose = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
					.sendKeys(Integer.toString(maxSingleDose));
			LFSUtilsAndroid.hideKeyboard();
			if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
				String dosageIncrement =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement,
						MessageTypes.Pass);
			}

			if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
				String insulinConcentration =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration,
						MessageTypes.Pass);
			}
			if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
					.equalsIgnoreCase("false"))
				Reporter.logWithScreenShot("Active Insulin is blank", MessageTypes.Pass);
			else {
				Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
			}
		}
		else {
		getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
		int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(1, 100);
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
				.sendKeys(Integer.toString(insulinToCarbRatio));
		LFSUtilsAndroid.hideKeyboard();
		int correctionFactor = ThreadLocalRandom.current().nextInt(100, 150);
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
				.sendKeys(Integer.toString(correctionFactor));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int targetBg = ThreadLocalRandom.current().nextInt(100, 150);
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
				.sendKeys(Integer.toString(targetBg));
		int addSubTargetBg = ThreadLocalRandom.current().nextInt(0, 50);
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
				.sendKeys(Integer.toString(addSubTargetBg));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int maxSingleDose = ThreadLocalRandom.current().nextInt(1, 150);
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
				.sendKeys(Integer.toString(maxSingleDose));
		LFSUtilsAndroid.hideKeyboard();
		if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
			String dosageIncrement =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement,
					MessageTypes.Pass);
		}

		if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
			String insulinConcentration =
					getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
			Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration,
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Active Insulin is blank", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}
	}
	}
	public void blankDosageIncrement() {
		if(getNFKInsulincalculatorsettingUnitofmeasurementLbl().getText().equalsIgnoreCase("mmol/l")) {
			int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
					.sendKeys(Integer.toString(insulinToCarbRatio));
			LFSUtilsAndroid.hideKeyboard();
			int correctionFactor = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
					.sendKeys(Integer.toString(correctionFactor));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int targetBg = ThreadLocalRandom.current().nextInt(4, 11);
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
					.sendKeys(Integer.toString(targetBg));
			int addSubTargetBg = ThreadLocalRandom.current().nextInt(1, 2);
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
					.sendKeys(Integer.toString(addSubTargetBg));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int maxSingleDose = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
					.sendKeys(Integer.toString(maxSingleDose));
			LFSUtilsAndroid.hideKeyboard();
			if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {

				getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
				String insulinDuration =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration,
						MessageTypes.Pass);
			}
			if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {

				getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
				String insulinConcentration =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration,
						MessageTypes.Pass);
			}
			if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
					.equalsIgnoreCase("false"))
				Reporter.logWithScreenShot("Dosage Increment is blank", MessageTypes.Pass);
			else {
				Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
			}
		}
		else {
		int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(1, 100);
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
				.sendKeys(Integer.toString(insulinToCarbRatio));
		LFSUtilsAndroid.hideKeyboard();
		int correctionFactor = ThreadLocalRandom.current().nextInt(100, 150);
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
				.sendKeys(Integer.toString(correctionFactor));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int targetBg = ThreadLocalRandom.current().nextInt(100, 150);
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
				.sendKeys(Integer.toString(targetBg));
		int addSubTargetBg = ThreadLocalRandom.current().nextInt(0, 50);
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
				.sendKeys(Integer.toString(addSubTargetBg));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int maxSingleDose = ThreadLocalRandom.current().nextInt(1, 150);
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
				.sendKeys(Integer.toString(maxSingleDose));
		LFSUtilsAndroid.hideKeyboard();
		if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {

			getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
			String insulinDuration =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration,
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {

			getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
			String insulinConcentration =
					getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
			Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration,
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Dosage Increment is blank", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}
	}
	}
	public void blankMaxSingleDose() {
		if(getNFKInsulincalculatorsettingUnitofmeasurementLbl().getText().equalsIgnoreCase("mmol/l")) {
			getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
			int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
					.sendKeys(Integer.toString(insulinToCarbRatio));
			LFSUtilsAndroid.hideKeyboard();
			int correctionFactor = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
					.sendKeys(Integer.toString(correctionFactor));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int targetBg = ThreadLocalRandom.current().nextInt(4, 11);
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
					.sendKeys(Integer.toString(targetBg));
			int addSubTargetBg = ThreadLocalRandom.current().nextInt(1, 2);
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
					.sendKeys(Integer.toString(addSubTargetBg));
			LFSUtilsAndroid.hideKeyboard();
			int maxSingleDose = ThreadLocalRandom.current().nextInt(2, 33);
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
					.sendKeys(Integer.toString(maxSingleDose));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
				String insulinDuration =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration,
						MessageTypes.Pass);
			}
			if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
				String dosageIncrement =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement,
						MessageTypes.Pass);
			}
			if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
				String insulinConcentration =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration,
						MessageTypes.Pass);
			}
		}
		else {
		getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
		int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(1, 100);
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
				.sendKeys(Integer.toString(insulinToCarbRatio));
		LFSUtilsAndroid.hideKeyboard();
		int correctionFactor = ThreadLocalRandom.current().nextInt(100, 150);
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
				.sendKeys(Integer.toString(correctionFactor));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int targetBg = ThreadLocalRandom.current().nextInt(100, 150);
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
				.sendKeys(Integer.toString(targetBg));
		int addSubTargetBg = ThreadLocalRandom.current().nextInt(0, 50);
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
				.sendKeys(Integer.toString(addSubTargetBg));
		LFSUtilsAndroid.hideKeyboard();
		int maxSingleDose = ThreadLocalRandom.current().nextInt(1, 150);
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
				.sendKeys(Integer.toString(maxSingleDose));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
			String insulinDuration =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration,
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
			String dosageIncrement =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement,
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
			String insulinConcentration =
					getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
			Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration,
					MessageTypes.Pass);
		}
	}
	}
	public void blankInsulinconcentration() {
		if(getNFKInsulincalculatorsettingUnitofmeasurementLbl().getText().equalsIgnoreCase("mmol/l")) {
			getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
			int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
					.sendKeys(Integer.toString(insulinToCarbRatio));
			LFSUtilsAndroid.hideKeyboard();
			int correctionFactor = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
					.sendKeys(Integer.toString(correctionFactor));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int targetBg = ThreadLocalRandom.current().nextInt(4, 11);
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
					.sendKeys(Integer.toString(targetBg));
			int addSubTargetBg = ThreadLocalRandom.current().nextInt(1, 2);
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
					.sendKeys(Integer.toString(addSubTargetBg));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int maxSingleDose = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
					.sendKeys(Integer.toString(maxSingleDose));
			LFSUtilsAndroid.hideKeyboard();
			if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
				String insulinDuration =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration,
						MessageTypes.Pass);
			}
			if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
				String dosageIncrement =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement,
						MessageTypes.Pass);
			}
			if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
					.equalsIgnoreCase("false"))
				Reporter.logWithScreenShot("Insulin Concentration is blank",
						MessageTypes.Pass);
			else {
				Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
			}
		}
		else {	
		getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
		int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(1, 100);
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
				.sendKeys(Integer.toString(insulinToCarbRatio));
		LFSUtilsAndroid.hideKeyboard();
		int correctionFactor = ThreadLocalRandom.current().nextInt(100, 150);
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
				.sendKeys(Integer.toString(correctionFactor));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int targetBg = ThreadLocalRandom.current().nextInt(100, 150);
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
				.sendKeys(Integer.toString(targetBg));
		int addSubTargetBg = ThreadLocalRandom.current().nextInt(0, 50);
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
				.sendKeys(Integer.toString(addSubTargetBg));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int maxSingleDose = ThreadLocalRandom.current().nextInt(1, 150);
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
				.sendKeys(Integer.toString(maxSingleDose));
		LFSUtilsAndroid.hideKeyboard();
		if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
			String insulinDuration =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration,
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
			String dosageIncrement =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement,
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Insulin Concentration is blank",
					MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}
	}
	}
	
	public void blankTargetBg() {
		if (getNFKInsulincalculatorsettingUnitofmeasurementLbl().getText().equalsIgnoreCase("mmol/l")) {
		getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
	
		int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(2, 10);
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
				.sendKeys(Integer.toString(insulinToCarbRatio));
		LFSUtilsAndroid.hideKeyboard();
		int correctionFactor = ThreadLocalRandom.current().nextInt(2, 10);
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
				.sendKeys(Integer.toString(correctionFactor));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int maxSingleDose = ThreadLocalRandom.current().nextInt(2, 10);
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
				.sendKeys(Integer.toString(maxSingleDose));
		LFSUtilsAndroid.hideKeyboard();
		if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
			String insulinDuration =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration,
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
			String dosageIncrement =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement,
					MessageTypes.Pass);
		}
	
		if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
			String insulinConcentration =
					getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
			Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration,
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Target Bg is blank", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}	
			}
			else {
			getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
	
			int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(1, 100);
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
					.sendKeys(Integer.toString(insulinToCarbRatio));
			LFSUtilsAndroid.hideKeyboard();
			int correctionFactor = ThreadLocalRandom.current().nextInt(100, 150);
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
					.sendKeys(Integer.toString(correctionFactor));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int maxSingleDose = ThreadLocalRandom.current().nextInt(1, 150);
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
					.sendKeys(Integer.toString(maxSingleDose));
			LFSUtilsAndroid.hideKeyboard();
			if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
				String insulinDuration =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration,
						MessageTypes.Pass);
			}
			if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
				String dosageIncrement =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement,
						MessageTypes.Pass);
			}
	
			if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
				String insulinConcentration =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration,
						MessageTypes.Pass);
			}
			if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
					.equalsIgnoreCase("false"))
				Reporter.logWithScreenShot("Target Bg is blank", MessageTypes.Pass);
			else {
				Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
			}
		}
	}
	
	public void blankcorrectionFactor() {
		if(getNFKInsulincalculatorsettingUnitofmeasurementLbl().getText().equalsIgnoreCase("mmol/l")) {
		getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
	
		int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(2, 10);
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
				.sendKeys(Integer.toString(insulinToCarbRatio));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int targetBg = ThreadLocalRandom.current().nextInt(4, 11);
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
				.sendKeys(Integer.toString(targetBg));
		int addSubTargetBg = ThreadLocalRandom.current().nextInt(1, 2);
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
				.sendKeys(Integer.toString(addSubTargetBg));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int maxSingleDose = ThreadLocalRandom.current().nextInt(2, 10);
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
				.sendKeys(Integer.toString(maxSingleDose));
		LFSUtilsAndroid.hideKeyboard();
	
		if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
			String insulinDuration =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration,
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
			String dosageIncrement =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement,
					MessageTypes.Pass);
		}
	
		if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
			String insulinConcentration =
					getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
			Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration,
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Correction Factor is blank", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}	
			}
			else {
		
			getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
	
			int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(1, 100);
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
					.sendKeys(Integer.toString(insulinToCarbRatio));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int targetBg = ThreadLocalRandom.current().nextInt(100, 150);
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
					.sendKeys(Integer.toString(targetBg));
			int addSubTargetBg = ThreadLocalRandom.current().nextInt(0, 50);
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
					.sendKeys(Integer.toString(addSubTargetBg));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int maxSingleDose = ThreadLocalRandom.current().nextInt(1, 150);
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
					.sendKeys(Integer.toString(maxSingleDose));
			LFSUtilsAndroid.hideKeyboard();
	
			if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
				String insulinDuration =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration,
						MessageTypes.Pass);
			}
			if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
				String dosageIncrement =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement,
						MessageTypes.Pass);
			}
	
			if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
				String insulinConcentration =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration,
						MessageTypes.Pass);
			}
			if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
					.equalsIgnoreCase("false"))
				Reporter.logWithScreenShot("Correction Factor is blank", MessageTypes.Pass);
			else {
				Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
			}
		}
	}
	
	public void blankInsulinToCarbRatio() {
		if(getNFKInsulincalculatorsettingUnitofmeasurementLbl().getText().equalsIgnoreCase("mmol/l")) {
		getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
		int correctionFactor = ThreadLocalRandom.current().nextInt(2, 10);
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
				.sendKeys(Integer.toString(correctionFactor));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int targetBg = ThreadLocalRandom.current().nextInt(4, 11);
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
				.sendKeys(Integer.toString(targetBg));
		int addSubTargetBg = ThreadLocalRandom.current().nextInt(1, 2);
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
				.sendKeys(Integer.toString(addSubTargetBg));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int maxSingleDose = ThreadLocalRandom.current().nextInt(2, 10);
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
				.sendKeys(Integer.toString(maxSingleDose));
		LFSUtilsAndroid.hideKeyboard();
	
		if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
			String insulinDuration =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration,
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
			String dosageIncrement =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement,
					MessageTypes.Pass);
		}
	
		if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
			String insulinConcentration =
					getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
			Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration,
					MessageTypes.Pass);
		}
	
		if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
				.equalsIgnoreCase("false"))
			Reporter.logWithScreenShot("Insulin To Carb Ratio is blank",
					MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
		}	
			}
			else {
		
			getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
			int correctionFactor = ThreadLocalRandom.current().nextInt(100, 150);
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
					.sendKeys(Integer.toString(correctionFactor));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int targetBg = ThreadLocalRandom.current().nextInt(100, 150);
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
					.sendKeys(Integer.toString(targetBg));
			int addSubTargetBg = ThreadLocalRandom.current().nextInt(0, 50);
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
					.sendKeys(Integer.toString(addSubTargetBg));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int maxSingleDose = ThreadLocalRandom.current().nextInt(1, 150);
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn().click();
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
					.sendKeys(Integer.toString(maxSingleDose));
			LFSUtilsAndroid.hideKeyboard();
	
			if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
				String insulinDuration =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration,
						MessageTypes.Pass);
			}
			if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
				String dosageIncrement =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement,
						MessageTypes.Pass);
			}
	
			if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
				String insulinConcentration =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration,
						MessageTypes.Pass);
			}
	
			if (getNFKInsulincalculatorsettingActivateBtn().getAttribute("enabled")
					.equalsIgnoreCase("false"))
				Reporter.logWithScreenShot("Insulin To Carb Ratio is blank",
						MessageTypes.Pass);
			else {
				Reporter.logWithScreenShot("Activate button is enabled", MessageTypes.Fail);
			}
		}
	}
	
	@FindBy(locator = "NFK.InsulinCalculatorSetting.time.btn")
	private QAFWebElement NFKInsulinCalculatorSettingTimeBtn;

	
	public QAFWebElement getNFKInsulinCalculatorSettingTimeBtn() {
		return NFKInsulinCalculatorSettingTimeBtn;
				
	}

	public void multipleEventDetails() {
		if (getNFKInsulincalculatorsettingUnitofmeasurementLbl().getText().equalsIgnoreCase("mmol/l")) {
			getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
			int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
			getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
					.sendKeys(Integer.toString(insulinToCarbRatio));
			LFSUtilsAndroid.hideKeyboard();
			getNFKInsulincalculatorsettingCarbratiovalue1AddBtn().click();
			getNFKInsulincalculatorsettingCarbratiovalue1Txt()
					.sendKeys(Integer.toString(insulinToCarbRatio));
			LFSUtilsAndroid.hideKeyboard();
			int correctionFactor = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
			getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
					.sendKeys(Integer.toString(correctionFactor));
			LFSUtilsAndroid.hideKeyboard();
			getNFKInsulincalculatorsettingCfactorvalueAddBtn().click();
			getNFKInsulincalculatorsettingCfactorvalue1Txt()
					.sendKeys(Integer.toString(correctionFactor));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			int targetBg = ThreadLocalRandom.current().nextInt(4, 11);
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
					.sendKeys(Integer.toString(targetBg));
			LFSUtilsAndroid.hideKeyboard();
			int addSubTargetBg = ThreadLocalRandom.current().nextInt(1, 2);
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
			getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
					.sendKeys(Integer.toString(addSubTargetBg));
			LFSUtilsAndroid.hideKeyboard();
			getNFKInsulincalculatorsettingTargetbgvalueAddBtnn().click();
			getNFKInsulincalculatorsettingTargetbgvalue1Txt()
					.sendKeys(Integer.toString(targetBg));
			LFSUtilsAndroid.hideKeyboard();
			getNFKInsulincalculatorsettingTargetbgaddsubvalue1Txt()
					.sendKeys(Integer.toString(addSubTargetBg));
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
			if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
				String insulinDuration =
						getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
				Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration);
			}
			if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
				String dosageIncrement =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement);
			}
			int maxSingleDose = ThreadLocalRandom.current().nextInt(2, 10);
			getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
					.sendKeys(Integer.toString(maxSingleDose));
			LFSUtilsAndroid.hideKeyboard();
			if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {
				getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
				String insulinConcentration =
						getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
				getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
				Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration);
			}
		}
		else {
		getNFKInsulincalculatorsettingTitleLbl().waitForPresent();
		int insulinToCarbRatio = ThreadLocalRandom.current().nextInt(1, 100);
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn().click();
		getNFKInsulincalculatorsettingInsulintocarbratioMeasurementValueBtn()
				.sendKeys(Integer.toString(insulinToCarbRatio));
		LFSUtilsAndroid.hideKeyboard();
		getNFKInsulincalculatorsettingCarbratiovalue1AddBtn().click();
		getNFKInsulincalculatorsettingCarbratiovalue1Txt()
				.sendKeys(Integer.toString(insulinToCarbRatio));
		LFSUtilsAndroid.hideKeyboard();
		int correctionFactor = ThreadLocalRandom.current().nextInt(100, 150);
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn().click();
		getNFKInsulincalculatorsettingCorrectionfactorMgdlValueBtn()
				.sendKeys(Integer.toString(correctionFactor));
		LFSUtilsAndroid.hideKeyboard();
		getNFKInsulincalculatorsettingCfactorvalueAddBtn().click();
		getNFKInsulincalculatorsettingCfactorvalue1Txt()
				.sendKeys(Integer.toString(correctionFactor));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		int targetBg = ThreadLocalRandom.current().nextInt(100, 150);
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgMgdlValueBtn()
				.sendKeys(Integer.toString(targetBg));
		LFSUtilsAndroid.hideKeyboard();
		int addSubTargetBg = ThreadLocalRandom.current().nextInt(0, 50);
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn().click();
		getNFKInsulincalculatorsettingTargetbgAddsubValueBtn()
				.sendKeys(Integer.toString(addSubTargetBg));
		LFSUtilsAndroid.hideKeyboard();
		getNFKInsulincalculatorsettingTargetbgvalueAddBtnn().click();
		getNFKInsulincalculatorsettingTargetbgvalue1Txt()
				.sendKeys(Integer.toString(targetBg));
		LFSUtilsAndroid.hideKeyboard();
		getNFKInsulincalculatorsettingTargetbgaddsubvalue1Txt()
				.sendKeys(Integer.toString(addSubTargetBg));
		LFSUtilsAndroid.hideKeyboard();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		if (getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingActiveinsulindurationValueBtn().click();
			String insulinDuration =
					getNFKInsulincalculatorsettingDropdownTxt().get(0).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(0).click();
			Reporter.logWithScreenShot("Active insulin duration is" + insulinDuration);
		}
		if (getNFKInsulincalculatorsettingDosageincrementValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingDosageincrementValueBtn().click();
			String dosageIncrement =
					getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
			Reporter.logWithScreenShot("Dosage increment is" + dosageIncrement);
		}
		int maxSingleDose = ThreadLocalRandom.current().nextInt(1, 150);
		getNFKInsulincalculatorsettingMaximumsingledoselimitValueBtn()
				.sendKeys(Integer.toString(maxSingleDose));
		LFSUtilsAndroid.hideKeyboard();
		if (getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().isPresent()) {
			getNFKInsulincalculatorsettingInsulinconcentrationValueBtn().click();
			String insulinConcentration =
					getNFKInsulincalculatorsettingDropdownTxt().get(1).getText();
			getNFKInsulincalculatorsettingDropdownTxt().get(1).click();
			Reporter.logWithScreenShot("Insulin concentration is" + insulinConcentration);
		}
	}
	}

	public void verifyIcInfo() {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		if (eventlog.getNFKeventlogBgInsulincalculatorLnk().isPresent()) {
			Reporter.logWithScreenShot("Insulin Calculator link is displayed",
					MessageTypes.Pass);
			eventlog.getNFKeventlogBgInsulincalculatorLnk().click();
		}
		QAFWebElement getTitle =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.welcome.title")
						.subSequence(0, 13));
		getTitle.waitForPresent();
		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("Your Insulin calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle1 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.locate.title")
						.substring(0, 13));
		if (getTitle1.isPresent()) {
			Reporter.logWithScreenShot(
					"Find Your Insulin Calculator quickly and easily... page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.calculate.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Calculate Your Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.avoid.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Avoid Stacking page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.activeInsulin.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Active Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle2 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.readyToDose.title")
						.substring(0, 13));
		if (getTitle2.isPresent()) {
			Reporter.logWithScreenShot("Ready.to.Deliver page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.adjust.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Adjusting Your Dose page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.ready"))
						.isPresent()) {
			Reporter.logWithScreenShot("Ready to see Insulin Calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (LFSUtilsAndroid.tryMethod(getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("appCommon.yes")))) {
			getNFKInsulincalculatorsettingStaticText(
					ConfigurationManager.getBundle().getString("appCommon.yes")).click();
		}

	}

	public void verifyToFroOnIc() {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		QAFWebElement getTitle =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.welcome.title")
						.subSequence(0, 13));
		eventlog.getNFKeventlogBgInsulincalculatorLnk().waitForPresent();
		eventlog.getNFKeventlogBgInsulincalculatorLnk().click();
		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("Your Insulin calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle1 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.locate.title")
						.substring(0, 13));
		if (getTitle1.isPresent()) {
			Reporter.logWithScreenShot(
					"Find Your Insulin Calculator quickly and easily... page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.calculate.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Calculate Your Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.avoid.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Avoid Stacking page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.activeInsulin.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Active Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle2 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.readyToDose.title")
						.substring(0, 13));
		if (getTitle2.isPresent()) {
			Reporter.logWithScreenShot("Ready.to.Deliver page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.ready"))
						.isPresent()) {
			Reporter.logWithScreenShot("Ready to see Insulin Calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (LFSUtilsAndroid.tryMethod(getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("appCommon.yes")))) {
			Reporter.logWithScreenShot("Welcome page Yes button is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.ready"))
						.isPresent()) {
			Reporter.logWithScreenShot("Ready to see Insulin Calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle4 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.readyToDose.title")
						.substring(0, 13));
		if (getTitle4.isPresent()) {
			Reporter.logWithScreenShot("Ready.to.Deliver page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.activeInsulin.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Active Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.avoid.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Avoid Stacking page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.calculate.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Calculate Your Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle3 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.locate.title")
						.substring(0, 13));
		if (getTitle3.isPresent()) {
			Reporter.logWithScreenShot(
					"Find Your Insulin Calculator quickly and easily... page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}


	}



	public void verifyInRangePopUp() {
		if (getNFKInsulincalculatorsettingInrangepopupMessageTxt().isPresent()) {
			Reporter.logWithScreenShot("Blood glucose value is low",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Blood glucose value is not low",
					MessageTypes.Fail);
		}

	}

	public void bgCalculator() {
		int bloodGlucose = Integer.parseInt(EventLogPageAndroid.getBGValue);
		int Target = Integer.parseInt(TargetValue);
		int CorrectionFactor = Integer.parseInt(CfValue);
		totalBg = Double.toString((bloodGlucose - Target) / CorrectionFactor);
		Reporter.log("bloodGlucose bg =" + bloodGlucose, MessageTypes.Pass);
		Reporter.log("TargetValue bg =" + Target, MessageTypes.Pass);
		Reporter.log("CfValue bg =" + CorrectionFactor, MessageTypes.Pass);
		totalBg = String.valueOf(totalBg).split("\\.")[0];
		Reporter.log("Total bg =" + totalBg, MessageTypes.Pass);
	}

	public static String totalCarb;
	public void carbCalculator() {
		int carb = Integer.parseInt(EventLogPageAndroid.getCarbValue);
		int carbRatio = Integer.parseInt(CarbRatio);
		Reporter.log("Total carb ratio =" + carbRatio, MessageTypes.Pass);
		totalCarb = Double.toString(carb / carbRatio);
		totalCarb = String.valueOf(totalCarb).split("\\.")[0];
		Reporter.log("Total carb =" + totalCarb, MessageTypes.Pass);

	}
	
	public int recommendedDose;
	public void InsulinBgCalculator() {
		String insulin = EventLogPageAndroid.insulinValue;
		int insulinVal = Integer.parseInt(insulin);
		int bloodGlucose = Integer.parseInt(EventLogPageAndroid.getBGValue);
		int Target = Integer.parseInt(TargetValue);
		int CorrectionFactor = Integer.parseInt(CfValue);
		totalBg = Double.toString((bloodGlucose - Target) / CorrectionFactor);
		totalBg = String.valueOf(totalBg).split("\\.")[0];
		Reporter.log("Total bg =" + totalBg, MessageTypes.Pass);
		recommendedDose = Integer.parseInt(totalBg) - insulinVal;
	}
	
	public void BgCarbCalculator() {
		int bloodGlucose = Integer.parseInt(EventLogPageAndroid.getBGValue);
		Reporter.log("Total bg =" + bloodGlucose, MessageTypes.Pass);
		int Target = Integer.parseInt(TargetValue);
		Reporter.log("Target bg =" + Target, MessageTypes.Pass);
		int CorrectionFactor = Integer.parseInt(CfValue);
		Reporter.log("CorrectionFactor =" + CorrectionFactor, MessageTypes.Pass);
		int carb = Integer.parseInt(EventLogPageAndroid.getCarbValue);
		Reporter.log("Total carb =" + carb, MessageTypes.Pass);
		int carbRatio = Integer.parseInt(CarbRatio);
		totalBg = Double.toString((bloodGlucose - Target) / CorrectionFactor);
		totalBg = String.valueOf(totalBg).split("\\.")[0];
		Reporter.log("Total bg =" + totalBg, MessageTypes.Pass);
		totalCarb = Double.toString(carb / carbRatio);
		totalCarb = String.valueOf(totalCarb).split("\\.")[0];
		Reporter.log("Total carb =" + totalCarb, MessageTypes.Pass);
		recommendedDose = Integer.parseInt(totalBg) + Integer.parseInt(totalCarb);
		Reporter.log("recommendedDose =" + recommendedDose, MessageTypes.Pass);
		ConfigurationManager.getBundle().setProperty("key.name", recommendedDose);
	}
	
	public void verifyBgIcGraph() {
		bgCalculator();
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText()
				.contains(String.valueOf(totalBg))) {
			Reporter.logWithScreenShot(
					"Blood Glucose correct calculation is displayed on graph",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Blood Glucose correct calculation is not displayed on graph",
					MessageTypes.Fail);
		}
		LFSUtilsAndroid.swipeWithScreenPercent(80, 50, 10, 50, 7);
	}

	public void verifyICGraphforInsulin() {
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText().contains("0.0")) {
			Reporter.logWithScreenShot(
					"Correct insulin calculation is displayed on graph",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect insulin calculation is not displayed on graph",
					MessageTypes.Fail);
		}
		LFSUtilsAndroid.swipeWithScreenPercent(80, 50, 10, 50, 7);
	}

	public void verifyBgIcCalculation() {
		if (getNFKInsulincalculatorsettingIcbgValueTxt().getText()
				.contains(String.valueOf(totalBg))) {
			Reporter.logWithScreenShot("Blood Glucose correct calculation is displayed",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Blood Glucose correct calculation is not displayed",
					MessageTypes.Fail);
		}
	}

	public void verifyCarbIcGraph() {
		carbCalculator();
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText()
				.contains(String.valueOf(totalCarb))) {
			Reporter.logWithScreenShot(
					"Carbohydrate correct calculation is displayed on graph",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Carbohydrate correct calculation is not displayed on graph",
					MessageTypes.Fail);
		}
		LFSUtilsAndroid.swipeWithScreenPercent(80, 50, 10, 50, 7);
	}

	public void verifyCarbIcCalculation() {
		if (getNFKInsulincalculatorsettingIccarbValueTxt().getText()
				.contains(String.valueOf(totalCarb))) {
			Reporter.logWithScreenShot("Carbohydrate correct calculation is displayed",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Carbohydrate correct calculation is not displayed",
					MessageTypes.Fail);
		}
	}

	public void verifyInsulinIcGraph() {
		if (getNFKInsulincalculatorsettingQuickusecrossBtn().isPresent()) {
			getNFKInsulincalculatorsettingQuickusecrossBtn().click();
		}
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText().contains("0u")) {
			Reporter.logWithScreenShot(
					"Correct Insulin calculation is displayed on graph",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect Insulin calculation is displayed on graph",
					MessageTypes.Fail);
		}
		LFSUtilsAndroid.swipeWithScreenPercent(80, 50, 10, 50, 7);
	}

	public void verifyInsulinIcCalculation() {
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText().contains("0u")) {
			Reporter.logWithScreenShot(
					"Correct Insulin calculation is displayed on list view",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect Insulin calculation is displayed on list view",
					MessageTypes.Fail);
		}
	}

	public void verifyInsulinCalScreen() {
		if (getNFKInsulincalculatorsettingTitleIcLbl().isPresent()) {
			Reporter.logWithScreenShot("Insulin calculator screen is displayed",
					MessageTypes.Pass);
		}
	}

	static String getAMount;
	public static String getBGValue, getCarbValue, getCarbValue1;
	public void addBGDetailOnIc(Object eventDetail) {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		if (eventlog.getNFKEventLogunitofmeasurementlbl().getText()
				.equalsIgnoreCase("mmol/l")) {
			getNFKInsulincalculatorsettingTitleIcLbl().waitForPresent();
			EventDetailBeans eventBean = new EventDetailBeans();
			if (eventDetail instanceof String) {

				eventBean.fillFromConfig((String) eventDetail);
			} else {
				eventBean.fillData(eventDetail);
			}
			Reporter.logWithScreenShot("Blood Glucose window before editing value",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingAddbgAddvalueTxt().click();
			getNFKInsulincalculatorsettingAddbgAddvalueTxt()
					.sendKeys(eventBean.getAmount());
			getBGValue = eventBean.getAmount();
			Reporter.logWithScreenShot("Blood Glucose window after editing value",
					MessageTypes.Pass);

		}

		else {
			getNFKInsulincalculatorsettingTitleIcLbl().waitForPresent();

			EventDetailBeans eventBean = new EventDetailBeans();
			if (eventDetail instanceof String) {

				eventBean.fillFromConfig((String) eventDetail);
			} else {
				eventBean.fillData(eventDetail);
			}
			Reporter.logWithScreenShot("Blood Glucose window before editing value",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingAddbgAddvalueTxt().click();
			getNFKInsulincalculatorsettingAddbgAddvalueTxt()
					.sendKeys(eventBean.getAmount());
			getBGValue = eventBean.getAmount();
			ConfigurationManager.getBundle().setProperty("Bg.Value", getBGValue);
			Reporter.logWithScreenShot("Blood Glucose window after editing value",
					MessageTypes.Pass);
			LFSUtilsAndroid.hideKeyboard();	
			if (getNFKInsulincalculatorsettingQuickusecrossBtn().isPresent()) {
				Reporter.logWithScreenShot("You have active insulin effect in your body popup is displayed",
						MessageTypes.Pass);
				getNFKInsulincalculatorsettingQuickusecrossBtn().click();
			}

		}

	}
	
	public void verifyAddedEventOnIc(Object eventDetail) {
		String getAmountFromAddedEvent = InsulinCalculatorPageAndroid.getAMount;
		ConfigurationManager.getBundle().setProperty("addGlucose1.amount",
				getAmountFromAddedEvent);
		ConfigurationManager.getBundle().setProperty("editGlucose1.amount",
				getAmountFromAddedEvent);
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		if (eventBean.getEventType().equalsIgnoreCase("carb")) {
			for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt()
					.size(); i++) {
				if (LFSUtilsAndroid.tryDisplayMethod(
						getNFKInsulincalculatorsettingEventvalueTxt().get(i))
						&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
								.contains(totalAmount)) {
					Reporter.logWithScreenShot("Added event is displayed",
							MessageTypes.Pass);
					break;
				}
			}
		}

		else {
			for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt()
					.size(); i++) {
				if (LFSUtilsAndroid.tryDisplayMethod(
						getNFKInsulincalculatorsettingEventvalueTxt().get(i))
						&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
								.contains(eventBean.getAmount())) {
					Reporter.logWithScreenShot("Added event is displayed",
							MessageTypes.Pass);
					break;
				}
			}
		}

	}
	
	static String totalAmount;
	public void addcarbsDetailOnIc(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		getNFKInsulincalculatorsettingAddcarbAddvalueTxt().click();
		getNFKInsulincalculatorsettingAddcarbAddvalueTxt().clear();
		getNFKInsulincalculatorsettingAddcarbAddvalueTxt()
				.sendKeys(eventBean.getAmount());
		EventLogPageAndroid.getCarbValue = eventBean.getAmount();
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Carbs window after entering value",
				MessageTypes.Pass);

	}

	public void verifyGraphForBg() {
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText()
				.contains(String.valueOf("0.0"))) {
			Reporter.logWithScreenShot(
					"Blood Glucose correct calculation is displayed on graph",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Blood Glucose correct calculation is not displayed on graph",
					MessageTypes.Fail);
		}
		LFSUtilsAndroid.swipeWithScreenPercent(80, 50, 10, 50, 7);

	}
	public void verifyListForBg() {
		if (getNFKInsulincalculatorsettingIcbgValueTxt().getText()
				.contains(String.valueOf("0.0"))) {
			Reporter.logWithScreenShot("Blood Glucose correct calculation is displayed",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Blood Glucose correct calculation is not displayed",
					MessageTypes.Fail);
		}
	}
	public void verifyGraphForCarb() {
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText()
				.contains(String.valueOf("0.0"))) {
			Reporter.logWithScreenShot(
					"Carbohydrate correct calculation is displayed on graph",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Carbohydrate correct calculation is not displayed on graph",
					MessageTypes.Fail);
		}
	}
	public void verifyListForCarb() {
		if (getNFKInsulincalculatorsettingIccarbValueTxt().getText()
				.contains(String.valueOf("0.0"))) {
			Reporter.logWithScreenShot("Carbohydrate correct calculation is displayed",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Carbohydrate correct calculation is not displayed",
					MessageTypes.Fail);
		}
	}

	public void addMultipleCarbOnIc(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		getNFKInsulincalculatorsettingAddcarbAddvalueTxt().clear();
		getNFKInsulincalculatorsettingAddcarbAddvalueTxt()
				.sendKeys(eventBean.getAmount());
		getCarbValue = eventBean.getAmount();
		Reporter.logWithScreenShot("First Carbs window after entering value",
				MessageTypes.Pass);
		getNFKInsulincalculatorsettingAddCarbBtn().click();
		getNFKInsulincalculatorsettingAddCarbBtn().click();
		getNFKInsulincalculatorsettingAddcarbAddvalueTxt()
				.sendKeys(eventBean.getAmount1());
		getCarbValue1 = eventBean.getAmount1().toString();
		int finalVal = Integer.parseInt(getCarbValue) + Integer.parseInt(getCarbValue1);
		totalAmtforCarb = Integer.toString(finalVal);
		Reporter.log("Total carb =" + totalAmtforCarb);
		Reporter.logWithScreenShot("Second Carbs window after entering value",
				MessageTypes.Pass);
		if (getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("appCommon.done"))
						.isPresent()) {
			getNFKInsulincalculatorsettingStaticText(
					ConfigurationManager.getBundle().getString("appCommon.done"))
							.click();
			LFSUtilsAndroid.waitforLoad();
		}
		
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingAddCarbBtn() {
		return NFKInsulincalculatorsettingAddCarbBtn;
	}

	public void verifyGraphAfterDeleting() {
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText().contains("0u")) {
			Reporter.logWithScreenShot("Correct calculation is displayed on Graph view",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Incorrect calculation is displayed on Graph view",
					MessageTypes.Fail);
		}
		LFSUtilsAndroid.swipeWithScreenPercent(80, 50, 10, 50, 7);
	}

	public void verifyListAfterDeleting() {
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText().contains("0u")) {
			Reporter.logWithScreenShot("Correct calculation is displayed on list view",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Incorrect calculation is displayed on list view",
					MessageTypes.Fail);
		}
	}

	public void verifyInsulinBgGraph() {
		InsulinBgCalculator();
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText()
				.contains(String.valueOf(recommendedDose))) {
			Reporter.logWithScreenShot(
					"Correct calculation is displayed after adding Insulin and Bg",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Correct calculation is displayed after adding Insulin and Bg",
					MessageTypes.Pass);
		}
		LFSUtilsAndroid.swipeWithScreenPercent(80, 50, 10, 50, 7);
	}
	
	public void verifyInsulinBgList() {
		if (getNFKInsulincalculatorsettingIcbgValueTxt().getText()
				.contains(String.valueOf(totalBg))) {
			Reporter.logWithScreenShot("Blood Glucose correct calculation is displayed",
					MessageTypes.Pass);
			if (getNFKInsulincalculatorsettingIcinsulindoseValueTxt().getText()
					.contains(String.valueOf(recommendedDose)))
				Reporter.logWithScreenShot(
						"Correct calculation is displayed after adding Insulin and Bg",
						MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect calculation is displayed after adding Insulin and Bg",
					MessageTypes.Fail);
		}
		
		HomePageAndroid homepage = new HomePageAndroid();
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		eventlog.getNFKEventLogaddeventsavebtn().click();
		LFSUtilsAndroid.waitforLoad();
		homepage.getNFKHomepageeventlogBtn().verifyPresent();
	}
	
	public void deleteMultBgFromIc() {
		String bloodGlucoseValue = EventLogPageAndroid.BgValue;
		for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt().size(); i++) {
			
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(bloodGlucoseValue)) {
				Reporter.logWithScreenShot("Added event is displayed", MessageTypes.Pass);
				WebElement Image = getNFKInsulincalculatorsettingEventvalueTxt().get(i);
				Point classname = Image.getLocation();
				int xcordi = classname.getX();
				int ycordi = classname.getY();
				int startx = xcordi + 200;
				LFSUtilsAndroid.swipeWithCoordinates(startx, ycordi, xcordi, ycordi, 100);
				if (getNFKInsulincalculatorsettingStaticText(
						LFSUtilsAndroid.getPropString("office.code.delete"))
								.isPresent()) {
					Reporter.logWithScreenShot("Remove button is present",
							MessageTypes.Pass);
					try {
						getNFKInsulincalculatorsettingStaticText(
								LFSUtilsAndroid.getPropString("office.code.delete")).click();
					} catch (Exception e) {
						getNFKInsulincalculatorsettingRemovebgBtn().click();
					}
					
					LFSUtilsAndroid.waitforLoad();
					if (getNFKInsulincalculatorsettingRemoveYesBtn().isPresent()) {
						Reporter.logWithScreenShot("Alert displayed", MessageTypes.Pass);
						try {
							getNFKInsulincalculatorsettingRemoveYesBtn().click();
						} catch (Exception e) {
							getNFKInsulincalculatorsettingStaticText(
									LFSUtilsAndroid.getPropString("appCommon.yes")).click();
						}
					}
				} else {
					Reporter.logWithScreenShot("Remove button is not present",
							MessageTypes.Pass);
				}

			}
		}
	}

	public void deleteMultCarbFromIc() {
		for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(totalAmtforCarb)) {
				
				WebElement Image = getNFKInsulincalculatorsettingEventvalueTxt().get(i);
				Point classname = Image.getLocation();
				int xcordi = classname.getX();
				int ycordi = classname.getY();
				int startx = xcordi + 200;
				LFSUtilsAndroid.swipeWithCoordinates(startx, ycordi, xcordi, ycordi, 100);
				if (getNFKInsulincalculatorsettingStaticText(
						LFSUtilsAndroid.getPropString("office.code.delete"))
								.isPresent()) {
					Reporter.logWithScreenShot("Remove button is present",
							MessageTypes.Pass);
					try {
						int tapX = NFKInsulincalculatorsettingAddCarbBtn.getLocation().getX();
						int tapY = NFKInsulincalculatorsettingAddCarbBtn.getLocation().getY();
						LFSUtilsAndroid jnj = new LFSUtilsAndroid();
						TouchAction tch = new TouchAction(jnj.getDriver());
						tch.tap(tapX+250, tapY).perform();
						
					} catch (Exception e) {
						getNFKInsulincalculatorsettingStaticText(
								LFSUtilsAndroid.getPropString("insulinCalc.removeAll")).click();
					}				
					LFSUtilsAndroid.waitforLoad();
					if (getNFKInsulincalculatorsettingRemoveYesBtn().isPresent()) {
						Reporter.logWithScreenShot("Alert displayed", MessageTypes.Pass);
						try {
							getNFKInsulincalculatorsettingRemoveYesBtn().click();
						} catch (Exception e) {
							getNFKInsulincalculatorsettingStaticText(
									LFSUtilsAndroid.getPropString("appCommon.yes")).click();
						}
					}
				} else {
					Reporter.logWithScreenShot("Remove button is not present",
							MessageTypes.Pass);
				}

			}
		}
	}
//gunther
	public void deleteBGCarb() {
		deleteMultBgFromIc();
		deleteMultCarbFromIc();

	}

	public void deleteMBgSCarb() {
		deleteMultBgFromIc();
		deletecarbFromIc();

	}
	public void deleteSBgMCarb() {
		deleteBgFromIc();
		deleteMultCarbFromIc();

	}

	public void clickFooterUpArrow() {
		if (getNFKInsulincalculatorsettingManualadjIncreaseBtn().isPresent()) {
			Reporter.logWithScreenShot("Manual adjustment increase button is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingManualadjIncreaseBtn().click();
		} else {
			Reporter.logWithScreenShot(
					"Manual adjustment increase button is not displayed",
					MessageTypes.Fail);
		}
	}
	
	public void verifyGraphViewUpArrow() {
		if (LFSUtilsAndroid.tryMethod(getNFKInsulincalculatorsettingQuickusecrossBtn())) {
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			getNFKInsulincalculatorsettingQuickusecrossBtn().click();
		}
		int manualAdjustmentInc = Integer.parseInt(insulinDoseValue.replace("u", "")) + 1;
		Reporter.log("manualAdjustmentInc =" + manualAdjustmentInc);
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText()
				.contains(String.valueOf(manualAdjustmentInc))) {
			Reporter.logWithScreenShot(
					"Correct calculation is displayed on graph after manual adjustment",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect calculation is displayed on graph after manual adjustment",
					MessageTypes.Pass);
		}
	}
	
	public void clickFooterDownArrow() {
		if (getNFKInsulincalculatorsettingManualadjDecreaseBtn().isPresent()) {
			Reporter.logWithScreenShot("Manual adjustment decrease button is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingManualadjDecreaseBtn().click();
		} else {
			Reporter.logWithScreenShot(
					"Manual adjustment decrease button is not displayed",
					MessageTypes.Fail);
		}
	}
	public void verifyGraphViewDownArrow() {
		int manualAdjustmentDec = Integer.parseInt(insulinDoseValue.replace("u", ""));
		Reporter.log("manualAdjustmentDec =" + manualAdjustmentDec);
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText()
				.contains(String.valueOf(manualAdjustmentDec))) {
			Reporter.logWithScreenShot(
					"Correct calculation is displayed on graph after manual adjustment",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect calculation is displayed on graph after manual adjustment",
					MessageTypes.Fail);
		}
	}
	
	static String insulinDoseValue;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.QuickTutotial.lnk")
	private QAFWebElement NFKInsulincalculatorsettingQuicktutotialLnk;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.more.txt")
	private QAFWebElement NFKInsulincalculatorsettingMoreTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.NavBack.btn")
	private QAFWebElement NFKInsulincalculatorsettingNavbackBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.QuickIcon.btn")
	private QAFWebElement NFKInsulincalculatorsettingQuickiconBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.QuickuseCross.btn")
	private QAFWebElement NFKInsulincalculatorsettingQuickusecrossBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.food.fav.btn")
	private QAFWebElement NFKInsulincalculatorsettingFoodFavBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.food.serving.btn")
	private QAFWebElement NFKInsulincalculatorsettingFoodServingBtn;
	
	public void verifyGraphView() {
		bgCalculator();
		insulinDoseValue = getNFKInsulincalculatorsettingIcgraphValueTxt().getText();
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText()
				.contains(String.valueOf(totalBg))) {
			Reporter.logWithScreenShot(
					"Blood Glucose correct calculation is displayed on graph",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Blood Glucose correct calculation is not displayed on graph",
					MessageTypes.Fail);
		}
		
	}
	
	public void verifyIdoseandMadjIncList() {
		LFSUtilsAndroid.swipeWithScreenPercent(80, 50, 10, 50, 7);
		int manualAdjustmentInc = Integer.parseInt(insulinDoseValue.replace("u", "")) + 1;
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText()
				.contains(String.valueOf(manualAdjustmentInc))) {
			Reporter.logWithScreenShot(
					"Correct calculation is displayed on graph after manual adjustment",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect calculation is displayed on graph after manual adjustment",
					MessageTypes.Fail);
		}
		if (getNFKInsulincalculatorsettingIcinsulindoseValueTxt().getText()
				.contains(String.valueOf(manualAdjustmentInc))) {
			Reporter.logWithScreenShot(
					"Correct Insulin dose is displayed on graph after manual adjustment",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect Insulin dose is displayed on graph after manual adjustment",
					MessageTypes.Fail);
		}
		LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 80, 50, 7);
	}
	
	public void verifyIdoseandMadjDecList() {
		LFSUtilsAndroid.swipeWithScreenPercent(80, 50, 10, 50, 7);
		int manualAdjustmentDec = Integer.parseInt(insulinDoseValue.replace("u", "")) - 1;
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText()
				.contains(String.valueOf(manualAdjustmentDec))) {
			Reporter.logWithScreenShot(
					"Correct calculation is displayed on graph after manual adjustment",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect calculation is displayed on graph after manual adjustment",
					MessageTypes.Fail);
		}
		if (getNFKInsulincalculatorsettingIcinsulindoseValueTxt().getText()
				.contains(String.valueOf(manualAdjustmentDec))) {
			Reporter.logWithScreenShot(
					"Correct Insulin dose is displayed on graph after manual adjustment",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect Insulin dose is displayed on graph after manual adjustment",
					MessageTypes.Fail);
		}
	}
	
	public void editCarbOnIc() {
		getNFKBolusCalPageInsulinCaleditIconForMultipleCarb()
				.verifyPresent("Forward arrow is present");
		getNFKBolusCalPageInsulinCaleditIconForMultipleCarb().click();
		getNFKInsulincalculatorsettingAddcarbAddvalueTxt().clear();
		String value = getNFKInsulincalculatorsettingAddcarbAddvalueTxt().getText();
		int editCarb = ThreadLocalRandom.current().nextInt(150, 200);
		getNFKInsulincalculatorsettingAddcarbAddvalueTxt()
				.sendKeys(String.valueOf(editCarb));
		Reporter.logWithScreenShot("Carbs window after entering value",
				MessageTypes.Pass);

		int value1 = Integer.parseInt(totalCarbs) + Integer.parseInt(value);
		int value2 = value1 + editCarb;
		getCarbValue = String.valueOf(value2);
	}
	
	public void verifyCarbEditIc() {
		if (getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("appCommon.done"))
						.isPresent()) {
			getNFKInsulincalculatorsettingStaticText(
					ConfigurationManager.getBundle().getString("appCommon.done")).click();
			LFSUtilsAndroid.waitforLoad();
		}
		LFSUtilsAndroid.pause(5000);
		int total = Integer.parseInt(EventLogPageAndroid.getCarbValue)
				+ Integer.parseInt(food);
		Reporter.log("Total ::" + total, MessageTypes.Pass);
		totalCarbs = String.valueOf(total);
		Reporter.log("Total carb ::" + totalCarbs, MessageTypes.Pass);
		if (LFSUtilsAndroid
				.tryDisplayMethod(getNFKInsulincalculatorsettingStaticText(totalCarbs))) {

			Reporter.logWithScreenShot(
					"Correct value is displayed after addding carb and food",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect value is displayed after addding carb and food",
					MessageTypes.Fail);
		}
	}

	public void verifyInsuliCarbGraph() {
		carbCalculator();
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText()
				.contains(String.valueOf(totalCarb))) {
			Reporter.logWithScreenShot(
					"Correct calculation is displayed after adding Insulin and Carb",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Correct calculation is displayed after adding Insulin and Carb",
					MessageTypes.Fail);
		}
		LFSUtilsAndroid.swipeWithScreenPercent(80, 50, 10, 50, 7);
	}
	
	public void verifyInsuliCarbList() {
		if (getNFKInsulincalculatorsettingIccarbValueTxt().getText()
				.contains(String.valueOf(totalCarb))) {
			Reporter.logWithScreenShot("Carbohydrate correct calculation is displayed",
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingIcinsulindoseValueTxt().getText()
				.contains(String.valueOf(totalCarb))) {
			Reporter.logWithScreenShot(
					"Correct calculation is displayed after adding Insulin and Carb",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect calculation is displayed after adding Insulin and Carb",
					MessageTypes.Fail);
		}
		HomePageAndroid homepage = new HomePageAndroid();
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		eventlog.getNFKEventLogaddeventsavebtn().click();
		LFSUtilsAndroid.waitforLoad();
		homepage.getNFKHomepageeventlogBtn().verifyPresent();
		
}

	public void verifyInvalidCarb() {

	}

	public void verifyIcForInvalidCarb() {

	}

	public void verifyIcLinkOnEventScreen() {

	}

	public void VerifyBgOnIc() {

	}
	public void VerifyInsulinOnIc() {

	}
	
	public void verifyEditCarbGraph() {
		// TO DO
	}
	public void verifyEditCarbList() {
		// TO DO
	}
	public void insulinCalculator() {

	}
	
	public void verifyGraphForBgCarb() {
		int bloodGlucose = Integer.parseInt(EventLogPageAndroid.getBGValue);
		int Target = Integer.parseInt(TargetValue);
		int CorrectionFactor = Integer.parseInt(CfValue);
		int carb = Integer.parseInt(EventLogPageAndroid.getCarbValue);
		Reporter.log("Total carb =" + carb, MessageTypes.Pass);
		int carbRatio = Integer.parseInt(CarbRatio);
		String totalBloodGlucose =
				Double.toString((bloodGlucose - Target) / CorrectionFactor);
		totalBg = String.valueOf(totalBloodGlucose).split("\\.")[0];
		Reporter.log("Total bg =" + totalBg, MessageTypes.Pass);
		String totalCarbs = Double.toString(carb / carbRatio);
		totalCarb = String.valueOf(totalCarbs).split("\\.")[0];
		Reporter.log("Total carb =" + totalCarb, MessageTypes.Pass);
		recommendedDose = Integer.parseInt(totalBg) + Integer.parseInt(totalCarb);
		dose = Integer.toString(recommendedDose);

		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText()
				.contains(String.valueOf(recommendedDose))) {
			Reporter.logWithScreenShot(
					"Correct calculation is displayed after adding carb and Bg",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect calculation is displayed after adding carb and Bg",
					MessageTypes.Fail);
		}
		LFSUtilsAndroid.swipeWithScreenPercent(80, 50, 10, 50, 7);
	}
	
	public void BgMultCarbCalculator() {
		int bloodGlucose = Integer.parseInt(EventLogPageAndroid.getBGValue);
		int Target = Integer.parseInt(TargetValue);
		int CorrectionFactor = Integer.parseInt(CfValue);
		int carb = Integer.parseInt(totalAmtforCarb);
		int carbRatio = Integer.parseInt(CarbRatio);
		String totalBloodGlucose =
				Double.toString((bloodGlucose - Target) / CorrectionFactor);
		totalBg = String.valueOf(totalBloodGlucose).split("\\.")[0];
		String totalCarbs = Double.toString(carb / carbRatio);
		totalCarb = String.valueOf(totalCarbs).split("\\.")[0];
		recommendedDose = Integer.parseInt(totalBg) + Integer.parseInt(totalCarb);
		dose = Integer.toString(recommendedDose);
		Reporter.log("Recommended dose =" + dose, MessageTypes.Pass);
	}
	
	public void verifyListForBgCarb() {
		Reporter.log(
				"Total bg ::" + getNFKInsulincalculatorsettingIcgraphValueTxt().getText(),
				MessageTypes.Pass);
		if (getNFKInsulincalculatorsettingIcgraphValueTxt().getText().contains(totalBg)) {
			Reporter.logWithScreenShot(
					"Blood Glucose correct calculation is displayed on graph",
					MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingIccarbValueTxt().getText()
				.contains(String.valueOf(totalCarb))) {
			Reporter.logWithScreenShot("Carbohydrate correct calculation is displayed",
					MessageTypes.Pass);
		}
		Reporter.log(
				"RecommendedDose ::"
						+ getNFKInsulincalculatorsettingIcinsulindoseValueTxt().getText(),
				MessageTypes.Pass);
		if (getNFKInsulincalculatorsettingIcinsulindoseValueTxt().getText()
				.contains(dose)) {
			Reporter.logWithScreenShot(
					"Correct calculation is displayed after adding Carb and Bg",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect calculation is displayed after adding carb and Bg",
					MessageTypes.Fail);
		}
	}
	
	public void verifyInsulinTxt() {
		if (getNFKInsulincalculatorsettingPlusTxt().isDisplayed()) {
			Reporter.logWithScreenShot(
					"Have you recorded your recent insulin text is displayed",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Have you recorded your recent insulin text is not displayed",
					MessageTypes.Fail);
		}
	}
	
	public void clickPlusIcon() {
		if (getNFKInsulincalculatorsettingInsulinplusBtn().isDisplayed()) {
			Reporter.logWithScreenShot("plus icon is displayed", MessageTypes.Pass);
			getNFKInsulincalculatorsettingInsulinplusBtn().click();
		}
	}

	public void verifyAddInsulinEventScreen() {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
			if (eventlog.getNFKEventLogEditglucoseEditeventtitleTxt().isDisplayed()) {
				Reporter.logWithScreenShot("Add an insulin event screen is present",
						MessageTypes.Pass);
				LFSUtilsAndroid.hideKeyboard();
		}
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingPlusTxt() {
		return NFKInsulincalculatorsettingPlusTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingPlusBtn() {
		return NFKInsulincalculatorsettingPlusBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingRemoveYesBtn() {
		return NFKInsulincalculatorsettingRemoveYesBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingRemovebgBtn() {
		return NFKInsulincalculatorsettingRemovebgBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingRemovecarbBtn() {
		return NFKInsulincalculatorsettingRemovecarbBtn;
	}
	
	public QAFWebElement getNFKBolusCalPageInsulinCaleditIconForMultipleCarb() {
		return NFKBolusCalPageInsulinCaleditIconForMultipleCarb;
	}
	
	@FindBy(locator = "NFK.InsulinCalculatorSetting.removecarbEditScreen.btn")
	private QAFWebElement NFKInsulinCalculatorSettingRemovecarbEditScreenBtn;
	
	public QAFWebElement getNFKInsulinCalculatorSettingRemovecarbEditScreenBtn() {
		return NFKInsulinCalculatorSettingRemovecarbEditScreenBtn;
	}
	
	public void deleteCarbValue() {
		new ElementFactory().initFields(this);
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		getNFKBolusCalPageInsulinCaleditIconForMultipleCarb().waitForPresent();
		getNFKBolusCalPageInsulinCaleditIconForMultipleCarb().click();
		getCarbValue = Integer.toString(EventLogPageAndroid.secCarb);
		WebElement Image = eventlog.getNFKEventLogaddbgaddvaluetxtList().get(0);
		Point classname = Image.getLocation();
		int xcordi = classname.getX();
		int ycordi = classname.getY();
		int startx = xcordi + 350;
		LFSUtilsAndroid.swipeWithCoordinates(startx, ycordi, xcordi, ycordi, 100);
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("office.code.delete"))
						.isDisplayed()) {
			Reporter.logWithScreenShot("Remove button is present",
					MessageTypes.Pass);
			getNFKInsulinCalculatorSettingRemovecarbEditScreenBtn().click();
			if (getNFKInsulincalculatorsettingRemoveYesBtn().isPresent()) {
				Reporter.logWithScreenShot("Alert displayed", MessageTypes.Pass);
				getNFKInsulincalculatorsettingRemoveYesBtn().click();
			}
		} else {
			Reporter.logWithScreenShot("Remove button is not present",
					MessageTypes.Pass);
		}
		
		if (getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("appCommon.done")).isPresent()) {
			getNFKInsulincalculatorsettingStaticText(
					ConfigurationManager.getBundle().getString("appCommon.done")).click();
		}
		EventLogPageAndroid.totalAmount = EventLogPageAndroid.totalAmount - eventlog.secCarb;
		Reporter.logWithScreenShot("Carb value deleted");
	}

	public void editCarbValue() {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		getNFKBolusCalPageInsulinCaleditIconForMultipleCarb().waitForPresent();
		getNFKBolusCalPageInsulinCaleditIconForMultipleCarb().click();
		getNFKInsulincalculatorsettingAddCarbBtn().waitForPresent();
		eventlog.getNFKEventLogaddbgaddvaluetxtList().get(1).waitForPresent();
		Reporter.logWithScreenShot("Carb value before edit", MessageTypes.Pass);
		eventlog.getNFKEventLogaddbgaddvaluetxtList().get(1).click();
		eventlog.getNFKEventLogaddbgaddvaluetxtList().get(1).click();
		eventlog.getNFKEventLogaddbgaddvaluetxtList().get(1).clear();
		eventlog.getNFKEventLogaddbgaddvaluetxtList().get(1).sendKeys("120");
		LFSUtilsAndroid jnj = new LFSUtilsAndroid();
		TouchAction tch = new TouchAction(jnj.getDriver());
		tch.tap(819, 464).perform();
		EventLogPageAndroid.totalAmount = EventLogPageAndroid.totalAmount- eventlog.firstCarb;
		EventLogPageAndroid.totalAmount = EventLogPageAndroid.totalAmount + 120;
		Reporter.logWithScreenShot("Carb value edited", MessageTypes.Pass);
		if (getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("appCommon.done")).isPresent()) {
			getNFKInsulincalculatorsettingStaticText(
					ConfigurationManager.getBundle().getString("appCommon.done")).click();
		}

	}
	
	public void clickSearchIcon() {
		getNFKInsulincalculatorsettingSearchBtn().verifyPresent("Search icon is present");
		getNFKInsulincalculatorsettingSearchBtn().click();
		LFSUtilsAndroid.waitforLoad();
	}
	
	public String totalCarbs;
	
	public void verifyCarbs() {
		if (getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("appCommon.done"))
						.isPresent()) {
			getNFKInsulincalculatorsettingStaticText(
					ConfigurationManager.getBundle().getString("appCommon.done")).click();
			LFSUtilsAndroid.waitforLoad();
		}
		LFSUtilsAndroid.pause(5000);
		int total = Integer.parseInt(EventLogPageAndroid.getCarbValue)
				+ Integer.parseInt(food);
		Reporter.log("Total ::" + total, MessageTypes.Pass);
		totalCarbs = String.valueOf(total);
		Reporter.log("Total carb ::" + totalCarbs, MessageTypes.Pass);
		if (LFSUtilsAndroid
				.tryDisplayMethod(getNFKInsulincalculatorsettingStaticText(totalCarbs))) {

			Reporter.logWithScreenShot(
					"Correct value is displayed after addding carb and food",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Incorrect value is displayed after addding carb and food",
					MessageTypes.Pass);
		}
	}
	
	public void verifySearchPlusIcon() {
		getNFKInsulincalculatorsettingSearchBtn().verifyPresent("Search icon is present");
		getNFKInsulincalculatorsettingPlusBtn().verifyPresent("plus icon is present");
	}
	
	public void selectFoodHighCal() {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("office.code.search")).sendKeys(
						"Chocolate Devil's Food or Fudge Cake (Home Recipe or Purchased)");
		for (int i = 0; i <= eventlog.getNFKEventLogAddfoodSearchbarFoodlistTxt()
				.size(); i++) {
			if (eventlog.getNFKEventLogAddfoodSearchbarFoodlistTxt().get(i).getText()
					.contains("Chocolate Devil's Food or Fudge Cake")) {
				eventlog.getNFKEventLogAddfoodSearchbarFoodlistTxt().get(i).click();

				eventlog.getNFKEventLogAddeventAddfoodSearchbarAddBtn().get(i).click();
				LFSUtilsAndroid.waitforLoad();
				food = getNFKInsulincalculatorsettingFoodCarbTxt().getText();
				WebElement Image = getNFKInsulincalculatorsettingFoodServingBtn();
				Point classname = Image.getLocation();
				int xcordi = classname.getX();
				int ycordi = classname.getY();
				LFSUtilsAndroid.swipeWithCoordinates(xcordi, ycordi, xcordi + 500, ycordi,
						100);
				Reporter.logWithScreenShot("Greater than 999 gms calorie food selected",
						MessageTypes.Pass);
				break;
			}
			else {
				Reporter.logWithScreenShot("Greater than 999 gms calorie food is not selected",
						MessageTypes.Pass);
			}
		}
	}
	
	public void verifyReqErrorMsg() {
		getNFKInsulincalculatorsettingCarbwarningTxt().waitForPresent();
		if (getNFKInsulincalculatorsettingCarbwarningTxt().isPresent()) {
			Reporter.logWithScreenShot(
					"Error message carbs value must be between 0 and 999 grams is displayed",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Error message carbs value must be between 0 and 999 grams is not displayed",
					MessageTypes.Fail);
		}
	}
	
	public void verifySearch_Icon(String option) {
		option = option.toUpperCase();
		switch (option) {
			case "ENABLED" :
				if (getNFKInsulincalculatorsettingSearchBtn().isDisplayed()) {
					if (getNFKInsulincalculatorsettingSearchBtn().isEnabled()) {
						Reporter.logWithScreenShot("Search icon is displayed and enabled",
								MessageTypes.Pass);
					}
				}
				break;
			case "DISABLED" :
				if (getNFKInsulincalculatorsettingSearchBtn().isDisplayed()) {
					getNFKInsulincalculatorsettingSearchBtn()
							.verifyDisabled("Search icon is displayed but Disabled");
				}
				break;
		}
	}
	
	public void verifySpash_Screen(String option) {
		option = option.toUpperCase();
		switch (option) {
			case "DISPLAYED" :
				if (getNFKInsulincalculatorsettingFoodSplashBtn().isDisplayed()) {
					Reporter.logWithScreenShot("Splash screen is displayed",
							MessageTypes.Pass);
				}
				break;
			case "NOT DISPLAYED" :
				getNFKInsulincalculatorsettingFoodSplashBtn()
						.verifyNotPresent("Splash screen is not displayed");
				break;
		}
	}
	
	public void verifyInsulinMentor_link(String option) {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		option = option.toUpperCase();
		switch (option) {
			case "DISPLAYED" :
				if (eventlog.getNFKeventlogBgInsulincalculatorLnk().isDisplayed()) {
					Reporter.logWithScreenShot("Insulin mentor link is displayed",
							MessageTypes.Pass);
				}
				break;
			case "NOT DISPLAYED" :
				eventlog.getNFKeventlogBgInsulincalculatorLnk()
						.verifyNotPresent("Insulin mentor link is not displayed");
				break;
		}
	}
	
	
	public void clear_Searchbar() {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		if (eventlog
				.getNFKEventLogpageStaticText(
						LFSUtilsAndroid.getPropString("office.code.search"))
				.isPresent()) {
			Reporter.logWithScreenShot("Search food bar before clearing food",
					MessageTypes.Pass);
			eventlog.getNFKEventLogpageStaticText(
					LFSUtilsAndroid.getPropString("office.code.search")).clear();
			Reporter.logWithScreenShot("Search food bar after clearing food",
					MessageTypes.Pass);
		}
	}
	
	public void verifyQuickInfo() {
		QAFWebElement getTitle =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.welcome.title")
						.subSequence(0, 13));
		getTitle.waitForPresent();
		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("Your Insulin calculator is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle1 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.locate.title")
						.substring(0, 13));
		if (getTitle1.isPresent()) {
			Reporter.logWithScreenShot(
					"Find Your Insulin Calculator quickly and easily... page is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.calculate.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Calculate Your Insulin page is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.avoid.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Avoid Stacking page is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.activeInsulin.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Active Insulin page is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle2 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.readyToDose.title")
						.substring(0, 13));
		if (getTitle2.isPresent()) {
			Reporter.logWithScreenShot("Ready.to.Deliver page is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.adjust.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Adjusting Your Dose page is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			getNFKInsulincalculatorsettingQuickusecrossBtn().click();
		}
	}

	public void VerifyQuickUseExit() {
		QAFWebElement getTitle =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.welcome.title")
						.subSequence(0, 13));
		getTitle.waitForPresent();
		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("Your Insulin calculator is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			getNFKInsulincalculatorsettingQuickusecrossBtn().click();
			getNFKInsulincalculatorsettingQuicktutotialLnk()
					.verifyPresent("Quick use tutorial link is displayed");
			getNFKInsulincalculatorsettingQuicktutotialLnk().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();

		}
		QAFWebElement getTitle1 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.locate.title")
						.substring(0, 13));
		if (getTitle1.isPresent()) {
			Reporter.logWithScreenShot(
					"Find Your Insulin Calculator quickly and easily... page is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			getNFKInsulincalculatorsettingQuickusecrossBtn().click();
			getNFKInsulincalculatorsettingQuicktutotialLnk()
					.verifyPresent("Quick use tutorial link is displayed");
			getNFKInsulincalculatorsettingQuicktutotialLnk().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.calculate.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Calculate Your Insulin page is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			getNFKInsulincalculatorsettingQuickusecrossBtn().click();
			getNFKInsulincalculatorsettingQuicktutotialLnk()
					.verifyPresent("Quick use tutorial link is displayed");
			getNFKInsulincalculatorsettingQuicktutotialLnk().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.avoid.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Avoid Stacking page is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			getNFKInsulincalculatorsettingQuickusecrossBtn().click();
			getNFKInsulincalculatorsettingQuicktutotialLnk()
					.verifyPresent("Quick use tutorial link is displayed");
			getNFKInsulincalculatorsettingQuicktutotialLnk().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.activeInsulin.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Active Insulin page is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			getNFKInsulincalculatorsettingQuickusecrossBtn().click();
			getNFKInsulincalculatorsettingQuicktutotialLnk()
					.verifyPresent("Quick use tutorial link is displayed");
			getNFKInsulincalculatorsettingQuicktutotialLnk().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
			QAFWebElement getTitle2 =
					getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
							.getPropString("insulinCalc.firstUse.readyToDose.title")
							.substring(0, 13));
			if (getTitle2.isPresent()) {
				Reporter.logWithScreenShot("Ready.to.Deliver page is present",
						MessageTypes.Pass);
				getNFKInsulincalculatorsettingQuickusecrossBtn()
						.verifyPresent("Cross button is present");
				getNFKInsulincalculatorsettingQuickusecrossBtn().click();
				getNFKInsulincalculatorsettingQuicktutotialLnk()
						.verifyPresent("Quick use tutorial link is displayed");
				getNFKInsulincalculatorsettingQuicktutotialLnk().click();
				LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
				LFSUtilsAndroid.waitforLoad();
			}
			if (getNFKInsulincalculatorsettingStaticText(
					LFSUtilsAndroid.getPropString("insulinCalc.firstUse.adjust.title"))
							.isPresent()) {
				Reporter.logWithScreenShot("Adjusting Your Dose page is present",
						MessageTypes.Pass);
				getNFKInsulincalculatorsettingQuickusecrossBtn()
						.verifyPresent("Cross button is present");
				getNFKInsulincalculatorsettingQuickusecrossBtn().click();
			}
		}
	}
	
	public void verifyQuickToFro() {
		QAFWebElement getTitle =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.welcome.title")
						.subSequence(0, 13));
		getTitle.waitForPresent();
		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("Your Insulin calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle1 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.locate.title")
						.substring(0, 13));
		if (getTitle1.isPresent()) {
			Reporter.logWithScreenShot(
					"Find Your Insulin Calculator quickly and easily... page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.calculate.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Calculate Your Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.avoid.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Avoid Stacking page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.activeInsulin.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Active Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle2 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.readyToDose.title")
						.substring(0, 13));
		if (getTitle2.isPresent()) {
			Reporter.logWithScreenShot("Ready.to.Deliver page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.adjust.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Adjusting Your Dose page is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle4 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.readyToDose.title")
						.substring(0, 13));
		if (getTitle4.isPresent()) {
			Reporter.logWithScreenShot("Ready.to.Deliver page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.activeInsulin.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Active Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.avoid.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Avoid Stacking page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.calculate.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Calculate Your Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle3 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.locate.title")
						.substring(0, 13));
		if (getTitle3.isPresent()) {
			Reporter.logWithScreenShot(
					"Find Your Insulin Calculator quickly and easily... page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("Your Insulin calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}

	}
	
	public void verifyFirstUsePopUp() {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		eventlog.getNFKeventlogBgInsulincalculatorLnk()
				.verifyPresent("Insulin calculator link is displayed");
		eventlog.getNFKeventlogBgInsulincalculatorLnk().click();
		if (getNFKInsulincalculatorsettingSwipetooltipsTxt().isPresent()) {
			Reporter.log("Tool tips text is present for first use tutorial",
					MessageTypes.Pass);
		} else {
			Reporter.log("Tool tips text is not present for first use tutorial",
					MessageTypes.Pass);
		}
	}
	
	public void verifyPopUpDismiss() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 90, 50, 10, 5);
		getNFKInsulincalculatorsettingSwipetooltipsTxt()
				.verifyNotPresent("Tool tips text successfully dimissed after swiping");
	}
	
	
	public void verifyNoMessage() {
		if (!getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("appCommon.yes"))
								.isPresent()) {
			Reporter.log("There is no message after finishing Quick Use tutorial",
					MessageTypes.Pass);
		}
	}
	
	
	public void verifyLongerTutorail() {
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.quickUse.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Quick use tutorial page is displayed",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Quick use tutorial page is not displayed",
					MessageTypes.Fail);
		}
		getNFKInsulincalculatorsettingQuicktutotialLnk()
				.verifyPresent("Quick use tutorial link is displayed");
		QAFWebElement title =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.quickUse.title")
						.subSequence(0, 7));
		title.waitForPresent();
		if (title.isPresent()) {
			Reporter.logWithScreenShot("Quick use page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title1 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.terminology.title")
						.substring(0, 7));
		if (title1.isPresent()) {
			Reporter.logWithScreenShot("Terminology page is displayed",
							MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.legend.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Legend page is displayed", MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title2 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.overview.title")
						.substring(0, 7));
		if (title2.isPresent()) {
			Reporter.logWithScreenShot("Tutorial page is displayed", MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		
		QAFWebElement title3 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.finder.title")
						.substring(0, 7));
		if (title3.isPresent()) {
			Reporter.logWithScreenShot("Finder page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title4 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.entryBasics.title")
						.substring(0, 7));
		if (title4.isPresent()) {
			Reporter.logWithScreenShot("Insulin Mentor Entry Basics page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title5 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.inAction.title")
						.substring(0, 7));
		if (title5.isPresent()) {
			Reporter.logWithScreenShot("Insulin Mentor Action page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.tips.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Insider Tips page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title6 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.inAction.title")
						.substring(0, 7));
		if (title6.isPresent()) {
			Reporter.logWithScreenShot("Insulin mentor setting page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.toc.faq.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Frequently asked question page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
	}
	
	public void verifyLTForwardBackNavigation() {
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.quickUse.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Quick use tutorial page is displayed",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Quick use tutorial page is not displayed",
					MessageTypes.Fail);
		}
		getNFKInsulincalculatorsettingQuicktutotialLnk()
				.verifyPresent("Quick use tutorial link is displayed");
		QAFWebElement title =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.quickUse.title")
						.subSequence(0, 7));
		title.waitForPresent();
		if (title.isPresent()) {
			Reporter.logWithScreenShot("Quick use page is displayed", MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title1 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.terminology.title")
						.substring(0, 7));
		if (title1.isPresent()) {
			Reporter.logWithScreenShot("Terminology page is displayed", 
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.legend.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Legend page is displayed", MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title2 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.overview.title")
						.substring(0, 7));
		if (title2.isPresent()) {
			Reporter.logWithScreenShot("Tutorial page is displayed", MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		
		QAFWebElement title3 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.finder.title")
						.substring(0, 7));
		if (title3.isPresent()) {
			Reporter.logWithScreenShot("Finder page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title4 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.entryBasics.title")
						.substring(0, 7));
		if (title4.isPresent()) {
			Reporter.logWithScreenShot("Insulin Mentor Entry Basics page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title5 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.inAction.title")
						.substring(0, 7));
		if (title5.isPresent()) {
			Reporter.logWithScreenShot("Insulin Mentor Action page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.tips.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Insider Tips page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title6 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.inAction.title")
						.substring(0, 7));
		if (title6.isPresent()) {
			Reporter.logWithScreenShot("Insulin mentor setting page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.toc.faq.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Frequently asked question page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(5, 80, 95, 80, 7);
			
			LFSUtilsAndroid.waitforLoad();
		}
		if (title6.isPresent()) {
			Reporter.logWithScreenShot("Insulin mentor setting page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(5, 80, 95, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}

		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.tips.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Insider Tips page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(5, 80, 95, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}

		if (title5.isPresent()) {
			Reporter.logWithScreenShot("Insulin Mentor Action page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(5, 80, 95, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}

		if (title4.isPresent()) {
			Reporter.logWithScreenShot("Insulin Mentor Entry Basics page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(5, 80, 95, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}

		if (title3.isPresent()) {
			Reporter.logWithScreenShot("Finder page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(5, 80, 95, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}

		if (title2.isPresent()) {
			Reporter.logWithScreenShot("Tutorial page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(5, 80, 95, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}

		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.legend.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Legend page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(5, 80, 95, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}

		if (title1.isPresent()) {
			Reporter.logWithScreenShot(
					"Terminology page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.swipeWithScreenPercent(5, 80, 95, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (title.isPresent()) {
			Reporter.logWithScreenShot("Quick use page is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			LFSUtilsAndroid.waitforLoad();
		}
	}
	public void clickRecommendedDose() {
		HomePageAndroid home = new HomePageAndroid();
		int count = 0;
		for (QAFWebElement ele : home.getNFKHomepageEventValueTxt()) {
			if (LFSUtilsAndroid.tryDisplayMethod(ele)
					&& ele.getText().contains(ConfigurationManager.getBundle()
							.getProperty("Rec.dose").toString())) {
				ele.click();
				Reporter.logWithScreenShot("After clicking on event", MessageTypes.Pass);
				count++;
				break;
			}
		}
		if (count == 0)
			Reporter.logWithScreenShot("Events are not added", MessageTypes.Fail);
	}
	
	public void verifyYieldIcon_Graph() {
		getNFKInsulincalculatorsettingManualadjIncreaseBtn().click();
		if (getNFKInsulincalculatorsettingMaxInsulindoseTxt().isPresent()) {
			Reporter.logWithScreenShot("Manual adjustment popup is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn()
					.verifyPresent("Cross button is present");
			getNFKInsulincalculatorsettingQuickusecrossBtn().click();
		}
		Reporter.logWithScreenShot("Yield icon is displayed on infographic view",
				MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 5);
	}

	public void verifyYieldIcon_List() {
		if (getNFKInsulincalculatorsettingYeildIconBtn().isDisplayed()) {
			Reporter.logWithScreenShot("Yield icon is displayed on List view",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Yield icon is not displayed on List view",
					MessageTypes.Fail);
		}
	}
	
	public void verifyYieldIconGraph() {
		getNFKInsulincalculatorsettingYeildIconBtn()
				.verifyNotPresent("Yield icon is not displayed on infographic view");
		LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 5);
	}

	public void verifyYield_Icon() {
		verifyYieldIcon_Graph();
		if (getNFKInsulincalculatorsettingYeildIconBtn().isDisplayed()) {
			Reporter.logWithScreenShot("Yield icon is displayed on List view",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Yield icon is not displayed on List view",
					MessageTypes.Fail);
		}
	}

	public void verifyYieldIconInList() {
		getNFKInsulincalculatorsettingYeildIconBtn()
				.verifyNotPresent("Yield icon is not displayed on list view");
	}

	public void verifyMaxPopUpMsg() {
		getNFKInsulincalculatorsettingYeildIconBtn().click();
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.singleBolusLimitReached"))
						.isPresent()) {
			Reporter.logWithScreenShot(
					"Maximum Single Dose Limit Reached popup is displayed",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Maximum Single Dose Limit Reached popup is not displayed",
					MessageTypes.Fail);
		}
	}
	
	public void verifyMaxPopUpDismiss() {
		verifyMaxPopUpMsg();
		LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 5);
		Reporter.logWithScreenShot(
				"Maximum Single Dose Limit Reached popup dismiss on swiping",
				MessageTypes.Pass);

	}
	
	public void VerifyPlusIconPopUpMsg() {
		if (getNFKInsulincalculatorsettingManualadjIncreaseBtn().isDisplayed()) {
			Reporter.logWithScreenShot("Plus icon is present", MessageTypes.Pass);
			getNFKInsulincalculatorsettingManualadjIncreaseBtn().click();
		} else {
			Reporter.logWithScreenShot("Plus icon is not present", MessageTypes.Pass);
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.singleBolusLimitReached"))
						.isPresent()) {
			Reporter.logWithScreenShot(
					"Maximum Single Dose Limit Reached popup is displayed on clicking plus icon",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot(
					"Maximum Single Dose Limit Reached popup is not displayed on clicking plus icon",
					MessageTypes.Fail);
		}

	}

	public void clickStartOver() {
		QAFWebElement getTitle =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.welcome.title")
						.subSequence(0, 13));
		getTitle.waitForPresent();
		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("Your Insulin calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle1 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.locate.title")
						.substring(0, 13));
		if (getTitle1.isPresent()) {
			Reporter.logWithScreenShot(
					"Find Your Insulin Calculator quickly and easily... page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.calculate.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Calculate Your Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.avoid.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Avoid Stacking page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.activeInsulin.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Active Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle2 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.readyToDose.title")
						.substring(0, 13));
		if (getTitle2.isPresent()) {
			Reporter.logWithScreenShot("Ready.to.Deliver page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.adjust.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Adjusting Your Dose page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.ready"))
						.isPresent()) {
			Reporter.logWithScreenShot("Ready to see Insulin Calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingFirstuseStartoverBtn().isPresent()) {
			Reporter.logWithScreenShot("First use start over button is present",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingFirstuseStartoverBtn().click();
		}

	}
	
	public void VerifyFUT() {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		QAFWebElement getTitle =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.welcome.title")
						.subSequence(0, 13));
		eventlog.getNFKeventlogBgInsulincalculatorLnk().waitForPresent();
		eventlog.getNFKeventlogBgInsulincalculatorLnk().click();
		getTitle.waitForPresent();
		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("Your Insulin calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle1 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.locate.title")
						.substring(0, 13));
		if (getTitle1.isPresent()) {
			Reporter.logWithScreenShot(
					"Find Your Insulin Calculator quickly and easily... page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.calculate.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Calculate Your Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.avoid.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Avoid Stacking page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.activeInsulin.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Active Insulin page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle2 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.readyToDose.title")
						.substring(0, 13));
		if (getTitle2.isPresent()) {
			Reporter.logWithScreenShot("Ready.to.Deliver page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		// if (getNFKInsulincalculatorsettingStaticText(
		// JNJUtilsAndroid.getPropString("insulinCalc.firstUse.ready"))
		// .isPresent()) {
		// Reporter.logWithScreenShot("Ready to see Insulin Calculator is present",
		// MessageTypes.Pass);
		// JNJUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
		// JNJUtilsAndroid.waitforLoad();
		// }
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.firstUse.ready"))
						.isPresent()) {
			Reporter.logWithScreenShot("Ready to see Insulin Calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
	}

	public void clickFUTYes() {
		verifyIcInfo();
	}

	public void clickInfoIconBc() {
		getNFKInsulincalculatorsettingQuickiconBtn()
				.verifyPresent("Info Icon is present on Bc screen");
		getNFKInsulincalculatorsettingQuickiconBtn().click();
		Reporter.logWithScreenShot("Info Icon clicked",
				MessageTypes.Pass);
	}

	public void VerifyQuickUseLink() {
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.quickUse.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Quick use tutorial page is displayed",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Quick use tutorial page is not displayed",
					MessageTypes.Fail);
		}
		getNFKInsulincalculatorsettingQuicktutotialLnk()
				.verifyPresent("Quick use tutorial link is displayed");
		getNFKInsulincalculatorsettingQuicktutotialLnk().click();

	}
	
	public void verifyDoseAndBcData() {
		HomePageAndroid home = new HomePageAndroid();
		int bloodGlucose = Integer.parseInt(EventLogPageAndroid.getBGValue);
		int Target = Integer.parseInt(TargetValue);
		int CorrectionFactor = Integer.parseInt(CfValue);
		int carb = Integer.parseInt(EventLogPageAndroid.getCarbValue);
		int carbRatio = Integer.parseInt(CarbRatio);
		totalBg = Double.toString((bloodGlucose - Target) / CorrectionFactor);
		Reporter.log("totalBg" + totalBg, MessageTypes.Pass);
		totalBg = String.valueOf(totalBg).split("\\.")[0];
		totalCarb = Double.toString(carb / carbRatio);
		Reporter.log("totalCarb" + totalCarb, MessageTypes.Pass);
		totalCarb = String.valueOf(totalCarb).split("\\.")[0];
		recommendedDose = Integer.parseInt(totalBg) + Integer.parseInt(totalCarb);
		ConfigurationManager.getBundle().setProperty("Rec.dose", recommendedDose);
		Reporter.log("RecommendedDose" + recommendedDose, MessageTypes.Pass);
		for (int i = 0; i < home.getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid
					.tryDisplayMethod(home.getNFKHomepageEventValueTxt().get(i))
					&& home.getNFKHomepageEventValueTxt().get(i).getText()
							.contains(Integer.toString(recommendedDose))) {
				Reporter.logWithScreenShot("Added event is displayed", MessageTypes.Pass);
				break;
			}
		}

	}
	
	public void verifyRecommendedDose() {
		HomePageAndroid home = new HomePageAndroid();
		AccountPageAndroid account = new AccountPageAndroid();
		if (getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("appCommon.done"))
						.isPresent()) {
			getNFKInsulincalculatorsettingStaticText(
					ConfigurationManager.getBundle().getString("appCommon.done"))
							.click();
			LFSUtilsAndroid.waitforLoad();
		}
		int bloodGlucose = Integer.parseInt(EventLogPageAndroid.getBGValue);
		int Target = Integer.parseInt(TargetValue);
		int CorrectionFactor = Integer.parseInt(CfValue);
		int carb = Integer.parseInt(totalAmtforCarb)+ Integer.parseInt(food);
		int carbRatio = Integer.parseInt(CarbRatio);
		totalBg = Double.toString((bloodGlucose - Target) / CorrectionFactor);
		totalBg = String.valueOf(totalBg).split("\\.")[0];
		totalCarb = Double.toString(carb / carbRatio);
		totalCarb = String.valueOf(totalCarb).split("\\.")[0];
		recommendedDose = Integer.parseInt(totalBg) + Integer.parseInt(totalCarb);
		ConfigurationManager.getBundle().setProperty("Rec.dose", recommendedDose);
		Reporter.log("RecommendedDose" + recommendedDose, MessageTypes.Pass);
		account.getNFKMoremenuAccountpageSaveBtn().click();
		LFSUtilsAndroid.waitforLoad();		
		for (int i = 0; i < home.getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid
					.tryDisplayMethod(home.getNFKHomepageEventValueTxt().get(i))
					&& home.getNFKHomepageEventValueTxt().get(i).getText()
							.contains(String.valueOf(recommendedDose))) {
				Reporter.logWithScreenShot("Added event is displayed", MessageTypes.Pass);
				break;
			}
		}
	}

	public QAFWebElement getNFKInsulincalculatorsettingQuicktutotialLnk() {
		return NFKInsulincalculatorsettingQuicktutotialLnk;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingMoreTxt() {
		return NFKInsulincalculatorsettingMoreTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingNavbackBtn() {
		return NFKInsulincalculatorsettingNavbackBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingQuickiconBtn() {
		return NFKInsulincalculatorsettingQuickiconBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingQuickusecrossBtn() {
		return NFKInsulincalculatorsettingQuickusecrossBtn;
	}
	
	public void VerifyFUTPopUp() {
		if (!getNFKInsulincalculatorsettingSwipetooltipsTxt().isPresent()) {
			Reporter.log("Tool tips text is not present for first use tutorial",
					MessageTypes.Pass);
		} else {
			Reporter.log("Tool tips text is present for first use tutorial",
					MessageTypes.Fail);
		}

	}

	public void toFroNavigation() {
		QAFWebElement getTitle =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.welcome.title")
						.subSequence(0, 13));
		getTitle.waitForPresent();
		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("Your Insulin calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 50, 5, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement getTitle1 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.locate.title")
						.substring(0, 13));
		if (getTitle1.isPresent()) {
			Reporter.logWithScreenShot(
					"Find Your Insulin Calculator quickly and easily... page is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(5, 50, 95, 50, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("Your Insulin calculator is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		}

	}
	public void markAsUnFav() {
		getNFKInsulincalculatorsettingFoodFavBtn().click();
		Reporter.logWithScreenShot("Item removed from favorite list", MessageTypes.Pass);
	}

	public void markAsFav() {
		getNFKInsulincalculatorsettingFoodFavBtn().click();
		Reporter.logWithScreenShot("Item added to favorite list", MessageTypes.Pass);
	}

	public void recommendedForBCI() {
		HomePageAndroid home = new HomePageAndroid();
		int bloodGlucose = Integer.parseInt(getBGValue);
		int insulin = Integer.parseInt(EventLogPageAndroid.insulinValue);
		int Target = Integer.parseInt(TargetValue);
		int CorrectionFactor = Integer.parseInt(CfValue);
		int carb = Integer.parseInt(EventLogPageAndroid.getCarbValue);
		int carbRatio = Integer.parseInt(CarbRatio);
		String totalBloodGlucose =
				Double.toString((bloodGlucose - Target) / CorrectionFactor);
		totalBg = String.valueOf(totalBloodGlucose).split("\\.")[0];
		String totalCarbs = Double.toString(carb / carbRatio);
		totalCarb = String.valueOf(totalCarbs).split("\\.")[0];
		recommendedDose = Integer.parseInt(totalBg) + Integer.parseInt(totalCarb);
		recommendedDose = recommendedDose - insulin;
		dose = Integer.toString(recommendedDose);
		for (int i = 0; i < home.getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid
					.tryDisplayMethod(home.getNFKHomepageEventValueTxt().get(i))
					&& home.getNFKHomepageEventValueTxt().get(i).getText()
							.contains(Integer.toString(recommendedDose))) {
			Reporter.logWithScreenShot(
					"Correct calculation is displayed after adding Bg Carb and Insulin",
					MessageTypes.Pass);
			break;
		} else {
			Reporter.logWithScreenShot(
					"Incorrect calculation is displayed after adding Bg Carb and Insulin",
					MessageTypes.Fail);
			}
		}
	}
	
	public static String food;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.food.carb.txt")
	private QAFWebElement NFKInsulincalculatorsettingFoodCarbTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.yeild.icon.btn")
	private QAFWebElement NFKInsulincalculatorsettingYeildIconBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.max.insulindose.txt")
	private QAFWebElement NFKInsulincalculatorsettingMaxInsulindoseTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.food.justadded.btn")
	private QAFWebElement NFKInsulincalculatorsettingFoodJustaddedBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.food.recent.btn")
	private QAFWebElement NFKInsulincalculatorsettingFoodRecentBtn;
	
	public static String selectedFood;
	public void add_Food(Object eventDetail) {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("office.code.search"))
						.sendKeys(eventBean.getFoodItem());
		selectedFood = eventBean.getFoodItem();
		for (int i = 0; i <= eventlog.getNFKEventLogAddfoodSearchbarFoodlistTxt().size(); i++) {
			if (eventlog.getNFKEventLogAddfoodSearchbarFoodlistTxt().get(i).getText()
					.equals("Cheese Pizza")) {
				eventlog.getNFKEventLogAddfoodSearchbarFoodlistTxt().get(i).click();

				eventlog.getNFKEventLogAddeventAddfoodSearchbarAddBtn().get(i).click();
				LFSUtilsAndroid.waitforLoad();
				food = getNFKInsulincalculatorsettingFoodCarbTxt().getText();
				Reporter.log("Food value ::" + food, MessageTypes.Pass);
				Reporter.logWithScreenShot("Food added is displayed", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Food added is not displayed",
						MessageTypes.Pass);
			}

			if (getNFKInsulincalculatorsettingStaticText(
					ConfigurationManager.getBundle().getString("appCommon.done"))
							.isPresent()) {
				getNFKInsulincalculatorsettingStaticText(
						ConfigurationManager.getBundle().getString("appCommon.done"))
								.click();
				LFSUtilsAndroid.waitforLoad();
			}
		}
	}

	public void searchFoodItem() {
		getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("office.code.search")).sendKeys("Pizza");
		Reporter.logWithScreenShot("Searched food", MessageTypes.Pass);

	}

	public void addTwoItems() {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		eventlog.getNFKEventLogpageStaticText(
				LFSUtilsAndroid.getPropString("office.code.search"))
				.sendKeys("Cheese Pizza");
		for (int i = 0; i <= eventlog.getNFKEventLogAddfoodSearchbarFoodlistTxt()
				.size(); i++) {
			if (eventlog.getNFKEventLogAddfoodSearchbarFoodlistTxt().get(i).getText()
					.equals("Cheese Pizza")) {
				eventlog.getNFKEventLogAddfoodSearchbarFoodlistTxt().get(i).click();

				eventlog.getNFKEventLogAddeventAddfoodSearchbarAddBtn().get(i).click();
				if (getNFKInsulincalculatorsettingStaticText(
						ConfigurationManager.getBundle().getString("appCommon.done"))
								.isPresent()) {
					getNFKInsulincalculatorsettingStaticText(
							ConfigurationManager.getBundle().getString("appCommon.done"))
									.click();
					LFSUtilsAndroid.waitforLoad();
				}
			}
		}

		getNFKInsulincalculatorsettingSearchBtn().waitForPresent();
		getNFKInsulincalculatorsettingSearchBtn().click();
		Reporter.logWithScreenShot("Search icon clicked", MessageTypes.Pass);
		getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("office.code.search")).click();
		Reporter.logWithScreenShot("After clicking search", MessageTypes.Pass);
		eventlog.getNFKEventLogpageStaticText(
				LFSUtilsAndroid.getPropString("office.code.search"))
				.sendKeys("Cherry Fudge Cake");
		for (int i = 0; i <= eventlog.getNFKEventLogAddfoodSearchbarFoodlistTxt()
				.size(); i++) {
			if (eventlog.getNFKEventLogAddfoodSearchbarFoodlistTxt().get(i).getText()
					.contains("Cherry Fudge Cake")) {
				eventlog.getNFKEventLogAddfoodSearchbarFoodlistTxt().get(i).click();

				eventlog.getNFKEventLogAddeventAddfoodSearchbarAddBtn().get(i).click();
				if (getNFKInsulincalculatorsettingStaticText(
						ConfigurationManager.getBundle().getString("appCommon.done"))
								.isPresent()) {
					getNFKInsulincalculatorsettingStaticText(
							ConfigurationManager.getBundle().getString("appCommon.done"))
									.click();
					LFSUtilsAndroid.waitforLoad();
				}
			}
		}
		Reporter.logWithScreenShot("After saving food", MessageTypes.Pass);
	}

	public void clickJstAdded() {
		if (getNFKInsulincalculatorsettingFoodJustaddedBtn().isDisplayed()) {
			Reporter.logWithScreenShot("Just added food button is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingFoodJustaddedBtn().click();
		}
	}

	public void click_deselectFood() {
		getNFKInsulincalculatorsettingFoodDeselectBtn()
				.verifyPresent("Deselect food button is displayed");
		getNFKInsulincalculatorsettingFoodDeselectBtn().click();

	}
	
	public void verify_ResentList(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		selectedFood = eventBean.getSelectFood();
		getNFKInsulincalculatorsettingStaticText(selectedFood).verifyPresent("Selected food is displayed");
		Reporter.logWithScreenShot("Item present in recent tab", MessageTypes.Pass);
	}
	
	public void verify_JustAddedList(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {
	
			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		selectedFood = eventBean.getSelectFood();
		getNFKInsulincalculatorsettingStaticText(selectedFood).verifyPresent();
		Reporter.logWithScreenShot("Item present in just added tab", MessageTypes.Pass);
	}
	
	public void verifyActiveInsulin_Overlay() {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		if (eventlog.getNFKeventlogBgInsulincalculatorLnk().isPresent()) {
			Reporter.logWithScreenShot("Insulin Calculator link is displayed",
					MessageTypes.Pass);
			eventlog.getNFKeventlogBgInsulincalculatorLnk().click();
		}
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		if (LFSUtilsAndroid.tryMethod(getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("appCommon.yes")))) {
			getNFKInsulincalculatorsettingStaticText(
					ConfigurationManager.getBundle().getString("appCommon.yes")).click();
		}
		if (getNFKInsulincalculatorsettingMaxInsulindoseTxt().isDisplayed()
				&& getNFKInsulincalculatorsettingMaxInsulindoseTxt().isPresent()) {
			Reporter.logWithScreenShot(
					"You have active insulin effect in your body popup is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingQuickusecrossBtn().click();
		} else {
			Reporter.logWithScreenShot(
					"You have active insulin effect in your body popup is not displayed",
					MessageTypes.Fail);
		}
	}
	
	public void verifyAllowPatientEdit() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 90, 50, 10, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 90, 50, 10, 7);
		getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("settings.insulinCalc.allowEditing"))
						.verifyPresent("Allow patient editing text is displayed");
		if (getNFKInsulincalculatorsettingAlloweditingToggleBtn().getAttribute("text")
				.equalsIgnoreCase("ON"))
			Reporter.logWithScreenShot("Allow editing toggle button switch is ON",
					MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Allow editing toggle button switch is OFF",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingAlloweditingToggleBtn().click();
			Reporter.logWithScreenShot("Allow editing toggle button switch is ON",
					MessageTypes.Pass);
		}
	}
	public QAFWebElement getNFKInsulincalculatorsettingFoodFavBtn() {
		return NFKInsulincalculatorsettingFoodFavBtn;
	}
	public QAFWebElement getNFKInsulincalculatorsettingFoodServingBtn() {
		return NFKInsulincalculatorsettingFoodServingBtn;
	}
	public QAFWebElement getNFKInsulincalculatorsettingFoodCarbTxt() {
		return NFKInsulincalculatorsettingFoodCarbTxt;
	}
	public QAFWebElement getNFKInsulincalculatorsettingYeildIconBtn() {
		return NFKInsulincalculatorsettingYeildIconBtn;
	}
	public QAFWebElement getNFKInsulincalculatorsettingMaxInsulindoseTxt() {
		return NFKInsulincalculatorsettingMaxInsulindoseTxt;
	}
	public QAFWebElement getNFKInsulincalculatorsettingFoodJustaddedBtn() {
		return NFKInsulincalculatorsettingFoodJustaddedBtn;
	}
	public QAFWebElement getNFKInsulincalculatorsettingFoodRecentBtn() {
		return NFKInsulincalculatorsettingFoodRecentBtn;
	}
	
	public void clickYourInsulin_Mentor() {
		QAFWebElement getTitle =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.welcome.title")
						.subSequence(0, 7));
		getTitle.waitForPresent();
		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("Your Insulin Mentor is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingStaticText(ConfigurationManager.getBundle()
					.getString("insulinCalc.firstUse.welcome.title")).click();
		} else {
			Reporter.logWithScreenShot("Your Insulin Mentor is displayed",
					MessageTypes.Fail);
		}
	}
	
	public void clickNFKQuick_Tutorial() {
		LFSUtilsAndroid.waitforLoad();
		QAFWebElement getTitle =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("help.YourInsulinMentor.OneTouch Reveal")
						.subSequence(0, 5));
		getTitle.waitForPresent();
		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("OneTouch Reveal® Quick-Use Tutorial is displayed",
					MessageTypes.Pass);
			getTitle.click();
		} else {
			Reporter.logWithScreenShot(
					"OneTouch Reveal® Quick-Use Tutorial is not displayed",
					MessageTypes.Fail);
		}

	}

	public void verifyInsulin_MentorScreen() {
		QAFWebElement getTitle =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("help.YourInsulinMentor.OneTouch Reveal")
						.subSequence(0, 7));
		QAFWebElement getTitle1 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("help.YourInsulinMentor.Using").subSequence(0, 7));
		QAFWebElement getTitle2 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("help.YourInsulinMentor.FAQ").subSequence(0, 7));
		QAFWebElement getTitle3 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("help.YourInsulinMentor.Terminology")
						.subSequence(0, 7));
		QAFWebElement getTitle4 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("help.YourInsulinMentor.IMS").subSequence(0, 7));

		if (getTitle.isPresent()) {
			Reporter.logWithScreenShot("OneTouch Reveal® Quick-Use Tutorial is displayed",
					MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot(
					"OneTouch Reveal® Quick-Use Tutorial is not displayed",
					MessageTypes.Fail);
		}
		if (getTitle1.isPresent()) {
			Reporter.logWithScreenShot("Using the Insulin Mentor is displayed",
					MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Using the Insulin Mentor is not displayed",
					MessageTypes.Fail);
		}
		if (getTitle2.isPresent()) {
			Reporter.logWithScreenShot("Frequently Asked Questions is displayed",
					MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Frequently Asked Questions is not displayed",
					MessageTypes.Fail);
		}
		if (getTitle3.isPresent()) {
			Reporter.logWithScreenShot("Insulin Mentor Terminology is displayed",
					MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Insulin Mentor Terminology is not displayed",
					MessageTypes.Fail);
		}
		if (getTitle4.isPresent()) {
			Reporter.logWithScreenShot("Insulin Mentor Settings is displayed",
					MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Insulin Mentor Settings is not displayed",
					MessageTypes.Fail);
		}

	}
	
	public void verifyLT_Details() {
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.quickUse.title"))
						.isPresent()) {
			Reporter.logWithScreenShot("Quick use tutorial page is displayed",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Quick use tutorial page is not displayed",
					MessageTypes.Fail);
		}
		getNFKInsulincalculatorsettingQuicktutotialLnk()
				.verifyPresent("Quick use tutorial link is displayed");
		QAFWebElement title =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.quickUse.title")
						.subSequence(0, 7));
		title.waitForPresent();
		if (title.isPresent()) {
			Reporter.logWithScreenShot("Quick use page is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title1 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.terminology.title")
						.substring(0, 7));
		if (title1.isPresent()) {
			getNFKInsulincalculatorsettingMoreTxt().click();
			Reporter.logWithScreenShot("Terminology page detail is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingNavbackBtn().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.legend.title"))
						.isPresent()) {
			getNFKInsulincalculatorsettingMoreTxt().click();
			Reporter.logWithScreenShot("Legend page detail is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingNavbackBtn().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title2 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.overview.title")
						.substring(0, 7));
		if (title2.isPresent()) {
			getNFKInsulincalculatorsettingMoreTxt().click();
			Reporter.logWithScreenShot("Tutorial page detail is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingNavbackBtn().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}

		QAFWebElement title3 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.finder.title")
						.substring(0, 7));
		if (title3.isPresent()) {
			getNFKInsulincalculatorsettingMoreTxt().click();
			Reporter.logWithScreenShot("Finder page detail is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingNavbackBtn().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title4 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.entryBasics.title")
						.substring(0, 7));
		if (title4.isPresent()) {
			getNFKInsulincalculatorsettingMoreTxt().click();
			Reporter.logWithScreenShot(
					"Insulin Mentor Entry Basics page detail is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingNavbackBtn().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title5 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.inAction.title")
						.substring(0, 7));
		if (title5.isPresent()) {
			getNFKInsulincalculatorsettingMoreTxt().click();
			Reporter.logWithScreenShot("Insulin Mentor Action page detail is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingNavbackBtn().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.tips.title"))
						.isPresent()) {
			getNFKInsulincalculatorsettingMoreTxt().click();
			Reporter.logWithScreenShot("Insider Tips page detail is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingNavbackBtn().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		QAFWebElement title6 =
				getNFKInsulincalculatorsettingStaticText((String) LFSUtilsAndroid
						.getPropString("insulinCalc.tutorial.inAction.title")
						.substring(0, 7));
		if (title6.isPresent()) {
			getNFKInsulincalculatorsettingMoreTxt().click();
			Reporter.logWithScreenShot("Insulin mentor setting page detail is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingNavbackBtn().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
		if (getNFKInsulincalculatorsettingStaticText(
				LFSUtilsAndroid.getPropString("insulinCalc.tutorial.toc.faq.title"))
						.isPresent()) {
			getNFKInsulincalculatorsettingMoreTxt().click();
			Reporter.logWithScreenShot(
					"Frequently asked question page detail is displayed",
					MessageTypes.Pass);
			getNFKInsulincalculatorsettingNavbackBtn().click();
			LFSUtilsAndroid.swipeWithScreenPercent(95, 80, 5, 80, 7);
			LFSUtilsAndroid.waitforLoad();
		}
	}

	public void verifyCarb_OnIC() {
		for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(EventLogPageAndroid.getCarbValue)) {
				Reporter.logWithScreenShot("Added carb is displayed", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Added carb is not displayed",
						MessageTypes.Pass);
			}
		}
	}
	
	public static String editedCarb;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.food.deselect.btn")
	private QAFWebElement NFKInsulincalculatorsettingFoodDeselectBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.food.splash.img")
	private QAFWebElement NFKInsulincalculatorsettingFoodSplashImg;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.food.splash.btn")
	private QAFWebElement NFKInsulincalculatorsettingFoodSplashBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.checkBg.popup.txt")
	private QAFWebElement NFKInsulincalculatorsettingCheckbgPopupTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.Insulinplus.btn")
	private QAFWebElement NFKInsulincalculatorsettingInsulinplusBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.carbwarning.txt")
	private QAFWebElement NFKInsulincalculatorsettingCarbwarningTxt;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.unitofmeasurement.lbl")
	private QAFWebElement NFKInsulincalculatorsettingUnitofmeasurementLbl;
	
	public void editCarbOnICScreen(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(EventLogPageAndroid.getCarbValue)) {
				Reporter.logWithScreenShot("Carb window before adding value",
						MessageTypes.Pass);
				getNFKInsulincalculatorsettingEventvalueTxt().get(i).clear();
				getNFKInsulincalculatorsettingEventvalueTxt().get(i)
						.sendKeys(eventBean.getAmount());
				EventLogPageAndroid.getCarbValue = eventBean.getAmount();
				Reporter.logWithScreenShot("Carb window after adding value",
						MessageTypes.Pass);
			}
		}
	}

	public void editBgOnICScreen(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(EventLogPageAndroid.getBGValue)) {
				Reporter.logWithScreenShot("Blood glucose window before adding value",
						MessageTypes.Pass);
				getNFKInsulincalculatorsettingEventvalueTxt().get(i).clear();
				getNFKInsulincalculatorsettingEventvalueTxt().get(i)
						.sendKeys(eventBean.getAmount());
				getBGValue = eventBean.getAmount();
				Reporter.logWithScreenShot("Blood glucose window after adding value",
						MessageTypes.Pass);
			}
		}
	}
	
	public void clicks_plus() {
		if (getNFKInsulincalculatorsettingPlusBtn().isPresent()) {
			Reporter.logWithScreenShot("plus icon is displayed", MessageTypes.Pass);
			getNFKInsulincalculatorsettingPlusBtn().click();
		}
	}
	
	public void verifyAddedItemsinJustAddedItems() {
		if ((getNFKInsulincalculatorsettingStaticText("Cheese Pizza").isDisplayed())
				&& (getNFKInsulincalculatorsettingStaticText("Cherry Fudge Cake")
						.isDisplayed())) {
			Reporter.logWithScreenShot("Just added items are present", MessageTypes.Pass);

		}
	}
	
	public void verifyBgPopUp() {
		if (getNFKInsulincalculatorsettingCheckbgPopupTxt().isDisplayed()) {
			Reporter.logWithScreenShot("Check Your Blood Sugar popup is displayed",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Check Your Blood Sugar popup is not displayed",
					MessageTypes.Fail);
		}
	}
	
	public void Verify_Deliver() {
		if (getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("insulinCalc.willDeliver"))
						.isPresent()) {
			Reporter.logWithScreenShot("I will deliver text is present",
					MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("I will deliver text is not present",
					MessageTypes.Pass);
		}
	}
	
	public void Verify_Delivered() {
		if (getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("insulinCalc.delivered.Text"))
						.isPresent()) {
			Reporter.logWithScreenShot("I delivered text is present", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("I delivered text is not present", MessageTypes.Pass);
		}
	}
	
	public void Verify_ReusedCarb() {
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		eventlog.getNFKeventlogBgInsulincalculatorLnk().click();
		for (int i = 0; i < getNFKInsulincalculatorsettingEventvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(
					getNFKInsulincalculatorsettingEventvalueTxt().get(i))
					&& getNFKInsulincalculatorsettingEventvalueTxt().get(i).getText()
							.contains(EventLogPageAndroid.getCarbValue)) {
				Reporter.logWithScreenShot("Added carb is displayed for Re-use", MessageTypes.Pass);
				break;
			}
		}
	}

	public QAFWebElement getNFKInsulincalculatorsettingFoodDeselectBtn() {
		return NFKInsulincalculatorsettingFoodDeselectBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingFoodSplashImg() {
		return NFKInsulincalculatorsettingFoodSplashImg;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingFoodSplashBtn() {
		return NFKInsulincalculatorsettingFoodSplashBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingCheckbgPopupTxt() {
		return NFKInsulincalculatorsettingCheckbgPopupTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingInsulinplusBtn() {
		return NFKInsulincalculatorsettingInsulinplusBtn;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingCarbwarningTxt() {
		return NFKInsulincalculatorsettingCarbwarningTxt;
	}
	
	public QAFWebElement getNFKInsulincalculatorsettingUnitofmeasurementLbl() {
		return NFKInsulincalculatorsettingUnitofmeasurementLbl;
	}
	

}
