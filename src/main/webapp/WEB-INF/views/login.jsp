<%--
  Created by IntelliJ IDEA.
  User: fushengyuanwuhui
  Date: 2020/9/15
  Time: 08:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="../loginAction" method="get">
    <p>用户名：<label>
        <input type="text" name="username" />
    </label></p>
    <p>密码：<label>
        <input type="password" name="password" />
    </label></p>
    <input type="submit" value="登录" />
</form>
</body>
</html>
