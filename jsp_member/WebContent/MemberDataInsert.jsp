<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!
		Connection conn;
		PreparedStatement pstmt;
		ResultSet rset;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "scott";
		String upw = "tiger";
	%>
	<%
	try {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, uid, upw);
		//PreparedStatement를 사용할 경우의 query문 지정
		String query = "insert into member(id, pw, name) values(?,?,?)";
		pstmt = conn.prepareStatement(query);
		int n;
		pstmt.setString(1, "abc");
		pstmt.setString(2, "123");
		pstmt.setString(3, "도쿠마");
		
		n = pstmt.executeUpdate();
		
		pstmt.setString(1, "abc");
		pstmt.setString(2, "123");
		pstmt.setString(3, "도쿠마귀여워");
		
		n = pstmt.executeUpdate();
		
		if(n == 1)
			out.println("insert success");
		else
			out.println("insert fail");
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(rset != null)
				rset.close();
			if(pstmt != null)
				pstmt.close();
			if(conn != null)
				conn.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	%>
</body>
</html>