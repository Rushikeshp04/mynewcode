package Basicsofselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Move_to_next_window {
	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver =new ChromeDriver(); 
          driver.get("https://www.flipkart.com/");
         WebElement search= driver.findElement(By.name("q"));
		 search.sendKeys("shoes"+Keys.ENTER);
		WebElement selectshoe= driver.findElement(By.xpath("(//div[@class='_1sdMkc LFEi7Z'])[1]"));
	                  selectshoe.click();
	                  Set <String> ids =  driver.getWindowHandles();
	                Iterator <String> id=    ids.iterator();
	                        String    parentid = id.next();
	                            String  childid = id.next();
	                  
	                         driver.close();
	                            driver.switchTo().window(childid);
	                         
		 
		                    
		
		

}
	
}
