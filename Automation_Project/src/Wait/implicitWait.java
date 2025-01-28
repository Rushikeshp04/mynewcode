package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class implicitWait {

@Test
public void fblogin()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement email =driver.findElement(By.name("email"));
	email.sendKeys("7769983872");
	WebElement password =driver.findElement(By.name("pass"));
	password.sendKeys("471998");
	WebElement button =driver.findElement(By.name("login"));
	button.click();

}

    
}
