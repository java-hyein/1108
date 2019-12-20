<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="insert.do">insert</a>
	<hr>
	
	<!-- (많이 쓰임) request.getContextPath()% : 서버에 등록되어있는 프로젝트 명 나온다. -->
	<a href="http://localhost:8282/<%=request.getContextPath()%>/update.do">update</a>
	<hr>
	<!-- 프로젝트 명 -->
	<a href="http://localhost:8282/jsp_front/select.do">select</a>
	<hr>
	<a href="<%=request.getContextPath()%>/delete.do">delete</a>
	<hr>
	<!--"http://localhost:8282/jsp_front 와  "request.getContextPath()%> 는 같다 -->
	
</body>
</html>