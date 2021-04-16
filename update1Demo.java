package com.tyss.ems;

import java.sql.DriverManager;

public class update1Demo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DriverManager.getConnection("jdbc:mysql://localhost:")
		

	}

}
