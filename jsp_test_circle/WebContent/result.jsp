<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="radius" class="edu.bit.ex.Circle" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:setProperty name ="radius" property="r" param ="radius"/>
	원의 넓이 : <jsp:getProperty name="radius" property="r"/><br>
</body>
</html>