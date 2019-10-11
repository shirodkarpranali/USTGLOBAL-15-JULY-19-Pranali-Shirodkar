package com.dev.exception;

public class ExceptionHandling {

	public static void main(String[] args) throws CustomException { // Exception,NegativeArraySizeException
		// try {
		// s();
		// } catch(Exception e) {
		// System.out.println("Exception occured");
		// e.printStackTrace(); //it will give details
		// //e.getMessage(); // if we don't want details.
		// } finally {
		// System.out.println("this is finally block");
		// }
		// System.out.println("code after exception");

		// s();
		// System.out.println("Code after the execution");

		s();
		try {
			divides(10, 0);
		} catch (Exception e) {
			throw new CustomException();
		}

	}

	public static int divides(int i, int j) {
		int res = i / j;
		System.out.println(res);
		return res;
	}

	public static void s() { // Exception,NegativeArraySizeException
		// StringBuffer sb=new StringBuffer(-1);
		try {
			StringBuffer sb = new StringBuffer(-1);
		} catch (Exception e) {
			new CustomException().printStackTrace();
		}
	}
}
