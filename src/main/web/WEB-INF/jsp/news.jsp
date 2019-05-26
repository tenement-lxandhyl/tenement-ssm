<%--
  Created by IntelliJ IDEA.
  User: LinXin
  Date: 2019/3/22
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
             pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>新闻信息的显示</title>
</head>
<body>
<table align='center' border='1' cellspacing='0'>
<c:forEach items="${listnews}" var="c" varStatus="st">
    <tr>
        <td>${c.n_id}</td>
        <td>${c.n_titie}</td>
        <td>${c.n_content}</td>
        <td>${c.n_time}</td>
        <td>${c.n_author}</td>
        <td><img src="image/${c.n_i_address}"></td>
        <td><a href="/newsone?id=${c.n_id}">修改</a><a href="/deletenews?n_id=${c.n_id}">删除</a></td>
    </tr>
</c:forEach>
</table>
<a href="newsAdd.jsp">添加新闻信息</a>
</body>
</html>
