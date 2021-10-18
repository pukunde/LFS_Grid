package com.NFK.version1.iOS.beans;

import com.qmetry.qaf.automation.data.BaseDataBean;

public class AppleHealthDataBeans extends BaseDataBean{
	
	String timeHr;
	String timeMinute;
    String gVal;
    
    public String getTimeHr() {
		return timeHr;
	}
	public void setTimeHr(String timeHr) {
		this.timeHr = timeHr;
	}
	public String getTimeMinute() {
		return timeMinute;
	}
	public void setTimeMinute(String timeMinute) {
		this.timeMinute = timeMinute;
	}
	public String getgVal() {
		return gVal;
	}
	public void setgVal(String gVal) {
		this.gVal = gVal;
	}

}
