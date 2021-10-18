package com.NFK.version1.iOS.steps;

import com.NFK.version1.iOS.pages.DecisionPageIOS;
import com.NFK.version1.iOS.pages.SignupPageIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class DecisionIOSStep {
	
	DecisionPageIOS decisionPage = new DecisionPageIOS();
	
	 @QAFTestStep(description = "user gets redirected to Decision screen")
     public void userRedirectToDecisionScreen() {
		 decisionPage.verifyDecisionscreen();
   }
	
    @QAFTestStep(description="user selects {0} option")
    public void userSelectsOption(String option){
  	  decisionPage.redirectToDecisionPage(option);
    }
    
    @QAFTestStep(description = "user selects {0} option and verifies the screen")
	public void selectDecisionScreenOptions(String option1) {
    	decisionPage.selectDecisionOptions(option1);
		
	}

   @QAFTestStep(description = "user verifies country selection screen after tapping on Back button of decision screen")
    public void userOnCountrySelectionScreen() {
    decisionPage.CountrySelectionScreen();
	  }	
 
   @QAFTestStep(description = "user taps on Back button and gets redirected to Decision screen")
   public void userTapsBackBtnRedirectToDecisionScreen() {
	   decisionPage.RedirectToDecisionScreenFromSignUpScreen();
 } 
   @QAFTestStep(description = "user taps on Back button")
   public void userTapsBackBtnDecisionScreen() {
	   decisionPage.redirectToPreviousPage();
 } 
    
}
