package com.NFK.version1.android.steps;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.pages.DeviceSettingsPageAndroid;
import com.NFK.version1.iOS.pages.CountryselectionPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class DeviceSettingsSteps {

	DeviceSettingsPageAndroid devicePage = new DeviceSettingsPageAndroid();
	
	/*
	 * Provide parameter value in days from today's date.
	 * 
	 */
	@QAFTestStep(description = "user change device date as {0}")
	public void changeDeviceDateTomorrow(String date) {
		devicePage.changeDeviceDate(date);
	}
	
	@QAFTestStep(description = "user open date tab of device")
	public void openDateTab() {
		devicePage.openSystemDate();
	}
	
	@QAFTestStep(description="user switchoff wifi")
	public void switchWiFi() {
		LFSUtilsAndroid.turnWifiOff();
		
	}
	@QAFTestStep(description = "user close setting activity")
	public void closeSettingActivityAnd() {
		devicePage.closeSettingActivity();
	}
	@QAFTestStep(description = "user switch on automatic time update")
	public void switchOnAutomaticTimeUpdate() {
		devicePage.switchOnAutomaticTimeUpdateSwitch();
	}
		
}
