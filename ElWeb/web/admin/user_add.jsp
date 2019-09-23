<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/10
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>录入用户</title>
    <script src="../static/js/jquery-3.4.1.min.js"></script>
    <script>
        $(function(){
            $("#userName").blur(function () {
                // 发送异步请求
                $.ajax({
                    type: "POST", //请求的方式：post
                    url: "../checkUser1.action",//请求的路径
                    // data: "name=John&location=Boston",
                    data:{userName:this.value}, //要提交的参数
                    // 成功后要执行的回调函数
                    success: function(msg){
                        // alert(msg=='true');
                        if(msg=='true'){
                            $("#msg").html("该账号已经存在");
                        }else{
                            $("#msg").html("该账号可以使用");
                        }
                    },
                    error:function (xhr,info,e) {
                        alert("错误："+info+e);
                    }
                });
            });
        });
    </script>
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
<form action="../reg.action" method="post">
    <table class="table">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="userName" required placeholder="请输入用户名" id="userName"  />
                <div id="msg"></div>
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password" required placeholder="请输入密码"  /></td>
        </tr>
        <tr>
            <td>工号</td>
            <td><input type="text" name="workno" required placeholder="请输入工号" value="AAA" /></td>
        </tr>

        <tr>
            <td>电话</td>
            <td><input type="text" name="phone" /></td>
        </tr>
        <tr>
        <td>性别</td>
        <td><input type="radio" name="sex"  value="男"  checked/>男
            <input type="radio" name="sex"  value="女"  />女
        </td>
    </tr>
        <tr>
            <td>生日</td>
            <td><input type="date" name="birth" /></td>
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
