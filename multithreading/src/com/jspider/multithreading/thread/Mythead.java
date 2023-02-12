package com.jspider.multithreading.thread;

public class Mythead extends Thread {
	
	@Override
	public void run() {
		System.out.println("The name of thead is" + this.getName());
		
		System.out.println("This priority of thead is" + this.getPriority());
	}
}
