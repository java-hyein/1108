public class SingleLinkedList implements List {
	class Node {
		private int data;
		private Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;

	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
		this.head = null;
		this.tail = null;
	}

	@Override
	public void addHead(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data, this.head);
		if (this.head == null)
			this.tail = newNode;

		this.head = newNode;
	}

	@Override
	public void addTail(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data, null);
		if (this.head == null)
			this.head = newNode;
		else {
			this.tail.next = newNode;
		}
		this.tail = newNode;
	}

	@Override
	public void removeHead() {
		// TODO Auto-generated method stub
		if (this.head == null)
			return;

		this.head = this.head.next;
		if (this.head == null)
			this.tail = null;
	}

	@Override
	public void removeTail() {
		// TODO Auto-generated method stub
		if (this.head == null)
			return;

		Node prev = this.head;
		while (prev.next != this.tail)
			prev = prev.next;

		prev.next = null;
		this.tail = prev;
	}
	public int size() {
		int count = 0;
		Node next = this.head;
		while(next !=null) {
			next = next.next;
			count++;
		}
		return count;
	}

	@Override
	public void insertAt(int index, int data) {
		// TODO Auto-generated method stub
		int count = size();
		if(index < 0 || index > count) {
			throw new IndexOutOfBoundsException();
		}
		
		Node next = this.head;
		Node prev = null;
		while (index > 0) {
			prev = next;
			next = prev.next;
			index --;
		}//들어갈 위치를 찾는다
		
		Node newNode = new Node(data, next);
		if (prev == null) { //머리에 넣는디
			//if count is 0,
			if(next == null) {//노드가 비어있다
				this.tail = newNode;
			}
				this.head = newNode;//새로운 노드를 가르켜야한다.
		} else {
			prev.next = newNode;
			if (next == null) {
				this.tail = newNode;
			}
		}
	}

	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub
		int count = size();
		if(count == 0 || index < 0 || index >= count) {
			throw new IndexOutOfBoundsException();
		}
		Node next = this.head;
		Node prev = null;
		while (index > 0) {
			prev = next;
			next = next.next;
			index --;	
	}
		if (prev == null) {
			if(next.next == null) {
				this.tail = null;
			}
			this.head = next.next;
		}else {
			if (next.next == null) {
				this.tail = prev;
			}
			prev.next = next.next;
		}
		
	}

	@Override
	public int getAt(int index) {
		// TODO Auto-generated method stub
		int count = size();
		if(count == 0 || index < 0 || index >= count) {
			throw new IndexOutOfBoundsException();
		}
		Node next = this.head;
		while (index > 0) {
			next = next.next;
			index --;
		}
		return next.data;
	}

}