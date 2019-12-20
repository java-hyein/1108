<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	dispatcher.jsp
	<hr>
	<!-- set은 어디서 하냐? : servlet actiondo -->
	id : <%=request.getAttribute("id") %><br>
	pw : <%=request.getAttribute("pw") %>
	
</body>
</html>