package com.NFK.version1.android.pages;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.EventDetailBeans;
import com.NFK.version1.android.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

import io.appium.java_client.android.AndroidDriver;

public class SettingPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.settingspage.titl")
	private QAFWebElement NFKSettingspageTitl;
	@FindBy(locator="NFK.settingspage.CurrentReading.titl")
	private QAFWebElement NFKSettingspageCurrentReadingtitl;
	@FindBy(locator="NFK.settingspage.BubbleAnimations.txt")
	private QAFWebElement NFKSettingspageBubbleAnimationstxt;
	@FindBy(locator="NFK.settingspage.BubbleAnimations.toggle")
	private QAFWebElement NFKSettingspageBubbleAnimationstoggle;
	@FindBy(locator ="NFK.settingspage.gen_male")
	private QAFWebElement NFKSettingspageGen_male;
	@FindBy(locator = "NFK.settingspage.gen_female")
	private QAFWebElement NFKSettingspageGen_female;
	@FindBy(locator = "NFK.settingspage.gender.txt")
	private QAFWebElement NFKSettingspageGenderTxt;
	@FindBy(locator = "NFK.settingspage.range.txt")
	private QAFWebElement NFKSettingspageRangeTxt;
	@FindBy(locator = "NFK.settingspage.high.lbl")
	private QAFWebElement NFKSettingspageHighLbl;
	@FindBy(locator = "NFK.settingspage.low.lbl")
	private QAFWebElement NFKSettingspageLowLbl;
	@FindBy(locator = "NFK.settingspage.low.unit.lbl")
	private QAFWebElement NFKSettingspageLowUnitLbl;
	@FindBy(locator = "NFK.settingspage.high.unit.lbl")
	private QAFWebElement NFKSettingspageHighUnitLbl;
	@FindBy(locator = "NFK.settingspage.mealtg.btn")
	private QAFWebElement NFKSettingspageMealtgBtn;
	@FindBy(locator = "NFK.settingspage.premeal.logo")
	private QAFWebElement NFKSettingspagePremealLogo;
	@FindBy(locator = "NFK.settingspage.post.logo")
	private QAFWebElement NFKSettingspagePostLogo;
	@FindBy(locator = "NFK.settingspage.premeallow.range")
	private QAFWebElement NFKSettingspagePremeallowRange;
	@FindBy(locator = "NFK.settingspage.premealhigh.range")
	private QAFWebElement NFKSettingspagePremealhighRange;
	@FindBy(locator = "NFK.settingspage.postmeallow.range")
	private QAFWebElement NFKSettingspagePostmeallowRange;
	@FindBy(locator = "NFK.settingspage.preUnit")
	private QAFWebElement NFKSettingspagePreUnit;
	@FindBy(locator = "NFK.settingspage.postUnit")
	private QAFWebElement NFKSettingspagePostUnit;
	@FindBy(locator = "NFK.settingspage.postmealhigh.range")
	private QAFWebElement NFKSettingspagePostmealhighRange;
	@FindBy(locator = "NFK.settingspage.diabetiesMng.txt")
	private QAFWebElement NFKSettingspageDiabetiesMngTxt;
	@FindBy(locator = "NFK.settingspage.diatExer.chkbox")
	private QAFWebElement NFKSettingspageDiatExerChkbox;
	@FindBy(locator = "NFK.settingspage.oralMedication.chkbox")
	private QAFWebElement NFKSettingspageOralMedicationChkbox;
	@FindBy(locator = "NFK.settingspage.injMed.chkbox")
	private QAFWebElement NFKSettingspageInjMedChkbox;
	@FindBy(locator = "NFK.settingspage.longInsuline.chkbox")
	private QAFWebElement NFKSettingspageLongInsulineChkbox;
	@FindBy(locator = "NFK.settingspage.mixedInsuline.chkbox")
	private QAFWebElement NFKSettingspageMixedInsulineChkbox;
	@FindBy(locator = "NFK.settingspage.rapidInsuline.chkbox")
	private QAFWebElement NFKSettingspageRapidInsulineChkbox;
	@FindBy(locator = "NFK.settingspage.InsulinePump.chkbox")
	private QAFWebElement NFKSettingspageInsulinePumpChkbox;
	@FindBy(locator = "NFK.settingspage.diabetisQustn.ChkboxList")
	private List<QAFWebElement> NFKSettingspagediabetisQustnChkboxList;
	@FindBy(locator = "NFK.settingspage.bg.rengehigh.lbl")
	private QAFWebElement NFKSettingspageBgRengehighLbl;
	@FindBy(locator = "NFK.settingspage.bg.rengelow.lbl")
	private QAFWebElement NFKSettingspageBgRengelowLbl;
	@FindBy(locator = "NFK.settingspage.bg.rengeunit.lbl")
	private QAFWebElement NFKSettingspageBgRengeunitLbl;
	@FindBy(locator = "NFK.settingspage.bg.rengeok.btn")
	private QAFWebElement NFKSettingspageBgRengeokBtn;
	@FindBy(locator = "NFK.settingspage.bg.patternok.btn")
	private QAFWebElement NFKSettingspageBgPatternokBtn;
	@FindBy(locator = "NFK.settingspage.bg.renge.pkr")
	private QAFWebElement NFKSettingspageBgRengePkr;
	@FindBy(locator = "NFK.settingspage.bg.ok.btn")
	private QAFWebElement NFKSettingspageBgOkBTn;
	@FindBy(locator = "NFK.settingspage.gen_male")
	private QAFWebElement NFKSettingspageGenmale;
	@FindBy(locator = "NFK.settingspage.gen_female")
	private QAFWebElement NFKSettingspageGenfemale;
	@FindBy(locator = "NFK.settingspage.preUnit")
	private QAFWebElement NFKSettingspagePreunit;
	@FindBy(locator = "NFK.settingspage.postUnit")
	private QAFWebElement NFKSettingspagePostunit;
	@FindBy(locator = "NFK.settingspage.diatExer.chkbox")
	private QAFWebElement NFKSettingspageDiatexerChkbox;
	@FindBy(locator = "NFK.settingspage.oralMedication.chkbox")
	private QAFWebElement NFKSettingspageOralmedicationChkbox;
	@FindBy(locator = "NFK.settingspage.brkfst.lbl")
	private QAFWebElement NFKSettingspageBrkfstLbl;
	@FindBy(locator = "NFK.settingspage.brkfst.begintime.btn")
	private QAFWebElement NFKSettingspageBrkfstBegintimeBtn;
	@FindBy(locator = "NFK.settingspage.brkfst.endtime.btn")
	private QAFWebElement NFKSettingspageBrkfstEndtimeBtn;
	@FindBy(locator = "NFK.settingspage.brkfsttime.frstvalue.pkr")
	private QAFWebElement NFKSettingspageBrkfsttimeFrstvaluePkr;
	@FindBy(locator = "NFK.settingspage.brkfsttime.scndvalue.pkr")
	private QAFWebElement NFKSettingspageBrkfsttimeScndvaluePkr;
	@FindBy(locator = "NFK.settingspage.brkfsttime.thrdvalue.pkr")
	private QAFWebElement NFKSettingspageBrkfsttimeThrdvaluePkr;
	@FindBy(locator = "NFK.settingspage.overnight.begintime.btn")
	private QAFWebElement NFKSettingspageOvernightBegintimeBtn;
	@FindBy(locator = "NFK.settingspage.overnight.endtime.btn")
	private QAFWebElement NFKSettingspageOvernightEndtimeBtn;
	@FindBy(locator = "NFK.settingspage.lunch.begintime.btn")
	private QAFWebElement NFKSettingspageLunchBegintimeBtn;
	@FindBy(locator = "NFK.settingspage.lunch.endtime.btn")
	private QAFWebElement NFKSettingspageLunchEndtimeBtn;
	@FindBy(locator = "NFK.settingspage.dinner.begintime.btn")
	private QAFWebElement NFKSettingspageDinnerBegintimeBtn;
	@FindBy(locator = "NFK.settingspage.dinner.endtime.btn")
	private QAFWebElement NFKSettingspageDinnerEndtimeBtn;
	@FindBy(locator = "NFK.settingspage.bedtime.begintime.btn=")
	private QAFWebElement NFKSettingspageBedtimeBegintimeBtn;
	@FindBy(locator = "NFK.settingspage.bedtime.endtime.btn")
	private QAFWebElement NFKSettingspageBedtimeEndtimeBtn;
	@FindBy(locator = "NFK.settingspage.insulin.toggle.btn")
	private QAFWebElement NFKSettingspageInsulinToggleBtn;
	@FindBy(locator = "NFK.settingspage.bg.beforeaftermeal.reading.lbl")
	private QAFWebElement NFKSettingspageBgBeforeaftermealReadingLbl;
	@FindBy(locator = "NFK.settingspage.diabetictype1.radio.btn")
	private QAFWebElement NFKSettingspageDiabetictype1RadioBtn;
	@FindBy(locator = "NFK.settingspage.diabetictype2.radio.btn")
	private QAFWebElement NFKSettingspageDiabetictype2RadioBtn;
	@FindBy(locator = "NFK.settingspage.diabetictypegestational.radio.btn")
	private QAFWebElement NFKSettingspageDiabetictypegestationalRadioBtn;
	@FindBy(locator = "NFK.settingspage.diabetictype.popup.cancel.btn")
	private QAFWebElement NFKSettingspageDiabetictypePopupCancelBtn;
	@FindBy(locator = "NFK.settingspage.diabetictype.popup.ok.btn")
	private QAFWebElement NFKSettingspageDiabetictypePopupOkBtn;
	@FindBy(locator = "NFK.settingspage.diabetictype.popup..title.txt")
	private QAFWebElement NFKSettingspageDiabetictypePopupTitleTxt;
	@FindBy(locator = "NFK.settingspage.systemsetting.invalidbgerror.txt")
	private QAFWebElement NFKSettingspageSystemsettingInvalidbgerrorTxt;
	@FindBy(locator = "NFK.settingspage.systemsetting.invalistepserror.txt")
	private QAFWebElement NFKSettingspageSystemsettingInvalistepserrorTxt;
	@FindBy(locator = "NFK.settingspage.systemsetting.invalidcarbserror.txt")
	private QAFWebElement NFKSettingspageSystemsettingInvalidcarbserrorTxt;
	@FindBy(locator = "NFK.settingspage.systemsetting.invalidactivityerror.txt")
	private QAFWebElement NFKSettingspageSystemsettingInvalidactivityerrorTxt;
	@FindBy(locator = "NFK.settingspage.systemsetting.activity.daily.btn")
	private QAFWebElement NFKSettingspageSystemsettingActivityDailyBtn;
	@FindBy(locator = "NFK.settingspage.systemsetting.activity.weekly.btn")
	private QAFWebElement NFKSettingspageSystemsettingActivityWeeklyBtn;
	@FindBy(locator = "NFK.settingspage.bg.default.compare")
	private QAFWebElement NFKSettingspageBgdeafaultcompare;
	@FindBy(locator="NFK.settingspage.Event.title")
	private QAFWebElement NFKSettingspageEventTitle;
	@FindBy(locator="NFK.settingspage.Log.insulin.text")
	private QAFWebElement NFKSettingspageLogInsulinText;
	@FindBy(locator="NFK.settingspage.Overlay.timeline.text")
	private QAFWebElement NFKSettingspageOverlayTimelineText;
	@FindBy(locator="NFK.settingspage.Loginsulin.toggle.btn")
	private QAFWebElement NFKSettingspageLoginsulinToggleBtn;
	@FindBy(locator="NFK.settingspage.Overlaytimeline.toggle.btn")
	private QAFWebElement NFKSettingspageOverlaytimelineToggleBtn;
	@FindBy(locator="NFK.settingspage.back.btn")
	private QAFWebElement NFKSettingspageBackBtn;
	
	@FindBy(locator = "NFK.settingspage.static.Usersettings.Btn")
	private QAFWebElement NFKSettingspageUsersettingsBtn;
	
	@FindBy(locator = "NFK.settingspage.usersettings.rapidacting.no.Btn")
	private QAFWebElement NFKSettingspageUsersettingsRapidactingNoBtn;
	@FindBy(locator = "NFK.settingspage.usersettings.rapidacting.yes.Btn")
	private QAFWebElement NFKSettingspageUsersettingsRapidactingYesBtn;
	@FindBy(locator = "NFK.moremenu.settingspage.select.range")
	private QAFWebElement NFKMoreMenuSettingspageSelectRange;
	@FindBy(locator = "NFK.settingspage.bg.range.forward.arrow")
	private QAFWebElement NFKSettingspageBgrangeforwardarrow;
	@FindBy(locator = "NFK.settingspage.Cancel.Btn")
	private QAFWebElement NFKSettingspageCancelBtn;

	//system settings
	@FindBy(locator="NFK.settingspage.system.setting.tab")
	private QAFWebElement NFKSettingspageSystemSettingTab;
	@FindBy(locator="NFK.settingspage.system.account.lbl")
	private List<QAFWebElement> NFKSettingspageSystemAccountLbl;
	@FindBy(locator="NFK.settingspage.system.text.lbl")
	private List<QAFWebElement> NFKSettingspageSystemTextLbl;
	@FindBy(locator="NFK.settingspage.system.switch.btn")
	private List<QAFWebElement> NFKSettingspageSystemSwitchBtn;
	@FindBy(locator="NFK.settingspage.system.one.hr.btn")
	private QAFWebElement NFKSettingspageSystemOneHrBtn;
	@FindBy(locator="NFK.settingspage.system.four.hr.btn")
	private QAFWebElement NFKSettingspageSystemFourHrBtn;
	@FindBy(locator="NFK.settingspage.system.eight.hr.btn")
	private QAFWebElement NFKSettingspageSystemEightHrBtn;
	@FindBy(locator="NFK.settingspage.system.twelve.hr.btn")
	private QAFWebElement NFKSettingspageSystemTwelveHrBtn;
	@FindBy(locator="NFK.settingspage.system.twentyfour.hr.btn")
	private QAFWebElement NFKSettingspageSystemTwentyfourHrBtn;
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
     //system settings
	public QAFWebElement getNFKSettingspageSystemSettingTab(){
		return NFKSettingspageSystemSettingTab;
	}	
     public List<QAFWebElement> getNFKSettingspageSystemAccountLbl(){
		return NFKSettingspageSystemAccountLbl;
	}
     public List<QAFWebElement> getNFKSettingspageSystemTextLbl(){
	return NFKSettingspageSystemTextLbl;
}
       public List<QAFWebElement> getNFKSettingspageSystemSwitchBtn(){
	return NFKSettingspageSystemSwitchBtn;
}
      public QAFWebElement getNFKSettingspageSystemOneHrBtn(){
	return NFKSettingspageSystemOneHrBtn;
}
    public QAFWebElement getNFKSettingspageSystemFourHrBtn(){
	return NFKSettingspageSystemFourHrBtn;
}
    public QAFWebElement getNFKSettingspageSystemEightHrBtn(){
	return NFKSettingspageSystemEightHrBtn;
}
    public QAFWebElement getNFKSettingspageSystemTwelveHrBtn(){
	return NFKSettingspageSystemTwelveHrBtn;
}
    public QAFWebElement getNFKSettingspageSystemTwentyfourHrBtn() {
    	return NFKSettingspageSystemTwentyfourHrBtn;
    }
	public QAFWebElement getNFKSettingspageEventTitle() {
		return NFKSettingspageEventTitle;
	}
	public QAFWebElement getNFKSettingspageLogInsulinText() {
		return NFKSettingspageLogInsulinText;
	}
	public QAFWebElement getNFKSettingspageOverlayTimelineText() {
		return NFKSettingspageOverlayTimelineText;
	}
	public QAFWebElement getNFKSettingspageUsersettingsRapidactingNoBtn() {
		return NFKSettingspageUsersettingsRapidactingNoBtn;
	}
	public QAFWebElement getNFKSettingspageLoginsulinToggleBtn() {
		return NFKSettingspageLoginsulinToggleBtn;
	}
	public QAFWebElement getNFKSettingspageOverlaytimelineToggleBtn() {
		return NFKSettingspageOverlaytimelineToggleBtn;
	}
	public QAFWebElement getNFKSettingspageDiabetictype1RadioBtn() {
		return NFKSettingspageDiabetictype1RadioBtn;
	}

	public QAFWebElement getNFKSettingspageDiabetictype2RadioBtn() {
		return NFKSettingspageDiabetictype2RadioBtn;
	}

	public QAFWebElement getNFKSettingspageDiabetictypegestationalRadioBtn() {
		return NFKSettingspageDiabetictypegestationalRadioBtn;
	}

	public QAFWebElement getNFKSettingspageDiabetictypePopupCancelBtn() {
		return NFKSettingspageDiabetictypePopupCancelBtn;
	}

	public QAFWebElement getNFKSettingspageDiabetictypePopupOkBtn() {
		return NFKSettingspageDiabetictypePopupOkBtn;
	}

	public QAFWebElement getNFKSettingspageDiabetictypePopupTitleTxt() {
		return NFKSettingspageDiabetictypePopupTitleTxt;
	}

	public QAFWebElement getNFKSettingspageBgBeforeaftermealReadingLbl() {
		return NFKSettingspageBgBeforeaftermealReadingLbl;
	}

	public QAFWebElement getNFKSettingspageBgOkBTn() {
		return NFKSettingspageBgOkBTn;
	}

	public QAFWebElement getNFKSettingspageBgRengehighLbl() {
		return NFKSettingspageBgRengehighLbl;
	}

	public QAFWebElement getNFKSettingspageBgRengelowLbl() {
		return NFKSettingspageBgRengelowLbl;
	}

	public QAFWebElement getNFKSettingspageBgRengeunitLbl() {
		return NFKSettingspageBgRengeunitLbl;
	}

	public QAFWebElement getNFKSettingspageBgRengeokBtn() {
		return NFKSettingspageBgRengeokBtn;
	}

	public QAFWebElement getNFKSettingspageBgPatternokBtn() {
		return NFKSettingspageBgPatternokBtn;
	}

	public QAFWebElement getNFKSettingspageBgRengePkr() {
		return NFKSettingspageBgRengePkr;
	}

	public QAFWebElement getNFKSettingspageTitl() {
		return NFKSettingspageTitl;
	}

	public QAFWebElement getNFKSettingspageGen_male() {
		return NFKSettingspageGen_male;
	}

	public QAFWebElement getNFKSettingspageGen_female() {
		return NFKSettingspageGen_female;
	}

	public QAFWebElement getNFKSettingspageGenderTxt() {
		return NFKSettingspageGenderTxt;
	}

	public QAFWebElement getNFKSettingspageRangeTxt() {
		return NFKSettingspageRangeTxt;
	}

	public QAFWebElement getNFKSettingspageHighLbl() {
		return NFKSettingspageHighLbl;
	}

	public QAFWebElement getNFKSettingspageLowLbl() {
		return NFKSettingspageLowLbl;
	}

	public QAFWebElement getNFKSettingspageLowUnitLbl() {
		return NFKSettingspageLowUnitLbl;
	}

	public QAFWebElement getNFKSettingspageHighUnitLbl() {
		return NFKSettingspageHighUnitLbl;
	}

	public QAFWebElement getNFKSettingspageMealtgBtn() {
		return NFKSettingspageMealtgBtn;
	}

	public QAFWebElement getNFKSettingspagePremealLogo() {
		return NFKSettingspagePremealLogo;
	}

	public QAFWebElement getNFKSettingspagePostLogo() {
		return NFKSettingspagePostLogo;
	}

	public QAFWebElement getNFKSettingspagePremeallowRange() {
		return NFKSettingspagePremeallowRange;
	}

	public QAFWebElement getNFKSettingspagePremealhighRange() {
		return NFKSettingspagePremealhighRange;
	}

	public QAFWebElement getNFKSettingspagePostmeallowRange() {
		return NFKSettingspagePostmeallowRange;
	}

	public QAFWebElement getNFKSettingspagePreUnit() {
		return NFKSettingspagePreUnit;
	}
     
	public QAFWebElement getNFKSettingspageDiabetesQuestionchkbox(String text) {
		return LFSUtilsAndroid.getElement("NFK.settingspage.diabetiesquestion.chk.btn", text);
	}
	public QAFWebElement getNFKSettingspagePostUnit() {
		return NFKSettingspagePostUnit;
	}

	public QAFWebElement getNFKSettingspagePostmealhighRange() {
		return NFKSettingspagePostmealhighRange;
	}

	public QAFWebElement getNFKSettingspageDiabetiesMngTxt() {
		return NFKSettingspageDiabetiesMngTxt;
	}

	public QAFWebElement getNFKSettingspageDiatExerChkbox() {
		return NFKSettingspageDiatExerChkbox;
	}

	public QAFWebElement getNFKSettingspageOralMedicationChkbox() {
		return NFKSettingspageOralMedicationChkbox;
	}

	public QAFWebElement getNFKSettingspageInjMedChkbox() {
		return NFKSettingspageInjMedChkbox;
	}

	public QAFWebElement getNFKSettingspageLongInsulineChkbox() {
		return NFKSettingspageLongInsulineChkbox;
	}

	public QAFWebElement getNFKSettingspageMixedInsulineChkbox() {
		return NFKSettingspageMixedInsulineChkbox;
	}

	public QAFWebElement getNFKSettingspageRapidInsulineChkbox() {
		return NFKSettingspageRapidInsulineChkbox;
	}

	public QAFWebElement getNFKSettingspageInsulinePumpChkbox() {
		return NFKSettingspageInsulinePumpChkbox;
	}

	public List<QAFWebElement> getNFKSettingspagediabetisQustnChkboxList() {
		return NFKSettingspagediabetisQustnChkboxList;
	}

	public QAFWebElement getNFKSettingspagePreunit() {
		return NFKSettingspagePreunit;
	}

	public QAFWebElement getNFKSettingspagePostunit() {
		return NFKSettingspagePostunit;
	}

	public QAFWebElement getNFKSettingspageDiatexerChkbox() {
		return NFKSettingspageDiatexerChkbox;
	}

	public QAFWebElement getNFKSettingspageOralmedicationChkbox() {
		return NFKSettingspageOralmedicationChkbox;
	}

	public QAFWebElement getNFKSettingspageBrkfstLbl() {
		return NFKSettingspageBrkfstLbl;
	}

	public QAFWebElement getNFKSettingspageBrkfstBegintimeBtn() {
		return NFKSettingspageBrkfstBegintimeBtn;
	}

	public QAFWebElement getNFKSettingspageBrkfstEndtimeBtn() {
		return NFKSettingspageBrkfstEndtimeBtn;
	}

	public QAFWebElement getNFKSettingspageBrkfsttimeFrstvaluePkr() {
		return NFKSettingspageBrkfsttimeFrstvaluePkr;
	}

	public QAFWebElement getNFKSettingspageBrkfsttimeScndvaluePkr() {
		return NFKSettingspageBrkfsttimeScndvaluePkr;
	}

	public QAFWebElement getNFKSettingspageBrkfsttimeThrdvaluePkr() {
		return NFKSettingspageBrkfsttimeThrdvaluePkr;
	}

	public QAFWebElement getNFKSettingspageStaticTextTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.settingspage.statictext.txt", text);
	}

	public QAFWebElement getNFKSettingspageOvernightBegintimeBtn() {
		return NFKSettingspageOvernightBegintimeBtn;
	}

	public QAFWebElement getNFKSettingspageOvernightEndtimeBtn() {
		return NFKSettingspageOvernightEndtimeBtn;
	}

	public QAFWebElement getNFKSettingspageLunchBegintimeBtn() {
		return NFKSettingspageLunchBegintimeBtn;
	}

	public QAFWebElement getNFKSettingspageLunchEndtimeBtn() {
		return NFKSettingspageLunchEndtimeBtn;
	}

	public QAFWebElement getNFKSettingspageDinnerBegintimeBtn() {
		return NFKSettingspageDinnerBegintimeBtn;
	}

	public QAFWebElement getNFKSettingspageDinnerEndtimeBtn() {
		return NFKSettingspageDinnerEndtimeBtn;
	}

	public QAFWebElement getNFKSettingspageBedtimeEndtimeBtn() {
		return NFKSettingspageBedtimeEndtimeBtn;
	}

	public QAFWebElement getNFKSettingspageBedtimeBegintimeBtn() {
		return NFKSettingspageBedtimeBegintimeBtn;
	}

	public QAFWebElement getNFKSettingspageSystemsettingAwardtrackerLbl() {
		return NFKSettingspageSystemsettingAwardtrackerLbl;
	}

	public QAFWebElement getNFKSettingspageSystemsettingAwardtrackerTxt() {
		return NFKSettingspageSystemsettingAwardtrackerTxt;
	}

	public QAFWebElement getNFKSettingspageSystemsettingAwardtrackerAppBtn() {
		return NFKSettingspageSystemsettingAwardtrackerAppBtn;
	}

	public QAFWebElement getNFKSettingspageSystemsettingAwardtrackerMeterBtn() {
		return NFKSettingspageSystemsettingAwardtrackerMeterBtn;
	}

	public QAFWebElement getNFKSettingspageSystemsettingAwardtrackerBothBtn() {
		return NFKSettingspageSystemsettingAwardtrackerBothBtn;
	}

	public QAFWebElement getNFKSettingspageSystemsettingAwardtrackerOffBtn() {
		return NFKSettingspageSystemsettingAwardtrackerOffBtn;
	}

	public QAFWebElement getNFKSettingspageSystemsettingAwardtrackerSeeawardsLnk() {
		return NFKSettingspageSystemsettingAwardtrackerSeeawardsLnk;
	}

	public QAFWebElement getNFKSettingspageAwardtrackerSeeawardsGoogleLbl() {
		return NFKSettingspageAwardtrackerSeeawardsGoogleLbl;
	}

	public QAFWebElement getNFKSettingspageSystemsettingMentortipLbl() {
		return NFKSettingspageSystemsettingMentortipLbl;
	}

	public QAFWebElement getNFKSettingspageSystemsettingMentortipTxt() {
		return NFKSettingspageSystemsettingMentortipTxt;
	}

	public QAFWebElement getNFKSettingspageSystemsettingMentortipAppBtn() {
		return NFKSettingspageSystemsettingMentortipAppBtn;
	}

	public QAFWebElement getNFKSettingspageSystemsettingMentortipMeterBtn() {
		return NFKSettingspageSystemsettingMentortipMeterBtn;
	}

	public QAFWebElement getNFKSettingspageSystemsettingMentortipBothBtn() {
		return NFKSettingspageSystemsettingMentortipBothBtn;
	}

	public QAFWebElement getNFKSettingspageSystemsettingMentortipOffBtn() {
		return NFKSettingspageSystemsettingMentortipOffBtn;
	}

	public QAFWebElement getNFKSettingspageSystemsettingInvalidbgerrorTxt() {
		return NFKSettingspageSystemsettingInvalidbgerrorTxt;
	}

	public QAFWebElement getNFKSettingspageSystemsettingInvalistepserrorTxt() {
		return NFKSettingspageSystemsettingInvalistepserrorTxt;
	}

	public QAFWebElement getNFKSettingspageSystemsettingInvalidcarbserrorTxt() {
		return NFKSettingspageSystemsettingInvalidcarbserrorTxt;
	}

	public QAFWebElement getNFKSettingspageSystemsettingInvalidactivityerrorTxt() {
		return NFKSettingspageSystemsettingInvalidactivityerrorTxt;
	}

	public QAFWebElement getNFKSettingspageSystemsettingActivityDailyBtn() {
		return NFKSettingspageSystemsettingActivityDailyBtn;
	}

	public QAFWebElement getNFKSettingspageSystemsettingActivityWeeklyBtn() {
		return NFKSettingspageSystemsettingActivityWeeklyBtn;
	}

	public QAFWebElement getNFKSettingspageBgdeafaultcompare() {
		return NFKSettingspageBgdeafaultcompare;
	}

	public QAFWebElement getNFKSettingspageUsersettingsBtn() {
		return NFKSettingspageUsersettingsBtn;
	}
	
	public QAFWebElement getNFKiosSettingpageUsersettingsBtn(String Text) {
		return LFSUtilsAndroid.getElement("otr.moremenu.myreminderspage.staticText.btn",
				Text);
	}
	
	
	public QAFWebElement getNFKMoreMenuSettingspageSelectRange() {
		return NFKMoreMenuSettingspageSelectRange;
	}

	public QAFWebElement getNFKSettingspageBgrangeforwardarrow() {
		return NFKSettingspageBgrangeforwardarrow;
	}

	public QAFWebElement getNFKSettingspageCancelBtn() {
		return NFKSettingspageCancelBtn;
	}
	
	public QAFWebElement getNFKSettingspageBubbleAnimationstoggle() {
		return NFKSettingspageBubbleAnimationstoggle;
	}
	
	public QAFWebElement  getNFKSettingspageCurrentReadingTitle() {
		return NFKSettingspageCurrentReadingtitl;
	}
	
	public QAFWebElement getNFKSettingspageBubbleAnimationsTitle() {
		return NFKSettingspageBubbleAnimationstxt;
}

	@FindBy(locator = "NFK.settingspage.diabetisQustn.Chkbox")
	private QAFWebElement NFKSettingspagediabetisQustnChkbox;
	@FindBy(locator = "NFK.settingspage.injMed.chkbox")
	private QAFWebElement NFKSettingspageInjmedChkbox;
	@FindBy(locator = "NFK.settingspage.longInsuline.chkbox")
	private QAFWebElement NFKSettingspageLonginsulineChkbox;
	@FindBy(locator = "NFK.settingspage.mixedInsuline.chkbox")
	private QAFWebElement NFKSettingspageMixedinsulineChkbox;
	@FindBy(locator = "NFK.settingspage.rapidInsuline.chkbox")
	private QAFWebElement NFKSettingspageRapidinsulineChkbox;
	@FindBy(locator = "NFK.settingspage.InsulinePump.chkbox")
	private QAFWebElement NFKSettingspageInsulinepumpChkbox;
	@FindBy(locator = "NFK.settingspage.diabetisQustn.ChkboxList")
	private QAFWebElement NFKSettingspageDiabetisqustnChkboxlist;
	@FindBy(locator = "NFK.settingspage.bg.ok.btn")
	private QAFWebElement NFKSettingspageBgOkBtn;
	@FindBy(locator = "NFK.settingspage.statictext.txt")
	private QAFWebElement NFKSettingspageStatictextTxt;
	@FindBy(locator = "NFK.settingspage.appsetting.tab")
	private QAFWebElement NFKSettingspageAppsettingTab;
	@FindBy(locator = "NFK.settingspage.usersetting.tab")
	private QAFWebElement NFKSettingspageUsersettingTab;
	@FindBy(locator = "NFK.settingspage.systemsetting.awardtracker.lbl")
	private QAFWebElement NFKSettingspageSystemsettingAwardtrackerLbl;
	@FindBy(locator = "NFK.settingspage.systemsetting.awardtracker.txt")
	private QAFWebElement NFKSettingspageSystemsettingAwardtrackerTxt;
	@FindBy(locator = "NFK.settingspage.systemsetting.awardtracker.app.btn")
	private QAFWebElement NFKSettingspageSystemsettingAwardtrackerAppBtn;
	@FindBy(locator = "NFK.settingspage.systemsetting.awardtracker.meter.btn")
	private QAFWebElement NFKSettingspageSystemsettingAwardtrackerMeterBtn;
	@FindBy(locator = "NFK.settingspage.systemsetting.awardtracker.both.btn")
	private QAFWebElement NFKSettingspageSystemsettingAwardtrackerBothBtn;
	@FindBy(locator = "NFK.settingspage.systemsetting.awardtracker.off.btn")
	private QAFWebElement NFKSettingspageSystemsettingAwardtrackerOffBtn;
	@FindBy(locator = "NFK.settingspage.systemsetting.awardtracker.seeawards.lnk")
	private QAFWebElement NFKSettingspageSystemsettingAwardtrackerSeeawardsLnk;
	@FindBy(locator = "NFK.settingspage.awardtracker.seeawards.google.lbl")
	private QAFWebElement NFKSettingspageAwardtrackerSeeawardsGoogleLbl;
	@FindBy(locator = "NFK.settingspage.systemsetting.MentorTip.lbl")
	private QAFWebElement NFKSettingspageSystemsettingMentortipLbl;
	@FindBy(locator = "NFK.settingspage.systemsetting.MentorTip.txt")
	private QAFWebElement NFKSettingspageSystemsettingMentortipTxt;
	@FindBy(locator = "NFK.settingspage.systemsetting.MentorTip.app.btn")
	private QAFWebElement NFKSettingspageSystemsettingMentortipAppBtn;
	@FindBy(locator = "NFK.settingspage.systemsetting.MentorTip.meter.btn")
	private QAFWebElement NFKSettingspageSystemsettingMentortipMeterBtn;
	@FindBy(locator = "NFK.settingspage.systemsetting.MentorTip.both.btn")
	private QAFWebElement NFKSettingspageSystemsettingMentortipBothBtn;
	@FindBy(locator = "NFK.settingspage.systemsetting.MentorTip.off.btn")
	private QAFWebElement NFKSettingspageSystemsettingMentortipOffBtn;


	public QAFWebElement getNFKSettingspagediabetisQustnChkbox() {
		return NFKSettingspagediabetisQustnChkbox;
	}

	public QAFWebElement getNFKSettingspageBackBtn() {
		return NFKSettingspageBackBtn;
	}

	// Method to verify settting page
	public void verifySettingsUI() {
		getNFKSettingspageTitl().waitForPresent(3000);
		getNFKSettingspageTitl().verifyPresent("Settings Screen");
		
	}

	public void clickOnUserSetting()
	{	
		getNFKSettingspageUsersettingsBtn().isPresent();
		LFSUtilsAndroid.waitforLoad();
		getNFKSettingspageUsersettingsBtn().click(); 	
		Reporter.logWithScreenShot("Clicked on User setting");
	}	
	
	public void verifyUserSetting()
	{	
	getNFKSettingspageUsersettingsBtn().isPresent();
		if(getNFKSettingspageBgdeafaultcompare().isPresent() && getNFKSettingspageTitl().isPresent())
			 Reporter.logWithScreenShot("Verified User Setting screen", MessageTypes.Pass);
			else
			 Reporter.logWithScreenShot("User setting screen is not displayed", MessageTypes.Fail);
		
	}
	
	
	
	public void clickOnMaleButton() {
		scrollToElementSettingScreen(getNFKSettingspageGen_male());
		getNFKSettingspageGen_male().click();
		Reporter.logWithScreenShot("Male button click", MessageTypes.Pass);

	}

	public void verifySelectedMaleButton() {
		if (getNFKSettingspageGen_male().getAttribute("checked").equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("Male button is selected", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Male button is not selected", MessageTypes.Fail);
		}
	}

	public void clickOnFemaleButton() {
		if (getNFKSettingspageGen_female().isPresent()) {
			getNFKSettingspageGen_female().click();
			Reporter.logWithScreenShot("Female button click", MessageTypes.Pass);
		}
	}

	public void verifySelectedFemaleButton() {
		if (getNFKSettingspageGen_female().getAttribute("checked").equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("Female button is selected", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Female button is not selected", MessageTypes.Fail);
		}
	}

	public void verifySelectedCheckboxes() {
//		LFSUtilsAndroid
//				.scrollToEleAndriod(ConfigurationManager.getBundle().getString("more.aboutme.diabetesManagement.pump"));
		LFSUtilsAndroid.swipeWithScreenPercent(40, 70, 40, 30, 200);
		LFSUtilsAndroid.waitforLoad();
		
		diabetesChekBoxState(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
				.getPropString("more.aboutme.diabetesManagement.dietExercise")));
		
//		for (int i = 0; i < getNFKSettingspagediabetisQustnChkboxList().size(); i++) {
//			if (getNFKSettingspagediabetisQustnChkboxList().get(i).getAttribute("checked").equalsIgnoreCase("true")) {
//				Reporter.logWithScreenShot("All checkboxes are verified", MessageTypes.Pass);
//			}
//		}
		try {
		diabetesChekBoxState(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
				.getPropString("more.aboutme.diabetesManagement.dietExercise")));
		diabetesChekBoxState(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
				.getPropString("more.aboutme.diabetesManagement.oralMedication")));
		diabetesChekBoxState(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
				.getPropString("more.aboutme.diabetesManagement.injectOther")));
		LFSUtilsAndroid.swipeWithScreenPercent(40, 70, 40, 30, 200);
		diabetesChekBoxState(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
				.getPropString("more.aboutme.diabetesManagement.longActing")));
		diabetesChekBoxState(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
				.getPropString("more.aboutme.diabetesManagement.mixedInsulin")));
		diabetesChekBoxState(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
				.getPropString("more.aboutme.diabetesManagement.pump")));
		diabetesChekBoxState(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
				.getPropString("more.aboutme.diabetesManagement.rapidActing")));
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	
	
	public boolean diabetesChekBoxState(QAFWebElement element) {
		boolean flag = false;
		if (element.getAttribute("checked").contains("true")) {
			flag = true;

		}
		return flag;
	}
	public void selectCheckBox(QAFWebElement element) {
		if (element.isPresent()) {
			element.click();
		}
		else {
			Reporter.log("The user is not able to select the Checkboxes");
		}
	}

	public void checkAllCheckboxes() {
//		LFSUtilsAndroid
//					.scrollToEleAndriod(ConfigurationManager.getBundle().getString("more.aboutme.diabetesManagement.pump"));		
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 40, 200);	
		LFSUtilsAndroid.waitforLoad();
			try {
			selectCheckBox(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid 
					.getPropString("more.aboutme.diabetesManagement.dietExercise")));
			selectCheckBox(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
					.getPropString("more.aboutme.diabetesManagement.oralMedication")));
			selectCheckBox(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
					.getPropString("more.aboutme.diabetesManagement.injectOther")));
			selectCheckBox(getNFKSettingspageDiabetesQuestionchkbox(
					LFSUtilsAndroid.getPropString("more.aboutme.diabetesManagement.longActing")));
			LFSUtilsAndroid.swipeWithScreenPercent(40, 70, 40, 30, 200);
			selectCheckBox(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
					.getPropString("more.aboutme.diabetesManagement.mixedInsulin")));
			selectCheckBox(getNFKSettingspageDiabetesQuestionchkbox(
					LFSUtilsAndroid.getPropString("more.aboutme.diabetesManagement.pump")));
			selectCheckBox(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
					.getPropString("more.aboutme.diabetesManagement.rapidActing")));
			if (getNFKSettingspageUsersettingsRapidactingNoBtn().isDisplayed()) {
				Reporter.logWithScreenShot("Alert displayed", MessageTypes.Pass);
				getNFKSettingspageUsersettingsRapidactingNoBtn().click();
			}

			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
			/*for (QAFWebElement chkbox : getNFKSettingspagediabetisQustnChkboxList()) {
			
				System.out.println("List of checkboxes: " + getNFKSettingspagediabetisQustnChkboxList().size());
			
				if ((chkbox.isDisplayed() || chkbox.isEnabled())
						&& (chkbox.getAttribute("checked").equalsIgnoreCase("false"))) {
					chkbox.click();
					if (LFSUtilsAndroid.tryMethod(getNFKpageStaticTextTxt(
							ConfigurationManager.getBundle().getString("appCommon.yes")))) {
						Reporter.logWithScreenShot("Alert displayed", MessageTypes.Pass);
						getNFKpageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.yes"))
								.click();
						if ((chkbox.isDisplayed() || chkbox.isEnabled())
								&& (chkbox.getAttribute("checked").equalsIgnoreCase("false"))) {
							chkbox.click();
						}
	
						LFSUtilsAndroid.waitforLoad();
					}
	
				}
				LFSUtilsAndroid.waitforLoad();
				Reporter.logWithScreenShot("Checkbox Checked", MessageTypes.Pass);
			}
		}
*/
	public void verifyBubbleAnimations() {
		try {
			getNFKSettingspageCurrentReadingTitle().verifyPresent("Current Reading Title");
			getNFKSettingspageCurrentReadingTitle().waitForPresent(2000);
			getNFKSettingspageBubbleAnimationsTitle().verifyPresent("Bubble animations Ttile");
			
			getNFKSettingspageBubbleAnimationsTitle().waitForPresent(2000);
			if (getNFKSettingspageBubbleAnimationstoggle().isEnabled()) {
			getNFKSettingspageBubbleAnimationstoggle().click();
			Reporter.log("Bubble animations toggle button disabled", MessageTypes.Pass);
			}
			else {
				getNFKSettingspageBubbleAnimationstoggle().click();
				Reporter.log("Bubble animations toggle button enabled", MessageTypes.Pass);
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
}
	
	
	public void uncheckAllCheckboxes() { // updated by Sangram,Used reverse
		// iteration on list to solve
		// problem
         // LFSUtilsAndroid
           // .scrollToEleAndriod(ConfigurationManager.getBundle().getString("more.aboutme.diabetesManagement.dietExercise"*/));
		//LFSUtilsAndroid.swipeWithScreenPercent(40, 70, 40, 30, 200);   
		LFSUtilsAndroid.waitforLoad();
//for (int i=0; i< getNFKSettingspagediabetisQustnChkboxList().size() ; i++) {
//if (getNFKSettingspagediabetisQustnChkboxList().get(i).getAttribute("checked").equalsIgnoreCase("true")) {
//getNFKSettingspagediabetisQustnChkboxList().get(i).click();
//LFSUtilsAndroid.waitforLoad();
//}
//}
		  uncheckCheckBox(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
        		  .getPropString("more.aboutme.diabetesManagement.rapidActing")));
		  uncheckCheckBox(getNFKSettingspageDiabetesQuestionchkbox(
        		  LFSUtilsAndroid.getPropString("more.aboutme.diabetesManagement.pump")));
		   uncheckCheckBox(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
	        		  .getPropString("more.aboutme.diabetesManagement.mixedInsulin")));
		   uncheckCheckBox(getNFKSettingspageDiabetesQuestionchkbox(
	        		  LFSUtilsAndroid.getPropString("more.aboutme.diabetesManagement.longActing")));
		    LFSUtilsAndroid.swipeWithScreenPercent(40, 30, 40, 70, 200);
		    uncheckCheckBox(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
	        		  .getPropString("more.aboutme.diabetesManagement.injectOther")));
		    uncheckCheckBox(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
	        		  .getPropString("more.aboutme.diabetesManagement.oralMedication")));
		    
       uncheckCheckBox(getNFKSettingspageDiabetesQuestionchkbox(LFSUtilsAndroid
              .getPropString("more.aboutme.diabetesManagement.dietExercise")));
       
          
      
        
       
        
        

          Reporter.logWithScreenShot("Checkbox Unchecked", MessageTypes.Pass);

}
	
	public void uncheckCheckBox(QAFWebElement element) {
		if (element.getAttribute("checked").contains("true")) {
			element.click();
		}
	}
	public void checkMealTagging() {
		if (getNFKSettingspageMealtgBtn().getAttribute("text").toString().equalsIgnoreCase("OFF")) {
			Reporter.logWithScreenShot("Meal Tagging Button is Disable", MessageTypes.Pass);
		} else if (getNFKSettingspageMealtgBtn().getAttribute("text").toString().equalsIgnoreCase("ON"))
			Reporter.logWithScreenShot("Meal Tagging button is enabled", MessageTypes.Pass);

	}

	// Method to set bg
	public void setBGRange(String type, String amount) {
		getNFKSettingspageBgRengeokBtn().waitForVisible();
		type = type.toUpperCase();
		switch (type) {
		case "HIGH":
			getNFKSettingspageBgRengeokBtn().click();
			amount = LFSUtilsAndroid.mmolMGDL(Integer.parseInt(amount));
			getNFKSettingspageBgRengePkr().sendKeys(amount);
			break;
		case "LOW":
			amount = LFSUtilsAndroid.mmolMGDL(Integer.parseInt(amount));
			getNFKSettingspageBgRengePkr().sendKeys(amount);
			getNFKSettingspageBgRengeokBtn().click();
			break;

		}
		getNFKSettingspageBgRengeokBtn().click();
	}

	// Method to verify setting bg high same as low
	public void setHighBGValueToLow() {
		if (getNFKSettingspageMealtgBtn().getAttribute("text").equalsIgnoreCase("ON")) {
			getNFKSettingspageMealtgBtn().click();
		}
		getNFKSettingspageBgRengelowLbl().waitForEnabled();
		getNFKSettingspageBgRengelowLbl().click();
		getNFKSettingspageBgRengePkr().waitForPresent();
		String amount = LFSUtilsAndroid.mmolMGDL(90);
		LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(), amount);
		Reporter.logWithScreenShot("Set low value", MessageTypes.Pass);
		getNFKSettingspageBgRengeokBtn().click();
		LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(), amount);
		Reporter.logWithScreenShot("Set high value", MessageTypes.Pass);
		getNFKSettingspageBgRengeokBtn().click();
		getNFKSettingspageBgOkBTn().click();

	}

	// Method to verify setting bg low same as high
	public void setLowBGValueTOHigh() {

		if (getNFKSettingspageMealtgBtn().getAttribute("text").equalsIgnoreCase("ON")) {
			getNFKSettingspageMealtgBtn().click();
		}
		getNFKSettingspageBgRengelowLbl().waitForPresent();
		getNFKSettingspageBgRengelowLbl().click();
		getNFKSettingspageBgRengePkr().waitForPresent();
		;
		String amount = LFSUtilsAndroid.mmolMGDL(110);
		LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(), amount);
		Reporter.logWithScreenShot("Set low value", MessageTypes.Pass);
		getNFKSettingspageBgRengeokBtn().click();
		LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(), amount);
		Reporter.logWithScreenShot("Set high value", MessageTypes.Pass);
		getNFKSettingspageBgRengeokBtn().click();
		getNFKSettingspageBgOkBTn().click();

	}

	// Method to verify after editing bg range are not same
	/*
	 * public void VerifyBGValue() { Validator.verifyThat("Note charcter length",
	 * Integer.parseInt(getNFKSettingspageBgRengelowLbl().getText()),
	 * Matchers.lessThan(
	 * Integer.parseInt(getNFKSettingspageBgRengehighLbl().getText())));
	 * 
	 * }
	 */

	public void setBGBeforeAndAfter() {
		Reporter.logWithScreenShot("before updating BG", MessageTypes.Pass);
		if (getNFKSettingspageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("false")) {
			Reporter.logWithScreenShot("Meal Tagging Button is Disable", MessageTypes.Pass);
			getNFKSettingspageMealtgBtn().click();
			Reporter.logWithScreenShot("Meal tagging button is enabled", MessageTypes.Pass);
		}
		getNFKSettingspagePremealLogo().waitForPresent();
		getNFKSettingspagePremealLogo().click();
		String amountLow = LFSUtilsAndroid.mmolMGDL(64);
		LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(), amountLow);
		getNFKSettingspageBgRengeokBtn().click();
		String amountInrange = LFSUtilsAndroid.mmolMGDL(124);
		LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(), amountInrange);
		getNFKSettingspageBgRengeokBtn().click();
		LFSUtilsAndroid.waitforLoad();

		if (LFSUtilsAndroid.tryMethod(
				getNFKSettingspageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.ok")))) {
			getNFKSettingspageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		}

		String bgLowBM = getNFKSettingspagePremeallowRange().getText().toString();
		String bghighBM = getNFKSettingspagePremealhighRange().getText().toString();
		Validator.verifyThat("Before meal low", bgLowBM, Matchers.equalTo(amountLow));
		Validator.verifyThat("Before meal high", bghighBM, Matchers.equalTo(amountInrange));
		ConfigurationManager.getBundle().setProperty("BM.BG.Low", bgLowBM);
		ConfigurationManager.getBundle().setProperty("BM.BG.High", bghighBM);

		getNFKSettingspagePostLogo().waitForVisible();
		getNFKSettingspagePostLogo().click();
		String amountLow1 = LFSUtilsAndroid.mmolMGDL(65);
		String amountInrange1 = LFSUtilsAndroid.mmolMGDL(175);
		LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(), amountLow1);
		getNFKSettingspageBgRengeokBtn().click();
		LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(), amountInrange1);
		getNFKSettingspageBgRengeokBtn().click();
		LFSUtilsAndroid.waitforLoad();
		if (getNFKSettingspageBgOkBTn().isPresent())
			if (LFSUtilsAndroid.tryMethod(
					getNFKSettingspageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.ok")))) {
				Reporter.logWithScreenShot("Update BG Warning", MessageTypes.Pass);
				getNFKSettingspageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
			}
		String bgLowAM = getNFKSettingspagePostmeallowRange().getText().toString();
		String bghighAM = getNFKSettingspagePostmealhighRange().getText().toString();
		Validator.verifyThat("Before meal low", bgLowAM, Matchers.equalTo(amountLow1));
		Validator.verifyThat("Before meal high", bghighAM, Matchers.equalTo(amountInrange1));
		ConfigurationManager.getBundle().setProperty("AM.BG.Low", bgLowAM);
		ConfigurationManager.getBundle().setProperty("AM.BG.High", bghighAM);

	}

	public void getBGValues() {
		if (getNFKSettingspageMealtgBtn().getAttribute("text").toString().equalsIgnoreCase("OFF")) {
			Reporter.logWithScreenShot("Meal Tagging Button is Disable", MessageTypes.Pass);
			getNFKSettingspageMealtgBtn().click();
			Reporter.logWithScreenShot("Meal tagging button is enabled", MessageTypes.Pass);
		}

		String bgLowBM = getNFKSettingspagePremeallowRange().getText().toString();
		String bghighBM = getNFKSettingspagePremealhighRange().getText().toString();
		ConfigurationManager.getBundle().setProperty("BM.BG.Low", "bgLowBM");
		ConfigurationManager.getBundle().setProperty("BM.BG.High", "bghighBM");

		String bgLowAM = getNFKSettingspagePostmeallowRange().getText().toString();
		String bghighAM = getNFKSettingspagePostmealhighRange().getText().toString();
		ConfigurationManager.getBundle().setProperty("AM.BG.Low", "bgLowAM");
		ConfigurationManager.getBundle().setProperty("AM.BG.High", "bghighAM");
		Reporter.logWithScreenShot("BG range on settings page", MessageTypes.Pass);

	}

	// Method to change bg value when toggle button in settings page is disabled
	/*
	 * public void changeBgValue() { if
	 * (getNFKSettingspageMealtgBtn().getAttribute("checked").toString()
	 * .equalsIgnoreCase("true")) { getNFKSettingspageMealtgBtn().click();
	 * Reporter.logWithScreenShot("Meal Tagging Button is off", MessageTypes.Pass);
	 * } getNFKSettingspageBgRengehighLbl().click();; String amountLow =
	 * LFSUtilsAndroid.mmolMGDL(71);
	 * LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(),
	 * amountLow); getNFKSettingspageBgRengeokBtn().waitForPresent();
	 * getNFKSettingspageBgRengeokBtn().click(); String amountHigh =
	 * LFSUtilsAndroid.mmolMGDL(181);
	 * LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(),
	 * amountHigh); getNFKSettingspageBgRengeokBtn().waitForPresent();
	 * getNFKSettingspageBgRengeokBtn().click();
	 * 
	 * if (LFSUtilsAndroid.tryMethod(getNFKSettingspageStaticTextTxt("OK"))) {
	 * Reporter.logWithScreenShot("Update BG Warning", MessageTypes.Pass);
	 * getNFKSettingspageStaticTextTxt(
	 * ConfigurationManager.getBundle().getString("appCommon.ok")).click(); }
	 * Reporter.logWithScreenShot("Changed value", MessageTypes.Pass);
	 * 
	 * // Set BG Range to default value getNFKSettingspageBgRengehighLbl().click();
	 * String amountLow1 = LFSUtilsAndroid.mmolMGDL(70);
	 * LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(),
	 * amountLow1); getNFKSettingspageBgRengeokBtn().waitForPresent();
	 * getNFKSettingspageBgRengeokBtn().click(); String amountHigh1 =
	 * LFSUtilsAndroid.mmolMGDL(180);
	 * LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(),
	 * amountHigh1); getNFKSettingspageBgRengeokBtn().waitForPresent();
	 * getNFKSettingspageBgRengeokBtn().click();
	 * Reporter.logWithScreenShot("Value returned to default", MessageTypes.Pass); }
	 */

	public void clickBeginTime() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		Reporter.logWithScreenShot("Breakfast label is displayed", MessageTypes.Pass);

	}

	public void changeBeginTime() {
		// change time
		String beginTime = getNFKSettingspageBrkfstBegintimeBtn().getAttribute("text").toString();
		getNFKSettingspageBrkfstBegintimeBtn().click();
		getNFKSettingspageBrkfsttimeFrstvaluePkr().waitForPresent();
		getNFKSettingspageBrkfsttimeFrstvaluePkr().sendKeys("3");
		getNFKSettingspageBrkfsttimeScndvaluePkr().sendKeys("00");
		getNFKSettingspageBrkfsttimeThrdvaluePkr().sendKeys("AM");
		getNFKSettingspageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		if (getNFKSettingspageBrkfstBegintimeBtn().getAttribute("text").toString().equalsIgnoreCase(beginTime)) {
			Reporter.logWithScreenShot("Begin time is set as validated", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Begin time is not validated properly", MessageTypes.Pass);

		// change time back to default
		getNFKSettingspageBrkfstBegintimeBtn().waitForPresent();
		getNFKSettingspageBrkfstBegintimeBtn().click();
		getNFKSettingspageBrkfsttimeFrstvaluePkr().waitForPresent();
		getNFKSettingspageBrkfsttimeFrstvaluePkr().sendKeys("5");
		getNFKSettingspageBrkfsttimeScndvaluePkr().sendKeys("00");
		getNFKSettingspageBrkfsttimeThrdvaluePkr().sendKeys("AM");
		getNFKSettingspageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		getNFKSettingspageBrkfstBegintimeBtn().waitForPresent();
		Reporter.logWithScreenShot("default time", MessageTypes.Pass);
	}

	// Verify default ranges for Time of Day
	public void verifyDefaultRangeTOD() {
		getNFKSettingspageAppsettingTab().click();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		scrollToElementSettingScreen(getNFKSettingspageBedtimeEndtimeBtn());
		Validator.verifyThat("Overnight Begin time", (getNFKSettingspageOvernightBegintimeBtn().getText()),
				Matchers.equalTo("12:00 AM"));
		Validator.verifyThat("Overnight End time", (getNFKSettingspageOvernightEndtimeBtn().getText()),
				Matchers.equalTo("5:00 AM"));
		Validator.verifyThat("BreakFast Begin time", (getNFKSettingspageBrkfstBegintimeBtn().getText()),
				Matchers.equalTo("5:00 AM"));
		Validator.verifyThat("BreakFast End time", (getNFKSettingspageBrkfstEndtimeBtn().getText()),
				Matchers.equalTo("11:00 AM"));
		Validator.verifyThat("Lunch Begin time", (getNFKSettingspageLunchBegintimeBtn().getText()),
				Matchers.equalTo("11:00 AM"));
		Validator.verifyThat("Lunch End time", (getNFKSettingspageLunchEndtimeBtn().getText()),
				Matchers.equalTo("5:00 PM"));
		Validator.verifyThat("Dinner Start time", (getNFKSettingspageDinnerBegintimeBtn().getText()),
				Matchers.equalTo("5:00 PM"));
		Validator.verifyThat("Dinner End time", (getNFKSettingspageDinnerEndtimeBtn().getText()),
				Matchers.equalTo("9:00 PM"));
		Validator.verifyThat("Bedtime Start time", (getNFKSettingspageBedtimeBegintimeBtn().getText()),
				Matchers.equalTo("9:00 PM"));
		Validator.verifyThat("Bedtime End time", (getNFKSettingspageBedtimeEndtimeBtn().getText()),
				Matchers.equalTo("12:00 AM"));

	}

	public void checkMealTaggingandClick(String option) {
		option = option.toLowerCase();
		switch (option) {
		case "off":
			if (getNFKSettingspageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("true")) {
				Reporter.logWithScreenShot("Meal Tagging Button is on", MessageTypes.Pass);
				getNFKSettingspageMealtgBtn().click();
				Reporter.logWithScreenShot("Meal Tagging Button is off", MessageTypes.Pass);
			}
			break;
		case "on":
			if (getNFKSettingspageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("false")) {
				Reporter.logWithScreenShot("Meal Tagging Button is off", MessageTypes.Pass);
				getNFKSettingspageMealtgBtn().click();
				Reporter.logWithScreenShot("Meal Tagging Button is on", MessageTypes.Pass);
			}
		}
	}

	public void scrollToElementSettingScreen(QAFWebElement element) {
		if (LFSUtilsAndroid.tryDisplayMethod(getNFKSettingspageMealtgBtn())) {
			Point p1 = getNFKSettingspageMealtgBtn().getLocation();
			int count = 0;
			while (!LFSUtilsAndroid.tryMethod(element)) {
				LFSUtilsAndroid.swipeWithCoordinates(p1.getX() - 50, p1.getY() + 150, p1.getX() - 50, p1.getY() - 100,
						10);
				if (count == 50)
					break;

			}
		} else {
			int count = 0;
			while (!LFSUtilsAndroid.tryMethod(element)) {
				LFSUtilsAndroid.swipeWithCoordinates(476, 932, 443, 831, 10);
				if (count == 50)
					break;

			}

		}

	}

	public void clickInsuliSwitch() {
		scrollToElementSettingScreen(getNFKSettingspageInsulinToggleBtn());
		Reporter.logWithScreenShot("Insulin switch before clicking", MessageTypes.Pass);
		getNFKSettingspageInsulinToggleBtn().click();
		Reporter.logWithScreenShot("Insulin switch clicked", MessageTypes.Pass);
	}

	public QAFWebElement getNFKSettingspageInsulinToggleBtn() {
		return NFKSettingspageInsulinToggleBtn;
	}

	public void setLowHighOverallBG() {
		if (getNFKSettingspageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("true")) {
			getNFKSettingspageMealtgBtn().click();
		}
		getNFKSettingspageBgRengelowLbl().waitForPresent();
		getNFKSettingspageBgRengelowLbl().click();
		String low = ConfigurationManager.getBundle().getString("glucoseRangeValue.Low");
		String high = ConfigurationManager.getBundle().getString("glucoseRangeValue.High");
		Reporter.logWithScreenShot(low, MessageTypes.Pass);
		Reporter.logWithScreenShot(high, MessageTypes.Pass);
		setBG(low, high);

		ConfigurationManager.getBundle().setProperty("Low.BG.Range.Value", low);
		ConfigurationManager.getBundle().setProperty("High.BG.Range.Value", high);

	}

	public void setBG(String low, String High) {

		LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(), low);
		Reporter.logWithScreenShot("Set low value", MessageTypes.Pass);
		getNFKSettingspageBgRengeokBtn().click();
		LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(), High);
		Reporter.logWithScreenShot("Set high value", MessageTypes.Pass);
		getNFKSettingspageBgRengeokBtn().click();
		if (getNFKSettingspageBgOkBTn().isPresent())
			getNFKSettingspageBgOkBTn().click();
		Reporter.logWithScreenShot("Range set");
	}

	public void chsngeLowHighOverallBG() {
		if (getNFKSettingspageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("true")) {
			getNFKSettingspageMealtgBtn().click();
		}
		getNFKSettingspageBgRengelowLbl().waitForPresent();
		getNFKSettingspageBgRengelowLbl().click();
		String low = ConfigurationManager.getBundle().getString("glucoseRangeValue1.Low");
		String high = ConfigurationManager.getBundle().getString("glucoseRangeValue1.High");
		Reporter.logWithScreenShot(low, MessageTypes.Pass);
		Reporter.logWithScreenShot(high, MessageTypes.Pass);
		setBG(low, high);

	}

	public void chsngeLowHighOverallBGs(String low, String high) {
		if (getNFKSettingspageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("true")) {
			getNFKSettingspageMealtgBtn().click();
		}
		getNFKSettingspageBgRengelowLbl().waitForPresent();
		getNFKSettingspageBgRengelowLbl().click();

		setBG(low, high);

	}

	// Method to verify canada mmol unit
	public void verifyCandammol() {
		if (getNFKSettingspageMealtgBtn().getAttribute("text").toString().equalsIgnoreCase("OFF")) {
			getNFKSettingspageMealtgBtn().click();
		}

		if (getNFKSettingspageBgBeforeaftermealReadingLbl().getAttribute("text").contains("mmol/L")) {
			Reporter.logWithScreenShot("Unit of Measurement for Canada is displayed correctly", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Unit of Measurement for Canada is not displayed correctly", MessageTypes.Fail);

	}

	// SG Method to Navigate back from settings menus
	public void navigateBackFromSettings() {
		LFSUtilsAndroid.clickBackButton();
		Reporter.logWithScreenShot("navigated back", MessageTypes.Pass);

	}

	// method to verify selected gender and diabetes type on settings page
	// method to verify selected gender and diabetes type on settings page
		public void verifySelectedGenderAndDiabetesTypeOnSettingsPage() {
			System.out.println("Gender and type");
			try {
			
				String selectedGender = ConfigurationManager.getBundle().getString("singupScreen.selected.gender");
				String selectedDiabetesType = ConfigurationManager.getBundle().getString("singupScreen.selected.diabetes type");
				//scrollToElementSettingScreen(getNFKSettingspageGen_male());
				if (selectedGender.equals("MALE")) {
					WebDriverTestCase.verifyTrue(getNFKSettingspageGen_male().getAttribute("checked").equals("true"),
							"Male button is not enabled", "Male button is enabled");
				} else {
					WebDriverTestCase.verifyTrue(getNFKSettingspageGen_female().getAttribute("checked").equals("true"),
							"Female button is not enabled", "Female button is enabled");
					System.out.println("FeMale");
				}
				//scrollToElementSettingScreen(getNFKSettingspageDiabetictype2RadioBtn());
				if (selectedDiabetesType.contains("TYPE 1")) {
					//getNFKSettingspageStaticTextTxt(LFSUtilsAndroid.getPropString("more.aboutme.diabetesType.type1")).assertPresent("Diabetes Type 1");	
						WebDriverTestCase.verifyTrue(
								getNFKSettingspageDiabetictype1RadioBtn().getAttribute("checked").equals("true"),
								"Type 1 button is not enabled", "Type 1 button is enabled");
				} else if (selectedDiabetesType.contains("TYPE 2")  ) {
					WebDriverTestCase.verifyTrue(
							getNFKSettingspageDiabetictype2RadioBtn().getAttribute("checked").equals("true"),
							"Type 2 button is not enabled", "Type 2 button is enabled");
					System.out.println("Seleted the type 2");
				} 
			} catch (Exception e) {
					e.printStackTrace();
			}
		}


	// method to verify gestational type for male on settings page
	public void verifyGestationalTypeForMaleOnSettings() {
		scrollToElementSettingScreen(getNFKSettingspageGen_male());
		getNFKSettingspageGen_male().waitForPresent();
		getNFKSettingspageGen_male().click();
		Reporter.logWithScreenShot("After clicking male button", MessageTypes.Pass);
		getNFKSettingspageDiabetictypePopupTitleTxt().waitForPresent();
		getNFKSettingspageDiabetictype1RadioBtn().verifyPresent("Type 1");
		getNFKSettingspageDiabetictype2RadioBtn().verifyPresent("Type 2");
		getNFKSettingspageDiabetictypePopupCancelBtn().verifyPresent("Cancle");
		getNFKSettingspageDiabetictypePopupOkBtn().verifyPresent("Ok");
		getNFKSettingspageDiabetictypePopupCancelBtn().click();
		scrollToElementSettingScreen(getNFKSettingspageDiabetictypegestationalRadioBtn());
		if (getNFKSettingspageGen_female().getAttribute("checked").equals("true")
				&& getNFKSettingspageDiabetictypegestationalRadioBtn().getAttribute("checked").equals("true")) {
			Reporter.logWithScreenShot("Female and Gestational type is already selected after clicking on cancle",
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Wrong gender and diabetes type is selected after clicking on cancle",
					MessageTypes.Fail);
		}
		getNFKSettingspageGen_male().click();
		getNFKSettingspageDiabetictypePopupTitleTxt().waitForPresent();
		getNFKSettingspageDiabetictype1RadioBtn().click();
		getNFKSettingspageDiabetictypePopupOkBtn().click();
		getNFKSettingspageGen_male().waitForPresent();
		if (getNFKSettingspageGen_male().getAttribute("checked").equals("true")
				&& getNFKSettingspageDiabetictype1RadioBtn().getAttribute("checked").equals("true")) {
			Reporter.logWithScreenShot("Male and Type 1 selected after clicking OK button", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Wrong gender and diabetes type is selected after clicking Ok Button",
					MessageTypes.Fail);
		}
		getNFKSettingspageDiabetictypegestationalRadioBtn()
				.verifyDisabled("Gestational type is disabled for male gender");
		Reporter.logWithScreenShot("Gestational type is disabled for male on settings page", MessageTypes.Pass);
	}

	public QAFWebElement getNFKSettingspageInjmedChkbox() {
		return NFKSettingspageInjmedChkbox;
	}

	public QAFWebElement getNFKSettingspageLonginsulineChkbox() {
		return NFKSettingspageLonginsulineChkbox;
	}

	public QAFWebElement getNFKSettingspageMixedinsulineChkbox() {
		return NFKSettingspageMixedinsulineChkbox;
	}

	public QAFWebElement getNFKSettingspageRapidinsulineChkbox() {
		return NFKSettingspageRapidinsulineChkbox;
	}

	public QAFWebElement getNFKSettingspageInsulinepumpChkbox() {
		return NFKSettingspageInsulinepumpChkbox;
	}

	public QAFWebElement getNFKSettingspageDiabetisqustnChkboxlist() {
		return NFKSettingspageDiabetisqustnChkboxlist;
	}

	public QAFWebElement getNFKSettingspageBgOkBtn() {
		return NFKSettingspageBgOkBtn;
	}

	public QAFWebElement getNFKSettingspageStatictextTxt() {
		return NFKSettingspageStatictextTxt;
	}

	public QAFWebElement getNFKSettingspageAppsettingTab() {
		return NFKSettingspageAppsettingTab;
	}

	public QAFWebElement getNFKSettingspageUsersettingTab() {
		return NFKSettingspageUsersettingTab;
	}

	public void userRedirectsToRequiredSettings(String obj) {

		switch (obj) {

		case "User Settings":
			getNFKSettingspageUsersettingTab().verifyPresent("User Settings tab is present");
			getNFKSettingspageUsersettingTab().click();
			break;

		case "System Settings":
			getNFKSettingspageAppsettingTab().verifyPresent("System Settings tab is present");
			getNFKSettingspageAppsettingTab().click();
			break;
		}
	}

	public void verifyAwardsModule() {
		getNFKSettingspageAppsettingTab().verifyPresent("System Settings tab is present");
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		getNFKSettingspageSystemsettingAwardtrackerLbl().verifyPresent("Award tracker logo is present");
		getNFKSettingspageSystemsettingAwardtrackerTxt().verifyPresent("Award tracker text is present");
	}

	public void verifyAwardInformation() {
		if (getNFKSettingspageSystemsettingAwardtrackerSeeawardsLnk().isPresent()) {
			Reporter.logWithScreenShot("See Awards link is displayed", MessageTypes.Pass);
			getNFKSettingspageSystemsettingAwardtrackerSeeawardsLnk().click();
		}
		AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		androidDriver.context("WEBVIEW");
		if (getNFKSettingspageAwardtrackerSeeawardsGoogleLbl().isDisplayed()) {
			Reporter.logWithScreenShot("Google page is displayed ", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Google page is not displayed", MessageTypes.Fail);
		}

	}

	public void verifyChangesForAwardSetting() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		if (getNFKSettingspageSystemsettingAwardtrackerAppBtn().isPresent()) {
			getNFKSettingspageSystemsettingAwardtrackerAppBtn().click();
			Reporter.logWithScreenShot("App Button is displayed", MessageTypes.Pass);
		}
		if (getNFKSettingspageSystemsettingAwardtrackerMeterBtn().isPresent()) {
			getNFKSettingspageSystemsettingAwardtrackerMeterBtn().click();
			Reporter.logWithScreenShot("Meter Button is displayed", MessageTypes.Pass);
		}
		if (getNFKSettingspageSystemsettingAwardtrackerBothBtn().isPresent()) {
			getNFKSettingspageSystemsettingAwardtrackerBothBtn().click();
			Reporter.logWithScreenShot("Both Button is displayed", MessageTypes.Pass);
		}
		if (getNFKSettingspageSystemsettingAwardtrackerOffBtn().isPresent()) {
			getNFKSettingspageSystemsettingAwardtrackerOffBtn().click();
			Reporter.logWithScreenShot("off Button is displayed", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Awards tracker page is not displayed", MessageTypes.Fail);
		}
	}

	public void verifyAwardSelection() {
		//
	}

	public void verifyAppAndUserSetting() {
		getNFKSettingspageAppsettingTab().verifyPresent("System Settings button is present");
		getNFKSettingspageUsersettingTab().verifyPresent("User Settings button is present");
		getNFKSettingspageUsersettingTab().click();
		Reporter.logWithScreenShot("User settings page is displayed", MessageTypes.Pass);
		getNFKSettingspageAppsettingTab().click();
		Reporter.logWithScreenShot("System settings page is displayed", MessageTypes.Pass);
	}

	public void verifyAppSettingScreen() {
		getNFKSettingspageSystemsettingMentortipLbl().verifyPresent("Mentor Tip logo is displayed");
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		getNFKSettingspageSystemsettingAwardtrackerLbl().verifyPresent("Award tracker logo is present");
	}

	public void verifyMentorModule() {
		getNFKSettingspageSystemsettingMentortipLbl().verifyPresent("Mentor Tip logo is displayed");
		getNFKSettingspageSystemsettingMentortipTxt().verifyPresent("Mentor Tip text is displayed");
	}

	public void verifyChangeMentorTip() {
		if (getNFKSettingspageSystemsettingMentortipAppBtn().isPresent()) {
			getNFKSettingspageSystemsettingMentortipAppBtn().click();
			Reporter.logWithScreenShot("App Button is displayed", MessageTypes.Pass);
		}
		if (getNFKSettingspageSystemsettingMentortipMeterBtn().isPresent()) {
			getNFKSettingspageSystemsettingMentortipMeterBtn().click();
			Reporter.logWithScreenShot("Meter Button is displayed", MessageTypes.Pass);
		}
		if (getNFKSettingspageSystemsettingMentortipBothBtn().isPresent()) {
			getNFKSettingspageSystemsettingMentortipBothBtn().click();
			Reporter.logWithScreenShot("Both Button is displayed", MessageTypes.Pass);
		}
		if (getNFKSettingspageSystemsettingMentortipOffBtn().isPresent()) {
			getNFKSettingspageSystemsettingMentortipOffBtn().click();
			Reporter.logWithScreenShot("off Button is displayed", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Mentor Tips screen is not displayed", MessageTypes.Fail);
		}

	}

	public void clickSettingBack() {
		getNFKSettingspageBackBtn().verifyPresent("Back button is displayed");
		getNFKSettingspageBackBtn().click();
	}

	public void clickSystemSetting() {
		getNFKSettingspageAppsettingTab().verifyPresent("System Settings tab is present");
		getNFKSettingspageAppsettingTab().click();
	}

	public void verifyInvalidBg() {
		HomePageAndroid homepage = new HomePageAndroid();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		homepage.getNFKHomepageBgTestTxt().clear();
		homepage.getNFKHomepageBgGoalLnk().verifyPresent("BG Goal displayed");
		homepage.getNFKHomepageBgGoalLnk().click();
		homepage.getNFKHomepageBgTestTxt().verifyPresent("BG Goal text displayed");
		homepage.getNFKHomepageBgTestTxt().sendKeys("9");
		if (getNFKSettingspageSystemsettingInvalidbgerrorTxt().isPresent()) {
			Reporter.logWithScreenShot("Invalid BG goal error message is displayed", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Invalid BG goal error message is not displayed", MessageTypes.Fail);
		}

	}

	public void verifyInvalidSteps() {
		HomePageAndroid homepage = new HomePageAndroid();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		homepage.getNFKHomepageStepsTxt().clear();
		homepage.getNFKHomepageStepGoalLnk().verifyPresent("Steps goal displayed");
		homepage.getNFKHomepageStepGoalLnk().click();
		homepage.getNFKHomepageStepsTxt().verifyPresent("Steps Goal text displayed");
		;
		homepage.getNFKHomepageStepsTxt().sendKeys("0");
		if (getNFKSettingspageSystemsettingInvalistepserrorTxt().isPresent()) {
			Reporter.logWithScreenShot("Invalid Steps goal error message is displayed", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Invalid Steps goal error message is not displayed", MessageTypes.Fail);
		}

	}

	public void verifyInvalidCarbs() {
		HomePageAndroid homepage = new HomePageAndroid();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		homepage.getNFKHomepageCarbTxt().clear();
		homepage.getNFKHomepageCarbsGoalLnk().verifyPresent("Carbs goal displayed");
		homepage.getNFKHomepageCarbsGoalLnk().click();
		homepage.getNFKHomepageCarbTxt().verifyPresent("Carbs Goal text displayed");
		;
		homepage.getNFKHomepageCarbTxt().sendKeys("11");
		LFSUtilsAndroid.hideKeyboard();
		if (getNFKSettingspageSystemsettingInvalidcarbserrorTxt().isPresent()) {
			Reporter.logWithScreenShot("Invalid Carbs goal error message is displayed", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Invalid Carbs goal error message is not displayed", MessageTypes.Fail);
		}
	}

	public void verifyInvalidActivity() {
		HomePageAndroid homepage = new HomePageAndroid();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		homepage.getNFKHomepageActivityTxt().clear();
		homepage.getNFKHomepageActivityGoalLnk().verifyPresent("Activity goal displayed");
		homepage.getNFKHomepageActivityGoalLnk().click();
		homepage.getNFKHomepageActivityTxt().verifyPresent("Activity Goal text displayed");
		getNFKSettingspageSystemsettingActivityDailyBtn().click();
		homepage.getNFKHomepageActivityTxt().sendKeys("1441");
		if (getNFKSettingspageSystemsettingInvalidactivityerrorTxt().isPresent()) {
			Reporter.logWithScreenShot("Invalid Activity goal error message is displayed", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Invalid Activity goal error message is not displayed", MessageTypes.Fail);
		}
	}

	public void clickOnWeek() {
		HomePageAndroid homepage = new HomePageAndroid();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		homepage.getNFKHomepageBgTestTxt().clear();
		homepage.getNFKHomepageStepsTxt().clear();
		homepage.getNFKHomepageCarbTxt().clear();
		homepage.getNFKHomepageActivityGoalLnk().verifyPresent("Activity goal displayed");
		getNFKSettingspageSystemsettingActivityWeeklyBtn().click();
		getNFKSettingspageSystemsettingActivityWeeklyBtn().verifyPresent("Weekly label displayed");
		LFSUtilsIOS.pause(2000);
		homepage.getNFKHomepageActivityTxt().clear();
		homepage.getNFKHomepageActivityTxt().sendKeys("15");

	}

	public void clickOnDay() {
		HomePageAndroid homepage = new HomePageAndroid();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		homepage.getNFKHomepageActivityGoalLnk().verifyPresent("Activity goal displayed");
		homepage.getNFKHomepageBgTestTxt().clear();
		homepage.getNFKHomepageStepsTxt().clear();
		homepage.getNFKHomepageCarbTxt().clear();
		getNFKSettingspageSystemsettingActivityDailyBtn().click();
		getNFKSettingspageSystemsettingActivityDailyBtn().verifyPresent("Daily label displayed");
		LFSUtilsIOS.pause(2000);
		homepage.getNFKHomepageActivityTxt().clear();
		homepage.getNFKHomepageActivityTxt().sendKeys("15");

	}

	@FindBy(locator = "NFK.settingspage.systemsetting.goal.info.btn")
	private QAFWebElement NFKSettingspageSystemsettingGoalInfoBtn;

	public QAFWebElement getNFKSettingspageSystemsettingGoalInfoBtn() {
		return NFKSettingspageSystemsettingGoalInfoBtn;
	}

	@FindBy(locator = "NFK.settingspage.systemsetting.goal.on.btn")
	private QAFWebElement NFKSettingspageSystemsettingGoalOnBtn;

	public QAFWebElement getNFKSettingspageSystemsettingGoalOnBtn() {
		return NFKSettingspageSystemsettingGoalOnBtn;
	}

	@FindBy(locator = "NFK.settingspage.systemsetting.goal.off.btn")
	private QAFWebElement NFKSettingspageSystemsettingGoalOffBtn;

	public QAFWebElement getNFKSettingspageSystemsettingGoalOffBtn() {
		return NFKSettingspageSystemsettingGoalOffBtn;
	}

	@FindBy(locator = "NFK.settingspage.insulincalculator.lbl")
	private QAFWebElement NFKSettingspageInsulincalculatorLbl;
	@FindBy(locator = "NFK.settingspage.insulincalculator.txt")
	private QAFWebElement NFKSettingspageInsulincalculatorTxt;
	@FindBy(locator = "NFK.settingspage.insulincalculator.toggle.btn")
	private QAFWebElement NFKSettingspageInsulincalculatorToggleBtn;
	@FindBy(locator = "NFK.settingspage.insulincalculator.toggle.Entercodetitle.lbl")
	private QAFWebElement NFKSettingspageInsulincalculatorToggleEntercodetitleLbl;
	@FindBy(locator = "NFK.settingspage.insulincalculator.toggle.code.txt")
	private QAFWebElement NFKSettingspageInsulincalculatorToggleCodeTxt;
	@FindBy(locator = "NFK.settingspage.insulincalculator.toggle.code.chbx")
	private QAFWebElement NFKSettingspageInsulincalculatorToggleCodeChbx;
	@FindBy(locator = "NFK.settingspage.insulincalculator.toggle.code.setup.btn")
	private QAFWebElement NFKSettingspageInsulincalculatorToggleCodeSetupBtn;
	@FindBy(locator = "NFK.settingspage.insulincalculator.Invalidcode.errormsg.txt")
	private QAFWebElement NFKSettingspageInsulincalculatorInvalidcodeErrormsgTxt;
	@FindBy(locator = "NFK.settingspage.insulincalculator.setting.lnk")
	private QAFWebElement NFKSettingspageInsulincalculatorSettingLnk;

	public void clickGoalInfo() {
		getNFKSettingspageSystemsettingGoalOffBtn().click();
		getNFKSettingspageSystemsettingGoalInfoBtn().verifyPresent();
		getNFKSettingspageSystemsettingGoalInfoBtn().click();
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Goal information screen", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsIOS.pause(2000);
		getNFKSettingspageSystemsettingGoalOnBtn().click();

	}

	public void clearGoals() {
		HomePageAndroid homepage = new HomePageAndroid();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		homepage.getNFKHomepageBgTestTxt().clear();
		homepage.getNFKHomepageStepsTxt().clear();
		homepage.getNFKHomepageCarbTxt().clear();
		homepage.getNFKHomepageActivityTxt().clear();

	}

	public QAFWebElement getNFKSettingspageInsulincalculatorLbl() {
		return NFKSettingspageInsulincalculatorLbl;
	}

	public QAFWebElement getNFKSettingspageInsulincalculatorTxt() {
		return NFKSettingspageInsulincalculatorTxt;
	}

	public QAFWebElement getNFKSettingspageInsulincalculatorToggleBtn() {
		return NFKSettingspageInsulincalculatorToggleBtn;
	}

	public QAFWebElement getNFKSettingspageInsulincalculatorToggleEntercodetitleLbl() {
		return NFKSettingspageInsulincalculatorToggleEntercodetitleLbl;
	}

	public QAFWebElement getNFKSettingspageInsulincalculatorToggleCodeTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.settingspage.insulincalculator.toggle.code.txt", text);
	}

	public QAFWebElement getNFKSettingspageInsulincalculatorToggleCodeChbx() {
		return NFKSettingspageInsulincalculatorToggleCodeChbx;
	}

	public QAFWebElement getNFKSettingspageInsulincalculatorToggleCodeSetupBtn() {
		return NFKSettingspageInsulincalculatorToggleCodeSetupBtn;
	}

	public void verifyAndClickToggle() {
		getNFKSettingspageInsulincalculatorTxt().verifyPresent("Insulin Calculator Text is displayed");
		if (getNFKSettingspageInsulincalculatorToggleBtn().getAttribute("text").equalsIgnoreCase("ON"))
			Reporter.logWithScreenShot("Insulin calculator Toggle button switch is ON", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Insulin calculator Toggle button switch is OFF", MessageTypes.Pass);
			getNFKSettingspageInsulincalculatorToggleBtn().click();
			Reporter.logWithScreenShot("Insulin calculator Toggle button switch is ON", MessageTypes.Pass);
		}
	}

	public void enterValidPatientCode(Object eventDetail) {
		getNFKSettingspageInsulincalculatorToggleEntercodetitleLbl().waitForPresent();
		Reporter.logWithScreenShot("Enter code to add patient is displayed", MessageTypes.Pass);
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		getNFKSettingspageInsulincalculatorToggleCodeTxt("1").sendKeys(eventBean.getCodeOne());
		getNFKSettingspageInsulincalculatorToggleCodeTxt("2").sendKeys(eventBean.getCodeTwo());
		getNFKSettingspageInsulincalculatorToggleCodeTxt("3").sendKeys(eventBean.getCodeThree());
		getNFKSettingspageInsulincalculatorToggleCodeTxt("4").sendKeys(eventBean.getCodeFour());
		getNFKSettingspageInsulincalculatorToggleCodeTxt("5").sendKeys(eventBean.getCodeFive());
		getNFKSettingspageInsulincalculatorToggleCodeTxt("6").sendKeys(eventBean.getCodeSix());
		if (getNFKSettingspageInsulincalculatorToggleCodeChbx().isPresent()) {
			getNFKSettingspageInsulincalculatorToggleCodeChbx().click();
			Reporter.logWithScreenShot("After clicking confirmation checkbox", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("confirmation checkbox is not present", MessageTypes.Fail);
		}
		LFSUtilsAndroid.waitforLoad();
		getNFKSettingspageInsulincalculatorToggleCodeSetupBtn().verifyPresent("Setup button is displayed");
		getNFKSettingspageInsulincalculatorToggleCodeSetupBtn().click();
		Reporter.logWithScreenShot("Office code is valid and accepted", MessageTypes.Pass);
	}

	public void enterInvalidPatientCode() {
		getNFKSettingspageInsulincalculatorToggleEntercodetitleLbl().waitForPresent();
		Reporter.logWithScreenShot("Enter code to add patient is displayed", MessageTypes.Pass);
		getNFKSettingspageInsulincalculatorToggleCodeTxt("1").sendKeys("0");
		getNFKSettingspageInsulincalculatorToggleCodeTxt("2").sendKeys("0");
		getNFKSettingspageInsulincalculatorToggleCodeTxt("3").sendKeys("0");
		getNFKSettingspageInsulincalculatorToggleCodeTxt("4").sendKeys("0");
		getNFKSettingspageInsulincalculatorToggleCodeTxt("5").sendKeys("0");
		getNFKSettingspageInsulincalculatorToggleCodeTxt("6").sendKeys("0");
	}

	public void verifyInvalidErrorMsg() {
		LFSUtilsAndroid.waitforLoad();
		if (getNFKSettingspageInsulincalculatorInvalidcodeErrormsgTxt().isPresent()) {
			Reporter.logWithScreenShot("Office code is invalid and denied", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Office code is valid", MessageTypes.Pass);
		}
	}

	public QAFWebElement getNFKSettingspageInsulincalculatorInvalidcodeErrormsgTxt() {
		return NFKSettingspageInsulincalculatorInvalidcodeErrormsgTxt;
	}

	public void verifyIcToggle() {
		QAFWebElement getTitle = getNFKSettingspageStaticTextTxt(
				(String) LFSUtilsAndroid.getPropString("settings.insulinCalc.reactivateWarning").subSequence(0, 7));
		if (getNFKSettingspageInsulincalculatorToggleBtn().getAttribute("text").equalsIgnoreCase("ON")) {
			Reporter.logWithScreenShot("Insulin calculator Toggle button switch is ON", MessageTypes.Pass);
			getNFKSettingspageInsulincalculatorToggleBtn().click();
		} else {
			Reporter.logWithScreenShot("Insulin calculator Toggle button switch is OFF", MessageTypes.Fail);
		}
		if (getTitle.isPresent()) {
			getNFKSettingspageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.deactivate"))
					.click();
		}
	}

	public void clickOnBack() {
		getNFKSettingspageBackBtn().verifyPresent("Back button is displayed");
		getNFKSettingspageBackBtn().click();
	}

	public void clickBackInsulin() {
		if (getNFKSettingspageStaticTextTxt(ConfigurationManager.getBundle().getString("common.backbuttontext"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Back button is displayed on Insulin Mentor screen", MessageTypes.Pass);
			getNFKSettingspageStaticTextTxt(ConfigurationManager.getBundle().getString("common.backbuttontext"))
					.click();
			LFSUtilsAndroid.waitforLoad();
		}
	}

	public void clickSettingsLink() {
		if (getNFKSettingspageInsulincalculatorSettingLnk().isPresent()) {
			Reporter.logWithScreenShot("Settings Link is displayed ", MessageTypes.Pass);
			getNFKSettingspageInsulincalculatorSettingLnk().click();
		} else {
			Reporter.logWithScreenShot("Settings Link is not displayed", MessageTypes.Fail);
		}
	}

	public QAFWebElement getNFKSettingspageInsulincalculatorSettingLnk() {
		return NFKSettingspageInsulincalculatorSettingLnk;
	}

	// method to verify glucose value
	public void verifysensorValue(Object settingdetail) {
		EventDetailBeans eventbean = new EventDetailBeans();
		if (settingdetail instanceof String) {

			eventbean.fillFromConfig((String) settingdetail);
		} else {
			eventbean.fillData(settingdetail);
		}
		
		String value1 = getNFKSettingspageBgdeafaultcompare().getAttribute("text").toString();

		Validator.verifyThat("BG compare", (value1.replaceAll("\\s+", "")),
				Matchers.equalTo(eventbean.getGlucosecompare().replaceAll("\\s+", "")));
		
		if (getNFKSettingspageBgdeafaultcompare().getText().replaceAll("\\s+", "").equals(eventbean.getGlucosecompare().replaceAll("\\s+", "")))
			{
			Reporter.logWithScreenShot("Bg compared",MessageTypes.Pass);
			} 
			else {
				Reporter.logWithScreenShot("BG Range was not matched",MessageTypes.Fail);
			}
		
	}

	public void changesensorValue(Object bgvalue) {

		EventDetailBeans eventbean = new EventDetailBeans();

		if (bgvalue instanceof String) {

			eventbean.fillFromConfig((String) bgvalue);
		} else {
			eventbean.fillData(bgvalue);
		}

		Reporter.logWithScreenShot("Before changing bg target", MessageTypes.Pass);
		getNFKMoreMenuSettingspageSelectRange().click();
		String amountLow = LFSUtilsAndroid.mmolMGDL(Integer.parseInt(eventbean.getLowglucosevalue()));
		// String amountLow = eventbean.getLowbgvalue();
		LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(), amountLow);
		getNFKSettingspageBgRengeokBtn().waitForPresent();
		getNFKSettingspageBgRengeokBtn().click();
		Reporter.logWithScreenShot("low bg target changed", MessageTypes.Pass);
		getNFKMoreMenuSettingspageSelectRange().click();
		getNFKSettingspageBgrangeforwardarrow().click();
		String amountHigh = LFSUtilsAndroid.mmolMGDL(Integer.parseInt(eventbean.getHighglucosevalue()));
		// String amountHigh = eventbean.getHighbgvalue();
		LFSUtilsAndroid.selectBGRangePicker(getNFKSettingspageBgRengePkr(), amountHigh);
		getNFKSettingspageBgRengeokBtn().waitForPresent();
		getNFKSettingspageBgRengeokBtn().click();
		Reporter.logWithScreenShot("high bg target changed", MessageTypes.Pass);

	}
	
	public void verifyEditedTargetRanges(Object updatedrange) {
		EventDetailBeans eventbean= new EventDetailBeans();
		if (updatedrange instanceof String) {

			eventbean.fillFromConfig((String) updatedrange);
		} else {
			eventbean.fillData(updatedrange);
		}
		
		try {
			String delmg="mg/dL";
			String delmm="mmol/L";
			String editedValue;
	
			if(getNFKSettingspageBgdeafaultcompare().getAttribute("text").contains("mg/dL"))
			{
				editedValue = getNFKSettingspageBgdeafaultcompare().getAttribute("text").replaceAll("\\s+", "").replace(delmg,"").toString();
			}
			else
			{
				editedValue = getNFKSettingspageBgdeafaultcompare().getAttribute("text").replaceAll("\\s+", "").replace(delmm,"").toString();
			}
			String verifYeditedValue = eventbean.getLowglucosevalue()+"-"+eventbean.getHighglucosevalue();
			if (editedValue.equals(eventbean.getLowglucosevalue()+"-"+eventbean.getHighglucosevalue()))
			{
			Reporter.logWithScreenShot("The user had updated target range",MessageTypes.Pass);
			} 
			else
			{
				Reporter.logWithScreenShot("The user has not updated target range",MessageTypes.Fail);
			}
		}
		catch(Exception e){
			e.getMessage();
		}
		
	}
	

	// Method to verify after editing bg range
	public void verifyBGValueafteredit() {

		getNFKSettingspageTitl().waitForPresent(3000);
		getNFKSettingspageTitl().verifyPresent("Settings Screen");
		Reporter.logWithScreenShot("Bg range setting changed", MessageTypes.Pass);
	}

	public void clickOnCancle() {
		System.out.println("Clicked on cancellllllllll*******************************************");
		getNFKSettingspageBgdeafaultcompare().isPresent();
		getNFKSettingspageBgdeafaultcompare().click();
		getNFKSettingspageCancelBtn().waitForPresent();
		getNFKSettingspageCancelBtn().click();
        Reporter.logWithScreenShot("The user has clicked on Cancel button ", MessageTypes.Pass);
	}

	public void verifySettings() 
	{
    	Reporter.logWithScreenShot("Verify Settings screen", MessageTypes.Pass);
	}

	public void verifyEventsofSystemsetting(String option) {
	 getNFKSettingspageEventTitle().waitForPresent();
	 getNFKSettingspageEventTitle().verifyVisible("Event title is present");
	 option.toUpperCase();
	 getNFKSettingspageLogInsulinText().verifyPresent("Log Insulin text");
	 getNFKSettingspageOverlayTimelineText().verifyPresent("Overlay Timeline text");
	 switch (option) {
	       case "ENABLED":
               if(getNFKSettingspageLoginsulinToggleBtn().isPresent() && getNFKSettingspageOverlaytimelineToggleBtn().isPresent())
               {
    	         getNFKSettingspageLoginsulinToggleBtn().verifyEnabled("Log Insulin button is Enabled");
    	         getNFKSettingspageOverlaytimelineToggleBtn().verifyEnabled("Overlay Events on Timeline is Enabled");
    	         Reporter.logWithScreenShot("Log Insulin and Overlay button are Enabled",MessageTypes.Pass);
               }
    	    break;
	      case "DISABLED":
	    	  if(getNFKSettingspageLoginsulinToggleBtn().isDisplayed() && getNFKSettingspageOverlaytimelineToggleBtn().isDisplayed())
	    	  {
	    		  getNFKSettingspageLoginsulinToggleBtn().verifyDisabled("Log insulin button is disabled");
	    		  getNFKSettingspageOverlaytimelineToggleBtn().verifyDisabled("Overlay Events on Timeline is disbaled");
	    		  Reporter.logWithScreenShot("Log Insulin and Overlay button are disabled", MessageTypes.Pass);
	    	  }
	    		  break;

	}
	}

	public void clickTheEvents(String option) {
		System.out.println("Diabling the elements*************************************");
		option =option.toUpperCase();
		switch (option) {
		case "ENABLED" :
			if(!(getNFKSettingspageLoginsulinToggleBtn().isEnabled() & getNFKSettingspageOverlaytimelineToggleBtn().isEnabled()))
				{
				System.out.println("**********************");
				getNFKSettingspageLoginsulinToggleBtn().click();
				getNFKSettingspageOverlaytimelineToggleBtn().click();
				}
			break;
		case "DISABLED":
			if(getNFKSettingspageLoginsulinToggleBtn().isEnabled() & getNFKSettingspageOverlaytimelineToggleBtn().isEnabled())
			{
				System.out.println("#########Disabling the element**********");	
				getNFKSettingspageOverlaytimelineToggleBtn().click();
				    //getNFKSettingspageOverlaytimelineToggleBtn().waitForDisabled(200);	
					System.out.println("Disabling the Log toggle---------");
					try {
				           getNFKSettingspageLoginsulinToggleBtn().click();
				              //getNFKSettingspageLoginsulinToggleBtn().waitForDisabled(200);
				       }
					catch (Exception e) {
						e.printStackTrace();
					}
				LFSUtilsAndroid.pause(2000);
			}
			break;
	 	
	  }
		Reporter.logWithScreenShot("Button are disabled", MessageTypes.Pass);
	}
	//UOM on setting screen
	public void verifyUOMonUserSetting(String uom){
	if(getNFKSettingspageBgdeafaultcompare().getAttribute("text").contains(uom))
	{
	Reporter.logWithScreenShot("User has set "+uom+" UOM", MessageTypes.Pass);}
	else
		{ 
		Reporter.logWithScreenShot("Incorrect UOM is displayed",MessageTypes.Fail);
		}
	LFSUtilsAndroid.pause(10000);
	}
	
	public void verifiesSystemSettings() {
		getNFKSettingspageSystemSettingTab().assertPresent("System Setting tab");
	Assert.assertEquals(getNFKSettingspageSystemAccountLbl().get(0).getText(),LFSUtilsAndroid.getPropString("settings.system.current.reading.lbl"));
	Assert.assertEquals(getNFKSettingspageSystemAccountLbl().get(1).getText(),LFSUtilsAndroid.getPropString("settings.system.timeline.lbl"));
	Assert.assertEquals(getNFKSettingspageSystemAccountLbl().get(2).getText(),LFSUtilsAndroid.getPropString("settings.system.events.lbl"));
	Assert.assertEquals(getNFKSettingspageSystemTextLbl().get(0).getText(),LFSUtilsAndroid.getPropString("settings.system.animation.lbl"));
	Assert.assertEquals(getNFKSettingspageSystemTextLbl().get(1).getText(),LFSUtilsAndroid.getPropString("settings.system.log.insulin.lbl"));
	getNFKSettingspageSystemSwitchBtn().get(0).isEnabled();
	getNFKSettingspageSystemSwitchBtn().get(1).isEnabled();
	getNFKSettingspageSystemOneHrBtn().assertPresent("1 hr button");
	getNFKSettingspageSystemFourHrBtn().assertPresent("4 hr button");
	getNFKSettingspageSystemEightHrBtn().assertPresent("8 hr button");
	getNFKSettingspageSystemTwelveHrBtn().assertPresent("12 hr button");
    getNFKSettingspageSystemTwentyfourHrBtn().assertPresent("24 hr button");
    Reporter.logWithScreenShot("User has verified the System Settings page",MessageTypes.Pass);
 }
 public void changeGender() {
	
		try {
			if (getNFKSettingspageGen_male().getAttribute("checked").equals("true")) {
				getNFKSettingspageGen_female().click();
				System.out.println("Clicked on Female");
				ConfigurationManager.getBundle().setProperty("settingsScreen.selected.gender", "FEMALE");
				Reporter.logWithScreenShot("Gender Changed to Female", MessageTypes.Pass);
			
			} 
			else if(getNFKSettingspageGen_female().getAttribute("checked").equals("true")) {
				getNFKSettingspageGen_male().click();
				ConfigurationManager.getBundle().setProperty("settingsScreen.selected.gender", "MALE");
				Reporter.logWithScreenShot("Gender Changed to Male", MessageTypes.Pass);
				System.out.println("Clicked on Male");
			}
			LFSUtilsAndroid.pause(2000);
			clickOnBack();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void VerifyGender() {
		String selectedGender = ConfigurationManager.getBundle().getString("settingsScreen.selected.gender");
		if (selectedGender.equals("MALE")) {
			WebDriverTestCase.verifyTrue(getNFKSettingspageGen_male().getAttribute("checked").equals("true"),
					"Male button is not enabled", "Male button is enabled");
		} else {
			WebDriverTestCase.verifyTrue(getNFKSettingspageGen_female().getAttribute("checked").equals("true"),
					"Female button is not enabled", "Female button is enabled");
			System.out.println("FeMale");
		}
	}
	
	public void changediabetesType() {
		try {
			if (getNFKSettingspageDiabetictype1RadioBtn().getAttribute("checked").equals("true")) {
				getNFKSettingspageDiabetictype2RadioBtn().click();
				System.out.println("Clicked Type 2");
				ConfigurationManager.getBundle().setProperty("settingsScreen.selected.dType", "TYPE 2");
				Reporter.logWithScreenShot("Type Changed to Type2", MessageTypes.Pass);
			
			} 
			else if(getNFKSettingspageDiabetictype2RadioBtn().getAttribute("checked").equals("true")) {
					getNFKSettingspageDiabetictype1RadioBtn().click();
				ConfigurationManager.getBundle().setProperty("settingsScreen.selected.dType", "TYPE 1");
				Reporter.logWithScreenShot("Type Changed to Type1", MessageTypes.Pass);
				System.out.println("Clicked on Type 1");
			}
			LFSUtilsAndroid.pause(2000);
			clickOnBack();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void VerifyDiabetesType() {
		String selecteddType = ConfigurationManager.getBundle().getString("settingsScreen.selected.dType");
		System.out.println(selecteddType);
		if (selecteddType.contains("TYPE 1")) {
			WebDriverTestCase.verifyTrue(getNFKSettingspageDiabetictype1RadioBtn().getAttribute("checked").equals("true"),
					"Type 1 is not enabled", "Type 1 is enabled");
			System.out.println("TYPE 1");
		} else {
			WebDriverTestCase.verifyTrue(getNFKSettingspageDiabetictype2RadioBtn().getAttribute("checked").equals("true"),
					"Type 2 is not enabled", "Type 2 is enabled");
			System.out.println("TYPE 2");
		}
	}
}
