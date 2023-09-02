<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: deca
  Date: 10/08/23
  Time: 5:21 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SUCCESS</title>
</head>
<body>
<h1><s:property value="message"></s:property></h1>
<h2><%= "Success!" %>
</br>
    <a href="loginPage">Login</a>
    <a href="reservationForm">Reservation</a>

</h2>


</body>
</html>
