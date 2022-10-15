package InputOutput;

import java.util.StringTokenizer;

public class StringTokenizerDemo1 {
public static void main(String[] args) {
	String s="Nihal,Bacchi,Kidhr,Macha,Raha,hai is is kiss";
	System.out.println(s.length());
	StringTokenizer st =new StringTokenizer(s,"is",false);
	System.out.println(st.countTokens());
	
	while(st.hasMoreTokens()){ 
		System.out.println(st.nextToken());
		
	}
}
}
