<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="title" %>
<%@ attribute name="tpl1" fragment="true" required="true"%>
<%@ attribute name="tpl2" fragment="true" required="true"%>
<%@ attribute name="tpl3" fragment="true" required="true"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
		<title>${title}</title>
		<style type="text/css">
			#div1,#div2,#div3{
				width:90%;
				margin:10px auto;
				border:10px solid red;
			}
		</style>
	</head>
	
	<body>
		<jsp:invoke fragment="tpl1" />
		<!--<jsp:doBody />-->
		<jsp:invoke fragment="tpl2" />
		<jsp:invoke fragment="tpl3" />
	</body>
</html>