package servlet;

import Dao.UserDao;
import Dao.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserDeleteServlet",urlPatterns = "/userDelete.action")
public class UserDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sid=request.getParameter("id");
        UserDao userDao=new UserDaoImpl();
        int result=userDao.delete(Integer.parseInt(sid));
        if (result>0){
            response.sendRedirect("userList.action");
        }else {
            request.setAttribute("msg","删除失败");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
