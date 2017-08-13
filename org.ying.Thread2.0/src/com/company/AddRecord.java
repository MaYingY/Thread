package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by dell on 17-8-9.
 */
public class AddRecord extends GetConn {

    public void addRecord() throws SQLException, ClassNotFoundException {
        Connection conn = super.getConn();
        PreparedStatement preparedStatement = null;
//        for(int i = 1; i <= 100; i ++) {
            String sql = "INSERT INTO member VALUES(?,?,?)";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, 1);
            String name = "zzp";
            preparedStatement.setString(2, name);
            String url = "http://baidu";
            preparedStatement.setString(3, url);

        //}
    }

}
