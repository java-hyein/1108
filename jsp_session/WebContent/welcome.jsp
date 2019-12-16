<%@page import="java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
	<%
	Enumeration enumeration = session.getAttributeNames();
	while(enumeration.hasMoreElements()){
		//enums 가 값을 가지고 있는지 물어서 있으면 true / while 문이 반복된다.
		String sName= enumeration.nextElement().toString();
		String sValue=(String)session.getAttribute(sName);
		//그다음의 enums 가 가지고 있는 element 들을 string 으로 형 변환 시켜 저장!
		
		if(sValue.equals("abcde"))
			out.println(sValue+"님 안녕하세요."+"<br>");
	}
	%>
	<a href="logout.jsp">로그아웃</a>
	</body>
</html>