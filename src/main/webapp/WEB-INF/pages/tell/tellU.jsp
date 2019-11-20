<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>
                        商品ID
                    </th>
                    <th>
                        内容
                    </th>
                    <th>
                        时间
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${tell}" var="tell">


                    <tr>
                        <td>
                                ${tell.product_id}
                        </td>
                        <td>
                                ${tell.tell}
                        </td>
                        <td>
                            <fmt:formatDate value="${tell.tell_time}"/>
                        </td>

                        <td>
                            <a class="btn btn-primary" style="margin-right:10px;"
                               href="/tell/deletetell?tell_id=${tell.tell_id}">删除</a>
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
