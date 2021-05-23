//arrayOfInts[j] > arrayOfInts[j+1]
// we are using relational operator

package com.exercise;

public class Operators {
	
	public static void main(String[] args) {
		int i=10;
		int n=i++%5;
		System.out.println(i);//11
		System.out.println(n);//0
      
       int d=11;
	   int e=++i%5;
		System.out.println(d);
		System.out.println(e);
		
		int a=8,b=17;
		System.out.println(a>>=2);
		System.out.println(b>>1);
		System.out.println(b<<1);
		
	}

}
