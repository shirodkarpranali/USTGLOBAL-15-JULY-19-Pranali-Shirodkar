package com.ustglobal.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCRetrieval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;

		// Load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded..");

			// Get connection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";

			String filePath = "C:\\Users\\PRANALI\\Desktop\\db.properties";
			FileReader reader = new FileReader(filePath); //

			Properties prop = new Properties();
			prop.load(reader);

			conn = DriverManager.getConnection(dbUrl, prop);
			System.out.println("Connection established...");
			System.out.println("**************************");

			// issue sql query
			String query = "select * FROM users_info where userid=?";

			pstmt = conn.prepareStatement(query);

			System.out.println("enter the user id");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));

			rs = pstmt.executeQuery();

			// process the results
			while (rs.next()) {

				int userid = rs.getInt("userid");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String email = rs.getString("email");

				System.out.println("User id: " + userid);
				System.out.println("User Name: " + username);
				System.out.println("User passwod: " + password);

				System.out.println("User email: " + email);
				System.out.println("*******************");

			}

		} catch (Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		} finally {
			// close all the JDBC Objects
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			sc.close();
		}

	}

}
