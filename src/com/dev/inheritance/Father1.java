package com.dev.inheritance;

public class Father1 {
	static Father1 f1 = new Father1();

	String name = "Shekhar";

	public static void main(String[] args) {

	}

	public void printName() {
		System.out.println(name + " " + f1.name);
	}
}
