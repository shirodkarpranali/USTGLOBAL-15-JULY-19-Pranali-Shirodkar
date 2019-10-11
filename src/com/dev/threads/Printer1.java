package com.dev.threads;

public class Printer1 {
	public void printval(int i, String thread) {
		for (int j = 0; j <= i; j++) {
			System.out.println("Thread: " + thread + " " + " j= " + j);
		}
	}

}
