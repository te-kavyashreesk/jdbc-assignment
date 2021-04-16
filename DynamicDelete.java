package com.tyss.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstat=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?user=root&password=root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query="delete from employee where name=?";
		try {
			pstat=conn.prepareStatement(query);
			pstat.setString(1, "kavya");
			 int count=pstat.executeUpdate();
			 System.out.println("deleted succesfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
