package Source_amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Update_profile {
	
	ChromeDriver driver;
	@FindBy(xpath="(//span[@class='nav-line-1 nav-progressive-content'])[2]")
	WebElement  accountsandlist; 

	@FindBy(className="sc-fqkvVR sc-fTFjTM jZunJN eqmAHp")
	WebElement manageprofiles;
	
	@FindBy(className ="sc-iGgWBj sc-fHjqPf fErbOa bdPZUm")
	WebElement view;
	
	@FindBy(className="editNameIcon")
	WebElement editnameicon;
	
	@FindBy(id="editProfileNameInputId")
	WebElement profilenameinput;
	
    @FindBy(xpath ="(//input [@class='a-button-input'])[3]")
    WebElement countinuebutton;


	public void navigatetoaccountsandlist()
	{
		
	     Actions A1 = new Actions(driver);
	    		 A1.moveToElement(accountsandlist).perform();
	}    		 
	 
	public void clickonmanageprofiles()
	{
		manageprofiles.click();
	}
	    		 
		public void clickonview()
		{
			view.click();
		}
		
public void clickoneditnameicon() 
{
	editnameicon.click();
}	
	public void profilenameinput()
	{
		profilenameinput.sendKeys("Rushikesh Powar");
	}

public void clickoneditbutton()
{
	countinuebutton.click();

}


   public Update_profile(ChromeDriver driver)
   {
           PageFactory.initElements(driver, this);	   
   }


}
