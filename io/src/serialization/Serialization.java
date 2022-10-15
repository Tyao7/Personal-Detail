package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
public static void main(String[] args) {
	FileOutputStream fi ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	ObjectOutputStream os;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	try {
		fi =new FileOutputStream("C:\\Users\\Tyao\\Desktop\\New folder\\New folder\\Tyao.txt");
		os =new ObjectOutputStream(fi);
		Employee e =new Employee(10,"Hassan","Tyao","Sakinaka","Mumbai","Maharashtra");
		os.writeObject(e);
		System.out.println("Kya Bolte bhai");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
