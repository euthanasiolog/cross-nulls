<%--
  Created by IntelliJ IDEA.
  User: piatr
  Date: 15.04.17
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>Fight!</title>
  </head>
  <body>
  <h4>Ходит <c:if test="${not empty nextName}">${nextName}</c:if></h4>

  <table border="3" width="300" height="300" align="center">
    <tr>
      <td>
        <form action="/play"><c:if test="${not empty index1}">${index1}</c:if>
        <input type="hidden" name="index1" value="1">
        <input type="submit" name="${type}" value="${type}"></form>
      </td>
      <td>
        <form action="/play"><c:if test="${not empty index2}">${index2}</c:if>
          <input type="hidden" name="index2" value="2">
          <input type="submit" name="${type}" value="${type}"></form>
      </td>
      <td>
        <form action="/play"><c:if test="${not empty index3}">${index3}</c:if>
          <input type="hidden" name="index3" value="3">
          <input type="submit" name="${type}" value="${type}"></form>
      </td>
    </tr>
    <tr>
      <td>
        <form action="/play"><c:if test="${not empty index4}">${index4}</c:if>
          <input type="hidden" name="index4" value="4">
          <input type="submit" name="${type}" value="${type}"></form>
      </td>
      <td>
        <form action="/play"><c:if test="${not empty index5}">${index5}</c:if>
          <input type="hidden" name="index5" value="5">
          <input type="submit" name="${type}" value="${type}"></form>
      </td>
      <td>
        <form action="/play"><c:if test="${not empty index6}">${index6}</c:if>
          <input type="hidden" name="index6" value="6">
          <input type="submit" name="${type}" value="${type}"></form>
      </td>
    </tr>
    <tr>
      <td>
        <form action="/play"><c:if test="${not empty index7}">${index7}</c:if>
          <input type="hidden" name="index7" value="7">
          <input type="submit" name="${type}" value="${type}"></form>
      </td>
      <td>
        <form action="/play"><c:if test="${not empty index8}">${index8}</c:if>
          <input type="hidden" name="index8" value="8">
          <input type="submit" name="${type}" value="${type}"></form>
      </td>
      <td>
        <form action="/play"><c:if test="${not empty index9}">${index9}</c:if>
          <input type="hidden" name="index9" value="9">
          <input type="submit" name="${type}" value="${type}"></form>
      </td>
    </tr>
  </table>
  </body>
</html>
