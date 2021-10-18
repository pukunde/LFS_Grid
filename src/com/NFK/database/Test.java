package com.NFK.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class Test {
	
	DBconnector dnconn=new DBconnector();
	Connection conn = dnconn.dbOracleConnect();
	
	//Before Update
	
	 String bearerToken  = "";
     String refreshToken = "";
     String bearerTokenExpirationTime =""; 
     String refreshTokenExpirationTime ="";
     int active;
     
     //After Update 
     
     String updateBearerToken  = "";
     String updateRefreshToken = "";
     String updateBearerTokenExpiration = "";
     String updateRefreshTokenExpiration = "";
     int updateActive;
	
//	public String invalidBearerToken=bearerToken;
	
	String updatedBearerToken  = "";
    String updatedRefreshToken = "";
    String updatedBearerTokenExpiration = "";
    String updatedRefreshTokenExpiration = "";
    int updatedActive;
	
	
	
	public static void main(String args[]) throws SQLException {
		DBconnector dnconn=new DBconnector();
		Connection conn = dnconn.dbOracleConnect();
		
		String query ="SELECT * FROM THIRDPARTY_AUTHORIZED_APPS WHERE GLOBAL_USERS_ID IN (SELECT GLOBAL_USERS_ID FROM USERS WHERE LOGIN_ID ='doshaheentt+q1and@GMAIL.COM')";
		
		System.out.println(query);
		
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()){
		System.out.println(rs.getString("BEARER_TOKEN"));
		System.out.println(rs.getString("REFRESH_TOKEN"));
		System.out.println(rs.getString("BEARER_TOKEN_EXPIRATION"));
		System.out.println(rs.getString("REFRESH_TOKEN_EXPIRATION"));
		}
//		ResultSet rs = dnconn.queryDB(conn, query);
//		
//		try
//		{
//			System.out.println(rs.getString("NAME"));
//			while (rs.next()) {
//				System.out.println(rs.next());
////				Map<String,String> data = new HashMap<String,String>();
////            	data.put(rs.getString("idorder")+"name", rs.getString("name"));
////            	data.put(rs.getString("idorder")+"price", rs.getString("price"));
//			}
//			
//			rs.close();
//			conn.close();
//		}catch (Exception e) {
//			
//		}
		
	}
	
