<%-- 
    Document   : login
    Created on : Mar 22, 2023, 11:51:23 AM
    Author     : Quanh
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Instro Framework</title>
    </head>
    <body style="margin:0 auto; width:550px;height:350px">
        <div style="background:#E4F4F2;padding:50px;">
            <h1>Login</h1>
            <div>
                <div class="left"> 
                    <form:form action="login" method="post" modelAttribute="user" >
                        Username : <input type="text"  value=""  name="username" />
                        <br /><br />
                        <form:errors path="user.username" cssStyle="color:red"></form:errors><br />
                            Password : <input type="text"  value=""  name="password" />
                            <br /><br />
                        <form:errors path="user.password" cssStyle="color:red"></form:errors><br />
                        <br /><br />
                        <input name="submit" value="Login" type="submit" />
                    </form:form>>
                </div>
            </div>
        </div>
    </body>
</html>