package com.NFK.version1.android.beans;

import com.qmetry.qaf.automation.data.BaseDataBean;

public class ReminderDetailsBeans extends BaseDataBean {

	String repeat,glucose,snack,eat,activity,strips,Bolus,medication,minuteAdd;

	public String getRepeat() {
		return repeat;
	}

	public String getGlucose() {
		return glucose;
	}

	public String getSnack() {
		return snack;
	}

	public String getEat() {
		return eat;
	}

	public String getActivity() {
		return activity;
	}

	public String getStrips() {
		return strips;
	}

	public String getBolus() {
		return Bolus;
	}

	public String getMedication() {
		return medication;
	}

	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}

	public void setGlucose(String glucose) {
		this.glucose = glucose;
	}

	public void setSnack(String snack) {
		this.snack = snack;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setStrips(String strips) {
		this.strips = strips;
	}

	public void setBolus(String bolus) {
		Bolus = bolus;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}
	
	public void setMinuteAdd(String minuteAdd){
		this.minuteAdd = minuteAdd;
	}
	
	public String getMinuteAdd(){
		return minuteAdd;
	}												  
	
}
