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
            <img src="../../timg%20(1).jpg">
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

                            <a href="/dingdan/queryAllDingdan?user_id=${user.user_id}" target="name">我的订单</a>
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
                           href="#panel-element-937292">商品管理</a>
                    </div>
                    <div id="panel-element-937292" class="panel-collapse collapse">
                        <div class="panel-body">
                            <a href="/product/queryproduct" target="name">商品管理</a>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-964009"
                           href="#panel-element-937293">订单管理</a>
                    </div>
                    <div id="panel-element-937293" class="panel-collapse collapse">
                        <div class="panel-body">
                            <a href="/dingdan/queryAllDingdan" target="name">订单管理</a>
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
