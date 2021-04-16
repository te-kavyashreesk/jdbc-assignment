package com.tyss.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class propertyFileDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stat=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties pr=new Properties();
		pr.put("user", "root");
		pr.put("password", "root");
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?",pr);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query="update employee set name='jayan' where id=2 ";
		 try {
			stat=con.createStatement();
			 int count=stat.executeUpdate(query);
			 System.out.println(count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
