package com.buratinka.database;

import java.sql.*;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest" ;
    private static final String PASSWORD = "admin" ;
    private static final String USERNAME = "root" ;

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public DBConnection()
    {
        try
        {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(SQLException e)
        {
            e.printStackTrace();
        }



    }


}
