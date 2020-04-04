package com.csg.tau.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(ListnerEvent.class)

public class Demo_Frames {
	@Test(dataProvider="testData", dataProviderClass=DPClass.class)
	//@Parameters({"url","body"})
	public void f3(String url, String text) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		driver.get(url);
		 driver.switchTo().frame(0);
		 WebElement body=driver.findElement(By.id("tinymce"));
		 body.clear();
		 body.sendKeys(text);
		 Thread.sleep(2000);
		 driver.switchTo().defaultContent();
		 WebElement abc=driver.findElement(By.id("mceu_15-open"));
		 abc.click();
		// Actions act = new Actions(driver);
		// act.keyDown(Keys.F5).build().perform();;
		 //act.keyUp(Keys.F5).build().perform();
		 Thread.sleep(2000);
		 driver.close();
//		driver.get("http://thedemosite.co.uk/login.php");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.switchTo().frame(0);
//		WebElement body = driver.findElement(By.id("mceu_15-open"));
//		login.click();
//		
//		Alert al =driver.switchTo().alert();
//		al.accept();
//		Thread.sleep(2000);}

	}

}
