package Basicsofselenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindBrokenLinks {
	
	@Test
	public void findborkenlinks() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	List <WebElement> links = driver.findElements(By.tagName("a"));	
	              int count= links.size();
	System.out.println(count);
	
	for (int i=0;i<count;i++) {
	    WebElement AA  = links.get(i);
	    String url =  AA.getAttribute("href");
	    System.out.println(url);
	    verify_each_link(url);
	}
	
	
	}
	
       static void verify_each_link(String url) throws IOException
       {
    	   URL u1 = new URL (url);
               HttpURLConnection  h1   =(HttpURLConnection) u1.openConnection();
       if (h1.getResponseCode()==200)
       {
    	   System.out.println("it is a valid link"+"response message is ->"+h1.getResponseMessage()+"response status code is"+h1.getResponseCode());
       }
       
       else 
       {
    	   System.out.println("it is not a valid link"+h1.getResponseMessage()+h1.getResponseCode());
       }
       
       }
	
	
	                }


