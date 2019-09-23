package servlet;

import Dao.UserDao;
import Dao.UserDaoImpl;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "TextServlet",urlPatterns = "/test.action",loadOnStartup = 1)
public class TextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        String username=request.getParameter("userName");
        String pwd=request.getParameter("password");
        UserDao userDao=new UserDaoImpl();
        User user=new User(username,pwd);
        Map<String,Object> user1=userDao.checkLogin(user);
        HttpSession session=request.getSession();
        session.setAttribute("user",user1.get("username"));
        if (user1!=null){
            response.sendRedirect("login1.jsp");
        }else{
            response.sendRedirect("error.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
