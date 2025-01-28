package testproject;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class addtocart {
	public static void main(String[] args) throws IOException, InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.flipkart.com/");
         driver.manage().window().maximize();
         Thread.sleep(1000);
         WebElement search =driver.findElement(By.name("q"));
         search.sendKeys("shoes"+Keys.ENTER);
         WebElement selectshoe = driver.findElement(By.xpath("(//div[@class='_1sdMkc LFEi7Z'])[2]"));
         selectshoe.click();
         Thread.sleep(1000);

         Set <String>    handlers=  driver.getWindowHandles();
                        Iterator <String> ids=  handlers.iterator();
                 String  parentwindow= ids.next();
                 String childwindow = ids.next();
                 Thread.sleep(1000);
                 
                 driver.close();
                 driver.switchTo().window(childwindow);
                 Thread.sleep(1000);
                 
     JavascriptExecutor js = (JavascriptExecutor) driver;            
	 js.executeScript("window.scrollBy(0,2000)");
     Thread.sleep(1000);
	 
	  WebElement add = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
	      add.click();
	         Thread.sleep(1000);
	      
	      WebElement placeorder = driver.findElement(By.xpath("//span[.='Place Order']"));
	      placeorder.click();
	      
	         Thread.sleep(1000);
	      
	      TakesScreenshot ss =driver;
	      File Source = ss.getScreenshotAs(OutputType.FILE);
	      File Destination = new File("C:\\Users\\User1\\Pictures\\automated ss\\ss.png");
	      FileHandler.copy(Source, Destination);
	         Thread.sleep(1000);
	      
	      driver.close();
	
	
	
	
	}
	

}
