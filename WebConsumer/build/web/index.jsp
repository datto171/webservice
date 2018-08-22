<%-- 
    Document   : index
    Created on : Aug 20, 2018, 8:24:32 PM
    Author     : anhquan12
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Form</h1>
        <form action="LoginServlet" method="POST">
            Username : <input type="text" name="username"/><br>
            Password : <input type="text" name="password"/><br>
            <input type="submit" value="Login"/>
            <input type="reset" value="Reset"/>
        </form>
    </body>
</html>
