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
	
	public DAO() {
		try {
			Context context = new InitialContext();
			dataSource =(DataSource)context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<DTO> rowselect() {
		ArrayList<DTO> dtos = new ArrayList<DTO>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;
		
		try {
			con= dataSource.getConnection();
			stmt = con.createStatement();
			result = stmt.executeQuery("select ename, hiredate from emp where comm is not null");
			
			while(result.next()) {
				String ename= result.getString("ename");
				String hiredate= result.getString("hiredate");
				
				DTO dto = new DTO(ename,hiredate);
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

