package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {
	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("E:\\\\Eclipse-java\\\\io\\\\Nihal.txt");
		ObjectInputStream os = new ObjectInputStream(fi);
		Object obj = os.readObject();
		SerializationClass si = (SerializationClass) obj;
		System.out.println(si.id);
		System.out.println(si.name);
		System.out.println(si.salary);
		System.out.println(si.Address);
	}
}
























