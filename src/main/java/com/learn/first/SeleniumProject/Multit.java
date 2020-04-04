package com.learn.first.SeleniumProject;

public class Multit extends Thread

{

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	
	public void run()
	
	{
		for (int i = 1; i<=5;i++) {
		System.out.println(i);
		try {
		Thread.sleep(5000);
		
	}catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		}
	}
	
	public static void main(String[] args) 
	
	{
		
		Multit t1 = new Multit();
		Multit t2 = new Multit();
		//t1.setPriority(10);
		//t2.setPriority(MIN_PRIORITY);
		t1.start();
		t1.suspend();
		t2.start();
		t1.resume();
		System.out.println(t1.getState());
		/*
		 * t1.getName(); t2.getName(); System.out.println(t1.getName());
		 * System.out.println(t2.getName()); t1.setName("Thread 1");
		 * t1.setName("Thread 2"); System.out.println(t1.getName());
		 * System.out.println(t2.getName()); t1.getId(); t2.getId();
		 * System.out.println(t1.getName()); System.out.println(t2.getName());
		 */
		
		
	}

}
