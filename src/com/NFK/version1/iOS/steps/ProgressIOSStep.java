package com.NFK.version1.iOS.steps;

import com.NFK.version1.android.pages.ProgressPageAndroid;
import com.NFK.version1.iOS.pages.ProgressPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class ProgressIOSStep {
	
	ProgressPageIOS progresspage=new ProgressPageIOS();
	
	@QAFTestStep(description = "user clicks on progress tab and verifies the My progress screen")
	public void verifyAddedEventOnprogressScreen(){
		progresspage.clickProgressBar(); 
		progresspage.verifyProgressScreen();
	}
	
	@QAFTestStep(description="user verifies the Glucose Average and GMI for {0} days")
	public void userVerifiesTheGlucoseAverageAndGMI(String opt){
		progresspage.verifyAverage(opt);
	}
	@QAFTestStep(description="user verifies current data and past data displays for the {0} days")
	public void userCurrentDataPastDataCompare(String opt){
		progresspage.compareData(opt);
	}
	@QAFTestStep(description="user verifies the My Progress screen when no CGM data")
	public void userVerifiesTheMyProgressScreen(){
		progresspage.clickProgressBar();
		progresspage.noDataProgressScreen();
	}
	@QAFTestStep(description = "user checks message for number of days data not available")
	public void verifyMessageNodata() {
		progresspage.textNoData(); 
	}
	@QAFTestStep(description="user verifies the Low Glucose Events on My Progress screen")
	public void userVerifiesTheLowGlucoseEventsOnMyProgressScreen(){
		progresspage.clickProgressBar();
		progresspage.verifyLowEvents();
		progresspage.verifyNoOfLowEvents();
		}
	@QAFTestStep(description="user verifies Ambulatory Glucose Profile section on My Progress screen")
	public void userVerifiesAmbulatoryGlucoseprofile(){
		progresspage.verifyAGPsection();
		progresspage.verifyGlucoseProfile();
		progresspage.verifyDailyGlucoseProfile();
		progresspage.verifyViewFullAGpReport();
		}
	
	
}
