package Polymorphism;

import java.util.Objects;

public class ThisCons {
int id;
String firstName;
String lastName;
String Address;
public ThisCons(int id, String firstName, String lastName, String address) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	Address = address;
	System.out.println(id+" "+firstName+" "+lastName+" "+Address);
}
public static void main(String[] args) {
	

ThisCons tc =new ThisCons(0,"khan","Hassan","Sakinaka");
//System.out.println(tc);
System.out.println(tc.hashCode());

}
@Override
public int hashCode() {
	return 102;
}
@Override
public boolean equals(Object obj) {
	ThisCons t =(ThisCons) obj;
	if(t.id==this.id&&t.firstName==this.firstName&&t.lastName==this.lastName&&t.Address==this.Address) {
		return true;
	}
	else {
		return false;
	}
}

}
