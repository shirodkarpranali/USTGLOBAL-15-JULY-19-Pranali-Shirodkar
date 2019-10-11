package com.dev.exception;

public class ExceptionHandling1 {

	public static void main(String[] args) throws CustomException {
		s();

	}

	public static void s() throws CustomException {
		int i = -1;
		if (i < 0) {
			throw new CustomException();

		}
		StringBuffer sb = new StringBuffer(i);
	}
}