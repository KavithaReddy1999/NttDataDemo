package com.conditionalstatements;

public class ElseIfLadder {

	public static void main(String[] args) {
    
		double per=75.6;
		if(per>=0.0 && per<=100.0) {
			if(per>=70.0) {
				System.out.println("Grade A");
			}
			else if(per>=60.0) {
				System.out.println("Grade B");
			}
			else if(per>=55.0) {
				System.out.println("Grade C");
			}
			else {
				System.out.println("failed");
			}
		}
		else {
			System.out.println("Entered wrong percentage");
	   	}
	}

}
