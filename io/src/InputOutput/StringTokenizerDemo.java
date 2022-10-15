package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
	
	String a="is";
	public static void main(String[] args) {
		String s = "this is is kiss is this is";
		//String aa="is";

		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.countTokens());
		
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		

//		StringTokenizer st1 = new StringTokenizer(s,",");

		// st = new StringTokenizer(s);
		/*
		 * while {
		 * 
		 * }
		 */
		// (st.hasMoreTokens());
		/* System.out.println(st.nextToken()); */
	
	
		
	}
}
