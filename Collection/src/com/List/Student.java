package com.List;

public class Student {
int id;
String name;
String petName;
String add;
public Student(int id, String name, String petName, String add) {
	super();
	this.id = id;
	this.name = name;
	this.petName = petName;
	this.add = add;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", petName=" + petName + ", add=" + add + "]";
}

}
