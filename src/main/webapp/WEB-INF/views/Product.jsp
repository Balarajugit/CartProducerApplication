<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Enter Product Details</h1>
<body>
<form action="save" method="POSt">
<pre>
ProductName : <input type="text" name="name"/>
ProductCount : <input type="text" name="count"/>
ProductBaseCost : <input type="text" name="baseCost"/>

<input type="submit" value="SAVE"/>

</pre>
</form>
${msg }
</body>
</html>