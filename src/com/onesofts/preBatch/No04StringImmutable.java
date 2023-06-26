package com.onesofts.preBatch;

public class No04StringImmutable {
	public static void main(String[] args) {
		String a="Nisha";
		String b="Nisha";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		a=a.concat(b);
		System.out.println(a.hashCode());
	}

}
