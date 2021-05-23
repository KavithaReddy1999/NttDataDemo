/* Write a pgrm that calculates the number of US $ equivalent to a given number of French francs.Assume an exchange rate of
  6.85062 francs per $  */

  package com.exercise;

	import java.util.Scanner;

	public class FrancsToDollar {

	    public static void main(String[] args) {
	   
	        float n= 6.85062f; //1$=6.85062 frances
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter french francs");
	        float francs=sc.nextFloat(); // ?$=2frances
	        float dollars=francs/n;
	        
	        System.out.println(dollars);
	    }


		}

