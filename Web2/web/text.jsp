<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/11
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <style>
        .table{
            border-collapse: collapse;
            border: 1px solid blue;
        }
        .table td{
            border: 1px solid blue;
        }
    </style>
</head>
<body>
<form action="test.action"method="post">
<table class="table">
    <tr>
        <td>用户名</td>
        <td><input type="text" name="userName"></td>
    </tr>
    <tr>
        <td>密码</td>
        <td><input type="password" name="password"></td>
    </tr>
    <tr>
        <td><input type="submit" value="提交"/></td>
        <td><input type="reset" value="重置"/></td>
    </tr>

</table>
</form>
</body>
</html>
