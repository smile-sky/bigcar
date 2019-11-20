<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11466
  Date: 2019/11/15
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>123</title>
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
                    <a class="navbar-brand" href="bigcar.jsp">大表哥二手车${user}</a>
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
            <div class="row">
                <c:forEach items="${product}" var="product">
                    <div class="col-md-4">
                        <div class="thumbnail">
                            <img alt="300x200" src="../../timg%20(1).jpg"/>
                            <div class="caption">
                                <h3>
                                        ${product.pinpai}-${product.type}
                                </h3>
                                <p>
                                        ${product.beizhu}
                                </p>
                                <p>
                                    <a class="btn btn-block btn-lg btn-warning"
                                       href="/product/selectproductid1?product_id=${product.product_id}">详情</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
</body>
</html>
