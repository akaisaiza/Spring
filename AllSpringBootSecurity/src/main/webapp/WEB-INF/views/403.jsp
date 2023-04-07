<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Access Denied</title>
</head>
<body>
<!-- Include _menu.html -->

<c:if test="${message != null}">
<h3 style="color: red;"><c:out value="${message}"/></h3>
</c:if>

<c:if test="${userInfo != null}">
<div><c:out value="${userInfo}"/></div>
</c:if>

</body>
</html>

