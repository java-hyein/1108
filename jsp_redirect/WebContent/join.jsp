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
	
	�̸� :       <%=name %><br>
	<hr>
	���� :       <%=sex %><br>
	<hr>
	���̵� :      <%=id %><br>
	<hr>
	��й�ȣ :    <%=pw1 %><br>
	<hr>
	��й�ȣ Ȯ�� : <%=pw2 %><br>
	<hr>
	�ּ� :       <%=addr %><br>
	<hr>
	��ȭ��ȣ :    <%=tel %><br>
	<hr>
	�̸��� �ּ� :  <%=email %><br>
	<hr>
		
	��� :<br>
	<table border="1">
	<% if(request.getParameterValues("hobby") == null){
		out.println("[������ ��̰� �����ϴ�.]");
	}else{
		for(int i = 0; i < hobby.length;i++) {
		out.println("<tr><td>"+hobby[i]+"</td></tr>");
		}
	}
	%>
	</table>
</body>
</html>