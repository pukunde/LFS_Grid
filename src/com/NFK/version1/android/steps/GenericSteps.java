package com.NFK.version1.android.steps;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.pages.EmailregistrationPage;
import com.NFK.web.common.pages.LoginPage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.util.Reporter;

public class GenericSteps {
	
	 @QAFTestStep(description="user login into app")
	    public void doLogin(){
	    	LoginPage loginPage = new LoginPage();
	    	loginPage.doLoginWithCred();
	    }

	 @QAFTestStep(description="user switch to web driver")
	    public void switchToWeb(){
	    	LoginPage loginPage = new LoginPage();
	    	loginPage.switchDriverToWeb();
	    }
	 
	 @QAFTestStep(description="user switch to native driver")
	    public void switchToNative(){
	    	LoginPage loginPage = new LoginPage();
	    	loginPage.switchDriver();
	    }
	 
	 
	@QAFTestStep(description="click on the connections screen in Web")
	public void clickOnConnections(){
		
		LoginPage loginPage = new LoginPage();
    	loginPage.clickOnConnections();
	
	}
	
	
	@QAFTestStep(description="user click on web logbook tab")
	public void click_web_logbook_tab(){
		
		LoginPage loginPage = new LoginPage();
    	loginPage.clickOnLogbookTab();
	}

	
	@QAFTestStep(description="verify Log book page does not show up the manually added BG reading")
	public void verify_Log_bookData(){
		
		LoginPage loginPage = new LoginPage();
    	loginPage.verifyLogbookData();
	}

	@QAFTestStep(description="user open mobile browser")
	public void userOpenMobileBrowser(){
		EmailregistrationPage EmailregistrationPage=new EmailregistrationPage();
		EmailregistrationPage.openmMobileBrowser();
		Reporter.logWithScreenShot("Browser opened");
	}
	
	@QAFTestStep(description="user open malinator site and enter {0} details")
	public void userOpenAndGetVerificationEmail(String email){
		EmailregistrationPage EmailregistrationPage=new EmailregistrationPage();
		EmailregistrationPage.enterMailId(email);
	
	}
	
	@QAFTestStep(description="user change password and click on submitbutton")
	public void userChangepwd(){
		EmailregistrationPage EmailregistrationPage=new EmailregistrationPage();
		EmailregistrationPage.changePassword();
		Reporter.logWithScreenShot("Password change");
	}

	@QAFTestStep(description="user switch to native web driver")
	public void userSwitchToNativeWebDriver(){
		LFSUtilsAndroid android=new LFSUtilsAndroid();
		android.switchToMobileWeb();
	}

}
