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
	
	이름 : <%=name%><br>
	아이디 : <%=id%><br>
	비밀번호 : <%=password%><br>
	취미 : <%=Arrays.toString(hobby)%><br>
	전공 : <%=major%><br>
	프로토콜 : <%=protocol%><br>
</body>
</html>