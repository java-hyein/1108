
public class GArray<T> {
	
	private T[] arr;

	public void setArr(T[] arr) {
		this.arr = arr;
	}

	public void printArr() {
		for (T str : arr) {
			System.out.println(str);
		}
	}
}
