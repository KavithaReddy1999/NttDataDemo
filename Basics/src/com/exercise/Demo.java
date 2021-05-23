package com.exercise;

public class Demo {

	public static void main(String... args) {
		int sum=0;
		for(int i=1;i<=5;i++) {
			sum+=i;
			
		System.out.println("sum of first "+ i+" numbers= "+sum);
		}
		// CTE : System.out.println("sum of first " + i+"numbers= "+sum); we can't access 'i' out of for loop

	}

}
