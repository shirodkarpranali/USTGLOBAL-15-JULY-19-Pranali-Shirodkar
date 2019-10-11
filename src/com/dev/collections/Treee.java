package com.dev.collections;

import java.util.TreeSet;

import com.dev.encapsulation.Dog;

public class Treee {

	public static void main(String[] args) {
		TreeSet<Dog> ts = new TreeSet<Dog>();

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

		ts.add(d1);
		ts.add(d2);
		ts.add(d);

		System.out.println(ts);

	}

}
