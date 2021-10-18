package com.NFK.version1.iOS.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;

import com.NFK.support.ConstantUtils;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.beans.EventDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;



public class EventLogPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFKios.eventlogPage.carb.btn")
	private QAFWebElement NFKiosEventLogPageCarbBtn;
	@FindBy(locator = "NFKios.eventlogPage.glucose.btn")
	private QAFWebElement NFKiosEventLogPageGlucoseBtn;
	@FindBy(locator = "NFKios.eventlogPage.insulin.btn")
	private QAFWebElement NFKiosEventLogPageInsulinBtn;
	@FindBy(locator = "NFKios.eventlogPage.activity.btn")
	private QAFWebElement NFKiosEventLogPageActivityBtn;
	@FindBy(locator = "NFKios.eventlogPage.glucose.unit.lbl")
	private QAFWebElement NFKiosEventLogPageGlucoseUnitLbl;
	@FindBy(locator = "NFKios.eventlogPage.glucose.unit.lbl")
	private List<QAFWebElement> NFKiosEventLogPageGlucoseUnitLblList;
	@FindBy(locator = "NFKios.eventlogPage.glucose.amount.txt")
	private QAFWebElement NFKiosEventLogPageGlucoseAmountTxt;
	@FindBy(locator = "NFKios.eventlogPage.glucose.amount.txt")
	private List<QAFWebElement> NFKiosEventLogPageGlucoseAmountTxtList;
	@FindBy(locator = "NFKios.eventlogPage.glucose.timingValue.txt")
	private QAFWebElement NFKiosEventLogPageGlucoseTimingvalueTxt;
	@FindBy(locator = "NFKios.eventlogPage.glucose.addnote.txt")
	private QAFWebElement NFKiosEventLogPageGlucoseAddnoteTxt;
	@FindBy(locator = "NFKios.eventlogPage.glucose.drop.img")
	private QAFWebElement NFKiosEventLogPageGlucoseDropImg;
	@FindBy(locator = "NFKios.eventlogPage.addevent.cross.icon.img")
	private QAFWebElement NFKiosEventLogPageAddEventCrossIconImg;
	@FindBy(locator = "NFKios.eventlogPage.glucose.drop.img")
	private List<QAFWebElement> NFKiosEventLogPageGlucoseDropImgList;
	@FindBy(locator = "NFKios.eventlogPage.addevent.btn")
	private QAFWebElement NFKiosEventLogPageAddeventBtn;
	@FindBy(locator = "NFKios.eventlogPage.timingPicker.date.pkr")
	private QAFWebElement NFKiosEventLogPageTimingPickerDatePkr;
	@FindBy(locator = "NFKios.eventlogPage.timingPicker.hour.pkr")
	private QAFWebElement NFKiosEventLogPageTimingPickerHourPkr;
	@FindBy(locator = "NFKios.eventlogPage.timingPicker.minute.pkr")
	private QAFWebElement NFKiosEventLogPageTimingPickerMinutePkr;
	@FindBy(locator = "NFKios.eventlogPage.timingPicker.meredian.pkr")
	private QAFWebElement NFKiosEventLogPageTimingPickerMeredianPkr;
	@FindBy(locator = "NFKios.eventlogPage.glucose.timingValue.btn")
	private QAFWebElement NFKiosEventLogPageglucoseTimingValuebBtn;
	@FindBy(locator = "NFKios.eventlogPage.glucose.timingValue.btn")
	private List<QAFWebElement> NFKiosEventLogPageglucoseTimingValuebBtnList;
	@FindBy(locator = "NFKios.eventlogPage.carb.spoon.img")
	private QAFWebElement NFKiosEventLogPageCarbSpoonImg;
	@FindBy(locator = "NFKios.eventlogPage.carb.spoon.img")
	private List<QAFWebElement> NFKiosEventLogPageCarbSpoonImgList;
	@FindBy(locator = "NFKios.eventlogPage.carb.amountField.txt")
	private QAFWebElement NFKiosEventLogPageCarbAmountFieldTxt;
	@FindBy(locator = "NFKios.eventlogPage.carb.amountField.txt")
	private List<QAFWebElement> NFKiosEventLogPageCarbAmountFieldTxtList;
	@FindBy(locator = "NFKios.eventlogPage.carb.noteField.txt")
	private QAFWebElement NFKiosEventLogPageCarbNoteFieldTxt;
	@FindBy(locator = "NFKios.eventlogPage.insulin.medicine.img")
	private QAFWebElement NFKiosEventLogPageInsulinMedicineImg;
	@FindBy(locator = "NFKios.eventlogPage.insulin.medicine.img")
	private List<QAFWebElement> NFKiosEventLogPageInsulinMedicineImgList;
	@FindBy(locator = "NFKios.eventlogPage.insulin.amountField.txt")
	private QAFWebElement NFKiosEventLogPageInsulinAmountfieldTxt;
	@FindBy(locator = "NFKios.eventlogPage.insulin.amountField.txt")
	private List<QAFWebElement> NFKiosEventLogPageInsulinAmountfieldTxtList;
	@FindBy(locator = "NFKios.eventlogPage.insulin.type.btn")
	private QAFWebElement NFKiosEventLogPageInsulinTypeBtn;
	@FindBy(locator = "NFKios.eventlogPage.insulin.type.title.btn")
	private QAFWebElement NFKiosEventLogPageInsulinTypeTitleBtn;
	@FindBy(locator = "NFKios.eventlogPage.insulin.type.rapid.btn")
	private QAFWebElement 	NFKiosEventLogPageInsulinTypeRapidBtn;
	@FindBy(locator="NFKios.eventlogPage.insulin.type.done.btn")
	private QAFWebElement NFKiosEventLogPageInsulinTypeDoneBtn;
	@FindBy(locator = "NFKios.eventlogPage.insulin.timing.lbl")
	private QAFWebElement NFKiosEventLogPageInsulinTimingLbl;
	@FindBy(locator = "NFKios.eventlogPage.insulin.noteField.txt")
	private QAFWebElement NFKiosEventLogPageInsulinNotefieldTxt;
	@FindBy(locator = "NFKios.eventlogPage.activity.heart.img")
	private QAFWebElement NFKiosEventLogPageActivityHeartImg;
	@FindBy(locator = "NFKios.eventlogPage.activity.heart.img")
	private List<QAFWebElement> NFKiosEventLogPageActivityHeartImgList;
	@FindBy(locator = "NFKios.eventlogPage.activity.intensity.btn")
	private QAFWebElement NFKiosEventLogPageActivityIntensityBtn;
	@FindBy(locator = "NFKios.eventlogPage.activity.amountField.txt")
	private QAFWebElement NFKiosEventLogPageActivityAmountfieldTxt;
	@FindBy(locator = "NFKios.eventlogPage.activity.amountField.txt")
	private List<QAFWebElement> NFKiosEventLogPageActivityAmountfieldTxtList;
	@FindBy(locator="NFKios.eventlogPage.Note.noteField.txt")
	private QAFWebElement NFKiosEventlogPageNotenoteFieldtxt;
	@FindBy (locator="NFKios.eventlogPage.noteField.timing.btn")
	private QAFWebElement NFKioseventlogPagenoteFieldtimingbtn;
	@FindBy (locator="NFKios.eventlogPage.enteredNote.txt")
	private QAFWebElement NFKioseventlogPageenteredNotetxt;
	@FindBy(locator = "NFKios.eventlogPage.activity.unit.lbl")
	private QAFWebElement NFKiosEventLogPageActivityUnitLbl;
	@FindBy(locator = "NFKios.eventlogPage.activity.timing.lbl")
	private QAFWebElement NFKiosEventLogPageActivityTimingLbl;
	@FindBy(locator = "NFKios.eventlogPage.activity.noteField.txt")
	private QAFWebElement NFKiosEventLogPageActivityNotefieldTxt;
	@FindBy(locator = "NFKios.eventlogPage.carb.timing.btn")
	private QAFWebElement NFKiosEventLogPageCarbTimingBtn;
	@FindBy(locator = "NFKios.eventlogPage.insulin.timing.btn")
	private QAFWebElement NFKiosEventLogPageInsulinTimingBtn;
	@FindBy(locator = "NFKios.eventlogPage.activity.timing.btn")
	private QAFWebElement NFKiosEventLogPageActivityTimingBtn;
	@FindBy(locator = "NFKios.eventlogPage.editEvent.delete.btn")
	private QAFWebElement NFKiosEventLogPageEditEventDeleteBtn;
	@FindBy(locator = "NFKios.eventlogPage.editEvent.delete.btn")
	private List<QAFWebElement> NFKiosEventLogPageEditEventDeleteBtnList;
	@FindBy(locator = "NFKios.eventlogPage.undo.btn")
	private QAFWebElement NFKiosEventLogPageUndoBtn;
	@FindBy(locator = "NFKios.eventlogPage.classic.datelist.lbl")
	private List<QAFWebElement> NFKiosEventLogPageClassicDateListLbl;
	@FindBy(locator = "NFKios.eventlogPage.weekview.info.btn")
	private QAFWebElement NFKiosEventLogPageWeekInfoBtn;
	@FindBy(locator = "NFKios.eventlogPage.leftarrow.btn")
	private QAFWebElement NFKiosEventLogPageLeftarrowBtn;
	@FindBy(locator = "NFKios.eventlogPage.rightarrow.btn")
	private QAFWebElement NFKiosEventLogPageRightarrowBtn;
	@FindBy(locator = "NFKios.eventlogPage.aftermeal.btn")
	private QAFWebElement NFKiosEventLogPageAftermealBtn;
	@FindBy(locator = "NFKios.eventlogPage.aftermeal.btn")
	private List<QAFWebElement> NFKiosEventLogPageAftermealBtnList;
	@FindBy(locator = "NFKios.eventlogPage.insulin.type.lbl")
	private QAFWebElement NFKiosEventLogPageInsulinTypeLbl;
	@FindBy(locator = "NFKios.eventlogPage.viewDate.lbl")
	private QAFWebElement NFKiosEventLogPageDateRangeLbl;
	@FindBy(locator = "NFKios.eventlogPage.week.btn")
	private QAFWebElement NFKiosEventLogPageWeekBtn;
	@FindBy(locator = "NFKios.eventlogPage.day.btn")
	private QAFWebElement NFKiosEventLogPageDayBtn;
	@FindBy(locator = "NFKios.eventlogPage.save.btn")
	private QAFWebElement NFKiosEventLogPageSaveBtn;
	@FindBy(locator = "NFKios.eventlogPage.back.btn")
	private QAFWebElement NFKiosEventLogPageBackBtn;
	@FindBy(locator = "NFKios.eventlogPage.beforemeal.btn")
	private QAFWebElement NFKiosEventLogPageBeforemealBtn;
	@FindBy(locator = "NFKios.eventlogPage.before.365.breakfast.record")
	private QAFWebElement NFKiosEventLogPageBefore365BreakfastRecord;
	@FindBy(locator = "NFKios.eventlogPage.oneTouch.lbl")
	private QAFWebElement NFKiosEventLogPageOneTouchLbl;
	@FindBy(locator = "NFKios.eventlogPage.classicTableToday.btn")
	private QAFWebElement NFKiosEventLogPageClassicTableTodayBtn;
	@FindBy(locator = "NFKios.eventlogPage.event.btn")
	private QAFWebElement NFKiosEventbtn;
	 @FindBy(locator="NFKios.eventlogPage.insulin.type.txt")
	 private QAFWebElement NFKiosEventLogPageInsulinTypeTxt;
    @FindBy (locator="NFKios.eventlogPage.event.timeselect.ok.btn")
    private QAFWebElement NFKiosEventlogPageEventTimeselectOkBtn;
    @FindBy (locator="NFKios.eventlogPage.insulin.type.title.box")
    private QAFWebElement NFKiosEventLogPageInsulinTypeTitleBox;
    @FindBy(locator="NFKios.eventlogPage.activity.type.title.btn")
    private QAFWebElement NFKiosEventLogPageActivityTypeTitleBtn;
    @FindBy (locator ="NFKios.eventlogPage.activity.type.title.box")
    private QAFWebElement NFKiosEventLogPageActivityTypeTitleBox;
    @FindBy (locator="NFKios.homepage.Insulin.btn")
    private QAFWebElement NFKiosHomepageInsulinBtn;  
    
    @FindBy (locator="NFKios.homepage.BG.btn")
    private QAFWebElement NFKiosHomepageBGBtn;  
    @FindBy (locator="NFKios.homepage.Carb.btn")
    private QAFWebElement NFKiosHomepageCarbBtn;  
    @FindBy (locator="NFKios.homepage.Activity.btn")
    private QAFWebElement NFKiosHomepageActivityBtn;  
    @FindBy (locator="NFKios.homepage.Note.btn")
    private QAFWebElement NFKiosHomepageNoteBtn; 
    @FindBy(locator = "NFKios.EventLogPage.delete.btn1")
    private QAFWebElement NFKiosEventLogPageDeleteBtn1;
    
    @FindBy(locator = "NFKios.eventlogPage.addanevent.lbl")
	private QAFWebElement NFKiosAddAnEventLbl;
    
  //added for multiple events
    @FindBy(locator = "NFK.logbook.addevent.addvalue.txt")
 	private List<QAFWebElement> NFKLogbookAddeventAddvalueTxtList;
    
    @FindBy(locator="NFKios.eventlogPage.addedEvent.Note")
	private QAFWebElement NFKioseventlogPageaddedEventNote;
    @FindBy(locator="NFKios.eventlogPage.event.chartcell.chartview")
    private QAFWebElement NFKiosEventlogPageEventChartcellChartview;
    
    @FindBy(locator="NFKios.eventlogPage.event.title")
    private QAFWebElement NFKiosEventLogpageEventTitle;
    @FindBy(locator="NFKios.eventlogPage.event.today.btn")
    private QAFWebElement NFKiosEventLogpageEventTodayBtn;
    @FindBy(locator="NFKios.eventlogPage.event.calendar.label")
    private QAFWebElement NFKiosEventLogpageEventCalendarLabel;
    @FindBy(locator="NFKios.eventlogPage.event.chart.label")
    private QAFWebElement NFKiosEventLogpageEventChartLabel;
    @FindBy(locator = "NFKios.EventLogPage.calendar.scope.btn")
    private QAFWebElement NFKiosEventLogPageCalendarScopeBtn;
    @FindBy(locator="NFKios.eventlogPage.event.calendar.date")
    private QAFWebElement NFKiosEventLogpageEventCalendarDate;
    @FindBy(locator="NFKios.eventlogPage.event.chart.scroll.ele")
    private QAFWebElement NFKiosEventLogpageEventChartScrollEle;
    @FindBy(locator="NFKios.eventlogPage.event.month.label")
    private QAFWebElement NFKiosEventlogPageEventMonthLabel;
    
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	
	public QAFWebElement getNFKiosEventLogPageCalendarScopeBtn() {
		return NFKiosEventLogPageCalendarScopeBtn;
	}
	public QAFWebElement getNFKiosEventlogPageEventChartcellChartview() {
		return NFKiosEventlogPageEventChartcellChartview;
	}
	public QAFWebElement getNFKiosEventLogPageDeleteBtn1() {
		return NFKiosEventLogPageDeleteBtn1;
	}
	public QAFWebElement getNFKiosEventlogPageEventMonthLabel() {
		return NFKiosEventlogPageEventMonthLabel;
	}
	public QAFWebElement getNFKiosEventLogpageEventTitle() {
		return NFKiosEventLogpageEventTitle;
	}
	public QAFWebElement getNFKiosEventLogpageEventChartScrollEle() {
		return NFKiosEventLogpageEventChartScrollEle;
	}
	public QAFWebElement getNFKiosEventLogpageEventTodayBtn() {
		return NFKiosEventLogpageEventTodayBtn;
	}
	public QAFWebElement getNFKiosEventLogpageEventCalendarLabel() {
		return NFKiosEventLogpageEventCalendarLabel;
	}
	public QAFWebElement getNFKiosEventLogpageEventChartLabel() {
		 return NFKiosEventLogpageEventChartLabel;
	}
	public QAFWebElement getNFKiosEventLogpageEventCalendarDate() {
		 return NFKiosEventLogpageEventCalendarDate;
	}
	public QAFWebElement getNFKioshomepageaddedEventNote() {
		return NFKioseventlogPageaddedEventNote;
	}

	public QAFWebElement getNFKiosEventLogPageDateRangeLbl() {
		return NFKiosEventLogPageDateRangeLbl;
	}
    
	public QAFWebElement getNFKiosEventLogPageInsulinTypeTitleBox() {
		return NFKiosEventLogPageInsulinTypeTitleBox;
	}
	public QAFWebElement getNFKiosEventLogPageInsulinTypeTxt() {
		return NFKiosEventLogPageInsulinTypeTxt;
	}
	public QAFWebElement getNFKiosEventLogPageInsulinTypeRapidBtn() {
		return NFKiosEventLogPageInsulinTypeRapidBtn;
	}

	public QAFWebElement getNFKiosEventLogPageInsulinTypeLbl() {
		return NFKiosEventLogPageInsulinTypeLbl;
	}
	
	public QAFWebElement getNFKiosEventLogPageInsulinTypeDoneBtn() {
		return NFKiosEventLogPageInsulinTypeDoneBtn;
	}

	public QAFWebElement getNFKiosEventLogPageInsulinTypeTitleBtn() {
		return NFKiosEventLogPageInsulinTypeTitleBtn;
	}
	public List<QAFWebElement> getNFKiosEventLogPageglucoseTimingValuebBtnList() {
		return NFKiosEventLogPageglucoseTimingValuebBtnList;
	}
     
	public QAFWebElement getNFKiosEventLogPageActivityTypeTitleBox() {
		return NFKiosEventLogPageActivityTypeTitleBox;
	}
	
	public QAFWebElement getNFKiosHomepageInsulinBtn() {
		return NFKiosHomepageInsulinBtn;
	}
	
	public QAFWebElement getNFKiosHomepageBGBtn() {
		return NFKiosHomepageBGBtn;
	}
	
	public QAFWebElement getNFKiosHomepageCarbBtn() {
		return NFKiosHomepageCarbBtn;
	}
	public QAFWebElement getNFKiosHomepageNoteBtn() {
		return NFKiosHomepageNoteBtn;
	}
	
	public QAFWebElement getNFKiosHomepageActivityBtn() {
		return NFKiosHomepageActivityBtn;
	}
	
	public List<QAFWebElement> getNFKiosEventLogPageGlucoseAftermealBtnList() {
		return NFKiosEventLogPageAftermealBtnList;
	}

	public QAFWebElement getNFKiosEventLogPageGlucoseAftermealBtn() {
		return NFKiosEventLogPageAftermealBtn;
	}

	public QAFWebElement getNFKiosEventLogPageLeftarrowBtn() {
		return NFKiosEventLogPageLeftarrowBtn;
	}

	public QAFWebElement getNFKiosEventLogPageRightarrowBtn() {
		return NFKiosEventLogPageRightarrowBtn;
	}

	public QAFWebElement getNFKiosEventLogPageWeekInfoBtn() {
		return NFKiosEventLogPageWeekInfoBtn;
	}

	public QAFWebElement getNFKiosEventLogPageActivityTypeTitleBtn() {
		return NFKiosEventLogPageActivityTypeTitleBtn;
	}
	public List<QAFWebElement> getNFKiosEventLogPageClassicDateListLbl() {
		return NFKiosEventLogPageClassicDateListLbl;
	}

	public QAFWebElement getNFKiosEventLogPageEditEventDeleteBtn() {
		return NFKiosEventLogPageEditEventDeleteBtn;
	}

	public List<QAFWebElement> getNFKiosEventLogPageEditEventDeleteBtnList() {
		return NFKiosEventLogPageEditEventDeleteBtnList;
	}

	public QAFWebElement getNFKiosEventLogPageCarbTimingBtn() {
		return NFKiosEventLogPageCarbTimingBtn;
	}

	public QAFWebElement getNFKiosEventLogPageInsulinTimingBtn() {
		return NFKiosEventLogPageInsulinTimingBtn;
	}

	public QAFWebElement getNFKiosEventLogPageActivityTimingBtn() {
		return NFKiosEventLogPageActivityTimingBtn;
	}

	public QAFWebElement getNFKiosEventLogPageInsulinMedicineImg() {
		return NFKiosEventLogPageInsulinMedicineImg;
	}

	public List<QAFWebElement> getONFKiosEventLogPageInsulinMedicineImgList() {
		return NFKiosEventLogPageInsulinMedicineImgList;
	}

	public QAFWebElement getNFKiosEventLogPageInsulinAmountfieldTxt() {
		return NFKiosEventLogPageInsulinAmountfieldTxt;
	}

	public List<QAFWebElement> getNFKiosEventLogPageInsulinAmountfieldTxtList() {
		return NFKiosEventLogPageInsulinAmountfieldTxtList;
	}

	public QAFWebElement getNFKiosEventLogPageInsulinTypeBtn() {
		return NFKiosEventLogPageInsulinTypeBtn;
	}

	public QAFWebElement getNFKiosEventLogPageInsulinTimingLbl() {
		return NFKiosEventLogPageInsulinTimingLbl;
	}

	public QAFWebElement getNFKiosEventLogPageInsulinNotefieldTxt() {
		return NFKiosEventLogPageInsulinNotefieldTxt;
	}

	public QAFWebElement getNFKiosEventLogPageActivityHeartImg() {
		return NFKiosEventLogPageActivityHeartImg;
	}

	public List<QAFWebElement> getNFKiosEventLogPageActivityHeartImgList() {
		return NFKiosEventLogPageActivityHeartImgList;
	}

	public QAFWebElement getNFKiosEventLogPageActivityIntensityBtn() {
		return NFKiosEventLogPageActivityIntensityBtn;
	}

	public QAFWebElement getNFKiosEventLogPageActivityAmountfieldTxt() {
		return NFKiosEventLogPageActivityAmountfieldTxt;
	}

	public List<QAFWebElement> getNFKiosEventLogPageActivityAmountfieldTxtList() {
		return NFKiosEventLogPageActivityAmountfieldTxtList;
	}

	public QAFWebElement getNFKiosEventLogPageActivityUnitLbl() {
		return NFKiosEventLogPageActivityUnitLbl;
	}

	public QAFWebElement getNFKiosEventLogPageActivityTimingLbl() {
		return NFKiosEventLogPageActivityTimingLbl;
	}

	public QAFWebElement getNFKiosEventLogPageActivityNotefieldTxt() {
		return NFKiosEventLogPageActivityNotefieldTxt;
	}

	public QAFWebElement getNFKiosEventlogPageNotenoteFieldtxt() {
		return NFKiosEventlogPageNotenoteFieldtxt;
	}

	public QAFWebElement getNFKioseventlogPagenoteFieldtimingbtn() {
		return NFKioseventlogPagenoteFieldtimingbtn;
	}
	
	public QAFWebElement getNFKioseventlogPageenteredNotetxt() {
		return NFKioseventlogPageenteredNotetxt;
	}
	
	public QAFWebElement getNFKiosEventLogPageCarbNoteFieldTxt() {
		return NFKiosEventLogPageCarbNoteFieldTxt;
	}

	public QAFWebElement getNFKiosEventLogPageCarbAmountFieldTxt() {
		return NFKiosEventLogPageCarbAmountFieldTxt;
	}

	public List<QAFWebElement> getNFKiosEventLogPageCarbAmountFieldTxtList() {
		return NFKiosEventLogPageCarbAmountFieldTxtList;
	}

	public QAFWebElement getNFKiosEventLogPageCarbSpoonImg() {
		return NFKiosEventLogPageCarbSpoonImg;
	}

	public List<QAFWebElement> getNFKiosEventLogPageCarbSpoonImgList() {
		return NFKiosEventLogPageCarbSpoonImgList;
	}

	public QAFWebElement getNFKiosEventLogPageglucoseTimingValuebBtn() {
		return NFKiosEventLogPageglucoseTimingValuebBtn;
	}

	public QAFWebElement getNFKiosEventLogPageTimingPickerMinutePkr() {
		return NFKiosEventLogPageTimingPickerMinutePkr;
	}
	
	public QAFWebElement getNFKiosEventLogPageTimingPickerMeredianPkr() {
		return NFKiosEventLogPageTimingPickerMeredianPkr;
	}
	
	public QAFWebElement getNFKiosEventLogPageTimingPickerHourPkr() {
		return NFKiosEventLogPageTimingPickerHourPkr;
	}

	public QAFWebElement getNFKiosEventLogPageTimingPickerDatePkr() {
		return NFKiosEventLogPageTimingPickerDatePkr;
	}

	public QAFWebElement getNFKiosEventLogPageCarbBtn() {
		return NFKiosEventLogPageCarbBtn;
	}

	public QAFWebElement getNFKiosEventLogPageGlucoseBtn() {
		return NFKiosEventLogPageGlucoseBtn;
	}

	public QAFWebElement getNFKiosEventLogPageInsulinBtn() {
		return NFKiosEventLogPageInsulinBtn;
	}

	public QAFWebElement getNFKiosEventLogPageActivityBtn() {
		return NFKiosEventLogPageActivityBtn;
	}

	public QAFWebElement getNFKiosEventbtn() {
		return NFKiosEventbtn;
	}
	
	public QAFWebElement getNFKiosEventlogPageEventTimeselectOkBtn() {
		return NFKiosEventlogPageEventTimeselectOkBtn;
	}
	
	public QAFWebElement getNFKiosEventLogPageGlucoseUnitLbl() {
		return NFKiosEventLogPageGlucoseUnitLbl;
	}

	public List<QAFWebElement> getNFKiosEventLogPageGlucoseUnitLblList() {
		return NFKiosEventLogPageGlucoseUnitLblList;
	}

	public QAFWebElement getNFKiosEventLogPageGlucoseAmountTxt() {
		return NFKiosEventLogPageGlucoseAmountTxt;
	}

	public List<QAFWebElement> getNFKiosEventLogPageGlucoseAmountTxtList() {
		return NFKiosEventLogPageGlucoseAmountTxtList;
	}

	public QAFWebElement getNFKiosEventLogPageGlucoseTimingvalueTxt() {
		return NFKiosEventLogPageGlucoseTimingvalueTxt;
	}

	public QAFWebElement getNFKiosEventLogPageGlucoseAddnoteTxt() {
		return NFKiosEventLogPageGlucoseAddnoteTxt;
	}

	public QAFWebElement getNFKiosEventLogPageGlucoseDropImg() {
		return NFKiosEventLogPageGlucoseDropImg;
	}
	
	public QAFWebElement getNFKiosLogBookpageAddEventCrossIconImg() {
		return NFKiosEventLogPageAddEventCrossIconImg;
	}

	public List<QAFWebElement> getNFKiosEventLogPageGlucoseDropImgList() {
		return NFKiosEventLogPageGlucoseDropImgList;
	}

	public QAFWebElement getNFKiosEventLogPageAddeventBtn() {
		return NFKiosEventLogPageAddeventBtn;
	}

	public QAFWebElement getNFKiosEventLogPageSaveBtn() {
		return NFKiosEventLogPageSaveBtn;
	}

	public QAFWebElement getNFKiosEventLogPageStaticText(String text) {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl", text);
	}

	
	public QAFWebElement getNFKiosEventLogPageClassicViewBGAddedBG(String text1,
			String text2) {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.classic.bgValue.txt", text1,
				text2);
	}

	public QAFWebElement getNFKiosEventLogPageBefore365BreakfastRecord() {
		return NFKiosEventLogPageBefore365BreakfastRecord;
	}

	public QAFWebElement getNFKiosEventLogPageDoneBtnText() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl",
				LFSUtilsIOS.getPropString("appCommon.done"));
	}
	
	public QAFWebElement getNFKiosLogbookLegendPageTitle() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl",
				LFSUtilsIOS.getPropString("progress.report.graph.legend.title"));
	}

	public QAFWebElement getNFKiosLogbookInsulinTitle() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl",
				LFSUtilsIOS.getPropString("logbook.section.insulin.title"));
	}

	public QAFWebElement getNFKiosEventLogPageUndoBtn() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl",
				LFSUtilsIOS.getPropString("appCommon.revertValue"));
	}

	public QAFWebElement getNFKiosEventLogPageEditaneventLbl() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl",
				LFSUtilsIOS.getPropString("log.edit.event.title"));
	}

	public QAFWebElement getNFKiosEventLogPageOkBtn() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl",
				LFSUtilsIOS.getPropString("appCommon.yes"));
	}
	
	
	public QAFWebElement getNFKiosEventLogPageDeleteBtn() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl",
				LFSUtilsIOS.getPropString("appCommon.delete"));
	}

	public QAFWebElement getNFKiosEventLogPageBackBtn() {
		return NFKiosEventLogPageBackBtn;
	}

	public QAFWebElement getNFKiosEventLogPageGlucoseBeforemealBtn() {
		return NFKiosEventLogPageBeforemealBtn;
	}

	public QAFWebElement getNFKiosEventLogPageImproperPopUpLbl() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl",
				LFSUtilsIOS.getPropString("alerts.wrongValue.title"));
	}

	public QAFWebElement getNFKiosEventLogPageAddanothereventLbl() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl",
				LFSUtilsIOS.getPropString("log.action.addAnotherEvent"));
	}

	public QAFWebElement getNFKiosEventLogPageWeekViewboxBtn() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl",
				LFSUtilsIOS.getPropString("appCommon.today"));
	}

	public QAFWebElement getNFKiosEventLogPageClassicBtn() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.classic.btn",
				LFSUtilsIOS.getPropString("logbook.viewSelector.classic"));
	}
	

	public QAFWebElement getNFKiosEventLogPageWeekBtn() {
		return NFKiosEventLogPageWeekBtn;
	}

	public QAFWebElement getNFKiosEventLogPageDayBtn() {
		return NFKiosEventLogPageDayBtn;
	}

	public QAFWebElement getNFKiosEventLogPageAaddEventlbl() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl",
				LFSUtilsIOS.getPropString("log.add.event.title"));
	}

	public QAFWebElement getNFKiosEventLogPageSyncWithAccount() {
		return LFSUtilsIOS.getElement("NFKios.eventlogPage.static.lbl",
				LFSUtilsIOS.getPropString("syncronization.server.syncing"));
	}

	public QAFWebElement getNFKiosEventLogPageClassicTableTodayBtn() {
		return NFKiosEventLogPageClassicTableTodayBtn;
	}

	public QAFWebElement getNFKiosEventLogPageOneTouchLbl() {
		return NFKiosEventLogPageOneTouchLbl;
	}
	
	public QAFWebElement getNFKioAaddanEventLbl() {
		return NFKiosAddAnEventLbl;
	}
	
	//multiple event
	public List<QAFWebElement> getNFKLogbookAddeventAddvalueTxtList() {
		return NFKiosEventLogPageGlucoseAmountTxtList;
	}
	
	public void clickOnAddedEventScreen() {
		getNFKioshomepageaddedEventNote().waitForPresent();
		getNFKioshomepageaddedEventNote().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("Edit an event page displayed", MessageTypes.Pass);
	}
	
	
	// method to click on "log event" link on logbook page
	// 
	public void clickLogevent() {
		getNFKiosEventLogPageAddeventBtn().waitForPresent();
		getNFKiosEventLogPageAddeventBtn().verifyPresent("Log Event button is present");
		getNFKiosEventLogPageAddeventBtn().click();
		Reporter.logWithScreenShot("Add event page is displayed", MessageTypes.Pass);
	}

	// method to enter a manual blood glucose value
	// 
	public void enterManualBGvalue(String value) {
		//LFSUtilsIOS lfs = new LFSUtilsIOS();

		if (value.equalsIgnoreCase("HI")) {
			//if (!(lfs.getNFKiosKeyBoardDeleteBtn().isPresent()))
				//getNFKiosEventLogPageGlucoseAmountTxt().click();
			getNFKiosEventLogPageStaticText("HI").click();
			Reporter.logWithScreenShot("User selects blood glucose as HI", MessageTypes.Pass);
			//to click on Save button
			getNFKiosEventLogPageSaveBtn().click();
		} else if (value.equalsIgnoreCase("LO")) {
			//if (!(lfs.getNFKiosKeyBoardDeleteBtn().isPresent()))
				//getNFKiosEventLogPageGlucoseAmountTxt().click();
			getNFKiosEventLogPageStaticText("LO").click();
			Reporter.logWithScreenShot("User selects blood glucose as LO", MessageTypes.Pass);
			//to click on Save button
			getNFKiosEventLogPageSaveBtn().click();
		} else {
			getNFKiosEventLogPageGlucoseAmountTxt().clear();
			getNFKiosEventLogPageGlucoseAmountTxt().sendKeys(value);
		}
		LFSUtilsIOS.waitforLoad();
	  Reporter.logWithScreenShot("BG value entered", MessageTypes.Pass);
	}

	// method to select after food before food tag
	// 
	public void addGlucoseSelectBeforeAfter(String data) {

		data = data.toLowerCase();
		switch (data) {
			case "before" :
				getNFKiosEventLogPageGlucoseBeforemealBtn().click();
				Reporter.logWithScreenShot("full apple", MessageTypes.Pass);
				break;
			case "after" :
				getNFKiosEventLogPageGlucoseAftermealBtn().click();
				Reporter.logWithScreenShot("Half apple", MessageTypes.Pass);
				break;
		}

	}

	// method to click on save button on BG entry
	// 
	public void clickSaveBtnEventLog() {
		getNFKiosEventLogPageSaveBtn().waitForPresent();
		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	// gunther click classic view table today
	public void clickClassicTableToday() {
		getNFKiosEventLogPageClassicTableTodayBtn().waitForPresent();
		getNFKiosEventLogPageClassicTableTodayBtn().click();
	}

	// method to select log event list
	// 
	public void userSelectFromLogEventList(String option) {
		HomePageIOS homePageIOS = new HomePageIOS();
		//homePageIOS.getNFKiosHomepageAddEventBtn().waitForPresent();
		//homePageIOS.getNFKiosHomepageAddEventBtn().click();		
		//option = option.toUpperCase();
		switch (option) {
		
		case "GLUCOSE" :
//			waitForPageToLoad();
//			getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("log.type.bg")).waitForPresent();
//			getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("log.type.bg")).isPresent();
//			String bg=LFSUtilsIOS.getPropString("log.type.bg");
//			LFSUtilsIOS.pause(3000);
//			LFSUtilsIOS.clickWithText(bg);
			
			waitForPageToLoad();
		 	getNFKiosHomepageBGBtn().waitForPresent();
			getNFKiosHomepageBGBtn().click();
			
			break;	
			
		case "CARBS" :
			
/*			waitForPageToLoad();
			getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("log.type.carbs")).waitForPresent();
			getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("log.type.carbs")).isPresent();
			String carb=LFSUtilsIOS.getPropString("log.type.carbs");
			LFSUtilsIOS.pause(3000);
			LFSUtilsIOS.clickWithText(carb);
			break;	*/		
			waitForPageToLoad();
		 	getNFKiosHomepageCarbBtn().waitForPresent();
		 	getNFKiosHomepageCarbBtn().isPresent();
			getNFKiosHomepageCarbBtn().click();
			break;	
				
		case "INSULIN" :
			try {
		 	waitForPageToLoad();
		 	getNFKiosHomepageInsulinBtn().waitForPresent();
			getNFKiosHomepageInsulinBtn().click();
			
			}catch (Exception e) {
				
			}
			break;
					
		case "ACTIVITY" :
		/*	waitForPageToLoad();
			getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("more.general.activity")).waitForPresent();
			getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("more.general.activity")).isPresent();
			String activity=LFSUtilsIOS.getPropString("more.general.activity");
			LFSUtilsIOS.pause(3000);
			LFSUtilsIOS.clickWithText(activity);
			break;*/	
			
			waitForPageToLoad();
		 	getNFKiosHomepageActivityBtn().waitForPresent();
			getNFKiosHomepageActivityBtn().click();
			break;	
			
		case "NOTE":
			waitForPageToLoad();
			getNFKiosHomepageNoteBtn().waitForPresent();
			getNFKiosHomepageNoteBtn().click();
			break;	
		}
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("The user selected the event ", MessageTypes.Pass);
	}

	// Method to select event Timing picker
	// 
	public void selectEventTimingPicker(EventDetailBeans eventdetail) {
		Point p1 = getNFKiosEventLogPageTimingPickerDatePkr().getLocation();
		Dimension d1 = getNFKiosEventLogPageTimingPickerDatePkr().getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		// selecting last day from date picker
		TouchAction tch = new TouchAction(lfs.getDriver());
		tch.tap(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) - 70)
				.perform();
		Reporter.logWithScreenShot("Selected day", MessageTypes.Pass);
		int hour = Integer.parseInt(eventdetail.getHour());
		int minute = Integer.parseInt(eventdetail.getMiunute());
		LFSUtilsIOS.selectTimePicker(getNFKiosEventLogPageTimingPickerHourPkr(), hour);
		LFSUtilsIOS.selectTimePicker(getNFKiosEventLogPageTimingPickerMinutePkr(), minute);
		Reporter.logWithScreenShot("Set date and time", MessageTypes.Pass);
		getNFKiosEventLogPageDoneBtnText().click();
	}

	// Method to add manual glucose
	//  
	static String getAddedAmount;
	public void addManualGlucose(Object eventDetail) {
		if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")
				||pageProps.getString("language.name").equalsIgnoreCase("en-uk")
				||pageProps.getString("language.name").equalsIgnoreCase("en-ca")
				||pageProps.getString("language.name").equalsIgnoreCase("fr-ca")
				||pageProps.getString("language.name").equalsIgnoreCase("cz-cz")
				||pageProps.getString("language.name").equalsIgnoreCase("sl-sl")
				||pageProps.getString("language.name").equalsIgnoreCase("hr-hr")) {
			
			EventDetailBeans eventBean = new EventDetailBeans();
			if (eventDetail instanceof String) {

				eventBean.fillFromConfig((String) eventDetail);
			} else {
				eventBean.fillData(eventDetail);
			}
			Reporter.logWithScreenShot("Blood Glucose window before adding value", MessageTypes.Pass);

			int bgValue =ThreadLocalRandom.current().nextInt(8, 30);
			getNFKiosEventLogPageGlucoseAmountTxt().sendKeys(Integer.toString(bgValue));
			ConfigurationManager.getBundle().setProperty("classic.glucose",
					Integer.toString(bgValue));
			getAddedAmount = Integer.toString(bgValue);
			
			ConfigurationManager.getBundle().setProperty("classic.glucose", getAddedAmount);
			Reporter.logWithScreenShot("Blood Glucose window after editing value  ",
					MessageTypes.Pass);
			
			
			getNFKiosEventLogPageGlucoseAddnoteTxt().clear();
			getNFKiosEventLogPageGlucoseAddnoteTxt().sendKeys("Entering BG");

			//ConfigurationManager.getBundle().setProperty("classic.glucose", eventBean.getAmount());
			getNFKiosEventLogPageSaveBtn().click();
			//Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		} else {

				EventDetailBeans eventBean = new EventDetailBeans();
				if (eventDetail instanceof String) {

					eventBean.fillFromConfig((String) eventDetail);
				} else {
					eventBean.fillData(eventDetail);
				}
				
				
			int bgValue =ThreadLocalRandom.current().nextInt(250, 600);
			getAddedAmount = Integer.toString(bgValue);
			Reporter.logWithScreenShot("Blood Glucose window before adding value", MessageTypes.Pass);
			
			enterManualBGvalue(Integer.toString(bgValue));
			
			Reporter.logWithScreenShot("Blood Glucose window after adding value", MessageTypes.Pass);
			
			ConfigurationManager.getBundle().setProperty("classic.glucose", getAddedAmount);
			
			getNFKiosEventLogPageGlucoseAddnoteTxt().clear();
			
			getNFKiosEventLogPageGlucoseAddnoteTxt().sendKeys("Adding BG details");
			
			//ConfigurationManager.getBundle().setProperty("classic.glucose", eventBean.getAmount());
			
			getNFKiosEventLogPageSaveBtn().click();	
			//Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

		}
	}

	// Method to edit glucose details
	// 
	public void editManualGlucose(Object eventDetail) {
		if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")
				||pageProps.getString("language.name").equalsIgnoreCase("en-uk")
				||pageProps.getString("language.name").equalsIgnoreCase("en-ca")
				||pageProps.getString("language.name").equalsIgnoreCase("fr-ca")
				||pageProps.getString("language.name").equalsIgnoreCase("cz-cz")
				||pageProps.getString("language.name").equalsIgnoreCase("sl-sl")
				||pageProps.getString("language.name").equalsIgnoreCase("hr-hr")) {
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
			String getOldValue = getNFKiosEventLogPageGlucoseAmountTxt().getText().toString();
			int bgValue =ThreadLocalRandom.current().nextInt(8, 30);
			getAddedAmount = Integer.toString(bgValue);
			ConfigurationManager.getBundle().setProperty("editGlucose1.amount", getAddedAmount);
			Reporter.logWithScreenShot("Blood Glucose window before editing value",
					MessageTypes.Pass);
			enterManualBGvalue(Integer.toString(bgValue));
			LFSUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot(
					"Blood Glucose window after editing value" + Integer.toString(bgValue),
					MessageTypes.Pass);
	
			getNFKiosEventLogPageGlucoseAddnoteTxt().clear();
			getNFKiosEventLogPageGlucoseAddnoteTxt().sendKeys("Editing BG");
			getNFKiosEventLogPageSaveBtn().click();
			Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	} else {
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
			String getOldValue = getNFKiosEventLogPageGlucoseAmountTxt().getText().toString();
			int bgValue =ThreadLocalRandom.current().nextInt(250, 600);
			getAddedAmount = Integer.toString(bgValue);
			ConfigurationManager.getBundle().setProperty("editGlucose1.amount", getAddedAmount);
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			enterManualBGvalue(Integer.toString(bgValue));
			Reporter.logWithScreenShot("Blood Glucose window after editing value" + Integer.toString(bgValue),
					MessageTypes.Pass);
	
			getNFKiosEventLogPageGlucoseAddnoteTxt().clear();
			getNFKiosEventLogPageGlucoseAddnoteTxt().sendKeys("Editing BG");
			getNFKiosEventLogPageSaveBtn().click();
			Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		}
	}

	// Method to add carb amount
	// 
	public void addCarbAmount(String amount) {
		getNFKiosEventLogPageCarbAmountFieldTxt().click();
		getNFKiosEventLogPageCarbAmountFieldTxt().clear();
		getNFKiosEventLogPageCarbAmountFieldTxt().sendKeys(amount);
	}

	// Method to add carb
	// 
	public void addCarbDetail(Object eventDetail) {

//		getNFKiosEventLogPageCarbSpoonImg().waitForPresent();
//		getNFKiosEventLogPageCarbSpoonImg().click();
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		Reporter.logWithScreenShot("Carb window before entering value",
				MessageTypes.Pass);
		addCarbAmount(eventBean.getAmount());
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot(
				"Carb window after entering value" + eventBean.getAmount(),
				MessageTypes.Pass);
		  //to click on carb time picker field
        getNFKiosEventLogPageCarbTimingBtn().click();
          //to add carb note field
        getNFKiosEventLogPageCarbNoteFieldTxt().sendKeys("Adding Carb details");
		 //getNFKiosEventLogPageOneTouchLbl().click();
		getNFKiosEventLogPageSaveBtn().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("The user has clicked on Save button", MessageTypes.Pass);

	}

	// Method to edit carb details
	// 
	public void editCarbDetail(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		//getNFKiosEventLogPageCarbSpoonImg().waitForPresent();
		Reporter.logWithScreenShot("Carb window before editing value", MessageTypes.Pass);
		addCarbAmount(eventBean.getAmount());
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot(
				"Carb window after editing value is " + eventBean.getAmount(),
				MessageTypes.Pass);
		
		String textcarb=getNFKiosEventLogPageCarbNoteFieldTxt().getText();
	    LFSUtilsIOS.clickWithText(textcarb);
	    getNFKiosEventLogPageCarbNoteFieldTxt().clear();
		LFSUtilsIOS.hideKeyboard();
		getNFKiosEventLogPageCarbNoteFieldTxt().sendKeys("Editing ");
		getNFKiosEventLogPageSaveBtn().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	// Method to add insulin amount
	// 
	public void addInsulinAmount(String amount) {
		getNFKiosEventLogPageInsulinAmountfieldTxt().waitForPresent();
		getNFKiosEventLogPageInsulinAmountfieldTxt().clear();
		getNFKiosEventLogPageInsulinAmountfieldTxt().sendKeys(amount);
	}

	// Method to select insulin type
	// 
	public void selectInsulinType(String insulinType) {
		getNFKiosEventLogPageInsulinTypeBtn().waitForPresent();
		Reporter.logWithScreenShot("Insulin type picker", MessageTypes.Pass);
		getNFKiosEventLogPageInsulinTypeBtn().click();
		getNFKiosEventLogPageInsulinTypeBtn().sendKeys(insulinType);
		getNFKiosEventLogPageDoneBtnText().click();
		Reporter.logWithScreenShot("After selecting insulin type", MessageTypes.Pass);
	}

	// Method to add insuln
	// 
	public static int insulinValue = 0;
	
	public void addInsulinDetail(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
//		getNFKiosEventLogPageInsulinMedicineImg().waitForPresent();
//		getNFKiosEventLogPageInsulinMedicineImg().click();
		Reporter.logWithScreenShot("Insulin window before adding value ",
				MessageTypes.Pass);
		addInsulinAmount(eventBean.getAmount());
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot(
				"Insulin window after adding value " + eventBean.getAmount(),
				MessageTypes.Pass);
//		BolusCalculatorPageIOS bolus = new BolusCalculatorPageIOS();
//		BolusCalculatorPageIOS.totalinsulin = Integer.parseInt(eventBean.getAmount());
		getNFKiosEventLogPageInsulinTypeBtn().click();
		//getNFKiosEventLogPageInsulinTypeBtn().click();
		String insulinType = ConfigurationManager.getBundle()
				.getString("event.detail.insulinController.long");
		LFSUtilsIOS.clickWithText(insulinType);
		ConfigurationManager.getBundle().setProperty("last.added.insulin.type",
				insulinType);
		getNFKiosEventLogPageInsulinNotefieldTxt().clear();
		getNFKiosEventLogPageInsulinNotefieldTxt().sendKeys("Adding insulin details");
		//getNFKiosEventLogPageAaddEventlbl().click();
		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("The user has clicked on Save button ", MessageTypes.Pass);
	}

	// Method to edit insulin value
	// 
	public void editInsulinDetail(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		//getNFKiosEventLogPageInsulinMedicineImg().waitForPresent(); not able to inspect the element so commented....
		Reporter.logWithScreenShot("Insulin window before editing value", MessageTypes.Pass);
		addInsulinAmount(eventBean.getAmount());
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("Insulin window after editing value is " + eventBean.getAmount(),
				MessageTypes.Pass);

		//getNFKiosEventLogPageInsulinMedicineImg().click();
		String text=getNFKiosEventLogPageInsulinNotefieldTxt().getText();
	    LFSUtilsIOS.clickWithText(text);
		getNFKiosEventLogPageInsulinNotefieldTxt().clear();
		LFSUtilsIOS.hideKeyboard();
		getNFKiosEventLogPageInsulinNotefieldTxt().sendKeys("Editing insulin ");
		//getNFKiosEventLogPageInsulinMedicineImg().click();
		getNFKiosEventLogPageSaveBtn().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	// Method to add Activity amount
	// 
	public void addActivityAmount(String amount) {
		getNFKiosEventLogPageActivityAmountfieldTxt().waitForPresent();
		getNFKiosEventLogPageActivityAmountfieldTxt().getText().replaceAll("[0-9]","");
		getNFKiosEventLogPageActivityAmountfieldTxt().clear();
		getNFKiosEventLogPageActivityAmountfieldTxt().sendKeys(amount);
	}

	// Method to select Intensity type
	// 
	public void selectIntensity(String intensityType) {
		getNFKiosEventLogPageTimingPickerDatePkr().waitForPresent();
		getNFKiosEventLogPageTimingPickerDatePkr().sendKeys(intensityType);
		getNFKiosEventLogPageDoneBtnText().click();
	}

	public void addNoteText(String noteText) {
		getNFKiosEventlogPageNotenoteFieldtxt().waitForPresent();
		getNFKiosEventlogPageNotenoteFieldtxt().clear();
		getNFKiosEventlogPageNotenoteFieldtxt().sendKeys(noteText);
		
	}
	
	// Method to add activity details
	// 
	public void addActivityDetail(Object eventDetail) {		
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {
			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		Reporter.logWithScreenShot("Activity window before adding value",
				MessageTypes.Pass);
		addActivityAmount(eventBean.getAmount());
		//LFSUtilsIOS.hideKeyboard();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot(
				"Activity window after adding value is " + eventBean.getAmount(),
				MessageTypes.Pass);
		getNFKiosEventLogPageActivityIntensityBtn().waitForPresent();
		getNFKiosEventLogPageActivityIntensityBtn().click();
		if (!getNFKiosEventLogPageActivityIntensityBtn().isPresent())
			getNFKiosEventLogPageActivityIntensityBtn().click();
		String intensity = eventBean.getActivityType();
		LFSUtilsIOS.clickWithText(intensity);
		Reporter.logWithScreenShot("Selected intensity type is " + intensity,MessageTypes.Pass);
		getNFKiosEventLogPageActivityNotefieldTxt().clear();
		getNFKiosEventLogPageActivityNotefieldTxt().sendKeys("Adding activity details");
		getNFKiosEventLogPageSaveBtn().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("The user has clicked on Save button ", MessageTypes.Pass);

	}
	
	public void addNoteDetails(Object eventDetails) {
		EventDetailBeans eventBeans = new EventDetailBeans();
		if (eventDetails instanceof String) {
			eventBeans.fillFromConfig((String) eventDetails);
		} else {
			eventBeans.fillData(eventDetails);
		}

		Reporter.logWithScreenShot("Note window before adding value",
				MessageTypes.Pass);
		addNoteText(eventBeans.getnote());
		LFSUtilsIOS.hideKeyboard();
		Reporter.logWithScreenShot(
				"Note window after adding value is " + eventBeans.getnote(),
				MessageTypes.Pass);
		
	/*	getNFKioseventlogPageNotenoteFieldtxt().clear();
		getNFKioseventlogPageNotenoteFieldtxt().sendKeys("Please Take insulin for high BG");*/
		getNFKiosEventLogPageSaveBtn().click();
	}

	// Method to verify add or edit event screen for blood glucose
	// 
	public void verifyAddBGEventScreen() {
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();

		getNFKiosEventLogPageGlucoseAmountTxt().verifyPresent("Glucose amount text field");

		if (LFSUtilsIOS.tryMethod(getNFKiosEventLogPageGlucoseBeforemealBtn())) {
			getNFKiosEventLogPageGlucoseBeforemealBtn()
					.verifyPresent("Before meal button");
			getNFKiosEventLogPageGlucoseAftermealBtn().verifyPresent("After meal button");

			addGlucoseSelectBeforeAfter("after");
		}

		getNFKiosEventLogPageGlucoseAddnoteTxt().clear();
		getNFKiosEventLogPageGlucoseAddnoteTxt().sendKeys("Entering BG");

		getNFKiosEventLogPageglucoseTimingValuebBtn().click();
		getNFKiosEventLogPageglucoseTimingValuebBtn().click();
		//verifyTimingPickerFunctionality(getNFKiosEventLogPageGlucoseTimingvalueTxt());

	}

	// Method to verify Timing picker functionality
	// 
	public void verifyTimingPickerFunctionality(QAFWebElement element) {
		getNFKiosEventLogPageTimingPickerDatePkr().waitForPresent();
		getNFKiosEventLogPageTimingPickerDatePkr().verifyPresent("Date picker");
		getNFKiosEventLogPageTimingPickerHourPkr().verifyPresent("Hour picker");
		getNFKiosEventLogPageTimingPickerMinutePkr().verifyPresent("Minute picker");
		Point p1 = getNFKiosEventLogPageTimingPickerDatePkr().getLocation();
		Dimension d1 = getNFKiosEventLogPageTimingPickerDatePkr().getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();

		WebDriverTestCase.verifyTrue(
				getNFKiosEventLogPageTimingPickerDatePkr().getAttribute("value")
						.contains(LFSUtilsIOS.getPropString("appCommon.today")),
				"Today as default value not present", "Today as default value present");

		// selecting tomorrow day from date picker
		try {
			TouchAction tch = new TouchAction(lfs.getDriver());
			tch.tap(p1.getX() + d1.getWidth() / 2,
					p1.getY() + ((d1.getHeight()) / 2) + 50).perform();
			LFSUtilsIOS.pause(1000);
			WebDriverTestCase.verifyTrue(
					getNFKiosEventLogPageTimingPickerDatePkr().getAttribute("value")
							.contains(LFSUtilsIOS.getPropString("appCommon.today")),
					"Selecting future date", "Future date not allowed");

		} catch (Exception e) {
		}

		int hour = 7;
		int minute = 30;
		TouchAction tch = new TouchAction(lfs.getDriver());
		tch.tap(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) - 50)
				.perform();
		LFSUtilsIOS.selectTimePicker(getNFKiosEventLogPageTimingPickerHourPkr(), hour);
		LFSUtilsIOS.selectTimePicker(getNFKiosEventLogPageTimingPickerMinutePkr(), minute);
		Reporter.logWithScreenShot("Set date and time", MessageTypes.Pass);

		WebDriverTestCase.verifyTrue(element.getAttribute("label").contains("" + hour),
				"Selected hour not available on event screen",
				"Selected hour available on event screen");
		WebDriverTestCase.verifyTrue(element.getAttribute("label").contains("" + minute),
				"Selected minute not available on event screen",
				"Selected minute available on event screen");
	}

	// method to verify are you sure question flow
	// 
	public void verifyAreYouSurePopUp() {

		getNFKiosEventLogPageBackBtn().click();
		getNFKiosEventLogPageStaticText(
				LFSUtilsIOS.getPropString("addEvent.unsavedEntry.title"))
						.waitForPresent();
		getNFKiosEventLogPageStaticText(
				LFSUtilsIOS.getPropString("addEvent.unsavedEntry.title"))
						.verifyPresent("Are you sure pop up");
		getNFKiosEventLogPageStaticText(
				LFSUtilsIOS.getPropString("addEvent.unsavedEntry.message"))
						.verifyPresent("Change will not saved error message");
		getNFKiosEventLogPageAaddEventlbl().waitForVisible();
		getNFKiosEventLogPageAaddEventlbl()
				.verifyPresent("After clicking cancel button event screen");
		getNFKiosEventLogPageBackBtn().click();
		getNFKiosEventLogPageOkBtn().click();
		Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
		getNFKiosEventLogPageAddeventBtn().waitForPresent();
		getNFKiosEventLogPageAddeventBtn().verifyPresent("Logbook screen event button ");

	}

	// Method to to verify add or edit event screen for carbs
	// 
	public void verifyAddCarbEventScreen() {

		getNFKiosEventLogPageCarbSpoonImg().waitForPresent();
		getNFKiosEventLogPageCarbAmountFieldTxt().verifyPresent("carb amount text field");
		getNFKiosEventLogPageCarbNoteFieldTxt().verifyPresent("Add note text field");
		getNFKiosEventLogPageCarbNoteFieldTxt().clear();
		getNFKiosEventLogPageCarbNoteFieldTxt().sendKeys("Entering carb");
		getNFKiosEventLogPageCarbTimingBtn().click();
		getNFKiosEventLogPageCarbTimingBtn().click();
		getNFKiosEventLogPageCarbSpoonImg().click();
		Reporter.logWithScreenShot("Entered details", MessageTypes.Pass);

	}

	// Method to verify add insulin screen
	// 
	public void verifyAddInsulinEventScreen() {

		getNFKiosEventLogPageInsulinMedicineImg().waitForPresent();
		getNFKiosEventLogPageInsulinMedicineImg().verifyPresent("Insulin image");
		getNFKiosEventLogPageInsulinAmountfieldTxt()
				.verifyPresent("Insulin amount text field");
		getNFKiosEventLogPageInsulinAmountfieldTxt().sendKeys("9.11");
		WebDriverTestCase.verifyTrue(
				getNFKiosEventLogPageInsulinAmountfieldTxt().getAttribute("value").equals(
						"9.1"),
				"Insulin field accepting more than one decimal place",
				"Insulin field accepting upto one decimal place");
		getNFKiosEventLogPageInsulinTypeBtn().verifyPresent("Insulin type button");
		 getNFKiosEventLogPageInsulinTypeBtn().click();
		if (!getNFKiosEventLogPageTimingPickerDatePkr().isPresent())
			getNFKiosEventLogPageInsulinTypeBtn().click();
		getNFKiosEventLogPageInsulinNotefieldTxt().clear();
		LFSUtilsIOS.pause(1000);
		getNFKiosEventLogPageInsulinNotefieldTxt().click();
		LFSUtilsIOS.pause(1000);
		getNFKiosEventLogPageInsulinNotefieldTxt().sendKeys("Entering insulin");
		getNFKiosEventLogPageInsulinMedicineImg().waitForPresent();
	}

	// Method to verify insulin type picker and value
	// 
	public void verifyInsulinType() {
		getNFKiosEventLogPageTimingPickerDatePkr().waitForPresent();
		Reporter.logWithScreenShot("Insulin type none", MessageTypes.Pass);
		getNFKiosEventLogPageTimingPickerDatePkr().sendKeys(
				LFSUtilsIOS.getPropString("event.detail.insulinController.rapid"));
		Reporter.logWithScreenShot("Insulin type rapid", MessageTypes.Pass);
		getNFKiosEventLogPageTimingPickerDatePkr().sendKeys(
				LFSUtilsIOS.getPropString("event.detail.insulinController.long"));
		Reporter.logWithScreenShot("Insulin type long", MessageTypes.Pass);
		getNFKiosEventLogPageTimingPickerDatePkr().sendKeys(
				LFSUtilsIOS.getPropString("event.detail.insulinController.mix"));
		Reporter.logWithScreenShot("Insulin type mix", MessageTypes.Pass);
		getNFKiosEventLogPageTimingPickerDatePkr().sendKeys(
				LFSUtilsIOS.getPropString("event.detail.insulinController.nph"));
		Reporter.logWithScreenShot("Insulin type nph", MessageTypes.Pass);
		getNFKiosEventLogPageTimingPickerDatePkr().sendKeys(
				LFSUtilsIOS.getPropString("event.detail.insulinController.other"));
		Reporter.logWithScreenShot("Insulin type other", MessageTypes.Pass);

	}

	// Method to verify add activity screens and flow
	public void verifyAddActivityEventScreen() {
		getNFKiosEventLogPageActivityHeartImg().waitForPresent();
		getNFKiosEventLogPageActivityHeartImg().verifyPresent("Activity heart icon");
		getNFKiosEventLogPageActivityAmountfieldTxt()
				.verifyPresent("Activity amount text field");
		getNFKiosEventLogPageActivityUnitLbl().verifyPresent("UOM min ");

		getNFKiosEventLogPageActivityNotefieldTxt().verifyPresent("Note field");
		getNFKiosEventLogPageActivityNotefieldTxt().sendKeys("Entering Activity");

		getNFKiosEventLogPageActivityTimingBtn().click();
		getNFKiosEventLogPageActivityTimingBtn().click();
		getNFKiosEventLogPageActivityIntensityBtn().click();
		if (!getNFKiosEventLogPageTimingPickerDatePkr().isPresent())
			getNFKiosEventLogPageActivityIntensityBtn().click();
		getNFKiosEventLogPageActivityHeartImg().click();

	}

	// Method to verify intensity type
	// 
	public void intensityType() {
		getNFKiosEventLogPageTimingPickerDatePkr().waitForPresent();
		Reporter.logWithScreenShot("activity type", MessageTypes.Pass);

	}
	
	//to verify added events on Event Log Screen
	public void verifyAddedEventOnEventLogScreen(Object eventDetail )
	{
		getNFKiosEventbtn().click();
			EventDetailBeans eventBean = new EventDetailBeans();
			if (eventDetail instanceof String) {

				eventBean.fillFromConfig((String) eventDetail);
			} else {
				eventBean.fillData(eventDetail);
			}
			getNFKiosEventbtn().waitForPresent();	
			WebDriverTestCase
			.verifyTrue(
					getNFKiosEventLogPageActivityAmountfieldTxt().getText()
							.contains(eventBean.getAmount()),
					" Incorrect value is displayed ", "Entered value is " +eventBean.getAmount());
			Reporter.logWithScreenShot("The user verify Events added on Event Log Screen", MessageTypes.Pass);
	}
	
public void verifyAddedNoteOnEventLogScreen(Object eventDetails1 ) {
		
	getNFKiosEventbtn().click();
		EventDetailBeans eventBean1 = new EventDetailBeans();
		if (eventDetails1 instanceof String) {

			eventBean1.fillFromConfig((String) eventDetails1);
		} else {
			eventBean1.fillData(eventDetails1);
		}
	//	getNFKiosEventbtn().waitForPresent();	
			WebDriverTestCase
		.verifyTrue(
				getNFKioseventlogPageenteredNotetxt().getText().substring(0,12)
						.equals(eventBean1.getnote().substring(0,12)),
				" Incorrect value is displayed ", "Entered Note is " +eventBean1.getnote());
		Reporter.logWithScreenShot("Verify Events added on Event Log Screen", MessageTypes.Pass);

	}
	
   // Method to add multiple event and verify on home screen
	// 
	public void addMultipleEvent() {

		EventDetailBeans eventBean = new EventDetailBeans();

		eventBean.fillData("addMultipleEvent.addGlucose");
		enterManualBGvalue(eventBean.getAmount());
		
		Reporter.logWithScreenShot("Added glucose amount" + eventBean.getAmount(),
				MessageTypes.Pass);
		getNFKioAaddanEventLbl().click();
		//getNFKiosEventLogPageOneTouchLbl().click();
		LFSUtilsIOS.pause(3000);
		home.getNFKiosHomepageAddeventBtn().waitForPresent();
		home.getNFKiosHomepageAddeventBtn().click();
		//LFSUtilsIOS.waitforLoad();
		userSelectFromLogEventList("carbs");
		eventBean.fillData("addMultipleEvent.addCarb");
		addCarbAmount(eventBean.getAmount());
		Reporter.logWithScreenShot("Added carb amount" + eventBean.getAmount(),
				MessageTypes.Pass);

		getNFKiosEventLogPageSaveBtn().click();

//		HomePageIOS home = new HomePageIOS();
//		home.clickOnHome();
//		WebDriverTestCase.verifyTrue(
//				home.getNFKiosHomepageAddedEventDynamicAmountText(eventBean.getAmount())
//						.isPresent(),
//				eventBean.getAmount() + "Expected amount not present",
//				"Proper amount  " + eventBean.getAmount());
//		WebDriverTestCase.verifyTrue(
//				home.getNFKiosHomepageAddedEventDynamicLbl(eventBean.getUnit())
//						.isPresent(),
//				"Inproper unit", "Proper UOM  " + eventBean.getUnit());
//		
//		//Delete Event
//		home.getNFKiosHomepageAddedEventDynamicAmountText(eventBean.getAmount()).click();
//		getNFKiosEventLogPageEditEventDeleteBtn().waitForPresent();
//		getNFKiosEventLogPageEditEventDeleteBtn().click();
//		if (getNFKiosEventLogPageOkBtn().isPresent())
//			getNFKiosEventLogPageOkBtn().click();
//		LFSUtilsIOS.pause(3000);
//		eventBean.fillData("addMultipleEvent.addGlucose");
//		WebDriverTestCase.verifyTrue(
//				home.getNFKiosHomepageAddedEventDynamicAmountText(eventBean.getAmount())
//						.isPresent(),
//				eventBean.getAmount() + "Expected amount not present",
//				"Proper amount  " + eventBean.getAmount());
//		WebDriverTestCase.verifyTrue(
//				home.getNFKiosHomepageAddedEventDynamicLbl(eventBean.getUnit())
//						.isPresent(),
//				"Inproper unit", "Proper UOM  " + eventBean.getUnit());
//		// Delete the events
//		home.getNFKiosHomepageAddedEventDynamicAmountText(eventBean.getAmount()).click();
//		getNFKiosEventLogPageEditEventDeleteBtn().waitForPresent();
//		getNFKiosEventLogPageEditEventDeleteBtn().click();
//		if (getNFKiosEventLogPageOkBtn().isPresent())
//			getNFKiosEventLogPageOkBtn().click();
		
	}

	// Method to verify BG limit
	// 
	public void verifyAllowedBGRange(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		enterManualBGvalue("HI");
		WebDriverTestCase
				.verifyTrue(
						getNFKiosEventLogPageGlucoseAmountTxt().getAttribute("value")
								.contains("HI"),
						" HI is not entered after", "HI is entered after");
		enterManualBGvalue("LO");
		WebDriverTestCase
				.verifyTrue(
						getNFKiosEventLogPageGlucoseAmountTxt().getAttribute("value")
								.contains("LO"),
						" LO is not entered after", "LO is entered after");

		String option = eventBean.getUnit().toUpperCase();
		switch (option) {
			case "MG/DL" :
				int lowvalue = Integer.parseInt(eventBean.getLowestGlucosValue()) - 1;
				enterManualBGvalue("" + lowvalue);
				getNFKiosEventLogPageGlucoseAftermealBtn().click();
				int highvalue = Integer.parseInt(eventBean.getHighstGlucosValue()) + 1;
				enterManualBGvalue("" + highvalue);
				getNFKiosEventLogPageGlucoseAftermealBtn().click();
				break;
			case "MMOL/L" :
				double lowvalue1 =
						(Float.parseFloat(eventBean.getLowestGlucosValue())) - 0.1;
				enterManualBGvalue("" + lowvalue1);
				getNFKiosEventLogPageGlucoseAftermealBtn().click();
				try {
					getNFKiosEventLogPageStaticText(
							ConstantUtils.BG_MMOL_VALUE_RANGE_ERROR_MSG)
									.waitForPresent(5000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				getNFKiosEventLogPageStaticText(
						ConstantUtils.BG_MMOL_VALUE_RANGE_ERROR_MSG)
								.verifyPresent("Blood glucose range error for low value");
				getNFKiosEventLogPageUndoBtn().click();
				double highvalue1 =
						(Float.parseFloat(eventBean.getHighstGlucosValue())) + 0.2;
				enterManualBGvalue("" + highvalue1);
				getNFKiosEventLogPageGlucoseAftermealBtn().click();
			
				try {
					getNFKiosEventLogPageStaticText(
							ConstantUtils.BG_MMOL_VALUE_RANGE_ERROR_MSG)
									.waitForPresent(5000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				getNFKiosEventLogPageStaticText(
						ConstantUtils.BG_MMOL_VALUE_RANGE_ERROR_MSG).verifyPresent(
								"Blood glucose range error for high value");
				getNFKiosEventLogPageUndoBtn().click();

				break;
		}

	}

	// Method to verify Add Event Screen
	public void verifyAddEventScreen() {
		getNFKiosEventLogPageGlucoseBtn().verifyPresent("Add BG button is present");
		getNFKiosEventLogPageCarbBtn().verifyPresent("Carbs button is present");
		getNFKiosEventLogPageInsulinBtn().verifyPresent("Insulin button is present");
		getNFKiosEventLogPageActivityBtn().verifyPresent("Activity button is present");
		getNFKiosEventLogPageSaveBtn().verifyPresent("Save button is present");
		getNFKiosEventLogPageBackBtn().verifyPresent("Back button is present");
	}

	// Method to tap back arrow
	public void tapAppBackArrow() {
		getNFKiosLogBookpageAddEventCrossIconImg().click();
	
	}

	public void verifyUnitOfMeasurement(String option) {
		getNFKiosEventLogPageAaddEventlbl().waitForPresent();
		option = option.toUpperCase();
		switch (option) {
			case "MG/DL" :
				if (getNFKiosEventLogPageGlucoseUnitLbl().getText().toString()
						.equalsIgnoreCase("MG/DL"))
					Reporter.logWithScreenShot("Unit of Measurement is" + option,
							MessageTypes.Pass);
				break;
			case "MMOL/L" :
				if (getNFKiosEventLogPageGlucoseUnitLbl().getText().toString()
						.equalsIgnoreCase("MMOL/L"))
					Reporter.logWithScreenShot("Unit of Measurement is" + option,
							MessageTypes.Pass);
				break;
		}
	}

	public void clickClassic() {
		getNFKiosEventLogPageClassicBtn().waitForPresent();
		getNFKiosEventLogPageClassicBtn().click();

	}

	// Method to verify event screen and click on delete event
	// 
	public void verifydeleteEvent() {
		if (getNFKiosEventLogPageDoneBtnText().isPresent()) {
			getNFKiosEventLogPageDoneBtnText().click();
		}
		try {
			getNFKiosEventLogPageEditaneventLbl().waitForPresent();
			getNFKiosEventLogPageEditaneventLbl().verifyPresent("Edit screen");
			getNFKiosEventLogPageEditEventDeleteBtn().verifyEnabled("Delete button");
			getNFKiosEventLogPageEditEventDeleteBtn().click();
		} catch (Exception e) {
		}
		if (!getNFKiosEventLogPageOkBtn().isPresent())
		getNFKiosEventLogPageEditEventDeleteBtn().click();
		// SG UPdate
		try {
			getNFKiosEventLogPageOkBtn().waitForPresent();
			Reporter.logWithScreenShot("Delete confirm pop up", MessageTypes.Pass);
			getNFKiosEventLogPageOkBtn().click();
			LFSUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot("After clicking OK on delete confirm popup",
					MessageTypes.Pass);
		} catch (Exception e) {
		}
	}
	
	public void verifyDeleteEventButton() {
		if (getNFKiosEventLogPageDoneBtnText().isPresent()) {
			getNFKiosEventLogPageDoneBtnText().click();
		}
		try {
			getNFKiosEventLogPageEditaneventLbl().waitForPresent();
			getNFKiosEventLogPageEditaneventLbl().verifyPresent("Edit screen");
			getNFKiosEventLogPageEditEventDeleteBtn().verifyEnabled("Delete button");
			getNFKiosEventLogPageEditEventDeleteBtn().click();
			LFSUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot("After clicking on delete button", MessageTypes.Pass);
		} catch (Exception e) {
		   e.printStackTrace();
		}
		if (!getNFKiosEventLogPageOkBtn().isPresent())
			getNFKiosEventLogPageEditEventDeleteBtn().click();
		Reporter.logWithScreenShot("After clicking on delete button", MessageTypes.Pass);
	}

	// method to verify all event
	// 
	public void verifyAlleventScreen() {
		getNFKiosEventLogPageClassicBtn().waitForPresent();
		getNFKiosEventLogPageClassicBtn().verifyPresent("Logbook screen classic view button");

	}

	public void clickClassicCurrentDate(Object eventDetail) {

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		String currentMonth = LFSUtilsIOS.getCurrentMonth();
		String currentMonthNumeric =
				LFSUtilsIOS.monthIntValue(currentMonth.substring(0, 3));
		int date = Integer.parseInt(LFSUtilsIOS.getCurrentDate());

		String dateformat = currentMonthNumeric + "/" + date;
		QAFWebElement ele = getNFKiosEventLogPageClassicViewBGAddedBG(dateformat,
				eventBean.getAmount());
		ele.verifyPresent("added BG");
		ele.click();

	}

	// Method to verify note field length
	// 
	public void maxAllowedNoteFieldCharacter() {
		getNFKiosEventLogPageGlucoseAddnoteTxt().waitForPresent();
		int limit = 141;
		String typeName = RandomStringUtils.randomAlphanumeric(limit);
		try {
		getNFKiosEventLogPageGlucoseAddnoteTxt().clear();
		getNFKiosEventLogPageGlucoseAddnoteTxt().sendKeys(typeName);
	    Validator.verifyThat("Note charcter length",getNFKiosEventLogPageGlucoseAddnoteTxt().getAttribute("value").length(),
		Matchers.lessThanOrEqualTo(limit - 1));
	    }catch (Exception e) {
			Reporter.log("The user was unable to send Notes ");
		}
	
	}

	// Method to verify time picker future not allowed
	// 
	public void verifyTimePickerFutureNotAllowed() {
		
		Point p1 = getNFKiosEventLogPageTimingPickerDatePkr().getLocation();
		Dimension d1 = getNFKiosEventLogPageTimingPickerDatePkr().getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		TouchAction tch = new TouchAction(lfs.getDriver());
		int count = 0;
		while (!(getNFKiosEventLogPageTimingPickerDatePkr().getAttribute("value")
				.toString().contains(LFSUtilsIOS.getPropString("appCommon.today")))) {
			try {
				tch.tap(p1.getX() + d1.getWidth() / 2,
						p1.getY() + ((d1.getHeight()) / 2) + 70).perform();
			} catch (Exception e) {
			}
			count++;
			if (count == 10)
				break;
		}
		String day = getNFKiosEventLogPageTimingPickerDatePkr().getAttribute("value");
		tch.tap(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) + 70)
				.perform();
		LFSUtilsIOS.pause(1000);
		WebDriverTestCase.verifyTrue(getNFKiosEventLogPageTimingPickerDatePkr().getAttribute("value").contains(day),"Selecting future date", "picker now allowing Future date ");
}

	// Method to verify carb allowed value range
	// 
	// Gunther update to confirm value entered does not exceed 999
	public void carValuebAllowedRange() {
		addCarbAmount("9999");
		int carbExpected = 999;
		String carbMaxCompare = Integer.toString(carbExpected);
		String carbInApp = getNFKiosEventLogPageCarbAmountFieldTxt().getText();
		if (carbMaxCompare.equals(carbInApp)) {
			Reporter.logWithScreenShot("Carb value max not exceeded", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Carb value max exceeded", MessageTypes.Fail);
		}

		getNFKiosEventLogPageOneTouchLbl().click();
		getNFKiosEventLogPageCarbTimingBtn().click();
		getNFKiosEventLogPageCarbTimingBtn().click();
		verifyTimePickerFutureNotAllowed();
		getNFKiosEventLogPageDoneBtnText().click();
		maxAllowedNoteFieldCharacter();
		getNFKiosEventLogPageOneTouchLbl().click();
	}

	// Method to verify insulin allowed range
	// 
	// SG updated to confirm Save button not enabled when limit exceeded
	public void insulinAllowedRangeTimeType() {
//		getNFKiosEventLogPageInsulinMedicineImg().waitForPresent();
//		getNFKiosEventLogPageInsulinMedicineImg().click();
		addInsulinAmount("251");
		if (!getNFKiosEventLogPageSaveBtn().isEnabled()) {
			System.out.print("Save disabled");
			Reporter.logWithScreenShot("Save disabled insulin limit exceeded",MessageTypes.Pass);
		} else {
			System.out.print("Save enabled");
			Reporter.logWithScreenShot("Save enabled but insulin limit exceeded",MessageTypes.Fail);
		}
		getNFKiosEventLogPageInsulinTypeBtn().click();
		if (getNFKiosEventLogPageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent())
		{	
		getNFKiosEventLogPageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		}
		else
			Reporter.logWithScreenShot("No error Pop up displayed", MessageTypes.Fail);
		addInsulinAmount("250");
		if (!getNFKiosEventLogPageTimingPickerDatePkr().isPresent())
			getNFKiosEventLogPageInsulinTimingBtn().click();
		verifyTimePickerFutureNotAllowed();
		getNFKiosEventLogPageDoneBtnText().click();
		//Added by Payal on 12/08/2019 to verify insulin type 
		getNFKiosEventLogPageInsulinTypeBtn().click();
		getNFKiosEventLogPageDoneBtnText().click();
	

	}

	// Method to verify activity allowed range
	// 
	public void activityAllowedRangeTimeDuration() {
		getNFKiosEventLogPageActivityHeartImg().waitForPresent();
		getNFKiosEventLogPageActivityHeartImg().click();
		addActivityAmount("1441");
		if (!getNFKiosEventLogPageSaveBtn().isEnabled()) {
			System.out.print("Save disabled");
			Reporter.logWithScreenShot("Save disabled activity limit exceeded",
					MessageTypes.Pass);
		} else {
			System.out.print("Save enabled");
			Reporter.logWithScreenShot("Save enabled but activity limit exceeded",
					MessageTypes.Fail);
		}

		addActivityAmount("1440");
		getNFKiosEventLogPageOneTouchLbl().click();
		getNFKiosEventLogPageActivityTimingBtn().click();
		getNFKiosEventLogPageActivityTimingBtn().click();
		verifyTimePickerFutureNotAllowed();
		getNFKiosEventLogPageDoneBtnText().click();
		maxAllowedNoteFieldCharacter();
		getNFKiosEventLogPageOneTouchLbl().click();

	}

	// Method to verify glucose time and note field verification
	// 
	public void allowedNoteRangeTime() {
		getNFKiosEventLogPageCarbAmountFieldTxt().clear();
		getNFKiosEventLogPageCarbAmountFieldTxt().sendKeys("100");
		getNFKiosEventLogPageglucoseTimingValuebBtn().click();
		getNFKiosEventLogPageglucoseTimingValuebBtn().click();
		try {
			getNFKiosEventLogPageTimingPickerDatePkr().waitForPresent(10000);;;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*if (!getNFKiosEventLogPageTimingPickerDatePkr().isPresent())
			getNFKiosEventLogPageglucoseTimingValuebBtn().waitForPresent(10000);
		getNFKiosEventLogPageglucoseTimingValuebBtn().click();*/
		getNFKiosEventLogPageglucoseTimingValuebBtn().click();
		try {
			getNFKiosEventLogPageTimingPickerDatePkr().waitForPresent(10000);;;
		} catch (Exception e) {
			e.printStackTrace();
		}
		verifyTimePickerFutureNotAllowed();
		maxAllowedNoteFieldCharacter();
	}

	private IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();
	
	// Method to verify adding multiple event and verify on logbook
	// 
	public void addGlucoseEditCarbActivityInsulin() {
		userSelectFromLogEventList("GLUCOSE");
		int randomNumberGlucose0;
		if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")
				||pageProps.getString("language.name").equalsIgnoreCase("en-uk")
				||pageProps.getString("language.name").equalsIgnoreCase("en-ca")
				||pageProps.getString("language.name").equalsIgnoreCase("fr-ca")
				||pageProps.getString("language.name").equalsIgnoreCase("cz-cz")
				||pageProps.getString("language.name").equalsIgnoreCase("sl-sl")
				||pageProps.getString("language.name").equalsIgnoreCase("hr-hr")){
			randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(8,30);
		} else {
			randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
		}
		
		String randomNumberGlucose = LFSUtilsIOS.mmolMGDL(randomNumberGlucose0);
		ConfigurationManager.getBundle().setProperty("classic.glucose",
				randomNumberGlucose);
		enterManualBGvalue(randomNumberGlucose + "");
		
		
		Reporter.logWithScreenShot(
				"Blood Glucose window after editing value " + randomNumberGlucose,
				MessageTypes.Pass);
		//getNFKiosEventLogPageOneTouchLbl().click();
		getNFKioAaddanEventLbl().click();
		LFSUtilsIOS.pause(3000);
		
		
		home.getNFKiosHomepageAddeventBtn().waitForPresent();
		home.getNFKiosHomepageAddeventBtn().click();
		//LFSUtilsIOS.waitforLoad();
		
		
		userSelectFromLogEventList("CARBS");
		int randomNumberCarb = ThreadLocalRandom.current().nextInt(1, 100);
		ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb);
		 NFKiosEventLogPageGlucoseAmountTxtList.get(1).sendKeys(randomNumberCarb + "");
		//addCarbAmount(randomNumberCarb + "");
		Reporter.logWithScreenShot("Carb window after entering value" + randomNumberCarb,
				MessageTypes.Pass);
		
		getNFKioAaddanEventLbl().click();
		LFSUtilsIOS.pause(3000);
		
		home.getNFKiosHomepageAddeventBtn().waitForPresent();
		home.getNFKiosHomepageAddeventBtn().click();
		LFSUtilsIOS.waitforLoad();
		
		userSelectFromLogEventList("ACTIVITY");
		int randomNumberActivity = ThreadLocalRandom.current().nextInt(10, 40);
		ConfigurationManager.getBundle().setProperty("classic.activity",
				randomNumberActivity);
		NFKiosEventLogPageGlucoseAmountTxtList.get(2).sendKeys(randomNumberActivity + "");
		//addActivityAmount(randomNumberActivity + "");
		Reporter.logWithScreenShot(
				"Activity window after adding value is " + randomNumberActivity,
				MessageTypes.Pass);
		
		getNFKioAaddanEventLbl().click();
		LFSUtilsIOS.pause(3000);
		home.getNFKiosHomepageAddeventBtn().waitForPresent();
		home.getNFKiosHomepageAddeventBtn().click();
		
		userSelectFromLogEventList("INSULIN");
		int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 40);
		ConfigurationManager.getBundle().setProperty("classic.insulin",
				randomNumberInsulin);
		NFKiosEventLogPageGlucoseAmountTxtList.get(3).sendKeys(randomNumberInsulin + "");
		//addActivityAmount(randomNumberActivity + "");
		Reporter.logWithScreenShot(
				"Insulin window after adding value is " + randomNumberInsulin,
				MessageTypes.Pass);

		getNFKiosEventLogPageSaveBtn().waitForPresent();
		getNFKiosEventLogPageSaveBtn().click();
		
		
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}
	
	public void editGlucoseAddCarbActivityInsulin() {
		
		getNFKiosEventbtn().waitForPresent();
		getNFKiosEventbtn().click();
		waitForPageToLoad();
		int randomNumberGlucose0;
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		for (int i = 0; i < getNFKiosEventLogPageGlucoseAmountTxtList().size(); i++) {
			
			if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")
					||pageProps.getString("language.name").equalsIgnoreCase("en-uk")
					||pageProps.getString("language.name").equalsIgnoreCase("en-ca")
					||pageProps.getString("language.name").equalsIgnoreCase("fr-ca")
					||pageProps.getString("language.name").equalsIgnoreCase("cz-cz")
					||pageProps.getString("language.name").equalsIgnoreCase("sl-sl")
					||pageProps.getString("language.name").equalsIgnoreCase("hr-hr")) {
				randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(8,30);
			}
			else {
				randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
			}
			String glucose1 = Integer.toString(randomNumberGlucose0);
			getNFKiosEventLogPageGlucoseAmountTxt().click();
			LFSUtilsIOS.pause(1000);
			getNFKiosEventLogPageGlucoseAmountTxt().clear();
			getNFKiosEventLogPageGlucoseAmountTxt().sendKeys(glucose1);
			Reporter.logWithScreenShot("Blood Glucose window after editing value" + glucose1, MessageTypes.Pass);
			break;
		}
		
	}
	
	
	
	public void verifyGlucoseCarbActivityInsulin() {
        LFSUtilsIOS.waitforLoad();
		getNFKiosEventbtn().waitForPresent();
		getNFKiosEventbtn().click();
		waitForPageToLoad();
		String randomNumberActivity = ConfigurationManager.getBundle()
				.getProperty("classic.activity").toString();
		
		String randomNumberCarb = ConfigurationManager.getBundle()
				.getProperty("classic.carb").toString();
		
//		String randomNumberBG = ConfigurationManager.getBundle()
//				.getProperty("classic.glucose").toString();
//		
		String randomNumberInsulin = ConfigurationManager.getBundle()
				.getProperty("classic.insulin").toString();
		String[] arrData = {randomNumberActivity,"activity",randomNumberCarb,"carb", randomNumberInsulin,"Insulin"};
		for(int i = 0; i< arrData.length; i++){
			for(int j = 0; j< getNFKiosEventLogPageGlucoseAmountTxtList().size();){

				if (getNFKiosEventLogPageGlucoseAmountTxtList().get(j)
						.getAttribute("value").equals(arrData[i])) {
					Reporter.logWithScreenShot(arrData[i] + arrData[i+1] +" Event is Present", MessageTypes.Pass);
					i=i+1;
				}	
				 j++;
			}	
		}}
	// Method to edit glucose carb and activity from logbook classic view
	// 
	public void editGlucoseCarbActivity() {
		int randomNumberGlucose0;
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		for (int i = 0; i < getNFKiosEventLogPageGlucoseAmountTxtList().size(); i++) {
			
			if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")
					||pageProps.getString("language.name").equalsIgnoreCase("en-uk")
					||pageProps.getString("language.name").equalsIgnoreCase("en-ca")
					||pageProps.getString("language.name").equalsIgnoreCase("fr-ca")
					||pageProps.getString("language.name").equalsIgnoreCase("cz-cz")
					||pageProps.getString("language.name").equalsIgnoreCase("sl-sl")
					||pageProps.getString("language.name").equalsIgnoreCase("hr-hr")) {
				randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(8,30);
			}
			else {
				randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
			}
			String glucose1 = Integer.toString(randomNumberGlucose0);
			getNFKiosEventLogPageGlucoseAmountTxt().click();
			LFSUtilsIOS.pause(1000);
			getNFKiosEventLogPageGlucoseAmountTxt().clear();
			getNFKiosEventLogPageGlucoseAmountTxt().sendKeys(glucose1);
			Reporter.logWithScreenShot("Blood Glucose window after editing value" + glucose1, MessageTypes.Pass);
			break;
		}
		getNFKiosEventLogPageCarbSpoonImg().waitForPresent();
		for (int i = 0; i < getNFKiosEventLogPageCarbAmountFieldTxtList().size(); i++) {
			getNFKiosEventLogPageOneTouchLbl().click();	
			getNFKiosEventLogPageCarbAmountFieldTxt();
			LFSUtilsIOS.pause(1000);
			getNFKiosEventLogPageCarbAmountFieldTxt().clear();
			int randomNumberCarb1 = ThreadLocalRandom.current().nextInt(101, 300);	
			String editCarb = Integer.toString(randomNumberCarb1);
			getNFKiosEventLogPageCarbAmountFieldTxt().sendKeys(editCarb);
			Reporter.logWithScreenShot(
						"Carb window after editing value" + randomNumberCarb1, 
						MessageTypes.Pass);
						break;
					}
		
		getNFKiosEventLogPageActivityHeartImg().waitForPresent();
		for (int i = 0; i < getNFKiosEventLogPageActivityAmountfieldTxtList()
				.size(); i++) {
			getNFKiosEventLogPageOneTouchLbl().click();	
			getNFKiosEventLogPageActivityAmountfieldTxt().clear();			
			int randomNumberActivity1 = ThreadLocalRandom.current().nextInt(300, 500);
			String editActivity = Integer.toString(randomNumberActivity1);
			getNFKiosEventLogPageActivityAmountfieldTxt().sendKeys(editActivity);
			Reporter.logWithScreenShot(
						"Activity window after editing value" + randomNumberActivity1,
						MessageTypes.Pass);
			break;
			
		}

		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	// Method to delete added item from classic view
	// 
	public void deleteGlucoseCarbActivity() {

		//Delete BG Event
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		getNFKiosEventLogPageGlucoseAmountTxt().click();
		getNFKiosEventLogPageEditEventDeleteBtn().click();
		if (getNFKiosEventLogPageOkBtn().isPresent())
			getNFKiosEventLogPageOkBtn().click();
		LFSUtilsIOS.pause(3000);
		Reporter.logWithScreenShot("After clicking Ok button", 
						MessageTypes.Pass);
		
		//Delete Carb Event

		getNFKiosEventLogPageCarbSpoonImg().waitForPresent();
		getNFKiosEventLogPageCarbSpoonImg().click();		
		LFSUtilsIOS.pause(3000);
		getNFKiosEventLogPageEditEventDeleteBtn().click();
		if (getNFKiosEventLogPageOkBtn().isPresent())
			getNFKiosEventLogPageOkBtn().click();
		Reporter.logWithScreenShot("After clicking Ok button", 
						MessageTypes.Pass);
				
		//Delete Activity Event	
		getNFKiosEventLogPageActivityAmountfieldTxt().click();
		LFSUtilsIOS.pause(3000);
		getNFKiosEventLogPageEditEventDeleteBtn().click();
		if (getNFKiosEventLogPageOkBtn().isPresent())
			getNFKiosEventLogPageOkBtn().click();
		Reporter.logWithScreenShot("After clicking Ok button", 
						MessageTypes.Pass);

	}

	// Method to click on Glucose event
	// 
	public void clickOnGlucoseEventClassicView() {

		String randomNumberGlucose = ConfigurationManager.getBundle()
				.getProperty("classic.glucose").toString();
		String currentMonth = LFSUtilsIOS.getCurrentMonth();
		String currentMonthNumeric =
				LFSUtilsIOS.monthIntValue(currentMonth.substring(0, 3));
		int date = Integer.parseInt(LFSUtilsIOS.getCurrentDate());

		String dateformat = currentMonthNumeric + "/" + date;
		QAFWebElement ele =
				getNFKiosEventLogPageClassicViewBGAddedBG(dateformat, randomNumberGlucose);
		ele.verifyPresent("added BG");
		ele.click();
	}

	// Method to add glucose and insulin
	// 
	public void addGlucoseAndInsulin() {
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver()
						.getUnderLayingDriver());
		TouchAction action = new TouchAction(appiumDriver);
		userSelectFromLogEventList("GLUCOSE");
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		//getNFKiosEventLogPageGlucoseDropImg().click();
		LFSUtilsIOS.pause(10000);
		int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
		String randomNumberGlucose = LFSUtilsIOS.mmolMGDL(randomNumberGlucose0);
		ConfigurationManager.getBundle().setProperty("classic.glucose",
				randomNumberGlucose);

		enterManualBGvalue(randomNumberGlucose + "");
		Reporter.logWithScreenShot(
				"Blood Glucose window after adding value" + randomNumberGlucose,
				MessageTypes.Pass);
		getNFKiosEventLogPageOneTouchLbl().click();
		LFSUtilsIOS.pause(3000);
		home.getNFKiosHomepageAddeventBtn().waitForPresent();
		LFSUtilsIOS.waitforLoad();
		userSelectFromLogEventList("INSULIN");
		getNFKiosEventLogPageInsulinMedicineImg().waitForPresent();
		getNFKiosEventLogPageInsulinMedicineImg().click();
		int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 200);
		ConfigurationManager.getBundle().setProperty("classic.insulin",
				randomNumberInsulin);
		addInsulinAmount(randomNumberInsulin + "");
		Reporter.logWithScreenShot(
				"Insulin window after adding value" + randomNumberInsulin,
				MessageTypes.Pass);

		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("The user has clicked on Save button", MessageTypes.Pass);
	}

	// Method to edit blood glucose and insulin details
	// 
	public void editGlucoseInsulin() {
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		for (int i = 0; i < getNFKiosEventLogPageGlucoseAmountTxtList().size(); i++) {
			int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(201, 300);
			String glucose1 = Integer.toString(randomNumberGlucose0);
			getNFKiosEventLogPageGlucoseAmountTxt().click();
			LFSUtilsIOS.pause(1000);
			getNFKiosEventLogPageGlucoseAmountTxt().clear();
			getNFKiosEventLogPageGlucoseAmountTxt().sendKeys(glucose1);	
			Reporter.logWithScreenShot(
					"Blood Glucose window after editing value" + glucose1,
					MessageTypes.Pass);
				break;


		}

		getNFKiosEventLogPageInsulinMedicineImg().waitForPresent();
		getNFKiosEventLogPageOneTouchLbl().click();	
		for (int i = 0; i < getNFKiosEventLogPageInsulinAmountfieldTxtList().size(); i++) {
			int randomNumberInsulin1 = ThreadLocalRandom.current().nextInt(21, 200);
			String editInsulin = Integer.toString(randomNumberInsulin1);
			getNFKiosEventLogPageInsulinAmountfieldTxt().clear();
			getNFKiosEventLogPageInsulinAmountfieldTxt().sendKeys(editInsulin);
			Reporter.logWithScreenShot(
					"Insulin window after editing value " + editInsulin,
					MessageTypes.Pass);
				break;

		}
		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	// method to delete glucose and insulin from classic view
	// 
	public void deleteGlucoseInsulin() {

		//Delete BG Event
				//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
				getNFKiosEventLogPageGlucoseAmountTxt().click();
				getNFKiosEventLogPageEditEventDeleteBtn().click();
				if (getNFKiosEventLogPageOkBtn().isPresent())
					getNFKiosEventLogPageOkBtn().click();
				LFSUtilsIOS.pause(3000);
				Reporter.logWithScreenShot("After clicking delete glucose", 
								MessageTypes.Pass);
		//Delete Insulin
				//getNFKiosEventLogPageInsulinMedicineImg().waitForPresent();
				getNFKiosEventLogPageInsulinAmountfieldTxt().click();
				getNFKiosEventLogPageEditEventDeleteBtn().click();
				if (getNFKiosEventLogPageOkBtn().isPresent())
					getNFKiosEventLogPageOkBtn().click();
				LFSUtilsIOS.pause(3000);
				Reporter.logWithScreenShot("After clicking delete Insulin", 
								MessageTypes.Pass);

	}

	// Method to verify 365 days on clasic view screen
	// 
	public void verify365DayClassicView() {
		String currentMonth = LFSUtilsIOS.getCurrentMonth().substring(0, 3);
		int currentMonthNumeric =
				Integer.parseInt(LFSUtilsIOS.monthIntValue(currentMonth));
		int date = Integer.parseInt(LFSUtilsIOS.getCurrentDate());
		String dateformat1 = currentMonthNumeric + "/" + (date - 1);

		int currentMonthNoDay = Integer.parseInt(
				LFSUtilsIOS.monthNoOFDay(currentMonth).replaceAll("[^0-9]", ""));
		int date2 = 0;
		int nextMonthNumeric = currentMonthNumeric + 1;

		String dateformat2 = "";
		if (date == currentMonthNoDay) {
			date2 = 1;
			dateformat2 = nextMonthNumeric + "/" + (date2);
		} else {
			date2 = date + 1;
			dateformat2 = currentMonthNumeric + "/" + (date2);
		}

		Point p = getNFKiosEventLogPageStaticText(dateformat1).getLocation();
		int count = 0;
		while (!getNFKiosEventLogPageStaticText(dateformat2).isPresent()) {
			LFSUtilsIOS.pause(1000);
			count++;
		}
		WebDriverTestCase.verifyTrue(
				getNFKiosEventLogPageStaticText(dateformat2).isPresent(),
				" Date 365 day before not present", "Date 365 day before present");
	}

	// Method to click on today from logbook week view
	// 
	public void clickOnTodayWeekView() {

		getNFKiosEventLogPageWeekViewboxBtn().waitForPresent();
		Point p1 = getNFKiosEventLogPageAddeventBtn().getLocation();
		Dimension d1 = getNFKiosEventLogPageAddeventBtn().getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver()
				.getUnderLayingDriver());
		TouchAction tch = new TouchAction(appiumDriver);
		tch.tap(p1.getX(), p1.getY() + (d1.getHeight() + 110)).perform();
		Reporter.logWithScreenShot("Today event Screen", MessageTypes.Pass);
	}

	// Method to edit added glucose
	// 
	// Edited By Sangram 09/05/2017

	public void addRandomGlucose() {
		userSelectFromLogEventList("GLUCOSE");
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		//getNFKiosEventLogPageGlucoseDropImg().click();
		int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
		String randomNumberGlucose = LFSUtilsIOS.mmolMGDL(randomNumberGlucose0);
		ConfigurationManager.getBundle().setProperty("classic.glucose",
				randomNumberGlucose);
		enterManualBGvalue(randomNumberGlucose + "");
		Reporter.logWithScreenShot(
				"Blood Glucose window after editing value" + randomNumberGlucose,
				MessageTypes.Pass);
		//getNFKiosEventLogPageGlucoseDropImg().click();
		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("The user has clicked on Save button", MessageTypes.Pass);

	}

	// Edit random glucose
	// 
	public void editRandomGlucose() {

		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		for (int i = 0; i < getNFKiosEventLogPageGlucoseAmountTxtList().size(); i++) {
			String randomNumberGlucose = ConfigurationManager.getBundle()
					.getProperty("classic.glucose").toString();
			if (getNFKiosEventLogPageGlucoseAmountTxtList().get(i).getAttribute("value")
					.equals(randomNumberGlucose)) {
				//getNFKiosEventLogPageGlucoseDropImgList().get(i).click();
				getNFKiosEventLogPageGlucoseAmountTxtList().get(i).click();
				getNFKiosEventLogPageGlucoseAmountTxt().clear();
				int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
				String randomNumberGlucose1 = LFSUtilsIOS.mmolMGDL(randomNumberGlucose0);
				getNFKiosEventLogPageGlucoseAmountTxt()
						.sendKeys(randomNumberGlucose1 + "");
				Reporter.logWithScreenShot(
						"Blood Glucose window after editing value" + randomNumberGlucose1,
						MessageTypes.Pass);
				//getNFKiosEventLogPageGlucoseAmountTxtList().get(i).click();
				ConfigurationManager.getBundle().setProperty("classic.glucose",
						randomNumberGlucose1);
				break;
			}

		}
		//getNFKiosEventLogPageSaveBtn().click();
		//Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	// Delete random glucose
	// 
	public void deleteRandomGlucose() {
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		for (int i = 0; i < getNFKiosEventLogPageGlucoseAmountTxtList().size(); i++) {
			String randomNumberGlucose = ConfigurationManager.getBundle()
					.getProperty("classic.glucose").toString();
			if (getNFKiosEventLogPageGlucoseAmountTxtList().get(i).getAttribute("value")
					.equals(randomNumberGlucose)) {
				getNFKiosEventLogPageGlucoseDropImgList().get(i).click();
				for (int j = 0; j < getNFKiosEventLogPageEditEventDeleteBtnList()
						.size(); j++) {
					if (LFSUtilsIOS.tryMethod(
							getNFKiosEventLogPageEditEventDeleteBtnList().get(j))) {
						getNFKiosEventLogPageEditEventDeleteBtnList().get(j).click();
						Reporter.logWithScreenShot("After clicking delete button",
								MessageTypes.Pass);
						if (getNFKiosEventLogPageOkBtn().isPresent())
							Reporter.logWithScreenShot("Delete confirm pop up",
									MessageTypes.Pass);
						getNFKiosEventLogPageOkBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;

			}
		}

	}

	// Method to click on week view button
	// 
	public void clickWeekViewBtn() {
		getNFKiosEventLogPageWeekBtn().waitForPresent();
		getNFKiosEventLogPageWeekBtn().click();
		Reporter.logWithScreenShot("Week view", MessageTypes.Pass);
	}

	// Method to add random carb
	// 
	public void addRandomCarb() {
		userSelectFromLogEventList("CARBS");
		getNFKiosEventLogPageCarbSpoonImg().waitForPresent();
		getNFKiosEventLogPageCarbSpoonImg().click();
		int randomNumberCarb = ThreadLocalRandom.current().nextInt(1, 100);
		ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb);
		addCarbAmount(randomNumberCarb + "");
		Reporter.logWithScreenShot("Carb window after entering value " + randomNumberCarb,
				MessageTypes.Pass);
		getNFKiosEventLogPageCarbSpoonImg().click();
		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("The user has clicked on Save button", MessageTypes.Pass);
	}

	// Method to add random carb
	// 
public void editRandomCarb() {
//		//getNFKiosEventLogPageCarbSpoonImg().waitForPresent();
		for (int i = 0; i < getNFKiosEventLogPageCarbAmountFieldTxtList().size(); i++) {
			String randomNumberCarb = ConfigurationManager.getBundle()
					.getProperty("classic.carb").toString();
			if (getNFKiosEventLogPageCarbAmountFieldTxtList().get(i).getAttribute("value")
					.equals(randomNumberCarb)) {
				getNFKiosEventLogPageCarbAmountFieldTxtList().get(i).click();
//				LFSUtilsIOS.clearTextField(
//						getNFKiosEventLogPageCarbAmountFieldTxtList().get(i));
				
				getNFKiosEventLogPageCarbAmountFieldTxt().clear();
				//getNFKiosEventLogPageActivityAmountfieldTxt().clear();
				
				int randomNumberCarb1 = ThreadLocalRandom.current().nextInt(1, 100);
				getNFKiosEventLogPageCarbAmountFieldTxt()
						.sendKeys(randomNumberCarb1 + "");
				Reporter.logWithScreenShot(
						"Carb window after editing value" + randomNumberCarb1,
						MessageTypes.Pass);
				//getNFKiosEventLogPageCarbSpoonImgList().get(i).click();
				ConfigurationManager.getBundle().setProperty("classic.carb",
						randomNumberCarb1);
				break;
			}
		}
//		getNFKiosEventLogPageCarbSpoonImg().click();
//		getNFKiosEventLogPageSaveBtn().click();
//		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	// Method to delete random carb
	// 
	public void deleteRandomCarb() {
		getNFKiosEventLogPageCarbSpoonImg().waitForPresent();
		for (int i = 0; i < getNFKiosEventLogPageCarbAmountFieldTxtList().size(); i++) {
			String randomNumberCarb = ConfigurationManager.getBundle()
					.getProperty("classic.carb").toString();
			if (getNFKiosEventLogPageCarbAmountFieldTxtList().get(i).getAttribute("value")
					.equals(randomNumberCarb)) {
				getNFKiosEventLogPageCarbSpoonImgList().get(i).click();
				for (int j = 0; j < getNFKiosEventLogPageEditEventDeleteBtnList()
						.size(); j++) {
					if (LFSUtilsIOS.tryMethod(
							getNFKiosEventLogPageEditEventDeleteBtnList().get(j))) {
						getNFKiosEventLogPageEditEventDeleteBtnList().get(j).click();
						Reporter.logWithScreenShot("After clicking delete carb",
								MessageTypes.Pass);
						if (getNFKiosEventLogPageOkBtn().isPresent())
							Reporter.logWithScreenShot("Delete confirm pop up",
									MessageTypes.Pass);
						getNFKiosEventLogPageOkBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}
	}

	// Method to add random insulin
	// 
	public void addRandomInsulin() {
		userSelectFromLogEventList("INSULIN");
		getNFKiosEventLogPageInsulinMedicineImg().waitForPresent();
		getNFKiosEventLogPageInsulinMedicineImg().click();
		int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 200);
		ConfigurationManager.getBundle().setProperty("classic.insulin",
				randomNumberInsulin);
		addInsulinAmount(randomNumberInsulin + "");
		Reporter.logWithScreenShot(
				"Insulin window after adding value is " + randomNumberInsulin,
				MessageTypes.Pass);
		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("The user has clicked on Save button", MessageTypes.Pass);
	}

	// Method to edit random insulin
	public void editRandomInsulin() {
		//getNFKiosEventLogPageInsulinMedicineImg().waitForPresent();
		
		for (int i = 0; i < getNFKiosEventLogPageInsulinAmountfieldTxtList().size(); i++) {
			String randomNumberInsulin = ConfigurationManager.getBundle()
					.getProperty("classic.insulin").toString();
			if (getNFKiosEventLogPageInsulinAmountfieldTxtList().get(i).getAttribute("value").equals(randomNumberInsulin)) {
				getNFKiosEventLogPageInsulinAmountfieldTxtList().get(i).click();			
//				LFSUtilsIOS.clearTextField(
//						getNFKiosEventLogPageInsulinAmountfieldTxtList().get(i));				
				getNFKiosEventLogPageInsulinAmountfieldTxt().clear();
				int randomNumberInsulin1 = ThreadLocalRandom.current().nextInt(10, 40);
				
				getNFKiosEventLogPageInsulinAmountfieldTxt()
						.sendKeys(randomNumberInsulin1 + "");
				
				Reporter.logWithScreenShot(
						"Insulin window after editing value" + randomNumberInsulin,
						MessageTypes.Pass);
								
				ConfigurationManager.getBundle().setProperty("classic.insulin",
						randomNumberInsulin1);
				break;
			}

		}

	}

	// Method to delete random insulin
	// 
	public void deleteRandomInsulin() {
		getNFKiosEventLogPageInsulinMedicineImg().waitForPresent();
		for (int i = 0; i < getNFKiosEventLogPageInsulinAmountfieldTxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle()
					.getProperty("classic.insulin").toString();
			if (getNFKiosEventLogPageInsulinAmountfieldTxtList().get(i)
					.getAttribute("value").equals(randomNumberActivity)) {
				getONFKiosEventLogPageInsulinMedicineImgList().get(i).click();
				for (int j = 0; j < getNFKiosEventLogPageEditEventDeleteBtnList()
						.size(); j++) {
					if (LFSUtilsIOS.tryMethod(
							getNFKiosEventLogPageEditEventDeleteBtnList().get(j))) {
						Reporter.logWithScreenShot("Before clicking delete button", MessageTypes.Pass);
						getNFKiosEventLogPageEditEventDeleteBtnList().get(j).click();
						Reporter.logWithScreenShot("After clicking delete button", MessageTypes.Pass);
						if (getNFKiosEventLogPageOkBtn().isPresent())
							Reporter.logWithScreenShot("Delete confirm pop up",
									MessageTypes.Pass);
						getNFKiosEventLogPageOkBtn().click();
						Reporter.logWithScreenShot("After clicking ok button",
								MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}
	}

	// Method to add random activity
	// 
	public void addRandomActivity() {
		userSelectFromLogEventList("ACTIVITY");
		getNFKiosEventLogPageActivityHeartImg().waitForPresent();
		getNFKiosEventLogPageActivityHeartImg().click();
		int randomNumberActivity = ThreadLocalRandom.current().nextInt(10, 1000);
		ConfigurationManager.getBundle().setProperty("classic.activity",
				randomNumberActivity);
		addActivityAmount(randomNumberActivity + "");
		getNFKiosEventLogPageActivityHeartImg().click();
		getNFKiosEventLogPageActivityIntensityBtn().waitForPresent();
		Reporter.logWithScreenShot(
				"Activity window after adding value is " + randomNumberActivity,
				MessageTypes.Pass);
		getNFKiosEventLogPageActivityIntensityBtn().click();
		Reporter.logWithScreenShot("Selected activity type is", MessageTypes.Pass);
		getNFKiosEventLogPageActivityHeartImg().click();

		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("The user has clicked on Save button", MessageTypes.Pass);
	}

	// Method to edit random activity
	// 
	public void editRandomActivity() {
		//getNFKiosEventLogPageActivityHeartImg().waitForPresent();

		for (int i = 0; i < getNFKiosEventLogPageActivityAmountfieldTxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle()
					.getProperty("classic.activity").toString();
			System.out.println(randomNumberActivity);
			
			if (getNFKiosEventLogPageActivityAmountfieldTxtList().get(i).getAttribute("value").equals(randomNumberActivity)) {
				getNFKiosEventLogPageActivityAmountfieldTxtList().get(i).click();
				
				
//				LFSUtilsIOS.clearTextField(
//						getNFKiosEventLogPageActivityAmountfieldTxtList().get(i));
				
				getNFKiosEventLogPageInsulinAmountfieldTxt().clear();
				
				int randomNumberActivity1 = ThreadLocalRandom.current().nextInt(10, 1000);
				
				getNFKiosEventLogPageInsulinAmountfieldTxt()
						.sendKeys(randomNumberActivity1 + "");
				
				Reporter.logWithScreenShot(
						"Insulin window after editing value" + randomNumberActivity,
						MessageTypes.Pass);
				//getONFKiosEventLogPageInsulinMedicineImgList().get(i).click();
				
				ConfigurationManager.getBundle().setProperty("classic.insulin",
						randomNumberActivity1);
				break;
			}

		}
//		getNFKiosEventLogPageSaveBtn().click();
//		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	// Method delete random activity
	// 
	public void deleteRandomActivity() {
		getNFKiosEventLogPageActivityHeartImg().waitForPresent();
		for (int i = 0; i < getNFKiosEventLogPageActivityAmountfieldTxtList()
				.size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle()
					.getProperty("classic.activity").toString();
			if (getNFKiosEventLogPageActivityAmountfieldTxtList().get(i)
					.getAttribute("value").equals(randomNumberActivity)) {
				getNFKiosEventLogPageActivityHeartImgList().get(i).click();
				for (int j = 0; j < getNFKiosEventLogPageEditEventDeleteBtnList()
						.size(); j++) {
					if (LFSUtilsIOS.tryMethod(
							getNFKiosEventLogPageEditEventDeleteBtnList().get(j))) {
						getNFKiosEventLogPageEditEventDeleteBtnList().get(j).click();
						if (getNFKiosEventLogPageOkBtn().isPresent())
							Reporter.logWithScreenShot("Delete confirm pop up",
									MessageTypes.Pass);
						getNFKiosEventLogPageOkBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button",
								MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}
	}

	// Method to click and verify info screen
	// 
	public void clickAndVerifyInfoScreenEventLog() {
		getNFKiosEventLogPageWeekInfoBtn().waitForPresent();
		getNFKiosEventLogPageWeekInfoBtn().click();
		Reporter.logWithScreenShot("Graph Legend screen", MessageTypes.Pass);
	}

	// Method to verify insulin field not displaying
	// 
	public void verifyNoInsulinSectionWeekView() {
		getNFKiosLogbookInsulinTitle().verifyNotVisible("Insulin Section");
	}

	// Method to add previous date for glucose
	// 
	public void addPreviousDateGlucose(Object eventDetail) {
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		//getNFKiosEventLogPageGlucoseDropImg().click();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Blood Glucose window before adding value",
				MessageTypes.Pass);
		enterManualBGvalue("200");
		Reporter.logWithScreenShot("Blood Glucose window after adding value",
				MessageTypes.Pass);

		getNFKiosEventLogPageglucoseTimingValuebBtn().click();
		getNFKiosEventLogPageglucoseTimingValuebBtn().click();
		selectEventTimingPicker(eventBean);

	}

	// Method to click on day view
	// 
	public void clickOnDayView() {
		getNFKiosEventLogPageDayBtn().waitForPresent();
		getNFKiosEventLogPageDayBtn().click();
	}

	// Method to select click on left picker
	// 
	public void clickArrow(String option) {
		option = option.toLowerCase();
		switch (option) {
			case "left" :

				getNFKiosEventLogPageLeftarrowBtn().click();
				Reporter.logWithScreenShot("After clicking left arrow",
						MessageTypes.Pass);
				break;
			case "right" :
				getNFKiosEventLogPageRightarrowBtn().click();
				Reporter.logWithScreenShot("After clicking right arrow",
						MessageTypes.Pass);
				break;
		}
	}

	// Method to take screen shot of last day
	// 
	public void lastDayScreen() {
		Reporter.logWithScreenShot("view screen", MessageTypes.Pass);
	}

	// Method to add multiple glucose for high low and inrange
	// 
	public void addMultipleGlucose() {
		userSelectFromLogEventList("GLUCOSE");
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		//getNFKiosEventLogPageGlucoseDropImg().click();
		String minGlucose = LFSUtilsIOS.mmolMGDL(69);
		enterManualBGvalue(minGlucose + "");
		Reporter.logWithScreenShot(
				"Blood Glucose window after editing value" + minGlucose,
				MessageTypes.Pass);
		//getNFKiosEventLogPageGlucoseDropImg().click();
		getNFKiosEventLogPageOneTouchLbl().click();

		userSelectFromLogEventList("GLUCOSE");
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		String inrangeGlucose = LFSUtilsIOS.mmolMGDL(110);
		getNFKiosEventLogPageGlucoseAmountTxtList().get(1).sendKeys("" + inrangeGlucose);
		Reporter.logWithScreenShot(
				"Blood Glucose window after editing value" + inrangeGlucose,
				MessageTypes.Pass);
		getNFKiosEventLogPageGlucoseDropImgList().get(1).click();
		getNFKiosEventLogPageOneTouchLbl().click();
		userSelectFromLogEventList("GLUCOSE");
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		String highGlucose = LFSUtilsIOS.mmolMGDL(181);
		getNFKiosEventLogPageGlucoseAmountTxtList().get(2).sendKeys("" + highGlucose);
		Reporter.logWithScreenShot(
				"Blood Glucose window after editing value" + highGlucose,
				MessageTypes.Pass);
		getNFKiosEventLogPageGlucoseDropImgList().get(2).click();
		getNFKiosEventLogPageOneTouchLbl().click();

		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("The user has clicked on Save button", MessageTypes.Pass);
	}

	// Method to set before and after meal
	// 
	//updatting
	public void setBGForBeforeAfterMeal() {
		userSelectFromLogEventList("GLUCOSE");
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		//getNFKiosEventLogPageGlucoseDropImg().click();
		String minGlucose = LFSUtilsIOS.mmolMGDL(70);
		enterManualBGvalue(minGlucose + "");
		getNFKiosEventLogPageOneTouchLbl().click();
		addGlucoseSelectBeforeAfter("before");
		Reporter.logWithScreenShot(
				"Blood Glucose window after editing value" + minGlucose,
				MessageTypes.Pass);
		//getNFKiosEventLogPageGlucoseDropImg().click();
		getNFKiosEventLogPageOneTouchLbl().click();

		userSelectFromLogEventList("GLUCOSE");
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		String inrangeGlucose = LFSUtilsIOS.mmolMGDL(110);
		getNFKiosEventLogPageGlucoseAmountTxtList().get(1).sendKeys("" + inrangeGlucose);
		getNFKiosEventLogPageOneTouchLbl().click();
		addGlucoseSelectBeforeAfter("after");
		Reporter.logWithScreenShot(
				"Blood Glucose window after editing value" + inrangeGlucose,
				MessageTypes.Pass);

		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	
	HomePageIOS home = new HomePageIOS();
	// Method to edit blood glucose for specific date
	// 
	public void setDateRandomBG(String range) {
		int dateRange = Integer.parseInt(range) + 2;
		int count = 0;
		EventLogPageIOS eventlogPage = new EventLogPageIOS();
		String getAmount = eventlogPage.getAddedAmount;
		for (int i = 0; i < home.getNFKiosHomepageLastreadingReadingsValueTxt()
				.size(); i++) {
			home.getNFKiosHomepageAddedEventDynamicLbl(getAmount).click();
				getNFKiosEventLogPageSaveBtn().waitForPresent();
				LFSUtilsIOS.clearTextField(getNFKiosEventLogPageGlucoseAmountTxt());
				int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
				String randomNumberGlucose1 = LFSUtilsIOS.mmolMGDL(randomNumberGlucose0);
				getNFKiosEventLogPageGlucoseAmountTxt()
						.sendKeys(randomNumberGlucose1 + "");
				Reporter.logWithScreenShot("Blood Glucose window after editing value " 
								+ randomNumberGlucose1, MessageTypes.Pass);
				getNFKiosEventLogPageOneTouchLbl().click();
				ConfigurationManager.getBundle().setProperty("classic.glucose",
						randomNumberGlucose1);

				getNFKiosEventLogPageglucoseTimingValuebBtn().click();
				Point p1 = getNFKiosEventLogPageTimingPickerDatePkr().getLocation();
				Dimension d1 = getNFKiosEventLogPageTimingPickerDatePkr().getSize();
				LFSUtilsIOS lfs = new LFSUtilsIOS();
				// selecting last day from date picker
				AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase()
						.getDriver().getUnderLayingDriver());
				TouchAction tch = new TouchAction(appiumDriver);
				while (count != dateRange) {
					tch.tap(p1.getX() + d1.getWidth() / 2,
							p1.getY() + ((d1.getHeight()) / 2) - 40).perform();
					LFSUtilsIOS.pause(2000);
					count++;
				}
				getNFKiosEventLogPageDoneBtnText().click();
				Reporter.logWithScreenShot("Selected day", MessageTypes.Pass);
				break;


		}
		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	// Method to add glucose for today and yesterday
	// 
	public void addTodayYesterDayEvent() {
		userSelectFromLogEventList("GLUCOSE");
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
		String randomNumberGlucose = LFSUtilsIOS.mmolMGDL(randomNumberGlucose0);
		ConfigurationManager.getBundle().setProperty("random.glucose1",
				randomNumberGlucose);

		enterManualBGvalue(randomNumberGlucose + "");
		Reporter.logWithScreenShot(
				"Blood Glucose window after editing value" + randomNumberGlucose,
				MessageTypes.Pass);
		
		getNFKiosEventLogPageOneTouchLbl().click();
		home.getNFKiosHomepageAddeventBtn().waitForPresent();
		userSelectFromLogEventList("GLUCOSE");
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		int randomNumberGlucose02 = ThreadLocalRandom.current().nextInt(21, 200);
		String randomNumberGlucose2 = LFSUtilsIOS.mmolMGDL(randomNumberGlucose02);
		ConfigurationManager.getBundle().setProperty("random.glucose2",
				randomNumberGlucose2);
		getNFKiosEventLogPageGlucoseAmountTxtList().get(1)
				.sendKeys("" + randomNumberGlucose2);
		getNFKiosEventLogPageglucoseTimingValuebBtnList().get(1).click();
		Reporter.logWithScreenShot("111111111", MessageTypes.Pass);

		if (!getNFKiosEventLogPageTimingPickerDatePkr().isPresent())
			getNFKiosEventLogPageglucoseTimingValuebBtnList().get(1).click();
		Reporter.logWithScreenShot("22222222", MessageTypes.Pass);

		Point p1 = getNFKiosEventLogPageTimingPickerDatePkr().getLocation();
		Dimension d1 = getNFKiosEventLogPageTimingPickerDatePkr().getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		// selecting last day from date picker
		TouchAction tch = new TouchAction(lfs.getDriver());
		tch.tap(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) - 58)
				.perform();
		Reporter.logWithScreenShot("Selected day", MessageTypes.Pass);
		getNFKiosEventLogPageDoneBtnText().click();
		Reporter.logWithScreenShot(
				"Blood Glucose window after editing value" + randomNumberGlucose2,
				MessageTypes.Pass);
		getNFKiosEventLogPageSaveBtn().click();
	}

	public void verifyDefaultInsulinType() {

		WebDriverTestCase.verifyTrue(
				getNFKiosEventLogPageInsulinTypeLbl().getAttribute("label")
						.contains(LFSUtilsIOS
								.getPropString("event.detail.insulinController.rapid")),
				"Default insulin type not present", "Default insulin type present");
		String insulinType = ConfigurationManager.getBundle()
				.getString("event.detail.insulinController.rapid");
		ConfigurationManager.getBundle().setProperty("last.added.insulin.type",
				insulinType);
	}

	public void verifyLastInsulinAsDefault() {
		
		String insulinType =
				ConfigurationManager.getBundle().getString("last.added.insulin.type");
		WebDriverTestCase.verifyTrue(
				getNFKiosEventLogPageInsulinTypeLbl().getAttribute("label")
						.contains(insulinType),
				"Last added insulin type not present", "Last added insulin type present");
	}

	// Method to check date on add event date label
	public void verifyDefaultDateForYesterday() {
		String date = getNFKiosEventLogPageglucoseTimingValuebBtn().getAttribute("value");
		WebDriverTestCase.verifyTrue(!date.contains("Today"), "Default date is Today",
				"Default date is correct" + date);
	}

	// Method to click on day view event field
	public void clickOnDayViewEvent() {
		Point p1 = getNFKiosEventLogPageAddeventBtn().getLocation();
		Dimension d1 = getNFKiosEventLogPageAddeventBtn().getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		TouchAction tch = new TouchAction(lfs.getDriver());
		tch.tap(p1.getX(), p1.getY() + (d1.getHeight() + 110)).perform();
	}

	// Method to verify right forward arrow should not display when in current
	// day
	public void verifyRightArrowInvisible() {
		getNFKiosEventLogPageRightarrowBtn()
				.verifyNotVisible("Forward arrow on Today view");
	}

	// Method to add yesterday carb details
	// 
	public void addCarbForYesterday(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		getNFKiosEventLogPageCarbSpoonImg().waitForPresent();
		Reporter.logWithScreenShot("Carb window before editing value", MessageTypes.Pass);
		addCarbAmount(eventBean.getAmount());
		Reporter.logWithScreenShot(
				"Carb window after editing value is " + eventBean.getAmount(),
				MessageTypes.Pass);
		getNFKiosEventLogPageOneTouchLbl().click();
		getNFKiosEventLogPageCarbTimingBtn().click();
		if (!getNFKiosEventLogPageTimingPickerDatePkr().isPresent())
			getNFKiosEventLogPageCarbTimingBtn().click();
		Point p1 = getNFKiosEventLogPageTimingPickerDatePkr().getLocation();
		Dimension d1 = getNFKiosEventLogPageTimingPickerDatePkr().getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		// selecting last day from date picker
		TouchAction tch = new TouchAction(lfs.getDriver());
		tch.tap(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) - 70)
				.perform();
		Reporter.logWithScreenShot("Set date and time", MessageTypes.Pass);
		getNFKiosEventLogPageDoneBtnText().click();

		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	// Method to verify add event title for when no event added
	public void verifyaAddEventTitle() {
		getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("log.add.event.title"))
				.verifyPresent("Add event title when no event present");

	}

	// Method to verify HI LO button on key board
	public void HILOBtnKeyBoard() {
		//getNFKiosEventLogPageGlucoseDropImg().waitForPresent();
		getNFKiosEventLogPageStaticText("HI").verifyPresent("Hi key on keyboard");
		getNFKiosEventLogPageStaticText("LO").verifyPresent("LO key on keyboard");
//		enterManualBGvalue("HI");
// WebDriverTestCase.verifyTrue(getNFKiosEventLogPageGlucoseAmountTxt().getAttribute("value").contains("HI"),
//						"HI is not entered", "HI is entered in text field");
		//getNFKiosEventLogPageGlucoseDropImg().click();
		//to click on text and hide keyboard
		LFSUtilsIOS.clickWithText("Add an Event");
		LFSUtilsIOS.hideKeyboard();
		Reporter.logWithScreenShot("Minimizing key board", MessageTypes.Pass);
		getNFKiosEventLogPageGlucoseAmountTxt().click();
//		getNFKiosEventLogPageStaticText("HI").verifyPresent("Hi key on keyboard");
//		getNFKiosEventLogPageStaticText("LO").verifyPresent("LO key on keyboard");
		

	}

	// Method to swipe on day and week view
	public void swipeHorizenDay() {

		Point p1 = getNFKiosEventLogPageWeekInfoBtn().getLocation();
		Point p2 = getNFKiosEventLogPageAddeventBtn().getLocation();
		LFSUtilsIOS.swipeWithCoordinates(p1.getX(), p1.getY() + 200, p2.getX(),
				p1.getY() + 200, 10);

		WebDriverTestCase.verifyTrue(
				getNFKiosEventLogPageDateRangeLbl().getAttribute("label")
						.contains(LFSUtilsIOS.getPropString("appCommon.yesterday")),
				"Yesterday not displaying after swipe",
				"Yesterday displaying after swipe");
	}

	public void swipeHorizenWeek() {

		Point p1 = getNFKiosEventLogPageWeekInfoBtn().getLocation();
		Point p2 = getNFKiosEventLogPageAddeventBtn().getLocation();
		String dateRange = getNFKiosEventLogPageDateRangeLbl().getAttribute("label");
		LFSUtilsIOS.swipeWithCoordinates(p1.getX(), p1.getY() + 200, p2.getX(),
				p1.getY() + 200, 10);

		WebDriverTestCase.verifyTrue(
				!getNFKiosEventLogPageDateRangeLbl().getAttribute("label")
						.contains(dateRange),
				"Swipe not working on weekview", "Able to swipe");
	}

	// method to click on classic view button on logbook
	public void clickOnClassicView() {

		getNFKiosEventLogPageClassicBtn().waitForPresent();
		getNFKiosEventLogPageClassicBtn().click();
	}

	// Method to add manual glucose
	// 
	public void addManualGlucoseEventDetailScreen(Object eventDetail) {
		getNFKiosEventLogPageGlucoseDropImg().waitForPresent();

		LFSUtilsIOS.pause(2000);
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Blood Glucose window before adding value",
				MessageTypes.Pass);
		getNFKiosEventLogPageGlucoseAmountTxtList().get(1).sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Blood Glucose window after adding value",
				MessageTypes.Pass);

		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("The user has clicked on Save button", MessageTypes.Pass);
	}

	public void selectLastElement() {
		getNFKiosEventLogPageBefore365BreakfastRecord().waitForPresent(10000);
		getNFKiosEventLogPageBefore365BreakfastRecord().click();
	}

	public void addBGValueLastRecord() {
		String val = "112";
		getNFKiosEventLogPageGlucoseBtn().waitForPresent();
		getNFKiosEventLogPageGlucoseBtn().click();
		getNFKiosEventLogPageGlucoseAmountTxt().waitForPresent();
		getNFKiosEventLogPageGlucoseAmountTxt().sendKeys(val);
		ConfigurationManager.getBundle().setProperty("last.record.value", val);
		getNFKiosEventLogPageSaveBtn().waitForPresent();
		getNFKiosEventLogPageSaveBtn().click();
	}

	public void verifylastRecordData() {
		String lastValue = "112";

		String bgVal = (String) ConfigurationManager.getBundle()
				.getProperty("last.record.value");
		Reporter.log("last value :" + lastValue);
		Reporter.log("BG Value :" + bgVal);
		if (bgVal.equalsIgnoreCase(lastValue)) {
			Reporter.logWithScreenShot("value is displayed for the last record");
		} else {
			Reporter.log("Value is not displayed");
		}
	}

	public void addFutureMinuteTime(String minuteTime) {

		Point p1 = getNFKiosEventLogPageTimingPickerDatePkr().getLocation();
		Dimension d1 = getNFKiosEventLogPageTimingPickerDatePkr().getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		// selecting last day from date picker
		TouchAction tch = new TouchAction(lfs.getDriver());
		tch.tap(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) - 70)
				.perform();
		String minuteValue = getNFKiosEventLogPageTimingPickerMinutePkr()
				.getAttribute("value").substring(0, 2);
		System.out.println("Minute value: " + minuteValue);

		int earlierMinuteValue = Integer.parseInt(minuteValue);

		Integer increaseMinuteValue = earlierMinuteValue + Integer.parseInt(minuteTime);
		System.out.println("Increased minute value: " + increaseMinuteValue);

		if (increaseMinuteValue > 59) {
			increaseMinuteValue = increaseMinuteValue - 60;
		}

		LFSUtilsIOS.selectTimePicker(getNFKiosEventLogPageTimingPickerMinutePkr(),
				increaseMinuteValue);

		Reporter.logWithScreenShot("Set date and time", MessageTypes.Pass);
		getNFKiosEventLogPageDoneBtnText().click();
		LFSUtilsIOS.waitforLoad();

		new MoremenuPageIOS().getNFKiosMoremenuPageReminderNameTxt("Save").click();
		LFSUtilsIOS.waitforLoad();

		Reporter.logWithScreenShot("Saved reminder", MessageTypes.Pass);

		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Method to verify available value in pattern explorer
	public void verifyPatterenDetailsExplorer() {
		for (int i = 0; i < getNFKiosEventLogPageGlucoseAmountTxtList().size(); i++) {
			WebDriverTestCase.verifyTrue(
					getNFKiosEventLogPageGlucoseAmountTxtList().get(i)
							.getAttribute("value")
							.contains(LFSUtilsIOS
									.getPropString("readingsHigh.bg" + (i + 1) + "")),
					"Incorrect value for " + (i + 1) + "bg value",
					"Correct value for " + (i + 1) + "bg value");
			WebDriverTestCase.verifyTrue(
					getNFKiosEventLogPageGlucoseUnitLblList().get(i).getAttribute("label")
							.contains(LFSUtilsIOS.getPropString("measureunit")),
					"Incorrect unit for " + (i + 1) + "bg value",
					"Correct unit for " + (i + 1) + "bg value");
		}
	}
	
	public void clickCrossIcon() {
		getNFKiosLogBookpageAddEventCrossIconImg().click();
	}
	
	public void clickSelectedEventDeleteButton() {
		try {
			getNFKiosEventLogPageDeleteBtn().waitForPresent();
			Reporter.logWithScreenShot("Deletion confirmation pop-up", MessageTypes.Pass);
			if(	getNFKiosEventLogPageDeleteBtn1().isPresent()) 
			{
				getNFKiosEventLogPageDeleteBtn1().assertPresent("Delete button");
				getNFKiosEventLogPageDeleteBtn1().isEnabled();
				getNFKiosEventLogPageDeleteBtn1().click();
			
			LFSUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot("After clicking Delete on delete confirm popup",
					MessageTypes.Pass);
			}
			else
			{
				Reporter.logWithScreenShot("Unable to Delete the Event",MessageTypes.Fail);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void verifyIcLinkOnEventScreen() {
		if (!(getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("insulinCalc.useInsulinCalc")).isPresent())) {
			Reporter.logWithScreenShot(
					"Insulin Calculator link is not displayed, kindly turn ON the toggle button to activate",
					MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot(
					"Insulin Calculator link is displayed, kindly turn OFF the toggle button to deactivate",
					MessageTypes.Pass);

	}

	public void editNotesDetails(Object eventDetail1) {
		EventDetailBeans eventBean1 = new EventDetailBeans();
		if (eventDetail1 instanceof String) {

			eventBean1.fillFromConfig((String) eventDetail1);
		} else {
			eventBean1.fillData(eventDetail1);
		}
		Reporter.logWithScreenShot("Note window before editing value", MessageTypes.Pass);
		addNoteText(eventBean1.getnote());
		Reporter.logWithScreenShot("Note window after editing value is " + eventBean1.getnote(),
				MessageTypes.Pass);
		//String text1=getNFKioseventlogPageenteredNotetxt().getText();
	    /*LFSUtilsIOS.clickWithText(text1);
	    getNFKioseventlogPageenteredNotetxt().clear();*/
		LFSUtilsIOS.hideKeyboard();
		/*getNFKioseventlogPageenteredNotetxt().sendKeys("Editing notes ");*/
		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("The user has clicked on Save button", MessageTypes.Pass);
	}
	
	//to verify Add and Event Screen.
	public void verifyAddedEvent(String option1)
	{
	
     switch (option1) {
		case "GLUCOSE" :
			
        getNFKiosEventLogPageGlucoseAmountTxt().verifyPresent("Glucose amount text field");
		getNFKiosEventLogPageglucoseTimingValuebBtn().verifyPresent("Glucose amount Date picker field");
		getNFKiosEventLogPageGlucoseBeforemealBtn().verifyPresent("Before meal button");
		getNFKiosEventLogPageGlucoseAftermealBtn().verifyPresent("After meal button");
		getNFKiosEventLogPageGlucoseAddnoteTxt().verifyPresent("Glucose Note text field");
		getNFKiosEventLogPageSaveBtn().waitForPresent(10000);
		 if (getNFKiosEventLogPageSaveBtn().isEnabled()) {
			Reporter.logWithScreenShot("Save button is Enabled",MessageTypes.Pass);
           } else  {
			Reporter.logWithScreenShot("Save button is Disabled", MessageTypes.Pass);		
	      }
		break;
		
		case "INSULIN" :
		getNFKiosEventLogPageInsulinAmountfieldTxt().verifyPresent("Insulin amount text field");
		getNFKiosEventLogPageActivityTimingBtn().verifyPresent("Insulin Date picker field");
		getNFKiosEventLogPageInsulinTypeBtn().verifyPresent("Insulin Type button");
		getNFKiosEventLogPageInsulinNotefieldTxt().verifyPresent("Insulin Note text field");
		if (getNFKiosEventLogPageSaveBtn().isEnabled()) {
			Reporter.logWithScreenShot("Save button is Enabled",MessageTypes.Pass);
       } else 
       {
			Reporter.logWithScreenShot("Save button is Disabled", MessageTypes.Pass);
		}
		
     break;
			
	 case "CARBS" :
		getNFKiosEventLogPageCarbAmountFieldTxt().verifyPresent("Carb amount text field");
		getNFKiosEventLogPageCarbTimingBtn().verifyPresent("Carb Date picker field");
		getNFKiosEventLogPageCarbNoteFieldTxt().verifyPresent("Carb Note text field");
		if (getNFKiosEventLogPageSaveBtn().isEnabled()) {
			Reporter.logWithScreenShot("Save button is Enabled",MessageTypes.Pass);
       } else 
       {
			Reporter.logWithScreenShot("Save button is Disabled", MessageTypes.Pass);
		}
		
	 break;
	 
	 case "ACTIVITY" :
		     getNFKiosEventLogPageActivityAmountfieldTxt().verifyPresent("Activity amount text field");
		    getNFKiosEventLogPageActivityTimingBtn().verifyPresent("Activity Date picker field");
			getNFKiosEventLogPageInsulinTypeBtn().verifyPresent("Activity Type button");
			getNFKiosEventLogPageInsulinNotefieldTxt().verifyPresent("Activity Note text field");
			if (getNFKiosEventLogPageSaveBtn().isEnabled()) {
				Reporter.logWithScreenShot("Save button is Enabled",MessageTypes.Pass);
	         } else 
	         {
				Reporter.logWithScreenShot("Save button is Disabled", MessageTypes.Pass);
			  }
	 break;
				
	 case "NOTE" :
		 getNFKiosEventlogPageNotenoteFieldtxt().verifyPresent("Note field time button");
		 getNFKiosEventlogPageNotenoteFieldtxt().verifyPresent("Note text field");
		   if (getNFKiosEventLogPageSaveBtn().isEnabled()) {
				Reporter.logWithScreenShot("Save button is Enabled",MessageTypes.Pass);
	        } else {
				Reporter.logWithScreenShot("Save button is Disabled", MessageTypes.Pass);
			}
	 break;
          
        }
        Reporter.logWithScreenShot("The Event is selected ", MessageTypes.Pass);
	}

	public void enterOnlyInsulinvalue(String eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Insulin window before adding value",
				MessageTypes.Pass);
		addInsulinAmount(eventBean.getAmount());
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot(
				"Insulin window after adding value" + eventBean.getAmount(),
				MessageTypes.Pass);
//		getNFKiosEventLogPageInsulinTypeBtn().click();
		/*String insulinType = ConfigurationManager.getBundle()
				.getString("event.detail.insulinController.long");
		ConfigurationManager.getBundle().setProperty("last.added.insulin.type",
				insulinType);*/
		getNFKiosEventLogPageInsulinNotefieldTxt().clear();
		getNFKiosEventLogPageInsulinNotefieldTxt().sendKeys("Adding insulin details");	
	}

	public void typeOfInsulinSelection(String insulin) {
		insulin = insulin.toUpperCase();
		getNFKiosEventLogPageInsulinTypeTitleBtn().isDisplayed();		
		String rapidtype= LFSUtilsIOS.getPropString("event.detail.insulinController.rapid");
		LFSUtilsIOS.clickWithText(rapidtype);
		String Mixtype=LFSUtilsIOS.getPropString("event.detail.insulinController.mix");
		LFSUtilsIOS.clickWithText(Mixtype);
		LFSUtilsIOS.pause(4000);
		LFSUtilsIOS.clickWithText(insulin);
		getNFKiosEventLogPageInsulinTypeDoneBtn().click();
		LFSUtilsIOS.pause(2000);
		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("The user has clicked on Save button", MessageTypes.Pass);	
	}

	public void verifytypeofInsulindefault(String typeinsulin) {
		getNFKiosEventLogPageInsulinTypeTitleBtn().isDisplayed();
		if(typeinsulin.equals(getNFKiosEventLogPageInsulinTypeBtn().getText()))
		{
			Reporter.logWithScreenShot("Selected insulin value is displayed ", MessageTypes.Pass);
		}
		else
		Reporter.logWithScreenShot("Default(Rapid) insulin is displayed ", MessageTypes.Fail);
	}

	public void editActivityDetail(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Activity window before editing value ", MessageTypes.Pass);
		addActivityAmount(eventBean.getAmount());
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("Activity window after editing value is " + eventBean.getAmount(),
				MessageTypes.Pass);
		String text=getNFKiosEventLogPageActivityNotefieldTxt().getText();
	    LFSUtilsIOS.clickWithText(text);
		getNFKiosEventLogPageActivityNotefieldTxt().clear();
		LFSUtilsIOS.hideKeyboard();
		getNFKiosEventLogPageActivityNotefieldTxt().sendKeys("Editing Activity ");
		getNFKiosEventLogPageSaveBtn().click();
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot("The user has clicked on Save button", MessageTypes.Pass);
		
	}

	public void enterOnlyActivityvalue(String details) {
		
		EventDetailBeans eventBean = new EventDetailBeans();
		if (details instanceof String) {

			eventBean.fillFromConfig((String) details);
		} else {
			eventBean.fillData(details);
		}
		Reporter.logWithScreenShot("Activity window before adding value ",
				MessageTypes.Pass);
		addActivityAmount(eventBean.getAmount());
		LFSUtilsIOS.waitforLoad();
		Reporter.logWithScreenShot(
				"Activity window after adding value " + eventBean.getAmount(),
				MessageTypes.Pass);
		getNFKiosEventLogPageActivityNotefieldTxt().clear();
		getNFKiosEventLogPageActivityNotefieldTxt().sendKeys("Adding Activity details");

	}

	public void typeOfActivitySelection(String activitytype) {
		activitytype = activitytype.toUpperCase();
		getNFKiosEventLogPageActivityTypeTitleBtn().isDisplayed();
		String none= LFSUtilsIOS.getPropString("activity.intensity.none");
		LFSUtilsIOS.clickWithText(none);
		String moderate=LFSUtilsIOS.getPropString("activity.intensity.moderate");
		LFSUtilsIOS.clickWithText(moderate);
		LFSUtilsIOS.pause(4000);
		LFSUtilsIOS.clickWithText(activitytype);
		getNFKiosEventLogPageInsulinTypeDoneBtn().click();
		LFSUtilsIOS.pause(2000);
		getNFKiosEventLogPageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);	
		
	}

	public void verifytypeofActivityefault(String activitytype) {
		getNFKiosEventLogPageActivityTypeTitleBtn().isDisplayed();
		if(activitytype.equals(getNFKiosEventLogPageActivityIntensityBtn().getText()))
		{
			Reporter.logWithScreenShot("Selected Activity  is displayed ", MessageTypes.Pass);
		}
		else
		Reporter.logWithScreenShot("Default(None) Activity is displayed ", MessageTypes.Fail);
		
	}

	public void verifyBGEventLogScreen(Object eventDetail) {
				//EventDetailBeans eventBean = new EventDetailBeans();
				/*if (eventDetail instanceof String) {

					eventBean.fillFromConfig((String) eventDetail);
				} else {
					eventBean.fillData(eventDetail);
				}*/
				String option= eventDetail.toString();
				
				switch(option) {
				
				case "addGlucose":
				String randomNumberBG = ConfigurationManager.getBundle()
						.getProperty("classic.glucose").toString();
				try {
				getNFKiosEventbtn().waitForPresent();	
				getNFKiosEventbtn().click();	
				WebDriverTestCase
				.verifyTrue(
						getNFKiosEventLogPageActivityAmountfieldTxt().getText().equals(randomNumberBG),
						" Incorrect value is displayed ", "Correct value is displayed, Entered value is " +randomNumberBG);
				}catch (Exception e) {
					Reporter.log("User was unable to find the element");
				}
				break;
				
				case "editGlucose":
					String randomNumberBGedit = ConfigurationManager.getBundle()
					.getProperty("editGlucose1.amount").toString();
			try {
			getNFKiosEventbtn().waitForPresent();	
			getNFKiosEventbtn().click();	
			WebDriverTestCase
			.verifyTrue(
					getNFKiosEventLogPageActivityAmountfieldTxt().getText().equals(randomNumberBGedit),
					" Incorrect value is displayed ", "Correct value is displayed, Entered value is " +randomNumberBGedit);
			}catch (Exception e) {
				Reporter.log("User was unable to find the element");
			}
					break;
				}
	}
	public void addMultiEvents(String option, int a) {
		HomePageIOS homePageIOS = new HomePageIOS();
		homePageIOS.getNFKiosHomepageAddEventBtn().waitForPresent();
		homePageIOS.getNFKiosHomepageAddEventBtn().click();	
		option = option.toUpperCase();
		switch (option) {
		
		case "GLUCOSE" :			
			waitForPageToLoad();
		 	getNFKiosHomepageBGBtn().waitForPresent();
			getNFKiosHomepageBGBtn().click();
			addBG(a);
			break;	
			
		case "CARBS" :
			waitForPageToLoad();
		 	getNFKiosHomepageCarbBtn().waitForPresent();
			getNFKiosHomepageCarbBtn().click();
			addCarb(a);
			break;	
				
		case "INSULIN" :		
			waitForPageToLoad();
		 	getNFKiosHomepageInsulinBtn().waitForPresent();
			getNFKiosHomepageInsulinBtn().click();
			addInsulin(a);
			break;
			
		case "ACTIVITY" :
			waitForPageToLoad();
		 	getNFKiosHomepageActivityBtn().waitForPresent();
			getNFKiosHomepageActivityBtn().click();
			addActivity(a);
			break;	
		}
		
        Reporter.logWithScreenShot("Added "+option+" Event",MessageTypes.Pass);
		
	}
	// Method to verify adding multiple event and verify on logbook
		public void addBG(int a) {
			int randomNumberGlucose0;
			if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")
					||pageProps.getString("language.name").equalsIgnoreCase("en-uk")
					||pageProps.getString("language.name").equalsIgnoreCase("en-ca")
					||pageProps.getString("language.name").equalsIgnoreCase("fr-ca")
					||pageProps.getString("language.name").equalsIgnoreCase("cz-cz")
					||pageProps.getString("language.name").equalsIgnoreCase("sl-sl")
					||pageProps.getString("language.name").equalsIgnoreCase("hr-hr")){
				randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(8,30);
			} else {
				randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
			}
			
			String randomNumberGlucose = LFSUtilsIOS.mmolMGDL(randomNumberGlucose0);
			ConfigurationManager.getBundle().setProperty("classic.glucose",
					randomNumberGlucose);
			 NFKiosEventLogPageGlucoseAmountTxtList.get(a).sendKeys(randomNumberGlucose + "");
			//enterManualBGvalue(randomNumberGlucose + "");
			 LFSUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot(
					"Blood Glucose window after editing value " + randomNumberGlucose,
					MessageTypes.Pass);
			//getNFKiosEventLogPageOneTouchLbl().click();
			getNFKioAaddanEventLbl().click();
			LFSUtilsIOS.pause(3000);
			
		}
		
		public void addCarb(int a)
		{
			int randomNumberCarb = ThreadLocalRandom.current().nextInt(1, 100);
			ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb);
			 NFKiosEventLogPageGlucoseAmountTxtList.get(a).sendKeys(randomNumberCarb + "");
			//addCarbAmount(randomNumberCarb + "");
			Reporter.logWithScreenShot("Carb window after entering value " + randomNumberCarb,
					MessageTypes.Pass);
			LFSUtilsIOS.waitforLoad();
			if(getNFKiosEventLogPageStaticText("Add an Event").isPresent())
				getNFKiosEventLogPageStaticText("Add an Event").click();
			else
				getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("log.edit.event.title")).click();
			LFSUtilsIOS.pause(3000);
		}
		
		
		public void addActivity(int a) {
			int randomNumberActivity = ThreadLocalRandom.current().nextInt(10, 40);
			ConfigurationManager.getBundle().setProperty("classic.activity",
					randomNumberActivity);
			NFKiosEventLogPageGlucoseAmountTxtList.get(a).sendKeys(randomNumberActivity + "");
			//addActivityAmount(randomNumberActivity + "");
			Reporter.logWithScreenShot(
					"Activity window after adding value is " + randomNumberActivity,
					MessageTypes.Pass);
			LFSUtilsIOS.waitforLoad();
			if(getNFKiosEventLogPageStaticText("Add an Event").isPresent())
				getNFKiosEventLogPageStaticText("Add an Event").click();
			else
				getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("log.edit.event.title")).click();
               	LFSUtilsIOS.pause(3000);
			
		}
		
		public void addInsulin(int a){
			int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 40);
			ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin);
			NFKiosEventLogPageGlucoseAmountTxtList.get(a).sendKeys(randomNumberInsulin + "");
			//addActivityAmount(randomNumberActivity + "");
			Reporter.logWithScreenShot(
					"Insulin window after adding value is " + randomNumberInsulin,
					MessageTypes.Pass);
			LFSUtilsIOS.waitforLoad();
			
			if(getNFKiosEventLogPageStaticText("Add an Event").isPresent())
				getNFKiosEventLogPageStaticText("Add an Event").click();
			else
				getNFKiosEventLogPageStaticText(LFSUtilsIOS.getPropString("log.edit.event.title")).click();

			
			LFSUtilsIOS.pause(3000);
		}
		public void saveMultiEvents() {
			getNFKiosEventLogPageSaveBtn().click();
			Reporter.logWithScreenShot("Clicked on Save Button ", MessageTypes.Pass);
			LFSUtilsIOS.waitforLoad();
		}
		public void editMultiEvent(String option) {
			HomePageIOS homePageIOS = new HomePageIOS();
			//homePageIOS.getNFKiosEventbtn().waitForPresent();
			//homePageIOS.getNFKiosEventbtn().click();	
			option = option.toUpperCase();
			switch (option) {
			
			case "GLUCOSE" :			
				waitForPageToLoad();
				editRandomGlucose();
				break;	
				
			case "CARBS" :
				waitForPageToLoad();
			 	editRandomCarb();
			 	getNFKiosEventLogPageStaticText("Edit an Event").click();
				
				break;	
					
			case "INSULIN" :		
				waitForPageToLoad();
				editRandomInsulin();
				getNFKiosEventLogPageStaticText("Edit an Event").click();
				break;
				
			case "ACTIVITY" :
				waitForPageToLoad();
				editRandomActivity();
				getNFKiosEventLogPageStaticText("Edit an Event").click();
				break;	
			}
				
			Reporter.logWithScreenShot("Events added ", MessageTypes.Pass);
			
			
		}

	public void verifyHILOvalue(String value)  {
		getNFKiosEventbtn().click();
		int eventssize=getNFKiosEventLogPageGlucoseAmountTxtList().size();
		for (int i = 0; i < eventssize ; i++) {
			for(int j=0;j< i;j++) {
			if(value.equalsIgnoreCase("LO")) {
			  WebDriverTestCase.verifyTrue(getNFKiosEventLogPageGlucoseAmountTxt().getAttribute("value")
							.contains("LO"),
							"LO value is not present on Event Log "," LO is present on  Event Log");
			 Reporter.logWithScreenShot("LO value is present on Event Log ", MessageTypes.Pass);
			  }
		 else if (value.equalsIgnoreCase("HI")) 
			{
		      WebDriverTestCase.verifyTrue(getNFKiosEventLogPageGlucoseAmountTxt().getAttribute("value")
						.contains("HI"),
				"HI value is not present on Event Log "," HI is present on Event Log");
		       Reporter.logWithScreenShot("HI value is present on Event Log ", MessageTypes.Pass);
		}
		else
			Reporter.logWithScreenShot("Entered value is not present on Event Log ", MessageTypes.Fail);
		}
	  }
	}

	public void verifyEventLog() {
		getNFKiosEventbtn().waitForPresent();
		getNFKiosEventbtn().click();
		getNFKiosEventLogpageEventTitle().assertPresent("Title of Event Log");
		getNFKiosEventLogpageEventCalendarLabel().assertPresent("label for date");
		getNFKiosEventLogpageEventTodayBtn().assertPresent("Today button");
		getNFKiosEventLogpageEventChartLabel().assertPresent("Chart on Event Log");
		Reporter.logWithScreenShot("User verified Event Log Screen ", MessageTypes.Pass);	
		
	}

	public void scrollChart() {
		 getNFKiosEventLogpageEventChartLabel().verifyPresent("Chart");
	    Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("MMMM yyyy"); 
        Date d=new DateTime(date).minusDays(90).toDate();
        String strDate = dateFormat.format(d);
        System.out.println("Chart scrolling...................**********");
        LFSUtilsIOS.waitforLoad();
//        getNFKiosEventLogPageCalendarScopeBtn().waitForPresent(10);
//        getNFKiosEventLogPageCalendarScopeBtn().assertPresent("Swipe chart.................");
       // getNFKiosEventLogPageCalendarScopeBtn().click();
        //driver.findElement(By.xpath("//*[@name='CalendarView.scopeChangeButton']")).click();
        TouchAction touch = new TouchAction(iosDriver);

        touch.press(getNFKiosEventLogpageEventCalendarLabel()).
        waitAction(Duration.ofMillis(2000)).moveTo(getNFKiosEventlogPageEventChartcellChartview()).release().perform();
     
       int c=1;   	       
       do {
        	      	LFSUtilsIOS.swipeWithScreenPercent(20, 40, 80, 40, 200);
        	LFSUtilsIOS.waitforLoad();
        	
        	c++; 
	    }while(c<=3);	       
		
		  String cdate= getNFKiosEventlogPageEventMonthLabel().getText();
		  try {
				  System.out.println("verifying date--- "+cdate+" Date format "+strDate);
				  if(cdate.equals(strDate))
					  Reporter.logWithScreenShot("User has scrolled upto 90 days upto date  "
					 +cdate+" ",MessageTypes.Pass); 
					 
			     else
				  Reporter.logWithScreenShot("date not matched",MessageTypes.Fail);
			  } catch (Exception e) {
			 e.printStackTrace();
		}
		  Reporter.logWithScreenShot("User has scrolled upto 90 days",MessageTypes.Pass);
	}

	public void clickEventLog() {
	HomePageIOS more= new HomePageIOS();
	more.clickOnMoreMenuIcon();
	       LFSUtilsIOS.waitforLoad();
			getNFKiosEventbtn().waitForPresent();
			getNFKiosEventbtn().click();
			waitForPageToLoad();
		Reporter.logWithScreenShot("Clicked on Event Log Button",MessageTypes.Pass);
	}

	public void verifyEditedAdded() {
		waitForPageToLoad();
		getNFKiosEventLogPageStaticText("OK").click();

		getNFKiosEventLogPageGlucoseAmountTxtList().get(0).getText();
		getNFKiosEventLogPageGlucoseAmountTxtList().get(1).getText();
		getNFKiosEventLogPageGlucoseAmountTxtList().get(2).getText();

		Reporter.logWithScreenShot("Added and Edited Values on Event Log",MessageTypes.Pass);
	
	}	 
	public void verifyActivityAllowedRangeandTime() {
		addActivityAmount("1441");
		getNFKiosEventLogPageActivityTimingBtn().click();
		if ( getNFKiosEventLogPageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent()) {
			Reporter.logWithScreenShot("OK pop up is present", MessageTypes.Pass);
			getNFKiosEventLogPageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
			getNFKiosEventLogPageSaveBtn().verifyDisabled("Save Event Button is disabled");
			Reporter.logWithScreenShot("Clicked on OK", MessageTypes.Pass);
		}
		 else {
			System.out.print("Save enabled");
			Reporter.logWithScreenShot("Save enabled but activity limit exceeded",
			MessageTypes.Fail);
		}
		addActivityAmount("1440");
		getNFKiosEventLogPageActivityTimingBtn().click();
		getNFKiosEventLogPageActivityTimingBtn().click();
		verifyTimePickerFutureNotAllowed();
		getNFKiosEventLogPageDoneBtnText().click();
		maxAllowedNoteFieldCharacter();
	}
}	
				
