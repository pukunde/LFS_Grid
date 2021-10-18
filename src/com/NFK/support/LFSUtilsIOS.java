 
package com.NFK.support;


import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.NFK.version1.android.pages.CountrySelectionPageAndroid;
import com.NFK.version1.iOS.pages.SignupPageIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.StringUtil;
import com.thoughtworks.selenium.SeleniumException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

public class LFSUtilsIOS extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	
	private IOSDriver iosDriver= (IOSDriver) driver.getUnderLayingDriver();
	public  IOSDriver getDriver() {
		return iosDriver;
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
	public static void scrollToEleIOS(String exactText) {
		try {
			AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
			SignupPageIOS sgn=new SignupPageIOS();
			while (!LFSUtilsAndroid.tryDisplayMethod(sgn.getNFKiosSignuppageStaticlabel(exactText))) {
				TouchAction ta = new TouchAction(appiumDriver);
				ta.press(200, 300).waitAction(Duration.ofSeconds(1)).moveTo(200, 450).release().perform();
				
			}
		} catch (SeleniumException e) {
			new WebDriverTestBase().getDriver().getTouchScreen().flick(0, (LFSUtilsIOS.getIntNum("400")));
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

		try {
			if (isElementPresent())
				((IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver())
						.findElement(By.xpath("//*[text()='Done' or @label='Done']")).click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	/*
	 * method to verify done button is present in keyboard
	 */
	public static boolean isElementPresent() {
		try {
			((IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver())
					.findElement(By.xpath("//*[text()='Done' or @label='Done']"));
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public static void swipeWithElements(QAFExtendedWebElement firstEle, QAFExtendedWebElement secondEle,Integer duration) {
		
		IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		TouchAction ta = new TouchAction(IOSDriver);
		if(LFSUtilsIOS.tryMethod(secondEle)){
			ta.press(firstEle.getCoordinates().onPage().getX(), firstEle.getCoordinates().onPage().getY()).
			waitAction(Duration.ofMillis(duration)).moveTo(secondEle.getCoordinates().onPage().getX(),
					secondEle.getCoordinates().onPage().getY()).release().perform();
		}else{
			while (!LFSUtilsIOS.tryMethod(secondEle)) {
				ta.press(firstEle.getCoordinates().onPage().getX(), firstEle.getCoordinates().onPage().getY()).
				waitAction(Duration.ofMillis(duration)).moveTo(firstEle.getCoordinates().onPage().getX(),
						firstEle.getCoordinates().onPage().getY()+200).release().perform();
			}	
		}
		
		
	}

	/**
	 * Method is used to swipe by co-ordinates
	 */
	public static void swipeWithCoordinates(int startx, int starty, int endx, int endy, Integer duration) {
		IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("start", ""+startx+","+starty+"");
		params.put("end", ""+endx+","+endy+"");
		params.put("duration", "3");
		Object res = IOSDriver.executeScript("mobile:touch:swipe", params);
	}
	
	public static void clickWithCoordinates(int startx, int starty, int endx, int endy, Integer duration) {
		IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("start", "" + startx + "," + starty + "");
		params.put("end", ""+endx+","+endy+"");
		params.put("duration", "3");
		Object res = IOSDriver.executeScript("mobile:touch:tap", params);
	}
			
			/**
			 * Method to click element using text OCR 
			 * 
			 */
	public static void clickWithText(String str) {
		IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
				
			Map<String, Object> params = new HashMap<>();
			params.put("label", str);
			params.put("threshold", 80);
			params.put("ignorecase", "nocase");
			Object res = IOSDriver.executeScript("mobile:button-text:click", params);
		
		}
	public static void selectText(String str) {
		IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		
	Map<String, Object> params = new HashMap<>();
	params.put("content", str);
	params.put("threshold", 80);
	Object select = IOSDriver.executeScript("mobile:text:select", params);
	}
	/**
	 * Method is used to swipe by percentage of screen
	 * start from percent of screen and in percent
	 */
	public static void swipeWithScreenPercent(int startxPer, int startyPer, int endxPer, int endyPer, Integer duration) {
		IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("start", ""+startxPer+"%,"+startyPer+"%");
		params.put("end", ""+endxPer+"%,"+endyPer+"%");
		params.put("duration", "3");
		Object res = IOSDriver.executeScript("mobile:touch:swipe", params);
	}
	

	/**
	 * Method is used to swipe by percentage of screen
	 * start from percent of screen and in percent
	 */
	public static void scrollDown(){
		LFSUtilsIOS lfs=new LFSUtilsIOS();
		JavascriptExecutor js = (JavascriptExecutor) lfs.getDriver();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
	}
	/**
	 * Method is used to swipe by percentage of screen
	 * start from percent of screen and in percent
	 */
	public static void scrollUp(){
		LFSUtilsIOS lfs=new LFSUtilsIOS();
		JavascriptExecutor js = (JavascriptExecutor) lfs.getDriver();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "up");
		js.executeScript("mobile: scroll", scrollObject);
	}

	/*
	 * method is used to return QAFWebElement appending text inside locator
	 */
	public static QAFWebElement getElement(String locKey, String eleText) {
		QAFWebElement buttonEle = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString(locKey), eleText, eleText));
		return buttonEle;
	}
	
	/*
	 * method is used to return QAFWebElement appending text inside locator
	 */
	public static QAFWebElement getElement(String locKey, String eleText,String eleText2) {
		QAFWebElement buttonEle = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString(locKey), eleText, eleText2));
		return buttonEle;
	}


	public static void pause(int milisecond) {
		try {
			Thread.sleep(milisecond);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub
		
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
	
	//Method to scroll picker using tap for date time picker
	public static void selectTimePicker(WebElement element,int value)
	{
		Point p1=element.getLocation();
		Dimension d1 =element.getSize();
		LFSUtilsIOS lfs=new LFSUtilsIOS();
		int hr = Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9]", ""));
		if (hr >= value) {
			while (!(Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9]", ""))==value)) {
				try {
					AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
					TouchAction tch=new TouchAction(appiumDriver);
					System.out.println("###################");
					tch.tap(p1.getX()+ d1.getWidth()/2, p1.getY() + ((d1.getHeight())/2)-58).perform();
				} catch (Exception e) {
				}
			}	
		}
		
		if (hr < value) {
			while (!(Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9]", ""))==value)) {
				try {
					AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
					TouchAction tch=new TouchAction(appiumDriver);
					tch.tap(p1.getX()+ d1.getWidth(), p1.getY() + ((d1.getHeight())/2)+50).perform();
				} catch (Exception e) {
				}
			}	
		}
	}
		
	//method to clear text field
	
	@FindBy(locator = "NFKios.keyBoard.delete.btn")
	private QAFWebElement NFKiosKeyBoardDeleteBtn;

	
	public QAFWebElement getNFKiosKeyBoardDeleteBtn() {
		return NFKiosKeyBoardDeleteBtn;
	}
	public static void clearTextField(WebElement element)
	{
		int count =0;
		 while (!(element.getAttribute("value").toString().replaceAll("[^a-zA-Z0-9]", "").length()==0)) {
		        pressDeleteKey(element);
		        
		        if (count==5)
		        	break;
		        count++;
		    }
	}
	public static void  pressDeleteKey(WebElement element){
		LFSUtilsIOS lfs=new LFSUtilsIOS();
		try{
			if(tryMethod(lfs.getNFKiosKeyBoardDeleteBtn())){
				lfs.getNFKiosKeyBoardDeleteBtn().click();
				lfs.getNFKiosKeyBoardDeleteBtn().click();
				lfs.getNFKiosKeyBoardDeleteBtn().click();
			}
			else{
				element.click();
				lfs.getNFKiosKeyBoardDeleteBtn().waitForPresent();
				lfs.getNFKiosKeyBoardDeleteBtn().click();
				lfs.getNFKiosKeyBoardDeleteBtn().click();
				lfs.getNFKiosKeyBoardDeleteBtn().click();
			}
		}
		catch(Exception e){
			
		}
		
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
	public static String monthNoOFDay(String month){
		
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
	//Method to get string from config file
	public static String getPropString(String key){
		return ConfigurationManager.getBundle().getProperty(key).toString();
	}
	
	public static void waitforLoad() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void switchToContext(RemoteWebDriver driver, String context) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(driver);
        Map<String,String> params = new HashMap<String,String>();
        params.put("name", context);
        executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
    }
	
	private String getCurrentContextHandle() {         
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(iosDriver);
        String context =  (String) executeMethod.execute(DriverCommand.GET_CURRENT_CONTEXT_HANDLE, null);
        return context;
    }
   private List<String> getContextHandles() {         
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(iosDriver);
        List<String> contexts =  (List<String>) executeMethod.execute(DriverCommand.GET_CONTEXT_HANDLES, null);
        return contexts;
    }

   public static void launchSettings() {
	   IOSDriver IOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		HashMap<String, Object> args = new HashMap<>();
		args.put("bundleId", "com.apple.Preferences");
		IOSDriver.executeScript("mobile: launchApp", args);
		Reporter.logWithScreenShot("Launch the Settings ",MessageTypes.Pass);
		 LFSUtilsIOS.waitforLoad();
   }
	
	//SG Turn Off WiFi

		public void turnOffWiFi() {
			launchSettings();
			  LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value=\"Wi-Fi\"]").click();
			  LFSUtilsIOS.waitforLoad();
				driver.findElementByXPath("//*[@class='XCUIElementTypeSwitch']").click();
			  closeApp();
			  new WebDriverWait(driver, 20);
				iosDriver.launchApp();
		}

	// SG Turn on Wifi

	public void turnOnWiFi() {
		launchSettings();
		  LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value=\"Wi-Fi\"]").click();
		  new WebDriverWait(driver, 20);
			driver.findElementByXPath("//*[@class='XCUIElementTypeSwitch']").click();
		  HashMap<String, Object> args = new HashMap<>();
			args.put("bundleId", "com.apple.Preferences");
			new WebDriverWait(driver, 20);	
	}

	// verify unit of measure for the country 
	//Return double value 
	public static double setValueUnitOfMeasure(double randomNumberGlucose) {
		double glucose = randomNumberGlucose;
		if (ConfigurationManager.getBundle().getString("countryname").contains("United Kingdom and Ireland")
				||ConfigurationManager.getBundle().getString("countryname").contains("Canada")) {
			System.out.println("##########   Inside mmol");
			glucose = randomNumberGlucose / 18;
			glucose=round(glucose);
		}else {
			
		}
		return glucose;
	}
	
	// verify unit of measure for the country 
	//Return int value 
	public static int setValueUnitOfMeasureInt(double randomNumberGlucose) {
		double glucose = randomNumberGlucose;
		if (ConfigurationManager.getBundle().getString("countryname").contains("United Kingdom and Ireland")
				||ConfigurationManager.getBundle().getString("countryname").contains("Canada")) {
			System.out.println("##########   Inside mmol");
			glucose = randomNumberGlucose / 18;
			glucose=round(glucose);
		}
		int gluco=(int) glucose;
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
	//Setting BG range from picker on setting page
	public static void selectBGRangePicker(WebElement element, double value) {
		Point p1 = element.getLocation();
		Dimension d1 = element.getSize();
		LFSUtilsIOS lfs = new LFSUtilsIOS();
		double hr = Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9.]]", ""));
		if (hr >= value) {
			AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
			TouchAction tch=new TouchAction(appiumDriver);
			while (!(Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9.]", "")) == value)) {
				try {
					tch.tap(p1.getX() + d1.getWidth(), p1.getY() + ((d1.getHeight()) / 2) - 70).perform();
				} catch (Exception e) {
				}
			}
		}
		if (hr < value) {
			AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
			TouchAction tch=new TouchAction(appiumDriver);
			while (!(Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9.]", "")) == value)) {
				try {
					tch.tap( p1.getX() + d1.getWidth(), p1.getY() + ((d1.getHeight()) / 2) + 70).perform();
				} catch (Exception e) {
				}
			}
		}
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

	public void swipeElement(QAFWebElement element, String direction){
		Map<String, Object> params = new HashMap<>();
		params.put("element", element);
		params.put("operation", direction);
		params.put("iteration", "2");
		Object result1 = driver.executeScript("mobile:touch:swipe", params);
	}
	public static String getDeviceInfo(String property){
		Map<String, Object> params = new HashMap<>();
		params.put("property", property);
		LFSUtilsIOS lfs=new LFSUtilsIOS();
		String popValue = (String) lfs.getDriver().executeScript("mobile:device:info", params);
		return popValue;
	}
	
	
	public  String dateBeforeCurrentDate(int numberOfDays) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - numberOfDays);
		Date myDate = cal.getTime();

		System.out.println(myDate.toString().substring(4, 11).replace("0", ""));
		return myDate.toString().substring(4, 11).replace("0", "");
	}
	
	public static String removeUTFCharacters(String data) {
		  Pattern p = Pattern.compile("\\\\u(\\p{XDigit}{4})");
		  Matcher m = p.matcher(data);
		  StringBuffer buf = new StringBuffer(data.length());
		  while (m.find()) {
		   String ch = String.valueOf((char) Integer.parseInt(m.group(1), 16));
		   m.appendReplacement(buf, Matcher.quoteReplacement(ch));
		  }
		  m.appendTail(buf);
		  return buf.toString();
		 }

	public void switchWebDriver() {
		switchToContext(iosDriver, "NATIVE_APP");
		iosDriver.launchApp();
		Reporter.logWithScreenShot("app launch");
		
	}
	public static void tapOnCordinates(String x, String y) {
		IOSDriver iOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("location", x+","+y);
		Object res = iOSDriver.executeScript("mobile:touch:tap", params);
	}
	public static void enterText(QAFWebElement ele, String str) {
		IOSDriver iOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("text", str);
		Object res = iOSDriver.executeScript("mobile:typetext", params);
		iOSDriver.getKeyboard().sendKeys(Keys.ENTER);
	}
	public static void entermiddleText(QAFWebElement ele, String str) {
		IOSDriver iOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("text", str);
		Object res = iOSDriver.executeScript("mobile:typetext", params);
		iOSDriver.getKeyboard().sendKeys(Keys.ENTER);
	}
	
	public static Object getElementInfo(String property, String value, String by) {
		IOSDriver iOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("property", property);
		params.put("value", value);
		params.put("by", by);
		Object res = iOSDriver.executeScript("mobile:application.element:info", params);
		return res;
	}
	public static Object findText(String str) {
		IOSDriver iOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("content", str);
		Object res = iOSDriver.executeScript("mobile:text:find", params);
		return res;
		}

	public static void appBackground() {
		IOSDriver iOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		iOSDriver.runAppInBackground(Duration.ofSeconds(-1));
		
	}
	public static QAFExtendedWebDriver getQAFDriver() {
		return new WebDriverTestBase().getDriver();
	}

	private static Map<String, String> getAppParams(String app, String by) {
		Map<String, String> params = new HashMap<String, String>();
		params.put(by, app);
		return params;
	}
	
	public void closeApp() {
		//IOSDriver iOSDriver = (IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		//params.put(byid, app);  
		params.put("identifier", "com.apple.Preferences");
		Object result1 = driver.executeScript("mobile:application:close", params);
	}
	public static void closeApp(String app, String by) {
		closeApp(app, by, false);
	}
	public static void closeApp(String app, String by, boolean ignoreExceptions) {

		try {
			getQAFDriver().executeScript("mobile:application:close", getAppParams(app, by));
		} catch (Exception e) {
			if (!ignoreExceptions) {

				throw e;
			}

		}
	}
	public static void startApp(String app, String by) {
		getQAFDriver().executeScript("mobile:application:open", getAppParams(app, by));
	}
	
public static void trustiOSAppCertificate(String certificateName) throws InterruptedException {
		
		switchToContext("NATIVE_APP");
		
		try {
			LFSUtilsIOS.closeApp("com.apple.Preferences", "identifier");
		} catch (Exception e) {}

		LFSUtilsIOS.startApp("com.apple.Preferences", "identifier");
		Thread.sleep(2000);
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@value='General']").click();
        
		//scroll the element
		Map<String, Object> params = new HashMap<>();
		params.put("start", "20%,60%");
		params.put("end", "15%,40%");
		params.put("duration", "2");
		Object res = LFSUtilsIOS.getQAFDriver().executeScript("mobile:touch:swipe", params);

		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name='ManagedConfigurationList']").click();

		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@name=" + "'" + certificateName + "'" + "]").click();

		try {
			LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[starts-with(@label,'Trust') and contains(@label,'LifeScan, Inc.')]").click();
		LFSUtilsIOS.getQAFDriver().findElementByXPath("//*[@label='Trust']").click();
		} catch (Exception e) {
			System.out.println("Looks Like Certificate already trusted. Exiting");
		}
		Thread.sleep(2000);
		LFSUtilsIOS.closeApp("com.apple.Preferences", "identifier");
	}

	
	
	
    private static void switchToContext(String context) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(getQAFDriver());
        Map<String,String> params = new HashMap<String,String>();
        params.put("name", context);
        executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
    }
}
