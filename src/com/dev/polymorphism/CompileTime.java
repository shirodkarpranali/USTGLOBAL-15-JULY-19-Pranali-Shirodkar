package com.dev.polymorphism;

public class CompileTime {

	static CompileTime mo = new CompileTime();

	public void print() {
		System.out.println("this is print method with no-argu");
	}

	public int print(int i, float p) { // method overloading does not depend on access specifier,static and return type
		System.out.println("this is print method with int-argu and float argu");
		return 1;
	}

	public int print(float p, int i) { // method overloading does not depend on access specifier,static and return type
		System.out.println("this is print method with float and int-argu");
		return 1;
	}

	final int print(String str, int i) {
		System.out.println("this is print method with string and int-argu");
		return 4;
	}

	final int print(int i, String str) {
		System.out.println("this is print method with int and string-argu");
		return 5;
	}

	static String print(String str) {
		System.out.println("this is print method with string argu");
		return "A";
	}

	public static void main(String[] args) {
		mo.print();
		mo.print(5.7f, 5);
		mo.print(5, 5.7f);
	}

}
