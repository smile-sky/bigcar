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
            <form role="form" action="/user/update">
                <div class="form-group">
                    <input type="hidden" class="form-control" id="user_id"
                           name="user_id" value="${user.user_id}"/>
                    <label for="username">账号</label><input type="test" class="form-control" id="username"
                                                           name="username" value="${user.username}"/>
                </div>


                <div class="form-group">
                    <label>性别</label><input type="radio" name="sex" value="1" ${user.sex==1?"checked":""}
                                            class="ui-icon-folder-collapsed"/>男
                    <input type="radio" name="sex" value="2" ${user.sex==2?"checked":""}/>女
                </div>

                <div class="form-group">
                    <label for="phone">电话</label><input type="text" class="form-control" id="phone"
                                                        name="phone" value="${user.phone}"/>
                </div>

                <div class="form-group">
                    <label for="address">地址</label><input type="test" class="form-control" id="address"
                                                          name="address" value="${user.address}"/>

                </div>


                <button type="submit" class="btn btn-default" style="margin-right:10px;">修改</button>
                <a href="/user/select" class="btn btn-default">返回用户管理</a>
            </form>
        </div>
    </div>
</div>
</body>
</html>
