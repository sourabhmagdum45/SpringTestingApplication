<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        .container {
            width: 80%;
            margin: auto;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 10px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
         .back-link {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }
        .back-link:hover {
            background-color: #45a049;
   
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        .pagination {
            display: inline-block;
            margin: 20px 0;
        }
        .pagination a {
            float: left;
            padding: 8px 16px;
            text-decoration: none;
            border: 1px solid #ddd;
            margin: 0 4px;
            color: black;
        }
        .pagination a.active {
            background-color: #4CAF50;
            color: white;
        }
        .pagination a:hover:not(.active) {
            background-color: #ddd;
        }
    </style>


<body>
	 <div class="container">
        <h2>Product Details</h2>
        <table>
         <tr>
         	<th>Id</th>
        	<th> Name</th>
        	<th>Quantity</th> 
        	<th>price</th> 
        	<th>Update</th>
        	<th>Delete</th>
        	
        </tr>
       
       <c:forEach items="${productList}" var="product">
        <tr>
        	<td>${product.id }</td>
        	<td>${product.name }</td>
        	<td>${product.quantity }</td>
        	<td>${product.price }</td>
        	<td><a href="/update/${product.id}"class="back-link">Update</a>
        	<td><a href="/delete/${product.id}"class="back-link">Delete</a>
        
        </tr>
      </c:forEach>
        </table>
       
        <div>  <a href="/add_product" class="back-link">Register Form</a></div>
    </div>
 
</body>
</html>