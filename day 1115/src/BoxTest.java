class Box1<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class EmptyBoxFactory {
	public static <T> Box1<T> makeBox() {
		Box1<T> box = new Box1<T>();
		return box;
	}
}

public class BoxTest {

	public static void main(String[] args) {
		Box1<Integer> iBox = EmptyBoxFactory.makeBox();
		iBox.set(25);
		System.out.println(iBox.get());
	}

}
