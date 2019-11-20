<%--
  Created by IntelliJ IDEA.
  User: 11466
  Date: 2019/11/15
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../css/bootstrap.css" type="text/css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse"
                            data-target="#bs-example-navbar-collapse-1"><span
                            class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span
                            class="icon-bar"></span><span class="icon-bar"></span></button>
                    <a class="navbar-brand" href="/product/userQueryproduct">大表哥二手车</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                    <form class="navbar-form navbar-left" action="/product/userQueryproduct" role="search">
                        品牌
                        <div class="form-group">
                            <input type="text" name="pinpai" class="form-control"/>
                        </div>
                        车型
                        <div class="form-group">
                            <input type="text" name="type" class="form-control"/>
                        </div>
                        <button type="submit" class="btn btn-default">查找</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">

                        <li>
                            <a href="">个人积分：${num}</a>
                        </li>

                        <li>
                            <a href="../../user.jsp">我的空间</a>
                        </li>
                        <li>
                            <a href="#">退出</a>
                        </li>

                    </ul>
                </div>

            </nav>
        </div>


    </div>
    <div class="row clearfix">
        <div class="col-md-4 column">
            <div class="panel-group" id="panel-964009">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a class="panel-title" data-toggle="collapse" data-parent="#panel-964009"
                           href="#panel-element-671326">订单管理</a>
                    </div>
                    <div id="panel-element-671326" class="panel-collapse in">
                        <div class="panel-body">

                            <a href="/dingdan/userqueryAllDingdan?user_id=${user.user_id}" target="name">我的订单</a>
                        </div>

                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-964009"
                           href="#panel-element-937291">个人信息</a>
                    </div>
                    <div id="panel-element-937291" class="panel-collapse collapse">
                        <div class="panel-body">
                            <a href="/user/selectbyId?id=${user.user_id}" target="name">修改个人信息</a>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-964009"
                           href="#panel-element-937292">评论</a>
                    </div>
                    <div id="panel-element-937292" class="panel-collapse collapse">
                        <div class="panel-body">
                            <a href="/dingdan/selectuseridandstatu?user_id=${user.user_id}&statu=1"
                               target="name">可评论</a>
                        </div>
                        <div class="panel-body">
                            <a href="/tell/querytell?user_id=${user.user_id}&statu=1" target="name">我的评论</a>
                        </div>
                    </div>

                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-964009"
                           href="#panel-element-937293">收藏管理</a>
                    </div>
                    <div id="panel-element-937293" class="panel-collapse collapse">
                        <div class="panel-body">
                            <a href="/collect/queryByIdCollect?user_id=${user.user_id}" target="name">我的收藏</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-8 column">
            <iframe name="name" src="" width=100% height=100% frameborder="0" scrolling="no"></iframe>
        </div>
    </div>
</div>
</body>
</html>
