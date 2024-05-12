package dao;

import entity.Student;

import java.sql.SQLException;
import java.util.List;

public interface studentDao {
    Boolean loginStudent(String username,String password) throws SQLException;
    public List<Student> listUser(int start,int count) throws SQLException;

    boolean registStudent(String uname, String upwd) throws SQLException;
}
