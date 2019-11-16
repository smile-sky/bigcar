
<%--
  Created by IntelliJ IDEA.
  User: 11466
  Date: 2019/11/16
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" action="/admin/login">
                <div class="form-group">
                    <label for="username">账号</label><input type="test" class="form-control" id="username"
                                                           name="username"/>
                </div>
                <div class="form-group">
                    <label for="password">密码</label><input type="password" class="form-control" id="password"
                                                           name="password"/>
                </div>

                <div class="form-group">
                    <label for="password">性别</label><input type="radio" name="sex" value="1"
                                                           class="ui-icon-folder-collapsed"/>男
                    <input type="radio" name="sex" value="2"/>女
                </div>

                <div class="form-group">
                    <label for="password">电话</label><input type="text" class="form-control" id="phone"
                                                           name="phone"/>
                </div>

                <div class="form-group">
                    <label for="password">地址</label><input type="test" class="form-control" id="address"
                                                           name="address"/>

                </div>


                <button type="submit" class="btn btn-default" style="margin-right:10px;">注册</button>
                <a href="login.jsp" class="btn btn-default">返回登录</a>
            </form>
        </div>
    </div>
</div>

</body>

</html>

</html>

