<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--
  Created by IntelliJ IDEA.
  User: Piotrek
  Date: 2019-04-12
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="resources/css/style.css" type="text/css"/>
    <title>Welcome to Home Page.</title>
</head>
<body>
<div class="container">
    <div class="image" style="width: ${width}px; height: ${height}px">

        <c:forEach items="${zdjecia}" var="zdjecie">
            <td>
                <img src="${zdjecie}"
                     alt="Something went wrong.">
            </td>
        </c:forEach>
    </div>
</div>
</div>
</body>
</html>
