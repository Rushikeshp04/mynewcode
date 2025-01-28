package Test_cases_Amazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Source_amazon.Amazon_addtocart;
import Source_amazon.Amazon_login;
@Listeners(Amazon_Listeners.Listeners.class)

public class Testcase2 extends Launch_Quit{
	
@Test
	public void testcase2 () throws InterruptedException

	{
	     
//	   Amazon_login BB= new Amazon_login(driver);
//        BB.search(driver);
//        BB.sign_in();
//        Thread.sleep(2000);
//       BB.emailfield();
//        BB.continue_button();
//        BB.inputpwd();
//        BB.clickonsigninbutton();
//	      
	
	 
	      Amazon_addtocart KK = new Amazon_addtocart(driver);
	      
	      KK.searchinfield();
	      KK.selectshoe();
	      
	    		  
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	   Set<String>      ids =   driver.getWindowHandles();
	           Iterator <String> id=        ids.iterator();
	                       String     parentwindow =  id.next();
	                       String      childwindow = id.next();
	      driver.close();
	      
	      driver.switchTo().window(childwindow);
	      	      KK.addtocart();                 
	                       
	                       
	}
}
