//Generic

public interface GenericStack <T extends Object> {
	void push(T data);
	void pop();
	T top();
	
	boolean isEmpty();
	boolean isFull();

}

//public ArrayStack(int size) {
//	this.size = size;
//	this.stack = new Object[size];
//}