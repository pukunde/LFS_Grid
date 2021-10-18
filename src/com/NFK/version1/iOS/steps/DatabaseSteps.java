package com.NFK.version1.iOS.steps;

import java.sql.SQLException;

import org.apache.commons.lang.RandomStringUtils;

import com.NFK.database.DBconnector;
import com.NFK.database.Test;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class DatabaseSteps {
	
	DBconnector connect=new DBconnector();
	Test t=new Test();
	
	@QAFTestStep(description="user connect to database")
	public void connect_to_Database(){
		
		t.connectToDatabase();
		
	}

	@QAFTestStep(description="user execute query to collect data from database")
	public void Query() throws SQLException{
		
		t.executeQuery("SELECT * FROM THIRDPARTY_AUTHORIZED_APPS WHERE GLOBAL_USERS_ID IN (SELECT GLOBAL_USERS_ID FROM USERS WHERE LOGIN_ID ='BISWA.SENAPATI111@GMAIL.COM')");
	}


	@QAFTestStep(description="user execute query to update the table information")
	public void updateQuery() throws SQLException{
		
		//String typeName = RandomStringUtils.randomAlphanumeric(64);
					
	    String token= (String) ConfigurationManager.getBundle().getProperty("jnj.bearer.token.value");
	    
	    System.out.println("Token :::"+token);
	    
		t.update("UPDATE THIRDPARTY_AUTHORIZED_APPS SET REFRESH_TOKEN = '"+token+"' WHERE GLOBAL_USERS_ID IN (SELECT GLOBAL_USERS_ID FROM USERS WHERE LOGIN_ID = 'BISWA.SENAPATI111@GMAIL.COM')");
	}
	
	
	@QAFTestStep(description="user execute query to collect update data from database")
	public void collectUpdateQuery() throws SQLException{
		
		t.executeUpdateQuery("SELECT * FROM THIRDPARTY_AUTHORIZED_APPS WHERE GLOBAL_USERS_ID IN (SELECT GLOBAL_USERS_ID FROM USERS WHERE LOGIN_ID ='BISWA.SENAPATI111@GMAIL.COM')");
	}

	@QAFTestStep(description="Verify that the Refresh token is updated and displayed as invalidBearerToken")
	public void verifyupdate_data() throws SQLException{
		
		t.verifyUpdate();
	}

	@QAFTestStep(description="Verify that the Bearer and Refresh tokens and its expiration time are different")
	public void verify_expirationTime(){
		t.verify_Token_For_DifferentSteps();
	}

	@QAFTestStep(description="user execute query to collect data from database after second login")
	public void data_after_second__login() throws SQLException{
		
		
		t.execute_Query_For_Second_Login("SELECT * FROM THIRDPARTY_AUTHORIZED_APPS WHERE GLOBAL_USERS_ID IN (SELECT GLOBAL_USERS_ID FROM USERS WHERE LOGIN_ID ='BISWA.SENAPATI111@GMAIL.COM')");
	}


	@QAFTestStep(description="user executequery to collect ThirdParty_Apps_ID from database")
	public void Apps_Id_DB() throws SQLException{
		
		t.query_For_ThirdParty_AppsId("SELECT * FROM THIRDPARTY_AUTHORIZED_APPS WHERE GLOBAL_USERS_ID IN (SELECT GLOBAL_USERS_ID FROM USERS WHERE LOGIN_ID ='BISWA.SENAPATI111@GMAIL.COM')");
	}
	
	
	@QAFTestStep(description="user verify that THIRDPARTY_APPS_ID indicating that the Patient has authorized sharing with Walgreens")
	public void verify_ThirdParty_Apps_Id(){
	
		t.verifyAppsId();
		
	}
	
	
	@QAFTestStep(description="user execute query to collect records from database")
	public void collect_Records_from_DB() throws SQLException{
		
		String AppsId=(String) ConfigurationManager.getBundle().getProperty("thirdparty.Apps.Id");
		t.collectRecords("SELECT * FROM THIRDPARTY_APPS_HISTORY WHERE THIRDPARTY_APPS_ID = '"+AppsId+"'");
		
	}
	
	
	@QAFTestStep(description="verify that the DB displays a empty result for the above query")
	public void verify_Query_emptyResult(){
		
		t.verifyEmptyResult();
	}


	@QAFTestStep(description="user execute query to update refreshTokenExpiration")
	public void update_refreshTokenExpiration(){
		
		
	}



}
