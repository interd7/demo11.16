<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DuanYimai
  Date: 2020/11/11
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border-collapse: collapse;
            border-right: 1px solid #ccc;
            border-bottom: 1px solid #ccc;
            text-align:center;
        }
        table td{
            width: 80px;
            height: 30px;
            border: 1px solid;


        }
        textarea{
            width: 300px;
            height: 200px;
        }
    </style>
<%--    <link rel="stylesheet" type="text/css" href="../css/style.css"/>--%>
    <script src="<c:url value="/static/js/jquery-3.5.1.min.js"/>"></script>
</head>
<body>
<div align="center">
    <table class="table table-bordered" id='tabletest'>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>sex</th>
            <th>age</th>
            <th>home</th>
            <th>major</th>
        </tr>
<%--        <c:forEach items="${pageInfo.list}" var="user">--%>
<%--            <tr>--%>
<%--                <td>${user.id}</td>--%>
<%--                <td>${user.userName}</td>--%>
<%--                <td>${user.passWord}</td>--%>
<%--                <td>${user.realName}</td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
    </table>
<%--<textarea id="textareaForStudent"></textarea>--%>
<p>当前<span id="currentPage"></span>页，总<span id="totalPages"></span>页，共<span id="totalRecorders"></span>条记录</p >
<a href="#" onclick="myShowFirstPage()">首页</a >
<a href="#" onclick="myShowPreviousPage()">上一页</a >
<a href="#" onclick="myShowNextPage()">下一页</a >
<a href="#" onclick="myShowLastPage()">尾页</a >
    <form id="input1">
        本页显示几条数据：<input type="text" name="dataNum">
        <input type="submit" value="提交">
    </form>
</div>

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

    function myShowCurrentPage(pageInfo) {
        $.ajax({
            type:"POST",
            contentType:"application/json",
            dataType:"json",
            url:"/student/myStudentInfo",
            data:JSON.stringify(pageInfo),
            success:function (result) {

                //将数据显示在页面上
                var str = " ";

                //遍历数据
                // $.each(result,function(index,element){
                    let contentSet = result.list;
                    for(let i=0;i<contentSet.length;i++) {
                        let oneStudent = contentSet[i];
                        str += "<tr><td>" + oneStudent.id + "</td><td>" + oneStudent.name + "</td><td>" + oneStudent.sex + "</td><td>" + oneStudent.age + "</td><td>" + oneStudent.home + "</td><td>" + oneStudent.major + "</td></tr>";
                    }
                // })
                //遍历完成之后
                str +="</tbody></table>";
                //将表格添加到body中
                $('#tabletest').append(str);
                var contentStr="";
                let contentObjectSet=result.list;
                for(let i=0;i<contentObjectSet.length;i++){
                    let oneStudent=contentObjectSet[i];
                    contentStr=contentStr.concat(oneStudent.id);
                    contentStr=contentStr.concat("***");
                    contentStr=contentStr.concat(oneStudent.name);
                    contentStr=contentStr.concat("***");
                    contentStr=contentStr.concat(oneStudent.sex);
                    contentStr=contentStr.concat("***");
                    contentStr=contentStr.concat(oneStudent.age);
                    contentStr=contentStr.concat("***");
                    contentStr=contentStr.concat(oneStudent.home);
                    contentStr=contentStr.concat("***");
                    contentStr=contentStr.concat(oneStudent.major);
                    contentStr=contentStr.concat("\n");
                }
                $("#textareaForStudent").val(contentStr);
                // $("#tabletest").val(contentStr);
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
        var x = document.getElementById("input1");
        let pageInfo = {
            "pageSize" : 4,
            "pageNumber" : 1
        };
        $("#textareaForUser").attr('rows',pageInfo.pageSize);
        $("#textareaForUser").attr('cols','80');
        console.log(x.elements[0].value)
        // $("#tabletest").attr('rows',pageInfo.pageSize)
        // $("#tabletest").attr('cols','80')
        myShowCurrentPage(pageInfo);
    })
</script>
</html>