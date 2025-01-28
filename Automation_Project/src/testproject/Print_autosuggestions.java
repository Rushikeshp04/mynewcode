package testproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Print_autosuggestions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	           search.sendKeys("shoes");
	           Thread.sleep(2000);
	           List <WebElement>   E1 =  driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));  
	          int count = E1.size();
	          Thread.sleep(2000);
	          System.out.println(count);
	          
	         for (int i=0;i<count;i++) {
	        
	        	  WebElement C1=  E1.get(i);
	        	 Thread.sleep(2000);
               System.out.println(C1.getText());	
	         }
		
		
		
	}

}
