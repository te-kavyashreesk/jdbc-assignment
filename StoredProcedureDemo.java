package com.tyss.ems;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StoredProcedureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection conn=null;
CallableStatement cstat=null;
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
		String query="update employee set name=? where id=?";
		 try {
			CallableStatement cstat1=conn.prepareCall(query);
			cstat1.setString(1,"divya");
			cstat1.setInt(2,18);
			 boolean value=cstat1.execute();// return boolean values
			 System.out.println(value);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
