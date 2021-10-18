package com.NFK.version1.android.steps;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.pages.SensorPairPageAndroid;
import com.NFK.version1.iOS.pages.SensorPairPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class SensorPairSteps {

	SensorPairPageAndroid sensorpairpage= new SensorPairPageAndroid(); 
	
	@QAFTestStep(description="user enters valid sensor pair code")
	public void userEntersValidSensorPairCode(){
		sensorpairpage.entersensorCode();
	}
	@QAFTestStep(description="user redirects to Apply sensor screen")
	public void checkApplySensorsc(){
		sensorpairpage.verifyapplysensor();
	}
	
	@QAFTestStep(description="user verifies the Location Access permission")
			public void verifiesLocationAccessPermission(){
		sensorpairpage.checkLocationAccessPOpup();
	}
			
	@QAFTestStep(description="user selects Start Session")
	public void userSelectsStartSession(){
		sensorpairpage.selectSensorSession();
	}
		
	 @QAFTestStep(description="user selects {0} location of body to apply sensor")
	    public void userSelectsTheLocationOfSensorToApplyOnBody(String location){
	    	sensorpairpage.selectbodyLocation(location);  
	    }  
	    
	    @QAFTestStep(description="user waiting to connect to sensor")
	    public void userWaitingToConnectToSensor() {
	    	sensorpairpage.connectingtoSensor();
	    }
	  

		@QAFTestStep(description="user redirects to Apply sensor screen and clicks on How to apply sensor link")
		public void userselectsensorloaction() {
		sensorpairpage.verifyapplysensor();
		sensorpairpage.verifyhowtoapplysensorlink();
		sensorpairpage.verifyhelpfultipslink();
		}

		@QAFTestStep(description="user redirects to Apply sensor screen for two to five year old kid and clicks on How to apply sensor link")
		public void userselectsensorlocations() {
		sensorpairpage.verifyapplysensor2to6yrold();
		sensorpairpage.verifyhowtoapplysensorlink();
		sensorpairpage.verifyhelpfultipslink();
		}
		
		@QAFTestStep(description = "the user selects the Next button in the mobile app to start the pairing process")
		public void userSelectsNextButtonStartPairing() {
			sensorpairpage.selectsNextButtonStartPairing();
		}
		
		@QAFTestStep(description = "the user enters the passkey in the field and verify reading displayed on home screen")
		public void the_user_enters_the_passkey_in_the_field()  {
			LFSUtilsAndroid.pause(5000);
			sensorpairpage.enterPasskeyAndVerifyRedingDisplayedOnHomeScreen();
		}
		@QAFTestStep(description = "the user selects the ALLOW button in popup")
		public void the_user_selects_the_Allow_Button() {
			sensorpairpage.clickOnAllowButton();
		}
		
		@QAFTestStep(description = "the user selects the NOT NOW button in the popup")
		public void the_user_selects_the_NotNow_Button(){
			sensorpairpage.clickOnNotNowButton();
		}
		@QAFTestStep(description = "the user verify Sensor reading on home screen")
		public void the_user_verify__sensor_reading(){
			sensorpairpage.verifySensorReadingOnHomeScreen();
		}
		
		
		@QAFTestStep(description = "the user enters the passkey")
		public void the_user_enters_the_passkey()  {
			LFSUtilsAndroid.pause(5000);
			sensorpairpage.eneterPasskey();
		}
		
		@QAFTestStep(description = "the user closes sensor expires popup")
		public void the_user_closes_sensor_expires_popup()  {
			LFSUtilsAndroid.pause(5000);
			sensorpairpage.closeSensorExpirePopup();
		}
		
		@QAFTestStep(description = "the user closes sensor warmup alert")
		public void the_user_closes_sensor_warmup_alert()  {
			LFSUtilsAndroid.pause(5000);
			sensorpairpage.verifySensorWarmupAlertAndClose();
		}
		
		@QAFTestStep(description = "the user verify Sensor warmup alert")
		public void the_user_verify__sensor_warmup_alert(){
			sensorpairpage.verifySensorWarmupAlertAndClose();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
