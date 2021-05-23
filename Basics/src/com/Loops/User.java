package com.Loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class User {
	
	public static void main(String[] args) {
		
	
		List<String> list=new ArrayList<String>();
		int input;

		Scanner sc=new Scanner(System.in);

	do {	
		System.out.println("1.ARRAYLIST");
		System.out.println("2.TREESET");
		System.out.println("3.EXIT");
		
		input=sc.nextInt();
		switch(input){
		case 1:{
			 
			System.out.println("Enter 5 pets");
			      for(int i=0;i<5;i++)
			        {
				     String s=sc.next();
				     list.add(s);
			        }
		      Collections.sort(list);
		      System.out.println(list);
		      break;
		      }
		case 2:{
			
			 LinkedHashSet<String> hash = new LinkedHashSet<String>();
			 
			 System.out.println("Enter 5 pets");
			 
			 for(int i=0;i<5;i++)
			 {
				 String s=sc.next();
				 hash.add(s);
			 }
			 TreeSet<String> tree_set = new TreeSet<String>(hash);
			 System.out.println(tree_set);
			 break;
			 }
		}
		if(input>3) {
		      throw new UserException();
		      }
		}
	while(input!=3);
	 }
}
	
	
	

	

