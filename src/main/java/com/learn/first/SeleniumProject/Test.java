
  package com.learn.first.SeleniumProject; 
  
  public class Test {
  
  int x = 10; int y = 20; int c = 30;
  
  public void sum() {
  
  int z = x+y; System.out.println("Sum of two numbers is " + z);
  
  }
  
  public void sum(int d,int f,int g) {
  
  int e = d+g+f; System.out.println("Sum of three numbers is " + e);
  
  }
  
  public void sum(int d,int f,int g,int h) {
  
  int e = d+g+f+h; System.out.println("Sum of three numbers is " + e);
  
  }
  
  //Test(int p,int q){
  
  //x = p; //y = q; //}
  
  public static void main(String[] args) {
  
  Test obj =new Test(); obj.sum(); obj.sum(90,80,50); obj.sum(90,80,50,30);
  
  } }
 