package servlet;

import entity.Student;
import service.impl.studentServiceImpl;
import service.studentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/login")
public class studentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //                1.乱码处理
        request.setCharacterEncoding("utf-8");
        studentService userService=new studentServiceImpl();
        List<Student> list= null;
        try {
            list = userService.listUser();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("list",list);
        request.getRequestDispatcher("main.jsp").forward(request,response);
    }
}
