package servlet;

import Dao.UserDao;
import Dao.UserDaoImpl;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;

@WebServlet(name = "RegServlet")
public class RegServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
//        if (userName!=null&&password!=null&&!userName.trim().equals("")&&!password.trim().equals("")){
            UserDao userDao=new UserDaoImpl();
            User user=new User(userName,password);
        int result = userDao.add(user);

        if (result>0){
                System.out.println("成功");
                response.sendRedirect("welcome.jsp");
            }else {
                response.sendRedirect("error.jsp");
            }
//        }else {
//            response.sendRedirect("error.jsp");
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
