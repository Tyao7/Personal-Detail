package Polymorphism;

public class OverRidingTest extends OverRiding {

	int tanzeel(int a, int b) {
		System.out.println("in 2nd tanzeeel");
		return a * b;
	}

	float kashif(float x, float z) {
		System.out.println("in 2nd kashif");
		return x + z;

	}

	public static void main(String[] args) {
		OverRiding t = new OverRidingTest();
		System.out.println(t.tanzeel(10, 10));
		System.out.println(t.kashif(10, 10));
		System.out.println(OverRiding.kashif(1.1f, 2.2f, 3.3f));
	}
}
