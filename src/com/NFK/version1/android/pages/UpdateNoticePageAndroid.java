package com.NFK.version1.android.pages;

import com.NFK.support.LFSUtilsAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class UpdateNoticePageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.updatenotice.page.heading.txt")
	private QAFWebElement NFKUpdateNoticeHeadingTxt;

	@FindBy(locator = "NFK.updatenotice.wehaveupdated.txt")
	private QAFWebElement NFKUpdateNoticeWeHaveUpdatedTxt;

	@FindBy(locator = "NFK.updatenotice.privacy.policy.lnk")
	private QAFWebElement NFKUpdateNoticePrivacyPolicyLnk;

	@FindBy(locator = "NFK.termsofuse.lnk")
	private QAFWebElement NFKUpdateNoticeTermsOfUseLnk;

	@FindBy(locator = "NFK.consent.to.process.personal.lnk")
	private QAFWebElement NFKUpdateNoticeConsentProcessPersonalLnk;

	@FindBy(locator = "NFK.please.review.agree.terms.txt")
	private QAFWebElement NFKUpdateNoticePleaseReviewAgreeTermsTxt;
	
	public QAFWebElement getNFKUpdateNoticeHeadingTxt() {
		return NFKUpdateNoticeHeadingTxt;
	}

	public void setNFKUpdateNoticeHeadingTxt(QAFWebElement NFKUpdateNoticeHeadingTxt) {
		this.NFKUpdateNoticeHeadingTxt = NFKUpdateNoticeHeadingTxt;
	}

	public QAFWebElement getNFKUpdateNoticeWeHaveUpdatedTxt() {
		return NFKUpdateNoticeWeHaveUpdatedTxt;
	}

	public void setNFKUpdateNoticeWeHaveUpdatedTxt(QAFWebElement NFKUpdateNoticeWeHaveUpdatedTxt) {
		this.NFKUpdateNoticeWeHaveUpdatedTxt = NFKUpdateNoticeWeHaveUpdatedTxt;
	}

	public QAFWebElement getNFKUpdateNoticePrivacyPolicyLnk() {
		return NFKUpdateNoticePrivacyPolicyLnk;
	}

	public void setNFKUpdateNoticePrivacyPolicyLnk(QAFWebElement NFKUpdateNoticePrivacyPolicyLnk) {
		this.NFKUpdateNoticePrivacyPolicyLnk = NFKUpdateNoticePrivacyPolicyLnk;
	}

	public QAFWebElement getNFKUpdateNoticeTermsOfUseLnk() {
		return NFKUpdateNoticeTermsOfUseLnk;
	}

	public void setNFKUpdateNoticeTermsOfUseLnk(QAFWebElement NFKUpdateNoticeTermsOfUseLnk) {
		this.NFKUpdateNoticeTermsOfUseLnk = NFKUpdateNoticeTermsOfUseLnk;
	}

	public QAFWebElement getNFKUpdateNoticeConsentProcessPersonalLnk() {
		return NFKUpdateNoticeConsentProcessPersonalLnk;
	}

	public void setNFKUpdateNoticeConsentProcessPersonalLnk(QAFWebElement NFKUpdateNoticeConsentProcessPersonalLnk) {
		this.NFKUpdateNoticeConsentProcessPersonalLnk = NFKUpdateNoticeConsentProcessPersonalLnk;
	}

	public QAFWebElement getNFKUpdateNoticePleaseReviewAgreeTermsTxt() {
		return NFKUpdateNoticePleaseReviewAgreeTermsTxt;
	}

	public void setNFKUpdateNoticePleaseReviewAgreeTermsTxt(QAFWebElement NFKUpdateNoticePleaseReviewAgreeTermsTxt) {
		this.NFKUpdateNoticePleaseReviewAgreeTermsTxt = NFKUpdateNoticePleaseReviewAgreeTermsTxt;
	}



	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub

	}
	
	public void verifyUpdateNoticePageHeading(){
		
		getNFKUpdateNoticeHeadingTxt().waitForPresent();

		if(getNFKUpdateNoticeHeadingTxt().isPresent() && getNFKUpdateNoticeHeadingTxt().isDisplayed())
		{
			WebDriverTestCase.verifyTrue(getNFKUpdateNoticeHeadingTxt().isDisplayed(), "Update Notice Heading not displayed", "Update Notice Heading displayed");
			Reporter.logWithScreenShot("Update Notice Heading displayed", MessageTypes.Pass);
		}
		else
		{
			Reporter.logWithScreenShot("Update Notice Heading not displayed", MessageTypes.Fail);
		}
		
	}
	
	public void verifyUpdateNoticePrivacyPolicyLink(){
		
		WebDriverTestCase.verifyTrue(getNFKUpdateNoticePrivacyPolicyLnk().isDisplayed(), "Privacy Policy link not displayed", "Privacy Policy link displayed");
		
	}
	
	public void verifyUpdateNoticeTermsOfUseLink(){
		
		WebDriverTestCase.verifyTrue(getNFKUpdateNoticeTermsOfUseLnk().isDisplayed(), "Terms of Use link not displayed", "Terms of Use link displayed");
		
	}
	
	public void verifyUpdateNoticeReviewAndAgreeTxt(){
		
		WebDriverTestCase.verifyTrue(getNFKUpdateNoticePleaseReviewAgreeTermsTxt().isDisplayed(), "Review and Agree terms text not displayed", "Review and Agree terms text displayed");
		
	}

	public void verifyUpdateNoticePageContent(){
		
		this.verifyUpdateNoticePageHeading();
		this.verifyUpdateNoticePrivacyPolicyLink();
		this.verifyUpdateNoticeTermsOfUseLink();
		this.verifyUpdateNoticeReviewAndAgreeTxt();
	}
	
	public void clickOnPrivacyPolicy(){
		if(getNFKUpdateNoticePrivacyPolicyLnk().isDisplayed()){
			getNFKUpdateNoticePrivacyPolicyLnk().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Update Privacy Policy page displayed", MessageTypes.Pass);
		}else{
			Reporter.logWithScreenShot("Update Privacy Policy link not displayed", MessageTypes.Fail);
		}
	}
	
	public void clickOnConsentPersonalSensitiveLink(){
		if(getNFKUpdateNoticeConsentProcessPersonalLnk().isDisplayed()){
			getNFKUpdateNoticeConsentProcessPersonalLnk().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Consent to Personal and Sensitive data page displayed", MessageTypes.Pass);
		}else{
			Reporter.logWithScreenShot("Consent to Personal and Sensitive data link not displayed", MessageTypes.Fail);
		}
	}
	
	public void clickOnTermsOfUseLink(){
		if(getNFKUpdateNoticeTermsOfUseLnk().isDisplayed()){
			getNFKUpdateNoticeTermsOfUseLnk().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Terms of use page displayed", MessageTypes.Pass);
		}else{
			Reporter.logWithScreenShot("Terms of use link not displayed", MessageTypes.Fail);
		}
	}

}