package com.onesofts.preBatch;

public class No02FinalizeMethod {
	
//	int num;
//	public No02FinalizeMethod(int num) {
//		this.num=num;
//	}
//	
//	public String toString() {
//		return "The value is= "+num;
//	}
	
	@Override
	public void finalize() {
		System.out.println("Collected");
	}
	
	public static void main(String[] args) {
		No02FinalizeMethod n=new No02FinalizeMethod();
		System.out.println(n.hashCode());
		n=new No02FinalizeMethod();
		System.out.println(n.hashCode());
		System.gc();
	}

}
