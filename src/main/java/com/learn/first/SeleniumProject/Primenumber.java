package com.learn.first.SeleniumProject;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scn.nextInt();
		int half=a/2;
		boolean result=false;
		for(int i=2; i<=half; i++) {
			if(a%i==0) {
				result=true;
				break;
			}
		}
		if(result==true) {
			System.out.println(a + " is not a prime number");
		}else {
			System.out.println(a +" is a prime number");
		}

	}

}
