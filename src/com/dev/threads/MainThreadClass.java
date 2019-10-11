package com.dev.threads;

public class MainThreadClass {

	public static void main(String[] args) {
		System.out.println("main thread started...");

		System.out.println("Main thread class prints the value of i");

		Thread2 t2 = new Thread2();
		t2.setName("Thread T2");
		t2.start();
		t2.setPriority(1); // priority is in between 1 to 10

		// new T2().start(); //start is a method to start execution of thread.it is
		// non-static method
		// therefore created (new T2()) object

		Thread3 t3 = new Thread3();
		Thread t = new Thread(t3);
		t.start();
		t.setPriority(4);

		Thread.currentThread().setName("Main Thread: ");

		// new Thread(new T3()).start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("i= " + i);
		}

		System.out.println("Thread Name: " + t2.getName());
		System.out.println("thread2 id: " + t2.getId());
		System.out.println("thread3 id: " + t.getId());
		System.out.println("Main thread name:  " + Thread.currentThread().getName());

		System.out.println("main thread terminated....");
	}

}
