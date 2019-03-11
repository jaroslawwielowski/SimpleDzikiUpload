<%--
  Created by IntelliJ IDEA.
  User: jaroslawwielowski
  Date: 2019-03-11
  Time: 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %><html>
<head>
    <title>index</title>
</head>
<body>

<form:form method="post"
           modelAttribute="user" action="/register">
    <form:input path="firstName" placeholder="Imię"/><br>
    <form:input path="email" placeholder="Email"/><br>

    Data Urodzenia: <br>
    <form:select path="userDetails.dayOfBirth" items="${dayOfBirth}"/>
    <form:select path="userDetails.monthOfBirth" items="${monthOfBirth}" />
    <form:select path="userDetails.yearsOfBirth" items="${yearOfBirth}" /><br>
    <input type="submit" value="Rejestracja"><br>
</form:form>

</body>
</html>
