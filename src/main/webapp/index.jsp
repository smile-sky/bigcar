<%--

<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8"/>
  <title>欢迎使用京西快递管理系统</title>
  <style type="text/css">
    button {
      width: 120px !important;
      height: 120px !important;
      font-size: 28px !important;
      padding-left: 0px !important;
    }
  </style>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css"/>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<blockquote>
  <h2>京西快递</h2>
  <small>为您保驾护航</small>
</blockquote>
<body >
<form action="/product/selectproduct">
  <input type="text" id="username" name="check_list" placeholder="check_list">
  <input type="text" id="username" name="price" placeholder="price">
  <input type="text" id="username" name="pinpai" placeholder="pinpai">
  <input type="text" id="username" name="color" placeholder="color">
  &lt;%&ndash;<input type="text" id="username" name="id">&ndash;%&gt;
  <input type="text" id="username" name="beizhu" placeholder="beizhu">
  <input type="text" id="password" name="type" placeholder="type">
  <input type="text" id="id" name="product_id" placeholder="ID">
  <input type="submit"  value="提交">

</form>
</body>

</html>--%>

<%--
  Created by IntelliJ IDEA.
  User: 11466
  Date: 2019/11/16
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>首页</title>--%>
    <%--<link rel="stylesheet" href="../../css/bootstrap.css" type="text/css">--%>
    <%--<script type="text/javascript" src="../../js/jquery.min.js"></script>--%>
    <%--<script type="text/javascript" src="../../js/bootstrap.min.js"></script>--%>

<%--</head>--%>
<%--<body>--%>
<%--<div class="container">--%>
    <%--<div class="row clearfix">--%>
        <%--<div class="col-md-12 column">--%>
            <%--&lt;%&ndash;<form role="form" action="/seller/SellerLogin">&ndash;%&gt;--%>
            <%--<form role="form" action="/seller/SellerLogin" method="post">--%>
                <%--<div class="form-group">--%>
                    <%--<label for="username">账号${user}</label><input type="test" class="form-control" id="username"--%>
                                                                  <%--name="username"/>--%>
                <%--</div>--%>
                <%--<div class="form-group">--%>
                    <%--<label for="password">密码</label><input type="password" class="form-control" id="password"--%>
                                                           <%--name="password"/>--%>
                <%--</div>--%>
                <%--<div class="changeDiv">--%>
                    <%--<label>登录类型:</label>--%>
                    <%--<input id="lei" name="lei" type="text" list="sexlist">--%>
                    <%--<datalist id="sexlist">--%>
                        <%--<option value="1">用户</option>--%>
                        <%--<option value="2">卖家</option>--%>
                        <%--<option value="0">管理员</option>--%>
                    <%--</datalist>--%>
                <%--</div>--%>

                <%--<button type="submit" class="btn btn-default" style="margin-right:10px;">登录</button>--%>
                <%--<a href="#" class="btn btn-default">取消</a>--%>


            <%--</form>--%>


            <%--<div class="btn-group">--%>
                <%--<button class="btn btn-default">注册账号</button>--%>
                <%--<button data-toggle="dropdown" class="btn btn-default dropdown-toggle"><span class="caret"></span>--%>
                <%--</button>--%>
                <%--<ul class="dropdown-menu">--%>
                    <%--<li>--%>
                        <%--<a href="userRegister.jsp">买家注册</a>--%>
                    <%--</li>--%>

                    <%--<li class="divider">--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="sellerRegister.jsp">卖家注册</a>--%>
                    <%--</li>--%>
                <%--</ul>--%>
            <%--</div>--%>

        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>

<%--</body>--%>
<%--</html>--%>




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


