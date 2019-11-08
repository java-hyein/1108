package library01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class rent {
	int id;
	int memberId;
	int bookCount;
	String bookName;
	static Date rentalDate;
	Date bookReturn;
	final static String URL = "jdbc:mysql://localhost:3306/library_schema?serverTimezone=UTC";
	final static String USERNAME = "root";
	final static String PASSWORD = "1111";

	public static ArrayList<rent> selectAll() throws SQLException {
		ArrayList<rent> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String query = "SELECT * FROM rent";
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				rent r = new rent();
				r.id = rs.getInt("id");
				r.memberId = rs.getInt("memberId");
				r.bookCount = rs.getInt("bookCount");
				r.rentalDate = rs.getDate("rentalDate");
				r.bookName = rs.getString("bookName");
				r.bookReturn = rs.getDate("bookReturn");
				list.add(r);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static rent select(int id) throws SQLException {
		rent r = new rent();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "SELECT * FROM rent WHERE id = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				r.id = rs.getInt("id");
				r.memberId = rs.getInt("memberId");
				r.bookCount = rs.getInt("bookCount");
				r.rentalDate = rs.getDate("rentalDate");
				r.bookName = rs.getString("bookName");
				r.bookReturn = rs.getDate("bookReturn");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return r;
	}

	public static void insert(rent r) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "INSERT INTO rent(memberId, bookCount,bookName,rentalDate, bookReturn)" + "VALUES(?,?,?,NOW(),?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, r.memberId);
			pstmt.setInt(2, r.bookCount);
			pstmt.setString(3, r.bookName);
			//pstmt.setDate(4, r.rentalDate);
			pstmt.setDate(4, r.bookReturn);
			pstmt.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void delete(int id) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String query = "DELETE FROM rent WHERE id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void update(rent r) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String query = "UPDATE rent SET memberId = ? , bookCount =?, bookName = ? WHERE id = ? ";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, r.memberId);
			pstmt.setInt(2, r.bookCount);
			pstmt.setString(3, r.bookName);
			pstmt.setInt(4, r.id);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("===== 도서 대여 ====");
			System.out.println("1.대여목록 2.입력 3.종료");
			System.out.print(">");
			int choice = scan.nextInt();
			if (choice == 3) {
				System.out.println("빠이");
				break;
			} else if (choice == 1) {
				ArrayList<rent> list = selectAll();
				Collections.reverse(list);
				System.out.println("====대여목록====");
				if (list.size() == 0) {
					System.out.println("대여 목록이 없습니다.");
				} else {
					System.out.println("순번\t회원번호\t대여권수\t책이름\t\t대여일\t\t반납일자");
					for (rent r : list) {
						System.out.println(r.id + "\t" + r.memberId + "\t" + r.bookCount + "\t" + r.bookName + "\t"
								+ r.rentalDate+"\t"+r.bookReturn + "\t");
					}
					System.out.println("대여 번호 선택(0은 종료)");
					System.out.print(">");
					int rentId = scan.nextInt();
					if (rentId != 0) {
						rent r = select(rentId);
						if (r.id == 0) {
							System.out.println("잘못선택함");
						} else {
							System.out.println("==================");
							System.out.println("순번 : " + r.id);
							System.out.println("회원번호 : " + r.memberId);
							System.out.println("대여권수 : " + r.bookCount);
							System.out.println("책 이름 : " + r.bookName);
							System.out.println("대여일 : "+  r.rentalDate);
							System.out.println("반납일 : " + r.bookReturn);
							System.out.println("1.수정 2.삭제");
							System.out.print(">");
							choice = scan.nextInt();
							if (choice == 1) {
								scan.nextLine();
								rent update = new rent();
								update.id = rentId;
								System.out.println("회원번호 :");
								update.memberId = scan.nextInt();
								System.out.println("대여권수 : ");
								update.bookCount = scan.nextInt();
								System.out.println("책 이름 : ");
								scan.nextLine();
								update.bookName = scan.nextLine();
								update(update);
							} else if (choice == 2) {
								delete(rentId);
							}
						}
					}
				}
			} else if (choice == 2) {
				scan.nextLine();
				System.out.println("===========");
				System.out.println("순번 : ");
				int id = scan.nextInt();
				System.out.println("회원 아이디 : ");
				int memberid = scan.nextInt();
				System.out.println("대여권수 : ");
				int bookCount = scan.nextInt();
				scan.nextLine();
				System.out.println("책 이름 : ");
				String bookName = scan.nextLine();
				System.out.println("반납일  : ");
				
				
				// 캘린더..........
				Calendar c = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
				// System.out.println(sdf.format(c.getTime()));
				c.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) + 3);
				// System.out.println(sdf.format(c.getTime()));
				Date d = new Date(c.getTimeInMillis());
				System.out.println(sdf.format(d));
				
				
				
				
				rent r = new rent();
				r.id = id;
				r.memberId = memberid;
				r.bookCount = bookCount;
				r.bookName = bookName;
				r.rentalDate= rentalDate;
				r.bookReturn = d;
				insert(r);
			}
		}
		scan.close();
	}
}
