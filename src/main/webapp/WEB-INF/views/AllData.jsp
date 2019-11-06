<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th><b>Id</b></th>
<th><b>Name</b></th>
<th><b>Count</b></th>
<th><b>BaseCost</b></th>
<th><b>Gst</b></th>
<th><b>Discount</b></th>
<th><b>FinalCost</b></th>
</tr>
<c:forEach items="${list }" var="p">
<tr>
<td><c:out value="${p.id }"></c:out> </td>
<td><c:out value="${p.name }"></c:out> </td>
<td><c:out value="${p.count}"></c:out> </td>
<td><c:out value="${p.baseCost }"></c:out> </td>
<td><c:out value="${p.gst }"></c:out> </td>
<td><c:out value="${p.discount }"></c:out> </td>
<td><c:out value="${p.finelCost}"></c:out> </td>
</tr>
</c:forEach>
</table>
</body>
</html>