package com.learn.first.SeleniumProject;

public class Test1 extends Test {
	
	int i = 9;
	int j = 3;
	int k = i*j;
	
	public void Mult() {
		
		System.out.println("Multiplication of two number is " + k);
	}
	
public void Mult(int i, int j, int k) {
		

	int z = i*j*k;
		System.out.println("Multiplication of two number is " + z);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 obj = new Test1();
		obj.Mult();
		obj.Mult(5,5,5);
		obj.sum();
		obj.sum(1,2,3);

	}

}
