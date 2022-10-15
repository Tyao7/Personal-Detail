package serialization;

import java.io.Serializable;

public class SerializationClass implements Serializable {
int id;
String name;
double salary;
transient String Address;
public SerializationClass(int id, String name, double salary, String address) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	Address = address;
}
}
