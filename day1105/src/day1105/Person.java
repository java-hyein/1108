package day1105;

class Person {
	private int regiNum;// �ֹε�� ��ȣ
	private int passNum;// ���ǹ�ȣ

	// �� ���� ������ - �����ִ»�� ���»�� ������ �ΰ� �̱� ������

	Person(int rnum, int pnum) { // ���� �ִ� ���
		regiNum = rnum;
		passNum = pnum;
	}

	Person(int rnum) {// ���� ���� ���
//		regiNum = rnum;
//		passNum = 0;
		this(rnum,0);
	}

	void showPersonalInfo() {

	}

	public static void main(String[] args) {
		// ���� �ִ� ����� ������ ���� �ν��Ͻ� ����
		Person jung = new Person(335577, 112233);
		// ���� ���� ����� ������ ���� �ν��Ͻ� ����
		Person hong = new Person(775544);

		jung.showPersonalInfo();
		hong.showPersonalInfo();
	}
}
