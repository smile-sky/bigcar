<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11466
  Date: 2019/11/15
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>999</title>
    <link rel="stylesheet" href="../../../css/bootstrap.css" type="text/css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <form class="form-search" action="/product/queryproduct5">
                品牌
                <input class="input-medium search-query" type="text" name="pinpai"/>
                车型
                <input class="input-medium search-query" type="text" name="type"/>
                <button type="submit" class="btn btn-primary">查找</button>

            </form>


            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>
                        品牌
                    </th>
                    <th>
                        车型
                    </th>
                    <th>
                        价格
                    </th>
                    <th>
                        颜色
                    </th>
                    <th>
                        审查状态
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${product}" var="product">


                    <tr>
                        <td>
                                ${product.pinpai}
                        </td>
                        <td>
                                ${product.type}
                        </td>
                        <td>
                                ${product.price}
                        </td>
                        <td>
                                ${product.color}
                        </td>

                        <td>
                                ${product.check_list!=1?"未审核":"已审核"}
                        </td>
                        <td>


                            <a class="btn btn-primary"
                               href="/product/selectproductid2?product_id=${product.product_id}">修改</a>
                            <a class="btn btn-primary"
                               href="/product/deleteproduct?product_id=${product.product_id}">下架</a>
                            <a class="btn btn-primary" href="/product/deleteproduct?product_id=${product.product_id}">查看评论</a>


                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
