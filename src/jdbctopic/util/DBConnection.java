package jdbctopic.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
		//1) Make Database Credentials
//		 private static final String URLNAME	 = "jdbc:mysql://localhost:3306/ocjp21";
//		 private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
//		 private static final String USERNAME    = "root";
//		 private static final String PASSWORD    = "User1234@";
//		 
		 //2) Create getConnection method
		 public static Connection  getConnection() {
			 
			 String urlName = null;
			 String driverClass = null;
			 String userName = null;
			 String password = null;
			 
			 Connection conn = null;
			 try {
				 
				 FileInputStream fin = new FileInputStream("C:\\Users\\afzal\\eclipse-workspace\\ocjp21\\dbconfig.properties");
				 
				 Properties prop = new Properties();
				 
				 prop.load(fin);
				 
				 urlName = prop.getProperty("URLNAME").trim();
				 driverClass = prop.getProperty("DRIVERCLASS").trim();
				 userName = prop.getProperty("USERNAME").trim();
				 password = prop.getProperty("PASSWORD").trim();
				//3) Load Driver class 
				Class.forName(driverClass);
				
				//4) get Database Connection by DriverManager's getConnection() method
				conn  = DriverManager.getConnection(urlName, userName, password);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			 
			 return conn;
		}
}
