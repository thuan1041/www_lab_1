<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 9/9/2023
  Time: 10:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<form action="ControllerServlet">
    <input type="text" name="test"/>
    <button type="submit">Add</button>
</form>
</body>
</html>
