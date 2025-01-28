package testproject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class To_take_screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
         driver.get("https://lp.learn.online/");		 
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     TakesScreenshot ss = driver;
	     File Source = ss.getScreenshotAs(OutputType.FILE);
	     
	    // for (int i=0;i>10;i++) {
	     File Destination = new File ("C:\\Users\\User1\\Pictures\\automated ss\\rushikesh.png");
	    FileHandler.copy(Source, Destination);		 
            
	     }
	
	
	}


