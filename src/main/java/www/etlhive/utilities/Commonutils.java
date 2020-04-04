package www.etlhive.utilities;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonutils {
	
	WebDriver driver;
	
	public Commonutils(WebDriver driver){
		
		this.driver=driver;
	}
	
	public boolean clickSafelyon(WebElement ele) {
		
		try {
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			return true;
				
		} catch (NoSuchElementException ex)
		{
			return false;
		}
		
	}
	
	public boolean enterSafelyIn(WebElement ele, String text) {
		
		try {
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(ele));			
			ele.sendKeys(text);
			return true;
		}catch (NoSuchElementException ex)
		{
			return false;
		}
	}
	
	public boolean selectFromDropdown(WebElement ele ,String text) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			Select dd=new Select(ele);
			
			dd.selectByVisibleText(text);
			return true;
			
		}
		catch (NoSuchElementException ex)
		{
			return false;
		}
	}
	
	public void Screenshot() throws InterruptedException, IOException {
		  
	 Random rm=new Random();
	 int randomint=rm.nextInt(1000);
	 TakesScreenshot scr=((TakesScreenshot)driver);
	 File scrfile=scr.getScreenshotAs(OutputType.FILE);
	 File destfile=new File("D:\\Screenshots\\"+ randomint+".png");
	 FileHandler.copy(scrfile, destfile);

}
}