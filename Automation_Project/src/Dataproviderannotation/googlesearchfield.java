package Dataproviderannotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class googlesearchfield {
	WebDriver driver;
	@Test(dataProvider="data")
	public void searchongoogle(String input) throws InterruptedException
	
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement field = driver.findElement(By.name("q"));
		field.sendKeys(input+Keys.ENTER);
		driver.close();	
		Thread.sleep(1000);
		
		
		}
	
	@DataProvider(name="data")
	public Object [][] method()
	{
		return new Object [][] {{"shoe"},{"mobile"},{"camera"}};
	}

}
