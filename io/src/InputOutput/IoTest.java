package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoTest {
	public static void main(String[] args) {
		FileInputStream fi = null;

		try {
			fi = new FileInputStream("E:\\Eclipse-java\\Oops\\src\\Abstraction\\Inter1.java");

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
		}
		int i;
		try {

			while ((i = fi.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		} finally {
			try {
				fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
			System.out.println("chalte rah");

		}

	}
}