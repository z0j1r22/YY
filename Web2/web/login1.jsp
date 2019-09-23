<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/11
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登录</title>
</head>

<body>
<a href="text.jsp">登录</a>
<%

    if(session.getAttribute("user")!=null) {
        out.print("欢迎你:" + session.getAttribute("user"));
        out.print("<a href=\"logout.action\">注销</a>");
    }
%>

</body>
</html>
