package com.csg.tau.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_Robot_download {
 @Test
 public void f4() throws InterruptedException, AWTException{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 Reporter.log("Entering URL");
 driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
 WebElement ele=driver.findElement(By.xpath("//*[@id='table-files']/tbody/tr[1]/td[5]/a[1]"));
 ele.click();
 Thread.sleep(10000);
 Robot rb=new Robot();
 rb.mouseMove(200, 700);
 rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
 rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
 Thread.sleep(2000);
 rb.mouseMove(200, 625);
 Thread.sleep(2000);
 rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
 rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
 Thread.sleep(5000);
 driver.close();
 }}