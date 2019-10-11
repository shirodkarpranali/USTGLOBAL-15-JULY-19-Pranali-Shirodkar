package com.dev.methods;

public class Example {
	static Example e = new Example();

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {

		return a + b + c;
	}

	public int add(int a, int b, int c, int d) {

		return a + b + c + d;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int sub(int a, int b, int c) {
		return a - b - c;
	}

	public int sub(int a, int b, int c, int d) {
		return a - b - c - d;
	}

	public int multi(int a, int b) {
		return a * b;
	}

	public int multi(int a, int b, int c) {
		return a * b * c;
	}

	public int multi(int a, int b, int c, int d) {
		return a * b * c * d;
	}

	public double div(double a, double b) {
		return a / b;
	}

	public double div(double a, double b, double c) {
		return a / (b * c);
	}

	public double div(double a, double b, double c, double d) {
		return (a * d) / (b * c);
	}

	public static void main(String[] args) {
		System.out.println("addition of 2 nos = " + e.add(10, 5));
		System.out.println("addition of 3 nos = " + e.add(10, 5, 5));
		System.out.println("addition of 4 nos = " + e.add(10, 5, 5, 5));
		System.out.println("subtraction of 2 nos = " + e.sub(30, 5));
		System.out.println("subtraction of 3 nos = " + e.sub(30, 5, 5));
		System.out.println("subtraction of 4 nos = " + e.sub(30, 5, 5, 5));
		System.out.println("multiplication of 2 nos = " + e.multi(1, 2));
		System.out.println("multiplication of 3 nos = " + e.multi(1, 2, 3));
		System.out.println("multiplication of 4 nos = " + e.multi(1, 2, 3, 4));
		System.out.println("divison of 2 nos = " + e.div(10, 5));
		System.out.println("divison of 2 nos = " + e.div(10, 5, 5));
		System.out.println("divison of 2 nos = " + e.div(20, 2, 20, 2));

	}

}
