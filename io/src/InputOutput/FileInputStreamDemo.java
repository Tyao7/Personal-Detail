package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(new File("C:/Users/Tyao/Desktop/New folder/myfile.txt"));
			System.out.println("File Opened");
			int i;
			try {
				while ((i = fis.read()) != -1) {
					System.out.print((char) i);

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//System.out.println("file Closed");
		}

	}
}
