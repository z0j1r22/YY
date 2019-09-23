<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/17
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>分页</title>
    <style>
        .tb{
            border-collapse: collapse;
            border:1px solid black;
            width: 100%;
        }
        .tb td,.tb th{
            border:1px solid black;
            text-align: center;
        }
    </style>
</head>
<body>
<a href="index.jsp">首页</a>
<table class="tb">
    <tr>
        <th>名字</th>
        <th>工号</th>
        <th>性别</th>
        <th>电话</th>
        <th>日期</th>
    </tr>
<c:if test="${not empty pager.date}">
    <c:forEach items="${pager.date}" varStatus="status" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.workno}</td>
            <td>${user.sex}</td>
            <td>${user.phone}</td>
            <td>${user.birth}</td>
        </tr>
    </c:forEach>
</c:if>
</table>
<div>

    <a href="test.action?PageNo=1">首页</a>
    <a href="test.action?PageNo=${pager.prev}">上一页</a>
    <a href="test.action?PageNo=${pager.next}">下一页</a>
    <a href="test.action?PageNo=${pager.pages}">尾页</a>
</div>
</body>
</html>
