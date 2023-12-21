<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/init.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>USEr</h1>
	<portlet:renderURL var="formRenderURL">
		<portlet:param name="mvcRenderCommandName" value="formRender" />
	</portlet:renderURL>



	<a href="<%=formRenderURL%>">List</a>

</body>
</html>