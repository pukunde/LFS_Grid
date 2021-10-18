package com.NFK.version1.iOS.steps;

import com.NFK.support.APICnfing;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class APISteps {
	@QAFTestStep(description = "user get response data {0}")
	 public void verifyResponseAtt(String responseAttribute) {
	 APICnfing.response_value_Attribute(responseAttribute);
	 }
	@QAFTestStep(description = "Random userdetail generation for {0} days in past")
	 public void randomUserDetailsGenPastIOS(String days) {
		APICnfing tst=new APICnfing();
		tst.generateRandomUserDetails(days);
	 }
	@QAFTestStep(description = "Random userdetail generation for {0} days in future")
	 public void randomUserDetailsGenfutureIOS(String days) {
		APICnfing tst=new APICnfing();
		tst.generateRandomUserDetailsFuture(days);
	 }
	@QAFTestStep(description = "Random userdetail generation for today {0}")
	 public void randomUserDetaGernerationForToday(String days) {
		APICnfing tst=new APICnfing();
		tst.generateRandomUserDetailsToday(days);
	 }
}
