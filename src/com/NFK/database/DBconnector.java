package com.NFK.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.qmetry.qaf.automation.core.ConfigurationManager;

//import oracle.jdbc.pool.OracleDataSource;

public class DBconnector {
	
	
	
	private static String DBUserID;
	private static String DBPassword;
	private static String DBServer;
	private static String DBPort;
	private static String DBName;
	
	public DBconnector() {
//		loadDBprops();
	}
	
	/*method to execute query
	 * */
	public final ResultSet queryDB(Connection conn, String sQuery) {

		try {
			Statement s = conn.createStatement();
			return s.executeQuery(sQuery);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		return null;
	}

	public final Connection dbOracleConnect() {
		try {
//			String dbConnectString = "jdbc:oracle:thin:" + DBUserID + "/" + DBPassword
//					+ DBServer + ":" + DBPort + ":" + DBName;
//			OracleDataSource ods = new OracleDataSource();
//			ods.setURL(dbConnectString);
//			Connection connection = ods.getConnection();
//			String url="jdbc:oracle:thin:"+DBServer+":"+ DBPort + "/" + DBName;
//			System.out.println(url);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			
			//String dbURL = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=tridentt)))";
			
			String dbURL ="jdbc:oracle:thin:@tridentd.cbdznum9yda0.us-east-1.rds.amazonaws.com:1521/ORCLDB";
			Connection connection = DriverManager.getConnection(dbURL, "sdevel_user","C0nn3ct!!");
			System.out.println("get connected");

			
			return connection;
		} catch (Exception e) { 
			
			e.printStackTrace();
			return null;
		}
	}

	public void loadDBprops() {
		
		DBUserID =ConfigurationManager.getBundle().getProperty("db.userID").toString();
		DBPassword = ConfigurationManager.getBundle().getProperty("db.passwod").toString();
		DBServer =ConfigurationManager.getBundle().getProperty("db.server").toString();
		DBPort = ConfigurationManager.getBundle().getProperty("db.port").toString();
		DBName = ConfigurationManager.getBundle().getProperty("db.name").toString();
	}

	public final Connection mysqldbConnect() {
		
		
		
		String dbConnectString = "jdbc:mysql://" + DBServer + ":" + 1521 + "/" + DBName;
		System.out.println(dbConnectString);
		//Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(dbConnectString, "sdevel_user", "c0nn3ct!!");
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
