package WrapperClass;

public class ObjectAndString {
	public static void main(String[] args) {
		long x = 1000l;
		Long v = Long.valueOf(x);
		System.out.println(v);

		String s = v.toString();
		System.out.println(s + v);
		int p = Integer.parseInt(s);
		System.out.println(s+ v + p);
		Integer i = Integer.valueOf(p);
		
		

	}
}
