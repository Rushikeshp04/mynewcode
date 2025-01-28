package testproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_alllinks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.google.com/");     
         driver.manage().window().maximize();
         List <WebElement>  elements= driver.findElements(By.tagName("a"));
	             int count =  elements.size();
	System.out.println(count);
	
	             for (int i=0;i>10;i++) {
	             
	           WebElement  W1=     elements.get(i);
	                  
	           W1.getAttribute("herf");
	           
	           System.out.println(W1);
	             }
	                  
	
	
	
	
	
	
	
	
	
	}

}
