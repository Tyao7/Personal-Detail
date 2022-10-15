package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
public static void main(String[] args) {
	FileOutputStream fi;
	ObjectOutputStream oi;
	try {
		fi=new FileOutputStream("E:\\Eclipse-java\\io\\Nihal.txt");
		oi =new ObjectOutputStream(fi);
		SerializationClass  sc =new SerializationClass(10,"nihal",10000.0,"Sakinaka");
		oi.writeObject(sc);
		System.out.println("aya aya aya aya aya aya");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
}
}
