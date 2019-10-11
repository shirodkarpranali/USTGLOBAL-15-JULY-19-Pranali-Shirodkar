package com.dev.encapsulation;

public class PetsData {

	public static void main(String[] args) {
		Pets p1 = new Pets();
		Pets p2 = new Pets();
		Pets p3 = new Pets();

		p1.setAge(1);
		p1.setBreed("rabbit");
		p1.setColor("White");
		p1.setName("Mumu");

		p2.setAge(2);
		p2.setBreed("dog");
		p2.setColor("brown&black");
		p2.setName("joy");

		p3.setAge(1);
		p3.setBreed("tortoise");
		p3.setColor("green");
		p3.setName("torty");

		Pets[] pets = { p1, p2, p3 };

		System.out.println("");

	}

}
