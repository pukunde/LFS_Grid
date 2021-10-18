package com.NFK.support;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.NFK.version1.android.pages.SignupPageAndroid;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.StringUtil;
import com.thoughtworks.selenium.SeleniumException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.Connection;
import io.appium.java_client.ios.IOSDriver;
import net.sf.saxon.functions.Substring;

public class LFSUtilsAndroid {
	
	private static AndroidDriver androidDriver = ((AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver());
	
	public  AndroidDriver getDriver() {
		AndroidDriver androidDriver = ((AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver());
		return androidDriver;
	}
	
	public static void pause(int milisecond) {
			try {
				Thread.sleep(milisecond);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
	
	public static void getwifi() {
		LFSUtilsAndroid lfs=new LFSUtilsAndroid();
		lfs.getDriver().setConnection(Connection.NONE);
	}

	/*
	 * This Method returns Current Month
	 */
	public static String getCurrentMonth() {
		Calendar cal = Calendar.getInstance();
		return new SimpleDateFormat("MMMMM").format(cal.getTime());
	}
	/*
	 * This Method returns Current Date
	 */
	public static String getCurrentDate() {
		Calendar cal = Calendar.getInstance();
		return new SimpleDateFormat("d", Locale.ENGLISH).format(cal.getTime());
	}

	/*
	 * This Method returns Current Day of Week
	 */
	public static String getDayOfWeek() {
		String weekdays[] = new DateFormatSymbols(Locale.ENGLISH).getWeekdays();
		Calendar c = Calendar.getInstance();
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return weekdays[dayOfWeek];
	}

	/*
	 * Method is used to scroll screen till exact text
	 */
	@QAFTestStep(description = "scroll to {0}")
	public static void scrollToEleAndriod(String exactText) {
		try {
			AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
			SignupPageAndroid sgn=new SignupPageAndroid();
			int count=0;
			while (!LFSUtilsAndroid.tryDisplayMethod(sgn.getNFKSignuppageTimeStaticText(exactText))) {
				LFSUtilsAndroid.swipeWithScreenPercent(40, 70, 40, 30, 200);
				if(count==20){
					break;
				}
				count++;
			}
			
			
		} catch (SeleniumException e) {
			new WebDriverTestBase().getDriver().getTouchScreen().flick(0, (LFSUtilsAndroid.getIntNum("400")));
		}
	}
	
	
	public static void scrollToEleAndriodDOB(String exactText) {
		try {
			//AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
			SignupPageAndroid sgn=new SignupPageAndroid();
			int count=0;
				LFSUtilsAndroid lfs = new LFSUtilsAndroid();
				JavascriptExecutor js = (JavascriptExecutor) lfs.getDriver();
				HashMap<String, String> scrollObject = new HashMap<String, String>();	
				while (!LFSUtilsAndroid.tryDisplayMethod(sgn.getNFKSignuppageTimeStaticText(exactText))){
						scrollObject.put("direction", "up");
		        js.executeScript("mobile: scroll", scrollObject);	
					if(count==20){
						break;
					}
				count++;
			}				
		} catch (SeleniumException e) {
			new WebDriverTestBase().getDriver().getTouchScreen().flick(0, (LFSUtilsAndroid.getIntNum("400")));
		}
	}

	/*
	 * Used for scroll to methods return int value
	 */
	public static Integer getIntNum(String num) {
		if (StringUtil.isNumeric(num)) {
			return Integer.parseInt(num);
		}
		return null;
	}

	/*
	 * method is used to hide the keyboard
	 */
	public static void hideKeyboard() {
		AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		try {
			((AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver()).hideKeyboard();
		} catch (Exception e) {
			Map<String, Object> params = new HashMap<>();
			params.put("mode", "off");
			String res = (String) androidDriver.executeScript("mobile:keyboard:display", params); 
		}
	}

	public static void swipeWithElements(QAFExtendedWebElement firstEle, QAFExtendedWebElement secondEle,
			Integer duration) {
		AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		TouchAction ta = new TouchAction(androidDriver);
		ta.press(firstEle.getCoordinates().onPage().getX(), firstEle.getCoordinates().onPage().getY()).
		waitAction(Duration.ofMillis(duration)).moveTo(secondEle.getCoordinates().onPage().getX(), secondEle.getCoordinates().onPage().getY()).release().perform();
	}

	/**
	 * Method is used to swipe by co-ordinates
	 */
	public static void swipeWithCoordinates(int startx, int starty, int endx, int endy, Integer duration) {
		AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("start", ""+startx+","+starty+"");
		params.put("end", ""+endx+","+endy+"");
		params.put("duration", "3");
		Object res = androidDriver.executeScript("mobile:touch:swipe", params);
	}


	/*
	 * method is used to return QAFWebElement appending text inside locator
	 */
	public static QAFWebElement getElement(String locKey, String eleText) {
		QAFWebElement buttonEle = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString(locKey), eleText, eleText));
		return buttonEle;
	}

	public static void waitforLoad() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* Method to click back button on Android Device */
	public static void clickBackButton() {
		try {
			AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
			androidDriver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean tryDisplayMethod(QAFWebElement element){
		boolean flag=false;
		try{
			if((element.isDisplayed()))
				flag=true;
		}
		catch(Exception e){
			
		}
		return flag;
		
	}
	public static void clickWithCoordinates(int startx, int starty, int endx, int endy, Integer duration) {
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		
		Map<String, Object> params = new HashMap<>();
		params.put("start", "" + startx + "," + starty + "");
		params.put("end", ""+endx+","+endy+"");
		params.put("duration", "3");
		Object res = appiumDriver.executeScript("mobile:touch:tap", params);
	}
		
	
	public static String monthIntValue(String month){
		
		HashMap<String, String> monthmap = new HashMap<String, String>();
		monthmap.put("Jan", "1");monthmap.put("1", "Jan");
		monthmap.put("Feb", "2");monthmap.put("2", "Feb");
		monthmap.put("Mar", "3");monthmap.put("3", "Mar");
		monthmap.put("Apr", "4");monthmap.put("4", "Apr");
		monthmap.put("May", "5");monthmap.put("5", "May");
		monthmap.put("Jun", "6");monthmap.put("6", "Jun");
		monthmap.put("Jul", "7");monthmap.put("7", "Jul");
		monthmap.put("Aug", "8");monthmap.put("8", "Aug");
		monthmap.put("Sep", "9");monthmap.put("9", "Sep");
		monthmap.put("Oct", "10");monthmap.put("10", "Oct");
		monthmap.put("Nov", "11");monthmap.put("11", "Nov");
		monthmap.put("Dec", "12");monthmap.put("12", "Dec");
		return monthmap.get(month);
	}

	public static String monthNoOFDay(String month) {

		HashMap<String, String> monthmap = new HashMap<String, String>();
		monthmap.put("Jan", "31");
		monthmap.put("Feb", "28");
		monthmap.put("Mar", "31");
		monthmap.put("Apr", "30");
		monthmap.put("May", "31");
		monthmap.put("Jun", "30");
		monthmap.put("Jul", "31");
		monthmap.put("Aug", "31");
		monthmap.put("Sep", "30");
		monthmap.put("Oct", "31");
		monthmap.put("Nov", "30");
		monthmap.put("Dec", "31");
		return monthmap.get(month);
	}

	public static boolean tryMethod(QAFWebElement element){
		boolean flag=false;
		try{
			if((element.isDisplayed()))
				flag=true;
		}
		catch(Exception e){
			
		}
		return flag;
		
	}
	public static void selectPicker(WebElement element,int value)
	{
		Point p1=element.getLocation();
		Dimension d1 =element.getSize();
		LFSUtilsAndroid lfs=new LFSUtilsAndroid();
		int hr = Integer.parseInt(element.getText().toString().replaceAll("[^0-9]", ""));
		if (hr >= value) {
			while (!(Integer.parseInt(element.getText().toString().replaceAll("[^0-9]", ""))==value)) {
				try {
					AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
					TouchAction tch=new TouchAction(appiumDriver);
					tch.tap(p1.getX()+ (d1.getWidth()/2), p1.getY() - ((d1.getHeight())/2)).perform();
				} catch (Exception e) {
				}
			}	  
		}
		
		if (hr < value) {
			System.out.println("HR is lesss than value...");
			while (!(Integer.parseInt(element.getText().toString().replaceAll("[^0-9]", ""))==value)) {
				try {
					AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
					TouchAction tch=new TouchAction(appiumDriver);
					tch.tap(p1.getX()+ (d1.getWidth()/2), p1.getY() + ((d1.getHeight())/2)).perform();
				} catch (Exception e) {
				}
			}	
		}
	}
	
	public static void selectMonth(WebElement element,String value)
	{
		Point p1=element.getLocation();
		Dimension d1 =element.getSize();
		LFSUtilsAndroid lfs=new LFSUtilsAndroid();
		String  month = element.getText().toString().replaceAll("[^A-Za-z]", "");
		int montInt=Integer.parseInt(LFSUtilsAndroid.monthIntValue(month));
		int valueInt=Integer.parseInt(LFSUtilsAndroid.monthIntValue(value));
		
		if (montInt >= valueInt) {
			while (!(element.getText().toString().replaceAll("[^A-Za-z]", "").equals(value))) {
				try {
					AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
					TouchAction tch=new TouchAction(appiumDriver);
					tch.tap(p1.getX()+ (d1.getWidth()/2), p1.getY() - ((d1.getHeight())/2)).perform();
				} catch (Exception e) {
				}
			}	
		}
		
		if (montInt <= valueInt) {
			while (!(element.getText().toString().replaceAll("[^A-Za-z]", "").equals(value))) {
				try {
					AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
					TouchAction tch=new TouchAction(appiumDriver);
					tch.tap(p1.getX()+ (d1.getWidth()/2), p1.getY() + ((d1.getHeight())/2)).perform();
				} catch (Exception e) {
				}
			}	
		}
	}
	
	public static QAFWebElement getElement(String locKey, String eleText,String eleText2) {
		QAFWebElement buttonEle = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString(locKey), eleText, eleText2));
		return buttonEle;
	}
	
	//Method to get string from config file
	 public static String getPropString(String key){
	  return ConfigurationManager.getBundle().getProperty(key).toString();
	 }
	
	 public static void turnWifiOff() {
		 AndroidDriver androidDriver = ((AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver());
		 Map network = new HashMap<>();
		 network.put("wifi", "disabled");
		 androidDriver.executeScript("mobile:network.settings:set", network);
	 }
	 
	 public static void turnWifiOn() {
		 AndroidDriver androidDriver = ((AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver());
		 Map params = new HashMap<>(); 
		 params.put("wifi", "enabled");
		 androidDriver.executeScript("mobile:network.settings:set", params);
	}

	// verify unit of measure for the country
	// Return double value
	public static double setValueUnitOfMeasure(double randomNumberGlucose) {
		double glucose = randomNumberGlucose;
		if (ConfigurationManager.getBundle().getString("countryname").contains("United Kingdom and Ireland")
				|| ConfigurationManager.getBundle().getString("countryname").contains("Canada")) {
			System.out.println("##########   Inside mmol");
			glucose = randomNumberGlucose / 18;
			glucose = round(glucose);
		} else {

		}
		return glucose;
	}

	// verify unit of measure for the country
	// Return int value
	public static int setValueUnitOfMeasureInt(double randomNumberGlucose) {
		double glucose = randomNumberGlucose;
		if (ConfigurationManager.getBundle().getString("countryname").contains("United Kingdom and Ireland")
				|| ConfigurationManager.getBundle().getString("countryname").contains("Canada")) {
			System.out.println("##########   Inside mmol");
			glucose = randomNumberGlucose / 18;
			glucose = round(glucose);
		}
		int gluco = (int) glucose;
		return gluco;
	}

	private static double round(double value) {

		String s = "" + value;
		String s1[] = s.split("\\.");
		System.out.println(s1[0]);
		String s2 = s1[0] + "." + s1[1].charAt(0);
		double ans = Double.parseDouble(s2);
		return ans;
	}
	public static String mmolMGDL(double randomNumberGlucose){
		String s = "";

		if (ConfigurationManager.getBundle().getString("countryname").contains("United Kingdom and Ireland")
				|| ConfigurationManager.getBundle().getString("countryname").contains("Canada")) {
			double d = setValueUnitOfMeasure(randomNumberGlucose);
			s = "" + d;
			System.out.println(s);
			if (!s.contains(".")) {
				s = s + ".0";
			}
		} else {
			int i = (int) randomNumberGlucose;
			s = "" + i;
		}
		return s;
	}
	// Setting BG range from picker on setting page
	public static void selectBGRangePicker(WebElement element, String values) {
		Point p1 = element.getLocation();
		Dimension d1 = element.getSize();
		LFSUtilsAndroid lfs = new LFSUtilsAndroid();
		TouchAction tch=new TouchAction(lfs.getDriver());
		double hr = Double.parseDouble(element.getText().toString().replaceAll("[^0-9.]]", ""));
		double val = Double.parseDouble(values);
		if (hr >= val) {
			while (!((element.getText().toString().replaceAll("[^0-9.]", "")).contains(values))) {
				try {
					tch.tap( p1.getX()+ (d1.getWidth()/2), p1.getY() + ((d1.getHeight())/2)-130).perform();
				} catch (Exception e) {
				}
			}
		}

		if (hr < val) {
			while (!((element.getText().toString().replaceAll("[^0-9.]", "")).contains(values))) {
				try {
					tch.tap(p1.getX()+ (d1.getWidth()/2), p1.getY() + ((d1.getHeight())/2)+130).perform();
				} catch (Exception e) {
				}
			}
		}
	}

	/**
	 * Method is used to swipe by percentage of screen start from percent of
	 * screen and in percent
	 */
	public static void scrollDown() {
		LFSUtilsAndroid lfs = new LFSUtilsAndroid();
		JavascriptExecutor js = (JavascriptExecutor) lfs.getDriver();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
	}

	/**
	 * Method is used to swipe by percentage of screen start from percent of
	 * screen and in percent
	 */
	public static void scrollUp() {
		LFSUtilsAndroid lfs = new LFSUtilsAndroid();
		JavascriptExecutor js = (JavascriptExecutor) lfs.getDriver();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "up");
		js.executeScript("mobile: scroll", scrollObject);
	}

	/**
	 * Method is used to swipe by percentage of screen
	 * start from percent of screen and in percent
	 */
	public static void swipeWithScreenPercent(int startxPer, int startyPer, int endxPer, int endyPer, Integer duration) {
		LFSUtilsAndroid lfs = new LFSUtilsAndroid();
		Map<String, Object> params = new HashMap<>();
		params.put("start", ""+startxPer+"%,"+startyPer+"%");
		params.put("end", ""+endxPer+"%,"+endyPer+"%");
		params.put("duration", "3");
		lfs.getDriver().executeScript("mobile:touch:swipe", params);
	}
	
	public static void switchToContext(RemoteWebDriver driver, String context) {
		RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(driver);
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", context);
		executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
	}
	
	public static void clickWithText(String str) {
		Map<String, Object> params = new HashMap<>();
		params.put("label", str);
		params.put("threshold", 80);
		params.put("ignorecase", "nocase");
		Object res = androidDriver.executeScript("mobile:button-text:click", params);
		
	}
	public static Object findText(String str) {
		Map<String, Object> params = new HashMap<>();
		params.put("content", str);
		params.put("threshold", 80);
		params.put("ignorecase", "nocase");
		Object res = androidDriver.executeScript("mobile:text:find", params);
		return res;
	}
	
	
	public void switchToMobileWeb() {
		switchToContext(androidDriver, "NATIVE_APP");
		androidDriver.launchApp();
		Reporter.logWithScreenShot("app launch");
	}

	public static void appBackground() {
			AndroidDriver driver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
			driver.pressKeyCode(AndroidKeyCode.HOME);
	}
	
	
	
	
	
}
