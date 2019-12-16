<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<form>
			<%
				Cookie[] cook = request.getCookies(); // 클라이언트 쪽에서 같이 딸려오기 때문 
				
				for(int i = 0; i < cook.length; i++){
					String id = cook[i].getValue();
					
					if(id.equals("abcde"))
						out.println(id +"님 안녕하세요." +"<br>");
				}
			%>
			<a href="logout.jsp">로그아웃</a>
		</form>
	</body>
</html>