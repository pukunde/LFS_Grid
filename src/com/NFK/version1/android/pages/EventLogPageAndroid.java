package com.NFK.version1.android.pages;

import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import com.NFK.support.ConsoleUtils;
import com.NFK.support.ConstantUtils;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.EventDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class EventLogPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	private AndroidDriver androidDriver = (AndroidDriver) driver.getUnderLayingDriver();
	@FindBy(locator = "NFK.eventlog.addevent.btn")
	private QAFWebElement NFKEventLogAddeventBtn;
	@FindBy(locator = "NFK.eventlog.addevent.lbl")
	private QAFWebElement NFKEventLogAddeventLbl;
	@FindBy(locator = "NFK.eventlog.addevent.addbgvalue.btn")
	private QAFWebElement NFKEventLogAddeventAddbgvalueBtn;
	@FindBy(locator = "NFK.eventlog.addevent.addcarbvalue.btn")
	private QAFWebElement NFKEventLogAddeventAddcarbvalueBtn;
	@FindBy(locator = "NFK.eventlog.addevent.addinsulinvalue.btn")
	private QAFWebElement NFKEventLogAddeventAddinsulinvalueBtn;
	@FindBy(locator = "NFK.eventlog.addevent.addactivityvalue.btn")
	private QAFWebElement NFKEventLogAddeventAddactivityvalueBtn;
	@FindBy(locator = "NFK.eventlog.addevent.save.btn")
	private QAFWebElement NFKEventLogAddeventSaveBtn;
	@FindBy(locator = "NFK.eventlog.addbg.addvalue.txt")
	private QAFWebElement NFKEventLogAddbgAddvalueTxt;
	@FindBy(locator = "NFK.eventlog.addbg.addvalue.txt")
	private List<QAFWebElement> NFKEventLogAddbgAddvalueTxtList;
	@FindBy(locator = "NFK.eventlog.addbg.beforemeal.tab")
	private QAFWebElement NFKEventLogAddbgBeforemealTab;
	@FindBy(locator = "NFK.eventlog.addbg.aftermeal.tab")
	private QAFWebElement NFKEventLogAddbgAftermealTab;
	@FindBy(locator = "NFK.eventlog.addbg.time.lbl")
	private QAFWebElement NFKEventLogAddbgTimeLbl;
	@FindBy(locator = "NFK.eventlog.addbg.time.btn")
	private QAFWebElement NFKEventLogAddbgTimeBtn;
	@FindBy(locator = "NFK.eventlog.addevent.timeselect.cancel.btn")
	private QAFWebElement NFKEventLogAddeventTimeselectCancelBtn;
	@FindBy(locator = "NFK.eventlog.addevent.timeselect.ok.btn")
	private QAFWebElement NFKEventLogAddeventTimeselectOkBtn;
	@FindBy(locator = "NFK.eventlog.addevent.timeselect.hour.txt")
	private QAFWebElement NFKEventLogAddeventTimeselectHourTxt;
	@FindBy(locator = "NFK.eventlog.addevent.timeselect.minute.txt")
	private QAFWebElement NFKEventLogAddeventTimeselectMinuteTxt;
	@FindBy(locator = "NFK.eventlog.addevent.timeselect.am.txt")
	private QAFWebElement NFKEventLogAddeventTimeselectAmTxt;
	@FindBy(locator = "NFK.eventlog.addevent.timeselect.pm.txt")
	private QAFWebElement NFKEventLogAddeventTimeselectPmTxt;
	@FindBy(locator = "NFK.eventlog.unitofmeasurement.lbl")
	private QAFWebElement NFKEventLogUnitofmeasurementLbl;
	@FindBy(locator = "NFK.eventlog.unitofmeasurement.lbl")
	private List<QAFWebElement> NFKEventLogUnitofmeasurementLblList;
	@FindBy(locator = "NFK.eventlog.addinsulin.typeselect.lbl")
	private QAFWebElement NFKEventLogAddinsulinTypeselectLbl;
	@FindBy(locator = "NFK.eventlog.addinsulin.selecttype.btn")
	private QAFWebElement NFKEventLogAddinsulinSelecttypeBtn;
	@FindBy(locator = "NFK.eventlog.addactivity.intensity.lbl")
	private QAFWebElement NFKEventLogAddactivityIntensityLbl;
	@FindBy(locator = "NFK.eventlog.addactivity.selectintensity.btn")
	private QAFWebElement NFKEventLogAddactivitySelectintensityBtn;
	@FindBy(locator = "NFK.eventlog.addevent.timeselect.clock.pkr")
	private QAFWebElement NFKEventLogAddEventTimeSelectClockPkr;
	@FindBy(locator = "NFK.eventlog.addevent.timeselect.clockmin.pkr")
	private QAFWebElement NFKEventLogAddeventTimeSelectClockMinPkr;
	@FindBy(locator = "NFK.eventlog.addinsulin.selecttype.long.btn")
	private QAFWebElement NFKEventLogAddInsulinSelectTypeLongBtn;
	@FindBy(locator = "NFK.eventlog.addactivity.selecttype.moderate.btn")
	private QAFWebElement NFKEventLogAddActivitySelectTypeModerateBtn;
	@FindBy(locator = "NFK.eventlog.editglucose.editeventtitle.txt")
	private QAFWebElement NFKEventLogEditglucoseEditeventtitleTxt;
	@FindBy(locator = "NFK.eventlog.editglucose.datepopup.date.txt")
	private QAFWebElement NFKEventLogEditglucoseDatepopupDateTxt;
	@FindBy(locator = "NFK.eventlog.editglucose.datepopup.datesvalue.txt")
	private List<QAFWebElement> NFKEventLogEditglucoseDatepopupDatesvalueTxt;
	@FindBy(locator = "NFK.eventlog.editglucose.notefield.txt")
	private QAFWebElement NFKEventLogEditglucoseNoteFieldTxt;
	@FindBy(locator = "NFK.eventlog.editglucose.delete.btn")
	private QAFWebElement NFKEventLogEditglucoseDeleteBtn;
	@FindBy(locator = "NFK.eventlog.editglucose.deleteconfirm.txt")
	private QAFWebElement NFKEventLogEditglucoseDeleteconfirmTxt;
	@FindBy(locator = "NFK.eventlog.editglucose.deletepopup.delete.btn")
	private QAFWebElement NFKEventLogEditglucoseDeletepopupDeleteBtn;
	@FindBy(locator = "NFK.eventlog.editglucose.appleicon.img")
	private QAFWebElement NFKEventLogEditglucoseAppleiconImg;
	@FindBy(locator = "NFK.eventlog.editglucose.back.btn")
	private QAFWebElement NFKEventLogEditglucoseBackBtn;
	@FindBy(locator = "NFK.eventlog.editglucose.timepopup.year.txt")
	private QAFWebElement NFKEventLogEditglucoseTimepopupYearTxt;
	@FindBy(locator = "NFK.eventlog.editglucose.lo.btn")
	private QAFWebElement NFKEventLogEditglucoseLoBtn;
	@FindBy(locator = "NFK.eventlog.editglucose.hi.btn")
	private QAFWebElement NFKEventLogEditglucoseHiBtn;
	@FindBy(locator = "NFK.eventlog.classsicview.btn")
	private QAFWebElement NFKEventLogClassicViewBtn;
	@FindBy(locator = "NFK.eventlog.weekview.btn")
	private QAFWebElement NFKEventLogWeekViewBtn;
	@FindBy(locator = "NFK.eventlog.dayview.btn")
	private QAFWebElement NFKEventLogDayViewBtn;
	@FindBy(locator = "NFK.eventlog.classicview.datetoright.btn")
	private QAFWebElement NFKEventLogClassicViewDateToRightBtn;
	@FindBy(locator = "NFK.eventlog.save.btn")
	private QAFWebElement NFKEventLogSaveBtn;
	@FindBy(locator = "NFK.eventlog.classicview.dateheader.lbl")
	private QAFWebElement NFKEventLogClassicViewDateHeaderLbl;
	@FindBy(locator = "NFK.eventlog.classview.datevalue.lbl")
	private List<QAFWebElement> NFKEventLogClassicViewDateValueLbl;
	@FindBy(locator = "NFK.eventlog.addevent.eventicon.img")
	private List<QAFWebElement> NFKEventLogAddeventEventiconImg;
	@FindBy(locator = "NFK.eventlog.editglucose.delete.btn")
	private List<QAFWebElement> NFKEventLogEditeventDeleteBtn;
	@FindBy(locator = "NFK.eventlog.eventview.leftarrow.btn")
	private QAFWebElement NFKEventLogClassicViewLeftArrowBtn;
	@FindBy(locator = "NFK.eventlog.eventview.rightarrow.btn")
	private QAFWebElement NFKEventLogClassicViewRightArrowBtn;
	@FindBy(locator = "NFK.eventlog.weekview.today.img")
	private QAFWebElement NFKEventLogWeekviewTodayboxImg;
	@FindBy(locator = "NFK.eventlog.celender.leftarrow.btn")
	private QAFWebElement NFKEventLogCelenderLeftarrowBtn;
	@FindBy(locator = "NFK.eventlog.celender.rightarrow.btn")
	private QAFWebElement NFKEventLogCelenderRightarrowBtn;
	@FindBy(locator = "NFK.eventlog.dayview.view.fld")
	private QAFWebElement NFKEventLogDayviewViewFld;
	@FindBy(locator = "NFK.eventlog.overnight.365last.element.value")
	private QAFWebElement NFKEventLogOvernight365LastElementValue;
	@FindBy(locator = "NFK.eventlog.overnight.365last.element")
	private QAFWebElement NFKEventLogOvernight365lastElement;
	@FindBy(locator = "NFK.eventlog.addevent.unit.lbl")
	private List<QAFWebElement> NFKEventLogAddeventUnitLblList;
	@FindBy(locator="NFK.eventlog.type.picker.txt")
	private QAFWebElement NFKEventLogTypePickerTxt;
    @FindBy(locator="NFK.eventlog.type.picker.done")
    private QAFWebElement NFKEventLogTypePickerDone;
	
	@FindBy(locator = "NFK.eventlog.addevent.timeselect.clockmin.pkr.btn")
	private QAFWebElement NFKEventLogAddEventTimeselectClockminPkrBtn;

	@FindBy(locator = "NFK.eventlog.addevent.timeinput.btn")
	private QAFWebElement NFKEventLogAddeventTimeinputBtn;

	@FindBy(locator = "NFK.eventlog.addevent.timeinput.min.btn")
	private QAFWebElement NFKEventLogAddeventTimeinputMinBtn;

	@FindBy(locator = "NFK.eventlog.addBg.Meal")
	private QAFWebElement NFKEventLogSelectMealOption;

	@FindBy(locator = "NFK.eventlog.Addevent.Cancel.btn")
	private QAFWebElement NFKEventLogAddeventCancelbtn;

	@FindBy(locator = "NFK.homepage.eventlog.tab")
	private QAFWebElement NFKhomepageEventLogtab;
	@FindBy(locator="NFK.eventlog.type.picker.btn")
	private QAFWebElement NFKEventLogTypePickerBtn;
	
	@FindBy(locator = "NFK.eventlog.addEvent.BackBtn")
	private QAFWebElement NFKEventLogAddEventBackBtn;
    @FindBy(locator="NFK.eventlog.type.txt")
    private QAFWebElement NFKEventLogTypeTxt;
    @FindBy(locator="NFK.eventlog.addevent.timing.Btn")
    private QAFWebElement NFKEventLogaddeventtimingBtn;
    @FindBy (locator="NFK.eventlog.addevent.noteField")
    private QAFWebElement NFKEventLogaddeventnoteField;
    @FindBy (locator="NFK.eventlog.addevent.save.Btn")
    private QAFWebElement NFKEventLogaddeventsaveBtn;
    @FindBy(locator="NFK.eventlog.added.note")
    private QAFWebElement NFKEventLogeventlogaddednote;
    
    @FindBy(locator="NFK.eventlog.event.title")
    private List<QAFWebElement> NFKEventLogpageeventTitle;
    @FindBy(locator="NFK.eventlog.event.chart")
    private QAFWebElement NFKEventLogpageeventChart;
    @FindBy(locator="NFK.eventlog.event.calendardate.txt")
    private QAFWebElement NFKEventLogpageeventCalendarDateTxt;
    @FindBy(locator="NFK.eventlog.event.today.btn")
    private QAFWebElement NFKEventLogpageeventTodayBtn;
    @FindBy (locator = "NFK.eventlog.event.toggle.calendar.btn")
    private QAFWebElement NFKEventlogEventToggleCalendarBtn;
    
	public static int firstCarb, secCarb;
	
	public QAFWebElement getNFKEventLogaddeventtimingBtn() {
		return NFKEventLogaddeventtimingBtn;
	}
	public QAFWebElement getNFKEventLogDynamicTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.eventlog.dynamic.txt", text);
	}
	
	public List<QAFWebElement> getNFKEventLogpageeventTitle() {
		return NFKEventLogpageeventTitle ;
	}
	public QAFWebElement getNFKEventlogpageeventChart() {
		return NFKEventLogpageeventChart;
	}
	public QAFWebElement getNFKEventlogpageeventCalendarDateTxt() {
		return NFKEventLogpageeventCalendarDateTxt;
	}
	public QAFWebElement getNFKEventlogpageeventTodayBtn() {
		return NFKEventLogpageeventTodayBtn;
	}
	
	public QAFWebElement getNFKEventLogaddeventnoteField() {
		return NFKEventLogaddeventnoteField;
	}
	
	public QAFWebElement getNFKEventLogaddeventsavebtn() {
		return NFKEventLogaddeventsaveBtn;
	}
	
	public QAFWebElement getNFKEventLogeventlogaddednote() {
		return NFKEventLogeventlogaddednote;
	}
	
	public QAFWebElement getNFKEventLogAddEventBackBtn() {
		return NFKEventLogAddEventBackBtn;
	}
	
	public QAFWebElement getNFKEventLogTypePickerDone() {
	  return NFKEventLogTypePickerDone;	
	}
	
	public QAFWebElement getNFKEventLogAddeventTimeinputBtn() {
		return NFKEventLogAddeventTimeinputBtn;
	}


	public QAFWebElement getNFKEventLogAddeventTimeinputMinBtn() {
		return NFKEventLogAddeventTimeinputMinBtn;
	}

	public QAFWebElement getNFKEventLogAddEventTimeselectClockminPkrBtn() {
		return NFKEventLogAddEventTimeselectClockminPkrBtn;
	}
	public QAFWebElement getNFKEventLogTypePickerBtn() {
		return NFKEventLogTypePickerBtn;
	}

	public void setNFKEventLogAddEventTimeselectClockminPkrBtn(
			QAFWebElement NFKEventLogAddEventTimeselectClockminPkrBtn) {
		this.NFKEventLogAddEventTimeselectClockminPkrBtn = NFKEventLogAddEventTimeselectClockminPkrBtn;
	}

	public QAFWebElement getNFKEventLogDayviewViewFld() {
		return NFKEventLogDayviewViewFld;
	}

	public QAFWebElement getNFKEventLogCelenderLeftarrowBtn() {
		return NFKEventLogCelenderLeftarrowBtn;
	}

	public QAFWebElement getNFKEventLogOvernight365lastElement() {
		return NFKEventLogOvernight365lastElement;
	}
	
	
	public QAFWebElement getNFKEventLogCelenderRightarrowBtn() {
		return NFKEventLogCelenderRightarrowBtn;
	}

	public QAFWebElement getNFKEventLogWeekviewTodayboxImg() {
		return NFKEventLogWeekviewTodayboxImg;
	}

	public QAFWebElement getNFKEventLogClassicViewRightArrowBtn() {
		return NFKEventLogClassicViewRightArrowBtn;
	}

	public QAFWebElement getNFKEventLogClassicViewLeftArrowBtn() {
		return NFKEventLogClassicViewLeftArrowBtn;
	}

	public List<QAFWebElement> getNFKEventLogEditeventDeleteBtn() {
		return NFKEventLogEditeventDeleteBtn;
	}
	
	public List<QAFWebElement> getNFKEventLogAddeventEventiconImg() {
		return NFKEventLogAddeventEventiconImg;
	}

	public List<QAFWebElement> getNFKEventLogClassicViewDateValueLbl() {
		return NFKEventLogClassicViewDateValueLbl;
	}

	public QAFWebElement getNFKEventLogClassicViewBtn() {
		return NFKEventLogClassicViewBtn;
	}

	public QAFWebElement getNFKEventLogClassicViewDateToRightBtn() {
		return NFKEventLogClassicViewDateToRightBtn;
	}

	public QAFWebElement getNFKEventLogWeekViewBtn() {
		return NFKEventLogWeekViewBtn;
	}

	public QAFWebElement getNFKEventLogClassicViewDateHeaderLbl() {
		return NFKEventLogClassicViewDateHeaderLbl;
	}

	public QAFWebElement getNFKEventLogDayViewBtn() {
		return NFKEventLogDayViewBtn;
	}

	public QAFWebElement getNFKEventLogEditglucoseHiBtn() {
		return NFKEventLogEditglucoseHiBtn;
	}

	public QAFWebElement getNFKEventLogEditglucoseLoBtn() {
		return NFKEventLogEditglucoseLoBtn;
	}

	public QAFWebElement getNFKEventLogEditglucoseTimepopupYearTxt() {
		return NFKEventLogEditglucoseTimepopupYearTxt;
	}

	public QAFWebElement getNFKEventLogEditglucoseBackBtn() {
		return NFKEventLogEditglucoseBackBtn;
	}

	public QAFWebElement getNFKEventLogEditglucoseAppleiconImg() {
		return NFKEventLogEditglucoseAppleiconImg;
	}

	public QAFWebElement getNFKEventLogEditglucoseDeletepopupDeleteBtn() {
		return NFKEventLogEditglucoseDeletepopupDeleteBtn;
	}
	public QAFWebElement getNFKEventLogTypeTxt()
	{
		return NFKEventLogTypeTxt;
	}

	public QAFWebElement getNFKEventLogEditglucoseDeleteconfirmTxt() {
		return NFKEventLogEditglucoseDeleteconfirmTxt;
	}

	public QAFWebElement getNFKEventLogEditglucoseDeleteBtn() {
		return NFKEventLogEditglucoseDeleteBtn;
	}

	public QAFWebElement getNFKEventLogEditglucoseNoteFieldTxt() {
		return NFKEventLogEditglucoseNoteFieldTxt;
	}

	public List<QAFWebElement> getNFKEventLogEditglucoseDatepopupDatesvalueTxt() {
		return NFKEventLogEditglucoseDatepopupDatesvalueTxt;
	}

	public QAFWebElement getNFKEventLogEditglucoseDatepopupDateTxt() {
		return NFKEventLogEditglucoseDatepopupDateTxt;
	}

	public QAFWebElement getNFKEventLogEditglucoseEditeventtitleTxt() {
		return NFKEventLogEditglucoseEditeventtitleTxt;
	}

	public QAFWebElement getNFKEventLogAddActivitySelectTypeModerateBtn() {
		return NFKEventLogAddActivitySelectTypeModerateBtn;
	}

	public QAFWebElement getNFKEventLogAddInsulinSelectTypeLongBtn() {
		return NFKEventLogAddInsulinSelectTypeLongBtn;
	}

	public QAFWebElement getNFKEventLogAddeventTimeSelectClockMinPkr() {
		return NFKEventLogAddeventTimeSelectClockMinPkr;
	}

	public QAFWebElement getNFKEventLogAddEventTimeSelectClockPkr() {
		return NFKEventLogAddEventTimeSelectClockPkr;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKEventLogaddeventbtn() {
		return NFKEventLogAddeventBtn;
	}

	public QAFWebElement getNFKEventLogaddeventlbl() {
		return NFKEventLogAddeventLbl;
	}

	public QAFWebElement getNFKEventLogaddeventaddbgvaluebtn() {
		return NFKEventLogAddeventAddbgvalueBtn;
	}

	public QAFWebElement getNFKEventLogaddeventaddcarbvaluebtn() {
		return NFKEventLogAddeventAddcarbvalueBtn;
	}

	public QAFWebElement getNFKEventLogaddeventaddinsulinvaluebtn() {
		return NFKEventLogAddeventAddinsulinvalueBtn;
	}

	public QAFWebElement getNFKEventLogaddeventaddactivityvaluebtn() {
		return NFKEventLogAddeventAddactivityvalueBtn;
	}
	
	public QAFWebElement getNFKEventLogTypePickerTxt() {
		return NFKEventLogTypePickerTxt;
	}

	public List<QAFWebElement> getNFKEventLogaddbgaddvaluetxtList() {
		return NFKEventLogAddbgAddvalueTxtList;
	}

	public QAFWebElement getNFKEventLogaddbgaddvaluetxt() {
		return NFKEventLogAddbgAddvalueTxt; 
	}

	public QAFWebElement getNFKEventLogaddbgbeforemealtab() {
		return NFKEventLogAddbgBeforemealTab;
	}

	public QAFWebElement getNFKEventLogaddbgaftermealtab() {
		return NFKEventLogAddbgAftermealTab;
	}

	public QAFWebElement getNFKEventLogaddbgtimelbl() {
		return NFKEventLogAddbgTimeLbl;
	}

	public QAFWebElement getNFKEventLogaddbgtimebtn() {
		return NFKEventLogAddbgTimeBtn;
	}

	public QAFWebElement getNFKEventLogaddeventtimeselectcancelbtn() {
		return NFKEventLogAddeventTimeselectCancelBtn;
	}

	public QAFWebElement getNFKEventLogaddeventtimeselectokbtn() {
		return NFKEventLogAddeventTimeselectOkBtn;
	}

	
	public QAFWebElement getNFKEventLogaddeventcancelbtn() {
		return NFKEventLogAddeventCancelbtn;
	}

	public QAFWebElement getNFKEventLogSaveBtn() {
		return NFKEventLogSaveBtn;
	}

	public QAFWebElement getNFKEventLogaddeventtimeselecthourtxt() {
		return NFKEventLogAddeventTimeselectHourTxt;
	}

	public QAFWebElement getNFKEventLogaddeventtimeselectminutetxt() {
		return NFKEventLogAddeventTimeselectMinuteTxt;
	}

	public QAFWebElement getNFKEventLogaddeventtimeselectamtxt() {
		return NFKEventLogAddeventTimeselectAmTxt;
	}

	public QAFWebElement getNFKEventLogaddeventtimeselectpmtxt() {
		return NFKEventLogAddeventTimeselectPmTxt;
	}

	public QAFWebElement getNFKEventLogunitofmeasurementlbl() {
		return NFKEventLogUnitofmeasurementLbl;
	}

	public List<QAFWebElement> getNFKEventLogunitofmeasurementlblList() {
		return NFKEventLogUnitofmeasurementLblList;
	}

	public QAFWebElement getNFKEventLogaddinsulintypeselectlbl() {
		return NFKEventLogAddinsulinTypeselectLbl;
	}

	public QAFWebElement getNFKEventLogaddinsulinselecttypebtn() {
		return NFKEventLogAddinsulinSelecttypeBtn;
	}

	public QAFWebElement getNFKEventLogaddactivityintensitylbl() {
		return NFKEventLogAddactivityIntensityLbl;
	}

	public QAFWebElement getNFKEventLogaddactivityselectintensitybtn() {
		return NFKEventLogAddactivitySelectintensityBtn;
	}

	public QAFWebElement getNFKEventLogAddeventDateSelecteddateLbl() {
		return NFKEventLogAddeventDateSelecteddateLbl;
	}

	public QAFWebElement getNFKEventLogAddeventAddfoodSearchbarTxt() {
		return NFKEventLogAddeventAddfoodSearchbarTxt;
	}

	public List<QAFWebElement> getNFKEventLogAddeventAddfoodSearchbarAddBtn() {
		return NFKEventLogAddeventAddfoodSearchbarAddBtn;
	}

	public QAFWebElement getNFKEventLogpageTimeStaticText(String text) {
		return LFSUtilsAndroid.getElement("NFK.eventlog.editglucose.datepopup.dynamic.txt", text);
	}

	public QAFWebElement getNFKEventLogpageStaticText(String text) {
		return LFSUtilsAndroid.getElement("NFK.eventlog.editglucose.dynamic.txt", text);
	}

	public QAFWebElement getNFKEventLogDayviewInfoBtn() {
		return NFKEventLogDayviewInfoBtn;
	}

	public QAFWebElement getNFKEventLogWeekviewInsulinTab() {
		return NFKEventLogWeekviewInsulinTab;
	}

	public QAFWebElement getNFKEventLogSelectMealOption(String text) {
		return LFSUtilsAndroid.getElement("NFK.eventlog.addBg.Meal", text);

	}

	public QAFWebElement getNFKhomepageEventLogtab() {
		return NFKhomepageEventLogtab;
	}
	public QAFWebElement getNFKEventlogEventToggleCalendarBtn() {
		return NFKEventlogEventToggleCalendarBtn;
	}
	
	// Public string values
	String getDate;
	@FindBy(locator = "NFK.eventlog.editglucose.datepopup.dynamic.txt")
	private QAFWebElement NFKEventLogEditglucoseDatepopupDynamicTxt;
	@FindBy(locator = "NFK.eventlog.editglucose.dynamic.txt")
	private QAFWebElement NFKEventLogEditglucoseDynamicTxt;
	@FindBy(locator = "NFK.eventlog.classicview.recentaddedBGvalue.btn")
	private QAFWebElement NFKEventLogClassicviewRecentaddedbgvalueBtn;
	@FindBy(locator = "NFK.eventlog.dayview.info.btn")
	private QAFWebElement NFKEventLogDayviewInfoBtn;
	@FindBy(locator = "NFK.eventlog.weekview.insulin.tab")
	private QAFWebElement NFKEventLogWeekviewInsulinTab;
	@FindBy(locator = "NFK.eventlog.addevent.add.btn")
	private QAFWebElement NFKEventLogAddeventAddBtn;
	@FindBy(locator = "NFK.eventlog.addevent.unit.lbl")
	private QAFWebElement NFKEventLogAddeventUnitLbl;


	public QAFWebElement getNFKEventLogAddeventAddBtn() {
		return NFKEventLogAddeventAddBtn;
	}

	public QAFWebElement getNFKEventLogAddeventUnitLbl() {
		return NFKEventLogAddeventUnitLbl;
	}

	public List<QAFWebElement> getNFKEventLogAddeventUnitLblList() {
		return NFKEventLogAddeventUnitLblList;
	}




	// Method to click on add event button
	public void clickOnAddEventButton() {
		getNFKEventLogaddeventbtn().verifyPresent("Add Event button is present");
		getNFKEventLogaddeventbtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Add event page is displayed", MessageTypes.Pass);
	}

	// Method to select blood glucose event
	public void selectBloodGlucose() {
		if (LFSUtilsAndroid.tryDisplayMethod(getNFKEventLogaddeventaddbgvaluebtn())) {
			getNFKEventLogaddeventaddbgvaluebtn().waitForPresent();
			getNFKEventLogaddeventaddbgvaluebtn().click();
			Reporter.logWithScreenShot("Add Blood Glucose page is displayed", MessageTypes.Pass);

		} else if (!LFSUtilsAndroid.tryDisplayMethod(getNFKEventLogaddeventaddbgvaluebtn())) {
			LFSUtilsAndroid.hideKeyboard();
			getNFKEventLogaddeventaddbgvaluebtn().waitForPresent();
			getNFKEventLogaddeventaddbgvaluebtn().click();
			Reporter.logWithScreenShot("Add Blood Glucose page is displayed", MessageTypes.Pass);
		}
	}

	// Method to select carbs event
	public void selectCarbEvent() {
		getNFKEventLogaddeventaddcarbvaluebtn().waitForPresent();
		getNFKEventLogaddeventaddcarbvaluebtn().click();
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		Reporter.logWithScreenShot("Add Carbs page is displayed", MessageTypes.Pass);
	}

	// Method to select Insulin event
	public void selectInsulinEvent() {
		getNFKEventLogaddeventaddinsulinvaluebtn().waitForPresent();
		getNFKEventLogaddeventaddinsulinvaluebtn().click();
		Reporter.logWithScreenShot("Add Insulin page is displayed", MessageTypes.Pass);
	}

	// Method to select activity event
	public void selectActivityEvent() {
		getNFKEventLogaddeventaddactivityvaluebtn().waitForPresent();
		getNFKEventLogaddeventaddactivityvaluebtn().click();
		Reporter.logWithScreenShot("Add Activity page is displayed", MessageTypes.Pass);
	}

	// Method to select an event for adding event
	public void userSelectFromLogEventList(String option) {

		option = option.toUpperCase();
		switch (option) {
		case "GLUCOSE":
			selectBloodGlucose();
			break;
		case "CARBS":
			selectCarbEvent();
			break;
		case "INSULIN":
			selectInsulinEvent();
			break;
		case "ACTIVITY":
			selectActivityEvent();
			break;
		}
		Reporter.logWithScreenShot("After selecting event", MessageTypes.Pass);
	}

	// Click on save button add event screen
	public void clickOnSaveBtnAddEventScreen() {
		getNFKEventLogaddeventsavebtn().waitForPresent();
		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("Clicked on save button event screen", MessageTypes.Pass);
	}

	// method to edit glucose details
	public void editGlucoseDetail(Object eventDetail) {
		if (getNFKEventLogunitofmeasurementlbl().getText().equalsIgnoreCase("mmol/l")) {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();

			EventDetailBeans eventBean = new EventDetailBeans();
			if (eventDetail instanceof String) {
				eventBean.fillFromConfig((String) eventDetail);
			} else {
				eventBean.fillData(eventDetail);
			}
			getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(1, 33));
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().clear();
			getNFKEventLogaddbgaddvaluetxt().clear();
			getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
			Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
			getNFKEventLogaddbgtimebtn().click();
			getNFKEventLogaddeventtimeselectokbtn().click();
			getNFKEventLogaddeventtimeselectokbtn().click();
			getNFKEventLogaddeventsavebtn().click();
			LFSUtilsAndroid.waitforLoad();
			if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent()) {
				getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
				LFSUtilsAndroid.waitforLoad();
			}
			Reporter.logWithScreenShot("After saving edited details", MessageTypes.Pass);
		} else {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();

			EventDetailBeans eventBean = new EventDetailBeans();
			if (eventDetail instanceof String) {

				eventBean.fillFromConfig((String) eventDetail);
			} else {
				eventBean.fillData(eventDetail);
			}
			getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(20, 600));
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().clear();
			getNFKEventLogaddbgaddvaluetxt().clear();
			getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
			Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
			getNFKEventLogaddbgtimebtn().click();

			getNFKEventLogaddeventtimeselectokbtn().click();
			getNFKEventLogaddeventtimeselectokbtn().click();
			getNFKEventLogaddeventsavebtn().click();
			LFSUtilsAndroid.waitforLoad();
			if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent()) {
				getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
				LFSUtilsAndroid.waitforLoad();
			}
			Reporter.logWithScreenShot("After saving edited details", MessageTypes.Pass);
		}
	}

	// method to select previous day date
	public void selectDate() {
		getNFKEventLogaddeventtimeselectokbtn().waitForPresent();
		int date = (Integer.parseInt(LFSUtilsAndroid.getCurrentDate())) - 1;
		ConfigurationManager.getBundle().setProperty("selected.date", date);

		for (QAFWebElement ele : getNFKEventLogEditglucoseDatepopupDatesvalueTxt()) {
			if (LFSUtilsAndroid.tryDisplayMethod(ele) && ele.getText().contains(date + "")) {
				ele.click();
				break;
			}
		}
		Reporter.logWithScreenShot("Selected date", MessageTypes.Pass);
	}

	public void selectFutureDate() {
		getNFKEventLogEditglucoseDatepopupDateTxt().waitForPresent();
		int date = Integer.parseInt(LFSUtilsAndroid.getCurrentDate()) + 1;
		if (LFSUtilsAndroid.getCurrentDate().equalsIgnoreCase("30")
				|| LFSUtilsAndroid.getCurrentDate().equalsIgnoreCase("31")) {
			getNFKEventLogClassicViewDateToRightBtn().click();
			date = 1;
		}
		ConfigurationManager.getBundle().setProperty("selected.date", date);

		for (QAFWebElement ele : getNFKEventLogEditglucoseDatepopupDatesvalueTxt()) {
			if (LFSUtilsAndroid.tryDisplayMethod(ele) && ele.getText().contains(date + "")) {
				ele.click();
				break;
			}
		}
		Reporter.logWithScreenShot("User has selected date", MessageTypes.Pass);
	}

	// Method to select today's date
	public void selectTodaysDate() {
		//getNFKEventLogaddeventtimeselectokbtn().waitForPresent();
		int date = (Integer.parseInt(LFSUtilsAndroid.getCurrentDate()));
		ConfigurationManager.getBundle().setProperty("selected.date", date);

		for (QAFWebElement ele : getNFKEventLogEditglucoseDatepopupDatesvalueTxt()) {
			if (LFSUtilsAndroid.tryDisplayMethod(ele) && ele.getText().contains(date + "")) {
				ele.click();
				break;
			}
		}
		Reporter.logWithScreenShot("User selected date", MessageTypes.Pass);
	}

	// selecting meal tag
	public void addGlucoseSelectBeforeAfter(String data) {

		data = data.toLowerCase();
		switch (data) {
		case "before":
			getNFKEventLogaddbgbeforemealtab().click();
			WebDriverTestCase.verifyTrue(getNFKEventLogaddbgbeforemealtab().isSelected(),
					"Before button is not selected", "Before button is selected");

			break;
		case "after":
			getNFKEventLogaddbgaftermealtab().click();
			WebDriverTestCase.verifyTrue(getNFKEventLogaddbgaftermealtab().isSelected(), "After button is not selected",
					"After button is selected");
			break;
		}

	}

	// method to select time
	public void selectTime(String hour, String miunte, String meredian) {
		getNFKEventLogpageTimeStaticText(hour).click();
		getNFKEventLogpageTimeStaticText(miunte).click();
		meredian = meredian.toUpperCase();
		getNFKEventLogpageStaticText(meredian).click();
		Reporter.logWithScreenShot("Selected time", MessageTypes.Pass);
	}

	static String getAMount, editAmount;

	// method to add glucose
	public void addBGDetail(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		if (getNFKEventLogunitofmeasurementlbl().getText().equalsIgnoreCase("mmol/l")) {


			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().click();

			getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(1, 33));

			getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
			ConfigurationManager.getBundle().setProperty("classic.glucose", getAMount);
			getBGValue = eventBean.getAmount().toString();
			Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);

			getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering BG with MMOL value");
			// SG Commenting out to debug
			getNFKEventLogaddbgtimebtn().click();

			getNFKEventLogaddeventtimeselectokbtn().click();
			getNFKEventLogaddeventtimeselectokbtn().click();

			getNFKEventLogaddeventsavebtn().waitForPresent();
			Reporter.logWithScreenShot("BG Form before clicking save", MessageTypes.Pass);
			getNFKEventLogaddeventsavebtn().click();
		}

		else {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().click();

			getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(20, 600));

			getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
			ConfigurationManager.getBundle().setProperty("classic.glucose", getAMount);
			getBGValue = eventBean.getAmount().toString();
			Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);

			getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering BG with MG/DL value");
			getNFKEventLogaddbgtimebtn().click();

			getNFKEventLogaddeventtimeselectokbtn().click();
			getNFKEventLogaddeventtimeselectokbtn().click();

			getNFKEventLogaddeventsavebtn().waitForPresent();
			Reporter.logWithScreenShot("BG Form before clicking save", MessageTypes.Pass);
			getNFKEventLogaddeventsavebtn().click();
		}
	}

	public void addBGDetailToVerify(Object eventDetail) {
		if (getNFKEventLogunitofmeasurementlbl().getText().equalsIgnoreCase("mmol/l")) {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();

			EventDetailBeans eventBean = new EventDetailBeans();
			if (eventDetail instanceof String) {

				eventBean.fillFromConfig((String) eventDetail);
			} else {
				eventBean.fillData(eventDetail);
			}
			Reporter.logWithScreenShot("Blood Glucose window before entering value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().click();
			getNFKEventLogaddbgaddvaluetxt().clear();
			int bgValue = ThreadLocalRandom.current().nextInt(1, 33);
			getNFKEventLogaddbgaddvaluetxt().sendKeys(Integer.toString(bgValue));
			getBGValue = Integer.toString(bgValue);
			Reporter.logWithScreenShot("Blood Glucose window after entering value", MessageTypes.Pass);
			getNFKEventLogSaveBtn().click();
			LFSUtilsAndroid.waitforLoad();
		} else {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();

			EventDetailBeans eventBean = new EventDetailBeans();
			if (eventDetail instanceof String) {

				eventBean.fillFromConfig((String) eventDetail);
			} else {
				eventBean.fillData(eventDetail);
			}
			Reporter.logWithScreenShot("Blood Glucose window before entering value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().click();
			getNFKEventLogaddbgaddvaluetxt().clear();
			getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
			getBGValue = eventBean.getAmount().toString();
			Reporter.logWithScreenShot("Blood Glucose window after entering value", MessageTypes.Pass);
			getNFKEventLogSaveBtn().click();
			LFSUtilsAndroid.waitforLoad();
		}
	}

	public void addMultipleDetailOnEvent(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Blood Glucose window before entering value", MessageTypes.Pass);
		getNFKEventLogaddbgaddvaluetxt().click();
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getBgAmount());
		LFSUtilsAndroid.hideKeyboard();
		getBGValue = eventBean.getBgAmount();
		Reporter.logWithScreenShot("Blood Glucose window after entering value", MessageTypes.Pass);
		getNFKEventLogAddeventAddBtn().click();
		getNFKEventLogaddeventaddcarbvaluebtn().click();
		Reporter.logWithScreenShot("Carbs window before entering value", MessageTypes.Pass);
		getNFKEventLogAddbgAddcarbvalueTxt().sendKeys(eventBean.getCarbAmount());
		LFSUtilsAndroid.hideKeyboard();
		getCarbValue = eventBean.getCarbAmount();
		Reporter.logWithScreenShot("Carbs window after entering value", MessageTypes.Pass);
		getNFKEventLogAddeventAddBtn().click();
		getNFKEventLogaddeventaddinsulinvaluebtn().click();
		Reporter.logWithScreenShot("Insulin window before adding value", MessageTypes.Pass);
		getNFKEventLogAddbgAddinsulinvalueTxt().sendKeys(eventBean.getInsulinAmount());
		LFSUtilsAndroid.hideKeyboard();
		insulinValue = eventBean.getInsulinAmount();
		Reporter.logWithScreenShot("Insulin window after adding value", MessageTypes.Pass);
		getNFKEventLogAddeventAddBtn().click();
		getNFKEventLogaddeventaddactivityvaluebtn().click();
		Reporter.logWithScreenShot("Activity window before entering value", MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 50);
		LFSUtilsAndroid.hideKeyboard();
		getNFKEventLogAddbgAddactivityvalueTxt().sendKeys(eventBean.getActivityAmount());
		getActivityValue = eventBean.getActivityAmount();
		Reporter.logWithScreenShot("Activity window after entering value", MessageTypes.Pass);
	}

	public static String getCarbValue, getBGValue, getActivityValue;

	public void addcarbsDetailOnEvent(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Carbs window after entering value", MessageTypes.Pass);
		getCarbValue = eventBean.getAmount();

		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Adding carb details");
		LFSUtilsAndroid.hideKeyboard();
		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
	}

	// method to add manual carb details
	public void addCarbManualDetail(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Carbs window after entering value", MessageTypes.Pass);

		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Adding carb details");

		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventsavebtn().click();
	}

	// method to edit carb details
	public void editCarbsDetail(Object eventDetail) {
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Carbs window before editing value", MessageTypes.Pass);
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Carbs window after editing value", MessageTypes.Pass);
		getNFKEventLogEditglucoseNoteFieldTxt().clear();
		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Editing carb details");

		getNFKEventLogaddbgtimebtn().click();

		getNFKEventLogaddeventtimeselectokbtn().click();

		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventsavebtn().click();
	}

	public static String insulinValue;

	// method to add insulin details
	public void addInsulinDetail(Object eventDetail) {
		InsulinCalculatorPageAndroid insulinCal = new InsulinCalculatorPageAndroid();
		//getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		
		
		Reporter.logWithScreenShot("Insulin window before adding value", MessageTypes.Pass);	
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		insulinValue = eventBean.getAmount();
		Reporter.logWithScreenShot("Insulin window after adding value", MessageTypes.Pass);
		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering Insulin detail");
		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		/*if (insulinCal.getNFKInsulincalculatorsettingQuickusecrossBtn().isPresent()) {
			Reporter.logWithScreenShot("You have active insulin effect in your body popup is displayed",
					MessageTypes.Pass);
			insulinCal.getNFKInsulincalculatorsettingQuickusecrossBtn().click();
		}*/
	}

	// Method to edit insulin details
	public void editInsulinDetail(Object eventDetail) {
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Insulin window before entering value", MessageTypes.Pass);

		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Insulin window after entering value", MessageTypes.Pass);
		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	// Method to enter activity details
	public void addActivityDetail(Object eventDetail) {
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().clear();
		Reporter.logWithScreenShot("Activity window before entering value", MessageTypes.Pass);
		getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Activity window after entering value", MessageTypes.Pass);
		getNFKEventLogaddactivityselectintensitybtn().click();
		selectIntensity();
		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering Activity detail");

		getNFKEventLogaddbgtimebtn().click();

		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventsavebtn().click();
	}

	public void addNoteText(String noteText) {
		getNFKEventLogaddeventnoteField().waitForPresent();
		getNFKEventLogaddeventnoteField().clear();
		getNFKEventLogaddeventnoteField().sendKeys(noteText);
		
	}
	
	public void addNoteDetails(Object eventDetails) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetails instanceof String) {

			eventBean.fillFromConfig((String) eventDetails);
		} else {
			eventBean.fillData(eventDetails);
		}
		Reporter.logWithScreenShot("Note window before adding value",
				MessageTypes.Pass);
		addNoteText(eventBean.getnote());
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot(
				"Note window after adding value is " + eventBean.getnote(),
				MessageTypes.Pass);
		getNFKEventLogaddeventsavebtn().waitForPresent(1000);
		getNFKEventLogaddeventsavebtn().click();
	}
	
	public void verifyAddedNoteEventOnEventLogScreen(Object eventDetails1) {
		EventDetailBeans eventBean1 = new EventDetailBeans();
		getNFKhomepageEventLogtab().click();
		getNFKhomepageEventLogtab().waitForPresent(2000);
		Reporter.logWithScreenShot("Added event on Event log screen", MessageTypes.Pass);
		if (eventDetails1 instanceof String) {

			eventBean1.fillFromConfig((String) eventDetails1);
		} else {
			eventBean1.fillData(eventDetails1);
		}
	System.out.println("Notee========================"+	getNFKEventLogeventlogaddednote().getText().substring(0,15));
	String getsubstr=getNFKEventLogeventlogaddednote().getText().substring(0,15);
	String substr=eventBean1.getnote().substring(0, 15);
	System.out.println("Sub string checking ---------------"+substr);
	System.out.println("Check true or false   "+getsubstr.equals(substr));
		WebDriverTestCase
		.verifyTrue(
				getsubstr.equals(substr),
						//.contains(eventBean1.getnote()),
				" Incorrect value is displayed ", "Entered Note is " +eventBean1.getnote());
		Reporter.logWithScreenShot("Verify Events added on Event Log Screen", MessageTypes.Pass);
			
	}
	
	// method for click on added note event
	public void clickOnAddedNoteEvent() {
		getNFKEventLogeventlogaddednote().waitForPresent();
		getNFKEventLogeventlogaddednote().click();
		getNFKEventLogaddeventnoteField().waitForPresent(1000);
		Reporter.logWithScreenShot("Edit an event page displayed", MessageTypes.Pass);
	}
		// method for edit note details
	public void editNoteDetails(Object eventDetail) {
		
		EventDetailBeans eventBean1 = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean1.fillFromConfig((String) eventDetail);
		} else {
			eventBean1.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Note window before editing value", MessageTypes.Pass);
		addNoteText(eventBean1.getnote());
		Reporter.logWithScreenShot("Note window after editing value is " + eventBean1.getnote(),
				MessageTypes.Pass);
		LFSUtilsAndroid.hideKeyboard();	
		getNFKEventLogaddeventsavebtn().click();
		getNFKhomepageEventLogtab().waitForPresent(3000);
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

}
	
		
	// Method to confirm user is deleting the event.
	public void confirmDeleteSelectedEvent() {
		
		getNFKEventLogEditglucoseDeletepopupDeleteBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("After clicking on delete confirmation button", MessageTypes.Pass);
	}

	
	// Method to verify delete pop up and delete event
	public void verifyDeleteEvent() {
		androidDriver.hideKeyboard();
		getNFKEventLogEditglucoseDeleteBtn().waitForPresent();
		getNFKEventLogEditglucoseDeleteBtn().click();
		getNFKEventLogEditglucoseDeleteconfirmTxt().waitForPresent();
		getNFKEventLogaddeventtimeselectcancelbtn().click();
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		getNFKEventLogEditglucoseEditeventtitleTxt().verifyVisible("Edit screen");
		getNFKEventLogEditglucoseDeleteBtn().verifyEnabled("Delete button");
		getNFKEventLogEditglucoseDeleteBtn().click();
		getNFKEventLogEditglucoseDeleteconfirmTxt().waitForPresent();
		Reporter.logWithScreenShot("After clicking delete button", MessageTypes.Pass);

	}

	// Method to delete added event
	public void deleteEvent() {
		getNFKEventLogEditglucoseDeleteBtn().waitForPresent();
		getNFKEventLogEditglucoseDeleteBtn().click();
		getNFKEventLogEditglucoseDeleteconfirmTxt().waitForPresent();
		Reporter.logWithScreenShot("After clicking delete button", MessageTypes.Pass);

		getNFKEventLogEditglucoseDeletepopupDeleteBtn().click();
		Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);

	}

	// Method to verify add or edit event screen for blood glucose
	public void verifyAddBGEventScreen() {
		getNFKEventLogaddbgaddvaluetxt().verifyPresent("Add event value text field");
		if (getNFKEventLogaddbgbeforemealtab().isPresent()) {
			getNFKEventLogaddbgbeforemealtab().verifyPresent("Before meal button");
			getNFKEventLogaddbgaftermealtab().verifyPresent("After meal button");
		}
		getNFKEventLogunitofmeasurementlbl().verifyPresent("UMO of BG");
		getNFKEventLogaddbgtimebtn().verifyPresent("Time value");
		getNFKEventLogEditglucoseNoteFieldTxt().verifyPresent("Note text field");
		getNFKEventLogaddeventsavebtn().verifyPresent("Save button");
		getNFKEventLogEditglucoseBackBtn().verifyPresent("Back button");

		// verifyTimePopUp();
		// verifyAreYouSurePopUp();
	}
	
	//Add an Event for all screen 
	public void verifyScreens(String screenname) {
		screenname = screenname.toUpperCase();
		switch (screenname) {
		case "GLUCOSE":
			verifyAddBGEventScreen();
			break;
		case "CARBS":
			verifyAddCarbEventScreen();
			break;
		case "INSULIN":
			verifyAddInsulinEventScreen();
			break;
		case "ACTIVITY":
			verifyAddActivityEventScreen();
			break;
		case "NOTE":
			verifyAddNoteEvenetScreen();
			break;
		}
		Reporter.logWithScreenShot("Verified the Add an Event screen ", MessageTypes.Pass);
		
}
		

	// Method to verify time picker
	public void verifyTimePopUp() {

		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogEditglucoseTimepopupYearTxt().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getNFKEventLogEditglucoseTimepopupYearTxt().getText().contains(ConstantUtils.CURRENT_YEAR),
				"Improper current year", ConstantUtils.CURRENT_YEAR + " current year title is visible");

		WebDriverTestCase.verifyTrue(
				getNFKEventLogEditglucoseDatepopupDateTxt().getText()
						.contains(LFSUtilsAndroid.getCurrentMonth().substring(0, 3)),
				"Improper current month", LFSUtilsAndroid.getCurrentMonth() + " Current month is visible");

		getNFKEventLogaddeventtimeselectcancelbtn().verifyPresent("Cancel button");
		getNFKEventLogaddeventtimeselectokbtn().verifyPresent("Ok button");

		getNFKEventLogaddeventtimeselectcancelbtn().click();
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForVisible();
		getNFKEventLogEditglucoseEditeventtitleTxt().verifyPresent("After clicking cancel button Event screen");

		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogEditglucoseTimepopupYearTxt().waitForPresent();

		int date = Integer.parseInt(LFSUtilsAndroid.getCurrentDate());

		for (int i = 0; i < getNFKEventLogEditglucoseDatepopupDatesvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKEventLogEditglucoseDatepopupDatesvalueTxt().get(i))
					&& getNFKEventLogEditglucoseDatepopupDatesvalueTxt().get(i).getText().contains(date + "")) {

			}
		}

		getNFKEventLogaddeventtimeselectokbtn().click();

		String hour = "7";
		String minute = "30";
		getNFKEventLogpageTimeStaticText(hour).click();
		getNFKEventLogpageTimeStaticText(minute).click();
		WebDriverTestCase.verifyTrue(getNFKEventLogpageTimeStaticText(minute).isSelected(),
				minute + "  as minute is not selected", minute + "  as minute is selected");
		getNFKEventLogaddeventtimeselecthourtxt().click();

		Reporter.logWithScreenShot("Selected time", MessageTypes.Pass);
		getNFKEventLogpageStaticText("AM").click();
		WebDriverTestCase.verifyTrue(getNFKEventLogpageStaticText("AM").getAttribute("checked").equalsIgnoreCase("true"),
				" AM is not selected", "AM is selected");

		WebDriverTestCase.verifyTrue(getNFKEventLogaddeventtimeselecthourtxt().getText().contains(hour),
				" Proper hour is not displayed on title", "Proper hour is displayed on title");
		WebDriverTestCase.verifyTrue(getNFKEventLogaddeventtimeselectminutetxt().getText().contains(minute),
				" Proper minute is not displayed on title", "Proper minute is displayed on title");

		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForVisible();

		WebDriverTestCase.verifyTrue(
				getNFKEventLogaddbgtimebtn().getText().contains(hour)
						&& getNFKEventLogaddbgtimebtn().getText().contains(minute),
				" Proper Time is not displayed on title", "Proper Time is displayed on event screen");
	}

	// Method to verify min and max amount allowed for blood glucose
	public void verifyAllowedBGRange() {
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogEditglucoseLoBtn().click();
		WebDriverTestCase.verifyTrue(getNFKEventLogaddbgaddvaluetxt().getText().contains("LO"),
				" LO is not entered after", "LO is entered after");
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogEditglucoseHiBtn().click();
		WebDriverTestCase.verifyTrue(getNFKEventLogaddbgaddvaluetxt().getText().contains("HI"),
				" HI is not entered after", "HI is entered after");

		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt()
				.sendKeys(ConfigurationManager.getBundle().getProperty("BG1.lowValue").toString());
		getNFKEventLogEditglucoseAppleiconImg().click();
		getNFKEventLogpageStaticText(ConstantUtils.BG_VALUE_RANGE_ERROR_MSG).verifyPresent("Blood glucose range error");
		getNFKEventLogaddeventtimeselectokbtn().click();

		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt()
				.sendKeys(ConfigurationManager.getBundle().getProperty("BG1.highValue").toString());
		getNFKEventLogEditglucoseAppleiconImg().click();
		getNFKEventLogpageStaticText(ConstantUtils.BG_VALUE_RANGE_ERROR_MSG).verifyPresent("Blood glucose range error");
		getNFKEventLogaddeventtimeselectokbtn().click();

	}

	// method to verify are you sure question flow
	public void verifyAreYouSurePopUp() {
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys("" + LFSUtilsAndroid.setValueUnitOfMeasureInt(50));
		getNFKEventLogEditglucoseBackBtn().click();
		getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("addEvent.unsavedEntry.title")).waitForPresent();
		getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("addEvent.unsavedEntry.title"))
				.verifyPresent("Are you sure pop up");
		getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("addEvent.unsavedEntry.message"))
				.verifyPresent("Change will not saved error message");
		getNFKEventLogaddeventtimeselectcancelbtn().click();
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForVisible();
		getNFKEventLogEditglucoseEditeventtitleTxt().verifyPresent("After clicking cancel button event screen");
		getNFKEventLogEditglucoseBackBtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
		getNFKEventLogaddeventbtn().waitForPresent();
		getNFKEventLogaddeventbtn().verifyPresent("eventlog screen event button ");

	}

	// method to verify add event screen for carbs
	public void verifyAddCarbEventScreen() {
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		getNFKEventLogaddbgaddvaluetxt().verifyPresent("Add event value text field");
		getNFKEventLogunitofmeasurementlbl().verifyPresent("UMO for carb");
		getNFKEventLogaddbgtimebtn().verifyPresent("Time value");
		getNFKEventLogEditglucoseNoteFieldTxt().verifyPresent("Note text field");
		getNFKEventLogaddeventsavebtn().verifyPresent("Save button");
		getNFKEventLogEditglucoseBackBtn().verifyPresent("Back button");

		//verifyTimePopUp();
		//verifyAreYouSurePopUp();
	}

	// Method to verify add event screen for insulin
	public void verifyAddInsulinEventScreen() {
		// getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		getNFKEventLogaddbgaddvaluetxt().verifyPresent("Add event value text field");
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys("9.11");
		WebDriverTestCase.verifyTrue(!getNFKEventLogaddbgaddvaluetxt().getAttribute("value").equals("9.11"),
				"Insulin field accepting more than one decimal place", "Insulin field not accepting two decimal place");
		getNFKEventLogaddbgaddvaluetxt().sendKeys("9.1");
		LFSUtilsAndroid.hideKeyboard();
		WebDriverTestCase.verifyTrue(!getNFKEventLogaddbgaddvaluetxt().getAttribute("value").equals("9.1"),
				"Insulin field accepting more than one decimal place",
				"Insulin field accepting upto one decimal place");			
	/*	
		verifyTimePopUp();
		verifyAreYouSurePopUp();*/
		LFSUtilsAndroid.waitforLoad();
		getNFKEventLogunitofmeasurementlbl().verifyPresent("UOM for Insulin");
		getNFKEventLogaddinsulinselecttypebtn().verifyPresent("Insulin type value");
		getNFKEventLogaddinsulinselecttypebtn().click();
		verifyInsulinTypePopUp();
		selectinsulin();
		String str1=getNFKEventLogTypeTxt().getText();
		WebDriverTestCase.assertTrue(str1.contains(
						LFSUtilsAndroid.getPropString("event.detail.insulinController.nph")),
				"improper insulin type ",
				LFSUtilsAndroid.getPropString("event.detail.insulinController.nph") + " As per selection displayed");
		
		getNFKEventLogaddbgtimebtn().verifyPresent("Time value");
		getNFKEventLogEditglucoseNoteFieldTxt().verifyPresent("Note text field");
		getNFKEventLogaddeventsavebtn().verifyPresent("Save button");
		getNFKEventLogEditglucoseBackBtn().verifyPresent("Back button");

	
	}

	private void selectinsulin() {
		   String type= LFSUtilsAndroid.getPropString("event.detail.insulinController.nph");		  
		   for(int i=0;i<5;i++) {
			   String gettype= getNFKEventLogTypePickerTxt().getText(); 
		   if(gettype.equals(type))
		    {
			   getNFKEventLogTypePickerDone().waitForPresent();
			   getNFKEventLogTypePickerDone().click();	    
			   Reporter.logWithScreenShot("User selected the correct type of Insulin ",MessageTypes.Pass);
			   break;
		     }
		     else
		      {
			    getNFKEventLogTypePickerBtn().click();	
		      } 
		   }		
	}
	
	// method to verify insulin type pop up
	public void verifyInsulinTypePopUp() {
		  List<String> list  = new ArrayList<String>();
		  list.add("Rapid");
		  list.add("Long");
		  list.add("Mix");
		  list.add("NPH");
		  list.add("Other");
		  for(String item : list){
			  String strtype= getNFKEventLogTypePickerTxt().getText(); 
			  if(item.equals(strtype)) {
				Reporter.logWithScreenShot("User verified  "+strtype + " insulin ",MessageTypes.Pass);
			  }
			  else
			  {
				  Reporter.logWithScreenShot("Insulin type are incorrect ",MessageTypes.Pass);
			  }
			     getNFKEventLogTypePickerBtn().waitForPresent();
			     getNFKEventLogTypePickerBtn().click();	
			}
	 }
		   
		


	// Method to verify add event screen for activity
	public void verifyAddActivityEventScreen() {
		//getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		
		int randomNumberActivity = ThreadLocalRandom.current().nextInt(10, 40);		
		getNFKEventLogaddbgaddvaluetxt().verifyPresent("Add event value text field");
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys(randomNumberActivity+"");	
		getNFKEventLogaddbgaddvaluetxt().verifyPresent("Add event value text field");	
		getNFKEventLogunitofmeasurementlbl().verifyPresent("UMO for activity");
		getNFKEventLogaddactivityintensitylbl().verifyPresent("Activity Intensity");
		getNFKEventLogaddactivityselectintensitybtn().verifyPresent("Intensity type text");
		getNFKEventLogaddactivityselectintensitybtn().click();
		verifyIntensityTypePopUp();
		selectIntensity();
		String str= LFSUtilsAndroid.getPropString("activity.intensity.light");
		WebDriverTestCase.verifyTrue(
				str.contains(ConfigurationManager.getBundle().getString("activity.intensity.light")),
				"Selection as intensity light is not displayed",
				ConfigurationManager.getBundle().getString("activity.intensity.light") + " As per selection displayed");

		getNFKEventLogaddbgtimebtn().verifyPresent("Time value");
		getNFKEventLogEditglucoseNoteFieldTxt().verifyPresent("Note text field");
		getNFKEventLogaddeventsavebtn().verifyPresent("Save button");
		getNFKEventLogEditglucoseBackBtn().verifyPresent("Back button");

//		verifyTimePopUp();
//		verifyAreYouSurePopUp();
	}

	private void selectIntensity() {
		 String type= LFSUtilsAndroid.getPropString("activity.type.moderate");		  
		   for(int i=0;i<4;i++) {
			   String gettype= getNFKEventLogTypePickerTxt().getText(); 
		   if(gettype.equals(type))
		    {
			   getNFKEventLogTypePickerDone().waitForPresent();
			   getNFKEventLogTypePickerDone().click();   
			   Reporter.logWithScreenShot("User selected the correct type of Activity ",MessageTypes.Pass);
			   break;
		     }
		     else
		      {
			    getNFKEventLogTypePickerBtn().click();	
		      } 
		   }		
	}
	
	public void verifyAddNoteEvenetScreen() {
		getNFKEventLogaddeventtimingBtn().verifyPresent("Note field time button");
		getNFKEventLogaddeventnoteField().verifyPresent("Note text field");
		 if (getNFKEventLogaddeventsavebtn().isEnabled()) {
				Reporter.logWithScreenShot("Save button is Enabled",MessageTypes.Pass);
	       } else 
	       {
				Reporter.logWithScreenShot("Save button is Disabled", MessageTypes.Pass);
			}				
     }
	
	// Method to verify intensity type pop up
	public void verifyIntensityTypePopUp() {
		List<String> listactivity  = new ArrayList<String>();
		listactivity.add("Intense");
		listactivity.add("None");
		listactivity.add("Light");
		listactivity.add("Moderate");
		  
		for(String typeactivity : listactivity){
			  String strntype= getNFKEventLogTypePickerTxt().getText(); 
			  if(typeactivity.equals(strntype)) {
				Reporter.logWithScreenShot("User verified  "+strntype + " Activity ",MessageTypes.Pass);
			  }
			  else
			  {
				  Reporter.logWithScreenShot("Activity type is incorrect ",MessageTypes.Pass);
			  }
			     getNFKEventLogTypePickerBtn().waitForPresent();
			     getNFKEventLogTypePickerBtn().click();	
			}
	}

	// Method to add multiple event
	public void addMultipleEvent() {

		EventDetailBeans eventBean = new EventDetailBeans();

		eventBean.fillData("addMultipleEvent.addGlucose");
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Added carb amount" + eventBean.getAmount(), MessageTypes.Pass);

		getNFKEventLogAddeventAddBtn().click();
		getNFKEventLogaddeventaddcarbvaluebtn().click();
		eventBean.fillData("addMultipleEvent.addCarb");
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			if (getNFKEventLogaddbgaddvaluetxtList().get(i).isEnabled()) {
				getNFKEventLogaddbgaddvaluetxtList().get(i).clear();
				getNFKEventLogaddbgaddvaluetxtList().get(i).sendKeys(eventBean.getAmount());
				LFSUtilsAndroid.hideKeyboard();
				break;
			}
		}
		Reporter.logWithScreenShot("Added Glucose amount" + eventBean.getAmount(), MessageTypes.Pass);

		clickOnSaveBtnAddEventScreen();
		HomePageAndroid home = new HomePageAndroid();
		home.clickOnHome();
		LFSUtilsAndroid.waitforLoad();
		for (int i = 0; i < home.getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(home.getNFKHomepageEventValueTxt().get(i))
					&& home.getNFKHomepageEventValueTxt().get(i).getText().contains(eventBean.getAmount())) {
				Reporter.logWithScreenShot("Added carb event" + eventBean.getAmount(), MessageTypes.Pass);
				break;
			}
		}
		eventBean.fillData("addMultipleEvent.addGlucose");
		for (int i = 0; i < home.getNFKHomepageEventValueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(home.getNFKHomepageEventValueTxt().get(i))
					&& home.getNFKHomepageEventValueTxt().get(i).getText().contains(eventBean.getAmount())) {
				Reporter.logWithScreenShot("Added Glucose event" + eventBean.getAmount(), MessageTypes.Pass);
				break;
			}
		}

	}

	// Method to verify Add Event Screen
	public void verifyAddEventScreen() {
		getNFKEventLogaddeventlbl().verifyPresent("Add an Event header is present");
		getNFKEventLogaddeventaddbgvaluebtn().verifyPresent("Add BG button is present");
		getNFKEventLogaddeventaddcarbvaluebtn().verifyPresent("Carbs button is present");
		getNFKEventLogaddeventaddinsulinvaluebtn().verifyPresent("Insulin button is present");
		getNFKEventLogaddeventaddactivityvaluebtn().verifyPresent("Activity button is present");
		getNFKEventLogaddeventsavebtn().verifyPresent("Save button is present");
		getNFKEventLogEditglucoseBackBtn().verifyPresent("Back button is present");
	}

	// Method to tap back arrow
	public void tapAppBackArrow() {
		getNFKEventLogEditglucoseBackBtn().click();
	}

	// method to enter a manual blood glucose value
	public void enterManualBGvalue(String value) {
		getNFKEventLogaddbgaddvaluetxt().waitForPresent();

		if (value.equalsIgnoreCase("HI")) {
			getNFKEventLogpageStaticText("HI").click();
			getNFKEventLogaddeventsavebtn().click();
		} else if (value.equalsIgnoreCase("LO")) {
			waitForPageToLoad();
			getNFKEventLogpageStaticText("LO").click();
			getNFKEventLogaddeventsavebtn().click();
		} else {

			getNFKEventLogaddbgaddvaluetxt().sendKeys(value);
		}

		Reporter.logWithScreenShot("BG value entered", MessageTypes.Pass);
	}
	
	public void VerifyHILOvalue(String value)  {
		getNFKhomepageEventLogtab().click();
		int eventssize=getNFKEventLogaddbgaddvaluetxtList().size();

 		
		for (int i = 1; i <=getNFKEventLogaddbgaddvaluetxtList().size() ; i++) {
			if(value.equalsIgnoreCase("LO")) {
			  WebDriverTestCase.verifyTrue(getNFKEventLogaddbgaddvaluetxt().getAttribute("value")
							.contains("LO"),
							"LO value is not present on Event Log "," LO is present on Event Log");
			 Reporter.logWithScreenShot("LO value is present on Event Log ", MessageTypes.Pass);

			 break;
			  }
			}
		
		for (int i = 1; i <=getNFKEventLogaddbgaddvaluetxtList().size() ; i++) {
			if(value.equalsIgnoreCase("HI")) {
			  WebDriverTestCase.verifyTrue(getNFKEventLogaddbgaddvaluetxt().getAttribute("value")
							.contains("HI"),
							"HI value is not present on Event Log "," HI is present on Event Log");
			 Reporter.logWithScreenShot("HI value is present on Event Log ", MessageTypes.Pass);

			 break;
			  }
			}
	}
	
	

	public void verifysavedEvent() {
		getNFKhomepageEventLogtab().click();
		Reporter.logWithScreenShot("Added event on Event screen", MessageTypes.Pass);
	}

	// method to click on save button on BG entry
	// SG Commenting out back button click. After save user returned to eventlog
	public void clickSaveBtneventlog() {
		getNFKEventLogaddeventsavebtn().waitForPresent();
		getNFKEventLogaddeventsavebtn().click();

		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	public void verifyUnitOfMeasurement(String option) {
		getNFKEventLogaddeventlbl().waitForPresent();
		option = option.toUpperCase();
		switch (option) {
		case "MG/DL":
			if (getNFKEventLogunitofmeasurementlbl().getText().toString().equalsIgnoreCase("MG/DL"))
				Reporter.logWithScreenShot("Unit of Measurement is" + option, MessageTypes.Pass);
			break;
		case "MMOL/L":
			if (getNFKEventLogunitofmeasurementlbl().getText().toString().equalsIgnoreCase("MMOL/L"))
				Reporter.logWithScreenShot("Unit of Measurement is" + option, MessageTypes.Pass);
			break;
		}
	}

	public void clickClassicSelectCurrentDate() {
		getNFKEventLogClassicViewBtn().click();
		getDate = getNFKEventLogClassicViewDateHeaderLbl().getText().toString();
		for (QAFWebElement ele : NFKEventLogClassicViewDateValueLbl) {
			String dateformat1 = new String();
			String currentMonth = LFSUtilsAndroid.getCurrentMonth().substring(0, 3);
			int currentMonthNumeric = Integer.parseInt(LFSUtilsAndroid.monthIntValue(currentMonth));
			int date = Integer.parseInt(LFSUtilsAndroid.getCurrentDate());

			if (ConfigurationManager.getBundle().getString("countryname")
					.equalsIgnoreCase("United Kingdom and Ireland")) {
				System.out.println(ConfigurationManager.getBundle().getString("countryname")
						+ "#################################");
				if (currentMonthNumeric <= 9)
					dateformat1 = date + "/" + "0" + currentMonthNumeric;
				else
					dateformat1 = date + "/" + currentMonthNumeric;
			} else
				dateformat1 = currentMonthNumeric + "/" + date;

			System.out.println(dateformat1 + "c%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			if (getNFKEventLogpageStaticText(dateformat1).isPresent()) {
				Reporter.logWithScreenShot("Selected Date is displayed in Classic View", MessageTypes.Pass);
			} else
				Reporter.logWithScreenShot("Selected Date is not displayed in Classic view", MessageTypes.Fail);
		}
	}

	public void clickClassicCurrentDate(Object eventDetails) {
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetails instanceof String) {

			eventBean.fillFromConfig((String) eventDetails);
		} else {
			eventBean.fillData(eventDetails);
		}

		String currentMonth = LFSUtilsAndroid.getCurrentMonth().substring(0, 3);
		int currentMonthNumeric = Integer.parseInt(LFSUtilsAndroid.monthIntValue(currentMonth));
		int date = (Integer.parseInt(LFSUtilsAndroid.getCurrentDate()));
		String dateformat1 = new String();
		if (date <= 9)
			dateformat1 = currentMonthNumeric + "/" + date;
		else {
			dateformat1 = currentMonthNumeric + "/" + date;
		}
		String dateformat2 = "";
		if (currentMonthNumeric <= 9)
			dateformat2 = date + "/" + currentMonthNumeric;
		else
			dateformat2 = date + "/" + currentMonthNumeric;

		try {

			getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat1, eventBean.getAmount()).waitForPresent(10000);
			QAFWebElement ele = getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat1, randomNumberGlucose);
			ele.verifyPresent("added BG");
			ele.click();
		} catch (Exception e) {
			QAFWebElement ele = getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat1, randomNumberGlucose);
			ele.verifyPresent("added BG");
			ele.click();
		}

	}

	public QAFWebElement getNFKEventLogEditglucoseDatepopupDynamicTxt() {
		return NFKEventLogEditglucoseDatepopupDynamicTxt;
	}

	public QAFWebElement getNFKEventLogEditglucoseDynamicTxt() {
		return NFKEventLogEditglucoseDynamicTxt;
	}

	public QAFWebElement getNFKEventLogClassicviewRecentaddedbgvalueBtn(String text1, String text2) {
		return LFSUtilsAndroid.getElement("NFK.eventlog.classicview.recentaddedBGvalue.btn", text1, text2);
	}

	// Method to verify Blood glucose added note range and time
  public void allowedNoteRangeTime() {
	   getNFKEventLogaddbgaddvaluetxt().clear();
	   getNFKEventLogaddbgaddvaluetxt().sendKeys("200");
	   getNFKEventLogaddbgtimebtn().click();
	   verifyTimePickerFutureNotAllowed();
		maxAllowedNoteFieldCharacter();
	}
 

	// Method to verify max length field for Note field
	public void maxAllowedNoteFieldCharacter() {

		getNFKEventLogEditglucoseNoteFieldTxt().waitForPresent();
		int length = 140;
		String typeName = RandomStringUtils.randomAlphanumeric(length + 1);

		getNFKEventLogEditglucoseNoteFieldTxt().clear();
		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys(typeName);
		Validator.verifyThat("Note charcter length",
				getNFKEventLogEditglucoseNoteFieldTxt().getAttribute("value").length(),
				Matchers.lessThanOrEqualTo(length));

	}

	// Method to verify time picker do not allow future date
	public void verifyTimePickerFutureNotAllowed() {
		getNFKEventLogEditglucoseDatepopupDateTxt().waitForPresent();
		int date = Integer.parseInt(LFSUtilsAndroid.getCurrentDate()) + 1;
		ConfigurationManager.getBundle().setProperty("selected.date", date);
		if (ConfigurationManager.getBundle().getProperty("selected.date").equals(LFSUtilsAndroid.getCurrentDate())) {
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Selected date is current date", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Selected date ", MessageTypes.Pass);
		getNFKEventLogaddeventtimeselectokbtn().click();
		ConfigurationManager.getBundle().setProperty("selected.date", LFSUtilsAndroid.getCurrentDate());
		if (ConfigurationManager.getBundle().getProperty("selected.date").equals(LFSUtilsAndroid.getCurrentDate()))
			Reporter.logWithScreenShot("Selected date is current date", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Selected time ", MessageTypes.Pass);
		getNFKEventLogaddeventtimeselectokbtn().click();
		if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent())
			getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
	}

	// Method to verify Carb value range and date picker do not allow future
	// date
	public void carValuebAllowedRange() {
		if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent())
			getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys("1000");
		getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("carbs.valueAlert.message"))
				.verifyPresent("Carb range popup");

		if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent())
			getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys("200");
		getNFKEventLogaddbgtimebtn().click();
		verifyTimePickerFutureNotAllowed();
		maxAllowedNoteFieldCharacter();
	}

	// Method to verify Insulin range and future date
	public void insulinAllowedRangeTimeType() {
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys("123.4");
		WebDriverTestCase.verifyTrue(getNFKEventLogaddbgaddvaluetxt().getAttribute("text").contains("123.4"),
				"Not getting correct value as length 5", "Getting correct value as length 5");
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys("1235");
		if (getNFKEventLogaddbgaddvaluetxt().getAttribute("text").contains("")) {
			Reporter.logWithScreenShot("More than 3 digit value is entered which is not acceptable", MessageTypes.Pass);
		} else if (getNFKEventLogaddbgaddvaluetxt().getAttribute("text").contains("123")) {
			Reporter.logWithScreenShot("value with 3 digits is entered", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Entered value is out of range", MessageTypes.Pass);
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys("251");
		getNFKEventLogaddinsulinselecttypebtn().click();
		getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("insulin.valueAlert.message"))
				.verifyPresent("Insulin value must be between 0 and 250");
		if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent())
			getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys("220");

		Reporter.logWithScreenShot("Insulin type is required error popup", MessageTypes.Pass);
		if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent())
			getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		getNFKEventLogaddinsulinselecttypebtn().click();
		getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("insulin.insulinType")).waitForPresent();
		getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("event.detail.insulinController.rapid"))
				.click();
		Reporter.logWithScreenShot("Selected Insulin type", MessageTypes.Pass);
		LFSUtilsAndroid.clickWithText("OK");
		getNFKEventLogaddbgtimebtn().click();
		verifyTimePickerFutureNotAllowed();
		
	}

	// Method to verify Activity range allowed
	public void activityAllowedRangeTimeDuration() {
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys("1441");
		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("activity.timeAlert.message"))
				.verifyPresent("Activity time must be between 0 and 1440");
		if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent()) {
			Reporter.logWithScreenShot("OK pop up is present", MessageTypes.Pass);
			getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
			Reporter.logWithScreenShot("Clicked on OK", MessageTypes.Pass);
		}
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys("1420");
		getNFKEventLogaddbgtimebtn().click();
		verifyTimePickerFutureNotAllowed();
		maxAllowedNoteFieldCharacter();

	}

	public void clickOK() {
		getNFKEventLogaddeventtimeselectokbtn().click();
	}

	public void takeScreenshotsOfBGPage() {
		Reporter.logWithScreenShot("Blood Glucose page", MessageTypes.Pass);

	}


	public void userClickOnCancel() {
		getNFKEventLogaddeventcancelbtn().click();
	}

	public void clickScreenshotsActivityPage() {
		Reporter.logWithScreenShot("Activity Page", MessageTypes.Pass);
	}

	public void clickScreenshotsCarbsPage() {
		Reporter.logWithScreenShot("Carbs Page", MessageTypes.Pass);
	}

	public void clickScreenshotsInsulinPage() {
		Reporter.logWithScreenShot("Insulin page", MessageTypes.Pass);
	}

	public void clickOnGlucoseEventClassicView() {
		if (pageProps.getString("language.name").equalsIgnoreCase("vi-vi")) {
			String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			String currentMonth = LFSUtilsAndroid.getCurrentMonth().substring(0, 3);
			System.out.println(currentMonth);
			int currentMonthNumeric = Integer.parseInt(LFSUtilsAndroid.monthIntValue(currentMonth));
			int date = Integer.parseInt(LFSUtilsAndroid.getCurrentDate());
			String dateformat1 = new String();
			if (date <= 9)
				dateformat1 = date + "/" + currentMonthNumeric;
			else {
				dateformat1 = date + "/" + currentMonthNumeric;
			}
			String dateformat2 = "";
			if (currentMonthNumeric <= 9)
				dateformat2 = date + "/" + currentMonthNumeric;
			else {
				dateformat2 = date + "/" + currentMonthNumeric;
			}
			try {

				getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat1, randomNumberGlucose).waitForPresent(10000);
				QAFWebElement ele = getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat1, randomNumberGlucose);
				ele.verifyPresent("added BG");
				ele.click();
			} catch (Exception e) {
				QAFWebElement ele = getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat2, randomNumberGlucose);
				ele.verifyPresent("added BG");
				ele.click();
			}
		} else if (pageProps.getString("language.name").equalsIgnoreCase("hu-hu")) {
			String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			String currentMonth = LFSUtilsAndroid.getCurrentMonth().substring(0, 3);
			System.out.println(currentMonth);
			int currentMonthNumeric = Integer.parseInt(LFSUtilsAndroid.monthIntValue(currentMonth));
			int date = Integer.parseInt(LFSUtilsAndroid.getCurrentDate());
			String dateformat1 = new String();
			if (date <= 9)
				dateformat1 = currentMonthNumeric + ". " + date + ".";
			else {
				dateformat1 = currentMonthNumeric + ". " + date + ".";
			}
			String dateformat2 = "";
			if (currentMonthNumeric <= 9)
				dateformat2 = currentMonthNumeric + ". " + date + ".";
			else {
				dateformat2 = currentMonthNumeric + ". " + date + ".";

			}
			try {

				getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat1, randomNumberGlucose).waitForPresent(10000);
				QAFWebElement ele = getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat1, randomNumberGlucose);
				ele.verifyPresent("added BG");
				ele.click();
			} catch (Exception e) {
				QAFWebElement ele = getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat2, randomNumberGlucose);
				ele.verifyPresent("added BG");
				ele.click();
			}
		} else if (getNFKEventLogunitofmeasurementlbl().getText().equalsIgnoreCase("mmol/l")) {
			String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			String currentMonth = LFSUtilsAndroid.getCurrentMonth().substring(0, 3);
			System.out.println(currentMonth);
			int currentMonthNumeric = Integer.parseInt(LFSUtilsAndroid.monthIntValue(currentMonth));
			int currentYear = Calendar.getInstance().get(Calendar.YEAR);
			int date = Integer.parseInt(LFSUtilsAndroid.getCurrentDate());
			String dateformat1 = new String();
			if (date <= 9)
				dateformat1 = date + "." + currentMonthNumeric + ".";
			else {
				dateformat1 = date + "." + currentMonthNumeric + ".";
			}
			String dateformat2 = "";
			if (currentMonthNumeric <= 9)
				dateformat2 = date + "." + currentMonthNumeric + ".";
			else
				dateformat2 = date + "." + currentMonthNumeric + ".";

			try {

				getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat1, randomNumberGlucose).waitForPresent(10000);
				QAFWebElement ele = getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat1,
						randomNumberGlucose + "," + "0");
				ele.verifyPresent("added BG");
				ele.click();
			} catch (Exception e) {
				QAFWebElement ele = getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat2,
						randomNumberGlucose + "," + "0");
				ele.verifyPresent("added BG");
				ele.click();
			}
		} else {
			String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			String currentMonth = LFSUtilsAndroid.getCurrentMonth().substring(0, 3);
			System.out.println(currentMonth);
			int currentMonthNumeric = Integer.parseInt(LFSUtilsAndroid.monthIntValue(currentMonth));
			int date = Integer.parseInt(LFSUtilsAndroid.getCurrentDate());
			String dateformat1 = new String();

			if (date <= 9)
				dateformat1 = currentMonthNumeric + "/" + date;
			else {
				dateformat1 = currentMonthNumeric + "/" + date;
			}
			String dateformat2 = "";
			if (currentMonthNumeric <= 9)
				dateformat2 = date + "/" + currentMonthNumeric;
			else
				dateformat2 = date + "/" + currentMonthNumeric;

			try {

				getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat1, randomNumberGlucose).waitForPresent(10000);
				QAFWebElement ele = getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat1, randomNumberGlucose);
				ele.verifyPresent("added BG");
				ele.click();
			} catch (Exception e) {
				QAFWebElement ele = getNFKEventLogClassicviewRecentaddedbgvalueBtn(dateformat2, randomNumberGlucose);
				ele.verifyPresent("added BG");
				ele.click();
			}
		}
	}

	@FindBy(locator = "NFK.eventlog.addEventText.txt")
	private QAFWebElement NFKeventlogAddEventTextTxt;

	public QAFWebElement getNFKeventlogAddEventTextTxt() {
		return NFKeventlogAddEventTextTxt;
	}

	public void AddGlucoseCarbActivityInsulin() {
		
			userSelectFromLogEventList("GLUCOSE");
			if (getNFKEventLogunitofmeasurementlbl().getText().equalsIgnoreCase("mmol/l")) {

			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(2, 5);
			String randomNumberGlucose = LFSUtilsAndroid.mmolMGDL(randomNumberGlucose0);
			ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
			enterManualBGvalue(randomNumberGlucose + "");
			Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose,
					MessageTypes.Pass);
			LFSUtilsAndroid.clickBackButton();
			//getNFKEventLogAddeventEventiconImg().get(0).click();
			getNFKEventLogAddeventAddBtn().click();
			userSelectFromLogEventList("CARBS");
			int randomNumberCarb = ThreadLocalRandom.current().nextInt(98, 99);
			ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb);
			getNFKEventLogaddbgaddvaluetxtList().get(1).sendKeys(randomNumberCarb + "");
			LFSUtilsAndroid.hideKeyboard();
			Reporter.logWithScreenShot("Carb window after entering value" + randomNumberCarb, MessageTypes.Pass);
			//getNFKEventLogAddeventEventiconImg().get(1).click();
			getNFKEventLogAddeventAddBtn().click();

			userSelectFromLogEventList("ACTIVITY");
			int randomNumberActivity = ThreadLocalRandom.current().nextInt(98, 99);
			ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity);
			getNFKeventlogAddEventTextTxt().sendKeys(randomNumberActivity + "");
			LFSUtilsAndroid.hideKeyboard();
			Reporter.logWithScreenShot("Activity window after adding value is " + randomNumberActivity,
					MessageTypes.Pass);
			if (getNFKEventLogaddactivityintensitylbl().isPresent()) {
				getNFKEventLogaddactivityselectintensitybtn().click();
				getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("activity.type"))
						.waitForPresent();
				getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("activity.intensity.moderate"))
						.click();

			}
			getNFKEventLogAddeventAddBtn().click();
			
			userSelectFromLogEventList("INSULIN");
			int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 200);
			ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberInsulin);
			getNFKeventlogAddEventTextTxt().sendKeys(randomNumberInsulin + "");
			LFSUtilsAndroid.hideKeyboard();
			Reporter.logWithScreenShot("Insulin window after adding value" + randomNumberInsulin, MessageTypes.Pass);
			

			getNFKEventLogaddeventsavebtn().click();
			Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		} else {
			//userSelectFromLogEventList("GLUCOSE");

			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(80, 200);
			String randomNumberGlucose = LFSUtilsAndroid.mmolMGDL(randomNumberGlucose0);
			ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
			enterManualBGvalue(randomNumberGlucose + "");
			Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose,
					MessageTypes.Pass);
			LFSUtilsAndroid.clickBackButton();
			getNFKEventLogAddeventEventiconImg().get(0).click();
			getNFKEventLogAddeventAddBtn().click();
			
			userSelectFromLogEventList("CARBS");
			int randomNumberCarb = ThreadLocalRandom.current().nextInt(1, 100);
			ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb);
			getNFKeventlogAddEventTextTxt().sendKeys(randomNumberCarb + "");
			LFSUtilsAndroid.hideKeyboard();
			Reporter.logWithScreenShot("Carb window after entering value" + randomNumberCarb, MessageTypes.Pass);
			getNFKEventLogAddeventEventiconImg().get(1).click();
			getNFKEventLogAddeventAddBtn().click();
	
