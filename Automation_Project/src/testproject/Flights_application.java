package testproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Flights_application {

	
	public static void main(String[] args) throws InterruptedException {
 		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
       driver.get("https://grotechminds.com/flights/");
       driver.manage().window().maximize();
       WebElement type = driver.findElement(By.xpath("(//input[@name='radio-646'])[1]"));
       type.click();
       Assert.assertTrue(type.isSelected(), "button is not selected");
       Thread.sleep(1000);
		WebElement from = driver.findElement(By.xpath("(//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control'])[1]"));
		Select S1 = new Select(from);
		S1.selectByVisibleText("DEL - New Delhi, IN");
		Thread.sleep(1000);
		WebElement To = driver.findElement(By.xpath("(//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control'])[2]"));
		Select S2 = new Select(To);
		S2.selectByVisibleText("BOM - Mumbai, IN");
		Thread.sleep(1000);
		WebElement Departon = driver.findElement(By.xpath("(//input[@class='wpcf7-form-control wpcf7-date wpcf7-validates-as-required wpcf7-validates-as-date form-control'])[1]"));
		Departon.sendKeys("04-01-2025");
		Thread.sleep(1000);
	   WebElement Returnon = driver.findElement(By.xpath("(//input[@class='wpcf7-form-control wpcf7-date wpcf7-validates-as-required wpcf7-validates-as-date form-control'])[2]"));
	      Returnon.sendKeys("06-01-2025");

	      Thread.sleep(1000);
	    WebElement Adults = driver.findElement(By.xpath("(//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control'])[3]"));
	    Select S3= new Select(Adults);
	    S3.selectByVisibleText("4");
	    Thread.sleep(1000);
	    WebElement Children = driver.findElement(By.xpath("(//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control'])[4]"));
	    Select S4= new Select(Children);
	    S4.selectByVisibleText("2");
	    Thread.sleep(1000);
	    WebElement Infants = driver.findElement(By.xpath("(//select [@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control'])[5]"));
	    Select S5= new Select(Infants);
	    S5.selectByValue("4");

	   
			   
			   	   Thread.sleep(2000);
	  WebElement  Searchflight = driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-submit has-spinner btn btn-default']"));
	    Searchflight.click();
	    
	
	
	
	
	
	
	}
}
