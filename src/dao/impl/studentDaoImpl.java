package dao.impl;

import dao.studentDao;
import entity.Student;
import utils.DBUtils;
import utils.PageUtils;

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
    PageUtils pageUtils=new PageUtils(0,5);
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
    public List<Student> listUser(int start,int count) throws SQLException {

          /*  String sql="select * from student";
            rs=selectSQL(sql,null);
            while(rs.next()){
                student =new Student();
                student.setId(rs.getInt("id"));
                student.setUserName(rs.getString("userName"));
                student.setPassWord(rs.getString("passWord"));
                list.add(student);*/
           list= pageUtils.getStudent(start,count);
        return list;
    }

    @Override
    public boolean registStudent(String uname, String upwd) throws SQLException {

        String sql="insert into student(userName,passWord) values(?,?)";
        Integer flag = cudSQL(sql, new Object[]{uname, upwd});
        if(flag==1){
            return true;
        }
        return false;
    }

}
