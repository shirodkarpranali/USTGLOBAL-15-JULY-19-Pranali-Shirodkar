package com.dev.methods;

public class MethodExample {
	static int j = 0;

	static MethodExample me = new MethodExample();

	public static void main(String[] args) {
		j = calcArea(6);
		System.out.println("area of square" + j);

		int area1 = me.areaRec(2, 4);
		System.out.println("area of rectangle" + area1);

	}

	public static int calcArea(int side) {
		int t = side * side;

		int n = me.areaRec(4, 8);
		System.out.println(n);
		return t;
	}

	public int areaRec(int length, int width) {
		j = length * width;
		return j;
	}
}
