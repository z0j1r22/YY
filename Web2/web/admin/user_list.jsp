<%@ page import="java.util.List" %>
<%@ page import="entity.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/10
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
    <style>
        .table{
            border-collapse: collapse;
            border: 1px solid blue;
            width: 100%;
        }
        .table th,.table td{
            border: 1px solid blue;
            text-align: center;
        }
    </style>
</head>
<body>
<a href="index.jsp">首页</a>
<a href="admin/user_add.jsp">添加用户</a>
<table class="table">
    <tr>
        <th>名字</th>
        <th>工号</th>
        <th>电话</th>
        <th>性别</th>
        <th>日期</th>
    </tr>

    <%
       if (request.getAttribute("list")!=null){
           List<Map<String,Object>> list= (List<Map<String, Object>>) request.getAttribute("list");
           for (Map user: list){

    %>
<tr>
   <td><%=user.get("username")%></td>
   <td><%=user.get("workno")%></td>
   <td><%=user.get("phone")%></td>
   <td><%=user.get("sex")%></td>
   <td><%=user.get("birth")%></td>
    <td><a href="<%=pageContext.getServletContext().getContextPath()%>/userUpdate.action?id=<%=user.get("id")%>" onclick="return confirm('忍心要修改我么？')">修改</a>>--
        <a href="<%=pageContext.getServletContext().getContextPath()%>/userDelete.action?id=<%=user.get("id")%>" onclick="return confirm('忍心要删除我么？')">删除</a></td>
</tr>
    <%
        }
        }
    %>
</table>
</body>
</html>
