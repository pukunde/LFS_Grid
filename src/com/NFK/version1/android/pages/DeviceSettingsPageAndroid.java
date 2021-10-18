package com.NFK.version1.android.pages;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.MoremenuPageIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class DeviceSettingsPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.device.settings.setdate.btn")
	private QAFWebElement NFKDeviceSettingsSetdateBtn;

	@FindBy(locator = "NFK.device.calender.popup.next.btn")
	private QAFWebElement NFKDeviceCalenderPopupNextBtn;

	@FindBy(locator = "NFK.device.calender.popup.back.btn")
	private QAFWebElement NFKDeviceCalenderPopupBackBtn;

	@FindBy(locator = "NFK.device.calender.year.btn")
	private QAFWebElement NFKDeviceCalenderYearBtn;

	@FindBy(locator = "NFK.device.calender.done.btn")
	private QAFWebElement NFKDeviceCalenderDoneBtn;

	@FindBy(locator = "NFK.device.settings.settime.btn")
	private QAFWebElement NFKDeviceSettingsSetTimeBtn;

	@FindBy(locator = "NFK.device.time.hour.txt")
	private QAFWebElement NFKDeviceTimeHourPicker;

	@FindBy(locator = "NFK.device.time.minute.txt")
	private QAFWebElement NFKDeviceTimeMinutePicker;

	@FindBy(locator = "NFK.device.time.meridian.txt")
	private QAFWebElement NFKDeviceTimeMeridianPicker;

	@FindBy(locator = "NFK.device.time.value.txt")
	private QAFWebElement NFKDeviceTimeValueTxt;

	@FindBy(locator = "NFK.device.calender.month.header.txt")
	private QAFWebElement NFKDeviceCalenderMonthHeaderTxt;

	@FindBy(locator = "NFK.device.calender.month.header.nxt.btn")
	private QAFWebElement NFKDeviceCalenderMonthHeaderNextBtn;

	@FindBy(locator = "NFK.device.calender.month.header.prev.btn")
	private QAFWebElement NFKDeviceCalenderMonthHeaderPrevBtn;

	@FindBy(locator = "NFK.device.calender.year.picker.btn")
	private QAFWebElement NFKDeviceCalenderYearPickerBtn;
	
	@FindBy(locator = "NFK.year.picker.btn")
	private QAFWebElement NFKDeviceCalenderYearPickerwheelBtn;
	
	@FindBy(locator = "NFK.device.time.autoupdate.switch")
	private QAFWebElement NFKDeviceTimeAutoupdateSwitch;
	
	
	public QAFWebElement getNFKDeviceTimeAutoupdateSwitch() {
		return NFKDeviceTimeAutoupdateSwitch;
	}

	public QAFWebElement getNFKDeviceCalenderYearPickerwheelBtn() {
		return NFKDeviceCalenderYearPickerwheelBtn;
	}

	public void setNFKDeviceCalenderYearPickerwheelBtn(QAFWebElement NFKDeviceCalenderYearPickerwheelBtn) {
		this.NFKDeviceCalenderYearPickerwheelBtn = NFKDeviceCalenderYearPickerwheelBtn;
	}

	public QAFWebElement getNFKDeviceCalenderYearTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.device.calender.year.txt", text);
	}

	public QAFWebElement getNFKDeviceCalenderMonthHeaderTxt() {
		return NFKDeviceCalenderMonthHeaderTxt;
	}

	public void setNFKDeviceCalenderMonthHeaderTxt(QAFWebElement NFKDeviceCalenderMonthHeaderTxt) {
		this.NFKDeviceCalenderMonthHeaderTxt = NFKDeviceCalenderMonthHeaderTxt;
	}

	public QAFWebElement getNFKDeviceCalenderMonthHeaderNextBtn() {
		return NFKDeviceCalenderMonthHeaderNextBtn;
	}

	public void setNFKDeviceCalenderMonthHeaderNextBtn(QAFWebElement NFKDeviceCalenderMonthHeaderNextBtn) {
		this.NFKDeviceCalenderMonthHeaderNextBtn = NFKDeviceCalenderMonthHeaderNextBtn;
	}

	public QAFWebElement getNFKDeviceCalenderMonthHeaderPrevBtn() {
		return NFKDeviceCalenderMonthHeaderPrevBtn;
	}

	public void setNFKDeviceCalenderMonthHeaderPrevBtn(QAFWebElement NFKDeviceCalenderMonthHeaderPrevBtn) {
		this.NFKDeviceCalenderMonthHeaderPrevBtn = NFKDeviceCalenderMonthHeaderPrevBtn;
	}

	public QAFWebElement getNFKDeviceCalenderYearPickerBtn() {
		return NFKDeviceCalenderYearPickerBtn;
	}

	public void setNFKDeviceCalenderYearPickerBtn(QAFWebElement NFKDeviceCalenderYearPickerBtn) {
		this.NFKDeviceCalenderYearPickerBtn = NFKDeviceCalenderYearPickerBtn;
	}

	public QAFWebElement getNFKDeviceTimeValueTxt() {
		return NFKDeviceTimeValueTxt;
	}

	public void setNFKDeviceTimeValueTxt(QAFWebElement NFKDeviceTimeValueTxt) {
		this.NFKDeviceTimeValueTxt = NFKDeviceTimeValueTxt;
	}

	public QAFWebElement getNFKDeviceTimeHourPicker() {
		return NFKDeviceTimeHourPicker;
	}

	public void setNFKDeviceTimeHourPicker(QAFWebElement NFKDeviceTimeHourPicker) {
		this.NFKDeviceTimeHourPicker = NFKDeviceTimeHourPicker;
	}

	public QAFWebElement getNFKDeviceTimeMinutePicker() {
		return NFKDeviceTimeMinutePicker;
	}

	public void setNFKDeviceTimeMinutePicker(QAFWebElement NFKDeviceTimeMinutePicker) {
		this.NFKDeviceTimeMinutePicker = NFKDeviceTimeMinutePicker;
	}

	public QAFWebElement getNFKDeviceTimeMeridianPicker() {
		return NFKDeviceTimeMeridianPicker;
	}

	public void setNFKDeviceTimeMeridianPicker(QAFWebElement NFKDeviceTimeMeridianPicker) {
		this.NFKDeviceTimeMeridianPicker = NFKDeviceTimeMeridianPicker;
	}

	public QAFWebElement getNFKDeviceSettingsSetTimeBtn() {
		return NFKDeviceSettingsSetTimeBtn;
	}

	public void setNFKDeviceSettingsSetTimeBtn(QAFWebElement NFKDeviceSettingsSetTimeBtn) {
		this.NFKDeviceSettingsSetTimeBtn = NFKDeviceSettingsSetTimeBtn;
	}

	public QAFWebElement getNFKDeviceCalenderDoneBtn() {
		return NFKDeviceCalenderDoneBtn;
	}

	public void setNFKDeviceCalenderDoneBtn(QAFWebElement NFKDeviceCalenderDoneBtn) {
		this.NFKDeviceCalenderDoneBtn = NFKDeviceCalenderDoneBtn;
	}

	public QAFWebElement getNFKDeviceSettingsSetdateBtn() {
		return NFKDeviceSettingsSetdateBtn;
	}

	public void setNFKDeviceSettingsSetdateBtn(QAFWebElement NFKDeviceSettingsSetdateBtn) {
		this.NFKDeviceSettingsSetdateBtn = NFKDeviceSettingsSetdateBtn;
	}

	public QAFWebElement getNFKDeviceCalenderPopupNextBtn() {
		return NFKDeviceCalenderPopupNextBtn;
	}

	public void setNFKDeviceCalenderPopupNextBtn(QAFWebElement NFKDeviceCalenderPopupNextBtn) {
		this.NFKDeviceCalenderPopupNextBtn = NFKDeviceCalenderPopupNextBtn;
	}

	public QAFWebElement getNFKDeviceCalenderPopupBackBtn() {
		return NFKDeviceCalenderPopupBackBtn;
	}

	public void setNFKDeviceCalenderPopupBackBtn(QAFWebElement NFKDeviceCalenderPopupBackBtn) {
		this.NFKDeviceCalenderPopupBackBtn = NFKDeviceCalenderPopupBackBtn;
	}

	public QAFWebElement getNFKDeviceCalenderYearBtn() {
		return NFKDeviceCalenderYearBtn;
	}

	public void setNFKDeviceCalenderYearBtn(QAFWebElement NFKDeviceCalenderYearBtn) {
		this.NFKDeviceCalenderYearBtn = NFKDeviceCalenderYearBtn;
	}

	public QAFWebElement getNFKDeviceCalenderDateTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.device.calender.date.txt", text);
	}

	public QAFWebElement getNFKDeviceTimeHoueTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.device.time.hour.txt", text);
	}

	public QAFWebElement getNFKDeviceTimeMinuteTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.device.time.minute.txt", text);
	}

	public QAFWebElement getNFKDeviceTimeMeridianTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.device.time.meridian.txt", text);
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	
	public void closeSettingActivity() {
		AppiumDriver<?> iosDriver = (AppiumDriver) driver.getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("name", "Settings");
		try {
			iosDriver.executeScript("mobile:application:close", params);
		}catch (Exception e) {
		}
		
		Reporter.logWithScreenShot("Device Settings launched" , MessageTypes.Pass);
		
	}

	public void changeDeviceDate(String date) {
		int dateValue = Integer.parseInt(date);
		LocalDate todaysDate = null;

		if (dateValue == 0) {
			todaysDate = LocalDate.now();
		} else  {
			todaysDate = LocalDate.now();
			todaysDate = todaysDate.plusDays(dateValue);
	
		}

		String dayOfWeek = todaysDate.getDayOfWeek().toString();
		dayOfWeek = dayOfWeek.substring(0, 1) + dayOfWeek.substring(1, dayOfWeek.length()).toLowerCase();

		String currentmonthValue = todaysDate.getMonth().toString();
		currentmonthValue = currentmonthValue.substring(0, 1)
				+ currentmonthValue.substring(1, currentmonthValue.length()).toLowerCase();

		String tomorrowDate = dayOfWeek + ", " + currentmonthValue + " " + todaysDate.getDayOfMonth() + ", "
				+ todaysDate.getYear();
		
		checkMonthAndYearOnCalender(currentmonthValue, todaysDate.getYear());
		
		getNFKDeviceCalenderDateTxt(tomorrowDate).click();
		LFSUtilsAndroid.waitforLoad();

		getNFKDeviceCalenderDoneBtn().click();
		Reporter.logWithScreenShot("Date selected", MessageTypes.Pass);

	}

	public void checkMonthAndYearOnCalender(String month, int year) {

		String currentCalenderMonth = null, expMonth = null, sCurrentVal = null, sExpectedVal = null;
		int iCalYear = 0, iExpYear = 0, iCurrentVal = 0, iExpectedVal = 0;
		
		currentCalenderMonth = getNFKDeviceCalenderMonthHeaderTxt().getText();
		String currenCalenderYear="";
		if(getNFKDeviceCalenderYearPickerBtn().isPresent()) {
			currenCalenderYear =  getNFKDeviceCalenderYearPickerBtn().getText();
		}else {
			String s[]=currentCalenderMonth.split(" ");
			currentCalenderMonth=s[0].substring(0, 1).toUpperCase() + s[0].substring(1,3).toLowerCase();
			Reporter.logWithScreenShot(currentCalenderMonth, MessageTypes.Pass);
			currenCalenderYear=s[1];
		}
		 
	
		iCalYear = Integer.parseInt(currenCalenderYear);
		iExpYear = year;
		expMonth = month.substring(0, 3);
			
		sCurrentVal = LFSUtilsAndroid.monthIntValue(currentCalenderMonth);
		sExpectedVal = LFSUtilsAndroid.monthIntValue(expMonth);
		iCurrentVal = Integer.parseInt(sCurrentVal);
		iExpectedVal = Integer.parseInt(sExpectedVal);
	
		if(iExpYear == iCalYear){
			Reporter.logWithScreenShot("Expected year and Calender year is same", MessageTypes.Pass);
		}else if(iExpYear > iCalYear){
			Reporter.logWithScreenShot("Expected year greater than Calender year");
			changeYear(iExpYear);
		}else if(iExpYear < iCalYear){
			Reporter.logWithScreenShot("Expected year less than Calender year");
			decreaseYear(iExpYear,iCalYear);
		}
		
		if(!getNFKDeviceCalenderYearPickerBtn().isPresent()) {
		
			currentCalenderMonth = getNFKDeviceCalenderMonthHeaderTxt().getText();
			String s[]=currentCalenderMonth.split(" ");
			currentCalenderMonth=s[0].substring(0, 1).toUpperCase() + s[0].substring(1,3).toLowerCase();
			Reporter.logWithScreenShot(currentCalenderMonth, MessageTypes.Pass);
			currenCalenderYear=s[1];
		}
		sCurrentVal = LFSUtilsAndroid.monthIntValue(currentCalenderMonth);
		iCurrentVal = Integer.parseInt(sCurrentVal);
			
		if(iExpectedVal == iCurrentVal){
			Reporter.logWithScreenShot("Expected month and current month matching", MessageTypes.Pass);
		}else if(iExpectedVal > iCurrentVal){
			Reporter.logWithScreenShot("Expected month greater than current month");
			increaseMonth(currentCalenderMonth, expMonth);
		}else if(iExpectedVal < iCurrentVal){
			Reporter.logWithScreenShot("Expected month less than current month");
			decreaseMonth(currentCalenderMonth, expMonth);
		}	
		
		Reporter.logWithScreenShot("Month and year value matched on Calender", MessageTypes.Pass);
	}
	
	public void increaseMonth(String currentCalenderMonth, String expMonth){
		currentCalenderMonth = getNFKDeviceCalenderMonthHeaderTxt().getText();
		while(!currentCalenderMonth.equalsIgnoreCase(expMonth)){
			getNFKDeviceCalenderMonthHeaderNextBtn().click();
			LFSUtilsAndroid.waitforLoad();
			currentCalenderMonth = getNFKDeviceCalenderMonthHeaderTxt().getText();
		}
	}
	
	public void decreaseMonth(String currentCalenderMonth, String expMonth){
		currentCalenderMonth = getNFKDeviceCalenderMonthHeaderTxt().getText();
		while(!currentCalenderMonth.equalsIgnoreCase(expMonth)){
			getNFKDeviceCalenderMonthHeaderPrevBtn().click();
			LFSUtilsAndroid.waitforLoad();
			currentCalenderMonth = getNFKDeviceCalenderMonthHeaderTxt().getText();
		}
	}
	
	public void decreaseYear(int iExpYear, int iCurrentYear){
		
		while(!(iExpYear == iCurrentYear)){
			getNFKDeviceCalenderMonthHeaderPrevBtn().click();
			LFSUtilsAndroid.waitforLoad();
			iCurrentYear = Integer.parseInt(getNFKDeviceCalenderYearPickerBtn().getText());
		}
		
	}
	
	public void changeYear(int iExpYear){
		String year = Integer.toString(iExpYear);
		getNFKDeviceCalenderYearPickerBtn().click();
		LFSUtilsAndroid.waitforLoad();

		if(getNFKDeviceCalenderYearTxt(year).isDisplayed()){
			getNFKDeviceCalenderYearTxt(year).click();
		}else{
			Reporter.logWithScreenShot("Year value not displayed", MessageTypes.Fail);			
		}
	}
	
	public void openSystemDate() {

		if (getNFKDeviceCalenderDoneBtn().isPresent()) {
			getNFKDeviceCalenderDoneBtn().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Calender done button clicked", MessageTypes.Pass);
		}			   

		if (new DeviceSettingsPageAndroid().getNFKDeviceSettingsSetdateBtn().isPresent()) {
			new DeviceSettingsPageAndroid().getNFKDeviceSettingsSetdateBtn().click();
			LFSUtilsAndroid.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Set date field not displayed", MessageTypes.Fail);
		}
	}
	public void switchOnAutomaticTimeUpdateSwitch() {
		getNFKDeviceTimeAutoupdateSwitch().waitForPresent(3000);
		if (getNFKDeviceTimeAutoupdateSwitch().getAttribute("checked").equals(false)) {
			getNFKDeviceTimeAutoupdateSwitch().click();
		}
	}
	
}
