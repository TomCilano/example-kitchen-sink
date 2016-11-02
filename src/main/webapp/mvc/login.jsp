<%@ page import="com.ironyard.data.IronUser" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Login Here</title>
</head>
<body>
<div>

</div>
<center><form action="/mvc/login" method="post">
    <div>
        User: <input type="text" name="username"/>
    </div>
    <div>
        Password: <input type="password" name="password"/>
    </div>
    <input type="submit" name="Login">
</form></center>
<center><a href="wideOpen.jsp">em kcilc!</a></center>



</body>
</html>

