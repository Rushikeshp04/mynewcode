package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Testcase2 {
	WebDriver driver;
	@Test
	public void flipkart()
	{
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("shirts"+Keys.ENTER);
		WebElement popularity = driver.findElement(By.xpath("(//div[@class='zg-M3Z'])[1]"));
		popularity.click();
	
	boolean A1 = popularity.isSelected();
	    
	Assert.assertEquals(A1+"isSelected", A1+"isSelected", "the button is selected");

	
	
	}
	
	

}
