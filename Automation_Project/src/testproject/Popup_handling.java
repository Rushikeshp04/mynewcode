package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_handling {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://grotechminds.com/javascript-popup/");
        driver.manage().window().maximize();
        WebElement select =driver.findElement(By.className("btnjs"));
        select.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
		
		
		
	}


}
