package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {
	public static void main(String[] args) {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement drop =driver.findElement(By.id("searchDropdownBox"));
		Select s1 =new Select(drop);
		s1.selectByVisibleText("Books");
		
	}
}
