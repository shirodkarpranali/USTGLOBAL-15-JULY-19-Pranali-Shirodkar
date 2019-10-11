package com.dev.threads;

public class SyncMainThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sync Main Thread started...");

		Printer p = new Printer();
		// new Thread4(p).start();

		Thread4 t4 = new Thread4(p);
		t4.start();
		// t4.join();

		new Thread5(p).start();

		// for(int i=0;i<=10;i++) {
		// System.out.println("i : " +i);
		// }

		System.out.println("Sync Main Thread terminated...");

	}

}
