<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- ������ redirect.jsp�� ���� ������ �ϰ� ����  RequestObj�� �� �Ŀ� (������ ���� :@WebServlet("/RequestObj"))
	actionDo�� Ÿ�� ���� id pw�� �����Ѵ�. �������� null�� ���´�.
	�ѹ������� ������� ���� ���� �϶�� �ϱ⶧���� �����̷�Ʈ���� set �ѰŴ� ������ �ȵȴ�.
-->
	<%
	
		request.setAttribute("id", "abcde");
		request.setAttribute("pw", "12345");
		
		response.sendRedirect("RequestObj");
	%>
</body>
</html>