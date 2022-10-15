package com.inheritance;

public interface Multiple {
	/*
	 * static void m3() { System.out.println("hey babes"); }
	 */
	void m1();

	void m2();
}
interface Multiple2 extends Multiple{
	void m1();
	void m2();
}

class Abc implements Multiple2 {

	@Override
	public void m1() {
		System.out.println("in m1");

	}

	@Override
	public void m2() {
		System.out.println("in m2");

	}
	public static void main(String[] args) {
		Multiple2 a =new Abc();
	a.m1();
	
	
	}

}

