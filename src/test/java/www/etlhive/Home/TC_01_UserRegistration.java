package www.etlhive.Home;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.etlhive.newtours.HomePage;
import com.etlhive.newtours.RegisterPage;
import com.etlhive.newtours.SignonPage;

import www.etlhive.utilities.Commonutils;

public class TC_01_UserRegistration {
	@Test
	
	public void f1() throws InterruptedException, IOException {
	//public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//creating objects of base classes
		HomePage hm = new HomePage(driver);
		RegisterPage rp = new RegisterPage(driver);
		SignonPage sp= new SignonPage(driver);
		Commonutils cu= new Commonutils(driver);
		//test steps from here
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		cu.Screenshot();
		Assert.assertTrue(hm.clickRegister(),"Clicking on Register link");
		cu.Screenshot();
		Assert.assertTrue(rp.enterFirstName(), "Entering First Name");
		Assert.assertTrue(rp.enterLastName(), "Entering Lirst Name");
		Assert.assertTrue(rp.enterphone(),"Enter Phone");
		Assert.assertTrue(rp.enteruserName(),"Enter email");
		Assert.assertTrue(rp.enteraddress1(),"Enter Address1");
		Assert.assertTrue(rp.enteraddress2(),"Enter Address2");
		Assert.assertTrue(rp.entercity(),"Enter city");
		Assert.assertTrue(rp.enterstate(),"Enter State");
		Assert.assertTrue(rp.enterpostalCode(),"Enter Post Code");
		//Thread.sleep(1000);
		Assert.assertTrue(rp.selectCountry(), "Selected Country");
		Assert.assertTrue(rp.enteremail(),"Enter Email");
		Assert.assertTrue(rp.enterpassword(),"Enter Password");
		Assert.assertTrue(rp.enterconfirmPassword(),"Enter Password");
		//Assert.assertFalse(hm.clickRegister()," Not Clicking on Register link");
		cu.Screenshot();
		Assert.assertTrue(rp.clickregister(),"Clicking on register button");
		cu.Screenshot();
		Assert.assertTrue(hm.clicksignoff(),"Click on Sign off link");
		cu.Screenshot();
		Assert.assertTrue(sp.enteruserName(),"Enter Username");
		
		Assert.assertTrue(sp.enterpassword(),"Enter Password");
		cu.Screenshot();
		Assert.assertTrue(sp.clickLogin(),"Click on login");
		cu.Screenshot();
		//Assert.assertTrue(hm.clickSignon(),"click sign-on");
		//hm.clicksignoff();
		//Thread.sleep(2000);
		//hm.clickRegister();
		driver.close();

	}

}
