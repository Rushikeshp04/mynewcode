package Test_cases_Amazon;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Source_amazon.Amazon_login;

public class Testcase1  extends Launch_Quit
{
  
	@Test
public void test_case1()
{
				
		Amazon_login KK = new Amazon_login(driver);
   KK.search(driver);
   KK.sign_in();
   KK.emailfield();
   KK.continue_button();
   KK.inputpwd();
   KK.clickonsigninbutton();
  
            
         TakesScreenshot ss = (TakesScreenshot) driver;
         File Source = ss.getScreenshotAs(OutputType.FILE);
          File Destination = new File("C:\\Users\\User1\\Pictures\\automated ss\\rushikesh."+Math.random()+"png");
          try {
			org.openqa.selenium.io.FileHandler.copy(Source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}
}
