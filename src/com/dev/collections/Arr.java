package com.dev.collections;

import java.util.ArrayList;

import com.dev.encapsulation.Dog;

public class Arr {

	public static void main(String[] args) {
		ArrayList<Dog> arl = new ArrayList<Dog>(2);

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

		Dog d3 = new Dog();
		d3.setAge(2);
		d3.setBreed("Dalion");
		d3.setColor("black & white");
		d3.setName("wie");

		arl.add(d1);
		arl.add(d2);
		arl.add(d3);

		System.out.println(arl);

		System.out.println("size before trimming = " + arl.size());
		arl.trimToSize();
		System.out.println("Size after trimming = " + arl.size());
	}

}
