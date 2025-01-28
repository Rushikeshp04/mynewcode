package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase1 {
	WebDriver driver;
	@Test
	public void searchongoogle() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
   String search=	driver.findElement(By.xpath("(//a[@class='gb_W'])[1]")).getText();
	
 Assert.assertEquals(search, "Gmail");
 System.out.println("ok");	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	
	}
	

	
	
}
