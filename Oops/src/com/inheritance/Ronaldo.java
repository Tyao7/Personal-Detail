package com.inheritance;

public class Ronaldo extends Cr7 {
	void m1() {
		System.out.println("im in love");
	}
public static void main(String[] args) {
	Cr7 c =new Ronaldo();
	c.m1();
	//c.m2();
	/*
	 * System.out.println(c.hashCode()); System.out.println(c);
	 */
	
}
}
