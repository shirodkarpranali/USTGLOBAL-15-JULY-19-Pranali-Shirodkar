package com.dev.polymorphism;

public class RunTimeC extends RunTimeF {
	static RunTimeC f = new RunTimeC();
	String name = "Eddard";

	@Override
	public void printName() {
		System.out.println(name + " " + super.name + " " + f.lastName);
		super.printName();
		// if we declare method as static we cannot use super keyword
	}

	public static void main(String[] args) {
		f.printName();

	}

}
