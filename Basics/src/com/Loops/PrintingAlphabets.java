package com.Loops;

public class PrintingAlphabets {
	

		public static void main(String[] args) {
			int space=0;
			char ch='a';
			for(int i=1;i<=5;i++) {
				space++;
				for(int j=1;j<=space;j++) {
					System.out.print(ch);
					ch++;
					
				}
				System.out.println();
			}
		}

	}



