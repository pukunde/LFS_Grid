package com.NFK.version1.android.steps;

import com.NFK.version1.android.pages.MyMeters;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class MyMetersSteps {
	MyMeters myMetersPage = new MyMeters();
	@QAFTestStep(description = "user verifies My Meters page UI") 
		public void verifyMyMetersPageUI() {
			myMetersPage.myMetersUI();
	}
	
	@QAFTestStep(description = "user taps time update switch")
		public void tapTimeUpdate() {
		myMetersPage.timeUpdate();
	}
	
	@QAFTestStep(description = "user clicks cancle button on meter not found pop up")
	public void pairMeter(){
		myMetersPage.clickToPairMeter();
		
	}
	
	@QAFTestStep(description="user navigates to homepage")
	public void navigateHomepage(){
		myMetersPage.navigateToHomepage();
	}
	
	@QAFTestStep(description="user initiate meter pairing")
	public void InitiateMeterPairings(){
		myMetersPage.initiateMeterPairing();
	}
	@QAFTestStep(description="user cancel meter not found popup")
	public void cancelMeterNotFoundPopUp(){
		myMetersPage.cancelOnMeterNotFoundPopUp();
	}
	@QAFTestStep(description="meter search start")
	public void searchStart(){
		myMetersPage.meterSyncStart();
	}
		
	
	
}
	
	
