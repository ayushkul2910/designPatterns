package factoryPattern.model;

public class Duck implements Animal {

	@Override
	public void eat() {
		System.out.println("Duck is eating!");
		
	}

	@Override
	public void walk() {
		System.out.println("Duck is walking!");
		
	}

	@Override
	public void sleep() {
		System.out.println("Duck is sleeping!");
		
	}

	@Override
	public void talk() {
		System.out.println("Quack!!");
		
	}
	
}