//			userSelectFromLogEventList("ACTIVITY");
//			int randomNumberActivity1 = ThreadLocalRandom.current().nextInt(10, 1000);
//			ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity1);
//			getNFKeventlogAddEventTextTxt().sendKeys(randomNumberActivity1 + "");
//			LFSUtilsAndroid.hideKeyboard();
//			Reporter.logWithScreenShot("Activity window after adding value is " + randomNumberActivity1,
//					MessageTypes.Pass);
//	
//			if (getNFKEventLogaddactivityintensitylbl().isPresent()) {
//				getNFKEventLogaddactivityselectintensitybtn().click();
//				getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("activity.type"))
//						.waitForPresent();
//				getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("activity.intensity.moderate"))
//						.click();
//			}
			//getNFKEventLogAddeventAddBtn().click();
			
//			userSelectFromLogEventList("INSULIN");
//			int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 200);
//			ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberInsulin);
//			getNFKeventlogAddEventTextTxt().sendKeys(randomNumberInsulin + "");
//			LFSUtilsAndroid.hideKeyboard();
//			Reporter.logWithScreenShot("Insulin window after adding value" + randomNumberInsulin, MessageTypes.Pass);
			
			getNFKEventLogaddeventsavebtn().click();
			Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		}

	}

		public void verifyGlucoseCarbActivityInsulin() {
	String randomActivity = ConfigurationManager.getBundle().getProperty("classic.activity").toString();
		String randomCarb = ConfigurationManager.getBundle().getProperty("classic.carb").toString();
//		//String randomBG = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		String randomInsulin = ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
		
		getNFKhomepageEventLogtab().waitForPresent();
		getNFKhomepageEventLogtab().click();
		waitForPageToLoad();

		String[] arrData = {randomActivity,"Activity",randomCarb,"carb", randomInsulin,"Insulin"};
		
		//String[] arrData = {randomCarb,"carb"};
		
		for(int i = 0; i< arrData.length; i=i+2){

			for(int j = 0; j< getNFKEventLogaddbgaddvaluetxtList().size();){
				if (getNFKEventLogaddbgaddvaluetxtList().get(j).getText().equals(arrData[i])) 
				{
					Reporter.logWithScreenShot(arrData[i] + arrData[i+1] +" Event is Present", MessageTypes.Pass);
				}	
				 j++;
			}			
		}
		Reporter.logWithScreenShot("Added event on Event screen", MessageTypes.Pass);
		
	}
	

	// method to edit glucose carb and activity from classic view
	public void editGlucoseCarbActivity() {
		if (pageProps.getString("language.name").equalsIgnoreCase("hr-hr")
				|| pageProps.getString("language.name").equalsIgnoreCase("hu-hu")) {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
				String randomNumberCarb = ConfigurationManager.getBundle().getProperty("classic.carb").toString();
				if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberCarb)) {
					getNFKEventLogAddeventEventiconImg().get(i).click();
					getNFKEventLogaddbgaddvaluetxtList().get(i).clear();
					getNFKEventLogaddbgaddvaluetxtList().get(i).clear();
					int randomNumberCarb1 = ThreadLocalRandom.current().nextInt(100, 101);
					getNFKEventLogaddbgaddvaluetxtList().get(i).sendKeys(randomNumberCarb1 + "");
					LFSUtilsAndroid.hideKeyboard();
					Reporter.logWithScreenShot("Carb window after editing value " + randomNumberCarb1,
							MessageTypes.Pass);
					ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb1);
					break;
				}
			}
			for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
				String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.activity")
						.toString();
				if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberActivity)) {
					getNFKEventLogAddeventEventiconImg().get(i).click();
					getNFKEventLogaddbgaddvaluetxtList().get(i).clear();
					getNFKEventLogaddbgaddvaluetxtList().get(i).clear();
					int randomNumberActivity1 = ThreadLocalRandom.current().nextInt(100, 101);
					getNFKEventLogaddbgaddvaluetxtList().get(i).sendKeys(randomNumberActivity1 + "");
					LFSUtilsAndroid.hideKeyboard();
					Reporter.logWithScreenShot("Activity window after editing value " + randomNumberActivity1,
							MessageTypes.Pass);
					ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity1);
					break;
				}
			}
			LFSUtilsAndroid.hideKeyboard();

			Point p = getNFKEventLogEditglucoseEditeventtitleTxt().getLocation();
			int count = 0;
			String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			while (!getNFKEventLogpageStaticText(randomNumberGlucose).isPresent()) {
				LFSUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60,
						100);
				LFSUtilsAndroid.waitforLoad();
				count++;
				if (count == 80)
					break;
			}

			for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {

				if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().contains(randomNumberGlucose)) {

					getNFKEventLogpageStaticText(randomNumberGlucose).click();

					for (int j = 0; j < getNFKEventLogaddbgaddvaluetxtList().size(); j++) {

						if (getNFKEventLogaddbgaddvaluetxtList().get(j).getText().contains(randomNumberGlucose)) {
							getNFKEventLogaddbgaddvaluetxtList().get(j).clear();
							getNFKEventLogaddbgaddvaluetxtList().get(j).clear();
							int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(5, 7);
							String randomNumberGlucose1 = LFSUtilsAndroid.mmolMGDL(randomNumberGlucose0);
							getNFKEventLogaddbgaddvaluetxtList().get(j).sendKeys(Integer.toString(randomNumberGlucose0));
							LFSUtilsAndroid.hideKeyboard();
							Reporter.logWithScreenShot(
									"Blood Glucose window after editing value " + randomNumberGlucose0,
									MessageTypes.Pass);
							getNFKEventLogAddeventEventiconImg().get(j).click();
							getNFKEventLogaddeventsavebtn().click();
							ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose0);
							break;
						}

					}

					break;
				}

			}

			Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		} else {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();

			for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
				String randomNumberCarb = ConfigurationManager.getBundle().getProperty("classic.carb").toString();
				if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberCarb)) {
					getNFKEventLogAddeventEventiconImg().get(i).click();
					getNFKEventLogaddbgaddvaluetxtList().get(i).clear();
					getNFKEventLogaddbgaddvaluetxtList().get(i).clear();
					int randomNumberCarb1 = ThreadLocalRandom.current().nextInt(21, 200);
					getNFKEventLogaddbgaddvaluetxtList().get(i).sendKeys(randomNumberCarb1 + "");
					LFSUtilsAndroid.hideKeyboard();
					Reporter.logWithScreenShot("Carb window after editing value" + randomNumberCarb1,
							MessageTypes.Pass);
					ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb1);
					break;
				}
			}
			for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
				String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.activity")
						.toString();
				if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberActivity)) {
					getNFKEventLogAddeventEventiconImg().get(i).click();
					getNFKEventLogaddbgaddvaluetxtList().get(i).clear();
					getNFKEventLogaddbgaddvaluetxtList().get(i).clear();
					int randomNumberActivity1 = ThreadLocalRandom.current().nextInt(21, 200);
					getNFKEventLogaddbgaddvaluetxtList().get(i).sendKeys(randomNumberActivity1 + "");
					LFSUtilsAndroid.hideKeyboard();
					Reporter.logWithScreenShot("Activity window after editing value" + randomNumberActivity1,
							MessageTypes.Pass);
					ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity1);
					break;
				}
			}
			LFSUtilsAndroid.hideKeyboard();
			Point p = getNFKEventLogEditglucoseEditeventtitleTxt().getLocation();
			int count = 0;
			String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			while (!getNFKEventLogpageStaticText(randomNumberGlucose).isPresent()) {
				LFSUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60,
						100);
				LFSUtilsAndroid.waitforLoad();
				count++;
				if (count == 80)
					break;
			}

			for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {

				if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberGlucose)) {
					getNFKEventLogAddeventEventiconImg().get(i).click();
					for (int j = 0; j < getNFKEventLogaddbgaddvaluetxtList().size(); j++) {

						if (getNFKEventLogaddbgaddvaluetxtList().get(j).getText().equals(randomNumberGlucose)) {
							getNFKEventLogaddbgaddvaluetxtList().get(j).clear();
							getNFKEventLogaddbgaddvaluetxtList().get(j).clear();
							int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
							String randomNumberGlucose1 = LFSUtilsAndroid.mmolMGDL(randomNumberGlucose0);
							getNFKEventLogaddbgaddvaluetxtList().get(j).sendKeys(randomNumberGlucose1 + "");
							LFSUtilsAndroid.hideKeyboard();
							Reporter.logWithScreenShot(
									"Blood Glucose window after editing value" + randomNumberGlucose1,
									MessageTypes.Pass);
							getNFKEventLogAddeventEventiconImg().get(j).click();
							getNFKEventLogaddeventsavebtn().click();
							ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose1);
							break;
						}
					}

					break;
				}

			}

			Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		}
	}

	public void deleteGlucoseCarbActivity() {
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.carb").toString();
			if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberActivity)) {
				getNFKEventLogAddeventEventiconImg().get(i).click();

				for (int j = 0; j < getNFKEventLogEditeventDeleteBtn().size(); j++) {
					if (LFSUtilsAndroid.tryMethod(getNFKEventLogEditeventDeleteBtn().get(j))) {
						LFSUtilsAndroid.hideKeyboard();
						getNFKEventLogEditeventDeleteBtn().get(j).click();
						getNFKEventLogEditglucoseDeleteconfirmTxt().waitForPresent();
						getNFKEventLogEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}
		clickOnGlucoseEventClassicView();
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.activity").toString();
			if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberActivity)) {
				getNFKEventLogAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getNFKEventLogEditeventDeleteBtn().size(); j++) {
					if (LFSUtilsAndroid.tryMethod(getNFKEventLogEditeventDeleteBtn().get(j))) {
						getNFKEventLogEditeventDeleteBtn().get(j).click();
						getNFKEventLogEditglucoseDeleteconfirmTxt().waitForPresent();
						getNFKEventLogEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

		clickOnGlucoseEventClassicView();

		Point p = getNFKEventLogEditglucoseEditeventtitleTxt().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();

		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			for (int j = 0; j < getNFKEventLogEditeventDeleteBtn().size(); j++) {
				if (LFSUtilsAndroid.tryMethod(getNFKEventLogEditeventDeleteBtn().get(j))) {
					getNFKEventLogEditeventDeleteBtn().get(j).click();
					getNFKEventLogEditglucoseDeleteconfirmTxt().waitForPresent();
					getNFKEventLogEditglucoseDeletepopupDeleteBtn().click();
					LFSUtilsIOS.pause(7000);
					Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
					break;
				}
			}
			break;
		}
		LFSUtilsIOS.pause(7000);
		Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
	}

	public void addGlucoseAndInsulin() {
		userSelectFromLogEventList("GLUCOSE");
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
		String randomNumberGlucose = LFSUtilsAndroid.mmolMGDL(randomNumberGlucose0);
		ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
		enterManualBGvalue(randomNumberGlucose + "");
		Reporter.logWithScreenShot("Blood Glucose window after adding value" + randomNumberGlucose, MessageTypes.Pass);
		LFSUtilsAndroid.hideKeyboard();
		getNFKEventLogAddeventEventiconImg().get(0).click();
		LFSUtilsAndroid.hideKeyboard();
		getNFKEventLogAddeventAddBtn().click();
		userSelectFromLogEventList(ConfigurationManager.getBundle().getString("eventlog.section.insulin.title"));
		int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 200);
		ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin);
		getNFKEventLogaddinsulinselecttypebtn().click();
		getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("insulin.insulinType")).waitForPresent();
		getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("event.detail.insulinController.rapid"))
				.click();
		getNFKEventLogaddbgaddvaluetxtList().get(1).clear();
		getNFKEventLogaddbgaddvaluetxtList().get(1).click();
		getNFKEventLogaddbgaddvaluetxtList().get(1).sendKeys(randomNumberInsulin + "");
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Insulin window after adding value" + randomNumberInsulin, MessageTypes.Pass);

		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	// Method to edit insulin and glucose from classic view
	// Milan
	public void editGlucoseInsulin() {

		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			String randomNumberInsulin = ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
			String arr[] = getNFKEventLogaddbgaddvaluetxtList().get(i).getText().split("\\.");
			if (randomNumberInsulin.equals(arr[0])) {
				getNFKEventLogAddeventEventiconImg().get(i).click();
				getNFKEventLogaddbgaddvaluetxtList().get(i).clear();
				getNFKEventLogaddbgaddvaluetxtList().get(i).clear();
				int randomNumberInsulin1 = ThreadLocalRandom.current().nextInt(21, 200);
				getNFKEventLogaddbgaddvaluetxtList().get(i).sendKeys(randomNumberInsulin1 + "");
				LFSUtilsAndroid.hideKeyboard();
				Reporter.logWithScreenShot("Insulin window after editing value" + randomNumberInsulin1,
						MessageTypes.Pass);
				ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin1);
				break;
			}
		}

		Point p = getNFKEventLogEditglucoseEditeventtitleTxt().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!LFSUtilsAndroid.tryMethod(getNFKEventLogpageStaticText(randomNumberGlucose))) {
			LFSUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 100);
			LFSUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}

		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {

			if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberGlucose)) {
				getNFKEventLogAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getNFKEventLogaddbgaddvaluetxtList().size(); j++) {

					if (getNFKEventLogaddbgaddvaluetxtList().get(j).getText().equals(randomNumberGlucose)) {
						getNFKEventLogaddbgaddvaluetxtList().get(j).clear();
						getNFKEventLogaddbgaddvaluetxtList().get(j).clear();
						int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
						String randomNumberGlucose1 = LFSUtilsAndroid.mmolMGDL(randomNumberGlucose0);
						getNFKEventLogaddbgaddvaluetxtList().get(j).sendKeys(randomNumberGlucose1 + "");
						LFSUtilsAndroid.hideKeyboard();
						Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose1,
								MessageTypes.Pass);
						ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose1);
						break;
					}
				}

				break;
			}

		}
		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	public void deleteGlucoseInsulin() {
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			String randomNumberInsulin = ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
			String arr[] = getNFKEventLogaddbgaddvaluetxtList().get(i).getText().split("\\.");
			if (randomNumberInsulin.equals(arr[0])) {
				getNFKEventLogAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getNFKEventLogEditeventDeleteBtn().size(); j++) {
					if (LFSUtilsAndroid.tryMethod(getNFKEventLogEditeventDeleteBtn().get(j))) {
						Reporter.logWithScreenShot("Before clicking delete button", MessageTypes.Pass);
						getNFKEventLogEditeventDeleteBtn().get(j).click();
						Reporter.logWithScreenShot("after clicking delete button", MessageTypes.Pass);
						getNFKEventLogEditglucoseDeleteconfirmTxt().waitForPresent();
						getNFKEventLogEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

		clickOnGlucoseEventClassicView();

		Point p = getNFKEventLogEditglucoseEditeventtitleTxt().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!getNFKEventLogpageStaticText(randomNumberGlucose).isPresent()) {
			LFSUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 100);
			LFSUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}

		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {

			if (!LFSUtilsAndroid.tryMethod(getNFKEventLogpageStaticText(randomNumberGlucose))) {
				getNFKEventLogAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getNFKEventLogEditeventDeleteBtn().size(); j++) {
					if (LFSUtilsAndroid.tryMethod(getNFKEventLogEditeventDeleteBtn().get(j))) {
						Reporter.logWithScreenShot("Before clicking delete button", MessageTypes.Pass);
						getNFKEventLogEditeventDeleteBtn().get(j).click();
						getNFKEventLogEditglucoseDeleteconfirmTxt().waitForPresent();
						Reporter.logWithScreenShot("After clicking delete button", MessageTypes.Pass);
						getNFKEventLogEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

	}

	// Method to verify date 365 on cassic view screen
	// Milan
	public void verify365DayClassicView() {

		getNFKEventLogClassicViewBtn().waitForPresent();
		if (getNFKEventLogClassicViewBtn().getAttribute("selected").equalsIgnoreCase("false")) {
			getNFKEventLogClassicViewBtn().click();
			LFSUtilsAndroid.waitforLoad();
		}
		String dateformat1 = new String();
		String currentMonth = LFSUtilsAndroid.getCurrentMonth().substring(0, 3);
		int currentMonthNumeric = Integer.parseInt(LFSUtilsAndroid.monthIntValue(currentMonth));
		int date = Integer.parseInt(LFSUtilsAndroid.getCurrentDate());
		if (ConfigurationManager.getBundle().getString("countryname").equalsIgnoreCase("United Kingdom and Ireland")) {
			System.out.println(
					ConfigurationManager.getBundle().getString("countryname") + "#################################");
			if (currentMonthNumeric <= 9)
				dateformat1 = date + "/" + "0" + currentMonthNumeric;
			else
				dateformat1 = date + "/" + currentMonthNumeric;
		} else
			dateformat1 = currentMonthNumeric + "/" + date;
		getNFKEventLogpageStaticText(dateformat1).waitForPresent();
		int currentMonthNoDay = Integer.parseInt(LFSUtilsAndroid.monthNoOFDay(currentMonth).replaceAll("[^0-9]", ""));
		int date2 = 0;
		int nextMonthNumeric = currentMonthNumeric + 1;

		String dateformat2 = "";
		if (date == currentMonthNoDay) {
			date2 = 1;
			if (ConfigurationManager.getBundle().getString("countryname")
					.equalsIgnoreCase("United Kingdom and Ireland")) {
				System.out.println(ConfigurationManager.getBundle().getString("countryname")
						+ "#################################");
				if (currentMonthNumeric <= 9)
					dateformat2 = date2 + "/" + "0" + currentMonthNumeric;
				else
					dateformat2 = date2 + "/" + currentMonthNumeric;
			} else
				dateformat2 = currentMonthNumeric + "/" + date2;
		} else {
			date2 = date + 1;
			if (ConfigurationManager.getBundle().getString("countryname")
					.equalsIgnoreCase("United Kingdom and Ireland")) {
				System.out.println(ConfigurationManager.getBundle().getString("countryname")
						+ "#################################");
				if (currentMonthNumeric <= 9)
					dateformat2 = date2 + "/" + "0" + currentMonthNumeric;
				else
					dateformat2 = date2 + "/" + currentMonthNumeric;
			} else
				dateformat2 = currentMonthNumeric + "/" + date2;
		}

		Point p = getNFKEventLogpageStaticText(dateformat1).getLocation();
		int count = 0;
		while (!getNFKEventLogpageStaticText(dateformat2).isPresent()) {

			LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
			LFSUtilsAndroid.waitforLoad();
			count++;

		}
		WebDriverTestCase.verifyTrue(getNFKEventLogpageStaticText(dateformat2).isPresent(),
				" Date 365 day before not present", "Date 365 day before present");

	}

	public void verifyAllowedBGRange(Object eventDetail) {

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		getNFKEventLogaddeventlbl().waitForPresent();
		getNFKEventLogaddbgaddvaluetxt().click();

		LFSUtilsAndroid.waitforLoad();
		String option = eventBean.getUnit().toUpperCase();
		// String option = eventBean.getUnit();

		switch (option) {
		case "MG/DL":

			int lowvalue = Integer.parseInt(eventBean.getLowestGlucosValue()) - 1;
			enterManualBGvalue("" + lowvalue);
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Blood glucose range error for low value", MessageTypes.Pass);
			// getNFKEventLogaddeventtimeselectokbtn().click();
			// LFSUtilsAndroid.waitforLoad();
			int highvalue = Integer.parseInt(eventBean.getHighstGlucosValue()) + 1;
			getNFKEventLogaddbgaddvaluetxt().clear();
			enterManualBGvalue("" + highvalue);
			Reporter.logWithScreenShot("Blood glucose range error for High value", MessageTypes.Pass);
			// getNFKEventLogaddeventtimeselectokbtn().click();
			// LFSUtilsAndroid.waitforLoad();
			break;
		case "MMOL/L":

			double lowvalue1 = (Float.parseFloat(eventBean.getLowestGlucosValue())) - 0.1;
			enterManualBGvalue("" + lowvalue1);
			getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("addNote.valueRange"))
					.verifyPresent("Blood glucose range error for low value");
			Reporter.logWithScreenShot("Blood glucose range error for low value", MessageTypes.Pass);
			double highvalue1 = (Float.parseFloat(eventBean.getHighstGlucosValue())) + 0.2;
			enterManualBGvalue("" + highvalue1);
			getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("addNote.valueRange"))
					.verifyPresent("Blood glucose range error for high value");
			Reporter.logWithScreenShot("Blood glucose range error for High value", MessageTypes.Pass);
			break;
		}
		getNFKEventLogaddbgaddvaluetxt().clear();
		enterManualBGvalue("HI");
		WebDriverTestCase.verifyTrue(
				getNFKEventLogaddbgaddvaluetxt().getText()
						.contains(ConfigurationManager.getBundle().getString("appCommon.hi")),
				" HI is not entered after", "HI is entered after");
		getNFKEventLogaddbgaddvaluetxt().clear();
		enterManualBGvalue("LO");
		WebDriverTestCase.verifyTrue(
				getNFKEventLogaddbgaddvaluetxt().getText()
						.contains(ConfigurationManager.getBundle().getString("appCommon.lo")),
				" LO is not entered after", "LO is entered after");
	}

	// 21March
	// Gaurav Bhamare

	public void clickAndVerifyInfoScreeneventlog() {
		getNFKEventLogDayviewInfoBtn().waitForPresent();
		getNFKEventLogDayviewInfoBtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Graph Legend screen", MessageTypes.Pass);

	}

	public void verifyNoInsulinSectionWeekView() {
		if (getNFKEventLogWeekviewInsulinTab().isPresent())
			Reporter.logWithScreenShot("Insulin tab is not present", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Insulin tab is not present", MessageTypes.Pass);

	}

	public void addRandomGlucose() {
		if (getNFKEventLogunitofmeasurementlbl().getText().equalsIgnoreCase("mmol/l")) {
			userSelectFromLogEventList("GLUCOSE");
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(1, 33);
			String randomNumberGlucose = LFSUtilsAndroid.mmolMGDL(randomNumberGlucose0);
			ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
			enterManualBGvalue(randomNumberGlucose);
			Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose,
					MessageTypes.Pass);
			getNFKEventLogAddeventEventiconImg().get(0).click();

			getNFKEventLogaddeventsavebtn().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		} else {
			userSelectFromLogEventList("GLUCOSE");
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
			String randomNumberGlucose = LFSUtilsAndroid.mmolMGDL(randomNumberGlucose0);
			ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
			enterManualBGvalue(randomNumberGlucose);
			Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose,
					MessageTypes.Pass);
			getNFKEventLogAddeventEventiconImg().get(0).click();

			getNFKEventLogaddeventsavebtn().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		}
	}

