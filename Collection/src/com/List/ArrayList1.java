package com.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();

		a.add(new Integer(10));
		a.add(20);
		a.add(30);
		System.out.println(a);
		Iterator<Integer> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		/*
		 * a.set(2, 22); System.out.println(a); ArrayList<Integer> s =new ArrayList<>();
		 * s.add(500); s.add(1000); s.add(400); s.addAll(3, a); System.out.println(a);
		 */
	}
}
