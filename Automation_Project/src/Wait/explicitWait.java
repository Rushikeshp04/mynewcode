package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class explicitWait {
         
       WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
	         driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	
	
	
	
	@Test
	public void fblogin()
	{
	    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement Email = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Email")));
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// WebElement email =driver.findElement(By.name("email"));
		Email.sendKeys("7769983872");
		WebElement password =driver.findElement(By.name("pass"));
		password.sendKeys("471998");
		WebElement button =driver.findElement(By.name("login"));
		button.click();

	}


   @AfterClass
   public void closebrowser()
   {
	   driver.close();
   }
   




}
