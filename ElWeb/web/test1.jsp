<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/10
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>内置对象</title>
</head>
<body>
    <div>获取项目的根目录</div>
    <%= pageContext.getServletContext().getContextPath()%>
    <div>作用域对象：存数据，取数据</div>
<%
    //作用域：当前页面
    pageContext.setAttribute("key","value");
    pageContext.getAttribute("key");

    //作用域：一次请求，A页面-->servlet 1(存数据)-->转发servlet 2-->转发到某页面
    request.setAttribute("key","value");
    request.getAttribute("key");

    //作用域：一次会话
    session.setAttribute("key","value");
    session.getAttribute("key");


    //作用域：整个应用的生命周期，可以被所有的客户端共享
    application.setAttribute("key","value");
    application.getAttribute("key");

%>




</body>
</html>
