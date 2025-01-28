package testproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logintofacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
				
				
		email.sendKeys("7769983872");
		WebElement password =driver.findElement(By.xpath("(//input)[@name='pass']"));
		password.sendKeys("471998");
		WebElement button =driver.findElement(By.xpath("(//button)[@name='login']"));
		button.click();
	
	}

}
