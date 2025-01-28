package Source_amazon;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_login {
	
	WebDriver driver;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement dropdown;
	
	
	@FindBy(xpath= "(//span[.='Sign in'])[1]")
	WebElement signin;
	
	@FindBy(xpath= "//input [@id='ap_email']")
	WebElement email;

	@FindBy(className = "a-button-input")
	WebElement Continue;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement password; 
	
	@FindBy(id="signInSubmit")
	WebElement signinbutton;


 public void search(WebDriver driver)
 {
	 Actions A1 = new Actions(driver);
	 A1.moveToElement(dropdown).perform();
			 
 }		 
 public void sign_in()
 {
	signin.click(); 
 }
 
 
public void emailfield()
{
      email.sendKeys("rushikeshpowar3@gmail.com");	
}

public void continue_button()
{
Continue.click();	
}

   public void inputpwd() 
   {
 password.sendKeys("Rushikesh@04");
   }

 public void clickonsigninbutton()
 {
	 signinbutton.click();
 }


   
 
 
 public Amazon_login (WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 

}














