package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutTest {
	public static void main(String[] args) {
		FileInputStream i = null;
		FileOutputStream o = null;
		try {
			i = new FileInputStream("C:\\Users\\Tyao\\Desktop\\New folder\\Cr7.jpg");
			o = new FileOutputStream("C:\\Users\\Tyao\\Desktop\\New folder\\Ronaldo.jpg");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int a;
		try {
			while((a=i.read())!=-1) {
				o.write(a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				i.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				o.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("kya bolte bhai");
		/*
		 * int a; try { a=i.read(); System.out.println((char)a+" "+a); } catch
		 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}
}
