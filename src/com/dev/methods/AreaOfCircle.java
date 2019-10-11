package com.dev.methods;

public class AreaOfCircle {

	public static void main(String[] args) {
		int area = MethodExample.calcArea(10);
		System.out.println(area);

		MethodExample me = new MethodExample();
		int area1 = me.areaRec(2, 5);
		System.out.println("area of rectangle" + area1);

	}

}
