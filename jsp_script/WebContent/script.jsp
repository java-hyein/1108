<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%--
	<%
		int i = 0;
		while (true) {
			i++;
			out.println("2 * " + i + " = " + (2 * i) + "<br />");
	==================
	<br />
	<%
		if (i >= 9)
				break;
		}
	%>
	--%>
	<%--
	<%!
		int i = 10;
		String str = "ABCDE";
	%>
	
	<%!
		public int sum(int a, int b){
			return a+b;
	}
	%>
	
	<%
		out.println(" i = " + i +"<br />");
		out.println(" str = " + str +"<br />");
		out.println(" sum = " + sum(1,5) +"<br />");
	%>
	 --%>
	 <%
	 	out.println("<h1>구구단 출력</h1>");
	 %>
	 	<table border = "1">
	 	
	 	<%
	 		for(int i = 2; i<=9; i++){
	 			out.println("<th>"+ i+"단"+"</th>");
	 		}
	 	%>	 		
	 	<% 
	 		for(int i = 1; i<= 9; i++){
		 				out.println("<tr>");
		 		for(int j = 2; j<= 9; j++){
		 				out.println("<td>"+ j +" X "+ i +" = "+i*j+"</td>");
		 		}
		 				out.println("</tr>");
		 	}

	 		%>		 		
	 	</table>
	
	
</body>
</html>