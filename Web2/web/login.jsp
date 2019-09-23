<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/9
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <style>
        .table
        {
            border-collapse: collapse;
            border: 1px solid blue;
            width: 100px;
            margin:0px auto;
        }
        .table tr
        {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<form action="login.action" method="post">
    <table class="table">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="rolename"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>长时间保存</td>
            <td><input type="checkbox" name="save" value="1">两天</td>
        </tr>
        <tr >
            <td colspan="2">
            <input type="submit" value="登录"/>
            <input type="reset" value="重置"/>
            </td>
        </tr>

    </table>
</form>
</body>
</html>
