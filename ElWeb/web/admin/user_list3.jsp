<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/23
  Time: 8:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
    <%@include file="../common/header.jsp"%>
    <link rel="stylesheet" type="text/css"
    href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
    <script src="../assets/js/jquery.dataTables.min.js"></script>
    <script src="../assets/js/jquery.dataTables.bootstrap.js"></script>
    <script>
        $(function () {
            $('#example').DataTable({
                "ajax":"../auserList.action",
                "colums":[
                    {"date":"username"},
                    {"date":"workno"},
                    {"date":"sex"},
                    {"date":"phone"},
                    {"date":"birth"},
                ]
            });
        })
    </script>
</head>
<body>
<a href="../index.jsp">首页</a>
<table id="example"class="display" style="width: 100%">
    <thead>
    <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Office</th>
        <th>Extn.</th>
        <th>Start date</th>
    </tr>
    </thead>
</table>
</body>
</html>
