package com.dev.threads;

public class Test {

	public static void main(String[] args) {
		System.out.println("main thread started...");

		for (int i = 1; i < 100000000; i++) {
			System.out.println("i= ");
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println("i= " + i);
		}

		System.out.println("main thread terminated....");

	}

}