public void verifyRandomGlucose() {
			
		//getNFKhomepagehomeEventlogtab().waitForPresent();	
	getNFKhomepageEventLogtab().click();
		
		String randomNumberBG = ConfigurationManager.getBundle()
				.getProperty("classic.glucose").toString();

		if(getNFKEventLogaddbgaddvaluetxt().getText().equals(randomNumberBG)) {
		WebDriverTestCase
		.verifyTrue(
				getNFKEventLogaddbgaddvaluetxt().getText().equals(randomNumberBG),
				" Incorrect value is displayed ", "Correct value is displayed, Entered value is " +randomNumberBG);
		}
	}
	
	
	
	
	
	public void editRandomGlucose() {
		Point p = getNFKEventLogEditglucoseEditeventtitleTxt().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!getNFKEventLogpageStaticText(randomNumberGlucose).isPresent()) {
			LFSUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 100);
			LFSUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}

		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {

			if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberGlucose)) {

				for (int j = 0; j < getNFKEventLogaddbgaddvaluetxtList().size(); j++) {

					if (getNFKEventLogaddbgaddvaluetxtList().get(j).getText().equals(randomNumberGlucose)) {
						getNFKEventLogaddbgaddvaluetxtList().get(j).clear();
						getNFKEventLogaddbgaddvaluetxtList().get(j).clear();
						int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
						String randomNumberGlucose1 = LFSUtilsAndroid.mmolMGDL(randomNumberGlucose0);
						getNFKEventLogaddbgaddvaluetxtList().get(j).sendKeys(randomNumberGlucose1);
						LFSUtilsAndroid.hideKeyboard();
						Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose1,
								MessageTypes.Pass);
						getNFKEventLogAddeventEventiconImg().get(j).click();
						ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose1);
						break;
					}
				}

				break;
			}

		}
		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void deleteRandomGlucose() {
		Point p = getNFKEventLogEditglucoseEditeventtitleTxt().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!getNFKEventLogpageStaticText(randomNumberGlucose).isPresent()) {
			LFSUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 100);
			LFSUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}

		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			Reporter.log("size" + getNFKEventLogaddbgaddvaluetxtList().size());
			System.out.println("size========================" + getNFKEventLogaddbgaddvaluetxtList().size());
			if (LFSUtilsAndroid.tryMethod(getNFKEventLogpageStaticText(randomNumberGlucose))) {
				LFSUtilsAndroid.waitforLoad();
				for (int j = 0; j < getNFKEventLogEditeventDeleteBtn().size(); j++) {
					if (LFSUtilsAndroid.tryMethod(getNFKEventLogEditeventDeleteBtn().get(j))) {
						Reporter.logWithScreenShot("Before clicking delete button", MessageTypes.Pass);
						getNFKEventLogEditeventDeleteBtn().get(j).click();
						getNFKEventLogEditglucoseDeleteconfirmTxt().waitForPresent();
						Reporter.logWithScreenShot("After clicking delete button", MessageTypes.Pass);
						getNFKEventLogEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

	}

	public void clickOnTodayWeekView() {
		getNFKEventLogWeekviewTodayboxImg().waitForPresent();
		getNFKEventLogWeekviewTodayboxImg().click();
		LFSUtilsIOS.pause(3000);
		Reporter.logWithScreenShot("Today event Screen", MessageTypes.Pass);

	}

	public void clickWeekViewBtn() {
		getNFKEventLogWeekViewBtn().waitForPresent();
		getNFKEventLogWeekViewBtn().click();
		LFSUtilsIOS.pause(3000);
		Reporter.logWithScreenShot("Week view", MessageTypes.Pass);

	}

	public void addRandomCarb() {
		userSelectFromLogEventList("CARBS");
		int randomNumberCarb = ThreadLocalRandom.current().nextInt(1, 100);
		ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb);
		getNFKEventLogaddbgaddvaluetxt().sendKeys(randomNumberCarb + "");
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Carb window after entering value" + randomNumberCarb, MessageTypes.Pass);
		getNFKEventLogaddbgaddvaluetxt().click();

		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void editRandomCarb() {

		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			String randomNumberCarb = ConfigurationManager.getBundle().getProperty("classic.carb").toString();
			if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberCarb)) {
				
				getNFKEventLogAddeventUnitLblList().get(i).click();
				getNFKEventLogaddbgaddvaluetxt().clear();

				int randomNumberCarb1 = ThreadLocalRandom.current().nextInt(21, 200);
				getNFKEventLogaddbgaddvaluetxt().sendKeys(randomNumberCarb1 + "");
				LFSUtilsAndroid.hideKeyboard();
				Reporter.logWithScreenShot("Carb window after editing value" + randomNumberCarb1, MessageTypes.Pass);
				ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb1);
				getNFKEventLogAddeventUnitLbl().click();
				break;
			}
		}

