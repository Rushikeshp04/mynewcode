package TestNGproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@org.testng.annotations.Listeners(TestNGproject.Testcase1.class)
public class Testcase1 extends Listeners {

	@Test
	public void login() throws InterruptedException {
		// Initialize WebDriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		Assert.assertEquals(URL, "https://www.google.comm/", "it is not correct");
		System.out.println("okz");

	}

}
