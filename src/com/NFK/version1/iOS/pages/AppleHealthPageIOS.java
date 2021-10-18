
package com.NFK.version1.iOS.pages;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.AppDetailPathBeans;
import com.NFK.version1.iOS.beans.AppleHealthDataBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import net.sf.saxon.value.IntegerRange;

public class AppleHealthPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFKios.applehealthpage.hour.picker")
	private QAFWebElement NFKIosAppleHealthPageHourPicker;

	@FindBy(locator = "NFKios.applehealthpage.minute.picker")
	private QAFWebElement NFKIosAppleHealthPageMinutePicker;

	@FindBy(locator = "NFKios.applehealthpage.meridian.picker")
	private QAFWebElement NFKIosAppleHealthPageMeridianPicker;

	@FindBy(locator = "NFKios.applehealthpage.nutrition.value.txt")
	private QAFWebElement NFKIosAppleHealthPageNutritionValueTxt;

	public QAFWebElement getNFKIosAppleHealthPageHourPicker() {
		return NFKIosAppleHealthPageHourPicker;
	}

	public void setNFKIosAppleHealthPageHourPicker(
			QAFWebElement NFKIosAppleHealthPageHourPicker) {
		this.NFKIosAppleHealthPageHourPicker = NFKIosAppleHealthPageHourPicker;
	}

	public QAFWebElement getNFKIosAppleHealthPageMinutePicker() {
		return NFKIosAppleHealthPageMinutePicker;
	}

	public void setNFKIosAppleHealthPageMinutePicker(
			QAFWebElement NFKIosAppleHealthPageMinutePicker) {
		this.NFKIosAppleHealthPageMinutePicker = NFKIosAppleHealthPageMinutePicker;
	}

	public QAFWebElement getNFKIosAppleHealthPageMeridianPicker() {
		return NFKIosAppleHealthPageMeridianPicker;
	}

	public void setNFKIosAppleHealthPageMeridianPicker(
			QAFWebElement NFKIosAppleHealthPageMeridianPicker) {
		this.NFKIosAppleHealthPageMeridianPicker = NFKIosAppleHealthPageMeridianPicker;
	}

	public QAFWebElement getNFKIosAppleHealthPageNutritionValueTxt() {
		return NFKIosAppleHealthPageNutritionValueTxt;
	}

	public void setNFKIosAppleHealthPageNutritionValueTxt(
			QAFWebElement NFKIosAppleHealthPageNutritionValueTxt) {
		this.NFKIosAppleHealthPageNutritionValueTxt =
				NFKIosAppleHealthPageNutritionValueTxt;
	}

	public QAFWebElement getNFKIosAppleHealthLbl(String text) {
		return LFSUtilsAndroid.getElement("NFKios.applehealthpage.menu.lbl", text);
	}

	public QAFWebElement getNFKIosAppleHealthValue(String text) {
		return LFSUtilsAndroid.getElement("NFKios.applehealthpage.content.value", text);
	}

	private IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public void startAppleHealthApp() {
		Map<String, Object> params = new HashMap<>();
		params.put("name", "Health");
		iosDriver.executeScript("mobile:application:open", params);
		LFSUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Apple Health app launched");
	}

	public void verifyAppleHealthValues(String contentValue) {
		getNFKIosAppleHealthValue(contentValue).verifyPresent();
		LFSUtilsIOS.waitforLoad();
	}

	public void navigateToAppleHealthLabel(String label) {
		getNFKIosAppleHealthLbl(label).click();
		LFSUtilsIOS.waitforLoad();
	}

	public void clickButton(String button) {
		getNFKIosAppleHealthLbl(button).click();
		LFSUtilsIOS.waitforLoad();
	}

	public void verifyPageHeadingTitle(String heading) {
		getNFKIosAppleHealthLbl(heading).verifyPresent();
		LFSUtilsIOS.waitforLoad();
	}

	public void addValueForAppleHealth(String value) {
		getNFKIosAppleHealthValue(value);
	}

	public void addDateForAppleHealth(String date) {
		SignupPageIOS signUp = new SignupPageIOS();

		int dateValue = Integer.parseInt(date);
		LocalDate todaysDate = null;

		if (dateValue == 0) {
			todaysDate = LocalDate.now();
		} else if (dateValue == 1) {
			todaysDate = LocalDate.now();
			todaysDate = todaysDate.plusDays(1);
		} else if (dateValue == 7) {
			todaysDate = LocalDate.now();
			todaysDate = todaysDate.plusDays(7);
		} else if (dateValue == 30) {
			todaysDate = LocalDate.now();
			todaysDate = todaysDate.plusDays(30);
		} else if (dateValue == 365) {
			todaysDate = LocalDate.now();
			todaysDate = todaysDate.plusDays(365);
		}

		String currentmonthValue = todaysDate.getMonth().toString();
		currentmonthValue = currentmonthValue.substring(0, 1) + currentmonthValue
				.substring(1, currentmonthValue.length()).toLowerCase();

		int yearValue = todaysDate.getYear();
		int todayDateValue = todaysDate.getDayOfMonth();

		getNFKIosAppleHealthValue("Date").click();

		if (signUp.getNFKiosSignuppageBirthdayMonthPkr().getText()
				.equals(currentmonthValue)) {
			Reporter.logWithScreenShot("Month value matching");
		} else {
			signUp.getNFKiosSignuppageBirthdayMonthPkr().sendKeys(currentmonthValue);
			LFSUtilsIOS.waitforLoad();
		}

		if (signUp.getNFKiosSignuppageBirthdayDatePkr().getText()
				.equals(Integer.toString(todayDateValue))) {
			Reporter.logWithScreenShot("Date value matching");
		} else {
			signUp.getNFKiosSignuppageBirthdayDatePkr()
					.sendKeys(Integer.toString(todayDateValue));
			LFSUtilsIOS.waitforLoad();
		}

		if (signUp.getNFKiosSignuppageTimingpickerYearPkr().getText()
				.equals(Integer.toString(yearValue))) {
			Reporter.logWithScreenShot("Year value matching");
		} else {
			signUp.getNFKiosSignuppageTimingpickerYearPkr()
					.sendKeys(Integer.toString(yearValue));
			LFSUtilsIOS.waitforLoad();
		}

	}

	public void addTimeForAppleHealth(int hours, int minutes) {
		getNFKIosAppleHealthValue("Time").click();

		Point p1 = getNFKIosAppleHealthPageHourPicker().getLocation();
		Dimension d1 = getNFKIosAppleHealthPageHourPicker().getSize();
		LFSUtilsIOS jnj = new LFSUtilsIOS();

		int hour = hours;
		int minute = minutes;
		TouchAction tch = new TouchAction(jnj.getDriver());
		tch.tap(p1.getX() + d1.getWidth() / 2, p1.getY() + ((d1.getHeight()) / 2) - 50)
				.perform();
		LFSUtilsIOS.selectTimePicker(getNFKIosAppleHealthPageHourPicker(), hours);
		LFSUtilsIOS.selectTimePicker(getNFKIosAppleHealthPageMinutePicker(), minutes);
	}

	public void verifyEnableLoginButton() {
		AccountPageIOS myAccount = new AccountPageIOS();
		LFSUtilsIOS.waitforLoad();

		((IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver())
				.findElement(By.xpath("//*[text()='return' or @label='return']")).click();
	}

	public void addCarbValueIntoAppleHealth(String carbValue) {
		getNFKIosAppleHealthValue("g").click();
		getNFKIosAppleHealthPageNutritionValueTxt().sendKeys(carbValue);
	}

	public void enterCarbData(Object val) {

		AppleHealthDataBeans appleHealthBean = new AppleHealthDataBeans();

		if (val instanceof String) {
			appleHealthBean.fillFromConfig((String) val);
		} else {
			appleHealthBean.fillData(val);
		}

		int hour = Integer.parseInt(appleHealthBean.getTimeHr());
		int min = Integer.parseInt(appleHealthBean.getTimeMinute());

		addDateForAppleHealth("0");
		LFSUtilsIOS.waitforLoad();
		addTimeForAppleHealth(hour, min);
		LFSUtilsIOS.waitforLoad();

		addCarbValueIntoAppleHealth(appleHealthBean.getgVal());
		LFSUtilsIOS.waitforLoad();
		clickButton("Add");
		LFSUtilsIOS.waitforLoad();
	}

	public void navigateToCarbohydrates() {
		verifyAppleHealthValues(
				ConfigurationManager.getBundle().getString("appleHealth.Dashboard"));
		LFSUtilsIOS.waitforLoad();
		navigateToAppleHealthLabel(
				ConfigurationManager.getBundle().getString("appleHealth.HealthData"));
		LFSUtilsIOS.waitforLoad();
		navigateToAppleHealthLabel(
				ConfigurationManager.getBundle().getString("appleHealth.Nutrition"));
		LFSUtilsIOS.waitforLoad();
		navigateToAppleHealthLabel(
				ConfigurationManager.getBundle().getString("appleHealth.Carbohydrates"));
		LFSUtilsIOS.waitforLoad();
	}

	public void turnonCategoryOption() {
		if (getNFKIosAppleHealthLbl("Turn All Categories On").isPresent()) {
			getNFKIosAppleHealthLbl("Turn All Categories On").click();
			LFSUtilsIOS.waitforLoad();
		} else {
			Reporter.logWithScreenShot("Turn All Categories On button not present",
					MessageTypes.Info);
		}

	}

}
