package TestNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchQuit {
	WebDriver driver; // Declare the WebDriver

	@AfterMethod
	public void postcondition() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@BeforeMethod
	public void precondition() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@Test
	public void testcase1() {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("shoe" + Keys.ENTER);
	}

}
