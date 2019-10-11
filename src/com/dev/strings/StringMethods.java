package com.dev.strings;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Some_String";
		String str1 = "sOmE_String";

		int length = str.length();
		System.out.println("output for length()" + length);

		char[] ch = str.toCharArray(); // it returns the new character array and size of the array is equal to length
		// of the string
		System.out.println("output for toCharArray()" + ch[10]);

		char c = str.charAt(4);
		System.out.println("output for charAt() " + c);

		boolean b = str.equals(str1);
		System.out.println("output for equals() " + b);

		boolean b1 = str.equalsIgnoreCase(str1);
		System.out.println("output for equalsIgnoreCase() " + b1);
	}

}
