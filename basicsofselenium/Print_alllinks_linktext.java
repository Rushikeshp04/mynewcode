package Basicsofselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_alllinks_linktext {
	public static void main(String[] args) {
		
	
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
   List <WebElement> name =driver.findElements(By.tagName("a"));
        int count =name.size();
   System.out.println(count);
          for(int i=0;i<count;i++) {
  WebElement title = name.get(i);
      System.out.println(title.getAttribute("herf"));
       
  System.out.println(title.getText()); 
          }
	}
}
