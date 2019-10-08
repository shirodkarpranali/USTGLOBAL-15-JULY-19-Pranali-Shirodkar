package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// Load the Driver
			Class.forName("com.mysql.jdbc.Driver"); // no need to regid
			System.out.println("Driver Loaded...");

			// Get connection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";
			System.out.println("enter the username and password");
			String user = sc.nextLine();
			String Password = sc.nextLine();

			conn = DriverManager.getConnection(dbUrl, user, Password);
			System.out.println("Connection established...");
			System.out.println("**************************");

			// issue the query
			String query = "insert into users_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);

			System.out.println("enter the user id");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine())); // parse int take string as a input argument and give
																// integer as a output
			// setInt:- the driver converts this to an sql integer value when it send to the
			// database.
			System.out.println("enter the username...");
			pstmt.setString(2, sc.nextLine());
			System.out.println("enter the user password...");
			pstmt.setString(3, sc.nextLine());
			System.out.println("enter the email...");
			pstmt.setString(4, sc.nextLine());

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
