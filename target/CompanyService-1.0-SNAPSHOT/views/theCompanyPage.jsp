<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nazar
  Date: 08.10.2016
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>${company.name}</p>
<p>${company.earnings}</p>
<h1 style="text-align: center">Children</h1>
        <table>
            <tr>
                <th>Company name</th>
                <th>Company earnings</th>
                <th>Company + child companies earnings</th>
                <th>Видалення</th>
                <th>Редагувати</th>
            </tr>
            <c:forEach var="c" items="${companies}">
                <tr>
                    <th><a href="/findOneCompany/${c.id}">${c.name}</a></th>
                    <th>${c.earnings}</th>
                    <th>0</th>
                    <th><a href="/toCompanyDelete/${c.id}">Видалити</a></th>
                    <th><a href="/toCompanyEditPage/${c.id}">Редагувати</a> </th>
                    <th><a href="/addChildPage/${c.id}">add child</a></th>
                </tr>
            </c:forEach>
        </table>
    
</body>
</html>
