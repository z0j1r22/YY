<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/18
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/header.jsp"%>
<html>
<head>
    <title>异步分页</title>
    <style>
        div{
            padding-right: 20px;
        }
        #t1{
            background-color: antiquewhite;
            margin-top: 50px;
        }
        #a1{
            margin-top: 40px;
        }
    </style>
    <script>
        // 用来接收后台查出来的pager对象
        var pager;
        function queryAll(pageNo) {
            if (pageNo==null )pageNo=1;
            $.ajax({
               type:"GET",//请求的方式：post
               url:"../auserList.action",//请求的路径
               data:{pageNo:pageNo},
               dataType:'json',//返回的数据类型
               //成功后要执行的回调函数
                success:function(msg){
                    //情况数据
                    $("#tbData").empty();
                    var list=msg.date;//获取数据集合
                    for (var i = 0; i < list.length; i++) {
                        var tr='<tr>'+
                            '<td>'+list[i].username+'</td>'+
                            '<td>'+list[i].workno+'</td>'+
                            '<td>'+list[i].sex+'</td>'+
                            '<td>'+list[i].phone+'</td>'+
                            '<td>'+list[i].birth+'</td>'+
                            '<td> <input type="button" value="修改" onclick="selectOne('+list[i].id+')" ' +
                            'class="btn btn-primary" data-toggle="modal" data-target="#myModal"/>' +
                            '- -<input type="button" value="删除" onclick="deleteUser('+list[i].id+')" class="btn btn-primary" />' +
                            '</td>' +
                            '</tr>';
                        $("#tbData").append(tr);//追加
                    }
                    //初始化分页数据
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
        function selectOne(id){
            $.ajax({
                type:"GET",//请求的方式：post
                url:"../userSelectOne.action?id="+id,//请求的路径
                dataType:'json',//返回的数据类型
                //成功后要执行的回调函数
                success:function (msg) {
                    $("#id").val(msg.id);
                    $("#userName").val(msg.username);
                    $("#workno").val(msg.workno);
                    $("#phone").val(msg.phone);
                    $("#birth").val(msg.birth);
                    if (msg.sex=='男'){
                        $("#boy").prop("checked",true);
                    }else {
                        $("#girl").prop("checked",true);
                    }
                },
                error:function (xhr,info,e) {
                    alert("错误"+info+e);
                }
            });
        }
        // 更新用户
        function updateUser(){
            $.ajax({
                type: "POST", //请求的方式：post
                url: "../userUpdate.action",//请求的路径
                data:$("#form1").serialize(),//序列化表单数据
                dataType:'json',//返回的数据的类型
                // 成功后要执行的回调函数
                success:function (msg) {
                    alert(msg.code+":"+msg.content);
                    // 重新加载数据
                    queryAll(pager.pageNo);
                },
                    error:function (xhr,info,e) {
                        alert("错误"+info+e);
                    }
                });
        }
        // 删除用户
        function deleteUser(id) {
            if(confirm('确认要删除吗？')){
                $.ajax({
                    type: "get", //请求的方式：post
                    url: "../userDelete.action?id="+id,//请求的路径
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

        //清空表单中的数据
        function clearData(){
            //重置
            $("#form1")[0].reset();
            $("#id").val(0);


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
<a href="../index.jsp" id="a1">首页</a>
<a href="user_add.jsp">添加用户</a>
<input type="button" value="添加" onclick="clearData()" class="btn btn-primary" data-toggle="modal" data-target="#myModal"/>
<table class="table table-bordered table-hover " id="t1">
    <tr style="background-color: goldenrod">
        <th>名字</th>
        <th>工号</th>
        <th>性别</th>
        <th>电话</th>
        <th>日期</th>
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

<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    员工信息管理
                </h4>
            </div>
            <div class="modal-body">
                <form  method="post" id="form1">
                    <table class="table">
                        <tr>
                            <td>用户名</td>
                            <td>
                                <%--hidden:隐藏--%>
                                <input type="hidden" name="id" id="id" />
                                <input type="text" name="userName" id="userName" required placeholder="请输入用户名" /></td>
                        </tr>
                        <tr>
                            <td>工号</td>
                            <td><input type="text" name="workno"  id="workno" required placeholder="请输入工号" /></td>
                        </tr>
                        <tr>
                            <td>性别</td>
                            <td>
                                <%--  <input type="text" id="sex"/>--%>
                                <input type="radio" name="sex" id="boy"  value="男"  />男
                                <input type="radio" name="sex" id="girl" value="女"  />女
                            </td>
                        </tr>
                        <tr>
                            <td>电话</td>
                            <td><input type="text" name="phone" id="phone" /></td>
                        </tr>
                        <tr>
                            <td>生日</td>
                            <td><input type="date" name="birth"  id="birth" /></td>
                        </tr>
                    </table>
                </form>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-primary" onclick="updateUser()" data-toggle="modal" data-target="#myModal">
                    提交更改
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</body>
</html>
