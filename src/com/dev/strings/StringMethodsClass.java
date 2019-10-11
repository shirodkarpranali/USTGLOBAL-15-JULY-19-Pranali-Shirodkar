package com.dev.strings;

public class StringMethodsClass {

	public static void main(String[] args) {

		String str = "some_String";
		String str1 = "USTGlobal";

		int length = str.length();
		System.out.println("output for length() " + length);

		char[] ch = str.toCharArray(); // it returns the new character array and size of the array is equal to length
		// of the string
		System.out.println("output for toCharArray() " + ch[2]);

		char c = str.charAt(4);
		System.out.println("output for charAt() " + c);

		boolean b = str.equals(str1);
		System.out.println("output for equals() " + b);

		boolean b1 = str.equalsIgnoreCase(str1);
		System.out.println("output for equalsIgnoreCase() " + b1);

		boolean v = str.contains("UST");
		System.out.println("output for contains()" + v);

		String g = str.replace('S', 'A');
		System.out.println("output for replace()" + g);

		int f = str.indexOf('L');
		System.out.println("output for indexOf() " + f);

		String s = str.toUpperCase();
		System.out.println("output for toUpperCase()" + s);

		String p = str1.toLowerCase();
		System.out.println(p);

		String a = str.substring(3);
		System.out.println("output for substring():" + a);

		String h = str.substring(3, 7);
		System.out.println("output for substring()" + h);

	}

}
