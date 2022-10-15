package com.inheritance;

public class MultiLevelInheritance {
void m1() {
	System.out.println("hi");
}
}
 class Multi2 extends MultiLevelInheritance{
	void m1() {
		System.out.println("in multi 2");
	}
}
 class Multi3 extends Multi2{
		/*
		 * void m1() { System.out.println("in multi 3"); }
		 */
	public static void main(String[] args) {
		Multi3 m =new Multi3();
		m.m1();
	}
 }
