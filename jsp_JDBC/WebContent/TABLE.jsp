<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
			Connection connection;
			Statement statement;
			ResultSet resultSet;
			
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String uid = "scott";
			String upw = "tiger";
			String query = "select * from emp";
		%>
		<table border ="1">
		<%
		try{
			
			Class.forName(driver);//oracle.jdbc.driver.OracleDriver
			connection = DriverManager.getConnection(url, uid, upw);//jdbc:oracle:thin:@localhost:1521:xe
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);//select * from member
			
			while(resultSet.next()){//튜플, 레코드,로우 값이 출력된다
				String EMPNO = resultSet.getString("EMPNO");//컬럼명
				String ENAME = resultSet.getString("ENAME");
				String JOB = resultSet.getString("JOB");
				String MGR = resultSet.getString("MGR");
				String HIREDATE = resultSet.getString("HIREDATE");
				String SAL = resultSet.getString("SAL");
				String COMM = resultSet.getString("COMM");
				String DEPTNO = resultSet.getString("DEPTNO");
									
				out.println("<html><head></head><body>");
				out.println("<tr><td>"+ EMPNO +"</td>");
				out.println("<td>"+ ENAME +"</td>");
				out.println("<td>"+ JOB +"</td>");
				out.println("<td>"+ MGR +"</td>");
				out.println("<td>"+ HIREDATE +"</td>");
				out.println("<td>"+ SAL +"</td>");
				out.println("<td>"+ COMM +"</td>");
				out.println("<td>"+ DEPTNO +"</td></tr>");
				out.println("</body></html>");
				
			}
			
		} catch(Exception e) {
		} finally {
			try{
				if(resultSet != null) resultSet.close();
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch(Exception e){}
		}
		%>
		</table>
	</body>
</html>