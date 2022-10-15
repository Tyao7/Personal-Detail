package com.List;

import java.util.ArrayList;

public class ArrayListD {
public static void main(String[] args) {
	ArrayList<String> s1 =new ArrayList<>();
	s1.add("Junaid");
	s1.add("tyao");
	s1.add("tanzeel");
	s1.add("zaid bhai");
	System.out.println("String List:"+s1);
	System.out.println(s1.hashCode());;
	//System.out.println(s1.equals(s1));
	/*
	 * ArrayList<Character> c =new ArrayList<>(); c.add('t'); c.add('y');
	 * c.add('a'); c.add('o'); System.out.println("Character List" +c);
	 */
	ArrayList<String> s =new ArrayList<>();
	s.add("Junaid");
	s.add("tyao");
	s.add("Cr7");
	s.add("Ronaldo");
	System.out.println(s.equals(s1));
	s.addAll(2, s1);
	System.out.println(s);
	s.add(1, "Kashif");
	System.out.println("Add Extra:"+s);
	s.set(3, "Hassan");
	System.out.println(s);
	if(s.contains("Aziz")) {
		System.out.println("hai");
	}
	else if(s1.contains("s")) {
		System.out.println("Gaon ja");
	}
	else{
		System.out.println("Nahi hai");
	}
	
}
}
