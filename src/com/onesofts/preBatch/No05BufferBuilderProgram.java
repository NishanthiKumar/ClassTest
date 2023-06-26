package com.onesofts.preBatch;

public class No05BufferBuilderProgram {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Hello");  
		sb1.append("Java");
		System.out.println(sb1);
		
		//StringBuffer sb2=new StringBuffer("Hello ");  
		sb1.reverse(); 
		System.out.println(sb1);
		
//		StringBuilder sb3=new StringBuilder("Hello ");  
//		sb3.append("Java");
//		System.out.println(sb3);
//		
//		//StringBuilder sb4=new StringBuilder("Hello");  
//		sb3.reverse();  
//		System.out.println(sb3);
	}

}
