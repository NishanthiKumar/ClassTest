package com.onesofts.preBatch;

public class No01StaticProgram {
	public static void main(String[] args) {
		System.out.println("This is main method");
		a++;
		System.out.println(a+1);
		System.out.println(No01StaticProgram.a);
		No01StaticProgram.print();
		
	}
	static {
		System.out.println("This is static block");
	}
	static int a=10;
	
	public static void print() {
		System.out.println("Hello");
	}

}
