package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class byxpath {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Path =driver.findElement(By.xpath("(//input)[5]"));
	Path.sendKeys("USPA T shirts");
	WebElement Path2 =driver.findElement(By.xpath("(//input)[6]"));
	Path2.click();
	}

}
