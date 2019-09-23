<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/9
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <style>
        .table{
            border-collapse: collapse;
            border:1px solid black;
            width: 30%;
            margin:0px auto;
        }
        .table td{
            border:1px solid black;
        }
    </style>
</head>
<body>
<form action="reg.action" method="post">
    <table class="table">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="userName" /></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交" />
                <input type="reset" value="重置" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>