package com.inheritance;

public class TestHybrid implements Hybrid3 , Hybrid2 {

	@Override
	public void show() {
		System.out.println("in show");
		
	}

	@Override
	public void display() {
		System.out.println("in display");
		
	}

	@Override
	public void cr() {
		System.out.println("in cr");
		
	}

	@Override
	public void di() {
		System.out.println("in di");
		
	}

	/*
	 * @Override public void show() { System.out.println("in ow");
	 * 
	 * }
	 * 
	 * @Override public void display() { System.out.println("in lay");
	 * 
	 * }
	 */

}
