package com.learn.first.SeleniumProject;

public class Astericpractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			 for(int j=4;j>=i;j--) 
			 {
				System.out.print(" ");	
			 }
			for (int j=1;j<=i;j++) {
					System.out.print("*");
					
				}
			/*
			 * for(int l=1;l>=i;l--) { System.out.print("-"); }
			 */
			 			System.out.println();
		}
	}

}


