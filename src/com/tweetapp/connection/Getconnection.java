package com.tweetapp.connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;

public class Getconnection {

	
	public static Connection  getconn() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","pass@word1");  
		
		
		
		return con;
	}
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection =  getconn();
		if(connection!=null) {
			
			String sql = "select * from Persons";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" " + rs.getString(2));
			}
			
			
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
