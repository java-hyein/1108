import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//자바와 연결하기 위해서는 
//자바의 sql 패키지의 커넥션 클래스랑
//드레이버 매니저 클라스랑
//SQL Exception 클래스를 불러와야합니다.
//또한 자바에서는 MYSQL 드라이버를 기본으로 제공하지 않기때문에
// 외부에서 받아와서 로딩해줘야합니다.
public class Ex01 {
	public static void main(String[] args) throws SQLException{
		Connection conn = null; //연결을 유지시켜줘
		
		//예외를 발생할수있는 상황에 안전하게 한다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC","root", "1111");
			System.out.println("로그인 성공");
			//System.out.println("작업도전");
			//System.out.println("abc".equals(conn.toString()));
		}catch(ClassNotFoundException | SQLException e) {
			//System.out.println("널포인터 발생!");
			e.printStackTrace();
		}finally {
			if(conn!= null && conn.isClosed()) {
				conn.close();
			}
			//System.out.println("여기서 마지막으로 마무리 작업");
			
		}
	}
}
