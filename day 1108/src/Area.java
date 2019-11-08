
public class Area {

	public static void main(String[] args) {
		IArea TestArea = new rectangle(3.0, 2.0);
		System.out.println(TestArea.area());

		TestArea = new triangle(3.0, 2.0);
		System.out.println(TestArea.area());

	}

}
