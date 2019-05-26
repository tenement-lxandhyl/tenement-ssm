<%--
  Created by IntelliJ IDEA.
  User: LinXin
  Date: 2019/3/25
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>
<html>
<head>
    <title>管理员自身信息的查询</title>
</head>
<body>
<table align='center' border='1' cellspacing='0'>
    <form action="listOneAdmin" method="post">
        id:${adminOne.a_id}<br><input style="display: none" type="text" name="a_id" value="${adminOne.a_id}">
        昵称:<input type="text" name="a_nickname" value="${adminOne.a_nickname}"><br>
        密码:<input type="text" name="a_pass" value="${adminOne.a_pass}"><br>
        姓名:<input type="text" name="a_name" value="${adminOne.a_name}"><br>
        电话号码:<input type="text" name="a_number" value="${adminOne.a_number}"><br>
        <button type="submit" >修改</button>
    </form>
</table>
</body>
</html>
