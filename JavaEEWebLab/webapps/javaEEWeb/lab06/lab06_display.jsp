<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Member Information</title>
</head>
<body>
<jsp:include page="/navbar_jspinclude.jsp" />
<div class="row">
<!--   <div class="side">...</div> -->
  <div class="main">
<h1>${pageContext.request.method }版</h1>
<p>親愛的${memberBean.name }，您好</p>
<p>您的${memberBean.email }</p>
<p>您的${memberBean.fruits }</p>
<c:choose>
   <c:when test="${empty memberBean.fruits}" >
       您未挑選水果
   </c:when>
   <c:otherwise >
       您挑選的水果有
       <c:forEach var="fruit" items="${memberBean.fruits}"> 
          <c:out value="${fruit}" />
       </c:forEach>
   </c:otherwise>
</c:choose>
  </div>
</div>
</body>
</html>