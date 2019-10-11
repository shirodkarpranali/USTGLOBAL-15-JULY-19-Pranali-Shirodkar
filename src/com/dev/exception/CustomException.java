package com.dev.exception;

public class CustomException extends Exception {

	public CustomException() {
		System.out.println("exception occured");
	}

	public CustomException(int i) {
		System.out.println("exception occured for integer");
	}

	public CustomException(String str) {
		System.out.println(str);
	}

	@Override
	public String getLocalizedMessage() {
		return "it is custom exception ";

	}

	public static void main(String[] args) {

	}

}
