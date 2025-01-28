package testproject;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class iframe {

public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
        Thread.sleep(1000);
        Actions A1 = new Actions(driver);
        A1.moveToElement(login).perform();
        Thread.sleep(1000);
        WebElement login1 = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
        login1.click();
	    Thread.sleep(1000); 
        WebElement number = driver.findElement(By.xpath("//input[@id='ap_email']"));
        number.sendKeys("7769983872");
        Thread.sleep(1000);
        WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
        Continue.click();
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
        password.sendKeys("Rushikesh@04");
        Thread.sleep(1000);
        WebElement clickonsignin = driver.findElement(By.id("signInSubmit"));
        clickonsignin.click();  	
        Thread.sleep(1000);
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("shoes"+Keys.ENTER);
        Thread.sleep(1000);
        WebElement selectshoe = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[2]"));
        selectshoe.click();
            
                Set <String> ids= driver.getWindowHandles();
        
                             Iterator <String> id=    ids.iterator();       
                                  String      parentwindow =   id.next();
                                        String childwindow=   id.next();
                                        Thread.sleep(1000);
                                  driver.close();
                                  driver.switchTo().window(childwindow);
                                        
                                        Thread.sleep(1000);
                                        
         WebElement buynow = driver.findElement(By.id("buy-now-button"));
         buynow.click();
                                        
            Thread.sleep(1000);                
        WebElement change = driver.findElement(By.xpath("(//a[@class='a-link-normal expand-panel-button celwidget'])[2]"));
        change.click();
        
        






}
	

}

	
	
	

