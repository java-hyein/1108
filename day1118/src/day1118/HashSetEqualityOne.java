package day1118;

import java.util.HashSet;

class Num {
	private int num;
	
	public Num(int n) {
		num = n;
	}
	public String toString() {
		return String.valueOf(num);
	}
	
	public int hashCode() {
		System.out.println(super.hashCode());
		return num % 3; // 7799�� ���� ���վȿ� ���� �ϱ����ؼ� ���� 
	}
		public boolean equals(Object obj) {
			System.out.println("equals ȣ�� : " +obj);
		if(this.num == ((Num)obj).num)
			return true;
		else
			return false;
	}
		//return super.hashCode();//��¥ �ؽ��ڵ带 ȣ�� �ϴ°� ���ϴ°��� Ȯ���Ϸ��� 
		//add �Ҷ� ���� 3���� �ؽ��ڵ带 ȣ���Ѵٸ� Ȯ����. 
		// 366712642     1829164700	     2018699554  3���� ����
	}
// --------------------���� �غ� �ڵ�
//	public int hashCode() {
//		return num;
//	}
//	public boolean equals(Object obj) {
//		if(num == ((Num)obj).num)
//			return true;
//		else
//			return false;
//	}


public class HashSetEqualityOne {

	public static void main(String[] args) {
		
		HashSet<Num> set = new HashSet<>();
		set.add(new Num(7799));
		set.add(new Num(9955));
		set.add(new Num(7799));
		System.out.println("�ν��Ͻ� �� : "+ set.size());
		

	}

}
