package servlet;

import Dao.UserDao;
import Dao.UserDaoImpl;
import entity.User;
import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "login1Servlet",urlPatterns = "/login.action")
public class login1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        String name=request.getParameter("userName");
        String pwd=request.getParameter("password");
        UserService userService=new UserServiceImpl();
        User user=new User(name,pwd);
        Map<String,Object>  user1=userService.login(user);

        if (user1!=null){
            HttpSession session=request.getSession();
            session.setAttribute("user",name);
            System.out.println("成功");
            response.sendRedirect("index.jsp");
        }else {
            response.sendRedirect("error.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
