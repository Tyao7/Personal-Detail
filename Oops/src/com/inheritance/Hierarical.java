package com.inheritance;

public class Hierarical {
	void m1() {
		System.out.println("in hierarical");
	}
}

class Two2 extends Hierarical {
	void m1() {
		System.out.println("in two");
	}
}

class Three extends Hierarical {
	void m1() {
		System.out.println("in three");
	}

	public static void main(String[] args) {
		Three t = new Three();
		t.m1();
	}
}
