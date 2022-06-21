package factoryPattern.model;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog is eating!");
		
	}

	@Override
	public void walk() {
		System.out.println("Dog is walking!");
		
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping!");
		
	}

	@Override
	public void talk() {
		System.out.println("Wuff!!");
		
	}

}
