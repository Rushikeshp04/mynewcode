package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintoflipkart {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Email =driver.findElement(By.xpath("(//input)[@name='email']"));
	    Email.sendKeys("7769983872");
		WebElement Password =driver.findElement(By.xpath("(//input)[@type='password']"));
		Password.sendKeys("471998");
		WebElement button =driver.findElement(By.xpath("(//button)[@name='login']"));
		button.click();
	
	}

}
