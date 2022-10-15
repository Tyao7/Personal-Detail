package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleH {
public static void main(String[] args) {
	FileInputStream f =null;
	FileOutputStream fi =null;
	try {
		f =new FileInputStream("C:\\Users\\Tyao\\Desktop\\New folder\\Apna.txt");
		fi =new FileOutputStream("C:\\Users\\Tyao\\Desktop\\New folder\\haina.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int i;
	try {
		while((i=f.read())!=-1) {
			fi.write(i);
		}
		System.out.println("File Copied");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			f.close();
			fi.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
}
