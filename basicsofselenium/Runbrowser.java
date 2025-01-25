package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Runbrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
           driver.get("https://www.flipkart.com");
          
          driver.manage().window().maximize();
          
          driver.manage().window().minimize();
          System.out.println(driver.getWindowHandle());
          System.out.println(driver.getWindowHandles());
          
          driver.getCapabilities();
           
         
	
	}

}
