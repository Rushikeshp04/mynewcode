package Basicsofselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class arrowdown {
	public static void main(String[] args) throws InterruptedException {
		/*ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement dropdown =driver.findElement(By.xpath("//span[.='Two Wheelers']"));
         Actions a1 =new Actions(driver);
         a1.moveToElement(dropdown).perform();
         WebElement select =driver.findElement(By.linkText("Petrol Vehicles"));
         select.click(); */
         
         WebDriver driver1 = new EdgeDriver();
         driver1.get("https://www.amazon.in/");
         driver1.manage().window().maximize();
         WebElement finddown =driver1.findElement(By.id("searchDropdownBox"));
         driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         Select A1 =new Select(finddown);
         A1.selectByVisibleText("Baby");
         
         
	}

}
