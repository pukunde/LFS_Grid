package com.NFK.version1.iOS.pages;



import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.android.beans.UserDetailBeans;
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

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;


public class CountryselectionPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFKios.countryselectionPage.next.btn")
	private QAFWebElement NFKiosCountryselectionpageNextBtn;
	@FindBy(locator = "NFKios.countryselectionPage.selectCountry.lbl")
	private QAFWebElement NFKiosCountryselectionpageSelectcountryLbl;
	@FindBy(locator = "NFKios.countryselectionPage.onetouch.img")
	private QAFWebElement NFKiosCountryselectionpageOnetouchImg;
	@FindBy(locator = "NFKios.countryselectionPage.whereLive.lbl")
	private QAFWebElement NFKiosCountryselectionpageWhereliveLbl;
	@FindBy(locator = "NFKios.countryselectionPage.iagree.btn")
	private QAFWebElement NFKiosCountryselectionPageIagreebtn;
	public QAFWebElement getNFKiosCountryselectionPageIagreebtn() {
		return NFKiosCountryselectionPageIagreebtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKiosCountryselectionpageNextBtn() {
		return NFKiosCountryselectionpageNextBtn;
	}

	public QAFWebElement getNFKiosCountryselectionpageSelectcountryLbl() {
		return NFKiosCountryselectionpageSelectcountryLbl;
	}

	public QAFWebElement getNFKiosCountryselectionpageOnetouchImg() {
		return NFKiosCountryselectionpageOnetouchImg;
	}

	public QAFWebElement getNFKiosCountryselectionpageWhereliveLbl() {
		return NFKiosCountryselectionpageWhereliveLbl;
	}

	public QAFWebElement getNFKiosCountryselectionpageStaticText(String text) {
		return LFSUtilsIOS.getElement("NFKios.countryselectionPage.staticText.lbl", text);
	}
	
	// Method to verify country selection page
	public void verifyCountrySelectionPage() {

		SignupPageIOS signup = new SignupPageIOS();
		try {
			signup.getNFKiosSignupPageNotificationAllowPopup().waitForPresent(5000);
			if (signup.getNFKiosSignupPageNotificationAllowPopup().isPresent()) {
				Reporter.logWithScreenShot("Notification pop up", MessageTypes.Pass);
				signup.getNFKiosSignupPageNotificationAllowPopup().click();
			} else {
				Reporter.logWithScreenShot("No notification pop up", MessageTypes.Pass);
			}
		} catch (Exception e) {
			
		}
			 
		getNFKiosCountryselectionpageSelectcountryLbl().waitForPresent();
		getNFKiosCountryselectionpageSelectcountryLbl()
				.verifyPresent("Select Country Label");
		getNFKiosCountryselectionpageOnetouchImg().verifyPresent("NFK image");
		getNFKiosCountryselectionpageWhereliveLbl()
				.verifyPresent("Where You live question");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.unitedState").toString())
						.verifyPresent("United States");
		//NFKIOS-6547 Remove Algeria from iOS		
		//getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
		//		.getProperty("country.cName.algeria").toString())
		//				.verifyPresent("Algeria");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.argentina").toString())
						.verifyPresent("Argentina");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.belgie").toString()).verifyPresent("Belgie");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.brasil").toString()).verifyPresent("Brasil");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.canada").toString()).verifyPresent("Canada");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.czech").toString())
						.verifyPresent("Česká republika");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.chile").toString()).verifyPresent("Chile");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.colombia").toString())
						.verifyPresent("Colombia");
		scrllToCountry(ConfigurationManager.getBundle()
				.getProperty("country.cName.france").toString());
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.deutschland").toString())
						.verifyPresent("Deutschland");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.spain").toString()).verifyPresent("Espana");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.france").toString()).verifyPresent("France");
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 10);
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.croatia").toString())
						.verifyPresent("Hrvatska");
		scrllToCountry(ConfigurationManager.getBundle()
				.getProperty("country.cName.osterreich").toString());
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.india").toString()).verifyPresent("India");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.italy").toString()).verifyPresent("Italia");
//		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
//				.getProperty("country.cName.hungary").toString())
//						.verifyPresent("Magyarország");
		 getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				 .getProperty("country.cName.mexico").toString()).verifyPresent("Mexico");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.osterreich").toString())
						.verifyPresent("Österreich");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.poland").toString()).verifyPresent("Polska");
		scrllToCountry(ConfigurationManager.getBundle().getProperty("country.cName.uk")
				.toString());
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.portugal").toString())
						.verifyPresent("Portugal");
		LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 10);
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.qatar").toString()).verifyPresent("Qatar");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.slovania").toString())
						.verifyPresent("Slovenija");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.uae").toString())
						.verifyPresent("United Arab Emirates");
		getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				.getProperty("country.cName.uk").toString())
						.verifyPresent("United Kingdom and Ireland");
		//Greece removed from release
		// getNFKiosCountryselectionpageStaticText(ConfigurationManager.getBundle()
				// .getProperty("country.cName.greece").toString()).verifyPresent("Ελλάδα");
	}
	
	
	//Method to click on single country and click on next
	
	
	public void selectCountry(String countryName) {
		 try {
			 Thread.sleep(5000);
			 SignupPageIOS signup=new SignupPageIOS();
			 
			 try {
				 if (signup.getNFKiosSignupPageNotificationAllowPopup().isPresent()) {
					 Reporter.logWithScreenShot("Notification pop up",MessageTypes.Pass);
					 signup.getNFKiosSignupPageNotificationAllowPopup().click();
				 } else {
					 Reporter.logWithScreenShot("No notification pop up",
							 MessageTypes.Pass);
				}
				
			 } catch (Exception e) {
			}
			 
			  getNFKiosCountryselectionpageSelectcountryLbl().waitForPresent(5000);
			  } catch (Exception e) {
			  }
		 
		if (getNFKiosCountryselectionpageSelectcountryLbl().isPresent())
		{
			
			scrllToCountry(countryName);
		    LFSUtilsIOS.pause(1000);
			getNFKiosCountryselectionpageStaticText(countryName).click();
			LFSUtilsIOS jnj=new LFSUtilsIOS();
			AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase()
					.getDriver().getUnderLayingDriver());
			TouchAction tch=new TouchAction(appiumDriver);
			tch.tap(getNFKiosCountryselectionpageStaticText(countryName));
			
			Reporter.logWithScreenShot(countryName+" is selected",MessageTypes.Pass);
			getNFKiosCountryselectionpageNextBtn().waitForEnabled();
			getNFKiosCountryselectionpageNextBtn().click();
			
		} else {
			Reporter.logWithScreenShot("Country is already selected",MessageTypes.Pass);
		}

		try {
			getNFKiosCountryselectionPageIagreebtn().waitForPresent(10000);
			if (getNFKiosCountryselectionPageIagreebtn().isPresent()) {
				Reporter.logWithScreenShot(countryName+ " country terms page",MessageTypes.Pass);
				getNFKiosCountryselectionPageIagreebtn().click();
			}
		} catch (Exception e) {
			
		}
}
		
	
	
	// method to scroll for specific country
	public void scrllToCountry(String countryName) {
		int count=0;
		while (!LFSUtilsIOS.tryMethod(getNFKiosCountryselectionpageStaticText(countryName)))
		{
			//LFSUtilsIOS.swipeWithCoordinates(476, 600, 443, 300, 10);
			//LFSUtilsIOS.scrollDown();
			LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);
			System.out.println("swipe with co-ordinate.------------");
			if (count == 10)
				break;
			count++;
		}
		
	}
	
		
	public void startSettingActivity() {
		IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();
		DeviceSettingsPageIOS deviceSettings = new DeviceSettingsPageIOS();		
		Map<String, Object> params = new HashMap<>();
		params.put("name", "Settings");
		try {
			iosDriver.executeScript("mobile:application:open", params);
			Reporter.logWithScreenShot("Device Settings launched1", MessageTypes.Pass);
			iosDriver.executeScript("mobile:application:close", params);
			Reporter.logWithScreenShot("Device Settings closed1", MessageTypes.Pass);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		iosDriver.executeScript("mobile:application:open", params);
		Reporter.logWithScreenShot("Device Settings launched", MessageTypes.Pass);
		deviceSettings.setDateAndTime();
			
	}

	public void closeSettingActivity() {
		IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();
		Map<String, Object> params = new HashMap<>();
		params.put("name", "Settings");
		try {
			iosDriver.executeScript("mobile:application:close", params);
		} catch (Exception e) {
		}
		
		Reporter.logWithScreenShot("Device Settings launched" , MessageTypes.Pass);
		
	}
	

}
