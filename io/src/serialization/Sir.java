package serialization;

public class Sir extends Student {
double salary;
String clg;
String state;
public Sir(float id, String firstName, String lastName, String city, double salary, String clg, String state) {
	super(id, firstName, lastName, city);
	this.salary = salary;
	this.clg = clg;
	this.state = state;
}
}
