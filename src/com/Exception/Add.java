package com.Exception;

public class Add {
	public static void main(String[] args) {
		try {
//		int x=7;
//		int y=0;
//		int z=y/x;
			String s=null;
		System.out.println(s.length());
	}
catch(ArithmeticException e) {
	System.out.println("Arithmetic error");
}
		catch(NullPointerException e) {
			System.out.println("Null value exception");
			
		}
}
}
