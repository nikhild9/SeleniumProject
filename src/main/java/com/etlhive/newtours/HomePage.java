package com.etlhive.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import www.etlhive.utilities.Commonutils;

public class HomePage extends Commonutils{
	
	WebDriver driver;
	
	@FindBy (linkText="SIGN-ON") WebElement signon;
	@FindBy (linkText="REGISTER") WebElement register;
	@FindBy (linkText="SUPPORT") WebElement support;
	@FindBy (linkText="CONTACT") WebElement contact;
	@FindBy (linkText="Home") WebElement home;
	@FindBy (linkText="Flights") WebElement flights;
	@FindBy (linkText="Hotels") WebElement hotels;
	@FindBy (linkText="Car Rentals") WebElement carrentals;
	@FindBy (linkText="SIGN-OFF") WebElement signoff;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public boolean clickRegister() {
		
		return(clickSafelyon(register));
	}
	
	public boolean clickSignon() {
		
		return clickSafelyon(signon);
	}
	
public boolean clicksignoff() {
		
		return clickSafelyon(signoff);
	}
	

	public void clickSupport() {
	
	clickSafelyon(support);
	}

	public void clickContact() {
	
	clickSafelyon(contact);
   }

}
