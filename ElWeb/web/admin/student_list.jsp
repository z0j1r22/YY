<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/19
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生</title>
    <style>
        div{
            padding-right: 20px;
        }
        #t1{
            background-color: antiquewhite;
            margin-top: 50px;
        }
        a{
            margin-top: 40px;
        }
    </style>
    <script src="../static/js/jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script>
        var pager;
        function queryAll(pageNo) {
            if (pageNo==null)pageNo=1;
                $.ajax({
                    type: "GET",//请求的方式：post
                    url: "../student.action",//请求的路径
                    data: {pageNo: pageNo},
                    dataType: 'json',//返回的数据类型
                    //成功后要执行的回调函数
                    success: function (c) {
                        //情况数据
                        $("#tbData").empty();
                        var list=c.date;
                        for (var i = 0; i < list.length; i++) {
                            var tr='<tr>'+
                                '<td>'+list[i].name+'</td>'+
                                '<td>'+list[i].sex+'</td>'+
                                '<td>'+list[i].birth+'</td>'+
                                '<td>'+list[i].department+'</td>'+
                                '<td>'+list[i].address+'</td>'+
                                '<td>'+ '<input type="button" value="删除" onclick="deleteUser('+list[i].id+')" class="btn btn-primary" />' +'</td>'+
                                '</tr>';
                            $("#tbData").append(tr);//追加
                        }
                        pager=c;
                        $("#pageInfo").html("当前页："+pager.pageNo+"/总页数："+pager.pages);
                        //初始化当前页码
                        $("#pageNo").val(pager.pageNo);
                        //初始化最大值
                        $("#pageNo").attr("max",pager.pages);
                    },
                    error:function (xhr,info,e) {
                        alert("错误"+info+e);
                    }
                });
        }
        function deleteUser(id) {
            if(confirm('确认要删除吗？')){
                $.ajax({
                    type: "get", //请求的方式：post
                    url: "../studentDelete.action?id="+id,//请求的路径
                    dataType:'json',//返回的数据的类型
                    // 成功后要执行的回调函数
                    success: function(msg){
                        if(msg=="1"){
                            alert('修改成功');
                        }
                        //重新加载数据
                        queryAll(pager.pageNo);

                    },
                    error:function (xhr,info,e) {
                        alert("错误："+info+e);
                    }
                });
            }
        }

        $(function () {
            queryAll();
        });
        $(function () {
            $("#btnGo").click(function () {
                //获取要跳转的页码
                var pageNo=$("#pageNo").val();
                if (pageNo > pager.pages)pageNo=pager.pages;
                queryAll(pageNo)

            });

        });
    </script>
</head>
<body>
<a href="../index.jsp">首页</a>
<a href="user_add.jsp">添加用户</a>
<table class="table table-bordered table-hover " id="t1">
    <tr>
        <th>名字</th>
        <th>性别</th>
        <th>日期</th>
        <th>系别</th>
        <th>地址</th>
        <th>操作</th>
    </tr>
    <tbody id="tbData">

    </tbody>
</table>
<div id="page" style="background-color: pink" class="text-right">
    <span id="pageInfo" style="color: blueviolet"></span><br>
    <a href="javascript:void(0)" onclick="queryAll(1)">首页</a>
    <a href="javascript:void(0)" onclick="queryAll(pager.prev)">上页</a>
    <a href="javascript:void(0)" onclick="queryAll(pager.next)">下页</a>
    <a href="javascript:void(0)" onclick="queryAll(pager.last)">尾页</a>
    <input type="number" value="" id="pageNo" min="1" step="1"/>
    <input type="button" value="Go" id="btnGo"/>
</div>
</body>
</html>
