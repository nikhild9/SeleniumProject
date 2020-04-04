package com.csg.tau.demo;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class demo_method {
  @Test (priority=0)
  public void fruit() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://thedemosite.co.uk/login.php");
		driver.manage().window().maximize();
		System.out.println("fruit is Running");
		Thread.sleep(2000);
		
	  driver.close();
  }
  @Test (priority=1,dependsOnGroups= {"parent"})
  
public void apple() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("apple is Running");
		Thread.sleep(2000);
		
	  driver.close();
}
  
  @Test (invocationCount=1,groups= {"parent"})
  
public void Test1() throws InterruptedException, IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Random rm=new Random();
		
		 int randomint=rm.nextInt(1000);
		 TakesScreenshot scr=((TakesScreenshot)driver);
		 File scrfile=scr.getScreenshotAs(OutputType.FILE);
		 File destfile=new File("D:\\Screenshots\\"+ randomint+".png");
		 FileHandler.copy(scrfile, destfile);
		Thread.sleep(2000);
		
	  driver.close();
}
  
  @BeforeMethod
  
public void Test() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Test is Running");
		Thread.sleep(2000);
		
	  driver.close();
}

  
  @Test (priority=3, invocationCount=1,groups= {"parent"})
  
  public void Orange() throws InterruptedException {
  	  
  	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  		driver.get("https://www.google.com/");
  		driver.manage().window().maximize();
  		System.out.println("Orange is Running");
  		Thread.sleep(2000);
  		
  	  driver.close();
  }
  
@Test (priority=3)
  
  public void Papita() throws InterruptedException {
  	  
  	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  		driver.get("https://www.google.com/");
  		driver.manage().window().maximize();
  		System.out.println("Papita is Running");
  		Thread.sleep(2000);
  		
  	  driver.close();
  }

@BeforeSuite

public void Jackfruit() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Papita before suite is Running");
		Thread.sleep(2000);
		
	  driver.close();
}
}
