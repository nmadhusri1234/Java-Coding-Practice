package com.jdbc.app;

import java.sql.*;

public class MainProgram1 {
	
	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","password");
		System.out.println("Connected to database Successfully");
		
		Statement st = con.createStatement();
		System.out.println("Statement created successfully");
		//ResultSet rs = st.executeQuery("select * from productss");
		
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
