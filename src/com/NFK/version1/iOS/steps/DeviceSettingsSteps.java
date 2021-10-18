package com.NFK.version1.iOS.steps;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.iOS.pages.DeviceSettingsPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class DeviceSettingsSteps {
	
	DeviceSettingsPageIOS devicePage = new DeviceSettingsPageIOS();
	
	@QAFTestStep(description = "user open date tab of device")
	public void openDateTab() {
		devicePage.openSystemDate();
	}
	
	@QAFTestStep(description = "user change device date as {0}")
	public void changeDeviceDateTomorrow(String date) {
		devicePage.changeDeviceDate(date);
	}
	@QAFTestStep(description = "user switch on automatic time update")
	public void switchOnAutomaticTimeUpdate() {
		devicePage.switchOnAutomaticTimeUpdateSwitch();
	}
		
	
}
