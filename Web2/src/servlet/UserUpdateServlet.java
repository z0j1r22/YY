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


@WebServlet(name = "UserUpdateServlet",urlPatterns = "/userUpdate.action")
public class UserUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user=new User("二宝","456","AAA01","123456","女",java.sql.Date.valueOf("2018-1-1"),9);
        UserDao userDao=new UserDaoImpl();
        int result=userDao.Update(user);
        if (result>0){
            response.sendRedirect("userList.action");
        }else {
            request.setAttribute("msg","修改失败");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}