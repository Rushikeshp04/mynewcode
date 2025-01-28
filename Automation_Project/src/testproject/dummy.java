
package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement Field =driver.findElement(By.xpath("(//input)[1]"));
		Field.sendKeys("shoes");
		Field.sendKeys(Keys.ENTER);
		System.out.println("code executed");
		
		
		
		
        
      
	}

}
