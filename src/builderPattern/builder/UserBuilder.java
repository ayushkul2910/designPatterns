package builderPattern.builder;

import builderPattern.model.User;

public class UserBuilder {

	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String email;
	private String address;
	private String zipcode;
	private String contactNumber;

	public UserBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public UserBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserBuilder age(int age) {
		this.age = age;
		return this;
	}

	public UserBuilder gender(String gender) {
		this.gender = gender;
		return this;
	}

	public UserBuilder email(String email) {
		this.email = email;
		return this;
	}

	public UserBuilder address(String address) {
		this.address = address;
		return this;
	}

	public UserBuilder zipcode(String zipcode) {
		this.zipcode = zipcode;
		return this;
	}

	public UserBuilder contactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	public User build() {
		return new User(this.firstName, this.lastName, this.age, this.gender, 
				this.email, this.address, this.zipcode, this.contactNumber);
	}

}
