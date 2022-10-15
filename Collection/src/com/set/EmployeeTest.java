package com.set;

import java.util.HashSet;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(07);
		System.out.println(e.getId());
		e.setFirstName("Mohammed");
		e.setLastName("Hassan");
		e.setCity("Mumbai");
		
		
		Employee e1 = new Employee();
		e1.setId(90);
		System.out.println(e1.getId());
		e1.setFirstName("Mohammed");
		e1.setLastName("Hassan");
		e1.setCity("Maharashtra");
		HashSet<Employee> ho =new HashSet<>();
		ho.add(e1);
		ho.add(e);
		/*
		 * System.out.println(e1); System.out.println(e);
		 * 
		 */
		System.out.println(e.equals(e1));
		
		
	}
}
