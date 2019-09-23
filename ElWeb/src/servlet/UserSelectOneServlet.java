package servlet;

import com.alibaba.fastjson.JSON;
import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "UserSelectOneServlet",urlPatterns = "/userSelectOne.action")
public class UserSelectOneServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String sid=request.getParameter("id");
        UserService userService=new UserServiceImpl();
        Map map=userService.queryById(sid);
        String str= JSON.toJSONStringWithDateFormat(map,"yyyy-MM-dd");
        response.getWriter().print(str);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