//		getNFKEventLogaddeventsavebtn().click();
//		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	public void deleteRandomCarb() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 7);
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.carb").toString();
			if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberActivity)) {
				for (int j = 0; j < getNFKEventLogEditeventDeleteBtn().size(); j++) {
					if (LFSUtilsAndroid.tryMethod(getNFKEventLogEditeventDeleteBtn().get(j))) {
						getNFKEventLogEditeventDeleteBtn().get(j).click();
						getNFKEventLogEditglucoseDeleteconfirmTxt().waitForPresent();
						getNFKEventLogEditglucoseDeletepopupDeleteBtn().click();
						LFSUtilsIOS.pause(2000);
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

	}

	public void addRandomInsulin() {
		userSelectFromLogEventList("INSULIN");
		int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 200);
		ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin);
		getNFKEventLogaddinsulinselecttypebtn().click();
		getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("insulin.insulinType")).waitForPresent();
		getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("event.detail.insulinController.rapid"))
				.click();
		Reporter.logWithScreenShot("Selected Insulin type", MessageTypes.Pass);
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().click();
		getNFKEventLogaddbgaddvaluetxt().sendKeys(randomNumberInsulin + "");
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Insulin window after adding value is " + randomNumberInsulin, MessageTypes.Pass);

		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void editRandomInsulin() {
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			String randomNumberInsulin = ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
			String arr[] = getNFKEventLogaddbgaddvaluetxtList().get(i).getText().split("\\.");
			if (randomNumberInsulin.equals(arr[0])) {

				getNFKEventLogAddeventUnitLblList().get(i).click();
			
				getNFKEventLogaddbgaddvaluetxt().clear();

				//LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 10);
				int randomNumberInsulin1 = ThreadLocalRandom.current().nextInt(21, 200);
				getNFKEventLogaddbgaddvaluetxt().sendKeys(randomNumberInsulin1 + "");
				LFSUtilsAndroid.hideKeyboard();
				Reporter.logWithScreenShot("Insulin window after editing value" + randomNumberInsulin1,
						MessageTypes.Pass);
				ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin1);
				getNFKEventLogAddeventUnitLbl().click();
				break;
			}
		}
