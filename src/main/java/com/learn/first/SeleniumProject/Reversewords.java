package com.learn.first.SeleniumProject;

public class Reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String s = "I am learning Java";
				String a [] = s.split(" ");
				String rev="";
				for(int i=a.length-1;i>=0;i--)
				{
					rev=rev+a[i]+" ";
				}
				System.out.println(rev);
				

	}

}
