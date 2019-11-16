<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11466
  Date: 2019/11/14
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
success
    ${us}
    <c:forEach items="${us}" var="us">
        <tr>
            <td> ${us.username}</td>
            <td><a href="/user/delete?id=${us.user_id}">详情</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
