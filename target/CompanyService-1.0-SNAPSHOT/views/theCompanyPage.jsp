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
    <title>Title</title>
</head>
<body>
<h1 style="font-family:verdana; text-align: center">${company.name}</h1>
<h3 style="text-align: center">Children</h3>
        <table>
            <tr>
                <th>Company name</th>
                <th>Company earnings</th>
                <th>Company + child companies earnings</th>
                <th>Delete</th>
                <th>Edit</th>
                <th>Add child</th>
            </tr>
            <c:forEach var="c" items="${companies}">
                <tr>
                    <th><a href="/findOneCompany/${c.id}">${c.name}</a></th>
                    <th><p>${c.earnings} $</p></th>
                    <th>0</th>
                    <th><a href="/toCompanyDelete/${c.id}">Видалити</a></th>
                    <th><a href="/toCompanyEditPage/${c.id}">Редагувати</a> </th>
                    <th><a href="/addChildPage/${c.id}">add child</a></th>
                </tr>
            </c:forEach>
        </table>
    
</body>
</html>
