package com.dev.arrays;

public class PrintingArrays {

	public static void main(String[] args) {
		int[] intArr = { 11, 22, 33, 44, 55 };

		// int index = 3;
		//
		// if(index<intArr.length) {
		// System.out.println("valid index");
		// for(int i = 0;i<=index;i++) {
		// System.out.println(intArr[i]);
		// }
		// }else {
		// System.out.println("invalid index");
		// }

		int a = intArr.length - 1;
		int b = a / 2;
		System.out.println("Middle Element of Array is: " + intArr[b]);

	}

}
