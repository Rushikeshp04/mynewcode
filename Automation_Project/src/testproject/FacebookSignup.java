package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Rushikesh");

        WebElement surname = driver.findElement(By.name("lastname"));
        surname.sendKeys("Powar");

        WebElement date = driver.findElement(By.id("day"));
        Select daySelect = new Select(date);
        daySelect.selectByVisibleText("18");

        WebElement month = driver.findElement(By.id("month"));
        Select monthSelect = new Select(month);
        monthSelect.selectByVisibleText("Jul");

        WebElement year = driver.findElement(By.id("year"));
        Select yearSelect = new Select(year);
        yearSelect.selectByVisibleText("1998");

        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();

        WebElement mobile = driver.findElement(By.name("reg_email__"));
        mobile.sendKeys("7769983876");

        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("23423432");

        driver.quit();
    }
}
