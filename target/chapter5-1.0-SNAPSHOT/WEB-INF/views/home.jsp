<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: s14048
  Date: 4/26/2018
  Time: 10:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css" />" >
    <title>Spittr</title>
</head>
<body>
    <h1>Witamy w serwisie Spittr</h1>
    <a href="<c:url value="/spittles" />">Spittles</a> |
    <a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>
