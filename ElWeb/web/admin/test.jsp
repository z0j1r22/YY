<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/21
  Time: 8:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/header.jsp"%>
<html>
<head>
    <title>测试</title>
    <style>
        div{
            padding-right: 20px;
        }
        #t1{
            background-color: #50a0dd;
            margin-top: 50px;
        }
        a{
            margin-top: 40px;
        }
    </style>
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
               success:function (msg) {
                   $("#tbData").empty();
                   var list=msg.date;
                   for (var i = 0; i < list.length; i++) {
                       var x ='<tr>'+
                       '<td>'+list[i].name+'</td>'+
                       '<td>'+list[i].sex+'</td>'+
                       '<td>'+list[i].birth+'</td>'+
                       '<td>'+list[i].department+'</td>'+
                       '<td>'+list[i].address+'</td>'+
                       '</tr>'
                       $("#tbData").append(x);
                   }
                   pager=msg;
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
<a href="../index.jsp">上一级</a>
<table class="table table-bordered table-hover " id="t1">
    <tr style="background-color: #6d5ca1">
        <th>名字</th>
        <th>性别</th>
        <th>日期</th>
        <th>系别</th>
        <th>地址</th>
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
