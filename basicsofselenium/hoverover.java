package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hoverover {
public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement hover = driver.findElement(By.xpath("//span[.='Login']"));
	    Actions A1 = new Actions(driver);
	    A1.moveToElement(hover).perform();
	    WebElement myprofile =driver.findElement(By.linkText("My Profile"));
	    myprofile.click();
}
}
