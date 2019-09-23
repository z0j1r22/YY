<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/7
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%--页面属性--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="false" isELIgnored="false" %>
<%@ page import="java.text.*"%>
<%@ page import="java.text.*"%>
<%@ page import="java.text.*"%>
<%--引入标签库--%>
<%--<%@ taglib prefix=""%>--%>

<html>
  <head>
    <title>首页</title>

  </head>
  <body>
  <%--引入别的页面
   主页面：index.jsp
  被包含的页面：head.jsp
  静态包含
  head加入到index页面--->得到index.java-->index.class
  无法声明同名变量
  同一个request
  --%>
  <%--动态包含
  head.java
  index.java
  声明同名变量
  index.class
  同一个request
  --%>
  <jsp:include page="head.jsp"/>

  <a href="reg.jsp">注册</a>
  <a href="userList.action">查询显示</a>
  <a href="text.jsp">登录</a>

    <%--<%=表达式%>：在页面上输出内容--%>
  <%--<%=session.getAttribute("user")%>--%>

  <%--逻辑判断--%>
    <%
      if(session.getAttribute("role")!=null){
        out.print("欢迎你:"+session.getAttribute("user"));
        out.print("<a href=\"logout.action\">注销</a>");
      }else{
        out.print("<a href=\"login.jsp\">登录</a>");
      }
    %>
    <%--取cookie数据--%>
    <%
      //获取Cookie数组
      Cookie[] cookies = request.getCookies();
      if(cookies!=null){
      for (Cookie cookie : cookies) {
          //根据名字进行判断
          if(cookie.getName().equals("user1")){
            out.print(cookie.getValue());
          }
        }
      }
    %>
  </body>
</html>
