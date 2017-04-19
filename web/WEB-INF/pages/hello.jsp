<%--
  Created by IntelliJ IDEA.
  User: piatr
  Date: 19.04.17
  Time: 01:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hi!</title>
</head>
<body>
<h1>Боже! Куда я попал???</h1>
<hr>
<h3>Вы попали на межгалактический чемпионат по крестикам-ноликам!</h3>
<form action="/start">
    <p><label for="player1">Игрок первый(X), введи имя!</label><br>
        <input id="player1" name="player1"></p>

    <p><label for="player2">Игрок второй(O), введи имя!</label><br>
        <input id="player2" name="player2"></p>
    <label for="start">Ну что, готовы?</label><br>
    <input id="start" type="submit">
</form>
</body>
</html>
