<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<div align="center">
		<h2>Welcome</h2>
		<a href="addProduct.jsp">
			<button class="actionBtn">Add New Product</button>
		</a>
	</div>

	<table width="750" class="productTable" align="center">
		<thead>  
			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Product Category</th>
				<th>Product Price</th>
				<th colspan="2">Actions</th>
			</tr>
		</thead>
	
		<s:iterator value="products" var="car">
			<tr>
				<td>
					<s:property value="#car.productId"/>
				</td>
				<td>
					<s:property value="#car.productName"/>
				</td>
				<td>
					<s:property value="#car.productCategory"/>
				</td>
				<td>
					<s:property value="#car.productPrice"/>
				</td>
				<td>
					<a
					href="updateDataAction?productId=<s:property value="#car.productId"/>">
						<button class="actionBtn">Update</button>
					</a> 
				</td>
				<td>
					<a href="deleteAction?productId=<s:property value="#car.productId"/>">
						<button class="actionBtn">Delete</button>
					</a>
				</td>
			</tr>
		</s:iterator>
		
	</table>
</body>
</html>