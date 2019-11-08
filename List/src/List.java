
public interface List {
	void addHead(int data);
	void addTail(int data);
	
	void removeHead();
	void removeTail();
	
	void insertAt(int index, int data);
	void removeAt(int index);
	
	int get(int index);

}
