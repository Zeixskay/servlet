package service.impl;

import dao.impl.studentDaoImpl;
import dao.studentDao;
import entity.Student;
import service.studentService;

import java.sql.SQLException;
import java.util.List;

public class studentServiceImpl implements studentService {
    studentDao studentDao=new studentDaoImpl();
    @Override
    public boolean login(String userName, String passWord) throws SQLException {
       boolean flag= studentDao.loginStudent(userName,passWord);
       return flag;
    }

    @Override
    public List<Student> listUser() throws SQLException {
        return  studentDao.listUser();
    }
}
