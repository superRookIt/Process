<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<c:set var="money1" value="123456789990"></c:set>



<jsp:useBean id="t_date" class="java.util.Date"></jsp:useBean>
<h2> 현재 날짜 : <fmt:formatDate value="${t_date}" pattern="yyyy/MM/dd"/><br></h2>
<fmt:formatDate value="<%=new Date()%>" type="both"/><br>
<fmt:formatDate value="<%=new Date() %>" type="date"/><br>
<fmt:formatDate value="<%=new Date() %>" type="time"/><br>
<hr>


<fmt:formatNumber value="${money1 }" groupingUsed="true"></fmt:formatNumber><br>
<!-- groupingused 천단위 쉼표가 붙음 -->


<fmt:formatNumber value="3.141592" pattern="0000"></fmt:formatNumber><br> <!-- 0003 -->
<fmt:formatNumber value="3.141592" pattern="####"></fmt:formatNumber> <!-- 3 -->
 




</body>
</html>