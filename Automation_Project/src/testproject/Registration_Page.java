package testproject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Registration_Page {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
//        WebElement firstname =driver.findElement(By.id("firstName"));
//        firstname.sendKeys("Rushikesh");
//        WebElement lastname =driver.findElement(By.id("lastName"));
//        lastname.sendKeys("Powar");
//        WebElement email =driver.findElement(By.id("userEmail"));
//        email.sendKeys("rushikeshpowar122@gmail.com");
//        
//        WebElement gender =driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]"));
//        gender.click();
//        WebElement mobilenumber = driver.findElement(By.id("userNumber"));
//        mobilenumber.sendKeys("7769983872");
//        WebElement selectDOB =driver.findElement(By.id("dateOfBirthInput"));
//        selectDOB.click();
//        WebElement selectyear =driver.findElement(By.className("react-datepicker__year-select"));
//        selectyear.click();
//        WebElement yearselect =driver.findElement(By.xpath("//option[@value='1998']"));
//        yearselect.click();
//        WebElement selectmonth =driver.findElement(By.className("react-datepicker__month-select"));
//        selectmonth.click();
//        WebElement monthselect =driver.findElement(By.xpath("//option[@value='7']"));
//        monthselect.click();
//        WebElement dateselect =driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--019']"));
//        dateselect.click();
//        WebElement subjects =driver.findElement(By.id("subjectsInput"));
//        subjects.sendKeys("Maths");
//        subjects.sendKeys(Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,300)");
//        WebElement hobbies =driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]"));
      //  hobbies.click();
//        WebElement selectpicture =driver.findElement(By.xpath("//input[@class='form-control-file']"));
//        selectpicture.sendKeys("C:\\Users\\User1\\Downloads");
//        WebElement currentaddress =driver.findElement(By.id("currentAddress"));
//        currentaddress.sendKeys("Kolhapur, maharashtra");
//        
      //  JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
       WebElement selectstate= driver.findElement(By.xpath("//div[contains(text(), 'Select State')]"));

       WebElement elementToHover = driver.findElement(By.xpath("//div[contains(text(), 'Select State')]"));

       // Create an Actions object
       Actions actions = new Actions(driver);

       // Perform the mouse hover action
       actions.moveToElement(elementToHover).perform();
 
       
       
       
       selectstate.click();
        Thread.sleep(2000);
        selectstate.sendKeys(Keys.ENTER);
        WebElement selectcity =driver.findElement(By.className("css-1hwfws3"));
        selectcity.sendKeys("Delhi");
        selectcity.sendKeys(Keys.ENTER);
        WebElement submit =driver.findElement(By.id("submit"));
        submit.click();
        
        
        driver.quit();
   
    
    
    }
    }
        
