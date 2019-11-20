<%--
  Created by IntelliJ IDEA.
  User: 11466
  Date: 2019/11/16
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../css/bootstrap.css" type="text/css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../js/bootstrap.min.js"></script>
    <script>$(function () {

        // test 的点击事件
        $(".btn-default").click(function () {

            alert("修改成功");
        });


    })</script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" action="/seller/updateseller1">
                <div class="form-group">
                    <input type="hidden" class="form-control" id="sellerid"
                           name="sellerid" value="${seller.sellerid}"/>
                    <label for="username">账号</label><input type="test" class="form-control" id="username"
                                                           name="username" value="${seller.username}"/>
                </div>


                <div class="form-group">
                    <label for="phone">电话</label><input type="text" class="form-control" id="phone"
                                                        name="phone" value="${seller.phone}"/>
                </div>

                <div class="form-group">
                    <label for="address">地址</label><input type="test" class="form-control" id="address"
                                                          name="address" value="${seller.address}"/>

                </div>


                <button type="submit" class="btn btn-default" style="margin-right:10px;">修改</button>
                <a href="/seller/sellerselect" class="btn btn-default">返回卖家管理</a>
            </form>
        </div>
    </div>
</div>
</body>
</html>
