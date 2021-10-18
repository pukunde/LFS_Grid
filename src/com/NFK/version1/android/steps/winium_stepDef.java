package com.NFK.version1.android.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.winium.WiniumDriver;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.pages.WiniumConnection;
import com.qmetry.qaf.automation.step.QAFTestStep;



public class winium_stepDef extends WiniumConnection {

	public static WiniumDriver windriver;
	public static String passkey;

	@QAFTestStep(description = "^the user has initialized winium and android drivers$")
	public void the_user_has_initialized_winium_and_android_drivers() {
		try {
			minimizeAllWindows();
			windriver = getDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
		LFSUtilsAndroid.pause(4000);
	}

	@QAFTestStep(description = "the user selects the test case {0} to run in the moteconfig popup")
	public void the_user_selects_the_test_case_something_to_run_in_the_moteconfig_popup(String testcase) {
		LFSUtilsAndroid.pause(4000);
		try {
			windriver.findElement(By.name(testcase)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@QAFTestStep(description = "^the user selects the Random button on moteconfig popup$")
	public void the_user_selects_the_random_button() {
		LFSUtilsAndroid.pause(4000);
		try {
			windriver.findElement(By.name("Random")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		LFSUtilsAndroid.pause(5000);
	}

	@QAFTestStep(description = "^the user selects the Program button on moteconfig popup$")
	public void the_user_selects_the_program_button() {
		try {
			windriver.findElement(By.name("Program")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@QAFTestStep(description = "^the user selects the OK button on moteconfig popup$")
	public void the_user_selects_the_ok_buton() {
		LFSUtilsAndroid.pause(20000);

		try {
			windriver.findElement(By.name("Ok")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@QAFTestStep(description = "^the user copies the passkey on moteconfig popup$")
	public void the_user_copies_the_passkey() {
		try {
			passkey = windriver.findElement(By.xpath("//*[@ClassName='TextBox'][6]")).getText();
		} catch (Exception e) {
			e.printStackTrace();
		}

		passkey = passkey.replace("-", "");
		passkey = passkey.replace(" ", "");
		System.out.println("Passkey==================================" + passkey);

	}

}
