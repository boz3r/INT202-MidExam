<%--
  Created by IntelliJ IDEA.
  User: dol
  Date: 10/29/2023
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Select Room Theme</title>
</head>
<body>
<h2>Select your theme </h2>
<form action="room-theme" method="post">
    <button style="background-color: silver">Silver</button>
    <input type="radio" name="userRoomColor" value="silver"> <br>
    <button style="background-color: darkgoldenrod">Gold</button>
    <input type="radio" name="userRoomColor" value="gold"> <br>
    <button style="background-color: yellow">Yellow</button>
    <input type="radio" name="userRoomColor" value="yellow"> <br>
    <button style="background-color: purple">Purple</button>
    <input type="radio" name="userRoomColor" value="purple"> <br>
    <hr>
    <input type="submit" value="ok">
</form>
</body>
</html>