//		getNFKEventLogaddeventsavebtn().click();
//		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void deleteRandomInsulin() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 7);
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			String randomNumberInsulin = ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
			String arr[] = getNFKEventLogaddbgaddvaluetxtList().get(i).getText().split("\\.");
			if (randomNumberInsulin.equals(arr[0])) {
				for (int j = 0; j < getNFKEventLogEditeventDeleteBtn().size(); j++) {
					if (LFSUtilsAndroid.tryMethod(getNFKEventLogEditeventDeleteBtn().get(j))) {
						Reporter.logWithScreenShot("Before clicking delete button", MessageTypes.Pass);
						getNFKEventLogEditeventDeleteBtn().get(j).click();
						Reporter.logWithScreenShot("after clicking delete button", MessageTypes.Pass);
						getNFKEventLogEditglucoseDeleteconfirmTxt().waitForPresent();
						getNFKEventLogEditglucoseDeletepopupDeleteBtn().click();
						LFSUtilsIOS.pause(2000);
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

	}

	public void addRandomActivity() {
		userSelectFromLogEventList("ACTIVITY");
		int randomNumberActivity = ThreadLocalRandom.current().nextInt(10, 1000);
		ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity);
		getNFKEventLogaddbgaddvaluetxt().sendKeys(randomNumberActivity + "");
		LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Activity window after adding value is " + randomNumberActivity, MessageTypes.Pass);

		if (getNFKEventLogaddactivityintensitylbl().isPresent()) {
			getNFKEventLogaddactivityselectintensitybtn().click();
			getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("activity.type")).waitForPresent();
			getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("activity.intensity.moderate"))
					.click();
			Reporter.logWithScreenShot("Selected activity type is ", MessageTypes.Pass);
		}

		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void editRandomActivity() {
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.activity").toString();
			
			if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberActivity)) {
//				getNFKEventLogaddbgaddvaluetxtList().get(i).click();
//				LFSUtilsAndroid.pause(3000);
				getNFKEventLogAddeventUnitLblList().get(i).click();
				getNFKEventLogaddbgaddvaluetxt().clear();
				int randomNumberActivity1 = ThreadLocalRandom.current().nextInt(21, 200);
				getNFKEventLogaddbgaddvaluetxt().sendKeys(randomNumberActivity1 + "");
				LFSUtilsAndroid.hideKeyboard();
				Reporter.logWithScreenShot("Activity window after editing value" + randomNumberActivity1,
						MessageTypes.Pass);
				ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity1);
				getNFKEventLogAddeventUnitLbl().click();
				break;
			}
		}
