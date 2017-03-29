<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<tag:tag1>
	<jsp:attribute name="header">header</jsp:attribute>
	<jsp:attribute name="footer">footer</jsp:attribute>
	<jsp:body>body</jsp:body>
</tag:tag1>
<tag:tag2 title="tpl">
	<jsp:attribute name="tpl1">tpl1</jsp:attribute>
	<jsp:attribute name="tpl2">tpl2</jsp:attribute>
	<jsp:attribute name="tpl3">tpl3</jsp:attribute>
	<jsp:body>body</jsp:body>
</tag:tag2>