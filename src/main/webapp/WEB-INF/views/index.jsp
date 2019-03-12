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

<table border="5" align="center" width="600" height="200">
    <td align="right">
        <%--@elvariable id="berserk" type="com.example.demo.entities.Berserk"--%>
        <form:form method="post"
                   modelAttribute="berserk" action="posts/add">
            <form:textarea path="description" cols="92" rows="10" placeholder="Jak Ci mija dzień?"/><br>
            <input type="submit" value="dodaj post" >
        </form:form>
    </td>
    <td>

    <c:forEach items="${posts}" var="onepost" end="9">
        <table border="5" width="600" height="200" align="center">
            <tr height="10" >
                <td >${onepost.user.firstName} ${onepost.user.lastName}</td>
            </tr>
            <tr>
                <td>${onepost.description}</td>
            </tr>
        </table>
    </c:forEach>
    </td>

</table>

</body>
</html>
