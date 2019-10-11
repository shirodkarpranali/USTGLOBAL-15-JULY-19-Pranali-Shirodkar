package com.dev.inheritance;

public class SuperClass {
	// static SuperClass s=new SuperClass();

	public SuperClass() {
		System.out.println("const with no-argu of superclass ");
	}

	public SuperClass(int i) {
		System.out.println("const with int-argu of superclass ");
	}

	public SuperClass(String str) {
		System.out.println("const with String-argu of superclass ");
	}

	public SuperClass(String str, int i) {
		System.out.println("const with string-argu and int-argu of superclass ");
	}

	public SuperClass(int i, String str) {
		System.out.println("const with int-argu and string-argu of superclass ");
	}

	public static void main(String[] args) {

	}

}
