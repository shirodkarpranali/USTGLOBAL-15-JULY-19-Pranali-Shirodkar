package com.dev.abstraction;

public class Fly extends Animal {

	@Override
	public void eat() {
		System.out.println("this is eat method");
	}

	@Override
	public void hunt() {
		System.out.println("this is hunt example");
	}

	public static void main(String[] args) {
		Fly f = new Fly();
		f.eat();
		f.hunt();
	}
}
