package com.dev.inheritance;

public class Child extends Parent {
	static Parent p = new Parent();

	@Override // if we not give annotation @override then it will create new method
	public void over(String s) {

	}

	public static void main(String[] args) {

		// p.over();
	}

}
