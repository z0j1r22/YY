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
    <%String basePath=pageContext.getServletContext().getContextPath();%>
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
    <script src="static/js/jquery-3.4.1.min.js"></script>
    <script>
        function sub() {
            alert($("#form1").serialize());
            // 发送异步请求
            $.ajax({
                type:"POST",//请求的方式：post
                url:"login.action",//请求的路径
                data:$("#form1").serialize(),//表单序列化
                //成功后要执行的回调函数
                success:function (msg) {
                    if (msg=="ok"){
                        location.href="index.jsp";
                    }else {
                        alert("登录失败，账号或密码错误")
                    }
                },
                error:function (xhr,info,e) {
                    alert("错误："+info+e);
                    
                }
            });
        }
    </script>
</head>
<body>
<form action="<%=basePath%>/login.action" method="post" id="form1">
    <table class="table">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="userName"/></td>
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
            <input type="button" value="异步提交" id="btn1" onclick="sub()">
            <input type="reset" value="重置"/>
            </td>
        </tr>

    </table>
</form>
</body>
</html>
