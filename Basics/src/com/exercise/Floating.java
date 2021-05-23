//Write a pgrm to test whether a floating point number is zero(should not use == operator)
//since floating point numbers by nature are hard to match exactly.Instead test whether the number is close to zero

package com.exercise;

public class Floating {

	public static void main(String[] args) {
    
		float f=0.8888f;
		if(f>=1) {
			System.out.println("Number greater than zero");
		}
		else if(f<=-1) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is close  to zero");
		}
	}

}
