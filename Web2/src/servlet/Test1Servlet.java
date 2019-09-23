package servlet;

import javax.servlet.ServletException;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "Test1Servlet",urlPatterns = "/test",loadOnStartup = 1)
public class Test1Servlet extends javax.servlet.http.HttpServlet {

    public Test1Servlet(){
        System.out.println("Servlet实例化：创建对象");
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("doPost");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("doGet");
    }

    @Override
    public void destroy() {
        System.out.println("destroy销毁");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init初始化");
    }
}
