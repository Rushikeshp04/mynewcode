package Basicsofselenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grow_Registration_Form {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream File1 =new FileInputStream("C:\\Users\\rushi\\eclipse-workspace\\SeleniumBasics\\DDT\\DDTesting.xlsx");
		 Workbook W1 = WorkbookFactory.create(File1);
		 String name = W1.getSheet("Login2").getRow(0).getCell(0).getStringCellValue();
		 System.out.println(name);
		 String sirname = W1.getSheet("Login2").getRow(1).getCell(0).getStringCellValue();
		 System.out.println(sirname);
		 String email = W1.getSheet("Login2").getRow(2).getCell(0).getStringCellValue();
		 System.out.println(email);
		 String Phonenumber = NumberToTextConverter.toText(W1.getSheet("Login2").getRow(3).getCell(0).getNumericCellValue());
		 System.out.println(Phonenumber);
		 String aadharnumber = NumberToTextConverter.toText(W1.getSheet("Login2").getRow(4).getCell(0).getNumericCellValue());
		 System.out.println(aadharnumber);
	     String pannumber = W1.getSheet("Login2").getRow(5).getCell(0).getStringCellValue();
	     System.out.println(pannumber);
	    
	     
	     ChromeDriver driver =new ChromeDriver();
	     driver.get("https://grotechminds.com/registeration-form/");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     WebElement firstname  =      driver.findElement(By.id("firstName"));
	     firstname.sendKeys(name);
	    WebElement lastname = driver.findElement(By.id("lastName"));
	     lastname.sendKeys(sirname);
	     WebElement emailid = driver.findElement(By.id("email"));
	      emailid.sendKeys(email);
	     WebElement contactnumber= driver.findElement(By.id("phone"));
	     contactnumber.sendKeys(Phonenumber);
	     WebElement gender= driver.findElement(By.id("gender"));
	     Select S1 =new Select(gender);
	     S1.selectByVisibleText("Male");
	     WebElement State =driver.findElement(By.id("state"));
	      Select S2 =new Select(State);
	      S2.selectByVisibleText("Maharashtra");
	    WebElement Aadhaar=  driver.findElement(By.id("aadhaar"));	     
	     Aadhaar.sendKeys(aadharnumber);
	     WebElement PAN =driver.findElement(By.id("pan"));
	    PAN.sendKeys(pannumber);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400);");
	    Thread.sleep(3000);
	     WebElement checkbox = driver.findElement(By.xpath("//input[@id='terms']"));
	     checkbox.click();
	     Thread.sleep(3000);
	     WebElement button =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	     button.click();
	     
	 driver.switchTo().alert().accept();
	     
	
	
	
	}

}
