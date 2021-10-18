package com.NFK.version1.android.steps;

import com.NFK.support.CallSMS;
import com.NFK.support.LFSUtilsIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.testng.report.Report;
import com.qmetry.qaf.automation.util.Reporter;

public class CallSMSSteps {
	CallSMS callSms=new CallSMS();
	
	@QAFTestStep(description="user call device using detail {0}")
	public void verifyContactPage(String deviceDetail){
		callSms.callDevice(deviceDetail);
		
	}
	@QAFTestStep(description="user receive call")
	public void reciveCall(){
		callSms.acceptCall();
		Reporter.log("after call", MessageTypes.Pass);
	}
	@QAFTestStep(description="user end call")
	public void endCall(){
		callSms.endCall();
		Reporter.log("after ending call", MessageTypes.Pass);
	}
	@QAFTestStep(description="user reject call")
	public void rejectCall(){
		callSms.rejectCall();
		Reporter.log("after rejecting call", MessageTypes.Pass);
	}
	@QAFTestStep(description="user open call app")
	public void openCallApp(){
		callSms.openCall();
		Reporter.log("opening call ", MessageTypes.Pass);
	}
	
	
	
}
