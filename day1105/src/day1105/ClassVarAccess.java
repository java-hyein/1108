package day1105;

class AccessWay {
	static int num = 0;

	AccessWay() {
incrCnt();
	}

	void incrCnt() {
		num++; // Ŭ���� ���ο��� �̸��� ���� ����
	}
}
class AAA{
	int num = 0;
	 void addNum(int n) {
		num += n;
	}
}

public class ClassVarAccess {

	public static void main(String[] args) {
		AccessWay way = new AccessWay();
		way.num++; // �ܺο��� �ν��Ͻ��� �̸��� ���� ����
		AccessWay.num++; // �ܺο��� Ŭ������ �̸��� ���� ����
		System.out.println("num = " + AccessWay.num);

	}

}
