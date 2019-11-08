package board03;
//Database와 통신을 담당하는 컨트롤러 클래스

//만약 DB와의 기능이 추가적으로 더 필요해진다면?
//컨트롤러만 건드린다.

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//데이터 베이스 통신을 위해서 커넥션이 꼭 필요하다 
//어떤걸 쓰던 커넥션에서 부터 시작한다 
public class BoardController {
	// 의존성 주입을 위해 필드와 셋터를 만든다.
	// 하지만 셋터를 이용한 의존성 주입은 강제성이 떨어지기 때문에
	// 기본 생성자를 막고 파라미터가 있는 생성자를 만들어서
	// 꼭 ConnectionMaker가 들어와서
	// makeConnection()메소드를 통해서 Connection conn이 초기화가
	// 될수 있게 만들어서
	// 생성자를 통한 DI를 구현한다.
	Connection conn;

	public BoardController(ConnectionMaker m) throws Exception {
		conn = m.makeConnection();
	}

	public ArrayList<BoardVO> selectAll() {
		ArrayList<BoardVO> list = new ArrayList<>();
		String sql = "SELECT * FROM board";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO b = new BoardVO();
				b.setId(rs.getInt("id"));
				b.setTitle(rs.getString("title"));
				b.setContent(rs.getString("content"));
				b.setWrittenDate(rs.getDate("writtenDate"));
				b.setUpdatedDate(rs.getDate("updatedDate"));
				list.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public BoardVO select(int id) {
		BoardVO boardVO = new BoardVO();
		try {
			String sql = "SELECT * FROM board WHERE id = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				boardVO.setId(id);
				boardVO.setTitle(rs.getString("title"));
				boardVO.setContent(rs.getString("content"));
				boardVO.setWrittenDate(rs.getDate("writtenDate"));
				boardVO.setUpdatedDate(rs.getDate("updatedDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boardVO;
	}

	public void insert(BoardVO boardVO) {
		String sql = "INSERT INTO board (title, content, writtenDate, updatedDate)"
				+ "VALUES(?, ?, NOW(), NOW())";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardVO.getTitle());
			pstmt.setString(2, boardVO.getContent());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(BoardVO boardVO) {
		String sql = "UPDATE board SET title = ?, content =?, updatedDate = NOW() WHERE id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardVO.getTitle());
			pstmt.setString(2, boardVO.getContent());
			pstmt.setInt(3, boardVO.getId());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delect(int id) {
		String sql = "DELETE FROM board WHERE id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
