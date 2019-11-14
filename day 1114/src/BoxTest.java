
public class BoxTest {

	public static void main(String[] args) {
		
		// 제너릭 이전----
//		Box aBox = new Box(); // 상자 생성
//		Box oBox = new Box(); // 상자 생성
//
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();

		aBox.set(new Apple()); // 상자에 사과를 담는다
		oBox.set(new Orange()); // 상자에 오랜지를 담는다
		
		// 제너릭 이전----
//		Apple ap = (Apple) aBox.get(); // 상자에서 사과를 꺼낸다
//		Orange og = (Orange) oBox.get(); // 상자에서 오렌지를 꺼낸다

		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}

}
