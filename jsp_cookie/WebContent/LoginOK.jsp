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
			//��Ű ����, ����
			Cookie cook = new Cookie("id", id); //��Ű ��ü ���� , "id" abcde
			cook.setMaxAge(60); //��ȿ�ð� ���� 60��
			response.addCookie(cook); //�����ݽ� ��ü�� ��Ű�� �ִ´�. <- abcde�� Ŭ���̾�Ʈ�� ����
			
			response.sendRedirect("welcome.jsp"); //Ŭ���̾�Ʈ�� ���� welcome.jsp�� ��û�Ѵ�
		} else {
			response.sendRedirect("login.jsp"); //�ƴϸ� �ٽ� �α���â���� 
		}
	%>
	</body>
</html>