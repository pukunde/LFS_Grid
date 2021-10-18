package com.NFK.version1.android.steps;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.pages.DecisionPageAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class DecisionSteps {

	DecisionPageAndroid decisionPageAndroid = new DecisionPageAndroid();

	@QAFTestStep(description = "user gets redirected to Decision screen")
	public void verifydecisionScreen() {
		decisionPageAndroid.verifyDecisionScreen();	
	}

	@QAFTestStep(description = "user selects {0} option")
	public void selectDecisionScreen(String option) {
		decisionPageAndroid.selectDecisionScreen(option);
		
	}
	
	@QAFTestStep(description = "user selects {0} option and verifies the screen")
	public void selectDecisionScreenOptions(String option1) {
		decisionPageAndroid.selectDecisionOptions(option1);
		
	}
	
	@QAFTestStep(description = "user taps on Back button and gets redirected to Decision screen")
	public void clcikBackBtn() {
		LFSUtilsAndroid.waitforLoad();
		decisionPageAndroid.clickBackBtn();
		LFSUtilsAndroid.waitforLoad();	
		Reporter.logWithScreenShot("User is on Decision Page ", MessageTypes.Pass);
	}
	
	  
	   @QAFTestStep(description = "user taps on Back button")
	   public void userTapsBackBtn() {
		   decisionPageAndroid.clickBackBtn();
	   } 
	   

	@QAFTestStep(description = "user verifies the Log-in page")
	public void verifyLogin() {
		decisionPageAndroid.verifyLogin();

	}

	@QAFTestStep(description = "user verifies the Sign-up page")
	public void verifySignup() {
		decisionPageAndroid.verifySignup();

	}

	@QAFTestStep(description = "user verifies country selection screen after tapping on Back button of decision screen")
	public void verifyCountrySelection() {
	   decisionPageAndroid.verifyCountrySelectionPage();

	}

}
