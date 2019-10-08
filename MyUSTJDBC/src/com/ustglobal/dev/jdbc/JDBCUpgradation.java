package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpgradation {

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
			System.out.println("enter username");
			String user = sc.nextLine();
			System.out.println("enter password");
			String Password = sc.nextLine();

			conn = DriverManager.getConnection(dbUrl, user, Password);
			System.out.println("Connection established...");
			System.out.println("**************************");

			// issue sql query
			String query = "update users_info set email=? where userid=? and password =?";

			pstmt = conn.prepareStatement(query);

			System.out.println("Enter the new email id");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter the user id");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the password..");
			pstmt.setString(3, sc.nextLine());

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
