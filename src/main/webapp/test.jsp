<%--
  Created by IntelliJ IDEA.
  User: deca
  Date: 25/08/23
  Time: 4:28 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Test Form</title>
    <link rel="stylesheet" href="<s:url value='/styles.css' />" />
</head>
<body>
<h1>Registration Form</h1>
<p>Please fill out this form with the required information</p>
<s:form method="post" action="https://register-demo.freecodecamp.org">
    <fieldset>
        <label for="first-name">Enter Your First Name:</label>
        <s:textfield id="first-name" name="first-name" required="true" />
        <label for="last-name">Enter Your Last Name:</label>
        <s:textfield id="last-name" name="last-name" required="true" />
        <label for="email">Enter Your Email:</label>
        <s:textfield id="email" name="email" required="true" type="email" />
        <label for="new-password">Create a New Password:</label>
        <s:password id="new-password" name="new-password" required="true" pattern="[a-z0-5]{8,}" />
    </fieldset>
    <fieldset>
<%--        <label for="personal-account">Personal Account</label>--%>
<%--        <s:radio id="personal-account-radio" name="account-type" value="Personal Account" theme="simple" />--%>

<%--        <label for="business-account">Business Account</label>--%>
<%--        <s:radio id="business-account-radio" name="account-type" value="Business Account" theme="simple" />--%>

        <label for="terms-and-conditions">
            <s:checkbox id="terms-and-conditions" name="terms-and-conditions" required="true" theme="simple" />
            I accept the <a href="https://www.freecodecamp.org/news/terms-of-service/">terms and conditions</a>
        </label>
    </fieldset>
    <fieldset>
<%--        <label for="profile-picture">Upload a profile picture:</label>--%>
<%--        <s:file id="profile-picture" name="file" />--%>
<%--        <label for="age">Input your age (years):</label>--%>
<%--        <s:textfield id="age" name="age" required="true" type="number" min="13" max="120" />--%>
<%--        <label for="referrer">How did you hear about us?</label>--%>
<%--        <s:select id="referrer" name="referrer" list="referrers" listKey="id" listValue="name" headerKey="" headerValue="(select one)" />--%>
<%--        <label for="bio">Provide a bio:</label>--%>
<%--        <s:textarea id="bio" name="bio" rows="3" cols="30" placeholder="I like coding on the beach..." />--%>
    </fieldset>
    <fieldset>
        <legend>What's your cat's personality?</legend>
        <input id="loving" type="checkbox" name="personality" value="loving" checked> <label for="loving">Loving</label>
        <input id="lazy" type="checkbox" name="personality" value="lazy"> <label for="lazy">Lazy</label>
        <input id="energetic" type="checkbox" name="personality" value="energetic"> <label for="energetic">Energetic</label>
    </fieldset>
    <s:submit value="Submit" />
</s:form>
</body>
</html>
