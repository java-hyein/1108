<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- <%
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
	%>
	
	1부터 10까지의 합은 <%= sum %> 입니다.
	--%>
	
	구구단 출력
	
	<table border = "1">
		<%
			for(int i = 2; i<=9; i++){
				out.println("<th>"+i+"단"+"</th>");
			}
		%>
		<%
			for(int i=1;i<=9; i++){
				out.println("<tr>");
				for(int j =2; j<=9; j++){
					out.println("<td>"+j+" X "+ i +" = "+j * i +"</td>");
				}
		out.println("</tr>");
			}
		%>
	</table>
	
	
</body>
</html>