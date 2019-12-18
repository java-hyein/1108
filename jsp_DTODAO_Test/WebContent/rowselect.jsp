<%@ page import ="java.util.ArrayList"%>
<%@ page import = "edu.bit.ex.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
		<style>
			table{
				background-color : green;
			}
		</style>
	</head>
	<body>
	<table border ="1">
		<th>이름</th>
		<th>입사일</th>
		<%
			DAO dao = new DAO();
			ArrayList<DTO> dtos = dao.rowselect();
			
			for(int i = 0; i < dtos.size(); i++){
				DTO dto = dtos.get(i);
				String ename = dto.getEname();
				String hiredate = dto.getHiredate();
				out.println("<tr><td>"+ ename+"</td>");
				out.println("<td>"+hiredate+"</td></tr>");
			}
		%>
	</table>
	</body>
</html>