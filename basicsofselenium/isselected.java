package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://grotechminds.com/is-selected/");
	driver.manage().window().maximize();
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	WebElement check =driver.findElement(By.xpath("//input[@id='vehicle2']"));
	check.click(); 
	boolean A1= check.isEnabled();
	 System.out.println(A1);
	}
	

}
