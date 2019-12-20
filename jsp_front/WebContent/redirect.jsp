<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 접속을 redirect.jsp를 먼저 세팅을 하고 나서  RequestObj로 간 후에 (서블릿이 받음 :@WebServlet("/RequestObj"))
	actionDo를 타고 나서 id pw를 응답한다. 돌려보면 null이 나온다.
	한번응답을 줘버리고 새로 만들어서 하라고 하기때문에 리다이렉트에서 set 한거는 전달이 안된다.
-->
	<%
	
		request.setAttribute("id", "abcde");
		request.setAttribute("pw", "12345");
		
		response.sendRedirect("RequestObj");
	%>
</body>
</html>