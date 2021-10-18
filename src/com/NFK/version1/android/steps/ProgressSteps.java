package com.NFK.version1.android.steps;

import com.NFK.version1.android.pages.ProgressPageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class ProgressSteps {
	
	ProgressPageAndroid progresspage = new ProgressPageAndroid();
	
	@QAFTestStep(description = "user clicks on progress tab and verifies the My progress screen")
	public void verifyAddedEventOnprogressScreen(){
		progresspage.clickProgressBar();
		progresspage.verifyMyProgress();
	}
	
/*	@QAFTestStep(description = "user verifies the Glucose Average and GMI")
	public void verifyGlucoseAverageGMI(){
		progresspage.verifyAverage();
	}
	*/
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
    @QAFTestStep(description = "user verifies the Low Glucose Events on My Progress screen")
	public void verifyLowGlucoseEvents() {
    	progresspage.clickProgressBar();
		progresspage.verifyLowEvents(); 
	}
	
    @QAFTestStep(description="user verifies Ambulatory Glucose Profile section on My Progress screen")
	public void userVerifiesAmbulatoryGlucoseprofile(){
		progresspage.verifyAGPsection();
		progresspage.verifyGlucoseProfile();
		progresspage.verifyDailyGlucoseProfile();
		progresspage.verifyViewFullAGpReport();
		}
	
}
