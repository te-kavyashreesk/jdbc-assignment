
package com.tyss.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement pstat=null;
// 1. load the driver
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	//2. establish driver connection
	//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/host?user=root&password=root");
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?user=root&password=root");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String query="insert into employee values(?,?,?,?,?)";
	try {
		 pstat=con.prepareStatement(query);
		 String s0=args[0];
		int id= Integer.parseInt(s0);
		pstat.setInt(1,id);
		 String s1=args[1];
		 pstat.setString(2,s1);
		  String s2=args[2];
		  int sal= Integer.parseInt(s2);
		  pstat.setInt(3, sal);
		  String s3=args[3];
		  pstat.setString(4,s3);
		   String s4=args[4];
		   int phnum= Integer.parseInt(s4);
		   pstat.setInt(5, phnum);
		   int count= pstat.executeUpdate();
		   System.out.println(count);
		  

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	finally
	{
		if(con!=null)
		{
			con.close();
		}
	}
}

}

