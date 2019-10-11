package com.dev.abstraction;

@FunctionalInterface // it allow only one abstract method.but it can allow more than one concrete
						// method
public interface Abs3 {

	void delete();

	static void print() {
		System.out.println("A");
	}

	static void print1() {
		System.out.println("a");
	}
}
