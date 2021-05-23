package com.basics;

public class ConditionalOperators {

	public static void main(String[] args) {

		
	int age=23;
	String result=(age>18)? ("eligible to vote"):("not eligible to vote");
	System.out.println(result);
	
	int a=45,b=23,c=8;
	int res=((a>b)?((a>c)?a:c):((b>c)?b:c));
	System.out.println(res+" is greater");
	
	}

}
