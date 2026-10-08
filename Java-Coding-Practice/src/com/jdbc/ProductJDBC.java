package com.jdbc;

import java.sql.*;

public class ProductJDBC {

    public static void main(String[] args) {

        try {
     
        	//1.Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_practice",
                    "root",
                    "password"
            );

            // 3. Create statement
            Statement stmt = con.createStatement();

            // 4. Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM productss");

            
            
            // 5. Display 3 rows
            while (rs.next()) {

                System.out.println(
                    rs.getInt("productId") + "  " +
                    rs.getString("productName") + "  " +
                    rs.getInt("productPrice")
                );
            }

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
