package day1121;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SBox implements java.io.Serializable{
	String s;
	public SBox(String s) {
		this.s =s;
	}
	public String get() {
		return s;
	}
	
	public static void main(String[] args) {
		SBox box1 = new SBox("Robot");
		SBox box2 = new SBox("Strawberry");
		
		try(ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("Object.bin"))){
			oo.writeObject(box1);
			oo.writeObject(box2);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
