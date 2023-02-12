package com.jspider.multithreading.main;

import com.jspider.multithreading.thread.MyThread1;
import com.jspider.multithreading.thread.MyThread2;
import com.jspider.multithreading.thread.MyThread3;

public class MainClass {
	public static void main(String[] args) {

		MyThread1 thread1 = new MyThread1();
		MyThread2 thread2 =new MyThread2();

		MyThread3 thread3 = new MyThread3();
		Thread thread = new Thread(thread3);

		thread1.start();
		thread2.start();
		thread.start();

	}

}
