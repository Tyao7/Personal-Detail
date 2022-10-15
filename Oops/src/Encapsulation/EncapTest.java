package Encapsulation;

public class EncapTest {
	private int id;
	private String firstName;
	private String lastName;
	private String Address;

	public int getId() {
		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public String getFirstName() {

		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == null) {
			System.out.println("enter first name");
		} else {
			this.firstName = firstName;
		}

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
}
