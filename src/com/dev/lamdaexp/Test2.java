package com.dev.lamdaexp;

public class Test2 {

	public static void main(String[] args) {
		FunctionalInt fun = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("FunctionalInt: " + i);
			}

		};
		FuncInt2 f2 = (int i) -> {
			for (int j = 1; j <= i; j++) {
				System.out.println("FuncInt2: " + j);
			}
		};

		fun.printval();
		f2.printvalue(5);
	}

}
