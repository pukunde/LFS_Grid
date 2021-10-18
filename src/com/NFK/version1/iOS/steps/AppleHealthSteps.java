package com.NFK.version1.iOS.steps;

import com.NFK.version1.iOS.pages.AppleHealthPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class AppleHealthSteps {
	
	AppleHealthPageIOS appleHealth = new AppleHealthPageIOS();
	
	@QAFTestStep(description="user launch apple health app")
	public void launchAppleHealth(){
		appleHealth.startAppleHealthApp();
	}
	
	@QAFTestStep(description="user verify {0} heading value")
	public void verifyAppleHealthValues(String contentValue){
		appleHealth.verifyAppleHealthValues(contentValue);
	}
	
	@QAFTestStep(description="user select {0} from the menu")
	public void navigateToAppleHealthLabel(String label){
		appleHealth.navigateToAppleHealthLabel(label);
	}
	
	@QAFTestStep(description="user click on {0} button")
	public void clickButton(String button){
		appleHealth.clickButton(button);
	}
	
	@QAFTestStep(description="user verify {0} as page heading")
	public void verifyPageHeadingTitle(String heading){
		appleHealth.verifyPageHeadingTitle(heading);
	}
	
	@QAFTestStep(description="user add value as {0} on apple health")
	public void addValueForAppleHealth(String contentValue){
		appleHealth.addValueForAppleHealth(contentValue);
	}
	
	@QAFTestStep(description="user select {0} date on apple health")
	public void addDateForAppleHealth(String date){
		appleHealth.addDateForAppleHealth(date);
	}
	
	@QAFTestStep(description="user enter {0} carb value")
	public void addCarbValueIntoAppleHealth(String carbValue){
		appleHealth.addCarbValueIntoAppleHealth(carbValue);
	}
	
	@QAFTestStep(description="user select {0} {1} time on apple health")
	public void addTimeForAppleHealth(int hour, int minute){
		appleHealth.addTimeForAppleHealth(hour, minute);
	}
	
	
	@QAFTestStep(description="user verify enable login button")
	public void verifyEnableLoginButton(){
		appleHealth.verifyEnableLoginButton();
	}
	
	@QAFTestStep(description="user enter {0} for carb as given")
	public void enterCarbData(Object value){
		appleHealth.enterCarbData(value);
	}
	
	@QAFTestStep(description="user navigates to Carbohydrates screen")
	public void navigateToCarbohydrates(){
		appleHealth.navigateToCarbohydrates();
	}
	
	@QAFTestStep(description="user turn on all category option")
	public void turnonCategoryOption(){
		appleHealth.turnonCategoryOption();
	}
	
		
}
