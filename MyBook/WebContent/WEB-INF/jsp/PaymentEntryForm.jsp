<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Entry Form</title>
</head>
<body>
<p>Please input payment information. </p>
<form:form modelAttribute="payment" method="POST" action="purchase/submitPayment">
	<table>
	<tr>
		<td> Credit Card Number: </td>
		<td> <form:input path="creditCardNumber"/> </td>
	</tr>
	<tr>
		<td> Expiration Date (MM/YY): </td>
		<td> <form:input path="expireDate"/> </td>
	</tr>
	<tr>
		<td> CVV: </td>
		<td> <form:input path="cvvCode"/> </td>
	</tr>
	<tr>
		<td> Holder's Name: </td>
		<td> <form:input path="cardHolderName"/> </td>
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