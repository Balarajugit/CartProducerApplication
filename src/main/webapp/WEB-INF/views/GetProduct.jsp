<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<th><b>FinelCost</b></th>
</tr>
<tr>
<td>${pro.id }</td>
<td>${pro.name}</td>
<td>${pro.count }</td>
<td>${pro.baseCost }</td>
<td>${pro.gst }</td>
<td>${pro.discount }</td>
<td>${pro.finelCost }</td>
</tr>
</table>
</body>
</html>