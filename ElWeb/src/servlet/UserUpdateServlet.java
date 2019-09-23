package servlet;


import com.alibaba.fastjson.JSON;
import entity.Message;
import entity.User;
import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.Map;

@WebServlet(name = "UserUpdateServlet",urlPatterns = "/userUpdate.action")
public class UserUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String sid=request.getParameter("id");
        String username=request.getParameter("userName");
        String workno=request.getParameter("workno");
        String phone=request.getParameter("phone");
        String sex=request.getParameter("sex");
        String birth=request.getParameter("birth");

        User info=new User(username,null,workno,phone,sex, Date.valueOf(birth),Integer.parseInt(sid));

        UserService service=new UserServiceImpl();
        Message message=service.update(info);
        String str= JSON.toJSONString(message);
        response.getWriter().print(str);

//        if(service.Update(info)>0){
//            response.sendRedirect("auserList.action");
//        }else{
//            //绑定错误的提示消息
//            request.setAttribute("msg","修改失败");
//            request.getRequestDispatcher("error.jsp").forward(request,response);
//        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
