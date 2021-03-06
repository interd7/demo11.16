<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DuanYimai
  Date: 2020/11/10
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css"href="<c:url value="/static/css/style.css"/>">
    <script src="<c:url value="/static/js/jquery-3.5.1.min.js"/>"></script>
</head>
<body>
<textarea id="textareaForUser"></textarea>
<p>当前<span id="currentPage"></span>页，总<span id="totalPages"></span>页，共<span id="totalRecorders"></span>条记录</p >
<a href="#" onclick="myShowFirstPage()">首页</a >
<a href="#" onclick="myShowPreviousPage()">上一页</a >
<a href="#" onclick="myShowNextPage()">下一页</a >
<a href="#" onclick="myShowLastPage()">尾页</a >
</body>
<script>
    var totalPages=0;
    var currentPage=0;
    var pageSize=0;
    function myShowFirstPage(){
        currentPage=1;
        let pageInfo = {
            'pageSize':pageSize,
            'pageNumber':currentPage
        };
        myShowCurrentPage(pageInfo);
    }
    function myShowNextPage(){
        currentPage=currentPage+1;
        currentPage=currentPage>totalPages?totalPages:currentPage;
        let pageInfo = {
            'pageSize':pageSize,
            'pageNumber':currentPage
        };
        myShowCurrentPage(pageInfo)
    }
    function myShowPreviousPage(){
        currentPage=currentPage-1;
        currentPage=currentPage<1?1:currentPage;
        let pageInfo={
            'pageSize':pageSize,
            'pageNumber':currentPage
        };
        myShowCurrentPage(pageInfo);
    }
    function myShowLastPage() {
        currentPage=totalPages;
        let pageInfo ={
            "pageSize":pageSize,
            "pageNumber":currentPage
        };
        myShowCurrentPage(pageInfo);
    }

    function myShowCurrentPage(pageinfo) {
        $.ajax({
            type:"POST",
            contentType:"application/json",
            dataType:"json",
            url:"/user/myCurrentPage0",
            data:JSON.stringify(pageinfo),
            success:function (result) {
                var contentStr="";
                let contentObjectSet=result.list;
                for(let i=0;i<contentObjectSet.length;i++){
                    let oneUser=contentObjectSet[i];
                    contentStr=contentStr.concat(oneUser.id);
                    contentStr=contentStr.concat("***");
                    contentStr=contentStr.concat(oneUser.userName);
                    contentStr=contentStr.concat("***");
                    contentStr=contentStr.concat(oneUser.passWord);
                    contentStr=contentStr.concat("***");
                    contentStr=contentStr.concat(oneUser.realName);
                    contentStr=contentStr.concat("\n");
                }
                $("#textareaForUser").val(contentStr);
                $("#currentPage").html(result.pageNum);
                $("#totalPages").html(result.pages);
                $("#totalRecorders").html(result.total);
                totalPages=result.pages;
                pageSize=result.pageSize;
                currentPage=result.pageNum;
            },
            error:function () {
                alert("异常！");
            }
        })
    }
    $(function (){
        let pageInfo = {
            "pageSize" : 4,
            "pageNumber" : 1
        };
        $("#textareaForUser").attr('rows',pageInfo.pageSize);
        $("#textareaForUser").attr('cols','80');
        myShowCurrentPage(pageInfo);
    })
</script>
</html>