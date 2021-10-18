package com.NFK.support;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;


import com.NFK.version1.android.beans.UserDetailBeans;
import com.google.gson.Gson;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.ws.rest.RestTestBase;


public class ApiMethods extends RestTestBase {
	private String baseURL = "https://api.test14.lfs.cl.datapipe.net/";
	private String contentType = "application/json";
	private String platform = "android";
	private String language = "en_US";
	private String country = "US";
	private String appName = "CGM_MOBILE_ANDROID";
	private String appOriginRT = "RealTime";
	private String appVersionRT = "1.0-adhoctest";
	private String connection = "Keep-Alive";


	public String createAccountNFK(String fName, String lName, String email, String password) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("firstName", fName);
		data.put("lastName", lName);
		data.put("emailAddress", email);
		data.put("password", password);
		data.put("gender", "M");
		data.put("dateOfBirth", "19961104");
		data.put("diabetesType", "DIABETES_TYPE_2");

		String response = getWebResource(this.baseURL, "cgm/user/v1").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
				.header("optin", "false").header("cliniccode", "").header("appname", this.appName)
//				.header("requesttoken", encryptToSHA(encryptToSHA(email) + email)).header("apporigin", this.appOriginFA)
//				.header("appversion", this.appVersionFA).header("Connection", this.connection)
				.post(String.class, new Gson().toJson(data));

		return response;
	}

	public String loginNFK(String email, String password) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("login", email);
		data.put("password", password);

		String response = getWebResource(this.baseURL, "cgm/user/v1/login").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
				.header("appname", this.appName).header("apporigin", this.appOriginRT)
				.header("appversion", this.appVersionRT).header("Connection", this.connection)
				.post(String.class, new Gson().toJson(data));

		return response;
	}
	
	public String signupNFK(String userdetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userdetails instanceof String) {

			userBean.fillFromConfig((String) userdetails);
		} else {
			userBean.fillData(userdetails);
		}
		System.out.println(ConfigurationManager.getBundle().getProperty("register.email.key"));
		String email = (String) ConfigurationManager.getBundle().getProperty("register.email.key");
		Map<String, String> data = new HashMap<String, String>();
		data.put("emailsignup", email);
		data.put("confirmemail",email);
		data.put("password", userBean.getPassword());
		data.put("confirmpassword", userBean.getPassword());
		data.put("fname",userBean.getFirstName());
		data.put("lname",userBean.getLastName());
		

		String response = getWebResource(this.baseURL, "cgm/user/v1").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
				.header("appname", this.appName).header("apporigin", this.appOriginRT)
				.header("appversion", this.appVersionRT).header("Connection", this.connection)
				.post(String.class, new Gson().toJson(data));

		return response;
	}

	public String getAllFollowers(String token) {
		String response = getWebResource(this.baseURL, "cgm/follower/v1").header("Content-Type", this.contentType)
				.header("Content-Type", this.contentType).header("platform", this.platform)
				.header("language", this.language).header("country", this.country).header("appname", this.appName)
				.header("apporigin", this.appOriginRT).header("appversion", this.appVersionRT)
				.header("Connection", this.connection).header("authorization", token).get(String.class);

		return response;
	}

	public String updateAppOrigin(String token) {
		Map<String, Object> data2 = new LinkedHashMap<String, Object>();
		data2.put("key", "PATIENT_APP_ORIGIN");
		data2.put("lastUpdatedDate", System.currentTimeMillis());
		data2.put("value", "RealTime");

		Object ob[] = { data2 };
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put("config", ob);
		data.put("uom", "mg/dL");

		Gson js = new Gson();

		MyClient my = new MyClient();
		my.createClient();
		String response = "";
		try {
			response = getWebResource(this.baseURL, "cgm/user/v1").header("Content-Type", this.contentType)
					.header("platform", this.platform).header("language", this.language).header("country", this.country)
					.header("appname", this.appName).header("apporigin", this.appOriginRT)
					.header("appversion", this.appVersionRT).header("Connection", this.connection)
					.header("authorization", token).method("PATCH", String.class, js.toJson(data));
		} catch (Exception e) {
		}

		return response;
	}

	public String sendInvite(String token, String name, String followerEmail) {
		Map<String, String> data2 = new HashMap<String, String>();
		data2.put("allowNotification", "false");
		data2.put("allowTrendGraphView", "true");
		data2.put("sensorExpirationDateEnabled", "true");

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("name", name);
		data.put("email", followerEmail);
		data.put("settings", data2);

		Gson js = new Gson();

		String response = getWebResource(this.baseURL, "cgm/follower/v1").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
				.header("appname", this.appName).header("apporigin", this.appOriginRT)
				.header("appversion", this.appVersionRT).header("Connection", this.connection)
				.header("authorization", token).post(String.class, js.toJson(data));
		return response;
	}

	public String removeFollowerFromSharerApp(String token, String followerId) {
		String response = "";
		try {
			response = getWebResource(this.baseURL, "cgm/follower/v1/" + followerId)
					.header("Content-Type", this.contentType).header("platform", this.platform)
					.header("language", this.language).header("country", this.country).header("appname", this.appName)
					.header("apporigin", this.appOriginRT).header("appversion", this.appVersionRT)
					.header("Connection", this.connection).header("authorization", token).delete(String.class);
		} catch (Exception e) {
		}

		return response;
	}

	public String loginFA(String followerEmail, String password) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("username", followerEmail);
		data.put("password", password);

		String response = getWebResource(this.baseURL, "follow/user/v1/login").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
