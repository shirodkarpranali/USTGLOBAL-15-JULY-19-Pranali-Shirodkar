package com.dev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.dev.beans.User;

public class UserDAOJDBCImpl implements UserInfoDAO {
	public UserDAOJDBCImpl() {
		try { // load the driver when the object of this class is created,this constructor
				// will be called and driver will be loaded.
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// for connection establishment get the url
	public static final String DBURL = "jdbc:mysql://localhost:3306/ust_ty_db" + "?user=root&password=root";

	Scanner sc = new Scanner(System.in);

	@Override
	public User getAllInfo() {
		String query = "SELECT * FROM users_info";
		User u = new User();// object of getters setters class.
		// when we write statement in try(statement) block,this try is known as try with
		// resources and when we use this try with resources we don't need to use
		// finally block n close objects
		try (Connection conn = DriverManager.getConnection(DBURL); // connection has been established.
				Statement stmt = conn.createStatement(); // it is used for static sql query
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				u.setUserid(rs.getInt("user_id"));
				u.setUsername(rs.getString("username"));
				u.setEmail(rs.getString("email"));
				System.out.println(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public void createProfile(User user) {
		String query = "Insert into users_info" + " values(?,?,?,?)";
		try (Connection conn = DriverManager.getConnection(DBURL);
				PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setInt(1, user.getUserid());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getPasswd());
			int i = pstmt.executeUpdate();

			if (i > 0) {
				System.out.println("Profile Created....");
			} else {
				System.out.println("Failed to Create Profile....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}