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
            <form class="form-search" action="/dingdan/queryAllDingdan">
                车辆ID
                <input class="input-medium search-query" type="text" name="product_id"/>
                用户ID
                <input class="input-medium search-query" type="text" name="user_id"/>
                <button type="submit" class="btn btn-primary">查找</button>
            </form>
            <table class="table table-hover table-striped">
                <thead>
                <tr>

                    <th>
                        商品ID
                    </th>
                    <th>
                        下单时间
                    </th>
                    <th>
                        状态
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${dingdan}" var="dingdan">


                    <tr>

                        <td>
                                ${dingdan.product_id}
                        </td>
                        <td>
                                ${dingdan.order_time}
                        </td>
                        <td>
                                ${dingdan.statu==0?"运输中":"已到货"}
                        </td>


                        <td>


                            <a class="btn btn-primary"
                               href="/product/pinglun?product_id=${dingdan.product_id}">评论</a>
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
