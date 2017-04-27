<%--
  Created by IntelliJ IDEA.
  User: piatr
  Date: 28.04.17
  Time: 00:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Привет!</title>
</head>
<body>
<form:form action="/reg" commandName="regForm">
    <form:input path="name"/><br>
    <form:input path="email" /><br>
    <form:password path="password" /><br>
    <form:password path="confirmPassword"/><br>
    <input type="submit">
</form:form>
</body>
</html>
