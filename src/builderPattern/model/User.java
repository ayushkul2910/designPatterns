package builderPattern.model;

public class User {

	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String email;
	private String address;
	private String zipcode;
	private String contactNumber;

	public User() {}

	public User(String firstName, String lastName, int age, String gender, String email, 
			String address, String zipcode, String contactNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.zipcode = zipcode;
		this.contactNumber = contactNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ ", email=" + email + ", address=" + address + ", zipcode=" + zipcode + ", contactNumber="
				+ contactNumber + "]";
	}
	
}
