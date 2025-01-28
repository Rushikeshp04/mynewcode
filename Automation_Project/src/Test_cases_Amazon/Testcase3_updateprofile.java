package Test_cases_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Source_amazon.Update_profile;

public class Testcase3_updateprofile extends Launch_Quit
{
	ChromeDriver driver;

	@Test
	public void testcase3()
	{
		Update_profile jj = new Update_profile(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		jj.navigatetoaccountsandlist();
		jj.clickonmanageprofiles();
		jj.clickonview();
		jj.clickoneditnameicon();
		jj.profilenameinput();
		jj.clickoneditbutton();
		
	
		
		
	}
	
	

}
