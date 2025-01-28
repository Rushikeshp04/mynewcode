package testproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveToothertab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
	WebElement select1 =	driver.findElement(By.xpath("(//div[@class='_1sdMkc LFEi7Z'])[3]"));
		select1.click();
		
		
	                  Set<String> ids = driver.getWindowHandles();
		
		                   Iterator <String>  id = ids.iterator();
		
		                            String     parentwindow = id.next();
		                                 String Childwindow = id.next();
		
		                         
		                                 
		                                 driver.close();
		                                 driver.switchTo().window(Childwindow);        
		
		
		
		
	}
}
