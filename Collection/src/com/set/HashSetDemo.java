package com.set;

import java.util.HashSet;
import java.util.Random;

public class HashSetDemo {
	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> hi = new HashSet<>();
		for (int i = 0; i <= 10; i++) {
			int a = r.nextInt(5);
			hi.add(a);
		System.out.println(a);
		}
		HashSet<Integer> is =new HashSet<>(hi);
		System.out.println(is);

		/*
		 * System.out.println(); System.out.println(hi);
		 */

	}
}
