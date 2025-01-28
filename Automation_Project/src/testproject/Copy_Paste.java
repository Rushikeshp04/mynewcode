package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_Paste {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
	    driver.get("https://grotechminds.com/registration/");
	    WebElement copy =driver.findElement(By.id("Present-Address"));
	    copy.sendKeys("kolhapur, maharashtra");
	    copy.sendKeys(Keys.CONTROL+"A");
	    copy.sendKeys(Keys.CONTROL+"C");
	    WebElement paste =driver.findElement(By.id("Permanent-Address"));
	   paste.sendKeys(Keys.CONTROL+"V"); 
	}

}
