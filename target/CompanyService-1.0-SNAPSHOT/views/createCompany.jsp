<%--
  Created by IntelliJ IDEA.
  User: Nazar
  Date: 06.10.2016
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/toCreateCompany" method="post" >
        <label for="companyName">Навза компанії</label>
        <input type="text" id="companyName" name="companyName"></br>
        <label for="companyEarnings">Річний дохід</label>
        <input type="text" id="companyEarnings" name="companyEarnings"></br>
        <input type="submit">
    </form>
</body>
</html>
