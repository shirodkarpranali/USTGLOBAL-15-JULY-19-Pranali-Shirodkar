package com.dev.arrays;

public class CreatingArray {

	public static void main(String[] args) {
		char[] chArr; // declaration
		byte byteArr[]; // declaration
		int[] intArr = new int[5]; // declaration & creation

		chArr = new char[5]; // creation new=it is used to creating an object
		byteArr = new byte[5]; // creation

		intArr[0] = 1; // initialization
		intArr[1] = 2; // initialization
		intArr[2] = 3; // initialization
		intArr[3] = 4; // initialization
		intArr[4] = 5; // initialization

		chArr[0] = 1; // initialization
		chArr[1] = 2; // initialization
		chArr[2] = 3; // initialization
		chArr[3] = 4; // initialization
		chArr[4] = 5; // initialization

		byteArr[0] = 1; // initialization
		byteArr[1] = 2; // initialization
		byteArr[2] = 3; // initialization
		byteArr[3] = 4; // initialization
		byteArr[4] = 5; // initialization

		int res = intArr[1] * 3;
		System.out.println(res);
		int res1 = intArr[1] + 3;
		System.out.println(res1);
		int res2 = intArr[1] - 3;
		System.out.println(res2);
		int res3 = intArr[1] / 3;
		System.out.println(res3);
		int res4 = intArr[1] % 3;
		System.out.println(res4);

		int multi = chArr[1] * 3;
		System.out.println(multi);
		int add = chArr[1] + 3;
		System.out.println(add);

		int[] intArr2 = { 11, 22, 33, 44, 55 };
		System.out.println(intArr2[4]);
		System.out.println("length of the 2nd array = " + intArr2.length);

		int num = 3;
		if (num <= intArr2.length - 1) {
			System.out.println("index is present inside an array = " + intArr2[num]);
			for (int i = 0; i <= num; i++) {
				System.out.println(intArr2[i]);
			}
		} else {
			System.out.println("it is not present in an array");
		}

	}

}
