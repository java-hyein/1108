package day1120;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.omg.CORBA.DataInputStream;

public class BufferedDataOutoutStream {

	public static void main(String[] args) {
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream("data.dat"))){
			out.writeInt(370);
			out.writeDouble(3.14);

		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