/*execute Query to collect DATA from DATABASE
 * Develop BY :BISWA */
	public void executeQuery(String equery) throws SQLException
	{
		
		
		System.out.println(equery);
		
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery(equery);
			
		 try {
			while(rs.next()){
			     //Retrieve by column name
			      bearerToken  = rs.getString("BEARER_TOKEN");
			      ConfigurationManager.getBundle().setProperty("jnj.bearer.token.value", bearerToken);
			      refreshToken = rs.getString("REFRESH_TOKEN");
			      bearerTokenExpirationTime = rs.getString("BEARER_TOKEN_EXPIRATION");
			      refreshTokenExpirationTime = rs.getString("REFRESH_TOKEN_EXPIRATION");
			      active=rs.getInt("ACTIVE");
			     
			     Reporter.log(" BEARER_TOKEN "+ bearerToken + " REFRESH_TOKEN " + refreshToken +
                         " BEARER_TOKEN_EXPIRATION " + bearerTokenExpirationTime + " REFRESH_TOKEN_EXPIRATION " + refreshTokenExpirationTime + " Active " +active);
			 }
			 rs.close();
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		   
	}
	/*DATABASE Connection Method
	 * Develop BY :BISWA */
	public void connectToDatabase()
	{
		DBconnector dnconn=new DBconnector();
		Connection conn = dnconn.dbOracleConnect();
	}
	
	/*Method For Update Table Information
	 * Develop BY :BISWA */
	public void update(String equery) throws SQLException
	{
        System.out.println(equery);
		
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery(equery);	
	}
	
	/*Execute Query to Collect the Update Table Information
	 * Develop BY :BISWA */
	
	public void executeUpdateQuery(String equery) throws SQLException
	{
		
		System.out.println(equery);
		
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery(equery);
			
		 try {
			while(rs.next()){
			     //Retrieve by column name
			      updateBearerToken  = rs.getString("BEARER_TOKEN");
			      ConfigurationManager.getBundle().setProperty("update.bearer.token.value", updateBearerToken);
			      updateRefreshToken = rs.getString("REFRESH_TOKEN");
			      ConfigurationManager.getBundle().setProperty("jnj.updated.refresh.token.value", updateRefreshToken);
			      updateBearerTokenExpiration = rs.getString("BEARER_TOKEN_EXPIRATION");
			      ConfigurationManager.getBundle().setProperty("update.Bearer.Token.Expiration", updateBearerTokenExpiration);
			      updateRefreshTokenExpiration = rs.getString("REFRESH_TOKEN_EXPIRATION");
			      ConfigurationManager.getBundle().setProperty("update.Refresh.Token.Expiration", updateRefreshTokenExpiration);
			      updateActive=rs.getInt("ACTIVE");
			     
			     Reporter.log(" BEARER_TOKEN "+ updateBearerToken + " REFRESH_TOKEN " + updateRefreshToken +
                         " BEARER_TOKEN_EXPIRATION " + updateBearerTokenExpiration + " REFRESH_TOKEN_EXPIRATION " + updateRefreshTokenExpiration + " Active " + updateActive);
			 }
			 rs.close();
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
public void verifyUpdate() throws SQLException
{
	
	  String beforeValue= (String) ConfigurationManager.getBundle().getProperty("jnj.bearer.token.value");
	  String afterValue  = (String) ConfigurationManager.getBundle().getProperty("jnj.updated.refresh.token.value");
	
	if(beforeValue.equals(afterValue))
	{
		Reporter.log("Refresh token is updated and displayed as  <<<InvalidBearerToken>>> ");
	}
	
	else
	{
		Reporter.log("Refresh token is [ NOT ] updated ");
	}
}


public String getBearerToken(String equery) throws SQLException{
	
	Statement stmt=conn.createStatement();
	ResultSet rs = stmt.executeQuery(equery);
	bearerToken  = rs.getString("BEARER_TOKEN");
	return bearerToken;
}



public void verify_Token_For_DifferentSteps()
{
	String bearerExpTime= (String) ConfigurationManager.getBundle().getProperty("update.Bearer.Token.Expiration");
	String bearerExptimeSecondLogin= (String) ConfigurationManager.getBundle().getProperty("updated.refresh.token.expiration");
	String refreshExpTime=(String) ConfigurationManager.getBundle().getProperty("update.Refresh.Token.Expiration");
	String refreshExptimeSecondLogin=	(String) ConfigurationManager.getBundle().getProperty("updated.Refresh.Token.Expiration");
	String updateBearer=(String) ConfigurationManager.getBundle().getProperty("update.bearer.token.value");
	String updatedBearer=(String) ConfigurationManager.getBundle().getProperty("updated.bearer.token.value");
	
	if(!(bearerExpTime.equals(bearerExptimeSecondLogin)) && !(refreshExpTime.equals(refreshExptimeSecondLogin)) && !(updateBearer.equals(updatedBearer)))
	{
		Reporter.log("Bearer and Refresh tokens and its expiration time are different");
	}
	
	else
	{
		Reporter.log("Bearer and Refresh tokens and its expiration time are <<SAME>>");
	}
}
/*Execute Query to Collect The Table Information After second lOGIN
 * Develop BY :BISWA */

public void execute_Query_For_Second_Login(String equery) throws SQLException
{
	System.out.println(equery);
	
	Statement stmt=conn.createStatement();
	ResultSet rs = stmt.executeQuery(equery);
		
	 try {
		while(rs.next()){
		     //Retrieve by column name
			updatedBearerToken  = rs.getString("BEARER_TOKEN");
		      ConfigurationManager.getBundle().setProperty("updated.bearer.token.value", updatedBearerToken);
		      updatedRefreshToken = rs.getString("REFRESH_TOKEN");
		      ConfigurationManager.getBundle().setProperty("updated.refresh.token.value", updatedRefreshToken);
		      updatedBearerTokenExpiration = rs.getString("BEARER_TOKEN_EXPIRATION");
		      ConfigurationManager.getBundle().setProperty("updated.refresh.token.expiration", updatedBearerTokenExpiration);
		      updatedRefreshTokenExpiration = rs.getString("REFRESH_TOKEN_EXPIRATION");
		      ConfigurationManager.getBundle().setProperty("updated.Refresh.Token.Expiration", updatedRefreshTokenExpiration);
		      active=rs.getInt("ACTIVE");
		     
		     Reporter.log(" BEARER_TOKEN "+ updatedBearerToken + " REFRESH_TOKEN " + updatedRefreshToken +
                     " BEARER_TOKEN_EXPIRATION " + updatedBearerTokenExpiration + " REFRESH_TOKEN_EXPIRATION " + updatedRefreshTokenExpiration + " Active " +active);
		 }
		 rs.close();
			conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}	
}

/*Execute query To Collect Third Party APPS ID
 * Develop BY :BISWA */
public void query_For_ThirdParty_AppsId(String equery) throws SQLException
{
System.out.println(equery);
	
	Statement stmt=conn.createStatement();
	ResultSet rs = stmt.executeQuery(equery);
		
	 try {
		while(rs.next()){
		     //Retrieve by column name
			String thirdpartyAppsId  = rs.getString("THIRDPARTY_APPS_ID");
		      ConfigurationManager.getBundle().setProperty("thirdparty.Apps.Id", thirdpartyAppsId);
		      String thirdpartyAppsName = rs.getString("THIRDPARTY_APPS_NAME");
		      ConfigurationManager.getBundle().setProperty("thirdparty.Apps.Name", thirdpartyAppsName);
		     
		     
		     Reporter.log(" THIRDPARTY_APPS_ID "+ thirdpartyAppsId + " THIRDPARTY_APPS_NAME " + thirdpartyAppsName );
		 }
		 rs.close();
			conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}	
}

public void verifyAppsId()
{
	String appsName=(String) ConfigurationManager.getBundle().getProperty("thirdparty.Apps.Name");
	String appsId= (String) ConfigurationManager.getBundle().getProperty("thirdparty.Apps.Id");
	if(appsName.equalsIgnoreCase("Walgreens"))
	{
		
		Reporter.log(appsId + "THIRDPARTY_APPS_ID indicating that the Patient has authorized sharing with Walgreens");
		
	}
	else
	{
		Reporter.log(appsId + "THIRDPARTY_APPS_ID indicating that the Patient has NOT authorized sharing with Walgreens");
	}
}

public void collectRecords(String equery) throws SQLException
{
System.out.println(equery);
	
	Statement stmt=conn.createStatement();
	ResultSet rs = stmt.executeQuery(equery);
	boolean flag=true;
	 try {
		while(rs.next()){
			flag=false;
		     //Retrieve by column name
			String thirdpartyAppsIdd  = rs.getString("THIRDPARTY_APPS_ID");
			if(!thirdpartyAppsIdd.isEmpty()){
				 //ConfigurationManager.getBundle().setProperty("thirdparty.Apps.Idd", thirdpartyAppsIdd);
			      String thirdpartyAppsHistoryId = rs.getString("THIRDPARTY_APPS_HISTORY_ID");
			      ConfigurationManager.getBundle().setProperty("thirdparty.Apps.History.id", thirdpartyAppsHistoryId);
			}else{
				 //ConfigurationManager.getBundle().setProperty("thirdparty.Apps.Idd", null);
			      ConfigurationManager.getBundle().setProperty("thirdparty.Apps.History.id", null);
			}
		     
		     
		     
		  //   Reporter.log(" THIRDPARTY_APPS_ID "+ thirdpartyAppsIdd + " THIRDPARTY_APPS_HISTORY_ID " + thirdpartyAppsHistoryId );
		 }
		 rs.close();
			conn.close();
			if(flag==true){
				ConfigurationManager.getBundle().setProperty("thirdparty.Apps.History.id", "0");
			}else{
				ConfigurationManager.getBundle().setProperty("thirdparty.Apps.History.id", "1");
			}
	} catch (SQLException e) {
		e.printStackTrace();
	}	
}

public void verifyEmptyResult()
{
	String appsHistoryID=ConfigurationManager.getBundle().getProperty("thirdparty.Apps.History.id").toString();
	//String appsIdd= (String) ConfigurationManager.getBundle().getProperty("thirdparty.Apps.Idd");
	String appsId= (String) ConfigurationManager.getBundle().getProperty("thirdparty.Apps.Id");
	
	if(appsHistoryID.equals("0"))
	{
		Reporter.log(appsId + "showing empty result");
		Validator.verifyThat("Result Set",appsHistoryID , Matchers.equalTo("0"));
	}
	else
	{
		Reporter.log(appsId + "not showing empty result");
		Validator.verifyThat("Result Set",appsHistoryID , Matchers.equalTo("0"));
	}
}
/*Method For Set TokenExpiration Date As CURRENT DATE
 * Develop BY :BISWA */
public void updateTokenExpiration()
{
	//TO DO
}

}
