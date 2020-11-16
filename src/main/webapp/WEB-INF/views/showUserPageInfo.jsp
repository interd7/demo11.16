<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: inter.d
  Date: 2020/11/10
  Time: 8:59 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <table border="1">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>password</th>
                <th>realname</th>
            </tr>
            <c:forEach items="${pageInfo.list}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.userName}</td>
                    <td>${user.passWord}</td>
                    <td>${user.realName}</td>
                </tr>
            </c:forEach>
        </table>

    <p>当前 <span>${pageInfo.pageNum}</span>页，总<span>${pageInfo.pages}</span>页，共<span>${pageInfo.total}</span>条记录</p>
    <a href="../user/myCurrentPage1?pageSize=${pageInfo.pageSize}&pageNumber=1">首页</a>
    <a href="../user/myCurrentPage1?pageSize=${pageInfo.pageSize}&pageNumber=${pageInfo.prePage}">上一页</a>
    <c:choose>
        <c:when test="${pageInfo.hasNextPage}">
            <a href="../user/myCurrentPage1?pageSize=${pageInfo.pageSize}&pageNumber=${pageInfo.nextPage}">下一页</a>
        </c:when>
        <c:otherwise>
            <a href="../user/myCurrentPage1?pageSize=${pageInfo.pageSize}&pageNumber=${pageInfo.pages}">下一页</a>
        </c:otherwise>
    </c:choose>
    <a href="../user/myCurrentPage1?pageSize=${pageInfo.pageSize}&pageNumber=${pageInfo.pages}">尾页</a>
    </div>
</body>
</html>
