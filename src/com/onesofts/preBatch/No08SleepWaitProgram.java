package com.onesofts.preBatch;

public class No08SleepWaitProgram {
	    public static void main(String[] args) throws InterruptedException {
	        Thread t1 = new Thread(() -> {
	            synchronized (No08SleepWaitProgram.class) {
	                System.out.println("Thread 1 is waiting...");
	                try {
	                    No08SleepWaitProgram.class.wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                System.out.println("Thread 1 is running again.");
	            }
	        });
	        Thread t2 = new Thread(() -> {
	            System.out.println("Thread 2 is running...");
	            try {
	                Thread.sleep(3000); // sleep for 3 seconds
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            synchronized (No08SleepWaitProgram.class) {
	                No08SleepWaitProgram.class.notify();
	            }
	        });
	        t1.start();
	        t2.start();
	        t1.join();
	        t2.join();
	    }
	


}
