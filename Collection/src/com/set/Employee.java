package com.set;

import java.util.Objects;

public class Employee {
	@Override
	public int hashCode() {
		return 101;
	}

	@Override
	public boolean equals(Object obj) {
		Employee s =(Employee) obj;
		if(s.getId()==this.id&&s.getFirstName()==this.FirstName&&s.getLastName()==this.LastName&&s.getCity()==this.city) {
			return true;
		}
		else {
			return false;
		}
		
	}

	private int id;
	private String FirstName;
	private String LastName;
	private String city;
	private float salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
