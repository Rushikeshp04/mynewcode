package testproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 
		
	FileInputStream file = new FileInputStream("C:\\Users\\User1\\eclipse-workspace\\Automation_Project\\DDT");
	               Workbook w1 = WorkbookFactory.create(file); 
	               
	           String  ID =  w1.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
	           System.out.println(ID);
                            String PWD = w1.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
                              System.out.println(PWD);
                              
                              
          System.setProperty("webdriver.chrome.driver","C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
                  	   		          
                      ChromeDriver driver = new ChromeDriver();
                      driver.get("https://www.facebook.com/");
                      driver.manage().window().maximize();
                      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                         WebElement email = driver.findElement(By.id("email"));
                    		  email.sendKeys(ID);
                     WebElement password = driver.findElement(By.id("pass"));
                     password.sendKeys(PWD);
                             WebElement loginbutton =  driver.findElement(By.id("u_0_5_0o"));
	 loginbutton.click();
	}
	
	
}
	
	
	
