package com.dev.abstraction;

public abstract class AbstractExample {

	public AbstractExample() { // it can create constructor of abstract class but not object
		System.out.println("constructor of abstract class");
	}

	abstract void print();

	abstract void display();// abstract method don't have a body part

	public void show() {
		System.out.println("concrete method of abstract class");
	}

	public static void main(String[] args) {

	}

}
