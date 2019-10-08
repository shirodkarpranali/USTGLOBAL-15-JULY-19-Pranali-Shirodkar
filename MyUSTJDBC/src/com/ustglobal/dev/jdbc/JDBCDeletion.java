package com.ustglobal.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCDeletion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
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
			String query = "DELETE FROM users_info WHERE userid=? AND password=?";
			pstmt = conn.prepareStatement(query);
			System.out.println("enter the user id for deletion");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the password for deletion");
			pstmt.setString(2, sc.nextLine());

			int count = pstmt.executeUpdate();

			// process the results
			if (count > 0) {
				System.out.println("query OK, " + count + "row affected");
			} else {
				System.out.println("Something went wrong");
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
