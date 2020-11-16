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
    <title>文件上传</title>
</head>
<body>
<form method="post" action="../file/uploadSomeFiles" enctype="multipart/form-data">
    <input type="file" name="files"><br>
    <input type="file" name="files"><br>
    <input type="file" name="files"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
