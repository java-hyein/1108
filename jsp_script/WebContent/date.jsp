<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>날짜/시간 출력</h1>

	<%
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		String today = sf.format(date);
		
		SimpleDateFormat time = new SimpleDateFormat("HH : mm : ss");
		String time1 = time.format(date);
	%>
현재 날짜 : <%= today %>
	<br>
현재 시간 : <%= time1 %>
</body>
</html>