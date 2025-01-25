package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TypeIndia 
{
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement searchbox=driver.findElement(By.id("APjFqb"));
	searchbox.sendKeys("India");
	searchbox.sendKeys(Keys.ENTER);
	
	
	
	
}
}
