package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bylinkedtext {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Link =driver.findElement(By.linkText("Best Sellers"));
		Link.click();

	}



}
