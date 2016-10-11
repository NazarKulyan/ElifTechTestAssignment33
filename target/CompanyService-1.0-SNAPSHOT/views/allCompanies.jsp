<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nazar
  Date: 08.10.2016
  Time: 0:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<style>
table {
font-family: arial, sans-serif;
border-collapse: collapse;
width: 100%;
}

td, th {
border: 1px solid #dddddd;
text-align: left;
padding: 8px;
}

tr:nth-child(even) {
background-color: #dddddd;
}
</style>
    <a href="/toCompanyCreatePage">Create</a>
    <table>
        <tr>
        <th>Company name</th>
        <th>Company earnings</th>
        <th>Company + child companies earnings</th>
        <th>Видалення</th>
        <th>Редагувати</th>
        </tr>
        <c:forEach var="a" items="${companies}">
            <%--<c:if test="${a.parentId < 1}">--%>
            <tr>
            <th><a href="/findOneCompany/${a.id}">${a.name}</a></th>
            <th>${a.earnings}</th>
            <th>0</th>
            <th><a href="/toCompanyDelete/${a.id}">Видалити</a></th>
            <th><a href="/toCompanyEditPage/${a.id}">Редагувати</a> </th>
            <th><a href="/addChildPage/${a.id}">add child</a></th>
            </tr>
            <%--</c:if>--%>
        </c:forEach>
    </table>
    <%--<a href="/findOneCompany/${a.id}">
        <a href="/toCompanyEditPage/${a.id}">Редагувати</a>
        <a href="/toCompanyDelete/${a.id}">Видалити</a>
        <a href="">add Child Compamy</a>
        <div style="width: 200px;height: 200px;background-color: bisque">
            <p>${a.name}</p>
            <p>${a.earnings}</p>
        </div>
    </a>
--%>
</body>
</html>

