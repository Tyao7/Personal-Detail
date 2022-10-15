package WrapperClass;

public class AllinOne {
	
	public static void main(String[] args) {
		int x =100;
		String s = Integer.toString(x);
		Integer b=new Integer(s);
		int z=b.intValue();
		Integer valueOf = Integer.valueOf(z);
		Integer c=new Integer(z);
		String string = c.toString();
		int parseInt = Integer.parseInt(string);
		System.out.println(x +string);
	}

	
	

	


}
