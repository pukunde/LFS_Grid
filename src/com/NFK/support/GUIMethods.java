package com.NFK.support;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GUIMethods {

	
	/**
	 * This method finds the image through text provided as key
	 * @param dr : Android driver
	 * @param text : property value in the property file, pass the property key to this variable
	 * @param log : elastic serach logging instance
	 * @return if image text can be find successfully then it will return true otherwise false 
	 */
	public boolean imageTextFind(AppiumDriver<?> dr, String text){
			
			String command = "mobile:text:find";
			Map<String, Object> params = new HashMap<>();
			params.put("content",text);
			params.put("context", "all");
			params.put("source", "primary");
			params.put("timeout", "3");
			params.put("ignorecase", "case");
			params.put("threshold", "51");
			String boolstr = (String) dr.executeScript(command, params);
			if (boolstr.equals("false")){
				return false;
			}
			return true;
	}

	public boolean waitforImageText(AppiumDriver<?> dr, String property, int noofchecks
			) {

			int i = 0;
			while (i <= noofchecks) {
				if (imageTextFind(dr,property)) {
					return true;
				}
				i++;
			}
			return false;

	}

}
