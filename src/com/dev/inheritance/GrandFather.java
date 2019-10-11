package com.dev.inheritance;

public class GrandFather {
	static GrandFather g = new GrandFather();

	String lastName = "Stark";
	String name = "Torhen";

	public static void main(String[] args) {
		g.printName();

	}

	protected void printName() { // by using protected access specifier it can override as well as inherit
		// but by using final access specifier it can be inherit not override
		System.out.println(name + " " + g.lastName);
	}

}