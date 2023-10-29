<%--
  Created by IntelliJ IDEA.
  User: dol
  Date: 10/29/2023
  Time: 10:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Delete Room</title>
</head>
<body style="background-color: ${cookie.roomColor.value}">
<table border="2px">
    <c:forEach var="del" items="${droom}">
        <tr>
            <td>${del.roomName}</td>
            <td>${del.roomAccess}</td>
            <td>${del.roomPrice}</td>
        </tr>
    </c:forEach>
</table>

<form action="room-del" method="post">
    <input type="text" name="room-name-del">
    <input type="submit"> Remove at Index
</form>

</body>
</html>
