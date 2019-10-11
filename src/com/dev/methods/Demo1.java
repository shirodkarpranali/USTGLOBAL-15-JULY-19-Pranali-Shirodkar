package com.dev.methods;

import com.dev.constructor.Dog;

public class Demo1 { // final class cannot be extended or inherited
	// Dog d=new Dog();
	// com.dev.encapsulation.Dog d1=new com.dev.encapsulation.Dog();
	final static int IND = 10; // it will not allow to reinitialize

	final static void print() {
		System.out.println("FINAL METHOD");
	}

	public static void main(String[] args) {
		System.out.println(IND);

	}

}
