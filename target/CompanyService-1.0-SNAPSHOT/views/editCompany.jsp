<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nazar
  Date: 07.10.2016
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/toCompanyEdit/${companyForEdit.id}">
        <input type="text" name="companyName" value="${companyForEdit.name}">
        <input type="text" name="companyEarnings" value="${companyForEdit.earnings}">
        <input type="submit" >
    </form>
</body>
</html>
