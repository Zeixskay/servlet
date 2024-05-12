package service;

import entity.Student;

import java.sql.SQLException;
import java.util.List;

public interface studentService {
    boolean login(String userName,String passWord) throws SQLException;

    List<Student> listUser(int start,int count) throws SQLException;

    boolean regist(String uname, String upwd) throws SQLException;
}
