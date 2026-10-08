package com.jdbc;
import java.sql.*;

public class Demo {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jdbc_practice",
					"root",
					"password"
					);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
