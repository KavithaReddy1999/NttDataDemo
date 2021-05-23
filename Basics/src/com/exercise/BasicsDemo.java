
 /* 1) Identify valid variable names:
 * int(not valid) ;  anInt(valid)  ,i(valid) ; i1(valid) ; 1(not valid) ; thing1(valid) ; 1thing(not valid)
 * ONE-HUNDRED(not valid) ; ONE_HUNDRED(valid) ; something2do(valid)  */
package com.exercise;
 

public class BasicsDemo {
	public static void main(String[] args) {
		int sum=0;
		for(int current=1;current<=10;current++) {
			sum+=current;
			
		}
		System.out.println("sum:" + sum);
        //Name of variables: sum,current. DataType of variables: int,int ;
		// scope of sum is within main method
		//scope of current is within for loop
	}

}
