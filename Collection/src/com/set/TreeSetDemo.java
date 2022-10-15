package com.set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet<Object> to =new TreeSet<>();
	//to.add("tyao");
	//to.add("tyao");
	to.add(10);
	to.add(50);
	to.add(20);
	to.add(30);
	for(Object s:to) {
		System.out.println(s);
	}
	System.out.println("__________Next__________ ");
	Iterator<Object> o = to.iterator();
	while(o.hasNext()) {
		System.out.println(o.next());
	}
	System.out.println("___________Next____________ ");
	NavigableSet<Object> set = to.descendingSet();
		for(Object e:set) {
			System.out.println(e);
		}
		System.out.println("Ceiling"+ to.ceiling(60));
		System.out.println("Floor"+to.floor(100));
	
	

}
}
