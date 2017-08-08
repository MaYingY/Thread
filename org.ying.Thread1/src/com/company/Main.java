package com.company;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // write your code here

//        System.out.println(conn);

        for(int i = 1; i <= 100; i ++) {
            String sql = "INSERT INTO member(id, name, url) VALUES(?,?,?)";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1,i);
            String name = "zzp".concat(Integer.toString(i));
            preparedStatement.setString(2, name);
            String url = "http://baidu".concat(Integer.toString(i)).concat(".com");
            preparedStatement.setString(3, url);
            int add = preparedStatement.executeUpdate();
            System.out.println(add);
        }


    }
}
