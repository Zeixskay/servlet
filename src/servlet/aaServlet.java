package servlet;


import service.impl.studentServiceImpl;
import service.studentService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;


public class aaServlet extends HttpServlet {
    //    初始化编码格式
    String charset=null;
    @Override
    public void init(ServletConfig config) throws ServletException {
        //获取xml配置里面的abc 变量值
        charset= config.getInitParameter("abc");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {

        try {
            request.setCharacterEncoding(charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        String uname=request.getParameter("uname");
        String upwd=request.getParameter("upwd");

        studentService userService=new studentServiceImpl();
        boolean flag= false;
        try {
            flag = userService.login(uname,upwd);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(flag){
            response.sendRedirect("/login");
        }else{
            response.sendRedirect("index.jsp");
        }




    }

}
