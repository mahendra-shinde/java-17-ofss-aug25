package com.mahendra.nature;

public class Main1 {

	public static void main(String[] args) {
		Animal[] animalPark = new Animal[5];
		animalPark[0] = new Sparrow();
		animalPark[1] = new Fish();
		animalPark[2] = new Duck();
		animalPark[3] = new Sparrow();
		animalPark[4] = new Duck();
		
		System.out.println("Lets throw all animals and wish for (their) luck!");
		for(Animal ax : animalPark) {
			throwAnimal(ax);
		}
		

	}
	
	static void throwAnimal(Animal a) {
		if(a instanceof Flyable) {
			((Flyable) a).fly();
		}else {
			System.out.println("You just dropped it !!");
		}
	}

	static void putInWater(Animal a) {
		if(a instanceof Swimable) {
			((Swimable) a).swim();
		}else
		{
			System.out.println("You just drowned it !!");
		}
	}
}
