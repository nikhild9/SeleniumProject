package com.csg.tau.demo;

import org.testng.annotations.DataProvider;

public class DPClass {
	
	@DataProvider(name="testData")
	public static Object[][] getDatafromhere(){
		
		return new Object[][] {
			{"http://the-internet.herokuapp.com/iframe", "Iframe test1"},
			{"http://the-internet.herokuapp.com/iframe", "Iframe test2"},
			{"http://the-internet.herokuapp.com/iframe", "Iframe test3"}
			
		};
	}

}
