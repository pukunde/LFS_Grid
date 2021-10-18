package com.NFK.version1.android.steps;

import com.NFK.version1.android.pages.UpdateNoticePageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class UpdateNoticeSteps {
	
	UpdateNoticePageAndroid updateNoticePage = new UpdateNoticePageAndroid();
	
	@QAFTestStep(description = "user verifies Update Notice page Heading") 
		public void verifyUpdateNoticePageHeading() {
			updateNoticePage.verifyUpdateNoticePageHeading();
	}
	
	@QAFTestStep(description = "user verifies Privacy Policy link on Update Notice page") 
	public void verifyUpdateNoticePrivacyPolicyLink() {
		updateNoticePage.verifyUpdateNoticePrivacyPolicyLink();
	}
	
	@QAFTestStep(description = "user verifies Terms of Use link on Update Notice page") 
	public void verifyUpdateNoticeTermsOfUseLink() {
		updateNoticePage.verifyUpdateNoticeTermsOfUseLink();
	}
	
	@QAFTestStep(description = "user verifies Text informing user for review and agree new terms on Update Notice page") 
	public void verifyUpdateNoticeReviewAndAgreeTxt() {
		updateNoticePage.verifyUpdateNoticeReviewAndAgreeTxt();
	}
	
	@QAFTestStep(description = "user verifies Update Notice page content") 
	public void verifyUpdateNoticePageContent() {
		updateNoticePage.verifyUpdateNoticePageContent();
	}
	
	@QAFTestStep(description = "user click on Privacy Policy link") 
	public void clickOnPrivacyPolicy() {
		updateNoticePage.clickOnPrivacyPolicy();
	}
	
	@QAFTestStep(description = "user click on Consent to Personal Sensitive data link") 
	public void clickOnConsentPersonalSensitiveLink() {
		updateNoticePage.clickOnConsentPersonalSensitiveLink();
	}
	
	@QAFTestStep(description = "user click on Terms of use link") 
	public void clickOnTermsOfUseLink() {
		updateNoticePage.clickOnTermsOfUseLink();
	}
	
		
}
	
	
