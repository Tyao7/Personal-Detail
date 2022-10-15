package Polymorphism;

public class Overloading {
	void poly(float f) {
		System.out.println(f);
	}

	void poly(String s) {
		System.out.println(s);

	}

	void poly(int i) {
		System.out.println(i);

	}
	void poly(double d) {
		System.out.println(d);

	}
static	void poly(boolean b) {
		System.out.println(b);

	}
	

	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.poly(10.0f);
		o.poly(10);
		o.poly("Tanzeel");
		o.poly(11.0d);
		poly(false);
		System.out.println(o);
		System.out.println(o.hashCode());
	}
}
