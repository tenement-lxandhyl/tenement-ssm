<%--
  Created by IntelliJ IDEA.
  User: LinXin
  Date: 2019/3/22
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>

<html>
<head>
    <title>单个新闻信息的查询</title>
</head>
<body>
<form action="updatenews" method="post" enctype="multipart/form-data">
id:${newsone.n_id}<br><input style="display: none" type="text" name="n_id" value="${newsone.n_id}">
标题:<input type="text" name="n_titie" value="${newsone.n_titie}"><br>
内容:<input type="text" name="n_content" value="${newsone.n_content}"><br>
时间:<input type="text" name="n_time" value="${newsone.n_time}"><br>
作者:<input type="text" name="n_author" value="${newsone.n_author}"><br>
图片:<img src="image//${newsone.n_i_address}"><br>
    <input type="file" name="file">
    <button type="submit" >修改</button>
</form>
</body>
</html>
