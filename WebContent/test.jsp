<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="ex" uri="WEB-INF/mytag.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="tom" class="com.qingke.client.Client"></jsp:useBean>
<jsp:setProperty property="name" name="tom" param=""/>
<jsp:getProperty property="name" name="tom"/>
<form action="FirstClass" method="post" enctype="multipart/form-data">
	<input type="file" name="file" size="50" />
	<input type="submit" value="上传">
</form>
<h1>属性和body都没有</h1>
<ex:myTag></ex:myTag>
<hr>
<h1>只有属性</h1>
<ex:myTag msg="属性"></ex:myTag>
<hr>
<h1>只有body</h1>
<ex:myTag>body</ex:myTag>
<hr>
<h1>都有</h1>
<ex:myTag msg="属性">body</ex:myTag>
</body>
</html>