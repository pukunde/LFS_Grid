package com.NFK.version1.iOS.pages;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.NFK.support.LFSUtilsIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.android.AndroidDriver;


public class SharePageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	MoremenuPageIOS morePageObj = new MoremenuPageIOS();
	
	@FindBy(locator = "NFKios.sharePage.heading.lbl")
	private QAFWebElement NFKiosSharepageHeadingLbl;
	@FindBy(locator = "NFKios.sharePage.back.btn")
	private QAFWebElement NFKiosSharepageBackBtn;
	@FindBy(locator = "NFKios.sharePage.lastReading.lbl")
	private QAFWebElement NFKiosSharepageLastreadingLbl;
	@FindBy(locator = "NFKios.sharePage.text.btn")
	private QAFWebElement NFKiosSharepageTextBtn;
	@FindBy(locator = "NFKios.sharePage.email.btn")
	private QAFWebElement NFKiosSharepageEmailBtn;
	@FindBy(locator = "NFKios.sharePage.pdf.btn")
	private QAFWebElement NFKiosSharepagePdfBtn;
	@FindBy(locator = "NFKios.sharePage.csv.btn")
	private QAFWebElement NFKiosSharepageCsvBtn;
	@FindBy(locator = "NFKios.sharePage.csv.timeFrame.btn")
	private QAFWebElement NFKiosSharepageCsvTimeframeBtn;
	@FindBy(locator = "NFKios.sharePage.csv.email.btn")
	private QAFWebElement NFKiosSharepageCsvEmailBtn;
	@FindBy(locator = "NFKios.sharePage.csv.openIn.btn")
	private QAFWebElement NFKiosSharepageCsvOpeninBtn;
	@FindBy(locator = "NFKios.sharePage.csv.cancel.btn")
	private QAFWebElement NFKiosSharepageCsvCancelBtn;
	@FindBy(locator = "NFKios.sharePage.csv.chooseTime.lbl")
	private QAFWebElement NFKiosSharepageCsvChoosetimeLbl;
	@FindBy(locator = "NFKios.sharePage.csv.fourteenDay.btn")
	private QAFWebElement NFKiosSharepageCsvFourteendayBtn;
	@FindBy(locator = "NFKios.sharePage.csv.thirtyDay.btn")
	private QAFWebElement NFKiosSharepageCsvThirtydayBtn;
	@FindBy(locator = "NFKios.sharePage.csv.ninetyDay.btn")
	private QAFWebElement NFKiosSharepageCsvNinetydayBtn;
	@FindBy(locator = "NFKios.sharePage.csv.chooseTimeCancel.btn")
	private QAFWebElement NFKiosSharepageCsvChoosetimecancelBtn;
	@FindBy(locator = "NFKios.sharePage.pdf.print.btn")
	private QAFWebElement NFKiosSharepagePdfPrintBtn;
	@FindBy(locator = "NFKios.sharePage.text.newMsg.lbl")
	private QAFWebElement NFKiosSharepageTextNewMessageLbl;
	@FindBy(locator = "NFKios.sharePage.text.to.txt")
	private QAFWebElement NFKiosSharepageTextToTxt;
	@FindBy(locator = "NFKios.sharePage.text.addContact.btn")
	private QAFWebElement NFKiosSharepageTextAddContactBtn;
	@FindBy(locator = "NFKios.sharePage.text.message.lbl")
	private QAFWebElement NFKiosSharepageTextMessageLbl;
	@FindBy(locator = "NFKios.sharePage.text.contact.lbl")
	private QAFWebElement NFKiosSharepageTextContactLbl;
	@FindBy(locator = "NFKios.sharePage.email.send.btn")
	private QAFWebElement NFKiosSharepageEmailSendBtn;
	@FindBy(locator = "NFKios.sharePage.email.subject.txt")
	private QAFWebElement NFKiosSharepageEmailSubjectTxt;
	@FindBy(locator = "NFKios.sharePage.email.bcc.txt")
	private QAFWebElement NFKiosSharepageEmailBccTxt;
	@FindBy(locator = "NFKios.sharePage.email.messagebody.txt")
	private QAFWebElement NFKiosSharepageEmailMessagebodyTxt;
	@FindBy(locator = "NFKios.sharePage.email.deletedraft.btn")
	private QAFWebElement NFKiosSharepageEmailDeletedraftBtn;
	@FindBy(locator = "NFKios.sharePage.email.savedraft.btn")
	private QAFWebElement NFKiosSharepageEmailSavedraftBtn;
	@FindBy(locator="NFKios.sharePage.csv.timeWindow.popup")
	private List<QAFWebElement> NFKioSharePageCsvTimeWindowPopup;
	@FindBy(locator = "NFKios.sharePage.csv.secondback.btn")
	private QAFWebElement NFKiosSharepageCsvSecondBackBtn;
	
	@FindBy(locator="NFKios.sharePage.addFollower.btn")
	private QAFWebElement NFKiossharePageAddFollowerBtn;	
	@FindBy(locator="NFKios.sharePage.shareData.lbl")
	private QAFWebElement NFKiosSharepageShareDataLbl;
	@FindBy(locator="NFKios.sharePage.inviteFollowers.lbl")
	private QAFWebElement NFKiosSharepageInviteFollowersLbl;
	@FindBy(locator="NFKios.sharePage.invite.btn")
	private QAFWebElement NFKiosSharepageInviteBtn;
	@FindBy(locator="NFKios.sharePage.setupFollower.invite.btn")
	private QAFWebElement NFKiosSharepageSetupInviteBtn;
	@FindBy(locator = "NFKios.sharePage.cancel.btn")
	private QAFWebElement NFKiosSharepageCancelBtn;
	@FindBy(locator = "NFKios.sharePage.shareReport.pdf.print.printoptions.lbl")
	private QAFWebElement NFKiosSharepageShareReportPrintOptionLabel;
	@FindBy(locator = "NFKios.sharePage.shareReport.pdf.openin.appopenpopup")
	private QAFWebElement NFKiosSharepageShareReportAppopenpopup;
	@FindBy(locator = "NFKios.sharePage.email.deletedraftIPFive.btn")
	private QAFWebElement NFKiosSharepageEmailDeletedraftIPFiveBtn;
	@FindBy(locator = "NFKios.sharePage.addFollower.lbl")
	private QAFWebElement NFKiosSharepageAddFollowerLbl;
	@FindBy(locator = "NFKios.sharePage.setFollower.lbl")
	private QAFWebElement NFKiosSharepageSetFollowerLbl;
	@FindBy(locator = "NFKios.sharePage.name.lbl")
	private QAFWebElement NFKiosSharepageNameLbl;
	@FindBy(locator = "NFKios.sharePage.emailaddress.lbl")
	private QAFWebElement NFKiosSharepageEmailAddressLbl;
	@FindBy(locator = "NFKios.sharePage.next.btn")
	private QAFWebElement NFKiosSharepageNextBtn;
	@FindBy(locator = "NFKios.sharePage.noData.btn")
	private QAFWebElement NFKiosSharePageNoDataBtn;
	@FindBy(locator = "NFKios.sharePage.urgentLow.btn1")
	private QAFWebElement NFKiosSharePageUrgentLowBtn1;
	
	@FindBy(locator="NFKios.sharePage.urgentLow.btn")
	private QAFWebElement NFKiosSharePageUrgentLowBtn;
	
	@FindBy(locator = "NFKios.sharePage.low.btn")
	private QAFWebElement NFKiosSharePageLowBtn;
	@FindBy(locator = "NFKios.sharePage.high.btn")
	private QAFWebElement NFKiosSharePageHighBtn;
	
	@FindBy(locator = "NFKios.sharePage.follower.name.lbl")
	private QAFWebElement NFKiosSharepageAddedFollowerNameLbl;
	@FindBy(locator = "NFKios.sharePage.lowtoggle.readingbelow.lbl")
	private QAFWebElement NFKiosSharePageReadingBelowLbl;
	
	@FindBy(locator = "NFKios.sharePage.lowmorethan.lbl")
	private QAFWebElement NFKiosSharePageLowMoreThanLbl;
	
	@FindBy(locator = "NFKios.sharePage.trendgraph.switch.btn")
	private QAFWebElement NFKiosSharePageTrendGraphSwitchBtn;
	
	@FindBy(locator = "NFKios.sharePage.sensorexpirationdate.switch.btn")
	private QAFWebElement NFKiosSharePageSensorExpirationSwitchBtn;
	
	@FindBy(locator = "NFKios.sharePage.hightoggle.readingbelow.lbl")
	private QAFWebElement NFKiosSharePageHighReadingBelowLbl;
	
	@FindBy(locator = "NFKios.sharePage.highmorethan.lbl")
	private QAFWebElement NFKiosSharePageHighMoreThanLbl;
	
	
	@FindBy(locator = "NFKios.sharePage.nodatamorethan.lbl")
	private QAFWebElement NFKiosSharePageNoDataMoreThanLbl;
	
	//Low EVnt share
	@FindBy(locator="NFKios.sharePage.low.back.btn")
	private QAFWebElement NFKiosSharePageLowBackBtn;
	@FindBy(locator="NFKios.sharePage.low.timeframe.txt")
	private QAFWebElement NFKiosSharePageLowTimeframeTxt;
	@FindBy(locator="NFKios.sharePage.low.timeframe.val")
	private QAFWebElement NFKiosSharePageLowTimeframeVal;
	@FindBy(locator="NFKios.sharePage.low.email.btn")
	private QAFWebElement NFKiosSharePageLowEmailBtn;
	@FindBy(locator="NFKios.sharePage.low.print.btn")
	private QAFWebElement NFKiosSharePageLowPrintBtn;
	@FindBy(locator="NFKios.sharePage.low.openin.btn")
	private QAFWebElement NFKiosSharePageLowOpeninBtn;
	@FindBy(locator="NFKios.sharePage.status.invite.btn")
	private QAFWebElement NFKiosSharePageStatusInviteBtn;
	@FindBy(locator="NFKios.sharePage.follower.remove.btn")
	private QAFWebElement NFKiosSharePageFollowerRemoveBtn;
	@FindBy(locator="NFKios.sharePage.follower.resend.btn")
	private QAFWebElement NFKiosSharePageFollowerResendBtn;
	@FindBy(locator="NFKios.ok.btn")
	private QAFWebElement NFKiosOkBtn;
	@FindBy(locator="NFKios.sharePage.status.invite.btnlist")
	private List<QAFWebElement> NFKiosSharePageStatusInviteBtnlist;
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	public List<QAFWebElement> getNFKiosSharePageStatusInviteBtnlist(){
		return NFKiosSharePageStatusInviteBtnlist;
	}
	public QAFWebElement getNFKiosOkBtn() {
		return NFKiosOkBtn;
	}
	public QAFWebElement getNFKiosSharePageFollowerRemoveBtn() {
		return NFKiosSharePageFollowerRemoveBtn;
	}
	public QAFWebElement getNFKiosSharePageFollowerResendBtn() {
		return NFKiosSharePageFollowerResendBtn;
	}
	public QAFWebElement getNFKiosSharePageStatusInviteBtn() {
		return NFKiosSharePageStatusInviteBtn;
	}
	public QAFWebElement getNFKiosSharePageLowBackBtn() {
		return NFKiosSharePageLowBackBtn;
	}
	public QAFWebElement getNFKiosSharePageLowTimeframeTxt() {
		return NFKiosSharePageLowTimeframeTxt;
	}
	public QAFWebElement getNFKiosSharePageLowTimeframeVal() {
		return NFKiosSharePageLowTimeframeVal;
	}
	public QAFWebElement getNFKiosSharePageLowEmailBtn() {
		return NFKiosSharePageLowEmailBtn;
	}
	public QAFWebElement getNFKiosSharePageLowPrintBtn() {
		return NFKiosSharePageLowPrintBtn;
	}
	public QAFWebElement getNFKiosSharePageLowOpeninBtn() {
		return NFKiosSharePageLowOpeninBtn;
	}
	public QAFWebElement getNFKiosSharePageUrgentLowBtn() {
		return NFKiosSharePageUrgentLowBtn;
	}
	
	public QAFWebElement getNFKiosSharepageEmailDeletedraftIPFiveBtn() {
		return NFKiosSharepageEmailDeletedraftIPFiveBtn;
	}
	public QAFWebElement getNFKiosSharepageCancelBtn() {
		return NFKiosSharepageCancelBtn;
	}

	public QAFWebElement getNFKiosSharepageShareReportPrintOptionLabel() {
		return NFKiosSharepageShareReportPrintOptionLabel;
	}

	public QAFWebElement getNFKiosSharepageShareReportAppopenpopup() {
		return NFKiosSharepageShareReportAppopenpopup;
	}
	
	public QAFWebElement getNFKiosSharepageCsvSecondBackBtn() {
		return NFKiosSharepageCsvSecondBackBtn;
	}
	public QAFWebElement getNFKiosSharepageEmailDeletedraftBtn() {
		return NFKiosSharepageEmailDeletedraftBtn;
	}

	public QAFWebElement getNFKiosSharepageEmailSavedraftBtn() {
		return NFKiosSharepageEmailSavedraftBtn;
	}
	public QAFWebElement getNFKiosSharepageEmailSendBtn() {
		return NFKiosSharepageEmailSendBtn;
	}

	public QAFWebElement getNFKiosSharepageEmailSubjectTxt() {
		return NFKiosSharepageEmailSubjectTxt;
	}

	public QAFWebElement getNFKiosSharepageEmailBccTxt() {
		return NFKiosSharepageEmailBccTxt;
	}

	public QAFWebElement getNFKiosSharepageEmailMessagebodyTxt() {
		return NFKiosSharepageEmailMessagebodyTxt;
	}

	public QAFWebElement getNFKiosSharepageTextContactLbl() {
		return NFKiosSharepageTextContactLbl;
	}

	public QAFWebElement getNFKiosSharepageTextMessageLbl() {
		return NFKiosSharepageTextMessageLbl;
	}

	public QAFWebElement getNFKiosSharepageTextAddContactBtn() {
		return NFKiosSharepageTextAddContactBtn;
	}

	public QAFWebElement getNFKiosSharepageTextToTxt() {
		return NFKiosSharepageTextToTxt;
	}

	public QAFWebElement getNFKiosSharepageTextNewMessageLbl() {
		return NFKiosSharepageTextNewMessageLbl;
	}

	public QAFWebElement getNFKiosSharepagePdfPrintBtn() {
		return NFKiosSharepagePdfPrintBtn;
	}

	public QAFWebElement getNFKiosSharepageHeadingLbl() {
		return NFKiosSharepageHeadingLbl;
	}
	
	
	public QAFWebElement getNFKiosSharepageAddedFollowerNameLbl() {
		return NFKiosSharepageAddedFollowerNameLbl;
	}
	

	public QAFWebElement getNFKiosSharepageBackBtn() {
		return NFKiosSharepageBackBtn;
	}

	public QAFWebElement getNFKiosSharepageLastreadingLbl() {
		return NFKiosSharepageLastreadingLbl;
	}

	public QAFWebElement getNFKiosSharepageTextBtn() {
		return NFKiosSharepageTextBtn;
	}

	public QAFWebElement getNFKiosSharepageEmailBtn() {
		return NFKiosSharepageEmailBtn;
	}
	public QAFWebElement getNFKiosSharepagePdfBtn() {
		return NFKiosSharepagePdfBtn;
	}

	public QAFWebElement getNFKiosSharepageCsvBtn() {
		return NFKiosSharepageCsvBtn;
	}

	public QAFWebElement getNFKiosSharepageCsvTimeframeBtn() {
		return NFKiosSharepageCsvTimeframeBtn;
	}

	public QAFWebElement getNFKiosSharepageCsvEmailBtn() {
		return NFKiosSharepageCsvEmailBtn;
	}

	public QAFWebElement getNFKiosSharepageCsvOpeninBtn() {
		return NFKiosSharepageCsvOpeninBtn;
	}

	public QAFWebElement getNFKiosSharepageCsvCancelBtn() {
		return NFKiosSharepageCsvCancelBtn;
	}

	public QAFWebElement getNFKiosSharepageCsvChoosetimeLbl() {
		return NFKiosSharepageCsvChoosetimeLbl;
	}

	public QAFWebElement getNFKiosSharepageCsvFourteendayBtn() {
		return NFKiosSharepageCsvFourteendayBtn;
	}

	public QAFWebElement getNFKiosSharepageCsvThirtydayBtn() {
		return NFKiosSharepageCsvThirtydayBtn;
	}

	public QAFWebElement getNFKiosSharepageCsvNinetydayBtn() {
		return NFKiosSharepageCsvNinetydayBtn;
	}

	public QAFWebElement getNFKiosSharepageCsvChoosetimecancelBtn() {
		return NFKiosSharepageCsvChoosetimecancelBtn;
	}

	public QAFWebElement getNFKiosShareScreenText(String text) {
		return LFSUtilsIOS.getElement("NFKios.sharePage.dynamic.txt", text);
	}
	
	public List<QAFWebElement> getNFKioSharePageCsvTimeWindowPopup() {
		return NFKioSharePageCsvTimeWindowPopup;
	}
	
	public QAFWebElement getNFKiosSharepageAddFollowerBtn() {
		return NFKiossharePageAddFollowerBtn;
	}

	public QAFWebElement getNFKiosSharepageShareDataLbl() {
		return NFKiosSharepageShareDataLbl;
	}
	
	public QAFWebElement getNFKiosSharepageInviteFollowersLbl() {
		return NFKiosSharepageInviteFollowersLbl;
	}

	public QAFWebElement getNFKiosSharepageAddFollowerLbl() {
		return NFKiosSharepageAddFollowerLbl;
	}
	

	public QAFWebElement getNFKiosSharepageSetFollowerLbl() {
		return NFKiosSharepageSetFollowerLbl;
	}
	
	public QAFWebElement getNFKiosSharepageNameLbl() {
		return NFKiosSharepageNameLbl;
	}
	
	public QAFWebElement getNFKiosSharepageEmailAddressLbl() {
		return NFKiosSharepageEmailAddressLbl;
	}
	
	
	public QAFWebElement getNFKiosSharepageNextBtn() {
		return NFKiosSharepageNextBtn;
	}
	
	public QAFWebElement getNFKiosSharepageInviteBtn() {
		return NFKiosSharepageInviteBtn;
	}
	
	public QAFWebElement getNFKiosSharePageNoDataBtn() {
		return NFKiosSharePageNoDataBtn;
	}
	
	public QAFWebElement getNFKiosSharePageUrgentLowBtn1() {
		return NFKiosSharePageUrgentLowBtn;
	}
	
	public QAFWebElement getNFKiosSharePageLowBtn() {
		return NFKiosSharePageLowBtn;
	}
	
	public QAFWebElement getNFKiosSharePageHighBtn() {
		return NFKiosSharePageHighBtn;
	}
	
	public QAFWebElement getNFKiosSharepageStaticlabel(String text) {
		return LFSUtilsIOS.getElement("NFKios.Sharepage.static.lbl", text);
	}
	
	
	public QAFWebElement getNFKiosSharepageSetupInviteBtn() {
		return NFKiosSharepageSetupInviteBtn;
	}
	
	public QAFWebElement getNFKiosSharePageReadingBelowLbl() {
		return NFKiosSharePageReadingBelowLbl;
	}
	
	public QAFWebElement getNFKiosSharePageLowMoreThanLbl() {
		return NFKiosSharePageLowMoreThanLbl;
	}
	
	
	public QAFWebElement getNFKiosSharePageHighReadingBelowLbl() {
		return NFKiosSharePageHighReadingBelowLbl;
	}
	
	public QAFWebElement getNFKiosSharePageHighMoreThanLbl() {
		return NFKiosSharePageHighMoreThanLbl;
	}
	
	public QAFWebElement getNFKiosSharePageNoDataMoreThanLbl() {
		return NFKiosSharePageNoDataMoreThanLbl;
	}
	
	
	public QAFWebElement getNFKioSharePageTrendGraphSwitchBtn() {
		return NFKiosSharePageTrendGraphSwitchBtn;
	}
	
	public QAFWebElement getNFKioSharePageSensorExpirationSwitchBtn() {
		return NFKiosSharePageSensorExpirationSwitchBtn;
	}
	
	
	
	
	
	// Method to verify share screen
	
	public void verifyShareScreen() {
		Reporter.logWithScreenShot("Share screen", MessageTypes.Pass);
		getNFKiosSharepageHeadingLbl().verifyPresent("Share title");
			
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("common.backbuttontext"))
		.assertPresent("Back Button");
		
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.text"))
		.assertPresent("Text");
		
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.email"))
		.assertPresent("Email");
		
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.agp"))
		.assertPresent("AGP");
		
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.low.events"))
		.assertPresent("Low events");
		
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.csv"))
		.assertPresent("CSV");

		getNFKiosSharepageAddFollowerBtn().assertPresent("Add Follower Button");
	}

	// Method to verify csv share screen

	public void verifyCSVScreen() {
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeperiod")).
		assertPresent("Time  Period");
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().
				getString("share.timeFrame14")).assertPresent("14 label");
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.email")).assertPresent("Email report option is present");
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.openIn")).
		assertPresent("Open report options in present");
		
	}

	// Method to verify time frame pop up
	
	public void timeFramePopUp() {
		clickTimeFrameBtn();
		getNFKiosSharepageCsvChoosetimeLbl().waitForPresent();
		getNFKiosSharepageCsvFourteendayBtn().verifyPresent("14 day view button");
		getNFKiosSharepageCsvThirtydayBtn().verifyPresent("30 day view button");
		getNFKiosSharepageCsvNinetydayBtn().verifyPresent("90 day view button");
		String strCancel =
				LFSUtilsIOS.getPropString("appCommon.cancel");
		getNFKiosSharepageStaticlabel(
				LFSUtilsIOS.getPropString("appCommon.cancel"))
						.verifyPresent(strCancel);
	}

	// Click on time frame
	
	public void clickTimeFrameBtn() {
		getNFKiosSharepageCsvTimeframeBtn().waitForPresent();
		getNFKiosSharepageCsvTimeframeBtn().click();
	}

	// select time frame from  different provided time
	public void selectTimeFrame(String day) {
		LFSUtilsIOS.waitforLoad();
		switch (day) {
		case "7":
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame14"))
			.click();
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame7"))
			.click();
			break;
		case "30":
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame7"))
			.click();
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame30"))
			.click();
			break;
		case "60":
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame30"))
			.click();
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame60"))
			.click();	
			break;
		case "90":
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame60"))
			.click();
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.timeFrame90"))
			.click();
			
			break;

		}
		Reporter.logWithScreenShot("After selecting time frame", MessageTypes.Pass);
	}

	// Method to verify pdf share page
	
	public void verifyPDFPage() {
		getNFKiosSharepageCsvTimeframeBtn().waitForPresent();
		getNFKiosSharepageCsvTimeframeBtn().verifyPresent("Time frame button");
		getNFKiosSharepageCsvEmailBtn().verifyPresent("Email button");
		getNFKiosSharepageCsvOpeninBtn().verifyPresent("Open in button");
		getNFKiosSharepagePdfPrintBtn().verifyPresent("Print button");
		String strCancel =
				LFSUtilsIOS.getPropString("appCommon.cancel");
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel"))
						.verifyPresent(strCancel);
		
	}

	// Method to click on share types

	public void clickOnFromShareType(String type) {
		LFSUtilsIOS.waitforLoad();
		type = type.toUpperCase();
		switch (type) {
		case "TEXT":
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.text"))
			.click();
			verifyNoDataPopup();
			break;
		case "EMAIL":
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.email")).click();
			verifyNoDataPopup();
			break;
		case "AGP":
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.agp")).click();
			verifyNoEnoughPopup();
			break;
		case "CSV":
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.csv")).click();
			break;

		}
		Reporter.logWithScreenShot("After selecting time share type as   " + type, MessageTypes.Pass);
	}

	private void verifyNoEnoughPopup() {
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().
				getString("share.notenoughdatatitle")).assertPresent("Not Enough Data");
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().
				getString("my.progress.agp.nodata.txt")).assertPresent("Alert message for Not Enough Data");
		getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).isPresent();
		getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();		
	}
	
	public void verifyTimeFrameForLowEvents() {
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.email")).click();
		verifyNoLowGlucoseEvents();
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.openIn")).click();
		verifyNoLowGlucoseEvents();		
	}

	public void verifyNoLowGlucoseEvents() {
		waitForPageToLoad();
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().
				getString("share.nolow.events")).assertPresent("No Low Glucose Events");
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().
				getString("share.nolow.events.msg")).assertPresent("Alert message for No Low Glucose Events");
		getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).isPresent();
		getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
	}
	
	public void verifyPOPupTimeFrame() {
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.email")).click();
		verifyNoDataAvailablePopup();
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.openIn")).click();
		verifyNoDataAvailablePopup();	
	}
		public void verifyNoDataAvailablePopup() {
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().
				getString("share.nodataAlertTitle")).assertPresent("Not Data Available");
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().
				getString("share.nodataAlertMessage")).assertPresent("Alert message for Not Enough Readings");
		getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).isPresent();
		getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
	}

	public void verifyNoDataPopup() {
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().
				getString("share.noReadingsAlertTitle")).assertPresent("No Reading Available");
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().
				getString("share.noReadingsAlertMessage")).assertPresent("Alert message for No data on CSV");
		getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).isPresent();
		getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("appCommon.ok")).click();
	}

	// Method to verify share text screen
	public void verifyShareTextScreen() {
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.text"))
		.click();
		Reporter.logWithScreenShot("Share by text", MessageTypes.Pass);
		getNFKiosSharepageTextToTxt().assertPresent("To field");
		getNFKiosSharepageTextAddContactBtn().assertPresent("+  icon");
		getNFKiosSharepageTextMessageLbl().assertPresent("Text messages");
getNFKiosSharepageTextMessageLbl().getText().replaceAll("\\s+", "");
		String strCancel =
				LFSUtilsIOS.getPropString("appCommon.cancel");
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel"))
						.assertPresent(strCancel);
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel"))
						.click();
		LFSUtilsIOS.waitforLoad();
		getNFKiosSharepageHeadingLbl().waitForPresent();
		getNFKiosSharepageHeadingLbl().assertPresent("Share screen after clicking on cancel button");

		
	}

	
	//Method to share report in PDF format.
	public void sharePDFFIle() {
		getNFKiosSharepagePdfBtn().click();
		getNFKiosSharepageCsvTimeframeBtn().waitForPresent();
		getNFKiosSharepageCsvTimeframeBtn().verifyPresent("Share Report in PDF format Page is displayed");
		getNFKiosSharepageCsvTimeframeBtn().click();
		Reporter.logWithScreenShot("After clicking time frame", MessageTypes.Pass);
		getNFKiosSharepageCsvFourteendayBtn().waitForPresent();
		getNFKiosSharepageCsvFourteendayBtn().click();
		Reporter.logWithScreenShot("After Selecting time frame", MessageTypes.Pass);	
		if ((pageProps.getString("language.name").equalsIgnoreCase("sl-sl"))) {
			String strCancelSL =
					LFSUtilsIOS.getPropString("common.actions.cancel");
			morePageObj.getNFKiosMorepageStaticText(
					LFSUtilsIOS.getPropString("common.actions.cancel")).click();
		} else {
		String strCancel =
				LFSUtilsIOS.getPropString("appCommon.cancel");
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel"))
						.verifyPresent(strCancel);
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel")).click();
		}

	}
	
	//Method to share report in CSV format
	public void clickExportButtonToShare(){
		getNFKiosSharepageCsvBtn().waitForPresent();
		getNFKiosSharepageCsvBtn().click();
		getNFKiosSharepageCsvTimeframeBtn().waitForPresent();
		getNFKiosSharepageCsvTimeframeBtn().click();
		Reporter.logWithScreenShot("After clicking time frame", MessageTypes.Pass);
		if ((getNFKioSharePageCsvTimeWindowPopup().get(0).getText().contains("14"))
				&& (getNFKioSharePageCsvTimeWindowPopup().get(1).getText().contains("30"))
				&& (getNFKioSharePageCsvTimeWindowPopup().get(2).getText().contains("90"))) {
			
              Reporter.logWithScreenShot("Sequnce for Days pop up is correct", MessageTypes.Pass);
		}
		else {
			Reporter.logWithScreenShot("Mismatching in Days pop up", MessageTypes.Fail);
		}
		getNFKioSharePageCsvTimeWindowPopup().get(0).waitForPresent();
		getNFKiosSharepageCsvFourteendayBtn().click();
		if ((pageProps.getString("language.name").equalsIgnoreCase("sl-sl"))) {
			String strCancelSL =
					LFSUtilsIOS.getPropString("common.actions.cancel");
			morePageObj.getNFKiosMorepageStaticText(
					LFSUtilsIOS.getPropString("common.actions.cancel")).click();
		} else {
		String strCancel =
				LFSUtilsIOS.getPropString("appCommon.cancel");
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel"))
						.verifyPresent(strCancel);
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel")).click();
		}
		
	}
	
	//Method to share using Text
	public void shareLastReadingUsingText(){
				getNFKiosSharepageTextNewMessageLbl().waitForPresent();
		Reporter.logWithScreenShot("Share by text", MessageTypes.Pass);
		MoremenuPageIOS morePage = new MoremenuPageIOS();
		if (pageProps.getString("language.name").equalsIgnoreCase("hr-hr")||(pageProps.getString("language.name").equalsIgnoreCase("hu-hu"))) {
			morePage.getNFKiosMorepageStaticTextlbl(
					LFSUtilsIOS.getPropString("appCommon.revertValue")).verifyPresent();
			morePage.getNFKiosMorepageStaticTextlbl(
					LFSUtilsIOS.getPropString("appCommon.revertValue")).click();
			
		} else {
		
		String strCancel =
				LFSUtilsIOS.getPropString("appCommon.cancel");
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel"))
						.verifyPresent(strCancel);
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel")).click();
		}
		getNFKiosSharepageTextBtn().verifyPresent("Share screen after clicking on cancel button");
	}
	
	//Method to verify share email last reading screen
	public void shareLastReadingUsingEmail() {
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.email")).assertPresent("Email button");
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.email")).click();
		getNFKiosSharepageEmailSendBtn().assertPresent("Send button for email");
		getNFKiosSharepageEmailSubjectTxt().assertPresent("Email subjet text field");
		getNFKiosSharepageEmailBccTxt().assertPresent("Cc/Bcc text field");
		MoremenuPageIOS morePage = new MoremenuPageIOS();
		if (pageProps.getString("language.name").equalsIgnoreCase("hr-hr")||(pageProps.getString("language.name").equalsIgnoreCase("hu-hu"))) {
			morePage.getNFKiosMorepageStaticTextlbl(
					LFSUtilsIOS.getPropString("appCommon.revertValue")).verifyPresent();
			morePage.getNFKiosMorepageStaticTextlbl(
					LFSUtilsIOS.getPropString("appCommon.revertValue")).click();
			morePage.getNFKiosMoremenupageContactusDeleteDraftBtn().click();
		} else {
		
		String strCancel =
				LFSUtilsIOS.getPropString("appCommon.cancel");
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel"))
						.verifyPresent(strCancel);
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel")).click();
		verifyDraftPopUp();
		getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("delete.draft")).click();
		}
		Reporter.logWithScreenShot("Email Verification", MessageTypes.Pass);
	}
	
	public void shareLastReadingUsingAGP() {
		shareLastReadingUsingEmail();
		getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.agp")).click();
			LFSUtilsIOS.waitforLoad();
			
			getNFKiosSharepageStaticlabel("Print").waitForPresent(100);
			getNFKiosSharepageStaticlabel("Print").click();
			 LFSUtilsIOS.waitforLoad();
			 if(getNFKiosOkBtn().isDisplayed()|getNFKiosOkBtn().isPresent()) {
				 getNFKiosOkBtn().click();
			 }
			 else
				 Reporter.logWithScreenShot("Pop not displayed",MessageTypes.Pass);
			 getNFKiosSharepageStaticlabel("Printer Options").assertPresent("Printer Option");
			 if(getNFKiosSharepageStaticlabel("Printer Options").isPresent())
				{ 
				 morePageObj.getNFKiosMorepageStaticText(
						LFSUtilsIOS.getPropString("appCommon.cancel"))
								.click();
				}else
					Reporter.logWithScreenShot("Print Option is not present", MessageTypes.Pass);
			openInReport();
			LFSUtilsIOS.waitforLoad();
			getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("common.backbuttontext"))
							.click();
			
		}
		
		public void openInReport() {
			waitForPageToLoad();
			getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.openIn")).click();
			if(getNFKiosOkBtn().isPresent()) {
				 getNFKiosOkBtn().click();
			 }
			 else
			 { 
				 Reporter.logWithScreenShot("User has clicked on Open in and redirected to application open pop up window",MessageTypes.Pass);
					morePageObj.getNFKiosMorepageStaticText(
							LFSUtilsIOS.getPropString("appCommon.close"))
									.click();
			 }
				
		}
		
	//Method to verify draft pop up
	public void verifyDraftPopUp(){
		getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("delete.draft")).assertPresent("Delete draft button");
		getNFKiosSharepageStaticlabel(
				LFSUtilsIOS.getPropString("save.draft")).assertPresent("Save Draft");
		getNFKiosSharepageStaticlabel(
				LFSUtilsIOS.getPropString("appCommon.cancel"))
						.assertPresent("Cancel button");
	}


	public void sharepageCancelButton() {
		String strCancel =
				LFSUtilsIOS.getPropString("appCommon.cancel");
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel"))
						.verifyPresent(strCancel);
		}
	
	public void clickOnPdfTimeframe() {
		getNFKiosSharepagePdfBtn().waitForPresent();
		getNFKiosSharepagePdfBtn().click();
		getNFKiosSharepageCsvTimeframeBtn().click();
		Reporter.logWithScreenShot("After clicking time frame", MessageTypes.Pass);
		getNFKiosSharepageCsvFourteendayBtn().waitForPresent();
		if ((getNFKioSharePageCsvTimeWindowPopup().get(0).getText().contains("14"))
				&& (getNFKioSharePageCsvTimeWindowPopup().get(1).getText().contains("30"))
				&& (getNFKioSharePageCsvTimeWindowPopup().get(2).getText().contains("90"))) {
			
            Reporter.logWithScreenShot("Sequnce for Days pop up is correct", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Mismatching in Days pop up", MessageTypes.Fail);
		}
		getNFKiosSharepageCsvChoosetimecancelBtn().click();
		
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel"))
						.click();
		
	}
	
	public void clickOnCsvTimeframe() {
		getNFKiosSharepageCsvBtn().waitForPresent();
		getNFKiosSharepageCsvBtn().click();
		getNFKiosSharepageCsvTimeframeBtn().waitForPresent();
		Reporter.logWithScreenShot("CSV screen", MessageTypes.Pass);
		getNFKiosSharepageCsvTimeframeBtn().click();
		Reporter.logWithScreenShot("After clicking time frame", MessageTypes.Pass);
		if ((getNFKioSharePageCsvTimeWindowPopup().get(0).getText().contains("14"))
				&& (getNFKioSharePageCsvTimeWindowPopup().get(1).getText().contains("30"))
				&& (getNFKioSharePageCsvTimeWindowPopup().get(2).getText().contains("90"))) {
			
              Reporter.logWithScreenShot("Sequnce for Days pop up is correct", MessageTypes.Pass);
		}
		else {
			Reporter.logWithScreenShot("Mismatching in Days pop up", MessageTypes.Fail);
		}
		morePageObj.getNFKiosMorepageStaticText(
				LFSUtilsIOS.getPropString("appCommon.cancel"))
						.click();
	}
	// Method to click on PDF and Verify the options
			public void clickOnPDF() {
				getNFKiosSharepagePdfBtn().click();
				getNFKiosSharepagePdfBtn().verifyPresent("Share Report in PDF format Page is displayed");
				getNFKiosSharepageCsvTimeframeBtn().verifyPresent("Time Farme label Present");
				getNFKiosSharepageCsvEmailBtn().verifyPresent("Email report option is present");
				getNFKiosSharepagePdfPrintBtn().verifyPresent("Print Report option is present");
				getNFKiosSharepageCsvOpeninBtn().verifyPresent("Open In  report options in present");	
			}
			
		//method to verify Share a report by Email option
			public void clickOnPDFByEmail()
			{
				getNFKiosSharepageCsvEmailBtn().waitForPresent();
				getNFKiosSharepageCsvEmailBtn().click();
				getNFKiosSharepageEmailSubjectTxt().waitForPresent();
				getNFKiosSharepageEmailSubjectTxt().verifyPresent("Clicked on Email and redirected to email");
				Reporter.logWithScreenShot("Mail Opened", MessageTypes.Pass);
				morePageObj.getNFKiosMorepageStaticText(
						LFSUtilsIOS.getPropString("appCommon.cancel"))
								.click();
				LFSUtilsIOS.pause(1000);
				if(getNFKiosSharepageEmailDeletedraftIPFiveBtn().isPresent()) {
					getNFKiosSharepageEmailDeletedraftIPFiveBtn().click();
				}else {
					getNFKiosSharepageEmailDeletedraftBtn().click();
				}
				
			}
			
		//method to verify share a report by print option
			public void clickOnPDFByPrint()
			{
				
				getNFKiosSharepagePdfPrintBtn().waitForPresent();
				getNFKiosSharepagePdfPrintBtn().click();
				getNFKiosSharepageShareReportPrintOptionLabel().waitForPresent();
				getNFKiosSharepageShareReportPrintOptionLabel().verifyPresent("Clicked on Print option and redirected to Printer Options Page");
				Reporter.logWithScreenShot("Printer Options Page", MessageTypes.Pass);
				morePageObj.getNFKiosMorepageStaticText(
						LFSUtilsIOS.getPropString("appCommon.cancel"))
								.click();
			}
		//method to verify share open in option
			public void clickOnPDFByOpenIn()
			{
				
				getNFKiosSharepageCsvOpeninBtn().waitForPresent();
				getNFKiosSharepageCsvOpeninBtn().click();
				getNFKiosSharepageShareReportAppopenpopup().waitForPresent();
				getNFKiosSharepageShareReportAppopenpopup().verifyPresent("Clicked on Open In option and redirected to application open pop up window");
				Reporter.logWithScreenShot("Application pop up window", MessageTypes.Pass);
				morePageObj.getNFKiosMorepageStaticText(
						LFSUtilsIOS.getPropString("appCommon.cancel"))
								.click();
			}
			
			// Method to click on Export data CSV
			public void clickOnCSV() {
				WebDriverWait wait = new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.visibilityOf(getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.csv"))));
						//.visibilityOfElementLocated(By.id("about_me")));      
				getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().
					getString("share.csv")).waitForPresent(100);
				getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.csv")).click();		
				getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.csv")).assertPresent("CSV title");
	
			}
			
			public void clicksOnAddFollowerBtn()
			{
				
				getNFKiosSharepageAddFollowerBtn().waitForPresent();
				getNFKiosSharepageAddFollowerBtn().click();
			}
			
			public void completeFirstUseStatements() {
				
				if (getNFKiosSharepageShareDataLbl().isDisplayed()) {
					verifyShareYourDataScreen();
					Reporter.logWithScreenShot("Share Your Data screen", MessageTypes.Pass);
					LFSUtilsIOS.swipeWithScreenPercent(95, 80, 5, 80, 7);
					verifyInviteFollowerScreen();
				}
				else {
					Reporter.logWithScreenShot("Share Your Data screen is not displayed", MessageTypes.Fail);
				}
	
			}
			
			public void verifyAddFollowerUI() {
				getNFKiosSharepageAddFollowerLbl().waitForPresent();
				getNFKiosSharepageAddFollowerLbl().verifyVisible("Add Follower screen");
				getNFKiosSharepageNameLbl().waitForPresent();
				getNFKiosSharepageNameLbl().verifyVisible("Name Field");
				getNFKiosSharepageEmailAddressLbl().waitForPresent();
				getNFKiosSharepageEmailAddressLbl().verifyVisible("Email Address Field");
				
				
			}
			
			public void addFollowersDetails() {
				String email = "doshaheentt+" + RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
				String name = "Jon" + RandomStringUtils.randomAlphabetic(6);
				ConfigurationManager.getBundle().setProperty("addfollower.name", name);
				getNFKiosSharepageNameLbl().click();
				getNFKiosSharepageNameLbl().clear();
				LFSUtilsIOS.enterText(getNFKiosSharepageNameLbl(),name);
				//getNFKiosSharepageNameLbl().sendKeys(name);
				getNFKiosSharepageEmailAddressLbl().click();
				getNFKiosSharepageEmailAddressLbl().clear();
				LFSUtilsIOS.enterText(getNFKiosSharepageEmailAddressLbl(),email);
				getNFKiosSharepageAddFollowerLbl().click();
				getNFKiosSharepageNextBtn().click();
				
			}
			
			public void addTwentyFollowersDetails() {
				
				  for(int i=1; i<=20; i++) {
					LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 20, 10);	
					clicksOnAddFollowerBtn();
					addFollowersDetails();
					clicksOnInviteBtn();
					LFSUtilsIOS.waitforLoad();	
					LFSUtilsIOS.pause(200);
					LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 10);
					LFSUtilsIOS.swipeWithScreenPercent(50, 80, 50, 30, 10);
						
				}
			}
			
			public void verifySetFollowerUI()
			{
				getNFKiosSharepageSetFollowerLbl().waitForPresent();
				getNFKiosSharepageSetFollowerLbl().verifyVisible("Set Up Follower screen");
				if (getNFKioSharePageTrendGraphSwitchBtn().getAttribute("value").equals("1")) {
					
		              Reporter.log("Trend Graph switch is enabled");
				}
				else {
					Reporter.logWithScreenShot("Trend Graph switch is disabled", MessageTypes.Fail);
				}
				
				if (getNFKioSharePageSensorExpirationSwitchBtn().getAttribute("value").equals("0")) {
					
		              Reporter.log("SensorExpiration switch is disabled");
				}
				else {
					Reporter.logWithScreenShot("SensorExpiration switch is enabled", MessageTypes.Fail);
				}
				if (getNFKiosSharePageUrgentLowBtn().getAttribute("value").equals("On")) {
					
					 Reporter.log("Urgent Low is ON");
				}
				else {
					Reporter.logWithScreenShot("Urgent Low is OFF", MessageTypes.Fail);
				}
				
				if(getNFKiosSharePageLowBtn().getAttribute("value").equals("On")) {
					Reporter.log("Low is ON");
				}
				else
				{
					Reporter.logWithScreenShot("Low is OFF",MessageTypes.Fail);
				}
				if(getNFKiosSharePageHighBtn().getAttribute("value").equals("On"))
				{
					Reporter.log("High is ON");
				}
				else
				{
					Reporter.logWithScreenShot("High is OFF",MessageTypes.Fail);
				}
				if(getNFKiosSharePageNoDataBtn().getAttribute("value").equals("On")) {
					Reporter.log("No Data is On");
				}
				else {
					Reporter.logWithScreenShot("No Data is OFF",MessageTypes.Fail);
				}	
			Reporter.logWithScreenShot("Set Follower Page",MessageTypes.Pass);
			}
			
			public void setNotifications(String option)
			{
				switch (option) {
				
				case "Low":
					if(getNFKiosSharePageLowBtn().getAttribute("value").equals("0")) {	
						getNFKiosSharePageLowBtn().waitForPresent();
						getNFKiosSharePageLowBtn().click();
					}
					verifyLowToggle();
					break;	
						
				case "High":		
					if(getNFKiosSharePageHighBtn().getAttribute("value").equals("0")) {	
						getNFKiosSharePageHighBtn().waitForPresent();
						getNFKiosSharePageHighBtn().click();
					}
					
					verifyHighToggle();
					break;
					
				case "NoData":
					LFSUtilsIOS.scrollDown();
					if(getNFKiosSharePageNoDataBtn().getAttribute("value").equals("0")) {	
						getNFKiosSharePageNoDataBtn().waitForPresent();
						getNFKiosSharePageNoDataBtn().click();
					}
					verifyNoDataToggle();
					break;				
			}
		}
			
			public void verifyNoDataToggle() {
				if(getNFKiosSharePageNoDataBtn().getAttribute("value").equals("1")) {
					
	
					String noDataMoreThan =
							ConfigurationManager.getBundle().getPropertyValue("nodata.more.than");
		
					WebDriverTestCase.verifyTrue(
							getNFKiosSharePageNoDataMoreThanLbl().getAttribute("label")
									.contains(noDataMoreThan),
							"Different Readings of No Data value is displayed", "Displaying For More Than value as "+ noDataMoreThan);
					
			}
			else {
				Reporter.logWithScreenShot("No Data switch is disabled");
			}
			
				
			}

			public void verifyHighToggle() {
				if(getNFKiosSharePageHighBtn().getAttribute("value").equals("1")) {
					String highReadingAbove =
							ConfigurationManager.getBundle().getPropertyValue("high.reading.above");
					WebDriverTestCase.verifyTrue(
							getNFKiosSharePageHighReadingBelowLbl().getAttribute("label")
									.contains(highReadingAbove),
									"Different value of Readings above is displayed","Displaying High Readings Above value as"+ highReadingAbove);
				
					String highMoreThan =
							ConfigurationManager.getBundle().getPropertyValue("high.more.than");
					WebDriverTestCase.verifyTrue(
							getNFKiosSharePageHighMoreThanLbl().getAttribute("label")
									.contains(highMoreThan),
							"Different value of For More Than is displayed", "Displaying value of For More Than as "+highMoreThan);					
			}
			else {
				Reporter.logWithScreenShot("High switch is disabled");
			}
			
				
			}

			public void verifyLowToggle() {
				if(getNFKiosSharePageLowBtn().getAttribute("value").equals("1")) {
						String lowReadingBelow =
								ConfigurationManager.getBundle().getPropertyValue("low.reading.below");
						WebDriverTestCase.verifyTrue(
								getNFKiosSharePageReadingBelowLbl().getAttribute("label")
										.contains(lowReadingBelow),
										"Different value of Readings Below is displayed","Displaying Low Readings Below value as "+lowReadingBelow);
					
						String lowMoreThan =
								ConfigurationManager.getBundle().getPropertyValue("low.more.than");
						WebDriverTestCase.verifyTrue(
								getNFKiosSharePageLowMoreThanLbl().getAttribute("label")
										.contains(lowMoreThan),
								"Different value of Low For More Than is displayed", "Displaying value of Low For More Than as "+lowMoreThan);
						
				}
				else {
					Reporter.logWithScreenShot("Low switch is disabled");
				}
				
			}

			public void verifyShareYourDataScreen()
			{
				/*getNFKiosSharepageSetFollowerLbl().waitForPresent();
				getNFKiosSharepageSetFollowerLbl().verifyVisible("Add Follower screen");*/
				getNFKiosSharepageShareDataLbl().verifyPresent("Share Your Data");
				getNFKiosSharepageNextBtn().verifyPresent("Next");
				getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("common.backbuttontext"))
				.verifyPresent("Back Button");
				
			}
			
			public void verifyInviteFollowerScreen()
			{
				/*getNFKiosSharepageSetFollowerLbl().waitForPresent();
				getNFKiosSharepageSetFollowerLbl().verifyVisible("Add Follower screen");
				*/
				//getNFKiosSharepageShareDataLbl().verifyPresent("Invite Followers");
				
				getNFKiosSharepageInviteBtn().verifyPresent("Invite Followers Button");
				getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("common.backbuttontext"))
				.verifyPresent("Back Button");
			}
			
			public void clicksOnInviteFollowerBtn(){
				if (getNFKiosSharepageInviteFollowersLbl().isDisplayed()) {
					getNFKiosSharepageInviteBtn().waitForPresent();
					getNFKiosSharepageInviteBtn().click();
				}
			}
			
			public void clicksOnInviteBtn() {
				getNFKiosSharepageSetupInviteBtn().waitForPresent();
				getNFKiosSharepageSetupInviteBtn().click();
				LFSUtilsIOS.waitforLoad();
				waitForPageToLoad();
			}
				
			public void verifyFollowerOnShare() {
				getNFKiosSharepageHeadingLbl().waitForPresent();
				String follower =
						ConfigurationManager.getBundle().getPropertyValue("addfollower.name");
				WebDriverTestCase.verifyTrue(
						getNFKiosSharepageAddedFollowerNameLbl().getAttribute("label")
								.contains(follower), "No follower to display","Displaying follower's name "+follower);
				
			}

			public void verifyMaxFolloerPopup() {
				getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.maximum.follower.popup.title"))
				.verifyPresent("Maximum Followers Reached popup");
						
				getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("share.maximum.follower.popup.message"))
				.verifyPresent("Maximum Followers Reached popup message");
			}

			public void clickOnLowGlucose() {
				LFSUtilsIOS.pause(60000);
				getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("my.progress.low.lbl")).waitForPresent(100);
				getNFKiosSharepageStaticlabel(ConfigurationManager.getBundle().getString("my.progress.low.lbl")).click();
				getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("my.progress.low.lbl")).assertPresent("Low Glucose event title");
			getNFKiosSharePageLowBackBtn().isPresent();
			getNFKiosSharePageLowTimeframeTxt().assertPresent("Time Period");
	Assert.assertEquals(getNFKiosSharePageLowTimeframeVal().getText(),LFSUtilsIOS.getPropString("share.timeFrame14"));
	 getNFKiosSharePageLowEmailBtn().assertPresent("Email");
	 getNFKiosSharePageLowOpeninBtn().assertPresent("Open in..");
	 getNFKiosSharePageLowPrintBtn().assertPresent("Print");
			}
			public void checkStaus() {
				waitForPageToLoad();
				System.out.println(getNFKiosSharePageStatusInviteBtn().getText());
				System.out.println("get the value of status "+getNFKiosSharepageAddedFollowerNameLbl().getAttribute("label"));
				getNFKiosSharePageStatusInviteBtn().getText().equals("Invited");
				Reporter.logWithScreenShot("Follower added",MessageTypes.Pass);
				
			}
			public void checkRemoveResendBtn() {
					getNFKiosSharePageStatusInviteBtn().click();
					LFSUtilsIOS.swipeWithScreenPercent(40, 80, 40, 0, 200);
					LFSUtilsIOS.swipeWithScreenPercent(40, 80, 40, 0, 200);
					getNFKiosSharePageFollowerRemoveBtn().assertPresent("Remove button");
					getNFKiosSharePageFollowerResendBtn().assertPresent("Resend Link");
					Reporter.log("Remove button and Resend Link");	
					clickOnRemovebtn();
					getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("appCommon.cancel")).click();
	
			}
			public void clickOnRemovebtn() {
				LFSUtilsIOS.waitforLoad();
				getNFKiosSharePageFollowerRemoveBtn().click();
			}
			
			public void verifyPopup() {
				getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("appCommon.cancel")).isPresent();
				getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("office.code.delete")).isPresent();
				Reporter.log("Verified Pop with cancel and Remove button");
			}
			
			public void verifyNoFollowerName() {
				
				getNFKiosSharepageHeadingLbl().waitForPresent();
				String follower =
						ConfigurationManager.getBundle().getPropertyValue("addfollower.name");
				if(!(getNFKiosSharepageAddedFollowerNameLbl().isPresent())){
					Reporter.logWithScreenShot("Follower has been removed",MessageTypes.Pass);
				}
				else
					{
					if(getNFKiosSharepageAddedFollowerNameLbl().getText().equals(follower))
					Reporter.logWithScreenShot("Follower has been not removed", MessageTypes.Fail);
					else
			             Reporter.logWithScreenShot("Another Follower is present", MessageTypes.Pass);
					}
			
			}
			public void clickDiscard() {  
	 			getNFKiosSharepageStaticlabel(LFSUtilsIOS.getPropString("office.code.delete")).click();
	 			LFSUtilsIOS.waitforLoad();
	 			Reporter.logWithScreenShot("User has clicked on Remove button", MessageTypes.Pass);
			}
			public void verifyfollowerStatus() {
				waitForPageToLoad();
				if(getNFKiosSharePageStatusInviteBtnlist().get(0).getText().contains("Expired")) {
					Reporter.logWithScreenShot("Follower status is expired",MessageTypes.Pass);
				};
				if(getNFKiosSharePageStatusInviteBtnlist().get(1).getText().contains("Expired")) {
					Reporter.logWithScreenShot("Follower status is expired",MessageTypes.Pass);
				};
			}

			
			

}
