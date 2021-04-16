package com.tyss.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stat=null;
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
try {
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?user=root&password=root");


} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	String query="delete from  employee where id=1";	
	try {
		stat = con.createStatement();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 int count;
	try {
		count = stat.executeUpdate(query);
		System.out.println(count);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	 


}
}


