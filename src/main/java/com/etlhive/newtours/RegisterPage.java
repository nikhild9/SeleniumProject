package com.etlhive.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import www.etlhive.utilities.Commonutils;

public class RegisterPage extends Commonutils {
	
	WebDriver driver;
	
		public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
		@FindBy (name="firstName") WebElement fn;
		@FindBy (name="lastName") WebElement ln;
		@FindBy (name="phone") WebElement ph;
		@FindBy (name="userName") WebElement un;
		@FindBy (name="country") WebElement countrydd;
		@FindBy (name="address1") WebElement add1;
		@FindBy (name="address2") WebElement add2;
		@FindBy (name="city") WebElement ct;
		@FindBy (name="state") WebElement st;
		@FindBy (name="postalCode") WebElement pc;
		@FindBy (name="email") WebElement em;
		@FindBy (name="password") WebElement pw;
		@FindBy (name="confirmPassword") WebElement cp;
		@FindBy (name="register") WebElement rg;
		
		
		public boolean enterFirstName() {
			return(enterSafelyIn(fn,"NIkhil"));
		}
		
		public boolean enterLastName() {
			return(enterSafelyIn(ln,"Dudhbaware"));
		}
		
		public boolean enterphone() {
			return(enterSafelyIn(ph,"8605010427"));
		}
		
		public boolean enteruserName() {
			return(enterSafelyIn(un,"nikhil@yahoo.in"));
		}
		
		public boolean enteraddress1() {
			return(enterSafelyIn(add1,"Test1"));
		}
		
		public boolean enteraddress2() {
			return(enterSafelyIn(add2,"Test2"));
		}
		
		public boolean entercity() {
			return(enterSafelyIn(ct,"Pune"));
		}
		
		public boolean enterstate() {
			return(enterSafelyIn(st,"Maharashtra"));
		}
		
		public boolean enterpostalCode() {
			return(enterSafelyIn(pc,"411999"));
		}
		
		
		public boolean selectCountry() {
			
			return(selectFromDropdown(countrydd,"INDIA "));
		}
			
			public boolean enterpassword() {
				return(enterSafelyIn(pw,"password"));
			}
			
			public boolean enterconfirmPassword() {
				return(enterSafelyIn(cp,"password"));
			}
			
			public boolean enteremail() {
				return(enterSafelyIn(em,"test@yahoo.in"));
			}
			
			public boolean clickregister() {
				
				return(clickSafelyon(rg));
			}
		
			
			
		

}
