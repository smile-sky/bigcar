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
<form action="/admin/login">
<input type="text" id="username" name="username">
 <input type="text" id="password" name="password">
  <input type="submit"  value="提交">

</form>
</body>

</html>