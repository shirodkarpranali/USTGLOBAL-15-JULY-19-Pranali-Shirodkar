package com.dev.methods;

public class MethodOverloading {

	static MethodOverloading mo = new MethodOverloading();

	public void print() {
		System.out.println("this is print method with no-argu");
	}

	private int print(int i, float p) { // method overloading does not depend on access specifier,static and return type
		System.out.println("this is print method with int-argu");
		return 1;
	}

	public int print(float p, int i) { // method overloading does not depend on access specifier,static and return type
		System.out.println("this is print method with int-argu");
		return 1;
	}

	final int print(String str, int i) {
		return 4;
	}

	final int print(int i, String str) {
		return 5;
	}

	static String print(String str) {
		System.out.println("this is print method with string argu");
		return "A";
	}

	public static void main(String[] args) {
		mo.print();

	}

}
