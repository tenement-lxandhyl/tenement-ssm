<%--
  Created by IntelliJ IDEA.
  User: LinXin
  Date: 2019/3/25
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>
<html>
<head>
    新闻添加
    <form action="addnews" method="post" enctype="multipart/form-data">
        id:<input type="text" name="n_id" ><br>
        标题:<input type="text" name="n_titie"><br>
        内容:<input type="text" name="n_content"><br>
        时间:<input type="text" name="n_time"><br>
        作者:<input type="text" name="n_author"><br>
        图片:<input type="file" name="file"><br>
        <button type="submit" >添加</button>
    </form>
</head>
<body>

</body>
</html>
