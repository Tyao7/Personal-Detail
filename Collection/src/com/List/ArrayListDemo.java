package com.List;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
for(int i=0;i<=100;i=i+10) {
	a1.add(i);
	//System.out.println(a1.add(i));
}
System.out.println("List:" +a1);
a1.add(3, 300);
System.out.println("AddList:"+a1);
a1.add(7, 500);
System.out.println("AddList:"+a1);
a1.set(3, 1000000);
System.out.println("List After Replacement:"+a1);
ArrayList< Integer> a2 =new ArrayList<>();
a2.add(1000);
a2.add(20000);
a2.add(5000);
System.out.println("a2:"+a2);
a1.addAll(5, a2);
System.out.println("a1 :"+a2);
if(a1.contains(55)) {
	System.out.println("List has the value");
}
else if(a2.contains(200004)) {
	System.out.println("hai");
}
else {
	System.out.println("Both does not have the value");
}
for(int i=0;i<a1.size();i++) {
	System.out.println(a1.get(i));
}
a1.remove(7);
System.out.println("final List:"+a1);


	}
}
