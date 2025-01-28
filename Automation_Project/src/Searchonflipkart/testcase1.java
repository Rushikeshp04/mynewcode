package Searchonflipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testcase1 extends flipkartlaunchquit
{
@Test
public void shoes()
  
  
  {
	  WebElement search = driver.findElement(By.name("q"));
          search.sendKeys("shoes"+Keys.ENTER);

          
  }
  
  
} 
  
