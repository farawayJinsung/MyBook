<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Entry Form</title>
</head>
<body>
<p>Please prepare your order here. </p>
<form:form modelAttribute="order" method="POST" action="purchase/submitItems">
	<table>
	<tr>
		<td> Introduction To Algorithm </td>
		<td> Quantity: </td>
		<td> <form:input path="itemList[0].quantity"/> </td>
	</tr>
	<tr>
		<td> Introduction To Architecture </td>
		<td> Quantity: </td>
		<td> <form:input path="itemList[1].quantity"/> </td>
	</tr>
	<tr>
		<td> Introduction To Data Mining </td>
		<td> Quantity: </td>
		<td> <form:input path="itemList[2].quantity"/> </td>
	</tr>
	<tr>
		<td colspan="2" align="right">
			<input type="submit" value="Submit My Order"/>
		</td>
	</tr>
	</table>
</form:form>
</body>
</html>