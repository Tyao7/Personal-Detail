package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
transient int id;
String name;
String petName;
String address;
String city;
transient String state;
public Employee(int id, String name, String petName, String address, String city, String state) {
	super();
	this.id = id;
	this.name = name;
	this.petName = petName;
	this.address = address;
	this.city = city;
	this.state = state;
}
}
