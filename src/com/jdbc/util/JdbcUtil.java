package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author :Mr.Xu
 * Date    :2019-4-8
 */
public class JdbcUtil {




    public static String url="jdbc:mysql:///test";
    public static String user="root";
    public static String password="123";
    public static Connection connection = null;


     static {
         try {
             Class.forName("com.mysql.jdbc.Driver");
             connection = DriverManager.getConnection(url,user,password);
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }

    public static Connection getConnection(){




        return connection;

    }
    public static void open(){
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void rollback(){
        try {
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void commit(){
        try {
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
