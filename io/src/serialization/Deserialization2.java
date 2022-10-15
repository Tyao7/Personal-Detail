package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization2 {
public static void main(String[] args) throws Exception {
	FileInputStream f = new FileInputStream("C:\\Users\\Tyao\\Desktop\\New folder\\New folder\\Tyao.txt");
	ObjectInputStream om =new ObjectInputStream(f);
	Object obj=om.readObject();	
	Employee ee =(Employee) obj;
	System.out.println(ee.id);
	System.out.println(ee.name);
	System.out.println(ee.petName);
	System.out.println(ee.address);
	System.out.println(ee.city);
	System.out.println(ee.state);
	//System.out.println();
}
}
