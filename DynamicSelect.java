package com.tyss.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DynamicSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection conn=null;
PreparedStatement pstat=null;
ResultSet rs=null;
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
		
		String query="select * from employee where id=?";
		try {
			pstat=conn.prepareStatement(query);
			pstat.setInt(1, 15);
			 rs=pstat.executeQuery();
			 System.out.println("---");
			 while(rs.next())
			 {
				 System.out.println(rs.getInt("id"));
				 System.out.println(rs.getString("name"));
				 
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
