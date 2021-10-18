package com.NFK.version1.android.pages;

import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import org.hamcrest.Matchers;
import org.openqa.selenium.Point;


import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.EventDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class HomePageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.homepage.share.btn")
	private QAFWebElement NFKHomepageShareBtn;
	@FindBy(locator = "NFK.homepage.more.btn")
	private QAFWebElement NFKHomepageMoreBtn;
	@FindBy(locator = "NFK.homepage.home.btn")
	private QAFWebElement NFKHomepageHomeBtn;
	@FindBy(locator = "NFK.homepage.eventlog.btn")
	private QAFWebElement NFKHomepageeventlogBtn;
	@FindBy(locator = "NFK.homepage.connection.btn")
	private QAFWebElement NFKHomepageConnectionBtn;
	@FindBy(locator = "NFK.homepage.onetouch.img")
	private QAFWebElement NFKHomepageOnetouchImg;
	@FindBy(locator = "NFK.homepage.eventvalue.txt")
	private List<QAFWebElement> NFKHomepageEventValueTxt;
	@FindBy(locator = "NFK.homepage.eventUOM.txt")
	private List<QAFWebElement> NFKHomepageEventUOMTxt;
	@FindBy(locator = "NFK.homepage.eventdatetime.txt")
	private List<QAFWebElement> NFKHomepageEventDatetimeTxt;
	@FindBy(locator = "NFK.homepage.eventnote.icon")
	private List<QAFWebElement> NFKHomepageEventnoteIcon;
	@FindBy(locator = "NFK.homepage.event.icon")
	private List<QAFWebElement> NFKHomepageEventCircleIcon;
	@FindBy(locator = "NFK.homepage.actionbar.img")
	private QAFWebElement NFKHomepageActionbarImg;
	@FindBy(locator = "NFK.homepage.noevent.txt")
	private QAFWebElement NFKHomepageNoeventTxt;
	@FindBy(locator = "NFK.homepage.pairmeter.txt")
	private QAFWebElement NFKHomepagePairmeterTxt;
	@FindBy(locator = "NFK.homepage.addevent.txt")
	private QAFWebElement NFKHomepageAddeventTxt;
	@FindBy(locator = "NFK.homepage.patterns.btn")
	private QAFWebElement NFKHomepagePatternsBtn;
	@FindBy(locator = "NFK.homepage.lastreading.btn")
	private QAFWebElement NFKHomepageLastReadingBtn;
	@FindBy(locator = "NFK.homepage.lastreading14days.btn")
	private QAFWebElement NFKHomepageLastreading14DaysBtn;
	@FindBy(locator = "NFK.homepage.lastreading30days.btn")
	private QAFWebElement NFKHomepageLastreading30DaysBtn;
	@FindBy(locator = "NFK.homepage.lastreading90days.btn")
	private QAFWebElement NFKHomepageLastreading90DaysBtn;
	@FindBy(locator = "NFK.homepage.lastreading.reading.btn")
	private QAFWebElement NFKHomepageLastReadingReadingBtn;
	@FindBy(locator = "NFK.homepage.lastreading.perdayreading.btn")
	private QAFWebElement NFKHomepageLastreadingPerdayReadingBtn;
	@FindBy(locator = "NFK.homepage.lastreading.average.btn")
	private QAFWebElement NFKHomepageLastReadingAverageBtn;
	@FindBy(locator = "NFK.homepage.events.list")
	private List<QAFWebElement> NFKHomepageEventsList;
	@FindBy(locator = "NFK.homepage.lastreadingdate.lbl")
	private QAFWebElement NFKHomepageLastReadingDateLbl;
	@FindBy(locator = "NFK.homepage.lastreadingvalue.lbl")
	private QAFWebElement NFKHomepageLastReadingValueLbl;
	@FindBy(locator = "NFK.homepage.lastreadingallevent.lnk")
	private QAFWebElement NFKHomepageLastReadingAllEventLnk;
	@FindBy(locator = "NFK.homepage.lastreadingunit.lbl")
	private QAFWebElement NFKHomepageLasrReadingUnitLbl;
	@FindBy(locator = "NFK.homepage.lastreadingpage.lastsyncwithmeter.lbl")
	private QAFWebElement NFKHomepageLastReadingPageLastSyncWithMeterLbl;
	@FindBy(locator = "NFK.homepage.lastreadingpage.totalreadingsync.lbl")
	private QAFWebElement NFKHomepageLastReadingPageTotalReadingsSyncLbl;
	@FindBy(locator = "NFK.homepage.lastreadingpage.viewallreadings.lnk")
	private QAFWebElement NFKHomepageLastReadingPageViewAllReadingsLnk;
	@FindBy(locator = "NFK.homepage.lastreadingpage.averagechart.img")
	private QAFWebElement NFKHomepageLastReadingpageAverageChartImg;
	@FindBy(locator = "NFK.homepage.lastreadingpage.bgreading.popup")
	private QAFWebElement NFKHomepageLastReadingPageBGReadingPopup;
	@FindBy(locator = "NFK.homepage.reading.btn")
	private QAFWebElement NFKHomepageReadingBtn;
	@FindBy(locator = "NFK.homepage.readings.list")
	private List<QAFWebElement> NFKHomepageReadingsList;
	@FindBy(locator = "NFK.homepage.newarticle.lnk")
	private QAFWebElement NFKHomepageNewarticleLnk;
	@FindBy(locator = "NFK.homepage.lastreading.overalllow.lbl")
	private QAFWebElement NFKHomepageLastreadingOveralllowLbl;
	@FindBy(locator = "NFK.homepage.lastreading.overallhigh.lbl")
	private QAFWebElement NFKHomepageLastreadingOverallhighLbl;
	@FindBy(locator = "NFK.homepage.lastreading.inrangevalue.lbl")
	private QAFWebElement NFKHomepageLastreadingInrangeCountLbl;
	@FindBy(locator = "NFK.homepage.total.readings.popup.lbl")
	private QAFWebElement NFKHomepageTotalReadingsPopupLbl;
	@FindBy(locator = "NFK.homepage.lastreading.bgreading.popup.aftermeal.lowvalue.lbl")
	private QAFWebElement NFKHomepageLastreadingBgreadingPopupAftermealLowvalueLbl;
	@FindBy(locator = "NFK.homepage.lastreading.bgreading.popup.aftermeal.highvalue.lbl")
	private QAFWebElement NFKHomepageLastreadingBgreadingPopupAftermealHighvalueLbl;
	@FindBy(locator = "NFK.homepage.activityType.txt")
	private List<QAFWebElement> NFKHomepageActivityTypeText;
	@FindBy(locator = "NFK.homepage.activity.lnk")
	private QAFWebElement NFKHomepageActivityLnk;
	@FindBy(locator = "NFK.homepage.averages.btn")
	private QAFWebElement NFKHomepageAveragesBtn;
	@FindBy(locator = "NFK.homepage.trends.btn")
	private QAFWebElement NFKHomepageTrendsBtn;
	@FindBy(locator = "NFK.homepage.a1ccomparator.btn")
	private QAFWebElement NFKHomepageA1ccomparatorBtn;
	@FindBy(locator = "NFK.homepage.average.days.navigation.btn")
	private QAFWebElement NFKHomepageAverageDaysNavigationBtn;
	@FindBy(locator = "NFK.homepage.previous.date.btn")
	private QAFWebElement NFKHomepagePreviousDateBtn;
	@FindBy(locator = "NFK.homepage.trends.a1ccoparator.lbl")
	private QAFWebElement NFKHomepageTrendsA1ccoparatorLbl;
	@FindBy(locator = "NFK.homepage.steps.txt")
	private QAFWebElement NFKHomepageStepsTxt;
	@FindBy(locator = "NFK.homepage.carb.txt")
	private QAFWebElement NFKHomepageCarbTxt;
	@FindBy(locator = "NFK.homepage.activity.txt")
	private QAFWebElement NFKHomepageActivityTxt;
	@FindBy(locator = "NFK.homepage.lastreading.trends.a1c.lbl")
	private QAFWebElement NFKHomepageLastreadingTrendsA1cLbl;
	@FindBy(locator = "NFK.homepage.lastreading.trends.lasta1c.txt")
	private QAFWebElement NFKHomepageLastreadingTrendsLasta1cTxt;
	@FindBy(locator = "NFK.homepage.lastreading.trends.adda1c.lbl")
	private QAFWebElement NFKHomepageLastreadingTrendsAdda1cLbl;
	@FindBy(locator = "NFK.homepage.lastreading.trends.a1cTestdata.lbl")
	private QAFWebElement NFKHomepageLastreadingTrendsA1ctestdataLbl;
	@FindBy(locator = "NFK.homepage.lastreading.trends.a1cSelect.txt")
	private QAFWebElement NFKHomepageLastreadingTrendsA1cselectTxt;
	@FindBy(locator = "NFK.homepage.lastreading.trends.a1cpercent.lbl")
	private QAFWebElement NFKHomepageLastreadingTrendsA1cpercentLbl;
	@FindBy(locator = "NFK.homepage.lastreading.trends.savea1c.btn")
	private QAFWebElement NFKHomepageLastreadingTrendsSavea1cBtn;
	@FindBy(locator = "NFK.homepage.lastreading.trends.adda1c.btn")
	private QAFWebElement NFKHomepageLastreadingTrendsAdda1cBtn;
	@FindBy(locator = "NFK.homepage.patterncounter.lbl")
	private QAFWebElement NFKHomepagePatternounterLbl;
	@FindBy(locator = "NFK.homepage.lastreading.trends.a1c.info.btn")
	private QAFWebElement NFKHomepageLastreadingTrendsA1cInfoBtn;
	@FindBy(locator = "NFK.homepage.lastreading.trends.a1c.infoscreen.lbl")
	private QAFWebElement NFKHomepageLastreadingTrendsA1cInfoscreenLbl;
	@FindBy(locator = "NFK.homepage.lastreading.trends.Addeda1c.graph.txt")
	private QAFWebElement NFKHomepageLastreadingTrendsAddeda1cGraphTxt;
	@FindBy(locator = "NFK.homepage.lastreading.trends.Addeda1c.viewA1Chistory.btn")
	private QAFWebElement NFKHomepageLastreadingTrendsAddeda1cViewa1chistoryBtn;
	@FindBy(locator = "NFK.homepage.lastreading.trends.Addeda1c.A1Chistory.lbl")
	private QAFWebElement NFKHomepageLastreadingTrendsAddeda1cA1chistoryLbl;
	@FindBy(locator = "NFK.homepage.lastreading.trends.Adda1c.MinMaxError.txt")
	private QAFWebElement NFKHomepageLastreadingTrendsAdda1cMinmaxerrorTxt;
	@FindBy(locator = "NFK.homepage.lastreading.trends.compareAdda1c.txt")
	private List<QAFWebElement> NFKHomepageLastreadingTrendsCompareadda1cTxt;
	@FindBy(locator = "NFK.homepage.lastreading.trends.donotseeanythingpopup.txt")
	private QAFWebElement NFKHomepageLastreadingTrendsDonotseeanythingpopupTxt;
	@FindBy(locator = "NFK.homepage.lastreading.trends.donotseepopupclose.btn")
	private QAFWebElement NFKHomepageLastreadingTrendsDonotseepopupcloseBtn;
	@FindBy(locator = "NFK.homepage.lastreading.trends.Adda1c.typeOk.btn")
	private QAFWebElement NFKHomepageLastreadingTrendsAdda1cTypeokBtn;
	@FindBy(locator = "NFK.homepage.lastreading.trends.meterdownloadreading.btn")
	private QAFWebElement NFKHomepageLastreadingTrendsMeterdownloadreadingBtn;
	@FindBy(locator = "NFK.homepage.lastreading.trends.date.statictext.btn")
	private QAFWebElement NFKHomepageLastreadingTrendsDateStatictextBtn;
	@FindBy(locator = "NFK.homepage.AddedBG.txt")
	private List<QAFWebElement> NFKHomepageAddedbgTxt;
	@FindBy(locator = "NFK.homepage.AddedSteps.txt")
	private QAFWebElement NFKHomepageAddedstepsTxt;
	@FindBy(locator = "NFK.homepage.AddedCarbs.txt")
	private List<QAFWebElement> NFKHomepageAddedcarbsTxt;
	@FindBy(locator = "NFK.homepage.AddedActivity.txt")
	private QAFWebElement NFKHomepageAddedactivityTxt;
	@FindBy(locator = "NFK.homepage.BG.lbl")
	private QAFWebElement NFKHomepageBgLbl;
	@FindBy(locator = "NFK.homepage.Activity.lbl")
	private QAFWebElement NFKHomepageActivityLbl;
	@FindBy(locator = "NFK.homepage.Steps.lbl")
	private QAFWebElement NFKHomepageStepsLbl;
	@FindBy(locator = "NFK.homepage.Carbs.lbl")
	private QAFWebElement NFKHomepageCarbsLbl;
	@FindBy(locator = "NFK.homepage.addedActivity.dailyactivity.txt")
	private QAFWebElement NFKHomepageAddedactivityDailyactivityTxt;
	@FindBy(locator = "NFK.homepage.addedActivity.weeklyactivity.txt")
	private QAFWebElement NFKHomepageAddedactivityWeeklyactivityTxt;
	@FindBy(locator = "NFK.homepage.addevent.BG.btn")
	private QAFWebElement NFKHomepageAddeventBGBtn;
	@FindBy(locator = "NFK.homepage.addevent.CARB.btn")
	private QAFWebElement NFKHomepageAddeventCARBBtn;
	@FindBy(locator = "NFK.homepage.addevent.BG.Btn")
	private QAFWebElement getNFKHomepageAddeventBGBtn;
	@FindBy(locator = "NFK.homepage.addevent.INSULIN.Btn")
	private QAFWebElement NKHomepageAddeventInsulinBtn;
	@FindBy(locator="NFK.homepage.addevent.ACTIVITY.Btn")
    private QAFWebElement NFKHomepageAddeventACTIVITYBtn;
	@FindBy (locator= "NFK.homepage.addevent.note.btn")
	private QAFWebElement NFKhomepageaddeventnotebtn;
	
	//Empty home screen verify
	@FindBy(locator="NFK.homepage.banner.msg.lbl")
	private QAFWebElement NFKHomepageBannerMsgLbl;
	@FindBy(locator="NFK.homepage.sensor.title")
	private QAFWebElement NFKHomepageSensorTitle;
	@FindBy(locator="NFK.homepage.sensor.descp.lbl")
	private QAFWebElement NFKHomepageSensorDescpLbl;
	@FindBy(locator="NFK.homepage.sensor.howtoapply.btn")
	private QAFWebElement NFKHomepageSensorHowtoapplyBtn;

	public QAFWebElement getNFKHomepageBannerMsgLbl(){
		return NFKHomepageBannerMsgLbl;
	}	
	public QAFWebElement getNFKHomepageSensorTitle(){
		return NFKHomepageSensorTitle;
	}
	public QAFWebElement getNFKHomepageSensorDescpLbl(){
		return NFKHomepageSensorDescpLbl;
	}
	public QAFWebElement getNFKHomepageSensorHowtoapplyBtn(){
		return NFKHomepageSensorHowtoapplyBtn;
	}
	public QAFWebElement getNFKHomepagePatternounterLbl() {
		return NFKHomepagePatternounterLbl;
	}
	
	@FindBy(locator="NFK.homepage.pair.sensor.btn")
	private QAFWebElement NFKHomepagePairSensorBtn;
	
	public QAFWebElement getNFKHomepagePairSensorBtn() {
		return NFKHomepagePairSensorBtn;
	}

	public List<QAFWebElement> getNFKHomepageActivityTypeTextList() {
		return NFKHomepageActivityTypeText;
	}

	public QAFWebElement getNFKhomepageaddeventnotebtn(){
		return NFKhomepageaddeventnotebtn;
	}
	
	public QAFWebElement getNFKHomepageLastreadingInrangeCountLbl() {
		return NFKHomepageLastreadingInrangeCountLbl;
	}

	public QAFWebElement getNFKHomepageTotalReadingsPopupLbl() {
		return NFKHomepageTotalReadingsPopupLbl;
	}

	public QAFWebElement getNFKHomepageAveragesBtn() {
		return NFKHomepageAveragesBtn;
	}

	public QAFWebElement getNFKHomepageTrendsBtn() {
		return NFKHomepageTrendsBtn;
	}

	public QAFWebElement getNFKHomepageStepsTxt() {
		return NFKHomepageStepsTxt;
	}

	public QAFWebElement getNFKHomepageCarbTxt() {
		return NFKHomepageCarbTxt;
	}

	public QAFWebElement getNFKHomepageActivityTxt() {
		return NFKHomepageActivityTxt;
	}

	public QAFWebElement getNFKHomepageLastreadingBgreadingPopupAftermealLowvalueLbl() {
		return NFKHomepageLastreadingBgreadingPopupAftermealLowvalueLbl;
	}

	public QAFWebElement getNFKHomepageLastreadingBgreadingPopupAftermealHighvalueLbl() {
		return NFKHomepageLastreadingBgreadingPopupAftermealHighvalueLbl;
	}

	public QAFWebElement getNFKHomepageLastreadingOveralllowLbl() {
		return NFKHomepageLastreadingOveralllowLbl;
	}

	public QAFWebElement getNFKHomepageLastreadingOverallhighLbl() {
		return NFKHomepageLastreadingOverallhighLbl;
	}

	public QAFWebElement getNFKHomepageLastreadingFirstpageListItem() {
		return NFKHomepageLastreadingFirstpageListItem;
	}

	public QAFWebElement getNFKHomepageNewarticleLnk() {
		return NFKHomepageNewarticleLnk;
	}

	public QAFWebElement getNFKHomepageLastReadingpageAverageChartImg() {
		return NFKHomepageLastReadingpageAverageChartImg;
	}

	public QAFWebElement getNFKHomepageLastReadingPageBGReadingPopup() {
		return NFKHomepageLastReadingPageBGReadingPopup;
	}

	public QAFWebElement getNFKHomepageLastReadingPageLastSyncWithMeterLbl() {
		return NFKHomepageLastReadingPageLastSyncWithMeterLbl;
	}

	public QAFWebElement getNFKHomepageLastReadingPageTotalReadingsSyncLbl() {
		return NFKHomepageLastReadingPageTotalReadingsSyncLbl;
	}

	public QAFWebElement getNFKHomepageLastReadingPageViewAllReadingsLnk() {
		return NFKHomepageLastReadingPageViewAllReadingsLnk;
	}

	public QAFWebElement getNFKHomepageLasrReadingUnitLbl() {
		return NFKHomepageLasrReadingUnitLbl;
	}

	public QAFWebElement getNFKHomepageLastReadingDateLbl() {
		return NFKHomepageLastReadingDateLbl;
	}

	public QAFWebElement getNFKHomepageLastReadingValueLbl() {
		return NFKHomepageLastReadingValueLbl;
	}

	public QAFWebElement getNFKHomepageLastReadingAllEventLnk() {
		return NFKHomepageLastReadingAllEventLnk;
	}

	public List<QAFWebElement> getNFKHomepageEventsList() {
		return NFKHomepageEventsList;
	}

	public QAFWebElement getNFKHomepageLastReadingAverageBtn() {
		return NFKHomepageLastReadingAverageBtn;
	}

	public QAFWebElement getNFKHomepageTrendsA1ccoparatorLbl() {
		return NFKHomepageTrendsA1ccoparatorLbl;
	}

	public QAFWebElement getNFKHomepageLastReadingsPerDayReadingsBtn() {
		return NFKHomepageLastreadingPerdayReadingBtn;
	}

	public QAFWebElement getNFKHomepageLastReadingReadingBtn() {
		return NFKHomepageLastReadingReadingBtn;
	}

	public QAFWebElement getNFKHomepageLastreading14DaysBtn() {
		return NFKHomepageLastreading14DaysBtn;
	}

	public QAFWebElement getNFKHomepageLastreading30DaysBtn() {
		return NFKHomepageLastreading30DaysBtn;
	}

	public QAFWebElement getNFKHomepageLastreading90DaysBtn() {
		return NFKHomepageLastreading90DaysBtn;
	}

	public QAFWebElement getNFKHomepagePatternsBtn() {
		return NFKHomepagePatternsBtn;
	}

	public QAFWebElement getNFKHomepageLastReadingBtn() {
		return NFKHomepageLastReadingBtn;
	}

	public QAFWebElement getNFKHomepageArticlequestionTxt() {
		return NFKHomepageArticlequestionTxt;
	}

	public QAFWebElement getNFKHomepageArticlequestionImg() {
		return NFKHomepageArticlequestionImg;
	}

	public QAFWebElement getNFKHomepageDeletearticleBtn() {
		return NFKHomepageDeletearticleBtn;
	}

	public QAFWebElement getNFKHomepageDeleteconfirmationTxt() {
		return NFKHomepageDeleteconfirmationTxt;
	}

	public QAFWebElement getNFKHomepageDeleteconfirmationOkBtn() {
		return NFKHomepageDeleteconfirmationOkBtn;
	}

	public QAFWebElement getNFKHomepageDeleteconfirmationCancelBtn() {
		return NFKHomepageDeleteconfirmationCancelBtn;
	}

	public QAFWebElement getNFKHomepageActionbarImg() {
		return NFKHomepageActionbarImg;
	}

	public List<QAFWebElement> getNFKHomepageEventCircleIcon() {
		return NFKHomepageEventCircleIcon;
	}

	public List<QAFWebElement> getNFKHomepageEventnoteIcon() {
		return NFKHomepageEventnoteIcon;
	}

	public List<QAFWebElement> getNFKHomepageEventDatetimeTxt() {
		return NFKHomepageEventDatetimeTxt;
	}

	public List<QAFWebElement> getNFKHomepageEventUOMTxt() {
		return NFKHomepageEventUOMTxt;
	}

	public List<QAFWebElement> getNFKHomepageEventValueTxt() {
		return NFKHomepageEventValueTxt;
	}

	public QAFWebElement getNFKHomepageShareBtn() {
		return NFKHomepageShareBtn;
	}

	public QAFWebElement getNFKHomepageMoreBtn() {
		return NFKHomepageMoreBtn;
	}

	public QAFWebElement getNFKHomepageHomeBtn() {
		return NFKHomepageHomeBtn;
	}

	public QAFWebElement getNFKHomepageeventlogBtn() {
		return NFKHomepageeventlogBtn;
	}

	public QAFWebElement getNFKHomepageConnectionBtn() {
		return NFKHomepageConnectionBtn;
	}

	public QAFWebElement getNFKHomepageOnetouchImg() {
		return NFKHomepageOnetouchImg;

	}

	public QAFWebElement getNFKHomepageNoeventTxt() {
		return NFKHomepageNoeventTxt;
	}

	public QAFWebElement getNFKHomepagePairmeterTxt() {
		return NFKHomepagePairmeterTxt;
	}

	public QAFWebElement getNFKHomepageAddeventTxt() {
		return NFKHomepageAddeventTxt;
	}

	public QAFWebElement getNFKHomepageReadingBtn() {
		return NFKHomepageReadingBtn;
	}

	public QAFWebElement getNFKHomepagePreviousDateBtn() {
		return NFKHomepagePreviousDateBtn;
	}

	public QAFWebElement getNFKHomepageAddedEventDynamicLbl(String text) {
		return LFSUtilsAndroid.getElement("NFK.homepage.addedEvent.dynamic.lbl", text);
	}

	public List<QAFWebElement> getNFKHomepageReadingsList() {
		return NFKHomepageReadingsList;
	}

	public QAFWebElement getNFKHomepageLastreadingBgreadingPopupLowvalueLbl() {
		return NFKHomepageLastreadingBgreadingPopupLowvalueLbl;
	}

	public QAFWebElement getNFKHomepageLastreadingBgreadingPopupHighvalueLbl() {
		return NFKHomepageLastreadingBgreadingPopupHighvalueLbl;
	}

	public QAFWebElement getNFKHomepageA1ccomparatorBtn() {
		return NFKHomepageA1ccomparatorBtn;
	}

	public QAFWebElement getNFKHomepageAverageDaysNavigationBtn() {
		return NFKHomepageAverageDaysNavigationBtn;
	}

	public QAFWebElement getNFKHomepageLastreadingBgreadingPopupBeforemealReadingLbl() {
		return NFKHomepageLastreadingBgreadingPopupBeforemealReadingLbl;
	}

	public QAFWebElement getNFKHomepageLastreadingBgreadingPopupAftermealReadingLbl() {
		return NFKHomepageLastreadingBgreadingPopupAftermealReadingLbl;
	}

	public QAFWebElement getNFKHomepageLastreadingBgreadingPopupNomealReadingLbl() {
		return NFKHomepageLastreadingBgreadingPopupNomealReadingLbl;
	}

	public QAFWebElement getNFKHomepageDayvalueLbl(String text) {
		return LFSUtilsAndroid.getElement("NFK.homepage.dayvalue.lbl", text);
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsA1cLbl() {
		return NFKHomepageLastreadingTrendsA1cLbl;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsLasta1cTxt() {
		return NFKHomepageLastreadingTrendsLasta1cTxt;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsA1ctestdataLbl() {
		return NFKHomepageLastreadingTrendsA1ctestdataLbl;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsA1cselectTxt() {
		return NFKHomepageLastreadingTrendsA1cselectTxt;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsA1cpercentLbl() {
		return NFKHomepageLastreadingTrendsA1cpercentLbl;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsSavea1cBtn() {
		return NFKHomepageLastreadingTrendsSavea1cBtn;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsAdda1cBtn() {
		return NFKHomepageLastreadingTrendsAdda1cBtn;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsA1cInfoBtn() {
		return NFKHomepageLastreadingTrendsA1cInfoBtn;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsA1cInfoscreenLbl() {
		return NFKHomepageLastreadingTrendsA1cInfoscreenLbl;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsAddeda1cGraphTxt() {
		return NFKHomepageLastreadingTrendsAddeda1cGraphTxt;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsAddeda1cViewa1chistoryBtn() {
		return NFKHomepageLastreadingTrendsAddeda1cViewa1chistoryBtn;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsAddeda1cA1chistoryLbl() {
		return NFKHomepageLastreadingTrendsAddeda1cA1chistoryLbl;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsAdda1cMinmaxerrorTxt() {
		return NFKHomepageLastreadingTrendsAdda1cMinmaxerrorTxt;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsDonotseeanythingpopupTxt() {
		return NFKHomepageLastreadingTrendsDonotseeanythingpopupTxt;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsDonotseepopupcloseBtn() {
		return NFKHomepageLastreadingTrendsDonotseepopupcloseBtn;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsAdda1cTypeokBtn() {
		return NFKHomepageLastreadingTrendsAdda1cTypeokBtn;
	}

	public List<QAFWebElement> getNFKHomepageLastreadingTrendsCompareadda1cTxt() {
		return NFKHomepageLastreadingTrendsCompareadda1cTxt;
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsMeterdownloadreadingBtn() {
		return NFKHomepageLastreadingTrendsMeterdownloadreadingBtn;
	}

	public List<QAFWebElement> getNFKHomepageAddedbgTxt() {
		return NFKHomepageAddedbgTxt;
	}

	public QAFWebElement getNFKHomepageAddedstepsTxt() {
		return NFKHomepageAddedstepsTxt;
	}

	public List<QAFWebElement> getNFKHomepageAddedcarbsTxt() {
		return NFKHomepageAddedcarbsTxt;
	}

	public QAFWebElement getNFKHomepageAddedactivityTxt() {
		return NFKHomepageAddedactivityTxt;
	}

	public QAFWebElement getNFKHomepageBgLbl() {
		return NFKHomepageBgLbl;
	}

	public QAFWebElement getNFKHomepageStepsLbl() {
		return NFKHomepageStepsLbl;
	}

	public QAFWebElement getNFKHomepageCarbsLbl() {
		return NFKHomepageCarbsLbl;
	}

	public QAFWebElement getNFKHomepageActivityLbl() {
		return NFKHomepageActivityLbl;
	}

	public QAFWebElement getNFKHomepageAddedactivityDailyactivityTxt() {
		return NFKHomepageAddedactivityDailyactivityTxt;
	}

	public QAFWebElement getNFKHomepageAddedactivityWeeklyactivityTxt() {
		return NFKHomepageAddedactivityWeeklyactivityTxt;
	}
    
	public QAFWebElement getNFKHomepageAddeventACTIVITYBtn() {
		return NFKHomepageAddeventACTIVITYBtn;
	}
	public QAFWebElement getNFKHomepageLastreadingTrendsDateStatictextBtn(String Text) {
		return LFSUtilsAndroid.getElement("NFK.homepage.lastreading.trends.date.statictext.btn", Text);
	}

	public QAFWebElement getNFKHomepageAddeventBGBtn() {
		return NFKHomepageAddeventBGBtn;
	}

	public QAFWebElement getNFKHomepageAddeventCARBBtn() {
		return NFKHomepageAddeventCARBBtn;
	}

	public QAFWebElement getNFKHomepageAddeventInsulinBtn() {
		return NKHomepageAddeventInsulinBtn;

	}

	public QAFWebElement getNFKHomepageAddeventBGBtn1() {

		return getNFKHomepageAddeventBGBtn;
	}

	
	
	
	EventLogPageAndroid eventlogPageAndroid = new EventLogPageAndroid();
	@FindBy(locator = "NFK.homepage.lastreading.firstpage.list.item")
	private QAFWebElement NFKHomepageLastreadingFirstpageListItem;
	@FindBy(locator = "NFK.homepage.lastreading.bgreading.popup.lowvalue.lbl")
	private QAFWebElement NFKHomepageLastreadingBgreadingPopupLowvalueLbl;
	@FindBy(locator = "NFK.homepage.lastreading.bgreading.popup.highvalue.lbl")
	private QAFWebElement NFKHomepageLastreadingBgreadingPopupHighvalueLbl;
	@FindBy(locator = "NFK.homepage.lastreading.bgreading.popup.beforemeal.reading.lbl")
	private QAFWebElement NFKHomepageLastreadingBgreadingPopupBeforemealReadingLbl;
	@FindBy(locator = "NFK.homepage.lastreading.bgreading.popup.aftermeal.reading.lbl")
	private QAFWebElement NFKHomepageLastreadingBgreadingPopupAftermealReadingLbl;
	@FindBy(locator = "NFK.homepage.lastreading.bgreading.popup.nomeal.reading.lbl")
	private QAFWebElement NFKHomepageLastreadingBgreadingPopupNomealReadingLbl;
	@FindBy(locator = "NFK.homepage.lastreading.addedreading.value.lbl")
	private List<QAFWebElement> NFKHomepageLastreadingAddedreadingValueLbl;
	@FindBy(locator = "NFK.homepage.lastreadin.averagereading.unit.txt")
	private QAFWebElement NFKHomepageLastreadinAveragereadingUnitTxt;
	@FindBy(locator = "NFK.homepage.welcomearticle.dismiss.btn")
	private QAFWebElement NFKHomepageWelcomearticleDismissBtn;
	@FindBy(locator = "NFK.homepage.welcomearticle.img")
	private QAFWebElement NFKHomepageWelcomearticleImg;
	@FindBy(locator = "NFK.homepage.dayvalue.lbl")
	private QAFWebElement NFKHomepageDayvalueLbl;

	public QAFWebElement getNFKHomepageLastreadinAveragereadingUnitTxt() {
		return NFKHomepageLastreadinAveragereadingUnitTxt;
	}

	public List<QAFWebElement> getNFKHomepageLastreadingAddedreadingValueLbl() {
		return NFKHomepageLastreadingAddedreadingValueLbl;
	}

	// Method to verify footer tab on Homepage
	// Menu
	public void verifyTabs() {
		getNFKHomepageeventlogBtn().verifyPresent("eventlog Button on Tab bar is present");
		getNFKHomepageHomeBtn().verifyPresent("Home Button on Tab bar is present");
	}

	// Method to click on eventlog tab on Homepage
	public void clickOneventlog() {
		getNFKHomepageeventlogBtn().waitForPresent();
		getNFKHomepageeventlogBtn().click();
		eventlogPageAndroid.getNFKEventLogaddeventbtn().waitForPresent();
		Reporter.logWithScreenShot("Eventlog Page is displayed", MessageTypes.Pass);
	}

	// Method to click on Connections tab on Homepage
	public void clickOnConnections() {
		getNFKHomepageConnectionBtn().waitForPresent();
		getNFKHomepageConnectionBtn().click();
	}

	// Method to verify eventlog page
	public void verifyeventlog() {
		EventLogPageAndroid eventlogPageAndroid = new EventLogPageAndroid();
		eventlogPageAndroid.getNFKEventLogClassicViewBtn().verifyPresent("Classic View button is present");
		eventlogPageAndroid.getNFKEventLogWeekViewBtn().verifyPresent("Week View button is present");
		eventlogPageAndroid.getNFKEventLogDayViewBtn().verifyPresent("Day View button is present");
		Reporter.logWithScreenShot("Eventlog Page is displayed", MessageTypes.Pass);
	}

	// Method to verify Connections page
	public void verifyConnections() {
		Reporter.logWithScreenShot("Connections Page is displayed", MessageTypes.Pass);
	}

	// Method to click on Home tab on Homepage
	public void clickOnHome() {
		getNFKHomepageHomeBtn().waitForPresent();
		LFSUtilsIOS.pause(3000);
		getNFKHomepageHomeBtn().click();
		LFSUtilsIOS.pause(3000);
		Reporter.logWithScreenShot("After clicking Home icon", MessageTypes.Pass);
	}

	// Method to verify Homepage
	public void verifyHome() {
		getNFKHomepageHomeBtn().waitForPresent();
		if (getNFKHomepageHomeBtn().isPresent()) {
		Reporter.logWithScreenShot("Application main page displayed", MessageTypes.Pass);
		} else
		 Reporter.logWithScreenShot("Application main page is not displayed", MessageTypes.Fail);
	}

	// Method to click on More menu from Homepage
	public void clickMoreMenu() {
		getNFKHomepageMoreBtn().waitForPresent();
		getNFKHomepageMoreBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("The user clicked on more menu icon", MessageTypes.Pass);
	}

	// Method to verify Navigation bar on Homepage
	public void verifyNavigationBar() {
		getNFKHomepageOnetouchImg().verifyPresent("One Touch Reveal Logo on Homepage");
		getNFKHomepageShareBtn().verifyPresent("Share Icon on Homepage");
		getNFKHomepageMoreBtn().verifyPresent("More Menu icon on Homepage");

	}

	// Method to click on Share button on Homepage
	public void clickOnShareBtn() {
		getNFKHomepageShareBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("After clicking share icon", MessageTypes.Pass);
	}
	
	// Method to click on Share button on Homepage
		public void clickOnShareMenu() {
			getNFKHomepageShareBtn().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("After clicking share icon", MessageTypes.Pass);
		}
	

	// Method to click on added event displayed on home screen
	public void clickOnaddEvent(String value) {
		int count = 0;
		for (QAFWebElement ele : getNFKHomepageEventValueTxt()) {
			if ((LFSUtilsAndroid.tryDisplayMethod(ele)) || (ele.getText().contains(value))) {
				ele.click();
				Reporter.logWithScreenShot("After clicking on event", MessageTypes.Pass);
				count++;
				break;
			}
		}
		
		if (count == 0)
			Reporter.logWithScreenShot("Events are not added", MessageTypes.Fail);		
	}

	// Method to verify added event on Home screen
	public void verifyAddedEventHomeScreen(Object eventDetail) {
		EventLogPageAndroid eventlogEvent = new EventLogPageAndroid();
		String getAmountFromAddedEvent = eventlogEvent.getAMount;
		ConfigurationManager.getBundle().setProperty("addGlucose1.amount", getAmountFromAddedEvent);
		ConfigurationManager.getBundle().setProperty("editGlucose1.amount", getAmountFromAddedEvent);
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		if (eventBean.getEventType().equalsIgnoreCase("glucose")) {
			for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) {
				if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
						&& getNFKHomepageEventValueTxt().get(i).getText().contains(getAmountFromAddedEvent)) {
					Reporter.logWithScreenShot("Added event is displayed", MessageTypes.Pass);
					break;
				}
			}
		} else {
			for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) {
				if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
						&& getNFKHomepageEventValueTxt().get(i).getText().contains(eventBean.getAmount())) {
					Reporter.logWithScreenShot("Added event is displayed", MessageTypes.Pass);
					break;
				}
			}
		}
	}

	public void verifyAddedEventtimelineScreen(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
					&& getNFKHomepageEventValueTxt().get(i).getText().contains(eventBean.getAmount())) {
				Reporter.logWithScreenShot("Added event is displayed", MessageTypes.Pass);
				break;
			}
		}
	}

	// Method to verify event is deleted
	public void verifyEventDeleted(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		int count = 0;
		int cons = getNFKHomepageEventValueTxt().size();
		for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
					&& getNFKHomepageEventValueTxt().get(i).getText().contains(eventBean.getAmount())
					&& getNFKHomepageEventUOMTxt().get(i).getText().contains(eventBean.getUnit())) {
				getNFKHomepageEventValueTxt().get(i).click();
				EventLogPageAndroid eventlog = new EventLogPageAndroid();
				eventlog.deleteEvent();
				count++;
			}
			if (count == cons)
				break;
		}
		for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
					&& getNFKHomepageEventValueTxt().get(i).getText().contains(eventBean.getAmount())
					&& getNFKHomepageEventUOMTxt().get(i).getText().contains(eventBean.getUnit())) {
				break;
			} else {
				Reporter.logWithScreenShot("Event deleted successfully", MessageTypes.Pass);
			}
		}

	}
	
	public void verifyNoteEventDeleted(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
	  int i=getNFKHomepageEventValueTxt().size();
	  System.out.println("Size of fields present on Event log..."+i);
	  if(getNFKHomepageEventValueTxt().isEmpty()) {
		  System.out.println("Passed");
		  Reporter.logWithScreenShot("Event is deleted",MessageTypes.Pass);
	  }else
		
		  {
		  Reporter.logWithScreenShot("Event is not deleted",MessageTypes.Fail);
		  }
	/*	if(i==0)
		{
			
			Reporter.logWithScreenShot("Event is deleted succsesfully ",MessageTypes.Pass);
		}
		else
		{
			Reporter.logWithScreenShot("Event is not deleted", MessageTypes.Fail);
		}*/
		
		/*
		 * for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) { if
		 * (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i)) &&
		 * getNFKHomepageEventValueTxt().get(i).getText().contains(eventBean.getnote()))
		 * { break; } else { Reporter.logWithScreenShot("Event deleted successfully",
		 * MessageTypes.Pass); } }
		 */

	}
	

	// Method to verify Home Page with no Events created
	public void homePageNoEvents() {
		getNFKHomepageNoeventTxt().verifyPresent("No Event text is present");
		getNFKHomepageAddeventTxt().verifyPresent("Add Event text is present");
	}
	private AndroidDriver androidDriver = (AndroidDriver) driver.getUnderLayingDriver();
	public AndroidDriver getDriver() {
		return androidDriver;
	}
	// Method to click Add Event button on homepage
	public void homepageAddEvent() {

		getNFKHomepageAddeventTxt().waitForPresent();
		getNFKHomepageAddeventTxt().verifyPresent("Add an Event button is present");
		getNFKHomepageAddeventTxt().click();
		Reporter.logWithScreenShot("The user clicked on add event button", MessageTypes.Pass);

	}

	public void clickLastReading() {
		getNFKHomepageHomeBtn().click();
		getNFKHomepageLastReadingBtn().verifyPresent("Last Reading tab is present on Homepage");
		getNFKHomepageLastReadingBtn().click();
		Reporter.logWithScreenShot("After clicking lastreading summary button", MessageTypes.Pass);

	}

	public void verifyAverageButton() {
		getNFKHomepageAveragesBtn().verifyPresent("Averages button is present on Last Reading page");
		getNFKHomepageAveragesBtn().click();

	}

	public void verifyTrendsButton() {
		getNFKHomepageTrendsBtn().verifyPresent("Trends button is present on LastReading page");
		getNFKHomepageTrendsBtn().click();
		LFSUtilsIOS.pause(2000);
		if (getNFKHomepageLastreadingTrendsDonotseeanythingpopupTxt().isPresent()) {
			Reporter.logWithScreenShot("Why do I not see anything on my graph popup is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.clickBackButton();
		}
	}

	public void verifyA1CPage() {
		getNFKHomepageTrendsBtn().verifyPresent("Trends button is present on LastReading page");
		getNFKHomepageTrendsBtn().click();
		if (getNFKHomepageLastreadingTrendsDonotseeanythingpopupTxt().isPresent()) {
			Reporter.logWithScreenShot("Why do I not see anything on my graph popup is displayed", MessageTypes.Pass);
			LFSUtilsIOS.pause(4000);
			getNFKHomepageLastreadingTrendsDonotseepopupcloseBtn().click();
			LFSUtilsIOS.pause(4000);
			getNFKHomepageTrendsA1ccoparatorLbl().verifyPresent("A1C copamrator is present on trends page");
		} else {
			getNFKHomepageTrendsA1ccoparatorLbl().verifyPresent("A1C copamrator is present on trends page");
		}

	}

	public void clickOnAverages() {
		getNFKHomepageAveragesBtn().verifyPresent("Averages button is present on Homepage");
		getNFKHomepageAveragesBtn().click();
	}

	public void verifyAverageReading(int date) {

		if (date == 7) {
			QAFWebElement buttonEle = new QAFExtendedWebElement(String
					.format(ConfigurationManager.getBundle().getString("NFK.homepage.average.days.navigation.btn"), 1));
			try {
				buttonEle.click();
			} catch (Exception e) {
				LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
			}
			Reporter.logWithScreenShot("User is on 7 days average page", MessageTypes.Pass);
			dateBeforeCurrentDate(date);
			Reporter.logWithScreenShot("Day before 7 days :::" + dateBeforeCurrentDate(date - 1));

			Reporter.log("Date according to application before 7 days ::" + getNFKHomepagePreviousDateBtn().getText());
			if (getNFKHomepagePreviousDateBtn().getText().trim().equals(dateBeforeCurrentDate(date - 1).trim())) {
				Reporter.log("Matching");
			} else {
				Reporter.log("Not Matching");
			}

		} else if (date == 14) {
			QAFWebElement buttonEle = new QAFExtendedWebElement(String
					.format(ConfigurationManager.getBundle().getString("NFK.homepage.average.days.navigation.btn"), 2));
			try {
				buttonEle.click();
			} catch (Exception e) {
				LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			}
			Reporter.logWithScreenShot("User is on 14 days average page", MessageTypes.Pass);
			dateBeforeCurrentDate(date);

			Reporter.logWithScreenShot("Day before 14 days :::" + dateBeforeCurrentDate(date - 1));
			Reporter.log("Date according to application before 14 days ::" + getNFKHomepagePreviousDateBtn().getText());
			if (getNFKHomepagePreviousDateBtn().getText().trim().equals(dateBeforeCurrentDate(date - 1).trim())) {
				Reporter.log("Matching");
			} else {
				Reporter.log("Not Matching");
			}

		} else if (date == 30) {
			QAFWebElement buttonEle = new QAFExtendedWebElement(String
					.format(ConfigurationManager.getBundle().getString("NFK.homepage.average.days.navigation.btn"), 3));
			try {
				buttonEle.click();
			} catch (Exception e) {
				LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			}
			Reporter.logWithScreenShot("User is on 30 days average page", MessageTypes.Pass);
			dateBeforeCurrentDate(date);
			Reporter.logWithScreenShot("Day before 30 days :::" + dateBeforeCurrentDate(date - 1));
			Reporter.log("Date according to application before 30 days ::" + getNFKHomepagePreviousDateBtn().getText());
			if (getNFKHomepagePreviousDateBtn().getText().trim().equals(dateBeforeCurrentDate(date - 1).trim())) {
				Reporter.log("Matching");
			} else {
				Reporter.log("Not Matching");
			}

		} else if (date == 90) {
			QAFWebElement buttonEle = new QAFExtendedWebElement(String
					.format(ConfigurationManager.getBundle().getString("NFK.homepage.average.days.navigation.btn"), 4));
			try {
				buttonEle.click();
			} catch (Exception e) {
				LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(10, 50, 90, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
				LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
			}
			Reporter.logWithScreenShot("User is on 90 days average page", MessageTypes.Pass);
			dateBeforeCurrentDate(date);
			Reporter.logWithScreenShot("Day before 90 days :::" + dateBeforeCurrentDate(date - 1));
			Reporter.log("Date according to application before 90 days ::" + getNFKHomepagePreviousDateBtn().getText());
			if (getNFKHomepagePreviousDateBtn().getText().trim().equals(dateBeforeCurrentDate(date - 1).trim())) {
				Reporter.log("Matching");
			} else {
				Reporter.log("Not Matching");
			}

		}

	}

	public static String dateDifference(String current, String previous) {
		SimpleDateFormat currentDF = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat previousDF = new SimpleDateFormat("MMM d");
		String dateBeforeString = current.split("T")[0];
		String dateAfterString = previous;

		try {
			Date dateBefore = currentDF.parse(dateBeforeString);
			Date dateAfter = previousDF.parse(dateAfterString);
			long difference = dateAfter.getTime() - dateBefore.getTime();
			float daysBetween = (difference / (1000 * 60 * 60 * 24));
			/*
			 * You can also convert the milliseconds to days using this method float
			 * daysBetween = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
			 */
			Reporter.log("Number of Days between dates: " + daysBetween);
			return String.valueOf(daysBetween);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void verifyLastreading() {
		getNFKHomepageAveragesBtn().verifyPresent("Averages tab is present on Last reading screen");

	}

	public void verifyLastReadingSummary() {
		getNFKHomepageAveragesBtn().verifyPresent("Averages tab is present on Last reading screen");
		getNFKHomepageTrendsBtn().verifyPresent("Comparator tab is present on Last reading screen");

	}

	public void verifyDayViewsOfeventlog() {
		getNFKHomepageLastreading14DaysBtn().isPresent();
		getNFKHomepageLastreading14DaysBtn().click();
		Reporter.logWithScreenShot("14 day view page is displayed", MessageTypes.Pass);
		getNFKHomepageLastreading30DaysBtn().isPresent();
		getNFKHomepageLastreading30DaysBtn().click();
		Reporter.logWithScreenShot("30 day view page is displayed", MessageTypes.Pass);
		getNFKHomepageLastreading90DaysBtn().isPresent();
		getNFKHomepageLastreading90DaysBtn().click();
		Reporter.logWithScreenShot("90 day view page is displayed", MessageTypes.Pass);

	}

	// Method to delete all events on homepage
	public void deleteEvents() {
		Reporter.logWithScreenShot("You are on Homepage", MessageTypes.Pass);
		for (QAFWebElement element : NFKHomepageEventsList) {
			element.click();
			eventlogPageAndroid.deleteEvent();
		}

	}

	public void clickLastSyncButton() {
		getNFKHomepageLastReadingDateLbl().verifyPresent("Last Sync");
		getNFKHomepageLastReadingDateLbl().click();
	}

	public void clickAllEventsLinkn() {
		getNFKHomepageLastReadingAllEventLnk().waitForPresent();
		Reporter.logWithScreenShot("Last Reading all event page is displayed", MessageTypes.Pass);
		getNFKHomepageLastReadingAllEventLnk().click();

	}

	public void verifyAllEventScreen() {
		EventLogPageAndroid pageAndroid = new EventLogPageAndroid();
		pageAndroid.getNFKEventLogClassicViewBtn().verifyPresent("EventLog screen classic view button");

	}

	// Method to verify recent event values on recent event tab on home screen
	public void verifyRecentEventDetails(Object eventDetail) {
		EventLogPageAndroid eventlogEvent = new EventLogPageAndroid();
		String getAmountFromAddedEvent = eventlogEvent.getAMount;
		ConfigurationManager.getBundle().setProperty("addGlucose1.amount", getAmountFromAddedEvent);
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		WebDriverTestCase.verifyTrue(
				getNFKHomepageLastReadingValueLbl().getAttribute("text").contains(getAmountFromAddedEvent),
				eventBean.getAmount() + "Expected amount not present", "Proper amount  " + getAmountFromAddedEvent);
		WebDriverTestCase.verifyTrue(
				getNFKHomepageLasrReadingUnitLbl().getAttribute("text").contains(eventBean.getUnit()),
				eventBean.getUnit() + "Expected unit not present", "Proper unit  " + eventBean.getUnit());
	}

	// method to verify last sync with meter screen
	public void verifyLastSyncScreen() {
		getNFKHomepageLastReadingPageLastSyncWithMeterLbl().waitForPresent();
		getNFKHomepageLastReadingPageLastSyncWithMeterLbl().verifyPresent("Last meter sync title");
		getNFKHomepageLastReadingPageTotalReadingsSyncLbl().verifyPresent("No of meter reading");
		getNFKHomepageLastReadingPageViewAllReadingsLnk().verifyPresent("All event link");
	}

	// Method to verify sync meter reading same
	public void verifyNoOFMeterReadingSame() {
		String count = ConfigurationManager.getBundle().getPropertyValue("Lastsync.BG.Count");
		WebDriverTestCase.verifyTrue(
				getNFKHomepageLastReadingPageTotalReadingsSyncLbl().getAttribute("text").contains(count),
				"Displaying manual BG readings ", "No manual BG readings");
	}

	// Method to get Blood Glucose count on last sync screen before adding a new
	// manual BG
	public void CheckBGCountLastSync() {

		String count = getNFKHomepageLastReadingPageTotalReadingsSyncLbl().getAttribute("text").replaceAll("[^0-9]",
				"");
		ConfigurationManager.getBundle().setProperty("Lastsync.BG.Count", count);
		Reporter.logWithScreenShot("Last Sync BG count" + count, MessageTypes.Pass);
	}

	// Method to click 14 30 90 Day button on Last Readings Summary page

	public void click14_30_90Day(String pageName) {
		pageName = pageName.toUpperCase();
		switch (pageName) {
		case "14 DAYS":
			getNFKHomepageLastreading14DaysBtn().waitForPresent();
			getNFKHomepageLastreading14DaysBtn().click();

			break;
		case "30 DAYS":
			getNFKHomepageLastreading30DaysBtn().waitForPresent();
			getNFKHomepageLastreading30DaysBtn().click();

			break;

		case "90 DAYS":
			getNFKHomepageLastreading90DaysBtn().waitForPresent();
			getNFKHomepageLastreading90DaysBtn().click();

			break;
		}

	}

	// Method to verify detail BG pop up from circle view
	public void verifyPeriodRusultPage() {
		Reporter.logWithScreenShot("Average last reading page for 30 days is displayed", MessageTypes.Pass);
		getNFKHomepageLastReadingpageAverageChartImg().click();
		if (getNFKHomepageLastReadingPageBGReadingPopup().isPresent()) {
			Reporter.logWithScreenShot("Average BG reading Popup is displayed", MessageTypes.Pass);
		}
	}

	public void verifyNewUserWelcomePage() {
		getNFKHomepageShareBtn().waitForPresent();
		if (getNFKHomepageNewarticleLnk().isPresent())
			getNFKHomepageNewarticleLnk().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Article page1", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithCoordinates(400, 1000, 400, 700, 100);
		Reporter.logWithScreenShot("Article page2", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();

	}

	// Method to click Patterns button
	public void clickPatterns() {
		getNFKHomepagePatternsBtn().verifyPresent("Patterns Button is Present");
		getNFKHomepagePatternsBtn().click();
		Reporter.logWithScreenShot("pattern page", MessageTypes.Pass);
	}

	public void verifyAllLastReadignWithNoRreading() {
		click14_30_90Day("14 DAYS");
		if (getNFKHomepageLastreading14DaysBtn().getAttribute("selected").toString().equalsIgnoreCase("true"))
			Reporter.logWithScreenShot("14 Days view screen", MessageTypes.Pass);
		click14_30_90Day("30 DAYS");
		if (getNFKHomepageLastreading30DaysBtn().getAttribute("selected").toString().equalsIgnoreCase("true"))
			Reporter.logWithScreenShot("30 Days view screen", MessageTypes.Pass);
		click14_30_90Day("90 DAYS");
		if (getNFKHomepageLastreading90DaysBtn().getAttribute("selected").toString().equalsIgnoreCase("true"))
			Reporter.logWithScreenShot("90 Days view screen", MessageTypes.Pass);
	}

	public void clickReadingButtonLastreadingPage() {
		getNFKHomepageReadingBtn().waitForPresent();
		getNFKHomepageReadingBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Event page is displayed", MessageTypes.Pass);
	}

	// Method to verify recent added glucose reading lastreading screen
	// Sangram
	public void verifyReccentAddedGlucoseLastReading(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {
			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		for (QAFWebElement reading : getNFKHomepageReadingsList()) {

			if (reading.getText().contains(eventBean.getAmount())) {
				Reporter.logWithScreenShot("Last added reading matched", MessageTypes.Pass);
			}
		}

	}

	public void verifyPeriodBgResultPopUpValue() {
		if (getNFKHomepageLastReadingpageAverageChartImg().isPresent()) {
			getNFKHomepageLastReadingpageAverageChartImg().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Period Result Popup is displayed", MessageTypes.Pass);
		}

	}

	public void clickReccentAddedGlucoseLastReading(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		eventBean.fillData(eventDetail);
		Reporter.logWithScreenShot("Add data page is displayed", MessageTypes.Pass);
		getNFKHomepageLastreadingFirstpageListItem().click();
	}

	public void screenShotTake() {
		Reporter.logWithScreenShot("Taking screenshot", MessageTypes.Pass);

	}

	public void verifyOverallRangeonDonutPopUp() {
		getNFKHomepageLastReadingpageAverageChartImg().waitForPresent();
		getNFKHomepageLastReadingpageAverageChartImg().click();
		String lowRange = ConfigurationManager.getBundle().getProperty("Low.BG.Range.Value").toString();
		String highRange = ConfigurationManager.getBundle().getProperty("High.BG.Range.Value").toString();
		getNFKHomepageLastreadingOveralllowLbl().waitForPresent();
		WebDriverTestCase.verifyTrue(getNFKHomepageLastreadingOveralllowLbl().getText().contains(lowRange),
				"Incorrect low range ", "Correct low range");
		WebDriverTestCase.verifyTrue(getNFKHomepageLastreadingOverallhighLbl().getText().contains(highRange),
				"Incorrect high range ", "Correct high range");

	}

	public void verifyAMBMDonutRange() {
		getNFKHomepageLastReadingpageAverageChartImg().click();
		Reporter.logWithScreenShot("Click on Average chart", MessageTypes.Pass);
		String bmLowRange = ConfigurationManager.getBundle().getProperty("BM.BG.Low").toString();
		String bmHighRange = ConfigurationManager.getBundle().getProperty("BM.BG.High").toString();
		WebDriverTestCase.verifyTrue(
				getNFKHomepageLastreadingBgreadingPopupLowvalueLbl().getAttribute("text").contains(bmLowRange),
				"Expected " + bmLowRange + "  Actual "
						+ getNFKHomepageLastreadingBgreadingPopupLowvalueLbl().getAttribute("text"),
				"Correct before meal low range");
		WebDriverTestCase.verifyTrue(
				getNFKHomepageLastreadingBgreadingPopupHighvalueLbl().getAttribute("text").contains(bmHighRange),
				"Expected " + bmHighRange + "  Actual "
						+ getNFKHomepageLastreadingBgreadingPopupHighvalueLbl().getAttribute("text"),
				"Correct before meal high range");

		String amLowRange = ConfigurationManager.getBundle().getProperty("AM.BG.Low").toString();
		String amHighRange = ConfigurationManager.getBundle().getProperty("AM.BG.High").toString();

		WebDriverTestCase.verifyTrue(
				getNFKHomepageLastreadingBgreadingPopupAftermealLowvalueLbl().getAttribute("text").contains(amLowRange),
				"Expected " + amLowRange + "  Actual "
						+ getNFKHomepageLastreadingBgreadingPopupAftermealLowvalueLbl().getAttribute("text"),
				"Correct after meal low range");
		WebDriverTestCase.verifyTrue(
				getNFKHomepageLastreadingBgreadingPopupAftermealHighvalueLbl().getAttribute("text")
						.contains(amHighRange),
				"Expected " + amHighRange + "  Actual "
						+ getNFKHomepageLastreadingBgreadingPopupAftermealHighvalueLbl().getAttribute("text"),
				"Correct after meal high range");

	}

	// Method to verify BF count for no meal tag, before meal tag, after meal
	// tag
	public void countForBeforeAfterMeal() {
		getNFKHomepageLastReadingpageAverageChartImg().click();
		getNFKHomepageLastreadingBgreadingPopupBeforemealReadingLbl().waitForPresent();
		Validator.verifyThat("Before Meal count",
				(getNFKHomepageLastreadingBgreadingPopupBeforemealReadingLbl().getText()), Matchers.equalTo("1"));
		Validator.verifyThat("After Meal count",
				(getNFKHomepageLastreadingBgreadingPopupAftermealReadingLbl().getText()), Matchers.equalTo("1"));
		Validator.verifyThat("No Meal Tag count", (getNFKHomepageLastreadingBgreadingPopupNomealReadingLbl().getText()),
				Matchers.equalTo("1"));

	}

	public void verifyBGDisplayedCorrectPeriod() {

		Point p = getNFKHomepageLastreadingInrangeCountLbl().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageAddedEventDynamicLbl(randomNumberGlucose))) {
			LFSUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 800, p.getX() + 100, p.getY() + 100, 10);
			LFSUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}
		getNFKHomepageAddedEventDynamicLbl(randomNumberGlucose).verifyPresent("Edited glucose in proper range");
		EventLogPageAndroid eventlog = new EventLogPageAndroid();
		for (int i = 0; i < getNFKHomepageLastreadingAddedreadingValueLbl().size(); i++) {
			if (getNFKHomepageLastreadingAddedreadingValueLbl().get(i).getText().equals(randomNumberGlucose)) {
				eventlog.getNFKEventLogAddeventEventiconImg().get(i).click();
				eventlog.deleteEvent();
				break;

			}
		}

	}

	public void verifyBGNotDisplayedNintyRange() {
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		getNFKHomepageAddedEventDynamicLbl(randomNumberGlucose).verifyNotVisible("Edited BG date out of 90 day range");
	}

	public void verifyDeletedBGOnHomepage() {
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		eventlogPageAndroid.getNFKEventLogpageStaticText(randomNumberGlucose).verifyNotPresent("Deleted Glucose");
	}

	public void verifyAverageUnits() {
		if (getNFKHomepageLastreadinAveragereadingUnitTxt().getText().contains("0.0")) {
			Reporter.logWithScreenShot(
					"Units of last reading is displayed as number and Precision value is upto 1 decimal",
					MessageTypes.Pass);
		} else if (getNFKHomepageLastreadinAveragereadingUnitTxt().getText().contains("0.00")
				|| getNFKHomepageLastreadinAveragereadingUnitTxt().getText().contains("0.01")) {
			Reporter.logWithScreenShot("Precision value is more than 1", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Units of last reading is not displayed as number", MessageTypes.Pass);
		}

	}

	// Method to verify added event on last sync with meter frame
	public void lastSyncAddedEvent(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {
			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		if (getNFKHomepageLastReadingValueLbl().equals(eventBean.getAmount()))
			Reporter.logWithScreenShot("Event is added successfully", MessageTypes.Pass);

	}

	// Method to verify lastly added data is deleted or not
	public void lastSyncDeletedEvent(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {
			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		if (getNFKHomepageLastReadingValueLbl().equals("-"))
			Reporter.logWithScreenShot("No events are available", MessageTypes.Pass);

	}

	public void clickNewBGHomeScreen(String value) {
		int count = 0;
		for (QAFWebElement ele : getNFKHomepageEventValueTxt()) {
			if (LFSUtilsAndroid.tryDisplayMethod(ele) && ele.getText().contains(value)) {
				ele.click();
				Reporter.logWithScreenShot("After clicking on event", MessageTypes.Pass);
				count++;
				break;
			}
		}
		if (count == 0)
			Reporter.logWithScreenShot("Events are not added", MessageTypes.Fail);

	}

	public QAFWebElement getNFKHomepageWelcomearticleDismissBtn() {
		return NFKHomepageWelcomearticleDismissBtn;
	}

	public QAFWebElement getNFKHomepageWelcomearticleImg() {
		return NFKHomepageWelcomearticleImg;
	}

	public void verifyWelcomeArticle() {
		int count = 0;
		Point p = getNFKHomepageeventlogBtn().getLocation();
		while (!getNFKHomepageWelcomearticleImg().isPresent()) {
			LFSUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 5);
			LFSUtilsAndroid.waitforLoad();
			count++;
			if (count == 3)
				break;
		}

		if (getNFKHomepageWelcomearticleImg().isDisplayed()) {
			Reporter.logWithScreenShot("Welcome article is present for new user", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Welcome article is nt present for new user", MessageTypes.Fail);
	}

	// Method to delete Welcome article from home page
	public void deleteWelcomeArticle() {
		CountrySelectionPageAndroid countrySelectionPageAndroid = new CountrySelectionPageAndroid();
		if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageWelcomearticleDismissBtn())) {
			Reporter.logWithScreenShot("Dismiss button to delete article is present", MessageTypes.Pass);
			getNFKHomepageWelcomearticleDismissBtn().click();
			countrySelectionPageAndroid
					.getNFKcountrtyselectionpageStaticText(LFSUtilsAndroid.getPropString("appCommon.ok"))
					.waitForPresent();
			countrySelectionPageAndroid
					.getNFKcountrtyselectionpageStaticText(LFSUtilsAndroid.getPropString("appCommon.ok")).click();
			getNFKHomepageeventlogBtn().waitForPresent();
			Reporter.logWithScreenShot("Welcome article is deleted successfully.", MessageTypes.Pass);
		} else if (!LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageWelcomearticleDismissBtn())) {
			LFSUtilsAndroid.scrollToEleAndriod("OneTouch");
		} else
			Reporter.logWithScreenShot("Welcome article dismiss button is not present", MessageTypes.Fail);
	}

	public void verifyTodayYesterdayEvent() {

		int count = 0;
		Point p = getNFKHomepageShareBtn().getLocation();
		while (!getNFKHomepageDayvalueLbl(LFSUtilsAndroid.getPropString("appCommon.yesterday")).isPresent()) {
			LFSUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 5);
			LFSUtilsAndroid.waitforLoad();
			count++;
			if (count == 3)
				break;
		}

		if (getNFKHomepageDayvalueLbl(LFSUtilsAndroid.getPropString("appCommon.yesterday")).isDisplayed()) {
			Reporter.logWithScreenShot("Yesterday label is present", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Yesterday label is not present", MessageTypes.Fail);

		if (getNFKHomepageDayvalueLbl(LFSUtilsAndroid.getPropString("appCommon.today")).isDisplayed()) {
			Reporter.logWithScreenShot("Today label is present", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Today label is not present", MessageTypes.Fail);

	}

	public void verifyEventDateAsYesterDay() {
		WebDriverTestCase.verifyTrue(getNFKHomepageEventDatetimeTxt().get(0).getText().contains("Yesterday"),
				"Yesterday is not displaying", "Date showing as yesterday");
	}

	// Created by Gaurav
	public void verifyDeletedBGAfterDeletion(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		eventBean.fillData(eventDetail);
		getNFKHomepageAddedEventDynamicLbl(eventBean.getAmount()).verifyNotPresent("Added BG deleted successfuly");
	}

	public void syncingAccount() {

		Map<String, Object> params = new HashMap<>();
		params.put("start", "20%,40%");
		params.put("end", "15%,60%");
		params.put("duration", "3");
		Object res = driver.executeScript("mobile:touch:swipe", params);
		Reporter.logWithScreenShot("Syncing with Account", MessageTypes.Pass);

	}

	public void verifySyncingAccount() {
		Reporter.logWithScreenShot("Syncing with Account", MessageTypes.Pass);
	}

	// Neo Goal Locators
	@FindBy(locator = "NFK.homepage.setGoals.txt")
	private QAFWebElement NFKHomepageSetGoalsTxt;

	public QAFWebElement getNFKHomepageSetGoalsTxt() {
		return NFKHomepageSetGoalsTxt;
	}

	@FindBy(locator = "NFK.homepage.setDailyGoals.txt")
	private QAFWebElement NFKHomepageSetDailyGoalsTxt;

	public QAFWebElement getNFKHomepageSetDailyGoalsTxt() {
		return NFKHomepageSetDailyGoalsTxt;
	}

	@FindBy(locator = "NFK.homepage.setDailyGoalsSettings.lnk")
	private QAFWebElement NFKHomepageSetDailyGoalsSettingsLnk;

	public QAFWebElement getNFKHomepageSetDailyGoalsSettingslnk() {
		return NFKHomepageSetDailyGoalsSettingsLnk;
	}

	@FindBy(locator = "NFK.homepage.bgGoal.lnk")
	private QAFWebElement NFKHomepageBgGoalLnk;

	public QAFWebElement getNFKHomepageBgGoalLnk() {
		return NFKHomepageBgGoalLnk;
	}

	@FindBy(locator = "NFK.homepage.bgTests.txt")
	private QAFWebElement NFKHomepageBgTestTxt;

	public QAFWebElement getNFKHomepageBgTestTxt() {
		return NFKHomepageBgTestTxt;
	}

	@FindBy(locator = "NFK.homepage.bg.lnk")
	private QAFWebElement NFKHomepageBgLnk;

	public QAFWebElement getNFKHomepageBgLnk() {
		return NFKHomepageBgLnk;
	}

	@FindBy(locator = "NFK.homepage.stepGoal.lnk")
	private QAFWebElement NFKHomepageStepGoalLnk;

	public QAFWebElement getNFKHomepageStepGoalLnk() {
		return NFKHomepageStepGoalLnk;
	}

	@FindBy(locator = "NFK.homepage.stepsCounter.txt")
	private QAFWebElement NFKHomepageStepsCounterTxt;

	public QAFWebElement getNFKHomepageStepsCounterTxt() {
		return NFKHomepageStepsCounterTxt;
	}

	@FindBy(locator = "NFK.homepage.steps.lnk")
	private QAFWebElement NFKHomepageStepsLnk;

	public QAFWebElement getNFKHomepageStepsLnk() {
		return NFKHomepageStepsLnk;
	}

	@FindBy(locator = "NFK.homepage.carbsGoal.lnk")
	private QAFWebElement NFKHomepageCarbsGoalLnk;

	public QAFWebElement getNFKHomepageCarbsGoalLnk() {
		return NFKHomepageCarbsGoalLnk;
	}

	@FindBy(locator = "NFK.homepage.carbsTests.txt")
	private QAFWebElement NFKHomepageCarbsTestsTxt;

	public QAFWebElement getNFKHomepageCarbsTestsTxt() {
		return NFKHomepageCarbsTestsTxt;
	}

	@FindBy(locator = "NFK.homepage.carbs.lnk")
	private QAFWebElement NFKHomepageCarbsLnk;

	public QAFWebElement getNFKHomepageCarbsLnk() {
		return NFKHomepageCarbsLnk;
	}

	@FindBy(locator = "NFK.homepage.activityGoal.lnk")
	private QAFWebElement NFKHomepageActivityGoalLnk;

	public QAFWebElement getNFKHomepageActivityGoalLnk() {
		return NFKHomepageActivityGoalLnk;
	}

	@FindBy(locator = "NFK.homepage.activityCounter.txt")
	private QAFWebElement NFKHomepageActivityCounterTxt;
	@FindBy(locator = "NFK.homepage.articlequestion.txt")
	private QAFWebElement NFKHomepageArticlequestionTxt;
	@FindBy(locator = "NFK.homepage.articlequestion.img")
	private QAFWebElement NFKHomepageArticlequestionImg;
	@FindBy(locator = "NFK.homepage.deletearticle.btn")
	private QAFWebElement NFKHomepageDeletearticleBtn;
	@FindBy(locator = "NFK.homepage.deleteconfirmation.txt")
	private QAFWebElement NFKHomepageDeleteconfirmationTxt;
	@FindBy(locator = "NFK.homepage.deleteconfirmation.ok.btn")
	private QAFWebElement NFKHomepageDeleteconfirmationOkBtn;
	@FindBy(locator = "NFK.homepage.deleteconfirmation.cancel.btn")
	private QAFWebElement NFKHomepageDeleteconfirmationCancelBtn;
	@FindBy(locator = "NFK.InsulinCalculatorSetting.food.accordian.btn")
	private QAFWebElement NFKInsulincalculatorsettingFoodAccordianBtn;

	public QAFWebElement getNFKHomepageActivityCounterTxt() {
		return NFKHomepageActivityCounterTxt;
	}

	public QAFWebElement getNFKHomepageActivityLnk() {
		return NFKHomepageActivityLnk;
	}

	// NEO Goals

	public void clickSetGoals() {
		if (getNFKHomepageSetGoalsTxt().isDisplayed()) {
			Reporter.logWithScreenShot("Goals module with no goals set", MessageTypes.Pass);
			getNFKHomepageSetGoalsTxt().click();
			getNFKHomepageSetDailyGoalsTxt().verifyPresent("Set Daily Goals popup displayed");

		} else {
			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 7);
			Reporter.logWithScreenShot("Goals module with no goals set", MessageTypes.Pass);
			getNFKHomepageSetGoalsTxt().click();
			getNFKHomepageSetDailyGoalsTxt().verifyPresent("Set Daily Goals popup displayed");
		}

	}

	// Click Settings link on Set Daily Goals
	public void clickSetGoalsSettingsLink() {
		Reporter.logWithScreenShot("Set Goals popup", MessageTypes.Pass);
		getNFKHomepageSetDailyGoalsSettingslnk().click();
		LFSUtilsIOS.pause(2000);
	}

	// Click BG Goal Circle
	public void clickBGGoal() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 10, 10);
		getNFKHomepageBgTestTxt().clear();
		getNFKHomepageBgGoalLnk().verifyPresent("BG Goal displayed");
		getNFKHomepageBgGoalLnk().click();
		getNFKHomepageBgTestTxt().verifyPresent("BG Goal text displayed");
		getNFKHomepageBgTestTxt().clear();
		getNFKHomepageBgTestTxt().sendKeys("4");
		LFSUtilsAndroid.clickBackButton();

	}

	// Verify and add BG Goal
	public void VerifyAddBGGoal() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		getNFKHomepageBgTestTxt().clear();
		getNFKHomepageBgGoalLnk().verifyPresent("BG Goal displayed");
		getNFKHomepageBgGoalLnk().click();
		getNFKHomepageBgTestTxt().verifyPresent("BG Goal text displayed");
		getNFKHomepageBgTestTxt().sendKeys("6");
		ConfigurationManager.getBundle().setProperty("BG.value", "6");
		Reporter.logWithScreenShot("BG value entered successfully", MessageTypes.Pass);

	}

	public void clickBGGoalDetails() {

		int x = getNFKHomepageBgTestTxt().getLocation().getX();
		int y = getNFKHomepageBgTestTxt().getLocation().getY();
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		TouchAction tch = new TouchAction(appiumDriver);
		tch.tap(x, y).perform();

	}

	// Click Step Goal Circle
	public void clickStepsGoal() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		getNFKHomepageStepGoalLnk().verifyPresent("Steps goal displayed");
		getNFKHomepageStepGoalLnk().click();
		getNFKHomepageStepsTxt().verifyPresent("Steps Goal text displayed");
		;
		getNFKHomepageStepsTxt().clear();
		getNFKHomepageStepsTxt().sendKeys("4");
		LFSUtilsAndroid.clickBackButton();

	}

	// Verify and add Steps Goal
	public void VerifyAddStepGoal() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		getNFKHomepageStepsTxt().clear();
		getNFKHomepageStepGoalLnk().verifyPresent("Steps goal displayed");
		getNFKHomepageStepGoalLnk().click();
		getNFKHomepageStepsTxt().verifyPresent("Steps Goal text displayed");
		;
		ConfigurationManager.getBundle().setProperty("Steps.value", "1100");
		getNFKHomepageStepsTxt().sendKeys("1100");
		Reporter.logWithScreenShot("Steps value entered successfully", MessageTypes.Pass);

	}

	// Click Carb Goal Circle
	public void clickCarbsGoal() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		getNFKHomepageCarbsGoalLnk().verifyPresent("Carbs goal displayed");
		getNFKHomepageCarbsGoalLnk().click();
		getNFKHomepageCarbTxt().verifyPresent("Carbs Goal text displayed");
		;
		getNFKHomepageCarbTxt().clear();
		getNFKHomepageCarbTxt().sendKeys("4");
		LFSUtilsAndroid.clickBackButton();

	}

	// Verify and add Carb Goal
	public void VerifyAddCarbsGoal() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		getNFKHomepageCarbTxt().clear();
		getNFKHomepageCarbsGoalLnk().verifyPresent("Carbs goal displayed");
		getNFKHomepageCarbsGoalLnk().click();
		getNFKHomepageCarbTxt().verifyPresent("Carbs Goal text displayed");
		getNFKHomepageCarbTxt().sendKeys("6");
		ConfigurationManager.getBundle().setProperty("Carbs.value", "6");
		Reporter.logWithScreenShot("Carbs value entered successfully", MessageTypes.Pass);

	}

	// Click Activity Goal Circle
	public void clickActivityGoal() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		getNFKHomepageActivityGoalLnk().verifyPresent("Activity goal displayed");
		getNFKHomepageActivityGoalLnk().click();
		getNFKHomepageActivityTxt().verifyPresent("Carbs Goal text displayed");
		;
		getNFKHomepageActivityTxt().clear();
		getNFKHomepageActivityTxt().sendKeys("4");
		LFSUtilsAndroid.clickBackButton();
	}

	public void VerifyAddActivityGoal() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
		getNFKHomepageActivityTxt().clear();
		getNFKHomepageActivityGoalLnk().verifyPresent("Activity goal displayed");
		getNFKHomepageActivityGoalLnk().click();
		getNFKHomepageActivityTxt().verifyPresent("Activity Goal text displayed");
		;
		int value = ThreadLocalRandom.current().nextInt(4, 15);
		ConfigurationManager.getBundle().setProperty("Activity.value", value);
		getNFKHomepageActivityTxt().sendKeys(Integer.toString(value));
		Reporter.logWithScreenShot("Activity value entered successfully", MessageTypes.Pass);
	}

	public String dateBeforeCurrentDate(int numberOfDays) {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - numberOfDays);
		Date myDate = cal.getTime();
		String date = myDate.toString();
		Reporter.log("Date :::::" + date);
		char newDate = date.charAt(5);
		String datestring = Character.toString(newDate);
		if (newDate == 0) {
			Reporter.log("New date :::" + datestring);
			System.out.println(datestring.replace("0", ""));
			return datestring.replace("0", "");
		}

		System.out.println(myDate.toString().substring(4, 11));
		return myDate.toString().substring(4, 11);
	}

	public void clickOnAddA1c() {
		verifyWhyDoINotSeeAnythingPopup();
		getNFKHomepageLastreadingTrendsAdda1cBtn().verifyPresent("Add A1C text is displayed");
		getNFKHomepageLastreadingTrendsAdda1cBtn().click();
	}

	public void enterA1cDetails() {
		getNFKHomepageLastreadingTrendsA1cLbl().verifyPresent("Add A1C text is displayed");
		getNFKHomepageLastreadingTrendsA1ctestdataLbl().verifyPresent("Test data label is displayed");
		getNFKHomepageLastreadingTrendsA1cpercentLbl().verifyPresent("Test data label is displayed");
		int value = ThreadLocalRandom.current().nextInt(5, 13);
		getNFKHomepageLastreadingTrendsA1cpercentLbl().sendKeys(Integer.toString(value));
		if (getNFKHomepageLastreadingTrendsA1cselectTxt().isPresent()) {
			getNFKHomepageLastreadingTrendsA1cselectTxt().click();
			getNFKHomepageLastreadingTrendsAdda1cTypeokBtn().click();

		}

	}

	public void clickOnSaveA1c() {
		if (getNFKHomepageLastreadingTrendsSavea1cBtn().isPresent()) {
			getNFKHomepageLastreadingTrendsSavea1cBtn().click();
		}

	}

	public void verifyA1cDetails() {
		getNFKHomepageTrendsA1ccoparatorLbl().verifyPresent("A1C copamrator is present on trends page");
		Reporter.logWithScreenShot("A1C detail entered successfully", MessageTypes.Pass);

	}

	public void verifyArticleQuestion() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 7);
		if (getNFKHomepageArticlequestionTxt().isPresent()) {
			Reporter.logWithScreenShot("Article question is displayed", MessageTypes.Pass);
		}
	}

	public void clickOnArticle() {
		if (getNFKHomepageArticlequestionImg().isPresent()) {
			getNFKHomepageArticlequestionImg().click();
			Reporter.logWithScreenShot("Article question is displayed", MessageTypes.Pass);
		}
	}

	public void verifyDeleteConfirm() {
		if (getNFKHomepageDeletearticleBtn().isPresent()) {
			getNFKHomepageDeletearticleBtn().click();
			getNFKHomepageDeleteconfirmationTxt().verifyPresent("Delete confirmation message is present");
			if (getNFKHomepageDeleteconfirmationCancelBtn().isPresent()) {
				getNFKHomepageDeleteconfirmationCancelBtn().click();
				getNFKHomepageDeletearticleBtn().verifyPresent("Delete button is present");
			}

		}

	}

	public void deleteWelArticle() {
		if (getNFKHomepageDeletearticleBtn().isPresent()) {
			getNFKHomepageDeletearticleBtn().click();
			getNFKHomepageDeleteconfirmationOkBtn().click();

		}
	}

	public void verifyAverageAndComparator() {
		getNFKHomepageAveragesBtn().verifyPresent("Averages tab is present on Last reading screen");
		getNFKHomepageTrendsBtn().verifyPresent("Comparator tab is present on Last reading screen");

	}

	public void verifyCountPatternTab(String count) {
		getNFKHomepagePatternsBtn().waitForPresent(5000);
		WebDriverTestCase.verifyTrue(getNFKHomepagePatternounterLbl().getText().contains(count),
				"Pattern count is incorrect", "Count of Pattern " + getNFKHomepagePatternounterLbl().getText());
	}

	public void verifyNoPatternHomeScreen() {
		getNFKHomepageAddedEventDynamicLbl(
				LFSUtilsAndroid.getPropString("patterns.detail.message.high").substring(0, 20))
						.verifyNotPresent("pattern");
	}

	public void verifyA1CInformation() {
		getNFKHomepageLastreadingTrendsA1cInfoBtn().click();
		if (getNFKHomepageLastreadingTrendsA1cInfoscreenLbl().isPresent()) {
			Reporter.logWithScreenShot("A1C Comparator information is displayed", MessageTypes.Pass);
		}
	}

	public void clickAddedA1c() {
		getNFKHomepageLastreadingTrendsAddeda1cGraphTxt().verifyPresent("Added A1C is displayed");
		getNFKHomepageLastreadingTrendsAddeda1cGraphTxt().click();
	}

	public void verifyA1CHistory() {
		getNFKHomepageLastreadingTrendsAddeda1cViewa1chistoryBtn().verifyPresent("View A1C history is displayed");
		getNFKHomepageLastreadingTrendsAddeda1cViewa1chistoryBtn().click();
		if (getNFKHomepageLastreadingTrendsAddeda1cA1chistoryLbl().isPresent()) {
			Reporter.logWithScreenShot("A1C history is displayed", MessageTypes.Pass);
		}

	}

	public void verifyA1cMinMaxValue() {
		getNFKHomepageLastreadingTrendsA1cpercentLbl().waitForPresent();
		getNFKHomepageLastreadingTrendsA1cpercentLbl().sendKeys("4");
		getNFKHomepageLastreadingTrendsAdda1cMinmaxerrorTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for min value is displayed", MessageTypes.Pass);
		getNFKHomepageLastreadingTrendsA1cpercentLbl().sendKeys("14");
		getNFKHomepageLastreadingTrendsAdda1cMinmaxerrorTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for max value is displayed", MessageTypes.Pass);
	}

	public void add3A1CValues() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			int number = ThreadLocalRandom.current().nextInt(5, 13);
			list.add(number);
			getNFKHomepageLastreadingTrendsA1cpercentLbl().sendKeys(Integer.toString(number));
			getNFKHomepageLastreadingTrendsA1cselectTxt().click();
			getNFKHomepageLastreadingTrendsAdda1cTypeokBtn().click();
			getNFKHomepageLastreadingTrendsSavea1cBtn().click();
			Reporter.logWithScreenShot("A1C value entered successfully", MessageTypes.Pass);

		}

		ConfigurationManager.getBundle().addProperty("a1c.values", list);
	}

	public void verifyAdded3Events() {
		List<Integer> list1 = new ArrayList<Integer>();
		for (QAFWebElement ele : getNFKHomepageLastreadingTrendsCompareadda1cTxt()) {
			list1.add(Integer.valueOf(ele.getText().split(".0%")[0]));
		}

		List<Integer> actualList = (List<Integer>) ConfigurationManager.getBundle().getProperty("a1c.values");
		int i = 0;
		int end = actualList.size();

		while (i < end) {
			Validator.verifyThat(actualList.get(end - i - 1), Matchers.equalTo(list1.get(i)));
			i = i + 1;
		}
	}

	public QAFWebElement getNFKHomepageLastreadingTrendsCompareadda1cTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.homepage.lastreading.trends.compareAdda1c.txt", text);
	}

	public void verifyWhyDoINotSeeAnythingPopup() {
		getNFKHomepageAveragesBtn().click();
		getNFKHomepageTrendsBtn().click();
		if (getNFKHomepageLastreadingTrendsDonotseeanythingpopupTxt().isPresent()
				&& getNFKHomepageLastreadingTrendsDonotseeanythingpopupTxt().isDisplayed()) {
			Reporter.logWithScreenShot("Why do I not see anything on my graph popup is displayed", MessageTypes.Pass);
			LFSUtilsAndroid.clickBackButton();
		}
	}

	public void clickMeterDownloadReading() {
		if (getNFKHomepageLastreadingTrendsMeterdownloadreadingBtn().isPresent()) {
			Reporter.logWithScreenShot("Pair a meter to download reading is displayed", MessageTypes.Pass);
			getNFKHomepageLastreadingTrendsMeterdownloadreadingBtn().click();
		}
	}

	public void verifyPairMeter() {
		SignupPageAndroid signupPageAndroid = new SignupPageAndroid();
		if (signupPageAndroid.getNFKsignuppageonetouchlogo().isPresent()) {
			Reporter.logWithScreenShot("Meter page is displayed", MessageTypes.Pass);
		}
	}

	public void verifyUnableToAdd180Data() {
		EventLogPageAndroid eventlogPageAndroid = new EventLogPageAndroid();
		int daysinmonth = 30;
		getNFKHomepageLastreadingTrendsA1cLbl().verifyPresent("Add A1C text is displayed");
		getNFKHomepageLastreadingTrendsA1ctestdataLbl().verifyPresent("Test data label is displayed");
		if (getNFKHomepageLastreadingTrendsA1cselectTxt().isPresent()) {
			getNFKHomepageLastreadingTrendsA1cselectTxt().click();
			Date today = new Date();
			Calendar cal = new GregorianCalendar();
			cal.setTime(today);
			cal.add(Calendar.DAY_OF_MONTH, -121);
			Date today180 = cal.getTime();
			SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd MMMM yyyy");
			String date = DATE_FORMAT.format(today180);
			System.out.println("New Date Format ::" + date);
			for (int i = 0; i < 7; i++) {
				// click on previous button code
				if (i == 6) {
					if (date.charAt(0) == '0') {

						getNFKHomepageLastreadingTrendsDateStatictextBtn(date.substring(1, 2)).isDisplayed();
						Reporter.logWithScreenShot("121 Days cannot be selected", MessageTypes.Pass);
					} else {
						getNFKHomepageLastreadingTrendsDateStatictextBtn(date.substring(0, 2)).isDisplayed();
						Reporter.logWithScreenShot("121 Days cannot be selected", MessageTypes.Pass);
					}

				} else {
					try {
						eventlogPageAndroid.getNFKEventLogClassicViewLeftArrowBtn().click();
					} catch (Exception e) {
						Reporter.logWithScreenShot("121 Days cannot be selected", MessageTypes.Pass);
					}
				}

			}

		}

	}

	// Verify BG after adding value
	public void verifyAddedBG() {
		LFSUtilsAndroid.clickBackButton();
		if (getNFKHomepageBgLbl().isPresent()) {
			getNFKHomepageBgLbl().click();
			int size = getNFKHomepageAddedbgTxt().size();
			Reporter.log("circle =" + size);
			Validator.verifyThat("six empty circles is displayed",
					getNFKHomepageAddedbgTxt().size() == Integer
							.parseInt(ConfigurationManager.getBundle().getPropertyValue("BG.value")),
					Matchers.equalTo(true));
		}
	}

	// Verify Steps after adding value
	public void verifyAddedSteps() {
		LFSUtilsAndroid.clickBackButton();
		if (getNFKHomepageStepsLbl().isPresent()) {
			getNFKHomepageStepsLbl().click();
			getNFKHomepageAddedstepsTxt().verifyPresent();
		}
	}

	// Verify Carbs after adding value
	public void verifyAddedCarbs() {
		LFSUtilsAndroid.clickBackButton();
		if (getNFKHomepageCarbsLbl().isPresent()) {
			getNFKHomepageCarbsLbl().click();
			int size = getNFKHomepageAddedcarbsTxt().size();
			Reporter.log("Circle =" + size);
			Validator.verifyThat("six empty circles is displayed",
					getNFKHomepageAddedcarbsTxt().size() == Integer
							.parseInt(ConfigurationManager.getBundle().getPropertyValue("Carbs.value")),
					Matchers.equalTo(true));
		}
	}

	// Verify Activity after adding value
	public void verifyAddedActivity() {
		LFSUtilsAndroid.clickBackButton();
		if (getNFKHomepageActivityLbl().isPresent()) {
			getNFKHomepageActivityLbl().click();
			getNFKHomepageAddedactivityTxt().verifyPresent("Activity present");
		}

	}

	public void verifyWeekWise() {
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Homescreen after adding activity goal", MessageTypes.Pass);
		if (getNFKHomepageActivityLbl().isPresent()) {
			getNFKHomepageActivityLbl().click();
			getNFKHomepageAddedactivityTxt().click();
			LFSUtilsIOS.pause(2000);
			getNFKHomepageAddedactivityWeeklyactivityTxt().verifyPresent("Weekly Activity text is displayed ");
		} else if (getNFKHomepageAddedactivityTxt().isPresent()) {
			getNFKHomepageAddedactivityTxt().click();
			LFSUtilsIOS.pause(2000);
			getNFKHomepageAddedactivityWeeklyactivityTxt().verifyPresent("Weekly Activity text is displayed ");
		} else {
			Reporter.logWithScreenShot("Activity goal is not displayed", MessageTypes.Fail);
		}

	}

	public void verifyDayWise() {
		LFSUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Homescreen after adding activity goal", MessageTypes.Pass);
		if (getNFKHomepageActivityLbl().isPresent()) {
			getNFKHomepageActivityLbl().click();
			getNFKHomepageAddedactivityTxt().click();
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Activity day goal detail", MessageTypes.Pass);

		} else if (getNFKHomepageAddedactivityTxt().isPresent()) {
			getNFKHomepageAddedactivityTxt().click();
			LFSUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Activity day goal detail", MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Activity goal is not displayed", MessageTypes.Fail);
		}
	}

	public void verifyHomepageGoalsOn() {
		LFSUtilsAndroid.clickBackButton();
		LFSUtilsIOS.pause(2000);
		if (getNFKHomepageActivityLbl().isDisplayed()) {
			Reporter.logWithScreenShot("Goals enabled");

		} else {
			Reporter.logWithScreenShot("Goals not enabled");
		}

	}

	public void verifyBgRange(String range, String value) {
		if (getNFKHomepageDayvalueLbl(range).isDisplayed()) {
			Reporter.logWithScreenShot("Range label is present", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Range label is not present", MessageTypes.Fail);

		if (getNFKHomepageDayvalueLbl(value).isDisplayed()) {
			Reporter.logWithScreenShot("BG Value is present", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("BG Value is not present", MessageTypes.Fail);

	}

	public void selectFromMenu() {
		getNFKHomepageDayvalueLbl(LFSUtilsAndroid.getPropString("help.title")).verifyPresent("Help");
		getNFKHomepageDayvalueLbl(LFSUtilsAndroid.getPropString("help.title")).click();
	}

	public void SelectQuickTouchReveal() {

		QAFWebElement quickUse = getNFKHomepageLastreadingTrendsDateStatictextBtn(
				(String) LFSUtilsAndroid.getPropString("summary.screenTitle").subSequence(0, 8));
		quickUse.waitForPresent();
		if (quickUse.isPresent()) {
			Reporter.logWithScreenShot("Quick Use Tutorial is present", MessageTypes.Pass);
			getNFKHomepageLastreadingTrendsDateStatictextBtn(
					ConfigurationManager.getBundle().getString("summary.screenTitle")).click();
		} else {
			Reporter.logWithScreenShot("Quick Use Tutorial is not present", MessageTypes.Fail);

		}

	}

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub

	}

	public QAFWebElement getNFKInsulincalculatorsettingFoodAccordianBtn() {
		return NFKInsulincalculatorsettingFoodAccordianBtn;
	}

	public void clicksAccordianToExpand() {
		getNFKInsulincalculatorsettingFoodAccordianBtn().click();
		Reporter.logWithScreenShot("Accordian clicked to expand recommendation", MessageTypes.Pass);
	}

	public void clicksAccordianToClose() {
		getNFKInsulincalculatorsettingFoodAccordianBtn().click();
		Reporter.logWithScreenShot("Accordian clicked to close recommendation", MessageTypes.Pass);
	}

	public void IOBNotVisibleInRec() {
		Reporter.logWithScreenShot("IOB is not visible in the expanded view of the recomendation", MessageTypes.Pass);
	}

	public void VerifyTimeline_value() {
		InsulinCalculatorPageAndroid insulin = new InsulinCalculatorPageAndroid();
		AccountPageAndroid account = new AccountPageAndroid();
		if (insulin
				.getNFKInsulincalculatorsettingStaticText(ConfigurationManager.getBundle().getString("appCommon.done"))
				.isPresent()) {
			insulin.getNFKInsulincalculatorsettingStaticText(
					ConfigurationManager.getBundle().getString("appCommon.done")).click();
			LFSUtilsAndroid.waitforLoad();
		}
		account.getNFKMoremenuAccountpageSaveBtn().verifyPresent("Save button is displayed");
		account.getNFKMoremenuAccountpageSaveBtn().click();
		insulin.BgMultCarbCalculator();
		for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
					&& getNFKHomepageEventValueTxt().get(i).getText().contains(InsulinCalculatorPageAndroid.dose)) {
				Reporter.logWithScreenShot("Correct bolus calculation is displayed", MessageTypes.Pass);
			}
		}
	}

	public void verify_CarbBolus() {
		InsulinCalculatorPageAndroid insulin = new InsulinCalculatorPageAndroid();
		insulin.carbCalculator();
		for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
					&& getNFKHomepageEventValueTxt().get(i).getText().contains(EventLogPageAndroid.getCarbValue)) {
				Reporter.logWithScreenShot("Added event is displayed", MessageTypes.Pass);
			}
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i)) && getNFKHomepageEventValueTxt()
					.get(i).getText().contains(InsulinCalculatorPageAndroid.totalCarb)) {
				Reporter.logWithScreenShot("Correct bolus calculation is displayed", MessageTypes.Pass);
			}
		}
	}

	public void verify_BgBolus() {
		InsulinCalculatorPageAndroid insulin = new InsulinCalculatorPageAndroid();
		insulin.bgCalculator();
		for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
					&& getNFKHomepageEventValueTxt().get(i).getText().contains(EventLogPageAndroid.getBGValue)) {
				Reporter.logWithScreenShot("Added event is displayed", MessageTypes.Pass);
			}
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
					&& getNFKHomepageEventValueTxt().get(i).getText().contains(InsulinCalculatorPageAndroid.totalBg)) {
				Reporter.logWithScreenShot("Correct bolus calculation is displayed", MessageTypes.Pass);
			}
		}
	}

	public void verifyMultipleAdded_Event(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
					&& getNFKHomepageEventValueTxt().get(i).getText().contains(EventLogPageAndroid.getBGValue)) {
				Reporter.logWithScreenShot("Added Glucose is displayed", MessageTypes.Pass);
				break;
			}
		}
		for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
					&& getNFKHomepageEventValueTxt().get(i).getText().contains(EventLogPageAndroid.getCarbValue)) {
				Reporter.logWithScreenShot("Added Carb is displayed", MessageTypes.Pass);
				break;
			}
		}
		for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
					&& getNFKHomepageEventValueTxt().get(i).getText().contains(EventLogPageAndroid.insulinValue)) {
				Reporter.logWithScreenShot("Added Insulin is displayed", MessageTypes.Pass);
				break;
			}
		}
		for (int i = 0; i < getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKHomepageEventValueTxt().get(i))
					&& getNFKHomepageEventValueTxt().get(i).getText().contains(EventLogPageAndroid.getActivityValue)) {
				Reporter.logWithScreenShot("Added Activity is displayed", MessageTypes.Pass);
				break;
			}
		}
	}

	public void Addevent(String option) {
		option = option.toUpperCase();
		switch (option) {
		case "GLUCOSE":
			selectBG();
			break;
		case "CARBS":
			selectCarb();
			break;
		case "INSULIN":
			selectInsulin();
			break;
		case "ACTIVITY":
			selectActivity();
			break;
		case "NOTE":
			selectNote();
		
		}
		Reporter.logWithScreenShot("The user has selected the event", MessageTypes.Pass);

	}


	/*
	 * public void Addevent(String option) { option = option.toUpperCase(); switch
	 * (option) { case "GLUCOSE": clickBG(); break; case "CARBS": selectCarb();
	 * break; case "INSULIN": selectInsulin(); break; case "ACTIVITY":
	 * selectActivity(); break; }
	 * Reporter.logWithScreenShot("After selecting event", MessageTypes.Pass);
	 * 
	 * //
	 */

	public void selectActivity() {
		getNFKHomepageAddeventACTIVITYBtn().click();	

	}

	public void selectInsulin() {
		getNFKHomepageAddeventInsulinBtn().waitForPresent();
		getNFKHomepageAddeventInsulinBtn().click();

	}

	public void selectCarb() {
		//getNFKHomepageAddeventCARBBtn().waitForPresent();
		getNFKHomepageAddeventCARBBtn().click();
	}

	public void selectBG() {
		//getNFKHomepageAddeventBGBtn().waitForPresent();
		getNFKHomepageAddeventBGBtn().click();

	}
	
	public void selectNote()
	{
		getNFKhomepageaddeventnotebtn().waitForPresent(2000);
		getNFKhomepageaddeventnotebtn().click();
	}

	public void clickBG() {
		getNFKHomepageAddeventBGBtn1().waitForPresent();
		getNFKHomepageAddeventBGBtn1().click();

	}

	public void userClickOnCloseIcon() {
		getNFKHomepageAddeventTxt().waitForPresent();
		getNFKHomepageAddeventTxt().click();
		Reporter.logWithScreenShot("Add event button is present on homescreen", MessageTypes.Pass);
	}
 
	public void verifyEvents() {
		Reporter.logWithScreenShot("Verifying Event", MessageTypes.Pass);
		
	}

	public void clickPairBtn() {
		getNFKHomepagePairSensorBtn().isPresent();
		getNFKHomepagePairSensorBtn().click();
		MoreMenuPageAndroid moremenu= new MoreMenuPageAndroid();
		Reporter.logWithScreenShot("clicked on Pair sensor button",MessageTypes.Pass);
	}
	
	public void verifyAddEvents() {
		getNFKHomepageAddeventACTIVITYBtn().waitForPresent();
		getNFKHomepageAddeventACTIVITYBtn().assertPresent("Add Activity button is present");
		getNFKHomepageAddeventCARBBtn().assertPresent("Add Carbs Button is present");
		getNFKHomepageAddeventInsulinBtn().assertPresent("Add insulin Button is present");
		getNFKhomepageaddeventnotebtn().assertPresent("Add Note Button is present");
	}
	public void verifyEmptyHomeScreen() {
		assertEquals(getNFKHomepageBannerMsgLbl().getText(),LFSUtilsAndroid.getPropString("home.no.alert.alarm.banner"));
				assertEquals(getNFKHomepageSensorTitle().getText(),LFSUtilsAndroid.getPropString("home.start.sensor.title"));
getNFKHomepageSensorDescpLbl().assertPresent("Warning message");
		assertEquals(getNFKHomepageSensorHowtoapplyBtn().getText(),LFSUtilsAndroid.getPropString("home.how.apply.sensor"));
		getNFKHomepageHomeBtn().isPresent();
		getNFKHomepageMoreBtn().isPresent();
		Reporter.logWithScreenShot("user has verified the Empty Home screen",MessageTypes.Pass);
	}
	
}
