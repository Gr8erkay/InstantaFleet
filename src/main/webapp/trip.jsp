<%--
  Created by IntelliJ IDEA.
  User: deca
  Date: 05/09/23
  Time: 6:24 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<!DOCTYPE html>
<head>
    <title>Trip Form</title>
</head>
<body>
<h1>Trip Form</h1>
<s:form action="tripAction" method="post">
    <s:textfield label="Passenger Name" name="passengerName" />
    <s:textfield label="Passenger Number" name="passengerNo" />
    <s:textfield label="Phone Number" name="passengerPhoneNo" />
    <s:textfield label="Email" name="passengerEmail" />
    <s:textfield label="Departure" name="departure" />
    <s:textfield label="Destination" name="destination" />
    <s:textfield label="Possible Stops" name="possibleStops" />
    <s:textfield label="Pickup Date" name="pickupDate" />
    <s:textfield label="Pickup Time" name="pickupTime" />
    <s:textfield label="End Date" name="endDate" />
    <s:textfield label="End Time" name="endTime" />
    <s:textfield label="Vehicle Category" name="vehicleCategory" />
    <s:textfield label="Service Type" name="serviceType" />
    <s:textfield label="Vehicle Type" name="vehicleType" />
    <s:textfield label="Amount Charged" name="amountCharged" />
    <s:textfield label="Additional Information" name="additionalInformation" />
    <s:textfield label="Personnel" name="personnel" />
    <s:textfield label="Vehicle" name="vehicle" />
    <s:checkbox label="Resource Available" name="resourceAvailable" />
    <s:textfield label="Status" name="status" />

    <s:submit value="Submit" />
</s:form>
</body>

</html>
