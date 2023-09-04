<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: deca
  Date: 02/09/23
  Time: 3:09 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<table width="750" class="productTable" align="center">
    <thead>
    <tr>
        <th>Office</th>
        <th>Owner</th>
        <th>Client Type</th>
        <th>Credit Type</th>
        <th>Phone Number</th>
        <th>Email</th>
        <th>Remark</th>
        <th>Comments</th>
    </tr>
    </thead>

    <s:iterator value="reservations" var="reservation">
        <tr>
            <td>
                <s:property value="#reservation.office"/>
            </td>
            <td>
                <s:property value="#reservation.owner"/>
            </td>
            <td>
                <s:property value="#reservation.clientType"/>
            </td>
            <td>
                <s:property value="#reservation.creditType"/>
            </td>
            <td>
                <s:property value="#reservation.phoneNo"/>
            </td>
            <td>
                <s:property value="#reservation.email"/>
            </td>
            <td>
                <s:property value="#reservation.remark"/>
            </td>
            <td>
                <s:property value="#reservation.comment"/>
            </td>
        </tr>
    </s:iterator>

</table>

</body>
</html>
