package com.NFK.version1.iOS.steps;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.EmailRegistrationIOS;
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

	@QAFTestStep(description="verify Log book page does not show up  the manually added BG reading")
	public void verify_Log_bookData(){
		
		LoginPage loginPage = new LoginPage();
    	loginPage.verifyLogbookData();
	}
	
	@QAFTestStep(description="user open mobile browser")
	public void userOpenMobileBrowser(){
		EmailRegistrationIOS emailRegistrationIOS=new EmailRegistrationIOS();
		emailRegistrationIOS.openmMobileBrowser();
		Reporter.logWithScreenShot("malinator opened");
	}
	
	@QAFTestStep(description="user open malinator site and enter {0} details")
	public void userOpenAndGetVerificationEmail(String email){
		EmailRegistrationIOS emailRegistrationIOS=new EmailRegistrationIOS();
	emailRegistrationIOS.enterMailId(email);
		
	}
	
	@QAFTestStep(description="user change password and click on submitbutton")
	public void userChangepwd(){
		EmailRegistrationIOS emailRegistrationIOS=new EmailRegistrationIOS();
	emailRegistrationIOS.changePassword();
		Reporter.logWithScreenShot("Password change");
	}
	
	@QAFTestStep(description="user switch to native web driver")
	public void userSwitchToNativeWebDriver(){
		LFSUtilsIOS ios=new LFSUtilsIOS();
		ios.switchWebDriver();
	}

}
