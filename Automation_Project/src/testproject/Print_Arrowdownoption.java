package testproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_Arrowdownoption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
	   WebElement dropdown= driver.findElement(By.xpath("//select [@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
	   Select S1 = new Select(dropdown);
	   List <WebElement>  ids=     S1.getOptions();
	  int count = ids.size();
	             System.out.println(count);

	             for (int i=0;i>10;i++) {
	             
	            WebElement D1 =   ids.get(i);
	            System.out.println(D1);
	
	             }
	
	
	
	
	
	
	
	
	
	
	
	}
	}
