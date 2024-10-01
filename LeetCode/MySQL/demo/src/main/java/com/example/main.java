package com.example;

import java.io.IOException;
import java.sql.*;

public class main {
    public static void main( String[] args ){
        String url = "jdbc:mysql://localhost:3306/produse";
        String user = "root";
        String password = "alexalex123";
        try (Connection conexiune = DriverManager.getConnection(url, user, password)){
            System.out.println("Connection successful!.");
        } catch (SQLException e) {
            System.out.println("Connection failed!.");
        }
    }
}
