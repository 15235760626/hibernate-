package com.jdbc.service;

import com.jdbc.dao.StudentDao;
import com.jdbc.entity.Student;
import com.jdbc.util.JdbcUtil;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author :Mr.Xu
 * Date    :2019-4-8
 */
public class StudentService {

    public void add(){
        JdbcUtil.open();
        try {
            StudentDao dao = new StudentDao();
            dao.add(new Student(null,"张三11",12));
            System.out.println(1/1);
            JdbcUtil.commit();
            System.out.println("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            JdbcUtil.rollback();
        }
    }


    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.add();
    }



}
