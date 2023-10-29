<%--
  Created by IntelliJ IDEA.
  User: dol
  Date: 10/29/2023
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of available rooms</title>
</head>
<body style="background-color: ${cookie.roomColor.value}">
    <table border="2px">
        <c:forEach var="sroom" items="${list}">
            <tr>
                <td>${sroom.roomName}</td>
                <td>${sroom.roomAccess}</td>
                <td>${sroom.roomPrice}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
