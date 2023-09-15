<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" href="./style.css">
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<form class="form-create" action="ControllerServletCreateAccount" method="post">
  <label  for="">Account ID: </label>
  <input type="text" name="account_id" id="account_id">
  <br>
  <label for="">Full Name: </label>
  <input type="text" name="name" id="name">
  <br>
  <label for="">Password: </label>
  <input type="password" name="password" id="pw">
  <br>
  <label for="">Email: </label>
  <input type="email" name="email" id="email">
  <br>
  <label for="">Phone: </label>
  <input type="text" name="phone" id="phone">
  <br>
  <label for="">Status: </label>
  <input type="text" name="status" id="status">
  <br>
  <button id="create_account"type="submit">Đăng ký</button>
</form>
</body>
</html>