//				.header("appOrigin", this.appOriginFA).header("appVersion", this.appVersionFA)
				.header("Connection", this.connection).post(String.class, new Gson().toJson(data));

		return response;
	}

	public String acceptInvite(String token, String invitationToken) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("invitationToken", invitationToken);

		String response = getWebResource(this.baseURL, "follow/user/v1/accept").header("Content-Type", this.contentType)
				.header("platform", this.platform).header("language", this.language).header("country", this.country)
//				.header("appOrigin", this.appOriginFA).header("appVersion", this.appVersionFA)
				.header("Connection", this.connection).header("authorization", token)
				.post(String.class, new Gson().toJson(data));

		return response;
	}

	public String encryptToSHA(String input) {
		String sha1 = "";
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
			digest.reset();
			digest.update(input.getBytes("utf8"));
			sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sha1;
	}

	public void addLoginDetails(
			String NFKEmail, String NFKPassword, int noOfData, int noofdays, int[] cgmval) {
		// createAccountNFK(NFKFName, NFKLName, NFKEmail, NFKPassword);
		String tokenNFK = extractKey("\"token\":\"(.*?)\"", loginNFK(NFKEmail, NFKPassword));
	   sendReadings(tokenNFK,noOfData,noofdays,cgmval);
	
	}
	public void addLoginDetailsLow(
			String NFKEmail, String NFKPassword, int noOfData, int noofdays, int[] cgmval) {
		// createAccountNFK(NFKFName, NFKLName, NFKEmail, NFKPassword);
		String tokenNFK = extractKey("\"token\":\"(.*?)\"", loginNFK(NFKEmail, NFKPassword));  
		sendLowReadings(tokenNFK,noOfData,noofdays,cgmval);

	}
	
	public void remove(String NFKEmail, String NFKPassword, String followerEmail, String followerPassword) {
		String token = extractKey("\"token\":\"(.*?)\"", loginNFK(NFKEmail, NFKPassword));
		String followerId = extractKey("\"followerId\":\"(.*?)\"", loginFA(followerEmail, followerPassword));
		removeFollowerFromSharerApp(token, followerId);
	}

	public String extractKey(String regex, String stringToExtractFrom) {
		Pattern pattern = Pattern.compile(regex);
		java.util.regex.Matcher matcher = pattern.matcher(stringToExtractFrom);
		String result = "";
		if (matcher.find()) {
			result = matcher.group(1);
		}
		return result;
	}

	public String sendReadings(String tokenNFK,int noOfData,int noofdays, int[] cgmval ) {
		Object obj[] = new Object[noOfData*noofdays];//no of data and no of days
		
		int count=0;
		
		for(int j=0;j<noofdays;j++) {		
        for(int values:cgmval)
			{
        	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDateTime myDateObj=LocalDateTime.now().minusDays(j);

			LocalDateTime minusHour = myDateObj.minusHours(1);
			String formattedDate = myFormatObj.format(minusHour.minusMinutes(count));

			TimeZone the_time_zone = TimeZone.getDefault();
			long mins = TimeUnit.MILLISECONDS.toMinutes(the_time_zone.getOffset(new Date().getTime() ));
			String formattedDateUTC = myFormatObj.format(minusHour.minusMinutes(mins+count));
			
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("readingDate", formattedDate.replace(" ", "T"));
				data.put("readingDateUtc", formattedDateUTC.replace(" ", "T"));
				data.put("value", values);
				data.put("trendArrow", "STEADY");
				data.put("onDemand", false);

				obj[count] = data;
				count++;
				System.out.println("Data "+data);
				}		
			
		}
	  
		Map<String, Object> data2 = new HashMap<String, Object>();
		data2.put("readings", obj);
		data2.put("deviceSerialNumber", "000111008");
		data2.put("deviceType", "METERTYPES_GENERICCGM");

		Object[] obj2 = {data2};

		Map<String, Object> data3 = new HashMap<String, Object>();
		data3.put("cgmReadings", obj2);

		Gson js = new Gson();
		String response = getWebResource(this.baseURL, "cgm/readings/v2/cgm").
				header("Content-Type", this.contentType)
		.header("platform", this.platform).header("language", this.language).header("country", this.country)
		.header("appname", this.appName).header("apporigin", this.appOriginRT)
		.header("appversion", this.appVersionRT).header("Connection", this.connection)
		.header("authorization", tokenNFK).post(String.class, js.toJson(data3));
		System.out.println("Response---"+response);
		return response;
		}
	
	public String sendLowReadings(String tokenNFK, int noOfLowData, int noofLowdays, int[] cgmlowval) {
		Reporter.logWithScreenShot("Low days and no. of days "+noOfLowData+" "+noofLowdays, MessageTypes.Pass);
	       Object obj[] = new Object[noOfLowData*noofLowdays];//no of data and no of days
	       int count=0;
			
			for(int j=0;j<noofLowdays;j++) {	
			int min=0;	
	        for(int values:cgmlowval)
				{   
	        		
	     	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	     	 LocalDateTime myDateObj=LocalDateTime.now().minusDays(1);
	       	LocalTime localTime =LocalTime.parse("04:30:02");
           String timesub=	localTime.minusMinutes(min).toString();
           min++;
	        String time="T".concat(timesub);
           
	     	String datecurr=formatter.format(Date.from(myDateObj.minusDays(j).atZone(ZoneId.systemDefault()).
	     			toInstant())).concat(time);
	    		   formatter.setTimeZone(TimeZone.getDefault());	
		    String dateutc=formatter.format(Date.from(myDateObj.minusDays(j).atZone(ZoneId.systemDefault()).
		    		toInstant())).concat(time);
		   
			Map<String, Object> data = new HashMap<String, Object>();
			    data.put("readingDate", datecurr);
				data.put("readingDateUtc", dateutc);
				data.put("value", values);
				data.put("trendArrow", "STEADY");
				data.put("onDemand", false);

				obj[count] = data;
				count++;
				System.out.println("Data "+data);
				}		
			
		}	  
		Map<String, Object> data2 = new HashMap<String, Object>();
		data2.put("readings", obj);
		data2.put("deviceSerialNumber", "000111008");
		data2.put("deviceType", "METERTYPES_GENERICCGM");

		Object[] obj2 = {data2};

		Map<String, Object> data3 = new HashMap<String, Object>();
		data3.put("cgmReadings", obj2);
        System.out.println("data 3 --"+data3);
		Gson js = new Gson();
		String response = getWebResource(this.baseURL, "cgm/readings/v2/cgm").
				header("Content-Type", this.contentType)
		.header("platform", this.platform).header("language", this.language).header("country", this.country)
		.header("appname", this.appName).header("apporigin", this.appOriginRT)
		.header("appversion", this.appVersionRT).header("Connection", this.connection)
		.header("authorization", tokenNFK).post(String.class, js.toJson(data3));
		System.out.println("Response---"+response);
		return response;
			
		}
	
}
