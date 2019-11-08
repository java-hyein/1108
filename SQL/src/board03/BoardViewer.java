package board03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//여기서 실행되면서 ui를 뽑아낸다 
public class BoardViewer {
	public static void main(String[] args) throws Exception {
		ConnectionMaker m = new MySqlConnectionMaker(); //상속을 받는 클래스로 초기하면 각자의 틀을 가지고 있는 m이 만들어진다
		BoardController c = new BoardController(m);//
		Scanner scan = new Scanner(System.in);
		showMenu(c, scan);//c, scan을 사용할수있게 해준다 
		scan.close();
	}
	private static void showMenu(BoardController boardController, Scanner scan) { 
		while(true) {
		System.out.println("=====================");
		System.out.println("\t게시판\t");
		System.out.println("=====================");
		System.out.println("1.목록보기  2. 입력하기 3. 종료하기");
		System.out.print(">");
			int choice = scan.nextInt();
			if(choice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}else if (choice == 1) {
				showList(boardController, scan); //목록을 정해준 것은 보드컨트롤러에 셀렉트 올 이라는 걸 불러오면 리스트를 볼수 있다. 
			}else if(choice == 2) {
				insert(boardController, scan);
			}
		}
	}
	private static void insert(BoardController boardController, Scanner scan) {
		scan.nextLine(); //버퍼 메모리 비우기
		System.out.print("제목 :");
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle(scan.nextLine());
		System.out.print("내용:");
		boardVO.setContent(scan.nextLine());
		boardController.insert(boardVO);//실질적으로 데이터 베이스에 인서트를 실행하는 메소드는 보드컨트롤러 안에 있다 
		showList(boardController, scan);
	}
	
	private static void showList(BoardController boardController, Scanner scan) {
		ArrayList<BoardVO> list = boardController.selectAll();
		Collections.reverse(list);
		System.out.println("==================");
		System.out.println("글번호\t제목\t입력날짜");
		System.out.println("==================");
		if(list.size() == 0) {
			System.out.println("작성된 글이 없습니다");
		}else {
			for(BoardVO b : list) {
				System.out.println(b);
				//System.out.println(b.getId() + "\t"+b.getTitle()+"\t"+b.getWrittenDate());
			}
			System.out.println("글번호 선택 (0은 메인메뉴로)");
			System.out.print(">");
			int id = scan.nextInt();
			if(id != 0) {
				showOne(boardController, scan, id); //상세보기를 해줄수 있도록 연결해준다 
			}
		}
	}
	private static void showOne(BoardController boardController, Scanner scan, int id) {
		BoardVO boardVO = boardController.select(id);
		if(boardVO.getId() == 0) { // 잘못된 값이 입력이 되었기 때문에 해당객체는 기본생성자에서 생성된 값만 들어가있다
			System.out.println("잘못 입력하셨습니다.");
			showList(boardController, scan);
		}else {
			System.out.println("===========");
			System.out.println("제목"+boardVO.getTitle());
			System.out.println("===========");
			System.out.println("제목"+boardVO.getWrittenDate());
			System.out.println("제목"+boardVO.getUpdatedDate());
			System.out.println("===========");
			System.out.println(boardVO.getContent());
			System.out.println("===========");
			System.out.println("1.수정 2.삭제 3.리스트로");
			System.out.print(">");
			int choice = scan.nextInt();
			if(choice == 3 ) {
				showList(boardController, scan);
			}else if(choice == 1) {
				update(boardController, scan, id);
			}else if (choice == 2) {
				delect(boardController, id);
				showList(boardController,scan);
			}
		}
	}
	private static void delect(BoardController boardController,int id) {
		boardController.delect(id);
	}
	private static void update(BoardController boardController, Scanner scan,int id) {
		scan.nextLine();
		BoardVO boardVO = new BoardVO();
		System.out.println("제목 : ");
		boardVO.setTitle(scan.nextLine());
		System.out.println("내용 : ");
		boardVO.setContent(scan.nextLine());
		boardVO.setId(id); //where 이 없으면 모든게 바뀌어버림 
		boardController.update(boardVO); //글을 수정하는 내용을 가지고 있음 
		showOne(boardController, scan, id);
	}
}

















