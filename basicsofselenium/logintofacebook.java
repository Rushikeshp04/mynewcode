package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintofacebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("7769983872");
		WebElement password= driver.findElement(By.id("pass"));
        password.sendKeys("Rushikesh@04");
        WebElement loginbutton= driver.findElement(By.name("login"));
        loginbutton.sendKeys(Keys.ENTER);
        
      
		
	}

}
