package com.dev.collections;

import java.util.HashSet;

import com.dev.encapsulation.Dog;

public class DogIntImpl implements DogInt {

	public static void main(String[] args) {

	}

	HashSet<Dog> hs = new HashSet<Dog>();

	@Override
	public boolean addDog(Dog dog) {

		if (dog != null) {
			hs.add(dog);
			return true;
		}
		return false;
	}

	@Override
	public void getDog() {
		System.out.println(hs);

	}

	@Override
	public boolean removeDog(Dog dog) {
		boolean b = hs.remove(dog);
		if (b) {
			return true;
		}
		return false;
	}

}
