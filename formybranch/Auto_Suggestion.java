package Basicsofselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Auto_Suggestion {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in/");
	WebElement	search =driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		Thread.sleep(2000);
		List <WebElement> box =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	  Thread.sleep(2000);
	  int count =box.size();
	  System.out.println(count);
	  box.get(3).click();
		

}
	}
