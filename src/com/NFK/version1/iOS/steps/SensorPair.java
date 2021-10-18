 package com.NFK.version1.iOS.steps;


import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.pages.SensorPairPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class SensorPair {
	
	
	SensorPairPageIOS sensorpair= new SensorPairPageIOS();

	
    @QAFTestStep(description="user enters valid sensor pair code")	
    public void userEntersValidSensorPairCode() {
    	sensorpair.enterSensorcode();
    }
	
  
    @QAFTestStep(description="user waiting to connect to sensor")
    public void userWaitingToConnectToSensor() {
    	sensorpair.connectingToSensor();
    }
   
    @QAFTestStep(description="user redirects to Apply sensor screen and clicks on How to apply sensor link")	
    public void userselectsensorloaction() {
    	sensorpair.verifyapplysensor();
    	sensorpair.verifyhowtoapplysensorlink();
    	sensorpair.verifyhelpfultipslink();
    }
    
    @QAFTestStep(description="user redirects to Apply sensor screen for two to five year old kid and clicks on How to apply sensor link")	
    public void userselectsensorlocations() {
    	sensorpair.verifyapplysensor2to6yrold();
    	sensorpair.verifyhowtoapplysensorlink();
    	sensorpair.verifyhelpfultipslink();
    }
    
         
    @QAFTestStep(description="user selects {0} location of body to apply sensor")
    public void userSelectsTheLocationOfSensorToApplyOnBody(String location){
    	sensorpair.selectBodyLocation(location); 
    }
}
