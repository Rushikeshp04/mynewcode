package Basicsofselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestions_print_all_options {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	WebElement search=	driver.findElement(By.name("q"));
	search.sendKeys("shoes");
	Thread.sleep(2000);
         List <WebElement> allelements= driver.findElements(By.xpath("//form/ul/li"));
        int count= allelements.size();
    System.out.println(count);
for (int i=0;i<count;i++) {
    WebElement E1= allelements.get(i);
                     System.out.println(E1.getText());
}
    
			
	}

}
