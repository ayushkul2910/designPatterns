package factoryPattern.factory;

import factoryPattern.model.Animal;
import factoryPattern.model.AnimalType;
import factoryPattern.model.Cat;
import factoryPattern.model.Dog;
import factoryPattern.model.Duck;

public class AnimalFactory {

	private Animal animal;

	public Animal getAnimal(AnimalType animalType) {
		switch (animalType) {
			case CAT:
				animal = new Cat();
				break;
			case DOG:
				animal = new Dog();
				break;
			case DUCK:
				animal = new Duck();
				break;
			default:
				return null;
		}
		return animal;
	}

}
