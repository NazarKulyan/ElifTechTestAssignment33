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
    <style>
        form {
            
            width: 250px;
            border: 3px solid #f1f1f1;
            margin: 10px 15px;
        }

        .label{
            margin-right: 20px;
            font-family: Arial;
        }
        input[type=text] {
            width: 200px;
            padding: 12px 25px;
            margin: 8px 25px;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

    </style>
</head>
<body>
    <form action="/toCreateCompany" method="post" >
        <label class="label" for="companyName">Навза компанії</label>
        <input type="text" id="companyName" name="companyName"></br>
        <label class="label" for="companyEarnings">Річний дохід</label>
        <input type="text" id="companyEarnings" name="companyEarnings"></br>
        <input type="submit">
    </form>
</body>
</html>
