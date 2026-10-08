package com.jdbc;

import java.sql.*;

public class ProductJDBCInsert {

    public static void main(String[] args) {

        try {
     
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_practice",
                    "root",
                    "password"
            );

            
            Statement stmt = con.createStatement();

           
           stmt.executeUpdate("Insert into productss values(4,'mobile',5000)");
           
           

           con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
