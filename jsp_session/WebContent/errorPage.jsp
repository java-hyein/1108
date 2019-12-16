<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isErrorPage="true"%>
<% response.setStatus(200); %> <!-- 200 = 정상코드, 제대로 응답을 잘 받았다 -->

<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
			에러발생 <br>
			<%=exception.getMessage()%>

	</body>
</html>