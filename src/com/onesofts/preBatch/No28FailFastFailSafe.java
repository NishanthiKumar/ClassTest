package com.onesofts.preBatch;

import java.util.Objects;

public class No28FailFastFailSafe {
	    
	    // Fail-fast method
	    public static void printLength(String str) {
	        Objects.requireNonNull(str, "Input string cannot be null");
	        System.out.println("Length of string: " + str.length());
	    }
	    
	    // Fail-safe method
	    public static void getDataFromAPI() {
	        int maxRetries = 3;
	        int retryCount = 0;
	        while (retryCount < maxRetries) {
	            try {
	                // Make API call and get data
	                System.out.println("Data retrieved successfully");
	                return;
	            } catch (Exception e) {
	                // Handle network error and retry
	                System.out.println("Error retrieving data: " + e.getMessage());
	                retryCount++;
	            }
	        }
	        // If all retries fail, use fallback strategy
	        System.out.println("Unable to retrieve data, using fallback strategy");
	    }
	    
	    public static void main(String[] args) {
	        // Example usage of fail-fast method
	        String inputString = "Nisha";
	        printLength(inputString);
	        
	        // Example usage of fail-safe method
	        getDataFromAPI();
	    }
	


}
