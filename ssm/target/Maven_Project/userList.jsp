<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<head>
    <title>jsp</title>
</head>
<body>
<table style="margin: auto;">
    <tr>
    <td>ID</td>
    <td>userName</td>
    <td>password</td>
    </tr>

    <c:forEach items="${uList}" var="user">
<tr>
    <td>${user.id}</td>
    <td>${user.name}</td>
    <td>${user.password}</td>
</tr>

    </c:forEach>


</table>	


</body>
</html>