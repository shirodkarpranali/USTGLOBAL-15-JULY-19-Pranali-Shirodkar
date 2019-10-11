package com.dev.strings;

public class CreatingStrings {

	public static void main(String[] args) {

		String str;
		str = "Hello";

		String str1 = "Java";

		String str2 = new String("Hello Java");

		StringBuilder sb = new StringBuilder("hello");
		StringBuffer sbi = new StringBuffer("java"); // it is a thread safe- mutable sequnece of character.final
		// class.initial capacity is 16 character

		// StringBuilder sb1=new StringBuilder(-1);

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();

	}

}
