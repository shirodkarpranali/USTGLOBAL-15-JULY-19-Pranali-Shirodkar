package com.dev.collections;

import java.util.HashSet;

import com.dev.encapsulation.Dog;

public class C1 {

	public static void main(String[] args) {
		HashSet<Dog> hs = new HashSet<Dog>();
		Dog d = new Dog();
		d.setAge(1);
		d.setBreed("D M");
		d.setColor("black");
		d.setName("shiro");

		Dog d1 = new Dog();
		d1.setAge(2);
		d1.setBreed("Dalmation");
		d1.setColor("black & white");
		d1.setName("Ronnie");

		Dog d2 = new Dog();
		d2.setAge(2);
		d2.setBreed("Dalmation");
		d2.setColor("black & white");
		d2.setName("wikkie");

		boolean b = hs.add(d); // adding element to the hashset
		boolean b1 = hs.add(d1);
		boolean b3 = hs.add(d2);
		System.out.println("output of add(): " + b + " " + b1);
		System.out.println(hs);

		for (Dog dog : hs) { // for each loop
			System.out.println("output of forEach loop: " + dog);
		}

		d.setAge(2);
		d1.setAge(3);
		d2.setAge(5);

		// System.out.println("size of hashSet hs: " +hs.size());

		boolean b2 = hs.remove(d);
		System.out.println("output of remove(): " + b2);
		System.out.println(hs);

		boolean b4 = hs.contains(d1);
		System.out.println("output of contains(): " + b4);

		System.out.println("size of hashSet hs: " + hs.size());

		hs.clear();
		System.out.println("size of hash set after clear(): " + hs.size());

	}

}
