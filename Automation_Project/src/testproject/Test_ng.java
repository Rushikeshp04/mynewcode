package testproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_ng {
    ChromeDriver driver;

    @BeforeClass
    public void setup() {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testFacebookLogin() {
        // Open Facebook
        driver.get("https://www.facebook.com/");

        // Enter email
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("7769983872");

        // Enter password
        WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
        password.sendKeys("471998");

        // Click login button
        WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
        button.click();

        // Add assertions if needed (e.g., check for error message or successful login)
    }

    @AfterClass
    public void teardown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
