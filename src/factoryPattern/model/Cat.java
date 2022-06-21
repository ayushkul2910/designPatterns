package factoryPattern.model;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("Cat is eating!");
		
	}

	@Override
	public void walk() {
		System.out.println("Cat is walking!");
		
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping!");
		
	}

	@Override
	public void talk() {
		System.out.println("Meoww!!");
		
	}

}
