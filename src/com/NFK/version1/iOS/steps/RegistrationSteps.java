package com.NFK.version1.iOS.steps;

import com.NFK.version1.iOS.pages.CountryselectionPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class RegistrationSteps {
	
	@QAFTestStep(description = "user start setting activity for date change")
	public void startSettingActivity() {
		CountryselectionPageIOS homePageIOS = new CountryselectionPageIOS();
		homePageIOS.startSettingActivity();
	}	
	@QAFTestStep(description = "user close setting activity")
	public void closeSettingActivity() {
		CountryselectionPageIOS homePageIOS = new CountryselectionPageIOS();
		homePageIOS.closeSettingActivity();
	}	
	
		
}
