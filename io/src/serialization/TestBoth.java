package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestBoth {
public static void main(String[] args) {
	FileOutputStream fi;
	ObjectOutputStream os;
	try {
		fi =new FileOutputStream("C:\\Users\\Tyao\\Desktop\\New folder\\New folder\\junaid.txt");
		os =new ObjectOutputStream(fi);
		Sir s =new Sir(7,"khan","hassan","mumbai",17000.0,"bagarka", "maharashtra");
		os.writeObject(s);
		System.out.println(" file copied");
		fi.close();
		os.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//................#################DESERIALIZATION$$$$$$$$$$$$$$$$>>>>>>>>>>>>>>>...............
	FileInputStream fs;
	ObjectInputStream o;
	try {
		fs =new FileInputStream("C:\\\\Users\\\\Tyao\\\\Desktop\\\\New folder\\\\New folder\\\\junaid.txt");
		o =new ObjectInputStream(fs);
	 Object oj=o.readObject();
	 Sir s =(Sir) oj;
	 System.out.println(s.id);;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	 System.out.println(s.FirstName);;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	 System.out.println(s.LastName);;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	 System.out.println(s.city);;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	 System.out.println(s.salary);;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	 System.out.println(s.clg);;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	 System.out.println(s.state);;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	 System.out.println(s);;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	 System.out.println(s.hashCode());;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	 System.out.println(s.toString());;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	 
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

}



