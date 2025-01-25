package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copypaste {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement copy=driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
	     copy.sendKeys("kolhapur");
		copy.sendKeys(Keys.CONTROL+"A");
		copy.sendKeys(Keys.CONTROL+"C");
		WebElement paste=driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		paste.sendKeys(Keys.CONTROL+"V");
		
	}

}
