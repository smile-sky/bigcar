<%--
  Created by IntelliJ IDEA.
  User: 陈良
  Date: 2019/11/17
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>上架</title>
    <link rel="stylesheet" href="../../css/bootstrap.css" type="text/css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" action="/product/insertproduct">
                <div class="form-group">
                    <input type="hidden" class="form-control" id="user_id"
                           name="seller_id" value="${seller.seller_id}"/>

                </div>


                <div class="form-group">
                    <label>类型</label><input type="radio" name="type" value="${product.type}"
                                            class="ui-icon-folder-collapsed"/>
                </div>

                <div class="form-group">
                    <label>价格</label><input type="text" class="form-control" id="phone"
                                                        name="price" value="${product.price}"/>
                </div>

                <div class="form-group">
                    <label >品牌</label><input type="test" class="form-control" id="address"
                                                          name="pinpai" value="${product.pinpai}"/>

                </div>
                <div class="form-group">
                    <label>颜色</label><input type="text" class="form-control" id="color"
                                            name="color" value="${product.color}"/>
                </div>
                <div class="form-group">
                    <label>备注</label><input type="text" class="form-control" id="beizhu"
                                            name="beizhu" value="${product.beizhu}"/>
                </div>

                <button type="submit" class="btn btn-default" style="margin-right:10px;">上架</button>
                <a href="/user/select" class="btn btn-default">返回用户管理</a>
            </form>
        </div>
    </div>
</div>
</body>
</html>
