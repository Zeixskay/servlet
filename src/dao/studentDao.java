package dao;

import entity.Student;

import java.sql.SQLException;
import java.util.List;

public interface studentDao {
    Boolean loginStudent(String username,String password) throws SQLException;
    public List<Student> listUser() throws SQLException;
}
