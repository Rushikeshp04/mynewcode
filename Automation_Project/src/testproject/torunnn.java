package testproject;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class torunnn {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
		ChromeDriver driver =new ChromeDriver();
      	driver.get("https://www.google.com/");
      	driver.manage().window().maximize();	
      	WebElement  field =driver.findElement(By.name("q"));
      	field.sendKeys("shoes"+Keys.ENTER);
      //	WebElement field2 =driver.findElement(By.xpath("(//input)[6]"));
      	//field2.click();
      	//driver.close();
      	
      	
	}
}
