<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Reservation Form</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<s:form action="reservationAction"  method="post">
    <div align="center">
        <s:select name="office" label="Office" list="offices" listKey="name" listValue="name"
                  headerKey="" headerValue="Select Office" cssClass="formSelect" /><br>

        <s:select name="owner" label="Owner" list="users" listKey="username" listValue="username"
                  headerKey="" headerValue="Select Owner" cssClass="formSelect" /><br>
    </div>
    <div class="container" align="center">
        <div class="column">
            <fieldset>
                <legend class="fieldset-label">Client Type</legend>
                <s:radio name="clientType" list="{'individual', 'company'}" />
            </fieldset>
        </div>
        <div class="column">
            <fieldset>
                <legend class="fieldset-label">Credit Type</legend>
                <s:radio name="creditType" list="{'credit-client', 'non-credit-client'}" />
            </fieldset>
        </div>
        <div class="column">
            <fieldset>
                <label class="fieldset-label">Date: <%= new java.text.SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date()) %></label>
            </fieldset>
        </div>
    </div>
    <div>
        <fieldset>
            <legend>Client Details</legend>
            <s:textfield name="phoneNo" label="Phone No." />
            <s:textfield name="email" label="Email" />
            <s:textfield name="remark" label="Remark/Reason" />
        </fieldset>
    </div>
    <div>
        <fieldset>
            <legend><b>Comment(s)</b></legend>
            <s:textarea name="comments" rows="4" cols="50" />
        </fieldset>
    </div>
    <div align="center">
        <s:select name="status" label="Status" list="statusList" headerKey="" headerValue="Select Status" cssClass="formSelect" />
        <br>

        <s:radio name="request-approval-approved" list="{'request-approval', 'approved'}" cssStyle="font-weight: bold;" />
    </div>
    <s:submit value="Submit" cssClass="actionBtn" />
</s:form>
</body>
</html>
