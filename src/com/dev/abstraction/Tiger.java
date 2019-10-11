package com.dev.abstraction;

public class Tiger extends Walk {

	@Override
	public void hunt() {
		System.out.println("this is hunt example");
	}

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat();
		t.hunt();

	}

}
