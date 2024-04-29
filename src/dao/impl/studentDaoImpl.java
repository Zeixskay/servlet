package dao.impl;

import dao.studentDao;
import entity.Student;
import utils.DBUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class studentDaoImpl extends DBUtils implements studentDao {
    PreparedStatement ps=null;
    ResultSet rs=null;
    Student student=null;
    int i=0;
    @Override
    public Boolean loginStudent(String userName, String passWord) throws SQLException {
        String sql="select * from  student where userName=? and passWord=?";
        rs=selectSQL(sql,new Object[]{userName,passWord});
        while (rs.next()){
            return true;
        }
       return false;
    }

    List<Student> list=new ArrayList<Student>();
    @Override
    public List<Student> listUser() throws SQLException {
        try{
            String sql="select * from student";
            rs=selectSQL(sql,null);
            while(rs.next()){
                student =new Student();
                student.setId(rs.getInt("id"));
                student.setUserName(rs.getString("userName"));
                student.setPassWord(rs.getString("passWord"));
                list.add(student);
            }
        }catch(Exception e){
            e.getStackTrace();
        }finally {
            closeResource();
        }
        return list;
    }
    }
