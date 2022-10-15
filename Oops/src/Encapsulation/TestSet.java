package Encapsulation;

public class TestSet {
public static void main(String[] args) {
	EncapTest t =new EncapTest();
	t.setId(10);
	//t.setFirstName("Tyao");
	t.setLastName("Khan");
	t.setAddress("SAkinaka");
	System.out.println(t.getId());
	System.out.println(t.getFirstName());
	System.out.println(t.getLastName());
	System.out.println(t.getAddress());
}
}
