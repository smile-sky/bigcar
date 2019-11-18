<%--
  Created by IntelliJ IDEA.
  User: 11466
  Date: 2019/11/17
  Time: 22:17
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
            <div class="container">
                <div class="row clearfix">
                    <div class="col-md-12 column">
                        <div class="row clearfix">
                            <div class="col-md-6 column">
                                <img alt="140x140" height="224" src="../../timg%20(1).jpg"/>
                            </div>
                            <div class="col-md-4 column">
                                <div class="panel panel-primary">
                                    <div class="panel-heading">
                                        <h3 class="panel-title">
                                            车辆信息
                                        </h3>
                                    </div>
                                    <div class="panel-body">
                                        品牌：${product.pinpai}
                                        ${user}
                                    </div>
                                    <div class="panel-body">
                                        型号：${product.type}
                                    </div>
                                    <div class="panel-footer">
                                        价格：${product.price}
                                    </div>
                                    <div class="panel-footer">
                                        颜色：${product.color}
                                    </div>

                                </div>
                            </div>
                            <div class="col-md-2 column">
                                <a type="submit" class="btn btn-block btn-lg btn-warning"
                                   href="/dingdan/insertDingdan?product_id=${product.product_id}">购买</a>
                                <button type="button" class="btn btn-block btn-lg btn-success">收藏</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <h3>
                        评论
                    </h3>
                    <p>
                        <strong>Git</strong> 是一个分布式的版本控制系统，最初由 <strong>Linus Torvalds</strong>
                        编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在
                        <small>Ruby</small>
                        社区中。
                    </p>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
