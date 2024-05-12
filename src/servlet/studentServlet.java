package servlet;

import entity.Student;
import service.impl.studentServiceImpl;
import service.studentService;
import utils.PageUtils;

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        int start=0;

        int total=0;
        int totalNum=0;
        int pageNum=1;
        if(request.getParameter("start")!=null&&request.getParameter("pageNum")!=null){
                start=Integer.parseInt(request.getParameter("start"));
                pageNum=Integer.parseInt(request.getParameter("pageNum"));
        }
        request.setCharacterEncoding("utf-8");
        studentService userService=new studentServiceImpl();
        List<Student> list= null;
        PageUtils pageUtils=new PageUtils(start,5);

        try {
             totalNum = pageUtils.getTotalNum();
             total = pageUtils.getTotal();
             list = userService.listUser(pageUtils.getStart(),pageUtils.getCount());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("list",list);
        request.setAttribute("total",total);
        request.setAttribute("totalNum",totalNum);
        request.setAttribute("start",start);
        request.setAttribute("pageNum",pageNum);
        request.getRequestDispatcher("main.jsp").forward(request,response);
    }
}
