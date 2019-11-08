
public interface Istack {
	void push(Object data);
	void pop();
	Object top();
	
	boolean isEmpty();
	boolean isFull();

}
