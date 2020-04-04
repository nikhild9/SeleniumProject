package com.learn.first.SeleniumProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://thedemosite.co.uk/login.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.name("FormsButton2"));
		login.click();
		
		Alert al =driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);}

}
