<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" action="updated" modelAttribute="product">
<pre>
Id : <form:input path="id"/>
Name: <form:input path="name"/>
Count : <form:input path="count"/>
BaseCost : <form:input path="baseCost"/>
<input type="submit" value="Update"> 
</pre>
</form:form>
</body>
</html>