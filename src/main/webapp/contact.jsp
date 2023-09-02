<%--
  Created by IntelliJ IDEA.
  User: deca
  Date: 28/08/23
  Time: 11:35 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title>Contact Form</title>
</head>
<body>
<div align="center">
  <h2>Contact Form</h2>
  <s:form action="contactAction" method="post">
    <s:textfield label="Contact Name" name="contactName" required="true"/><br>
    <s:textfield label="Email" name="email" required="true"/><br>
    <s:textfield label="Phone Number" name="phoneNo" required="true"/><br>

    <s:submit value="Add Contact"/>
  </s:form>
</div>
</body>
</html>

