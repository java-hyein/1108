<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<% 
	String name, id, password, major, protocol;
	String [] hobby;
	%>
	
	<%
		name = request.getParameter("name");
		id = request.getParameter("id");
		password = request.getParameter("password");
		major = request.getParameter("major");
		protocol = request.getParameter("protocol");
		hobby = request.getParameterValues("hobby");
	%>
	
	�̸� : <%=name%><br>
	���̵� : <%=id%><br>
	��й�ȣ : <%=password%><br>
	��� : <%=Arrays.toString(hobby)%><br>
	���� : <%=major%><br>
	�������� : <%=protocol%><br>
</body>
</html>