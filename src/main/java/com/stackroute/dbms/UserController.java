package com.stackroute.dbms;

import java.sql.*;

public class UserController {

    private Connection connection;

    public UserController() throws Exception {
        String url = "jdbc:mysql://localhost/test";
        Class.forName ("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(url,"root","Farh@143341");

    }

    public void displayer() throws Exception{
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from usertab");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3));
        }
    }

    public void displayerByName(String name) throws Exception{
        PreparedStatement statement = connection.prepareStatement("select * from usertab where name = ?");
        statement.setString(1,name);
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3));
        }
    }

    public void updater(String name,int age) throws Exception{
        PreparedStatement statement = connection.prepareStatement("update usertab set age = ? where name = ?");
        statement.setInt(1,age);
        statement.setString(2,name);
        statement.executeUpdate();
        System.out.println("Updated : " + statement.executeUpdate());
    }

    public void deleter(String name) throws Exception{
        PreparedStatement statement = connection.prepareStatement("delete from usertab where name = ?");
        statement.setString(1,name);
        statement.executeUpdate();
        System.out.println("Deleted : " + statement.executeUpdate());
    }


}
