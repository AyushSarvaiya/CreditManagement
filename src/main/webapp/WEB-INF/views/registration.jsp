<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h3>Please sign up</h3>
	<form:form action="registration-page" method="post"
		commandName="registration">
First Name:<form:input path="firstName" />
		<font color="red"><form:errors path="firstName"></form:errors></font>
		<br />
		Last Name:<form:input path="lastName"  />
		<font color="red"><form:errors path="lastName"></form:errors></font>
		<br />
		email:<form:input path="email" />
		<font color="red"><form:errors path="email"></form:errors></font>
		<br />
		Password:<form:input path="password" />
		<font color="red"><form:errors path="password"></form:errors></font>
		<br />
		<input type="submit">


	</form:form>
</body>
</html>