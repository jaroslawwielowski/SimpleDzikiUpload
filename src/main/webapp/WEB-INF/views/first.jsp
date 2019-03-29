<%--
  Created by IntelliJ IDEA.
  User: jaroslawwielowski
  Date: 2019-03-11
  Time: 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                   modelAttribute="berserk" action="/">
            <form:textarea path="description" cols="96" rows="10" placeholder="Jak Ci mija dzień?"/><br>
            <form:input path="login" placeholder="nick"/>
            <input type="submit" value="dodaj post" >
        </form:form>
<%--    </td>--%>

            <br>
<%--    <td>--%>
        wszystkie posty
        <c:forEach items="${berserks}" var="onepost" end="9">
            <table border="5" width="600" height="200" align="center">
                <tr height="10" >
                    <td >${onepost.login} ---- ${onepost.createDateTime}</td>
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
