<%--
  Created by IntelliJ IDEA.
  User: msi
  Date: 2021/5/20
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>UserList</title>
</head>
<body>
    <c:forEach items="${list}" var="user">
        ${user.uid}--${user.username}--${user.password}<br/>
    </c:forEach>

</body>
</html>
