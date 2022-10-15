package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {
public static void main(String[] args) {
	FileInputStream fis =null;
	FileOutputStream fo  =null;
	try {
		fis=new FileInputStream("C:\\Users\\Tyao\\Desktop\\New folder\\Sapna.txt");
		fo =new FileOutputStream("C:\\Users\\Tyao\\Desktop\\New folder\\Apna.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int a;
	try {
		while((a=fis.read())!=-1) {
			fo.write(a);
			
		}
		System.out.println(" file copied");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			fo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println(" hiiiii");

		
	}

}

