package com.NFK.support;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.RandomStringUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ws.rest.RestTestBase;

public class APICnfing {

	/**
	 * 
	 * 
	 */
	public static void response_value_Attribute(String responseAttribute) {

		JsonObject responseBody =
				new JsonParser().parse(new RestTestBase().getResponse().getMessageBody())
						.getAsJsonObject();
		JsonObject responseBodyresult = (JsonObject) responseBody.get("result");
		String attributeValue =
				responseBodyresult.get(responseAttribute).toString().replace("\"", "");
		ConfigurationManager.getBundle().setProperty("authorization.token",
				attributeValue);
		System.out.println("Attribute value:" + attributeValue);

	}
	public static void dateFormatGenerator(String days) {
		int noOfDays = Integer.parseInt(days);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String sysTime = dateFormat.format(date);
		String splitString[] = sysTime.split(":");

		for (int i = 1; i <= noOfDays; i++) {
			String s = "0";
			if (i <= 9) {
				s = 0 + "" + i;
			} else {
				s = "" + i;
			}
			sysTime = splitString[0] + ":" + s + ":" + splitString[2];
			System.out.println(sysTime);
			String dateTime = getDifferenceDate(sysTime, i);
			ConfigurationManager.getBundle().setProperty("system.currenttime" + i,
					dateTime);
			ConfigurationManager.getBundle().setProperty("system.unixtime" + i,
					getUnxiTime(dateTime));
		}
		for (int i = 1; i <= noOfDays; i++) {
			String randomCharID = RandomStringUtils.randomAlphanumeric(39);
			ConfigurationManager.getBundle().setProperty("system.random.id" + i,
					randomCharID);
			System.out.println(randomCharID);
		}
	}
	public static void dateFormatGeneratorFuture(String days) {
		int noOfDays = Integer.parseInt(days);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String sysTime = dateFormat.format(date);
		String splitString[] = sysTime.split(":");

		for (int i = 1; i <= noOfDays; i++) {
			String s = "0";
			if (i <= 9) {
				s = 0 + "" + i;
			} else {
				s = "" + i;
			}
			sysTime = splitString[0] + ":" + s + ":" + splitString[2];
			System.out.println(sysTime);
			String dateTime = getDifferenceDateFuture(sysTime, i);
			ConfigurationManager.getBundle().setProperty("system.currenttime" + i,
					dateTime);
			ConfigurationManager.getBundle().setProperty("system.unixtime" + i,
					getUnxiTime(dateTime));
		}
		for (int i = 1; i <= noOfDays; i++) {
			String randomCharID = RandomStringUtils.randomAlphanumeric(39);
			ConfigurationManager.getBundle().setProperty("system.random.id" + i,
					randomCharID);
			System.out.println(randomCharID);
		}
	}

	public static void generateRandomGlucoseID(int count) {
		for (int i = 1; i <= count; i++) {
			String randomCharID = RandomStringUtils.randomAlphanumeric(39);
			ConfigurationManager.getBundle().setProperty("system.random.id" + i,
					randomCharID);
		}
	}


	public static String getUnxiTime(String dateTime) {

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = dateFormat.parse(dateTime);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		long unixTime = (long) date.getTime() / 1000;
		System.out.println(unixTime); // <- prints 1352504418
		return unixTime + "";
	}
	public static String getDifferenceDate(String dateTime, int dayCount) {

		int date = Integer.parseInt(dateTime.substring(8, 10));
		int month = Integer.parseInt(dateTime.substring(5, 7));
		int requiredDate = 0;
		for (int i = 0; i < 12; i++) {
			String monthString = LFSUtilsAndroid.monthIntValue(month + "").toString();
			int daysInMonth = Integer.parseInt(LFSUtilsAndroid.monthNoOFDay(monthString));

			if (dayCount < date) {
				requiredDate = date - dayCount;
			} else if (dayCount == daysInMonth) {
				month = month - 1;
				if (month == 0) {
					month = 12;
				}
				monthString = LFSUtilsAndroid.monthIntValue(month + "");
				requiredDate =
						Integer.parseInt(LFSUtilsAndroid.monthNoOFDay(monthString));
			} else if (dayCount < daysInMonth && dayCount > date) {
				dayCount = dayCount - date;
				month = month - 1;
				if (month == 0) {
					month = 12;
				}
				monthString = LFSUtilsAndroid.monthIntValue(month + "");
				date = Integer.parseInt(LFSUtilsAndroid.monthNoOFDay(monthString));

			} else {
				dayCount = dayCount - date;
				month = month - 1;
				if (month == 0) {
					month = 12;
				}
				monthString = LFSUtilsAndroid.monthIntValue(month + "");
				date = Integer.parseInt(LFSUtilsAndroid.monthNoOFDay(monthString));
			}
			if (dayCount < 1) {
				break;
			}
		}
		String reqMonth = "" + month;
		if (month <= 9) {
			reqMonth = "0" + month;
		}
		String reqDate = "" + requiredDate;
		if (requiredDate <= 9) {
			reqDate = "0" + requiredDate;
		}
		System.out.println("Date  " + requiredDate + "         Month  " + month);
		String newDate = dateTime.substring(0, 4) + "-" + reqMonth + "-" + reqDate + " "
				+ dateTime.substring(11, 19);
		System.out.println(newDate);
		return newDate;
	}

