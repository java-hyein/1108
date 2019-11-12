
public class PersonTest {
public static void main(String[] args) {
	Person p1= new Person("yoon");
	Person p2 = new Person("Park");
	p1= null;
	p2= null;
	System.gc();
	System.runFinalization();
	System.out.println("end of program");
}	
}
