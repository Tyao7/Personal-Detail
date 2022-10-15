package InputOutput;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoRead {
	public static void main(String[] args)  {
		FileInputStream tyao = null;
		//BufferedImage image =null;
		try {
			//tyao = new FileInputStream(new File("C:/Users/Tyao/Pictures/Camera Roll\\tanzeel.jpg"));
			//tyao = new FileInputStream(new File("C:\\Users\\Tyao\\Desktop\\New folder\\myfile.txt"));
			//tyao = new FileInputStream(new File("C:\\Users\\Tyao\\Desktop\\New folder\\Cr7.jpg"));
			//tyao = new FileInputStream(new File("C:\\Users\\Tyao\\Desktop\\New folder\\tyao.txt"));
			tyao = new FileInputStream(new File("C:\\Users\\Tyao\\Desktop\\New folder\\Sapna.txt"));
			
			
			//image =new BufferedImage("C:/Users/Tyao/Pictures/Camera Roll\tanzeel");
			System.out.println("hi");
			int i;
			while ((i = tyao.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException t) {
			t.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	finally {
		try {
			tyao.close();
		}
		catch(IOException h) {
			h.printStackTrace();
		}
		System.out.println(" helloo bacchi");
	}
	}

}
