package Servlet;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "Test1Servlet",urlPatterns = "/test1")
public class Test1Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("doPost");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("doGet");
    }
}
