package com.dev.polymorphism;

public class RunTimeF {
	static RunTimeF g = new RunTimeF();

	String lastName = "Stark";
	String name = "Torhen";

	public void printName() { // by using protected access specifier it can override as well as inherit
		// but by using final access specifier it can be inherit not override
		System.out.println(name + " " + g.lastName);
	}

	public static void main(String[] args) {
		g.printName();

	}

}
