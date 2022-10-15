package com.List;

import java.util.ArrayList;

public class StudentDemo {
public static void main(String[] args) {
	ArrayList<Student> s =new ArrayList<>();
	//Student ss=new Student(30, "tanj", "khan", "vikroli");
	s.add(new Student(07,"Mohammmed","Hassan", "Sakinaka"));
	s.add(new Student(10,"Hassan","Tyao", "tilak nagar"));
	s.add(new Student(420,"Junaid","Batla", "Chadhan"));
	s.add(new Student(20,"cha","Hassan", "Sakinaka"));
	s.add(new Student(07,"Mohammmed","Hassan", "Sakinaka"));
	s.add(new Student(07,"Mohammmed","Hassan", "Sakinaka"));
	for(int i=0;i<s.size();i++) {
		Student e =s.get(i);
		System.out.println(e.id+" "+e.name+" "+e.petName+" "+e.add);
	}
	//s.add(ss);
System.out.println(s);

}
}
