package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStreamDemo {
public static void main(String[] args) {
	FileInputStream fi =null;
	try {
		fi=new FileInputStream("D:\\KGF.mp4");
		System.out.println("File Copied");
		int i;
		while((i=fi.read())!=-1){
		System.out.print((char)i);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
