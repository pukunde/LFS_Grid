package com.NFK.version1.android.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class WiniumConnection {
	
public static RemoteWebDriver driver;

public WiniumDriver getDriver() throws MalformedURLException {

	DesktopOptions options = new DesktopOptions(); // Instantiate Winium Desktop Options
	String path=System.getProperty("user.dir");
	String path2=path+"//server//windows//MoteConfig//MoteTestConfig.exe";
	options.setApplicationPath(path2);
	WiniumDriver winiumDriver = new WiniumDriver(new URL("http://localhost:9999"), options);
	return winiumDriver;

			
//		DesiredCapabilities  cap = new DesiredCapabilities();
//		
//		cap.setCapability("app", "F:\\Emulator Tool\\Emulator_V2_0_9_1\\MoteTestConfig.exe");
//		//options.setApplicationPath("D:\\Emulator_V2_0_9_1\\Emulator_V2_0_9_1\\Emulator_V2_0_9_1\\MoteTestConfig.exe");
//		//driver = new RemoteWebDriver(new URL("http://192.168.1.108:9999"), cap); 
//                //uncomment above code for running on remote machine 
//		driver = new RemoteWebDriver(new URL("http://192.168.1.156:9999"), cap);
//		return driver;
	}

	public static void minimizeAllWindows() throws InterruptedException, AWTException {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
	}

}
