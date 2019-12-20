package edu.bit.ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	private DataSource dataSource;
	
	private static DAO instance = new DAO();
	
	public static DAO getInstance(){
		return instance;
	}
	
	public DAO() {
		try {
			Context context = new InitialContext();
			dataSource =(DataSource)context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<DTO> membersAll() {
		ArrayList<DTO> dtos = new ArrayList<DTO>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;
		
		try {
			con= dataSource.getConnection();
			stmt = con.createStatement();
			result = stmt.executeQuery("select * from emp");
			
			while(result.next()) {
				String empno= result.getString("empno");
				String ename= result.getString("ename");
				String job= result.getString("job");
				String mgr= result.getString("mgr");
				String hiredate= result.getString("hiredate");
				String sal= result.getString("sal");
				String comm= result.getString("comm");
				String deptno= result.getString("deptno");
				
				DTO dto = new DTO(empno,ename,job,mgr,hiredate,sal,comm,deptno);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(result != null) result.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;	
	}
}
