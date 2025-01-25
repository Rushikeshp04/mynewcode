package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Registration_form {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	/* WebElement firstname =driver.findElement(By.xpath("//input[@id='fname']"));
	firstname.sendKeys("Rushikesh");
	WebElement lastname =driver.findElement(By.xpath("//input[@id='lname']"));
	lastname.sendKeys("Powar");
	WebElement Email =driver.findElement(By.xpath("//input[@id='email']"));
	Email.sendKeys("rushikeshpowar122@gmail.com");
	WebElement Password =driver.findElement(By.xpath("//input[@id='password']"));
	Password.sendKeys("Rushikesh@04");
	WebElement Gender =driver.findElement(By.xpath("//input[@id='male']"));
    Gender.click();
	WebElement SelectSkils =driver.findElement(By.xpath("//select[@id='Skills']"));
	Select A1 =new Select(SelectSkils);
	A1.selectByVisibleText("Technical Skills");
	WebElement Country =driver.findElement(By.xpath("//select[@id='Country']"));
	Select A2 =new Select(Country);
	A2.selectByVisibleText("India");
	WebElement PresentAddress =driver.findElement(By.xpath("//textarea[@class='Present-Address form-control']"));
	PresentAddress.sendKeys("Kolhapur, Maharashtra");
	WebElement PermanentAddress =driver.findElement(By.xpath("//textarea[@class='Permanent-Address form-control']"));
	PermanentAddress.sendKeys("Kolhapur, Maharashtra");
	WebElement Pincode =driver.findElement(By.xpath("//input[@class='Pincode form-control']"));
	Pincode.sendKeys("416012");
	WebElement region =driver.findElement(By.xpath("//select[@class='Relegion ss form-control']"));
	Select A3 =new Select(region);
	A3.selectByValue("Hindu"); */
	WebElement uploadfile =driver.findElement(By.id("file"));
	uploadfile.sendKeys("C:\\Users\\rushi\\Downloads");
	Thread.sleep(2000);
	WebElement relocate =driver.findElement(By.xpath("//input[@id='relocate']"));
	relocate.click();
		
	WebElement Submit =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	Submit.click();
	
	
}
}
