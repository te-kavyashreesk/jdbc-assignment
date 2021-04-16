package com.tyss.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreaparedStatement {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstat=null;
		ResultSet rs=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?user=root&password=root");
	
	String query="select * from employee where id=?";
	
		pstat=con.prepareStatement(query);
		// TODO Auto-generated catch block
		
		
	
String s=args[0];
 int empid=Integer.parseInt(s); 
 
	pstat.setInt(1,2);

 
	pstat.setInt(1,empid);

 
	rs= pstat.executeQuery();
	}
 catch (Exception e)
	{
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 try {
	while(rs.next())
	 {
		System.out.println(rs.getString("name")); 
		System.out.println(rs.getInt("id"));
		System.out.println(rs.getInt("sal"));
		System.out.println(rs.getInt("phnum"));
		System.out.println(rs.getString("dept"));
		
	 }
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
	

	
	}

}
