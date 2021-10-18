package com.NFK.version1.android.steps;

import com.NFK.version1.android.pages.ContactusPageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class ContactUsSteps {
ContactusPageAndroid contactUsPage = new ContactusPageAndroid();

//	@QAFTestStep(description="user verify Contact Us page")
//	public void verifyContactPage(){
//		contactUsPage.verifyContactUsPage();
//	}

	@QAFTestStep(description="user verify Contact Us page")
	public void contactPageVerification() {
		contactUsPage.verifyContactUsPage();
	}
	
	
	
	@QAFTestStep(description="user clicks and verify Email customer service")
	public void verifyEmailService(){
		contactUsPage.verifyEmail();
	}
	
	@QAFTestStep(description="user calls customer service center")
	public void callsCustomerCare(){
		contactUsPage.callNumber();
	}
	
	@QAFTestStep(description="user visits application website")
	public void visitWebsite(){
		contactUsPage.visitSite();
	}
	
	@QAFTestStep(description="user clicks Rate app link")
	public void clickLink(){
		contactUsPage.clickRateApp();
	}
	
	@QAFTestStep(description="user verify Rate us label")
	public void verifyLabelText(){
		contactUsPage.verifylabel();
	}
}
