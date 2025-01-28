package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class grotechminds {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
	         ChromeDriver driver = new ChromeDriver();
	        driver.get("https://google.com/");
	        driver.manage().window().maximize();
	        WebElement search = driver.findElement(By.name("q"));
	        search.sendKeys("growtechminds"+Keys.ENTER);
	        WebElement choice = driver.findElement(By.className("gb_A"));
	        choice.click();
	                 
	         Thread.sleep(1000);
	         
	        WebElement choice1 = driver.findElement(By.xpath("//span[contains(text(), 'Calendar')]"));
                 choice1.click();         
	
	
	
	
	
	}
}

