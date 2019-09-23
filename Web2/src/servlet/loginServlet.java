package servlet;

import Dao.UserDao;
import Dao.UserDaoImpl;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "loginServlet",urlPatterns = "/.action",loadOnStartup = 1)
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        String save=request.getParameter("save");

//        String address=request.getParameter("address");

        if (userName!=null&&password!=null&&!userName.trim().equals("")&&!password.trim().equals("")){
            UserDao userDao=new UserDaoImpl();
            User user=new User(userName,password);
            Map<String,Object> user1=userDao.checkLogin(user);
            System.out.println(user1);
            if (user1!=null){
                HttpSession session=request.getSession();
                session.setAttribute("user",user1.get("username"));
                if (save.equals("1")){
                    Cookie cookie=new Cookie("user1",userName);
                    cookie.setMaxAge(0);
                    Cookie cookie1=new Cookie("user2",userName);
                    response.addCookie(cookie);
                    response.addCookie(cookie1);
                }
                System.out.println("成功");
                response.sendRedirect("index.jsp");
            }else {
                response.sendRedirect("error.jsp");
            }
        }else {
            response.sendRedirect("error.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
