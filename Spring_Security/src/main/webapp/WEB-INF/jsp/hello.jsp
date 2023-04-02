<%-- 
    Document   : hello
    Created on : Apr 2, 2023, 1:08:21 PM
    Author     : anhha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Chỉ những ai đăng nhập mới truy cập được trang này!</h1>
        <h1>Hello World!"</h1>
        <form action="logout" method="get">
            <input type="submit" value="Sign out">
        </form>
    </body>
</html>

