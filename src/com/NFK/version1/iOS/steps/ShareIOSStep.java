package com.NFK.version1.iOS.steps;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.SharePageIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class ShareIOSStep {
	
	SharePageIOS sharePage=new SharePageIOS();
	
	@QAFTestStep(description = "user verify share page")
	public void userVerifiesShareScreen() {
		sharePage.verifyShareScreen();
	}

	@QAFTestStep(description = "user verifies time frame pop up")
	public void verifyTimeFramePopUp() {
		sharePage.timeFramePopUp();
	}
	@QAFTestStep(description = "user clicks on time frame button")
	public void clicksTimeFrameBtn() {
		sharePage.clickTimeFrameBtn();
	}
	@QAFTestStep(description = "user select {0} day as time frame")
	public void selecstTimeFrame(String day) {
		sharePage.selectTimeFrame(day);
	}
	@QAFTestStep(description = "user select share type as {0} and verifies the No Reading Available popup")
	public void selecstShareType(String type) {
		sharePage.clickOnFromShareType(type);
	}
	@QAFTestStep(description = "user select share type as {0} and verifies the Not Enough Data popup")
	public void verifyNotEnoughDataPopUp(String type) {
		sharePage.clickOnFromShareType(type); 
	}
	@QAFTestStep(description = "user verify share text screen")
	public void verifyShareTextScreen() {
		sharePage.verifyShareTextScreen();
	}
	@QAFTestStep(description="user click on share pdf")
	public void shareToPDFiOS(){
		sharePage.sharePDFFIle();
	}

	@QAFTestStep(description="user click on export data csv")
	public void exportToCSV(){
		sharePage.clickExportButtonToShare();
	}
	
	@QAFTestStep(description="user verify share pdf timeframe sequence")
	public void verifyTimeframeOnPDF() {
		sharePage.clickOnPdfTimeframe();
	}

	@QAFTestStep(description="user verify share CSV timeFrame sequence")
	public void verifyTimeframeOnCSV() {
		sharePage.clickOnCsvTimeframe();
	}
	
	@QAFTestStep(description="user click on share last reading using text")
	public void shareLastReading(){
		sharePage.verifyShareTextScreen();
	}
	@QAFTestStep(description="user click on share last reading using email")
	public void shareLastReadingViaEmail(){
		sharePage.shareLastReadingUsingEmail();
	}
	@QAFTestStep(description="user click on share last reading using AGP")
	public void shareLastReadingViaAGP(){
		sharePage.shareLastReadingUsingAGP();
	}
	@QAFTestStep(description="user click on share last reading using CSV")
	public void shareLastReadingViaCSV(){
		sharePage.clickOnCSV();
		sharePage.shareLastReadingUsingEmail();
		sharePage.openInReport();
	}
	@QAFTestStep(description="user click on cancel button share page")
	public void clickOnCancelButtonSharePage(){
		sharePage.sharepageCancelButton();
	}
	
	@QAFTestStep(description="user clicks on PDF option")
	public void shareReportPDF(){
		sharePage.clickOnPDF();
	}
	
	@QAFTestStep(description="user clicks on CSV option")
	public void shareExportDataCSV(){
		sharePage.clickOnCSV();
		sharePage.verifyCSVScreen();
	}
	@QAFTestStep(description="user clicks on Low Glucose option")
	public void userClicksLowGlucose(){
		sharePage.clickOnLowGlucose();
	}
	
	@QAFTestStep(description="user verify Email share option")
	public void sharePDFReportByEmail(){
		sharePage.clickOnPDFByEmail();
	}
	
	@QAFTestStep(description="user verify Print share option")
	public void sharePDFReportByPrint(){
		sharePage.clickOnPDFByPrint();
	}
	
	@QAFTestStep(description="user verify Open in share option")
	public void sharePDFReportByOpenIn(){
		sharePage.clickOnPDFByOpenIn();
	}
	
	@QAFTestStep(description = "user gets redirected to Share Page")
	public void verifySharePageUI() {
		sharePage.verifyShareScreen();
	}
	
	@QAFTestStep(description = "user clicks on Add Follower button")
	public void clicksOnAddFollower() {
		sharePage.clicksOnAddFollowerBtn();
	}
	@QAFTestStep(description = "user add new Follower and verify the Status")
	public void addFollowerVerifyStatus() {
		sharePage.completeFirstUseStatements();
		sharePage.clicksOnInviteFollowerBtn();
		sharePage.clicksOnAddFollowerBtn();
		sharePage.addFollowersDetails();
		sharePage.clicksOnInviteBtn();
		sharePage.checkStaus();
	}
	@QAFTestStep(description = "user check the Remove button and Resend link")
	public void checkRemoveResendBtn() {
		sharePage.checkRemoveResendBtn();
	
		}
	@QAFTestStep(description = "user removes the follower and verifies followers name no longer display on share screen")
	public void removePopup() {
		sharePage.clickOnRemovebtn();
	    sharePage.verifyPopup();
	    sharePage.clickDiscard();
	    sharePage.verifyNoFollowerName();
		}

	@QAFTestStep(description = "user gets redirected to Add Follower page")
	public void verifyAddFollowerPageUI() {
		sharePage.verifyAddFollowerUI();
	}

	@QAFTestStep(description = "user enters name and email address of follower and clicks on next button")
	public void addUserDetailsAddFollower() {
		sharePage.addFollowersDetails();
	}
	
	
	@QAFTestStep(description = "user add and invites twenty new followers")
	public void addtwentyFollowers() {
		sharePage.addTwentyFollowersDetails();
	}
	
	@QAFTestStep(description = "user verifies Maximum Followers Reached popup")
	public void verifyMaxFollowers() {
		sharePage.verifyMaxFolloerPopup();
	}
	
	@QAFTestStep(description = "user verifies Sharing First Use Statements")
	public void sharingFirstUseStatements() {
		sharePage.completeFirstUseStatements();
	}
	
	@QAFTestStep(description = "user clicks on Invite Followers button")
	public void clicksOnInviteFollower() {
		sharePage.clicksOnInviteFollowerBtn();
	}
	
	@QAFTestStep(description = "user gets redirected to Set Follower page")
	public void verifySetFollowerPageUI() {
		sharePage.verifySetFollowerUI();
	}
	
	@QAFTestStep(description = "user enables {0} {1} and {2} notifications")
	public void userSetNotifications(String notification1, String notification2, String notification3) { 
		sharePage.setNotifications(notification1);
		sharePage.setNotifications(notification2);
		sharePage.setNotifications(notification3);	
	}
	@QAFTestStep(description = "user verifies No Data Available popup")
	public void userVerifiesNoDataPopup() {
		sharePage.verifyPOPupTimeFrame();  
		sharePage.selectTimeFrame("7"); 
		sharePage.verifyPOPupTimeFrame();  
		sharePage.selectTimeFrame("30");
		sharePage.verifyPOPupTimeFrame();  
		sharePage.selectTimeFrame("60");
		sharePage.verifyPOPupTimeFrame();  
		sharePage.selectTimeFrame("90");
		sharePage.verifyPOPupTimeFrame(); 
		LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
	}
	@QAFTestStep(description ="user verifies No Low Glucose Events popup")
	public void userVerifiesNoLowData(){
		sharePage.verifyTimeFrameForLowEvents();
		sharePage.selectTimeFrame("7"); 
		sharePage.verifyTimeFrameForLowEvents();
		sharePage.selectTimeFrame("30");
		sharePage.verifyTimeFrameForLowEvents();
		sharePage.selectTimeFrame("60");
		sharePage.verifyTimeFrameForLowEvents();
		sharePage.selectTimeFrame("90");
		sharePage.verifyTimeFrameForLowEvents();
		LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
	}	
	@QAFTestStep(description = "clicks on Invite button")
	public void clicksOnInvite() {
		sharePage.clicksOnInviteBtn();
	}
	
	@QAFTestStep(description = "user verifies the added follower on share page")
	public void verifyFollowerOnSharepage() {
		sharePage.verifyFollowerOnShare();
	}
		@QAFTestStep(description="user verify the Status")
	public void userVerifyTheStatus(){
		sharePage.verifyfollowerStatus();
	}
	
}
