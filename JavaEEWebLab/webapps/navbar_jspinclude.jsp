<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>navbar_jspinclude</title>
<link rel="stylesheet" href="../css/index.css">	
</head>
<body>
	<h1><a href="/JavaEEWebLab/index.jsp">JavaEE Servlet JSP</a></h1>
<p>A website created by Gary.</p>

<div class="navbar">
  <a href="/JavaEEWebLab/ServletLifeCycle">1.</a>
  <a href="<c:url value='/javaEEWeb/lab06/lab06_1.jsp'/>">2-1.</a>
  <a href="/JavaEEWebLab/RequestInfo">2-2.</a>
  <a href="#" class="right">Link</a>
</div>
</body>
</html>