<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
<div align="center">
    <h2>Registration Form</h2>
    <s:form action="registrationAction" method="post">
        <s:textfield label="Username" name="username" required="true"/><br>

        <s:password label="Password" name="password" required="true"/><br>

        <s:textfield label="First Name" name="firstName" required="true"/><br>

        <s:textfield label="Last Name" name="lastName" required="true"/><br>

        <s:textfield label="Email" name="email" required="true"/><br>

        <s:textfield label="Phone Number" name="phoneNo" required="true"/><br>

        <s:textfield label="Approval Limit" name="approvalLimit" required="true"/><br>

        <s:submit value="Register"/>
    </s:form>
</div>

</body>
</html>
