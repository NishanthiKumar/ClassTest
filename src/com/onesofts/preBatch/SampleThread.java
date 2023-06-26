package com.onesofts.preBatch;

public class SampleThread extends Thread {
	
	public void run(){
	      System.out.println("Thread is running...");
    }
	
	public static void main(String args[]){
	      //SampleThread m1=new SampleThread();
	      Thread t1 =new Thread();
	      t1.start(); 
	}

}
