package com.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayLinkedDemo {
	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<>();
		ls.add(null);
		ls.add("Tyao");
		ls.add(null);
		ls.add("Tyao");
		ls.add(null);
		System.out.println(ls);
		// ls.remove();
		// System.out.println(ls);
		ls.addFirst("junaid");
		ls.add("Tyao");
		System.out.println(ls);
		ls.addLast("Tanzeel");
		System.out.println(ls);
		System.out.println(ls.lastIndexOf("Tyao"));
		System.out.println(ls.indexOf("Tyao"));
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		System.out.println(ls.get(4));
		System.out.println(ls.element());
		System.out.println(ls.clone());
		ls.clear();
		;
		System.out.println(ls);

		ArrayList<Integer> ai = new ArrayList<>();
		ai.add(70);
		ai.add(90);
		ai.add(50);
		ai.add(60);
		ai.add(30);
		Collections.sort(ai);
		System.out.println(ai);
		for (Integer i : ai) {
			System.out.print(" " + i);
		}
		Collections.reverse(ai);
		System.out.println(ai);

	}
}
