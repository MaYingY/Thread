package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by dell on 17-8-8.
 */
public class getConn {
    public Connection getConn() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/Thread?useUnicode=true&characterEncoding=utf8",
                        "root", "123456");
    }
}
