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
            <form role="form" action="/dingdan/updateDingdan">
                <div class="form-group">
                    <input type="hidden" class="form-control" id="dingdan_id"
                           name="dingdan_id" value="${dingdan.dingdan_id}"/>
                    <label for="statu">状态</label><input type="test" class="form-control" id="statu"
                                                        name="statu" value="${dingdan.statu}"/>
                </div>


                <button type="submit" class="btn btn-default" style="margin-right:10px;">修改</button>
                <a href="/user/select" class="btn btn-default">返回用户管理</a>
            </form>
        </div>
    </div>
</div>
</body>
</html>
