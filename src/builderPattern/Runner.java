package builderPattern;

import builderPattern.builder.UserBuilder;
import builderPattern.model.User;

public class Runner {
	
	public static void main(String[] args) {
		User normalUser = buildWithoutBuilder();
		User builderUser = buildWithBuilder();
		
		System.out.println(normalUser.toString());
		System.out.println(builderUser.toString());
	}
	
	private static User buildWithoutBuilder() {
		User user = new User();
		user.setFirstName("testFirstName");
		user.setLastName("testLastName");
		user.setAge(25);
		user.setGender("M");
		user.setAddress("someAddress");
		user.setZipcode("123456");
		user.setEmail("test@test.com");
		user.setContactNumber("1234567890");
		return user;
	}
	
	private static User buildWithBuilder() {
		UserBuilder userBuilder = new UserBuilder();
		User user = userBuilder.firstName("testFirstName").lastName("testLastName").age(25)
				.gender("M").address("someAddress").zipcode("123456").email("test@test.com")
				.contactNumber("1234567890").build();
		return user;
	}

}
