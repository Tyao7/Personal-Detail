package serialization;

import java.io.Serializable;

public class Student implements Serializable {
float id;
String FirstName;
String LastName;
String city;
public Student(float id, String firstName, String lastName, String city) {
	super();
	this.id = id;
	FirstName = firstName;
	LastName = lastName;
	this.city = city;
}

}
