import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
public class QueueTest {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		System.out.println("23�� : " + map.get(23));
		System.out.println("37�� : " + map.get(37));
		System.out.println("45�� : " + map.get(45));
		System.out.println();
		
		map.remove(37);
		
		System.out.println("37�� : "+ map.get(37));

	}

}

//		Deque<String> deq = new ArrayDeque<>();
//	
//		deq.offerFirst("1. Box");
//		deq.offerFirst("2. Toy");
//		deq.offerFirst("3. Robot");
//		
//		System.out.println(deq.pollFirst());
//		System.out.println(deq.pollFirst());
//		System.out.println(deq.pollFirst());
//		
//		
//		Queue<String> que = new LinkedList<>();
//		que.offer("Box");
//		que.offer("Toy");
//		que.offer("Robot");
//		
//		System.out.println("next : " + que.peek());
//		System.out.println("ù��° : " + que.poll());
//		System.out.println("�ι�° : " + que.poll());
//		System.out.println("next : " + que.peek());
//		System.out.println("������ : " +que.poll());