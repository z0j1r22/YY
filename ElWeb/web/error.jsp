<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/7
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>错误页面</title>
</head>
<body>
    <h1>出现错误了</h1>
    <%=request.getAttribute("msg")%>
</body>
</html>
