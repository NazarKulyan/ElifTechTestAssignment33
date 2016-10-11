<%--
  Created by IntelliJ IDEA.
  User: Nazar
  Date: 10.10.2016
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addChild/${company.id}" method="post" >
    <p>Name of parent company ${company.name}</p>
    <label for="companyName">Навза компанії</label>
    <input type="text" id="companyName" name="companyName"></br>
    <label for="companyEarnings">Річний дохід</label>
    <input type="text" id="companyEarnings" name="companyEarnings"></br>
    <input type="submit">
</form>
</body>
</html>
