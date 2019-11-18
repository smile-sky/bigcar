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
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" action="/tell/inserttell">
                <div class="form-group">
                    <input type="hidden" class="form-control" id="user_id"
                           name="user_id" value="${user.user_id}"/>
                    <input type="hidden" class="form-control" id="product_id"
                           name="product_id" value="${product_id}"/>
                    <label for="tell">评论</label><input type="test" class="form-control" id="tell"
                                                       name="tell" value="${dingdan.statu}"/>
                </div>


                <button type="submit" class="btn btn-default" style="margin-right:10px;">添加</button>
                <a href="/user/select" class="btn btn-default">返回用户管理</a>
            </form>
        </div>
    </div>
</div>
</body>
</html>
