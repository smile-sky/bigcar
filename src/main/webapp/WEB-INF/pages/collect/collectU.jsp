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
            <form class="form-search" action="/product/queryproduct">
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
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${collect}" var="collect">


                    <tr>
                        <td>
                                ${collect.pinpai}
                        </td>
                        <td>
                                ${collect.type}
                        </td>
                        <td>
                                ${collect.price}
                        </td>


                        <td>


                            <a class="btn btn-primary"
                               href="/collect/deleteCollect?collectId=${collect.collect_id}">删除</a>

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
