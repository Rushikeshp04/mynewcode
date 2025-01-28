package TestNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlightApplication {
	ChromeDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://grotechminds.com/flights/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	@Test
	public void testFlightBooking() {
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

		// Select the flight type radio button
		WebElement type = driver.findElement(By.xpath("(//input[@name='radio-646'])[1]"));
		type.click();
		Assert.assertTrue(type.isSelected(), "Radio button 'type' is not selected");

		// Select 'From' location
		WebElement from = driver.findElement(By.xpath(
				"(//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control'])[1]"));
		Select S1 = new Select(from);
		S1.selectByVisibleText("DEL - New Delhi, IN");
		Assert.assertEquals(S1.getFirstSelectedOption().getText(), "DEL - New Delhi, IN",
				"Incorrect 'From' location selected");

		// Select 'To' location
		WebElement to = driver.findElement(By.xpath(
				"(//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control'])[2]"));
		Select S2 = new Select(to);
		S2.selectByVisibleText("BOM - Mumbai, IN");
		Assert.assertEquals(S2.getFirstSelectedOption().getText(), "BOM - Mumbai, IN",
				"Incorrect 'To' location selected");

		// Enter Departure date
		WebElement departOn = driver.findElement(By.xpath(
				"(//input[@class='wpcf7-form-control wpcf7-date wpcf7-validates-as-required wpcf7-validates-as-date form-control'])[1]"));
		departOn.sendKeys("04-01-2025");
		// Assert.assertEquals(departOn.getAttribute("value"), "04-01-2025", "Incorrect
		// departure date entered");

		// Enter Return date
		WebElement returnOn = driver.findElement(By.xpath(
				"(//input[@class='wpcf7-form-control wpcf7-date wpcf7-validates-as-required wpcf7-validates-as-date form-control'])[2]"));
		returnOn.sendKeys("06-01-2025");
		Assert.assertEquals(returnOn.getAttribute("value"), "06-01-2025", "Incorrect return date entered");

		// Select Adults
		WebElement adults = driver.findElement(By.xpath(
				"(//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control'])[3]"));
		Select S3 = new Select(adults);
		S3.selectByVisibleText("4");
		Assert.assertEquals(S3.getFirstSelectedOption().getText(), "4", "Incorrect number of adults selected");

		// Select Children
		WebElement children = driver.findElement(By.xpath(
				"(//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control'])[4]"));
		Select S4 = new Select(children);
		S4.selectByVisibleText("2");
		Assert.assertEquals(S4.getFirstSelectedOption().getText(), "2", "Incorrect number of children selected");

		// Select Infants
		WebElement infants = driver.findElement(By.xpath(
				"(//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control'])[5]"));
		Select S5 = new Select(infants);
		S5.selectByValue("4");
		Assert.assertEquals(S5.getFirstSelectedOption().getText(), "4", "Incorrect number of infants selected");

		// Click Search flight button
		WebElement searchFlight = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@class='wpcf7-form-control wpcf7-submit has-spinner btn btn-default']")));
		searchFlight.click();
		Assert.assertTrue(searchFlight.isEnabled(), "Search flight button was not clicked successfully");
	}
}
