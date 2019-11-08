package day1105;

class Person {
	private int regiNum;// 주민등록 번호
	private int passNum;// 여권번호

	// 두 개의 생성자 - 여권있는사람 없는사람 조건이 두개 이기 때문에

	Person(int rnum, int pnum) { // 여권 있는 사람
		regiNum = rnum;
		passNum = pnum;
	}

	Person(int rnum) {// 여권 없는 사람
//		regiNum = rnum;
//		passNum = 0;
		this(rnum,0);
	}

	void showPersonalInfo() {

	}

	public static void main(String[] args) {
		// 여권 있는 사람의 정보를 담은 인스턴스 생성
		Person jung = new Person(335577, 112233);
		// 여권 없는 사람의 정보를 담은 인스턴스 생성
		Person hong = new Person(775544);

		jung.showPersonalInfo();
		hong.showPersonalInfo();
	}
}
