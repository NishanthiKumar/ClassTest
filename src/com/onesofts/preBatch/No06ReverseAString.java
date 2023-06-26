package com.onesofts.preBatch;

import java.util.Scanner;

public class No06ReverseAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		String temp="";
		for(int i=word.length()-1;i>=0;i--) {
			temp=temp+word.charAt(i);
		}
		System.out.println(temp);
	}

}
