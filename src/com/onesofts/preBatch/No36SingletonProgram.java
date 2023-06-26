package com.onesofts.preBatch;

public class No36SingletonProgram {
	
	private static No36SingletonProgram dbObject;

	   private No36SingletonProgram() {      
	   }

	   public static No36SingletonProgram getInstance() {

	      // create object if it's not already created
	      if(dbObject == null) {
	         dbObject = new No36SingletonProgram();
	      }

	       // returns the singleton object
	       return dbObject;
	   }

	   public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
	
	   
	   public static void main(String[] args) {
		   No36SingletonProgram db1;

	      // refers to the only object of Database
	      db1= No36SingletonProgram.getInstance();
	      
	      db1.getConnection();
	   }


}
