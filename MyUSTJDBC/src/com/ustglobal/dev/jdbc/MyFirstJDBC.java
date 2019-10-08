package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	// phno
	// sim
	// reg
	// connection:-phone no
	//
	public static void main(String[] args) {

		Connection conn = null; // interface
		Statement stmt = null; // this interface are present in java.sql.*
		ResultSet rs = null; // Driver is interface as well as concrete class

		// Load the driver
		try {
			java.sql.Driver div = new Driver(); // driver are db dependent
			DriverManager.registerDriver(div); // DriverManager is class and registerDriver is static method
			System.out.println("Driver Loaded...");

			// Get Connection Via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/" + "ust_ty_db?user=root&password=root"; // 127.0.0=localhost

			conn = DriverManager.getConnection(dbUrl); // return type of getconnection method is connection.
			System.out.println("Connection Estd...");
			System.out.println("*******************************");

			// Issue SQL query via Connection
			String query = "select * from users_info";
			stmt = conn.createStatement(); // return type of createStatement is statement.
			rs = stmt.executeQuery(query); // return type of createStatement is resultSet. resultSet ==Result_table in
											// sql

			// Process a resultSet returned by SQL query
			while (rs.next()) { // next() it will check for next row.and result will be true
				int userid = rs.getInt("userid");
				String username = rs.getString("username");
				String email = rs.getString("email");

				System.out.println("User id: " + userid);
				System.out.println("User Name: " + username);
				System.out.println("User email: " + email);
				System.out.println("*******************");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // close all the JDBC objects
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
