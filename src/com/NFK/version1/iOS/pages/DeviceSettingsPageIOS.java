package com.NFK.version1.iOS.pages;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.NFK.support.CallSMS;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumCommandInfo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AppiumCommandExecutor;

public class DeviceSettingsPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFKios.devicesettings.calender.txt")
	private QAFWebElement NFKIosDeviceSettingsCalenderTxt;

	@FindBy(locator = "NFKios.devicesettings.time.txt")
	private QAFWebElement NFKIosDeviceSettingsTimeTxt;

	@FindBy(locator = "NFKios.devicesettings.search.txt")
	private QAFWebElement NFKIosDeviceSettingsSearchBoxtxt;

	@FindBy(locator = "NFKios.devicesettings.searched.option.txt")
	private QAFWebElement NFKIosDeviceSettingsSearchedOptionTxt;
	@FindBy(locator = "NFKios.devicesettings.switches")
	private QAFWebElement NFKIosDeviceSettingsSwitches;

	@FindBy(locator = "Nfkios.devicesettings.allowCriticalAlert")
	private QAFWebElement NFKIosDeviceSettingsAllowCritocalAlert;
	
	public QAFWebElement getNFKIosDeviceSettingsSwitches() {
		return NFKIosDeviceSettingsSwitches;
	}
	public QAFWebElement getNFKIosDeviceSettingsAllowCricticalAlert() {
		return NFKIosDeviceSettingsAllowCritocalAlert;
	}
	public QAFWebElement getNFKIosDeviceSettingsSearchBoxtxt() {
		return NFKIosDeviceSettingsSearchBoxtxt;
	}

	public void setNFKIosDeviceSettingsSearchBoxtxt(
			QAFWebElement NFKIosDeviceSettingsSearchBoxtxt) {
		this.NFKIosDeviceSettingsSearchBoxtxt = NFKIosDeviceSettingsSearchBoxtxt;
	}

	public QAFWebElement getNFKIosDeviceSettingsSearchedOptionTxt() {
		return NFKIosDeviceSettingsSearchedOptionTxt;
	}

	public void setNFKIosDeviceSettingsSearchedOptionTxt(
			QAFWebElement NFKIosDeviceSettingsSearchedOptionTxt) {
		this.NFKIosDeviceSettingsSearchedOptionTxt =
				NFKIosDeviceSettingsSearchedOptionTxt;
	}

	public QAFWebElement getNFKIosDeviceSettingsCalenderTxt() {
		return NFKIosDeviceSettingsCalenderTxt;
	}

	public void setNFKIosDeviceSettingsCalenderTxt(
			QAFWebElement NFKIosDeviceSettingsCalenderTxt) {
		this.NFKIosDeviceSettingsCalenderTxt = NFKIosDeviceSettingsCalenderTxt;
	}

	public QAFWebElement getNFKIosDeviceSettingsTimeTxt() {
		return NFKIosDeviceSettingsTimeTxt;
	}

	public void setNFKIosDeviceSettingsTimeTxt(
			QAFWebElement NFKIosDeviceSettingsTimeTxt) {
		this.NFKIosDeviceSettingsTimeTxt = NFKIosDeviceSettingsTimeTxt;
	}

	private IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public void setDateAndTime() {
		MoremenuPageIOS moreMenu = new MoremenuPageIOS();

		LFSUtilsIOS.swipeWithScreenPercent(50, 30, 50, 50, 1);
		if (!getNFKIosDeviceSettingsSwitches().isPresent()) {

			if (getNFKIosDeviceSettingsSearchBoxtxt().isDisplayed()) {
				Reporter.logWithScreenShot("Search bar present on Settings page",
						MessageTypes.Pass);
				getNFKIosDeviceSettingsSearchBoxtxt().clear();
				getNFKIosDeviceSettingsSearchBoxtxt().sendKeys("Date");
			} else {
				Reporter.logWithScreenShot("Search bar not displayed on Settings page",
						MessageTypes.Fail);
			}

			if (getNFKIosDeviceSettingsSearchedOptionTxt().isPresent()) {
				Reporter.logWithScreenShot("Date & Time option found", MessageTypes.Pass);
				moreMenu.getNFKiosMoremenuPageReminderNameTxt("Date & Time").click();
				LFSUtilsIOS.waitforLoad();
			} else {
				Reporter.logWithScreenShot("Date & Time option not found ",
						MessageTypes.Fail);
			}
			if (!moreMenu.getNFKiosMoremenuPageReminderNameTxt("Set Automatically")
					.getAttribute("value").equals("0")) {
				moreMenu.getNFKiosMoremenuPageReminderNameTxt("Set Automatically")
						.click();
				LFSUtilsIOS.waitforLoad();
			}

		}

	}

	public void openSystemDate() {

		if (getNFKIosDeviceSettingsCalenderTxt().isPresent()) {
			getNFKIosDeviceSettingsCalenderTxt().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Calender Opened", MessageTypes.Pass);
		}

	}

	public void changeDeviceDate(String date) {
		EventLogPageIOS logBook = new EventLogPageIOS();

		int dateValue = Integer.parseInt(date);
		LocalDate todaysDate = null;
		int today = LocalDate.now().getDayOfMonth();

		if (dateValue == 0) {
			todaysDate = LocalDate.now();
		} else {
			todaysDate = LocalDate.now();
			todaysDate = todaysDate.plusDays(dateValue);
		}

		String dayOfWeek = todaysDate.getDayOfWeek().toString();
		dayOfWeek = dayOfWeek.substring(0, 1)
				+ dayOfWeek.substring(1, dayOfWeek.length()).toLowerCase();

		String changeDayofweek = dayOfWeek.substring(0, 3);

		String currentmonthValue = todaysDate.getMonth().toString();
		currentmonthValue = currentmonthValue.substring(0, 1) + currentmonthValue
				.substring(1, currentmonthValue.length()).toLowerCase();

		String changeMonthValue = currentmonthValue.substring(0, 3);

		String updatedDate = changeDayofweek + ", " + changeMonthValue + " "
				+ todaysDate.getDayOfMonth();
		System.out.println("Changed date: " + updatedDate);

		String currentCalDateValue = null;

		if (getNFKIosDeviceSettingsCalenderTxt().isPresent()) {
			currentCalDateValue = getNFKIosDeviceSettingsCalenderTxt().getText();
			Reporter.logWithScreenShot(
					"Calender modified date before picker wheel operation: "
							+ currentCalDateValue,
					MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Device setting calender text not present",
					MessageTypes.Fail);
		}

		if (logBook.getNFKiosEventLogPageTimingPickerDatePkr().isPresent()) {
			Reporter.logWithScreenShot("Date picker present", MessageTypes.Pass);

			Point p1 = logBook.getNFKiosEventLogPageTimingPickerDatePkr().getLocation();
			Dimension d1 = logBook.getNFKiosEventLogPageTimingPickerDatePkr().getSize();
			LFSUtilsIOS jnj = new LFSUtilsIOS();

			int futureMonthIntVal =
					Integer.parseInt(LFSUtilsIOS.monthIntValue(changeMonthValue));
			int currentMonthIntVal = Integer.parseInt(
					LFSUtilsIOS.monthIntValue(currentCalDateValue.substring(0, 3)));
			String s1[] = currentCalDateValue.split(",");
			int count=0;
			if (Integer.parseInt(s1[0].replaceAll("[^0-9]", "")) == todaysDate
					.getDayOfMonth()) {
				Reporter.logWithScreenShot("Date Selected", MessageTypes.Pass);
			} else if (currentMonthIntVal < futureMonthIntVal) {
				while (!(updatedDate
						.equals(logBook.getNFKiosEventLogPageTimingPickerDatePkr()
								.getAttribute("value")))) {
					try {
						AppiumDriver appiumDriver =
								(AppiumDriver) (new WebDriverTestBase().getDriver()
										.getUnderLayingDriver());
						TouchAction tch = new TouchAction(appiumDriver);
						tch.tap(p1.getX() + d1.getWidth() / 2,
								p1.getY() + ((d1.getHeight()) / 2) + 50).perform();
						LFSUtilsIOS.pause(500);
						currentCalDateValue =
								logBook.getNFKiosEventLogPageTimingPickerDatePkr()
										.getAttribute("value");
						System.out.println(
								"picker current date value: " + currentCalDateValue);
						if(count==20) {
							break;
						}
						count++;
					} catch (Exception e) {
					}
				}
			} else if (currentMonthIntVal > futureMonthIntVal) {
				while (!(updatedDate
						.equals(logBook.getNFKiosEventLogPageTimingPickerDatePkr()
								.getAttribute("value")))) {
					try {
						AppiumDriver appiumDriver =
								(AppiumDriver) (new WebDriverTestBase().getDriver()
										.getUnderLayingDriver());
						TouchAction tch = new TouchAction(appiumDriver);
						tch.tap(p1.getX() + d1.getWidth() / 2,
								p1.getY() + ((d1.getHeight()) / 2) - 50).perform();
						LFSUtilsIOS.pause(500);
						currentCalDateValue =
								logBook.getNFKiosEventLogPageTimingPickerDatePkr()
										.getAttribute("value");
						System.out.println(
								"picker current date value: " + currentCalDateValue);
						if(count==20) {
							break;
						}
						count++;
					} catch (Exception e) {
					}
				}
			} else if (currentMonthIntVal == futureMonthIntVal) {
				if (today < todaysDate.getDayOfMonth()) {
					while ((!(Integer.parseInt(getDate(logBook.getNFKiosEventLogPageTimingPickerDatePkr()
							.getAttribute("value"))) == todaysDate.getDayOfMonth()))) {

						try {
							AppiumDriver appiumDriver =
									(AppiumDriver) (new WebDriverTestBase().getDriver()
											.getUnderLayingDriver());
							TouchAction tch = new TouchAction(appiumDriver);
							tch.tap(p1.getX() + d1.getWidth() / 2,
									p1.getY() + ((d1.getHeight()) / 2) + 50).perform();
							LFSUtilsIOS.pause(500);
							currentCalDateValue =
									logBook.getNFKiosEventLogPageTimingPickerDatePkr()
											.getAttribute("value");
							System.out.println(
									"picker current date value: " + currentCalDateValue);
							if(count==20) {
								break;
							}
							count++;
						} catch (Exception e) {
						}
					}

				} else if (today > todaysDate.getDayOfMonth()) {
					while ((!(Integer.parseInt(getDate(logBook.getNFKiosEventLogPageTimingPickerDatePkr()
							.getAttribute("value"))) == todaysDate.getDayOfMonth()))) {
						try {
							AppiumDriver appiumDriver =
									(AppiumDriver) (new WebDriverTestBase().getDriver()
											.getUnderLayingDriver());
							TouchAction tch = new TouchAction(appiumDriver);
							tch.tap(p1.getX() + d1.getWidth() / 2,
									p1.getY() + ((d1.getHeight()) / 2) - 50).perform();
							LFSUtilsIOS.pause(500);
							currentCalDateValue =
									logBook.getNFKiosEventLogPageTimingPickerDatePkr()
											.getAttribute("value");
							System.out.println(
									"picker current date value: " + currentCalDateValue);
							if(count==20) {
								break;
							}
							count++;
						} catch (Exception e) {
						}
					}
				} else {
					String s[] = currentCalDateValue.split(",");
					if (today < Integer.parseInt(s[0].replaceAll("[^0-9]", ""))) {
						while (!(getDate(logBook.getNFKiosEventLogPageTimingPickerDatePkr()
								.getAttribute("value"))
										.equals(todaysDate.getDayOfMonth() + ""))) {

							try {
								AppiumDriver appiumDriver =
										(AppiumDriver) (new WebDriverTestBase()
												.getDriver().getUnderLayingDriver());
								TouchAction tch = new TouchAction(appiumDriver);
								tch.tap(p1.getX() + d1.getWidth() / 2,
										p1.getY() + ((d1.getHeight()) / 2) - 50)
										.perform();
								LFSUtilsIOS.pause(500);
								currentCalDateValue =
										logBook.getNFKiosEventLogPageTimingPickerDatePkr()
												.getAttribute("value");
								System.out.println("picker current date value: "
										+ currentCalDateValue);
								if(count==20) {
									break;
								}
								count++;
							} catch (Exception e) {
							}
						}

					} else if (today > Integer.parseInt(s[0].replaceAll("[^0-9]", ""))) {
						while (!(getDate(logBook.getNFKiosEventLogPageTimingPickerDatePkr()
								.getAttribute("value"))
										.equals(todaysDate.getDayOfMonth() + ""))) {
							try {
								AppiumDriver appiumDriver =
										(AppiumDriver) (new WebDriverTestBase()
												.getDriver().getUnderLayingDriver());
								TouchAction tch = new TouchAction(appiumDriver);
								tch.tap(p1.getX() + d1.getWidth() / 2,
										p1.getY() + ((d1.getHeight()) / 2) + 50)
										.perform();
								LFSUtilsIOS.pause(500);
								currentCalDateValue =
										logBook.getNFKiosEventLogPageTimingPickerDatePkr() 
												.getAttribute("value");
								System.out.println("picker current date value: "
										+ currentCalDateValue);
								if(count==20) {
									break;
								}
								count++;
							} catch (Exception e) {
							}
						}
					}

				}
			} else {
				Reporter.logWithScreenShot("Month wrong", MessageTypes.Fail);
			}
		} else {
			Reporter.logWithScreenShot("Date Picker not present", MessageTypes.Fail);
		}
		Reporter.logWithScreenShot("Selected Date", MessageTypes.Pass);


	}
	public static void main(String[] args) {
		DeviceSettingsPageIOS device = new DeviceSettingsPageIOS();
		device.changeDeviceDate("2");
	}

	public String getDate(String value) {
		boolean b = false;
		String currentCalDateValue = " ";
		if (value.contains(LFSUtilsIOS.getPropString("appCommon.today"))) {
			currentCalDateValue = getNFKIosDeviceSettingsCalenderTxt().getText();
			String s[] = currentCalDateValue.split(",");
			currentCalDateValue = s[0].replaceAll("[^0-9]", "");
		} else {
			currentCalDateValue = value.replaceAll("[^0-9]", "");
		}
		System.out.println("++++++++++value to check   "+currentCalDateValue);
		return currentCalDateValue;
	}

	public String getDateVal(String d) {
		String sValue = "S";
		if (d.contains(",")) {
			Reporter.logWithScreenShot(d, MessageTypes.Fail);
			String ar[] = d.split(",");
			if (ar[0].length() == 6) {
				System.out.println("modified date: " + ar[0].substring(4, 6));
				sValue = (ar[0].substring(4, 6));
			} else {
				Reporter.logWithScreenShot(ar[1], MessageTypes.Fail);
				System.out.println("modified date: " + ar[1].substring(4, 5));
				sValue = (ar[1].substring(4, 5));
			}
		}
		return sValue;

	}

	public void switchWiFiOnOff() {

		LFSUtilsAndroid.getwifi();

	}
	public void switchOnAutomaticTimeUpdateSwitch() {
		MoremenuPageIOS moreMenu=new MoremenuPageIOS();
		if (moreMenu.getNFKiosMoremenuPageReminderNameTxt("Set Automatically")
				.getAttribute("value").equals("0")) {
			moreMenu.getNFKiosMoremenuPageReminderNameTxt("Set Automatically")
					.click();
			LFSUtilsIOS.waitforLoad();
		}
	}

	public void ClickAllowCriticalAlertsButton() {
		if(getNFKIosDeviceSettingsAllowCricticalAlert().isPresent()) {
			getNFKIosDeviceSettingsAllowCricticalAlert().click();
			Reporter.logWithScreenShot("Allowed Critical Alert",MessageTypes.Pass);
		}
	}
}
