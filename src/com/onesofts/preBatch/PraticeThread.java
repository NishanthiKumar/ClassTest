package com.onesofts.preBatch;

public class PraticeThread implements Runnable {
	
	public void run() {
//		System.out.println("Helo");
		synchronized(PraticeThread.class) {
			System.out.println("Helo");
			try {
				PraticeThread.class.wait(5000);
				System.out.println("Helo is awaked");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		//System.out.println("Hi");
		PraticeThread p=new PraticeThread();
		Thread t=new Thread(p);
		t.start();
//		System.out.println("Another thread");
		Thread.sleep(2000);
//		synchronized (t) {
//			t.notify();
//		}
		System.out.println("Hi");
	}

}
