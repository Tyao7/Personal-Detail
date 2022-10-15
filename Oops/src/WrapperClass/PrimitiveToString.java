package WrapperClass;

public class PrimitiveToString {
public static void main(String[] args) {
	int a=100;
	
	Long l=new Long(a);
	System.out.println(l);
	int b=l.intValue();
	System.out.println(b);
	Integer vf = Integer.valueOf(b);
	String s = Integer.toString(vf);
	int d=vf.parseInt(s);
	System.out.println(d);
	
	
	
}
}
