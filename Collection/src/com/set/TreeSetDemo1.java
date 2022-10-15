package com.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		TreeSet<Character> tc = new TreeSet<>();
		tc.add('p');
		tc.add('n');
		tc.add('d');
		tc.add('f');
		tc.add('t');
		tc.add('a');
		System.out.println(tc);
		System.out.println(tc.ceiling('e'));
		System.out.println(tc.floor('b'));
		System.out.println(tc.subSet('a', 'f'));
		System.out.println(tc.tailSet('f'));
		System.out.println(tc.headSet('f'));

		TreeSet<String> t = new TreeSet<>();
		t.add("tyao");
		t.add(";");
		t.add("ejaz");
		t.add("tanzeel");
		t.add("zaid");
		t.add("zaid");
		System.out.println(t);
		
		/*
		 * System.out.println(t.clone()); System.out.println(t.comparator());
		 */

	}
}
