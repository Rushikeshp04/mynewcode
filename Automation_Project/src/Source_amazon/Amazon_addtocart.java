package Source_amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_addtocart {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchby;
	
   @FindBy(xpath = "(//div [@class='a-section a-spacing-base a-text-center'])[2]")
   WebElement selectshoe;
   
   @FindBy(xpath="(//input[@id='add-to-cart-button'])")
   WebElement cart;


   public void searchinfield()
   {
	   searchby.sendKeys("shoes"+Keys.ENTER);
	   
   }
    public void selectshoe()
    {
    	selectshoe.click();
    }
   
   
    public void addtocart ()
    {
    	cart.click();
    }
    
   
   
   
   
   
   public Amazon_addtocart (WebDriver driver)
   {
       PageFactory.initElements(driver, this);;   
   }


}

