package java_thread_sync;

class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
	
	// 동기화 - 한개 끝나면 한개씩 실행된다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;

		try {
			Thread.sleep(2000); // 지금 돌아가는 쓰레드를 2초동안 정지시키고, 다른 쓰레드가 돌아감
		} catch (InterruptedException e) {}

		System.out.println(Thread.currentThread().getName() + ":" + this.memory); // 쓰레드 이름 : 현재 저장된 메모리
	}
}

//User1

class User1 extends Thread{
	private Calculator calculator;
	
	// Calculator 주입 받음 
	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser1");
		this.calculator = calculator;
	}
	@Override
	public void run() { //메인 
		calculator.setMemory(100); // 공유 객체에 100 저장
	}
	
}

//User2

class User2 extends Thread{
	private Calculator calculator;
	
	// Calculator 주입 받음 
	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser2"); //setName 은 Thread에서 받아온다.super.setName(); 상관없음!
		this.calculator = calculator;
	}
	@Override
	public void run() { //메인 
		calculator.setMemory(50); // 공유 객체에 50 저장
	}
	
}

public class SyncTest {
	public static void main(String[] args) {
	
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
	}

}
