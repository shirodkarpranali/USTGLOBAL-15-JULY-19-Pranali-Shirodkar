package com.dev.inheritance;

public class Daughter extends Father {
	static Daughter d = new Daughter();

	// static GrandFather d1 = new Daughter();
	// static GrandFather d2 = new Daughter(); //upcasting
	// static Daughter d3 = (Daughter) d2;
	// static Daughter d3 = (Daughter) new GrandFather();
	@Override
	public void printName() {
		String name = "Sansa";
		System.out.println(name + " " + super.name + " " + d.lastName);
	}

	public static void main(String[] args) {
		d.printName();

	}

}
