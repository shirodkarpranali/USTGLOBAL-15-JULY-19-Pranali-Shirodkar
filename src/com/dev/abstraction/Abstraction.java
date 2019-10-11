package com.dev.abstraction;

public class Abstraction extends AbstractExample {

	// AbstractExample ae = new AbstractExample(); .............it cannot create
	// object of abstract class
	public Abstraction() {
		System.out.println("cost of abstraction class");
	}

	@Override
	void display() {
		System.out.println("This is the implemented abstract method");

	}

	@Override
	void print() {
		System.out.println("this is the print method of abstract class");

	}

	public static void main(String[] args) {
		Abstraction a = new Abstraction();
		a.display();
		a.show();
		a.print();
	}

}
