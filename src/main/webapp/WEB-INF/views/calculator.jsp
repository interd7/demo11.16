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
<form action="../computer/submitAction" method="get">
    <p>第一个数：<label>
        <input type="text" name="first" />
    </label></p>
    <p>运算符号：<label>
        <input type="text" name="operator" />
    </label></p>
    <p>第二个数：<label>
        <input type="text" name="second" />
    </label></p>
    <input type="submit" value="提交，查看结果" />
</form>
</body>
</html>
