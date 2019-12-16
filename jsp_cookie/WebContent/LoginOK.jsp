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
			//쿠키 생성, 저장
			Cookie cook = new Cookie("id", id); //쿠키 객체 생성 , "id" abcde
			cook.setMaxAge(60); //유효시간 설정 60초
			response.addCookie(cook); //리스펀스 객체에 쿠키를 넣는다. <- abcde가 클라이언트로 간다
			
			response.sendRedirect("welcome.jsp"); //클라이언트로 가서 welcome.jsp를 요청한다
		} else {
			response.sendRedirect("login.jsp"); //아니면 다시 로그인창으로 
		}
	%>
	</body>
</html>