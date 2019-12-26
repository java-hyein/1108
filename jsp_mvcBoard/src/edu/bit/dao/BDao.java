package edu.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.bit.dto.BDto;

public class BDao {
	
	DataSource ds;
	//커넥션풀 언제 가지고 올까? - 객체생성될때 (생성자에) 
	
	public BDao() {
		try {
			//context.xml에서 셋팅된 것을 메모리에 올린다.
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void write(String bName, String bTitle, String bContent) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ds.getConnection();
			// mvc_board_seq.nextval : auto increment 숫자 자동증가
			// mvc_board_seq.currval : 현재 value는 1
			String query ="insert into mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) values (mvc_board_seq.nextval, ?, ?, ?, 0, mvc_board_seq.currval, 0, 0 )";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);
			
			int rn = pstmt.executeUpdate();
			
			if(rn == 1) {
				System.out.println("okay");
			}else {
				System.out.println("fail");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
	public ArrayList<BDto> list() {
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		try {
			con = ds.getConnection();

			String query ="select * from mvc_board order by bGroup desc, bStep asc";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");
				
				BDto dto = new BDto(bId, bName, bTitle, bContent, bDate,bHit, bGroup,bStep, bIndent);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dtos;
	}
	public BDto contentView(String strId) {
		
		upHit(strId);
		//dto 한개 = 게시판 글 1개
		BDto dto = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		try {
			con = ds.getConnection();

			String query ="select * from mvc_board where bId = ?";
			pstmt = con.prepareStatement(query);
			// 문자를 숫자로! 
			pstmt.setInt(1, Integer.parseInt(strId));
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");
				
				dto = new BDto(bId, bName, bTitle, bContent, bDate,bHit, bGroup,bStep, bIndent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
	public void modifyView(String bId,String bName, String bTitle, String bContent) {
		
		Connection con = null;
		PreparedStatement pstmt = null;

		
		try {
			con = ds.getConnection();

			String query ="update mvc_board set bName = ?, bTitle =  ?, bContent =  ? where bId = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);
			pstmt.setInt(4, Integer.parseInt(bId));
			
			int up = pstmt.executeUpdate();
			
			if(up == 1) {
				System.out.println("okay");
			}else {
				System.out.println("fail");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	public void delete(String bId) {
		
		Connection con = null;
		PreparedStatement pstmt = null;

		
		try {
			con = ds.getConnection();

			String query ="delete from mvc_board where bId = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(bId));
			
			int up = pstmt.executeUpdate();
			
			if(up == 1) {
				System.out.println("okay");
			}else {
				System.out.println("fail");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void upHit(String bId) {
		
		Connection con = null;
		PreparedStatement pstmt = null;

		
		try {
			con = ds.getConnection();

			String query ="update mvc_board set bHit = bHit+1 where bId = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(bId));
			
			int up = pstmt.executeUpdate();
			
			if(up == 1) {
				System.out.println("okay");
			}else {
				System.out.println("fail");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public BDto reply_view(String strId) {
		//조회수 증가
		upHit(strId);
		BDto dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ds.getConnection();
			String query = "select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_board where bId = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(strId));
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");
				dto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
	
	public void reply(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep, String bIndent) {
		
		replyShape(bGroup, bStep);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ds.getConnection();
			// mvc_board_seq.nextval = mvc_board_seq의 다음 값 즉, 1번째 글 다음에 두번째로 글을 작성하게되면 1의
			// 다음값인 2가 들어감
			String query = "insert into mvc_board (bId, bName, bTitle, bContent, bGroup, bStep, bIndent)"
					+ "values(mvc_board_seq.nextval, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);
			pstmt.setInt(4, Integer.parseInt(bGroup));
			pstmt.setInt(5, Integer.parseInt(bStep)+1);
			pstmt.setInt(6, Integer.parseInt(bIndent)+1);
			int rn = pstmt.executeUpdate();
			if (rn == 1) {
				System.out.println("정상 처리");
			} else {
				System.out.println("비정상 처리");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	//원본글에 새로운 답글을 달 때 처리 하는 코드 (이미 있는 답글에 새로운 답글이 달리면 step을 하나씩 올려줌)
	private void replyShape(String bGroup, String bStep) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ds.getConnection();
			// 새로운 답변을 달게 되면  전부다 0보다 크니까 하나씩 더 해주기 
			String query = "update mvc_board set bStep = bStep +1 where bGroup = ? and bStep > ?";
			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, Integer.parseInt(bGroup));
			pstmt.setInt(2, Integer.parseInt(bStep)+1);

			int rn = pstmt.executeUpdate();
			if (rn == 1) {
				System.out.println("정상 처리");
			} else {
				System.out.println("비정상 처리");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
}
