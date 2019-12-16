<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <% request.setCharacterEncoding("EUC-KR"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String name,sex,id,pw1,pw2,addr,tel,email;
		String [] hobby;
	%>
	
	<%
		name = request.getParameter("name");
		sex = request.getParameter("sex");
		id = request.getParameter("id");
		pw1 = request.getParameter("pw1");
		pw2 = request.getParameter("pw2");
		addr = request.getParameter("addr");
		tel = request.getParameter("tel");
		email = request.getParameter("email");
		hobby = request.getParameterValues("hobby");
		
	%>
	
	이름 :       <%=name %><br>
	<hr>
	성별 :       <%=sex %><br>
	<hr>
	아이디 :      <%=id %><br>
	<hr>
	비밀번호 :    <%=pw1 %><br>
	<hr>
	비밀번호 확인 : <%=pw2 %><br>
	<hr>
	주소 :       <%=addr %><br>
	<hr>
	전화번호 :    <%=tel %><br>
	<hr>
	이메일 주소 :  <%=email %><br>
	<hr>
		
	취미 :<br>
	<table border="1">
	<% if(request.getParameterValues("hobby") == null){
		out.println("[선택한 취미가 없습니다.]");
	}else{
		for(int i = 0; i < hobby.length;i++) {
		out.println("<tr><td>"+hobby[i]+"</td></tr>");
		}
	}
	%>
	</table>
</body>
</html>