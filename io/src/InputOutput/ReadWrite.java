package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadWrite {
	public static void main(String[] args) throws Exception {
		FileReader r = null;
		FileWriter w = null;
		r = new FileReader("C:\\Users\\Tyao\\Desktop\\New folder\\Sapna.txt");
		w = new FileWriter("C:\\Users\\Tyao\\Desktop\\New folder\\rachna.txt");

		int a;
		while ((a = r.read()) != -1) {
			w.write(a);
		}
		System.out.println("hey babes");
		//r.close();
		//w.close();
	}
}
