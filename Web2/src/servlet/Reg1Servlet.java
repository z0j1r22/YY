package servlet;

import Dao.UserDao;
import Dao.UserDaoImpl;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Reg1Servlet",urlPatterns = "/reg.action")
public class Reg1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        String username=request.getParameter("userName");
        String password=request.getParameter("password");
        String workno=request.getParameter("workno");
        String phone=request.getParameter("phone");
        String sex=request.getParameter("sex");
        String birth=request.getParameter("birth");
        UserDao userDao=new UserDaoImpl();
        User user=new User(username,password,workno,phone,sex,java.sql.Date.valueOf(birth));
        int result = userDao.add(user);


        if (result>0){
            response.sendRedirect("userList.action");
        }
        else {
            response.sendRedirect("error.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
