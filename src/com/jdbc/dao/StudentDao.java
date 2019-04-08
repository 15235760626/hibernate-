package com.jdbc.dao;


import com.jdbc.entity.Student;
import com.jdbc.util.JdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author :Mr.Xu
 * Date    :2019-4-8
 */


public class StudentDao {

    public void add(Student student){
        try {
            Connection connection = JdbcUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement("insert into student value (null,?,?)");
            ps.setString(1,student.getName());
            ps.setInt(2,student.getAge());
            int i = ps.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
