package com.tyss.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstat=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?user=root&password=root");

			//conn=DriverManager.getConnection("jdbc:mysql://localhost:3360/db?user=root&password=root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			String Query="update employee set name=? where  id=?";
			pstat=conn.prepareStatement(Query);
			pstat.setString(1,"hj");
			pstat.setInt(2, 2);
			pstat.executeUpdate();
			 System.out.println("updated succesfully");
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
