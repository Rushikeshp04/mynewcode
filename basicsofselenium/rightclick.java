package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement rightclick =driver.findElement(By.className("_3ETuFY"));
	     Actions A1 =new Actions(driver);
	      A1.contextClick(rightclick).perform();
	}

}
