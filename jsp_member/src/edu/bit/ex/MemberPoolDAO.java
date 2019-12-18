package edu.bit.ex;
//오라클에 접속해서 데이터를 가져오는것 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

//Data Access Object
public class MemberPoolDAO {
	// 전부 다 서버안에 들어가 있음 
//	private String url="jdbc:oracle:thin:@localhost:1521:xe";
//	private String uid="scott";
//	private String upw="tiger";
	
	
	// Connection pool
	private DataSource dataSource;
	
	
	public MemberPoolDAO() {
		// 컨택스트 풀 하면 어떻게 달라지는지 알기 위해 주석 처리를 함 -> 아래의 두 try 문! 
//		try {
//			Class.forName("oracle.jdbc.dr-iver.OracleDriver");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			Context context = new InitialContext();
			//JNDI 는 Java Naming and Directoty interface
			//명명 및 디렉토리 서비스에 접근하기위한 API
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//맨날 천날 하니까 외워라 리턴값 : ArrayList<MemberDTO>
	public ArrayList<MemberDTO> memberSelect(){
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet resultSet = null;
		
		try {
			//connection = DriverManager.getConnection(url,uid, upw);
			connection = dataSource.getConnection();
			
			stmt = connection.createStatement();
			resultSet = stmt.executeQuery("select * from member");
			
			while(resultSet.next()) {
				String name = resultSet.getString("name");
				String id = resultSet.getString("id");
				String pw = resultSet.getString("pw");
				String phone1 = resultSet.getString("phone1");
				String phone2 = resultSet.getString("phone2");
				String phone3 = resultSet.getString("phone3");
				String gender = resultSet.getString("gender");

				MemberDTO dto = new MemberDTO(name,id,pw,phone1,phone2,phone3,gender);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(resultSet != null) resultSet.close();
				if(stmt!= null) stmt.close();
				if(connection != null) connection.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}	
}
