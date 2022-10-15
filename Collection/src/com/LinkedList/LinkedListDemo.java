package com.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
public static void main(String[] args) {
	Object[] ob=new Object[100];
	for(int i=0;i<ob.length;i++) {
		ob[i] =new Object();
		//System.out.println(i);
	}
	//List<Object> os =new ArrayList<>();
	List<Object> os =new LinkedList<>();
	os.add(1);
	os.add(2);
	os.add(3);
	os.add(4);
	os.add(5);
	os.add(6);
	System.out.println(os);
	float start = System.currentTimeMillis();
	for(Object obj :ob) {
		os.add(ob);
	}
	long end = System.currentTimeMillis();
	System.out.println("Time Taken:"+(end - start));
	//System.out.println(ob.equals(os));
	
}
}
