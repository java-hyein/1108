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
	
	�̸� : <%=name %><br>
	���� : <%=sex %><br>
	���̵� : <%=id %><br>
	��й�ȣ : <%=pw1 %><br>
	��й�ȣ Ȯ�� : <%=pw2 %><br>
	�ּ� : <%=addr %><br>
	��ȭ��ȣ : <%=tel %><br>
	�̸��� �ּ� : <%=email %><br>
		
	��� :
	<% if(request.getParameterValues("hobby") == null){
		out.println("������ ��̰� �����ϴ�.");
	}else{
		out.println(Arrays.toString(hobby));
	}
	
	%>
	

</body>
</html>