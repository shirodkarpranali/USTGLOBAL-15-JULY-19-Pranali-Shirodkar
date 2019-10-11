package com.dev.exception;

public class ExceptionHandling2 {

	public static void main(String[] args) throws CustomException { // use throws in the calling method as well as
																	// called method
		try {
			s();
			System.out.println("no exception for s(); ");
			int res = divide(10, 0);
			System.out.println("no exception for divide(); ");
			System.out.println(res);
			// System.exit(0); // it will halt execution of program

		} catch (NegativeArraySizeException e) {
			// new NegativeArraySizeException().printStackTrace();
			// throw new NegativeArraySizeException("demo");
			// new NegativeArraySizeException().printStackTrace();
			System.err.println("exception caught in catch block due to StringBuffer");
			System.err.println("getMessage(): " + e.getMessage());
			System.err.println("localize messge = " + e.getLocalizedMessage());
			e.printStackTrace();

		} catch (ArithmeticException e) { // if you have multiple catch block then you should not give exception as a
											// parameter in first block
			// throw new CustomException(1); //in this way u can call ur own custom
			// exception
			System.err.println("exception caught in catch block due to divide method");
			System.err.println("getMessage(): " + e.getMessage());
		} finally {
			System.out.println("Finally block");
		}

	}

	public static int divide(int i, int j) throws CustomException {
		int res = i / j;
		return res;
	}

	public static void s() throws CustomException {
		StringBuffer sb = new StringBuffer(-1);
	}

}
