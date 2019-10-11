package com.dev.abstraction;

public interface Abs2 extends Abs3 {

	void display1();

	final int i = 2;

	static void print() {
		System.out.println("A");
	}

	default void printOut() {
		System.out.println("Abcd");
	}

}
