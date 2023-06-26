package com.onesofts.preBatch;

public class MyThread extends Thread {
	
	 public void run() {
	        synchronized (MyThread.class) {
	            try {
	                System.out.println("Thread1 is waiting");
	                MyThread.class.wait(2000); // Pauses the thread for 2000 milliseconds (2 seconds)
	                System.out.println("Thread1 is awake");
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	 
	
	

	
	    public static void main(String[] args) {
	    	
	        MyThread thread = new MyThread();
	        thread.start(); // Starts the thread
	        //System.out.println("Thread2");
	        try {
	            Thread.sleep(1000); // Pauses the main thread for 1000 milliseconds (1 second)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        synchronized (thread) {
	            thread.notify(); // Notifies the waiting thread to continue its execution
	        }
	        
	    }
	    

}
