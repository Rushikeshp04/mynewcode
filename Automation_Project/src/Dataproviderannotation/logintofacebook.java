package Dataproviderannotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class logintofacebook {
	@Test(dataProvider="data1")
	public void logintofb(String email, String Password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email1 =driver.findElement(By.xpath("(//input)[@name='email']"));
		email1.sendKeys(email);
		WebElement password1 =driver.findElement(By.xpath("(//input)[@name='pass']"));
		password1.sendKeys(Password);
		WebElement button =driver.findElement(By.xpath("(//button)[@name='login']"));
		button.click();
		Thread.sleep(2000);
	
	}

	
	@DataProvider(name="data1")
	public Object [][] method()
	{
		Object data [][] = new Object [2][2];
		data [0][0]= "rushikeshpowar122@gmail.com";
		data [0][1] = "3456353";
		
		data [0][1]= "rushikesh543543powar122@gmail.com";
		data [0][1] = "34563523433";
		return data;

		
	}
	
	
}
