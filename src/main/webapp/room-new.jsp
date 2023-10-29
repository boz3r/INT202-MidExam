<%--
  Created by IntelliJ IDEA.
  User: dol
  Date: 10/29/2023
  Time: 10:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new room</title>
</head>
<body>
    <form action="room-new" method="post">
        <input type="text" name="newRoomName">
        <input type="text" name="newRoomAccess">
        <input type="text" name="newRoomPrice">
        <input type="submit">
    </form>
</body>
</html>
