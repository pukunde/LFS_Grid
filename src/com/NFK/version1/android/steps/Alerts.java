package com.NFK.version1.android.steps;

import com.NFK.version1.android.pages.AlertsPageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class Alerts {

	AlertsPageAndroid alerts= new AlertsPageAndroid();
	
	@QAFTestStep(description="user verifies Alert screen")
	public void userVerifiesAlertScreen(){
		alerts.verifyAlertScreen();
	}
	
	@QAFTestStep(description="user clicks on {0} and verifies the screen")
	public void userClicksOnUrgentLowAlarmAndVerifiesTheScreen(String option){
       alerts.clickOnUrgentAlarmAndVerify(option);
	}
	@QAFTestStep(description="user reset the Alerts Settings")
	public void userResetAlertsSettings(){
       alerts.resetAlertsSettings();
	}
	@QAFTestStep(description="user clicks on Reset Alert Settings")
	public void userResetsVerifiesSettings(){
		alerts.clickResetAlerts();
	}
	@QAFTestStep(description="user reset all the alert settings")
	public void userResetAlertsSetting(){
		alerts.resetAlertsSettings();
	}
	@QAFTestStep(description="user verifies Alerts settings configuration to factory configuration")
	public void verifySettingsConfiguration(){
		alerts.getConfigurationSettinsg();
	}
	
	@QAFTestStep(description="user clicks back button and navigate to alert screen")
	public void userClicksBackButtonAndNavigateToAlertScreen(){
       alerts.clickBackbutton();
	}
	
	@QAFTestStep(description="user verify the sound and vibration screen of {0}")
	public void userVerifyTheSoundAndVibrationScreenOf(String str0){
	alerts.verifySoundAndVibrationScreen(str0);
	}
	
	@QAFTestStep(description="user clicks on {0} Alert and verifies the screen")
	public void userClicksOnAlertAndVerifiesTheScreen(String str0){
		alerts.clickAndVerifyScreen(str0);
	}

	@QAFTestStep(description="user updates the picker values present on {0} screen")
	public void userUpdatesThePickerValuesPresentOnScreen(String str0){
		alerts.updatePickervalue(str0);
	}
	
	@QAFTestStep(description="user verifies the updated picker values present on {0} screen")
	public void userVerifiesTheUpdatedPickerValuesPresent(String option){
		alerts.verifyUpdatedPickervalue(option);
	}
	
	@QAFTestStep(description="user enables the alert schedule and verifies the name field")
	public void userEnablesTheAlertScheduleAndVerifiesTheNameField(){
		alerts.enableAlertSchedule();
		alerts.verifyNameField();
	}
	
	@QAFTestStep(description="user clicks on name field and verifies Edit schedule screen")
	public void userTapsOnNameFieldAndNavigatesToEditScheduleScreen(){
	    alerts.clickScheduleName();
	    alerts.verifyEditScheduleScreen();
	}
	@QAFTestStep(description="user enters schedule name and verifies Alert screen on {0}")
	public void userchecksthedefaultvaluesoneditschedulescreen(String str){
	    alerts.enterScheduleName();
	    alerts.verifyScheduleField(str);
	}
	
	@QAFTestStep(description="user clicks on schedule name")
	public void userclicksonschedulename(){
	  alerts.clickScheduleName();
	}
	
	@QAFTestStep(description="user enables the alert schedule and clicks on schedule name")
	public void userEnablesTheAlertScheduleAndClicksOnScheduleName(){
		alerts.enableAlertSchedule();
		alerts.clickScheduleName();
	}
	
	@QAFTestStep(description="user clicks on {0} and update Picker values")
	public void userClicksOnAndUpdatePickerValues(String str){
		alerts.clicksOnPicker(str);
	}
	
	@QAFTestStep(description="user clicks on user {0} Alert schedule and verifies the screen")
	public void userClicksOnUserAlertScheduleAndVerifiesTheScreen(String str0){
		alerts.clickUserAlertSchedule(str0);
	}
	
	
}
