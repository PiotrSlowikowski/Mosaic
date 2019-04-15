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
<div id="container" style="width: ${rozdzielczosc}px; height: ${rozdzielczosc}px">

    <h1>MOZAIKA</h1>
    <div id="rectangle">


        <c:forEach items="${zdjecia}" var="zzdjecie">
        <td>
                <img src="${zzdjecie}" width="450" height="450"
                     alt="Something went wrong.">
            </td>
        </c:forEach>
    </div>
</div>
</div>
</body>
</html>
