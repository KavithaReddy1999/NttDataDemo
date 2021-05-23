package com.basics;

public class TypeCasting {
	
	public static void main(String[] args) {
		
	int a=10;
	float f=a;//auto widening
	System.out.println(a);
	System.out.println(f);
	
   float c=2.5f;
  // int a=f; CTE
   int b =(int)c;// explicit narrowing
   System.out.println(c);
   System.out.println(b);
   
   float d=4567854368l;// exceptional case -auto widening
   System.out.println(d);
   
   char ch=97; //special case(ASCII Value gets printed
   System.out.println(ch);
   
	
	}
	
}
