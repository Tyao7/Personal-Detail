package com.List;

import java.util.ArrayList;

public class ArrayListToArray {
public static void main(String[] args) {
	String [] a= {"Tyao","Hassan","Ajaz","Tanzeel","Kashif"};
	ArrayList<String> i =new ArrayList<>();
for(String a1 :a) {
	i.add(a1);
}
System.out.println(i);

String [] s=new String[i.size()];
for(int j=0;j<s.length;j++) {
	s[j]=i.get(j);
	
	
}
for(String c:s) {
	System.out.println(c);
}
}

}
