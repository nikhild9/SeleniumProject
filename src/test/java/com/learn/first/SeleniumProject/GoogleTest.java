package com.learn.first.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement reg = driver.findElement(By.linkText("REGISTER"));
		reg.click();
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		if(driver.getTitle().equalsIgnoreCase("Register: Mercury Tours"))
		{
				
		WebElement fname = driver.findElement(By.name("firstName"));
		fname.sendKeys("Nikhil");
		WebElement lname =driver.findElement(By.name("lastName"));
		lname.sendKeys("Dudhbaware");
		WebElement phone =driver.findElement(By.name("phone"));
		phone.sendKeys("8605010427");
		WebElement email =driver.findElement(By.id("userName"));
		email.sendKeys("nikhil.dudhbaware@yahoo.in");
		WebElement address1 =driver.findElement(By.name("address1"));
		address1.sendKeys("Kumarpriyadarshan");
		WebElement address2 =driver.findElement(By.name("address2"));
		address2.sendKeys("Pashan");
		WebElement city = driver.findElement(By.name("city"));
				city.sendKeys("pune");
		WebElement footer =driver.findElement(By.name("footer"));
		System.out.println(footer.getText());
		
		
		//driver.close();
		}
		else {
			throw new RuntimeException("Register page not open ");
		}
	}

}
