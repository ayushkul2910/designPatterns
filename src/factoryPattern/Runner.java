package factoryPattern;

import factoryPattern.factory.AnimalFactory;
import factoryPattern.model.Animal;
import factoryPattern.model.AnimalType;

public class Runner {
	
	public static void main(String[] args) {
		
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal animal1 = animalFactory.getAnimal(AnimalType.CAT);
		animal1.eat();
		animal1.walk();
		animal1.sleep();
		animal1.talk();
		
		Animal animal2 = animalFactory.getAnimal(AnimalType.DOG);
		animal2.eat();
		animal2.walk();
		animal2.sleep();
		animal2.talk();
		
		Animal animal3 = animalFactory.getAnimal(AnimalType.DUCK);
		animal3.eat();
		animal3.walk();
		animal3.sleep();
		animal3.talk();
	}

}
