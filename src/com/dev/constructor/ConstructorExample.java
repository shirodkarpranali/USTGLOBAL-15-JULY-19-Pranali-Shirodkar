package com.dev.constructor;

public class ConstructorExample {

	public ConstructorExample() {
		System.out.println("this is no argument constructor");
	}

	public ConstructorExample(int i) {
		System.out.println("this const is with int arg");
	}

	public ConstructorExample(String s) {
		System.out.println("this const is with string argu");
	}

	public ConstructorExample(String s, int i) {
		System.out.println("this const is with string and int argu");
	}

	public ConstructorExample(int i, String s) {
		System.out.println("this const is with int and string argu");
	}

	public ConstructorExample(int i, String s, double f) {
		System.out.println("this const is with int,string and float argu");
	}

	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample();
		ConstructorExample ce1 = new ConstructorExample(1);
		ConstructorExample ce2 = new ConstructorExample("p");
		ConstructorExample ce3 = new ConstructorExample("p", 5);
		ConstructorExample ce4 = new ConstructorExample(6, "p");
		ConstructorExample ce5 = new ConstructorExample(6, "p", 5.7);

		System.out.println(ce);
		System.out.println(ce1);
		System.out.println(ce2);
		System.out.println(ce3);
		System.out.println(ce4);
		System.out.println(ce5);

	}
}
