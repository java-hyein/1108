
public class DBoxTest {

	public static void main(String[] args) {
//		DBox<String, Integer> box = new DBox<String, Integer>();
//		box.set("Apple", 25); // 25 사용 가능한 이유 - 오토 박싱
//		System.out.println(box);
		
		Box<String> sBox = new Box<>();
		sBox.set("I'm so Happy");
		
		Box<Box<String>> wBox = new Box<>();
		wBox.set(sBox);
		Box<Box<Box<String>>> zBox = new Box<>();
		zBox.set(wBox);
		

		
	}

}
