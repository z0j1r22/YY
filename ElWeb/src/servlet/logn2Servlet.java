package servlet;

import entity.User;
import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "logn2Servlet",urlPatterns = "/alogin.action")
public class logn2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            /*
        * 接受参数
	    调用dao的登录方法
	    根据返回的结果进行判断，成功，进入到主页面，失败，进入到错误页面；
        * */
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String userName=request.getParameter("userName");
        String pwd=request.getParameter("pwd");
        User user=new User(userName,pwd);
//        user

        UserService userService=new UserServiceImpl();

        Map<String,Object> map=userService.login(user);

        PrintWriter writer = response.getWriter();
        //登录成功
        if(map!=null){
            //存入session
            request.getSession().setAttribute("user",map.get("username"));
//            writer.print(map);
            writer.print("ok");
        }else{
            writer.print("不存在");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
