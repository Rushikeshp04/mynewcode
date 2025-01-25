package Basicsofselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath_youtube {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@class='gb_A']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='LVal7b ']/ul/li"));
		WebElement youTube = driver.findElement(By.xpath("//li[@class='j1ei8c']//span[text()='YouTube']"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		for(WebElement element:list)
		{
			if(element==youTube)
			{
				wait.until(ExpectedConditions.elementToBeClickable(youTube));
				
			}
			System.out.println(element);
		}
		}
	}