//		getNFKEventLogaddeventsavebtn().click();
//		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void deleteRandomActivity() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 1);
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.activity").toString();
			if (getNFKEventLogaddbgaddvaluetxtList().get(i).getText().equals(randomNumberActivity)) {
				for (int j = 0; j < getNFKEventLogEditeventDeleteBtn().size(); j++) {
					if (LFSUtilsAndroid.tryMethod(getNFKEventLogEditeventDeleteBtn().get(j))) {
						getNFKEventLogEditeventDeleteBtn().get(j).click();
						getNFKEventLogEditglucoseDeleteconfirmTxt().waitForPresent();
						getNFKEventLogEditglucoseDeletepopupDeleteBtn().click();
						LFSUtilsIOS.pause(2000);
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

	}

	public void clickOnDayView() {
		getNFKEventLogDayViewBtn().waitForPresent();
		getNFKEventLogDayViewBtn().click();
	}

	public void clickArrow(String option) {
		option = option.toLowerCase();
		switch (option) {
		case "left":

			getNFKEventLogClassicViewLeftArrowBtn().click();
			Reporter.logWithScreenShot("After clicking left arrow", MessageTypes.Pass);
			break;
		case "right":
			getNFKEventLogClassicViewRightArrowBtn().click();
			Reporter.logWithScreenShot("After clicking right arrow", MessageTypes.Pass);
			break;
		}
	}

	public void lastDayScreen() {
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("view screen", MessageTypes.Pass);
	}

	public void setBGForBeforeAfterMeal() {
		userSelectFromLogEventList("GLUCOSE");
		String minGlucose = ConfigurationManager.getBundle().getString("glucoseRangeValue.Low");
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys(minGlucose);
		addGlucoseSelectBeforeAfter("before");
		Reporter.logWithScreenShot("Blood Glucose window after editing value" + minGlucose, MessageTypes.Pass);
		getNFKEventLogaddeventsavebtn().click();
		getNFKEventLogaddeventbtn().verifyPresent("Log Event button is present");
		getNFKEventLogaddeventbtn().click();
		userSelectFromLogEventList("GLUCOSE");
		String inrangeGlucose = ConfigurationManager.getBundle().getString("glucoseRangeValue.Inrange");
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys(inrangeGlucose);
		addGlucoseSelectBeforeAfter("after");
		Reporter.logWithScreenShot("Blood Glucose window after editing value" + inrangeGlucose, MessageTypes.Pass);

		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	public void addMultipleGlucose() {
		userSelectFromLogEventList("GLUCOSE");
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();

		enterManualBGvalue(ConfigurationManager.getBundle().getString("glucoseRangeValue.Low"));
		Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
		getNFKEventLogAddeventEventiconImg().get(0).click();
		getNFKEventLogaddeventsavebtn().click();
		getNFKEventLogaddeventbtn().verifyPresent("Log Event button is present");
		getNFKEventLogaddeventbtn().click();
		userSelectFromLogEventList("GLUCOSE");
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().click();
		String inrangeGlucose = ConfigurationManager.getBundle().getString("glucoseRangeValue.Inrange");
		getNFKEventLogaddbgaddvaluetxt().sendKeys(inrangeGlucose);
		Reporter.logWithScreenShot("Blood Glucose window after editing value 120", MessageTypes.Pass);
		LFSUtilsAndroid.hideKeyboard();
		getNFKEventLogaddeventsavebtn().click();
		getNFKEventLogaddeventbtn().verifyPresent("Log Event button is present");
		getNFKEventLogaddeventbtn().click();
		userSelectFromLogEventList("GLUCOSE");
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().click();
		String highrangeGlucose = ConfigurationManager.getBundle().getString("glucoseRangeValue.High");
		getNFKEventLogaddbgaddvaluetxt().sendKeys(highrangeGlucose);
		Reporter.logWithScreenShot("Blood Glucose window after editing value 190", MessageTypes.Pass);
		LFSUtilsAndroid.hideKeyboard();

		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	// Method to edit blood glucose for specific date
	public void setDateRandomBG(String range) {
		int dateRange = Integer.parseInt(range) + 2;
		int count = 0;
		HomePageAndroid home = new HomePageAndroid();

		for (int i = 0; i < home.getNFKHomepageLastreadingAddedreadingValueLbl().size(); i++) {
			String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			if (home.getNFKHomepageLastreadingAddedreadingValueLbl().get(i).getText().equals(randomNumberGlucose)) {
				getNFKEventLogAddeventEventiconImg().get(i).click();
				getNFKEventLogaddbgaddvaluetxt().clear();
				getNFKEventLogaddbgaddvaluetxt().clear();
				int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
				String randomNumberGlucose1 = LFSUtilsAndroid.mmolMGDL(randomNumberGlucose0);
				getNFKEventLogaddbgaddvaluetxt().sendKeys(randomNumberGlucose1);
				Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose1,
						MessageTypes.Pass);

				ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose1);
				getNFKEventLogaddbgtimebtn().click();
				getNFKEventLogEditglucoseDatepopupDateTxt().waitForPresent();

				setDateDatePopup(range);
				Reporter.logWithScreenShot("Selected day", MessageTypes.Pass);

				break;
			}

		}
		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public String getDateForRange(String date) {

		int todaydate = Integer.parseInt(LFSUtilsAndroid.getCurrentDate());
		String currMonth = LFSUtilsAndroid.getCurrentMonth().substring(0, 3);
		int currentMonth = Integer.parseInt(LFSUtilsAndroid.monthIntValue(currMonth));

		int previoueMonth = 0;
		if (currentMonth == 1)
			previoueMonth = 12;
		else
			previoueMonth = currentMonth - 1;

		String prevMonth = LFSUtilsAndroid.monthIntValue(previoueMonth + "");
		int lastdayPreviousMonth = Integer.parseInt(LFSUtilsAndroid.monthNoOFDay(prevMonth).replaceAll("[^0-9]", ""));

		date = date.toLowerCase();
		String date1 = "";
		switch (date) {
		case "14":
			// 14 day
			if (todaydate < 14) {
				int extraday = 14 - todaydate;
				int calstartDay = lastdayPreviousMonth - extraday;
				date1 = prevMonth + " " + calstartDay;
			} else {
				int calstartDay = todaydate - 14;
				date1 = currMonth + " " + calstartDay;
			}
			break;
		case "30":
			// 30 day

			if (todaydate < 30) {
				int extraday = 30 - todaydate;
				int calstartDay = lastdayPreviousMonth - extraday;
				date1 = prevMonth + " " + calstartDay;
			} else {
				int calstartDay = todaydate - 30;
				date1 = currMonth + " " + calstartDay;
			}
			break;
		case "90":
			// 90 day
			int previousMonth1 = 0;
			if (previoueMonth == 1)
				previousMonth1 = 12;
			else
				previousMonth1 = previoueMonth - 1;
			String prevMonth1 = LFSUtilsAndroid.monthIntValue(previousMonth1 + "");
			int lastdayMonth1 = Integer.parseInt(LFSUtilsAndroid.monthNoOFDay(prevMonth1));
			int totalDay = todaydate + lastdayPreviousMonth + lastdayMonth1;
			if (totalDay < 90) {
				int remainingDay = 90 - totalDay;
				int previousMonth2 = 0;
				if (previousMonth1 == 1)
					previousMonth2 = 12;
				else
					previousMonth2 = previousMonth1 - 1;

				String prevMonth2 = LFSUtilsAndroid.monthIntValue(previousMonth2 + "");
				int lastdayMonth2 = Integer.parseInt(LFSUtilsAndroid.monthNoOFDay(prevMonth2));

				int calstartDay = lastdayMonth2 - remainingDay;
				date1 = prevMonth2 + " " + calstartDay;

			} else {
				int calstartDay = totalDay - 90;
				date1 = prevMonth1 + " " + calstartDay;
			}
			break;
		}
		return date1;

	}

	public void enterInsulinvalue(String eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Insulin window before adding value", MessageTypes.Pass);
		getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		insulinValue = eventBean.getAmount();
		Reporter.logWithScreenShot("Insulin window after adding value", MessageTypes.Pass);
		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering Insulin detail");	
	}
	
	
	public void setDateDatePopup(String date) {
		System.out.println(getDateForRange(date));
		String[] date1 = getDateForRange(date).split(" ");
		int rangeMonthInt = Integer.parseInt(LFSUtilsAndroid.monthIntValue(date1[0]));
		String rangeDate = date1[1];
		String currMonth = LFSUtilsAndroid.getCurrentMonth().substring(0, 3);
		System.out.println("Cur month " + currMonth);
		int currMonthInt = Integer.parseInt(LFSUtilsAndroid.monthIntValue(currMonth));

		try {
			if (rangeMonthInt < currMonthInt) {
				int count = currMonthInt - rangeMonthInt;
				System.out.println(count);
				while (count != 0) {
					getNFKEventLogCelenderLeftarrowBtn().click();
					count--;

				}
			} else if (currMonthInt < rangeMonthInt) {
				int count = rangeMonthInt - currMonthInt;
				int decCount = 12 - rangeMonthInt;
				while (currMonthInt != 0) {
					getNFKEventLogCelenderLeftarrowBtn().click();
					currMonthInt--;
				}

				while (decCount != 0) {
					getNFKEventLogCelenderLeftarrowBtn().click();
					decCount--;
				}
			} else {
				System.out.println("continue next codes");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		// click on date
		getNFKEventLogpageStaticText(rangeDate).click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
	}

	public void addPreviousDateGlucose(Object eventDetail) {

		getNFKEventLogaddbgaddvaluetxt().waitForPresent();
		getNFKEventLogaddbgaddvaluetxt().clear();
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Blood Glucose window before adding value", MessageTypes.Pass);
		String randomNumberGlucose1 = LFSUtilsAndroid.mmolMGDL(200);
		enterManualBGvalue(randomNumberGlucose1);
		Reporter.logWithScreenShot("Blood Glucose window after adding value", MessageTypes.Pass);
		getNFKEventLogaddbgtimebtn().click();
		selectDate();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
	}

	public void addRandomBGTodayANdYesterday() {
		// To add yesterday's data
		Reporter.logWithScreenShot("Blood Glucose window before adding value", MessageTypes.Pass);
		String randomNumberGlucose1 = LFSUtilsAndroid.mmolMGDL(200);
		enterManualBGvalue(randomNumberGlucose1);
		Reporter.logWithScreenShot("Blood Glucose window after adding value", MessageTypes.Pass);
		getNFKEventLogaddbgtimebtn().click();
		selectDate();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventsavebtn().waitForPresent();
		getNFKEventLogaddeventsavebtn().click();
		clickOnAddEventButton();

		// To add today's data
		userSelectFromLogEventList("GLUCOSE");
		Reporter.logWithScreenShot("Blood Glucose window before adding value", MessageTypes.Pass);
		String randomNumberGlucose2 = LFSUtilsAndroid.mmolMGDL(190);
		enterManualBGvalue(randomNumberGlucose2);
		Reporter.logWithScreenShot("Blood Glucose window after adding value", MessageTypes.Pass);
		getNFKEventLogaddbgtimebtn().click();
		selectTodaysDate();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventsavebtn().waitForPresent();
		getNFKEventLogaddeventsavebtn().click();

	}

	public void verifyDefaultInsulinType() {
		WebDriverTestCase.verifyTrue(
				getNFKEventLogaddinsulinselecttypebtn().getAttribute("text")
						.contains(LFSUtilsAndroid.getPropString("event.detail.insulinController.rapid")),
				"Default insulin type not present", "Default insulin type present");

	}

	public void verifyLastInsulinAsDefault() {
		String insulinType = ConfigurationManager.getBundle().getString("last.added.insulin.type");
		WebDriverTestCase.verifyTrue(getNFKEventLogaddinsulinselecttypebtn().getAttribute("text").contains(insulinType),
				"Last added insulin type not present", "Last added insulin type present");
	}

	// Method to verify right forward arrow should not display when in current
	// day
	public void verifyRightArrowInvisible() {
		getNFKEventLogClassicViewRightArrowBtn().verifyNotVisible("Forward arrow on Today view");
	}

	// Method to click on day view event field
	public void clickOnDayViewEvent() {
		getNFKEventLogDayviewViewFld().waitForPresent();
		getNFKEventLogDayviewViewFld().click();
	}

	// Method to check date on add event date label
	public void verifyDefaultDateForYesterday() {
		String date = getNFKEventLogaddbgtimebtn().getAttribute("value");
		WebDriverTestCase.verifyTrue(!date.contains("Today"), "Default date is Today",
				"Default date is correct" + date);
	}

	// Method to verify add event title for when no event added
	public void verifyaAddEventTitle() {
		getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("log.add.event.title"))
				.verifyPresent("Add event title when no event present");

	}

	// Method to add yesterday carb details
	// Milan
	public void addCarbForYesterday(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Carbs window after entering value", MessageTypes.Pass);

		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Adding carb details");

		getNFKEventLogaddbgtimebtn().click();
		String month = LFSUtilsAndroid.getCurrentMonth();
		int date = Integer.parseInt(LFSUtilsAndroid.getCurrentDate());
		if (date == 1) {
			String dayCount = LFSUtilsAndroid.monthNoOFDay(month).substring(0, 3);
			date = Integer.parseInt(dayCount);
			getNFKEventLogCelenderLeftarrowBtn().click();
		} else {
			date = date - 1;
		}
		getNFKEventLogpageStaticText(date + "").click();
		getNFKEventLogaddeventtimeselectokbtn().click();

		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventsavebtn().click();

	}

	// Method to verify HI LO button on key board
	public void HILOBtnKeyBoard() {
		// getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
//		getNFKEventLogEditglucoseHiBtn().verifyPresent("Hi key on keyboard");
//		getNFKEventLogEditglucoseLoBtn().verifyPresent("LO key on keyboard");
//		LFSUtilsAndroid.hideKeyboard();
//		Reporter.logWithScreenShot("Minimizing key board", MessageTypes.Pass);
//		getNFKEventLogaddbgaddvaluetxt().click();
		getNFKEventLogEditglucoseHiBtn().verifyPresent("Hi key on keyboard");
		getNFKEventLogEditglucoseLoBtn().verifyPresent("LO key on keyboard");

	}

	// Method to swipe on day and week view
	public void swipeHorizenDay() {

		Point p1 = getNFKEventLogDayviewInfoBtn().getLocation();
		Point p2 = getNFKEventLogaddeventbtn().getLocation();
		LFSUtilsAndroid.swipeWithCoordinates(p1.getX(), p1.getY() + 200, p2.getX(), p1.getY() + 200, 10);

		WebDriverTestCase.verifyTrue(
				getNFKEventLogClassicViewDateHeaderLbl().getText()
						.contains(LFSUtilsAndroid.getPropString("appCommon.yesterday")),
				"Yesterday not displaying after swipe", "Yesterday displaying after swipe");
	}

	public void swipeHorizenWeek() {

		Point p1 = getNFKEventLogDayviewInfoBtn().getLocation();
		Point p2 = getNFKEventLogaddeventbtn().getLocation();
		String dateRange = getNFKEventLogClassicViewDateHeaderLbl().getText();
		LFSUtilsAndroid.swipeWithCoordinates(p1.getX(), p1.getY() + 200, p2.getX(), p1.getY() + 200, 10);

		WebDriverTestCase.verifyTrue(!getNFKEventLogClassicViewDateHeaderLbl().getText().contains(dateRange),
				"Swipe not working on weekview", "Able to swipe");
	}

	// method to click on classic view button on eventlog
	public void clickOnClassicView() {

		getNFKEventLogClassicViewBtn().waitForPresent();
		getNFKEventLogClassicViewBtn().click();
	}

	public void addManualGlucoseEventDetailScreen(Object eventDetail) {
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);

		getNFKEventLogaddbgaddvaluetxtList().get(1).sendKeys(eventBean.getAmount());
		ConfigurationManager.getBundle().setProperty("classic.glucose", eventBean.getAmount());
		Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);

		getNFKEventLogaddeventsavebtn().waitForPresent();
		Reporter.logWithScreenShot("BG Form before clicking save", MessageTypes.Pass);
		getNFKEventLogaddeventsavebtn().click();
	}

	public void selectOvernightLastElement() throws InterruptedException {
		LFSUtilsAndroid.waitforLoad();
		getNFKEventLogOvernight365lastElement().waitForPresent(10000);
		getNFKEventLogOvernight365lastElement().click();
		LFSUtilsAndroid.waitforLoad();
	}

	public void userEntersBGValue() {

		String bgValue = "120";
		getNFKEventLogaddeventaddbgvaluebtn().waitForPresent();
		getNFKEventLogaddeventaddbgvaluebtn().click();
		getNFKEventLogaddbgaddvaluetxt().waitForPresent();
		getNFKEventLogaddbgaddvaluetxt().sendKeys(bgValue);
		ConfigurationManager.getBundle().setProperty("overnight.bg.value", bgValue);
		getNFKEventLogaddeventsavebtn().waitForPresent();
		getNFKEventLogaddeventsavebtn().click();

	}

	public void verifyBGforlastRecordofOverNight() {
		getNFKEventLogOvernight365lastElement().waitForPresent();
		String lastValue = getNFKEventLogOvernight365LastElementValue().getText();
		Reporter.log("last value ::" + lastValue);

		String bgValue = (String) ConfigurationManager.getBundle().getProperty("overnight.bg.value");
		Reporter.log("bgvalue :" + bgValue);

		if (lastValue.equals(bgValue)) {

			Reporter.logWithScreenShot("value is displayed for the last record");

		} else {
			Reporter.logWithScreenShot("value is Not displayed for the last record");
		}
	}

	public QAFWebElement getNFKEventLogOvernight365LastElementValue() {
		return NFKEventLogOvernight365LastElementValue;
	}

	public void addFutureMinuteTime(String minuteTime) {
		MoreMenuPageAndroid moreMenu = new MoreMenuPageAndroid();

		if (getNFKEventLogaddeventtimeselectminutetxt().isPresent()) {
			getNFKEventLogaddeventtimeselectminutetxt().click();
			LFSUtilsAndroid.waitforLoad();

			Reporter.logWithScreenShot("Minute text selected for modification", MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Select minute text not present", MessageTypes.Fail);
		}

		Integer earlierMinuteValue = Integer.valueOf(getNFKEventLogaddeventtimeselectminutetxt().getText());
		Integer increaseMinuteValue = earlierMinuteValue + Integer.parseInt(minuteTime);
		Integer modifiedMinuteValue = new ConsoleUtils().getMinuteValue(increaseMinuteValue);

		if (modifiedMinuteValue == 00) {
			System.out.println("Modified minute value is 00");
			if (getNFKEventLogaddeventtimeselecthourtxt().isDisplayed()) {
				getNFKEventLogaddeventtimeselecthourtxt().click();
				Integer hourTxt = Integer.valueOf(getNFKEventLogaddeventtimeselecthourtxt().getText());
				getNFKEventLogpageTimeStaticText((++hourTxt).toString()).click();
				LFSUtilsAndroid.waitforLoad();

				getNFKEventLogaddeventtimeselectminutetxt().click();
			}
		} else if (modifiedMinuteValue > 60) {
			modifiedMinuteValue = modifiedMinuteValue - 60;
			if (getNFKEventLogaddeventtimeselecthourtxt().isDisplayed()) {
				getNFKEventLogaddeventtimeselecthourtxt().click();
				Integer hourTxt = Integer.valueOf(getNFKEventLogaddeventtimeselecthourtxt().getText());
				getNFKEventLogpageTimeStaticText((++hourTxt).toString()).click();
				LFSUtilsAndroid.waitforLoad();

				getNFKEventLogaddeventtimeselectminutetxt().click();
			}
		}

		getNFKEventLogpageTimeStaticText(modifiedMinuteValue.toString()).click();
		clickOK();
		moreMenu.getNFKMoreMenuReminderspageSaveRemindersBtn().click();
		int diffValue = modifiedMinuteValue - earlierMinuteValue;

		if (diffValue > 3) {

			Reporter.logWithScreenShot("Wait time for reminder is greater than 3");

			if (moreMenu.getNFKMoreMenuReminderspageCreatedReminderBtn().isDisplayed()) {
				String reminderName = moreMenu.getNFKMoreMenuReminderspageCreatedReminderBtn().getText();

				Reporter.logWithScreenShot("Created reminder displayed on Reminders Page", MessageTypes.Pass);

				moreMenu.getNFKMoreMenuReminderspageCreatedReminderBtn().click();
				LFSUtilsAndroid.waitforLoad();

				if (moreMenu.getNFKMoreMenuReminderspageReminderTitleTxt().getText().equalsIgnoreCase(reminderName)) {
					LFSUtilsAndroid.waitforLoad();
					Reporter.logWithScreenShot("Reminder page Title present", MessageTypes.Pass);
				} else {
					Reporter.logWithScreenShot("Reminder page title not present", MessageTypes.Fail);
				}

				if (moreMenu.getNFKMoreMenuReminderspageReminderDeleteBtn().isDisplayed()) {
					Reporter.logWithScreenShot("Delete button present on created reminder page", MessageTypes.Pass);
					LFSUtilsAndroid.waitforLoad();
				} else {
					Reporter.logWithScreenShot("Delete button present on created reminder page", MessageTypes.Pass);
				}

				try {
					Thread.sleep(80000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				LFSUtilsAndroid.clickBackButton();

				LFSUtilsAndroid.waitforLoad();
				Reporter.logWithScreenShot("User navigated back to reminder page", MessageTypes.Pass);

				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} else {
				Reporter.logWithScreenShot("Created reminder not displayed on Reminders Page", MessageTypes.Fail);
			}

		} else {
			Reporter.logWithScreenShot("Wait time for reminder is less than 2", MessageTypes.Pass);
			LFSUtilsAndroid.waitforLoad();
		}

	}

	public void addReminderDetails(String date, String flag) {
		MoreMenuPageAndroid moreMenu = new MoreMenuPageAndroid();

		int dateAdd = Integer.parseInt(date);
		LocalDate todaysDate = LocalDate.now();
		todaysDate = todaysDate.plusDays(dateAdd);

		String dayOfWeek = todaysDate.getDayOfWeek().toString();
		dayOfWeek = dayOfWeek.substring(0, 1) + dayOfWeek.substring(1, dayOfWeek.length()).toLowerCase();

		String currentmonthValue = todaysDate.getMonth().toString();
		currentmonthValue = currentmonthValue.substring(0, 1)
				+ currentmonthValue.substring(1, currentmonthValue.length()).toLowerCase();

		int calDate = todaysDate.getDayOfMonth();
		String dateModified = Integer.toString(calDate);

		if (calDate <= 9) {
			dateModified = String.format("%02d", calDate);
		}

		String todayDate = dateModified + " " + currentmonthValue + " " + todaysDate.getYear();

		getNFKEventLogpageTimeStaticText(todayDate).click();
		LFSUtilsAndroid.waitforLoad();

		clickOK();
		LFSUtilsAndroid.waitforLoad();

		getNFKEventLogaddeventtimeselecthourtxt().click();
		String hourValue = getNFKEventLogaddeventtimeselecthourtxt().getText();
		int hrValue = Integer.parseInt(hourValue);

		getNFKEventLogaddeventtimeselectminutetxt().click();
		String minuteValue = getNFKEventLogaddeventtimeselectminutetxt().getText();
		int minValue = Integer.parseInt(minuteValue);

		getNFKEventLogaddeventtimeselecthourtxt().click();
		LFSUtilsAndroid.waitforLoad();

		minValue = minValue + 3;

		if (minValue > 60) {
			minValue = minValue - 60;
		}

		minValue = new ConsoleUtils().getMinuteValue(minValue);

		if (minValue == 0) {
			++hrValue;
		}

		if (hrValue >= 13) {
			hrValue = hrValue % 12;
		}

		hourValue = Integer.toString(hrValue);
		minuteValue = Integer.toString(minValue);

		getNFKEventLogpageTimeStaticText(hourValue).click();
		getNFKEventLogaddeventtimeselectminutetxt().click();
		LFSUtilsAndroid.waitforLoad();
		getNFKEventLogpageTimeStaticText(minuteValue).click();
		LFSUtilsAndroid.waitforLoad();
		clickOK();

		if (flag.equalsIgnoreCase("Daily")) {
			moreMenu.getNFKMoreMenuReminderspageSelectRepeatOptionBtn().click();
			moreMenu.setRepeatPicker();
			moreMenu.ClickSaveBtn();

			LFSUtilsAndroid.waitforLoad();
		} else if (flag.equalsIgnoreCase("Weekly")) {
			moreMenu.getNFKMoreMenuReminderspageSelectRepeatOptionBtn().click();
			moreMenu.setWeeklyRepeatPicker();
			moreMenu.ClickSaveBtn();

			LFSUtilsAndroid.waitforLoad();
		} else if (flag.equalsIgnoreCase("Monthly")) {
			moreMenu.getNFKMoreMenuReminderspageSelectRepeatOptionBtn().click();
			moreMenu.setMonthlyRepeatPicker();
			moreMenu.ClickSaveBtn();

			LFSUtilsAndroid.waitforLoad();
		} else if (flag.equalsIgnoreCase("Annually")) {
			moreMenu.getNFKMoreMenuReminderspageSelectRepeatOptionBtn().click();
			moreMenu.setYearlyRepeatPicker();
			moreMenu.ClickSaveBtn();

			LFSUtilsAndroid.waitforLoad();
		}
	}

	public void editMealTag(String mealTag) {
		addGlucoseSelectBeforeAfter(mealTag);
		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	// Method to verify available value in pattern explorer
	public void verifyPatterenDetailsExplorer() {
		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
			WebDriverTestCase.verifyTrue(
					getNFKEventLogaddbgaddvaluetxtList().get(i).getText()
							.contains(LFSUtilsAndroid.getPropString("readingsHigh.bg" + (i + 1) + "")),
					"Incorrect value for " + (i + 1) + "bg value", "Correct value for " + (i + 1) + "bg value");
			WebDriverTestCase.verifyTrue(
					getNFKEventLogunitofmeasurementlblList().get(i).getText()
							.contains(LFSUtilsAndroid.getPropString("measureunit")),
					"Incorrect unit for " + (i + 1) + "bg value", "Correct unit for " + (i + 1) + "bg value");
		}
	}

	@FindBy(locator = "NFK.eventlog.classic.timecell.btn")
	private QAFWebElement NFKeventlogClassicTimecellBtn;

	public QAFWebElement getNFKeventlogClassicTimecellBtn() {
		return NFKeventlogClassicTimecellBtn;
	}

	public void clickCell() {
		// getNFKeventlogClassicTimecellBtn().click();
		LFSUtilsIOS.pause(2000);
		getNFKEventLogaddeventbtn().click();

	}

	@FindBy(locator = "NFK.eventlog.Bg.insulinCalculator.lnk")
	private QAFWebElement NFKeventlogBgInsulincalculatorLnk;

	@FindBy(locator = "NFK.eventlog.insulinCalculator.lbl")
	private QAFWebElement NFKeventlogInsulincalculatorLbl;

	@FindBy(locator = "NFK.eventlog.addevent.addIsulincalculatorvalue.btn")
	private QAFWebElement NFKeventlogAddeventAddisulincalculatorvalueBtn;

	@FindBy(locator = "NFK.eventlog.addevent.invalidBgErrormsg.txt")
	private QAFWebElement NFKeventlogAddeventInvalidbgerrormsgTxt;

	public void verifyInsulinCalculator(String option) {
		option = option.toUpperCase();
		switch (option) {
		case "ENABLED":
			if (getNFKeventlogBgInsulincalculatorLnk().isDisplayed()) {
				if (getNFKeventlogBgInsulincalculatorLnk().isEnabled()) {
					Reporter.logWithScreenShot("Insulin Calculator link is displayed and enabled", MessageTypes.Pass);
				}
			}
			break;
		case "DISABLED":
			if (getNFKeventlogBgInsulincalculatorLnk().isDisplayed()) {
				getNFKeventlogBgInsulincalculatorLnk()
						.verifyDisabled("Insulin Calculator link is displayed but Disabled");
			}
			break;
		}
	}

	static int bgValue = 0;

	public void addBgDetails() {
		if (getNFKEventLogunitofmeasurementlbl().getText().equalsIgnoreCase("mmol/l")) {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().click();
			getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(1, 33));
			bgValue = Integer.valueOf(getAMount);
			getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
			ConfigurationManager.getBundle().setProperty("classic.glucose", getAMount);
			Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
			getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering BG with MMOL value");
			getNFKEventLogaddbgtimebtn().click();
			getNFKEventLogaddeventtimeselectokbtn().click();
			getNFKEventLogaddeventtimeselectokbtn().click();
			getNFKEventLogaddeventsavebtn().waitForPresent();
			Reporter.logWithScreenShot("BG Form before clicking save", MessageTypes.Pass);
		} else {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().click();
			getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(590, 600));
			getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
			bgValue = Integer.valueOf(getAMount);
			ConfigurationManager.getBundle().setProperty("classic.glucose", getAMount);
			Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
			getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering BG with MG/DL value");
			getNFKEventLogaddbgtimebtn().click();
			getNFKEventLogaddeventtimeselectokbtn().click();
			getNFKEventLogaddeventtimeselectokbtn().click();
			getNFKEventLogaddeventsavebtn().waitForPresent();
			Reporter.logWithScreenShot("BG Form before clicking save", MessageTypes.Pass);
		}
	}

	public void addInsulinDetail() {
		String currentDate = "";
		int currentHours = 0;
		int currentMinutes = 0;
		String strAMPM = "";

		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Insulin window before adding value", MessageTypes.Pass);
		Reporter.log("Extact :: " + getNFKEventLogaddbgtimebtn().getText());
		String hours = getNFKEventLogaddbgtimebtn().getText().split(",", 2)[1].split(":", 2)[0].trim();
		Reporter.log("Time before adding Bg is" + hours, MessageTypes.Pass);
		String min = getNFKEventLogaddbgtimebtn().getText().split(",", 2)[1].split(":", 2)[1].split(" ", 2)[0].trim();
		Reporter.log("min before adding Bg is" + min, MessageTypes.Pass);
		String AM_PM = getNFKEventLogaddbgtimebtn().getText().split(",", 2)[1].split(":", 2)[1].split(" ", 2)[1].trim();
		Reporter.log("AM/PM before adding Bg is" + AM_PM, MessageTypes.Pass);
		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogEditglucoseTimepopupYearTxt().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getNFKEventLogEditglucoseTimepopupYearTxt().getText().contains(ConstantUtils.CURRENT_YEAR),
				"Improper current year", ConstantUtils.CURRENT_YEAR + " current year title is visible");
		if (AM_PM.contains("AM") && Integer.parseInt(hours) < 2) {
			currentDate = getNFKEventLogAddeventDateSelecteddateLbl().getText();
			String setDate = String.valueOf(Integer.parseInt(currentDate) - 1);
			getNFKEventLogpageStaticText(setDate).click();
		}
		getNFKEventLogaddeventtimeselectokbtn().click();
		int setTime;
		if ((Integer.parseInt(hours) - 2) <= 0)
			setTime = 12 + (Integer.parseInt(hours) - 2);
		else
			setTime = Integer.parseInt(hours) - 2;
		getNFKEventLogpageTimeStaticText(String.valueOf(setTime)).click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		Reporter.log("Completed Successful");
		getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(2, 10));
		getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
		Reporter.logWithScreenShot("Insulin window after adding value", MessageTypes.Pass);
		try {
			getNFKEventLogaddinsulinselecttypebtn().waitForPresent(2000);
			getNFKEventLogaddinsulinselecttypebtn().click();
			String insulinType = ConfigurationManager.getBundle().getString("event.detail.insulinController.long");
			ConfigurationManager.getBundle().setProperty("last.added.insulin.type", insulinType);
			getNFKEventLogpageStaticText(insulinType).click();
			Reporter.logWithScreenShot("Selected Insulin type is " + insulinType, MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("To select Insulin type is not present", MessageTypes.Fail);
		}
		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering Insulin detail");
		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	public void clickInsulinCalculator() {
		InsulinCalculatorPageAndroid insulinCal = new InsulinCalculatorPageAndroid();
		if (getNFKeventlogBgInsulincalculatorLnk().isPresent()) {
			Reporter.logWithScreenShot("Insulin Calculator link is displayed", MessageTypes.Pass);
			getNFKeventlogBgInsulincalculatorLnk().click();
		}
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		LFSUtilsAndroid.swipeWithScreenPercent(90, 50, 10, 50, 7);
		if (LFSUtilsAndroid.tryMethod(insulinCal.getNFKInsulincalculatorsettingStaticText(
				ConfigurationManager.getBundle().getString("appCommon.yes")))) {
			insulinCal.getNFKInsulincalculatorsettingStaticText(
					ConfigurationManager.getBundle().getString("appCommon.yes")).click();
		}
		if (LFSUtilsAndroid.tryMethod(insulinCal.getNFKInsulincalculatorsettingQuickusecrossBtn())) {
			insulinCal.getNFKInsulincalculatorsettingQuickusecrossBtn().verifyPresent("Cross button is present");
			insulinCal.getNFKInsulincalculatorsettingQuickusecrossBtn().click();
		}
	}

	public void verifySaveEventPopUp() {

	}

	public void verifyBgScreen() {
		if (getNFKEventLogEditglucoseEditeventtitleTxt().isPresent()) {
			Reporter.logWithScreenShot("Blood glucose screen is displayed", MessageTypes.Pass);
		}
	}

	public void verifyCarbScreen() {

	}

	static int currentBg = 0;

	public void addMultipleBg() {
		HomePageAndroid homePageAndroid = new HomePageAndroid();
		if (getNFKEventLogunitofmeasurementlbl().getText().equalsIgnoreCase("mmol/l")) {
			for (int i = 0; i <= 1; i++) {
				getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
				Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
				getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(1, 33));
				ConfigurationManager.getBundle().setProperty("classic.glucose", getAMount);
				getNFKEventLogaddbgaddvaluetxtList().get(i).click();
				getNFKEventLogaddbgaddvaluetxtList().get(i).sendKeys(getAMount);
				currentBg = Integer.valueOf(getAMount);
				Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
				getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering BG with MMOL value");
				getNFKEventLogaddbgtimebtn().click();
				getNFKEventLogaddeventtimeselectokbtn().click();
				getNFKEventLogaddeventtimeselectokbtn().click();
				LFSUtilsAndroid.hideKeyboard();
				getNFKEventLogAddeventAddBtn().waitForPresent();
				Reporter.logWithScreenShot("Add event button is present on add event screen", MessageTypes.Pass);
				getNFKEventLogAddeventAddBtn().click();
				selectBloodGlucose();
			}
		} else {
			for (int i = 0; i <= 1; i++) {
				getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
				Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
				getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(20, 600));
				ConfigurationManager.getBundle().setProperty("classic.glucose", getAMount);
				getNFKEventLogaddbgaddvaluetxtList().get(i).click();
				getNFKEventLogaddbgaddvaluetxtList().get(i).sendKeys(getAMount);
				currentBg = Integer.valueOf(getAMount);
				Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
				getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering BG with MG/DL value");
				LFSUtilsAndroid.hideKeyboard();
				if (i == 0) {
					getNFKEventLogAddeventAddBtn().waitForPresent();
					Reporter.logWithScreenShot("Add event button is present on add event screen", MessageTypes.Pass);
					getNFKEventLogAddeventAddBtn().click();
					selectBloodGlucose();
				} else {
					Reporter.logWithScreenShot("Add event button is present on add event screen", MessageTypes.Pass);
				}
			}
		}
	}

	public static String BgValue, BgValue1;

	// gunther
	public void enterMultipleBg(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {
			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		if (getNFKEventLogunitofmeasurementlbl().getText().equalsIgnoreCase("mmol/l")) {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxtList().get(0).click();
			getNFKEventLogaddbgaddvaluetxtList().get(0).sendKeys(eventBean.getAmountMmol());
			BgValue = eventBean.getAmountMmol().toString();
			Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
			getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering BG with MG/DL value");
			LFSUtilsAndroid.hideKeyboard();
			getNFKEventLogAddeventAddBtn().waitForPresent();
			Reporter.logWithScreenShot("Add event button is present on add event screen", MessageTypes.Pass);
			getNFKEventLogAddeventAddBtn().click();
			selectBloodGlucose();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxtList().get(1).click();
			getNFKEventLogaddbgaddvaluetxtList().get(1).sendKeys(eventBean.getAmountMmol1());
			BgValue1 = eventBean.getAmountMmol1().toString();
			Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
			getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering BG with MG/DL value");
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 10, 50, 70, 7);
		} else {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxtList().get(0).click();
			getNFKEventLogaddbgaddvaluetxtList().get(0).sendKeys(eventBean.getAmount());
			BgValue = eventBean.getAmount().toString();
			Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
			getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering BG with MG/DL value");
			LFSUtilsAndroid.hideKeyboard();
			getNFKEventLogAddeventAddBtn().waitForPresent();
			Reporter.logWithScreenShot("Add event button is present on add event screen", MessageTypes.Pass);
			getNFKEventLogAddeventAddBtn().click();
			selectBloodGlucose();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxtList().get(1).click();
			getNFKEventLogaddbgaddvaluetxtList().get(1).sendKeys(eventBean.getAmount1());
			BgValue1 = eventBean.getAmount1().toString();
			Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
			getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering BG with MG/DL value");
			LFSUtilsAndroid.hideKeyboard();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 10, 50, 70, 7);
		}
	}

	static int totalAmount = 0;

	public void addMultipleCarbs() {
		HomePageAndroid homePageAndroid = new HomePageAndroid();
		for (int i = 0; i <= 1; i++) {
			getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(20, 600));
			totalAmount = totalAmount + Integer.valueOf(getAMount);
			if (i == 0) {
				firstCarb = Integer.parseInt(getAMount);
			} else {
				secCarb = Integer.parseInt(getAMount);
			}
			ConfigurationManager.getBundle().setProperty("total.carbs", totalAmount);
			Reporter.log("total carb is " + totalAmount);
			getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
			ConfigurationManager.getBundle().setProperty("classic.glucose", getAMount);
			Reporter.logWithScreenShot("Carbs window after entering value", MessageTypes.Pass);
			getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Adding carb details");
			if (i == 1) {
				break;
			}
			getNFKEventLogaddbgtimebtn().click();
			getNFKEventLogaddeventtimeselectokbtn().click();
			getNFKEventLogaddeventtimeselectokbtn().click();
			getNFKEventLogaddeventsavebtn().click();
			homePageAndroid.getNFKHomepageAddeventTxt().waitForPresent();
			Reporter.logWithScreenShot("Add event button is present on homescreen", MessageTypes.Pass);
			homePageAndroid.getNFKHomepageAddeventTxt().click();
			selectCarbEvent();
		}
	}

	public QAFWebElement getNFKeventlogBgInsulincalculatorLnk() {
		return NFKeventlogBgInsulincalculatorLnk;
	}

	public QAFWebElement getNFKeventlogInsulincalculatorLbl() {
		return NFKeventlogInsulincalculatorLbl;
	}

	public QAFWebElement getNFKeventlogAddeventAddisulincalculatorvalueBtn() {
		return NFKeventlogAddeventAddisulincalculatorvalueBtn;
	}

	public void invalidBgEvent() {
		if (getNFKEventLogunitofmeasurementlbl().getText().equalsIgnoreCase("mmol/l")) {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().clear();
			getNFKEventLogaddbgaddvaluetxt().verifyPresent("BG Goal text displayed");
			getNFKEventLogaddbgaddvaluetxt().sendKeys("1");
			;
			if (getNFKeventlogAddeventInvalidbgerrormsgTxt().isPresent()) {
				Reporter.logWithScreenShot("Invalid BG goal error message is displayed", MessageTypes.Pass);
				if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok"))
						.isPresent()) {
					getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
					LFSUtilsAndroid.waitforLoad();
				}
			} else {
				Reporter.logWithScreenShot("Invalid BG goal error message is not displayed", MessageTypes.Fail);
			}
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().clear();
			getNFKEventLogaddbgaddvaluetxt().verifyPresent("BG Goal text displayed");
			getNFKEventLogaddbgaddvaluetxt().sendKeys("35");
			if (getNFKeventlogAddeventInvalidbgerrormsgTxt().isPresent()) {
				Reporter.logWithScreenShot("Invalid BG goal error message is displayed", MessageTypes.Pass);
				if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok"))
						.isPresent()) {
					getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
					LFSUtilsAndroid.waitforLoad();
				}
			} else {
				Reporter.logWithScreenShot("Invalid BG goal error message is not displayed", MessageTypes.Fail);
			}
		} else {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().clear();
			getNFKEventLogaddbgaddvaluetxt().verifyPresent("BG Goal text displayed");
			getNFKEventLogaddbgaddvaluetxt().sendKeys("19");
			if (getNFKeventlogAddeventInvalidbgerrormsgTxt().isPresent()) {
				Reporter.logWithScreenShot("Invalid BG goal error message is displayed", MessageTypes.Pass);
				if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok"))
						.isPresent()) {
					getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
					LFSUtilsAndroid.waitforLoad();
				}
			} else {
				Reporter.logWithScreenShot("Invalid BG goal error message is not displayed", MessageTypes.Fail);
			}
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().clear();
			getNFKEventLogaddbgaddvaluetxt().verifyPresent("BG Goal text displayed");
			getNFKEventLogaddbgaddvaluetxt().sendKeys("601");
			if (getNFKeventlogAddeventInvalidbgerrormsgTxt().isPresent()) {
				Reporter.logWithScreenShot("Invalid BG goal error message is displayed", MessageTypes.Pass);
				if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok"))
						.isPresent()) {
					getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
					LFSUtilsAndroid.waitforLoad();
				}
			} else {
				Reporter.logWithScreenShot("Invalid BG goal error message is not displayed", MessageTypes.Fail);
			}
		}
	}

	public QAFWebElement getNFKeventlogAddeventInvalidbgerrormsgTxt() {
		return NFKeventlogAddeventInvalidbgerrormsgTxt;
	}

	public void verifyEditBgOnIcScreen() {

	}

	public void verifyAddEventPage() {
		if (getNFKEventLogEditglucoseEditeventtitleTxt().isPresent()) {
			Reporter.logWithScreenShot("Add event screen is displayed", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Add event screen is not displayed", MessageTypes.Fail);
		}
	}

	public void clickAddEventSavebtn() {
		getNFKEventLogaddeventsavebtn().waitForPresent();
		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	public void verifyIcLinkOnEventScreen() {
		if (getNFKeventlogBgInsulincalculatorLnk().verifyNotPresent()) {
			Reporter.logWithScreenShot("Insulin Calculator link not Displayed", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Insulin Calculator link is Displayed and enabled", MessageTypes.Pass);
		}
	}

	static int before25min = 0;

	public void enterBgBefore25Min() {
		String Time = getNFKEventLogaddbgtimebtn().getText().substring(7, 8);
		Reporter.log("Time before adding Bg is" + Time, MessageTypes.Pass);
		String min = getNFKEventLogaddbgtimebtn().getText().substring(9, 11);
		Reporter.log("min before adding Bg is" + min, MessageTypes.Pass);
		before25min = 60 - Integer.parseInt(min);
		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogEditglucoseTimepopupYearTxt().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getNFKEventLogEditglucoseTimepopupYearTxt().getText().contains(ConstantUtils.CURRENT_YEAR),
				"Improper current year", ConstantUtils.CURRENT_YEAR + " current year title is visible");
		WebDriverTestCase.verifyTrue(
				getNFKEventLogEditglucoseDatepopupDateTxt().getText()
						.contains(LFSUtilsAndroid.getCurrentMonth().substring(0, 3)),
				"Improper current month", LFSUtilsAndroid.getCurrentMonth() + " Current month is visible");
		getNFKEventLogaddeventtimeselectcancelbtn().verifyPresent("Cancel button");
		getNFKEventLogaddeventtimeselectokbtn().verifyPresent("Ok button");
		getNFKEventLogaddeventtimeselectcancelbtn().click();
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForVisible();
		getNFKEventLogEditglucoseEditeventtitleTxt().verifyPresent("After clicking cancel button Event screen");
		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogEditglucoseTimepopupYearTxt().waitForPresent();
		int date = Integer.parseInt(LFSUtilsAndroid.getCurrentDate());
		for (int i = 0; i < getNFKEventLogEditglucoseDatepopupDatesvalueTxt().size(); i++) {
			if (LFSUtilsAndroid.tryDisplayMethod(getNFKEventLogEditglucoseDatepopupDatesvalueTxt().get(i))
					&& getNFKEventLogEditglucoseDatepopupDatesvalueTxt().get(i).getText().contains(date + "")) {

			}
		}

		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogpageTimeStaticText(Time).click();
		getNFKEventLogpageTimeStaticText(min).click();
		WebDriverTestCase.verifyTrue(getNFKEventLogpageTimeStaticText(min).isSelected(),
				min + "  as minute is not selected", min + "  as minute is selected");
		getNFKEventLogaddeventtimeselecthourtxt().click();
		Reporter.logWithScreenShot("Selected time", MessageTypes.Pass);
		WebDriverTestCase.verifyTrue(getNFKEventLogaddeventtimeselecthourtxt().getText().contains(Time),
				" Proper hour is not displayed on title", "Proper hour is displayed on title");
		WebDriverTestCase.verifyTrue(getNFKEventLogaddeventtimeselectminutetxt().getText().contains(min),
				" Proper minute is not displayed on title", "Proper minute is displayed on title");
		int minute = Integer.parseInt(min);
		if (minute < 30) {
			int timebf30min = 60 - (30 - minute);
			Reporter.log("Time before 30 min is" + timebf30min, MessageTypes.Pass);
			getNFKEventLogAddeventTimeinputBtn().click();
			getNFKEventLogAddeventTimeinputMinBtn().sendKeys(Integer.toString(timebf30min));
			getNFKEventLogaddeventtimeselectokbtn().click();
		} else if (minute > 30) {
			int timebf30min = minute - 30;
			Reporter.log("Time1 before 30 min is" + timebf30min, MessageTypes.Pass);
			getNFKEventLogAddeventTimeinputBtn().click();
			getNFKEventLogAddeventTimeinputMinBtn().sendKeys(Integer.toString(timebf30min));
			getNFKEventLogaddeventtimeselectokbtn().click();
		} else {
			Reporter.log("Time is not selected properly", MessageTypes.Fail);
		}
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForVisible();
		WebDriverTestCase.verifyTrue(
				getNFKEventLogaddbgtimebtn().getText().contains(Time)
						&& getNFKEventLogaddbgtimebtn().getText().contains(min),
				" Proper Time is not displayed on title", "Proper Time is displayed on event screen");

	}

	public void addLowRangeBg() {
		if (getNFKEventLogunitofmeasurementlbl().getText().equalsIgnoreCase("mmol/l")) {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().click();
			getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(2, 3));
			getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
			ConfigurationManager.getBundle().setProperty("classic.glucose", getAMount);
			Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
		} else {
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
			getNFKEventLogaddbgaddvaluetxt().click();
			getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(21, 60));
			getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
			ConfigurationManager.getBundle().setProperty("classic.glucose", getAMount);
			Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
			LFSUtilsAndroid.hideKeyboard();
		}
	}

	public void enterInvalidBloodGlucose() {
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
		getNFKEventLogaddbgaddvaluetxt().click();

		getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(601, 650));

		getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
		ConfigurationManager.getBundle().setProperty("classic.glucose", getAMount);
		Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
		if (getNFKeventlogAddeventInvalidbgerrormsgTxt().isPresent()) {
			Reporter.logWithScreenShot("Invalid BG goal error message is displayed", MessageTypes.Pass);
			if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent()) {
				getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
				LFSUtilsAndroid.waitforLoad();
			}
		}
	}

	public void verifyIcForInvalidBg() {
		if (getNFKeventlogBgInsulincalculatorLnk().isDisplayed()) {
			getNFKeventlogBgInsulincalculatorLnk().verifyDisabled("Insulin Calculator link is displayed but Disabled");
		} else {
			Reporter.logWithScreenShot("Insulin Calculator link is displayed but enabled", MessageTypes.Fail);
		}
		if (getNFKEventLogSaveBtn().verifyDisabled()) {
			Reporter.logWithScreenShot("save buton is displayed but Disabled ", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("save buton is displayed but enabled ", MessageTypes.Fail);
		}
	}

	static int CarbValue = 0;

	@FindBy(locator = "NFK.eventlog.addevent.date.selectedDate.lbl")
	private QAFWebElement NFKEventLogAddeventDateSelecteddateLbl;

	@FindBy(locator = "NFK.eventlog.addevent.addFood.searchBar.txt")
	private QAFWebElement NFKEventLogAddeventAddfoodSearchbarTxt;

	@FindBy(locator = "NFK.eventlog.addevent.addFood.searchBar.add.btn")
	private List<QAFWebElement> NFKEventLogAddeventAddfoodSearchbarAddBtn;

	@FindBy(locator = "NFK.eventlog.addFood.searchBar.foodlist.txt")
	private List<QAFWebElement> NFKEventLogAddfoodSearchbarFoodlistTxt;

	@FindBy(locator = "NFK.eventlog.addbg.addBgvalue.txt")
	private QAFWebElement NFKEventLogAddbgAddbgvalueTxt;

	@FindBy(locator = "NFK.eventlog.addbg.addCarbvalue.txt")
	private QAFWebElement NFKEventLogAddbgAddcarbvalueTxt;

	@FindBy(locator = "NFK.eventlog.addbg.addInsulinvalue.txt")
	private QAFWebElement NFKEventLogAddbgAddinsulinvalueTxt;

	@FindBy(locator = "NFK.eventlog.addbg.addActivityvalue.txt")
	private QAFWebElement NFKEventLogAddbgAddactivityvalueTxt;

	public void enterCarbsDetails() {
		getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(1, 33));
		CarbValue = Integer.valueOf(getAMount);
		getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
		Reporter.logWithScreenShot("Carbs window after entering value", MessageTypes.Pass);
		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Adding carb details");
		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventsavebtn().click();
	}

	public void selectPastTime() {
		String currentDate = "";
		int currentHours = 0;
		int currentMinutes = 0;
		String strAMPM = "";
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Insulin window before adding value", MessageTypes.Pass);
		Reporter.log("Extact :: " + getNFKEventLogaddbgtimebtn().getText());
		String hours = getNFKEventLogaddbgtimebtn().getText().split(",", 2)[1].split(":", 2)[0].trim();
		Reporter.log("Time before adding Bg is" + hours, MessageTypes.Pass);
		String min = getNFKEventLogaddbgtimebtn().getText().split(",", 2)[1].split(":", 2)[1].split(" ", 2)[0].trim();
		Reporter.log("min before adding Bg is" + min, MessageTypes.Pass);
		String AM_PM = getNFKEventLogaddbgtimebtn().getText().split(",", 2)[1].split(":", 2)[1].split(" ", 2)[1].trim();
		Reporter.log("AM/PM before adding Bg is" + AM_PM, MessageTypes.Pass);
		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogEditglucoseTimepopupYearTxt().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getNFKEventLogEditglucoseTimepopupYearTxt().getText().contains(ConstantUtils.CURRENT_YEAR),
				"Improper current year", ConstantUtils.CURRENT_YEAR + " current year title is visible");
		if (AM_PM.contains("AM") && Integer.parseInt(hours) < 2) {
			currentDate = getNFKEventLogAddeventDateSelecteddateLbl().getText();
			String setDate = String.valueOf(Integer.parseInt(currentDate) - 1);
			getNFKEventLogpageStaticText(setDate).click();
		}
		getNFKEventLogaddeventtimeselectokbtn().click();
		int setTime;
		if ((Integer.parseInt(hours) - 2) <= 0)
			setTime = 12 + (Integer.parseInt(hours) - 2);
		else
			setTime = Integer.parseInt(hours) - 2;
		getNFKEventLogpageTimeStaticText(String.valueOf(setTime)).click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		Reporter.log("COmpleted Successful");
		getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(2, 10));
		getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
		Reporter.logWithScreenShot("Insulin window after adding value", MessageTypes.Pass);
		try {
			getNFKEventLogaddinsulinselecttypebtn().waitForPresent(2000);
			getNFKEventLogaddinsulinselecttypebtn().click();
			String insulinType = ConfigurationManager.getBundle().getString("event.detail.insulinController.long");
			ConfigurationManager.getBundle().setProperty("last.added.insulin.type", insulinType);
			getNFKEventLogpageStaticText(insulinType).click();
			Reporter.logWithScreenShot("Selected Insulin type is " + insulinType, MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("To select Insulin type is not present", MessageTypes.Fail);
		}
		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering Insulin detail");
		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	public void verifyInsulinTime() {

	}

	public void verifySearchBar(String option) {
		option = option.toUpperCase();
		switch (option) {
		case "DISPLAYED":
			if (getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("office.code.search")).isPresent()) {
				getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("office.code.search"))
						.verifyPresent("Search Bar is present");
				Reporter.logWithScreenShot("Search bar is displayed", MessageTypes.Pass);
			}
			break;
		case "NOT DISPLAYED":
			getNFKEventLogAddeventAddfoodSearchbarTxt().verifyNotPresent("Search food bar is not displayed");
			getNFKEventLogAddeventAddfoodSearchbarTxt().verifyNotPresent("Search food bar is not displayed");
			Reporter.logWithScreenShot("Search food bar is not displayed", MessageTypes.Pass);
			break;
		}
	}

	public void clickSearchBar() {
		if (getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("office.code.search")).isPresent()) {
			Reporter.logWithScreenShot("Search food bar is displayed", MessageTypes.Pass);
			getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("office.code.search")).click();
		}
	}

	public void verifySearchFoodScreen() {
		if (getNFKeventlogInsulincalculatorLbl().isDisplayed()) {
			Reporter.logWithScreenShot("Insulin Calculator Screen is displayed", MessageTypes.Pass);
		}
	}

	public void verifyBlankInsulin() {
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().clear();
		if (getNFKeventlogBgInsulincalculatorLnk().isDisplayed()) {
			if (getNFKeventlogBgInsulincalculatorLnk().isEnabled()) {
				Reporter.logWithScreenShot("Insulin Calculator link is displayed and enabled", MessageTypes.Pass);
			}
		}
	}

	public void editInsulin() {
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
		Reporter.logWithScreenShot("Insulin window before entering value", MessageTypes.Pass);
		getNFKEventLogaddbgaddvaluetxt().clear();
		getAMount = Integer.toString(ThreadLocalRandom.current().nextInt(1, 15));
		getNFKEventLogaddbgaddvaluetxt().sendKeys(getAMount);
		Reporter.logWithScreenShot("Insulin window after entering value", MessageTypes.Pass);
		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
	}

	public void verifySearchFoodMenu() {
		Reporter.log("getNFKEventLogAddeventAddfoodSearchbarAddBtn  ::"
				+ getNFKEventLogAddeventAddfoodSearchbarAddBtn().size());
		if (getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("office.code.search")).isPresent()) {
			Reporter.logWithScreenShot("Search food bar is displayed", MessageTypes.Pass);
			getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("office.code.search")).click();
			getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("office.code.search")).sendKeys("Cheese Pizza");
			for (int i = 0; i <= getNFKEventLogAddfoodSearchbarFoodlistTxt().size(); i++) {
				if (getNFKEventLogAddfoodSearchbarFoodlistTxt().get(i).getText().equals("Cheese Pizza")) {
					getNFKEventLogAddfoodSearchbarFoodlistTxt().get(i).click();

					getNFKEventLogAddeventAddfoodSearchbarAddBtn().get(i).click();
				}
				Reporter.logWithScreenShot("Food added is displayed", MessageTypes.Pass);
				if (getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.done"))
						.isPresent()) {
					getNFKEventLogpageStaticText(ConfigurationManager.getBundle().getString("appCommon.done")).click();
					LFSUtilsAndroid.waitforLoad();
				}
				Reporter.logWithScreenShot("Added food is displayed after saving", MessageTypes.Pass);
			}
		}
	}

	public void verifySearchCrossIcon() {
		if (getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("office.code.search")).isPresent()) {
			Reporter.logWithScreenShot("Search food bar is displayed", MessageTypes.Pass);
			getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("office.code.search")).click();
			getNFKEventLogpageStaticText(LFSUtilsAndroid.getPropString("office.code.search")).sendKeys("Chicken Breast");
			getNFKEventLogAddeventAddfoodSearchbarAddBtn().get(1).click();
			Reporter.logWithScreenShot("Food added and cross button is displayed", MessageTypes.Pass);
		}
	}

	public List<QAFWebElement> getNFKEventLogAddfoodSearchbarFoodlistTxt() {
		return NFKEventLogAddfoodSearchbarFoodlistTxt;
	}

	public QAFWebElement getNFKEventLogAddbgAddbgvalueTxt() {
		return NFKEventLogAddbgAddbgvalueTxt;
	}

	public QAFWebElement getNFKEventLogAddbgAddcarbvalueTxt() {
		return NFKEventLogAddbgAddcarbvalueTxt;
	}

	public QAFWebElement getNFKEventLogAddbgAddinsulinvalueTxt() {
		return NFKEventLogAddbgAddinsulinvalueTxt;
	}

	public QAFWebElement getNFKEventLogAddbgAddactivityvalueTxt() {
		return NFKEventLogAddbgAddactivityvalueTxt;
	}

	public void addcarbs_Detail(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		getNFKEventLogAddbgAddcarbvalueTxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Carbs window after entering value", MessageTypes.Pass);
		getCarbValue = eventBean.getAmount();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 30, 5);
		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Adding carb details");
		LFSUtilsAndroid.hideKeyboard();
	}

	public void clickBackBtn() {
		getNFKEventLogAddEventBackBtn().isPresent();
		
		
	}

	public void selecttypeofInsulin(String insulintype) {
	
		getNFKEventLogaddinsulinselecttypebtn().verifyPresent("Insulin button");
		getNFKEventLogaddinsulinselecttypebtn().click();  
		for(int i=0;i<5;i++) 
		   {
			   String gettypetext= getNFKEventLogTypePickerTxt().getText(); 
		         if(gettypetext.equals(insulintype))
		         {    
			       Reporter.logWithScreenShot("Selected the correct type ",MessageTypes.Pass);
			       ConfigurationManager.getBundle().setProperty("classic.insulin",insulintype);     
			       getNFKEventLogTypePickerDone().waitForPresent();
				   getNFKEventLogTypePickerDone().click();
			       break;
		        }
		       else
		         {
			       getNFKEventLogTypePickerBtn().click();	
		        } 
		   }
		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("User clicked on Save button", MessageTypes.Pass);	
	}

	public void verifytypeofInsulin(String typeinsulin) {
		getNFKEventLogaddinsulinselecttypebtn().verifyPresent("Insulin type value");		
		int randomInsulin = ThreadLocalRandom.current().nextInt(10, 200);
		getNFKEventLogaddbgaddvaluetxt().sendKeys(randomInsulin+"");
		
		String selectedInsulin = ConfigurationManager.getBundle()
				.getProperty("classic.insulin").toString();

		if (typeinsulin.equals(selectedInsulin)) {
		   Validator.verifyThat(typeinsulin,
			Matchers.equalTo(selectedInsulin));
		   Reporter.logWithScreenShot("Selected Insulin type is Present", MessageTypes.Pass);
		}
		else {
			Reporter.logWithScreenShot("Default(Rapid) insulin is displayed", MessageTypes.Fail);
		}
	}	
		
	public void editActivityDetail(Object eventDetail) {
		getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Activity window before entering value", MessageTypes.Pass);

		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().clear();
		getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Activity window after entering value", MessageTypes.Pass);
		getNFKEventLogaddbgtimebtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventtimeselectokbtn().click();
		getNFKEventLogaddeventsavebtn().click();
		Reporter.logWithScreenShot("User clicked on Save button", MessageTypes.Pass);
		
	}

	public void enterActivityvalue(String eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Activtiy window before adding value", MessageTypes.Pass);
		getNFKEventLogaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		insulinValue = eventBean.getAmount();
		Reporter.logWithScreenShot("Activity window after adding value", MessageTypes.Pass);
		getNFKEventLogEditglucoseNoteFieldTxt().sendKeys("Entering Activity detail");	
		
	}

	public void selecttypeofActivity(String activitytype) {
		getNFKEventLogaddactivityselectintensitybtn().isPresent();
		getNFKEventLogaddactivityselectintensitybtn().click();
		verifyIntensityTypePopUp();
		for(int i=0;i<4;i++) 
		   {
			   String gettypetext= getNFKEventLogTypePickerTxt().getText(); 
		         if(gettypetext.equals(activitytype))
		         {    
			       Reporter.logWithScreenShot("User selected Activity type ",MessageTypes.Pass);
			       ConfigurationManager.getBundle().setProperty("classic.activity",activitytype);     
			       getNFKEventLogTypePickerDone().waitForPresent();
				   getNFKEventLogTypePickerDone().click();
			       break;
		        }
		       else
		         {
			       getNFKEventLogTypePickerBtn().click();	
		        } 
		   }
		Reporter.logWithScreenShot("After selecting activity type ", MessageTypes.Pass);
		getNFKEventLogaddeventsavebtn().click();
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("User clicked on Save button", MessageTypes.Pass);
		
		
	}

	public void verifytypeofActivity(String typeActivity) {
		getNFKEventLogaddactivityselectintensitybtn().verifyPresent("Activity type button");
		
		int randomActivity = ThreadLocalRandom.current().nextInt(10, 40);
		getNFKEventLogaddbgaddvaluetxt().sendKeys(randomActivity+"");

		String selectedActivity = ConfigurationManager.getBundle()
				.getProperty("classic.activity").toString();

		if (typeActivity.equals(selectedActivity)) {
		Validator.verifyThat(typeActivity,
				Matchers.equalTo(selectedActivity));
		Reporter.logWithScreenShot("User selected Activity is Present", MessageTypes.Pass);
		
		}
		else {
			Reporter.logWithScreenShot("Default(None) Activity is displayed", MessageTypes.Fail);
		}
	}
	
	
	public void addMultiEvents(String option, int a) {
		HomePageAndroid homeAndroid = new HomePageAndroid();
	
		homeAndroid.getNFKHomepageAddeventTxt().waitForPresent();
		homeAndroid.getNFKHomepageAddeventTxt().click();	
		LFSUtilsAndroid.pause(3000);
		option = option.toUpperCase();
		switch (option) {
		
		case "GLUCOSE" :			
			//waitForPageToLoad();
			getNFKEventLogaddeventaddbgvaluebtn().waitForPresent();
			getNFKEventLogaddeventaddbgvaluebtn().click();
			addBG(a);
			break;	
			
		case "CARBS" :
			waitForPageToLoad();
			try {
				
				homeAndroid.getNFKHomepageAddeventTxt().click();
				homeAndroid.getNFKHomepageAddeventTxt().click();
				LFSUtilsAndroid.pause(3000);
				
			getNFKEventLogaddeventaddcarbvaluebtn().waitForPresent();
			getNFKEventLogaddeventaddcarbvaluebtn().click();
			addCarb(a);
			}
			catch(Exception e)
			{
				e.getMessage();
			}
			break;	
				
		case "INSULIN" :		
			waitForPageToLoad();
			try {
				homeAndroid.getNFKHomepageAddeventTxt().click();
				homeAndroid.getNFKHomepageAddeventTxt().click();
				LFSUtilsAndroid.pause(3000);
				
			getNFKEventLogaddeventaddinsulinvaluebtn().waitForPresent();
			getNFKEventLogaddeventaddinsulinvaluebtn().click();
			addInsulin(a);
			}
			catch(Exception e)
			{
				e.getMessage();
			}
			break;
			
		case "ACTIVITY" :
			waitForPageToLoad();
			try {
				
				homeAndroid.getNFKHomepageAddeventTxt().click();
				homeAndroid.getNFKHomepageAddeventTxt().click();
				LFSUtilsAndroid.pause(3000);
				
			getNFKEventLogaddeventaddactivityvaluebtn().waitForPresent();
			getNFKEventLogaddeventaddactivityvaluebtn().click();
			addActivity(a);
			}
			catch(Exception e) {
				e.getMessage();
			}
			break;	
		}

		
	}
	
	
