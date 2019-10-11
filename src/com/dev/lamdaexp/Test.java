package com.dev.lamdaexp;

public class Test {

	public static void main(String[] args) {
		FunctionalInt f = () -> {
			// for (int i =1;i<=10;i++) {
			// System.out.println(i);
			// }

			try {
				int i = 10 / 0;
				System.out.println(i);
			} catch (Exception e) {
				System.out.println("exception");
			}
		};

		f.printval();

	}
}
