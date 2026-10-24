package com.jdbc.app;

import java.sql.*;

public class MainProgram1 {
	
	public static void main(String[] args) {
		
		try {
			
		//load the driver class into jvm	
			//com.these are all packages and driver is a class int it
		Class.forName("com.mysql.cj.jdbc.Driver"); //forName throws class not found exception it is a checked exception
		System.out.println("Driver Loaded");
		
		//establish connection with database server
		//getConnection and createstatement generates sqlexception these are also checked
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","password");
		System.out.println("Connected to database Successfully");
		
		Statement st = con.createStatement();
		System.out.println("Statement created successfully");
		
		con.close();
		
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
}
