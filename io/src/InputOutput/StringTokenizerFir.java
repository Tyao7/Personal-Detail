package InputOutput;

import java.util.StringTokenizer;

public class StringTokenizerFir {
public static void main(String[] args) {
	String s ="kiss is miss this is his is this kiss miss ";
	StringTokenizer st =new StringTokenizer(s,"is");
	StringTokenizer sr =new StringTokenizer(s ,"miss");
	System.out.println(st.hasMoreTokens());;
	System.out.println(st.countTokens());
	System.out.println(st.nextToken());
	for(int i=0;i<=10;i++) {
		//System.out.println(st.nextToken());
		System.out.println(st.nextElement());
		System.out.println();
	}
}
}
