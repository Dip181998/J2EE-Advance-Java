package com.jspider.multithreading.thread;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread 2");

		}
	}
}
