package Basicsofselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takes_Screenshot {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		 TakesScreenshot ss =driver;
		 File source= ss.getScreenshotAs(OutputType.FILE);
		 File Destination= new File ("C:\\Users\\rushi\\OneDrive\\Pictures\\Saved Pictures\\.imgw"+Math.random()+".png");
		 FileHandler.copy(source, Destination);
	}

}
