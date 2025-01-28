package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Is_Selected {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://grotechminds.com/is-selected/");
    WebElement select =driver.findElement(By.id("vehicle2"));
    select.click();
    boolean A2 = select.isDisplayed();
    System.out.println(A2);
	boolean A1= select.isSelected();
   System.out.println(A1);
   
}}
