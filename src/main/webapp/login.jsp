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
            <form method="post" action="/seller/SellerLogin">
                <div class="form-group">
                    <label for="username">账号</label><input type="test" class="form-control" id="username"
                                                           name="username"/>
                </div>
                <div class="form-group">
                    <label for="password">密码</label><input type="password" class="form-control" id="password"
                                                           name="password"/>
                </div>



                <button type="submit" class="btn btn-default" style="margin-right:10px;">登录</button>
                <a href="#" class="btn btn-default">取消</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                <select name="lei" style="height: 35px;width: 100px;line-height: 10px;border-radius: 10px;">
                    <option value="1">买家登录</option>
                    <option value="2">卖家登录</option>
                    <option value="0">管理员登录</option>
                </select><br /><br />


            </form>



            <select name="lei" onchange="window.location=this.value;" style="height: 35px;width: 100px;line-height: 10px;border-radius: 10px;">
                <option value="userRegister.jsp" selected="selected">买家注册</option>
                <option value="sellerRegister.jsp">卖家注册</option>

            </select><br /><br />



        </div>
    </div>
</div>

</body>
</html>

