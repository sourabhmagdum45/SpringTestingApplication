<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
        <h2>Registration Form</h2>
        <form action="/saveProduct" method="post">
          <div class="form-group">
                <label for="id">Student id:</label>
                <input type="text" id="id" name="id" required>
            </div>
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" id="firstName" name="name" required>
            </div>
            <div class="form-group">
                <label for="quantity">quantity:</label>
                <input type="text" id="quantity" name="quantity" required>
            </div>
            <div class="form-group">
                <label for="phone">price:</label>
                <input type="text" id="price" name="price" required>
            </div>
       
            
            <div class="form-group">
                <button type="submit">Register</button>
            </div>
        </form>
    </div>
</body>
</html>