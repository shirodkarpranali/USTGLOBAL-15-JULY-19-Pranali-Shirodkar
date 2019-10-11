package com.dev.abstraction;

public class E implements Abs, Abs2 {

	@Override
	public void display() {
		System.out.println("display method of interface");

	}

	public static void main(String[] args) {
		Abs.print();
		E e = new E();
		e.display();
		Abs2.print();
		e.printOut();

	}

	@Override
	public void display1() {
		System.out.println("pranali");

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}
}
