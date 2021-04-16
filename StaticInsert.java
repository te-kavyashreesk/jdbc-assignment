package com.tyss.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class StaticInsert {

	public static void main(String[] args) throws SQLException  {
		Statement stat=null;
		Connection con=null;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		
//		}
		
		try {
			Driver d =  new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		//2. connection establish using driver
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?user=root&password=root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. insert query
		String query="insert into employee values(11,'latha',5000,'testing',76845)";
		
		 
		try {
			stat = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //4. process result set
		 
		try {
			int count = stat.executeUpdate(query);
			 System.out.println(count);
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			if(con!=null)
			{
				con.close();
			}
			if(stat!=null)
			{
				stat.close();
			}
		}
			
	}

}
