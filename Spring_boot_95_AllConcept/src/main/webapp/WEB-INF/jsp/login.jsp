<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
  <meta charset="utf-8"/>
  <title>Login</title>
  <style type="text/css">
  /* src/main/webapp/css/styles.css */
* { box-sizing: border-box; }
body {
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial;
  background: linear-gradient(135deg, #f6f9fc 0%, #e9eff6 100%);
  margin: 0;
  padding: 0;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}
.container {
  width: 360px;
  background: white;
  border-radius: 10px;
  padding: 24px;
  box-shadow: 0 6px 18px rgba(20,30,40,0.12);
}
h2 {
  margin: 0 0 16px 0;
  text-align: center;
  color: #172B4D;
}
.form-group { margin-bottom: 12px; }
label {
  display: block;
  font-size: 13px;
  color: #445566;
  margin-bottom: 6px;
}
input[type="text"], input[type="password"], input[type="email"] {
  width: 100%;
  padding: 10px 12px;
  border: 1px solid #dde6f0;
  border-radius: 6px;
  font-size: 14px;
}
button {
  width: 100%;
  padding: 10px 12px;
  border: none;
  border-radius: 6px;
  background: linear-gradient(90deg,#3b82f6,#6366f1);
  color: white;
  font-size: 15px;
  cursor: pointer;
}
button:hover { opacity: 0.95; }
.small-link {
  display: block;
  text-align: center;
  margin-top: 12px;
  font-size: 13px;
}
.alert {
  padding: 10px;
  background: #ffe6e6;
  color: #a20000;
  border-radius: 6px;
  margin-bottom: 12px;
  font-size: 14px;
}
.success {
  padding: 10px;
  background: #e6ffef;
  color: #0b6b3a;
  border-radius: 6px;
  margin-bottom: 12px;
  font-size: 14px;
}
  
  </style>
</head>
<body>
  <div class="container">
    <h2>Login</h2>

   

    <form action="${pageContext.request.contextPath}/login" method="post">
      <div class="form-group">
        <label for="username">Username</label>
        <input id="username" name="username" type="text" placeholder="Enter username" required/>
      </div>

      <div class="form-group">
        <label for="password">Password</label>
        <input id="password" name="password" type="password" placeholder="Enter password" required/>
      </div>

      <button type="submit">Login</button>

      
    </form>
  </div>
</body>
</html>
