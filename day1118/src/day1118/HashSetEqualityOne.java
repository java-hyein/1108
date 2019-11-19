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
		return num % 3; // 7799가 같은 집합안에 들어가게 하기위해서 써줌 
	}
		public boolean equals(Object obj) {
			System.out.println("equals 호출 : " +obj);
		if(this.num == ((Num)obj).num)
			return true;
		else
			return false;
	}
		//return super.hashCode();//진짜 해시코드를 호출 하는가 안하는가를 확인하려고 
		//add 할때 마다 3개의 해쉬코드를 호출한다를 확인함. 
		// 366712642     1829164700	     2018699554  3개의 집합
	}
// --------------------내가 해본 코드
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
		System.out.println("인스턴스 수 : "+ set.size());
		

	}

}
