class Apple {
	public String toString() {
		return "I'm an apple";
	}
}

class Orange {
	public String toString() {
		return "I'm an Orange";
	}
}

public class Box<T> {
//	// ���ʸ� ����---- 
//	private Object ob;
//
//	public void set(Object o) {
//		ob = o;
//	}
//
//	public Object get() {
//		return ob;
//	}
	private T ob;
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

