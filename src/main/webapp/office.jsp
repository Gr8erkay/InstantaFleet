<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: deca
  Date: 28/08/23
  Time: 4:25 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Office</title>
</head>
<body>
<h2>Add New Office</h2>
<s:form action="officeAction" method="post">
    <s:textfield label="Office name" name="name" required="true"/><br>

    <s:submit value="Add Office" />
</s:form>
</body>
</html>



