package com.etlhive.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import www.etlhive.utilities.Commonutils;

public class SignonPage extends Commonutils {
	
	WebDriver driver;

	public SignonPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(name="userName") WebElement UN;
	@FindBy(name="password") WebElement pw;
	@FindBy(name="login") WebElement lg;



     public boolean enteruserName() {
	 return (enterSafelyIn(UN,"nikhil@yahoo.in"));
     }
     
	 public boolean enterpassword() {
		 return (enterSafelyIn(pw,"password"));
	 }
	 
	 public boolean clickLogin() {
		 return (clickSafelyon(lg));
	 }
	 
}