<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/11
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
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
    <script>

    </script>
</head>
<body>


<a href="index.jsp">首页</a>
<a href="admin/user_add.jsp">添加用户</a>

<table class="tb">
    <tr>
        <th>名字</th>
        <th>工号</th>
        <th>性别</th>
        <th>电话</th>
        <th>日期</th>
        <th>操作</th>
    </tr>

    <%-- items="要遍历的集合：使用EL表达式"
    var="变量名：每次从集合中取出的数据的变量名"
    varStatus="status":状态
    --%>
    <%--<c:if test="${ not empty list}">--%>
        <%--<c:forEach items="${list}" var="user" varStatus="status">--%>
            <%--<tr>--%>
                <%--<td>${status.index}---${status.count}--${user.username}</td>--%>
                <%--<td>${user.workno}</td>--%>
                <%--<td>${user.sex}</td>--%>
                <%--<td>${user.phone}</td>--%>
                <%--<td>${user.birth}</td>--%>
                <%--<td><a href="${pageContext.request.contextPath}/userSelectOne.action?id=${user.id}">修改</a>--%>
                    <%----<a href="${pageContext.request.contextPath}/userDelete.action?id=${user.id}" onclick="return confirm('忍心要删除我么？')">删除</a></td>--%>
            <%--</tr>--%>
        <%--</c:forEach>--%>
    <%--</c:if>--%>

<%--</table>--%>
    <c:if test="${ not empty pager.date}">
        <c:forEach items="${pager.date}" var="user" varStatus="status">
            <tr>
                <td>${status.index}---${status.count}--${user.username}</td>
                <td>${user.workno}</td>
                <td>${user.sex}</td>
                <td>${user.phone}</td>
                <td>${user.birth}</td>
                <td><a href="${pageContext.request.contextPath}/userSelectOne.action?id=${user.id}" >修改</a>
                    --<a href="${pageContext.request.contextPath}/userDelete.action?id=${user.id}" onclick="return confirm('忍心要删除我么？')">删除</a></td>
            </tr>
        </c:forEach>
    </c:if>

</table>
<div>
    <a href="userList.action?PageNo=1">首页</a>
    <a href="userList.action?PageNo=${pager.prev}">上页</a>
    <a href="userList.action?PageNo=${pager.next}">下页</a>
    <a href="userList.action?PageNo=${pager.pages}">尾页</a>
</div>

</body>
</html>
