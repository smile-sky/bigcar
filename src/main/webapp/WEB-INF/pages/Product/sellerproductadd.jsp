<%--
  Created by IntelliJ IDEA.
  User: 陈良
  Date: 2019/11/18
  Time: 11:39
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
            <form role="form" action="/product/insertproduct">
                <div class="form-group">
                    <input type="hidden" class="form-control" id="product_id"
                           name="product_id" value="${product.product_id}"/>
                    <%--<input type="hidden" class="form-control" id="sellerid"--%>
                    <%--name="sellerid" value="${seller.sellerid}"/>--%>
                    <label for="pinpai">品牌</label><input type="test" class="form-control" id="pinpai"
                                                         name="pinpai"/>
                </div>

                <div class="form-group">
                    <label for="type">车型</label><input type="text" class="form-control" id="type"
                                                       name="type"/>
                </div>

                <%--<div class="form-group">--%>
                <%--<label for="type">商家ID</label><input type="text" class="form-control" id="ID"--%>
                <%--name="type" value="${seller.sellerid}" />--%>
                <%--</div>--%>

                <div class="form-group">
                    <label for="price">价格</label><input type="test" class="form-control" id="price"
                                                        name="price"/>

                </div>
                <div class="form-group">
                    <label for="color">颜色</label><input type="test" class="form-control" id="color"
                                                        name="color"/>
                </div>
                <div class="form-group">
                    <label for="beizhu">备注</label><input type="test" class="form-control" id="beizhu"
                                                         name="beizhu"/>
                </div>


                <button type="submit" class="btn btn-default" style="margin-right:10px;">上架</button>
                <a href="/product/queryproduct1" class="btn btn-default">返回卖家管理</a>
            </form>
        </div>
    </div>
</div>
</body>
</html>
