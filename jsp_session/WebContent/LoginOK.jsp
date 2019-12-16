<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
	<%!
		String id,pw;
	%>
	<%
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		
		if(id.equals("abcde") && pw.equals("12345")){
			
			session.setAttribute("id", id);
			
			response.sendRedirect("welcome.jsp"); //클라이언트로 가서 welcome.jsp를 요청한다
		} else {
			response.sendRedirect("login.jsp"); //아니면 다시 로그인창으로 
		}
	%>
	</body>
</html>