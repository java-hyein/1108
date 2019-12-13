<%@ page import = "edu.bit.ex.Triangle"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%! double width,height; 
		double area;
	%>
	<%
		String str = request.getParameter("width");
		String str1 = request.getParameter("height");
		
		width = Double.parseDouble(str);
		height = Double.parseDouble(str1);
		
		Triangle tri = new Triangle(width,height);
		out.println("사각형의 면적은 : "+ tri.getTriangleArea(width, height));
	%>

</body>
</html>