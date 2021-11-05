package com.ss.jb.assignment2;

public class DeadlockTwoThreads {
	public static void main(String[] args) {
		final String string1 = "Thomas";
		final String string2 = "Kubant";
		
		Thread thread1 = new Thread() {
			public void run() {
				synchronized(string1) {
					System.out.println("Thread one has locked string 1");
					try {
						Thread.sleep(200);
					}
					catch (Exception e) {
						System.out.println(e);
					}
					synchronized(string2) {
						System.out.println("Thread one has locked string 2");
					}
				}
			}
		};
		
		Thread thread2 = new Thread() {
			public void run() {
				synchronized(string2) {
					System.out.println("Thread two has locked string 2");
					
					try {
						Thread.sleep(200);
					}
					catch (Exception e) {
						System.out.println(e);
					}
					
					synchronized(string1) {
						System.out.println("Thread two has locked resource 2");
					}
				}
			}
		};
		thread1.start();
		thread2.start();
	}
}
