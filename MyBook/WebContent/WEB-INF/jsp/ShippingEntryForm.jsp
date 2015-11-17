<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shipping Entry Form</title>
</head>
<body>
<p>Please input your shipping information. </p>
<form:form modelAttribute="shippingInfo" method="POST" action="purchase/submitShippingInfo">
	<table>
	<tr>
		<td> Receiver's Name: </td>
		<td> <form:input path="name"/> </td>
	</tr>
	<tr>
		<td> Address Line 1: </td>
		<td> <form:input path="addressLine1"/> </td>
	</tr>
		<tr>
		<td> Address Line 2: </td>
		<td> <form:input path="addressLine2"/> </td>
	</tr>
		<tr>
		<td> City: </td>
		<td> <form:input path="city"/> </td>
	</tr>
	<tr>
		<td> State: </td>
		<td> <form:input path="state"/> </td>
	</tr>
	<tr>
		<td> Zip Code: </td>
		<td> <form:input path="zip"/> </td>
	</tr>
	<tr>
		<td colspan="2" align="right">
			<input type="submit" value="Submit My Information"/>
		</td>
	</tr>
	</table>
</form:form>
</body>
</html>