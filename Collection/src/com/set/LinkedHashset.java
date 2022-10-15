package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {
public static void main(String[] args) {
	LinkedHashSet<Integer> li =new LinkedHashSet<>();
	li.add(100);
	li.add(300);
	li.add(200);
	li.add(500);
	li.add(600);
	li.add(100);
	li.add(null);
	li.add(null);
	System.out.println(li);
	Iterator<Integer> ir = li.iterator();
	while(ir.hasNext()) {
		System.out.println(ir.next());
		//System.out.println(ir);
		
	}
	if(System.out.printf("Hello world")==null) {
		
	}
}
}
