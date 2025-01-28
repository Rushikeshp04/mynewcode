package Test_cases_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Amazon_Listeners.Listeners;

public class Launch_Quit extends Listeners
{
 
	
	
//	WebDriver driver; 	
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User1\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

@AfterMethod
  public void quit() throws InterruptedException
  {
	Thread.sleep(1000);
	//driver.quit();   
  }







}
