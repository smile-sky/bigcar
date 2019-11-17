<%--
  Created by IntelliJ IDEA.
  User: 11466
  Date: 2019/11/16
  Time: 9:31
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
            <form role="form" action="/seller/SellerLogin">
                <div class="form-group">
                    <label for="username">账号</label><input type="test" class="form-control" id="username"
                                                           name="username"/>
                </div>
                <div class="form-group">
                    <label for="password">密码</label><input type="password" class="form-control" id="password"
                                                           name="password"/>
                </div>
                <div class="changeDiv">
                    <label>登录类型:</label>
                    <input id="lei" name="lei" type="text" list="sexlist">
                    <datalist id="sexlist">
                        <option value="1">用户</option>
                        <option value="2">卖家</option>
                        <option value="0">管理员</option>
                    </datalist>
                </div>

                <button type="submit" class="btn btn-default" style="margin-right:10px;">登录</button>
                <a href="#" class="btn btn-default">取消</a>
            </form>
        </div>
    </div>
</div>

</body>
</html>
