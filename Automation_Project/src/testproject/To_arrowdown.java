package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class To_arrowdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement getdown =driver.findElement(By.id("searchDropdownBox"));
	    Actions A1 =new Actions(driver);
	    A1.click();
	  
	   for (int i=1;i<=5;i++);
	   {
		   Actions A2 = new Actions (driver);
		   A2.sendKeys(Keys.ARROW_DOWN).perform();
		}
	    getdown.click	();
 
		
	}

}
