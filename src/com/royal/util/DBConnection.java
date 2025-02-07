package com.royal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	//1) Make Credentials 
	private static final String URLNAME = "jdbc:mysql://localhost:3306/test";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "User1234@";
	
	//2) Create Database getConnection() method
	public static void getConnection() {
		Connection conn = null;
		
		//3) Load Driver Class
		try {
			Class.forName(DRIVERCLASS);
			
			//4) DriverManager..getConnectin()
			conn =  DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
			//5) Validate Connection
			if(conn!=null) {
				System.out.println("DB Connected : "+conn);
			}else {
				System.out.println("DB not Connected : "+conn);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DBConnection.getConnection();
	}
}
	