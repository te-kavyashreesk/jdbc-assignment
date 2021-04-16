package com.tyss.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import com.mysql.cj.jdbc.Driver;


public class SelectDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stat=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
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
		
		String query="select * from employee";
		try {
			stat=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stat.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs=stat.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(rs.next())
			{
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getInt("sal"));
				System.out.println(rs.getString("dept"));
				System.out.println(rs.getInt("phnum"));
				System.out.println("----");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
