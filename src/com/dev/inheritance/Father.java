package com.dev.inheritance;

public class Father extends GrandFather {

	static Father f = new Father();
	String name = "Eddard";

	@Override
	public void printName() {
		// String name = "Eddard";
		System.out.println(name + " " + super.name + " " + f.lastName);
		super.printName();
		// if we declare mathod as static we cannot use super keyword
	}

	public static void main(String[] args) {
		f.printName();

	}

}
