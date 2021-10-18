package com.NFK.version1.android.steps;

import com.NFK.version1.android.pages.GoogleFitPageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class GoogleFitSteps {
	
	
	
	@QAFTestStep(description="user verify and connect to Google fit from connection")
	public void verifyPreConnectionGoogleFit() {
		GoogleFitPageAndroid googleFitPage = new GoogleFitPageAndroid();
		googleFitPage.verifyPreConnectionAndConnect();
	}
	
	@QAFTestStep(description="user verify user is connected to Google fit successfully")
	public void verifyConnectionSuccess() {
		GoogleFitPageAndroid googleFitPage = new GoogleFitPageAndroid();
		googleFitPage.verifySuccessfullConnectionWithGoogleFit();
	}

}
