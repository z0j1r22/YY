<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/23
  Time: 8:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
    <style>
        .tb{
            border: 1px solid black;
            border-collapse: collapse;
            width: 100%;
        }
        .td td,.tb th{
            border: 1px solid black;
            text-align: center;
        }
    </style>
    <script>
        var str="Pager{pageNo=1, pageSize=3, first=1, next=2, prev=1, last=3, pages=3, " +
            "data=[{workno=AAA01, birthday=null, phone=10086, sex=?, regdate=null, id=1, pwd=123456, username=user01}, " +
            "{workno=AAA02, birthday=null, phone=10086, sex=?, regdate=null, id=2, pwd=123456, username=user02}, " +
            "{workno=AAA03, birthday=null, phone=null, sex=?, regdate=null, id=3, pwd=123456, username=user03}], totalCount=8}";
        JSON.parse('{"name":"张三"}');
    </script>
</head>
<body>
<a href="../index.jsp">首页</a>
<a href="admin/user_add.jsp">添加用户</a>
<table class="tb">
    <tr>
        <th>名字</th>
    </tr>
    <c:if test="${not empty users}">
        <c:forEach items="${users}" var="user" varStatus="status">
            <tr>
                <td>${user}</td>
            </tr>
        </c:forEach>
    </c:if>
    <c:if test="${empty users}">
        <tr>
            <td colspan="6">没有数据</td>
        </tr>
    </c:if>
</table>
</body>
</html>
