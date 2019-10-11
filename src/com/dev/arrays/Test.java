package com.dev.arrays;

public class Test {

	public static void main(String[] args) {
		int i = 10;
		byte b = (byte) i;// b->s->i->f->l->d is called as upcasting
		short s = (short) i;
		int r = b;
		// GrandFather g = new Son(); upcasting
		// after upcasting ,downcasting will be done
	}

}
