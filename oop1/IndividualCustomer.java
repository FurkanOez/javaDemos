package oop1;

//IndividualCustomer bir Customerdır
public class IndividualCustomer extends Customer {
	private String firsName;
	private String lastName;

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
