package Basicsofselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
  public static void main(String[] args) 
  {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://flipkart.com/");
	System.out.println(driver.getTitle());
	/*driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());*/
}

}
