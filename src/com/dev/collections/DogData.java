package com.dev.collections;

import com.dev.encapsulation.Dog;

public class DogData {

	public static void main(String[] args) {
		DogIntImpl dii = new DogIntImpl();
		Dog d = new Dog();

		d.setAge(1);
		d.setBreed(" abs");

		Dog d1 = new Dog();
		d1.setAge(2);
		d1.setBreed(" absd");

		boolean b = dii.addDog(d);
		boolean b1 = dii.addDog(d1);
		System.out.println(b + " " + b1);

		dii.getDog();

		boolean f = dii.removeDog(d);
		System.out.println(f);
		dii.getDog();

	}

}
