package com.dev.arrays;

public class AddArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int mid = arr[arr.length / 2];
		int first = arr.length - 6;
		int last2 = arr.length - 1;
		int sum = mid + first + last2;
		System.out.println("sum is " + sum);

	}

}
