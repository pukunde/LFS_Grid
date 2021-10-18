package com.NFK.version1.android.pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.Assert;

import com.NFK.support.ConstantUtils;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsAndroid;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;


public class HelpPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.moremenu.helppage.help.lbl")
	private QAFWebElement NFKMoremenuHelppageHelpLbl;
	@FindBy(locator = "NFK.moremenu.helppage.search.txt")
	private QAFWebElement NFKMoremenuHelppageSearchTxt;
	@FindBy(locator = "NFK.moremenu.helppage.search.btn")
	private QAFWebElement NFKMoremenuHelppageSearchBtn;
	@FindBy(locator = "NFK.moremenu.helppage.introduction.btn")
	private QAFWebElement NFKMoremenuHelppageIntroductionBtn;
	@FindBy(locator = "NFK.moremenu.helppage.gettingstarted.btn")
	private QAFWebElement NFKMoremenuHelppageGettingstartedBtn;
	@FindBy(locator = "NFK.moremenu.helppage.appoverview.btn")
	private QAFWebElement NFKMoremenuHelppageAppoverviewBtn;
	@FindBy(locator = "NFK.moremenu.helppage.home.btn")
	private QAFWebElement NFKMoremenuHelppageHomeBtn;
	@FindBy(locator = "NFK.moremenu.helppage.logbook.btn")
	private QAFWebElement NFKMoremenuHelppageLogbookBtn;
	@FindBy(locator = "NFK.moremenu.helppage.patterns.btn")
	private QAFWebElement NFKMoremenuHelppagePatternsBtn;
	@FindBy(locator = "NFK.moremenu.helppage.graphs.btn")
	private QAFWebElement NFKMoremenuHelppageGraphsBtn;
	@FindBy(locator = "NFK.moremenu.helppage.aboutme.btn")
	private QAFWebElement NFKMoremenuHelppageAboutmeBtn;
	@FindBy(locator = "NFK.moremenu.helppage.tutorial.btn")
	private QAFWebElement NFKmoremenuhelppagetutorialbtn;
	@FindBy(locator = "NFK.moremenu.helppage.insulinMentor.btn")
	private QAFWebElement NFKMoremenuHelppageinsulinMentorBtn;
	@FindBy(locator = "NFK.moremenu.helppage.reminders.btn")
	private QAFWebElement NFKMoremenuHelppageRemindersBtn;
	@FindBy(locator = "NFK.moremenu.helppage.account.btn")
	private QAFWebElement NFKMoremenuHelppageAccountBtn;
	@FindBy(locator = "NFK.moremenu.helppage.help.btn")
	private QAFWebElement NFKMoremenuHelppageHelpBtn;
	@FindBy(locator = "NFK.moremenu.helppage.contactus.btn")
	private QAFWebElement NFKMoremenuHelppageContactusBtn;
	@FindBy(locator = "NFK.moremenu.helppage.tosandpp.btn")
	private QAFWebElement NFKMoremenuHelppageTosandppBtn;
	@FindBy(locator = "NFK.moremenu.helppage.troubleshooting.btn")
	private QAFWebElement NFKMoremenuHelppageTroubleshootingBtn;
	@FindBy(locator = "NFK.moremenu.helppage.hcp.btn")
	private QAFWebElement NFKMoremenuHelppageHcpBtn;
	@FindBy(locator = "NFK.moremenu.helppage.about.btn1")
	private QAFWebElement NFKMoremenuHelppageAboutBtn1;
	@FindBy(locator = "NFK.moremenu.helppage.statictext.txt")
	private QAFWebElement NFKMoremenuHelppageStatictextTxt;
	@FindBy(locator = "NFK.moremenu.helppage.InsulinMentor.OneTouch.txt")
	private QAFWebElement NFKMoremenuHelppageInsulinmentorOnetouchTxt;
	@FindBy(locator = "NFK.moremenu.helppage.InsulinMentor.UsingTheInsulin.txt")
	private QAFWebElement NFKMoremenuHelppageInsulinmentorUsingtheinsulinTxt;
	@FindBy(locator = "NFK.moremenu.helppage.InsulinMentor.FAQ.txt")
	private QAFWebElement NFKMoremenuHelppageInsulinmentorFaqTxt;
	@FindBy(locator = "NFK.moremenu.helppage.InsulinMentor.Terminology.txt")
	private QAFWebElement NFKMoremenuHelppageInsulinmentorTerminologyTxt;
	@FindBy(locator = "NFK.moremenu.helppage.InsulinMentor.Setting.txt")
	private QAFWebElement NFKMoremenuHelppageInsulinmentorSettingTxt;
	@FindBy(locator = "NFK.moremenu.helppage.InsulinMentor.txt")
	private QAFWebElement NFKMoremenuHelppageInsulinmentorTxt;

	@FindBy(locator="NFK.moremenu.helppage.safteyonboarding.btn")
	private QAFWebElement NFKMoremenuHelppageSafteyonboardingBtn;
	@FindBy(locator="NFK.moremenu.helppage.sensor.btn")
	private QAFWebElement NFKMoremenuHelppageSensorBtn;
	@FindBy(locator="NFK.moremenu.helppage.apptour.btn")
	private QAFWebElement NFKMoremenuHelppageApptourBtn;
	@FindBy(locator="NFK.moremenu.helppage.appuserguide.btn")
	private QAFWebElement NFKMoremenuHelppageAppuserguideBtn;
	@FindBy(locator="NFK.moremenu.helppage.about.btn")
	private QAFWebElement NFKMoremenuHelppageAboutBtn;
	@FindBy(locator="NFK.moremenu.helppage.license.btn")
	private QAFWebElement NFKMoremenuHelppageLicenseBtn;
	@FindBy (locator="NFK.moremenu.helppage.help.options")
	private List<QAFWebElement> NFKMoremenuHelppageHelpOptions;
	@FindBy(locator="NFK.moremenu.helppage.skip.btn")
	private QAFWebElement NFKMoremenuHelppageSkipBtn;
	@FindBy(locator="NFK.moremenu.helppage.title.lbl")
	private QAFWebElement NFKMoremenuHelppageTitleLbl;
	@FindBy(locator="NFK.moremenu.helppage.sensorapp.options")
	private List<QAFWebElement> NFKMoremenuHelppageSensorappOptions;
	@FindBy(locator="NFK.moremenu.helppage.sensorapp.done.btn")
	private QAFWebElement NFKMoremenuHelppageSensorappDoneBtn;
	@FindBy(locator="NFK.moremenu.helppage.license.back.btn")
	private QAFWebElement NFKMoremenuHelppageLicenseBackBtn;
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public List<QAFWebElement> getNFKMoremenuHelppageSensorappOptions(){
		return NFKMoremenuHelppageSensorappOptions;
	}
	public QAFWebElement getNFKMoremenuHelppageLicenseBackBtn() {
		return NFKMoremenuHelppageLicenseBackBtn;
	}
	public QAFWebElement getNFKMoremenuHelppageSensorappDoneBtn() {
		return NFKMoremenuHelppageSensorappDoneBtn;
	}
	public List<QAFWebElement> getNFKMoremenuHelppageHelpOptions(){
		return NFKMoremenuHelppageHelpOptions;
	}
	public QAFWebElement getNFKMoremenuHelppageSafteyonboardingBtn() {
		return NFKMoremenuHelppageSafteyonboardingBtn;
	}
	public QAFWebElement getNFKMoremenuHelppageSensorBtn() {
		return NFKMoremenuHelppageSensorBtn;
	}
	public QAFWebElement getNFKMoremenuHelppageApptourBtn() {
		return NFKMoremenuHelppageApptourBtn;
	} 
	public QAFWebElement getNFKMoremenuHelppageTitleLbl() {
		return NFKMoremenuHelppageTitleLbl;
	}
	public QAFWebElement getNFKMoremenuHelppageSkipBtn() {
		return NFKMoremenuHelppageSkipBtn;
	}
	public QAFWebElement getNFKMoremenuHelppageAppuserguideBtn() {
		return NFKMoremenuHelppageAppuserguideBtn;
	}
	public QAFWebElement getNFKMoremenuHelppageAboutBtn() {
		return NFKMoremenuHelppageAboutBtn;
	}
	public QAFWebElement getNFKMoremenuHelppageLicenseBtn() {
		return NFKMoremenuHelppageLicenseBtn;
	}
	
	public QAFWebElement getNFKmoremenuhelppagehelplbl() {
		return NFKMoremenuHelppageHelpLbl;
	}

	public QAFWebElement getNFKmoremenuhelppagesearchtxt() {
		return NFKMoremenuHelppageSearchTxt;
	}

	public QAFWebElement getNFKmoremenuhelppagesearchbtn() {
		return NFKMoremenuHelppageSearchBtn;
	}

	public QAFWebElement getNFKmoremenuhelppageintroductionbtn() {
		return NFKMoremenuHelppageIntroductionBtn;
	}

	public QAFWebElement getNFKmoremenuhelppagegettingstartedbtn() {
		return NFKMoremenuHelppageGettingstartedBtn;
	}

	public QAFWebElement getNFKmoremenuhelppageappoverviewbtn() {
		return NFKMoremenuHelppageAppoverviewBtn;
	}

	public QAFWebElement getNFKmoremenuhelppagehomebtn() {
		return NFKMoremenuHelppageHomeBtn;
	}

	public QAFWebElement getNFKmoremenuhelppagelogbookbtn() {
		return NFKMoremenuHelppageLogbookBtn;
	}

	public QAFWebElement getNFKmoremenuhelppagepatternsbtn() {
		return NFKMoremenuHelppagePatternsBtn;
	}

	public QAFWebElement getNFKmoremenuhelppagegraphsbtn() {
		return NFKMoremenuHelppageGraphsBtn;
	}

	public QAFWebElement getNFKmoremenuhelppageaboutmebtn() {
		return NFKMoremenuHelppageAboutmeBtn;
	}

	public QAFWebElement getNFKmoremenuhelppagetutorialbtn() {
		return NFKmoremenuhelppagetutorialbtn;
	}

	public QAFWebElement getNFKmoremenuhelppageinsulinMentorbtn() {
		return NFKMoremenuHelppageinsulinMentorBtn;
	}

	public QAFWebElement getNFKmoremenuhelppageremindersbtn() {
		return NFKMoremenuHelppageRemindersBtn;
	}

	public QAFWebElement getNFKmoremenuhelppageaccountbtn() {
		return NFKMoremenuHelppageAccountBtn;
	}

	public QAFWebElement getNFKmoremenuhelppagehelpbtn() {
		return NFKMoremenuHelppageHelpBtn;
	}

	public QAFWebElement getNFKmoremenuhelppagecontactusbtn() {
		return NFKMoremenuHelppageContactusBtn;
	}

	public QAFWebElement getNFKmoremenuhelppagetosandppbtn() {
		return NFKMoremenuHelppageTosandppBtn;
	}

	public QAFWebElement getNFKmoremenuhelppagetroubleshootingbtn() {
		return NFKMoremenuHelppageTroubleshootingBtn;
	}

	public QAFWebElement getNFKmoremenuhelppagehcpbtn() {
		return NFKMoremenuHelppageHcpBtn;
	}

	public QAFWebElement getNFKmoremenuhelppageaboutbtn() {
		return NFKMoremenuHelppageAboutBtn;
	}

	public QAFWebElement getNFKMoremenuHelppageStatictextTxt(String text) {
		return LFSUtilsAndroid.getElement("NFK.moremenu.helppage.dynamic.txt", text);
	}
	
	public QAFWebElement getNFKMoremenuHelppageInsulinmentorOnetouchTxt() {
		return NFKMoremenuHelppageInsulinmentorOnetouchTxt;
	}

	public QAFWebElement getNFKMoremenuHelppageInsulinmentorUsingtheinsulinTxt() {
		return NFKMoremenuHelppageInsulinmentorUsingtheinsulinTxt;
	}

	public QAFWebElement getNFKMoremenuHelppageInsulinmentorFaqTxt() {
		return NFKMoremenuHelppageInsulinmentorFaqTxt;
	}

	public QAFWebElement getNFKMoremenuHelppageInsulinmentorTerminologyTxt() {
		return NFKMoremenuHelppageInsulinmentorTerminologyTxt;
	}

	public QAFWebElement getNFKMoremenuHelppageInsulinmentorSettingTxt() {
		return NFKMoremenuHelppageInsulinmentorSettingTxt;
	}

	public QAFWebElement getNFKMoremenuHelppageInsulinmentorTxt() {
		return NFKMoremenuHelppageInsulinmentorTxt;
	}

	//Method to verify Help page options on help page
	public void verifyHelpPageOptions() {
		getNFKmoremenuhelppagehelplbl().waitForPresent();
		Reporter.logWithScreenShot("Help Page available menus on first page", MessageTypes.Pass);
		getNFKMoremenuHelppageSafteyonboardingBtn().assertPresent("Saftey Onboarding");
		getNFKMoremenuHelppageSensorBtn().assertPresent("Sensor Button");
		getNFKMoremenuHelppageApptourBtn().assertPresent("App tour Button");
		getNFKMoremenuHelppageAppuserguideBtn().assertPresent("App User guide");
		getNFKMoremenuHelppageAboutBtn().assertPresent("About tab");
		getNFKMoremenuHelppageLicenseBtn().assertPresent("License button");
		

	}

	// Method to verify Introduction Help page
	public void verifyHelpIntroductionPage() {
		if (getNFKmoremenuhelppageintroductionbtn().isPresent()) {
			getNFKmoremenuhelppageintroductionbtn().click();
		}
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_OTR_MOBILE_APP).verifyPresent("OneTouch Reveal® mobile app");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_SUPPORT_DEVICE)
				.verifyPresent("Supported Devices and System Requirements");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_ANDROID)
				.verifyPresent("Android");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_GOOGLE_PAY)
		.verifyPresent("Google Play");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_BLUETOOTH)
				.verifyPresent("Bluetooth® Trademark"); //Bluetooth® Trademark
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_INTENDED_USE).verifyPresent("Intended Use");
	}

	// Method to verify Supported Devices help page
	public void verifySupportedDevicePage() {

		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_SUPPORT_DEVICE).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_SUPPORT_DEVICE)
				.verifyPresent("Supported Devices and Systems is present");
		LFSUtilsAndroid.clickBackButton();
	}

	// Method to verify Apple Legal notice page
	public void verifyAppleLegalNoticePage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_APPLE_LEGAL_NOTICE).click();

		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_APPLE_LEGAL_NOTICE)
				.verifyPresent("Apple Legal Notice is present");
		LFSUtilsAndroid.clickBackButton();
	}

	// Method to verify Bluetooth Trademark page
	public void verifyBluetoothTrademarkPage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_BLUETOOTH).click();

		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_BLUETOOTH)
				.verifyPresent("Bluetooth Trademark is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	// Method to verify Intended Use help page
	public void verifyIntendedage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_INTENDED_USE).click();

		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_INTENDED_USE)
				.verifyPresent("Intended Use is present");
		LFSUtilsAndroid.clickBackButton();
	}

	// Method to verify Getting Started Help sub page
	public void verifyGettingStartedPage() {
		getNFKmoremenuhelppagegettingstartedbtn().click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_GETSRT)
				.verifyPresent("Getting Started button is present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_CREATE_ACCOUNT)
				.verifyPresent("Create Account button is Present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_PAIRING)
				.verifyPresent("Pairing button is present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_GENERAL_INSTRUCTIONS)
				.verifyPresent("General Instructions for Pairing your devices is present");

	}

	//Method to verify Getting Started help page
	public void verifyGettingStartedGettingStartedPage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_GETSRT).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_GETSRT)
				.verifyPresent("Getting Started Help subpage is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	//Method to verify Create Account help page
	public void verifyGettingStartedCreateAccountPage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_CREATE_ACCOUNT).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_CREATE_ACCOUNT)
				.verifyPresent("Create Account Help page is displayed");
		LFSUtilsAndroid.clickBackButton();

	}

	//Method to verify Pairing meter help page
	public void verifyGettingStartedPairingPage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_PAIRING).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_PAIRING)
				.verifyPresent("Pairing Help page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	//Method to verify General Instruction help page
	public void verifyGeneralPage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_GENERAL_INSTRUCTIONS).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_GENERAL_INSTRUCTIONS)
				.verifyPresent("General Instructions for Pairing your meter is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	//Method to verify Overview help page
	public void appOverviewMenuPage() {
		getNFKmoremenuhelppageappoverviewbtn().click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_DATA_SYNCHRONISATION)
				.verifyPresent("Data Synchronisation button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_ICONS_USED)
				.verifyPresent("Symbols and icons used in app");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_METER_SYNC)
				.verifyPresent("Syncing your meter");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_NAVIGATION)
				.verifyPresent("Navigation Menu");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_SPECIAL_MESSAGES)
				.verifyPresent("Special Messages");
	}

	//Method to verify Symbol n Icon Help page
	public void verifySymbolIconHelpPage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_ICONS_USED).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_ICONS_USED)
				.verifyPresent("Symbols and Icons used in App help page is displaye");
		LFSUtilsAndroid.clickBackButton();

	}

	//Method to verify Navigation Help menu
	public void verifyNavigationHelpMenu() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_NAVIGATION).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_NAVIGATION)
				.verifyPresent("Navigation Menu is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	//Method to verify meter syncing help page
	public void verifyMeterSyncingHelpPage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_METER_SYNC).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_METER_SYNC)
				.verifyPresent("Syncing Your meter page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	//Method to verify sepcial message help page
	public void verifySpecialMessagePage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_SPECIAL_MESSAGES).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_SPECIAL_MESSAGES)
				.verifyPresent("Special Message is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	//Method to verify Synchronisation Data help page.
	public void verifySynchronizingDataPage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_DATA_SYNCHRONISATION).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_DATA_SYNCHRONISATION)
				.verifyPresent("Synchronizing data across multiple compatible wireless devices is displayed");
		LFSUtilsAndroid.clickBackButton();
	}


	// Method for logbook all option verification
	public void clickOnAppLogbookHelp() {
		getNFKmoremenuhelppagelogbookbtn().click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_LOGBOOK)
				.verifyPresent("Logbook help button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_DATA)
				.verifyPresent("Viewing/Adding Data button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_EACHDAY)
				.verifyPresent("Viewing and adding detail for each day button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_PATTERN)
				.verifyPresent("View pattern from logbook button");

	}

	//Method to verify Logbook view date help page
	public void verifyHelpLogbokLogbookViewdatepage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_NAVIGATION_LOGBOOK).click();
		Reporter.logWithScreenShot("Logbook logbook help ", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	//Method to verify view Add data help page
	public void verifyLogbookViewAddDataPage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_DATA).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_DATA)
				.verifyPresent("Viewing/Adding data page is displayed");
		LFSUtilsAndroid.clickBackButton();

	}

	//Method to verify adding each day BG reading help page
	public void verifyHelpLogbookAddingEachdayBGPage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_EACHDAY).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_EACHDAY)
				.verifyPresent("Logbook viewing and adding each day page is displayed");
		LFSUtilsAndroid.clickBackButton();

	}

	//Method to verify view patterns help page
	public void verifyHelpLogbookViewingPetternPage() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_PATTERN).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_PATTERN)
				.verifyPresent("Viewing patterns page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnAppPatternsHelp() {
		getNFKmoremenuhelppagepatternsbtn().click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_PATTERNS_DETECTING_PATTERNS)
				.verifyPresent("Detecting patterns present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_PATTERNS_VIEWING_PATTERN_DETAILS)
				.verifyPresent("Viewing patterns present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_RECEIVING_PATTERN_MESSAGES)
				.verifyPresent("Receiving pattern messages present");
	}

	public void verifyHelpPatternsDetctingPatterns() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_PATTERNS_DETECTING_PATTERNS).click();
		Reporter.logWithScreenShot("detecting patterns page", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifyHelpPatternsViewingPatterns() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_PATTERNS_VIEWING_PATTERN_DETAILS).click();
		Reporter.logWithScreenShot("viewing patterns page", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifyHelpPatternsReceivingPatternMessages() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_RECEIVING_PATTERN_MESSAGES).click();
		Reporter.logWithScreenShot("receiving pattern messages page", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnMoreMenuReminders() {
		getNFKmoremenuhelppageremindersbtn().click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_REMINDERS)
				.verifyPresent("Reminders present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_ADDING_A_REMINDER)
				.verifyPresent("Adding a reminder present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_DELETING_REMINDERS)
				.verifyPresent("Deleting reminders present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_RECEIVING_REMINDERS)
				.verifyPresent("Receiving reminders present");
	}

	public void clickOnRemindersReminders() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_REMINDERS).click();
		Reporter.logWithScreenShot("reminders page", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnRemindersAddingAReminder() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_ADDING_A_REMINDER).click();
		Reporter.logWithScreenShot("adding a reminder page", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnRemindersDeletingAReminder() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_DELETING_REMINDERS).click();
		Reporter.logWithScreenShot("deleting a reminder page", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnRemindersReceivingReminders() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_RECEIVING_REMINDERS).click();
		Reporter.logWithScreenShot("receiving reminders page", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnMoreMenuTroubleshooting() {
		getNFKmoremenuhelppagetroubleshootingbtn().click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_FREQUENTLY_ASKED_QUESTIONS)
				.verifyPresent("Frequently asked questions present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_ERROR_AND_OTHER_MESSAGES)
				.verifyPresent("App error and other messages present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_DATA_ACCESS_ERROR)
				.verifyPresent("Data access error present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_THE_APP_WILL_NOT_LAUNCH)
				.verifyPresent("App will not launch present");
		getNFKMoremenuHelppageStatictextTxt(
				ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_AND_METER_USE_DIFFERNT_UNITS_OF_MEASURE)
						.verifyPresent("App and meter use differnt units of measure present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_DIFFERENT_RANGE)
				.verifyPresent("Different range error present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_BLOOD_SUGAR_VALUE)
				.verifyPresent("Improper blood sugar value present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_CARBOHYDRATE_VALUE)
				.verifyPresent("Improper carbohydrate value present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_INSULIN_VALUE)
				.verifyPresent("Improper insulin value present");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_MANUAL_BLOOD_SUGAR_VALUE)
				.verifyPresent("Improper manual blood sugar value present");
	}

	public void clickOnTroubleshootingFAQ() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_FREQUENTLY_ASKED_QUESTIONS).click();
		Reporter.logWithScreenShot("frequently asked questions", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingAppErrorAndOtherMessages() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_ERROR_AND_OTHER_MESSAGES)
				.click();
		Reporter.logWithScreenShot("app error and other messages", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingDataAccessError() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_DATA_ACCESS_ERROR).click();
		Reporter.logWithScreenShot("data access errors", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingAppWillNotLaunch() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_THE_APP_WILL_NOT_LAUNCH).click();
		Reporter.logWithScreenShot("app will not launch", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingAppAndMeterUseDifferntUnitsOfMeasure() {
		getNFKMoremenuHelppageStatictextTxt(
				ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_AND_METER_USE_DIFFERNT_UNITS_OF_MEASURE).click();
		Reporter.logWithScreenShot("app meter use and different units of measure", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingDifferentRange() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_DIFFERENT_RANGE).click();
		Reporter.logWithScreenShot("different range", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingImproperBloodSugarValue() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_BLOOD_SUGAR_VALUE).click();
		Reporter.logWithScreenShot("improper blood sugar value", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingImproperCarbohydrateValue() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_CARBOHYDRATE_VALUE).click();
		Reporter.logWithScreenShot("improper carbohydrate value", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingImproperInsulinValue() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_INSULIN_VALUE).click();
		Reporter.logWithScreenShot("improper insulin value", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingImproperManualBloodSugarValue() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_MANUAL_BLOOD_SUGAR_VALUE)
				.click();
		Reporter.logWithScreenShot("improper manual blood sugar value", MessageTypes.Pass);
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifyHelHomePage() {
		getNFKmoremenuhelppagehomebtn().click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_HOME).waitForPresent();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_HOME).verifyPresent("Home help button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_DATA_SHARING)
				.verifyPresent("Data Sharing button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_READINGS).verifyPresent("Readings help button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_MEAL_TAGS)
				.verifyPresent("Adding meal tags help button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_NOTES)
				.verifyPresent("Adding notes help button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_AVERAGES).verifyPresent("Averages help button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_NAVIGATION_PATTERNS)
				.verifyPresent("Patterns help button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_RECENT_EVENTS)
				.verifyPresent("Recent events help button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_EVENTS)
				.verifyPresent("Adding events help button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_CARBS)
				.verifyPresent("Add carbs help button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_INSULIN)
				.verifyPresent("Add Insulin help button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_ACTIVITY)
				.verifyPresent("Add activity help button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_READINGS)
				.verifyPresent("Add readings(manually) help button");

	}

	public void verifiesHomeHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_HOME).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_HOME)
				.verifyPresent("Home Help page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifiesDataSharingHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_DATA_SHARING).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_DATA_SHARING)
				.verifyPresent("Data Sharing feature page is displayed");
		LFSUtilsAndroid.clickBackButton();

	}

	public void verifiesReadingsHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_READINGS).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_READINGS)
				.verifyPresent("Readings(14,30,90 days) page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifiesAddingMealTagHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_MEAL_TAGS).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_MEAL_TAGS)
				.verifyPresent("Adding Meal tags page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifiesAddingNotesHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_NOTES).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_NOTES)
				.verifyPresent("Adding notes page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifiesAveragesHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_AVERAGES).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_AVERAGES)
				.verifyPresent("Averages page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifiesPatternsHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_NAVIGATION_PATTERNS).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_NAVIGATION_PATTERNS)
				.verifyPresent("Patterns page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifiesRecentEventHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_RECENT_EVENTS).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_RECENT_EVENTS)
				.verifyPresent("Recent events page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifiesAddingEventsHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_EVENTS).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_EVENTS)
				.verifyPresent("Adding events page is displayed");
		LFSUtilsAndroid.clickBackButton();

	}

	public void verifiesAddCarbsHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_CARBS).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_CARBS)
				.verifyPresent("Add Carbs page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifiesAddInsulinHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_INSULIN).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_INSULIN)
				.verifyPresent("Add Insulin page is displayed");
		LFSUtilsAndroid.clickBackButton();

	}

	public void verifiesAddActivityHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_ACTIVITY).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_ACTIVITY)
				.verifyPresent("Add Activity page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifiesAddReadingHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_READINGS).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_READINGS)
				.verifyPresent("AddReading page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifiesGraphHelp() {

		getNFKmoremenuhelppagegraphsbtn().click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_GRAPHS).verifyPresent("Graphs button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_OVERALL_GRAPHS)
				.verifyPresent("OverAll Graphs button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_TIME_OF_DAY_GRAPH)
				.verifyPresent("Time-Of-Day Graph button");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_VIEWPATTERNS)
				.verifyPresent("View Patterns on the Overall and Time-of-Day Graphs button");
	}

	public void verifiesGraphsSubHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_GRAPHS).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_GRAPHS)
				.verifyPresent("Graphs page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifiesOverallGraphHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_OVERALL_GRAPHS).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_OVERALL_GRAPHS)
				.verifyPresent("Overall Graphs page is displayed");
		LFSUtilsAndroid.clickBackButton();

	}

	public void verifiesTimeOFGraphHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_TIME_OF_DAY_GRAPH).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_TIME_OF_DAY_GRAPH)
				.verifyPresent("Time of Day Graph page is displayed");
		LFSUtilsAndroid.clickBackButton();

	}

	public void verifiesViewingPatternsOnGraphsHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_VIEWPATTERNS).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_VIEWPATTERNS)
				.verifyPresent("View Patterns on the Overall and Time-of-Day Graphs page is displayed");
		LFSUtilsAndroid.clickBackButton();
	}

	public void verifiesAboutHelpPage() {
		getNFKmoremenuhelppageaboutbtn().waitForPresent();
		getNFKmoremenuhelppageaboutbtn().click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUT_UDI).
		assertPresent("UDI of Mobile");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUT_MANUFACTURED_ADDRESS).
		assertPresent("Manufactured adress");
	}

	

	public void verifiesSettingHighLowHelp() {
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUTME_SETTING_LIMITS).click();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUTME_SETTING_LIMITS).verifyPresent("Setting your High and Low limits");
		LFSUtilsAndroid.clickBackButton();
	}

//	public void verifyAndroidLegalNoticePage() {
//		getNFKiosHelppageIntroductionAndroidLegalNoticeBtn().click();
//			
//		getNFKiosHelppageIntroductionAndroidLegalNoticeTxt().verifyPresent("Text is present");
//		clickOnBackButton();
//	}
//	
//	public void verifyGoogleLegalNoticePage() {
//		getNFKiosHelppageIntroductionGoogleLegalNoticeBtn().click();
//			
//		getNFKiosHelppageIntroductionGoogleLegalNoticeTxt().verifyPresent("Text is present");
//		clickOnBackButton();
//	}
	
	public void clicksInsulinMentor() {
		QAFWebElement insulinMentor =
				getNFKMoremenuHelppageStatictextTxt((String) LFSUtilsAndroid
						.getPropString("insulinCalc.firstUse.welcome.title")
						.subSequence(0, 7));
		insulinMentor.waitForPresent();
		if (insulinMentor.isPresent()) {
			Reporter.logWithScreenShot("Insulin Mentor is present", MessageTypes.Pass);
			getNFKMoremenuHelppageStatictextTxt(ConfigurationManager.getBundle()
					.getString("insulinCalc.firstUse.welcome.title")).click();
		} else {
			Reporter.logWithScreenShot("Insulin Mentor is not present",
					MessageTypes.Fail);

		}
	}

	public void clicksQuickUse() {
		QAFWebElement QuickUse =
				getNFKMoremenuHelppageStatictextTxt((String) LFSUtilsAndroid
						.getPropString("summary.screenTitle").subSequence(0, 7));
		QuickUse.waitForPresent();
		if (QuickUse.isPresent()) {
			Reporter.logWithScreenShot("Quick Use Tutorial is present",
					MessageTypes.Pass);
			getNFKMoremenuHelppageStatictextTxt(
					ConfigurationManager.getBundle().getString("summary.screenTitle"))
							.click();
		} else {
			Reporter.logWithScreenShot("Quick Use Tutorial is not present",
					MessageTypes.Fail);

		}
	}
	public void clickYourInsulin_Mentor() {
		if (getNFKMoremenuHelppageInsulinmentorTxt().isDisplayed()) {
			Reporter.logWithScreenShot("Your Insulin Mentor is displayed",
					MessageTypes.Pass);
			getNFKMoremenuHelppageInsulinmentorTxt().click();
		} else {
			Reporter.logWithScreenShot("Your Insulin Mentor is displayed",
					MessageTypes.Fail);
		}
	}
	public void clickNFKQuick_Tutorial() {
		if (getNFKMoremenuHelppageInsulinmentorOnetouchTxt().isPresent()) {
			Reporter.logWithScreenShot("OneTouch Reveal® Quick-Use Tutorial is displayed",
					MessageTypes.Pass);
			getNFKMoremenuHelppageInsulinmentorOnetouchTxt().click();

		} else {
			Reporter.logWithScreenShot(
					"OneTouch Reveal® Quick-Use Tutorial is not displayed",
					MessageTypes.Fail);
		}

	}

	public void verifyInsulin_MentorScreen() {
		if (getNFKMoremenuHelppageInsulinmentorOnetouchTxt().isPresent()) {
			Reporter.logWithScreenShot("OneTouch Reveal® Quick-Use Tutorial is displayed",
					MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot(
					"OneTouch Reveal® Quick-Use Tutorial is not displayed",
					MessageTypes.Fail);
		}
		if (getNFKMoremenuHelppageInsulinmentorUsingtheinsulinTxt().isPresent()) {
			Reporter.logWithScreenShot("Using the Insulin Mentor is displayed",
					MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Using the Insulin Mentor is not displayed",
					MessageTypes.Fail);
		}
		if (getNFKMoremenuHelppageInsulinmentorFaqTxt().isPresent()) {
			Reporter.logWithScreenShot("Frequently Asked Questions is displayed",
					MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Frequently Asked Questions is not displayed",
					MessageTypes.Fail);
		}
		if (getNFKMoremenuHelppageInsulinmentorTerminologyTxt().isPresent()) {
			Reporter.logWithScreenShot("Insulin Mentor Terminology is displayed",
					MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Insulin Mentor Terminology is not displayed",
					MessageTypes.Fail);
		}
		if (getNFKMoremenuHelppageInsulinmentorSettingTxt().isPresent()) {
			Reporter.logWithScreenShot("Insulin Mentor Settings is displayed",
					MessageTypes.Pass);

		} else {
			Reporter.logWithScreenShot("Insulin Mentor Settings is not displayed",
					MessageTypes.Fail);
		}

	}

	public void clickSafteyOnboarding() {
		getNFKMoremenuHelppageSafteyonboardingBtn().isPresent();
		getNFKMoremenuHelppageSafteyonboardingBtn().click();
		getNFKMoremenuHelppageSkipBtn().isPresent();
		getNFKMoremenuHelppageSkipBtn().click();
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("safety.onboarding.title"));
		LFSUtilsAndroid.waitforLoad();
		getNFKMoremenuHelppageSafteyonboardingBtn().click();
		
	}

	public void clickAppTour() {
		getNFKMoremenuHelppageApptourBtn().isPresent();
		getNFKMoremenuHelppageApptourBtn().click();
/*		getNFKMoremenuHelppageSkipBtn().isPresent();
		getNFKMoremenuHelppageSkipBtn().click();
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.tour"));
		LFSUtilsAndroid.waitforLoad();
		getNFKMoremenuHelppageApptourBtn().click();*/
	}

	public void verifyAppTourScreen() {
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.tour.t1"));
		clickNextBtn();
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.tour.t2"));
		clickNextBtn();
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.tour.t3"));
		clickNextBtn();
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.tour.t4"));
		clickNextBtn();
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.tour.t5"));
		clickNextBtn();
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.tour.t6"));
		clickNextBtn();
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.tour.t7"));
		getNFKMoremenuHelppageStatictextTxt(LFSUtilsAndroid.getPropString("appCommon.done")).click();
		getNFKmoremenuhelppagehelplbl().waitForPresent();
	    LFSUtilsAndroid.waitforLoad();
	}

	private void clickNextBtn() {
		getNFKMoremenuHelppageStatictextTxt(LFSUtilsAndroid.getPropString("appCommon.next")).click();
		LFSUtilsAndroid.waitforLoad();		
	}

	public void clickUserGuide() {
		getNFKMoremenuHelppageAppuserguideBtn().isPresent();
		getNFKMoremenuHelppageAppuserguideBtn().click();
	}

	public void verifyUserGuideScreen() {
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.intro"));
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.getting.started"));
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.account"));
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.home"));
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.event.log"));
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.progress"));
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.alert"));
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.device"));
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.reminder"));
		LFSUtilsAndroid.swipeWithScreenPercent(50,80,50,40,2);
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.share"));
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.connection"));
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.setting"));
		getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("app.userguide.term"));
	}

	public void clickAbout() {
		getNFKmoremenuhelppageaboutbtn().waitForPresent();
		getNFKmoremenuhelppageaboutbtn().click();		
	}

	public void verifyAboutScreen() {	
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUT_ANDROID_UDI).
		assertPresent("UDI of Mobile");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUT_MANUFACTURED_ADDRESS).
		assertPresent("Manufactured adress");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUT_MANUFACTURED_ADDRESS).
		verifyPresent("Company Name");
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUT_MANUFACTURED_ADDRESS1).isPresent();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUT_MANUFACTURED_ADDRESS2).isPresent();
		getNFKMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUT_MANUFACTURED_ADDRESS).verifyPresent("Address of Lifescan");
		
		
		
	}

	public void clickOnSensorApp() {
		getNFKMoremenuHelppageSensorBtn().waitForPresent();
		getNFKMoremenuHelppageSensorBtn().click();
		Reporter.log("Clicked on Sensor Application");
	}

	public void verifySensorAppScreen() {
		getNFKMoremenuHelppageSensorappOptions().get(0).getText().equals(LFSUtilsAndroid.getPropString("help.sensor.apply.sensor"));
		getNFKMoremenuHelppageSensorappOptions().get(1).getText().equals(LFSUtilsAndroid.getPropString("help.sensor.remove.sensor"));
		getNFKMoremenuHelppageSensorappOptions().get(2).getText().equals(LFSUtilsAndroid.getPropString("help.sensor.help.tips"));
			
	}

	public void validateOptions() {
		LFSUtilsAndroid.waitforLoad();
		for(int i=0;i<3;i++)
		{
		  if(i==0) {
			  getNFKMoremenuHelppageSensorappOptions().get(i).click();
			  getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("help.sensor.apply.title"));
			  getNFKMoremenuHelppageSensorappDoneBtn().click();
			  }
			  else if(i==1) {
				  getNFKMoremenuHelppageSensorappOptions().get(i).click();
			  getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("help.sensor.remove.title"));
			  getNFKMoremenuHelppageSensorappDoneBtn().click();
			  }
			  else {
				  getNFKMoremenuHelppageSensorappOptions().get(i).click();
		  getNFKMoremenuHelppageTitleLbl().getText().equals(LFSUtilsAndroid.getPropString("help.sensor.helptip.title"));
		  getNFKMoremenuHelppageSensorappDoneBtn().click();
			  }
		  }
		
	}

	public void clickLicense() {
		getNFKMoremenuHelppageStatictextTxt(LFSUtilsAndroid.getPropString("appCommon.licenses")).
		assertPresent("UDI of Mobile");
		getNFKMoremenuHelppageStatictextTxt(LFSUtilsAndroid.getPropString("appCommon.licenses")).click();
		LFSUtilsAndroid.waitforLoad();
	}

	public void verifyLicensePage() {
	  Assert.assertEquals(getNFKMoremenuHelppageTitleLbl().getText(),LFSUtilsAndroid.getPropString("appCommon.licenses"));	
	  getNFKMoremenuHelppageLicenseBackBtn().assertPresent("Back button");	
	  Reporter.logWithScreenShot("License screen",MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 10);
		Reporter.logWithScreenShot("License screen",MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 10);
		Reporter.logWithScreenShot("License screen",MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 10);
		Reporter.logWithScreenShot("License screen",MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 10);
		Reporter.logWithScreenShot("License screen",MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 10);
		Reporter.logWithScreenShot("License screen",MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 10);
		Reporter.logWithScreenShot("License screen",MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 10);
		Reporter.logWithScreenShot("License screen",MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 10);  
		Reporter.logWithScreenShot("License screen",MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 10); 
		Reporter.logWithScreenShot("License screen",MessageTypes.Pass);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 80, 50, 20, 10); 
	}

}
