package testproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	 driver.get("https://pharmeasy.in/online-medicine-order?isSEM=true&utm_source=google&utm_medium=cpc&utm_campaign=ITW_Brand_FP_Exact&gad_source=1&gclid=Cj0KCQiAvbm7BhC5ARIsAFjwNHtSq-0lRpVhHkvNeGo1ycDsLgBpgiAb6wUcJfF-Mjc3HA5gADULXXIaAj23EALw_wcB	");
	 driver.manage().window().maximize();
	//WebElement searchbar = 
	 driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/section/div/div[1]/div[1]/div/input")).sendKeys("poc");
	  //searchbar
	  List <WebElement>  findelement =driver.findElements(By.xpath("//div[@class='Typeahead_results__y95O9 MedicineSearch_results__vsEUo MedicineSearch_results--withButton__dXPWq']/div"));
              int count = findelement.size();	
	System.out.println(count);
	findelement.get(3).click();
	
	}

}
