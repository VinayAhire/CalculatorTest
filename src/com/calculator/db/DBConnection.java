package com.calculator.db;

import java.sql.*;

public class DBConnection {

	public void getDB() {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "testjava";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager
					.getConnection(url + dbName, userName, password);
			System.out.println("Connected to the database");
			conn.close();
			System.out.println("Disconnected from database");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}