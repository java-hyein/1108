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
				Cookie[] cook = request.getCookies(); // Ŭ���̾�Ʈ �ʿ��� ���� �������� ���� 
				
				for(int i = 0; i < cook.length; i++){
					String id = cook[i].getValue();
					
					if(id.equals("abcde"))
						out.println(id +"�� �ȳ��ϼ���." +"<br>");
				}
			%>
			<a href="logout.jsp">�α׾ƿ�</a>
		</form>
	</body>
</html>