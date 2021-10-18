package com.NFK.web.common.pages;

import com.NFK.support.LFSUtilsAndroid;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.core.TestBaseProvider;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.AppiumDriver;

public class LoginPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "text.home.page.username")
	private QAFWebElement username;

	@FindBy(locator = "text.home.page.password")
	private QAFWebElement password;

	@FindBy(locator = "btn.home.page.login")
	private QAFWebElement login;

	@FindBy(locator = "chkbx.iagree.page.accept")
	private QAFWebElement chkbxIagreePageAccept;

	@FindBy(locator = "subscriptionlink.select")
	private QAFWebElement subscriptionlinkSelect;

	@FindBy(locator = "loginform.username.txt")
	private QAFWebElement loginformUsernameTxt;

	@FindBy(locator = "loginform.password.txt")
	private QAFWebElement loginformPasswordTxt;

	@FindBy(locator = "loginform.signin.btn")
	private QAFWebElement loginformSigninBtn;

	@FindBy(locator = "authorize.user.btn")
	private QAFWebElement authorizeUserBtn;

	@FindBy(locator = "token_body")
	private QAFWebElement tokenbody;

	@FindBy(locator = "text.home.page.username")
	private QAFWebElement textHomePageUsername;

	@FindBy(locator = "text.home.page.password")
	private QAFWebElement textHomePagePassword;

	@FindBy(locator = "btn.home.page.login")
	private QAFWebElement btnHomePageLogin;

	@FindBy(locator = "logbook.tab")
	private QAFWebElement logbookTab;

	@FindBy(locator = "logbook.unit.lbl")
	private QAFWebElement logbookUnitLbl;

	@FindBy(locator = "logbook.addevent.btn")
	private QAFWebElement logbookAddEventBtn;

	@FindBy(locator = "subscription.text.fld")
	private QAFWebElement subscriptionTextFld;

	@FindBy(locator = "event.food.add.btn")
	private QAFWebElement eventFoodAddBtn;

	@FindBy(locator = "event.food.add.time.txt")
	private QAFWebElement eventFoodAddTimeTxt;

	@FindBy(locator = "event.food.type.dropdown")
	private QAFWebElement eventFoodTypeDropdown;

	@FindBy(locator = "event.food.type.dropdown.value")
	private QAFWebElement eventFoodTypeDropdownValue;

	@FindBy(locator = "event.food.value.txt")
	private QAFWebElement eventFoodValueTxt;

	@FindBy(locator = "event.food.description.txt")
	private QAFWebElement eventFoodDescriptionTxt;

	@FindBy(locator = "event.food.addevent.btn")
	private QAFWebElement eventFoodAddEventBtn;

	@FindBy(locator = "event.added.successfully.lbl")
	private QAFWebElement eventAddedSuccessfullyLbl;

	@FindBy(locator = "event.added.values.verification.txt")
	private QAFWebElement eventAddedValuesVerificationTxt;

	@FindBy(locator = "loginform.registration.link")
	private QAFWebElement loginformRegistrationLink;

	@FindBy(locator = "connections.link")
	private QAFWebElement connectionsLink;

	@FindBy(locator = "seetings.link")
	private QAFWebElement seetingsLink;

	@FindBy(locator = "logbook.msg")
	private QAFWebElement logbookMsg;

	public QAFWebElement getEventAddedValuesVerificationTxt() {
		return eventAddedValuesVerificationTxt;
	}

	public QAFWebElement getEventAddedSuccessfullyLbl() {
		return eventAddedSuccessfullyLbl;
	}

	public void setEventAddedSuccessfullyLbl(QAFWebElement eventAddedSuccessfullyLbl) {
		this.eventAddedSuccessfullyLbl = eventAddedSuccessfullyLbl;
	}

	public QAFWebElement getEventFoodAddBtn() {
		return eventFoodAddBtn;
	}

	public void setEventFoodAddBtn(QAFWebElement eventFoodAddBtn) {
		this.eventFoodAddBtn = eventFoodAddBtn;
	}

	public QAFWebElement getEventFoodAddTimeTxt() {
		return eventFoodAddTimeTxt;
	}

	public void setEventFoodAddTimeTxt(QAFWebElement eventFoodAddTimeTxt) {
		this.eventFoodAddTimeTxt = eventFoodAddTimeTxt;
	}

	public QAFWebElement getEventFoodTypeDropdown() {
		return eventFoodTypeDropdown;
	}

	public void setEventFoodTypeDropdown(QAFWebElement eventFoodTypeDropdown) {
		this.eventFoodTypeDropdown = eventFoodTypeDropdown;
	}

	public QAFWebElement getEventFoodTypeDropdownValue() {
		return eventFoodTypeDropdownValue;
	}

	public void setEventFoodTypeDropdownValue(QAFWebElement eventFoodTypeDropdownValue) {
		this.eventFoodTypeDropdownValue = eventFoodTypeDropdownValue;
	}

	public QAFWebElement getEventFoodValueTxt() {
		return eventFoodValueTxt;
	}

	public void setEventFoodValueTxt(QAFWebElement eventFoodValueTxt) {
		this.eventFoodValueTxt = eventFoodValueTxt;
	}

	public QAFWebElement getEventFoodDescriptionTxt() {
		return eventFoodDescriptionTxt;
	}

	public void setEventFoodDescriptionTxt(QAFWebElement eventFoodDescriptionTxt) {
		this.eventFoodDescriptionTxt = eventFoodDescriptionTxt;
	}

	public QAFWebElement getEventFoodAddEventBtn() {
		return eventFoodAddEventBtn;
	}

	public void setEventFoodAddEventBtn(QAFWebElement eventFoodAddEventBtn) {
		this.eventFoodAddEventBtn = eventFoodAddEventBtn;
	}

	public QAFWebElement getLogbookAddEventBtn() {
		return logbookAddEventBtn;

	}

	public void setLogbookAddEventBtn(QAFWebElement logbookAddEventBtn) {
		this.logbookAddEventBtn = logbookAddEventBtn;
	}

	public QAFWebElement getSubscriptionTextFld() {
		return subscriptionTextFld;
	}

	public void setSubscriptionTextFld(QAFWebElement subscriptionTextFld) {
		this.subscriptionTextFld = subscriptionTextFld;
	}

	public QAFWebElement getLogbookUnitLbl() {
		return logbookUnitLbl;
	}

	public void setLogbookUnitLbl(QAFWebElement logbookUnitLbl) {
		this.logbookUnitLbl = logbookUnitLbl;
	}

	public QAFWebElement getusername() {
		return username;
	}

	public QAFWebElement getpassword() {
		return password;
	}

	public QAFWebElement getloginbtn() {
		return login;
	}

	public QAFWebElement getUsername() {
		return username;
	}

	public QAFWebElement getPassword() {
		return password;
	}

	public QAFWebElement getLogin() {
		return login;
	}

	public QAFWebElement getTokenbody() {
		return tokenbody;
	}

	public QAFWebElement getLoginformRegistrationLink() {
		return loginformRegistrationLink;
	}

	@Override
	public void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		driver.get("http://otraws.cl.datapipe.net/test/externalsite.php");
		waitForPageToLoad();
		driver.manage().window().maximize();

	}

	public void selectSubscriptSite() {
		getSubscriptionlinkSelect().waitForPresent();
		getSubscriptionlinkSelect().click();

	}

	public QAFWebElement getChkbxIagreePageAccept() {
		return chkbxIagreePageAccept;
	}

	public QAFWebElement getSubscriptionlinkSelect() {
		return subscriptionlinkSelect;
	}

	public QAFWebElement getLoginformUsernameTxt() {
		return loginformUsernameTxt;
	}

	public QAFWebElement getLoginformPasswordTxt() {
		return loginformPasswordTxt;
	}

	public QAFWebElement getLoginformSigninBtn() {
		return loginformSigninBtn;
	}

	public QAFWebElement getAuthorizeUserBtn() {
		return authorizeUserBtn;
	}

	public void doLoginWithCred() {
		if (LFSUtilsAndroid.tryDisplayMethod(getChkbxIagreePageAccept()))
			getChkbxIagreePageAccept().click();
		if (LFSUtilsAndroid.tryDisplayMethod(getusername())) {
			getusername().sendKeys("taslim");
			getpassword().sendKeys("abcd123#");
			//getLoginformSigninBtn().click();
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", getLoginformSigninBtn());
		}
		// waitForPageToLoad();
		// if(getAuthorizeUserBtn().isPresent()){
		//getAuthorizeUserBtn().click();
		// }
	}

	public void switchDriverToWeb() {
		TestBaseProvider.instance().get().setDriver("chromeDriver");
		QAFWebDriver driver = new WebDriverTestBase().getDriver();
		driver.get("http://dev.symcare.cl.datapipe.net");
		ConfigurationManager.getBundle().setProperty("WEB_DRIVER_INSTANCE", driver);
		// TestBaseProvider.instance().get().setDriver("chromeDriver");
		driver = (QAFWebDriver) ConfigurationManager.getBundle()
				.getProperty("WEB_DRIVER_INSTANCE");
		driver.get("http://dev.symcare.cl.datapipe.net");
	}

	public void switchDriver() {
		QAFWebDriver driver = new WebDriverTestBase().getDriver();
		//		driver.get("");
		ConfigurationManager.getBundle().setProperty("WEB_DRIVER_INSTANCE", driver);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"
				+ TestBaseProvider.instance().get().getBrowser());
		TestBaseProvider.instance().get().setDriver("AppiumDriver");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"
				+ TestBaseProvider.instance().get().getBrowser());
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver()
				.getUnderLayingDriver());
		String baseURL =
				"https://jnjdiabetes.perfectomobile.com/nexperience/perfectomobile/wd/hub";

		ConfigurationManager.getBundle().setProperty("env.baseurl", baseURL);

		appiumDriver.launchApp();

	}

	public QAFWebElement getConnectionsLink() {
		return connectionsLink;
	}

	public QAFWebElement getSeetingsLink() {
		return seetingsLink;
	}

	public void clickOnConnections() {
		getSeetingsLink().waitForPresent();
		getSeetingsLink().click();
		getConnectionsLink().waitForPresent();
		getConnectionsLink().click();

	}

	public QAFWebElement getLogbookMsg() {
		return logbookMsg;
	}
	public QAFWebElement getLogbookTab() {
		return logbookTab;
	}
	public void clickOnLogbookTab()
	{
		getLogbookTab().waitForPresent();
		getLogbookTab().click();
	}
	
	public void verifyLogbookData()
	{
		
		getLogbookMsg().verifyPresent("Thereis no Data available");
			
	}
}
