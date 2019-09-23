package servlet;

import com.alibaba.fastjson.JSON;
import entity.Page;
import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UserListServlet2",urlPatterns = "/auserList.action")
public class UserListServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.setContentType("text/html;charset=utf-8");
        UserService userService=new UserServiceImpl();
        String sPageNo= request.getParameter("pageNo");
        if(sPageNo==null) sPageNo="1";

        Page pager = userService.queryByPages(Integer.parseInt(sPageNo));


        //将Java转换成json字符串
//       String str= JSON.toJSONString(pager);
        String str= JSON.toJSONStringWithDateFormat(pager,"yyyy-MM-dd");

        PrintWriter writer = response.getWriter();

        writer.print(str);


    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
