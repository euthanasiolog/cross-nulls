<%--
  Created by IntelliJ IDEA.
  User: piatr
  Date: 19.04.17
  Time: 01:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hi <c:if test="${not empty name}"><h1>${name}</h1></c:if>!</title>
</head>
<body>
<h1 align="center">Боже! Куда я попал???</h1>
<hr>
<h3 align="center">Вы попали на межгалактический чемпионат по крестикам-ноликам!</h3>
<form action="/start">
    <p align="center"><label for="player1">Игрок первый(X), введи имя!</label><br>
        <input id="player1" name="player1"></p>

    <p align="center"><label for="player2">Игрок второй(O), введи имя!</label><br>
        <input id="player2" name="player2"></p>
    <label for="start">Ну что, готовы?</label><br>
    <input align="right" id="start" type="submit">
</form>
</body>
</html>
