package com.buratinka.database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class Main {



    public static void main(String[] args) {

        DBConnection dbConnection = new DBConnection();

        String query = "SELECT * FROM users";

        try {
            Statement statement = dbConnection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next())
            {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setAge(resultSet.getInt("age"));
                user.setEmail(resultSet.getString("email"));
                user.setName(resultSet.getString("name"));
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
