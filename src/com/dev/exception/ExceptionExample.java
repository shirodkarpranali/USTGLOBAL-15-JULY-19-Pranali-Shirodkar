package com.dev.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// double d = 10.0;
		// int q = 0;
		// System.out.println("Result: " + d/q);

		System.out.println("Print statement before ");
		// StringBuffer sb = new StringBuffer(-1);
		t();
		System.out.println("Print statement after ");

	}

	public static void s() {
		StringBuffer sb = new StringBuffer(-1);
	}

	public static void t() {
		s();
	}
}