	public void generateRandomUserDetails(String days) {
		dateFormatGenerator(days);
		String firstName = RandomStringUtils.randomAlphanumeric(12);
		String emailAdress = firstName + "@mailinator.com";
		ConfigurationManager.getBundle().setProperty("random.firstName", firstName);
		ConfigurationManager.getBundle().setProperty("random.emailadress", emailAdress);

		String preSHA1 = DigestUtils.sha1Hex(emailAdress);
		String preSHA1email = preSHA1 + emailAdress;
		String SHA1 = DigestUtils.sha1Hex(preSHA1email);
		ConfigurationManager.getBundle().setProperty("requestToken", SHA1);

	}
	public void generateRandomUserDetailsFuture(String days) {
		dateFormatGeneratorFuture(days);
		String firstName = RandomStringUtils.randomAlphanumeric(12);
		String emailAdress = firstName + "@mailinator.com";
		ConfigurationManager.getBundle().setProperty("random.firstName", firstName);
		ConfigurationManager.getBundle().setProperty("random.emailadress", emailAdress);

		String preSHA1 = DigestUtils.sha1Hex(emailAdress);
		String preSHA1email = preSHA1 + emailAdress;
		String SHA1 = DigestUtils.sha1Hex(preSHA1email);
		ConfigurationManager.getBundle().setProperty("requestToken", SHA1);

	}
	public static String getDifferenceDateFuture(String dateTime, int dayCount) {
		LocalDate todaysDate = null;
		todaysDate = LocalDate.now();
		String stodaysDate = todaysDate.plusDays(dayCount)+"";
		System.out.println(todaysDate);
		String newDate = dateTime.substring(0, 4) + "-" + stodaysDate.substring(5,7) + "-" + stodaysDate.substring(8,10) + " "
				+ dateTime.substring(11, 19);
		System.out.println(newDate);
		return newDate;
	}
	
	public void generateRandomUserDetailsToday(String days) {
		dateFormatGeneratorToday(days);
		String firstName = RandomStringUtils.randomAlphanumeric(12);
		String emailAdress = firstName + "@mailinator.com";
		ConfigurationManager.getBundle().setProperty("random.firstName", firstName);
		ConfigurationManager.getBundle().setProperty("random.emailadress", emailAdress);

		String preSHA1 = DigestUtils.sha1Hex(emailAdress);
		String preSHA1email = preSHA1 + emailAdress;
		String SHA1 = DigestUtils.sha1Hex(preSHA1email);
		ConfigurationManager.getBundle().setProperty("requestToken", SHA1);

	}
	public static void dateFormatGeneratorToday(String days) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String sysTime = dateFormat.format(date);

	
			ConfigurationManager.getBundle().setProperty("system.currenttime0" ,
					sysTime);
			ConfigurationManager.getBundle().setProperty("system.unixtime0",
					getUnxiTime(sysTime));
		
			String randomCharID = RandomStringUtils.randomAlphanumeric(39);
			ConfigurationManager.getBundle().setProperty("system.random.id0",
					randomCharID);
			System.out.println(randomCharID);
	}
	

}
