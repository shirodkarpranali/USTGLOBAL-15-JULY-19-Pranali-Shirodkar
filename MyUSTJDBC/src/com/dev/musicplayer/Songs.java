package com.dev.musicplayer;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Songs {

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

			// Get connection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/MusicPlayer";

			String filePath = "C:\\Users\\PRANALI\\Desktop\\songs.properties";
			FileReader reader = new FileReader(filePath);

			Properties prop = new Properties();
			prop.load(reader);
			System.out.println("prop file uploaded");

			String userss = prop.getProperty("username");
			String pass = prop.getProperty("password");

			conn = DriverManager.getConnection(dbUrl, userss, pass);
			System.out.println("connection is established..");

			System.out.println("enter a choice");
			System.out.println("1: play song");
			System.out.println("2: search");
			System.out.println("3: show all");
			System.out.println("4: operate");
			System.out.println("*********************************");

			int choice = Integer.parseInt(sc.nextLine());
			String choice1;
			switch (choice) {
			case 1:
				System.out.println("play songs");
				System.out.println("select A:play all");
				System.out.println("select B:play all random");
				System.out.println("select C:play particular");

				choice1 = sc.nextLine();
				switch (choice1) {
				case "A":
					System.out.println("play all");
					String query1 = prop.getProperty("sql1");
					stmt = conn.createStatement();
					rs = stmt.executeQuery(query1);

					while (rs.next()) {

						System.out.println("song_id:  " + rs.getInt(1));
						System.out.println("song_title: " + rs.getString(2));
						System.out.println("artist_name: " + rs.getString(3));
						System.out.println("album_name: " + rs.getString(4));
						System.out.println("song_location: " + rs.getString(5));
						System.out.println("description: " + rs.getString(6));
						System.out.println("************************************");
					}
					break;
				case "B":
					System.out.println("play all random");

					String query2 = prop.getProperty("sql2");
					pstmt = conn.prepareStatement(query2);
					System.out.println("enter songs id");
					int idd = Integer.parseInt(sc.nextLine());
					pstmt.setInt(1, idd);

					while (rs.next()) {
						System.out.println("Song Playing now : " + rs.getString(2));
						System.out.println("****************************************************");
					}
					if (stmt != null) {
						stmt.close();
					}
					if (rs != null) {
						rs.close();
					}

					break;
				case "C":
					System.out.println("play particular song");

					String query3 = prop.getProperty("sql3");
					pstmt = conn.prepareStatement(query3);
					System.out.println("enter song title");
					String title = sc.nextLine();

					while (rs.next()) {

						System.out.println("song_id:  " + rs.getInt(1));
						System.out.println("song_title: " + rs.getString(2));
						System.out.println("artist_name: " + rs.getString(3));
						System.out.println("album_name: " + rs.getString(4));
						System.out.println("song_location: " + rs.getString(5));
						System.out.println("description: " + rs.getString(6));
						System.out.println("************************************");

					}

					break;
				default:
					System.out.println("please enter your choice correctly");
					break;
				}
				break;
			case 2:
				System.out.println("search songs...");
				String search = prop.getProperty("search ");
				pstmt = conn.prepareStatement(search);

				break;

			case 3:
				System.out.println("show all");
				String query1 = prop.getProperty("sql1");
				pstmt = conn.prepareStatement(query1);
				break;
			case 4:
				System.out.println("operate");
				System.out.println("enter a choice");

				System.out.println("select A:insert into db");
				System.out.println("select B:edit");
				System.out.println("select C:delete particular songs");

				String choice2 = sc.nextLine();
				switch (choice2) {
				case "A":
					System.out.println("insert");

					String query4 = prop.getProperty("sql4");
					pstmt = conn.prepareStatement(query4);

					System.out.println("enter Songs_id ");
					pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
					System.out.println("enter a song title");
					pstmt.setString(2, sc.nextLine());
					System.out.println("enter artist name");
					pstmt.setString(3, sc.nextLine());
					System.out.println("album name");
					pstmt.setString(4, sc.nextLine());
					System.out.println("song location");
					pstmt.setString(5, sc.nextLine());
					System.out.println("description");
					pstmt.setString(6, sc.nextLine());
					break;
				case "B":
					System.out.println("edit");

					String query5 = prop.getProperty("sql5");
					pstmt = conn.prepareStatement(query5);

					System.out.println("edit album name");
					pstmt.setString(1, sc.nextLine());
					System.out.println("enter song id ");
					pstmt.setInt(2, Integer.parseInt(sc.nextLine()));

					break;
				case "C":
					System.out.println("delete song");

					String query6 = prop.getProperty("sql6");
					pstmt = conn.prepareStatement(query6);

					System.out.println("enter song id to delete");
					pstmt.setInt(1, Integer.parseInt(sc.nextLine()));

					break;

				}
				break;
			default:
				System.out.println("enter proper choice");

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