public void addActivity(int a) {
		
		int randomNumberActivity = ThreadLocalRandom.current().nextInt(100, 120);
		getNFKEventLogaddbgaddvaluetxt().sendKeys(randomNumberActivity + "");
		LFSUtilsAndroid.hideKeyboard();
//		for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
//			if (getNFKEventLogaddbgaddvaluetxtList().get(a).isEnabled()) 
//			{
//				getNFKEventLogaddbgaddvaluetxtList().get(a).clear();
//				getNFKEventLogaddbgaddvaluetxtList().get(a).sendKeys(randomNumberActivity + "");
//				LFSUtilsAndroid.hideKeyboard();
//				break;
//			}
//		}
		//getNFKEventLogaddbgaddvaluetxtList().get(a).sendKeys(randomNumberActivity+"");
		ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity);	
	//	LFSUtilsAndroid.hideKeyboard();
		getNFKEventLogAddeventUnitLblList().get(a).click();
		LFSUtilsAndroid.hideKeyboard();
		//getNFKEventLogAddeventUnitLbl().click();
		//LFSUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Activity window after adding value is " + randomNumberActivity,
				MessageTypes.Pass);		
		//LFSUtilsAndroid.pause(3000);
		
	}

public void addInsulin(int a) {
	int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 200);
	getNFKEventLogaddbgaddvaluetxt().sendKeys(randomNumberInsulin + "");
	LFSUtilsAndroid.hideKeyboard();
