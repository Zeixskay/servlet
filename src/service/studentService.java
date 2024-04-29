package service;

import entity.Student;

import java.sql.SQLException;
import java.util.List;

public interface studentService {
    boolean login(String userName,String passWord) throws SQLException;

    List<Student> listUser() throws SQLException;

}
