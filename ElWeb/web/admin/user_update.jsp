<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/12
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>修改用户</title>
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
<form action="userUpdate.action" method="post">
    <table class="table">
        <tr>
            <td>用户名</td>
            <td>
                <%--hidden:隐藏--%>
                <input type="hidden" name="id" value="${user.id}" />
                <input type="text" name="userName" required placeholder="请输入用户名" value="${user.username}" /></td>
        </tr>
        <tr>
            <td>工号</td>
            <td><input type="text" name="workno" required placeholder="请输入工号" value="${user.workno}" /></td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                    <input type="radio" name="sex"  value="男"  ${user.sex=='男'?'checked':''}/>男
                    <input type="radio" name="sex"  value="女" ${user.sex=='女'?'checked':''} />女
            </td>
        </tr>
        <tr>
            <td>电话</td>
            <td><input type="text" name="phone" value="${user.phone}" /></td>
        </tr>
        <tr>
            <td>生日</td>
            <td><input type="date" name="birth" value="${user.birth}" /></td>
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