//	for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
//		if (getNFKEventLogaddbgaddvaluetxtList().get(a).isEnabled()) {
//			getNFKEventLogaddbgaddvaluetxtList().get(a).clear();
//			getNFKEventLogaddbgaddvaluetxtList().get(a).sendKeys(randomNumberInsulin + "");
//			LFSUtilsAndroid.hideKeyboard();
//			break;
//		}
//		else {
//			System.out.println("++++++++++++Else part of insulin "+a+"+++++++++++++++++++");	
//		}
//	}
	
	
	//getNFKEventLogaddbgaddvaluetxtList().get(a).sendKeys(randomNumberInsulin + "");
	ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin);

//	LFSUtilsAndroid.hideKeyboard();
	//getNFKEventLogAddeventUnitLbl().click();
	//LFSUtilsAndroid.hideKeyboard();
	getNFKEventLogAddeventUnitLblList().get(a).click();
	LFSUtilsAndroid.hideKeyboard();
	Reporter.logWithScreenShot("Insulin window after adding value" + randomNumberInsulin, MessageTypes.Pass);
	
	//getNFKEventLogaddeventlbl().click();
	//LFSUtilsAndroid.pause(3000);
}

public void addCarb(int a) {
	int randomNumberCarb = ThreadLocalRandom.current().nextInt(1, 200);
	getNFKEventLogaddbgaddvaluetxt().sendKeys(randomNumberCarb + "");
	LFSUtilsAndroid.hideKeyboard();
	/*for (int i = 0; i < getNFKEventLogaddbgaddvaluetxtList().size(); i++) {
		if (getNFKEventLogaddbgaddvaluetxtList().get(a).isEnabled()) {
			getNFKEventLogaddbgaddvaluetxtList().get(a).clear();
			//getNFKEventLogaddbgaddvaluetxtList().get(a).sendKeys(randomNumberCarb + "");
			getNFKEventLogaddbgaddvaluetxt().sendKeys(randomNumberCarb + "");
			//LFSUtilsAndroid.hideKeyboard();
			break;
		}
		else {
			System.out.println("++++++++++++Else part of insulin "+a+"+++++++++++++++++++");	
		}
	}*/
	
	
	//getNFKEventLogaddbgaddvaluetxtList().get(a).sendKeys(randomNumberInsulin + "");
	ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb);

	//LFSUtilsAndroid.hideKeyboard();
	//getNFKEventLogAddeventUnitLbl().click();
	//LFSUtilsAndroid.hideKeyboard();
	
	getNFKEventLogAddeventUnitLblList().get(a).click();
//	LFSUtilsAndroid.hideKeyboard();
	Reporter.logWithScreenShot("Carb window after adding value" + randomNumberCarb, MessageTypes.Pass);
	
	//getNFKEventLogaddeventlbl().click();
	//LFSUtilsAndroid.pause(3000);
}

	public void addBG(int a) {
		if (getNFKEventLogunitofmeasurementlbl().getText().equalsIgnoreCase("mmol/l")) {
			userSelectFromLogEventList("GLUCOSE");
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(1, 33);
			String randomNumberGlucose = LFSUtilsAndroid.mmolMGDL(randomNumberGlucose0);
			ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
			enterManualBGvalue(randomNumberGlucose);
			Reporter.logWithScreenShot("After adding Glucose value", MessageTypes.Pass);
		} else {
			userSelectFromLogEventList("GLUCOSE");
			getNFKEventLogEditglucoseEditeventtitleTxt().waitForPresent();
			int randomNumberGlucose0 = ThreadLocalRandom.current().nextInt(21, 200);
			String randomNumberGlucose = LFSUtilsAndroid.mmolMGDL(randomNumberGlucose0);
			ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
			enterManualBGvalue(randomNumberGlucose);
			Reporter.logWithScreenShot("After adding Glucose value" + randomNumberGlucose,
					MessageTypes.Pass);
		}
	}
	
	public void saveMultiEvents() {
		getNFKEventLogaddeventsavebtn().click();
		//LFSUtilsAndroid.scrollDown();
		Reporter.logWithScreenShot("Events saved", MessageTypes.Pass);
		
	}

	public void editMultiEvent(String option) {
		option = option.toUpperCase();
		switch (option) {
		
		case "GLUCOSE" :			
			waitForPageToLoad();
			editRandomGlucose();
			break;	
			
		case "CARBS" :
			waitForPageToLoad();
		 	editRandomCarb();

			break;	
				
		case "INSULIN" :		
			waitForPageToLoad();
			editRandomInsulin();

			break;
			
		case "ACTIVITY" :
			waitForPageToLoad();
			editRandomActivity();

			break;	
		}
		getNFKEventLogaddeventlbl().click();
		Reporter.logWithScreenShot("Events added", MessageTypes.Pass);
		
	}
	public void verifyEventLog() {
		getNFKhomepageEventLogtab().waitForPresent();
		getNFKhomepageEventLogtab().click();
		getNFKEventLogpageeventTitle().get(0).waitForPresent();
		getNFKEventLogpageeventTitle().get(0).verifyPresent("Title of Event Log");
		getNFKEventlogpageeventChart().verifyPresent("Chart on Event Log");
		getNFKEventlogpageeventCalendarDateTxt().verifyPresent("Date time Text on  Event log");
		getNFKEventlogpageeventTodayBtn().verifyPresent("Today's button on Event Log");
	    Reporter.logWithScreenShot("User verified the Event Log",MessageTypes.Pass);
	}
	
	public void scrollChart() {
             Date date = new Date();
	         DateFormat dateFormat = new SimpleDateFormat("MMMM yyyy"); 
	         Date d=new DateTime(date).minusDays(90).toDate();
	         String strDate = dateFormat.format(d);     	  
		     Point p = getNFKEventlogpageeventChart().getLocation();
	       int c=1;	   
		   getNFKEventlogEventToggleCalendarBtn().waitForPresent(10);
    	   getNFKEventlogEventToggleCalendarBtn().click();
	       do {
            	LFSUtilsAndroid.swipeWithCoordinates(p.getX()+200, p.getY(), p.getX()+1300, p.getY(),
							10);
            	LFSUtilsAndroid.waitforLoad();
	    	  
	    	   c++; 
		    }while(c<=3);	       
	       String cdate= getNFKEventLogpageeventTitle().get(1).getText(); 
	       System.out.println(cdate+"  comparision of datess "+strDate);
	       if(cdate.equals(strDate)) {
	    	   Reporter.logWithScreenShot("User has scrolled upto 90 days upto date  " +cdate+" ",MessageTypes.Pass);
	       }
	       else
	       {
	    	  Reporter.logWithScreenShot("User was unable to scroll upto 90 days ",MessageTypes.Fail);
	       }
		}
	public void clickEventLog() {
		getNFKhomepageEventLogtab().click();
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.pause(30000);
		Reporter.logWithScreenShot("Event Log Page",MessageTypes.Pass);
		
	}
	public void verifyEditedAdded() {
	
		LFSUtilsAndroid.clickWithText("OK");
	      
        HomePageAndroid home=new HomePageAndroid();
        for(int i=0;i<home.getNFKHomepageEventValueTxt().size();i++) {
        home.getNFKHomepageEventValueTxt().get(i).getText();
        Reporter.logWithScreenShot("Events present " +home.getNFKHomepageEventValueTxt().get(i).getText(), MessageTypes.Pass);
        
        }
         	}
	
		
}








