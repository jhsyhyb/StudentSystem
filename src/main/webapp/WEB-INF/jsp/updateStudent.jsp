<%--
  Created by IntelliJ IDEA.
  User: huyanbo
  Date: 2019/3/8
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>修改学生信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    基于SSM框架的管理系统：简单实现增、删、改、查。
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改学生信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="" name="userForm">
        <input type="hidden" name="studentId" value="${student.studentId}"/>
        学生姓名：<label>
        <input type="text" name="studentName" value="${student.studentName}"/>
    </label>
        学生年龄：<label>
        <input type="text" name="studentAge" value="${student.studentAge}"/>
    </label>
        学生性别：<label>
        <input type="text" name="studentSex" value="${student.studentSex }"/>
    </label>
        <input type="button" value="提交" onclick="updateStudent()"/>
    </form>
    <script type="text/javascript">
        function updateStudent() {
            var form = document.forms[0];
            form.action = "<%=basePath %>student/updateStudent";
            form.method = "post";
            form.submit();
        }
    </script>
</div>

