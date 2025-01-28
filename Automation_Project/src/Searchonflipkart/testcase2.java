package Searchonflipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testcase2 extends flipkartlaunchquit
{
 @Test
 
 public void mobile()
 {
	WebElement search = driver.findElement(By.name("q"));
	 search.sendKeys("mobile"+Keys.ENTER);
 }
 
}
