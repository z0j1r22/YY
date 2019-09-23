<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/17
  Time: 8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax测试</title>
    <script src="static/js/jquery-3.4.1.min.js"></script>
    <script>
        function getDate() {
            $.get('date.action',function (date) {
                $("#date1").html(date)
            });
        }
    </script>
</head>
<body>
<input type="button" value="获取时间" onclick="getDate()">
<a href="index.jsp">首页</a>
<div id="date1"></div>
</body>
</html>
