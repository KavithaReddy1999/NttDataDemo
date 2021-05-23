package com.basics;

public class ComparisonAssignmentOperators {
	//return type is always boolean

	public static void main(String[] args) {
		System.out.println(10==10);
		System.out.println(10!=10);
		System.out.println(56>=45);
		System.out.println(10<<2);//left shift 10*2^2=40
		System.out.println(10>>2); //right shift 10/2^2=2
		System.out.println(10>>>2);
		
		int a=10;
		a+=5;//assignment
		System.out.println(a);
		int c=55;
		c/=5;
		System.out.println(c);

	}

}
