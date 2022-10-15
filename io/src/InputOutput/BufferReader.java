package InputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferReader {
	public static void main(String[] args) {
		
		  \u000d FileReader fr =null;
		  BufferedReader br =null; 
		  try { fr =new
		  FileReader("E:\\Eclipse-java\\LogicalPrograme\\src\\Logic\\KajuKatli.java");
		  
		  }
		  catch (FileNotFoundException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); } 
		  br =new BufferedReader(fr);
		  String line;
		  try {
		  while((line=br.readLine())!=null)
		  { StringTokenizer st =new
		  StringTokenizer(line); 
		  while(st.hasMoreTokens()) {;
		  System.out.println(st.nextToken());
		  }
		  } 
		  } 
		  catch (IOException e) { 
			  // TODO
		  Auto-generated 
		  catch block e.printStackTrace(); } finally { try { fr.close();
		  br.close(); } catch (IOException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); } }
		  System.out.println("\n -------Khatam \t tata by by------- ");
		  System.out.println("lol");
		 
		// \u000d
		System.out.println("im tanzeel");
		System.out.println("kashif");
	}
}
